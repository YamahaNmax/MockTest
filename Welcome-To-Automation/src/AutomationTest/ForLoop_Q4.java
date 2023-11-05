package AutomationTest;

public class ForLoop_Q4 {

    public static void printMyName(String name, int howManyTimes){
        for(int i = 0; i < howManyTimes; i++) {
            System.out.println(i+1 + ". " + name);
        }
    }

    public static void main(String[] args) {
        printMyName("Miten", 10);
        printMyName("Bhavesh", 15);
    }
}
