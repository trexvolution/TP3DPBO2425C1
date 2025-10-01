class Individu:
    def __init__(self, noKTP="", nama="", alamat=""):
        self.noKTP = noKTP
        self.nama = nama
        self.alamat = alamat

    def setNoKTP(self, ktp): self.noKTP = ktp
    def setNama(self, n): self.nama = n
    def setAlamat(self, a): self.alamat = a

    def getNoKTP(self): return self.noKTP
    def getNama(self): return self.nama
    def getAlamat(self): return self.alamat

    def printInfo(self):
        print(f"KTP: {self.noKTP}, Nama: {self.nama}, Alamat: {self.alamat}")
