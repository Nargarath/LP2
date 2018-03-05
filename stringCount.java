
import java.util.*;
public class stringCount
{
    private String[] text;
    private Hashtable<String,Integer> dictionary = new Hashtable<String, Integer>();
    public stringCount(String t){
        this.text = t.split("\\s+");
        this.addToHashTable();
    }

    public void addToHashTable(){
        for(int i = 0 ;i < this.text.length; i++){
            Integer valor = this.dictionary.get(this.text[i]);
            if(valor != null){
                this.dictionary.put(this.text[i],this.dictionary.get(this.text[i])+1);
            }else{
                this.dictionary.put(this.text[i],1);
            }
        }
    }

    public void ImprimeHash(){
        System.out.println(this.dictionary);
    }
    





}
