def setattribute(func): 
    attribute_name = '_attr_' + func.__name__

    @property
    def _wrapper(self):
        if not hasattr(self, attribute_name):
            setattr(self, attribute_name, func(self))  # Create instance attribute.

        return getattr(self, attribute_name)

    return _wrapper

def timer(func):
    from termcolor import colored
    import time 

    def __wrapper(*args, **kwargs):
        start_time = time.time() 

        result = func(*args, **kwargs)

        end_time = time.time() 
        run_time = (end_time - start_time) * 1000

        print(f"\nTotal runtime of {func.__name__}() is {run_time} ms")
        
        return result

    return __wrapper
