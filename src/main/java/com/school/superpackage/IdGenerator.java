package com.school.superpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {

    private static final ConcurrentHashMap<String, AtomicInteger> counters = new ConcurrentHashMap<>();

    public static String generateId(String prefix) {
        counters.putIfAbsent(prefix, new AtomicInteger(0));
        int next = counters.get(prefix).incrementAndGet();
        return prefix + String.format("%03d", next);
    }
}
