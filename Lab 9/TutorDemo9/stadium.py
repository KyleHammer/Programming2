from group import Group

class Stadium:
    def __init__(self):
        self.__group = Group("front", 50, 34.99)
    
    def get_group(self):
        return self.__group
