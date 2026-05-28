package String;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "pranav";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        // System.out.print(s);
        StringBuilder sb = new StringBuilder("mehta");
        char[] arr = sb.toString().toCharArray();
    }
}
