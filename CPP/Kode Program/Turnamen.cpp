#include "PlayerTCG.cpp"
#include <vector>
using namespace std;

class Turnamen {
private:
    string id;
    string nama;
    string tanggal;
    vector<PlayerTCG> listPlayer;

public:
    Turnamen() {}
    Turnamen(string id, string nama, string tanggal)
        : id(id), nama(nama), tanggal(tanggal) {}

    void setID(string i) { id = i; }
    void setNama(string n) { nama = n; }
    void setTanggal(string t) { tanggal = t; }

    string getID() const { return id; }
    string getNama() const { return nama; }
    string getTanggal() const { return tanggal; }
    vector<PlayerTCG>& getListPlayer() { return listPlayer; }

    void addPlayer(const PlayerTCG &p) { listPlayer.push_back(p); }

    PlayerTCG* getPlayerByID(const string &pid) {
        for (auto &p : listPlayer) {
            if (p.getID() == pid) return &p;
        }
        return nullptr;
    }

    void printTurnamen() {
        cout << "Turnamen ID: " << id << ", Nama: " << nama << ", Tanggal: " << tanggal << endl;
        cout << "Daftar Player:\n";
        for (auto &p : listPlayer) {
            p.printInfo();
            p.printDeck();
            cout << "-----------------------------\n";
        }
    }
};
