package com.simol.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EagerSingletonTest {

    @Test
    void eagerTest() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void lazyTest() {
        LazyHolderSingleton instance1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton instance2 = LazyHolderSingleton.getInstance();
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }
}