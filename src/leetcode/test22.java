package leetcode;

import java.util.Stack;

/*
下一个较大元素
[11,13,10,5,12,21,3],7    返回：[13,21,12,12,21,-1,-1]
 */
public class test22 {
    public int[] findNext(int[] A, int n) {
        if(A==null||A.length==0) return null;
        Stack<Integer> stack =new Stack<>();
        int b[] =new int[n];
        for(int end =n-1;end>=0;end--){
            //栈顶的元素值都没有接下来的元素大，那就把出栈，继续比较，直到栈空或者找到比A[end]大的值
            while(!stack.isEmpty()&&A[end]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(A[end]);
                b[end]=-1;
                continue;
            }
            if(A[end]<stack.peek()){
                b[end]=stack.peek();
                stack.push(A[end]);
            }
        }
        return b;
    }
}
