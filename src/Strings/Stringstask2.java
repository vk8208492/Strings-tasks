package Strings;

public class Stringstask2 {

    public static void main(String[] args){

        //Task2
        String[] provideDataTask2 = new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
        getOutput(getDeleteData(provideDataTask2));
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
