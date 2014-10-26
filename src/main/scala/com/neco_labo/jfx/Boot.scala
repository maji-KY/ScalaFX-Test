package com.neco_labo.jfx

import java.io.IOException
import javafx.fxml.FXMLLoader

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage

/**
 * Created by kazuyuki on 2014/10/26.
 */
object Boot extends JFXApp {

	val resource = getClass.getResource("/Boot.fxml")
	if (resource == null) {
		throw new IOException("Cannot load resource: Boot.fxml")
	}


	stage = new PrimaryStage() {
		val root: javafx.scene.Parent = FXMLLoader.load(resource)
//		title = "sss"
		scene = new scalafx.scene.Scene(new javafx.scene.Scene(root))
	}
}
