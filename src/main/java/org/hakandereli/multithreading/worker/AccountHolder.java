package org.hakandereli.multithreading.worker;


import org.hakandereli.multithreading.model.Account;

public class AccountHolder implements Runnable{

    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=1 ; i<=4 ; i++){
            makeWithdrawal(2000);
            if (account.getBalance() < 0){
                System.out.println("Account is overdawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int withDrawAmount) {
        if (account.getBalance() >= withDrawAmount){
            System.out.println(Thread.currentThread().getName() + " is going to withdraw TL" + withDrawAmount);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException ex){
            }
            account.withDraw(withDrawAmount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal of TL " + withDrawAmount);

        }else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
            + account.getBalance());
        }
    }
}
