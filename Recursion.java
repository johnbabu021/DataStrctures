public class Recursion {

    public void newFunction(int number) {

        if (number <= 1) {
            return;
        }

        newFunction(number - 1);
        System.out.println(number);
        newFunction(number - 1);

    }

    public static void main(String[] args) {

        Recursion newOne = new Recursion();
        newOne.newFunction(5);
    }

}
