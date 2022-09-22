public class Main {
    public static void main(String[] args)
    {
        int birthMonth = 13;

        if (birthMonth  > 12 || birthMonth < 1)
        {
            System.out.println("You entered an incorrect birth value " + birthMonth);

        }
        else
        {
            System.out.println("Your birth month is: " + birthMonth);
        }


    }
}