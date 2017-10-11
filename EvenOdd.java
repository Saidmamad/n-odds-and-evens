// ##########################################
// #                                        #
// #  Problem: Find N odds & evens          #
// #  Author: Saidmamad Gulomshoev          #
// #                                        #
// ##########################################   
class EvenOdd{
    public static void main(String[] args){
        
        String odds= "";
        String evens = "";
        int countOdds=0;
        int countEvens = 0;
        int n= 20; // number of odds and evens
        int startPoint = 2;
        for(int i=startPoint; ;i++){
            
            if(countEvens == n && countOdds == n){
                break;
            }

            if(i%2 == 0){ 
                
                if(countEvens < n-1)
                    evens+=i+", ";
                else
                    evens+=i; //to skip putting a commma at the end

                countEvens ++;
            }
            else {
                if(countOdds < n-1)
                    odds+=i+", ";
                else
                    odds+=i; //to skip putting a commma at the end
                
                countOdds++;    
            }
                
            
        }

        System.out.println("\nNumber of even numbers: "+countEvens);
        System.out.println("Even numbers: "+ evens);
        System.out.println();

        System.out.println("\nNumber of odd numbers: "+countOdds);
        System.out.println("Odd numbers:  "+ odds);
    }
}
