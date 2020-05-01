package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		return Double.valueOf(Arrays.stream(elements).average().getAsDouble()).intValue();
	}

	public static int mode(int[] elements) {
		int aux=0;

		for (int i=1; i<elements.length; i++){

		}

		return aux;
	}

	public static int median(int[] elements) {
		return 0;
	}
}