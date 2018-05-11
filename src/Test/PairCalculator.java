package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairCalculator {
	
	private int[] a;
	private int sum;
	
	public int[] getA() {
		return a;
	}
	
	public void setA(int[] a) {
		this.a =a;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum=sum;
	}

	
	public PairCalculator(int[] a, int sum) {
		this.setA(a);
		this.setSum(sum);
	}
	
	
	//To set input values
	public void setInput(int[] a, int sum) {
		this.setA(a);
		this.setSum(sum);
	}
	
	public List<Pair> CalculatePairs()	{
		List<Pair> pairs = new ArrayList<Pair>();
		Set<Integer> set = new HashSet<Integer>();
		
		for (int x: a) {
						
			if(set.contains(sum-x)) {
				pairs.add(new Pair(x,sum-x));
			}
			else {
				set.add(x);
			}
		}
		return pairs;
		
	}
	
	//to return the 
	public String getOutput() {
		List<Pair> result = CalculatePairs();
		StringBuilder output =new StringBuilder();
		
		for(Pair p : result ) {
			if(output.length()!=0) {
				output.append(",");
			}
			output.append(p);
		}
		
		return output.toString();
	}

	public static void main(String[] args) {
        int[] a= { 1,8,2,3,5,7};
        int sum=10;
        String result = new PairCalculator(a, sum).getOutput();
        
	}

}
