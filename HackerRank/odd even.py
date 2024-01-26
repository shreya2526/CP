n=int((input()))
if(n%2!=0):
    print("Weird")
else:
    if(n==2 or n<=5):
        print("Not Weird")
    elif(n==6 or n<=20):
        print("Weird")
    elif(n>20 or n<=100):
        print("Not Weird")