import java.util.Scanner;

class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int product = 1;
		
		boolean isPrime;
		while (num != -1){
			isPrime = true;
			if (num == 2 || num == 3) {
		
			product = num * product;	
			}
		
		    if (num > 3) {
				int i =2;
				while (i*i < num) {
					if (num % i == 0) {
						isPrime = false;
						
						break;
					}
					i = i + 1;
				}
			}
		    if (isPrime == true) {
				product = num * product;
				num = scanner.nextInt();
			} else {
				num = scanner.nextInt();
			}	
		}
	
	System.out.println("Product: " + product);
	}
}