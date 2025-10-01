#include "Kartu.cpp"

class Pokemon : public Kartu {
private:
    string id;
    string namaKartu;
    string serial;

public:
    Pokemon() {}
    Pokemon(string id, string namaKartu, string serial, string namaPermainan, string bahan)
        : Kartu(namaPermainan, bahan), id(id), namaKartu(namaKartu), serial(serial) {}

    void setID(string i) { id = i; }
    void setNamaKartu(string nk) { namaKartu = nk; }
    void setSerial(string s) { serial = s; }

    string getID() const { return id; }
    string getNamaKartu() const { return namaKartu; }
    string getSerial() const { return serial; }

    void printInfo() override {
        cout << "Pokemon ID: " << id << ", Nama Kartu: " << namaKartu
             << ", Serial: " << serial << endl;
        Kartu::printInfo();
    }
};
