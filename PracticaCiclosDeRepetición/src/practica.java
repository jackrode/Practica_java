
public class practica {

	//atributos //
	int  y, q, m, a, b, a�o;
	double p, i, j;
	
	 
	
	public String TipoDeNumero (int x){ 
	if (x%2==0){
	return "n�mero par.";}
	else{
	return "n�mero impar.";}
	}
	
	public String divisible (int y){
		if (y%5==0){
			return " es divisible por 5.";}
		else {
			return " no es divisible por 5.";}
	}
	
	public String MayorOMenor (int a, int b){
		 if (a > b) {
        
         return a+ " es mayor y "+ b+ " es menor.";
          } else {
            return b+ " es mayor y "+ a+ " es menor.";}
	}
	
	public double Promedio (double i, double j){
		p=(i+j)/(2);
		return p;}
	
	public String A�o (int a�o){
		if((a�o%4==0)&&(a�o%100==0)&&(a�o%400==0))
			return "A�o es bisiesto.";
		else 
			return "A�o no es bisiesto.";}
	
	
}
