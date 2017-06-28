import java.util.*;
class Bracket{
static class Stack{
char[] stack=new char[100];
int top=-1;
public void insert(char a){
if(top!=100){
top+=1;
stack[top]=a;}
else{
System.out.println("FULL");}
}
public char pop(){
if(top!=-1){
char x=stack[top];
top-=1;
return x;
}
return '0';}
public boolean checkit(char g, char h){
//System.out.println(g+" "+h);
if(g=='{' && h=='}'){
return true;}
else if(g=='(' && h==')'){
return true;}
else if(g=='[' && h==']'){
return true;}
else{
return false;}
}
}
public static void main(String args[]){
Stack s=new Stack();
int f=0;
Scanner in = new Scanner(System.in);
String u=in.next();
char c[]=u.toCharArray();
for(int i=0;i<c.length;i++){
if(c[i]=='[' || c[i]=='(' || c[i]=='{'){
s.insert(c[i]);}
else{
char g=s.pop();
//System.out.println(g);
if(s.checkit(g,c[i])){
continue;
}
else{
f=1;
break;}
}

}
if(f==0 && s.top==-1){
System.out.println("Fuck Yeah");}
else{
System.out.println("Fuck Nah");}
}
}



