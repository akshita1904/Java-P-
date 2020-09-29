import java.util.* ;

class Sign{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String s=sc.nextLine();
		s=s.trim();
		System.out.print(s.charAt(0));
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)==' '){
				System.out.print("." + s.charAt(i+1));
			}
		}
	}
}