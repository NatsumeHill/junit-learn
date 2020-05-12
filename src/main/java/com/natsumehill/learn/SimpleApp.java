package com.natsumehill.learn;

/**
 * 简单类，用于简单测试
 */
public class SimpleApp {
    public String greeting(){
        return "Hello junit";
    }
    public static void main(String[] args) {
        System.out.println(new SimpleApp().greeting());;
    }
}
