from Individu import Individu
from Pokemon import Pokemon

class PlayerTCG(Individu):
    def __init__(self, id="", namaPanggilan="", noKTP="", nama="", alamat=""):
        super().__init__(noKTP, nama, alamat)
        self.id = id
        self.namaPanggilan = namaPanggilan
        self.deckList = []

    def setID(self, i): self.id = i
    def setNamaPanggilan(self, np): self.namaPanggilan = np

    def getID(self): return self.id
    def getNamaPanggilan(self): return self.namaPanggilan
    def getDeckList(self): return self.deckList

    def addPokemon(self, p: Pokemon): self.deckList.append(p)

    def printDeck(self):
        print(f"Deck {self.namaPanggilan}:")
        for p in self.deckList:
            p.printInfo()

    def printInfo(self):
        print(f"Player ID: {self.id}, Nama Panggilan: {self.namaPanggilan}")
        super().printInfo()
