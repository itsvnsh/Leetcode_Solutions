class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer>stack=new ArrayDeque<>();
        int total=0;

        for(int i =0;i<tokens.length;i++){
            String token=tokens[i];
            if(token.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                total=a+b;
                stack.push(total);

            }
            else if(token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                total=b-a;
                stack.push(total);

            }
            else if(token.equals("*")){
                int a =stack.pop();
                int b = stack.pop();
                total=a*b;
                stack.push(total);
                
            }
            else if(token.equals("/")){
                int a = stack.pop();
                int b =stack.pop();
                total=b/a;
                stack.push(total);

            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}