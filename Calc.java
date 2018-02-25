public class Calc{
	public static void main(String[] arg) {
		System.out.println("Calc");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		System.out.println("Summ = " + sum);
	}
}