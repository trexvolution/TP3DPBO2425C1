#include "Individu.cpp"
#include "Pokemon.cpp"
#include <vector>
using namespace std;

class PlayerTCG : public Individu {
private:
    string id;
    string namaPanggilan;
    vector<Pokemon> deckList;

public:
    PlayerTCG() {}
    PlayerTCG(string id, string namaPanggilan, string noKTP, string nama, string alamat)
        : Individu(noKTP, nama, alamat), id(id), namaPanggilan(namaPanggilan) {}

    void setID(string i) { id = i; }
    void setNamaPanggilan(string np) { namaPanggilan = np; }

    string getID() const { return id; }
    string getNamaPanggilan() const { return namaPanggilan; }
    vector<Pokemon>& getDeckList() { return deckList; }

    void addPokemon(const Pokemon &p) { deckList.push_back(p); }

    void printDeck() {
        cout << "Deck " << namaPanggilan << ":\n";
        for (auto &p : deckList) {
            p.printInfo();
        }
    }

    void printInfo() override {
        cout << "Player ID: " << id << ", Nama Panggilan: " << namaPanggilan << endl;
        Individu::printInfo();
    }
};
