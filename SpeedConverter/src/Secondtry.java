public class Secondtry {
    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("miles = " + miles);

        SpeedConverter.printConversion(10.5);

    }
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometerPerHour){

        if (kilometerPerHour <0) {
            System.out.println("Invalid Value");
        } else {
            long kilometersPerHour;
            long milesPerHour =toMilesPerHour (kilometersPerHour);
        System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }


}
