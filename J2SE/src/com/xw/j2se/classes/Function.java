package com.xw.j2se.classes;

public class Function implements DefaultFunction {

    @Override
    public void abs() {
        System.out.println("abs implement");
    }

//    @Override
//    public void sub() {
//        System.out.println("sub implement");
//    }


    public static void main(String[] args) {
        Function f = new Function();
        f.sub();
        f.abs();
    }

}
