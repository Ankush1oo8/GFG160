public class reverseLL {
    
        Node reverseList(Node head) {
            // code here
               
            // Base case:
            // If the linked list is empty or has only one node,
            // return the head as it is already reversed.
            if (head == null || head.next == null) {
                return head;
            }
            
            // Recursive step:
            // Reverse the linked list starting
            // from the second node (head.next).
            Node newHead = reverseList(head.next);
            
            // Save a reference to the node following
            // the current 'head' node.
            Node front = head.next;
            
            // Make the 'front' node point to the current
            // 'head' node in the reversed order.
            front.next = head;
            
            // Break the link from the current 'head' node
            // to the 'front' node to avoid cycles.
            head.next = null;
            
            // Return the 'newHead,' which is the new
            // head of the reversed linked list.
            return newHead;
        
    
        }
    
}
