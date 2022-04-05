package com.example.checker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    private TextArea textArea;

    @FXML
    private TextField regexTextField;

    @FXML
    private Label outputLabel;

    @FXML
    protected void onButtonClick() {
        String regex = regexTextField.getText();
        String text = textArea.getText();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = matcher.find();
        if(matchFound) {
            outputLabel.setText("OK");
        } else {
            outputLabel.setText("NG");
        }
    }
}