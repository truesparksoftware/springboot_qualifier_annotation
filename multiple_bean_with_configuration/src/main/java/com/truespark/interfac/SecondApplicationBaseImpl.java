package com.truespark.interfac;

import org.springframework.stereotype.Service;

//@Qualifier("secondapp")
@Service("secondapp")
//@Component("secondapp")
public class SecondApplicationBaseImpl implements ApplicationBase {

	@Override
	public void printApplicationBase() {
		System.out.println(" SecondApplicationBaseImpl class");

	}

}
