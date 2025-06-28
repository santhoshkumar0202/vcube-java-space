package com.Vcube.assessment;
class Parent {
    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(String msg) {
        System.out.println("Parent says: " + msg);
    }
}

class Child extends Parent {
    Child() {
        this("Welcome");
        System.out.println("Child default constructor");
    }

    Child(String msg) {
//        super(msg);
        System.out.println("Child says: " + msg);
    }
}

public class Solution{
    public static void main(String[] args) {
        new Child();
    }
}



