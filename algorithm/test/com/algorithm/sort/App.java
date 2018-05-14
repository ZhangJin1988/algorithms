package com.algorithm.sort;



public class App {
    public static void main(String[] args) {
        try {
            int f = 12;
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally!");
        }
    }

}


class A {
    public int i = 10;
}
class B extends A {
    public int i = 20;
}
 class Test {
    public static void main(String args[]) {
//        B b = new B();
//        A a = b;
//        System.out.println(b.i);
//        System.out.println(a.i);

        String str = "hello world";

         str+='a';
//         int strlen = str.length;
         str.length();
         str="100";
         str=str+100;
        int a=0;
        int b=-3;
        int x = (a>=1)&&++a<=12?b:a;
        System.out.println(x);
    }
}

