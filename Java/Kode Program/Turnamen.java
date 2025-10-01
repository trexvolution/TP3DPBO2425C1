import java.util.ArrayList;

public class Turnamen {
    private String id;
    private String nama;
    private String tanggal;
    private ArrayList<PlayerTCG> listPlayer = new ArrayList<>();

    public Turnamen() {}

    public Turnamen(String id, String nama, String tanggal) {
        this.id = id;
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public void setID(String i) { this.id = i; }
    public void setNama(String n) { this.nama = n; }
    public void setTanggal(String t) { this.tanggal = t; }

    public String getID() { return id; }
    public String getNama() { return nama; }
    public String getTanggal() { return tanggal; }
    public ArrayList<PlayerTCG> getListPlayer() { return listPlayer; }

    public void addPlayer(PlayerTCG p) { listPlayer.add(p); }

    public PlayerTCG getPlayerByID(String pid) {
        for (PlayerTCG p : listPlayer) {
            if (p.getID().equals(pid)) return p;
        }
        return null;
    }

    public void printTurnamen() {
        System.out.println("Turnamen ID: " + id + ", Nama: " + nama + ", Tanggal: " + tanggal);
        System.out.println("Daftar Player:");
        for (PlayerTCG p : listPlayer) {
            p.printInfo();
            p.printDeck();
            System.out.println("-----------------------------");
        }
    }
}
