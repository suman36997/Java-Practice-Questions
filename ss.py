class Rectangle(object):
        def __init__(self,width=2,height =3,color='r'):
                                  self.height=height
                                  self.width=width
                                  self.color=color
    def drawRectangle(self):
                       import matplotlib.pyplot as plt
                       plt.gca().add_patch(plt.Rectangle((0, 0),self.width, self.height ,fc=self.color))
                       plt.axis('scaled')
                       plt.show()