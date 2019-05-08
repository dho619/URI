saque = float(input())
saque += 0.001

valores = [100.00, 50.00, 20.00, 10.00, 5.00,2.00, 1.00, 0.50,0.25,0.10,0.05,0.01]

print ("NOTAS:") 
for valor in valores[:6]:
    print("{} nota(s) de R$ {:.2f}".format(int(saque//valor), valor))
    saque = saque%valor
print ("MOEDAS:")
for valor in valores[6:]:
    print("{} moeda(s) de R$ {:.2f}".format(int(saque//valor), valor))
    saque = saque%valor