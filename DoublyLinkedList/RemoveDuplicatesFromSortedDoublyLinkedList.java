class Solution{
    Node removeDuplicates(Node head){
        
        if (head == null) {
            return null;
        }
        
        Node previous = head;
        Node currNode = head.next;
        Node tail = head;
        
        while (currNode != null) {
            if (currNode.data != previous.data) {
                tail.next = currNode;
                currNode.prev = tail;
                tail = tail.next;
            }
            previous = currNode;
            currNode = currNode.next;
        }
        tail.next = null;
        return head;
    }
}