public class SearchPositionInArray {
    public static int findFirstOccurrence(int[] A, int x) {
        int left = 0;
        int right = A.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;

          //nếu tìm thấy phần tử.tiếp tục tìm phía bên trái để tìm phần tử đầu tiên
            if (x == A[mid]) {
                result = mid;
                right = mid - 1;
            }
            else if (x < A[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        // return -1 nếu không tìm thấy
        return result;
    }
    public static int findLastOccurrence(int[] A, int x)
	{

		int left = 0;
		int right = A.length - 1;
		int result = -1;
		while (left <= right)
		{
			int mid = (left + right) / 2;
             //nếu tìm thấy phần tử.tiếp tục tìm phía bên phải để tìm phần tử cuối cùng
			if (x == A[mid]) {
				result = mid;
				left = mid + 1;
			}
			else if (x < A[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return result;
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] A = { 5,6,7,8,8,15};
        int target  = 8;

        int index1 = findFirstOccurrence(A, target );
        int index2 = findLastOccurrence(A, target );
        if (index1 != -1 && index2!=-1) {
            if(index1!=index2) System.out.println("["+index1+','+index2+"]");
            else System.out.println(index1);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}