import java.text.*;
public class student {
        private int idNum; 
        private int crdtHrsEarned; 
        private int ptsEarned; 
        private double gradePointAverage;

public student() { 
    idNum = 9999; 
    crdtHrsEarned = 3; 
    ptsEarned = 12; 
    computeGPA(); 
} 
    
public void computeGPA() { 
    gradePointAverage = (double) ptsEarned / crdtHrsEarned; 
}

public void assignValues(int id, int credits, int points) { 
    idNum = id; 
    crdtHrsEarned = credits; 
    ptsEarned = points; 
    computeGPA(); 
}
public void displayStudentDetails() { 
    DecimalFormat df = new DecimalFormat("0.00"); 
    System.out.println("Student ID: " + idNum); 
    System.out.println("Credit Hours Earned: " + crdtHrsEarned); 
    System.out.println("Points Earned: " + ptsEarned); 
    System.out.println("Grade Point Average (GPA): " + df.format(gradePointAverage)); }
}
