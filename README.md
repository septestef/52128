User Analyzer
Este proyecto es un analizador sintáctico para un lenguaje sencillo que define usuarios con atributos. La gramática está implementada en ANTLR4 y puede ser usada para validar y procesar datos estructurados sobre usuarios.
Gramática
El lenguaje tiene la siguiente estructura:
•	Uno o más usuarios (user).
•	Cada usuario tiene un identificador (IDENTIFIER) y un bloque de atributos.
•	Los atributos son pares clave-valor con valores de tipo número, cadena o booleano.

REQUISITOS:
- Node.js
- Java (for ANTLR)
- VS Code + ANTLR plugin
Cómo usar
1.	Genera el parser con ANTLR4 (suponiendo que tienes ANTLR4 instalado):
bash

antlr4 -Dlanguage=JavaScript User.g4
2.	Integra el parser en un proyecto Node.js para analizar archivos o cadenas con la sintaxis definida.
3.	Ejecuta tu código para validar inputs o extraer información estructurada.
