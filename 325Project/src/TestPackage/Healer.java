/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

/**
 *
 * @author trevor
 */
public class Healer extends Player {

    Healer(String x) {
        playerName = x;
        playerMax = 150;
        playerAtt = 15;
        playerDef = 25;
        playerRange = 1;
    }
}
