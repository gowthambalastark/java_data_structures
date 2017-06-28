class rot{
	int[][] res(int[][] a){
		int r[][]=new int[4][4];
		int c=0,n=4,i,j;
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				r[i][j]=a[n-1-j][i];
		}
	}
	return r;
	}
	public static void main(String[] args) {
		int a[][]=new int[4][4];
		int i,j,c=0;
        for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				c+=1;
				a[i][j]=c;
		}
	}
	rot rrr=new rot();
	int rr[][]=new int[4][4];
	rr=rrr.res(a);// 90*
	int[][] r2=rrr.res(rr);// 180*
	int[][] r3=rrr.res(r2);// 270*
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				System.out.print(r3[i][j]+" ");

		}
		System.out.println();
	}
}
}