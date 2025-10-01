from PlayerTCG import PlayerTCG

class Turnamen:
    def __init__(self, id="", nama="", tanggal=""):
        self.id = id
        self.nama = nama
        self.tanggal = tanggal
        self.listPlayer = []

    def setID(self, i): self.id = i
    def setNama(self, n): self.nama = n
    def setTanggal(self, t): self.tanggal = t

    def getID(self): return self.id
    def getNama(self): return self.nama
    def getTanggal(self): return self.tanggal
    def getListPlayer(self): return self.listPlayer

    def addPlayer(self, p: PlayerTCG): self.listPlayer.append(p)

    def getPlayerByID(self, pid: str):
        for p in self.listPlayer:
            if p.getID() == pid:
                return p
        return None

    def printTurnamen(self):
        print(f"Turnamen ID: {self.id}, Nama: {self.nama}, Tanggal: {self.tanggal}")
        print("Daftar Player:")
        for p in self.listPlayer:
            p.printInfo()
            p.printDeck()
            print("-----------------------------")
