import java.util.*;
public class a{
     public static void main(String []args){
         String s="011";
         int a=0,b=0,i;
         char[] c=s.toCharArray();
         for(i=c.length-1;i>0;i--){
             if(c[i]=='0'){
                 a+=1;
             }
             else{
                 if(c[i-1]=='0'){
                    System.out.println(b);
                     break;
                 }
                 b+=1;
             }
             }
             c[i-1]='1';
             c[i]='0';
             for(i=0;i<b;i++){
                 c[(c.length-1)-i]='1';
             }
             for(int j=0;j<a;j++){
                 c[((c.length-1)-b)-j]='0';
             }
             String ss=new String(c);
        System.out.println(ss);
     }
}