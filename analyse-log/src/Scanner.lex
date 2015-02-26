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
SEPARATEUR     =   [ \t]
SPACE   =   [ \s]
DECAL   =   ("+"|"-")[0-9]+
NUM     =   [0-9]+
FIN     =   \n"|"\r\n
IP 		=   ([0-9]{1,3}\.){3}[0-9]{1,3}  
ACTION  =   \".*\"
TIRET   =   " - - "  

%%

/* regles */

{IP}   		{ System.out.print(yytext());return new Symbol(ParserSym.IP, new String(yytext()));}
{TIRET}     { System.out.print(yytext());return new Symbol(ParserSym.TIRET);}
{ACTION}    { System.out.print(yytext());return new Symbol(ParserSym.ACTION);}
{NUM}       { System.out.print(yytext());return new Symbol(ParserSym.NUM);}
"\r"		{ System.out.print(yytext());return new Symbol(ParserSym.EOF);}
"Jan"		{ System.out.print(yytext());return new Symbol(ParserSym.JAN);}
"Feb"		{ System.out.print(yytext());return new Symbol(ParserSym.FEV);}
"Mar"		{ System.out.print(yytext());return new Symbol(ParserSym.MAR);}
"Apr"		{ System.out.print(yytext());return new Symbol(ParserSym.AVR);}
"May"		{ System.out.print(yytext());return new Symbol(ParserSym.MAI);}
"Jun"		{ System.out.print(yytext());return new Symbol(ParserSym.JUIN);}
"Jul"		{ System.out.print(yytext());return new Symbol(ParserSym.JUIL);}
"Aug"		{ System.out.print(yytext());return new Symbol(ParserSym.AOU);}
"Sep"		{ System.out.print(yytext());return new Symbol(ParserSym.SEP);}
"Oct"		{ System.out.print(yytext());return new Symbol(ParserSym.OCT);}
"Nov"		{ System.out.print(yytext());return new Symbol(ParserSym.NOV);}
"Dec"		{ System.out.print(yytext());return new Symbol(ParserSym.DEC);}
":"         { System.out.print(yytext());return new Symbol(ParserSym.DP);}
"/"         { System.out.print(yytext());return new Symbol(ParserSym.SL);}
"["         { System.out.print(yytext());return new Symbol(ParserSym.CO);}
"]"         { System.out.print(yytext());return new Symbol(ParserSym.CF);}
{DECAL}     { System.out.print(yytext());return new Symbol(ParserSym.DECAL,new Integer(yytext()));}
{NUM}       { System.out.print(yytext());return new Symbol(ParserSym.NUM, new Integer(yytext()));}
{SEPARATEUR}       { ; }
{FIN}		{ return new Symbol(ParserSym.EOF);}
.			{ return null;}
