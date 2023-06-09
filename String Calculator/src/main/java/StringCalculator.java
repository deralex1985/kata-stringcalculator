public class StringCalculator {

    public int add(String numbers){
        if (numbers == "") {
            return 0;
        }
        String[] numbersList = numbers.split("[,\n]");

        int sum = 0;
        for(String number: numbersList){
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
