import java.util.ArrayList;

public class PlayerTCG extends Individu {
    private String id;
    private String namaPanggilan;
    private ArrayList<Pokemon> deckList = new ArrayList<>();

    public PlayerTCG() {}

    public PlayerTCG(String id, String namaPanggilan, String noKTP, String nama, String alamat) {
        super(noKTP, nama, alamat);
        this.id = id;
        this.namaPanggilan = namaPanggilan;
    }

    public void setID(String i) { this.id = i; }
    public void setNamaPanggilan(String np) { this.namaPanggilan = np; }

    public String getID() { return id; }
    public String getNamaPanggilan() { return namaPanggilan; }
    public ArrayList<Pokemon> getDeckList() { return deckList; }

    public void addPokemon(Pokemon p) { deckList.add(p); }

    public void printDeck() {
        System.out.println("Deck " + namaPanggilan + ":");
        for (Pokemon p : deckList) {
            p.printInfo();
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Player ID: " + id + ", Nama Panggilan: " + namaPanggilan);
        super.printInfo();
    }
}
