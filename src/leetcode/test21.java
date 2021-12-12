package leetcode;

import java.util.Stack;

/*
https://www.nowcoder.com/practice/d8acfa0619814b2d98f12c071aef20d4?tpId=46&&tqId=38944&rp=1&ru=/ta/classic-code&qru=/ta/classic-code/question-ranking
合法括号序列判断
 */
public class test21 {
//    public boolean chkParenthesis(String A, int n){
//        if(A.length()==0)
//            return true;
//
//        char[] s = A.toCharArray();
//        Stack<Character> st = new Stack<Character>();
//        for(char a : s){
//            if(a=='('){
//                st.push(a);
//            }else if(a==')'){
//                if(st.peek() =='('){
//                    st.pop();
//                }
//            }else {
//                return false;
//            }
//        }
//        return st.empty();
//    }

//    public boolean chkParenthesis(String A, int n) {
//        if (A.length() != n) return false;
//        if (A.length() == 0) return true;
//
//        char[] chars = A.toCharArray();
//        Stack<Character> stack = new Stack<>();
//        for (char aChar : chars) {
//            if (aChar == '('){
//                stack.push(aChar);
//            } else if (aChar == ')'){
//                if (!stack.empty() && stack.peek() == '('){
//                    stack.pop();
//                } else {
//                    stack.push(aChar);
//                }
//            } else{
//                return false;
//            }
//        }
//        return stack.empty();
//    }
    public boolean chkParenthesis(String A,int n){
        if(A.length()==0){
            return true;
        }
        if(A.length()!= n){
            return false;
        }

        char[] chars = A.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char aChar : chars){
            if(aChar == '('){
                stack.push(aChar);
            }else if(aChar == ')'){
                if(!stack.empty()&&stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(aChar);
                }
            }else {
                return false;
            }
        }
        return stack.empty();
    }
}
