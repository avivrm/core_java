package com.test.program.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FindHoles {

	public static void main(String... strings) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s = br.readLine();
			int count = 0;
			char[] charArr = s.toCharArray();
			for (char c : charArr) {
				if (c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'Q'
						|| c == 'R')
					count++;
				else if (c == 'B')
					count += 2;
			}
			System.out.println(count);
		}
	}
}
