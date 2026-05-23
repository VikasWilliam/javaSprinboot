import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class IfElse {

    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num1;
        int num2;
        int num3;
        while(true) {
            System.out.println("Enter first number");
            num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter second number");
            num2 = Integer.parseInt(br.readLine());
            System.out.println("Enter third number");
            num3 = Integer.parseInt(br.readLine());

            if (num1 == num2 && num2 == num3) {
                System.out.println("Please enter diff numbers");
            }else{
                break;
            }

        }

        if(num1> num2 && num1>num3){
            System.out.println("Largest Num is num1 => "+num1);
        }else if((num2>num1) && (num2>num3)){
            System.out.println("Largest Num is num2=> " +num2 );
        }else {
            System.out.println("Largest Num is num3=> " +num3);
        }



    }
}
