package arrays;

public class MultipleRightRotationOfArray {

    static int[][] rightRotateByKtimes(int[] a , int[] k){
        int n = a.length;
        int m = k.length;

        int[][] ans = new int[m][n];
        int[] temp = new int[2*n];

        for(int i=0; i<n; i++){
            temp[i] = a[i];
            temp[i+n] = a[i];
        }
        for (int i = 0; i < m; i++) {
            // Calculate the effective right rotation offset
            int offset = (n - (k[i] % n)) % n;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j + offset];
            }
        }
        return ans;
    }
    private static void printArray(int[] a) {
        for(int e: a){
            System.out.print(e+" ");
        }
    }


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] k = {2,3};  //No Of Times Rotation to left
        int[][] answer = rightRotateByKtimes(a,k);

        for(int e[] : answer){
            printArray(e);
            System.out.println();
        }
    }




}
