package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		/*int[] results = new int[6];
		for(int idx = 0; idx < 10000; idx ++)
		{	
			int result = rollUnfairDie();
			System.out.println("Roll #" +  (idx + 1) + " : " + result);
			results[result -1] ++;
		}
		for(int i = 0; i < 6; i ++)
			System.out.println((i + 1) + " appreared " + results[i] + " times");*/
		
		System.out.println(randomCard());
	}
	
	public static int rollFairDie()
	{
		//double rand = Math.random();//returns double (0,1)
		//return (int)(6 * rand) + 1;//[1,6]
		
		return (int)(6 * Math.random()) + 1;
	}
	
	public static int rollUnfairDie()
	{
		int[] unfairDie = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6};
		/*double rand = Math.random();
		/*int roll = (int)(unfairDie.length * rand);
		
		return unfairDie[roll];*/
		
		return unfairDie[(int)(unfairDie.length * Math.random())];
	}
	
	public static String randomCard()
	{
		String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
		String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		return "The " + value[(int)(value.length * Math.random())] + " of " + suits[(int)(suits.length * Math.random())];
	}
}
