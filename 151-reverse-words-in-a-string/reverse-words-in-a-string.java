class Solution {
    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder();

        List<String> arr = new ArrayList<>();
        String word ="";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                if(word != ""){
                    arr.add(word);
                    word = "";
                }
                
            }else{
                word = word + c;
            }  
        }

        if(word != ""){
            arr.add(word);
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