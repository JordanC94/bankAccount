public class BankAccount{
//
  private double checkingBalance;
  private double savingBalance;
  private static int bankTotalAccounts;
  private static double bankTotalBalance;

//constructor
  public BankAccount(){
    checkingBalance = 0.0;
    savingBalance = 0.0;
    bankTotalAccounts += 1;
  }
//getter
  public double getCheckingBalance(){
    System.out.println(checkingBalance);
    return this.checkingBalance;
  }
//setter
  public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
  }
//getter
  public double getSavingBalance(){
    System.out.println(savingBalance);
    return this.savingBalance;
  }
//setter
  public void setSavingBalance(double savingBalance){
    this.savingBalance = savingBalance;
  }
//banks networth
  public double networth(){
    System.out.println(bankTotalBalance);
    System.out.println(bankTotalAccounts);
    return savingBalance + checkingBalance;
  }
//add money  checking
  public double depositChecking(double amount){
    bankTotalBalance += amount;
    checkingBalance += amount;
    return checkingBalance;
  }
//subtracts money from checking
  public double withdrawChecking(double amount){
    bankTotalBalance -= amount;
    checkingBalance -= amount;
    return checkingBalance;
  }
//add money to savings
  public double depositSaving(double amount){
    bankTotalBalance += amount;
    savingBalance += amount;
    return savingBalance;
  }
// minus money from savings
  public double withdrawSaving(double amount){
    bankTotalBalance -= amount;
    savingBalance -= amount;
    return savingBalance;
  }
  //end of class
}