from math import sqrt
entrada = raw_input().split()
A, B, C = float(entrada[0]),float(entrada[1]), float(entrada[2])
delta = (B*B) - (4*A*C)
try:
    R1 = ((-1*B) + sqrt(delta))/(2*A)
    R2 = ((-1*B) - sqrt(delta))/(2*A)
    print("R1 = {:.5f}\nR2 = {:.5f}".format(R1, R2))
except:
    print("Impossivel calcular")
