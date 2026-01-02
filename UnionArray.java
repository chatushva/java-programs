import java.util.*;

class Union {

    public static ArrayList<Integer> union(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                adds(result, a[i]);
                i++;
            } 
            else if (a[i] > b[j]) {
                adds(result, b[j]);
                j++;
            } 
            else {
                adds(result, a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            adds(result, a[i]);
            i++;
        }

        while (j < b.length) {
            adds(result, b[j]);
            j++;
        }

        return result;
    }

    public static void adds(ArrayList<Integer> list, int value) {
        if (list.size() == 0 || list.get(list.size() - 1) != value) {
            list.add(value);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter elements of array A (sorted):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of array B (sorted):");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Union: " + union(a, b));
    }
}
