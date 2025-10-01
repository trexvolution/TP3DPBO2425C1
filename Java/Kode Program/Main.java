import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turnamen t1 = new Turnamen("T01", "Pokemon Championship", "30-09-2025");

        // Hardcode data awal
        Pokemon p1 = new Pokemon("P001", "Pikachu", "S123", "Pokemon TCG", "Kertas");
        Pokemon p2 = new Pokemon("P002", "Charizard", "S124", "Pokemon TCG", "Kertas");
        Pokemon p3 = new Pokemon("P003", "Bulbasaur", "S125", "Pokemon TCG", "Kertas");

        PlayerTCG player1 = new PlayerTCG("PL01", "Ash", "123456", "Ash Ketchum", "Pallet Town");
        player1.addPokemon(p1);
        player1.addPokemon(p2);

        PlayerTCG player2 = new PlayerTCG("PL02", "Misty", "654321", "Misty Waterflower", "Cerulean City");
        player2.addPokemon(p3);

        t1.addPlayer(player1);
        t1.addPlayer(player2);

        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n===== MENU TURNAMEN =====");
            System.out.println("1. Tambah Player");
            System.out.println("2. Tambah Pokemon ke Player");
            System.out.println("3. Tampilkan Data Turnamen");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(sc.nextLine());

            if (pilihan == 1) {
                System.out.print("Masukkan ID Player: ");
                String id = sc.nextLine();
                System.out.print("Masukkan Nama Panggilan: ");
                String namaPanggilan = sc.nextLine();
                System.out.print("Masukkan No KTP: ");
                String noKTP = sc.nextLine();
                System.out.print("Masukkan Nama Lengkap: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Alamat: ");
                String alamat = sc.nextLine();

                PlayerTCG newPlayer = new PlayerTCG();
                newPlayer.setID(id);
                newPlayer.setNamaPanggilan(namaPanggilan);
                newPlayer.setNoKTP(noKTP);
                newPlayer.setNama(nama);
                newPlayer.setAlamat(alamat);

                t1.addPlayer(newPlayer);
                System.out.println("Player berhasil ditambahkan!");

            } else if (pilihan == 2) {
                System.out.print("Masukkan ID Player: ");
                String playerID = sc.nextLine();

                PlayerTCG player = t1.getPlayerByID(playerID);
                if (player == null) {
                    System.out.println("Player tidak ditemukan!");
                } else {
                    System.out.print("Masukkan ID Pokemon: ");
                    String pid = sc.nextLine();
                    System.out.print("Masukkan Nama Kartu: ");
                    String namaKartu = sc.nextLine();
                    System.out.print("Masukkan Serial: ");
                    String serial = sc.nextLine();
                    System.out.print("Masukkan Nama Permainan: ");
                    String namaPermainan = sc.nextLine();
                    System.out.print("Masukkan Bahan: ");
                    String bahan = sc.nextLine();

                    Pokemon newPoke = new Pokemon();
                    newPoke.setID(pid);
                    newPoke.setNamaKartu(namaKartu);
                    newPoke.setSerial(serial);
                    newPoke.setNamaPermainan(namaPermainan);
                    newPoke.setBahan(bahan);

                    player.addPokemon(newPoke);
                    System.out.println("Pokemon berhasil ditambahkan!");
                }

            } else if (pilihan == 3) {
                t1.printTurnamen();
            }

        } while (pilihan != 0);

        sc.close();
    }
}
