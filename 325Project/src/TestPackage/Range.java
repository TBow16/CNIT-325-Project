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

//class construtor assigning varible values
public class Range extends Damage implements Special {

    Range(String x) {
        playerName = x;
        playerMax = 150;
        playerAtt = 25;
        playerDef = 15;
        playerRange = 2;
    }

    @Override
    public void Extra() {

    }

}
