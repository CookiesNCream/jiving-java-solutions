class Palindrome {
    
    LinkedList queue;
    
    Palindrome () {
        queue = new LinkedList();
    }
    
    Stack stacky = new Stack();
    
    void pushCharacter(char ch) {
        stacky.push(ch);
    }
    
    void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }
    
    char popCharacter() {
        return (char) stacky.pop();
    }
    
    char dequeueCharacter() {
        return (char) queue.remove(0);
    }
}
