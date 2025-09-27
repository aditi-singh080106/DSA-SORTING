import java.util.Scanner;
class Main {
        public static void print(int[] a){
            for(int i = 0 ; i < a.length ; i++){
               System.out.print(a[i]+"\t");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr = {1,32,3,0,42,4,6,93,9,-10};
         int n = arr.length;
         for(int i = 1 ; i < n ; i++ ){
             for(int j = i ; j > 0 ; j-- ){
                 if(arr[j]<arr[j-1]){
                     int temp = arr[j] ;
                     arr[j] = arr[j-1] ;
                     arr[j-1] = temp ;
                 }
                 else break ;
             }
         }
         print(arr);
    }
}
