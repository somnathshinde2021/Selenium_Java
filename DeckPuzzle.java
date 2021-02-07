import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Map<String,String>> deck=new ArrayList<Map<String,String>>();
		
		String[] suits=new String[]{"club","diamond","heart","spade"};
		
		
		String[] ranks=new String[]{"ace","deuce","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
		
		for(int suitCounter=0;suitCounter<suits.length;suitCounter++)
		{
			
		for(int rankCounter=0;rankCounter<ranks.length;rankCounter++){
			
			Map<String,String> card=new HashMap<String,String>();
			card.put("suit", suits[suitCounter]);
			card.put("rank", ranks[rankCounter]);
			deck.add(card);
		}
	 }

	//print deck
	for(int i=0;i<deck.size();i++)
	{
		System.out.println(deck.get(i).get("rank")+"["+deck.get(i).get("suit")+"]");
	}
	}
}
