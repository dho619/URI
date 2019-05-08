entrada = input().split() # recebendo uma string de entrada e fatiando ela
                          # entrada agora e um vetor com as partes dos numeros 

                          
A,B,C,D = [int(v) for v in entrada] # transforma cada possicao do vetor em int
                                    # e atribui a A, B, C, D

if ((B > C) and (D > A) and ((C+D) > (A+B)) and (C >= 0) and (D >= 0) and (A%2==0)):
	print("Valores aceitos")
else:
	print("Valores nao aceitos")