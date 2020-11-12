import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public static final int add(String numbers){

        if(numbers.isEmpty()) return 0;

        Pattern pattern = Pattern.compile("(/{2}.\\n)");
        Matcher matcher = pattern.matcher(numbers);

        String delimiter = ",|\n";
        if(matcher.find()){
            String delimiterString = matcher.group(1);
            delimiter = delimiterString.substring(2,3);
            numbers = numbers.substring(4);
        }

        int runningTotal = 0;
        String[] numbersArray = numbers.split(delimiter);

        for(String number : numbersArray){
            
            int nextNum = Integer.parseInt(number);
            if(nextNum <0)
            throw new RuntimeException("Negatives not allowed" + nextNum);
            
            if(nextNum <= 1000)
            runningTotal += nextNum;
            
        }

        return runningTotal;
    }
}