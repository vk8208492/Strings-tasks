package Strings;

public class Stringstask1 {

    public static void main(String[] args) {

//Task1
        String[] provideDataTask1 = new String[]{"brange", "plum", "tomato", "onibn", "grape"};
        getOutput(replaceData(provideDataTask1));

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




    

    private static void getOutput(String output){
            System.out.println(output);
        }
    }
