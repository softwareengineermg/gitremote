package com.java.app.git;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCheck {
	
	public List<String> checkDuplicate(){
		List<String> duplicateList = Arrays.asList("Sam", "Phil", "Sam");
		List<String> filteredList = duplicateList.stream().distinct().collect(Collectors.toList());
		//System.out.println(filteredList);
		return filteredList;
		
	}

}
