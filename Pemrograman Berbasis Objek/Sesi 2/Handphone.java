/*

Author
Name    : Akmal Nuur Fauzan
NIM     : 20220040060

*/
public class Handphone{
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenisHP(){
        return jenis_hp;
    }

    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public void static main(String[] args){
        Handphone hp = new Handphone();
        hp.setDataHP("VIVO", 2023);
        System.out.println(hp.getJenisHP());
        System.out.println(hp.tahun_pembuatan());
    }
}