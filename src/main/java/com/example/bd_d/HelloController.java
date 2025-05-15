package com.example.bd_d;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private ComboBox<String> roleComboBox;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleComboBox.getValue();

        // Validasi login sederhana (bisa dikembangkan)

        try {
            if (username.isEmpty() && password.isEmpty() && role==null) {
                showAlert("Isi semua data!");
            } else if (username.isEmpty()) {
                showAlert("Username tidak boleh kosong!");
            } else if (password.isEmpty()) {
                showAlert("Password tidak boleh kosong!");
            } else if (role == null) {
                showAlert("Pilih role!");
            }else {
                if (username.equals("admin") && password.equals("1234") && role.equals("Admin")) {
                    SceneLoader.loadFXML(event,"dashboard.fxml", "Dashboard Admin");
                }else showAlert("Username atau password salah!");
            }
        }catch (NullPointerException e) {
            showAlert("Isi semua data!");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(message);
        alert.show();
    }
}
