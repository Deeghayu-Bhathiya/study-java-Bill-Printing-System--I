import java.util.*;
class Bill{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("================================================================================");
        	System.out.println(" _ _ _     _                               _          _   _  _                 ");
        	System.out.println("| | | |___| |___ ___ _____ ___    _ _ ___  |_|_____ ___| |_| || |                ");
        	System.out.println("| | | | -_| |  _| . |     | -_|  |  _| . | | |     | .'|  _|_||_|                ");
        	System.out.println("|_____|___|_|___|___|_|_|_|___|  |_| |___| |_|_|_|_|__,|_|  |_|  |_|            ");
        	System.out.println("                                                                                ");
        	System.out.println("================================================================================");
        	System.out.println("\n");

			System.out.print("Enter customer phone number: ");
			String phoneNumber = scanner.nextLine();
		
			System.out.print("Enter customer name: ");
			String customerName = scanner.nextLine();
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("================================================================================");
			System.out.println(" \n");
			System.out.print("Basmathi Qty(Kg) -   ");
			int basmathi =scanner.nextInt();
			System.out.print("dhal Qty(Kg)     -   ");
			int dhal = scanner.nextInt(); 
			System.out.print("Sugar Qty(Kg)	 -   ");
			int sugar = scanner.nextInt();
			System.out.print("Highland Qty(Kg) -   ");
			int highland = scanner.nextInt();
			System.out.print("yoghurt Qty(Kg)  -   ");
			int yoghurt =scanner.nextInt();
			System.out.print("Flour Qty(Kg)    -   ");
			int Flour = scanner.nextInt();
			System.out.print("Soap Qty(Kg)     -   ");
			int Soap = scanner.nextInt();
			 
			double basmathi_que	= 250.00;
			double dhal_que   	=180.00;
			double sugar_que	=150.00;
			double highland_que	=1200.00;
			double yoghurt_que	=120.00;
			double Flour_que	=120.00;
			double Soap_que     =160.00;
			double b_price  = basmathi * basmathi_que;
			double dh_price = dhal * dhal_que;
			double su_price = sugar * sugar_que;
			double hi_price = highland * highland_que;
			double yo_price = yoghurt * yoghurt_que;
			double fl_price = Flour * Flour_que;
			double so_price = Soap * Soap_que;
			
			System.out.println("+--------------------------------------------------------------+");
			System.out.println("|  _     __    __             __________ ______________        |");
			System.out.println("| ( )   |  \\  /  |     /\\     |   ___   \\_____    ____|        |");
			System.out.println("|  -    |  \\  /  |    /  \\    |  |___)   |    |  |             |");
			System.out.println("|  _    |  |\\/|  |   / /\\ \\   |          |    |  |   	       |");
			System.out.println("| | |   |  |  |  |  / /  \\ \\  |   __    /     |  |             |");
			System.out.println("| | |	|  |  |  | / /    \\ \\ |  |  \\   \\     |  |             |");
			System.out.println("| | |   |  |  |  |/  ______  \\|  |   \\   \\    |  |             |");
			System.out.println("| |_|   |_ |  |_ /__/      \\__\\__|    \\ __\\   |__|             |");
			System.out.println("|               225,Galle Road,panadura                        |");
			System.out.println("|                                                              |");
			System.out.println("|                                                              |");
			System.out.println("+--------------------------------------------------------------+");
			System.out.printf("|                  #Tel  :%37S|\n",phoneNumber);
			System.out.printf("|                  #Name :%37S|\n",customerName);
			System.out.println("+--------------------------------------------------------------+");
			System.out.println("|        |    qty      | unitprice   |  price                  |");
			System.out.println("+--------------------------------------------------------------+");
			System.out.printf("|basmathi| %11d | %11.2f | %23.2f |%n",  basmathi,basmathi_que, basmathi * basmathi_que);
			System.out.println("|        |             |             |                         |");
			System.out.printf("|dhal    | %11d | %11.2f | %23.2f |%n",  dhal, dhal_que, dhal * dhal_que);
			System.out.println("|        |             |             |                         |");
			System.out.printf("|sugar   | %11d | %11.2f | %23.2f |%n",  sugar , sugar_que,sugar * sugar_que);
			System.out.println("|        |             |             |                         |");
			System.out.printf("|highland| %11d | %11.2f | %23.2f |%n",  highland , highland_que,highland * highland_que);
			System.out.println("|        |             |             |                         |");
			System.out.printf("|yoghurt | %11d | %11.2f | %23.2f |%n",  yoghurt , yoghurt_que,yoghurt* yoghurt_que);
			System.out.println("|        |             |             |                         |");
			System.out.printf("| Flour  | %11d | %11.2f | %23.2f |%n",   Flour ,Flour_que,Flour* Flour_que);
			System.out.println("|        |             |             |                         |");
			System.out.printf("| Soap   | %11d | %11.2f | %23.2f |%n",  Soap ,Soap_que ,Soap* Soap_que );
			System.out.println("|        |             |             |                         |");
			System.out.println("+--------------------------------------------------------------+");
			System.out.printf("|                      | Total       | %23.2f |%n ",(b_price+dh_price +su_price+hi_price+yo_price+fl_price+so_price)  );
//			System.out.printf("| Soap   | %11d | %11.2f | %23.2f |%n",  Soap ,Soap_que ,Soap* Soap_que );
			
		
			

                         











		

		
		
		
		



	}
}
	
