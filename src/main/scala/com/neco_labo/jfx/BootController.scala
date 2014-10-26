package com.neco_labo.jfx

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.{Button, Label}
import javafx.scene.input.MouseEvent
import javafx.scene.shape.Box


/**
 * Created by kazuyuki on 2014/10/26.
 */
class BootController {

	@FXML
	private var label: Label = _

	@FXML
	private var box: Box = _

	@FXML
	private var button: Button = _

	@FXML
	private def handleButtonAction(event: ActionEvent) = {
		label.setText("押したな！")
		box.setRotate(box.getRotate + 1)
	}

	@FXML
	private def bobobo(event: MouseEvent) = {
		box.setRotate(box.getRotate + 1)
	}
	@FXML
	private def dododo(event: MouseEvent) = {
		box.setRotate(box.getRotate + 1)
	}

}
