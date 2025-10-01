from Kartu import Kartu

class Pokemon(Kartu):
    def __init__(self, id="", namaKartu="", serial="", namaPermainan="", bahan=""):
        super().__init__(namaPermainan, bahan)
        self.id = id
        self.namaKartu = namaKartu
        self.serial = serial

    def setID(self, i): self.id = i
    def setNamaKartu(self, nk): self.namaKartu = nk
    def setSerial(self, s): self.serial = s

    def getID(self): return self.id
    def getNamaKartu(self): return self.namaKartu
    def getSerial(self): return self.serial

    def printInfo(self):
        print(f"Pokemon ID: {self.id}, Nama Kartu: {self.namaKartu}, Serial: {self.serial}")
        super().printInfo()
