#!/bin/bash

echo "Compilando..."
cd src
javac *.java

echo ""
echo "Executando..."
java Main

echo ""
echo "✅ Concluído!"
