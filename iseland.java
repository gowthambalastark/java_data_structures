class iseland{
	int C=5,R=5;
	boolean issafe(int[][] l,boolean[][] visited,int row,int col){
		return (row>=0 && row<R && col>=0 && col<C && !visited[row][col] && l[row][col]==1);
	}
	void DFS(int[][] l,boolean[][] visited,int row,int col){
		 int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
         int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
         visited[row][col]=true;
		for(int k=0;k<8;k++){
				if(issafe(l,visited,row+rowNbr[k],col+colNbr[k])){
					DFS(l,visited,row+rowNbr[k],col+colNbr[k]);
				}
			}
		}
	int checkit(int[][] a){
		int c=0;
		boolean visited[][] =new boolean[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(a[i][j]==1 && !visited[i][j]){
					DFS(a,visited,i,j);
					c++;
			}
		}
		}
		return c;
	}
	public static void main(String[] args) {
		iseland ii=new iseland();
		int M[][]=  new int[][] {{1, 1, 0, 0, 0},
                                 {0, 1, 0, 0, 1},
                                 {1, 0, 0, 1, 1},
                                 {0, 0, 0, 0, 0},
                                 {1, 0, 1, 0, 1}
                                };
		int nn=ii.checkit(M);
		System.out.println(nn);
	}
}