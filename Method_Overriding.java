package com.coding.NewOne;

class Parent{
     public void eye_color(){
        System.out.println("Eye color of parent is brown...");
    }
}
class Child extends Parent{
    @Override
    public void eye_color(){
        System.out.println("After overriding eye color of child's eye color is blue...");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        p1.eye_color();
        c1.eye_color();
    }
}
