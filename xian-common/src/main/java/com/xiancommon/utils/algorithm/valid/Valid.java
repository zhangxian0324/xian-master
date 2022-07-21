package com.xiancommon.utils.algorithm.valid;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/valid-parentheses
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author zhangxian
 */

public class Valid {

    public boolean valid(String s) {
        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }
        HashMap<Character,Character> map = new HashMap<Character,Character>() {{
            put(')','(');
            put('}','{');
            put(']','{');
        }};

        Deque<Character> deque = new LinkedList<Character>();
        for (int i = 0;i < len;i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (deque.isEmpty() || !deque.peek().equals(map.get(ch))) {
                    return false;
                }
                deque.pop();
            } else {
                deque.push(ch);
            }
        }
        return deque.isEmpty();
    }
}
