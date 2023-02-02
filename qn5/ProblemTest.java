import java.util.*;
class APPROACH1 implements GCD{
    // Euclid Method (num1>num2)
    public int computeGCD(int num1, int num2){
        if (num2 == 0) {
            return num1;
        }else return computeGCD(num2, num1 % num2);
        
    }
}

class APPROACH2 implements GCD{
    // Listing all factors (Assuming num1>num2)
    public int computeGCD(int num1, int num2){
        int gcd = 1;
        for(int i=num2;i>1;i--){
            if(num1%i == 0 && num2%i==0){
                gcd = i;
                break;
            }
        }
        return(gcd);
    }
}

class ProblemTest{
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = put.nextInt();
        System.out.println("Enter num2");
        int num2 = put.nextInt();
        APPROACH1 newAPPROACH1 = new APPROACH1();
        APPROACH2 newAPPROACH2 = new APPROACH2();
        System.out.println("GCD by Euclid's method: " +newAPPROACH1.computeGCD(num1,num2));
        System.out.println("GCD by listing all factors: " + newAPPROACH2.computeGCD(num1,num2));
    }
}