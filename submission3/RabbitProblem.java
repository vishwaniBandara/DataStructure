public class RabbitProblem {

    static int rabbits(int n) {
        if (n == 0 || n == 1)
            return 1;
        return rabbits(n - 1) + rabbits(n - 2);
    }

    public static void main(String[] args) {
        int months = 6;

        System.out.println("Rabbit count after " + months + " months:");
        for (int i = 0; i < months; i++) {
            System.out.print(rabbits(i) + " ");
        }
    }
}

