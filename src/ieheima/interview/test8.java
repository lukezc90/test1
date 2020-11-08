package ieheima.interview;

import java.util.Stack;

/*
有效的括号
 */
public class test8 {
    public static boolean isValid(String s){
        //思路:遇到左括号就入栈，遇到右括号进行匹配，匹配成功，弹出栈顶
        //一直匹配到栈中没有元素，才算成功
        Stack<Character> stack = new Stack<Character>();
        //再以下过程当中发现不匹配直接return false
        for(int i=0;i<s.length();i++){
            //左括号入栈
            char tmp = s.charAt(i);
            if(tmp=='(' || tmp == '[' || tmp == '{'){
                stack.push(tmp);
            }else {
                //判断栈是否为空
                if(stack.empty()){
                    return false;
                }else {
                    //3、判断栈顶元素的字符左括号和当前的字符 右括号是否匹配
                    char cur = s.charAt(i);
                    char topcur = stack.peek();
                    if(cur ==')'&&topcur=='('||cur == ']' && topcur == '[' || cur == '}' && topcur == '{'){
                        stack.pop();
                    }else {
                        return false;
                    }

                }
            }

        }
        if(!stack.empty()){
            return false;
        }
        System.out.println("括号匹配");
        return true;
    }
}
