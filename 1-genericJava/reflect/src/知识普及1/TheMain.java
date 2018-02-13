package 知识普及1;


import 运行时反射.Person;

import java.lang.reflect.*;

/**
 * 获取类<<<<<<<<<<<<<<<<<
 * 1. Classc1 = Class.forName("Employee");
 * 2. Classc2 = Employee.class;
 * 3. Classc3 = new Employee().getClass();//运行时类
 * <p>
 * 创建类对象<<<<<<<<<<<<<<<<<
 * Class c =Class.forName("Employee");
 * Objecto = c.newInstance(); //调用了Employee的无参数构造方法.
 * <p>
 * 获取属性<<<<<<<<<<<<<<<<<
 * Class c = Class.forName("java.lang.Integer");
 * 获取所有的属性
 * Field[] fs = c.getDeclaredFields();
 * <p>
 * <p>
 * 1、得到构造器的方法
 * Constructor getConstructor(Class[] params) -- 获得使用特殊的参数类型的公共构造函数，
 * Constructor[] getConstructors() -- 获得类的所有公共构造函数
 * Constructor getDeclaredConstructor(Class[] params) -- 获得使用特定参数类型的构造函数(与接入级别无关)
 * Constructor[] getDeclaredConstructors() -- 获得类的所有构造函数(与接入级别无关)
 * 2、获得字段信息的方法
 * Field getField(String name) -- 获得命名的公共字段
 * Field[] getFields() -- 获得类的所有公共字段
 * Field getDeclaredField(String name) -- 获得类声明的命名的字段
 * Field[] getDeclaredFields() -- 获得类声明的所有字段
 * 3、获得方法信息的方法
 * Method getMethod(String name, Class[] params) -- 使用特定的参数类型，获得命名的公共方法
 * Method[] getMethods() -- 获得类的所有公共方法
 * Method getDeclaredMethod(String name, Class[] params) -- 使用特写的参数类型，获得类声明的命名的方法
 * Method[] getDeclaredMethods() -- 获得类声明的所有方法
 **/
public class TheMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        aboutConstructor();
//        getSpecialFild();
    }

    private static void getSpecialFild() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //以前的方式：
        /*
        User u = new User();
        u.age = 12; //set
        System.out.println(u.age); //get
        */

        //获取类
        Class c = Class.forName("运行时反射.Person");
        //获取id属性
        Field idF = c.getDeclaredField("age");
        //实例化这个类赋给o,调用无参构造函数
        Object o = c.newInstance();
        //打破封装
        idF.setAccessible(true); //使用反射机制可以打破封装性，导致了java对象的属性不安全。
        //给o对象的id属性赋值"110"
        System.out.println("------------>" + ((Person) o).getAge());
        idF.set(o, 110); //set
        //get
        System.out.println("------------>" + ((Person) o).getAge());
        System.out.println(idF.get(o));
    }

    //获取所有的属性
    private static void getAllFiles() throws ClassNotFoundException {
        Class c = Class.forName("java.lang.Integer");
        //获取所有的属性?
        Field[] fs = c.getDeclaredFields();

        //定义可变长的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        //通过追加的方法，将每个属性拼接到此字符串中
        //最外边的public定义
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        //里边的每一个属性
        for (Field field : fs) {
            sb.append("\t");//空格
            sb.append(Modifier.toString(field.getModifiers()) + " ");//获得属性的修饰符，例如public，static等等
            sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字
            sb.append(field.getName() + ";\n");//属性的名字+回车
        }

        sb.append("}");

        System.out.println(sb);
    }

    private static void aboutConstructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> cls = Class.forName("运行时反射.Person");
//获取public属性的构造函数
        Constructor<?>[] cs1 = cls.getConstructors();
//获取指定参数的公有构造方法，如果是为private/protected属性的构造函数则会抛NoSuchMethodException异常
        Constructor<?> cs2 = cls.getConstructor(String.class, int.class);

//获取private/protected/public属性的构造函数
        Constructor<?>[] cs3 = cls.getDeclaredConstructors();
        Constructor<?> cs4 = cls.getDeclaredConstructor(String.class);
        Constructor<?> cs41 = cls.getDeclaredConstructor(int.class);

        Person obj = (Person) cs2.newInstance("张三", 26); // 为构造方法传递参数
        System.out.println("------------> 张三的年龄为：" + obj.getAge());

//========================================================================
//获取属性并修改
        String attribute = "age";
        Field age = cls.getDeclaredField(attribute);
//解除封装，在调用非公有方法的时候一定要先设置该属性，不论是属性还是方法的读取还是修改值的调用
        age.setAccessible(true);
        age.setInt(obj, 100);
        System.out.println("----直接读取属性--------> 张三的年龄为：" + age.getInt(obj));

//获取方法并修改
        Method setAgeMethod = cls.getMethod("set" + initcap("age"), int.class);
        setAgeMethod.invoke(obj, 21); // 等价于：Person对象.setAge(21)
        Method setNameMethod = cls.getDeclaredMethod("set" + initcap("name"), String.class);
//解除封装，在调用非公有方法的时候一定要先设置该属性，不论是属性还是方法的读取还是修改值的调用
        setNameMethod.setAccessible(true);
        setNameMethod.invoke(obj, "里斯"); // 等价于：Person对象.setName("里斯")
    }

    public static String initcap(String str) {
        return str.substring(0, 1).toUpperCase().concat(str.substring(1));
    }
}