
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

    public T peek() {
        if (isEmpty())
            throw new java.util.EmptyStackException();

        return top.getElement();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}

class Registration {

    private LinkedStack<String> courses = new LinkedStack<>();

    public void addCourse(String code) {
        courses.push(code);

        System.out.println("Added " + code +
                " | top: " + courses.peek() +
                " | size: " + courses.size());
    }

    public void undoLastCourse() {
        if (courses.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        String removed = courses.pop();

        System.out.println("Removed " + removed +
                " | size: " + courses.size());
    }
}

public class UndoCourseLinkedDemo {

    public static void main(String[] args) {

        Registration reg = new Registration();

        reg.addCourse("CA314");
        reg.addCourse("CA301");
        reg.addCourse("MA210");

        reg.undoLastCourse();
        reg.undoLastCourse();
    }
}
