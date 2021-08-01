public class FeetToCentimeter {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet>0 && (inches>=0 && inches<=12)){
            double cm1 = (feet * 12)*2.54d;
            double  cm2 = inches * 2.54d;;
            return cm1+cm2;
        }else{
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return (calcFeetAndInchesToCentimeters(feet, remainingInches));
        }else{
            return -1;
        }
    }
}
