//Stack implementation using Array in java


class ArrayStack {
    
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }
}

class Main{
    public static void main(String[] args){
        ArrayStack stack=new ArrayStack(10);
        
        stack.push(5);
        stack.pop();
        System.out.println(stack.peek());
    }
}







