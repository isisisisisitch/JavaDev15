package ca.bytetube._20_collections;

import java.util.*;

public class CountNumOfCharInString {

    public static void main(String[] args) {
        String s = "aaabcdessf";
        //a:11
        //b:22

        List<Node> list = countNumOfCharInString(s);
        System.out.println(list);
    }

    public static List<Node> countNumOfCharInString(String s){
        if (s == null ) throw new RuntimeException("string can not be null");
        List<Node> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Node node = new Node();
            node.setKey(chars[i]);
            if (list.contains(node)) {//node address
                list.get(list.indexOf(node)).value += 1;
            }else {
                node.setValue(1);
                list.add(node);
            }
        }
        return list;
    }

    private static class Node{
        Character key;
        Integer value;

        public Character getKey() {
            return key;
        }

        public void setKey(Character key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;

            return this.key == node.key;
        }

        @Override
        public String toString() {
            return "key=" + key + ", value=" + value;
        }
    }



    public static Map<Character,Integer> countNumOfCharInString1(String s){
        if (s == null ) throw new RuntimeException("string can not be null");
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (map.containsKey(ch)) map.put(ch,map.get(ch) + 1);
            else map.put(ch,1);
        }
        return map;
    }


    public static Map<Character,Integer> countNumOfCharInString2(String s){
        if (s == null ) throw new RuntimeException("string can not be null");
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (map.get(ch) == null) map.put(ch,0);
            map.put(ch,map.get(ch) + 1);
        }

        return map;
    }


}
