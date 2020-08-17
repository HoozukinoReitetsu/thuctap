/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TienTho
 */
public class array {
int binarySearch(int arr[], int l, int r, int x) {
            if (r >= l) {
              int mid = l + (r - l) / 2; 

              // Nếu arr[mid] = x.
              if (arr[mid] == x)
                return x;

              // Nếu arr[mid] > x, thực hiện tìm kiếm nửa trái của mang
              if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

              // Nếu arr[mid] < x, thực hiện tìm kiếm nửa phải của mảng
              return binarySearch(arr, mid + 1, r, x);
            }

            // Nếu không tìm thấy
            return 0;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] arr1={1,3,4,6,7,8,9,12,23,34,46,49,55,78,89,90,134,145,156};
        int[] arr2={9,13,15,19,20,30,34,39,46,49,59,65,78,95,167,200,346};
        array ob = new array();
        System.out.println("Các phần tử giao nhau:");
        for(int i=0;i<arr2.length;i++){
            int r=arr1.length;
            int result = ob.binarySearch(arr1,0,r-1,arr2[i]);
            if(result!=0){
                System.out.print(result+"    ");
            }            
        }      
    }
     
}
