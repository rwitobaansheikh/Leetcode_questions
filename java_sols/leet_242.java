package java_sols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class leet_242 {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> letter_set=new HashMap<Character, Integer>();

        if(s.length()!=t.length())
            return(false);

        char[] s_a = s.toCharArray();
        char[] t_a = t.toCharArray();

        for(int i=0;i<s_a.length;i++){
            if(letter_set.containsKey(s_a[i])){
                letter_set.put(s_a[i],letter_set.get(s_a[i])+1);
            }
            else{
                letter_set.put(s_a[i],1);
            }
        }
        
        for(int i=0;i<t_a.length;i++){
            if(letter_set.containsKey(t_a[i])){
                letter_set.put(t_a[i],letter_set.get(t_a[i])-1);;
            }
            else
                return(false);
        }

        for(int i:letter_set.values()){
            if(i!=0)
                return(false);
        }
        return(true);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        leet_242 ob=new leet_242();
        
        System.out.println("Enter 2 Strings:");
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println("The given strings are Anagrams: "+ob.isAnagram(s,t));
    }
}

