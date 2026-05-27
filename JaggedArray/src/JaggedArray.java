import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class JaggedArray{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of two dimensional array");
        System.out.println("Enter the nos of rows");
        int x=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns");
        int y=Integer.parseInt(br.readLine());

        int[][] a=new int[x][y];

        System.out.println("Enter the values in the array");
        for(int i=0 ; i<x; i++){
            for(int j=0;j<y;j++){
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }

        System.out.println("the array is as below");

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }


    }
}