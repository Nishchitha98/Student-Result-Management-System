import java.util.*;
class Person{
   String name;
   int age;
   Person(String name,int age){
      this.name=name;
      this.age=age;
   }
   public void displayPersonInfo(){
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
   }
}
class Student extends Person{
    int rollNo;
    int marks;
    static int studentCount=0;
    Student(String name,int age,int rollNo,int marks){
        super(name,age);
        this.rollNo=rollNo;
        this.marks=marks;
        studentCount++;
    }
    public static float calculateAverage(Student[] s){
        float sum=0;
        for(int i=0;i<s.length;i++){
            sum+=s[i].marks;
        }
        float avg=sum/s.length;
        System.out.println("\nAverage marks:"+avg);
        return avg;
    }
    public void calculateGrade(){
        char grade;
        if(marks>90){
            grade='A';
        }else if(marks>80){
            grade='B';
        }else if(marks>70){
            grade='C';
        }else grade='P';
        System.out.println("Grade:"+grade);
    } 
    public void displayStudentInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        System.out.println("Roll Num:"+rollNo);
    }
}
abstract class Exam{
    abstract void showResult(Student s);
}
class InternalExam extends Exam{
    void showResult(Student s){
        System.out.println("Internal Exam Result");
        s.displayStudentInfo();
        s.calculateGrade();
    }
}
class FinalExam extends Exam{
    void showResult(Student s){
        System.out.println("Final Exam Result");
        s.displayStudentInfo();
        s.calculateGrade();
    }
}

public class StudentResult 
{
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of students:");
	    int n=sc.nextInt();
	    Student[] s=new Student[n];
	    for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1) + ":");
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter age:");
            int age = sc.nextInt();
            System.out.println("Enter roll number:");
            int rollNo = sc.nextInt();
            System.out.println("Enter marks:");
            int marks = sc.nextInt();
            System.out.println();
            s[i] = new Student(name, age, rollNo, marks);
        }
        boolean run=true;
        while(run){
            System.out.print("\n1.Display student information\n2.Show Average marks\n3.Show grade\n4.Show exam results\n5.Exit\n");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:System.out.println("\nStudent information");
	                   for(int i=0;i<s.length;i++){
	                   s[i].displayStudentInfo();
	                   System.out.println();
	                   }
	                   break;
                case 2:Student.calculateAverage(s);
                System.out.println();
                break;
                case 3:System.out.println("\nGrades of students");
	                   for(int i=0;i<s.length;i++){
	                   s[i].calculateGrade();
	                   }
	                   break;
                case 4:	System.out.println("\nExam results");
                	    Exam internal=new InternalExam();
                	    Exam finals=new FinalExam();
                	    for(int i=0;i<s.length;i++){
                	        internal.showResult(s[i]);
                	        System.out.println();
                	        finals.showResult(s[i]);
                	        System.out.println();
                	    } break;
               case 5: run=false;
                   System.out.println("\nExiting");
                	    break;
                default: System.out.println("\nInvalid option entered");
                }
                }
                sc.close();
	}
}	
