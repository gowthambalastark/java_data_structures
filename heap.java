import java.util.*;
class heap{
    ArrayList<Integer> items = new ArrayList<Integer>();
    void heapify(){
    	int k=items.size()-1;
        while(k>0){
        	int p=(k-1)/2;
        	if(items.get(k)>items.get(p)){
        		Integer t=items.get(p);
        		items.set(p,items.get(k));
        		items.set(k,t);
        		k=p;
    	}
    	else{
    		break;
    		}
        }   
    }
    void del(){
    	int k=0;
    	int l=(k*2)+1;
    	while(l<items.size()){
    		int max=l;
    		if((l+1)<items.size()){//chk_for_ri8_child
    			if(items.get(l+1)>items.get(max)){//if_ri8_one_big_max=ri8
    				max++;
    			}
    		}
    		if(items.get(max)>items.get(k)){
    			Integer t=items.get(k);
    			items.set(k,items.get(max));
    			items.set(max,t);
    			k=max;
    			l=2*k+1;
    		}
    		else{
    			break;
    		}
    	}
    }
	void insert(Integer e){
		items.add(e);
		heapify();
	}
	Integer pop(){
		if(items.size()==0){
			return -1;
		}
		else if(items.size()==1){
	        return items.remove(0);
		}
	    Integer k=items.get(0);
	    items.set(0,items.remove(items.size()-1));
	    del();
	    return k;
	}
	public static void main(String[] args) {
		heap h=new heap();
		h.insert(45);
		h.insert(32);
		h.insert(12);
		h.insert(9);
		h.insert(66);
		System.out.println(h.pop());
		System.out.println(h.pop());
		System.out.println(h.pop());
		System.out.println(h.pop());
		System.out.println(h.pop());
		//System.out.println(h.pop());
	}
}