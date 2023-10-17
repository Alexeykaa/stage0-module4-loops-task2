package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        System.out.println(result);
        for (int i = 1; i <= printToInclusive; i++) {
            result = result * i;
            System.out.println(result);
        }
    }
}
