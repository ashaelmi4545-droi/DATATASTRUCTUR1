class Node<T> {

    private T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

class LinkedStack<T> {

    private int count;
    private Node<T> top;

    public LinkedStack() {
        count = 0;
        top = null;
    }

    public void push(T element) {
        Node<T> temp = new Node<>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public T pop() {
        if (isEmpty())
            throw new java.util.EmptyStackException();

        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}

class BankAccount {

    private double balance;
    private LinkedStack<Double> history = new LinkedStack<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        history.push(amount);
        System.out.println("Deposit " + amount + " -> balance " + balance);
    }

    public void undoLastDeposit() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        double last = history.pop();
        balance = balance - last;
        System.out.println("Undo " + last + " -> balance " + balance);
    }
}

public class BankAccount2 {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(100);

        acc.deposit(50);
        acc.deposit(20);
        acc.deposit(30);

        acc.undoLastDeposit();
        acc.undoLastDeposit();
    }
}