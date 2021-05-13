package org.example;


import java.util.*;

public class LeecodeTest {
    public static void main(String[] args) {
        /**
         *合并有序链表调试
         */
/*        ListNode l1 = new LeecodeTest().new ListNode(1);
        l1.next= new LeecodeTest().new ListNode(2);
        l1.next.next = new LeecodeTest().new ListNode(4);
        ListNode l2 = new LeecodeTest().new ListNode(1);
        l2.next= new LeecodeTest().new ListNode(3);
        l2.next.next = new LeecodeTest().new ListNode(4);
        ListNode resutl = mergeTwoLists(l1,l2);
        while (resutl != null){
            System.out.println(resutl.val);
            resutl =  resutl.next;

        }*/

        /**
         * 外观序列调试
         */
        long startTime=System.currentTimeMillis();//获取开始时间
        //countAndSay(70) 70(13802,2->17307)
        countAndSay2(100);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");




    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        char[] chars2 = new char[chars.length];
        Stack stack1 = new Stack();

        char[] chars3 = new char[chars.length];
        Map<Character,Character> map = new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for (int i = 0 ; i < chars.length ; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '['){
                stack1.push(chars[i]);
            }else if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']'){
                if (!stack1.pop().equals(map.get(chars[i]))) return false;
            }
        }
        return true;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1.next == null) return l2;
        else if (l2.next == null) return l1;
        ListNode pre;
        ListNode temp;

        if (l1.val > l2.val) {
            pre = l2;
            l2 = l2.next;
        }
        else {
            pre = l1;
            l1=l1.next;
        }
        temp = pre;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val) {
                temp.next = l2;
                temp  = temp.next;
                l2 = l2.next;
            }else {
                temp.next = l1;
                temp  = temp.next;
                l1=l1.next;
            }
        }
        temp.next = l1 == null ? l2 : l1;
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static String countAndSay(int n) {
        if (n == 1) return "1";
        StringBuilder sb = new StringBuilder();
        String sn = String.valueOf(countAndSay(n-1));
        int count = 0;
        String temp = "";
        for (int i = 0; i < sn.length(); i++) {
            if (i == sn.length()-1){
                if (count != 0) {
                    count++;
                    sb.append(count).append(temp);
                    continue;
                }else {
                    sb.append("1").append(sn.charAt(i));
                    continue;
                }
            }
            if (sn.charAt(i) == sn.charAt(i+1)) {
                if(temp == "") temp = String.valueOf(sn.charAt(i));
                count++;
            }else {
                if (count != 0 ) {
                    count++;
                    sb.append(count).append(temp);
                    temp = "";
                    count = 0;
                }else {
                    sb.append("1").append(sn.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static String countAndSay2(int n) {
        if (n == 1) return "1";

        //String sn = String.valueOf(countAndSay(n - 1));
        String sn = "1";
        int count = 0;
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for (int j = 2; j <= n; j++) {
            sb.setLength(0);
            System.out.println(sb.length());
            count = 0;
            temp = "";
            for (int i = 0; i < sn.length() - 1; i++) {
                if (sn.charAt(i) == sn.charAt(i + 1)) {
                    if (temp == "") temp = String.valueOf(sn.charAt(i));
                    count++;
                } else {
                    if (count != 0) {
                        count++;
                        sb.append(count).append(temp);
                        temp = "";
                        count = 0;
                    } else {
                        sb.append("1").append(sn.charAt(i));
                    }
                }
            }
            if (count != 0) {
                count++;
                sb.append(count).append(temp);
            } else {
                sb.append("1").append(sn.charAt(sn.length() - 1));
            }
            sn = sb.toString();
        }

        return sn;
    }



}

