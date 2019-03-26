package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen! = faboolean pali;
		boolean pali = true;
		s=s.replaceAll(" ", "");
		s=s.toLowerCase();
		char[]z =s.toCharArray();

		for(int i=0; i<s.length()/2; i++){
			if(!(z[i]==z[z.length-1-i]))
			{ pali = false;}
		}
		return pali;
	}
}
