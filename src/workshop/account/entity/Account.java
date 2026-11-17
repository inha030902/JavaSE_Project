package workshop.account.entity;

public class Account {
    private String custId;
    private String acctId;
    private int balance;

    //Method 선언
    public void setCustId(String custId) {
        this.custId = custId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

}
