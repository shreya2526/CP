import java.util.ArrayList;

public class easy13 {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> result = commonElements(A, B, C, A.length, B.length, C.length);

        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                result.add(A[i]);

                // Move all pointers to the next distinct element
                while (i < n1 - 1 && A[i] == A[i + 1]) 
                    i++;
                while (j < n2 - 1 && B[j] == B[j + 1]) 
                    j++;
                while (k < n3 - 1 && C[k] == C[k + 1]) 
                    k++;

                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

        return result;
    }
}
