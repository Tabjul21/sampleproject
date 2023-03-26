package Assignment_4;

public class Remove_Duplicate_String {

	public static void main(String[] args) {
		String s="JAVA";
		StringBuilder sc=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int index=s.indexOf(ch,i+1);
			if(index == -1) {
				sc.append(ch);
			}
		}
		System.out.println("Dublicate Characters in String :"+sc);
	}
}
