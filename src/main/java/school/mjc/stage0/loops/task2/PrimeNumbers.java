package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int currentNumber = 2;

        while (currentNumber <= printToInclusive) {
            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }


    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

  }
