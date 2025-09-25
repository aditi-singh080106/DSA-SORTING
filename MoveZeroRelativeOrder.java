// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr = {1,0,3,0,0,4,6,0,9,0};
        int i = 0 , j = 0;
        // i -> track zero
        // j -> track first non zero and swaps
        while(j<arr.length){
            if(arr[i]!=0) i++;
            else if(arr[j]!=0 && arr[i]==0){
                arr[i++]=arr[j];
                arr[j]=0;
            }
            j++;
        }
        
        print(arr);
    }
}
