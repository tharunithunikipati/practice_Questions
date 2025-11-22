package metro;
import java.util.Scanner;



public class metro {
   public metro() {
   } 
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter values");
      String registereduser = "";
      String registeredpass = "";
      String lastFrom = "";
      String lastTo = "";
      int lastDistance = 0;
      int lastFare = 0;
      double balance = 0.0;
      int totalTickets = 0;
      boolean isLoggedIn = false;
      while(true) {
         label107:
         while(true) {
            System.out.println("enter options register/n1,login/n2,exit");
            System.out.println("choose options");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
               System.out.println("enter user name");
               registereduser = scanner.nextLine();
               System.out.println("enter password");
               registeredpass = scanner.nextLine();
               System.out.println("registration successful");
            } else if (choice != 2) {
               if (choice == 3) {
                  System.out.println("Exiting...");
                  scanner.close();
                  return;      
               }
               System.out.println("Invalid input.");
            } else {
               System.out.println("enter user name");
               String u = scanner.nextLine();
               System.out.println("enter passs");
               String p = scanner.nextLine();
               if (u.equals(registereduser) && p.equals(registeredpass)) {
               }
               isLoggedIn = true;
               System.out.println("login successful/n");
               while(true) {
                  while(true) {
                     if (!isLoggedIn) {
                        continue label107;
                     }
                     System.out.println("1. Recharge\n  2. Book Tickets\n 3. View Balance\n 4. Last Ticket\n  5. Logout");
                     System.out.print("Enter choice: ");
                     int op = scanner.nextInt();
                     scanner.nextLine();
                     if (op == 1) {
                        System.out.print("Enter amount to recharge: ");
                        double amt = scanner.nextDouble();
                        scanner.nextLine();
                        balance += amt;
                        System.out.println("Recharged. Balance: ₹" + balance);
                     } else if (op != 2) {
                        if (op == 3) {
                           System.out.println("Balance: ₹" + balance);
                           System.out.println("Total tickets: " + totalTickets);
                        } else if (op == 4) {
                           if (!lastFrom.equals("")) {
                              System.out.println("Last Ticket: " + lastFrom + " -> " + lastTo);
                              System.out.println("Distance: " + lastDistance + ", Fare: ₹" + lastFare);
                           } else {
                              System.out.println("No tickets booked yet.");
                           }
                        } else if (op == 5) {
                           isLoggedIn = false;
                           System.out.println("Logged out.\n");
                        } else {
                           System.out.println("Invalid option.");
                        }
                     } else {
                        String[] stations = new String[]{"A", "B", "C", "D", "E"};
                        System.out.println("Stations:");

                        int n;
                        for(n = 0; n < stations.length; ++n) {
                           System.out.println(n + 1 + ". " + stations[n]);
                        }

                        System.out.print("How many tickets? ");
                        n = scanner.nextInt();

                        for(int i = 0; i < n; ++i) {
                           System.out.print("Source station (1-5): ");
                           int src = scanner.nextInt() - 1;
                           System.out.print("Destination station (1-5): ");
                           int dst = scanner.nextInt() - 1;
                           if (src >= 0 && dst >= 0 && src < 5 && dst < 5 && src != dst) {
                              int dist = Math.abs(dst - src);
                              int fare = false;
                              byte fare;
                              if (dist == 1) {
                                 fare = 10;
                              } else if (dist == 2) {
                                 fare = 15;
                              } else if (dist == 3) {
                                 fare = 20;
                              } else if (dist == 4) {
                                 fare = 25;
                              } else if (dist == 5) {
                                 fare = 30;
                              } else {
                                 fare = 35;
                              }

                              if (balance >= (double)fare) {
                                 balance -= (double)fare;
                                 ++totalTickets;
                                 lastFrom = stations[src];
                                 lastTo = stations[dst];
                                 lastDistance = dist;
                                 lastFare = fare;
                                 System.out.println("Ticket booked: " + lastFrom + " -> " + lastTo + ", ₹" + fare);
                              } else {
                                 System.out.println("Not enough balance.");
                              }
                           } else {
                              System.out.println("Invalid stations.");
                           }
                        }
                        System.out.print("Book more tickets? (yes/no): ");
                        String again = scanner.next();
                        if (again.equalsIgnoreCase("yes")) {
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
















































