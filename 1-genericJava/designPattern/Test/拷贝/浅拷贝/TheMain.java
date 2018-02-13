package Test.拷贝.浅拷贝;

/**
 * Clone是浅拷贝，拷贝过后的成员变量与源对象相同
 */
public class TheMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        //切换引用
        Person p = new Person(23, "zhang");
        System.out.println(p + ",\tage=" + p.getAge() + ",\tname=" + p.getName());

        Person p1 = p;
        p.setName("li");
        System.out.println(p1 + ",\tage=" + p1.getAge() + ",\tname=" + p1.getName());

        //浅拷贝
        Person p_shallow_copy = (Person) p.clone();
//        p.setName("wang");
        System.out.println(p_shallow_copy + ",\tage=" + p_shallow_copy.getAge() + ",\tname=" + p_shallow_copy.getName());
        System.out.println(p_shallow_copy.getName().hashCode() + ",\t" + p.getName().hashCode());

        Body body = new Body(new Head());
        Body body1 = (Body) body.clone();
        System.out.println("body == body1 : " + (body == body1));
        System.out.println("body.head == body1.head : " + (body.head == body1.head));
    }
}