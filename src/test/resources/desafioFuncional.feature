# language: pt

@Feature
Funcionalidade: Desafio Funcional Health Tech
  #Pelo caminho do site da Funcional Health Tech, quero acessar a tela para saber mais informações
  #da empresa.

  Cenario: Validar direcionamento para o site da Funcional Health Tech.
    Dado Que acesso o site da Funcional Health Tech
    Quando Clico no link empresa
    Então Valido o direcionamento correto para o link empresa.
