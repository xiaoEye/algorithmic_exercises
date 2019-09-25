package Concurrent.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private final Lock lock = new ReentrantLock();
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }

    void transfer(Account account, int money) {
        while (true) {
            if (lock.tryLock()) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    if (account.lock.tryLock()) {
                        try {
                            balance -= money;
                            account.balance += money;
                            return;
                        } finally {
                            account.lock.unlock();
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }

}
