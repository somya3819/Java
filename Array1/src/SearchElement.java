//search the given element x in the array. if present then return the index else return -1
class find {
    int search() {
        int[] arr = {1, 5, 3};
        int x = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== x) {
                return i;
            }
        }
        return -1;
    }
}

public class SearchElement {
            public static void main(String[] args) {
                find a = new find();
int result = a.search();
                System.out.println(result);
            }
        }