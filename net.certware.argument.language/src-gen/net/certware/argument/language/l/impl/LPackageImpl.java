/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.Addition;
import net.certware.argument.language.l.AndSentence;
import net.certware.argument.language.l.ArithmeticLiteral;
import net.certware.argument.language.l.ArithmeticTerm;
import net.certware.argument.language.l.Atom;
import net.certware.argument.language.l.BasicTerm;
import net.certware.argument.language.l.BasicTerms;
import net.certware.argument.language.l.Bound;
import net.certware.argument.language.l.BuiltInAtom;
import net.certware.argument.language.l.CardinalityConstraint;
import net.certware.argument.language.l.ConstantDeclaration;
import net.certware.argument.language.l.FunctionalTerm;
import net.certware.argument.language.l.Head;
import net.certware.argument.language.l.LFactory;
import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.Limit;
import net.certware.argument.language.l.MaybeLiteral;
import net.certware.argument.language.l.Multiplication;
import net.certware.argument.language.l.NumericConstant;
import net.certware.argument.language.l.OrSentence;
import net.certware.argument.language.l.PredicateAtom;
import net.certware.argument.language.l.Program;
import net.certware.argument.language.l.QuantifiedTerm;
import net.certware.argument.language.l.Range;
import net.certware.argument.language.l.Rule;
import net.certware.argument.language.l.Sentence;
import net.certware.argument.language.l.SentenceExpr;
import net.certware.argument.language.l.SentenceLiteral;
import net.certware.argument.language.l.Set;
import net.certware.argument.language.l.SetAddition;
import net.certware.argument.language.l.SetConstruct;
import net.certware.argument.language.l.SetExpression;
import net.certware.argument.language.l.SetLiteral;
import net.certware.argument.language.l.SetMultiplication;
import net.certware.argument.language.l.Statement;
import net.certware.argument.language.l.TVar;
import net.certware.argument.language.l.TVars;
import net.certware.argument.language.l.Term;
import net.certware.argument.language.l.TypeDeclaration;
import net.certware.argument.language.l.TypedVariable;
import net.certware.argument.language.l.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LPackageImpl extends EPackageImpl implements LPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTermsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setConstructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tVarsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tVarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maybeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardinalityConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setAdditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setMultiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orSentenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andSentenceEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.certware.argument.language.l.LPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LPackageImpl()
  {
    super(eNS_URI, LFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LPackage init()
  {
    if (isInited) return (LPackage)EPackage.Registry.INSTANCE.getEPackage(LPackage.eNS_URI);

    // Obtain or create and register package
    LPackageImpl theLPackage = (LPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLPackage.createPackageContents();

    // Initialize created meta-data
    theLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LPackage.eNS_URI, theLPackage);
    return theLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Statements()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicTerm()
  {
    return basicTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericConstant()
  {
    return numericConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericConstant_Value()
  {
    return (EAttribute)numericConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Identifier()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedVariable()
  {
    return typedVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypedVariable_Type()
  {
    return (EAttribute)typedVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedVariable_Var()
  {
    return (EReference)typedVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArithmeticTerm()
  {
    return arithmeticTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArithmeticLiteral()
  {
    return arithmeticLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArithmeticLiteral_Identifier()
  {
    return (EAttribute)arithmeticLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArithmeticLiteral_Value()
  {
    return (EAttribute)arithmeticLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalTerm()
  {
    return functionalTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicTerms()
  {
    return basicTermsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicTerms_Car()
  {
    return (EReference)basicTermsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicTerms_Cdr()
  {
    return (EReference)basicTermsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDeclaration()
  {
    return constantDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantDeclaration_Id()
  {
    return (EAttribute)constantDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDeclaration_Cv()
  {
    return (EReference)constantDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDeclaration()
  {
    return typeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDeclaration_Id()
  {
    return (EAttribute)typeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_Exp()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimit()
  {
    return limitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimit_Cv()
  {
    return (EReference)limitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSet()
  {
    return setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSet_Lhs()
  {
    return (EAttribute)setEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSet_Terms()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRange()
  {
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRange_Lhs()
  {
    return (EReference)rangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRange_Rhs()
  {
    return (EReference)rangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetExpression()
  {
    return setExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetConstruct()
  {
    return setConstructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetConstruct_Lhs()
  {
    return (EReference)setConstructEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetConstruct_Rhs()
  {
    return (EReference)setConstructEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTVars()
  {
    return tVarsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTVars_Car()
  {
    return (EReference)tVarsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTVars_Cdr()
  {
    return (EReference)tVarsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTVar()
  {
    return tVarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetLiteral()
  {
    return setLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetLiteral_Value()
  {
    return (EAttribute)setLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedTerm()
  {
    return quantifiedTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateAtom()
  {
    return predicateAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredicateAtom_Fid()
  {
    return (EAttribute)predicateAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateAtom_Terms()
  {
    return (EReference)predicateAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInAtom()
  {
    return builtInAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInAtom_Lhs()
  {
    return (EReference)builtInAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuiltInAtom_Op()
  {
    return (EAttribute)builtInAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInAtom_Rhs()
  {
    return (EReference)builtInAtomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSentence()
  {
    return sentenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSentenceExpr()
  {
    return sentenceExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSentenceLiteral()
  {
    return sentenceLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaybeLiteral()
  {
    return maybeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCardinalityConstraint()
  {
    return cardinalityConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCardinalityConstraint_Lhs()
  {
    return (EReference)cardinalityConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardinalityConstraint_Id()
  {
    return (EAttribute)cardinalityConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCardinalityConstraint_Terms()
  {
    return (EReference)cardinalityConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCardinalityConstraint_Rhs()
  {
    return (EReference)cardinalityConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBound()
  {
    return boundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBound_Av()
  {
    return (EReference)boundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Head()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Body()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHead()
  {
    return headEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddition()
  {
    return additionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddition_Lhs()
  {
    return (EReference)additionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddition_Rhs()
  {
    return (EReference)additionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplication()
  {
    return multiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_Lhs()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_Rhs()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetAddition()
  {
    return setAdditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetAddition_Left()
  {
    return (EReference)setAdditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetAddition_Right()
  {
    return (EReference)setAdditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetMultiplication()
  {
    return setMultiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetMultiplication_Left()
  {
    return (EReference)setMultiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetMultiplication_Right()
  {
    return (EReference)setMultiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrSentence()
  {
    return orSentenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrSentence_Left()
  {
    return (EReference)orSentenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrSentence_Right()
  {
    return (EReference)orSentenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndSentence()
  {
    return andSentenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndSentence_Left()
  {
    return (EReference)andSentenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndSentence_Right()
  {
    return (EReference)andSentenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFactory getLFactory()
  {
    return (LFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__STATEMENTS);

    basicTermEClass = createEClass(BASIC_TERM);

    numericConstantEClass = createEClass(NUMERIC_CONSTANT);
    createEAttribute(numericConstantEClass, NUMERIC_CONSTANT__VALUE);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__IDENTIFIER);

    typedVariableEClass = createEClass(TYPED_VARIABLE);
    createEAttribute(typedVariableEClass, TYPED_VARIABLE__TYPE);
    createEReference(typedVariableEClass, TYPED_VARIABLE__VAR);

    arithmeticTermEClass = createEClass(ARITHMETIC_TERM);

    arithmeticLiteralEClass = createEClass(ARITHMETIC_LITERAL);
    createEAttribute(arithmeticLiteralEClass, ARITHMETIC_LITERAL__IDENTIFIER);
    createEAttribute(arithmeticLiteralEClass, ARITHMETIC_LITERAL__VALUE);

    functionalTermEClass = createEClass(FUNCTIONAL_TERM);

    basicTermsEClass = createEClass(BASIC_TERMS);
    createEReference(basicTermsEClass, BASIC_TERMS__CAR);
    createEReference(basicTermsEClass, BASIC_TERMS__CDR);

    constantDeclarationEClass = createEClass(CONSTANT_DECLARATION);
    createEAttribute(constantDeclarationEClass, CONSTANT_DECLARATION__ID);
    createEReference(constantDeclarationEClass, CONSTANT_DECLARATION__CV);

    typeDeclarationEClass = createEClass(TYPE_DECLARATION);
    createEAttribute(typeDeclarationEClass, TYPE_DECLARATION__ID);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__EXP);

    limitEClass = createEClass(LIMIT);
    createEReference(limitEClass, LIMIT__CV);

    setEClass = createEClass(SET);
    createEAttribute(setEClass, SET__LHS);
    createEReference(setEClass, SET__TERMS);

    rangeEClass = createEClass(RANGE);
    createEReference(rangeEClass, RANGE__LHS);
    createEReference(rangeEClass, RANGE__RHS);

    setExpressionEClass = createEClass(SET_EXPRESSION);

    setConstructEClass = createEClass(SET_CONSTRUCT);
    createEReference(setConstructEClass, SET_CONSTRUCT__LHS);
    createEReference(setConstructEClass, SET_CONSTRUCT__RHS);

    tVarsEClass = createEClass(TVARS);
    createEReference(tVarsEClass, TVARS__CAR);
    createEReference(tVarsEClass, TVARS__CDR);

    tVarEClass = createEClass(TVAR);

    setLiteralEClass = createEClass(SET_LITERAL);
    createEAttribute(setLiteralEClass, SET_LITERAL__VALUE);

    quantifiedTermEClass = createEClass(QUANTIFIED_TERM);

    termEClass = createEClass(TERM);

    atomEClass = createEClass(ATOM);

    predicateAtomEClass = createEClass(PREDICATE_ATOM);
    createEAttribute(predicateAtomEClass, PREDICATE_ATOM__FID);
    createEReference(predicateAtomEClass, PREDICATE_ATOM__TERMS);

    builtInAtomEClass = createEClass(BUILT_IN_ATOM);
    createEReference(builtInAtomEClass, BUILT_IN_ATOM__LHS);
    createEAttribute(builtInAtomEClass, BUILT_IN_ATOM__OP);
    createEReference(builtInAtomEClass, BUILT_IN_ATOM__RHS);

    sentenceEClass = createEClass(SENTENCE);

    sentenceExprEClass = createEClass(SENTENCE_EXPR);

    sentenceLiteralEClass = createEClass(SENTENCE_LITERAL);

    maybeLiteralEClass = createEClass(MAYBE_LITERAL);

    cardinalityConstraintEClass = createEClass(CARDINALITY_CONSTRAINT);
    createEReference(cardinalityConstraintEClass, CARDINALITY_CONSTRAINT__LHS);
    createEAttribute(cardinalityConstraintEClass, CARDINALITY_CONSTRAINT__ID);
    createEReference(cardinalityConstraintEClass, CARDINALITY_CONSTRAINT__TERMS);
    createEReference(cardinalityConstraintEClass, CARDINALITY_CONSTRAINT__RHS);

    boundEClass = createEClass(BOUND);
    createEReference(boundEClass, BOUND__AV);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__HEAD);
    createEReference(ruleEClass, RULE__BODY);

    headEClass = createEClass(HEAD);

    statementEClass = createEClass(STATEMENT);

    additionEClass = createEClass(ADDITION);
    createEReference(additionEClass, ADDITION__LHS);
    createEReference(additionEClass, ADDITION__RHS);

    multiplicationEClass = createEClass(MULTIPLICATION);
    createEReference(multiplicationEClass, MULTIPLICATION__LHS);
    createEReference(multiplicationEClass, MULTIPLICATION__RHS);

    setAdditionEClass = createEClass(SET_ADDITION);
    createEReference(setAdditionEClass, SET_ADDITION__LEFT);
    createEReference(setAdditionEClass, SET_ADDITION__RIGHT);

    setMultiplicationEClass = createEClass(SET_MULTIPLICATION);
    createEReference(setMultiplicationEClass, SET_MULTIPLICATION__LEFT);
    createEReference(setMultiplicationEClass, SET_MULTIPLICATION__RIGHT);

    orSentenceEClass = createEClass(OR_SENTENCE);
    createEReference(orSentenceEClass, OR_SENTENCE__LEFT);
    createEReference(orSentenceEClass, OR_SENTENCE__RIGHT);

    andSentenceEClass = createEClass(AND_SENTENCE);
    createEReference(andSentenceEClass, AND_SENTENCE__LEFT);
    createEReference(andSentenceEClass, AND_SENTENCE__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    basicTermEClass.getESuperTypes().add(this.getTerm());
    variableEClass.getESuperTypes().add(this.getTVar());
    variableEClass.getESuperTypes().add(this.getQuantifiedTerm());
    typedVariableEClass.getESuperTypes().add(this.getBasicTerm());
    arithmeticTermEClass.getESuperTypes().add(this.getBasicTerm());
    arithmeticLiteralEClass.getESuperTypes().add(this.getArithmeticTerm());
    functionalTermEClass.getESuperTypes().add(this.getBasicTerm());
    basicTermsEClass.getESuperTypes().add(this.getFunctionalTerm());
    basicTermsEClass.getESuperTypes().add(this.getMaybeLiteral());
    constantDeclarationEClass.getESuperTypes().add(this.getStatement());
    typeDeclarationEClass.getESuperTypes().add(this.getStatement());
    setLiteralEClass.getESuperTypes().add(this.getSetExpression());
    quantifiedTermEClass.getESuperTypes().add(this.getTerm());
    predicateAtomEClass.getESuperTypes().add(this.getAtom());
    predicateAtomEClass.getESuperTypes().add(this.getSentenceLiteral());
    builtInAtomEClass.getESuperTypes().add(this.getAtom());
    sentenceExprEClass.getESuperTypes().add(this.getSentence());
    sentenceLiteralEClass.getESuperTypes().add(this.getSentenceExpr());
    maybeLiteralEClass.getESuperTypes().add(this.getHead());
    cardinalityConstraintEClass.getESuperTypes().add(this.getHead());
    ruleEClass.getESuperTypes().add(this.getStatement());
    additionEClass.getESuperTypes().add(this.getArithmeticTerm());
    multiplicationEClass.getESuperTypes().add(this.getArithmeticTerm());
    setAdditionEClass.getESuperTypes().add(this.getSetExpression());
    setMultiplicationEClass.getESuperTypes().add(this.getSetExpression());
    orSentenceEClass.getESuperTypes().add(this.getSentenceExpr());
    andSentenceEClass.getESuperTypes().add(this.getSentenceExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Statements(), this.getStatement(), null, "statements", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicTermEClass, BasicTerm.class, "BasicTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numericConstantEClass, NumericConstant.class, "NumericConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, NumericConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedVariableEClass, TypedVariable.class, "TypedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypedVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, TypedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypedVariable_Var(), this.getVariable(), null, "var", null, 0, 1, TypedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arithmeticTermEClass, ArithmeticTerm.class, "ArithmeticTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arithmeticLiteralEClass, ArithmeticLiteral.class, "ArithmeticLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArithmeticLiteral_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ArithmeticLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArithmeticLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ArithmeticLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionalTermEClass, FunctionalTerm.class, "FunctionalTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicTermsEClass, BasicTerms.class, "BasicTerms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicTerms_Car(), this.getBasicTerm(), null, "car", null, 0, 1, BasicTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicTerms_Cdr(), this.getBasicTerm(), null, "cdr", null, 0, -1, BasicTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDeclarationEClass, ConstantDeclaration.class, "ConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantDeclaration_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantDeclaration_Cv(), this.getArithmeticTerm(), null, "cv", null, 0, 1, ConstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDeclaration_Id(), ecorePackage.getEString(), "id", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDeclaration_Exp(), this.getSetExpression(), null, "exp", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(limitEClass, Limit.class, "Limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLimit_Cv(), this.getArithmeticTerm(), null, "cv", null, 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSet_Lhs(), ecorePackage.getEString(), "lhs", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSet_Terms(), this.getBasicTerms(), null, "terms", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRange_Lhs(), this.getLimit(), null, "lhs", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRange_Rhs(), this.getLimit(), null, "rhs", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setExpressionEClass, SetExpression.class, "SetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setConstructEClass, SetConstruct.class, "SetConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetConstruct_Lhs(), this.getBasicTerm(), null, "lhs", null, 0, 1, SetConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetConstruct_Rhs(), this.getTVars(), null, "rhs", null, 0, 1, SetConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tVarsEClass, TVars.class, "TVars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTVars_Car(), this.getTVar(), null, "car", null, 0, 1, TVars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTVars_Cdr(), this.getTVar(), null, "cdr", null, 0, -1, TVars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tVarEClass, TVar.class, "TVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantifiedTermEClass, QuantifiedTerm.class, "QuantifiedTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(predicateAtomEClass, PredicateAtom.class, "PredicateAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPredicateAtom_Fid(), ecorePackage.getEString(), "fid", null, 0, 1, PredicateAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateAtom_Terms(), this.getBasicTerms(), null, "terms", null, 0, 1, PredicateAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(builtInAtomEClass, BuiltInAtom.class, "BuiltInAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuiltInAtom_Lhs(), this.getBasicTerm(), null, "lhs", null, 0, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuiltInAtom_Op(), ecorePackage.getEString(), "op", null, 0, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInAtom_Rhs(), this.getBasicTerm(), null, "rhs", null, 0, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sentenceExprEClass, SentenceExpr.class, "SentenceExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sentenceLiteralEClass, SentenceLiteral.class, "SentenceLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maybeLiteralEClass, MaybeLiteral.class, "MaybeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cardinalityConstraintEClass, CardinalityConstraint.class, "CardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCardinalityConstraint_Lhs(), this.getBound(), null, "lhs", null, 0, 1, CardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCardinalityConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, CardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCardinalityConstraint_Terms(), this.getBasicTerms(), null, "terms", null, 0, 1, CardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCardinalityConstraint_Rhs(), this.getBound(), null, "rhs", null, 0, 1, CardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boundEClass, Bound.class, "Bound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBound_Av(), this.getArithmeticTerm(), null, "av", null, 0, 1, Bound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_Head(), this.getHead(), null, "head", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Body(), this.getSentence(), null, "body", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAddition_Lhs(), this.getArithmeticTerm(), null, "lhs", null, 0, 1, Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddition_Rhs(), this.getArithmeticTerm(), null, "rhs", null, 0, 1, Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplication_Lhs(), this.getArithmeticTerm(), null, "lhs", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplication_Rhs(), this.getArithmeticTerm(), null, "rhs", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setAdditionEClass, SetAddition.class, "SetAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetAddition_Left(), this.getSetExpression(), null, "left", null, 0, 1, SetAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetAddition_Right(), this.getSetExpression(), null, "right", null, 0, 1, SetAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setMultiplicationEClass, SetMultiplication.class, "SetMultiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetMultiplication_Left(), this.getSetExpression(), null, "left", null, 0, 1, SetMultiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetMultiplication_Right(), this.getSetExpression(), null, "right", null, 0, 1, SetMultiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orSentenceEClass, OrSentence.class, "OrSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrSentence_Left(), this.getSentenceExpr(), null, "left", null, 0, 1, OrSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrSentence_Right(), this.getSentenceExpr(), null, "right", null, 0, 1, OrSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andSentenceEClass, AndSentence.class, "AndSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndSentence_Left(), this.getSentenceExpr(), null, "left", null, 0, 1, AndSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndSentence_Right(), this.getSentenceExpr(), null, "right", null, 0, 1, AndSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LPackageImpl
