/*
 * Copyright (C) 2017 Lucas Burdell lucas.burdell@blackburn.edu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package storybuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lucas Burdell lucas.burdell@blackburn.edu
 */
public class StoryBuilder extends Application {

    /**
     * @return the singleton
     */
    public static StoryBuilder getSingleton() {
        return singleton;
    }

    private Stage mainStage;
    private static StoryBuilder singleton;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StoryBuilderFXML.fxml"));

        Scene scene = new Scene(root);
        //String css = this.getClass().getResource("GuiStyle.css").toExternalForm();
        //scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();
        setMainStage(stage);
        singleton = this;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @return the mainStage
     */
    public Stage getMainStage() {
        return mainStage;
    }

    /**
     * @param mainStage the mainStage to set
     */
    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

}
