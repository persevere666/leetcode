package com.learn.leetcode;

/**
 * _043_MultiplyStrings
 */
public class _0043_MultiplyStrings {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[]mul = new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            int cur1 = Integer.valueOf(""+num1.charAt(i));
            int carry = 0;
            System.out.println("i="+i+",cur1="+cur1);
            for(int j=n2-1;j>=0;j--){
                int idx = i+j+1;
                int prev = mul[idx];
                int cur2 = Integer.valueOf(num2.substring(j, j+1));
                int mult = cur1*cur2+carry+prev;
                carry = mult/10;
                mul[idx] = mult%10;
                System.out.println("  j="+j+",cur2="+cur2+",prev="+prev+",mult="+mult+",carry="+carry+",idx="+idx+",mul="+mul[idx]);
            }
            if(carry>0){
                mul[i] = carry;
                System.out.println("    idx="+i+",mul="+mul[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean leading = true;
        for(int i=0; i<n1+n2; i++){
            if(mul[i]==0 && leading){
                continue;
            }
            leading = false;
            sb.append(mul[i]);
        }
        if(sb.length()==0){
            return "0";
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        _0043_MultiplyStrings solution = new _0043_MultiplyStrings();
        String res = solution.multiply(num1, num2);
        System.out.println(res);
    }
}
