import java.util.*;
public class assign{

    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int SequenceOfNumbers = scan.nextInt();
        int array[]=new int[SequenceOfNumbers];
 
        for(int i=0;i<SequenceOfNumbers;i++){
            array[i] = scan.nextInt();
        }
        int EvenCount=0,OddCount=0;
 
        for(int i=0;i<SequenceOfNumbers;i++) {
            if( array[i] % 2 == 0 ){
                EvenCount++;
            } else {
                OddCount++;
            }
        }
        int OddPercentile=c2%4;
        int EvenPercentile=c1%2;             
        if(OddPercentile ==3|| OddPercentile==0||(EvenPercentile==1 && EvenPercentile==1)){
            System.out.println("Alice Win");
            }else{
            System.out.println("Bob Win");
       }
    }
}
