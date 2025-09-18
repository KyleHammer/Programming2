import tkinter as tk

class TutorDemoApplication(tk.Tk):
    def __init__(self):
        super().__init__()
        global INPUT
        self.title("Increment-Decrement")
        self.label = tk.Label(self, text="Value")
        self.label.pack(side = tk.LEFT)
        self.tf = tk.Entry(self)
        self.set_text(self.tf, "0")
        self.tf.pack(side = tk.LEFT)

        self.Btn1 = tk.Button(text = "+1", command = lambda:self.increment())
        self.Btn2 = tk.Button(text = "-1", command = lambda:self.decrement())
        self.Btn3 = tk.Button(text = "C", command = lambda:self.set_text(self.tf, "0"))


        self.Btn1.pack(side = tk.LEFT)
        self.Btn2.pack(side = tk.LEFT)
        self.Btn3.pack(side = tk.LEFT)
    
    


    def set_text(self, tf, text):
        tf.delete(0,tk.END)
        tf.insert(0,text)

    def increment(self):
        INPUT = int(self.tf.get())
        INPUT += 1
        self.set_text(self.tf, str(INPUT))

    def decrement(self):
        INPUT = int(self.tf.get())
        INPUT -= 1
        self.set_text(self.tf, str(INPUT))
        


if __name__ == '__main__':
    app = TutorDemoApplication()
    app.mainloop()