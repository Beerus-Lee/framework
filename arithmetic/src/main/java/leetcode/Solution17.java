package leetcode;

//Given a string containing digits from 2-9 inclusive, return all possible
//letter combinations that the number could represent. Return the answer in any order.
//
//
// A mapping of digit to letters (just like on the telephone buttons) is given
//below. Note that 1 does not map to any letters.
//
//
//
//
// Example 1:
//
//
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//
//
// Example 2:
//
//
//Input: digits = ""
//Output: []
//
//
// Example 3:
//
//
//Input: digits = "2"
//Output: ["a","b","c"]
//
//
//
// Constraints:
//
//
// 0 <= digits.length <= 4
// digits[i] is a digit in the range ['2', '9'].
//
// Related Topics 哈希表 字符串 回溯 👍 1457 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null ||digits.length() == 0) {
            return res;
        }
        Map<String,String> digitsMap = new HashMap<>();
        digitsMap.put("2","abc");
        digitsMap.put("3","def");
        digitsMap.put("4","ghi");
        digitsMap.put("5","jkl");
        digitsMap.put("6","mno");
        digitsMap.put("7","pqrs");
        digitsMap.put("8","tuv");
        digitsMap.put("9","wxyz");
        char[] chars = digits.toCharArray();
        rewrite(0,chars,digitsMap,res,"");
        return res;

    }

    public  static void rewrite(int index,char[] chars,Map<String,String> digitsMap,List<String> res, String comb) {
        if (index == chars.length) {
            res.add(comb);
            return;
        }
        char num = chars[index];
        char[] digs = digitsMap.get(Character.toString(num)).toCharArray();
        for (int i = 0 ;i < digs.length ; i ++) {
            comb = comb + digs[i];
            rewrite(index +1,chars,digitsMap,res,comb);
            comb = comb.substring(0,comb.length() - 1);
        }


    }


}
//leetcode submit region end(Prohibit modification and deletion)
