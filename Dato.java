/**
 * 
 * Esta clase  cre a un objeto de tipo dato con sus respectivas variables , este contiene todos los getter y setter de la clase y ademas cambia los valores que entres null a -10000.0 para poder
 * se descartados mas adelante.
 * @author Alejandro Fernández Restrepo
 * @version Mayo de 2019
 */
public class Dato {

    /** Codigo de la estación */
    private String codigoEstacion;
    /** Nombre de la estación */
    private String nombreEstacion;
    /** Fecha de registro del dato */
    private String fecha;
    /** Nivel de precipiytacion */
    private double nivelDePrecipitacion;
    /** Temperatura promedio*/
    private double temperaturaPromedio;
    /** Temperatura Maxima */
    private double temperaturaMaxima;
    /** Temperatura Minima */
    private double temperaturaMinima;

    /**
     * Constructor. Se recibe el número de la estación, el día de la semana y le
     * medida. Con base en lo anterior se crea un nuevo dato.
     * Si el dato no esta registrado en el archivo este se cambia por -10000.0 para que despues pueda ser descartado en las operaciones , filtros , estadistica , impresion y guardado con los datos.
     */
    public Dato(String[] datosDeLaTabla) {

        codigoEstacion = datosDeLaTabla[0];
        nombreEstacion = datosDeLaTabla[1];
        fecha = datosDeLaTabla[2];

        if (!datosDeLaTabla[3].isEmpty()) nivelDePrecipitacion = Double.parseDouble(datosDeLaTabla[3]);
        else nivelDePrecipitacion = -10000.0;

        if (!datosDeLaTabla[4].isEmpty()) temperaturaPromedio = Double.parseDouble(datosDeLaTabla[4]);
        else temperaturaPromedio = -10000.0;

        if (!datosDeLaTabla[5].isEmpty()) temperaturaMaxima = Double.parseDouble(datosDeLaTabla[5]);
        else temperaturaMaxima =  -10000.0;

        if (!datosDeLaTabla[6].isEmpty()) temperaturaMinima = Double.parseDouble(datosDeLaTabla[6]);
        else temperaturaMinima =  -10000.0;

    }

    public String getCodigoEstacion() {
        return this.codigoEstacion;
    }

    public String getNombreEstacion() {
        return this.nombreEstacion;
    }

    public String getFecha() {
        return this.fecha;
    }

    public double getNivelDePrecipitacion(){
        return this.nivelDePrecipitacion;
    }

    public double getTemperaturaPromedio() {
        return this.temperaturaPromedio;
    }

    public double getTemperaturaMaxima() {
        return this.temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return this.temperaturaMinima;
    }

    public void setCodigoEstacion(String codigoEstacion){
        this.codigoEstacion=codigoEstacion;
    }

    public void setNombreEstacion(String nombreEstacion){
        this.nombreEstacion=nombreEstacion;
    }

    public void setFecha(String fecha){
        this.fecha=fecha;
    }

    public void setNivelDePrecipitacion(double nivelDePrecipitacion){
        this.nivelDePrecipitacion = nivelDePrecipitacion;
    }

    public void setTemperaturaPromedio(double TemperaturaPromedio){
        this.temperaturaPromedio=temperaturaPromedio;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima){
        this.temperaturaMaxima=temperaturaMaxima;
    }

    public void setTemperaturaMinima(double temperaturaMinima){
        this.temperaturaMinima=temperaturaMinima;
    }
}
