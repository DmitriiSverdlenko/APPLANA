public class Array {
    public static void main(String[] args) {
        int[] numeric = new int[]{1, 2, 3, 4, 5};
        int first = numeric[0];
        int last = numeric[numeric.length - 1];
        numeric[0] = last;
        numeric[numeric.length - 1] = first;
        System.out.println(numeric[0] + numeric[numeric.length - 3]);
    }
}
