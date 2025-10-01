#include <iostream>
#include <string>
using namespace std;

class Individu {
protected:
    string noKTP;
    string nama;
    string alamat;

public:
    Individu() {}
    Individu(string noKTP, string nama, string alamat)
        : noKTP(noKTP), nama(nama), alamat(alamat) {}

    void setNoKTP(string ktp) { noKTP = ktp; }
    void setNama(string n) { nama = n; }
    void setAlamat(string a) { alamat = a; }

    string getNoKTP() const { return noKTP; }
    string getNama() const { return nama; }
    string getAlamat() const { return alamat; }

    virtual void printInfo() {
        cout << "KTP: " << noKTP << ", Nama: " << nama << ", Alamat: " << alamat << endl;
    }
};
