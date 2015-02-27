
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Feb 27 10:20:28 CET 2015
//----------------------------------------------------

package fr.ul.miage.exemple.generated;

import fr.ul.miage.exemple.Sessions;
import java.util.Date;
import java.lang.String;
import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Feb 27 10:20:28 CET 2015
  */
public class ParserCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\002\003\000\002\005" +
    "\004\000\002\004\003\000\002\006\013\000\002\003\003" +
    "\000\002\010\021\000\002\007\003\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\007\003\000\002\007\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\032\010\001\002\000\004\002\055\001" +
    "\002\000\004\032\ufffe\001\002\000\004\002\000\001\002" +
    "\000\004\032\010\001\002\000\004\005\011\001\002\000" +
    "\004\010\013\001\002\000\004\004\046\001\002\000\004" +
    "\031\014\001\002\000\004\012\015\001\002\000\032\014" +
    "\016\015\022\016\024\017\026\020\032\021\021\022\023" +
    "\023\031\024\025\025\020\026\027\027\030\001\002\000" +
    "\004\012\ufffa\001\002\000\004\012\033\001\002\000\004" +
    "\012\ufff1\001\002\000\004\012\ufff5\001\002\000\004\012" +
    "\ufff9\001\002\000\004\012\ufff4\001\002\000\004\012\ufff8" +
    "\001\002\000\004\012\ufff2\001\002\000\004\012\ufff7\001" +
    "\002\000\004\012\ufff0\001\002\000\004\012\uffef\001\002" +
    "\000\004\012\ufff3\001\002\000\004\012\ufff6\001\002\000" +
    "\004\031\034\001\002\000\004\013\035\001\002\000\004" +
    "\031\036\001\002\000\004\013\037\001\002\000\004\031" +
    "\040\001\002\000\004\013\041\001\002\000\004\031\042" +
    "\001\002\000\004\006\043\001\002\000\004\030\044\001" +
    "\002\000\004\011\045\001\002\000\004\004\ufffb\001\002" +
    "\000\004\006\047\001\002\000\004\031\050\001\002\000" +
    "\004\006\051\001\002\000\004\031\052\001\002\000\004" +
    "\007\053\001\002\000\004\032\ufffd\001\002\000\004\002" +
    "\uffff\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\012\002\003\004\006\005\005\006\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\006\005\053\006\004\001\001\000\002\001" +
    "\001\000\004\010\011\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public int getResult() {
	return action_obj.s.getNbSession();
}

public void syntax_error(Symbol cur_token){}
public void unrecovered_syntax_error(Symbol cur_token) throws Exception{
	throw new Exception("Erreur");	
}

/* pour transmettre le résultat*/
public long getTime(){
	return action_obj.ts.getTime();
 }
 

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCup$actions {

 

public String ip;

public Sessions s=new Sessions();

public Date ts;


  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // mois ::= DEC 
            {
              Integer RESULT =null;
		RESULT = new Integer(11);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // mois ::= NOV 
            {
              Integer RESULT =null;
		RESULT = new Integer(10);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // mois ::= OCT 
            {
              Integer RESULT =null;
		RESULT = new Integer(9);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // mois ::= SEP 
            {
              Integer RESULT =null;
		RESULT = new Integer(8);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // mois ::= AOU 
            {
              Integer RESULT =null;
		RESULT = new Integer(7);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // mois ::= JUIL 
            {
              Integer RESULT =null;
		RESULT = new Integer(6);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // mois ::= JUIN 
            {
              Integer RESULT =null;
		RESULT = new Integer(5);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // mois ::= MAI 
            {
              Integer RESULT =null;
		RESULT = new Integer(4);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // mois ::= AVR 
            {
              Integer RESULT =null;
		RESULT = new Integer(3);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // mois ::= MAR 
            {
              Integer RESULT =null;
		RESULT = new Integer(2);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // mois ::= FEV 
            {
              Integer RESULT =null;
		RESULT = new Integer(1);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // mois ::= JAN 
            {
              Integer RESULT =null;
		RESULT = new Integer(0);
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // timestamp ::= CO NUM SL mois SL NUM DP NUM DP NUM DP NUM SEPARATEUR DECAL CF 
            {
              Date RESULT =null;
		int jleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-13)).left;
		int jright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-13)).right;
		Integer j = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-13)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-11)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-11)).right;
		Integer m = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-11)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-9)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-9)).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-9)).value;
		int hleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-7)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-7)).right;
		Integer h = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-7)).value;
		int mnleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-5)).left;
		int mnright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-5)).right;
		Integer mn = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-5)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)).value;
		int ssleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Object ss = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int dclleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int dclright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Integer dcl = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		 RESULT = new Date(a.intValue(),m.intValue(),j.intValue(),h+(dcl/100),mn.intValue(),s.intValue());
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("timestamp",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-14)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // y ::= timestamp 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Date d = (Date)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		ts=d;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("y",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // e ::= IP TIRET timestamp ACTION SEPARATEUR NUM SEPARATEUR NUM END 
            {
              String RESULT =null;
		int ip2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)).left;
		int ip2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)).right;
		String ip2 = (String)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)).value;
		RESULT=new String(ip2); s.add(ip,ts); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // z ::= e 
            {
              Object RESULT =null;
		int eventleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int eventright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		String event = (String)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 ip=event;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("z",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // liste_e ::= z liste_e 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("liste_e",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // x ::= liste_e 
            {
              Object RESULT =null;
		
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("x",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= x EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

