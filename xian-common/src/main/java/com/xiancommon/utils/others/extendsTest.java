package com.xiancommon.utils.others;

import java.util.ArrayList;
import java.util.List;

class Super {
    String name;
    public Super(String name) {
        this.name = name;
    }
    public void fun1() {
        System.out.print("this is class super!" +  name);
    }
}

class sub extends Super {
    public sub(String name) {
        super(name);
    }

    @Override
    public void fun1() {
        System.out.print("this is class sub");
    }
}
public class extendsTest {
    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(1));
    }
}
