
 public class EmptyCollectionException extends RuntimeException {

    public EmptyCollectionException(String collection) {
        super("The " + collection + " is empty.");
    }
}

 class Main3 {

    public static void main(String[] args) {

        try {
            throw new EmptyCollectionException("stack");

        } catch (EmptyCollectionException e) {

            System.out.println("Caught: " + e.getMessage());
        }
    }
}
