package com.example;

public class HelloJni {
    static {
        System.loadLibrary("HelloJni");
    }

    private native void sayHello();

    public static void main(String[] args) {
        String path = System.getProperty("java.library.path");
        System.out.println(path);
//        new HelloJni().sayHello();
    }
}
