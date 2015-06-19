/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.language.l.Multiplication#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.Multiplication#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.language.l.LPackage#getMultiplication()
 * @model
 * @generated
 */
public interface Multiplication extends ArithmeticTerm
{
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
   * @see net.certware.argument.language.l.LPackage#getMultiplication_Lhs()
   * @model containment="true"
   * @generated
   */
  ArithmeticTerm getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Multiplication#getLhs <em>Lhs</em>}' containment reference.
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
   * @see net.certware.argument.language.l.LPackage#getMultiplication_Rhs()
   * @model containment="true"
   * @generated
   */
  ArithmeticTerm getRhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Multiplication#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(ArithmeticTerm value);

} // Multiplication
