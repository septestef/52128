import fs from 'fs';
import antlr4 from 'antlr4';
import ScheduleLexer from './generated/ScheduleLexer.js';
import ScheduleParser from './generated/ScheduleParser.js';
import ScheduleCustomVisitor from './ScheduleCustomVisitor.js';

// Leer archivo de entrada
const input = fs.readFileSync('input.txt', 'utf-8');

// Crear flujo de caracteres y lexer
const chars = new antlr4.InputStream(input);
const lexer = new ScheduleLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);

// Mostrar tabla de tokens y lexemas
tokens.fill();
console.log('┌───────────────┬───────────────┐');
console.log('│    TOKEN      │    LEXEMA     │');
console.log('├───────────────┼───────────────┤');
tokens.tokens.forEach(token => {
    if (token.type !== antlr4.Token.EOF) {
        const tokenName = ScheduleLexer.symbolicNames[token.type] || `TOKEN_${token.type}`;
        const lexema = token.text.replace(/\n/g, '\\n');
        console.log(`│ ${tokenName.padEnd(13)} │ ${lexema.padEnd(13)} │`);
    }
});
console.log('└───────────────┴───────────────┘');

// Crear parser y árbol sintáctico
const parser = new ScheduleParser(tokens);
parser.buildParseTrees = true;
const tree = parser.schedule(); 

// Mostrar árbol sintáctico como texto en la terminal
function treeToString(node, parser) {
    if (!node) return '';
    if (!node.children || node.children.length === 0) {
        return node.getText();
    }
    const ruleName = parser.ruleNames[node.ruleIndex];
    const childrenStr = node.children.map(child => treeToString(child, parser)).join(' ');
    return `(${ruleName} ${childrenStr})`;
}
console.log('\nÁrbol sintáctico:');
console.log(treeToString(tree, parser));

// Evaluar con Visitor personalizado
const visitor = new ScheduleCustomVisitor();
const result = visitor.visit(tree);

console.log('\nResultado de la evaluación o recorrido:');
console.log(result);



