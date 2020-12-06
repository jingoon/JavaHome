package book.home_031;

public class UsingCharacterMain {
	public static void main(String[] args) {
		
		Character char1=new Character('a');
		Character char2=new Character('9');
		
		if(Character.isLetter(char1.charValue())) {
			System.out.println("1:"+char1.charValue());//'a'
		}
		
		if(Character.isDigit(char2.charValue())) {
			System.out.println("2:"+(int)char2.charValue());//(int)'9'
		}
		
		System.out.println("3:"+Character.getType('a'));//소문자2
		System.out.println("4:"+Character.getType('A'));//대문자1
		System.out.println("5:"+Character.getType('3'));//숫자 9
		System.out.println("6:"+Character.getType('&'));//특수문자 24
		//OTHER_PUNCTUATION 24
		System.out.println("7:"+Character.getType('\n'));//white 15
		System.out.println("8:"+(int)'\b');				//8
		//9~13 28~31 white space
		System.out.println("9:"+(int)'\t');//9			//white space
		System.out.println("10:"+(int)'\n');			//10
		System.out.println("11:"+(int)'\f');			//12
		System.out.println("12:"+(int)'\r');			//13
		
		System.out.println("13:"+Character.getNumericValue('9'));	//숫자
		
		System.out.println("14:"+Character.isWhitespace(' '));
		System.out.println("15:"+Character.isWhitespace('\n'));
		System.out.println("16:"+Character.isWhitespace('\r'));
		System.out.println("17:"+Character.isWhitespace('\b'));		//false
		System.out.println("18:"+Character.isLetterOrDigit('9'));
		System.out.println("19:"+Character.isLowerCase('A'));
		System.out.println("20:"+Character.isUpperCase('A'));
		//radix 기수 0~9가 기본
		System.out.println("21:"+Character.digit('8', 9));
		//SPACE_SEPARATOR 12 '\f'
		//LINE_SEPARATOR 13 '\r'
		//PARAGRAPH_SEPARATOR 14
		//SPACE 32
		System.out.println("22:"+(int)' ');				//32
		System.out.println("23:"+Character.isSpaceChar(' '));
		System.out.println("24:"+Character.isSpaceChar('\n'));
		
	}

}
