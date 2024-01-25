import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] agePercent = {10, 20, 30, 25, 15};

        int[] ageGaps = {20, 21, 22, 23, 24, 25, 26};

        int[] ranAges = raffleAges(agePercent, ageGaps, 1000);

        System.out.println("Arvotut ikäarvot: " + Arrays.toString(ranAges));
    }

    private static int[] raffleAges(int[] gap, int[] ageClasses, int sum) {
        int[] raffledAges = new int[sum];
        Random random = new Random();

        for (int i = 0; i < sum; i++) {
            int ageClass = raffleAgeClass(gap, random.nextInt(100));

            int low = ageClasses[ageClass];
            int high = ageClasses[ageClass + 1] - 1;
            raffledAges[i] = random.nextInt(high - low + 1) + low;
        }
        return raffledAges;
    }

    private static int raffleAgeClass(int[] gap, int ran) {
        int sum = 0;

        for (int i = 0; i < gap.length; i++) {
            sum += gap[i];

            if (ran < sum) {
                return i;
            }
        }

        return gap.length - 1;
    }
}