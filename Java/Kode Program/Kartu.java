public class Kartu {
    protected String namaPermainan;
    protected String bahan;

    public Kartu() {}

    public Kartu(String namaPermainan, String bahan) {
        this.namaPermainan = namaPermainan;
        this.bahan = bahan;
    }

    public void setNamaPermainan(String np) { this.namaPermainan = np; }
    public void setBahan(String b) { this.bahan = b; }

    public String getNamaPermainan() { return namaPermainan; }
    public String getBahan() { return bahan; }

    public void printInfo() {
        System.out.println("Permainan: " + namaPermainan + ", Bahan: " + bahan);
    }
}
