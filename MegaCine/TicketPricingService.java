public class TicketPricingService {
    public double calculatePrice( int age , String dayOfWeek , boolean isMember){
        double basePrice = 100000;
        if (age <= 0 ){
            return -1 ;
        }
        if(dayOfWeek == null || dayOfWeek.isEmpty()){
            return -1 ;
        }
        if( dayOfWeek.equalsIgnoreCase("Tuesday")){
            return basePrice * 0.5;
        }
        double finalPrice = 0 ;
            if(age<12){
                finalPrice = basePrice * 0.7;
                if(isMember){
                    finalPrice -= 10000;
                }
            }
            else if ( age>= 60){
                finalPrice = basePrice * 0.6;
            }else{
              boolean isWeekend = dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday");
            
            if (isWeekend) {
                finalPrice = basePrice * 1.2; 
            } else {
                finalPrice = basePrice; 
            }

            if (isMember) {
                finalPrice *= 0.9; 
            }
        }

        return finalPrice;     
    }
     public static void main(String[] args) {
        TicketPricingService service = new TicketPricingService();
        System.out.println("Tre em + VIP + Chu Nhat: " + service.calculatePrice(10, "Sunday", true)); 
        System.out.println("Nguoi lon + Thu 3: " + service.calculatePrice(25, "Tuesday", false));
        System.out.println("Nguoi gia + VIP + Thu 7: " + service.calculatePrice(65, "Saturday", true));
     }
}
