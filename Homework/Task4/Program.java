import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selectMenu;
		int sizeArrey = 0;
		int i = 0;
		int index;
		int z;
		int y;
		int arrey[] = new int[10];
		
		while(true){
			System.out.println("MENU:");
		    System.out.println("1. Arrey Size");
		    System.out.println("2. Add element to begin");
		    System.out.println("3. Add element to end");
		    System.out.println("4. Show Arrey");
		    System.out.println("5. Exit");
            
			selectMenu = scanner.nextInt();
			
			switch (selectMenu){
				
			case 1: {
					System.out.print("Size arrey: ");
					sizeArrey = scanner.nextInt();
			} break;
				
			case 2: {
					for ( i = 0; i < sizeArrey; i++) {
						System.out.print("Index" + i + ": ");
						arrey[i] = scanner.nextInt();
					}
			} break; 
				
			case 3: {
					 for (i= 0 ; i < sizeArrey; i++) {
					   index = sizeArrey - i-1;
					   System.out.print("Index" + index + ": ");
					   z = scanner.nextInt();
					   y = 0;
					   
					       for (y = 0; y < sizeArrey - i; y++){
							   arrey[y] = z;
							   }
							   
							   
						
						   
					}
		    } break;
				
			case 4: {
					for ( i = 0; i < sizeArrey; i++) {
					System.out.print(arrey[i] + " ");
		            }
			} break;
				            
			case 5: {
					System.exit(0);
				} 
			}
			}
		}
		}

