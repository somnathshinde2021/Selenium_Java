
		public class CoinsPuzzle
		{
		public static void main(String[] args)
		{
			boolean coins[]=new boolean[1101];
			
			
			for(int PersonCounter=1;PersonCounter<=1100;PersonCounter++)
			{

				for(int coinCounter=PersonCounter;coinCounter<coins.length;coinCounter+=PersonCounter)
				{
					coins[coinCounter]=PersonCounter==1?false:!coins[coinCounter];
				}
				
					//count heads (false value)
				int totalHeads=0;
				
				for(int i=1;i<coins.length;i++)
				{
					totalHeads=totalHeads+(coins[i]?0:1);
					
				}
				
				
				System.out.println("total Heads "+totalHeads);
			}

		
			
			}

}
