package com.example.jku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.*;

public class HelloController {

    @FXML
    private TextField Lightday;

    @FXML
    private TextField Lightnight;

    @FXML
    private Label Test;

    @FXML
    private TextField Watercold;

    @FXML
    private TextField Waterhot;

    @FXML
    private Button pay;
    @FXML
    private Label April;

    @FXML
    private Label August;

    @FXML
    private Label December;

    @FXML
    private Label February;

    @FXML
    private Label January;

    @FXML
    private Label July;

    @FXML
    private Label June;
    @FXML
    private Label March;

    @FXML
    private Label May;

    @FXML
    private Label November;

    @FXML
    private Label October;

    @FXML
    private Label September;
    private static double message;
    @FXML
    private Label month;


    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",  "December"};

    public void Message(){
if (message >= 10000){
    JOptionPane.showMessageDialog(null, "Вы привысили лимит в 10.000 рублей!");
}
    }

    @FXML
    void initialize(){
        Screen();
        Message();
    }
    public void Screen(){
        File read = new File("D:\\Java\\JKU\\src\\main\\resources\\com\\example\\jku\\i.txt");

        int k = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(read))) {
            String line;
            while ((line = br.readLine()) != null) {
                k = Integer.parseInt(line);
                month.setText(months[k]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < months.length; i++){
            File chit = new File("D:\\Java\\JKU\\src\\main\\resources\\com\\example\\jku\\" + months[i] + ".txt");
            try (BufferedReader br = new BufferedReader(new FileReader(chit))) {
                String line;

                while ((line = br.readLine()) != null) {
                    if (months[i].equals("January")){
                        January.setText(line);
                    }
                    if (months[i].equals("February")){
                        February.setText(line);
                    }
                    if (months[i].equals("March")){
                        March.setText(line);
                    }
                    if (months[i].equals("April")){
                        April.setText(line);
                    }
                    if (months[i].equals("May")){
                        May.setText(line);
                    }
                    if (months[i].equals("June")){
                        June.setText(line);
                    }
                    if (months[i].equals("July")){
                        July.setText(line);
                    }
                    if (months[i].equals("August")){
                        August.setText(line);
                    }
                    if (months[i].equals("September")){
                        September.setText(line);
                    }
                    if (months[i].equals("October")){
                        October.setText(line);
                    }
                    if (months[i].equals("November")){
                        November.setText(line);
                    }
                    if (months[i].equals("December")){
                        December.setText(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


    public void Pay(ActionEvent actionEvent) throws IOException {

        File read = new File("D:\\Java\\JKU\\src\\main\\resources\\com\\example\\jku\\i.txt");

        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(read))) {
            String line;
            while ((line = br.readLine()) != null) {
                i = Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


            if (i < months.length) {
                File createFile = new File("D:\\Java\\JKU\\src\\main\\resources\\com\\example\\jku\\" + months[i] + ".txt");
                createFile.createNewFile();
                System.out.println("Файл" + months[i]);

                    double ligday = Double.parseDouble(Lightday.getText());
                    ligday = ligday * 3.24;
                    double lignig = Double.parseDouble(Lightnight.getText());
                    lignig = lignig * 1.69;
                    double wathot = Double.parseDouble(Waterhot.getText());
                    wathot = wathot * 49.3;
                    double watcold = Double.parseDouble(Watercold.getText());
                    watcold = watcold * 26.5;
                    double all = ligday + lignig + watcold + wathot;
                    message =+ all;
                String str = Double.toString(all);
                File writeAll = new File("D:\\Java\\JKU\\src\\main\\resources\\com\\example\\jku\\" + months[i] + ".txt");
                BufferedWriter writerAll = new BufferedWriter(new FileWriter(writeAll));
                writerAll.write(str);
                writerAll.flush();
                System.out.println(all);



                i++;
                String str2 = Integer.toString(i);
                BufferedWriter writer = new BufferedWriter(new FileWriter(read));
                writer.write(str2);

                writer.close();
                Screen();
                Message();

            }
            else {
                System.out.println("All");
            }

        }

    public void Delete(ActionEvent actionEvent) throws IOException {
        for (int i = 0; i <= months.length; i++) {
            File writeAll = new File("D:\\Java\\JKU\\src\\main\\resources\\com\\example\\jku\\" + months[i] + ".txt");
            BufferedWriter writerAll = new BufferedWriter(new FileWriter(writeAll));
            writerAll.write("0");
            Screen();
            writerAll.flush();
        }
    }

    public void January(ActionEvent actionEvent) throws IOException {
        File writeAll = new File("D:\\Java\\JKU\\src\\main\\resources\\com\\example\\jku\\i.txt");
        BufferedWriter writerAll = new BufferedWriter(new FileWriter(writeAll));
        writerAll.write("0");
        Screen();
    }
}
