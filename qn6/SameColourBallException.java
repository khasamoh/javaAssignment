public class SameColourBallException extends Exception{
    SameColourBallException(int x){
        System.out.println("Same colour was picked more than thrice");
    }
}