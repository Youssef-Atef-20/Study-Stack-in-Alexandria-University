import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        CList list = new CList();
        list.choice(); 
        
    }
}


class Node { 
    int data;
    Node next;

    Node(int d){
        this.data = d;
        this.next = null;
    }
}




class CList{
    Node head;
    Node tail;
    int size;
    Scanner scanner = new Scanner(System.in);



    void add(){
        System.out.println("Please Enter The Data: ");
        int data = scanner.nextInt();
        Node node = new Node(data);

        if (head == null){
            head = node;
            tail = node;
            tail.next = head;
            size++;
            return;
        }

        Node current = head;
        while (current.next != head) {
            current = current.next;
        } 
        current.next = node;
        tail = node;
        tail.next = head;
        size++;
     
    }


    void addByPos(){
        System.out.print("Plaese Enter The Data: ");
        int data = scanner.nextInt();
        System.out.print("Plaese Enter The Position: ");
        int pos = scanner.nextInt();

        Node node = new Node(data);

        if (head == null) return;

        Node current = head;

        if (pos < size){
            for(int i = 0 ; i < pos - 1 ; i++){
                current = current.next;
            }

            Node after = current.next;

            current.next = node;
            node.next = after;
            size++;

            System.out.println("Data Added Successfully and the size: " + size);
        } else if (pos == size){
            tail.next = node;
            tail = node;
            tail.next = head;
            size++;
          
        } else {
            System.out.println("This Place isn't exist Yet");
            choice();
        }
    }



    public void Traverse(){
        Node current = head;

        if (current == null){
            System.out.println("There isn't List Exist Yet");
        }

        do {
            System.out.println("The Data inside This Node: " + current.data);
            current = current.next;
        } while (current != head);
        System.out.println("Size: " + size);
    }





    public void choice(){
        System.out.println("What Do You Want to Do?\n1. Add a Data at the End\n2. Add a Data in Specific Place\n3. View all The Data\n(Choose by Number)");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            add();
            choice();
            break;
        
            case 2: 
            addByPos();
            choice();
            break;

            case 3: 
            Traverse();
            choice();
            break;
        }
    
    
    }






















}