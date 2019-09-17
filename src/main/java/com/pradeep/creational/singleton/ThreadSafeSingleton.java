package com.pradeep.creational.singleton;

/**
 * not thread safe and lazy loading. Good for application startup.
 */
public class ThreadSafeSingleton {

    /*Basically, the value of a volatile field becomes visible to all
    readers (other threads in particular) after a write operation completes on it.
    Without volatile, readers could see some non-updated value.*/
    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){
        if(instance != null) //reflection proof!
            throw new RuntimeException("Use getInstance() method instead.");
    }

    // Don't synchronise whole method - performance hit.
    public static ThreadSafeSingleton getInstance(){
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                // double check so if another thread jumps ahead,
                // creating instance for 2nd time can be avoided.
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton);

        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton1);

        if(threadSafeSingleton == threadSafeSingleton1)
            System.out.println("Both are same objects. And object addresses are same too!");
    }

}
