package com.xw.j2se.classes;

/**
 * 抽象类和接口的区别
 * 抽象类 和 接口一样不能实例化
 * 抽象类成员方法可以有方法体,接口的方法不能有方法实现
 * Java8开始，接口中支持default方法，可以有方法体
 * 抽象类有构造方法，接口没有构造方法
 * 抽象类可以没有抽象方法，但是没有抽象方法的抽象类违背了设计初衷，没有实际意义
 */
public interface DefaultFunction {

    public abstract void abs();

    /**
     * 默认方法
     */
    default void sub() {
        System.out.println("interface sub");
    }
}
