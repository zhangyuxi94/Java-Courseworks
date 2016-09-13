// Try This 2-2: a truth table for the logical operators.
public class LogicalOpTable {
	public static void main(String[] args) {
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT\r");
		boolean p,q;
		p=true;
		q=true;
		int pp=p?1:0;
		int qq=q?1:0;
		String str=pp+"\t"+qq+"\t"+((p&&q)?1:0)+"\t"+((p||q)?1:0)+"\t"+((p^q)?1:0)+"\t"+((!p)?1:0)+"\r";
		System.out.println(str);
		
		p=true;
		q=false;
		String strr=p+"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q)+"\t"+(!p)+"\r";
		System.out.println(strr.replace("true", "1").replace("false","0"));
		
		p=false;
		q=true;
		System.out.println(p+"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q)+"\t"+(!p)+"\r");
		
		p=false;
		q=false;
		System.out.println(p+"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q)+"\t"+(!p)+"\r");
	}

}
