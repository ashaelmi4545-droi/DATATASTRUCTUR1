
import java.util.Arrays;
import java.util.EmptyStackException;

 class ArrayStack<T> {

    private final static int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();

        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int capacity() {
        return stack.length;
    }
}

class ArrayStackTraceDemo {
    public static void main(String[] args) {

        ArrayStack<String> s = new ArrayStack<>();

        s.push("A");
        s.push("B");

        System.out.println("size " + s.size() + ", capacity " + s.capacity());

        s.push("C");

        System.out.println("size " + s.size() + ", capacity " + s.capacity());

        System.out.println("peek: " + s.peek());

        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
    }
}
