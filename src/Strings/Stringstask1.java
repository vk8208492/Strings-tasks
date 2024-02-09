package Strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringstask1 {

    public static void main(String[] args) {

//Task1
        String[] provideDataTask1 = new String[]{"brange", "plum", "tomato", "onibn", "grape"};
        getOutput(replaceData(provideDataTask1));

//Task2
        String[] provideDataTask2 = new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
        getOutput(getDeleteData(provideDataTask2));
    }



    private static String replaceData(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String name : strings) {
            count++;
            if ( name.equals("brange") || name.equals("onibn") ) {
                name = name.replace('b', 'o');
            }
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }
        return stringBuilder.toString();
    }


    private static String getDeleteData(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String name : strings) {

            if ( !name.equals("onion") ) {
                count++;
                stringBuilder
                        .append(count)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }

        }
        return stringBuilder.toString();
    }

    

    private static void getOutput(String output){
            System.out.println(output);
        }
    }
