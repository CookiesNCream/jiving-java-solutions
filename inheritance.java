class Grade extends Student {
   private int score;
   
   Grade(String firstName, String lastName, int phone, int score) {
       super(firstName, lastName, phone);
       this.score = score;
   }
    
   char calculate() {
       char grade = 'D';
       if (getScore() < 40) {
           grade = 'D';
       } else if (getScore() >= 40 && score < 60) {
           grade = 'B';
       } else if (getScore() >= 60 && score < 75) {
           grade = 'A';
       } else if (getScore() >= 75 && score < 90) {
           grade = 'E';
       } else {
           grade = 'O';
       }
       return grade;
   }
    
   public int getScore() {
       return this.score;
   }
}
