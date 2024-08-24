package edu.collections.list.sortingLists.comparator;

import java.util.Comparator;
public class SortByNames implements Comparator<SortByAge>{

	@Override
	public int compare(SortByAge o1, SortByAge o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
