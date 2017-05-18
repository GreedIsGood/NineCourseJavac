import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator cal = new Calculator();
            String exit = "no";
			int	i = 1;
            while (!exit.equals("yes")) {
                System.out.println("Enter " + i + " integer; ");
				i++;
                String first = reader.next();
                System.out.println("Enter char; ");
                String ch = reader.next();
				char ch1 = ch.charAt(0);
                cal.setCharacter(ch1);
                System.out.println("Enter " + i + " integer; ");
				i++;
                String second = reader.next();
                cal.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Your result; " + cal.getResult());
				int result = cal.getResult();
				cal.cleanResult();
				System.out.println("Enter integer? yes/no");
				String exit2 = reader.next();
				while(!exit2.equals("no")){
					System.out.println("Enter char; ");
					ch = reader.next();
					ch1 = ch.charAt(0);
					cal.setCharacter(ch1);
					System.out.println("Enter " + i + " integer; ");
					String three = reader.next();
					i++;
					cal.add(Integer.valueOf(result), Integer.valueOf(three));
					System.out.println("Your result; " + cal.getResult());
					result = cal.getResult();
					cal.cleanResult();
					System.out.println("Enter integer? yes/no");
					exit2 = reader.next();
				}
				i = 1;
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}