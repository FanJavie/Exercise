package com.xjtu.javie;

/**
 * Created by Javie on 16/5/24.
 */
public class StackDeep {
    private static int count = 0;

    //3+10个局部变量
    public static void recursion(long a, long b, long c) {
        long d = 1, e = 2, f = 3, g = 4, h = 5, i = 6, j = 7, k = 8, l = 9, m = 10;
        count++;
        recursion(a, b, c);
    }

    //0个局部变量
    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
//            recursion(1, 2, 3);
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
        }
    }
}
