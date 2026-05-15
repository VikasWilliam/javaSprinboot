import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SumOfTwoNum{

     int add(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first Number");
        int num=Integer.parseInt(br.readLine());

        System.out.println(("Enter Second Number"));
        int num2=Integer.parseInt(br.readLine());

        SumOfTwoNum obj=new SumOfTwoNum();
        int sum=obj.add(num,num2);
        System.out.println("The total Sum is=> " +sum );
    }
}