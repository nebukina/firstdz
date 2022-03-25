public class ONEdz {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
         System.out.println("orange");
         System.out.println("banana");
         System.out.println("apple");
    }
    public static void checkSumSign(){
         int a = 15;
         int b = 20;
         if ((a+b)>=0){
            System.out.println("Сумма положительна");
         } else {
            System.out.println("Сумма отрицательна");
         }
    }
    private static void printColor(){
        int value = 15;
        if (value<=0){
            System.out.println("red");
        } else if (value > 0 && value <= 100){
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }
    private static void compareNumbers(){
        int a = 25;
        int b = 50;
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
            }
    }
}


