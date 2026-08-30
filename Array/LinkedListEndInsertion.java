/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class LinkedListEndInsertion {
    public Node insertAtEnd(Node head, int x) {
        Node newNode =  new Node(x);
        
        if(head == null) {
            head = newNode;
            return head;
        }
        
        if(head.next == null){
            head.next = newNode;
            return head;
        }
        
        Node temp = head;
        
        while(temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
        
        return head;
    }
}