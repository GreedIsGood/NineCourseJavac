public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate");
		String result = " Result ";
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		System.out.println(result + " multiplication " + (first * second) + result + " division " + (first + second) + result + " difference " + (first - second) + result + " sum " + (first + second));
	}
}