

/* First created by JCasGen Fri Jan 03 13:40:16 CST 2014 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Differentiates a token as being a symbol rather than a
				punctuation, contraction, newline, word, or number.
				Equivalent to
				cTAKES: edu.mayo.bmi.uima.core.type.SymbolToken
 * Updated by JCasGen Fri Jan 03 13:40:16 CST 2014
 * XML source: C:/WKT/git/schorndorfer/uima-components/annotator-parent/type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class SymbolToken extends BaseToken {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SymbolToken.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SymbolToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SymbolToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SymbolToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SymbolToken(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    