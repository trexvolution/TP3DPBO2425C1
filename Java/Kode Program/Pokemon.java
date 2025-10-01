public class Pokemon extends Kartu {
    private String id;
    private String namaKartu;
    private String serial;

    public Pokemon() {}

    public Pokemon(String id, String namaKartu, String serial, String namaPermainan, String bahan) {
        super(namaPermainan, bahan);
        this.id = id;
        this.namaKartu = namaKartu;
        this.serial = serial;
    }

    public void setID(String i) { this.id = i; }
    public void setNamaKartu(String nk) { this.namaKartu = nk; }
    public void setSerial(String s) { this.serial = s; }

    public String getID() { return id; }
    public String getNamaKartu() { return namaKartu; }
    public String getSerial() { return serial; }

    @Override
    public void printInfo() {
        System.out.println("Pokemon ID: " + id + ", Nama Kartu: " + namaKartu + ", Serial: " + serial);
        super.printInfo();
    }
}
