package Stack;

public class Stack {
    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop(){
        if(top == null){
            throw new RuntimeException();
        }
        top = top.next;
    }

    public int peek(){
        if(top == null){
            throw new RuntimeException();
        }
        return top.data;
    }

    public void printStack(){
        Node node = top;
        while (node != null){
            System.out.print(node.data +" ");
            node = node.next;
        }
    }
}
