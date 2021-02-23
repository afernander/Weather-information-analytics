import java.util.ArrayList;
import java.util.List;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.*;
import org.jfree.chart.*;
import org.jfree.data.time.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.*;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.RefineryUtilities;
import java.awt.Color;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
/**
 * Esta clase contiene todos las graficos que se pueden hacer con los datos del arraylist  de marco de datos
 * esta clase incluye las librerias de JFreeChart
 * @author Alejandro Fernández Restrepo
 * @version mayo de 2019
 */
public class Visualizacion 
{
    private static MarcoDeDatos lista = new MarcoDeDatos();
    /**
     * Este metodo crea un diagrama de lineas con al fecha y el dato del archivo.
     */
    public static void diagramaDeLineas(List<Dato> listaConDatosFinal, int opcion){
        switch(opcion){
            case 1:
            TimeSeries series1 = new TimeSeries("Nivel De Precipiyacion");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getNivelDePrecipitacion()!=-10000.0){
                    series1.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getNivelDePrecipitacion());
                }
            }
            TimeSeriesCollection data1= new TimeSeriesCollection();
            data1.addSeries(series1);
            JFreeChart chart1= ChartFactory.createTimeSeriesChart("Diagrama de lineas de la Nivel De Precipitacion","Fecha","Nivel De Precipitacion",data1);
            ChartFrame frame1= new ChartFrame("Diagrama",chart1);
            frame1.pack();
            frame1.setVisible(true);
            break;
            case 2:
            TimeSeries series2 = new TimeSeries("Temperatura Promedio");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getTemperaturaPromedio()!=-10000.0){
                    series2.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getTemperaturaPromedio());
                }
            }
            TimeSeriesCollection data2= new TimeSeriesCollection();
            data2.addSeries(series2);
            JFreeChart chart2 = ChartFactory.createTimeSeriesChart("Diagrama de lineas de la Temperatura Promedio","Fecha","Temperatura Promedio",data2);
            ChartFrame frame2= new ChartFrame("Diagrama",chart2);
            frame2.pack();
            frame2.setVisible(true);
            break;

            case 3:
            TimeSeries series3 = new TimeSeries("Temperatura Maxima");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getTemperaturaMaxima()!=-10000.0){
                    series3.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getTemperaturaMaxima());
                }
            }
            TimeSeriesCollection data3= new TimeSeriesCollection();
            data3.addSeries(series3);
            JFreeChart chart3 = ChartFactory.createTimeSeriesChart("Diagrama de lineas de la Temperatura Maxima","Fecha","Temperatura Maxima",data3);
            ChartFrame frame3= new ChartFrame("Diagrama",chart3);
            frame3.pack();
            frame3.setVisible(true);
            break;

            case 4:
            TimeSeries series4 = new TimeSeries("Temperatura Minima");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getTemperaturaMinima()!=-10000.0){
                    series4.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getTemperaturaMinima());
                }
            }
            TimeSeriesCollection data4= new TimeSeriesCollection();
            data4.addSeries(series4);
            JFreeChart chart4 = ChartFactory.createTimeSeriesChart("Diagrama de lineas de la Temperatura Minima","Fecha","Temperatura Minima",data4);
            ChartFrame frame4= new ChartFrame("Diagrama",chart4);
            frame4.pack();
            frame4.setVisible(true);
            break;
        }
    }

    /**
     * Este metodo crea un diagrama de puntos con al fecha y el dato del archivo.
     */
    public static void diagramaDePuntos(List<Dato> listaConDatosFinal, int opcion){
        switch(opcion){
            case 1:
            TimeSeries series1 = new TimeSeries("Temperatura Promedio");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getNivelDePrecipitacion()!=-10000.0){
                    series1.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getNivelDePrecipitacion());
                }
            }
            TimeSeriesCollection data1= new TimeSeriesCollection();
            data1.addSeries(series1);
            JFreeChart chart1 = ChartFactory.createTimeSeriesChart("Diagrama de puntos de la Temperatura Promedio","Fecha","Temperatura Promedio",data1);
            XYPlot plot1 = (XYPlot) chart1.getPlot();
            plot1.setBackgroundPaint(Color.lightGray);
            plot1.setDomainGridlinePaint(Color.white);
            plot1.setRangeGridlinePaint(Color.white);
            plot1.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
            plot1.setDomainCrosshairVisible(true);
            plot1.setRangeCrosshairVisible(true);
            XYItemRenderer r1 = plot1.getRenderer();
            if (r1 instanceof XYLineAndShapeRenderer) {
                XYLineAndShapeRenderer renderer1 = (XYLineAndShapeRenderer) r1;
                renderer1.setBaseShapesVisible(true);
                renderer1.setBaseShapesFilled(true);
                renderer1.setDrawSeriesLineAsPath(true);
                renderer1.setBaseLinesVisible(false);
            }
            ChartFrame frame1= new ChartFrame("Diagrama",chart1);
            frame1.pack();
            frame1.setVisible(true);
            break;
            case 2:
            TimeSeries series2 = new TimeSeries("Temperatura Promedio");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getTemperaturaPromedio()!=-10000.0){
                    series2.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getTemperaturaPromedio());
                }
            }
            TimeSeriesCollection data2= new TimeSeriesCollection();
            data2.addSeries(series2);
            JFreeChart chart2 = ChartFactory.createTimeSeriesChart("Diagrama de puntos de la Temperatura Promedio","Fecha","Temperatura Promedio",data2);
            XYPlot plot2 = (XYPlot) chart2.getPlot();
            plot2.setBackgroundPaint(Color.lightGray);
            plot2.setDomainGridlinePaint(Color.white);
            plot2.setRangeGridlinePaint(Color.white);
            plot2.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
            plot2.setDomainCrosshairVisible(true);
            plot2.setRangeCrosshairVisible(true);
            XYItemRenderer r2 = plot2.getRenderer();
            if (r2 instanceof XYLineAndShapeRenderer) {
                XYLineAndShapeRenderer renderer2 = (XYLineAndShapeRenderer) r2;
                renderer2.setBaseShapesVisible(true);
                renderer2.setBaseShapesFilled(true);
                renderer2.setDrawSeriesLineAsPath(true);
                renderer2.setBaseLinesVisible(false);
            }
            ChartFrame frame2= new ChartFrame("Diagrama",chart2);
            frame2.pack();
            frame2.setVisible(true);
            break;
            
            case 3:
            TimeSeries series3 = new TimeSeries("Temperatura Maxima");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getTemperaturaMaxima()!=-10000.0){
                    series3.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getTemperaturaMaxima());
                }
            }
            TimeSeriesCollection data3= new TimeSeriesCollection();
            data3.addSeries(series3);
            JFreeChart chart3 = ChartFactory.createTimeSeriesChart("Diagrama de puntos de la Temperatura Maxima","Fecha","Temperatura Maxima",data3);
            XYPlot plot3 = (XYPlot) chart3.getPlot();
            plot3.setBackgroundPaint(Color.lightGray);
            plot3.setDomainGridlinePaint(Color.white);
            plot3.setRangeGridlinePaint(Color.white);
            plot3.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
            plot3.setDomainCrosshairVisible(true);
            plot3.setRangeCrosshairVisible(true);
            XYItemRenderer r3 = plot3.getRenderer();
            if (r3 instanceof XYLineAndShapeRenderer) {
                XYLineAndShapeRenderer renderer3 = (XYLineAndShapeRenderer) r3;
                renderer3.setBaseShapesVisible(true);
                renderer3.setBaseShapesFilled(true);
                renderer3.setDrawSeriesLineAsPath(true);
                renderer3.setBaseLinesVisible(false);
            }
            ChartFrame frame3= new ChartFrame("Diagrama",chart3);
            frame3.pack();
            frame3.setVisible(true);
            break;

            case 4:
            TimeSeries series4 = new TimeSeries("Temperatura Minima");
            for(Dato diagrama:listaConDatosFinal){
                if(diagrama.getTemperaturaMinima()!=-10000.0){
                    series4.add(new Day(Integer.parseInt(diagrama.getFecha().substring(8,10)),Integer.parseInt(diagrama.getFecha().substring(5,7)),Integer.parseInt(diagrama.getFecha().substring(0,4))),diagrama.getTemperaturaMinima());
                }
            }
            TimeSeriesCollection data4= new TimeSeriesCollection();
            data4.addSeries(series4);
            JFreeChart chart4 = ChartFactory.createTimeSeriesChart("Diagrama de puntos de la Temperatura Minima","Fecha","Temperatura Minima",data4);
            XYPlot plot4 = (XYPlot) chart4.getPlot();
            plot4.setBackgroundPaint(Color.lightGray);
            plot4.setDomainGridlinePaint(Color.white);
            plot4.setRangeGridlinePaint(Color.white);
            plot4.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
            plot4.setDomainCrosshairVisible(true);
            plot4.setRangeCrosshairVisible(true);
            XYItemRenderer r4 = plot4.getRenderer();
            if (r4 instanceof XYLineAndShapeRenderer) {
                XYLineAndShapeRenderer renderer4 = (XYLineAndShapeRenderer) r4;
                renderer4.setBaseShapesVisible(true);
                renderer4.setBaseShapesFilled(true);
                renderer4.setDrawSeriesLineAsPath(true);
                renderer4.setBaseLinesVisible(false);
            }
            ChartFrame frame4= new ChartFrame("Diagrama",chart4);
            frame4.pack();
            frame4.setVisible(true);
            break;

        }
    }

    /**
     * Este metodo llama a la operacion a ejecutarce segun la opcion que entre el ususario.
     */
    public static void llamadoAmetodos(List<Dato> listaConDatosFinal,int opcionOperacion, int opcionDato){
        switch (opcionOperacion){
            case 1:
            diagramaDeLineas(listaConDatosFinal, opcionDato);
            break;
            case 2:
            diagramaDePuntos(listaConDatosFinal, opcionDato);
            break;
        }
    }
}