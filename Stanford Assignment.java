import java.util.*;
public class Assignment{

    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sequenceOfNumbers = scan.nextInt();
        int array[] = new int[sequenceOfNumbers];
 
        for(int i = 0;i<sequenceOfNumbers;i++){
            array[i] = scan.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
 
        for(int i = 0;i<sequenceOfNumbers;i++) {
            if( array[i] % 2 == 0 ){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int oddRemainder = oddCount%4;
        int evenRemainder = evenCount%2;             
        if(oddRemainder == 3 || oddRemainder == 0|| (evenRemainder == 1 && oddRemainder == 1)){
            System.out.println("Alice Win");
            }else{
            System.out.println("Bob Win");
        }
    }
}
