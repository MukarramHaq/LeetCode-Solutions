class Solution {
    public boolean isValid(String s) {

        int len = s.length();
        if(len % 2 != 0){
            return false;
        }

        Stack<Character> myStack = new Stack<>();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                myStack.push(s.charAt(i));
            }else if(myStack.isEmpty()){
                return false;
            }else if(myStack.peek() == '(' && s.charAt(i) == ')'){
                myStack.pop();
            }else if(myStack.peek() == '{' && s.charAt(i) == '}'){
                myStack.pop();
            }else if(myStack.peek() == '[' && s.charAt(i) == ']'){
                myStack.pop();
            }else{ //The brackets don't match so return false.
                return false;
            }
        }

        return myStack.isEmpty();

    }
}