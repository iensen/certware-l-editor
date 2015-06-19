/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LFactoryImpl extends EFactoryImpl implements LFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LFactory init()
  {
    try
    {
      LFactory theLFactory = (LFactory)EPackage.Registry.INSTANCE.getEFactory(LPackage.eNS_URI);
      if (theLFactory != null)
      {
        return theLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LPackage.PROGRAM: return createProgram();
      case LPackage.BASIC_TERM: return createBasicTerm();
      case LPackage.NUMERIC_CONSTANT: return createNumericConstant();
      case LPackage.VARIABLE: return createVariable();
      case LPackage.TYPED_VARIABLE: return createTypedVariable();
      case LPackage.ARITHMETIC_TERM: return createArithmeticTerm();
      case LPackage.ARITHMETIC_LITERAL: return createArithmeticLiteral();
      case LPackage.FUNCTIONAL_TERM: return createFunctionalTerm();
      case LPackage.BASIC_TERMS: return createBasicTerms();
      case LPackage.CONSTANT_DECLARATION: return createConstantDeclaration();
      case LPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case LPackage.LIMIT: return createLimit();
      case LPackage.SET: return createSet();
      case LPackage.RANGE: return createRange();
      case LPackage.SET_EXPRESSION: return createSetExpression();
      case LPackage.SET_CONSTRUCT: return createSetConstruct();
      case LPackage.TVARS: return createTVars();
      case LPackage.TVAR: return createTVar();
      case LPackage.SET_LITERAL: return createSetLiteral();
      case LPackage.QUANTIFIED_TERM: return createQuantifiedTerm();
      case LPackage.TERM: return createTerm();
      case LPackage.ATOM: return createAtom();
      case LPackage.PREDICATE_ATOM: return createPredicateAtom();
      case LPackage.BUILT_IN_ATOM: return createBuiltInAtom();
      case LPackage.SENTENCE: return createSentence();
      case LPackage.SENTENCE_EXPR: return createSentenceExpr();
      case LPackage.SENTENCE_LITERAL: return createSentenceLiteral();
      case LPackage.MAYBE_LITERAL: return createMaybeLiteral();
      case LPackage.CARDINALITY_CONSTRAINT: return createCardinalityConstraint();
      case LPackage.BOUND: return createBound();
      case LPackage.RULE: return createRule();
      case LPackage.HEAD: return createHead();
      case LPackage.STATEMENT: return createStatement();
      case LPackage.ADDITION: return createAddition();
      case LPackage.MULTIPLICATION: return createMultiplication();
      case LPackage.SET_ADDITION: return createSetAddition();
      case LPackage.SET_MULTIPLICATION: return createSetMultiplication();
      case LPackage.OR_SENTENCE: return createOrSentence();
      case LPackage.AND_SENTENCE: return createAndSentence();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicTerm createBasicTerm()
  {
    BasicTermImpl basicTerm = new BasicTermImpl();
    return basicTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericConstant createNumericConstant()
  {
    NumericConstantImpl numericConstant = new NumericConstantImpl();
    return numericConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedVariable createTypedVariable()
  {
    TypedVariableImpl typedVariable = new TypedVariableImpl();
    return typedVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticTerm createArithmeticTerm()
  {
    ArithmeticTermImpl arithmeticTerm = new ArithmeticTermImpl();
    return arithmeticTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticLiteral createArithmeticLiteral()
  {
    ArithmeticLiteralImpl arithmeticLiteral = new ArithmeticLiteralImpl();
    return arithmeticLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalTerm createFunctionalTerm()
  {
    FunctionalTermImpl functionalTerm = new FunctionalTermImpl();
    return functionalTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicTerms createBasicTerms()
  {
    BasicTermsImpl basicTerms = new BasicTermsImpl();
    return basicTerms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDeclaration createConstantDeclaration()
  {
    ConstantDeclarationImpl constantDeclaration = new ConstantDeclarationImpl();
    return constantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit createLimit()
  {
    LimitImpl limit = new LimitImpl();
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetExpression createSetExpression()
  {
    SetExpressionImpl setExpression = new SetExpressionImpl();
    return setExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetConstruct createSetConstruct()
  {
    SetConstructImpl setConstruct = new SetConstructImpl();
    return setConstruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TVars createTVars()
  {
    TVarsImpl tVars = new TVarsImpl();
    return tVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TVar createTVar()
  {
    TVarImpl tVar = new TVarImpl();
    return tVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetLiteral createSetLiteral()
  {
    SetLiteralImpl setLiteral = new SetLiteralImpl();
    return setLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedTerm createQuantifiedTerm()
  {
    QuantifiedTermImpl quantifiedTerm = new QuantifiedTermImpl();
    return quantifiedTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateAtom createPredicateAtom()
  {
    PredicateAtomImpl predicateAtom = new PredicateAtomImpl();
    return predicateAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInAtom createBuiltInAtom()
  {
    BuiltInAtomImpl builtInAtom = new BuiltInAtomImpl();
    return builtInAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sentence createSentence()
  {
    SentenceImpl sentence = new SentenceImpl();
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SentenceExpr createSentenceExpr()
  {
    SentenceExprImpl sentenceExpr = new SentenceExprImpl();
    return sentenceExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SentenceLiteral createSentenceLiteral()
  {
    SentenceLiteralImpl sentenceLiteral = new SentenceLiteralImpl();
    return sentenceLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaybeLiteral createMaybeLiteral()
  {
    MaybeLiteralImpl maybeLiteral = new MaybeLiteralImpl();
    return maybeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardinalityConstraint createCardinalityConstraint()
  {
    CardinalityConstraintImpl cardinalityConstraint = new CardinalityConstraintImpl();
    return cardinalityConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bound createBound()
  {
    BoundImpl bound = new BoundImpl();
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetAddition createSetAddition()
  {
    SetAdditionImpl setAddition = new SetAdditionImpl();
    return setAddition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetMultiplication createSetMultiplication()
  {
    SetMultiplicationImpl setMultiplication = new SetMultiplicationImpl();
    return setMultiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrSentence createOrSentence()
  {
    OrSentenceImpl orSentence = new OrSentenceImpl();
    return orSentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndSentence createAndSentence()
  {
    AndSentenceImpl andSentence = new AndSentenceImpl();
    return andSentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LPackage getLPackage()
  {
    return (LPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LPackage getPackage()
  {
    return LPackage.eINSTANCE;
  }

} //LFactoryImpl