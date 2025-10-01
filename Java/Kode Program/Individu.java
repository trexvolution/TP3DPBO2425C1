public class Individu {
    protected String noKTP;
    protected String nama;
    protected String alamat;

    public Individu() {}

    public Individu(String noKTP, String nama, String alamat) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNoKTP(String ktp) { this.noKTP = ktp; }
    public void setNama(String n) { this.nama = n; }
    public void setAlamat(String a) { this.alamat = a; }

    public String getNoKTP() { return noKTP; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }

    public void printInfo() {
        System.out.println("KTP: " + noKTP + ", Nama: " + nama + ", Alamat: " + alamat);
    }
}
