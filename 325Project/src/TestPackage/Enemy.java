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

//base enemy class
public class Enemy {
    String enemyName;
    Integer enemyMax;
    Integer enemyAtt;
    Integer enemyDef;
    
    public void setName(String x){
        enemyName = x;
    }
    
    public void SetMax(Integer x){
        enemyMax = x;
    }
    
    public void setAtt(Integer x){
        enemyAtt = x;
    }
    
    public void setDef(Integer x){
        enemyDef = x;
    }
    
    public String getName(){
        return this.enemyName;
    }
    
    public Integer getMax(){
        return this.enemyMax;
    }
    
    public Integer getAtt(){
        return this.enemyAtt;
    }
    
    public Integer getDef(){
        return this.enemyDef;
    }
}
