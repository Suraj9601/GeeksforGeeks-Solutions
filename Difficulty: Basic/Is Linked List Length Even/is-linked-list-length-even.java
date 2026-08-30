/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        
        if(head == null) {
            return true;
        }
        Node temp = head;
        int len = 1;
        
        while(temp.next != null) {
            len++;
            temp = temp.next;
        }
        
        return len % 2 == 0 ? true : false;
    }
}