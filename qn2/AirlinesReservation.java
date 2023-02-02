import java.util.Scanner;
public class AirlinesReservation{
    //Array of seats
    boolean[] flightSeats = new boolean[11];
    Scanner put = new Scanner(System.in);

    public void start(){
        while (true){
            bookSeat();
        }
    }
    public void bookSeat(){
        //Asks user for his preffered class to travel
        System.out.println("Choose Your preference : type '1' for First Class or '2' for Economy Class:");
        int pessangerClass = put.nextInt();
        if(pessangerClass == 1)firstClassBooking();
        else economyClassBooking();
    }
    // Check and book for first class seating
    public void firstClassBooking(){
        for(int cnt = 1; cnt <= 5; cnt++){
            //check if seat is available to allocate to user booking.
            if(flightSeats[cnt] == false )
            {
                //book seat
                flightSeats[cnt] = true;
                System.out.printf("First Class Seat Booking: Seat# %d\n", cnt);
                break;
            }
            else if( flightSeats[5] == true )
            {
                if ( flightSeats[10] == true)
                {
                    //if both classes are fully booked
                    System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
                }
                else
                {
                    // provide pessanger another available class option
                    System.out.println("Sorry,First Class bookings are over. Would you like to opt for Economy class ? select '1' for Yes and '2' for No");
                    int selection = put.nextInt();
                    if ( selection == 1 )
                    {
                    economyClassBooking();
                    start();
                    }
                    else
                    {
                    System.out.println("Next flight is scheduled in '3' hours.");
                    System.exit(0);
                    }
                }
            }
        }
    }

    // Check and book for economy class seating
    public void economyClassBooking() // assign an economy seat
    {
        for ( int cnt = 6; cnt <= 10; cnt++ )
        {
            if ( flightSeats[cnt] == false )
            {
                flightSeats[cnt] = true;
                System.out.printf("economy class seat booking :# %d\n", cnt);
                break;
            }
            else if ( flightSeats[10] == true )
            {
                if ( flightSeats[5] == true)
                {
                    System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Sorry, Economy Class seat bookings are over. Would you like to opt for first Class seat? press '1' for Yes and '2' for No");
                    int selection = put.nextInt();
                    if ( selection == 1 )
                    {
                        firstClassBooking();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is scheduled in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO AIRLINES RESERVATION SYSTEM");
        AirlinesReservation airline = new AirlinesReservation();
        airline.start();
    }
}