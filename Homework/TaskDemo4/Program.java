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
		    System.out.println("4. Sorting by increase");
		    System.out.println("5.");
		    System.out.println("6. Show Arrey");
		    System.out.println("7. Exit");
            
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
			System.out.println("Entering the cycle of comparisons(1)");
				     for(i = 0; i == sizeArrey; i++) {
						 
						 System.out.println("Entry to the displacement cycle(2) i: " + i + "__");
						 for(y = i + 1; y == sizeArrey; ) {
						      if(arrey[i] > arrey[y]){
						      z = arrey[i]; 
						      arrey[i] = arrey[y];
						      arrey[y] = z;
							  System.out.println("move");
					          }  else {
								  y++;
								  System.out.println("Y:_" + y+ "_");
							  }
					   } 
					   System.out.println("I:_" + i + "_");
					 }
			} break;
						
			case 6: {
					for ( i = 0; i < sizeArrey; i++) {
					System.out.print(arrey[i] + " ");
		            }
			} break;
				            
			case 7: {
					System.exit(0);
				} 
			}
			}
		}
		}

