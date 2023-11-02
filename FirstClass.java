import java.util.*;
import java.util.Scanner;
public class FirstClass {
    public static void main(String arg[]) {

       //Lecture 1 - My first Program
       //System.out.println("Hello World!");  

       //Lecture 2 - Output 
    //    System.out.print("Welcome!!This is the World of Java");
    //    System.out.println("*");
    //    System.out.println("**");
    //    System.out.println("***");
    //    System.out.println("****");

       //Lecture 2 - Variables and Data Types
    //    String name="Yash";    
    //    System.out.println(name);
    //    int age=18;
    //    System.out.println(age);
    //    double price=25.55;
    //    price=27.65;
    //    System.out.println(price);

       //Lecture 2 - Input
    //    Scanner sc = new Scanner(System.in);   
    //    String surname = sc.nextLine();
    //    System.out.println(surname);

    //    Scanner sc = new Scanner(System.in);
    //    int a = sc.nextInt();
    //    int b = sc.nextInt();
    //    int sum = a+b;
    //    System.out.println(sum);

       //Homework Problems
       //Declaration of variable each type
    //    int age=18;
    //    float count=2;
    //    double price=23.5;
    //    long salary=10000;
    //    char dollar='$';
    //    short asterisk='*';
    //    bool check="true";
    //    byte Yes_No="False";

       //Area of Circle
    //    Scanner sc = new Scanner(System.in);
    //    int radius=sc.nextInt();
    //    double area=3.14*radius*radius;
    //    System.out.println(area);

       //Print table
    //    Scanner sc = new Scanner(System.in);
    //    int num = sc.nextInt();
    //    System.out.println(num*1);
    //    System.out.println(num*2);
    //    System.out.println(num*3);
    //    System.out.println(num*4);
    //    System.out.println(num*5);
    //    System.out.println(num*6);
    //    System.out.println(num*7);
    //    System.out.println(num*8);
    //    System.out.println(num*9);
    //    System.out.println(num*10);

       //Lecture 3 - if-else,else if
    //    Scanner sc = new Scanner(System.in);
    //    int age = sc.nextInt();
    //    if (age>=18) {
    //     System.out.println("Adult");
    //    } else if (age>=13) {
    //     System.out.println("Teenager");
    //    } else if (age>=1) {
    //     System.out.println("Child");
    //    } else {
    //     System.out.println("Age is not valid");
    //    }
    
       //Even-Odd
    //    Scanner sc = new Scanner(System.in);
    //    int num = sc.nextInt();
    //    if (num%2==0) {
    //     System.out.println("Even Number");
    //    } else { 
    //     System.out.println("Odd Number");
    //    }

       //Equal to,greater than,less than
    //    Scanner sc = new Scanner(System.in);
    //    int a = sc.nextInt();
    //    int b = sc.nextInt();
    //    if (a==b) {
    //     System.out.println("a is equal to b");
    //    } else {
    //     if (a>b) {
    //     System.out.println("a is greater than b");
    //     } else {
    //     System.out.println("a is smaller than b");
    //     }
    //    }

          //Button 1 or 2
    //    Scanner sc = new Scanner(System.in);
    //    int button = sc.nextInt();
    //    if (button==1) {
    //     System.out.println("Hello!");
    //    } else if (button==2) {
    //     System.out.println("Namaste!");
    //    } else {
    //     System.out.println("Bonjour!");
    //    }

       //Print days in a week using switch
    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
    //    switch(n) {
    //       case 1 :
    //           System.out.println("Monday");
    //           break;
    //       case 2 :
    //           System.out.println("Tuesday");
    //           break;
    //       case 3 :
    //           System.out.println("Wednesday");
    //           break;
    //       case 4 :
    //           System.out.println("Thursday");
    //           break;
    //       case 5:
    //           System.out.println("Friday");
    //           break;
    //       case 6 :
    //           System.out.println("Saturday");
    //           break;
    //       default :
    //           System.out.println("Sunday");
    //    }

       //Homework Problems
       //Make a Calculator
    //    Scanner sc = new Scanner(System.in);
    //    int a = sc.nextInt();
    //    int b = sc.nextInt();
    //    char operand = sc.next().charAt(0);
    //    if (operand=='+') {
    //     System.out.println(a+b);
    //    } if (operand=='-') {
    //     System.out.println(a-b);
    //    } if (operand=='*') {
    //     System.out.println(a*b);
    //    } if (operand=='/') {
    //     System.out.println(a/b);
    //    } if (operand=='%') {
    //     System.out.println(a%b);
    //    }

          //Print months in a year using switch
    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
    //    switch(n) {
    //     case 1 : System.out.println("January");
    //     break;
    //     case 2 : System.out.println("February");
    //     break;
    //     case 3 : System.out.println("March");
    //     break;
    //     case 4 : System.out.println("April");
    //     break;
    //     case 5 : System.out.println("May");
    //     break;
    //     case 6 : System.out.println("June");
    //     break;
    //     case 7 : System.out.println("July");
    //     break;
    //     case 8 : System.out.println("August");
    //     break;
    //     case 9 : System.out.println("September");
    //     break;
    //     case 10 : System.out.println("October");
    //     break;
    //     case 11 : System.out.println("November");
    //     break;
    //     case 12 : System.out.println("December");
    //     break;
    //     default : System.out.println("Invalid Enter");
    //    }


       //Lecture 4 - for loop
    //    for(int counter=0;counter<5;counter=counter+1) {
    //     System.out.println("Hello World!");
    //    }
    //    for(int i=0;i<11;i++) {
    //     System.out.println(i);
    //    }

       //Lecture 4 - while loop
    //    int i = 0;
    //    while(i<11) {
    //     System.out.println(i);
    //     i++;
    //    }

       //Lecture 4 - do while loop
    //    int i = 0;
    //    do {
    //     System.out.println(i);
    //     i++;
    //    }while(i<11);

       //Test between while and do while loop
    //    int i=12;
    //    while(i<11) {
    //     System.out.println("Apna College");
    //     i++;
    //    }
    //     int i=12;
    //     do {
    //         System.out.println("Apna College");
    //         i++;
    //     }while(i<11);

        //Print the sum of n numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++) {
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        //Print the table of a number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1;i<11;i++) {
        //     System.out.println(n*i);
        // }

        //Homework Problems
        //Print even numbers till n
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=0;i<=n;i++) {
        //     if (i%2==0) {
        //         System.out.println(i);
        //     }
        // }

        //Think
        // for(; ;) {
        //     System.out.println("Apna College");
        // }


        //Menu driven program
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // do{
        //     int marks = sc.nextInt();
        //     do {
        //         System.out.println("This is Good");
        //     }while(marks>=90);
        //      do {
        //         System.out.println("This is also Good");
        //     }while(89>=marks && marks>=60);
        //      do {
        //         System.out.println("This is Good as well");
        //     }while(59>=marks && marks>=0);
        // }while(num==1);

        // do {
        //     System.out.println("Program cannot be continue");
        //     num=sc.nextInt();
        //     }while(num==0);

            //Prime or not
            // Scanner sc = new Scanner(System.in);
            // int num = sc.nextInt();
            // int div = 2;
            // if (num<=1) {
            //     System.out.println("Non-prime number");
            // } else {
            //     while(div<num) {
            //         while (num%div==0) {
            //             System.out.println("Non-prime number");
            //         } 
            //         div=div+1;
            //     } 
            //     System.out.println("Prime number");
                
            // }

            //Lecture 5 - Patters
            // int n = 4;
            // int m = 4;

            // //Outer loop
            // for(int i=1; i<=n; i++) {
            //     //Inner loop
            //     for(int j=1; j<=m; j++) {
            //         System.out.print('*');
            //     }
            //     System.out.println();
            // }


            // int n = 4;
            // int m = 4;

            // //Outer loop
            // for(int i=1; i<=n; i++) {
            //     //Inner loop
            //     for (int j=1; j<=m; j++) {
            //         //cell -> (i,j)
            //         if(i==1 || j==1 || i==n || j==m) {
            //             System.out.print("*");
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }

            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // for(int i=n; i>=1; i--) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // int n = 4;
            // //Outer loop
            // for(int i=1; i<=n; i++) {
            //     //inner loop->space print
            //     for(int j=1; j<=(n-i); j++) {
            //         System.out.print(" ");
            //     }
            //     //inner loop->star print
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=i; j++){
            //         System.out.print(j+" ");
            //         }
            //         System.out.println();
            // }

            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=n-i+1; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();

            // }

            // int number=1;
            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print(number+" ");
            //         number++;
            //     }
            //     System.out.println();
            // }

            // Scanner sc = new Scanner (System.in);
            // int n = sc.nextInt();
            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         if ((i+j)%2==0) {
            //             System.out.print("1"+" ");
            //         } else {
            //             System.out.print("0"+" ");
            //         }
            //     }
            //     System.out.println();
            // }

            //Lecture 6 - Advanced Pattern Questions
            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt(); 
            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     for(int k=1; k<=(n-i)*2; k++) {
            //         System.out.print(" ");
            //     }
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(int i=4; i>=1; i--) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     for(int k=1; k<=(n-i)*2; k++) {
            //         System.out.print(" ");
            //     }
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

        // int n = 5;
        // for(int i=1; i<=n; i++) {
        //    //spaces
        //    for(int j=1; j<=n-i; j++) {
        //        System.out.print(" ");
        //    }
        //    //stars
        //    for(int j=1; j<=n; j++) {
        //        System.out.print("*");
        //    }
        //    System.out.println();
        // }

    //     int n = 5;
    //   for(int i=1; i<=5; i++) {
    //       //spaces
    //       for(int j=1; j<=n-i; j++ ) {
    //           System.out.print(" ");
    //       }
    //       //numbers-  no. of row = no. of time
    //       for(int j=1; j<=i; j++) {
    //           System.out.print(i + " ");
    //       }
    //       System.out.println(" ");
    //   }


    // int n = 5;
    // for(int i=1; i<=5; i++) {
    //     //spaces
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     //numbers
    //     for(int j=i; j>=1; j--) {
    //         System.out.print(j);
    //     }
    //     //numbers
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
        
    // }

    // int n = 4;
    // for(int i=1; i<=4; i++) {
    //     //spaces
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     //stars
    //     for(int j=1; j<=(2*i)-1; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=4; i>=1; i--) {
    //     //spaces
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     //stars
    //     for(int j=1; j<=(2*i)-1; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //Homework Problems - Patterns

    

    

    

    }
}

//Lecture 7 - Functions
//import java.util.*;
//public class FirstClass {
    // public static void printMyName(String name) {
    //     System.out.println(name);
    //     return;
    // }    

    // public static int CalculateProduct(int num1,int num2){
    //     int product = num1 * num2;
    //     return product;
    // }

    // public static void CalculateFactorial (int n) {
    //     if (n < 0) {
    //         System.out.println("Invalid Number");
    //         return;
    //     }
    //     int factorial=1;
    //     for(int i=n; i>=1; i--){
    //     factorial = factorial * i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }

    //Homework Problems 
    // public static void CheckPrime(int n){
    //     if(n<=1) {
    //         System.out.println("Non-Prime");
    //     }
    //         int div=2;
    //         while(div<n){
    //             if (n%div==0) {
    //                 System.out.println("Non-Prime");
    //                 div=div+1;
    //             } else {
    //                 System.out.println("Prime");
    //             }
    //         } 
    // }

        
    // public static void CheckEvenOrOdd(int n){
    //     if (n%2==0) {
    //         System.out.println("Even Number");
    //     } else {
    //         System.out.println("Odd Number");
    //     }
    //     return;
    // }

    // public static void PrintTable(int n){
    //     for(int i=1; i<=10; i++){
    //         int table = n * i;
    //         System.out.println(table);
    //     }
    // }

    //Lecture 8 - Java Exercise 1
    // public static int CalculateAverage(int a, int b, int c) {
    //     int average = (a + b + c) / 3;
    //     return average;
    // }

    // public static void PrintSumOdd(int n) {
    //     int sum = 0;
    //     for(int i=1; i<=n; i++) {
    //         if (i%2!=0) {
    //             sum = sum + i;
    //         } 
    //     } System.out.println("Sum upto "+ n + " is " + sum);
    //     return;
    // }

    // public static void CheckGreater(int a, int b) {
    //     if (a-b>0) {
    //         System.out.println(a + " is greater.");
    //     } else if (a-b<0) {
    //         System.out.println(b + " is greater.");
    //     } else {
    //         System.out.println("Both are Equal");
    //     }
    // }

    // public static double CircumferenceOfCircle(int rad) {
    //     double circumference = 2 * 3.14 * rad;
    //     return circumference;
    // }


    // public static void CheckEligibility(int age) {
    //     if (age>18) {
    //         System.out.println("Eligible to Vote");
    //     } else {
    //         System.out.println("Not Eligible to Vote");
    //     }
    // }

    //public static void main(String arg[]) {

        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();

        // printMyName(name);/


        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // int result = CalculateProduct(num1,num2);
        // System.out.println(result);


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // CalculateFactorial(n);

        //Homework Problems
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // CheckPrime(n);


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // CheckEvenOrOdd(n);


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // PrintTable(n);

        //Lecture 8 - Java Exercise 1 
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int result = CalculateAverage(a, b, c);
        // System.out.println(result);


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // PrintSumOdd(n);


        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // CheckGreater(a,b);


        // Scanner sc = new Scanner(System.in);
        // int rad = sc.nextInt();

        // double result = CircumferenceOfCircle(rad);
        // System.out.println(result);


        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // CheckEligibility(age);


        // int a = 1;
        // int b = 1;
        // do{
        //     System.out.println("This is an infinite loop.");
        // }while(a==b);


        //Count Positive Negative and Zero
    // int countpositive = 0, countnegative = 0, countzero = 0;
    // System.out.println("Enter 1 to continue or 0 to stop");
    // Scanner sc = new Scanner(System.in);
    // int input = sc.nextInt();
    // while(input==1) {
    //     System.out.println("Enter number :");
    //     int number = sc.nextInt();
    //     if (number>0) {
    //         countpositive++;
    //     } else if (number<0) {
    //         countnegative++;
    //     } else {
    //         countzero++;
    //     }
    //     System.out.println("Enter 1 to continue or 0 to stop");
    //     input = sc.nextInt();
    // }
    // System.out.println("Positives : "+ countpositive);
    // System.out.println("Negatives : "+ countnegative);
    // System.out.println("Zeros : "+ countzero);


    //X^n
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter x :");
    // int x = sc.nextInt();
    // System.out.println("Enter n :");
    // int n = sc.nextInt();

    // int r = 1;
    // for(int i=1; i<=n; i++) {
    //     r = r * x;
    // }
    // System.out.println(r);


    //Greatest common divisor
    // Scanner sc = new Scanner(System.in);
    //    int n1 = sc.nextInt();
    //    int n2 = sc.nextInt();
    //    while(n1 != n2) { 
    //        if(n1>n2) {
    //            n1 = n1 - n2;
    //        } else {
    //            n2 = n2 - n1;
    //        }
    //    }
    //    System.out.println("GCD is : "+ n2);


        //Fibonacci Sequence
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); 
        // int fibnm1 = 1;
        // int fibnm2 = 0;

        // for(int i=1; i<=n; i++) {
        //     int fibn = fibnm1 + fibnm2;
        //     fibnm2 = fibnm1;
        //     fibnm1 = fibn;
        //     System.out.println(fibn);
        // }



    //      }

    //  }



           

            
           

            
            





            






            












        


        



