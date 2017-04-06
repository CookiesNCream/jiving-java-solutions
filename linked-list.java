public static  Node insert(Node head,int data) {
  	 if (head == null) {
     head = new Node(data);
     } else {
            Node current = head;
            while (current.next != null) {
              current = current.next; 
            }
            current.next = new Node(data);
     }
     return head;
}
