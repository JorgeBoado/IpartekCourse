package UF2404.POJO;

import java.util.Random;

import static java.lang.System.arraycopy;

public class BoletoEuro {
    private final int[] numbers = new int[50];
    private final int[] stars = new int[12];

    /**
     * Create the Object BoletoEuro.
     */
    public BoletoEuro() {
        selectNumbers();
    }

    /**
     * Get the winner numbers.
     * @return Integer array with the 7 winner numbers.
     */
    public int[] getWinner(){
        int[] a = new int[7];
        arraycopy(this.getFiveNumbers(), 0, a, 0, this.getFiveNumbers().length);
        arraycopy(this.getTwoStars(), 0, a, 5, this.getTwoStars().length);
        return a;
    }

    /**
     * Fill both arrays with numbers.
     */
    private void selectNumbers() {
        fillArray(numbers);
        fillArray(stars);
    }

    /**
     * Fill the array that receive this the numbers equal her length and randomize it.
     * @param a Integer Array.
     */
    private void fillArray(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < a.length; i++) {
            int randomIndexToSwap = rand.nextInt(a.length);
            int temp = a[randomIndexToSwap];
            a[randomIndexToSwap] = a[i];
            a[i] = temp;
        }
    }

    /**
     * Get the first five numbers from the Array numbers.
     * @return Integer array with the five winner numbers.
     */
    private int[] getFiveNumbers() {
        int[] a = new int[5];
        arraycopy(this.getNumbers(), 0, a, 0, a.length);
        return a;
    }

    /**
     * Get the first two numbers from the Array stars.
     * @return Integer array with the two winner stars.
     */
    private int[] getTwoStars() {
        int[] a = new int[2];
        arraycopy(this.getStars(), 0, a, 0, a.length);
        return a;
    }

    private int[] getNumbers() {
        return numbers;
    }

    private int[] getStars() {
        return stars;
    }

}
