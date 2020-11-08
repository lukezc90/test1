package ieheima.interview;

/*
实现 MyQueue 类：

void push(int x) 将元素 x 推到队列的末尾
int pop() 从队列的开头移除并返回元素
int peek() 返回队列开头的元素
boolean empty() 如果队列为空，返回 true ；否则，返回 false

 */

import java.util.Stack;

/*
2个栈实现队列
 */
public class test6 {
    /*
    入队push
     */
    private int front;
    private Stack<Integer> s1=new Stack<>(); //入栈
    private Stack<Integer> s2=new Stack<>();//出栈




    public void push(int x){
        if(s1.empty())
            front =x;
        s1.push(x);
    }

    /*
    出队POP
     */

    public void pop() {
//        s1.pop();
//        if (!s1.empty())
//            front = s1.peek();
        if(s2.empty()){
            while (!s1.empty()){
                s2.push(s1.pop());
            }

        }
        s2.pop();

    }

    /*
    判断空
    s1 和 s2 都存有队列的元素，所以只需要检查 s1 和 s2 是否都为空就可以了。
     */

    public boolean empty() {
//        if (s1.empty() && s2.empty()){
//            return true;
//        }
//        return false;
        return s1.empty() && s2.empty();
    }

    /*
    取队首元素peek
    我们定义了 front 变量来保存队首元素，每次 入队 操作我们都会随之更新这个变量。当 s2 为空，front 变量就是对首元素，当 s2 非空，s2 的栈顶元素就是队首元素。

     */
    public int peek() {
        if (!s2.empty()){
            return s2.peek();
            }
        return front;
    }

}
