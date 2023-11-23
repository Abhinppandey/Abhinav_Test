package Java;

public class removeJunk {
	public static void main(String[] args) {
		
		String S="@#$%^Abhinav";
		S=S.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S);
	}

}
