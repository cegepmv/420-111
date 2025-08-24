package cours420111.solutions.serie10;

public class solution10_16 {
    public static void main(String[] args) {
        System.out.println(replaceLetterInWord("banana", 'a', 'o'));
    }

    public static String replaceLetterInWord(String word, char oldLetter, char newLetter){
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == oldLetter){
                newWord += newLetter;
            }
            else{
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }
}
