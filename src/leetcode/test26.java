package leetcode;

import java.util.*;
/*
有效括号序列
描述
给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 */
public class test26 {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            // 碰到左括号，就把相应的右括号入栈
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
                // 如果是右括号判断是否和栈顶元素匹配
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        // 最后判断栈中元素是否匹配
        return stack.isEmpty();
    }
}
