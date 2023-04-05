下面是一段用Java编写的示例，演示了一些常见的编程结构：

public class Main {
    public static void main(String[] args) {
        int x = 5;               // Declare an integer variable x and assign it the value 5
        double y = 3.14;         // Declare a double-precision floating-point variable y and assign it the value 3.14
        char c = 'a';            // Declare a character variable c and assign it the value 'a'

        System.out.println("The value of x is " + x + ".");     // Print the value of x using the System.out object
        System.out.println("The value of y is " + String.format("%.2f", y) + "."); // Print the value of y with 2 decimal places
        System.out.println("The value of c is " + c + ".");     // Print the value of c

        if (x > y) {                                            // Use an if statement to compare x and y
            System.out.println("x is greater than y.");
        } else {
            System.out.println("y is greater than x.");
        }

        for (int i = 0; i < x; i++) {                           // Use a for loop to print the numbers from 0 to x-1
            System.out.print(i + " ");
        }
        System.out.println();                                   // Print a newline character to end the line

    }
}

这个程序与前面的程序类似，但它是用Java编写的。它定义了一个带有Main方法的Main类，Main方法是程序的入口点。
该程序声明三个不同类型的变量（int、double和char），并为它们赋值。然后，它使用System.out打印这些变量的值，并为每个类型使用不同的格式说明符和串联。
该程序还包括一个if语句，用于比较x和y的值，以及一个for循环，用于打印从0到x-1的数字。最后，程序打印一个换行符来结束这一行。