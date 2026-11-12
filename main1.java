import java.util.Stack;
public class main1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Original Stack: " + s1.toString());
        int top = s1.peek();
        System.out.println("top element: " + top);
        System.out.println("Stack after accessing top element: " + s1);
        int out = s1.pop();
        System.out.println("Removed element: " + out);
        System.out.println("Stack after Pop Operation: " + s1);
    }}
