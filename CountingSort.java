public class CountingSort {

    public static int max(int[] arr){
        int max=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public static void counting_sort(int[] arr) {
        int n = arr.length; 
        int size=max(arr)+1;
        if(size<n) size=n;
        int output[] = new int[n]; 
        int count[] = new int[size]; 
        for (int i = 0; i <n; ++i) count[i] = 0; 
       //đếm số lần xuất hiện của các phần tử khác nhau
        for (int i = 0; i < n; ++i) count[arr[i]]++; 
        //tính tổng số lần xuất hiện của các phần tử trước nó
        for (int i = 1; i <size; ++i) count[i] += count[i - 1]; 
        //sắp xếp các phần tử
        for (int i = n - 1; i >= 0; i--) { 
            output[count[arr[i]] - 1] = arr[i]; 
            count[arr[i]]--; 
        } 
        for (int i = 0; i < n; ++i) 
            arr[i] = output[i]; 
    }

    public static void main(String[] args) {
        int input[] = { 1, 5, 2, 7, 4, 4, 1, 5,0,0,0,14,12,19};
        counting_sort(input);
        System.out.println("Sorted Array : ");
        for (int i = 0; i < input.length; i++) System.out.print(input[i]+" ");

    }
}
