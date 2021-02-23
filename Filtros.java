import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Esta clase contiene todas los filtros que se pueden hacer con los datos del arraylist  de marco de datos, menor que , mayor que , menor e igual que,
 * mayor e igual que , igual a y diferente de .
 * 
 * @author Alejandro Fernández Restrepo
 * @version mayo de 2019
 */
public class Filtros
{
    private static MarcoDeDatos lista = new MarcoDeDatos();
    private static Guardado guardar = new Guardado();
    /**
     *  Este metodo encuentra los datos menores que el dato que ingrese el usuario y lo imprime y llama a un metodo que lo guarda en un archivo.
     */
    public static int menorque(List<Dato> listaConDatosFinal, int opcion,double datoaevaluar){
        /** Esta variable acomulara el numero de datos que se filtren */
        int contador=0;
        switch(opcion){
            case 1:
            System.out.println("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Nivel de precipitacion");
            for(Dato elementomenorque: listaConDatosFinal){
                if (elementomenorque.getNivelDePrecipitacion()<datoaevaluar&&elementomenorque.getNivelDePrecipitacion()!=-10000.0){
                    System.out.println(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" datos menores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores que "+datoaevaluar);
            return contador;

            case 2:
            System.out.println("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Promedio");
            for(Dato elementomenorque: listaConDatosFinal){
                if (elementomenorque.getTemperaturaPromedio()<datoaevaluar&&elementomenorque.getTemperaturaPromedio()!=-10000.0){
                    System.out.println(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" datos menores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores que "+datoaevaluar);
            return contador;

            case 3:
            System.out.println("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Maxima");
            for(Dato elementomenorque: listaConDatosFinal){
                if (elementomenorque.getTemperaturaMaxima()<datoaevaluar&&elementomenorque.getTemperaturaMaxima()!=-10000.0){
                    System.out.println(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" datos menores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores que "+datoaevaluar);
            return contador;

            case 4:
            System.out.println("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Minima");
            for(Dato elementomenorque: listaConDatosFinal){
                if (elementomenorque.getTemperaturaMinima()<datoaevaluar&&elementomenorque.getTemperaturaMinima()!=-10000.0){
                    System.out.println(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementomenorque.getCodigoEstacion()+"\t"+elementomenorque.getNombreEstacion()+"\t"+elementomenorque.getFecha()+"\t"+elementomenorque.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" datos menores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores que "+datoaevaluar);
            return contador;
        }
        return contador;
    }

    /**
     *  Este metodo encuentra los datos mayores que el dato que ingrese el usuario y lo imprime y llama a un metodo que lo guarda en un archivo.
     */
    public static int mayorque(List<Dato> listaConDatosFinal, int opcion,double datoaevaluar){

        /** Esta variable acomulara el numero de datos que se filtren */
        int contador=0;

        switch(opcion){
            case 1:
            System.out.println("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Nivel de precipitacion");
            for(Dato elementomayorque: listaConDatosFinal){
                if (elementomayorque.getNivelDePrecipitacion()>datoaevaluar&&elementomayorque.getNivelDePrecipitacion()!=-10000.0){
                    System.out.println(elementomayorque.getCodigoEstacion()+"\t"+elementomayorque.getNombreEstacion()+"\t"+elementomayorque.getFecha()+"\t"+elementomayorque.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementomayorque.getCodigoEstacion()+"\t"+elementomayorque.getNombreEstacion()+"\t"+elementomayorque.getFecha()+"\t"+elementomayorque.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" datos mayores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores que "+datoaevaluar);
            return contador;

            case 2:
            System.out.println("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Promedio");
            for(Dato elementomayor: listaConDatosFinal){
                if (elementomayor.getTemperaturaPromedio()>datoaevaluar&&elementomayor.getTemperaturaPromedio()!=-10000.0){
                    System.out.println(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" datos mayores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores que "+datoaevaluar);
            return contador;

            case 3:
            System.out.println("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Maxima");
            for(Dato elementomayor: listaConDatosFinal){
                if (elementomayor.getTemperaturaMaxima()>datoaevaluar&&elementomayor.getTemperaturaMaxima()!=-10000.0){
                    System.out.println(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" datos mayores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores que "+datoaevaluar);
            return contador;

            case 4:
            System.out.println("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Minima");
            for(Dato elementomayor: listaConDatosFinal){
                if (elementomayor.getTemperaturaMinima()>datoaevaluar&&elementomayor.getTemperaturaMinima()!=-10000.0){
                    System.out.println(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMinima());
                }
            }
            System.out.println("Hay "+contador+" datos mayores que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores que "+datoaevaluar);
            return contador;
        }
        return contador;
    }

    /**
     *  Este metodo encuentra los datos menores e iguales que el dato que ingrese el usuario y lo imprime y llama a un metodo que lo guarda en un archivo.
     */
    public static int menorEigual(List<Dato> listaConDatosFinal, int opcion,double datoaevaluar){
        /** Esta variable acomulara el numero de datos que se filtren */
        int contador=0;
        switch(opcion){
            case 1:
            System.out.println("Los datos menores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Nivel de precipitacion");
            for(Dato elementomenor: listaConDatosFinal){
                if (elementomenor.getNivelDePrecipitacion()<=datoaevaluar&&elementomenor.getNivelDePrecipitacion()!=-10000.0){
                    System.out.println(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            return contador;

            case 2:
            System.out.println("Los datos menores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Promedio");
            for(Dato elementomenor: listaConDatosFinal){
                if (elementomenor.getTemperaturaPromedio()<=datoaevaluar&&elementomenor.getTemperaturaPromedio()!=-10000.0){
                    System.out.println(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            return contador;

            case 3:
            System.out.println("Los datos menores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Maxima");
            for(Dato elementomenor: listaConDatosFinal){
                if (elementomenor.getTemperaturaMaxima()<=datoaevaluar&&elementomenor.getTemperaturaMaxima()!=-10000.0){
                    System.out.println(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            return contador;

            case 4:
            System.out.println("Los datos menores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos menores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Minima");
            for(Dato elementomenor: listaConDatosFinal){
                if (elementomenor.getTemperaturaMinima()<=datoaevaluar&&elementomenor.getTemperaturaMinima()!=-10000.0){
                    System.out.println(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementomenor.getCodigoEstacion()+"\t"+elementomenor.getNombreEstacion()+"\t"+elementomenor.getFecha()+"\t"+elementomenor.getTemperaturaMinima());
                }
            }
            System.out.println("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos menores e iguales que "+datoaevaluar);
            return contador;
        }
        return contador;
    }

    /**
     *  Este metodo encuentra los datos mayores e iguales que el dato que ingrese el usuario y lo imprime y llama a un metodo que lo guarda en un archivo.
     */
    public static int mayorEigual(List<Dato> listaConDatosFinal, int opcion,double datoaevaluar){
        /** Esta variable acomulara el numero de datos que se filtren */
        int contador=0;
        switch(opcion){
            case 1:
            System.out.println("Los datos mayores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Nivel de precipitacion");
            for(Dato elementomayor: listaConDatosFinal){
                if (elementomayor.getNivelDePrecipitacion()>=datoaevaluar&&elementomayor.getNivelDePrecipitacion()!=-10000.0){
                    System.out.println(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" datos mayores e iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores e iguales que "+datoaevaluar);
            return contador;

            case 2:
            System.out.println("Los datos mayores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Promedio");
            for(Dato elementomayor: listaConDatosFinal){
                if (elementomayor.getTemperaturaPromedio()>=datoaevaluar&&elementomayor.getTemperaturaPromedio()!=-10000.0){
                    System.out.println(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" datos mayores e iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores e iguales que "+datoaevaluar);
            return contador;

            case 3:
            System.out.println("Los datos mayores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Maxima");
            for(Dato elementomayor: listaConDatosFinal){
                if (elementomayor.getTemperaturaMaxima()>=datoaevaluar&&elementomayor.getTemperaturaMaxima()!=-10000.0){
                    System.out.println(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" datos mayores e iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores e iguales que "+datoaevaluar);
            return contador;

            case 4:
            System.out.println("Los datos mayores e iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos mayores e iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Minima");
            for(Dato elementomayor: listaConDatosFinal){
                if (elementomayor.getTemperaturaMinima()>=datoaevaluar&&elementomayor.getTemperaturaMinima()!=-10000.0){
                    System.out.println(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementomayor.getCodigoEstacion()+"\t"+elementomayor.getNombreEstacion()+"\t"+elementomayor.getFecha()+"\t"+elementomayor.getTemperaturaMinima());
                }
            }
            System.out.println("Hay "+contador+" datos mayores e iguale que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos mayores e iguales que "+datoaevaluar);
            return contador;
        }
        return contador;
    }

    /**
     *  Este metodo encuentra los datos iguales que el dato que ingrese el usuario y lo imprime y llama a un metodo que lo guarda en un archivo.
     */
    public static int igual(List<Dato> listaConDatosFinal, int opcion,double datoaevaluar){
        /** Esta variable acomulara el numero de datos que se filtren */
        int contador=0;
        switch(opcion){
            case 1:
            System.out.println("Los datos iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Nivel de precipitacion");
            for(Dato elementoigual: listaConDatosFinal){
                if (elementoigual.getNivelDePrecipitacion()==datoaevaluar&&elementoigual.getNivelDePrecipitacion()!=-10000.0){
                    System.out.println(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" datos iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos iguales que "+datoaevaluar);
            return contador;

            case 2:
            System.out.println("Los datos iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura promedio");
            for(Dato elementoigual: listaConDatosFinal){
                if (elementoigual.getTemperaturaPromedio()==datoaevaluar&&elementoigual.getTemperaturaPromedio()!=-10000.0){
                    System.out.println(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" datos iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos iguales que "+datoaevaluar);
            return contador;

            case 3:
            System.out.println("Los datos iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Maxima");
            for(Dato elementoigual: listaConDatosFinal){
                if (elementoigual.getTemperaturaMaxima()==datoaevaluar&&elementoigual.getTemperaturaMaxima()!=-10000.0){
                    System.out.println(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" datos iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos iguales que "+datoaevaluar);
            return contador;

            case 4:
            System.out.println("Los datos iguales que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos iguales que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Minima");
            for(Dato elementoigual: listaConDatosFinal){
                if (elementoigual.getTemperaturaMinima()==datoaevaluar&&elementoigual.getTemperaturaMinima()!=-10000.0){
                    System.out.println(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementoigual.getCodigoEstacion()+"\t"+elementoigual.getNombreEstacion()+"\t"+elementoigual.getFecha()+"\t"+elementoigual.getTemperaturaMinima());
                }
            }
            System.out.println("Hay "+contador+" datos iguales que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos iguales que "+datoaevaluar);
            return contador;
        }
        return contador;
    }

    /**
     *  Este metodo encuentra los datos diferentes que el dato que ingrese el usuario y lo imprime y llama a un metodo que lo guarda en un archivo.
     */
    public static int diferente(List<Dato> listaConDatosFinal, int opcion,double datoaevaluar){
        /** Esta variable acomulara el numero de datos que se filtren */
        int contador=0;
        switch(opcion){
            case 1:
            System.out.println("Los datos diferentes que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos diferentes que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Nivel de Precipitacion");
            for(Dato elementodiferente: listaConDatosFinal){
                if (elementodiferente.getNivelDePrecipitacion()!=datoaevaluar&&elementodiferente.getNivelDePrecipitacion()!=-10000.0){
                    System.out.println(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getNivelDePrecipitacion());
                    contador++;
                    guardar.aniadirArchivo(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getNivelDePrecipitacion());
                }
            }
            System.out.println("Hay "+contador+" datos diferentes  que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos diferentes que "+datoaevaluar);
            return contador;

            case 2:
            System.out.println("Los datos diferentes que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos diferentes que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Promedio");
            for(Dato elementodiferente: listaConDatosFinal){
                if (elementodiferente.getTemperaturaPromedio()!=datoaevaluar&&elementodiferente.getTemperaturaPromedio()!=-10000.0){
                    System.out.println(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getTemperaturaPromedio());
                    contador++;
                    guardar.aniadirArchivo(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getTemperaturaPromedio());
                }
            }
            System.out.println("Hay "+contador+" datos diferentes que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos diferentes que "+datoaevaluar);
            return contador;

            case 3:
            System.out.println("Los datos diferentes que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos diferentes que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Maxima");
            for(Dato elementodiferente: listaConDatosFinal){
                if (elementodiferente.getTemperaturaMaxima()!=datoaevaluar&&elementodiferente.getTemperaturaMaxima()!=-10000.0){
                    System.out.println(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getTemperaturaMaxima());
                    contador++;
                    guardar.aniadirArchivo(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getTemperaturaMaxima());
                }
            }
            System.out.println("Hay "+contador+" datos diferentes que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos diferentes que "+datoaevaluar);
            return contador;

            case 4:
            System.out.println("Los datos diferentes que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Los datos diferentes que que "+datoaevaluar+" son:");
            guardar.aniadirArchivo("Codigo de la estacion \t Nombre de la estacion \t   fecha \t   Temperatura Minima");
            for(Dato elementodiferente: listaConDatosFinal){
                if (elementodiferente.getTemperaturaMinima()!=datoaevaluar&&elementodiferente.getTemperaturaMinima()!=-10000.0){
                    System.out.println(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getTemperaturaMinima());
                    contador++;
                    guardar.aniadirArchivo(elementodiferente.getCodigoEstacion()+"\t"+elementodiferente.getNombreEstacion()+"\t"+elementodiferente.getFecha()+"\t"+elementodiferente.getTemperaturaMinima());
                }
            }
            System.out.println("Hay "+contador+" datos diferentes que "+datoaevaluar);
            guardar.aniadirArchivo("Hay "+contador+" datos diferentes que "+datoaevaluar);
            return contador;

        }
        return contador;

    }

    /**
     * Este metodo le pide al usuario en numero que desea filtrar
     */
    public static double datoafiltrar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el un numero que sea para el filtro");
        /** Esta variable va a tener el dato a filtar el cual ingresa el usuario*/
        double datoaevaluar=teclado.nextDouble();
        return datoaevaluar;
    }

    /**
     * Este metodo llama al filtro a ejecutarce segun la opcion que entre el ususario.
     */
    public static void llamadoAmetodos(List<Dato> listaConDatosFinal,int opcionOperacion, int opcionDato){

        switch (opcionOperacion){
            case 1:
            menorque(listaConDatosFinal,opcionDato,datoafiltrar());
            break;
            case 2:
            mayorque(listaConDatosFinal,opcionDato,datoafiltrar());
            break;
            case 3:
            menorEigual(listaConDatosFinal,opcionDato,datoafiltrar());
            break;
            case 4:
            mayorEigual(listaConDatosFinal,opcionDato,datoafiltrar());
            break;
            case 5:
            igual(listaConDatosFinal,opcionDato,datoafiltrar());
            break;
            case 6:
            diferente(listaConDatosFinal,opcionDato,datoafiltrar());
            break;

        }
    }

}