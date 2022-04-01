class Solution {
    public int dayOfYear(String date) {
        String[] split = date.split("-");
        int year =  Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int currentDate = Integer.parseInt(split[2]);
        boolean isLeap = checkYear(year);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int noOfDays = 0;
        
        for(int i = 0 ; i < month - 1; i++){
            
            if(isLeap && i == 1){
                noOfDays += days[i] + 1;
                continue;
            }
            
            noOfDays += days[i];
        }
        return noOfDays + currentDate;
    }
    
    boolean checkYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}