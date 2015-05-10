/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Baldrick
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] composite = new boolean[100]; // store a Marker
					int j = 2;
					for (int i = 2; i < 10; i++){
						// Only need to test i < sqrt(100)
						if (!composite[i]){
							 while (j * i < 100){
								 composite[j * i] = true;
                                                                 j++;
							 }
                                                         j = 2;
						}// if
					}// for
					for (int index = 2; index < 1200; index++){
	                    if (!composite[index]){
	                        System.out.printf("%d is a prime number.\n", (index));
	                    }
					}
// TODO code application logic here
    }
    
}
