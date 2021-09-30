import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Print all the Combinations of Change for a given Amount
 */
 class MoneyChange_BackTrack {

	private static List<Integer> coins; 
	private static int count=0;
	
	/**
	 * Initialising the Coing Denominations
	 */
	private static void init() {
		coins = new ArrayList<Integer>();
		coins.add(500000);
		coins.add(200000);
		coins.add(100000);
		coins.add(50000);
		coins.add(20000);
		coins.add(10000);
        coins.add(5000);
        coins.add(2000);
        coins.add(1000);
	}
	 
	/**
	 * Prints all comninations of the coin change
	 */
	public static void coinCombinations(int amount,int index,LinkedList<Integer> list)
	{
		if(amount==0)
		{
			count++;
			System.out.println(list.toString());
			return ;
		}
		
		if(amount < 0)
			return ;
		
		for(int i=index ; i < coins.size();i++)
		{
			int coin = coins.get(i);
			if(amount >= coin)
			{
				list.add(coin);
				coinCombinations(amount - coin ,i,list );
				list.removeLast();
				
			}
		}
	}
	
	public static void main(String[] args) {
		int amount = 120000;
		init();
		coinCombinations(amount,0,new LinkedList<Integer>());
		System.out.println("Number of Combinations :" + count);
	}
}