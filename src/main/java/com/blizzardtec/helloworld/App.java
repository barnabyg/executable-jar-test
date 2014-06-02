package com.blizzardtec.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final App app = new App();
        app.printHello();
        app.printSpace();
        app.printWorld();
    }

    protected void printHello() {
        System.out.print("Hello");
    }

    protected void printWorld() {
        System.out.print("World");
    }

    protected void printSpace() {
        System.out.print(" ");
    }
}
