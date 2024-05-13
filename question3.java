public class QueueUsingStacks {
    int capacity;
    Stack stack1;
    Stack stack2;
    public QueueUsingStacks(int capacity) {
        Stack stack1 = new Stack(capacity);
        Stack stack2 = new Stack(capacity);
        this.capacity = capacity;
    }

    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue(){
        for (int i = 0; i < capacity; i++){
            int[] numArray = stack1.intArray;
            stack2.push(numArray[i]);
        }
        return stack2.pop();
    }
    public int peek(){
       return stack1.peek();
    }
}
