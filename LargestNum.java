public class LargestNum {
    public static void main(String args[]){
        System.out.println("This program is a demo to find the largest number in an array");

        int[] arr={4,5,10,55,103,99,8};
        int highest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(highest<arr[i]){
                highest=arr[i];
            }
        }
        System.out.println(highest);
    }
}
