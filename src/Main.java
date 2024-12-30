//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int CountOfMatches = 0;
        int SumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            if ((loopNumber % 3 == 0) && (loopNumber % 5 ==0)){
                CountOfMatches++;
                SumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }

            if (CountOfMatches == 5){
                break;
            }
        }

        System.out.println("Sum = " + SumOfMatches);
    }
}