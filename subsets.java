import java.util.*;
class subsets{
	ArrayList<ArrayList<Integer>> all(ArrayList<Integer> m,int index){
		ArrayList<ArrayList<Integer>> allsubsets;
			if(m.size()==index){
			allsubsets=new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());

		}
		else{
			allsubsets=all(m,index+1);
			int item=m.get(index);
			ArrayList<ArrayList<Integer>> moresubsets=new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:allsubsets){
				ArrayList<Integer> newsubset=new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
					return allsubsets;
	}
	public static void main(String[] args) {
		subsets a=new subsets();
		ArrayList<Integer> c=new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		//c.add(4);
		ArrayList<ArrayList<Integer>> bb=a.all(c,0);
		for(ArrayList<Integer> b:bb){
			System.out.print(b+",");
					}
	}
}