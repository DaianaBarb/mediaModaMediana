package br.com.codenation;

import java.util.*;

public class StatisticUtil {

	public static int average(int[] elements) {
		int average = 0;
		for(int i=0;i<elements.length;i++){
			average+= elements[i];
		}
		average=average/elements.length;
		return average;
	}

	public static int mode(int[] elements) {
		int i=0;
		Map<Integer,Integer> mapa = new HashMap<>();
		int[] elements2=elements;
		for(int numero:elements2){
			for(int n:elements){
				if(numero==n){
					i++;
					mapa.put(numero, i);   } }
			i=0;}
		int bigger=0;
		int mode=0;
		for(Map.Entry<Integer,Integer> entry:mapa.entrySet()){
			if(entry.getValue()>bigger){
				bigger=entry.getValue();
				mode=entry.getKey(); }
		}



		return mode;
	}

	public static int median(int[] elements) {
		int[] sortedElements = sortElements(elements);
		int median=0;
		if(elements.length%2 !=0){
			int posicao=((sortedElements.length+1)/2)-1;
			median=elements[posicao];
		}else {
			int posicao=elements.length/2;
			median=(elements[posicao]+elements[posicao-1])/2;}
		return median;
	}

	public static int[] sortElements(int[] elements){
		List<Integer> newList = new ArrayList();
		for (int num:
				elements) {
			newList.add(num);
		}
		Collections.sort(newList);
		for (int i = 0; i < elements.length; i++) {
			elements[i] = newList.get(i);
		}
		return elements;
	}
}
