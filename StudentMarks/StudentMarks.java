
/**
 * Write a description of class StudentMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentMarks
{
public static void main(String[] args){
    //creating input for taking input values
    Scanner input=new Scanner(System.in);
    System.out.print("Enter assignment name:");
    String assignmentName=input.nextLine();
     ArrayList<Double> marks = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            while (true) {
                try {
                    System.out.print("Enter mark for student " + (i + 1) + ": ");
                    double mark = input.nextDouble();
                    if (mark >= 0 && mark <= 30) {
                        marks.add(mark);
                        break;
                    } else {
                        System.out.println("Invalid mark. Please enter a value between 0 and 30.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a numberic value.");
                    input.next(); 
                }
            }
        }

        // Print Assignment Name and Marks
        System.out.println("Assignment: " + assignmentName);
        System.out.println("Marks: " + marks);

        // The process of computing highest and lowest marks
        double highest = marks.get(0);
        double lowest = marks.get(0);
        for (double mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);


   
    
    
}
}
