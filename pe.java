import java.util.*;
class pe{
	ArrayList<String> perm(String s){
		if(s==null){
			return null;
		}
		ArrayList<String> all=new ArrayList<String>();
		if(s.length()==0){
			all.add("");
			return all;
		}
		char l=s.charAt(0);
		String sub=s.substring(1);
		ArrayList<String> alll=perm(sub);
		for(String per:alll){
			for(int i=0;i<=per.length();i++){
			String a=per.substring(0,i);
			String z=per.substring(i);
			all.add(a+l+z);	
			}
		}
		return all;
	}
public static void main(String[] args) {
	pe p=new pe();
	String g="gow";
	ArrayList<String> o=p.perm(g);
	for(String h:o){
		System.out.print(h+" ");
	}
}
}