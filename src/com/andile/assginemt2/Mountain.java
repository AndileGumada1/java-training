package com.andile.assginemt2;

public class Mountain {
	private static int max;
	private static int min;

	    public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		Mountain.max = max;
	}

	public static int getMin() {
		return min;
	}

	public static void setMin(int min) {
		Mountain.min = min;
	}

		public static void max_min(int my_list[]) {
	        max = my_list[0];
	        min = my_list[0];
	        int len = my_list.length;
	        for (int i = 1; i < len - 1; i = i + 2) {
	            if (i + 1 > len) {
	                if (my_list[i] > max) max = my_list[i];
	                if (my_list[i] < min) min = my_list[i];
	            }
	            if (my_list[i] > my_list[i + 1]) {
	                if (my_list[i] > max) max = my_list[i];
	                if (my_list[i + 1] < min) min = my_list[i + 1];
	            }
	            if (my_list[i] < my_list[i + 1]) {
	                if (my_list[i] < min) min = my_list[i];
	                if (my_list[i + 1] > max) max = my_list[i + 1];
	            }
	        }
	    }
}
