import java.util.Scanner;


public class Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myIntArray = new int[n];
        for(int i=0;i<myIntArray.length;i++){
            myIntArray[i] = scan.nextInt();
        }
        OutPutArray(myIntArray);
        for (int i=0;i<myIntArray.length;i++){
            Switch(myIntArray,i,FindMin(myIntArray,i));
        }
        OutPutArray(myIntArray);
    }
    static void Switch(int[] A,int pos1,int pos2){
        int sub;
        sub=A[pos1];
        A[pos1]=A[pos2];
        A[pos2]=sub;
    }
    static int FindMin(int[] A,int from){
        int minpos=from;
        for(int i=from+1;i<A.length;i++){
            if (A[minpos]>A[i]){
                minpos=i;
            }
        }
        return minpos;
    }
    static void OutPutArray(int[] A){
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
