package org.anudip.secondBoot.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public class FiboService {
	public List<Integer>generateFiboSeries(int n){
		List<Integer>fiboList=new ArrayList<>();
		int a=0;
		int b=1;
		fiboList.add(a);
		fiboList.add(b);
		n=n-2;
		while(n>0) {
			int t=a+b;
			fiboList.add(t);
			a=b;
			b=t;
			n--;
		}
		return fiboList;
	}

}
