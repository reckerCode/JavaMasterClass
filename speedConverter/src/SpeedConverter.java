public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour <0){
            System.out.println("Invalid value");
        }else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " kh/h = " + result + " mi/h");
        }
    }
}
