package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Created by petenguy1 on 11/21/2016.
 *
 *      Pig latin algorithm
 *
 *      Converts a haiku into pig latin
 */
public class PigLatin {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter a haiku with no punctuations (3 separate sentences): ");

        List<StringBuilder> line1 = splitString(scanner.nextLine().toLowerCase());
        List<StringBuilder> line2 = splitString(scanner.nextLine().toLowerCase());
        List<StringBuilder> line3 = splitString(scanner.nextLine().toLowerCase());

        List<Collection> haiku = new ArrayList<Collection>();
        haiku.add(line1);
        haiku.add(line2);
        haiku.add(line3);

        for (Collection c : haiku) {
            for (StringBuilder sb : (List<StringBuilder>) c){
                parseString(sb, false);
                System.out.print(sb + " ");
            }
            System.out.println();
        }
    }

    public static List<StringBuilder> splitString(String s) {
        List<StringBuilder> stringBuilderList = new ArrayList<StringBuilder>();

        String[] stringArray = s.split(" ");
        for (String word : stringArray) {
            stringBuilderList.add(new StringBuilder(word));
        }

        return stringBuilderList;
    }

    public static StringBuilder parseString(StringBuilder s, boolean flag) {

        switch (s.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                if (flag == false)
                    return s.append("way");
                else
                    return s.append("ay");
            }
            default:
                return parseString(s.append(s.charAt(0)).deleteCharAt(0), true);
        }
    }
}

