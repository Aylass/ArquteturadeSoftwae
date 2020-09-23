#!/bin/bash

#
# COMPILAÇÃO DOS ARQUIVOS
#

javac Model/Produto.java Model/Cliente.java Controller/Estoque.java Controller/Boleto.java View/Main.java -d compiled_program/

# INICIANDO O MAIN

java -cp compiled_program/ com.company.View.Main
