package 运行时反射;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;

    public Person() {

    }

    private Person(String name) {

    }

    protected Person(int age) {

    }

    public Person(String luoxn28, int i) {
        name = luoxn28;
        age = i;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }
}
