package Homework.Homework_5;

class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter sentence: ");
        String sentence = Input.sc.nextLine();

        System.out.println("Enter word: ");
        String wordToSearch = Input.sc.nextLine();

        System.out.println("Does the word occurs in the sentence: ");
        boolean containsWord = sentence.contains(wordToSearch);
        System.out.println(containsWord);

        if(containsWord) {
            System.out.println("At what position: ");
            System.out.println(sentence.indexOf(wordToSearch));
        }

        Input.scannerClose();
    }
}
