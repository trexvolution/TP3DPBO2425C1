from Turnamen import Turnamen
from PlayerTCG import PlayerTCG
from Pokemon import Pokemon

if __name__ == "__main__":
    t1 = Turnamen("T01", "Pokemon Championship", "30-09-2025")

    # Hardcode data awal
    p1 = Pokemon("P001", "Pikachu", "S123", "Pokemon TCG", "Kertas")
    p2 = Pokemon("P002", "Charizard", "S124", "Pokemon TCG", "Kertas")
    p3 = Pokemon("P003", "Bulbasaur", "S125", "Pokemon TCG", "Kertas")

    player1 = PlayerTCG("PL01", "Ash", "123456", "Ash Ketchum", "Pallet Town")
    player1.addPokemon(p1)
    player1.addPokemon(p2)

    player2 = PlayerTCG("PL02", "Misty", "654321", "Misty Waterflower", "Cerulean City")
    player2.addPokemon(p3)

    t1.addPlayer(player1)
    t1.addPlayer(player2)

    while True:
        print("\n===== MENU TURNAMEN =====")
        print("1. Tambah Player")
        print("2. Tambah Pokemon ke Player")
        print("3. Tampilkan Data Turnamen")
        print("0. Keluar")
        pilihan = input("Pilih: ")

        if pilihan == "1":
            id = input("Masukkan ID Player: ")
            namaPanggilan = input("Masukkan Nama Panggilan: ")
            noKTP = input("Masukkan No KTP: ")
            nama = input("Masukkan Nama Lengkap: ")
            alamat = input("Masukkan Alamat: ")

            newPlayer = PlayerTCG()
            newPlayer.setID(id)
            newPlayer.setNamaPanggilan(namaPanggilan)
            newPlayer.setNoKTP(noKTP)
            newPlayer.setNama(nama)
            newPlayer.setAlamat(alamat)

            t1.addPlayer(newPlayer)
            print("Player berhasil ditambahkan!")

        elif pilihan == "2":
            playerID = input("Masukkan ID Player: ")
            player = t1.getPlayerByID(playerID)
            if player is None:
                print("Player tidak ditemukan!")
            else:
                pid = input("Masukkan ID Pokemon: ")
                namaKartu = input("Masukkan Nama Kartu: ")
                serial = input("Masukkan Serial: ")
                namaPermainan = input("Masukkan Nama Permainan: ")
                bahan = input("Masukkan Bahan: ")

                newPoke = Pokemon()
                newPoke.setID(pid)
                newPoke.setNamaKartu(namaKartu)
                newPoke.setSerial(serial)
                newPoke.setNamaPermainan(namaPermainan)
                newPoke.setBahan(bahan)

                player.addPokemon(newPoke)
                print("Pokemon berhasil ditambahkan!")

        elif pilihan == "3":
            t1.printTurnamen()

        elif pilihan == "0":
            break

        else:
            print("Pilihan tidak valid!")
