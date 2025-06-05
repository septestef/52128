# Analizador

Este programa analiza expresiones de cron usando ANTLR4 y Node.js. Realiza análisis léxico y sintáctico, muestra la tabla de tokens/lexemas, el árbol sintáctico y traduce la expresión a una función JavaScript booleana que se ejecuta como lo haría un intérprete básico.

---

## Requisitos

- [Node.js](https://nodejs.org/) (versión 16 o superior)
- [ANTLR4](https://www.antlr.org/) (solo si quieres modificar la gramática y regenerar los archivos)

---

## Instalación

1. **Clona o descarga este repositorio.**
2. Abre una terminal en la carpeta del proyecto.
3. Instala las dependencias ejecutando:

   ```sh
   npm install

---

## Uso

1-Escribe la expresión que deseas analizar en el archivo input.txt. //ejemplos validos y no válidos en main
2- Ejecuta el programa escribiendo en la terminal (Ctrl + ñ) npm start
3- El programa mostrará en consola:
    - La tabla de tokens/lexemas.
    - El árbol sintáctico.
    - El resultado de la interpretación: una función JavaScript generada y el resultado de ejecutarla con un ejemplo.

---

## ¿Qué hace el programa?

- Análisis léxico: Divide la entrada en tokens usando ANTLR4.
- Análisis sintáctico: Construye el árbol sintáctico de la expresión.
- Tabla de tokens/lexemas: Muestra los tokens y sus valores.
- Árbol sintáctico: Muestra la estructura de la expresión.
- Interpretación: Traduce la expresión a una función JavaScript y la ejecuta con valores de ejemplo.

---

## Personalización
- Puedes modificar la gramática en Schedule.g4 y regenerar los archivos de ANTLR si lo necesitas.
- Cambia los valores de ejemplo en el visitor (matches(15, 9, 1, 1, 1)) para probar otros casos.

---
## Notas
- Si modificas la gramática, asegúrate de regenerar los archivos de ANTLR4.
- El programa está pensado para fines educativos y de análisis de expresiones

---

