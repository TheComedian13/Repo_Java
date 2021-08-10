public class Test1 {
    static void trafficTicket(int driverSpeed){
        while (driverSpeed > 70){
            System.out.println("Over the limit");
            driverSpeed = driverSpeed - 5;
        }
    }
    public static void main(String[] args){
        trafficTicket(175);

        }


}
