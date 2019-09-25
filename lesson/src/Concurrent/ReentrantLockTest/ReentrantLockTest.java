package Concurrent.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    private final Lock lock = new ReentrantLock();
    private int count = 0;

    public int add() {
        lock.lock();
        try {
            return get() + 1;
        } finally {
            lock.unlock();
        }
    }

    public int get() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }
}
