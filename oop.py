class dog:
    legs = 4;
    
    def __init__(self, name):
        self.name = name
        
    def eat(self):
        print ('an an an ....')

pug = dog('bug')
print (pug.name)
print (pug.legs)
pug.eat()