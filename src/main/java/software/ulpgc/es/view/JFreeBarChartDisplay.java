package software.ulpgc.es.view;

import org.jfree.chart.ChartPanel;
import software.ulpgc.es.control.JFrameBarChartAdapter;
import software.ulpgc.es.model.BarChart;

import javax.swing.*;

public class JFreeBarChartDisplay extends JPanel implements BarChartDisplay {
    @Override
    public void display(BarChart barChart) {
        removeAll();
        add(new ChartPanel(JFrameBarChartAdapter.adapt(barChart)));
        revalidate();
    }
}
