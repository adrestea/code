package Test.拷贝.彻底的深拷贝;

/**
 * Clone是浅拷贝，拷贝过后的成员变量与源对象相同
 */
public class TheMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        String name = "gaos";
        Body body = new Body(new Head(new Face()), name);
        Body body1 = (Body) body.clone();
        System.out.println("body == body1 : " + (body == body1));
        System.out.println("body.head == body1.head : " + (body.head == body1.head));
        System.out.println("body.head.face == body1.head.face : " + (body.head.face == body1.head.face));


        System.out.println("body.name.hashCode() = " + body.name.hashCode() + ",\tname=" + name.hashCode());

        body.name = "ggaos";
        System.out.println(body.name + "\t" + body1.name);
    }
}