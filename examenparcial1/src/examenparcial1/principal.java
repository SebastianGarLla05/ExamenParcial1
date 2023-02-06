package examenparcial1;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra1="anita lava la tina";
		String cadenainversa="al revés";
		System.out.println(primerMayuscula(palabra1));
		System.out.println(invertirCadena(cadenainversa));
		String frase = "hasta luego cocodrilo";
	    System.out.println(vocalesMayúscula(frase));
		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzBuzz(i));
		}
		String palabrapalindromo = "sugus";
		System.out.println("La palabra " + palabrapalindromo + " es palindromo?: " + isPalindromo(palabrapalindromo));
	}
	
	public static String primerMayuscula(String palabra1)
    {
        if (palabra1 == null || palabra1.length() == 0) {
            return palabra1;
        }
        return palabra1.substring(0, 1).toUpperCase() + palabra1.substring(1);
	}

	public static String invertirCadena(String cadenainversa) {
        String cadenaInvertida = "";
        for (int x = cadenainversa.length() - 1; x >= 0; x--)
            cadenaInvertida = cadenaInvertida + cadenainversa.charAt(x);
        return cadenaInvertida;
    }
	
	static String vocalesMayúscula(String frase) {
		
	    char[] caracteres = frase.toCharArray();
	    
	    for (int i = 0; i < caracteres.length; i++) {
	      if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
	        caracteres[i] = Character.toUpperCase(caracteres[i]);
	      }
	    }
	    return new String(caracteres);
	  }
	
	public static String fizzBuzz(int numero) {
		
		if (numero % 3 == 0 && numero % 5 == 0) {
			return "FIzzBuzz";
		} 
		else if (numero % 3 == 0) {
			return "Fizz";
		}
		else if (numero % 5 == 0) {
			return "Buzz";
		}
		else {
			return String.valueOf(numero);
		}
	}
	
	public static boolean isPalindromo(String palabrapalindromo) {
		palabrapalindromo = palabrapalindromo.toLowerCase();
		
		for (int  i = 0, j = palabrapalindromo.length() - 1; i <= j; i++, j--) {
			if (palabrapalindromo.charAt(i) !=palabrapalindromo.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
}
