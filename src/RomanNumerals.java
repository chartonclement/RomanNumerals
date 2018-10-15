
public class RomanNumerals {
	
	
	public boolean NotaromainNumerals(String oneromanNum) {
		if(oneromanNum != "I" && oneromanNum != "V" && oneromanNum != "X" && oneromanNum != "C" && oneromanNum != "D" && oneromanNum != "M") {
	    	  return true;
	      }
		else {return false;}
		
	}
	public char letter(String num, int i) {
		char romanNum = num.charAt(i);
		return romanNum;
	}
	public int transf(String num, int i) {
		int valeur=0;
		char romanNum = letter(num,i);
		if (romanNum=='I') {
			valeur = 1;
		}
		else if (romanNum=='V') {
			valeur = 5; 
		}
		else if (romanNum=='X') {
			valeur = 10; 
		}
		else if (romanNum=='L') {
			valeur = 50; 
		}
		else if (romanNum=='C') {
			valeur = 100; 
		}
		else if (romanNum=='D') {
			valeur = 500; 
		}
		else if (romanNum=='M') {
			valeur = 1000;
		}
		return valeur;	
	}
	public int addition(String num,int i) {
		char romanNum = letter(num,i);
		if((num.length()-i)>=4) {
			if (romanNum=='I' || romanNum=='X' ||romanNum=='C'|| romanNum=='M') {
				if ((letter(num,i+3))==romanNum) {
					return 0;
				}
			}
		}
		if((num.length()-i)>=2) {
			if (romanNum=='V' || romanNum=='L' ||romanNum=='D') {
				if ((letter(num,i+1))==romanNum) {
					return 0;
				}
			}
		}
		return 1;
	}
	public int converti(String romanNum) {
		int sum=0;
		for (int i=0; i< romanNum.length(); i++) {
			if (addition(romanNum,i)==0) {
				return 0;
			}
			int val = transf(romanNum, i);
			if(i<romanNum.length()-1) {
				int j=i+1;
			int val2 =transf( romanNum,j);
			if (val<val2) {
			int val3=val2-val;
			sum=sum+val3;
			i++;
			}
			else{
			sum=sum+val;	
			}
			}
			else {
				sum=sum+val;
			}
		}
		return sum;
		// To be Implemented
		
	}
}
