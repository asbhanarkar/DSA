class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(st.isEmpty()){
                if(c == ')' || c == ']' || c == '}'){
                    return false;
                }
                st.push(c);
            }else{

                if(c == '(' || c == '[' || c == '{'){
                    st.push(c);
                }else{
                    char ch = st.peek();

                    if(!isvalidParantheses(ch, c)){
                        return false;
                    }
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
        
    }
    boolean isvalidParantheses(char c, char t){
            if( c == '(' &&  t == ')'){
                return true;
            }
            if( c == '[' &&  t == ']'){
                return true;
            }
            if( c == '{' &&  t == '}'){
                return true;
            }
            return false;
        }


}