Algoritmo "Temperatura F"

// Faça um programa em Português Estruturado que receba uma temperatura em centígrados
// e transforme para fahrenheit. Sabe-se que a fórmula para conversão é F=((9.C)+160)/5.

Var

TemC, TemF: real

Inicio

escreval("Qual é a temperatura em C?")
leia(TemC)

TemF <- ((9 * TemC) + 160) / 5

escreval("A temperatura em F é ", TemF)

Fimalgoritmo