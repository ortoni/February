package interviewPre_a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import org.testng.IAnnotationTransformer2;
import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class LisTest implements IAnnotationTransformer2, 
IDataProviderListener, 
IDataProviderAnnotation{
	boolean flag =false;

	@Override
	public void transform(ITestAnnotation annotation, 
			Class testClass, Constructor testConstructor, Method testMethod) {
		String name = testMethod.getName();
		System.out.println("methods name: "+name);
		if(name.equals("maximumOccurancesoFCharacter")) {
			flag = true;
		}
	}

	@Override
	public void transform(IConfigurationAnnotation annotation, 
			Class testClass, Constructor testConstructor,
			Method testMethod) {
		}

	@Override
	public void transform(IDataProviderAnnotation annotation, 
			Method method) {
		System.out.println("data provider name: "+annotation.getName());
	}

	@Override
	public void transform(IFactoryAnnotation annotation, Method method) {	
		List<Integer> indices = annotation.getIndices();
		System.out.println("lis");
		if(flag==true) {
			annotation.setIndices(indices);
		}
	}

	@Override
	public void beforeDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method,
			ITestContext iTestContext) {
		List<Integer> indices = dataProviderMethod.getIndices();
		System.out.println(indices);
	}

	@Override
	public void afterDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method,
			ITestContext iTestContext) {
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isParallel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setParallel(boolean parallel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getIndices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIndices(List<Integer> indices) {
		System.out.println(flag);
	if(flag == true) {
		indices.add(0);
	}
		
	}



	





}
