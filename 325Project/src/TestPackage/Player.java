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
public class Player {
    
    String playerName;
    Integer playerHP;
    Integer playerMax;
    Integer playerAtt;
    Integer playerDef;
    Integer playerRange;
    
    Player()
    {
        
    }
    
    public String getName()
    {
        return this.playerName;
    }
    
    public Integer getHP()
    {
        return this.playerHP;
    }
    
    public Integer getMax()
    {
        return this.playerMax;
    }
    
    public Integer getAtt()
    {
        return this.playerAtt;
    }
    
    public Integer getDef()
    {
        return this.playerDef;
    }
    
    public Integer getRange()
    {
        return this.playerRange;
    }
    
    public void setName(String x)
    {
        this.playerName = x;
    }
    
    public void setHP(Integer x)
    {
        this.playerHP = x;
    }
    
    public void setMax(Integer x)
    {
        this.playerMax = x;
    }
    
    public void setAtt(Integer x)
    {
        this.playerAtt = x;
    }
    
    public void setDef(Integer x)
    {
        this.playerDef = x;
    }
    
    public void setRange(Integer x)
    {
        this.playerRange = x;
    }
    
    
}
