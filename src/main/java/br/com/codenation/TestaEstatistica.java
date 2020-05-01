package br.com.codenation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestaEstatistica {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] elements = {1,1,6,6,8,8,4,4,4,4,3,3};
        System.out.println(StatisticUtil.average(numeros));
    }
}
