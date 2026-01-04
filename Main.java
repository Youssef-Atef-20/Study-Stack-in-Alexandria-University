public class Main{
    public static void main(String[] args){
        SLinkedList list =  new SLinkedList();
        
        list.add(0);
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);

System.out.println("Before remove, size = " + list.size); // طبع الـ size

list.removeNode(2); // تحذف العقدة في index 2

System.out.println("After remove, size = " + list.size);
list.traverse();

    }
}

class Node{
    int data;
    Node next;
    Node prev;
    public Node(int d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}

class SLinkedList{
    Node head, tail;
   

   int size = 0 ;




    public void add(int t){ // add in the end
        Node n = new Node(t); // we create node and then look where we will put it


       if (head == null){
        head = n;
       } else {
       
        Node current = head;
        while (current.next != null) { // this loop make the current pointer move in the list 
            current = current.next;
        } // the current pointer is at the final node
        
        current.next = n;
        n.prev = current;
        
        
       }

       size ++;

}


      



    public void addAtPos(int d, int pos){
        Node n = new Node(d);



        if (head == null){
            head = n;
            return;
        } else {

            Node current = head;
            for(int i = 0; i < pos ; i++ ){
                current = current.next;
            } // we reached to the target the node that we want to create the new node after it

           n.prev = current; // 1
           n.next = current.next; // 2
           current.next.prev = n; // 3
           current.next = n; // 4
        

            // to understand what 1,2,3,4 (Look In Youssef Atef NoteBook)

        }

        size++;
    }









public void removeNode(int pos){
    if (head == null || pos < 0 || pos >= size) {
        System.out.println("Invalid position");
        return;
    }

    if (pos == 0) { // حذف أول node
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else { // لو كانت القائمة فيها node واحدة بس
            tail = null;
        }
    } else {
        Node current = head;
        for (int i = 0; i < pos - 1; i++) { // نوصل للعقدة اللي قبل اللي هنحذفها
            current = current.next;
        }

        Node delete = current.next;
        current.next = delete.next;

        if (delete.next != null) { // لو مش آخر node
            delete.next.prev = current;
        } else { // لو آخر node
            tail = current;
        }
    }

    size--;
}



























































    public void traverse(){ // this function show the data inside the nodes
        if(head == null){
            System.out.println("There Isn't any List Yet");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println("The Data inside This Node is: " + current.data);
            current = current.next;
        }

        System.out.println("The Number of Nodes in this List = " + size);
    }

}