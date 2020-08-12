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

              // N?u arr[mid] = x.
              if (arr[mid] == x)
                return x;

              // N?u arr[mid] > x, th?c hi?n tìm ki?m n?a trái c?a m?ng
              if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

              // N?u arr[mid] < x, th?c hi?n tìm ki?m n?a ph?i c?a m?ng
              return binarySearch(arr, mid + 1, r, x);
            }

            // N?u không tìm th?y
            return 0;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr1={1,3,4,6,7,8,9,12,23,34,46,49,55,78,89,90,134,145,156};
        int[] arr2={9,13,15,19,20,30,34,39,46,49,59,65,78,95,167,200,346};
        array ob = new array();
        System.out.println("Các ph?n t? giao nhau:");
        for(int i=0;i<arr2.length;i++){
            int r=arr1.length;
            int result = ob.binarySearch(arr1,0,r-1,arr2[i]);
            if(result!=0){
                System.out.print(result+"    ");
            }            
        }      
    }
     
}
