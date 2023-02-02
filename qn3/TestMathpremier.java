import java.util.*;
class TestMathpremier{
    static MPL mpl[] = new MPL[2];
    public static void main(String args[]){
        Scanner put = new Scanner(System.in);
        int first=0;
        float avg=0;
        for(int i=0;i<2;i++){
            System.out.println("Enter the number of students in class "+(i+1));
            int students = put.nextInt();
            mpl[i] = new MPL(i,students);
            mpl[i].display();
        }
        bestclass();
        avgbestclass();
    }
    public static void bestclass(){
        float max=0;int standard=0;
        for(int i=0;i<2;i++){
            if(mpl[i].average>max){
                max=mpl[i].average;standard=i+1;
            }
        }
        System.out.println("The best class on the basis of average is : "+standard);
    }
    public static void avgbestclass(){
        float max=0;
        int standard=0;
        for(int i=0;i<2;i++){
            if(mpl[i].first>max){
                max=mpl[i].first;
                standard=i+1;
            }
        }
        System.out.println("The best class on the basis of average is : "+standard);
    }
}