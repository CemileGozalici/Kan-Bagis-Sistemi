package Factory;

public class ONegatif extends KanGrubu {

    private String ad;
    private String Rh;
    private String alir;
    private String verir;
    private String bilgi;

    public ONegatif(String ad, String Rh, String alir, String verir, String bilgi) {
        this.ad = ad;
        this.Rh = Rh;
        this.alir = alir;
        this.verir = verir;
        this.bilgi = bilgi;
    }

    @Override
    public String getAd() {
        return this.ad;
    }

    @Override
    public String getRh() {
        return this.Rh;
    }

    @Override
    public String getAlir() {
        return this.alir;
    }

    @Override
    public String getVerir() {
        return this.verir;
    }

    @Override
    public String getBilgi() {
        this.bilgi = "\n\t- 0 grubu AVCI olarak adlandırılmıştır\n"
                + "\t- Her 100 kişiden 7’si 0 RH negatif\n"
                + "\t- Kendine güvenen, cesaretli insanlardır.\n";
        return this.bilgi;
    }
}
