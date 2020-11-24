package com.xw.j2se.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectTest {

    public static void main(String[] args) {

        try {
            Class clazz = Class.forName("com.xw.j2se.reflect.ReflectObject");
            //返回此类对象表示的实体名称（类，接口，数组类，基本类型或void）
            System.out.println(clazz.getName());
            //返回Java语言规范定义的基础类的规范名称
            String name = clazz.getCanonicalName();
            System.out.println(name);
            //包括有关修饰符和类型参数的信息
            System.out.println(clazz.toGenericString());
            System.out.println(clazz.getSimpleName());
            //返回此类型名称的信息字符串
            System.out.println(clazz.getTypeName());
            System.out.println("-----------------constructors---------------------");
            //构造器
            Constructor[] constructors = clazz.getConstructors();
            for(Constructor constructor : constructors) {
                System.out.println(constructor.toGenericString());
            }
            //指定构造器
            Constructor constructor = clazz.getConstructor(String.class,int.class,String.class,int.class);
            System.out.println(constructor.toGenericString());
            System.out.println("-------------------fields---------------------");
            //公有方法 指定公共成员字段 返回一个包含 字段对象的数组， 字段对象反映此 类对象所表示的类或接口的所有可访问公共字段
            Field[] fields = clazz.getFields();
            for(Field field : fields) {
                System.out.println(field);
            }
            System.out.println("---------------------declared fields---------------------");
            //全部方法 [declared:公开宣布的] 返回 字段对象的数组， 字段对象反映由此 类对象表示的类或接口声明的所有字段
            Field[] declaredFields = clazz.getDeclaredFields();
            for(Field field : declaredFields) {
                System.out.println(field);
            }
            System.out.println("----------------------methods---------------------");
            //返回一个包含方法对象的数组， 方法对象反映此类对象所表示的类或接口的所有公共方法，包括由类或接口声明的那些以及从超类和超接口继承的那些
            Method[] methods = clazz.getMethods();
            for(Method method : methods) {
                System.out.println(method);
            }
            System.out.println("----------------------declared methods------------------------");
            //返回一个包含方法对象的数组， 方法对象反映此类对象表示的类或接口的所有已声明方法，包括公共，受保护，默认（包）访问和私有方法，但不包括继承的方法
            Method[] declaredMethods = clazz.getDeclaredMethods();
            for(Method method : declaredMethods) {
                System.out.println(method);
            }
            Method setOiMethod = clazz.getMethod("setOi", int.class);
            System.out.println(setOiMethod);
            System.out.println("-------------------------instance-----------------------------");
            // instance
            ReflectObject reflectObject = (ReflectObject) constructor.newInstance("os",1,"ps",2);
            System.out.println(reflectObject);
            setOiMethod.invoke(reflectObject,2);
            System.out.println(reflectObject);
            Field os = clazz.getDeclaredField("os");
            os.setAccessible(true);
            System.out.println(os.getType());
            System.out.println(os.get(reflectObject));
            os.set(reflectObject,"mos");
            System.out.println(reflectObject);
            os.setAccessible(false);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
