package com.fontan.ch1.hw;

import java.util.List;
import static java.lang.System.out;

public class Example01 {

	
	public static void main(String[] args) {
		List<String> list=List.of("1","a","b","4");
		list.forEach(item->{
			if("a".equals(item)) { out.println(item +": This is a");
			}
			else {out.println(item + ": This is not a");
			}
		});
	}

}
