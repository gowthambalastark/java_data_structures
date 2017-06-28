import java.util.*;
class nqueen{
	int size=8;
	ArrayList<Integer[]> result=new ArrayList<Integer[]>();
	void placequeen(int row,Integer[] columns){
		if(row==size){
			result.add(columns.clone());
		}
		else{
			for(int col=0;col<size;col++){
				if(checkvalid(columns,row,col)){
					columns[row]=col;
					placequeen(row+1,columns);
				}
			}
		}
	}
	boolean checkvalid(Integer[] columns,int row1,int col1){
		for(int row2=0;row2<row1;row2++){
			int col2=columns[row2];
			if(col1==col2){
				return false;
			}
			int columdistance=java.lang.Math.abs(col1-col2);
			int rowdistrance=row1-row2;
			if(columdistance==rowdistrance){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		nqueen n=new nqueen();
		Integer[] c=new Integer[8];
		ArrayList<Integer[]> b=new ArrayList<Integer[]>();
		c[0]=0;c[1]=0;c[2]=0;c[3]=0;c[4]=0;c[5]=0;c[6]=0;c[7]=0;
		n.placequeen(0,c);
		b=n.result;
		int count=0;
		for(Integer[] k:b){
			count+=1;
			int r=0;
				for(Integer l:k){
					System.out.print(r+" "+l);
					r++;
					System.out.println();
				}
				System.out.println();
			}
			System.out.println(count);
	}
}