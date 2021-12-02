package hgwz;

import java.util.Arrays;

public class test1115 {
//    public static void main(String[] args) {
//        String[] words = {"man i need a taxi up to ubud", "take me to semynak", "massage yes massage yes massage"};
//        for(String word :words){
//            String[] wordsList = new test1115().sortByLastChar(word);
//            System.out.println(word + " ->" + Arrays.deepToString(wordsList));
//        }
//    }
//
//    public String[]  sortByLastChar(String words){
//        String[] wordsList  = words.split("");
//        String[] sortByLastCharList = new String[wordsList.length];
//
//        //生成最后一个字母 + 序号
//        for(int i=0;i<wordsList.length;i++){
//            sortByLastCharList[i] = wordsList[i].substring(wordsList[i].length()-1)+i;
//        }
//        //按照最后一个字母排序
//        Arrays.sort(sortByLastCharList);
//
//        //生成新的字符串
//        for(int i=0;i<wordsList.length;i++){
//            int j = new Integer(sortByLastCharList[i].substring(1));
//            sortByLastCharList[i] = wordsList[j];
//        }
//
//        return sortByLastCharList;
//    }
public static void main(String[] args) {
    String[] words = {"man i need a taxi up to ubud", "take me to semynak", "massage yes massage yes massage"};
    for (String word : words) {
        String[] wordsList = new test1115().sortByLastChar(word);
        System.out.println(word + " ->" + Arrays.deepToString(wordsList));
    }
}

    public String[] sortByLastChar(String words) {
        String[] wordsList = words.split(" ");
        String[] sortByLastCharList = new String[wordsList.length];

        //生成最后一个字母 + 序号
        for (int i = 0; i < wordsList.length; i++) {
            sortByLastCharList[i] = wordsList[i].substring(wordsList[i].length() - 1) + i;
        }

        //按照最后一个字母排序
        Arrays.sort(sortByLastCharList);

        //生成新的字符串
        for (int i = 0; i < wordsList.length; i++) {
            int j = new Integer(sortByLastCharList[i].substring(1));
            sortByLastCharList[i] = wordsList[j];
        }
        return sortByLastCharList;
    }
}
