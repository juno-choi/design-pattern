package com.simol.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product prototype = showcase.get(prototypeName);
        // 여기서 복사된 product를 반환한다.
        return prototype.createCopy();
    }
}
