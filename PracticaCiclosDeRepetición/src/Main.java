	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class Main {

	
	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		practica ParOImpar = new practica();
		practica divisible = new practica();
		practica MayorOMenor = new practica();
		practica Promedio = new practica();
		practica bisiesto = new practica();
		practica velocidad = new practica();
		
		System.out.println("OPCION 1: Determina n�mero par o impar.");
		System.out.println("OPCI�N 2: Determinar divisibilidad por 5.");
		System.out.println("OPCI�N 3: Determina si es a�o bisiesto.");
		System.out.println("OPCI�N 4: Determinar promedio de dos numeros.");
		System.out.println("OPCI�N 5: Determina n�mero mayor y menor.");
		System.out.println("OPCI�N 6: Determina velociadad actual.");
		
		int z = Integer.parseInt(br.readLine());
		switch (z){
		case 1: System.out.println("Ingrese n�mero");
		int x = Integer.parseInt(br.readLine());
		System.out.println("El numero " +x + " es " +ParOImpar.TipoDeNumero(x)+"\n" );break;
		
		case 2: System.out.println("Ingrese un N�merillo");
		int y = Integer.parseInt(br.readLine());
		System.out.println("El numerillo " + y +  divisible.divisible(y)); break;
		
		case 3: System.out.println("Ingrese un a�o");
		int a�o = Integer.parseInt(br.readLine());
		System.out.println(bisiesto.A�o(a�o));break;
		
		case 4: System.out.println("Ingrese primer n�mero.");
		double i = new Double(br.readLine());
		System.out.println("Ingrese segundo n�mero.");
		double j = new Double(br.readLine());
		System.out.printf("El promedio de "+ i+" y "+ j+" es: "+Promedio.Promedio(i, j));break;
		
		case 5:
			System.out.println("ingrese primer n�mero.");
			int a = Integer.parseInt(br.readLine());
			System.out.println("ingrese segundo n�mero.");
			int b = Integer.parseInt(br.readLine());
			System.out.println(MayorOMenor.MayorOMenor(a, b));break;
		
		case 6: 
			System.out.println("Ingrese velocidad Inicial");
			float v1 = new Float(br.readLine());
			System.out.println("Ingrese velocidad Final");
			float v2 = new Float(br.readLine());
			System.out.println("Ingrese tiempo inicial");
			float t1 = new Float(br.readLine());
			System.out.println("Ingrese tiempo final");
			float t2 = new Float(br.readLine());
			System.out.println(velocidad.velocidad(v1, v2, t1, t2));break;
			
		default: System.out.println("Opci�n Invalida"); break;
	
      
		}
		
		}
	}
		
		
		
		
	


