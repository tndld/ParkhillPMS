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
public class ComplainReport extends Report {
    private String filePath = "database\\complain.txt";

    @Override
    public void generate() {
        try {
            // implementation for generating a sales report
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine(); 
            double totalPaid = 0;
            double totalUnpaid = 0;
            while ((line = br.readLine()) !=null ) {
                String[] dataRow = line.split(":");
                if (dataRow[4].equals("true")) {
                    totalPaid = totalPaid +1;
                    System.out.println(totalPaid);
                } 
                else {
                    totalUnpaid = totalUnpaid +1;
                    System.out.println(totalUnpaid);
                }
            }
            dataset.setValue(totalPaid, "Status", "Resolved");
            dataset.setValue(totalUnpaid, "Status", "Unresolved");

            // Create the chart
            JFreeChart chart = ChartFactory.createBarChart(
                "Total Complains and Status",
                "Status",
                "Complain Count",
                dataset,
                PlotOrientation.VERTICAL,
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
            renderer.setSeriesPaint(0, new Color(33, 113, 181));

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