public class back {
    public static int[] twonumSum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; i < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] { array[i], array[j] };
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = { 6, 5, 7, 9, 4, ,11, 0, 2, 1 };
        int target = 10;
        int[] result = twonumSum(array, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
