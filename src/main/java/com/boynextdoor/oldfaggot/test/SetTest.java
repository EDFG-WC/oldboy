package com.boynextdoor.oldfaggot.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author 王晨
 * @Date 2018/12/28 23:04
 **/
public class SetTest {

	public static void main(String[] args) {
		String s1 = ",-140";
		String s2 = "-140,-120";
		String s3 = "-120,-100";
		String s4 = "-100,";

		Comparator comparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer o1Min = getMin(o1);
				Integer o2Min = getMin(o2);

				return o1Min - o2Min;
			}

			private Integer getMin(Object o1) {
				String[] split = o1.toString().split(",");
				Integer min = null;
				if (split.length == 2 && !split[0].equals("")) {
					List<Integer> list = new ArrayList<Integer>(1);
					for (String s :
						split) {
						list.add(Integer.parseInt(s));
					}
					min = Collections.min(list);
				}

				if (split.length == 2 && split[0].equals("")) {
					min = -65535;
				}

				if (split.length == 1) {
					min = Integer.parseInt(split[0]);
				}
				return min;
			}
		};
		Set<String> mySet = new TreeSet<String>(comparator);

		mySet.add(s1);
		mySet.add(s2);
		mySet.add(s3);
		mySet.add(s4);

		System.out.println(mySet);
	}
}
