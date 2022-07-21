package com.xiancommon.utils.algorithm.longestCommonPrefix;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String longStr = "";
        if(strs == null || strs.length == 0) {
            longStr =  "";
        }
        int len = strs.length;
        if (len == 1) {
            longStr = strs[0];
        }
        if (len > 1) {
            int minLen = strs[0].length();
            for (int i = 1; i < len;i++) {
                minLen = Math.min(strs[i].length(),minLen);
            }

            for (int j = 1;j < minLen;j++) {
                longStr = strs[0].substring(0,j);
                for (int k = 1;k < len;k++) {
                    if (!longStr.equals(strs[k].substring(0,j))) {
                        return longStr.substring(0,longStr.length() -1);
                    }
                }
            }

        }
        return longStr;
    }
}
