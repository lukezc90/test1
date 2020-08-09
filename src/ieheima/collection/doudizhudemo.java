package ieheima.collection;

import java.util.ArrayList;
import java.util.Collections;

public class doudizhudemo {
    public static void main(String[] args) {
        //定义牌盒
        ArrayList<String> array = new ArrayList<String>();

        //定义花色
        String[] huase = {"♥","♠","♣","♦"};
        //定义数字
        String[] number = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for(String col : huase){
            for(String num : number){
                array.add(col+num);
            }
        }
//        System.out.println(array);
        array.add("小王");
        array.add("大王");

        //洗牌，也就是把牌打散
        Collections.shuffle(array);
//        System.out.println(array);

        //发牌，也就是遍历集合
        ArrayList<String> lqxarray = new ArrayList<String>();
        ArrayList<String> lyxarray = new ArrayList<String>();
        ArrayList<String> zmyarray = new ArrayList<String>();
        ArrayList<String> dipaiarray = new ArrayList<String>();
        for(int i=0;i<array.size();i++){
            String poker = array.get(i);
            if(i>=array.size()-3){
                dipaiarray.add(poker);
            }else if(i%3 ==0){
                lqxarray.add(poker);
            }else if(i%3 ==1){
                lyxarray.add(poker);
            }else if(i%3 ==2){
                zmyarray.add(poker);
            }
        }

        //看牌，也就是三个玩家分别遍历自己的牌
        doudizhudemo.lookpoker("林青霞",lqxarray);
        doudizhudemo.lookpoker("刘艳",lyxarray);
        doudizhudemo.lookpoker("张曼玉",zmyarray);
    }

    public static void lookpoker(String name,ArrayList<String> array){
        System.out.print(name + "的牌是:");
        for(String pok:array){
            System.out.print(pok + "");
        }
        System.out.println();
    }
}
