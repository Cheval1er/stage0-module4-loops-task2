package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        long factorial = 1;

        while (i <= printToInclusive) {
            if (i == 0) {
                System.out.println(factorial);
            } else {
                factorial *= i;
                System.out.println(factorial);
            }
            i++;
        }
    }

}