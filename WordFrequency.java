import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
  
  
  //Программа для подсчета слов в файле input.txt:
    public class WordFrequency {
        public static void main(String[] args) {
            try {
                File file = new File("input.txt");
                Scanner scanner = new Scanner(file);
                Map<String, Integer> wordFrequency = new HashMap<>();
    
                while (scanner.hasNext()) {
                    String word = scanner.next().toLowerCase();
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
    
                for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                    System.out.println("Слово \"" + entry.getKey() + "\" встречается " + entry.getValue() + " раз");
                }
    
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
        }
    }