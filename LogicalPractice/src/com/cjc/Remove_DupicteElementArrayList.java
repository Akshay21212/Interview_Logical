package com.cjc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_DupicteElementArrayList {
public static void main(String[] args) {
	
ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,7,8,9,9));
 System.out.println(num);
LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(num);
ArrayList<Integer> numberswithoutDuplicates= new ArrayList<Integer>(linkedHashSet);

System.out.println(numberswithoutDuplicates);
}
}
