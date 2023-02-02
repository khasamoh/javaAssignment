import java.util.Scanner;
class Personal{
    public static void main(String[] args){
        try{
            Scanner put = new Scanner(System.in);
            System.out.println("Enter Registration number");
            String reg = put.nextLine();
            System.out.println("Enter FullName ");
            String name = put.nextLine();
            System.out.println("Enter CGPA");
            float gpa = put.nextFloat();
            System.out.println("Enter Program name");
            String program = put.nextLine();
            System.out.println("Enter School name");
            String school = put.nextLine();
            System.out.println("Enter Proctor name");
            String proctor = put.nextLine();

            System.out.println("Your information is:\n");

            System.out.println("Registration: "+reg);
            System.out.println("FullName: "+name);
            System.out.println("CGPA: "+gpa);
            System.out.println("Program: "+program);
            System.out.println("school: "+school);
            System.out.println("Proctor name: "+proctor);
        }catch(Exception e){
            System.out.println("Something went wrong ");
        }
        
        
    }
}