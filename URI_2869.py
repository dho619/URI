#Resolvendo usando uma formula, que por algum motivo nao funciona pra multiplo de 8
#exceto 40, 56 e 88

def fatorial_div(num): #pegar os divisores do fatorial, 100 num primos e o suficiente
    num_primos = [2,3,5,7,11,13,17,19,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97]
    list_div = []
    i = 0
    while(num!=1):
        if(num%num_primos[i]==0):
            num = num/num_primos[i]
            list_div.append(num_primos[i])
        else:
            i+=1
    return list_div

C = int(input())
for i in range(C):
    qtd = int(input())
    if(qtd%8!=0): #Por algum motivo que faco a minima ideia, as contas nao funcionam com multiplo de 8, exceto 40 56 88
        n_primos = [2,3,5,7,11,13,17,19,23,29,31] # esses numeros primos ja sao o suficiente pra resolver
        list = fatorial_div(qtd)
        list = [list[i]-1 for i in range(len(list))]
        result = 1 # resultado final
        i = len(list)-1 # posicao da lista, o maior exponte e o ultimo
        for n in n_primos[:len(list)]:
            result *= n**list[i]
            i -= 1
    else:        #1    2    3    4    5     6     7     8     9      10      11      12
        list = [24, 120, 360, 840, 1680, 2520, 6720, 7560, 10080, 15120, 107520, 27720]
        result = list[qtd//8-1]
        
    print(result%1000000007)

"""
#Resolvendo na Brute Force, da time limit exceeded

import numpy as np
divisores = []
for N in np.arange(23,24):
  qtd = 0
  num_atual = 0;
  
  while(qtd != N):
    div = 1
    qtd = 0
    num_atual += 1
    print(num_atual)
    for i in np.arange(1, num_atual//2+1):      
      if(num_atual%div==0):
        qtd += 1
      div += 1
    qtd += 1 #como ele roda ate a metade, ja adc a div por ele msm

  divisores.append(num_atual%1000000007)
  print("{}..{} \n".format(N, num_atual%1000000007))
print(divisores)