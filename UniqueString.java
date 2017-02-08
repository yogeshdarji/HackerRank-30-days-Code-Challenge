package CT;

import java.util.*;

public class UniqueString {

	public static boolean checkUniqueString(String s) {
		char a[] = s.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {

			if (m.containsKey(a[i])) {
				flag = false;
				break;
			}

			else {
				m.put(a[i], 1);
			}

		}

		flag = true;
		return flag;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		System.out.println("Ans=" + UniqueString.checkUniqueString(s));
	}

}