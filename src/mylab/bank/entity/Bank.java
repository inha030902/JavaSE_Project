package mylab.bank.entity;

import java.util.ArrayList;
import java.util.List;

import mylab.bank.exception.AccountNotFoundException;
import mylab.bank.exception.InsufficientBalanceException;

public class Bank {
    private List<Account> accounts;
    private int nextAccountNumber;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.nextAccountNumber = 1000;
    }

    public String createSavingsAccount(String ownerName, double initialBalance, double interestRate) {
        Account account = new SavingsAccount(generateAccountNumber(), ownerName, initialBalance, interestRate);
        accounts.add(account);
        System.out.println("저축 계좌가 생성되었습니다: " + account);
        return account.getAccountNumber();
    }

    public String createCheckingAccount(String ownerName, double initialBalance, double withdrawalLimit) {
        Account account = new CheckingAccount(generateAccountNumber(), ownerName, initialBalance, withdrawalLimit);
        accounts.add(account);
        System.out.println("체킹 계좌가 생성되었습니다: " + account);
        return account.getAccountNumber();
    }

    public Account findAccount(String accountNumber) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("계좌번호 " + accountNumber + "에 해당하는 계좌를 찾을 수 없습니다.");
    }

    public void deposit(String accountNumber, double amount) throws AccountNotFoundException {
        findAccount(accountNumber).deposit(amount);
    }

    public void withdraw(String accountNumber, double amount)
            throws AccountNotFoundException, InsufficientBalanceException {
        findAccount(accountNumber).withdraw(amount);
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount)
            throws AccountNotFoundException, InsufficientBalanceException {
        Account from = findAccount(fromAccountNumber);
        Account to = findAccount(toAccountNumber);

        from.withdraw(amount);
        to.deposit(amount);
        System.out.println(amount + "원이 " + fromAccountNumber + "에서 " + toAccountNumber + "로 송금되었습니다.");
    }

    public void printAllAccounts() {
        System.out.println("=== 모든 계좌 목록 ===");
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println("===================");
    }

    private String generateAccountNumber() {
        return "AC" + nextAccountNumber++;
    }
}
