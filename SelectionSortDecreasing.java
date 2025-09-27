// Online Java Compiler
// Use this editor to write, compile and run your Java code online

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
         int n =arr.length;
        //  arrange in decreasing order
        // Use Selection sort
        for(int i = 0 ; i < n-1 ; i++ ){
            int max = Integer.MIN_VALUE ;
            int maxidx = -1 ;
            for(int j = i ; j< n ; j++ ){
                if(arr[j]>max){
                    max=arr[j];
                    maxidx=j;
                }
            }
            int temp = arr[i];
            arr[i] = max ;
            arr[maxidx] = temp;
        }
        print(arr);
    }
}
