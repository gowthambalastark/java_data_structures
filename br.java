import java.util.*;
class br{
	public void addd(ArrayList<String> list,int left,int right,char[] str,int count){
		System.out.println(list.size());
		if(left<right||left<0){
			return;
		}
		if(left==0&&right==0){
			String s=String.copyValueOf(str);
			list.add(s);
		}
		else{
			if(left>0){
				str[count]='(';
				addd(list,left-1,right,str,count+1);
			}
			if(right>left){
				str[count]=')';
				addd(list,left,right-1,str,count+1);
			}
		}

	}
	ArrayList<String> getit(int count){
		char str[]=new char[count*2];
		ArrayList<String> list=new ArrayList<String>();
		addd(list,count,count,str,0);
		return list;

	}
	public static void main(String[] args) {
		int c=3;
		br b=new br();
		ArrayList<String> l=b.getit(c);
		for(String ss:l){
			System.out.println(ss);
		}
	}
	
}