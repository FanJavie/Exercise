package com.xjtu.javie;

/**
 * Created by Javie on 16/5/31.
 */
public class FinalReference {
    //强引用,表明栈中的stringBuffer1和stringBuffer2两个对象均指向堆中同一地址的实例
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("1");
        StringBuffer stringBuffer2 = stringBuffer1;

        stringBuffer2.append('2');

        System.out.println("stringBuffer2 is : " + stringBuffer2);
        System.out.println("stringBuffer1 is : " + stringBuffer1);
    }
}
