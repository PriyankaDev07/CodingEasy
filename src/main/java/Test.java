

public class Test
{    
    	  public static void main(String[] args) {    
    		   String string = "The best of both worlds"; 
   	        String word[]=string.split(" ");
   	     String rev=" ";
   	     
   	     for(int k=word.length-1;k>=0;k--)
   	     { 
   	    	 String m=word[k];
   	    	 rev=rev.concat(" ")  ;
   	        for(int i =0; i<m.length(); i++)
   	        {    
   	            
   	        	//System.out.println( " ");	
   	            	rev=rev+m.charAt(i);
   	            }
   	     
   	       
   	     }
   	  System.out.print( rev); 
   	         
   	}  }
