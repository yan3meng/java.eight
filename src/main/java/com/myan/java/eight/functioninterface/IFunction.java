package com.myan.java.eight.functioninterface;

import com.sun.istack.internal.Pool;

/**
 * 函数式接口定义：
 * 1. 是接口，而不是注解、枚举...
 * 2，该接口内只有一个抽象方法。
 * 额外：该接口内override Object的抽象方法。
 *
 * Created by myan on 2018/8/9.
 */
@FunctionalInterface
public interface IFunction {

    /**
     * 继承子Object的接口方法，并不影响该接口成为函数式接口
     * @return
     */
    String toString();
    void  method1();


    // java8 中default方法，为非抽象方法
    default void defaultMethod()
    {}
    //java8中除了default方法外，还可定义static方法，该方法为非抽象方法
    static void staticMethod()
    {
        System.out.println("a static implements method can be defined in an interface in java8.");
    }
}

class LambdaAnonymousInnerClass{
        public void test(IFunction iFunction){
            System.out.println(1);
            iFunction.method1();
            System.out.println(2);
        }

    public static void main(String[] args) {
        LambdaAnonymousInnerClass m = new LambdaAnonymousInnerClass();
        m.test(() -> System.out.println("mytest"));
        System.out.println("--------------------");
        // iFunction引用直接指向 接口对象
        IFunction iFunction = () -> System.out.println("Use iFunction directly.");
        System.out.println(iFunction.getClass());
        System.out.println("super class: " + iFunction.getClass().getSuperclass());
        System.out.println("methods: " + iFunction.getClass().getInterfaces().length + ": " +  iFunction.getClass().getInterfaces()[0]);
    }
}

class ImplementsAnonymousInnerClass{
        public void test(IFunction iFunction){
            System.out.println(1);
            iFunction.method1();
            System.out.println(2);
        }

    public static void main(String[] args) {
        ImplementsAnonymousInnerClass m = new ImplementsAnonymousInnerClass();
        m.test(new IFunction() {
            @Override
            public void method1() {
                System.out.println("mytest");
            }
        });
    }
}
