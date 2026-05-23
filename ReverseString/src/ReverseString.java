import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ReverseString{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str=br.readLine();

        String str1="";
        String str2="";
        int strLength= str.length();
        String word="";
        String result="";

        for (int i=0; i<strLength; i++){
            char ch=str.charAt(i);

            if(ch != ' '){
                word=word + ch;
            }else{
                result= word+ ' ' +result;
                word="";
            }
        }

        result= word + ' ' + result;

        System.out.println(strLength);
        System.out.println(result);

    }
}