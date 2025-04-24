class Solution {
    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder();

        List<String> arr = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                if(word.length() != 0){
                    arr.add(word.toString());
                    word  = new StringBuilder();
                }
                
            }else{
                word.append(c);
            }  
        }

        if(word.length() != 0){
            arr.add(word.toString());
        }

        for(int i = arr.size() -1; i >= 0; i--){
            str.append(arr.get(i));
            if(i != 0){
                str.append(" ");
            }
        }

        return str.toString();
    }
}