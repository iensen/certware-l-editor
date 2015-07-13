/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.language.l.ArithmeticTerm#getMinus <em>Minus</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ArithmeticTerm#getTerm <em>Term</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ArithmeticTerm#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ArithmeticTerm#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.language.l.LPackage#getArithmeticTerm()
 * @model
 * @generated
 */
public interface ArithmeticTerm extends BasicTerm, GroundArithmeticTerm
{
  /**
   * Returns the value of the '<em><b>Minus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minus</em>' attribute.
   * @see #setMinus(String)
   * @see net.certware.argument.language.l.LPackage#getArithmeticTerm_Minus()
   * @model
   * @generated
   */
  String getMinus();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticTerm#getMinus <em>Minus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minus</em>' attribute.
   * @see #getMinus()
   * @generated
   */
  void setMinus(String value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(EObject)
   * @see net.certware.argument.language.l.LPackage#getArithmeticTerm_Term()
   * @model containment="true"
   * @generated
   */
  EObject getTerm();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticTerm#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(EObject value);

  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(ArithmeticTerm)
   * @see net.certware.argument.language.l.LPackage#getArithmeticTerm_Lhs()
   * @model containment="true"
   * @generated
   */
  ArithmeticTerm getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticTerm#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(ArithmeticTerm value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(ArithmeticTerm)
   * @see net.certware.argument.language.l.LPackage#getArithmeticTerm_Rhs()
   * @model containment="true"
   * @generated
   */
  ArithmeticTerm getRhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticTerm#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(ArithmeticTerm value);

} // ArithmeticTerm
