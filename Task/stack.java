//Write a java program to demonstrate basic stack operations like push,pop and peek using java stack class and check if stack is empty or full
package Task;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        {

            Stack<Integer> s = new Stack<>();

            //pushing an element
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            System.out.println(s);

            s.pop();
            System.out.println(s);

            System.out.println(s.peek());
            System.out.println(s.empty());

        }
    }

}
