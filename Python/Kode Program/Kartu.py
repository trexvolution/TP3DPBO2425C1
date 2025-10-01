class Kartu:
    def __init__(self, namaPermainan="", bahan=""):
        self.namaPermainan = namaPermainan
        self.bahan = bahan

    def setNamaPermainan(self, np): self.namaPermainan = np
    def setBahan(self, b): self.bahan = b

    def getNamaPermainan(self): return self.namaPermainan
    def getBahan(self): return self.bahan

    def printInfo(self):
        print(f"Permainan: {self.namaPermainan}, Bahan: {self.bahan}")
