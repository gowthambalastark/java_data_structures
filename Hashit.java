import java.util.*;
public class Hashit{
public static void main(String args[]){
int g;String h;
/*
HashMap<Integer,String> a=new HashMap<Integer,String>();
Scanner in = new Scanner(System.in);
for(int i=0;i<5;i++){
g=in.nextInt();
h=in.next();
a.put(g,h);
}
for(Integer k:a.keySet()){
System.out.println(k+" "+ a.get(k));
System.out.println(a.values());
}*/
SortedMap<String,Integer> a=new TreeMap<String,Integer>();
a.put("Fuck",100);
a.put("Gowtham",2);
a.put("Bala",8);
a.put("Strk",4);
if(a.get("Fuckk")!=null){
	System.out.println("Fuck is here");
}
for(String k:a.keySet()){
System.out.println(k+" "+ a.get(k));
}
Set s=new LinkedHashSet();
s.add(1);
s.add(2);
s.add(1);
s.add("Fcu");
Iterator i=s.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
}}
