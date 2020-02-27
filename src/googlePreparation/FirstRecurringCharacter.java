package googlePreparation;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdaabbcc";
		String str2 = "abcd";
		System.out.println(str1 + " - " + getFirstRecurringCharacter(str1));
		System.out.println(str2 + " - " + getFirstRecurringCharacter(str2));
	}
	
	public static Character getFirstRecurringCharacter(String str) {
		if(str!=null && str.length()>=1) {
			int len = str.length();
			Map<Character, Integer> map = new HashMap<>();
			for(int i=0; i<len; i++) {
				Character ch = str.charAt(i);
				if(map.containsKey(ch)) {
					return ch;
				}else {
					map.put(ch, 1);
				}
			}
		}
		return null;
	}

}
