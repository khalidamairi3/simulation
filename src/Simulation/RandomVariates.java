package Simulation;

import java.util.Random;

public class RandomVariates {
	public static double generateExponentialDistribution(double Rate){
		double number;
		double random;
		random=Math.random();
		while((random==0.0)||(random==1.0))
		{
			random=Math.random();
		}
		number=-(1/Rate)*(Math.log(random));
		return number;
	}
	
	
	public static double generateWeibullDistribution(double alpha,double beta,double v){
		double random;
		random=Math.log(Math.random());
		while((random==0.0)||(random==1.0))
		{
			random=Math.log(Math.random());
		}
		return (v-alpha*Math.pow(Math.log(random),(1/beta)));
	}
	
	public static double generateLogNormalDistribution(double mean,double standardDeviation) {
		double random,random2,z1,z2;
		random=Math.log(Math.random());
		while((random==0.0)||(random==1.0))
		{
			random=Math.log(Math.random());
		}
		random2=Math.log(Math.random());
		while((random2==0.0)||(random2==1.0))
		{
			random2=Math.log(Math.random());
		}
		
		z1=(Math.pow(-2*Math.log(random),0.5)*Math.cos(2*Math.PI*random2));
		z2=(Math.pow(-2*Math.log(random),0.5)*Math.sin(2*Math.PI*random2));
		z1=mean+standardDeviation*z1;
		z2=mean+standardDeviation*z2;
		z1=Math.exp(z1);
		z2=Math.exp(z2);
		return z1;
}
		
}
