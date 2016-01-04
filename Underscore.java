import java.util.Scanner;

public class Underscore {
	public static void main (String arg[]) {
		
		Scanner s = new Scanner (System.in);
		System.out.println ("Kelime girin");
		String str = s.next();
		
		int uzunluk = str.length();
		
		char[] karakterDizisi = new char[uzunluk];
		karakterDizisi = str.toCharArray();	
		
		ReplaceUnderscoreWithSpace (karakterDizisi);
		
		System.out.println (karakterDizisi);
	}
	
	static void ReplaceUnderscoreWithSpace (char[] s) {                     
	
		
		for (int i = 1; i < s.length-1; i++)
			if (s[i] == '_')
				s[i] = ' ';
	}
	
}


