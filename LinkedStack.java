import java.util.EmptyStackException;
public class LinkedStack<T> {
    private int count; private Node<T> top;

    public LinkedStack() {
    count = 0; top = null;
    }
    public void push(T element) {
    Node<T> temp = new Node<>(element);
    temp.setNext(top);
        top = temp; count++;
    }
    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }
        public T peek() throws EmptyStackException {
            if (isEmpty())
                throw new EmptyStackException();

            return top.getElement(); }
        public boolean isEmpty() {
    return count == 0; }
    public int size()
        { return count;
        }}
