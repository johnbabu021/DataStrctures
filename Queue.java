public class Queue {

static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }



}
    public Node front=null;
public Node rear=null;

    public void enqueue(int data){

        Node newNode=new Node(data);

        if(rear==null){
            rear=front=newNode;
            return;

        }
        else {
            rear.next=newNode;
            rear=newNode;
        }


    }


    public void dequeue(){
        if(front==null){
System.out.println("empty queue");
        return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }

    public void display(){
        Node current=front;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }



    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.display();


    }
}