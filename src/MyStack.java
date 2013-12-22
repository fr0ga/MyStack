import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: fr0ga
 * Date: 22.12.13
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */
public class MyStack {
    public static void main(String[] args) throws IllegalStateException {
        Stack<Integer> St = new Stack<Integer>();
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        St.push(20);
        St.push(6);
        // if (St.pop() == 6) throw new IllegalStateException("Illegal State!");
        System.out.println(St.get(St.size() - 1));
        while (!St.empty()) {
            System.out.println(St.pop());
        }
    }
}
