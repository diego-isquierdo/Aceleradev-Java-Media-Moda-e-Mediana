package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		return Double.valueOf(Arrays.stream(elements).average().getAsDouble()).intValue();
	}


	public static int mode(int[] elements) {
		int count=0;
		int retorna=0;

		for (int i=0; i<elements.length; i++){
			int aux=0;
			for (int j=1; j<elements.length; j++){
				if (elements[i]==elements[j]) aux++;
			}
			if (count<=aux){
				count=aux;
				retorna = elements[i];
			}
		}

		return retorna;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);

		if(elements.length%2 == 1)  return elements[(elements.length/2)];

		return ((elements[elements.length/2]) + (elements[elements.length/2 -1])) /2;
	}
}