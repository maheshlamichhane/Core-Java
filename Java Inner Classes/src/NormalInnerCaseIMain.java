package com.lamichhane.regular.inner.classes;
public class NormalInnerCaseIMain {


        int x = 10;

        // Static area (main method)
        public static void main(String[] args) {

            NormalInnerCaseIMain o = new NormalInnerCaseIMain();
            NormalInnerCaseIMain.Inner i = o.new Inner();
            i.m1();
            System.out.println("-------------------------------");


            NormalInnerCaseIMain.Inner i2 = new NormalInnerCaseIMain().new Inner();
            i2.m1();
            System.out.println("-------------------------------");


            new NormalInnerCaseIMain().new Inner().m1();
        }

    class Inner {
        void m1() {
            System.out.println("Inner class method m1() called");
            System.out.println("Accessing Outer class variable x = " + x);
        }
    }


}
