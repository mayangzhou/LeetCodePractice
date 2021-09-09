package T51to100.T65;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isNumber(String s) {
        int state  = 0;
        Set<Character> isDigit = new HashSet<>(10);
        for (int i = 0; i < 10; i++) {
            isDigit.add((char)('0'+i));
        }
        for (char c:s.toCharArray()
             ) {
            switch (state){
                case 0:
                    if (isDigit.contains(c)){
                        state = 2;
                    }else if (c == '+' || c == '-'){
                        state = 1;
                    }else if (c == '.'){
                        state = 3;
                    }else {
                        return false;
                    }
                    break;
                case 1:
                    if (isDigit.contains(c)){
                        state = 2;
                    }else if (c == '.'){
                        state = 3;
                    }else{
                        return false;
                    }
                    break;
                case 2:
                    if (isDigit.contains(c)){
                        state =2;
                    }else if (c == '.'){
                        state = 3;
                    }else if (c == 'e' || c == 'E'){
                        state = 5;
                    }else {
                        return false;
                    }
                    break;
                case 3:
                    if (isDigit.contains(c)){
                        state =4;
                    }else {
                        return false;
                    }
                    break;
                case 4:
                    if (isDigit.contains(c)){
                        state = 4;
                    }else if (c == 'e' || c == 'E'){
                        state = 5;
                    }else {
                        return false;
                    }
                    break;
                case 5:
                    if (c == '+' || c == '-'){
                        state = 7;
                        break;
                    }
                case 6:
                case 7:
                    if (isDigit.contains(c)){
                        state = 6;
                    }else {
                        return false;
                    }
                    break;


            }
        }
        return state == 2 || state == 4 || state == 6 || state == 3;
    }
}
