import java.util.Arrays;

public class sortByFourTest {

  public static void sortByFour(int[] arr) {
    // Define variables.
    int[] sorted = new int[arr.length];
    int location = 0;

    // Cloning the arr array in order to prevent aliasing.
    for (int i = 0; i < arr.length; i++) {
      sorted[i] = arr[i];
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 0) {
        arr[location++] = sorted[i];
      }
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 1) {
        arr[location++] = sorted[i];
      }
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 2) {
        arr[location++] = sorted[i];
      }
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 3) {
        arr[location++] = sorted[i];
      }
    }
  }

  public static void main(String[] args) {
    int[] numbers = {
      1,2,3,4,5,6,7,8,9,10,11,12,13,14,20,24,25,28,32,
    };

    sortByFour(numbers);
    System.out.print(Arrays.toString(numbers));
  }
}
