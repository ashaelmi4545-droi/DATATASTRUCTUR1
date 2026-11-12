public class LinkedStackTraceDemo {
    public static void main(String[] args) {
        LinkedStack<String> s = new LinkedStack<>();
        s.push("A");
        s.push("B");
        s.push("C");

    System.out.println("size: " + s.size()); System.out.println("peek: " + s.peek()); System.out.println("pop: " + s.pop()); // C is unlinked System.out.println("size: " + s.size()); System.out.println("peek: " + s.peek());
} }