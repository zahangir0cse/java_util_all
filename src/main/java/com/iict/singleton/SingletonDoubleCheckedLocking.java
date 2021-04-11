package com.iict.singleton;

public class SingletonDoubleCheckedLocking {
    private static volatile SingletonDoubleCheckedLocking singletonDoubleCheckedLockingInstance = null;

    private SingletonDoubleCheckedLocking() {
    }

    public static SingletonDoubleCheckedLocking getInstance() {
        if(singletonDoubleCheckedLockingInstance == null){
            synchronized (SingletonDoubleCheckedLocking.class){
                if(singletonDoubleCheckedLockingInstance == null){
                    singletonDoubleCheckedLockingInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return singletonDoubleCheckedLockingInstance;
    }

}
