import java.util.Scanner;
class Main {
    public static void print(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Enter the elements of array : ");
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        print(arr);
        // selection sort
        for(int i = 0 ; i < n -1; i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minidx=j;
                }
            }
            int temp = arr[i];
            arr[i] = min ; 
            arr[minidx]=temp;
        }
        print(arr);
        // System.out.println("Try programiz.pro");
    }
}
