/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

import java.util.Scanner;


public class calculation {

	public static void main(String[] args) {
		int var1;
		int var2;
		String choose;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Add meg az első számot:");
		var1 = input.nextInt();
		System.out.println("Add meg a második számot:");
		var2 = input.nextInt();
       
   	   System.out.println("Válsztható műveletek: 1: Összeadás, 2: kivonás, 3: szorzás,  4: osztás, kilépéshez nyomd meg a 0-t.");
    	do {
	       choose = input.next();
    	try {
    		int temp = Integer.parseInt(choose);
    		switch (temp){
            case 1:
                System.out.println(add(var1,var2));
                break;
            case 2:
                System.out.println(sub(var1,var2));
                break;      
            case 3:
                System.out.println(mult(var1,var2));
                break;
            case 4:
            	System.out.println(div(var1,var2));
             		
             case 0:
            	System.exit(0);
            	 break;
             default: System.out.println("nem annyira jó input");
            }
		} 
    	
    	catch (NumberFormatException e) {
    		System.out.println("ejjj..ez nem volt annyira jo valasztas");
    	}
    	catch (Exception e) {
			System.out.println("Ne osszunk már nullával");
			//e.printStackTrace();
		}   	
	       	   	
    	
       } while (true);	
	
}

	private static int div(int var1, int var2) {
		int result = var1/var2;
		System.out.println("Az osztás eredménye");
		return result;
	}

	private static int mult(int var1, int var2) {
		int result = var1*var2;
		System.out.println("A szorzás eredménye");
		return result;
	}

	private static int sub(int var1, int var2) {
		int result = var1-var2;
		System.out.println("A kivonás eredménye:");
		return result;
	}

	private static int add(int var1, int var2) {
		int result = var1+var2;
		System.out.println("Az összeadás eredménye:");	
		return result;
	
	}			
	
}
