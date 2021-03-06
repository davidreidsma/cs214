Script started on 2020-02-12 14:17:31-05:00 [TERM="screen" TTY="/dev/pts/3" COLUMNS="172" LINES="82"]
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01\[davidreidsma@localhost proj01]$ cd java
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01/java\[davidreidsma@localhost java]$ ls
RectangleArea.class  RectangleArea.java
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01/java\[davidreidsma@localhost java]$ cat RectangleArea.java
/**
 * RectangleArea.java computes the area of a rectangle.
 *
 * Input: The width and length of a rectangle.
 * Precondition: The width and length are positive numbers.
 * Output: The area of the rectangle.
 *
 * Author: David Reidsma
 * Date: 11/02/2020
 **********************************************************/

import java.util.Scanner;

public class RectangleArea {
	/**
	 * Returns the area of a rectangle.
	 * @param width	The width of the rectangle. Must be positive.
	 * @param length The length of the rectangle. Must be greater than one.
	 * @return The area of the rectangle.
	 */
	private static double rectangleArea(double width, double length) {
		return width * length;
	}

	public static void main(String[] args) {
		System.out.println("\nTo compute the area of a rectangle,");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" enter a width: ");
		double width = scanner.nextDouble();

		System.out.print(" enter a length: ");
		double length = scanner.nextDouble();

		double area = rectangleArea(width, length);
		System.out.println("\nThe area is " + area);
	}
}
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01/java\[davidreidsma@localhost java]$ javac -deprecation RectangleArea.java
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01/java\[davidreidsma@localhost java]$ java RectangleArea

To compute the area of a rectangle,
 enter a width: 2
 enter a length: 2

The area is 4.0
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01/java\[davidreidsma@localhost java]$ java RectangleArea

To compute the area of a rectangle,
 enter a width: 4
 enter a length: 5

The area is 20.0
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01/java\[davidreidsma@localhost java]$ cd ..
kdavidreidsma@localhost:~/Programming/Calvin/214/proj01\[davidreidsma@localhost proj01]$ exit

Script done on 2020-02-12 14:18:06-05:00 [COMMAND_EXIT_CODE="0"]
