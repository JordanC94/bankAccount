public class TestBankAccount {
  public static void main(String[] args){
    BankAccount chaseBank = new BankAccount();
    chaseBank.depositChecking(100);
    chaseBank.getCheckingBalance();
    chaseBank.depositSaving(2000);
    chaseBank.getSavingBalance();
    chaseBank.networth();
  }
}
