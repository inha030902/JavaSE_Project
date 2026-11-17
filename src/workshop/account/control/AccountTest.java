package workshop.account.control;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;

public class AccountTest {
    public static void main(String[] args) {
        try{
            Account account = new Account();
            account.setCustId("A1100");
            account.setAcctId("221-22-3477");
            account.deposit(100000);


            System.out.println("고객번호 = " + account.getCustId());
            System.out.println("계좌번호 = " + account.getAcctId());
            System.out.println("잔액 = " + account.getBalance());

            Account account2 = new Account("A1105", "221-22-3488", 100000);
            account2.withdraw(50000);
            
            System.out.println("고객번호 = " + account2.getCustId());
            System.out.println("계좌번호 = " + account2.getAcctId());
            System.out.println("잔액 = " + account2.getBalance());

            //toSTRING();
            //getClass().getName() + "@" + Integer.toHexString(hashCode());
            //workshop.account.entity.Account@15db9742 -> 오버라이딩 안하지 않으면 이렇게 뜸
            System.out.println(account2); // toString을 호출하지 않아도 자동으로 호출됨
        } catch (InsufficientBalanceException e){
            System.err.println("Error 메시지 =" + e.getMessage() + e.getCurrentBalance());
        }
    }
}

