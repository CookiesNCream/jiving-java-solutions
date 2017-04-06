public static int getHeight(Node root) { 
        
        if (root == null) {
            return 0;   
        }
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
}

/**/

public static int getHeight(Node root) {
      if(root == null) {
        return 0;
      } else {
        if(getHeight(root.right)>getHeight(root.left)) {
            return 1 + getHeight(root.right);
        } else {
            return 1 + getHeight(root.left);                
        }
      }
}
