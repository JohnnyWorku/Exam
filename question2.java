public class Stack {
    int[] intArray;
    int top;
    int size;
    int capacity;
    public Stack(int capacity){
        intArray = new int[capacity];
        top = -1;
        size = 0;
        this.capacity = capacity;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }

    public void push(int value){
        if (!isFull()){
            intArray[++top] = value;
            size++;
        }
        else
            System.out.println("The stack is full.");
    }
    public int pop(){
        if (!isEmpty()){
            size--;
            return intArray[top--];
        }
        else
            throw new IllegalStateException("the stack is empty.");
    }
    public int peek(){
        if (!isEmpty()){
            return intArray[top];
        }
        else
            throw new IllegalStateException("The stack has no elements.");
    }
}
