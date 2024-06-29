import java.util.Scanner;

            public class task2 {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the marks of maths");
                    int a = sc.nextInt();
                    System.out.println("Enter the marks of english");
                    int b = sc.nextInt();
                    System.out.println("Enter the marks of physics");
                    int c = sc.nextInt();
                    System.out.println("Enter the marks of chemistry");
                    int d = sc.nextInt();
                    System.out.println("Enter the marks of biology");
                    int e = sc.nextInt();

                    int sum = (a + b + c + d + e);
                    System.out.println("The sum of the marks is" + "=" + sum);
                    int percentage = (sum) / 5;
            System.out.println("your Grade is Excellent" + "=" + "A+");
        }

            System.out.println("your Grade is very good"+"="+"B+");

        }else if(percentage >=50 && percentage<=69){
            System.out.println("your Grade is Good"+"="+"C+");
        } else if( percentage >=30 && percentage<=49)
        {
            System.out.println("your Grade is not good you have to work hard" + "=" + "D+");
        }
         else if(percentage>=0 && percentage<=29){

            System.out.println(" your are fail in your exam" + "=" + "E");
        }else{
            System.out.println(" invalid marks");
        }

    }
}

