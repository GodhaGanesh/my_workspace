import datetime
def greeting(name):
    time = datetime.datetime.now().time()
    hh = int(str(time)[0:2])
    if(hh > 19): return "Good Night "+name
    elif(hh > 15): return "Good Evening "+name
    elif(hh > 11): return "Good afternoon "+name
    return "Good Morning "+name