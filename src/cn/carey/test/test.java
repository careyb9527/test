package cn.carey.test;

import java.util.Calendar;

public class test {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//获得当前时间的月份，月份从0开始所以结果要加1
		int month=calendar.get(Calendar.DAY_OF_MONTH)+1;
		System.out.println(month);
	}
}
