package mylinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }
// 0
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    public int length(){
        Node temp =head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void display(){
        Node temp = head;
        for(int i=0;i<length();i++){
            System.out.print(temp.getData());
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
    }
    public void deleteFirst() {
		if (head != null) {
            head = head.next;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()
    public void deleteLast(){
        
        if(head == null ){
            return;
        } 

        if(head.next == null){
            deleteFirst();
        }

        Node temp = head;
        Node previous = null;
        while(temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        previous.next = null ;
    }
    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == length() - 1){
            deleteLast();
            return;
        }
        Node previousNodeDelete = head;
        for (int i = 1; i < index; i++) {
            previousNodeDelete = previousNodeDelete.next;
        }
        previousNodeDelete.next = previousNodeDelete.next.next;
    }

    public void delete1(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == length() - 1){
            deleteLast();
            return;
        }
        Node temp = head;
        int count = 1;
        while(temp != null && count < index ){
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public boolean search(int data){
        if(head == null){
            return false;
        }
        Node temp = head;
        while(temp != null ){
            if(temp.getData()==data){
                return true;
            }
        }
        return false;
    }

    public void sort(){
        if(head == null){
            return;
        }
        Node min = head;

        while(min != null) {
            Node minNode = min; 
            Node maxNode = min.next;

            while(maxNode != null){
            if(maxNode.data < minNode.data){
                minNode = maxNode;
            }
            maxNode = maxNode.next;
        }
        int max = min.data;
        min.data = minNode.data;
        minNode.data = max;

        min = min.next;
    }
        
    }
        
    

    public Node searchAtPosition(int index){
        if(index < 0 || index >= length())
            return null;
        Node temp = head;
        for (int i = 0; i <= index; i++) { 
            temp = temp.next;
        }
        return temp;
    }
    // ví dụ list Node là 1>2>3>4 
    // cho index = 2
    // nếu i<index thì temp sẽ = 2
    // nếu i<=index thì temp sẽ =3

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("sau khi add first");
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.display();

        System.out.println("sau khi add last");
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        //1->2->3
        linkedList.display();
        linkedList.deleteFirst();
        System.out.println("xoa node dau");
        linkedList.display();
        
        System.out.println("do dai la: "+linkedList.length());

        linkedList.add(7, 3);
        System.out.println("thay doi node");
        linkedList.display();

        linkedList.deleteLast();
        System.out.println("xoa node cuoi");
        linkedList.display();

        linkedList.delete1(2);
        System.out.println("xoa vi tri index");
        linkedList.display();

        linkedList.sort();
        System.out.println("sap xep node");
        linkedList.display();
        
    }

}

