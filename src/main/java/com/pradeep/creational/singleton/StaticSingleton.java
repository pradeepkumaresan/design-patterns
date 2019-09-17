package com.pradeep.creational.singleton;

/**
 * not thread safe and eager loading.
 */
public class StaticSingleton {

    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        System.out.println(staticSingleton);

        StaticSingleton staticSingleton1 = StaticSingleton.getInstance();
        System.out.println(staticSingleton1);

        if(staticSingleton == staticSingleton1)
            System.out.println("Both are same objects. And object addresses are same too!");
    }

}
