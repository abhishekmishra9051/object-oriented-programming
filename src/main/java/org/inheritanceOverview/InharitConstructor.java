package org.inheritanceOverview;

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constrcutor");
    }

}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }
}

public class InharitConstructor {
    public static void main(String[] args) {
        Parent parent = new GrandChild();
    }
}
