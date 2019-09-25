package Concurrent.ReentrantLockTest;

public class AccountMain {

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(300);
        Account account2 = new Account(300);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                account1.transfer(account2, 50);
            }
        }, "thread-1");
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                account2.transfer(account1, 150);
            }
        }, "thread-2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
