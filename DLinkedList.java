class DLinkedList{

class Node{

    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }

}

public Node head=null;
public Node tail=null;


public void addData(int data){
    Node newNode=new Node(data);

    if(head==null){
head=newNode;

    }
    else {
        tail.next=newNode;
        newNode.prev=tail;
    }
    tail=newNode;
}
public void display(){
    Node temp=head;

    if(head==null){
        System.out.println("empty linked list");
    }

    while (temp!=null){
        System.out.println(temp.data);
                temp=temp.next;
    }
}
    public void displayReverse(){
        Node temp=tail;


        if(head==null){
            System.out.println("empty linked list");
            return;
        }

        while (temp!=null&&head.prev==null){
            System.out.println(temp.data);
            temp=temp.prev;


        }
        return;
    }

    public void addAfter(int data,int value){
    Node newNode=new Node(data);
    Node temp=head;


    while (temp!=null&&temp.data!=value){
        temp=temp.next;
    }
if(temp==null){
    newNode.prev=tail;
    tail.next=newNode;
    tail=newNode;
    return;
}
newNode.next=temp.next;
newNode.prev=temp;
temp.next=newNode;



    }




public void deleteAfter(int data){
    Node temp=head,before=null;
    if(temp!=null&&temp.data==data){
        head=head.next;

        return;
    }
    while (temp!=null&&temp.data!=data){
        before=temp;
        temp=temp.next;
    }
    if(temp==null){
       return;
    }
    if(temp==tail){
        tail=tail.prev;
    }
    before.next=temp.next;
    temp.prev=before;
}

public void addBefore(int data,int value){
    Node newNode= new Node(data);
    Node temp=tail,before=null;

if(temp!=null&&temp.data==data){
   before=temp.prev;
    newNode.next=before.next;
    before.next=newNode;
   newNode.prev=temp.prev;
   temp.prev=newNode;
   return;
}

    while (temp!=null&&temp.data!=value){

        System.out.println(temp.data+"ahi");

        temp=temp.prev;

    }

    if(temp.prev==null&&temp.data==value){
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
        return;
    }

    if(temp==null){
        return;
    }

    before=temp.prev;
    newNode.next=before.next;
    temp.prev=newNode;
before.next=newNode;
newNode.prev=temp.prev;



}


public void deleteSame(){

    Node current= head;



    while (current!=null){
        Node next=current.next;
        while (next!=null&&next.data==current.data){
            next=next.next;


    }
        current.next=next;
        //value of next in node like prev
        if(next==tail&&current.data== next.data){
            tail=current;
            tail.next=null;

        }
        current=next;


    }

}




    public static void main(String[] args) {
DLinkedList list=new DLinkedList();
        list.addData(6);
        list.addData(10);
        list.addData(5);
        list.addData(5);
        list.addData(5);
        list.addData(8);
        list.addData(8);
        list.deleteSame();

//        list.addBefore(40,20);
//list.addBefore(80,8);

//        list.displayReverse();

        list.display();




    }
}