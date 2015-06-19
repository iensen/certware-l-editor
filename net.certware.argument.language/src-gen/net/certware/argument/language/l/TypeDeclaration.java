/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.language.l.TypeDeclaration#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.language.l.TypeDeclaration#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.language.l.LPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends Statement
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
   * @see net.certware.argument.language.l.LPackage#getTypeDeclaration_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.TypeDeclaration#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(SetExpression)
   * @see net.certware.argument.language.l.LPackage#getTypeDeclaration_Exp()
   * @model containment="true"
   * @generated
   */
  SetExpression getExp();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.TypeDeclaration#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(SetExpression value);

} // TypeDeclaration