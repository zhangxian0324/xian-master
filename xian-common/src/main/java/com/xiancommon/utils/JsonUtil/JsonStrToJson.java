package com.xiancommon.utils.JsonUtil;

import com.alibaba.fastjson.JSONObject;

/**
 * @author zhangxian
 */
public class JsonStrToJson {

    public static JSONObject change(String str) throws Exception {
        if (str == null || "".equals(str)) {
            return null;
        }
        JSONObject jsonObject = new JSONObject();
        JSONObject json = JSONObject.parseObject(str);
        return json;
    }

    public static void main(String[] args)  {
        String str = "{\n" +
                "    \"name\": \"Ab173\",\n" +
                "    \"url\": \"http://www.ab173.com\",\n" +
                "    \"page\": 88,\n" +
                "    \"isNonProfit\": true,\n" +
                "    \"address\": {\n" +
                "        \"street\": \"书城路.\",\n" +
                "        \"city\": \"湖北武汉\",\n" +
                "        \"country\": \"中国\"\n" +
                "    },\n" +
                "    \"links\": [\n" +
                "        {\n" +
                "            \"name\": \"Google\",\n" +
                "            \"url\": \"http://www.google.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Baidu\",\n" +
                "            \"url\": \"http://www.baidu.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"So\",\n" +
                "            \"url\": \"http://www.So.com\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        try {
            System.out.println(change(str).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
