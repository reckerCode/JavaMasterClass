public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPoint(double dec1, double dec2){
        int dec11 = (int)(dec1*1000);
        int dec12 = (int)(dec2*1000);
        if(dec11 == dec12){
            return true;
        }else{
            return false;
        }
    }
}
