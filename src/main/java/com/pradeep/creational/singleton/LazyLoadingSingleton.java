package com.pradeep.creational.singleton;

/**
 * not thread safe and lazy loading. Good for application startup.
 */
public class LazyLoadingSingleton {

    private static LazyLoadingSingleton instance = null;

    private LazyLoadingSingleton(){}

    public static LazyLoadingSingleton getInstance(){
        if(instance == null)
            instance = new LazyLoadingSingleton();

        return instance;
    }

    public static void main(String[] args) {
        LazyLoadingSingleton lazyLoadingSingleton1 = LazyLoadingSingleton.getInstance();
        System.out.println(lazyLoadingSingleton1);

        LazyLoadingSingleton lazyLoadingSingleton = LazyLoadingSingleton.getInstance();
        System.out.println(lazyLoadingSingleton);

        if(lazyLoadingSingleton1 == lazyLoadingSingleton)
            System.out.println("Both are same objects. And object addresses are same too!");
    }

}
