package com.blizzardtec.helloworld;

/**
 * Hello world!
 *
 */
public final class App {
    /**
     * blah.
     * @param args param
     */
    public static void main(final String[] args) {
        final App app = new App();
        app.printHello();
        app.printSpace();
        app.printWorld();
    }

    /**
     * blah.
     */
    protected void printHello() {
        System.out.print("Hello");
    }

    /**
     * blah.
     */
    protected void printWorld() {
        System.out.print("World");
    }

    /**
     * blah.
     */
    protected void printSpace() {
        System.out.print(" ");
    }
}
