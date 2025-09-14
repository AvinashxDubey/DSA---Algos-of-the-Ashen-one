class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] answer = new String[queries.length];
        HashSet<String> exactWords = new HashSet<>();
        HashMap<String, String> lowercase = new HashMap<>();
        HashMap<String, String> vowelInsensitive = new HashMap<>();
        
        for(String word : wordlist){
            exactWords.add(word);

            String lowercased = word.toLowerCase();
            lowercase.putIfAbsent(lowercased, word);

            String devoweled = devowel(lowercased);
            vowelInsensitive.putIfAbsent(devoweled, word);
        }

        for(int i=0; i<queries.length; i++){
            String query = queries[i];
            if(exactWords.contains(query)){
                answer[i] = query;
            } else{
                String lowercased =  query.toLowerCase();
                if(lowercase.containsKey(lowercased)){
                    answer[i] = lowercase.get(lowercased);
                } else {
                    String devoweled = devowel(lowercased);
                    answer[i] = vowelInsensitive.getOrDefault(devoweled, "");
                }
            }
        }

        return answer;
    }

    public String devowel(String word){
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder();
        
        for(char ch : word.toCharArray()){
            if(vowels.indexOf(ch)>=0){
                sb.append('*');
            } else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}