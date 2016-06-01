/**
 * Created by Usuario on 31/05/2016.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzzGenerator = new FizzBuzz();
        for (int x = 1 ; x <= 100 ;x ++){
            System.out.println(fizzBuzzGenerator.getFizzBuzzResult(x));
        }
    }

    public String getFizzBuzzResult(int numberToCheck){
        if((numberToCheck % 5) ==0 && (numberToCheck % 3) ==0){
            return "FizzBuzz";
        }else if((numberToCheck % 5) ==0){
            return "Buzz";
        } else
        if((numberToCheck % 3) ==0){
            return "Fizz";
        }else {
            return String.valueOf(numberToCheck);
        }
    }


}
