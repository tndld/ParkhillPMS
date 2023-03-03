/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author hoong
 */
public class JobReport extends Report {
    String filePath = "database\\assignedTask.txt";
    @Override
    public void generate(){
        try {
            // implementation for generating a sales report
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine(); 
            int completed = 0;
            int pending = 0;
            while ((line = br.readLine()) !=null ) {
                String[] dataRow = line.split(":");
                if (dataRow[3].equals("Completed")) {
                    completed = completed +1;
                } 
                else {
                    pending = pending +1;
                }
            }
            dataset.setValue(completed, "Status", "Resolved");
            dataset.setValue(pending, "Status", "Unresolved");

            // Create the chart
            JFreeChart chart = ChartFactory.createBarChart(
                "Total Jobs Assigned and Status",
                "Status",
                "Total Job Count",
                dataset,
                PlotOrientation.HORIZONTAL,
                true,
                true,
                false);

            // Customize the chart
            CategoryPlot plot = chart.getCategoryPlot();
            plot.setBackgroundPaint(Color.white);
            plot.setRangeGridlinePaint(Color.gray);

            CategoryAxis axis = plot.getDomainAxis();
            axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0));
            axis.setTickLabelsVisible(true);

            NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
            rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

            BarRenderer renderer = (BarRenderer) plot.getRenderer();
            renderer.setSeriesPaint(0, new Color(77, 175, 74));
              // Create the chart panel
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(800, 600));

            // Create the frame and add the chart panel to it
            JFrame frame = new JFrame("Sales Report");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(chartPanel);
            frame.pack();
            frame.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
