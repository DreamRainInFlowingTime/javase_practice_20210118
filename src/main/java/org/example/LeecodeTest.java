package org.example;

import java.util.*;

public class LeecodeTest {
    public static void main(String[] args) {
        //System.out.println((-205)%10);
        String a = "a{s}d[f]a(sd)f";
        System.out.println(a.toCharArray()[2]);
        System.out.println(a.toCharArray().toString());
        for (char c : a.toCharArray()) {
            System.out.print(c);
        }
        List list = Arrays.asList(a.toCharArray());
        for (Object o : list) {
            System.out.print(o.toString());
        }
        Collections.sort(list);
        for (Object o : list) {
            System.out.print(o.toString());
        }


        //System.out.println(a.replace("()","o"));
        String b[] = a.split("as");
        for (String s : b) {
           // System.out.println(s);
        }
        //System.out.println(a.startsWith("as", 2));
        System.out.println(isValid("()"));



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
}

