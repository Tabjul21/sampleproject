package Assignment_4;
public class Print_Duplicates {
	public static void main(String[] args) {
		String s = "NAVANEETH";
	      char[] ch = s.toCharArray();
	      System.out.println("The string is:" + s);
	      System.out.print("Duplicate Characters : ");
	      for (int i = 0; i < s.length(); i++) {
	         for (int j = i + 1; j < s.length(); j++) {
	            if (ch[i] == ch[j]) {
	               System.out.print(ch[j] + " ");
	               break;
	            }
	         }
	      }
}
}