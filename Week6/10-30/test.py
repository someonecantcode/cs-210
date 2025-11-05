class Value:
    """  value class   """

    # constructor
    def __init__(self, data, _children=(), _op=''):
        self.data = data
        self.grad = 0

        self._prev = set(_children)
        self._op = _op # kinda useless ngl

    def backward(self):

        # topological order all of the children in the graph
        topo = []
        visited = set()
        def build_topo(v):
            if v not in visited:
                visited.add(v)
                for child in v._prev:
                    build_topo(child)
                topo.append(v)
        build_topo(self)

        # go one variable at a time and apply the chain rule to get its gradient
        self.grad = 1
        for v in reversed(topo):
            v._backward()
    

    # all operations that you need
    # derivative * out.grad (Reverse chain rule to back prop partial derivatives)
    def __add__(self, other):
        out = Value(self.data + other.data, (self, other), '+')

        def backwards():
            self.grad += out.grad
            out.grad += self.grad
        
        return out
    
    def __sub__(self, other):
        return self.__add__(-1 * other)
    
    def __mult__(self, other):
        out = Value(self.data * other.data, (self, other), '*')

        def backwards():
            self.grad = out.data * out.grad
            out.grad = self.data* self.grad
        
        return out


    



        



class main:
    print("hello world!")

if __name__ == "__main__":
    main()