static void levelOrder(Node root) {
       LinkedList<Node> queue = new LinkedList<Node>();
       queue.add(root);
       while (!queue.isEmpty()) {
           Node current = queue.poll();
           System.out.printf("%d ",current.data);
           if (current.left != null) {
               queue.add(current.left);
           }  
           if (current.right != null) {
               queue.add(current.right);
           } 
       } 
}
