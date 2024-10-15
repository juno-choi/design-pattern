package com.simol.singleton;

/**
 * 프로그램이 시작될때 모두 생성되어버리기 때문에
 * 메모리 낭비가 커질 수 있음.
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("인스턴스 생성");
    }

    public static EagerSingleton getInstance() {
        return singleton;
    }
}
