class Bank {
    long balanc[];
    public Bank(long[] balance) {
        balanc=new long[balance.length];
        balanc=balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1>balanc.length || account2>balanc.length || balanc[account1-1]<money)
            return false;
        balanc[account1-1]-=money;
        balanc[account2-1]+=money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account>balanc.length)
            return false;
        balanc[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account>balanc.length || balanc[account-1]<money)
            return false;
        balanc[account-1]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */