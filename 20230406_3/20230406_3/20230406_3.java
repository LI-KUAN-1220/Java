������һ����Java��д��ʾ������ʾ��һЩ�����ı�̽ṹ��

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

���������ǰ��ĳ������ƣ���������Java��д�ġ���������һ������Main������Main�࣬Main�����ǳ������ڵ㡣
�ó�������������ͬ���͵ı�����int��double��char������Ϊ���Ǹ�ֵ��Ȼ����ʹ��System.out��ӡ��Щ������ֵ����Ϊÿ������ʹ�ò�ͬ�ĸ�ʽ˵�����ʹ�����
�ó��򻹰���һ��if��䣬���ڱȽ�x��y��ֵ���Լ�һ��forѭ�������ڴ�ӡ��0��x-1�����֡���󣬳����ӡһ�����з���������һ�С�