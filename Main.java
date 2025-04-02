public class Main {
    public static void main(String[] args) {
        int doorCodeGuess = 5; // <---- Guess here 







        int correctDoorCode = 
        int hotValue = correctDoorCode +- 5;
        int warmValue = correctDoorCode +- 10;
        int coldValue = correctDoorCode +- 20;

        if(doorCodeGuess == correctDoorCode) {
            System.out.println("Correct! Door is unlocked!");
        } else if (doorCodeGuess <= hotValue) {
            System.out.println("Hot");
        } else if (doorCodeGuess <= warmValue) {
            System.out.println("Warm");
        } else if (doorCodeGuess <= coldValue) {
            System.out.println("Cold");
        } else {
            System.out.println("Not even close. Try again");
        }
        
    }
}

        