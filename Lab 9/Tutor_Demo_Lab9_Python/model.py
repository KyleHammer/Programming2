from Stadium import Stadium
class Model:
    def __init__(self):
        self.stadium = Stadium()
        self.group = self.stadium.getGroup()
       
    def sell(self, quantity):
        """
        Save the email into a file
        :return:
        """
        if self.group.canSell(quantity):
            self.group.sell(quantity)
    
    def getGroupName(self):
        return str(self.group.getName())
    
    def getGroupCapacity(self):
        return int(self.group.getCapacity())
    
    def getGroupPrice(self):
        return float(self.group.getPrice())

    def getGroupSold(self):
        return int(self.group.getSold())

    def getGroupIncome(self):
        return float(self.group.getIncome())

    def getGroupLeft(self):
        return int(self.group.getLeft())