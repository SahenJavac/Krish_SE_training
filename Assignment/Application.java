package com.sahen.letterstonum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chars = word.toCharArray();

        for(Character ch:chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        int totalValue = 0;
        if (map.containsKey('a')||map.containsKey("A")){

            totalValue=totalValue+1*(map.get('a'));
        }
        if (map.containsKey('b')||map.containsKey("B")){

            totalValue=totalValue+2*(map.get('b'));
        }
        if (map.containsKey('c')||map.containsKey("C")){

            totalValue=totalValue+3*(map.get('c'));
        }
        if (map.containsKey('d')||map.containsKey("d")){

            totalValue=totalValue+4*(map.get('d'));
        }
        if (map.containsKey('e')||map.containsKey("E")){

            totalValue=totalValue+5*(map.get('e'));
        }
        if (map.containsKey('f')||map.containsKey("F")){

            totalValue=totalValue+6*(map.get('f'));
        }
        if (map.containsKey('g')||map.containsKey("G")){

            totalValue=totalValue+8*(map.get('g'));
        }
        if (map.containsKey('h')||map.containsKey("H")){

            totalValue=totalValue+9*(map.get('h'));
        }
        if (map.containsKey('i')||map.containsKey("I")){

            totalValue=totalValue+10*(map.get('i'));
        }
        if (map.containsKey('j')||map.containsKey("J")){

            totalValue=totalValue+11*(map.get('j'));
        }
        if (map.containsKey('k')||map.containsKey("K")){

            totalValue=totalValue+12*(map.get('k'));
        }
        if (map.containsKey('l')||map.containsKey("L")){

            totalValue=totalValue+13*(map.get('l'));
        }
        if (map.containsKey('m')||map.containsKey("M")){

            totalValue=totalValue+14*(map.get('m'));
        }

        //have to add capital letters from here
        if (map.containsKey('n')){

            totalValue=totalValue+15*(map.get('n'));
        }
        if (map.containsKey('o')){

            totalValue=totalValue+16*(map.get('o'));
        }
        if (map.containsKey('p')){

            totalValue=totalValue+17*(map.get('p'));
        }
        if (map.containsKey('q')){

            totalValue=totalValue+18*(map.get('q'));
        }
        if (map.containsKey('r')){

            totalValue=totalValue+19*(map.get('r'));
        }
        if (map.containsKey('s')){

            totalValue=totalValue+20*(map.get('s'));
        }
        if (map.containsKey('t')){

            totalValue=totalValue+21*(map.get('t'));
        }
        if (map.containsKey('u')){

            totalValue=totalValue+22*(map.get('u'));
        }
        if (map.containsKey('v')){

            totalValue=totalValue+23*(map.get('w'));
        }
        if (map.containsKey('x')){

            totalValue=totalValue+25*(map.get('x'));
        }
        if (map.containsKey('y')){

            totalValue=totalValue+26*(map.get('y'));
        }
        if (map.containsKey('z')){

            totalValue=totalValue+26*(map.get('z'));
        }

        System.out.println(totalValue);

    }
}
