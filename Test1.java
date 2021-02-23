
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test.
 *
 * @author  (Alejandro Fernandez Restrepo)
 * @version (mayo de 2019)
 */
public class Test1
{
    /**
     * Default constructor for test class Test
     */
    public Test1()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test de clase Operacion Metodo Promedio
     */
    @Test
    public void testOperacionesPromedio(){
        //Promedio
        assertEquals(5.4861303744798775,5.4861303744798775,Operaciones.promedio(MarcoDeDatos.getList("DatosMedellin.csv"),1));
        assertEquals(23.51038154392194,23.51038154392194,Operaciones.promedio(MarcoDeDatos.getList("DatosMedellin.csv"),2));
    }

    /**
     * Test de clase Operacion Metodo Minimo
     */
    @Test
    public void testOperacionesMinimo(){
        //minimo
        assertEquals(-4.0,-4.0,Operaciones.minimo(MarcoDeDatos.getList("DatosLondres.csv"),3));
        assertEquals(-12.0,-12.0,Operaciones.minimo(MarcoDeDatos.getList("DatosLondres.csv"),4));
    }

    /**
     * Test de clase Operacion Metodo Maximo
     */
    @Test
    public void testOperacionesMaximo(){
        //minimo
        assertEquals(210.3,210.3,Operaciones.maximo(MarcoDeDatos.getList("DatosNY.csv"),1));
        assertEquals(41.1,41.1,Operaciones.maximo(MarcoDeDatos.getList("DatosNY.csv"),3));
    }

    /**
     * Test de clase Operacion Metodo Moda
     */
    @Test
    public void testOperacionesModa(){
        //minimo
        assertEquals(14.2,14.2,Operaciones.moda(MarcoDeDatos.getList("DatosCabo.csv"),2));
        assertEquals(13.0,13.0,Operaciones.moda(MarcoDeDatos.getList("DatosCabo.csv"),4));
    }

    /**
     * Test de clase Filtros Metodo menor que
     */
    @Test
    public void testFiltrosmenorque(){
        //menor
        assertEquals(9293,9293,Filtros.menorque(MarcoDeDatos.getList("DatosCabo.csv"),1,14.0));
        //assertEquals(10385,10385,Filtros.menorque(MarcoDeDatos.getList("DatosCabo.csv"),4,23.3));
    }

    /**
     * Test de clase Filtros Metodo mayor que
     */
    @Test
    public void testFiltrosmayorque(){
        //mayor
        assertEquals(8407,8407,Filtros.mayorque(MarcoDeDatos.getList("DatosTokyo.csv"),2,20.0));
        //assertEquals(13806,13806,Filtros.mayorque(MarcoDeDatos.getList("DatosTokyo.csv"),3,17.5));
    }

    /**
     * Test de clase Filtros Metodo menor e igual
     */
    @Test
    public void testFiltrosmenoreigual(){
        //menoreigual
        assertEquals(9267,9267,Filtros.menorEigual(MarcoDeDatos.getList("DatosCabo.csv"),1,13.0));
        //assertEquals(545,545,Filtros.menorEigual(MarcoDeDatos.getList("DatosCabo.csv"),4,23.3));
    }

    /**
     * Test de clase Filtros Metodo mayor e igual
     */
    @Test
    public void testFiltrosmayoreigual(){
        //mayor e igual
        //assertEquals(0,0,Filtros.mayorEigual(MarcoDeDatos.getList("DatosCabo.csv"),2,30.0));
        assertEquals(1,1,Filtros.mayorEigual(MarcoDeDatos.getList("DatosCabo.csv"),1,200.0));
    }

    /**
     * Test de clase Filtros Metodo igual
     */
    @Test
    public void testFiltrosigual(){
        // igual
        //assertEquals(156,156,Filtros.igual(MarcoDeDatos.getList("DatosMadrid.csv"),3,25.6));
        assertEquals(11,11,Filtros.igual(MarcoDeDatos.getList("DatosMadrid.csv"),1,10.5));
    }

    /**
     * Test de clase Filtros Metodo diferente
     */
    @Test
    public void testFiltrosdiferente(){
        //diferente
        //assertEquals(4405,4405,Filtros.diferente(MarcoDeDatos.getList("DatosMedellin.csv"),2,24,3));
        assertEquals(2917,2917,Filtros.diferente(MarcoDeDatos.getList("DatosMedellin.csv"),4,17.0));
    }
    
        /**
     * Test de clase Dato creacion de objetos
     */
    @Test
    public void testDato(){
        String[] datos= new String[7];
        datos[0]="COM00080110";
        datos[1]="OLAYA HERRERA, CO";
        datos[2]="2019-04-22";
        datos[3]="0.0";
        datos[4]="22.2";
        datos[5]="";
        datos[6]="17.7";
        Dato ConValores = new Dato(datos);
        //verificar que no sea null
        assertNotNull("No debe de ser null",ConValores);
        //verificar que los valores pasen bien
        assertEquals("OLAYA HERRERA, CO",ConValores.getNombreEstacion(),"OLAYA HERRERA, CO");
        assertEquals(-10000.0,ConValores.getTemperaturaMaxima(),-10000.0);
        assertEquals(0.0,ConValores.getNivelDePrecipitacion(),0.0);

    }
}
