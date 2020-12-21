import java.util.*;

class WordCount{
	
	static String inputString = "rohansharma";
	static char[] charArray;
	static HashMap<Character , Integer> wordMap;
	
	public static void main(String[] args){
		
		wordCountMethod(WordCount.inputString);
		
	}
	
	static void wordCountMethod(String str){
		WordCount.charArray = str.toCharArray();
		WordCount.wordMap = new HashMap<Character , Integer>();
		
		for(char c : WordCount.charArray){
			if(WordCount.wordMap.containsKey(c)){
				WordCount.wordMap.put(Character.toLowerCase(c) , WordCount.wordMap.get(c) + 1);
			}
			else{
				WordCount.wordMap.put(Character.toLowerCase(c) , 1);
			}
		}
		
		display();
		
	}
	
	static void display(){
		Set<Character> wordSet = wordMap.keySet();
		for(Character key : wordSet){
			if(WordCount.wordMap.get(key) > 1){
				System.out.println(key+" : "+WordCount.wordMap.get(key));
			}
		}
	}
	
	

}