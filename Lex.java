import java.util.*;
import java.io.*;
class Lex{
public static void main(String args[]){
int n;
Scanner in=new Scanner(System.in);
//n=in.nextInt();
//for(int j=0;j<n;j++){
String g="",gg="",ss="",tt="",kk="",zz="";
StringBuilder f=new StringBuilder("");
String s="dkhc";
char a[]=s.toCharArray();
Arrays.sort(a);
for(int k=s.length()-1;k>=0;k--){
    ss+=a[k];
}
//System.out.println(s+"\n"+ss);
if(ss.equals(s)){
System.out.println("Nope");
}
else{
for(int i=s.length()-1;i>=0;i--){
g=s.substring(i,s.length());
char[] x=g.toCharArray();
Arrays.sort(x);
gg="";
for(int k=x.length-1;k>=0;k--){
    gg+=x[k];
}
if(!g.equals(gg)){
//System.out.println(gg+" "+g);
g=tt;
break;
}
tt=g;
}
String t=s.substring(0,s.length()-g.length());
System.out.println(g);
for(int i=g.length()-1;i>=0;i--){
//System.out.println(t.charAt(t.length()-1)+" "+g.charAt(i));
if(t.charAt(t.length()-1)<g.charAt(i)){
f=new StringBuilder(t+g);
char q=g.charAt(i);
char w=t.charAt(t.length()-1);
//System.out.println(t.charAt(t.length()-1)+" "+g.charAt(i));
//System.out.println(t);
StringBuilder xx=new StringBuilder(t);
StringBuilder yy=new StringBuilder(g);
xx.setCharAt(t.length()-1,q);
yy.setCharAt(i,w);
kk=yy.toString();
zz=xx.toString();
char[] rr=kk.toCharArray();
kk="";
Arrays.sort(rr);
kk=new String(rr);
f=new StringBuilder(xx+kk);
break;
}
}
}
System.out.println(f);
}
}
