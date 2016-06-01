/**
 * Created by Usuario on 31/05/2016.
 */
public class FizzBuzz {

    public String getFizzBuzzResult(int numberToCheck){
        if((numberToCheck % 3) ==0){
            return "Fizz";
        }else {
            return String.valueOf(numberToCheck);
        }
    }


}
