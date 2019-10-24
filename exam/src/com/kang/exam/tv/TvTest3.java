package com.kang.exam.tv;

public class TvTest3 {
	public static void main(String[] args) {
		LGTv tv1 = new LGTv("XE-123");
		System.out.println(tv1.model);

		LGTv tv2 = new LGTv("DD-DM");
		System.out.println(tv2.model);

		LGTv tv3 = new LGTv("HF-1113B");
		System.out.println(tv3.model);

		tv1.record();

		System.out.println(tv1.model);
		System.out.println(tv2.model);
		System.out.println(tv3.model);
	}
}