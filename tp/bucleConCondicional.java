package tp;

public class bucleConCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 String f1 = "manzanas"; 
		 String f2 = "bananas";	
		 String f3 = "melones";
		 String f4 = "naranjas";
	     String frutas[] = new String[]{f1, f2, f3, f4};
	     
	     String peticion = "melones";
	     
	     if(peticion == f1 || peticion == f2 || peticion == f3 || peticion == f4) {
	    	 for(int i = 0; i<frutas.length; i++) {
	    		 if(frutas[i] == peticion) {
	    			 System.out.println("Si hay estok");
	    		 }
	    	 }
	     }else {
	    	 System.out.println("No poseemos estok de eso");
	     }
	}

}
