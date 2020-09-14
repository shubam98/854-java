package com.lti.javaCodility;

public class Mushroom {

	public static int calSum(int[] prefix, int left, int right) {
		return prefix[right] - prefix[left];
	}
	
	public static int maxMushroom(int[] a, int k, int m) {
		int[] prefix = new int[a.length];
		prefix[0] = a[0];
		for (int i = 1; i < a.length; i++) prefix[i] = prefix[i-1] + a[i];
		int res = 0;
		for (int i = 0; i < Math.min(m, k); i++) 
			int left = k - i;
			int right = Math.min(Math.max(k + m - 2*i, k), a.length-1);
			res = Math.max(res, calSum(prefix, left, right));
		}
		for (int i = 0; i < Math.min(a.length-k, m+1); i++) {
			int left = Math.max(0, Math.min(k - (m - 2*i), k));
			int right = k + i;
			res = Math.max(res, calSum(prefix, left, right));
		}
		return res;
	}
}

