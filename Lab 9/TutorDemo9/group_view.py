from tkinter import *
from stadium import Stadium
from group import Group

class GroupView:
    def __init__(self, parent, model: Group):
        self.parent = parent
        self.model = model

        Label(self.parent, text="Seat group:").grid(column=0, row=0)
        Label(self.parent, text="Capacity:").grid(column=0, row=1)
        Label(self.parent, text="Price ($):").grid(column=0, row=2)
        Label(self.parent, text="Sold:").grid(column=0, row=3)
        Label(self.parent, text="Left:").grid(column=0, row=4)
        Label(self.parent, text="Income:").grid(column=0, row=5)
        Label(self.parent, text="Sell:").grid(column=0, row=6)
        
        self.type_lbl =  Label(self.parent, text=self.model.get_group_type())
        self.type_lbl.grid(column=1, row=0, sticky=W)
        
        self.capacity_lbl =  Label(self.parent, text=self.model.get_capacity())
        self.capacity_lbl.grid(column=1, row=1, sticky=W)
        
        self.price_lbl =  Label(self.parent, text=self.model.get_price())
        self.price_lbl.grid(column=1, row=2, sticky=W)
        
        self.sold_lbl =  Label(self.parent, text="0")
        self.sold_lbl.grid(column=1, row=3, sticky=W)
        
        self.left_lbl =  Label(self.parent, text=self.model.get_capacity())
        self.left_lbl.grid(column=1, row=4, sticky=W)
        
        self.income_lbl =  Label(self.parent, text="$0.00")
        self.income_lbl.grid(column=1, row=5, sticky=W)

        self.entry_var = IntVar()
        Entry(self.parent, textvariable=self.entry_var).grid(column=1, row=6)
        
        Button(self.parent, text="Sell", command=self.sell).grid(column=1, row=7, sticky=E)

    def update(self):
        self.sold_lbl.configure(text=self.model.get_sold())
        self.left_lbl.configure(text=self.model.get_capacity() - self.model.get_sold())
        self.income_lbl.configure(text=f"${self.model.get_sold() * self.model.get_price():.2f}")

    def sell(self):
        amount = self.entry_var.get()
        if self.model.can_sell(amount):
            self.model.sell(amount)
            self.update()
        else:
            print("Cannot sell!")

if __name__ == "__main__":
    root = Tk()
    stadium = Stadium()
    group = stadium.get_group()
    GroupView(root, group)
    root.mainloop()
