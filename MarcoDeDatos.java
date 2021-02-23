/**
 * 
 * @author Alejandro Fernández Restrepo
 * @version Mayo de 2019
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class MarcoDeDatos
{
    /** ArrayList donde se almacenan los datos leidos */
    private static List<Dato> listaConDatosFinal;
    private static Guardado guardar = new Guardado();
    /** 
     * Este método recibe el nombre del archivo que se va a leer.
     * Se trata de abrir el archivo, si se puede abrir, se leen los
     * datos y se guardan en un ArrayList que almacena referencias a 
     * objetos tipo Dato.
     */
    public static List<Dato> leerDatos(String nombre)  {

        listaConDatosFinal = new ArrayList<Dato>();

        try {

            Scanner archivo = new Scanner(new File(nombre));

            while(archivo.hasNextLine()) {

                List<String> listaDatosPorFila = new ArrayList<String>();

                /** Strign almacena la informacion por linea del archivo para poder organizarla*/
                String linea = archivo.nextLine();

                if (linea.charAt(linea.length()-1)==','){
                    linea+="\"\"";
                }
                String datoactual[]=linea.split(",");
                //System.out.println(datoactual.length); prueba para saber si se esta creando bien el array
                // ciclo donde se organizan y se separaan los datos de cada lina
                for (int i = 0; i < datoactual.length; i++) {

                    if (i != 1) datoactual[i] = datoactual[i].replaceAll("\"", "").replaceAll(" ", "");             
                    else datoactual[i] = datoactual[i].replaceAll("\"", "");
                }

                //ciclo donde se junta el nombre y el lugar de captura de los datos para tenerlo en una sola posicion
                for (int j = 0; j < datoactual.length; j++) {

                    if (j == 1) {
                        listaDatosPorFila.add(datoactual[j] + ", " + datoactual[j+1]); 
                        j++;
                    } else {
                        listaDatosPorFila.add(datoactual[j]);
                    }

                }

                /** arreglo con los datos finales organizados del archivo*/
                String[] arrayConDatosDelArchivoPorFilas = new String[datoactual.length -1];
                //System.out.println(arrayConDatosDelArchivoPorFilas.length); prueba para saber si se esta creando bien el array
                arrayConDatosDelArchivoPorFilas = listaDatosPorFila.toArray(arrayConDatosDelArchivoPorFilas);   

                listaConDatosFinal.add(new Dato(arrayConDatosDelArchivoPorFilas));
            }
            /**ciclo para imprimir todos los datos , si el dato es -10000.0(significa que era null en la tabla de datos) se imprime una X en su lugar*/
            System.out.println("Codigo de la estacion   Nombre de la estacion     Fecha \t        Prcp   TProm    TMax    TMin");
            for(Dato d: listaConDatosFinal){
                System.out.println();
                System.out.print(d.getCodigoEstacion()+"\t \t"+d.getNombreEstacion()+"\t  "+d.getFecha()+"\t");
                if(d.getNivelDePrecipitacion()== -10000.0){
                    System.out.print("X"+"\t");
                }else{
                    System.out.print(d.getNivelDePrecipitacion()+"\t");
                }

                if(d.getTemperaturaPromedio()== -10000.0){
                    System.out.print("X"+"\t");
                }else{
                    System.out.print(d.getTemperaturaPromedio()+"\t");
                }

                if(d.getTemperaturaMaxima()== -10000.0){
                    System.out.print("X"+"\t");
                }else{
                    System.out.print(d.getTemperaturaMaxima()+"\t");
                }

                if(d.getTemperaturaMinima()== -10000.0){
                    System.out.print("X");
                }else{
                    System.out.print(d.getTemperaturaMinima());
                }
            }
            System.out.println();
            System.out.println("Ya se leyeron los datos");
            llamadoAmetodos();
        } catch (FileNotFoundException e) {
            System.out.println("No pude abrir el archivo");

        }
        return listaConDatosFinal;
    }

    /**
     *  Este metodo es un scanner para que el usuario eliga la ciudad que quiere evaluar.
     */
    public static int eleccionArchivo(){
        Scanner teclado = new Scanner(System.in);
        /** Esta variable va a tener la opcion que elija el usuario para evaluar un tipo de dato*/
        int opcionarchivo=0;
        /** Esta variable va a mantener un ciclo si el usuario ingresa una opcion invalida*/
        boolean eleccion=true;
        try{
            while (eleccion){

                System.out.println("Seleccione la ciudad a evaluar: ");
                System.out.println("1.Para Medellín.");
                System.out.println("2.Para Madrid.");
                System.out.println("3.Para Tokyo.");
                System.out.println("4.Para New York City.");
                System.out.println("5.Para Londres.");
                System.out.println("6.Para Ciudad del cabo.");
                opcionarchivo=teclado.nextInt();
                if (opcionarchivo>0&&opcionarchivo<7){
                    eleccion = false;
                    return opcionarchivo;
                }else{
                    System.out.println("La opcion elegida no es valida por favor ingrese una opcion valida");
                }
            }
        }catch(InputMismatchException error){
            System.err.println("Lo ingresado no es un numero o caracter valido para la eleccion , intentelo de nuevo");
            opcionarchivo=eleccionArchivo();
            return opcionarchivo;
        }

        return 1;
    }

    /** 
     * Este metodo es un scanner para que el usuario eliga el tipo de dato del archivo quiere evaluar
     */
    public static int eleccionDato(){
        Scanner teclado = new Scanner(System.in);
        /** Esta variable va a tener la opcion que elija el usuario para evaluar un tipo de dato*/
        int opciondato=0;
        /** Esta variable va a mantener un ciclo si el usuario ingresa una opcion invalida*/
        boolean eleccion=true;
        try{
            while (eleccion){
                System.out.println("Seleccione el dato que desea operar: ");
                System.out.println("1.Para Precipitacion.");
                System.out.println("2.Para Temperatura promedio.");
                System.out.println("3.Temperatura maxima.");
                System.out.println("4.Temperatura minima.");
                opciondato=teclado.nextInt();
                if (opciondato>0&&opciondato<5){
                    eleccion = false;
                    return opciondato;
                }else{
                    System.out.println("La opcion elegida no es valida por favor ingrese una opcion valida");
                }
            }
        }catch(InputMismatchException error){
            System.err.println("Lo ingresado no es un numero o caracter valido para la eleccion , intentelo de nuevo");
            opciondato=eleccionDato();
            return opciondato;
        }
        return 1;
    }

    /** 
     * Este metodo es un scanner para que el usuario eliga si quiere hacer un filtro o una operacion con los datos
     */
    public static int eleccionEstadistica(){
        Scanner teclado = new Scanner(System.in);
        /** Esta variable va a tener la opcion que elija el usuario para determinar si se hace filtro o operacion*/
        int opciondato=0;
        /** Esta variable va a mantener un ciclo si el usuario ingresa una opcion invalida*/
        boolean eleccion=true;
        try{
            while (eleccion){
                System.out.println("Desea hacer un filtro , una operacion o hacer visualizacion: ");
                System.out.println("1.Para Operacion.");
                System.out.println("2.Para Filtro.");
                System.out.println("3.Para Visualizacion.");
                opciondato=teclado.nextInt();
                if (opciondato>0&&opciondato<4){
                    eleccion = false;
                    return opciondato;
                }else{
                    System.out.println("La opcion elegida no es valida por favor ingrese una opcion valida");
                }
            }
        }catch(InputMismatchException error){
            System.err.println("Lo ingresado no es un numero o caracter valido para la eleccion , intentelo de nuevo");
            opciondato=eleccionEstadistica();
            return opciondato;
        }
        return 1;
    }

    /** 
     * Este metodo es un scanner para que el usuario eliga el tipo de operacion que desea realizar
     */
    public static int eleccionOperacion(){
        Scanner teclado = new Scanner(System.in);
        /** Esta variable va a tener la opcion que elija el usuario para hacer determinada operacion*/
        int opciondato=0;
        /** Esta variable va a mantener un ciclo si el usuario ingresa una opcion invalida*/
        boolean eleccion=true;
        try{
            while (eleccion){
                System.out.println("Seleccione que operacion desea realizar: ");
                System.out.println("1.Para Promedio de los datos.");
                System.out.println("2.Para hallar el valor minimo.");
                System.out.println("3.Para hallar el valor maximo.");
                System.out.println("4.Para hallar la moda.");
                opciondato=teclado.nextInt();
                if (opciondato>0&&opciondato<5){
                    eleccion = false;
                    return opciondato;
                }else{
                    System.out.println("La opcion elegida no es valida por favor ingrese una opcion valida");
                }
            }
        }catch(InputMismatchException error){
            System.err.println("Lo ingresado no es un numero o caracter valido para la eleccion , intentelo de nuevo");
            opciondato=eleccionOperacion();
            return opciondato;
        }
        return 1;
    }

    /** 
     * Este metodo es un scanner para que el usuario eliga el tipo de filtro que desea realizar.
     */
    public static int eleccionFiltro(){
        Scanner teclado = new Scanner(System.in);
        /** Esta variable va a tener la opcion que elija el usuario para hacer determinado filtro*/
        int opciondato=0;
        /** Esta variable va a mantener un ciclo si el usuario ingresa una opcion invalida*/
        boolean eleccion=true;
        try{
            while (eleccion){
                System.out.println("Seleccione que filtro desea realizar: ");
                System.out.println("1.Para Menores que.");
                System.out.println("2.Para Mayores que.");
                System.out.println("3.Para Menores e iguales que.");
                System.out.println("4.Para Mayores e iguales que.");
                System.out.println("5.Para Iguales que.");
                System.out.println("6.Para Diferentes  que.");
                opciondato=teclado.nextInt();
                if (opciondato>0&&opciondato<7){
                    eleccion = false;
                    return opciondato;
                }else{
                    System.out.println("La opcion elegida no es valida por favor ingrese una opcion valida");

                }
            }
        }catch(InputMismatchException error){
            System.err.println("Lo ingresado no es un numero o caracter valido para la eleccion , intentelo de nuevo");
            opciondato=eleccionFiltro();
            return opciondato;
        }
        return 1;
    }

    /** 
     * Este metodo es un scanner para que el usuario eliga el tipo de visualizacion que desea realizar.
     */
    public static int eleccionVisualizacion(){
        Scanner teclado = new Scanner(System.in);
        /** Esta variable va a tener la opcion que elija el usuario para hacer determinada visualizacion*/
        int opciondato=0;
        /** Esta variable va a mantener un ciclo si el usuario ingresa una opcion invalida*/
        boolean eleccion=true;
        try{
            while (eleccion){
                System.out.println("Seleccione que visualizacion desea realizar: ");
                System.out.println("1.Diagrama de lineas.");
                System.out.println("2.Diagrama de puntos.");
                opciondato=teclado.nextInt();
                if (opciondato>0&&opciondato<3){
                    eleccion = false;
                    return opciondato;
                }else{
                    System.out.println("La opcion elegida no es valida por favor ingrese una opcion valida");

                }
            }
        }catch(InputMismatchException error){
            System.err.println("Lo ingresado no es un numero o caracter valido para la eleccion , intentelo de nuevo");
            opciondato=eleccionVisualizacion();
            return opciondato;
        }
        return 1;
    }

    /**
     * Este metodo sirve para llamar a las operaciones o filtros dependiendo de la eleccion del usuario. este metodo creara instancias de la clase operacion y filtro para
     * llamar a sus metodos y mandarle la opcion del dato y el arrylis con los datos , para que estos se puedan ejecutar
     */
    public static void llamadoAmetodos(){
        MarcoDeDatos listaDeDatos = new MarcoDeDatos();
        Operaciones operacion = new Operaciones();
        Visualizacion diagrama = new Visualizacion();
        Filtros filtro= new Filtros();
        /**Esta variable tendra la opcion de estadistica que el usuario desea usar*/
        int  opcionEstadistica= eleccionEstadistica();
        /**Esta variable tendra la opcion del dato que el usuario desea usar*/
        int  opcionDato=eleccionDato();
        if(opcionEstadistica==1){
            int opcionOperacion=eleccionOperacion();
            operacion.llamadoAmetodos(listaConDatosFinal,opcionOperacion,opcionDato);
        }else if (opcionEstadistica==2){
            int eleccionFiltro=eleccionFiltro();
            filtro.llamadoAmetodos(listaConDatosFinal,eleccionFiltro,opcionDato);
        }else if (opcionEstadistica==3){
            int opcionVisualizacion=eleccionVisualizacion();
            diagrama.llamadoAmetodos(listaConDatosFinal,opcionVisualizacion,opcionDato);
        }

    }

    /**
     * Estem metodo solo retorna la lista con los datos para poder acer las clases de prueba
     */
    public static List<Dato> getList(String nombre)  {

        listaConDatosFinal = new ArrayList<Dato>();

        try {

            Scanner archivo = new Scanner(new File(nombre));

            while(archivo.hasNextLine()) {

                List<String> listaDatosPorFila = new ArrayList<String>();

                /** Strign almacena la informacion por linea del archivo para poder organizarla*/
                String linea = archivo.nextLine();

                if (linea.charAt(linea.length()-1)==','){
                    linea+="\"\"";
                }
                String datoactual[]=linea.split(",");
                //System.out.println(datoactual.length); prueba para saber si se esta creando bien el array
                // ciclo donde se organizan y se separaan los datos de cada lina
                for (int i = 0; i < datoactual.length; i++) {

                    if (i != 1) datoactual[i] = datoactual[i].replaceAll("\"", "").replaceAll(" ", "");             
                    else datoactual[i] = datoactual[i].replaceAll("\"", "");
                }

                //ciclo donde se junta el nombre y el lugar de captura de los datos para tenerlo en una sola posicion
                for (int j = 0; j < datoactual.length; j++) {

                    if (j == 1) {
                        listaDatosPorFila.add(datoactual[j] + ", " + datoactual[j+1]); 
                        j++;
                    } else {
                        listaDatosPorFila.add(datoactual[j]);
                    }

                }

                /** arreglo con los datos finales organizados del archivo*/
                String[] arrayConDatosDelArchivoPorFilas = new String[datoactual.length -1];
                //System.out.println(arrayConDatosDelArchivoPorFilas.length); prueba para saber si se esta creando bien el array
                arrayConDatosDelArchivoPorFilas = listaDatosPorFila.toArray(arrayConDatosDelArchivoPorFilas);   

                listaConDatosFinal.add(new Dato(arrayConDatosDelArchivoPorFilas));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No pude abrir el archivo");

        }
        return listaConDatosFinal;
    }

    /**
     * Programa principal.
     * Se llama al metodo que lee el archivo con el respectivo nombre del archivo dependiendo de la opcion que ingrese el usuario
     * 
     */
    public static void main(String [] args) {

        int opcionarchivo= eleccionArchivo();
        switch (opcionarchivo){
            case 1:
            System.out.println("Se van a leer los datos");
            guardar.aniadirArchivo("Los datos usados fueren de la ciudad de Medellin");
            leerDatos("DatosMedellin.csv");
            break;

            case 2:
            System.out.println("Se van a leer los datos");
            guardar.aniadirArchivo("Los datos usados fueren de la ciudad de Madrid");
            leerDatos("DatosMadrid.csv");
            break;

            case 3:
            System.out.println("Se van a leer los datos");
            guardar.aniadirArchivo("Los datos usados fueren de la ciudad de Tokyo");
            leerDatos("DatosTokyo.csv");
            break;

            case 4:
            System.out.println("Se van a leer los datos");
            guardar.aniadirArchivo("Los datos usados fueren de la ciudad de New York");
            leerDatos("DatosNY.csv");
            break;
            case 5:
            System.out.println("Se van a leer los datos");
            guardar.aniadirArchivo("Los datos usados fueren de la ciudad de Londres");
            leerDatos("DatosLondres.csv");
            break;
            case 6:
            System.out.println("Se van a leer los datos");
            guardar.aniadirArchivo("Los datos usados fueren de la ciudad de Ciudad del Cabo");
            leerDatos("DatosCabo.csv");
            break;
        }

    }
}
