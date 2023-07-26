package _03_Printing_Binary;

public class _01_BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method! Use the main method to test
	 * your methods.
	 */

	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place

		// Shift b seven bits to the right
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		// Print the result using System.out.print (NOT System.out.println)
		

		for (int i = 7; i >= 0; i--) {
			byte temp = (byte) (b >> i);
			byte used = (byte) (temp & 1);
			System.out.print(used);
		}
		// Use this method to print the remaining 7 bits of b
	}

	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte b1;
		byte b2;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		b1 = (byte) (s >> 8);
		b2 = (byte) s;
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(b1);
		printByteBinary(b2);
	}

	public void printIntBinary(int i) {
		// Create 2 short variables
		
		short s1;
		short s2;
		
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		s1 = (short) (i >> 16);
        s2 = (short) i;
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
        
        printShortBinary(s1);
        printShortBinary(s2);
	}

	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		
		int l1;
		int l2;
		
		 l1 = (int) (l >> 32);
		 l2 = (int) l;
		
		printIntBinary(l1);
		printIntBinary(l2);
	}

	public static void main(String[] args) {
		_01_BinaryPrinter print = new _01_BinaryPrinter();
		byte b = (byte) 84;
		Short s = (short) 100;
		Long l = (long) 1999999999;

		//print.printByteBinary(b);

		print.printLongBinary(l);
		// Test your methods here
	}
}
