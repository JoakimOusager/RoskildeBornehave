package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.text.*;


public class Main extends Application {

    TableView<Person> tableViewTimeplan;

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Initialiserer alt der skal være på login-siden.
        BorderPane bp = new BorderPane();
        GridPane gp = new GridPane();
        HBox hbox = new HBox();
        Label welcome = new Label("Jarls Frie Børnehave");
        welcome.setFont(Font.font("Helvetica", FontWeight.BOLD, 20));
        Label user = new Label("User");
        Label password = new Label("Password");
        TextField txtUser = new TextField();
        PasswordField txtPassword = new PasswordField();
        Button login = new Button("Login");
        login.setId("login");

        //Sætter scenen op
        bp.getStylesheets().add("sample/CSS.css");
        primaryStage.setTitle("Made by CSS-Master");
        Scene loginScene = new Scene(bp,300, 200);
        primaryStage.setScene(loginScene);
        primaryStage.show();
        primaryStage.setResizable(false);

        //Tilføjer velkomsttekst på siden
        hbox.getChildren().add(welcome);
        hbox.setPadding(new Insets(10, 10, -20, 10));
        hbox.setAlignment(Pos.CENTER);
        bp.setTop(hbox);

        //Tilføjer gridpane og udfylder gridpane.
        gp.setHgap(10);
        gp.setVgap(10);
        txtUser.setPromptText("username");
        txtPassword.setPromptText("password");
        gp.setAlignment(Pos.CENTER);
        bp.setCenter(gp);
        gp.add(user,0,0);
        gp.add(password, 0, 1);
        gp.add(txtUser, 1, 0);
        gp.add(txtPassword, 1, 1);
        gp.add(login, 1, 3);

        login.setOnAction(event -> {
            if(!txtUser.getText().equalsIgnoreCase("Anders") || !txtPassword.getText().equals("123")) {
                if (!txtUser.getText().equalsIgnoreCase("Anders")) {
                    txtUser.clear();
                    txtUser.setPromptText("Incorrect user name");
                } else {
                    txtPassword.clear();
                    txtPassword.setPromptText("Incorrect password");
                }
            } else {
                BorderPane bpLoggedIn = new BorderPane();
                Scene succes = new Scene(bpLoggedIn, 1200, 750);
                Button employees = new Button("Medarbejdere");
                Button children = new Button("Indregistrerede børn");
                Button timeplan = new Button("Vagtplan");
                Button logout = new Button("Log ud");
                HBox menu = new HBox();

                menu.getChildren().addAll(employees, children, timeplan, logout);
                menu.setAlignment(Pos.CENTER);
                bpLoggedIn.setTop(menu);

                employees.setOnAction(event2 -> {
                    TableView tvEmployees = new TableView();
                    VBox vbox = new VBox();



                    tvEmployees.setEditable(true);

                    TableColumn firstNameCol = new TableColumn("Fornavn");
                    TableColumn lastNameCol = new TableColumn("Efternavn");
                    TableColumn positionCol = new TableColumn("Stilling");
                    TableColumn telephone = new TableColumn("Telefonnummer");
                    TableColumn address = new TableColumn("Addresse");
                    TableColumn email = new TableColumn("Email");


                    tvEmployees.getColumns().addAll(firstNameCol, lastNameCol, positionCol, telephone, address, email);
                    vbox.getChildren().add(tvEmployees);
                    bpLoggedIn.setCenter(vbox);

                });

                logout.setOnAction(e -> {
                    primaryStage.setScene(loginScene);
                    primaryStage.centerOnScreen();
                    txtUser.clear();
                    txtPassword.clear();
                    txtUser.setPromptText("username");
                    txtPassword.setPromptText("password");
                });

                children.setOnAction(e -> {
                    TableView tvChildren = new TableView();
                    VBox vboxChildren = new VBox();



                    tvChildren.setEditable(true);

                    TableColumn firstNameChild = new TableColumn("Fornavn");
                    TableColumn lastNameChild = new TableColumn("Efternavn");
                    TableColumn assignedRoom = new TableColumn("Stue");

                    tvChildren.getColumns().addAll(firstNameChild, lastNameChild, assignedRoom);
                    vboxChildren.getChildren().add(tvChildren);
                    bpLoggedIn.setCenter(vboxChildren);
                });

                timeplan.setOnAction(e -> {
                    VBox vboxTimeplan = new VBox();

                    TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
                    nameColumn.setPrefWidth(200);
                    nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

                    TableColumn mondayColumn = new TableColumn("Monday");
                    mondayColumn.setId("day");

                    TableColumn<Person, Integer> mondayStart = new TableColumn<>("Start");
                    mondayStart.setId("time");
                    mondayStart.setCellValueFactory(new PropertyValueFactory<>("timesMondayStart"));

                    TableColumn<Person, Integer> mondayEnd = new TableColumn<>("End");
                    mondayEnd.setId("time");
                    mondayEnd.setCellValueFactory(new PropertyValueFactory<>("timesMondayEnd"));

                    mondayColumn.getColumns().addAll(mondayStart, mondayEnd);

                    TableColumn thuesdayColumn = new TableColumn<>("Thuesday");
                    thuesdayColumn.setId("day");

                    TableColumn<Person, Integer> thuesdayStart = new TableColumn<>("Start");
                    thuesdayStart.setId("time");
                    thuesdayStart.setCellValueFactory(new PropertyValueFactory<>("timesThuesdayStart"));

                    TableColumn<Person, Integer> thuesdayEnd = new TableColumn<>("End");
                    thuesdayEnd.setId("time");
                    thuesdayEnd.setCellValueFactory(new PropertyValueFactory<>("timesThuesdayEnd"));

                    thuesdayColumn.getColumns().addAll(thuesdayStart, thuesdayEnd);

                    TableColumn wednesdayColumn = new TableColumn("Wednesday");
                    wednesdayColumn.setId("day");

                    TableColumn<Person, Integer> wednesdayStart = new TableColumn<>("Start");
                    wednesdayStart.setId("time");
                    wednesdayStart.setCellValueFactory(new PropertyValueFactory<>("timesWednesdayStart"));

                    TableColumn<Person, Integer> wednesdayEnd = new TableColumn<>("End");
                    wednesdayEnd.setId("time");
                    wednesdayEnd.setCellValueFactory(new PropertyValueFactory<>("timesWednesdayEnd"));

                    wednesdayColumn.getColumns().addAll(wednesdayStart, wednesdayEnd);

                    TableColumn thursdayColumn = new TableColumn("Thursday");
                    thursdayColumn.setId("day");

                    TableColumn<Person, Integer> thursdayStart = new TableColumn<>("Start");
                    thursdayStart.setId("time");
                    thursdayStart.setCellValueFactory(new PropertyValueFactory<>("timesThursdayStart"));

                    TableColumn<Person, Integer> thursdayEnd = new TableColumn<>("End");
                    thursdayEnd.setId("time");
                    thursdayEnd.setCellValueFactory(new PropertyValueFactory<>("timesThursdayEnd"));

                    thursdayColumn.getColumns().addAll(thursdayStart, thursdayEnd);

                    TableColumn fridayColumn = new TableColumn("Friday");
                    fridayColumn.setId("day");

                    TableColumn<Person, Integer> fridayStart = new TableColumn("Start");
                    fridayStart.setId("time");
                    fridayStart.setCellValueFactory(new PropertyValueFactory<>("timesFridayStart"));

                    TableColumn<Person, Integer> fridayEnd = new TableColumn<>("End");
                    fridayEnd.setId("time");
                    fridayEnd.setCellValueFactory(new PropertyValueFactory<>("timesFridayEnd"));

                    fridayColumn.getColumns().addAll(fridayStart, fridayEnd);

                    tableViewTimeplan = new TableView<>();
                    tableViewTimeplan.setItems(getPerson());
                    tableViewTimeplan.getColumns().addAll(nameColumn, mondayColumn, thuesdayColumn, wednesdayColumn, thursdayColumn,
                            fridayColumn);


                    vboxTimeplan.getChildren().add(tableViewTimeplan);
                    bpLoggedIn.setCenter(vboxTimeplan);
                });

                bpLoggedIn.getStylesheets().add("sample/CSS-loggedIn.css");
                primaryStage.setTitle("Roskilde Frie Børnehave");
                primaryStage.setScene(succes);
                primaryStage.centerOnScreen();
                primaryStage.setResizable(false);


            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Person> getPerson() {
        ObservableList<Person> persons = FXCollections.observableArrayList();
        persons.add(new Person("Daniella", 8, 16, 8, 16, 8, 16, 8,16, 8, 16));
        return persons;
    }


}
