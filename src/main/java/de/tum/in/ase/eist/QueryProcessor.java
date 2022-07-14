package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } if (query.contains("name")) {
           return "app-eistea";
        } if (query.contains("numbers")) { // TODO extend the programm here
            if (query.contains("largest")) {
                String newQuery = query.split(":");
                char[] letters = newQuery.toCharArray();
                int result = 0;
                for (int i = 0; i <= letters.length - 1; i++) {
                    if (Integer.parseInt(letters[i]) > result) {
                        result = Integer.parseInt(letters[i]);
                    }
                }
                return String.valueOf(result);
            }
        }
    }
}
