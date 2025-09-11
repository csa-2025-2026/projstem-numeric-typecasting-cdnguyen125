public class Problem3
{
  public static void main(String[] args)
  {
    double x = 12345.67890;
    double last3 = x*1000;
    int intx = (int)last3; // 12345678

    System.out.println("first three decimal digits of " + x + " are: " + ((intx/100) % 10) + " " + ((intx/10) % 10) + " " + (intx % 10));
    // sol. 1 (amy's version) - less precise (w/o flags)

    int lastDigit = intx % 10;
    intx /= 10; 
    int secondlastDigit = intx % 10;
    intx /= 10;
    int thirdlastDigit = intx % 10;

    System.out.printf("\nfirst three decimal digits of %5.5f are %d %d %d\n", x, thirdlastDigit, secondlastDigit, lastDigit);
    // sol. 2 (christian's version)


  }
}
