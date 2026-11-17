package workshop.account.entity;

public class Account extends Object{
    private String custId;
    private String acctId;
    private int balance;

    public Account(){
    }

    public Account(String custId, String acctId, int balance) {
        this.custId = custId;
        this.acctId = acctId;
        this.balance = balance;
    }

    //Method 선언
    public void setCustId(String custId) {
        this.custId = custId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAcctId() {
        return acctId;
    }

    public String getCustId() {
        return custId;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > balance){
            //Exception을 강제로 발생시킴
            throw new InsufficientBalanceException("잔액이 부족합니다. 현재 잔액은 = ", this.balance);
        }
        this.balance -= amount;
    }

    @Override // @Override 어노테이션은 부모 클래스의 메서드를 오버라이딩할 때 사용, 컴파일 시 부모 클래스에 해당 메서드가 존재하지 않으면 에러 발생
    public String toString() {
        return "Account [custId=" + custId + ", acctId=" + acctId + ", balance=" + balance + "]";
    }

}
