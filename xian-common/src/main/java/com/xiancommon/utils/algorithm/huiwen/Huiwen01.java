package com.xiancommon.utils.algorithm.huiwen;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 计算24点是一种扑克牌益智游戏,随机抽出4张扑克牌,通过加(+),减(-),乘(*), 除(/)四种运算法则计算得到整数24,本问题中,扑克牌通过如下字符或者字符串表示,其中,小写joker表示小王,大写JOKER表示大王:
 *
 * 3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
 *
 * 本程序要求实现:输入4张牌,输出一个算式,算式的结果为24点.
 *
 * 详细说明:
 *
 * 1.运算只考虑加减乘除运算,没有阶乘等特殊运算符号,没有括号,友情提醒,整数除法要当心,是属于整除,比如2/3=0,3/2=1;
 * 2.牌面2~10对应的权值为2~10, J、Q、K、A权值分别为为11、12、13、1;
 * 3.输入4张牌为字符串形式,以一个空格隔开,首尾无空格;如果输入的4张牌中包含大小王,则输出字符串"ERROR",表示无法运算;
 * 4.输出的算式格式为4张牌通过"+ - * / 四个运算符相连,中间无空格,4张牌出现顺序任意,只要结果正确;
 * 5.输出算式的运算顺序从左至右,不包含括号,如1+2+3*4的结果为24,2A 9A不能变为(2+1)*(9-1)=24
 * 6.如果存在多种算式都能计算得出24,只需输出一种即可,如果无法得出24,则输出"NONE"表示无解.
 * 7.因为都是扑克牌,不存在单个牌为0的情况,且没有括号运算,除数(即分母)的数字不可能为0
 *
 * 数据范围:一行由4张牌组成的字符串
 * 输入描述:
 * 输入4张牌为字符串形式,以一个空格隔开,首尾无空格;
 *
 * 输出描述:
 * 输出怎么运算得到24,如果无法得出24,则输出"NONE"表示无解,如果输入的4张牌中包含大小王,则输出字符串"ERROR",表示无法运算;
 **/

public class Huiwen01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] arr = str.split(" ");
        String result = "";
        if (arr.length < 4) {
            result = "NONE";
        }
        for (int i = 0;i < arr.length;i++) {
            if ("joker".equalsIgnoreCase(arr[i])) {
                result = "ERROR";
                System.out.print(result);
                return;
            }
        }
        result = cal24(arr);
        System.out.print(result);

    }

    private static int StringToNumber(String str) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("J",11);
        map.put("Q",12);
        map.put("K",13);
        map.put("A",1);
        map.put("10",10);
        map.put("9",9);
        map.put("8",8);
        map.put("7",7);
        map.put("6",6);
        map.put("5",5);
        map.put("4",4);
        map.put("3",3);
        map.put("2",2);
        if (!map.containsKey(str)) {
            return -1;
        }
        return map.get(str);
    }

    private static String NumToString(Integer integer) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(11,"J");
        map.put(12,"Q");
        map.put(13,"K");
        map.put(1,"A");
        map.put(10,"10");
        map.put(9,"9");
        map.put(8,"8");
        map.put(7,"7");
        map.put(6,"6");
        map.put(5,"5");
        map.put(4,"4");
        map.put(3,"3");
        map.put(2,"2");
        return map.get(integer);
    }

    public static String cal24(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length;i++) {
            if (StringToNumber(arr[i]) == -1) {
                result = "NONE";
                return result;
            }
        }
        result =  compute(StringToNumber(arr[0]),StringToNumber(arr[1]),StringToNumber(arr[2]),StringToNumber(arr[3]));
        return result;

    }

    /**
     * 24点计算方法穷举
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public static String compute(int a,int b,int c,int d) {
        int[] arr={a,b,c,d};
        // 运算符穷举数组
        String temp = "NONE";
        String[][] arr1 = symbol();
        // 第一个数字
        for(int i=0;i<4;i++){
            // 第二个数字
            for(int j=0;j<4;j++){
                // 第三个数字
                for(int k=0;k<4;k++){
                    // 第四个数字
                    for(int p=0;p<4;p++){
                        // 如果四个数字互不相等才计算，不然一个字符就会出现两次
                        if((i!=j)&&(i!=k)&&(i!=p)&&(j!=k)&&(j!=p)&&(k!=p)){
                            // 遍历运算符穷举数组
                            for(String[] str:arr1){
                                // 依次计算，得出最终结论
                                int sum = sumNum(arr[i], arr[j], str[0]);
                                sum=sumNum(sum, arr[k], str[1]);
                                sum=sumNum(sum, arr[p], str[2]);
                                if(sum==24){
                                    // 如果结果等于24，返回结果
                                    temp =NumToString(arr[i])+str[0]+NumToString(arr[j])+str[1]+NumToString(arr[k])+str[2]+NumToString(arr[p])+"";
                                }
                            }
                        }
                    }
                }
            }
        }
       return temp;
    }

    /**
     * 穷举所有可能的运算符组合
     * @return
     */
    public static String[][] symbol() {
        String[] opArr = {"+","-","*","/"};
        //运算符共三个，每个四种可能性，4*4*4中运算符组合，每个组合有三个运算符
        String[][] symbol = new String[64][3];
        int p =0;
        // 第一个运算符
        for(int i=0;i<4;i++){
            // 第二个运算符
            for(int j=0;j<4;j++){
                // 第三个运算符
                for(int k=0;k<4;k++){
                    symbol[p++]=new String[]{opArr[i],opArr[j],opArr[k]};
                }
            }
        }
        return symbol;
    }


    /**
     * 两个数字计算结果
     * @param a
     * @param b
     * @param symb
     * @return
     */
    public static int sumNum(int a, int b, String symb) {
        switch(symb){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                return 0;
        }
    }





}
