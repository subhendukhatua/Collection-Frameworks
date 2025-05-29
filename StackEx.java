import java.util.Stack;

public class StackEx {
  public static void main(String[] args) {
    Stack<String> bookShelf = new Stack<>();
    bookShelf.push("Ansi C");
    bookShelf.push("C++");
    bookShelf.push("Java");
    bookShelf.push("Rich dad poor dad");

    System.out.println("Stack is " + bookShelf);

    System.out.println("Popped " + bookShelf.pop());

    System.out.println("Top element : " + bookShelf.peek());

    System.out.println("position of c++ : " + bookShelf.search("C++"));

    System.out.println("Empty stack :" + bookShelf.empty());
  }
}
