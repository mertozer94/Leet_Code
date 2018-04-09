import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Mert Ozer
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
public class Min_Stack_155 {
    public Stack<Integer> stack;
    public int min;
    public Min_Stack_155() {
        stack = new Stack();
    }

    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(0);
            min = x;
        }
        else{
            stack.push(x-min);
            if (x < min)
                min=x;
        }

    }

    public void pop() {
        if (stack.isEmpty())
            return;

        int pop = stack.pop();

        if (pop < 0)
            min -= pop; //If negative, increase the min value
    }

    public int top() {
        int top = stack.peek();
        if (top > 0)
            return top + min;
        else
            return min;

    }

    public int getMin() {
        return min;
    }
}
