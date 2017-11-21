package bytecode;

public class ComputeFactorial {
	public int age;
	public String name;
	
  /** Main method */
  public static void main(String[] args) {
    System.out.println("Factorial of 5 is " + fact(5));
  }

  /** Return the factorial for a specified number */
  public static long fact(int n) {
    if (n == 0) // Base case
      return 1;
    else
      return n * fact(n - 1); // Recursive call
  }
}
