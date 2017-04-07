import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson() {
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}


class Student extends Person {
	private int[] testScores;
   
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    
    char calculate() {
        char avgGrade = 'T';
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }
        double avgScore = sum / testScores.length;
        if (avgScore >= 90 && avgScore <= 100) {
            avgGrade = 'O';
        } else if (avgScore >= 80 && avgScore < 90) {
            avgGrade = 'E'; 
        } else if (avgScore >= 70 && avgScore < 80) {
            avgGrade = 'A';
        } else if (avgScore >= 55 && avgScore < 70) {
            avgGrade = 'P';
        } else if (avgScore >= 40 && avgScore < 55) {
            avgGrade = 'D';
        } else {
            avgGrade = 'T';
        }
        return avgGrade;
    }
}


class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
