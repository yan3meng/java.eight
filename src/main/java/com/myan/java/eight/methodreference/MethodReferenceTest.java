package com.myan.java.eight.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by myan on 2018/8/17 7:35.
 */
public class MethodReferenceTest {

    public static void main(String[] args) {
        /*List<String> list = Arrays.asList("hello", "world");
        list.forEach(item -> System.out.print(item));
        System.out.println("==== method reference by Object::method====");
        list.forEach(System.out::println);*/
        Student zhangsan = new Student("zhangsan", 70);
        Student lisi = new Student("lisi", 90);
        Student wangwu = new Student("wangwu", 86);
        Student zhaoliu = new Student("zhaoliu", 82);
        List<Student> studentList = Arrays.asList(zhangsan, lisi, wangwu, zhaoliu);
        //studentList.sort((stu1, stu2) ->  Student.compareByScore(stu1, stu2));
        System.out.println("==== Class::static method====");
        studentList.sort(Student::compareByScore);
        studentList.forEach(student -> System.out.print(student.getName() + ", " + student.getScore() + "\t"));
        System.out.println("\r\n==== instance object reference::instance method ====");
        StudentComparator studentComparator = new StudentComparator();
        //studentList.sort((stu1, stu2) -> studentComparator.compareByScore(stu1, stu2));
        studentList.sort(studentComparator::compareByScore);
        studentList.forEach(student -> System.out.print(student.getName() + ", " + student.getScore() + "\t"));
        System.out.println("\r\n==== Class::instance method test ====");
        StudentStandard zhangsan2 = new StudentStandard("zhangsan", 70);
        StudentStandard lisi2 = new StudentStandard("lisi", 90);
        StudentStandard wangwu2 = new StudentStandard("wangwu", 86);
        StudentStandard zhaoliu2 = new StudentStandard("zhaoliu", 82);
        List<StudentStandard> studentStandardList = Arrays.asList(zhangsan2, lisi2, wangwu2, zhaoliu2);
        studentStandardList.sort(StudentStandard::compareByScore);
        studentStandardList.forEach(student -> System.out.print(student.getName() + ", " + student.getScore() + "\t"));
        System.out.println("\r\n==== Class::instance method with String test ====");
        List<String> stringList = Arrays.asList("Love", "U", "I");
        stringList.sort(String::compareToIgnoreCase);
        stringList.forEach(System.out::print);
        System.out.println("\r\n==== Class::constructor method with String test ====");
        //System.out.println(MethodReferenceTest.getStr(() -> "test"));
        System.out.println(MethodReferenceTest.getStr(String::new));
        //System.out.println(MethodReferenceTest.getStrByInput("input str", input -> input.toUpperCase()));
        System.out.println(MethodReferenceTest.getStrByInput("input str", String::new));

    }

    private static String getStr(Supplier<String> supplier)
    {
        return supplier.get() + "test";
    }

    private static String getStrByInput(String str, Function<String, String> function)
    {
        return function.apply(str);
    }
}
