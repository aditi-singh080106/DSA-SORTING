import java.util.Scanner;
class Main {
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        // bubble sort
        for(int i = 0 ;i < n-1;i++){
            for(int j = 0 ; j < n-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);
        // optimized bubble sort
        for(int i = 0 ; i < n-1;i++){
            boolean flag = true ;
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag) break;
        }
        print(arr);
    }
}
