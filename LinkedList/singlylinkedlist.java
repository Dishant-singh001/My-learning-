package LinkedList; 
public class singlylinkedlist {
    Node head;

    private int size;
    singlylinkedlist(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - at first 
    public void addAtFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head =newNode;
    }

    //add -at last
    public void addAtLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    //add in between 

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
            return;
        }
        Node lastNode =head.next;
        Node secondLast  = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    // size
    public int getSize(){
        return size;
    }

    //print 
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node current=head;
        while(current !=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        singlylinkedlist list =new singlylinkedlist();
        
        list.addAtFirst("hii");
        list.addAtFirst("dishant");
        list.addAtFirst("am");
        list.addAtFirst("I");
        
        list.printlist();
        System.out.println("\nsize : "+list.getSize());

        list.addAtLast("how are you");

        list.printlist();
        System.out.println("\nsize : "+list.getSize());

        list.deleteFirst();
        list.deleteLast();

        list.printlist();        
        System.out.println("\nsize : "+list.getSize());

        

    }
}
