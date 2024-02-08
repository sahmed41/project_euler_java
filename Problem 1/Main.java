public class Main {
    public static void main(String[] args) {
        System.out.println(multiple_3_5_sum(1000));
    }

    static int multiple_3_5_sum(int target) {
        int total = 0;
        for (int i = 3; i < target; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                total += i;
            }
        }
        return total;
    }
}