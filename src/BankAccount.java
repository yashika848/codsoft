import java.util.Scanner;

 class BankAccount {

    String name;
    String username;
    String password;
    String str;
    String accountNumber;
    float balance =100000f;
    int transaction=0;

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        this.name = sc.nextLine();
        System.out.println("Enter your username:");
        this.username = sc.nextLine();
        System.out.println("Enter your password:");
        this.password = sc.nextLine();
        System.out.println("Enter your Account Number:");
        this.accountNumber = sc.nextLine();
        System.out.println("Registered Successfully.....PLEASE LOG IN ");
    }

    public boolean login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while (!isLogin) {
            System.out.println("Enter your Username:");
            String Username = sc.nextLine();
            if (Username.equals(username)) {
                while (!isLogin) {
                    System.out.println("Enter your password:");
                    String Password = sc.nextLine();
                    if (Password.equals(password)) {
                        System.out.print("Log in succesfull!");
                        isLogin = true;
                    } else {
                        System.out.print("\nIncorrect password");
                    }
                }
            } else {
                System.out.println("Wrong username or password");
            }
        }
        return true;


    } public void withdraw(){
        System.out.println("Enter the amount to withdraw");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        try {
            if (balance >= amount) {
                transaction++;
                balance -= amount;
                System.out.println("\nwithdraw Successfull!");
                 str  = amount + "Rs withdrawed\n";
            }
             else {
                System.out.println("\n Insufficient balance");

            }} catch(Exception ignored) {
        }
        }
           public void deposit() {
               System.out.println("\nEnter the amount to be deposit:");
               Scanner sc = new Scanner(System.in);
               float amount = sc.nextFloat();
               try {
                   if (amount <= 100000f) {
                       transaction++;
                       balance += amount;
                       System.out.println("\nSuccessfully deposited");
                        str  = amount + "Rs deposited\n";
                   } else {
                       System.out.println("\nsorry..!! limit is 100000.00");
                   }
               } catch (Exception ignored) {
               }
           }
           public void  checkBalance() {
               System.out.println("\n" + balance + "Rs");
           }
           public static class ATMinterface{
             public static int
                     takeIntegerInput(int limit) {
                 int input = 0;
                 boolean flag = false;
                 while(!flag) {
                     try {
                         Scanner sc = new Scanner(System.in);
                         input = sc.nextInt();
                         flag =true;
                         if (input < 1 ||  input > limit ) {
                             System.out.println("choose the number betwwen1 to" + limit);
                             flag = false;

                         }
                     } catch (Exception e) {
                         System.out.print("Enter only integer value:");
                         flag = false;
                     }
                 }

                 return input;
             }

             public static void main(String[]args) {
                 System.out.println("\n******WELCOME TO THE ATM*****");
                 System.out.println("1.Register\n 2.Exit");
                 System.out.print("Enter your choice");
                 int choice = takeIntegerInput(2);

                 if (choice == 1) {
                     BankAccount b = new BankAccount();
                     b.register();
                     while (true) {
                         System.out.println("\n .1 Log In \n.2 Exit");
                         int ch = takeIntegerInput(2);
                         if (ch == 1) {
                             if (b.login()) {
                                 System.out.println("\n\n*****WELCOME BACK" + b.name + "*****\n");
                                 boolean isFinished = false;

                                 while (!isFinished) {
                                     System.out.println("\n.1 withdraw\n2.Deposit\n3.check Balance\n4.Exit" );
                                     System.out.print("Enter your choice:");
                                     int c = takeIntegerInput(4);
                                     switch (c) {
                                         case 1:
                                             b.withdraw();
                                             break;

                                         case 2:
                                             b.deposit();
                                             break;

                                         case 3:
                                             b.checkBalance();
                                             break;

                                         case 4:
                                             isFinished = true;
                                             break;


                                     }
                                 }
                             }
                         } else {
                             System.exit(0);
                         }
                     }
                 } else {
                     System.exit(0);
                 }

             }



         }



     }



