import java.util.* ;

class LastWord{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Sente");
		String s=sc.nextLine();
		s=s.trim();
		int j=0;
		for(int i=s.length()-1; i>=0; i--){
			if(s.charAt(i)==' '){
				j = i+1;
				break;
			}
		
		}
		System.out.println(s.substring(j, s.length()));
	}
}