package com.xw.j2se.work.module_3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private static List<Student> students = new LinkedList<>();

    private static boolean add(Scanner in) {
        System.out.println("输入学号 姓名 年龄：");
        String id = in.next();
        String name = in.next();
        int age = in.nextInt();
        return students.add(new Student(id,name,age));
    }

    private static boolean del(Scanner in) {
        System.out.println("输入学号：");
        String id = in.next();
        int index;
        if((index = indexOf(id)) < 0) {
            System.out.println("学号不存在");
            return false;
        }else {
            students.remove(index);
        }
        return true;
    }

    private static boolean find(Scanner in) {
        System.out.println("输入学号：");
        String id = in.nextLine();
        int index;
        if((index = indexOf(id)) < 0) {
            System.out.println("学号不存在");
            return false;
        } else {
            System.out.println(students.get(index));
        }
        return true;
    }

    private static void all() {
        for(Student s : students) {
            System.out.println(s);
        }
    }


    private static int indexOf(String id) {
        for(int i = 0; i < students.size(); i++) {
            if(id.equals(students.get(i).getId()))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Operation op;
        Scanner scanner = new Scanner(System.in);
        do {
            for(Operation operation : Operation.values()) {
                System.out.println(operation);
            }
            int code = scanner.nextInt();
            op = Operation.operationOf(code);
            switch (op) {
                case ADD:
                    add(scanner);
                    break;
                case DELETE:
                    del(scanner);
                    break;
                case FIND:
                    find(scanner);
                    break;
                case ALL:
                    all();
                    break;
                default:
                    //ignore
            }
        }while (Operation.QUIT != op);
    }
}
