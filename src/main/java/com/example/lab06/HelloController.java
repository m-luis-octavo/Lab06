package com.example.lab06;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Cell;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;


import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private PieChart pieChart;

    @FXML
    private BarChart barChart;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void initialize() {

        // Bar chart data additions
        XYChart.Series series1 = new XYChart.Series();

        series1.setName("2003");
        series1.getData().add(new XYChart.Data("Residential", 20000));
        series1.getData().add(new XYChart.Data("Commercial", 25600));


        barChart.getData().addAll(series1);



        // Pie chart data additions

        PieChart.Data slice1 = new PieChart.Data(ageGroups[0], purchasesByAgeGroup[0]);
        PieChart.Data slice2 = new PieChart.Data(ageGroups[1], purchasesByAgeGroup[1]);
        PieChart.Data slice3 = new PieChart.Data(ageGroups[2], purchasesByAgeGroup[2]);
        PieChart.Data slice4 = new PieChart.Data(ageGroups[3], purchasesByAgeGroup[3]);
        PieChart.Data slice5 = new PieChart.Data(ageGroups[3], purchasesByAgeGroup[4]);
        PieChart.Data slice6 = new PieChart.Data(ageGroups[3], purchasesByAgeGroup[5]);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);

    }

    @FXML
    private static String[] ageGroups = {
            "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
    };
    @FXML
    private static int[] purchasesByAgeGroup = {
            648, 1021, 2453, 3173, 1868, 2247
    };

    @FXML
    private static Color[] pieColours = {
            Color.AQUA, Color.GOLD, Color.DARKORANGE,
            Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM
    };


    @FXML
    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1,
            308431.4,322635.9,340253.0,363153.7
    };
    @FXML
    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8,
            1335932.6,1472362.0,1583521.9,1613246.3
    };

}