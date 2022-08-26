package com.sample.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_words {
	public static void main(String[] args) {
		String s ="java selenium java selenium selenium maven";
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		// 1. Take first word
		// 2. compare with other words
		// 3. increase the count if both match
		
		String[] allwords = s.split(" "); //Sorting multiple values in single
		for (String word : allwords) {
			
			if (m.containsKey(word))
			{
			Integer value = m.get(word);
			m.put(word, value+1);
			}
			else {
				m.put(word, 1);
			}
					
		}
		System.out.println(m);   

		Set<Entry<String, Integer>> entrySet = m.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println(entry);																																																																																																																																																																									
	}		
	}
	
	}
	}
