package Controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class slevel implements Initializable {
    public void choose(MouseEvent mouseEvent) {
        boolean purchaseSuccessful = subTro(); // 调用购买方法，返回购买结果

        if (purchaseSuccessful) {
            // 显示购买成功的对话框
            showAlert(Alert.AlertType.INFORMATION, "购买成功", "您已成功购买该商品！");
        } else {
            // 显示购买失败的对话框
            showAlert(Alert.AlertType.ERROR, "购买失败", "对不起，购买过程出现了问题，请重试！");
        }
    }
    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);

        // 显示对话框并等待用户响应
        Optional<ButtonType> result = alert.showAndWait();
        // 可以根据用户点击的按钮类型做进一步处理，如果不需要处理，可以省略
    }
    public void initialize(URL location, ResourceBundle resources) {

    }
    private boolean subTro(){
        return true;

    }
}