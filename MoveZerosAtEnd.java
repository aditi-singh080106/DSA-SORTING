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
        int i = 0 , j = arr.length-1;
        while(i<j){
            if(arr[i]!=0) i++;
            else {
                arr[i] = arr[j];
                arr[j--] = 0 ;
            }
        }
        
        print(arr);
    }
}
