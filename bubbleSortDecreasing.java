class Main {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // sort in decreaseing order
        for(int i = 0 ; i < arr.length-1 ; i++ ){
            boolean flag = true ;
            for(int j = 0 ; j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                    flag=false;
                }
            }
            if(flag) break;
        }
        print(arr);
    }
}
