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
            if (str1.charAt(i) == 'a')
                list1.add(1);
            else if (str1.charAt(i) == 'b')
                list1.add(2);
            else if (str1.charAt(i) == 'c')
                list1.add(3);
            else if (str1.charAt(i) == 'd')
                list1.add(4);
            else if (str1.charAt(i) == 'e')
                list1.add(5);
            else if (str1.charAt(i) == 'f')
                list1.add(6);
            else if (str1.charAt(i) == 'g')
                list1.add(7);
            else if (str1.charAt(i) == 'h')
                list1.add(8);
            else if (str1.charAt(i) == 'i')
                list1.add(9);
            else if (str1.charAt(i) == 'j')
                list1.add(10);
            else if (str1.charAt(i) == 'k')
                list1.add(11);
            else if (str1.charAt(i) == 'l')
                list1.add(12);
            else if (str1.charAt(i) == 'm')
                list1.add(13);
            else if (str1.charAt(i) == 'n')
                list1.add(14);
            else if (str1.charAt(i) == 'o')
                list1.add(15);
            else if (str1.charAt(i) == 'p')
                list1.add(16);
            else if (str1.charAt(i) == 'q')
                list1.add(17);
            else if (str1.charAt(i) == 'r')
                list1.add(18);
            else if (str1.charAt(i) == 's')
                list1.add(19);
            else if (str1.charAt(i) == 't')
                list1.add(20);
            else if (str1.charAt(i) == 'u')
                list1.add(21);
            else if (str1.charAt(i) == 'v')
                list1.add(22);
            else if (str1.charAt(i) == 'w')
                list1.add(23);
            else if (str1.charAt(i) == 'x')
                list1.add(24);
            else if (str1.charAt(i) == 'y')
                list1.add(25);
            else if (str1.charAt(i) == 'z')
                list1.add(26);
            else if (str1.charAt(i) == 'A')
                list1.add(27);
            else if (str1.charAt(i) == 'B')
                list1.add(28);
            else if (str1.charAt(i) == 'C')
                list1.add(29);
            else if (str1.charAt(i) == 'D')
                list1.add(30);
            else if (str1.charAt(i) == 'E')
                list1.add(31);
            else if (str1.charAt(i) == 'F')
                list1.add(32);
            else if (str1.charAt(i) == 'G')
                list1.add(33);
            else if (str1.charAt(i) == 'H')
                list1.add(34);
            else if (str1.charAt(i) == 'I')
                list1.add(35);
            else if (str1.charAt(i) == 'J')
                list1.add(36);
            else if (str1.charAt(i) == 'K')
                list1.add(37);
            else if (str1.charAt(i) == 'L')
                list1.add(38);
            else if (str1.charAt(i) == 'M')
                list1.add(39);
            else if (str1.charAt(i) == 'N')
                list1.add(40);
            else if (str1.charAt(i) == 'O')
                list1.add(41);
            else if (str1.charAt(i) == 'P')
                list1.add(42);
            else if (str1.charAt(i) == 'Q')
                list1.add(43);
            else if (str1.charAt(i) == 'R')
                list1.add(44);
            else if (str1.charAt(i) == 'S')
                list1.add(45);
            else if (str1.charAt(i) == 'T')
                list1.add(46);
            else if (str1.charAt(i) == 'U')
                list1.add(47);
            else if (str1.charAt(i) == 'V')
                list1.add(48);
            else if (str1.charAt(i) == 'W')
                list1.add(49);
            else if (str1.charAt(i) == 'X')
                list1.add(50);
            else if (str1.charAt(i) == 'Y')
                list1.add(51);
            else if (str1.charAt(i) == 'Z')
                list1.add(52);
            else if (str1.charAt(i) == '0')
                list1.add(53);
            else if (str1.charAt(i) == '1')
                list1.add(54);
            else if (str1.charAt(i) == '2')
                list1.add(55);
            else if (str1.charAt(i) == '3')
                list1.add(56);
            else if (str1.charAt(i) == '4')
                list1.add(57);
            else if (str1.charAt(i) == '5')
                list1.add(58);
            else if (str1.charAt(i) == '6')
                list1.add(59);
            else if (str1.charAt(i) == '7')
                list1.add(60);
            else if (str1.charAt(i) == '8')
                list1.add(61);
            else if (str1.charAt(i) == '9')
                list1.add(62);
            else if (str1.charAt(i) == '!')
                list1.add(63);
            else if (str1.charAt(i) == '@')
                list1.add(64);
            else if (str1.charAt(i) == '#')
                list1.add(65);
            else if (str1.charAt(i) == '$')
                list1.add(66);
            else if (str1.charAt(i) == '%')
                list1.add(67);
            else if (str1.charAt(i) == '&')
                list1.add(68);
            else if (str1.charAt(i) == '*')
                list1.add(69);
            else if (str1.charAt(i) == '(')
                list1.add(70);
            else if (str1.charAt(i) == ')')
                list1.add(71);
            else if (str1.charAt(i) == '-')
                list1.add(72);
            else if (str1.charAt(i) == '+')
                list1.add(73);
            else if (str1.charAt(i) == '=')
                list1.add(74);
            else if (str1.charAt(i) == ':')
                list1.add(75);
            else if (str1.charAt(i) == ',')
                list1.add(76);
            else if (str1.charAt(i) == '.')
                list1.add(77);
            else if (str1.charAt(i) == '?')
                list1.add(78);
        }
        return list1;
    }

    public static String lsttostrws(List list1) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < list1.size(); i++)
        {
            if ((int) list1.get(i) == 1) {
                str1.append('a');}
            else if ((int) list1.get(i) == 2){
                str1.append('b');}
            else if ((int) list1.get(i) == 3){
                str1.append('c');}
            else if ((int) list1.get(i) == 4){
                str1.append('d');}
            else if ((int) list1.get(i) == 5){
                str1.append('e');}
            else if ((int) list1.get(i) == 6){
                str1.append('f');}
            else if ((int) list1.get(i) == 7){
                str1.append('g');}
            else if ((int) list1.get(i) == 8){
                str1.append('h');}
            else if ((int) list1.get(i) == 9){
                str1.append('i');}
            else if ((int) list1.get(i) == 10){
                str1.append('j');}
            else if ((int) list1.get(i) == 11){
                str1.append('k');}
            else if ((int) list1.get(i) == 12){
                str1.append('l');}
            else if ((int) list1.get(i) == 13){
                str1.append('m');}
            else if ((int) list1.get(i) == 14){
                str1.append('n');}
            else if ((int) list1.get(i) == 15){
                str1.append('o');}
            else if ((int) list1.get(i) == 16){
                str1.append('p');}
            else if ((int) list1.get(i) == 17){
                str1.append('q');}
            else if ((int) list1.get(i) == 18){
                str1.append('r');}
            else if ((int) list1.get(i) == 19){
                str1.append('s');}
            else if ((int) list1.get(i) == 20){
                str1.append('t');}
            else if ((int) list1.get(i) == 21){
                str1.append('u');}
            else if ((int) list1.get(i) == 22){
                str1.append('v');}
            else if ((int) list1.get(i) == 23){
                str1.append('w');}
            else if ((int) list1.get(i) == 24){
                str1.append('x');}
            else if ((int) list1.get(i) == 25){
                str1.append('y');}
            else if ((int) list1.get(i) == 26){
                str1.append('z');}
            else if ((int) list1.get(i) == 27){
                str1.append('A');}
            else if ((int) list1.get(i) == 28){
                str1.append('B');}
            else if ((int) list1.get(i) == 29){
                str1.append('C');}
            else if ((int) list1.get(i) == 30){
                str1.append('D');}
            else if ((int) list1.get(i) == 31){
                str1.append('E');}
            else if ((int) list1.get(i) == 32){
                str1.append('F');}
            else if ((int) list1.get(i) == 33){
                str1.append('G');}
            else if ((int) list1.get(i) == 34){
                str1.append('H');}
            else if ((int) list1.get(i) == 35){
                str1.append('I');}
            else if ((int) list1.get(i) == 36){
                str1.append('J');}
            else if ((int) list1.get(i) == 37){
                str1.append('K');}
            else if ((int) list1.get(i) == 38){
                str1.append('L');}
            else if ((int) list1.get(i) == 39){
                str1.append('M');}
            else if ((int) list1.get(i) == 40){
                str1.append('N');}
            else if ((int) list1.get(i) == 41){
                str1.append('O');}
            else if ((int) list1.get(i) == 42){
                str1.append('P');}
            else if ((int) list1.get(i) == 43){
                str1.append('Q');}
            else if ((int) list1.get(i) == 44){
                str1.append('R');}
            else if ((int) list1.get(i) == 45){
                str1.append('S');}
            else if ((int) list1.get(i) == 46){
                str1.append('T');}
            else if ((int) list1.get(i) == 47){
                str1.append('U');}
            else if ((int) list1.get(i) == 48){
                str1.append('V');}
            else if ((int) list1.get(i) == 49){
                str1.append('W');}
            else if ((int) list1.get(i) == 50){
                str1.append('X');}
            else if ((int) list1.get(i) == 51){
                str1.append('Y');}
            else if ((int) list1.get(i) == 52){
                str1.append('Z');}
            else if ((int) list1.get(i) == 53){
                str1.append('0');}
            else if ((int) list1.get(i) == 54){
                str1.append('1');}
            else if ((int) list1.get(i) == 55){
                str1.append('2');}
            else if ((int) list1.get(i) == 56){
                str1.append('3');}
            else if ((int) list1.get(i) == 57){
                str1.append('4');}
            else if ((int) list1.get(i) == 58){
                str1.append('5');}
            else if ((int) list1.get(i) == 59){
                str1.append('6');}
            else if ((int) list1.get(i) == 60){
                str1.append('7');}
            else if ((int) list1.get(i) == 61){
                str1.append('8');}
            else if ((int) list1.get(i) == 0){
                str1.append('9');}
            else if ((int) list1.get(i) == 63)
                str1.append('!');
            else if ((int) list1.get(i) == 64)
                str1.append('@');
            else if ((int) list1.get(i) == 65)
                str1.append('#');
            else if ((int) list1.get(i) == 66)
                str1.append('$');
            else if ((int) list1.get(i) == 67)
                str1.append('%');
            else if ((int) list1.get(i) == 68)
                str1.append('&');
            else if ((int) list1.get(i) == 69)
                str1.append('*');
            else if ((int) list1.get(i) == 70)
                str1.append('(');
            else if ((int) list1.get(i) == 71)
                str1.append(')');
            else if ((int) list1.get(i) == 72)
                str1.append('-');
            else if ((int) list1.get(i) == 73)
                str1.append('+');
            else if ((int) list1.get(i) == 74)
                str1.append('=');
            else if ((int) list1.get(i) == 75)
                str1.append(':');
            else if ((int) list1.get(i) == 76)
                str1.append(',');
            else if ((int) list1.get(i) == 77)
                str1.append('.');
            else if ((int) list1.get(i) == 0)
                str1.append('?');
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
            if ((int) list1.get(i) == 1) {
                str1.append('a');}
            else if ((int) list1.get(i) == 2){
                str1.append('b');}
            else if ((int) list1.get(i) == 3){
                str1.append('c');}
            else if ((int) list1.get(i) == 4){
                str1.append('d');}
            else if ((int) list1.get(i) == 5){
                str1.append('e');}
            else if ((int) list1.get(i) == 6){
                str1.append('f');}
            else if ((int) list1.get(i) == 7){
                str1.append('g');}
            else if ((int) list1.get(i) == 8){
                str1.append('h');}
            else if ((int) list1.get(i) == 9){
                str1.append('i');}
            else if ((int) list1.get(i) == 10){
                str1.append('j');}
            else if ((int) list1.get(i) == 11){
                str1.append('k');}
            else if ((int) list1.get(i) == 12){
                str1.append('l');}
            else if ((int) list1.get(i) == 13){
                str1.append('m');}
            else if ((int) list1.get(i) == 14){
                str1.append('n');}
            else if ((int) list1.get(i) == 15){
                str1.append('o');}
            else if ((int) list1.get(i) == 16){
                str1.append('p');}
            else if ((int) list1.get(i) == 17){
                str1.append('q');}
            else if ((int) list1.get(i) == 18){
                str1.append('r');}
            else if ((int) list1.get(i) == 19){
                str1.append('s');}
            else if ((int) list1.get(i) == 20){
                str1.append('t');}
            else if ((int) list1.get(i) == 21){
                str1.append('u');}
            else if ((int) list1.get(i) == 22){
                str1.append('v');}
            else if ((int) list1.get(i) == 23){
                str1.append('w');}
            else if ((int) list1.get(i) == 24){
                str1.append('x');}
            else if ((int) list1.get(i) == 25){
                str1.append('y');}
            else if ((int) list1.get(i) == 26){
                str1.append('z');}
            else if ((int) list1.get(i) == 27){
                str1.append('A');}
            else if ((int) list1.get(i) == 28){
                str1.append('B');}
            else if ((int) list1.get(i) == 29){
                str1.append('C');}
            else if ((int) list1.get(i) == 30){
                str1.append('D');}
            else if ((int) list1.get(i) == 31){
                str1.append('E');}
            else if ((int) list1.get(i) == 32){
                str1.append('F');}
            else if ((int) list1.get(i) == 33){
                str1.append('G');}
            else if ((int) list1.get(i) == 34){
                str1.append('H');}
            else if ((int) list1.get(i) == 35){
                str1.append('I');}
            else if ((int) list1.get(i) == 36){
                str1.append('J');}
            else if ((int) list1.get(i) == 37){
                str1.append('K');}
            else if ((int) list1.get(i) == 38){
                str1.append('L');}
            else if ((int) list1.get(i) == 39){
                str1.append('M');}
            else if ((int) list1.get(i) == 40){
                str1.append('N');}
            else if ((int) list1.get(i) == 41){
                str1.append('O');}
            else if ((int) list1.get(i) == 42){
                str1.append('P');}
            else if ((int) list1.get(i) == 43){
                str1.append('Q');}
            else if ((int) list1.get(i) == 44){
                str1.append('R');}
            else if ((int) list1.get(i) == 45){
                str1.append('S');}
            else if ((int) list1.get(i) == 46){
                str1.append('T');}
            else if ((int) list1.get(i) == 47){
                str1.append('U');}
            else if ((int) list1.get(i) == 48){
                str1.append('V');}
            else if ((int) list1.get(i) == 49){
                str1.append('W');}
            else if ((int) list1.get(i) == 50){
                str1.append('X');}
            else if ((int) list1.get(i) == 51){
                str1.append('Y');}
            else if ((int) list1.get(i) == 52){
                str1.append('Z');}
            else if ((int) list1.get(i) == 53){
                str1.append('0');}
            else if ((int) list1.get(i) == 54){
                str1.append('1');}
            else if ((int) list1.get(i) == 55){
                str1.append('2');}
            else if ((int) list1.get(i) == 56){
                str1.append('3');}
            else if ((int) list1.get(i) == 57){
                str1.append('4');}
            else if ((int) list1.get(i) == 58){
                str1.append('5');}
            else if ((int) list1.get(i) == 59){
                str1.append('6');}
            else if ((int) list1.get(i) == 60){
                str1.append('7');}
            else if ((int) list1.get(i) == 61){
                str1.append('8');}
            else if ((int) list1.get(i) == 0){
                str1.append('9');}
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
            if (str1.charAt(i) == 'a')
                list1.add(1);
            else if (str1.charAt(i) == 'b')
                list1.add(2);
            else if (str1.charAt(i) == 'c')
                list1.add(3);
            else if (str1.charAt(i) == 'd')
                list1.add(4);
            else if (str1.charAt(i) == 'e')
                list1.add(5);
            else if (str1.charAt(i) == 'f')
                list1.add(6);
            else if (str1.charAt(i) == 'g')
                list1.add(7);
            else if (str1.charAt(i) == 'h')
                list1.add(8);
            else if (str1.charAt(i) == 'i')
                list1.add(9);
            else if (str1.charAt(i) == 'j')
                list1.add(10);
            else if (str1.charAt(i) == 'k')
                list1.add(11);
            else if (str1.charAt(i) == 'l')
                list1.add(12);
            else if (str1.charAt(i) == 'm')
                list1.add(13);
            else if (str1.charAt(i) == 'n')
                list1.add(14);
            else if (str1.charAt(i) == 'o')
                list1.add(15);
            else if (str1.charAt(i) == 'p')
                list1.add(16);
            else if (str1.charAt(i) == 'q')
                list1.add(17);
            else if (str1.charAt(i) == 'r')
                list1.add(18);
            else if (str1.charAt(i) == 's')
                list1.add(19);
            else if (str1.charAt(i) == 't')
                list1.add(20);
            else if (str1.charAt(i) == 'u')
                list1.add(21);
            else if (str1.charAt(i) == 'v')
                list1.add(22);
            else if (str1.charAt(i) == 'w')
                list1.add(23);
            else if (str1.charAt(i) == 'x')
                list1.add(24);
            else if (str1.charAt(i) == 'y')
                list1.add(25);
            else if (str1.charAt(i) == 'z')
                list1.add(26);
            else if (str1.charAt(i) == 'A')
                list1.add(27);
            else if (str1.charAt(i) == 'B')
                list1.add(28);
            else if (str1.charAt(i) == 'C')
                list1.add(29);
            else if (str1.charAt(i) == 'D')
                list1.add(30);
            else if (str1.charAt(i) == 'E')
                list1.add(31);
            else if (str1.charAt(i) == 'F')
                list1.add(32);
            else if (str1.charAt(i) == 'G')
                list1.add(33);
            else if (str1.charAt(i) == 'H')
                list1.add(34);
            else if (str1.charAt(i) == 'I')
                list1.add(35);
            else if (str1.charAt(i) == 'J')
                list1.add(36);
            else if (str1.charAt(i) == 'K')
                list1.add(37);
            else if (str1.charAt(i) == 'L')
                list1.add(38);
            else if (str1.charAt(i) == 'M')
                list1.add(39);
            else if (str1.charAt(i) == 'N')
                list1.add(40);
            else if (str1.charAt(i) == 'O')
                list1.add(41);
            else if (str1.charAt(i) == 'P')
                list1.add(42);
            else if (str1.charAt(i) == 'Q')
                list1.add(43);
            else if (str1.charAt(i) == 'R')
                list1.add(44);
            else if (str1.charAt(i) == 'S')
                list1.add(45);
            else if (str1.charAt(i) == 'T')
                list1.add(46);
            else if (str1.charAt(i) == 'U')
                list1.add(47);
            else if (str1.charAt(i) == 'V')
                list1.add(48);
            else if (str1.charAt(i) == 'W')
                list1.add(49);
            else if (str1.charAt(i) == 'X')
                list1.add(50);
            else if (str1.charAt(i) == 'Y')
                list1.add(51);
            else if (str1.charAt(i) == 'Z')
                list1.add(52);
            else if (str1.charAt(i) == '0')
                list1.add(53);
            else if (str1.charAt(i) == '1')
                list1.add(54);
            else if (str1.charAt(i) == '2')
                list1.add(55);
            else if (str1.charAt(i) == '3')
                list1.add(56);
            else if (str1.charAt(i) == '4')
                list1.add(57);
            else if (str1.charAt(i) == '5')
                list1.add(58);
            else if (str1.charAt(i) == '6')
                list1.add(59);
            else if (str1.charAt(i) == '7')
                list1.add(60);
            else if (str1.charAt(i) == '8')
                list1.add(61);
            else if (str1.charAt(i) == '9')
                list1.add(62);
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
