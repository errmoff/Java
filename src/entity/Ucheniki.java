package entity;
import java.util.Objects;
/**
 *
 * @author ERRMOFF
 */
public class Ucheniki {
    private Long Uid; // Идентификатор Ученика
    private String UName; //Имя и фамилия ученика
    private String Predmet;//ПРЕДМЕТ
    private Integer UOtsenka; //Оценка ученика
    private String DateOfPublishing;//Дата 
    public Ucheniki(){
    }
    
    public Ucheniki(Long Uid, String UName, String Predmet, Integer UOtsenka, String DateOfPublishing ){
    
    this.Uid = Uid;
    this.UName = UName;
    this.Predmet = Predmet;
    this.UOtsenka = UOtsenka;
    this.DateOfPublishing = DateOfPublishing;
    }

    public Long getUid() {
        return Uid;
    }

    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getPredmet() {
        return Predmet;
    }

    public void setPredmet(String Predmet) {
        this.Predmet = Predmet;
    }

    public Integer getUOtsenka() {
        return UOtsenka;
    }

    public void setUOtsenka(Integer UOtsenka) {
        this.UOtsenka = UOtsenka;
    }

    public String getDateOfPublishing() {
        return DateOfPublishing;
    }

    public void setDateOfPublishing(String DateOfPublishing) {
        this.DateOfPublishing = DateOfPublishing;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Uid);
        hash = 29 * hash + Objects.hashCode(this.UName);
        hash = 29 * hash + Objects.hashCode(this.Predmet);
        hash = 29 * hash + Objects.hashCode(this.UOtsenka);
        hash = 29 * hash + Objects.hashCode(this.DateOfPublishing);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ucheniki other = (Ucheniki) obj;
        if (!Objects.equals(this.Uid, other.Uid)) {
            return false;
        }
        if (!Objects.equals(this.UName, other.UName)) {
            return false;
        }
        if (!Objects.equals(this.Predmet, other.Predmet)) {
            return false;
        }
        if (!Objects.equals(this.UOtsenka, other.UOtsenka)) {
            return false;
        }
        if (!Objects.equals(this.DateOfPublishing, other.DateOfPublishing)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ученик IVKHK:" + " ИМЯ: " + UName + " ПРЕДМЕТ: " + Predmet + " ОЦЕНКА:" + UOtsenka + " ВРЕМЯ ВЫСТАВЛЕНИЯ: " + DateOfPublishing;
    }

   

  
}