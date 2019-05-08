qtd_tag = int(input())

for i in range(qtd_tag):
  tag = input()
  mensagem = ""
  if(tag[0] == '1'):
    inicio_tag = False
    final_tag = False
    if('</' in tag):
      mensagem = "error"
    else:
      for i,char in enumerate(tag):
        if(char=='<'):
          if(inicio_tag):
            mensagem = "error"
            break
          else:
            inicio_tag = True
        elif(char=='>'):
          if(inicio_tag):
            inicio_tag = False
            final_tag = True
          else:
            mensagem = "error"
            break
      if (not(inicio_tag) and final_tag and mensagem == ""):
        mensagem = "Successful !!"     
  
  elif(tag[0] == '0' and (tag.count("<")+tag.count(">"))>=4):
    primeira_tag_I = 0
    primeira_tag_F = 0
    segunda_tag_I = 0
    segunda_tag_F = 0
    dentro_tag_1 = False
    dentro_tag_2 = False
    valor_tag_1 = ""
    valor_tag_2 = ""
    tags = []
    aux1 = 0
    aux2 = 0
    if('</' in tag and tag.count("<")==tag.count(">")):
      for i,char in enumerate(tag):
        if(char == "<" and tag[i+1] != "/"):
          if(primeira_tag_I == primeira_tag_F):
            primeira_tag_I += 1
            dentro_tag_1 = True
          else:
            mensagem = "error"
            break;
        elif(char == ">" and segunda_tag_I == segunda_tag_F):
          if(primeira_tag_I == (primeira_tag_F+1)):
            primeira_tag_F += 1
          else:
            mensagem = "error"
            break;
        elif(char == "<" and tag[i+1]=="/"):
          if(segunda_tag_I == segunda_tag_F):
            segunda_tag_I += 1
            dentro_tag_2 = True
          else:
            mensagem = "error"
            break;
        elif(char == ">" and primeira_tag_I == primeira_tag_F):
          if(segunda_tag_I == (segunda_tag_F+1)):
            segunda_tag_F += 1
          else:
            mensagem = "error"
            break;
        
        if (char == ">" or (char == " " and (tag[i-1]!="/" or tag[i-1]!="<"))):
          dentro_tag_1 = False
          dentro_tag_2 = False
        
        if(dentro_tag_1):
          aux1+=1
          if(aux1>1):
            valor_tag_1 += char
        elif(valor_tag_1 != ""):
          aux1=0
          tags.append(valor_tag_1)
          valor_tag_1 = ""

        if(dentro_tag_2):
          aux2+=1
          if(aux2>2):
            valor_tag_2 += char
        elif(valor_tag_2 != ""):
          aux2=0
          try:
            tags.remove(valor_tag_2)
          except:
            mensagem = "error"
          valor_tag_2 = ""

      if(primeira_tag_I == primeira_tag_F and segunda_tag_I == segunda_tag_F and primeira_tag_I == segunda_tag_I and mensagem == ""):
          mensagem = "Successful !!"
      else:
        mensagem = "error"
    else:
      mensagem = "error"
  if(mensagem != ""):
    print("{}".format(mensagem))
  else:
    print("error")