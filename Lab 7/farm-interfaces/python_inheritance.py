from abc import ABC, abstractmethod

# Base class
class Animal(ABC):
    @abstractmethod
    def make_noise(self):
        pass


# Interface (Mimic)
class Pettable(ABC):
    @abstractmethod
    def pet(self):
        pass


# Subclasses
class Fish(Animal):
    def make_noise(self):
        print("Blub!")


class Dog(Animal, Pettable):
    def make_noise(self):
        print("Woof!")

    def pet(self):
        print("Dog has been pet!")


class Cat(Animal, Pettable):
    def make_noise(self):
        print("Meow!")

    def pet(self):
        print("Cat has been pet!")


# Farm class
class Farm:
    def __init__(self):
        self.animals = [
            Cat(),
            Dog(),
            Cat(),
            Fish()
        ]

    def use(self):
        for animal in self.animals:
            animal.make_noise()

            if isinstance(animal, Pettable):
                animal.pet()


# Main method
if __name__ == "__main__":
    farm = Farm()
    farm.use()
