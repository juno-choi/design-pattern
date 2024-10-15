package com.simol.singleton;

/**
 * Bill Pugh이 고안한 singleton 구현법으로
 * pill pugh singleton pattern 이라고도 불린다.
 * 가장 널리 사용된다.
 */
public class LazyHolderSingleton {
    private LazyHolderSingleton() {
    }

    private static class SingletonHelper {
        private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
