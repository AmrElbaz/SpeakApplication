package org.project.controller.chat_home.left_side;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import org.project.controller.MainDeligator;
import org.project.controller.chat_home.HomeController;
import org.project.model.ChatRoom;
import org.project.model.dao.users.Users;

import java.net.URL;
import java.util.ResourceBundle;

public class LeftSideController implements Initializable {
    public BorderPane borderPane;
    MainDeligator mainDeligator;
    HomeController homeController;
    ChatRoom chatRoom;
    Users user;

    private ObservableList<Users> requestsObservableList;

    public LeftSideController() {
    }

    public void setHomeController(HomeController homeController) {
        this.homeController = homeController;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setMainDeligator(MainDeligator mainDeligator) {
        this.mainDeligator = mainDeligator;
    }

    public void setTabPane(Users user, HomeController homeController) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/project/views/chat_home/left_side/TabPaneNotifications.fxml"));
        Pane root = (Pane) loader.load();
        TabPaneNotifications_Controller notificationsController = loader.getController();
        notificationsController.setUser(user,homeController);
        notificationsController.setRequestListView();
        notificationsController.setChatListView();
        borderPane.setLeft(root);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            setTabPane(user,homeController);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
