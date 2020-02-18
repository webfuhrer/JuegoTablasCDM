package paquetetablas;

public class ClasePrincipal {

	public static void main(String[] args) {
		int opcion=EntradaSalida.pedirOpcion();//1-Jugar 2-Ranking 3-Salir
		while(opcion!=EntradaSalida.SALIR)
		{
			switch(opcion)
			{
			case EntradaSalida.JUGAR:
				int n=EntradaSalida.preguntarNTabla();//n es la tabla que
				//quiere practicar
				int puntuacion=0;
				int numero_operaciones=EntradaSalida.preguntarNumero();
				for(int i=0; i<numero_operaciones; i++)
				{
					int n_aleatorio=(int)Math.random()*10;
					int resultado_usuario=EntradaSalida.preguntarOperacion(n, n_aleatorio);
					int resultado_correcto=n*n_aleatorio;
					if(resultado_correcto==resultado_usuario)
					{
						//Está bien. Aumento puntuiacion
						puntuacion++;
					}
					else
					{
						//Está mal
					}
				}
				String nombre=EntradaSalida.preguntarNombre();
				float puntuacion_10=(float)puntuacion*10/(float)numero_operaciones;
				break;
			}
		}

	}

}
