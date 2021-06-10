public class SLinkedList{

   class Node{

      int data;
      Node next;

      Node(int data){
          this.data=data;
      }
  }
  public  Node head=null;
   //same values are there for each head and tail
  public  Node tail=null;
  public  void  AddNode(int data){
      Node NewNode=new Node(data);
      if(head==null){
          head=NewNode;

      }
      else{
          //next is a variable in tail
          //can be used in head
          //next is not public so creating a varibale with tail
          tail.next=NewNode;

      }
      tail=NewNode;
  }

  public void display(){
      if(head==null){
          System.out.println("empty");
          return;
      }
      Node temp=head;
      while (temp!=null){
          System.out.println(temp.data);

          //even if tail has next
          //temp.next is actually same
          //each node have a head and tail
          //next contains the value of AddNode()
          temp=temp.next;
      }
  }

  public void deleteNode(int data){
      Node temp=head,prev=null;
      if (temp!=null&&temp.data==data){

          head=temp.next;
      }
      while (temp!=null && temp.data!=data){
          System.out.println(temp.data);
          prev=temp;
          temp=temp.next;
      }
      if(temp==null){
          return;
      }

     if(temp==tail){
tail=prev;
tail.next=null;
return;

     }
     prev.next=temp.next;
     temp.next=null;



  }

  public void insertInto(int newData,int value) {

      Node temp = head;
      Node newNode = new Node(newData);

      if (temp != null && temp.data == value) {
          head = newNode;
          head.next = temp;
          return;
      }
      while (temp != null && temp.data != value) {
//          prev = temp;
          temp = temp.next;
      }
      if (temp == null) {
          tail = newNode;
          temp.next = tail;
          return;

      }
      newNode.next=temp.next;
      temp.next=newNode;


  }


  public void displayReverse(){

Node current=head,temp=tail,after=null;
while (current!=null){
    if(temp==tail){
        System.out.println(temp.data);
        temp.next=current;
        current=temp.next;
        temp=current;
        after=current.next;
        System.out.println(temp.data);
        System.out.println(after.data);

        return;
    }
    


}

  }







  public static void main(String[] args){
      SLinkedList list=new SLinkedList();
      list.AddNode(10);
      list.AddNode(20);
      list.AddNode(50);
//      list.display();
//      list.deleteNode(50);
//      list.display();
//      list.insertInto(30,20);
      list.displayReverse();


  }

}