
public class practica {
	double p;
	float veloc;
	
	public String TipoDeNumero (int x){ 
	if (x%2==0){
	return "número par.";}
	else{
	return "número impar.";}
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
          } 
		 else {
         return b+ " es mayor y "+ a+ " es menor.";}
	}
	
	public double Promedio (double i, double j){
		p=(i+j)/(2);
		return p;
		}
	
	public String Año (int año){
		if((año%4==0)&&(año%100==0)&&(año%400==0))
			return "Año es bisiesto.";
		else 
			return "Año no es bisiesto.";
		}
	
	public float velocidad(float v1, float v2, float t1, float t2) {
		veloc = (v2-v1)/(t2-t1);
		return veloc;
	}
	
}
