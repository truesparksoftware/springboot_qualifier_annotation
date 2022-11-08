package com.truespark.interfac;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Qualifier("firstapp")
@Service("firstapp")
//@Component("firstapp")
public class FirstApplicationBaseImpl implements ApplicationBase {

	@Override
	public void printApplicationBase() {
		System.out.println(" FirstApplicationBaseImpl class");

	}

}
