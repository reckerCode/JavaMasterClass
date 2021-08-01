public class SecondAndMinute {
    public static String getDurationString(long minutes, long seconds){
        if((minutes>=0 && (seconds>=0 && seconds<=59))){
            long hours = minutes/60L;
            long remainingMinutes = minutes%60L;
            return hours+"h "+remainingMinutes+"m "+seconds+"s";
        }else{
            return "Invalid Value";
        }
    }
    public static String getDurationString(long seconds){
        if((seconds>0)){
            long minutes = seconds/60L;
            long remainingSeconds = minutes%60L;
            return getDurationString(minutes, remainingSeconds);
        }else{
            return "Invalid Value";
        }
    }
}
