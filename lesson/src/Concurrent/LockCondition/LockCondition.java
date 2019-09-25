package Concurrent.LockCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCondition {

    private boolean a;
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public LockCondition(boolean a) {
        this.a = a;
    }

    <T> void enq(T x) {
        lock.lock();
        try {
            while (a) {
                notFull.await();
            }
            notEmpty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void deq() {
        lock.lock();
        try {
            while (!a) {
                notEmpty.await();
            }
            notFull.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
