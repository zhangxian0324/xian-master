package com.xiancommon.utils.innerClassPackage;
interface A {
    int id =23423;
    public int setId(int id);

}
/**
 * @author zhangxian
 */
public class InnerClass {
    static class Class01 implements A {
        @Override
        public int setId(int id) {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
