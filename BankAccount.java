import java.util.Stack;
class BankAccount {
    private double balance;
    private Stack<Double> history = new Stack<>();
    public BankAccount(double balance) { this.balance = balance; }
    public void deposit(double amount) {
        balance = balance + amount;
        history.push(amount); // remember it
        System.out.println("Deposit " + amount + " -> balance " + balance);
    }
    public void undoLastDeposit() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
            double last = history.pop(); // most recent deposit
            balance = balance - last;
            System.out.println("Undo " + last + " -> balance " + balance);
        }
    }

 class UndoDepositDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        acc.deposit(20);
        acc.deposit(30);
        acc.undoLastDeposit();
        acc.undoLastDeposit();
    }}