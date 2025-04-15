package naveenAutomationLab;

public class ReverseAnInteger {

	public static void main(String[] args) {
		//1.Approach 1
		int a=607;
		int rev=0;
		while(a>0)
		{
			int dig=a%10;
			rev=rev*10+dig;
			a=a/10;
		}
		System.out.println(rev);
		
		//2. Approach 2
		
		int b=798;
		StringBuffer sb=new StringBuffer(String.valueOf(b));
		System.out.println(sb.reverse());

	}

}
