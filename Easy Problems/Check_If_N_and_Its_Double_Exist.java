public class Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        // problem statement
        // Given an array arr of integers, check if there exist two indices i and j such
        // that :

        // i != j
        // 0 <= i, j < arr.length
        // arr[i] == 2 * arr[j]

        int[] arr = { 2, 5, 3, 4 };
        boolean bol = checkIfExist(arr);
        System.out.println(bol);

    }

    public static boolean checkIfExist(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && arr[i] == 2 * arr[j])
                    return true;
            }
        }
        return false;
    }
}
