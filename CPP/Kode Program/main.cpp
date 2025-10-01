#include "Turnamen.cpp"
#include <iostream>
using namespace std;

int main() {
    Turnamen t1("T01", "Pokemon Championship", "30-09-2025");

    // Hardcode data awal
    Pokemon p1("P001", "Pikachu", "S123", "Pokemon TCG", "Kertas");
    Pokemon p2("P002", "Charizard", "S124", "Pokemon TCG", "Kertas");
    Pokemon p3("P003", "Bulbasaur", "S125", "Pokemon TCG", "Kertas");

    PlayerTCG player1("PL01", "Ash", "123456", "Ash Ketchum", "Pallet Town");
    player1.addPokemon(p1);
    player1.addPokemon(p2);

    PlayerTCG player2("PL02", "Misty", "654321", "Misty Waterflower", "Cerulean City");
    player2.addPokemon(p3);

    t1.addPlayer(player1);
    t1.addPlayer(player2);

    int pilihan;
    do {
        cout << "\n===== MENU TURNAMEN =====\n";
        cout << "1. Tambah Player\n";
        cout << "2. Tambah Pokemon ke Player\n";
        cout << "3. Tampilkan Data Turnamen\n";
        cout << "0. Keluar\n";
        cout << "Pilih: ";
        cin >> pilihan;
        cin.ignore();

        if (pilihan == 1) {
            string id, namaPanggilan, noKTP, nama, alamat;
            cout << "Masukkan ID Player: "; getline(cin, id);
            cout << "Masukkan Nama Panggilan: "; getline(cin, namaPanggilan);
            cout << "Masukkan No KTP: "; getline(cin, noKTP);
            cout << "Masukkan Nama Lengkap: "; getline(cin, nama);
            cout << "Masukkan Alamat: "; getline(cin, alamat);

            PlayerTCG newPlayer;
            newPlayer.setID(id);
            newPlayer.setNamaPanggilan(namaPanggilan);
            newPlayer.setNoKTP(noKTP);
            newPlayer.setNama(nama);
            newPlayer.setAlamat(alamat);

            t1.addPlayer(newPlayer);
            cout << "Player berhasil ditambahkan!\n";

        } else if (pilihan == 2) {
            string playerID;
            cout << "Masukkan ID Player: "; getline(cin, playerID);

            PlayerTCG* player = t1.getPlayerByID(playerID);
            if (player == nullptr) {
                cout << "Player tidak ditemukan!\n";
            } else {
                string pid, namaKartu, serial, namaPermainan, bahan;
                cout << "Masukkan ID Pokemon: "; getline(cin, pid);
                cout << "Masukkan Nama Kartu: "; getline(cin, namaKartu);
                cout << "Masukkan Serial: "; getline(cin, serial);
                cout << "Masukkan Nama Permainan: "; getline(cin, namaPermainan);
                cout << "Masukkan Bahan: "; getline(cin, bahan);

                Pokemon newPoke;
                newPoke.setID(pid);
                newPoke.setNamaKartu(namaKartu);
                newPoke.setSerial(serial);
                newPoke.setNamaPermainan(namaPermainan);
                newPoke.setBahan(bahan);

                player->addPokemon(newPoke);
                cout << "Pokemon berhasil ditambahkan!\n";
            }

        } else if (pilihan == 3) {
            t1.printTurnamen();
        }

    } while (pilihan != 0);

    return 0;
}
