package com.xiancommon.utils.JsonUtil;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @org.junit.jupiter.api.Test
    void jsonToXml() {
        String json = "{\"name\":\"John\", \"age\":30}";
        String expected = "<?xml version=\"1.0\" encoding=\"utf-8\"?><name>John</name><age>30</age>";
        String result = Util.jsonToXml(json);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void jsonToXmlWithNestedObject() {
        String json = "{\"person\":{\"name\":\"John\", \"age\":30}}";
        String expected = "<?xml version=\"1.0\" encoding=\"utf-8\"?><person><name>John</name><age>30</age></person>";
        String result = Util.jsonToXml(json);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void jsonToXmlWithArray() {
        String json = "{\"items\":[\"item1\", \"item2\"]}";
        String expected = "<?xml version=\"1.0\" encoding=\"utf-8\"?><items><items>item1</items><items>item2</items></items>";
        String result = Util.jsonToXml(json);
        assertEquals(expected, result);
    }
}
