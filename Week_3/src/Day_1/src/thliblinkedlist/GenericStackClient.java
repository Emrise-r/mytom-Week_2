package thliblinkedlist;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("1.size after push: " + stack.size());
        System.out.println("1.Pop element: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("\n1.stack after pop: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.size after push: " + stack.size());
        System.out.println("2.Pop element: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n2.stack after pop: " + stack.size());
    }

    public static void main(String[] args) {
        stackOfStrings();
        stackOfIntegers();
    }
}
