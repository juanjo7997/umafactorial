import java.util.Scanner;

public static void main(String []args) {
	Scanner scanInput = new Scanner(System.in);
	System.out.print("Introduzca un numero: ");
	long num = scanInput.nextLong();
								
											if (num<0) {
	System.out.println("El factorial no esta definido" + " para nume		ros negativos");								} else 	{										long fac = fact(num);
												System.out.println("El factorial de "+num+" es "+fac);
																					}
																					scanInput.close();
																														}


