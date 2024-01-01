public class Question_24 {
    public static void main(String[] args) {

        for (int n = 1; n <= 50; n++) {
            if (n %3 == 0) {
                continue;
            }
            System.out.println(n);
        }
    }
}
