package school.mjc.stage0.loops.task2;

import static java.lang.Math.abs;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        // because an incorrect task description and unit tests
        if (multiplyByAndToInclusive != 0) {
            int i = 0;
            while (i <= abs(multiplyByAndToInclusive)) {
                System.out.println(multiplyByAndToInclusive * i++);
            }
        }
    }
}
