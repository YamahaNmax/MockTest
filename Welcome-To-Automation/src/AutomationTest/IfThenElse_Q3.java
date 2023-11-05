package AutomationTest;

public class IfThenElse_Q3 {

    public boolean isTeen(int age) {
        return age <= 18;
    }

    public static void main(String[] args) {
        IfThenElse_Q3 obj = new IfThenElse_Q3();
        System.out.println("15 - " + obj.isTeen(15));
        System.out.println("25 - " + obj.isTeen(25));
    }
}
