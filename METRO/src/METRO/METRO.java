package METRO;
import java.util.Scanner;
public class METRO {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter values");
		String registeredUsername = "";
        String registeredPassword = "";
        boolean isLoggedIn = false;
        float balance = 0;
        int totalTickets = 0;
        String From ="", Last ="";
        int Distance=0;
        int Fare=0;
        while(true)
        {
            System.out.println("enter options register/n1,login/n2,exit/n3");
            System.out.println("choose options");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice==1) {
            	System.out.println("enter username");
            	registeredUsername = scanner.nextLine();
            	System.out.println("enter password");
            	registeredPassword = scanner.nextLine();
            	System.out.println("registration successful");
            }
            else if(choice==2) {
            	System.out.print("enter username: ");
                String u=scanner.nextLine();
                System.out.print("enter password: ");
                String p=scanner.nextLine();
                if(u.equals(registeredUsername) && p.equals(registeredPassword)) {
                	isLoggedIn=true;
                	System.out.println("login successful");
                	while(isLoggedIn) {
                		System.out.println("enter options Recharge\n1,Book Tickects\n2,View Balance,Last Tickect\n3,Logout");
                		System.out.println("choose options");
                		int choose = scanner.nextInt();
                		scanner.nextLine();
                		if(choose==1) {
                			System.out.println("enter amount to recharge: ");
                			float amount = scanner.nextFloat();
                			scanner.nextLine();
                			System.out.println("Recharged Balance: Rs"+balance);	
                		}
                		else if(choose==2) {
                			String[] stations = {"A", "B", "C", "D", "E"};
                            System.out.println("Stations:");
                            for (int i = 0; i < stations.length; i++) {
                            	 System.out.println((i+1) + ". " + stations[i]);
                         }
                            System.out.println("How many tickects? ");
                            int n= scanner.nextInt();
                            for(int i=0; i<n;i++) {
                            	System.out.println("Source station (1-5): ");
                            	int src = scanner.nextInt() - 1;
                            	System.out.println("Destination station (1-5): ");
                            	int dst = scanner.nextInt() - 1;
                            	if (src < 0 || dst < 0 || src >= 5 || dst >= 5 || src == dst) {
                                    System.out.println("Invalid station");
                                    continue;
                            	}
                            	int dist = Math.abs(dst - src);
                                int fare = 0;
                                if (dist == 1) fare = 10;
                                else if (dist == 2) fare = 15;
                                else if (dist == 3) fare = 20;
                                else if (dist == 4) fare = 25;
                                else if (dist == 5) fare = 30;
                                else fare = 35;
                                if (balance >= fare) {
                                    balance -= fare;
                                    totalTickets++;
                                    From = scanner.next();
                                    Last = scanner.next();
                                    Distance = dist;
                                    Fare = fare;
                                    System.out.println("Ticket booked: " + From + " -> " + Last + ", Rs" + fare);
                                }
                                else 
                                {
                                    System.out.println("Not enough balance");
                                    System.out.print("Book more tickets? (yes/no): ");
                                    String again = scanner.next();
                                    if (again.equalsIgnoreCase("yes")) {
                                        continue;
                                    }

                                else if (choose == 3) {
                                    System.out.println("Balance: ₹" + balance);
                                    System.out.println("Total tickets: " + totalTickets);
                                }

                                else if (choose == 4) {
                                    if (!From.equals("")) {
                                        System.out.println("Last Ticket: " + From + " -> "+ Last);
                                        System.out.println("Distance: " + Distance + ", Fare: Rs"+ Last);
                                    } 
                               else {
                                        System.out.println("No tickets booked yet.");
                                    }
                                }

                                else if (choose== 5) {
                                    isLoggedIn = false;
                                    System.out.println("Logged out.\n");
                                }

                                else {
                                    System.out.println("Invalid option.");
                                }
                            }
                		}
                	}
                	        
                    else if (choice == 3) {
                        System.out.println("Exiting.");
                        break;
                    } else {
                        System.out.println("Invalid input.");
                    }
                }

                scanner.close();
        	}
        	}
           }  
         }
                           
}
             
                			
                	
            


	
	
	
      
