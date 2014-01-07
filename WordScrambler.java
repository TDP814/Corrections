public class WordScrambler{
	private String[] scrambledWords;

	public WordScrambler(String[] wordArr){
		scrambledWords = mixedWords(wordArr);
	}

	private String recombine(String word1, String word2){
		return word1.substring(0,word1.length()/2) + word2.substring(word2.length()/2,word2.length());
	}

	private String[] mixedWords(String[] words){
		String[] mixed = new String[words.length];
		for (int i=0; i<words.length; i+=2) {
			mixed[i] = recombine(words[i], words[i+1]);
			mixed[i+1] = recombine(words[i+1], words[i]);
		}
		return mixed;
	}

	public String[] scrambledWords(){
		return scrambledWords;
	}

	public static void main(String[] args) {
		String[] wow = {"apple", "pear", "this", "cat"};
		WordScrambler w = new WordScrambler(wow);

		wow = w.scrambledWords();
		for (int i=0; i<wow.length; i++) {
			System.out.println(wow[i]);
		}
	}
}