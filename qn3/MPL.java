import java.util.*;
class MPL{
    Scanner put=new Scanner(System.in);
    int standard;
    int num_students;
    public int first;
    public float average;
    int student_first;
    MPL(int a, int b){
        standard = a;
        num_students=b;
        mark(num_students);
    }
    public void mark(int num_students){
        int max =0;
        int[] marks = new int[num_students];
        int average_class=0;
        System.out.println("Enter the marks of students");
        for(int i =0;i<num_students;i++){
            marks[i]=put.nextInt();
            average_class=average_class+marks[i];
            if(marks[i]>max){
                max=marks[i];
                student_first=i+1;
            }
        }
        first=student_first;
        average=average_class/num_students;
    }
    public void display(){
        System.out.println("Standard:- "+ standard);
        System.out.println("No of students:- "+ num_students);
        System.out.println("First student:- "+ first);
        System.out.println("Average of the class:- "+ average);
    }
}

