package designpatterninjava;

import com.phone.OS;
import com.phone.Operatingsystemfactory;
import com.phone.android;

public class factorymain {

	public static void main(String[] args) {
		Operatingsystemfactory osf=new Operatingsystemfactory();
		OS obj=osf.getinstance("Open");
obj.specs();
	}

}
