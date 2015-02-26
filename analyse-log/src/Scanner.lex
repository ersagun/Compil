/* auteur : ersagun.yalcintepe@etu.univ-lorraine.fr - julien.remy@etu.univ-lorraine.fr */
/* (c) 2015 */


package fr.ul.miage.exemple.generated;
import java_cup.runtime.Symbol;
import java.lang.StringBuffer;

%%

/* options */
%line
%public
%cupsym ParserSym
%cup


/* macros */
SEP     =   [ \t]
DECAL   =   ("+"|"-")[0-9]+
NUM     =   [0-9]+
FIN     =   \n"|"\r\n
IP 		=   ([0-9]{1,3}\.){3}[0-9]{1,3}  
ACTION  =   "\"GET*\s[0-9]{3}\""
TIRET   =   " - - "  

%%

/* regles */

{IP}   		{ System.out.println(yytext());return new Symbol(ParserSym.IP, new String(yytext()));}
{TIRET}     { System.out.println(yytext());return new Symbol(ParserSym.TIRET);}
{ACTION}    { System.out.println(yytext());return new Symbol(ParserSym.ACTION);}
{NUM}       { System.out.println(yytext());return new Symbol(ParserSym.NUM);}
"\r"		{ System.out.println(yytext());return new Symbol(ParserSym.EOF);}
"Jan"		{ System.out.println(yytext());return new Symbol(ParserSym.JAN);}
"Feb"		{ System.out.println(yytext());return new Symbol(ParserSym.FEV);}
"Mar"		{ System.out.println(yytext());return new Symbol(ParserSym.MAR);}
"Apr"		{ System.out.println(yytext());return new Symbol(ParserSym.AVR);}
"May"		{ System.out.println(yytext());return new Symbol(ParserSym.MAI);}
"Jun"		{ System.out.println(yytext());return new Symbol(ParserSym.JUIN);}
"Jul"		{ System.out.println(yytext());return new Symbol(ParserSym.JUIL);}
"Aug"		{ System.out.println(yytext());return new Symbol(ParserSym.AOU);}
"Sep"		{ System.out.println(yytext());return new Symbol(ParserSym.SEP);}
"Oct"		{ System.out.println(yytext());return new Symbol(ParserSym.OCT);}
"Nov"		{ System.out.println(yytext());return new Symbol(ParserSym.NOV);}
"Dec"		{ System.out.println(yytext());return new Symbol(ParserSym.DEC);}
":"         { System.out.println(yytext());return new Symbol(ParserSym.DP);}
"/"         { System.out.println(yytext());return new Symbol(ParserSym.SL);}
"["         { System.out.println(yytext());return new Symbol(ParserSym.CO);}
"]"         { System.out.println(yytext());return new Symbol(ParserSym.CF);}
{DECAL}     { System.out.println(yytext());return new Symbol(ParserSym.DECAL,new Integer(yytext()));}
{NUM}       { System.out.println(yytext());return new Symbol(ParserSym.NUM, new Integer(yytext()));}
{SEP}       { ; }
{FIN}		{ return new Symbol(ParserSym.EOF);}
.			{ return null;}
