package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class cod extends AppCompatActivity {
    private static Integer abs(int i) {
        if(i < 0){i*=(-1);}
        return i;
    }

    public static ArrayList<Integer> dis(ArrayList<Integer> list1) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (i < list1.size() / 3)
                a += (list1.get(i)) * (Math.pow(10,(list1.size() / 3) - i));
            else if ((i >= list1.size() / 3) & (i < (list1.size() / 3) * 2))
                b += (list1.get(i)) * (Math.pow(10,(list1.size() / 3) * 2 - i));
            else
                c += (list1.get(i)) * (Math.pow(10,list1.size() - i));
        }
        int diskr = b * b - 4 * a * c;
        if (diskr < 0) {
            list1.clear();
            list1.add(a);
            list1.add(b);
            list1.add(c);
            return list1;
        } else if (diskr == 0) {
            list1.clear();
            list1.add(a);
            list1.add(abs(-b / (a * 2)));
            list1.add(c);
            return list1;
        } else {
            list1.clear();
            list1.add(abs((int) ((-b - Math.round(Math.sqrt(diskr))) / (a * 2))));
            list1.add(b);
            list1.add(abs((int) ((-b + Math.round(Math.sqrt(diskr))) / (a * 2))));
            return list1;
        }
    }

    public static String pis(String str1){
        int b = 0;
        while ((str1.length() % 3) != 0)
        {
            if (b == 0)
            {
                str1 = str1.substring(0,str1.length() - 1);
                b = 1;
            }
            else
            {
                str1 = str1.substring(1,str1.length());
                b = 0;
            }
        }
        return str1;
    }

    public static List strtolstws(String str1){
        List list1 = new ArrayList();
        for (int i = 0; i < (int) str1.length(); i++) {
            switch (str1.charAt(i))
            {
                case 'a':
                    list1.add(1);
                    break;
                case 'b':
                    list1.add(2);
                    break;
                case 'c':
                    list1.add(3);
                    break;
                case 'd':
                    list1.add(4);
                    break;
                case 'e':
                    list1.add(5);
                    break;
                case 'f':
                    list1.add(6);
                    break;
                case 'g':
                    list1.add(7);
                    break;
                case 'h':
                    list1.add(8);
                    break;
                case 'i':
                    list1.add(9);
                    break;
                case 'j':
                    list1.add(10);
                    break;
                case 'k':
                    list1.add(11);
                    break;
                case 'l':
                    list1.add(12);
                    break;
                case 'm':
                    list1.add(13);
                    break;
                case 'n':
                    list1.add(14);
                    break;
                case 'o':
                    list1.add(15);
                    break;
                case 'p':
                    list1.add(16);
                    break;
                case 'q':
                    list1.add(17);
                    break;
                case 'r':
                    list1.add(18);
                    break;
                case 's':
                    list1.add(19);
                    break;
                case 't':
                    list1.add(20);
                    break;
                case 'u':
                    list1.add(21);
                    break;
                case 'v':
                    list1.add(22);
                    break;
                case 'w':
                    list1.add(23);
                    break;
                case 'x':
                    list1.add(24);
                    break;
                case 'y':
                    list1.add(25);
                    break;
                case 'z':
                    list1.add(26);
                    break;
                case 'A':
                    list1.add(27);
                    break;
                case 'B':
                    list1.add(28);
                    break;
                case 'C':
                    list1.add(29);
                    break;
                case 'D':
                    list1.add(30);
                    break;
                case 'E':
                    list1.add(31);
                    break;
                case 'F':
                    list1.add(32);
                    break;
                case 'G':
                    list1.add(33);
                    break;
                case 'H':
                    list1.add(34);
                    break;
                case 'I':
                    list1.add(35);
                    break;
                case 'J':
                    list1.add(36);
                    break;
                case 'K':
                    list1.add(37);
                    break;
                case 'L':
                    list1.add(38);
                    break;
                case 'M':
                    list1.add(39);
                    break;
                case 'N':
                    list1.add(40);
                    break;
                case 'O':
                    list1.add(41);
                    break;
                case 'P':
                    list1.add(42);
                    break;
                case 'Q':
                    list1.add(43);
                    break;
                case 'R':
                    list1.add(44);
                    break;
                case 'S':
                    list1.add(45);
                    break;
                case 'T':
                    list1.add(46);
                    break;
                case 'U':
                    list1.add(47);
                    break;
                case 'V':
                    list1.add(48);
                    break;
                case 'W':
                    list1.add(49);
                    break;
                case 'X':
                    list1.add(50);
                    break;
                case 'Y':
                    list1.add(51);
                    break;
                case 'Z':
                    list1.add(52);
                    break;
                case '0':
                    list1.add(53);
                    break;
                case '1':
                    list1.add(54);
                    break;
                case '2':
                    list1.add(55);
                    break;
                case '3':
                    list1.add(56);
                    break;
                case '4':
                    list1.add(57);
                    break;
                case '5':
                    list1.add(58);
                    break;
                case '6':
                    list1.add(59);
                    break;
                case '7':
                    list1.add(60);
                    break;
                case '8':
                    list1.add(61);
                    break;
                case '9':
                    list1.add(62);
                    break;
                case '!':
                    list1.add(63);
                    break;
                case '@':
                    list1.add(64);
                    break;
                case '#':
                    list1.add(65);
                    break;
                case '$':
                    list1.add(66);
                    break;
                case '%':
                    list1.add(67);
                    break;
                case '&':
                    list1.add(68);
                    break;
                case '*':
                    list1.add(69);
                    break;
                case '(':
                    list1.add(70);
                    break;
                case ')':
                    list1.add(71);
                    break;
                case '-':
                    list1.add(72);
                    break;
                case '+':
                    list1.add(73);
                    break;
                case '=':
                    list1.add(74);
                    break;
                case ':':
                    list1.add(75);
                    break;
                case ',':
                    list1.add(76);
                    break;
                case '.':
                    list1.add(77);
                    break;
                case '?':
                    list1.add(78);
                    break;
            }
        }
        return list1;
    }

    public static String lsttostrws(List list1) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < list1.size(); i++) {
            switch ((int) list1.get(i)) {
                case 1:
                    str1.append('a');
                    break;
                case 2:
                    str1.append('b');
                    break;
                case 3:
                    str1.append('c');
                    break;
                case 4:
                    str1.append('d');
                    break;
                case 5:
                    str1.append('e');
                    break;
                case 6:
                    str1.append('f');
                    break;
                case 7:
                    str1.append('g');
                    break;
                case 8:
                    str1.append('h');
                    break;
                case 9:
                    str1.append('i');
                    break;
                case 10:
                    str1.append('j');
                    break;
                case 11:
                    str1.append('k');
                    break;
                case 12:
                    str1.append('l');
                    break;
                case 13:
                    str1.append('m');
                    break;
                case 14:
                    str1.append('n');
                    break;
                case 15:
                    str1.append('o');
                    break;
                case 16:
                    str1.append('p');
                    break;
                case 17:
                    str1.append('q');
                    break;
                case 18:
                    str1.append('r');
                    break;
                case 19:
                    str1.append('s');
                    break;
                case 20:
                    str1.append('t');
                    break;
                case 21:
                    str1.append('u');
                    break;
                case 22:
                    str1.append('v');
                    break;
                case 23:
                    str1.append('w');
                    break;
                case 24:
                    str1.append('x');
                    break;
                case 25:
                    str1.append('y');
                    break;
                case 26:
                    str1.append('z');
                    break;
                case 27:
                    str1.append('A');
                    break;
                case 28:
                    str1.append('B');
                    break;
                case 29:
                    str1.append('C');
                    break;
                case 30:
                    str1.append('D');
                    break;
                case 31:
                    str1.append('E');
                    break;
                case 32:
                    str1.append('F');
                    break;
                case 33:
                    str1.append('G');
                    break;
                case 34:
                    str1.append('H');
                    break;
                case 35:
                    str1.append('I');
                    break;
                case 36:
                    str1.append('J');
                    break;
                case 37:
                    str1.append('K');
                    break;
                case 38:
                    str1.append('L');
                    break;
                case 39:
                    str1.append('M');
                    break;
                case 40:
                    str1.append('N');
                    break;
                case 41:
                    str1.append('O');
                    break;
                case 42:
                    str1.append('P');
                    break;
                case 43:
                    str1.append('Q');
                    break;
                case 44:
                    str1.append('R');
                    break;
                case 45:
                    str1.append('S');
                    break;
                case 46:
                    str1.append('T');
                    break;
                case 47:
                    str1.append('U');
                    break;
                case 48:
                    str1.append('V');
                    break;
                case 49:
                    str1.append('W');
                    break;
                case 50:
                    str1.append('X');
                    break;
                case 51:
                    str1.append('Y');
                    break;
                case 52:
                    str1.append('Z');
                    break;
                case 53:
                    str1.append('0');
                    break;
                case 54:
                    str1.append('1');
                    break;
                case 55:
                    str1.append('2');
                    break;
                case 56:
                    str1.append('3');
                    break;
                case 57:
                    str1.append('4');
                    break;
                case 58:
                    str1.append('5');
                    break;
                case 59:
                    str1.append('6');
                    break;
                case 60:
                    str1.append('7');
                    break;
                case 61:
                    str1.append('8');
                    break;
                case 62:
                    str1.append('9');
                    break;
                case 63:
                    str1.append('!');
                    break;
                case 64:
                    str1.append('@');
                    break;
                case 65:
                    str1.append('#');
                    break;
                case 66:
                    str1.append('$');
                    break;
                case 67:
                    str1.append('%');
                    break;
                case 68:
                    str1.append('&');
                    break;
                case 69:
                    str1.append('*');
                    break;
                case 70:
                    str1.append('(');
                    break;
                case 71:
                    str1.append(')');
                    break;
                case 72:
                    str1.append('-');
                    break;
                case 73:
                    str1.append('+');
                    break;
                case 74:
                    str1.append('=');
                    break;
                case 75:
                    str1.append(':');
                    break;
                case 76:
                    str1.append(',');
                    break;
                case 77:
                    str1.append('.');
                    break;
                case 0:
                    str1.append('?');
                    break;
            }
        }
        return str1.toString();
    }

    public static List shifrws(List list1, List list2){
        ArrayList<Integer> list3 = new ArrayList();
        int j = 0;
        for (int i = 0; i < (int) list1.size(); i++) {
            if (j == list2.size()){
                j = 0;
            }
            /*int a = (int) list1.get(i);
            int b = (int) list2.get(j);
            int c = a * b;
            int d = c % 62;
            list3.add(d);*/
            list3.add((((int)list1.get(i)) * ((int) list2.get(j))) % 78);
            j++;
        }
        return (list3);
    }

    public static String lsttostr(List list1) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < list1.size(); i++)
        {
            switch ((int) list1.get(i)) {
                case 1:
                    str1.append('a');
                    break;
                case 2:
                    str1.append('b');
                    break;
                case 3:
                    str1.append('c');
                    break;
                case 4:
                    str1.append('d');
                    break;
                case 5:
                    str1.append('e');
                    break;
                case 6:
                    str1.append('f');
                    break;
                case 7:
                    str1.append('g');
                    break;
                case 8:
                    str1.append('h');
                    break;
                case 9:
                    str1.append('i');
                    break;
                case 10:
                    str1.append('j');
                    break;
                case 11:
                    str1.append('k');
                    break;
                case 12:
                    str1.append('l');
                    break;
                case 13:
                    str1.append('m');
                    break;
                case 14:
                    str1.append('n');
                    break;
                case 15:
                    str1.append('o');
                    break;
                case 16:
                    str1.append('p');
                    break;
                case 17:
                    str1.append('q');
                    break;
                case 18:
                    str1.append('r');
                    break;
                case 19:
                    str1.append('s');
                    break;
                case 20:
                    str1.append('t');
                    break;
                case 21:
                    str1.append('u');
                    break;
                case 22:
                    str1.append('v');
                    break;
                case 23:
                    str1.append('w');
                    break;
                case 24:
                    str1.append('x');
                    break;
                case 25:
                    str1.append('y');
                    break;
                case 26:
                    str1.append('z');
                    break;
                case 27:
                    str1.append('A');
                    break;
                case 28:
                    str1.append('B');
                    break;
                case 29:
                    str1.append('C');
                    break;
                case 30:
                    str1.append('D');
                    break;
                case 31:
                    str1.append('E');
                    break;
                case 32:
                    str1.append('F');
                    break;
                case 33:
                    str1.append('G');
                    break;
                case 34:
                    str1.append('H');
                    break;
                case 35:
                    str1.append('I');
                    break;
                case 36:
                    str1.append('J');
                    break;
                case 37:
                    str1.append('K');
                    break;
                case 38:
                    str1.append('L');
                    break;
                case 39:
                    str1.append('M');
                    break;
                case 40:
                    str1.append('N');
                    break;
                case 41:
                    str1.append('O');
                    break;
                case 42:
                    str1.append('P');
                    break;
                case 43:
                    str1.append('Q');
                    break;
                case 44:
                    str1.append('R');
                    break;
                case 45:
                    str1.append('S');
                    break;
                case 46:
                    str1.append('T');
                    break;
                case 47:
                    str1.append('U');
                    break;
                case 48:
                    str1.append('V');
                    break;
                case 49:
                    str1.append('W');
                    break;
                case 50:
                    str1.append('X');
                    break;
                case 51:
                    str1.append('Y');
                    break;
                case 52:
                    str1.append('Z');
                    break;
                case 53:
                    str1.append('0');
                    break;
                case 54:
                    str1.append('1');
                    break;
                case 55:
                    str1.append('2');
                    break;
                case 56:
                    str1.append('3');
                    break;
                case 57:
                    str1.append('4');
                    break;
                case 58:
                    str1.append('5');
                    break;
                case 59:
                    str1.append('6');
                    break;
                case 60:
                    str1.append('7');
                    break;
                case 61:
                    str1.append('8');
                    break;
                case 0:
                    str1.append('9');
            }
        }
        return str1.toString();
    }

    public static List shifr(List list1, List list2){
        ArrayList<Integer> list3 = new ArrayList();
        int j = 0;
        for (int i = 0; i < (int) list1.size(); i++) {
            if (j == list2.size()){
                j = 0;
            }
            /*int a = (int) list1.get(i);
            int b = (int) list2.get(j);
            int c = a * b;
            int d = c % 62;
            list3.add(d);*/
            list3.add((((int)list1.get(i)) * ((int) list2.get(j))) % 62);
            j++;
        }
        return (list3);
    }

    public static List exp(String str1){
        ArrayList<Integer> list1 = new ArrayList();
        while (str1.indexOf("0") != -1) {
            if (str1.indexOf("0") != str1.length()) {
                String str2 = str1.substring(str1.indexOf("0") + 1);
                str1 = str1.substring(0, str1.indexOf("0"));
                str1 += str2;
            }
            else{
                str1 = str1.substring(0, str1.indexOf("0"));
            }
        }
        for (int i = 0; i+1 < str1.length(); i += 2)
        {
            String str2 = str1.substring(i, i+2);
            list1.add(Integer.parseInt(str2));
        }
    return list1;
    }

    public static List strtolst(String str1){
        List list1 = new ArrayList();
        for (int i = 0; i < (int) str1.length(); i++) {
            switch (str1.charAt(i))
            {
                case 'a':
                    list1.add(1);
                    break;
                case 'b':
                    list1.add(2);
                    break;
                case 'c':
                    list1.add(3);
                    break;
                case 'd':
                    list1.add(4);
                    break;
                case 'e':
                    list1.add(5);
                    break;
                case 'f':
                    list1.add(6);
                    break;
                case 'g':
                    list1.add(7);
                    break;
                case 'h':
                    list1.add(8);
                    break;
                case 'i':
                    list1.add(9);
                    break;
                case 'j':
                    list1.add(10);
                    break;
                case 'k':
                    list1.add(11);
                    break;
                case 'l':
                    list1.add(12);
                    break;
                case 'm':
                    list1.add(13);
                    break;
                case 'n':
                    list1.add(14);
                    break;
                case 'o':
                    list1.add(15);
                    break;
                case 'p':
                    list1.add(16);
                    break;
                case 'q':
                    list1.add(17);
                    break;
                case 'r':
                    list1.add(18);
                    break;
                case 's':
                    list1.add(19);
                    break;
                case 't':
                    list1.add(20);
                    break;
                case 'u':
                    list1.add(21);
                    break;
                case 'v':
                    list1.add(22);
                    break;
                case 'w':
                    list1.add(23);
                    break;
                case 'x':
                    list1.add(24);
                    break;
                case 'y':
                    list1.add(25);
                    break;
                case 'z':
                    list1.add(26);
                    break;
                case 'A':
                    list1.add(27);
                    break;
                case 'B':
                    list1.add(28);
                    break;
                case 'C':
                    list1.add(29);
                    break;
                case 'D':
                    list1.add(30);
                    break;
                case 'E':
                    list1.add(31);
                    break;
                case 'F':
                    list1.add(32);
                    break;
                case 'G':
                    list1.add(33);
                    break;
                case 'H':
                    list1.add(34);
                    break;
                case 'I':
                    list1.add(35);
                    break;
                case 'J':
                    list1.add(36);
                    break;
                case 'K':
                    list1.add(37);
                    break;
                case 'L':
                    list1.add(38);
                    break;
                case 'M':
                    list1.add(39);
                    break;
                case 'N':
                    list1.add(40);
                    break;
                case 'O':
                    list1.add(41);
                    break;
                case 'P':
                    list1.add(42);
                    break;
                case 'Q':
                    list1.add(43);
                    break;
                case 'R':
                    list1.add(44);
                    break;
                case 'S':
                    list1.add(45);
                    break;
                case 'T':
                    list1.add(46);
                    break;
                case 'U':
                    list1.add(47);
                    break;
                case 'V':
                    list1.add(48);
                    break;
                case 'W':
                    list1.add(49);
                    break;
                case 'X':
                    list1.add(50);
                    break;
                case 'Y':
                    list1.add(51);
                    break;
                case 'Z':
                    list1.add(52);
                    break;
                case '0':
                    list1.add(53);
                    break;
                case '1':
                    list1.add(54);
                    break;
                case '2':
                    list1.add(55);
                    break;
                case '3':
                    list1.add(56);
                    break;
                case '4':
                    list1.add(57);
                    break;
                case '5':
                    list1.add(58);
                    break;
                case '6':
                    list1.add(59);
                    break;
                case '7':
                    list1.add(60);
                    break;
                case '8':
                    list1.add(61);
                    break;
                case '9':
                    list1.add(62);
                    break;
            }
        }
        return list1;
    }

    public static String cod(List listout){
        return lsttostr(shifr(shifr(strtolst((String) listout.get(0)),exp((String) listout.get(1))),dis((ArrayList<Integer>) strtolst(pis((String) listout.get(2))))));
    }

    public static String codws(List listout){
        return lsttostrws(shifrws(shifrws(strtolstws((String) listout.get(0)),exp((String) listout.get(1))),dis((ArrayList<Integer>) strtolstws(pis((String) listout.get(2))))));
    }
}
