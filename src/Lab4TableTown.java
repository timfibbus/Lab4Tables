import java.util.Scanner;

public class Lab4TableTown {

	public static void main(String[] args) {
		int j = 1;
		Scanner scan = new Scanner(System.in);
		String keepOn = "y";
		do {
			int i = 0;
			System.out.println("Please enter a number"); // this the intro.

			i = scan.nextInt();
			if (i == 0) {
				System.out.println("Gimme a break.");
				System.exit(0);
			}

			String number = "NUMBER";
			String square = "SQUARED";
			String cube = "CUBIFIED";

			System.out.printf("%10s   | %10s   | %10s\n", number, square, cube);  // is there a better way?
			System.out.println("==========================================");
			j=1;
			while (j <= i) {
				
				int k = j * j;
				int l = j * j * j;
				System.out.printf("%7d      |    %5d     | %7d\n", j, k, l);  // wacky
				j++;

				if (j <= i)
					continue;

				System.out.println("Would you like to keep on partying with exponents? (y/n)"); // recursive query
				keepOn = scan.next();

				if (keepOn.equalsIgnoreCase("y"))
					continue;


				System.out.println("\nWould you like to see a multiplication table "   
						+ "based on the value you have entered? (y/n)");             // here it comes
				keepOn = scan.next();
				
				if (keepOn.equalsIgnoreCase("y")) {
					int m = 1;
					for (m = 1; m <= i; m++) {                   // the first row
						System.out.printf("%5d", m);
						if (m <= i)
							continue;
					}
					System.out.println();
					System.out.print("       ");
					for (m=1;m<i;m++) {
						System.out.print("-----");             // formatting; pretty lines
					}
					int n = 2;

					while (n <= i) {                          // this was fun
						int o = 2;
						System.out.println();
						System.out.printf("%5d |  ", n);

						while (o <= i) {                     // multiplication table loop
							int p = (n * o);
							System.out.printf("%-5d", p);
							o += 1;
						}
						n += 1;
						o = n;
					}

					System.out.println();

					System.out.println("\nwanna do it all again? (y/n)");     // more recursion query
					keepOn = scan.next();
				}
			}
		} while (keepOn.equalsIgnoreCase("y"));

		System.out.printf("\n\n%40s", "Fare thee well.");             // it's all one big loop 
		scan.close();
	}

}
