/* The following code was generated by JFlex 1.3.5 on 5/3/21 19:44 */

package lex.generado; // paquete en el que se genera el fichero java
import lex.manual.SimbolosTerminales; //Simbolos terminales definidos
import lex.manual.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 5/3/21 19:44 from the specification file
 * <tt>file:/C:/Users/Erol/git/Practica_AnalizadorLexico_PL/lexer.jflex</tt>
 */
public class Lexer implements SimbolosTerminales {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\7\0\1\30"+
    "\1\31\1\24\1\27\1\25\1\7\1\5\1\23\1\10\1\21\1\22"+
    "\1\20\6\4\1\0\1\26\4\0\1\17\4\15\1\13\1\15\21\14"+
    "\1\11\2\14\6\0\4\16\1\6\25\16\1\0\1\12\uff83\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    26,    52,    26,    78,   104,   130,    26,   156,   182, 
      208,   234,   260,    26,    26,    26,    26,    26,    26,   286, 
      104,   312,   130,   338,   364,   390,   416,   442,   468,   494, 
      520,   546,   572,   598,   624,   416,   650,   676,   702,   546, 
      728,   754,   780,   806,   832,   858,   884,   910,   936,   962, 
      884,   988,  1014,   130,  1040,  1066,  1092,  1118,   130,   312, 
     1144,    26
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\2\3\12\1\7\1\2\1\13\2\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\34\0\1\4"+
    "\33\0\1\24\1\25\1\26\1\0\1\24\1\27\1\0"+
    "\1\26\3\27\1\30\3\24\13\0\1\31\3\0\1\31"+
    "\7\0\3\31\13\0\1\27\1\0\1\27\1\0\2\27"+
    "\1\0\4\27\1\30\3\27\13\0\1\32\1\25\1\26"+
    "\1\0\1\24\1\33\1\0\1\26\3\27\1\30\3\32"+
    "\13\0\1\27\1\0\1\12\1\0\2\27\1\0\3\27"+
    "\1\12\1\30\3\27\13\0\1\24\1\25\1\26\1\0"+
    "\1\32\1\27\1\0\1\26\3\27\1\30\1\24\1\32"+
    "\1\24\13\0\1\32\1\25\1\26\1\0\1\32\1\27"+
    "\1\0\1\26\3\27\1\30\3\32\32\0\1\34\1\35"+
    "\11\0\1\36\1\25\1\26\1\0\1\36\1\27\1\0"+
    "\1\26\3\27\1\30\3\36\13\0\1\37\1\0\1\27"+
    "\1\40\1\37\1\27\1\0\4\27\1\30\3\37\4\0"+
    "\1\40\6\0\1\41\1\0\1\41\1\0\2\41\1\0"+
    "\4\41\1\0\3\41\13\0\1\31\1\0\1\42\1\0"+
    "\1\31\2\0\1\42\4\0\3\31\13\0\1\36\1\25"+
    "\1\26\1\0\1\36\1\27\1\0\1\26\3\27\1\30"+
    "\3\36\1\43\12\0\1\44\1\0\1\27\1\0\1\44"+
    "\1\27\1\45\1\44\1\27\1\44\1\27\1\30\3\44"+
    "\7\0\1\34\1\3\1\4\27\34\24\35\1\46\5\35"+
    "\4\0\1\47\1\25\1\26\1\0\1\47\1\27\1\0"+
    "\1\26\3\27\1\30\3\47\13\0\1\37\1\0\1\27"+
    "\1\0\1\37\1\27\1\0\4\27\1\30\3\37\13\0"+
    "\1\50\3\0\1\50\7\0\3\50\13\0\1\41\1\51"+
    "\1\41\1\0\2\41\1\0\4\41\1\0\3\41\13\0"+
    "\1\50\2\0\1\40\1\50\7\0\3\50\4\0\1\40"+
    "\12\0\1\52\10\0\1\53\14\0\1\45\3\0\1\45"+
    "\1\0\2\45\1\0\1\45\2\0\3\45\7\0\23\35"+
    "\1\4\1\46\5\35\4\0\1\54\1\25\1\26\1\0"+
    "\1\54\1\55\1\0\1\56\2\55\1\27\1\30\3\54"+
    "\15\0\1\57\2\0\1\57\1\0\4\57\17\0\1\60"+
    "\13\0\3\60\17\0\1\60\10\0\2\60\13\0\1\61"+
    "\1\25\1\26\1\0\1\61\1\27\1\0\1\26\3\27"+
    "\1\30\3\61\13\0\1\27\1\0\1\27\1\0\1\27"+
    "\1\62\1\0\3\62\1\27\1\30\3\27\13\0\1\37"+
    "\1\0\1\27\1\40\1\37\1\62\1\0\3\62\1\27"+
    "\1\30\3\37\4\0\1\40\10\0\1\63\2\0\1\63"+
    "\1\0\4\63\36\0\1\64\12\0\1\65\1\25\1\26"+
    "\1\0\1\65\1\27\1\0\1\26\3\27\1\30\3\65"+
    "\13\0\1\27\1\0\1\27\1\0\1\27\1\66\1\0"+
    "\3\66\1\27\1\30\3\27\13\0\1\67\3\0\1\67"+
    "\7\0\3\67\13\0\1\70\1\25\1\26\1\0\1\70"+
    "\1\27\1\0\1\26\3\27\1\30\3\70\13\0\1\71"+
    "\3\0\1\71\7\0\3\71\13\0\1\72\1\25\1\26"+
    "\1\0\1\72\1\73\1\0\1\74\2\73\1\27\1\30"+
    "\3\72\13\0\1\75\3\0\1\75\7\0\3\75\13\0"+
    "\1\72\1\25\1\26\1\0\1\72\1\27\1\0\1\26"+
    "\3\27\1\30\3\72\13\0\1\76\3\0\1\76\7\0"+
    "\3\76\7\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  9,  1,  9,  1,  1,  1,  9,  1,  1,  1,  1,  1,  9,  9,  9, 
     9,  9,  9,  1,  0,  0,  0,  0,  1,  1,  0,  0,  0,  1,  1,  0, 
     0,  0,  0,  1,  1,  0,  1,  1,  0,  0,  0,  1,  0,  0,  0,  0, 
     1,  0,  1,  0,  1,  1,  0,  1,  0,  1,  1,  1,  0,  9
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[1170];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 78) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 13: 
          {  return new Symbol(por, yytext());  }
        case 63: break;
        case 16: 
          {  return new Symbol(mas, yytext());  }
        case 64: break;
        case 58: 
        case 59: 
          {  return new Symbol(dni, yytext()); }
        case 65: break;
        case 9: 
          {  return new Symbol(nombreApellido, yytext()); }
        case 66: break;
        case 53: 
          {  return new Symbol(matricula, yytext()); }
        case 67: break;
        case 61: 
          {  return new Symbol(fecha, yytext()); }
        case 68: break;
        case 14: 
          {  return new Symbol(coma, yytext());  }
        case 69: break;
        case 12: 
          {  return new Symbol(entre, yytext());  }
        case 70: break;
        case 7: 
          {  return new Symbol(menos, yytext());  }
        case 71: break;
        case 4: 
        case 8: 
        case 10: 
        case 11: 
        case 19: 
        case 25: 
        case 29: 
        case 38: 
        case 43: 
        case 48: 
        case 52: 
        case 55: 
        case 57: 
          {  return new Symbol(numero, yytext()); }
        case 72: break;
        case 50: 
          {  return new Symbol(email, yytext()); }
        case 73: break;
        case 1: 
        case 5: 
        case 6: 
          { System.err.println("warning: Unrecognized character '"
		 + yytext()+"' -- ignored" + " at : "+ (yyline+1) + " " +
		 (yycolumn+1) + " " + yychar);  }
        case 74: break;
        case 2: 
        case 3: 
          {   }
        case 75: break;
        case 24: 
        case 30: 
        case 39: 
          {  return new Symbol(numeroReal, yytext()); }
        case 76: break;
        case 35: 
        case 36: 
          {  return new Symbol(numeroHex, yytext()); }
        case 77: break;
        case 17: 
          {  return new Symbol(parentesisI, yytext());  }
        case 78: break;
        case 18: 
          {  return new Symbol(parentesisD, yytext());  }
        case 79: break;
        case 15: 
          {  return new Symbol(puntoYComa, yytext());  }
        case 80: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
              {  return new Symbol(EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
