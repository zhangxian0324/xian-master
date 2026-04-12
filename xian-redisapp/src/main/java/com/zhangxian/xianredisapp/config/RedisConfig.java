package com.zhangxian.xianredisapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import tools.jackson.databind.jsontype.PolymorphicTypeValidator;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);

        PolymorphicTypeValidator typeValidator = BasicPolymorphicTypeValidator.builder()
                                                                              .allowIfSubType(
                                                                                      Object.class)   // 允许所有子类型（谨慎）
                                                                              // .allowIfSubType("com.example.entity.")  // 更安全的做法
                                                                              .build();

        // 2. 构建 Jackson 3 的 JsonMapper（不可变 Builder 风格）
        JsonMapper jsonMapper = JsonMapper.builder()
                                          .activateDefaultTyping(typeValidator)
                                          // 可选：设置日期格式、属性可见性等
                                          // .findAndAddModules()   // 自动注册 JavaTimeModule 等
                                          .build();

        // 3. 创建序列化器
        GenericJacksonJsonRedisSerializer serializer = new GenericJacksonJsonRedisSerializer(jsonMapper);
        StringRedisSerializer stringSerializer = new StringRedisSerializer();

        // 4. 配置 RedisTemplate
        template.setKeySerializer(stringSerializer);
        template.setHashKeySerializer(stringSerializer);
        template.setValueSerializer(serializer);
        template.setHashValueSerializer(serializer);

        template.afterPropertiesSet();
        return template;
    }
}
