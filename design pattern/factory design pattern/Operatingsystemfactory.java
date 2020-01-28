package com.phone;  //importing other packages

public class Operatingsystemfactory {
public OS getinstance(String str)
{
	if(str.equals("Open"))
	return new android();
	else if(str.equals("secured"))
		return new ios();
	else
		return new windows();
}
}
