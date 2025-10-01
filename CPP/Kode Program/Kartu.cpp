#include <iostream>
#include <string>
using namespace std;

class Kartu {
protected:
    string namaPermainan;
    string bahan;

public:
    Kartu() {}
    Kartu(string namaPermainan, string bahan)
        : namaPermainan(namaPermainan), bahan(bahan) {}

    void setNamaPermainan(string np) { namaPermainan = np; }
    void setBahan(string b) { bahan = b; }

    string getNamaPermainan() const { return namaPermainan; }
    string getBahan() const { return bahan; }

    virtual void printInfo() {
        cout << "Permainan: " << namaPermainan << ", Bahan: " << bahan << endl;
    }
};
