import java.util.*;
public class Assignment{

    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Sequenceofnumbers = scan.nextInt();
        int array[]=new int[Sequenceofnumbers];
 
        for(int i=0;i<Sequenceofnumbers;i++){
            array[i] = scan.nextInt();
        }
        int evenCount = 0;
        int oddEvent = 0;
 
        for(int i=0;i<Sequenceofnumbers;i++) {
            if( array[i] % 2 == 0 ){
                evenCount++;
            } else {
                oddEvent++;
            }
        }
        int oddRemainder=c2%4;
        int evenRemainder=c1%2;             
        if(oddRemainder ==3|| oddRemainder==0||(evenRemainder==1 && evenRemainder==1)){
            System.out.println("Alice Win");
            }else{
            System.out.println("Bob Win");
       }
    }
}
