package ru.gb.karachev;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ChatController {

    private List<Message> messages = new ArrayList<>();

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    @FXML
    private Button buttonSend;


    public void send(ActionEvent actionEvent) {
        String msg = textField.getText().trim();
        if(!msg.isEmpty()) {
            Message message = new Message(msg);
            messages.add(message);
            appendMessage(message);
        }
        textField.clear();
    }

    private void appendMessage(Message message) {
        textArea.appendText(message.getMessage() + "\n\n");
    }
}
