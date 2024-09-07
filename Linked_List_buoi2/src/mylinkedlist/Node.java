package mylinkedlist;


// Anh ddang tao 1 cai linked list voi cai Node la luu tru cac so nguyen
// Cai next do no se mang kieu du lieu gi ?

public class Node {
    private int data;
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
    
}