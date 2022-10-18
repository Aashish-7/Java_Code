package com.coforge.oops;//final before class,variable,method
 class ParentEx
{
	 int age=28;//final
	 	public int increaseAge()
	{
		age=++age;
		return age;
	}
}
public class MethodOverridingEx  extends ParentEx{
	@Override
	public int increaseAge()
	{
		age=--age;
		return age;
	}
public static void main(String[] args) {
	MethodOverridingEx obj=new MethodOverridingEx();
	System.out.println(obj.increaseAge());
}
}
