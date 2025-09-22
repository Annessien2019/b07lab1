public class Polynomial{
	double[] coefficients;
	
	public Polynomial(){
		coefficients = new double[1];
		
		coefficients[0] = 0.0;
	}
	
	public Polynomial(double[] coef){
		coefficients = new double[coef.length];
		for (int i=0; i < coef.length; i++){
			coefficients[i] = coef[i];
		}
	}
	
	public Polynomial add(Polynomial args){
		
		for (int i=0; i < coefficients.length; i++){
			args.coefficients[i] += coefficients[i];
		}
		return args;
	}
	
	public double evaluate(double x){
		double result = 0;
		for (int i= 0; i <  coefficients.length; i++){
			result = result + (coefficients[i]* Math.pow(x,i));
		}
		return result;
	}
	
	public boolean hasRoot(double val){
		if (evaluate(val) == 0){
			return true; 
		}
		return false;
	}
}


