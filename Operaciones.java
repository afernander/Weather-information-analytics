import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase contiene todas las operaciones que se pueden hacer con los datos del arraylist  de marco de datos, promedio, minimo , maximo y moda
 * 
 * @author Alejandro Fernández Restrepo
 * @version mayo de 2019
 */
public class Operaciones
{
   private static Guardado guardar = new Guardado();
    /**
     * Este metodo sacara el promedio de los datos segun el tipo de dato a evaluar , el cual elige el usuario.
     */
    public static double promedio(List<Dato> listaConDatosFinal, int opcion){
        /** Este atributo almacenara la suma total de todos los datos para sacar su promedio*/
        double promedio =0.0;
        /** Este atributo ira contando cuantos datos se van a evaluar para despues poder sacar su promedio*/
        int contador =0;
        guardar.crearArchivo();
        guardar.aniadirArchivo("Los datos evaluados fueron :");
        switch(opcion){
            case 1:
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Nivel de precipitacion");
            System.out.println("Se van a guardar los datos evaludos en un archivo de persistencia");
            for(Dato elementoPromedio: listaConDatosFinal){
                if (elementoPromedio.getNivelDePrecipitacion()!=-10000.0){
                    promedio+=elementoPromedio.getNivelDePrecipitacion();
                    contador++;
                    guardar.aniadirArchivo(elementoPromedio.getCodigoEstacion()+"\t \t"+elementoPromedio.getNombreEstacion()+"\t  "+elementoPromedio.getFecha()+"\t"+elementoPromedio.getNivelDePrecipitacion());
                }
            }
            System.out.println("El promedio del Nivel de Precipitacion es : "+(promedio/contador));
            System.out.println("Se va a guardar el resultado en el archivo de persistencia");
            guardar.aniadirArchivo("El promedio del Nivel de Precipitacion es : "+(promedio/contador));
            return promedio/contador;
            case 2:
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Temperatura Promedio");
            System.out.println("Se van a guardar los datos evaludos en un archivo de persistencia");
            for(Dato elementoPromedio: listaConDatosFinal){
                if (elementoPromedio.getTemperaturaPromedio()!=-10000.0){
                    promedio+=elementoPromedio.getTemperaturaPromedio();
                    contador++;
                    guardar.aniadirArchivo(elementoPromedio.getCodigoEstacion()+"\t \t"+elementoPromedio.getNombreEstacion()+"\t  "+elementoPromedio.getFecha()+"\t"+elementoPromedio.getTemperaturaPromedio());
                }
            }
            System.out.println("El promedio de la temperatura promedio es : "+(promedio/contador));
            System.out.println("Se va a guardar el resultado en el archivo de persistencia");
            guardar.aniadirArchivo("El promedio de la temperatura promedio es : "+(promedio/contador));
            return promedio/contador;

            case 3:
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t    Temperatura Maxima");
            System.out.println("Se van a guardar los datos evaludos en un archivo de persistencia");
            for(Dato elementoPromedio: listaConDatosFinal){
                if (elementoPromedio.getTemperaturaMaxima()!=-10000.0){
                    promedio+=elementoPromedio.getTemperaturaMaxima();
                    contador++;
                    guardar.aniadirArchivo(elementoPromedio.getCodigoEstacion()+"\t \t"+elementoPromedio.getNombreEstacion()+"\t  "+elementoPromedio.getFecha()+"\t"+elementoPromedio.getTemperaturaMaxima());
                }
            }
            System.out.println("El promedio de la temperaturas maximas es : "+(promedio/contador));
            System.out.println("Se va a guardar el resultado en el archivo de persistencia");
            guardar.aniadirArchivo("El promedio de la temperatura maxima es : "+(promedio/contador));
            return promedio/contador;
            case 4:
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t    Temperatura Minima");
            System.out.println("Se van a guardar los datos evaludos en un archivo de persistencia");
            for(Dato elementoPromedio: listaConDatosFinal){
                if (elementoPromedio.getTemperaturaMinima()!=10000.0){
                    promedio+=elementoPromedio.getTemperaturaMinima();
                    contador++;
                    guardar.aniadirArchivo(elementoPromedio.getCodigoEstacion()+"\t \t"+elementoPromedio.getNombreEstacion()+"\t  "+elementoPromedio.getFecha()+"\t"+elementoPromedio.getTemperaturaMinima());
                }
            }
            System.out.println("El promedio de la temperatura minima es : "+(promedio/contador));
            System.out.println("Se va a guardar el resultado en el archivo de persistencia");
            guardar.aniadirArchivo("El promedio de la temperatura minima es : "+(promedio/contador));
            return promedio/contador;
        }
        return 0;
    }

    /**
     * Este metodo sacar los datos minimos de los datos segun el tipo de dato a evaluar , el cual elige el usuario.
     */
    public static double minimo(List<Dato> listaConDatosFinal, int opcion){
        /** Este atributo almacenara el dato minimo  de todos los datos*/
        double minimo =1000000.0;
        /** Este atributo guardara el dato que hasta el momento sea el minimo */
        double contenedor =0.0;
        /** Este atributo ira contando cuantos datos tienen el mismo valor que el minimo sacar */
        int contador =0;
        switch(opcion){
            case 1:
            for(Dato elementoMinimo: listaConDatosFinal){
                if (elementoMinimo.getNivelDePrecipitacion()!=-10000.0){
                    contenedor = elementoMinimo.getNivelDePrecipitacion();
                    if (contenedor <= minimo){
                        minimo = contenedor ;
                    }

                }
            }
            System.out.println("Los datos minimos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Nivel de precipitacion");
            System.out.println("Se van a guardar los datos minimos en un archivo de persistencia");
            for(Dato elementosMinimos : listaConDatosFinal){
                if (elementosMinimos.getNivelDePrecipitacion()==minimo){
                    System.out.println(elementosMinimos.getCodigoEstacion()+"\t"+elementosMinimos.getNombreEstacion()+"\t"+elementosMinimos.getFecha()+"\t"+elementosMinimos.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementosMinimos.getCodigoEstacion()+"\t \t"+elementosMinimos.getNombreEstacion()+"\t  "+elementosMinimos.getFecha()+"\t"+elementosMinimos.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato minimo");
            System.out.println("El dato minimo del nivel de precipitacion es : "+ minimo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato minimo");
            guardar.aniadirArchivo("El dato minimo del nivel de precipitacion es : "+ minimo);
            return minimo;
            case 2:
            for(Dato elementoMinimo: listaConDatosFinal){
                if (elementoMinimo.getTemperaturaPromedio()!=-10000.0){
                    contenedor = elementoMinimo.getTemperaturaPromedio();
                    if (contenedor <= minimo){
                        minimo = contenedor ;

                    }

                }
            }
            System.out.println("Los datos minimos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Temperatura Promedio");
            System.out.println("Se van a guardar los datos minimos en un archivo de persistencia");
            for(Dato elementosMinimos : listaConDatosFinal){
                if (elementosMinimos.getTemperaturaPromedio()==minimo){
                    System.out.println(elementosMinimos.getCodigoEstacion()+"\t"+elementosMinimos.getNombreEstacion()+"\t"+elementosMinimos.getFecha()+"\t"+elementosMinimos.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementosMinimos.getCodigoEstacion()+"\t \t"+elementosMinimos.getNombreEstacion()+"\t  "+elementosMinimos.getFecha()+"\t"+elementosMinimos.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato minimo");
            System.out.println("El dato minimo de la temperatura promedio es : "+ minimo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato minimo");
            guardar.aniadirArchivo("El dato minimo de la temperatura promedio es : "+ minimo);
            return minimo;
            case 3:

            for(Dato elementoMinimo: listaConDatosFinal){
                if (elementoMinimo.getTemperaturaMaxima()!=-10000.0){
                    contenedor = elementoMinimo.getTemperaturaMaxima();
                    if (contenedor <= minimo){
                        minimo = contenedor ;
                    }

                }
            }
            System.out.println("Los datos minimos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Temperatura Maxima");
            System.out.println("Se van a guardar los datos minimos en un archivo de persistencia");
            for(Dato elementosMinimos : listaConDatosFinal){
                if (elementosMinimos.getTemperaturaMaxima()==minimo){
                    System.out.println(elementosMinimos.getCodigoEstacion()+"\t"+elementosMinimos.getNombreEstacion()+"\t"+elementosMinimos.getFecha()+"\t"+elementosMinimos.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementosMinimos.getCodigoEstacion()+"\t \t"+elementosMinimos.getNombreEstacion()+"\t  "+elementosMinimos.getFecha()+"\t"+elementosMinimos.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato minimo");
            System.out.println("El dato minimo de la temperatura maxima es : "+ minimo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato minimo");
            guardar.aniadirArchivo("El dato minimo de la temperatura maxima es : "+ minimo);
            return minimo;
            case 4:

            for(Dato elementoMinimo: listaConDatosFinal){
                if (elementoMinimo.getTemperaturaMinima()!=-10000.0){
                    contenedor = elementoMinimo.getTemperaturaMinima();
                    if (contenedor <= minimo){
                        minimo = contenedor ;
                    }

                }
            }
            System.out.println("Los datos minimos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Temperatura Minima");
            System.out.println("Se van a guardar los datos minimos en un archivo de persistencia");
            for(Dato elementosMinimos : listaConDatosFinal){
                if (elementosMinimos.getTemperaturaMinima()==minimo){
                    System.out.println(elementosMinimos.getCodigoEstacion()+"\t"+elementosMinimos.getNombreEstacion()+"\t"+elementosMinimos.getFecha()+"\t"+elementosMinimos.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementosMinimos.getCodigoEstacion()+"\t \t"+elementosMinimos.getNombreEstacion()+"\t  "+elementosMinimos.getFecha()+"\t"+elementosMinimos.getTemperaturaMinima());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato minimo");
            System.out.println("El dato minimo de la temperatura minima es : "+ minimo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato minimo");
            guardar.aniadirArchivo("El dato minimo de la temperatura minima es : "+ minimo);
            return minimo;

        }
        return 0;
    }

    /**
     * Este metodo sacar los datos maximos de los datos segun el tipo de dato a evaluar , el cual elige el usuario.
     */
    public static double maximo(List<Dato> listaConDatosFinal, int opcion){
        /** Este atributo almacenara el dato maximo  de todos los datos*/
        double maximo =-1000000.0;
        /** Este atributo guardara el dato que hasta el momento sea el minimo */
        double contenedor =0.0;
        /** Este atributo ira contando cuantos datos tienen el mismo valor que el minimo sacar */
        int contador =0;
        switch(opcion){
            case 1:
            for(Dato elementoMaximo: listaConDatosFinal){
                if (elementoMaximo.getNivelDePrecipitacion()!=-10000.0){
                    contenedor = elementoMaximo.getNivelDePrecipitacion();
                    if (contenedor >= maximo){
                        maximo = contenedor ;
                    }

                }
            }
            System.out.println("Los datos maximos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Nivel de precipitacion");
            System.out.println("Se van a guardar los datos maximos en un archivo de persistencia");
            for(Dato elementosMaximos : listaConDatosFinal){
                if (elementosMaximos.getNivelDePrecipitacion()==maximo){
                    System.out.println(elementosMaximos.getCodigoEstacion()+"\t"+elementosMaximos.getNombreEstacion()+"\t"+elementosMaximos.getFecha()+"\t"+elementosMaximos.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementosMaximos.getCodigoEstacion()+"\t \t"+elementosMaximos.getNombreEstacion()+"\t  "+elementosMaximos.getFecha()+"\t"+elementosMaximos.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato maximo");
            System.out.println("El dato maximo del nivel de precipitacion es : "+ maximo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato maximo");
            guardar.aniadirArchivo("El dato maximo del nivel de precipitacion es : "+ maximo);
            return maximo;
            case 2:
            for(Dato elementoMaximo: listaConDatosFinal){
                if (elementoMaximo.getTemperaturaPromedio()!=-10000.0){
                    contenedor = elementoMaximo.getTemperaturaPromedio();
                    if (contenedor >= maximo){
                        maximo = contenedor ;
                    }

                }
            }
            System.out.println("Los datos maximos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Temperatura Promedio");
            System.out.println("Se van a guardar los datos maximos en un archivo de persistencia");
            for(Dato elementosMaximos : listaConDatosFinal){
                if (elementosMaximos.getTemperaturaPromedio()==maximo){
                    System.out.println(elementosMaximos.getCodigoEstacion()+"\t"+elementosMaximos.getNombreEstacion()+"\t"+elementosMaximos.getFecha()+"\t"+elementosMaximos.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementosMaximos.getCodigoEstacion()+"\t \t"+elementosMaximos.getNombreEstacion()+"\t  "+elementosMaximos.getFecha()+"\t"+elementosMaximos.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato maximo");
            System.out.println("El dato maximo de la temperatura promedio es : "+ maximo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato maximo");
            guardar.aniadirArchivo("El dato maximo de la temperatura promedio es : "+ maximo);
            return maximo;

            case 3:
            for(Dato elementoMaximo: listaConDatosFinal){
                if (elementoMaximo.getTemperaturaMaxima()!=-10000.0){
                    contenedor = elementoMaximo.getTemperaturaMaxima();
                    if (contenedor >= maximo){
                        maximo = contenedor ;
                    }

                }
            }
            System.out.println("Los datos maximos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Temperatura Maxima");
            System.out.println("Se van a guardar los datos maximos en un archivo de persistencia");
            for(Dato elementosMaximos : listaConDatosFinal){
                if (elementosMaximos.getTemperaturaMaxima()==maximo){
                    System.out.println(elementosMaximos.getCodigoEstacion()+"\t"+elementosMaximos.getNombreEstacion()+"\t"+elementosMaximos.getFecha()+"\t"+elementosMaximos.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementosMaximos.getCodigoEstacion()+"\t \t"+elementosMaximos.getNombreEstacion()+"\t  "+elementosMaximos.getFecha()+"\t"+elementosMaximos.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato maximo");
            System.out.println("El dato maximo es : "+ maximo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato maximo");
            guardar.aniadirArchivo("El dato maximo de la temperatura maxima es : "+ maximo);
            return maximo;

            case 4:
            for(Dato elementoMaximo: listaConDatosFinal){
                if (elementoMaximo.getTemperaturaMinima()!=-10000.0){
                    contenedor = elementoMaximo.getTemperaturaMinima();
                    if (contenedor >= maximo){
                        maximo = contenedor ;
                    }

                }
            }
            System.out.println("Los datos maximos se han registrado en :");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t    fecha \t   Temperatura Minima");
            System.out.println("Se van a guardar los datos maximos en un archivo de persistencia");
            for(Dato elementosMaximos : listaConDatosFinal){
                if (elementosMaximos.getTemperaturaMinima()==maximo){
                    System.out.println(elementosMaximos.getCodigoEstacion()+"\t"+elementosMaximos.getNombreEstacion()+"\t"+elementosMaximos.getFecha()+"\t"+elementosMaximos.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementosMaximos.getCodigoEstacion()+"\t \t"+elementosMaximos.getNombreEstacion()+"\t  "+elementosMaximos.getFecha()+"\t"+elementosMaximos.getTemperaturaMinima());
                }
            }
            System.out.println("Hay "+contador+" registros con el dato maximo");
            System.out.println("El dato maximo es : "+ maximo);
            guardar.aniadirArchivo("Hay "+contador+" registros con el dato maximo");
            guardar.aniadirArchivo("El dato maximo de la temperatura minima es : "+ maximo);
            return maximo;
        }
        return 0;

    }

    /**
     * Este metodo saca la moda de los datos segun el tipo de dato a evaluar , el cual elige el usuario.
     */
    public static double moda(List<Dato> listaConDatosFinal, int opcion){
        /**Esta variable tendra el numero de veces que re repite la moda */
        int maximoNumRepeticiones= 0;
        /**Esta variable tendra el valor de la moda*/
        double moda= 0;
        switch(opcion){
            case 1:
            for(Dato a:listaConDatosFinal)
            {
                /** Esta variable sera un contador que ira acomulando el numero de veces que se repite el dato a evaluar*/
                int numRepeticiones= 0;
                if(a.getNivelDePrecipitacion()!=-10000.0){
                    for(Dato b:listaConDatosFinal)
                    {
                        if(b.getNivelDePrecipitacion()!=-10000.0){
                            if(a.getNivelDePrecipitacion()==b.getNivelDePrecipitacion())
                            {
                                numRepeticiones++;
                            }   
                            if(numRepeticiones>maximoNumRepeticiones)
                            {
                                moda= a.getNivelDePrecipitacion();
                                maximoNumRepeticiones= numRepeticiones;
                            }  
                        }
                    }
                }
            }   
            System.out.print("La moda del nivel de precipitacion es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            guardar.aniadirArchivo("La moda del nivel de precipitacion es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            return moda;
            
            case 2:
            for(Dato a:listaConDatosFinal)
            {
                /** Esta variable sera un contador que ira acomulando el numero de veces que se repite el dato a evaluar*/
                int numRepeticiones= 0;
                if(a.getTemperaturaPromedio()!=-10000.0){
                    for(Dato b:listaConDatosFinal)
                    {
                        if(b.getTemperaturaPromedio()!=-10000.0){
                            if(a.getTemperaturaPromedio()==b.getTemperaturaPromedio())
                            {
                                numRepeticiones++;
                            }   
                            if(numRepeticiones>maximoNumRepeticiones)
                            {
                                moda= a.getTemperaturaPromedio();
                                maximoNumRepeticiones= numRepeticiones;
                            }  
                        }
                    }
                }
            }   
            System.out.print("La moda de la temperatura promedio es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            guardar.aniadirArchivo("La moda de la temperatura promedio es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            return moda;
            case 3:
            for(Dato a:listaConDatosFinal)
            {
                /** Esta variable sera un contador que ira acomulando el numero de veces que se repite el dato a evaluar*/
                int numRepeticiones= 0;
                if(a.getTemperaturaMaxima()!=-10000.0){
                    for(Dato b:listaConDatosFinal)
                    {
                        if(b.getTemperaturaMaxima()!=-10000.0){
                            if(a.getTemperaturaMaxima()==b.getTemperaturaMaxima())
                            {
                                numRepeticiones++;
                            }   
                            if(numRepeticiones>maximoNumRepeticiones)
                            {
                                moda= a.getTemperaturaMaxima();
                                maximoNumRepeticiones= numRepeticiones;
                            }  
                        }
                    }
                }
            }   
            System.out.print("La moda de la temperatura maxima es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            guardar.aniadirArchivo("La moda de la temperatura maxima es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            return moda;
            case 4:
            for(Dato a:listaConDatosFinal)
            {
                /** Esta variable sera un contador que ira acomulando el numero de veces que se repite el dato a evaluar*/
                int numRepeticiones= 0;
                if(a.getTemperaturaMinima()!=-10000.0){
                    for(Dato b:listaConDatosFinal)
                    {
                        if(b.getTemperaturaMinima()!=-10000.0){
                            if(a.getTemperaturaMinima()==b.getTemperaturaMinima())
                            {
                                numRepeticiones++;
                            }   
                            if(numRepeticiones>maximoNumRepeticiones)
                            {
                                moda= a.getTemperaturaMinima();
                                maximoNumRepeticiones= numRepeticiones;
                            }  
                        }
                    }
                }
            }   
            System.out.print("La moda de la temperatura minima es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            guardar.aniadirArchivo("La moda de la temperatura minima es : "+moda+" y se repite "+maximoNumRepeticiones+" veces");
            return moda;
        }
        return 0;
    }   

    /**
     * Este metodo llama a la operacion a ejecutarce segun la opcion que entre el ususario.
     */
    public static void llamadoAmetodos(List<Dato> listaConDatosFinal,int opcionOperacion, int opcionDato){
        switch (opcionOperacion){
            case 1:
            promedio(listaConDatosFinal,opcionDato);
            break;
            case 2:
            minimo(listaConDatosFinal,opcionDato);
            break;
            case 3:
            maximo(listaConDatosFinal,opcionDato);
            break;
            case 4:
            moda(listaConDatosFinal,opcionDato);
            break;
        }
    }

}
