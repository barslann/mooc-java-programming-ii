
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class DictionaryOfManyTranslations {
    
     private HashMap<String, ArrayList<String>> dictionaries;

    public DictionaryOfManyTranslations() {
        this.dictionaries = new HashMap<>();
    }
    
    public void add(String word, String translation){
         dictionaries.putIfAbsent(word, new ArrayList<>());
         dictionaries.get(word).add(translation);   
    }
    
//    public void display(){
//        for (String string : dictionaries.keySet()) {
//            System.out.println(string + ": " + dictionaries.get(string));
//        }
//        
//    }
    
    public ArrayList<String> translate(String word){
//        if (dictionaries.containsKey(word)) {
//            return dictionaries.get(word);
//        }else{
//            return new ArrayList<>();
//        }

        return dictionaries.getOrDefault(word, new ArrayList<>());
        
    }
    
    public void remove(String word){
        dictionaries.remove(word);
    }
     
     
    
}
