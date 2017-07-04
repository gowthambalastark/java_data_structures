class LCS{
	int lcslength(char[] a,char[] b){
		int l[][]=new int[a.length+1][b.length+1];
		for(int i=0;i<=a.length;i++){
			for(int j=0;j<=b.length;j++){
				if(i==0 || j==0){
				l[i][j]=0;					
				}
				else if(a[i-1]==b[j-1]){
					l[i][j]=l[i-1][j-1]+1;
				}
				else{
					l[i][j]=java.lang.Math.max(l[i-1][j],l[i][j-1]);
				}
			}
		}
		return l[a.length][b.length];
	}
	public static void main(String[] args) {
	LCS ll=new LCS();
	String s1 = "AGGTAB";
    String s2 = "GXTXAYB";
 
    char[] X=s1.toCharArray();
    char[] Y=s2.toCharArray();
 
    System.out.println("Length of LCS is" + " " +
                                  ll.lcslength( X, Y ) );
		
	}
}