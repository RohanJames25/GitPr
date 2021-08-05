package mavenpractice.mavenjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaPractice {

	public static void mulitplication() {

		int i;

		System.out.println("Please choose a number: ");
		Scanner c = new Scanner(System.in);
		int num = c.nextInt();
		for (i = 0; i <= 10; i++) {
			int mult = num * i;
			System.out.println(num + " x " + i + " = " + mult);
		}
	}

	public static void sumofdigits() {

		System.out.println("Please choose a 2 digit number: ");
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		int f = a / 10;
		// System.out.println(f);
		int s = a % 10;
		int sum = f + s;
		// System.out.println(s);
		System.out.println("Sum of the digits is " + sum);
	}

	public static void revstr() {

		int i;
		String rev = null;
		System.out.println("Please enter a sentence:");
		Scanner c = new Scanner(System.in);
		char[] s = c.nextLine().toCharArray();
		System.out.print("The sentence in reverse is: ");
		for (i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i]);
		}

	}

	public static void count() {
		int i;
		int num = 0;
		int alpha = 0;
		int space = 0;
		int symbol = 0;
		System.out.println("Please enter a sentence with numbers & symbols: ");
		Scanner c = new Scanner(System.in);
		String a = c.nextLine();
		char[] s = a.toCharArray();
		// System.out.println(s[5]);
		for (i = 0; i <= a.length() - 1; i++) {
			if (Character.isDigit(s[i])) {
				num++;

			} else if (Character.isLetter(s[i])) {
				alpha++;

			} else if (Character.isSpace(s[i])) {
				space++;

			} else {
				symbol++;

			}
		}
		System.out.println("Numbers = " + num);
		System.out.println("Alphabet = " + alpha);
		System.out.println("Space = " + space);
		System.out.println("Symbols = " + symbol);
	}

	public static void threedigit() {

		int am = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (k != i && k != j && i != j) {
						am++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number " + am);
	}

	public static void numconcat() {
		System.out.println("Please enter a digit:");
		Scanner c = new Scanner(System.in);
		int num = c.nextInt();
		System.out.printf("%d + %d%d + %d%d%d", num, num, num, num, num, num);
	}

	public static void addnumconcat() {
		System.out.println("Please enter a digit:");
		Scanner c = new Scanner(System.in);
		int num = c.nextInt();
		String num1 = Integer.toString(num);
		String num2 = num1.concat(num1);
		String num3 = num2.concat(num1);
		int a1 = Integer.parseInt(num1);
		int a2 = Integer.parseInt(num2);
		int a3 = Integer.parseInt(num3);
		int add = a1 + a2 + a3;
		System.out.println(add);
	}

	public static void triangle() {

		int i;
		int j;

		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void invtriangle() {

		int i;
		int j;

		for (i = 4; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void odd() {

		int i;
		for (i = 0; i <= 100; i++) {
			int number = i % 2;
			if (number != 0) {
				System.out.println("The odd number is: " + i);

			}

		}

	}

	public static void divisible() {

		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("The number divisible by 3 is: " + i);
			}
			if (i % 5 == 0) {
				System.out.println("The number divisible by 5 is: " + i);
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("The number divisible by 3 & 5 is: " + i);
			}
		}

	}

	public static void prime() {

		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("The number divisible by 2 is: " + i);
			} else if (i % 3 == 0) {
				System.out.println("The number divisible by 3 is: " + i);
			}
			if (i % 5 == 0) {
				System.out.println("The number divisible by 5 is: " + i);
			}
			if (i % 7 == 0) {
				System.out.println("The number divisible by 7 is: " + i);
			}
		}

	}

	public static void penultimate() {

		int i;
		System.out.println("Please enter a sentence:");
		Scanner c = new Scanner(System.in);
		String str = c.nextLine();
		String word[] = str.split(" ");
		System.out.println(word.length);
		for (i = 0; i <= word.length - 1; i++) {
			if (word[i] == word[word.length - 2]) {
				System.out.println(word[i]);
			}

		}

	}

	public static void addword() {

		String sent = "The cat black";
		String missing = "is";
		System.out.println(sent.substring(0, 7) + " " + missing + " " + sent.substring(8));
	}

	public static void swapvalue() {
		int i;
		int nums[] = { 15, 25, 100 };
		int temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		for (i = 0; i <= nums.length - 1; i++) {
			System.out.print(nums[i] + " , ");
		}
	}

	public static void max() {

		int i;
		int nums[] = { 15000, 176575650, 3360, 1240 };
		int max = nums[0];
		for (i = 0; i <= nums.length - 1; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println(max);
	}

	public static void multarr() {
		int val = 0;
		int ar[] = { 2, 9, 2, 1, 10 };
		int arr[] = { 2, 3, 4, 8, 5 };

		for (int i = 0; i <= ar.length - 1; i++) {
			val = ar[i] * arr[i];
			System.out.println(val + ",");

		}
	}

	public static void oddprnt() // NOT WORKING
	{
		List<Integer> even = null;
		List<Integer> odd = null;
		int ar[] = { 2, 9, 8, 1, 10, 65 };
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] % 2 == 0) {
				even = new ArrayList<Integer>();
				even.add(ar[i]);
				// System.out.print(even);
			} else {
				odd = new ArrayList<Integer>();
				odd.add(ar[i]);
				// System.out.print(odd);
			}
		}
		System.out.print(odd);
		System.out.print(even);

	}

	public static void wordlength() {
		int i;
		String word = null;
		String words[] = { "car", "aeroplanes", "busesssssssssss", "cycles" };
		int max = words[0].length();
		for (i = 0; i <= words.length - 1; i++) {

			if (words[i].length() > max) {
				max = words[i].length();
				word = words[i];
			}
		}
		System.out.println(word);
	}

	public static void twodim() {
		int i;
		int j;
		boolean array[][] = { { true, false, true }, { false, true, false } };
		for (i = 0; i <= array.length - 1; i++) {
			for (j = 0; j <= array.length; j++) {
				if (array[i][j] == true) {
					System.out.print("t");
				} else {
					System.out.print("f");
				}
			}
			System.out.println();
		}
	}

	public static void twoDedit() // NOT WORKING
	{
		int i, j;
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };
		int[][] op = new int[3][2];

		for (i = 0; i <= arr.length; i++) {
			for (j = 0; j <= arr.length; j++) {
				op[j][i] = arr[i][j];
				System.out.print(op[i][j]);
			}
			System.out.println();
		}
	}

	public static void threelar() {

		// int[] nums = {100,1250,12,24,0,2000,1700};//ascending order
		int[] nums = { 1, 6, 11, -4, 0, -5, -2 };// ascending order
		Arrays.sort(nums);// ascending order
		System.out.println(Arrays.toString(nums));
		// Integer[] nums = {100,1250,12,24,0,2000,1700};//descending order
		// Arrays.sort(nums, Collections.reverseOrder());//descending order
		// System.out.print("The 3 largest numbers in the array are: " +
		// nums[nums.length-3] + " , " + nums[nums.length-2] + " , " +
		// nums[nums.length-1]);
	}

	public static void revsent() {
		int i;
		String sent = "The cow jumped over the moon & then farted";
		String[] nwsent = sent.split(" ");
		// System.out.println(nwsent.length);
		for (i = nwsent.length - 1; i >= 0; i--) {
			System.out.print(nwsent[i] + " ");
		}
	}

	public static void avglrg() {

		Integer[] arr = { 1, 4, 10, 8, 25, 3, 100 };
		// Arrays.sort(arr);
		// System.out.printf(Arrays.toString(arr));
		int sum = 0;
		int avg = 0;
		int op = 0;
		int len = arr.length;
		int i, j;

		for (i = 0; i < len; i++) {
			sum = sum + arr[i];
		}
		avg = sum / len;
		// System.out.println(avg);
		for (j = 0; j < len; j++)
			if (avg < arr[j]) {
				System.out.println(arr[j]);
			}
	}

	public static void wrdlen() {
		int i;
		String sent = "The cow jumped over the moon & then farted";
		String[] split = sent.split(" ");
		int len = split.length - 1;
		for (i = 0; i < split.length; i++) {
			if (i == len) {
				System.out.print(split[i].length());
			}
		}
	}

	/*
	 * public static void duplltr() {//NOT WORKING int i = 0; int count =0; String
	 * init = "rrroonnnhhaaa"; char[] ltr = init.toCharArray(); for (i=0;
	 * i<=ltr.length-1;i++) { if (ltr[i]== && count<1) { System.out.print(ltr[i]);
	 * count++; } } }
	 */

	/*
	 * public static void sumdouble() {
	 * 
	 * System.out.println("Please choose a double digit number: "); Scanner s = new
	 * Scanner (System.in); int num = s.nextInt(); int num1 = num/10; int num2 =
	 * num%10; System.out.println(num1); System.out.println(num2); int sum = num1 +
	 * num2;
	 * 
	 * if (sum.length==2) { System.out.println(sum); }else {
	 * 
	 * } }
	 */

	public static void highestt() {

		int num1 = 110000;
		int num2 = 342;
		int num3 = 670;
		int temp = 0;

		if (num1 > num2) {
			temp = num1;
		} else if (num1 < num2) {
			temp = num2;
		}
		if (num3 > temp) {
			System.out.println(num3);
		} else {
			System.out.println(temp);
		}
	}

	public static void dow() {

		System.out.print("Please choose a number between 1-7:");
		Scanner c = new Scanner(System.in);
		int choice = c.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Day does not exist");
			break;
		}
	}

	public static void month() {

		System.out.print("Please choose a number between 1-12:");
		Scanner m = new Scanner(System.in);
		int month = m.nextInt();
		System.out.print("Please choose a year:");
		Scanner y = new Scanner(System.in);
		int year = y.nextInt();

		switch (month) {

		case 1:
			System.out.println("January has 31 days");
			break;

		case 2:
			if (month == 2 && year % 4 == 0) {
				System.out.println("February " + year + " has 29 days");
			} else if (month == 2 && year % 4 != 0)
				System.out.println("February" + year + "has 28 days");
			break;

		case 3:
			System.out.println("March " + year + "has 31 days");
			break;

		case 4:
			System.out.println("April " + year + "has 30 days");
			break;

		case 5:
			System.out.println("May " + year + "has 31 days");
			break;

		case 6:
			System.out.println("June " + year + "has 30 days");
			break;

		case 7:
			System.out.println("July " + year + "has 31 days");
			break;

		case 8:
			System.out.println("August " + year + "has 31 days");
			break;

		case 9:
			System.out.println("September " + year + "has 30 days");
			break;

		case 10:
			System.out.println("October " + year + "has 31 days");
			break;

		case 11:
			System.out.println("November " + year + "has 30 days");
			break;

		case 12:
			System.out.println("December " + year + "has 31 days");
			break;

		default:
			System.out.println("Month does not exist");
			break;
		}
	}

	public static void constvow() {

		System.out.print("Please choose an alphabet:");
		Scanner a = new Scanner(System.in);
		char alphabet = a.next().charAt(0);

		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
			System.out.println(alphabet + " is a vowel");

		} else {

			System.out.println(alphabet + " is a consonant");
		}

	}
	
	public static void cube() {
		
		System.out.print("Please choose a number between 1-10:");
		Scanner m = new Scanner(System.in);
		int mx = m.nextInt();
		int i;
		
		for (i=1;i<=mx;i++) {
			int c = i*i*i;
			System.out.println("Number is: " + i + " and cube of " + i + " is: " + c );
			
		}
			
	}

	
	public static void numtri () {
		
		int i, j;
		for (i=1;i<=10;i++) {
			for (j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println(" ");
		}		
	}
	
	
	public static void samenumtri() {
		
		int i, j;
		for (i=1;i<=10;i++) {
			for (j=1;j<=i;j++) {
				System.out.print(i);
			}System.out.println("");
		}		
}
	
public static void inctri() {
		
		int i, j;
		int nw = 1;
		for (i=1;i<=5;i++) {
			for (j=1;j<=i;j++) {
				System.out.print(nw++);
				//nw++;
			}System.out.println("");
		}		
}
	
public static void centretri() {
	
	int i, j, k;
	
	for (i=1;i<=4;i++) {
		for (j=4;j>i;j--) {
			System.out.print(" ");}
			for (k=1;k<=i;k++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

public static void diamond() {
	
	int i, j, k;
	
	for (i=1;i<=4;i++) {
		for (j=4;j>i;j--) {
			System.out.print(" ");}
			for (k=1;k<=i;k++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	
	for (i=1;i<=3;i++) {
		for (j=1;j<=i;j++) {
			System.out.print(" ");}
		for (k=3;k>=i;k--) {
		System.out.print("*" + " ");
		}System.out.println(" ");
	}
}		

public static void revindtri() {
	
	int i, j, k;
	for (i=0;i<=5;i++) {
		for (j=1;j<=i;j++) {
			System.out.print(" ");}
			for (k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}		
}

public static void forgrid() {
	
	int i,j;
	
	for (i=1;i<=10;i++) {
		for (j=1;j<=10;j++) {
			System.out.print("-" + " ");
		}
		System.out.println("");
	}
	
}

public static void arrval() {
	int i;
	String[] s = {"Car", "Boat", "Ship"};
	for (i=0;i<s.length;i++) {
	if (s[i]=="Boat") {
		System.out.println("Value is present");
	}
	
}
	
}

public static void arrcopy() {
	int i;
	String[] s = {"Car", "Boat", "Ship"};
	for (String copy : s) {
		String[] n = {copy};
		//String words = Arrays.toString(n);
	
	for(i=0;i<n.length;i++)
	System.out.print(n[i] + ",");
	}
}
	


	public static void main(String[] args) {
		// JavaPractice.mulitplication();
		// JavaPractice.sumofdigits();
		// JavaPractice.revstr();
		// JavaPractice.count();
		// JavaPractice.threedigit();
		// JavaPractice.numconcat();
		// JavaPractice.addnumconcat();
		// JavaPractice.triangle();
		// JavaPractice.invtriangle();
		// JavaPractice.odd();
		// JavaPractice.divisible();
		// JavaPractice.prime();
		// JavaPractice.penultimate();
		// JavaPractice.addword();
		// JavaPractice.swapvalue();
		// JavaPractice.max();
		// JavaPractice.multarr();
		// JavaPractice.oddprnt();
		// JavaPractice.wordlength();
		// JavaPractice.twodim();
		// JavaPractice.twoDedit();
		// JavaPractice.threelar();
		// JavaPractice.revsent();
		// JavaPractice.avglrg();
		// JavaPractice.wrdlen();
		// JavaPractice.duplltr();
		// JavaPractice.sumdouble();
		// JavaPractice.highestt();
		// JavaPractice.dow();
		// JavaPractice.month();
		//JavaPractice.constvow();
		//JavaPractice.cube();
		//JavaPractice.numtri();
		//JavaPractice.samenumtri();
		//JavaPractice.inctri();
		//JavaPractice.centretri();
		//JavaPractice.diamond();
		//JavaPractice.revindtri();
		//JavaPractice.forgrid();
		//JavaPractice.arrval();
		JavaPractice.arrcopy();

	}

}
