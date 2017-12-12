/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

/**
 *
 * 
 */

//class construtor assigning varible values
public class Tank extends Player implements Special {

    Tank(String x) {
        playerName = x;
        playerMax = 150;
        playerAtt = 15;
        playerDef = 25;
        playerRange = 1;
    }

    @Override
    public void Extra() {

    }

}
