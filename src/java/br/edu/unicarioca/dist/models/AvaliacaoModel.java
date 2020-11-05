package br.edu.unicarioca.dist.models;

public class AvaliacaoModel {
    
    private Integer aps1;
    private Integer aps2;
    private Integer av1;
    private Integer av2;
    private Integer av3;

    public void setAps1(Integer aps1) {
        this.aps1 = aps1;
    }

    public void setAps2(Integer aps2) {
        this.aps2 = aps2;
    }

    public void setAv1(Integer av1) {
        this.av1 = av1;
    }

    public void setAv2(Integer av2) {
        this.av2 = av2;
    }

    public void setAv3(Integer av3) {
        this.av3 = av3;
    }

    public Integer getAps1() {
        return aps1;
    }

    public Integer getAps2() {
        return aps2;
    }
        
    Integer getAv1(){
        return aps1+av1;
    }
    
    Integer getAv2(){
        return aps2+av2;
    }
    
    Integer getAv3(){
        return av3;
    }
    
    Integer media(){
        if(getAv1()>getAv3() && getAv2()>getAv3())
            return (getAv1()+getAv2())/2;
        
        if(getAv1()>getAv2() && getAv3()>getAv2())
            return (getAv1()+getAv3())/2;
        
        return (getAv2()+getAv3())/2;
    }
}
