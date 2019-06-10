package ueb01;

class Palindrom {

	static boolean istPalindrom(String s) {

		if(s.isEmpty())
			return false;

		if(s.length() == 1)
			return true;
		

		char [] z = s.replaceAll(" ", "").toLowerCase().toCharArray();

		for(int i=0; i<z.length/2; i++){

			if(!(z[i]==z[z.length-1-i]))
			 return false;
		}

		return true;
	}
}
