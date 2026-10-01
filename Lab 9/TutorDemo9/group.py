class Group:
    def __init__(self, group_type, capacity, price):
        self.__group_type = group_type
        self.__capacity = capacity
        self.__price = price
        self.__sold = 0

    def sell(self, amount):
        self.__sold += amount

    def can_sell(self, amount):
        return self.__sold + amount <= self.__capacity 

    def get_group_type(self):
        return self.__group_type
    
    def get_capacity(self):
        return self.__capacity
    
    def get_price(self):
        return self.__price
    
    def get_sold(self):
        return self.__sold
