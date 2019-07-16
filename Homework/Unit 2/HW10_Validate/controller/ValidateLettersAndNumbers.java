/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hardware.controller;

import java.awt.event.KeyEvent;

/**
 *
 * @author Jhony Naranjo
 */
public class ValidateLettersAndNumbers {
    Character character;
    public void onlyLetters(KeyEvent evt) {
        character = evt.getKeyChar();
        if(!Character.isLetter(character) && character != KeyEvent.VK_SPACE && !Character.isDigit(character)) {
            evt.consume();
        }
    }
}
