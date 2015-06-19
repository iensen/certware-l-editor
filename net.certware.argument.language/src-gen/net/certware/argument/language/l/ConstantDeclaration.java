/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.language.l.ConstantDeclaration#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ConstantDeclaration#getCv <em>Cv</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.language.l.LPackage#getConstantDeclaration()
 * @model
 * @generated
 */
public interface ConstantDeclaration extends Statement
{
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
   * @see net.certware.argument.language.l.LPackage#getConstantDeclaration_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ConstantDeclaration#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Cv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cv</em>' containment reference.
   * @see #setCv(ArithmeticTerm)
   * @see net.certware.argument.language.l.LPackage#getConstantDeclaration_Cv()
   * @model containment="true"
   * @generated
   */
  ArithmeticTerm getCv();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ConstantDeclaration#getCv <em>Cv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cv</em>' containment reference.
   * @see #getCv()
   * @generated
   */
  void setCv(ArithmeticTerm value);

} // ConstantDeclaration
