package fractal;

public class automata {
	public static char convert(String regla){

	    char r='x';

	        if(regla.equals("000")) r  = '0';

	    else if(regla.equals("001")) r = '1';

	    else if(regla.equals("010")) r = '1';

	    else if(regla.equals("011")) r = '1';			// aqui se definen las reglas de las combinaciones //

	    else if(regla.equals("100")) r = '0';

	    else if(regla.equals("101")) r = '1';

	    else if(regla.equals("110")) r = '1';

	    else if(regla.equals("111")) r = '0';

	    return r; }



	    public static void main(String arg[])

	    {


	        int t,index,aux1,aux2,aux3;

	 String cadena = "10111011000110101011111010";

	t =cadena.length();

	index = t-1;

	String r = "";

	for (int j=0;j<40;j++){

	    aux1 = index;

	 // este debe ser longitud -1 , al iniciar

	    aux2 = index -index; // este debe ser 0 al iniciar

	    aux3 = index - (index-1); // este debe ser 1 al iniciar

	    int cnt = 1;

	    r="";

	    char[] cadx=cadena.toCharArray();

	    for (int i=0;i<cadena.length();i++){

	        if (aux3==t){

	           aux3=0;}

	        char l = cadx[aux1];

	        char m = cadx[aux2];

	        char n = cadx[aux3];

	        String n1 = l+""+m+""+n;

	        if (cnt==1){

	            aux1 = 0;

	            aux2 = 1;

	            aux3 = 2; }

	        else {

	            aux1 = aux1 +1;

	            aux2 = aux2 +1;

	            aux3 = aux3 +1; }

	        cnt = cnt+1;

	        r += ""+convert(n1);

	    }

	    

	    cadena = r;

	    for(char c:r.toCharArray()) {

	    if(c=='0'){

	        System.out.print(" ");

	    }

	    else {

	        System.out.print("*");

	    	}

	    }

	    System.out.println("");

		}   

	   }    

	}
