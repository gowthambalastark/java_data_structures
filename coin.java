class coin{
	int denim(int n,int denem){
		int next=0;
		switch(denem){
			case 25:
			next=10;
			break;
			case 10:
			next=5;
			break;
			case 5:
			next=1;
			break;
			case 1:
			return 1;
		}
		int ways=0;
		for(int i=0;n>=i*denem;i++){
			ways+=denim(n-i*denem,next);
		}
		return ways;
	}
	public static void main(String[] args) {
		coin c=new coin();
		System.out.println(c.denim(100,5));
	}
}