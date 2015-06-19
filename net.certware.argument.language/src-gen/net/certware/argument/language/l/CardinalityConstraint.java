/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.language.l.CardinalityConstraint#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.CardinalityConstraint#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.language.l.CardinalityConstraint#getTerms <em>Terms</em>}</li>
 *   <li>{@link net.certware.argument.language.l.CardinalityConstraint#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint()
 * @model
 * @generated
 */
public interface CardinalityConstraint extends Head
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
   * @see #setLhs(Bound)
   * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint_Lhs()
   * @model containment="true"
   * @generated
   */
  Bound getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.CardinalityConstraint#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Bound value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.CardinalityConstraint#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference.
   * @see #setTerms(BasicTerms)
   * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint_Terms()
   * @model containment="true"
   * @generated
   */
  BasicTerms getTerms();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.CardinalityConstraint#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(BasicTerms value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Bound)
   * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint_Rhs()
   * @model containment="true"
   * @generated
   */
  Bound getRhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.CardinalityConstraint#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Bound value);

} // CardinalityConstraint
