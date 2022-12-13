package hu.nive.ujratervezes.addaverage;

public class AddAverage {

    public int[] addAverage(int[] numbers, int n) {
        int average = 0;
        for (int number : numbers){
            average += number;
        }

        average = average / numbers.length;

        for(int i = n - 1; i< numbers.length;){
            int tmp = numbers[i];
            numbers[i] = tmp+average;
            i = i + n;
        }

        return numbers;
    }

    public static void main(String[] args) {
    }
}
