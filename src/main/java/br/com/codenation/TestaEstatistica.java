package br.com.codenation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestaEstatistica {
    public static void main(String[] args) {
        int[] numerosMedia = {1,2,3,4,5};
        int[] numerosModa = {1,2,2,3,3,4,4,4,5,5,6,7,8};
        int[] numerosMedian = {1,4,-6,-10,12,14,1,7,5,3,1};
        System.out.println(StatisticUtil.average(numerosMedia)); //3
        System.out.println(StatisticUtil.mode(numerosModa));     //4S
        System.out.println(StatisticUtil.median(numerosMedian)); //14
    }
}
