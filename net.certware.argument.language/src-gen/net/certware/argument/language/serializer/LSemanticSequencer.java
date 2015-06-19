package net.certware.argument.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.argument.language.l.Addition;
import net.certware.argument.language.l.AndSentence;
import net.certware.argument.language.l.ArithmeticLiteral;
import net.certware.argument.language.l.BasicTerms;
import net.certware.argument.language.l.Bound;
import net.certware.argument.language.l.BuiltInAtom;
import net.certware.argument.language.l.CardinalityConstraint;
import net.certware.argument.language.l.ConstantDeclaration;
import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.Limit;
import net.certware.argument.language.l.Multiplication;
import net.certware.argument.language.l.NumericConstant;
import net.certware.argument.language.l.OrSentence;
import net.certware.argument.language.l.PredicateAtom;
import net.certware.argument.language.l.Program;
import net.certware.argument.language.l.Range;
import net.certware.argument.language.l.Rule;
import net.certware.argument.language.l.Set;
import net.certware.argument.language.l.SetAddition;
import net.certware.argument.language.l.SetConstruct;
import net.certware.argument.language.l.SetLiteral;
import net.certware.argument.language.l.SetMultiplication;
import net.certware.argument.language.l.TVars;
import net.certware.argument.language.l.TypeDeclaration;
import net.certware.argument.language.l.TypedVariable;
import net.certware.argument.language.l.Variable;
import net.certware.argument.language.services.LGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LPackage.ADDITION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0() ||
				   context == grammarAccess.getArithmeticTermRule() ||
				   context == grammarAccess.getBasicTermRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Addition(context, (Addition) semanticObject); 
					return; 
				}
				else break;
			case LPackage.AND_SENTENCE:
				if(context == grammarAccess.getAndSentenceRule() ||
				   context == grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getNotSentenceRule() ||
				   context == grammarAccess.getOrSentenceRule() ||
				   context == grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPrimarySentenceRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_AndSentence(context, (AndSentence) semanticObject); 
					return; 
				}
				else break;
			case LPackage.ARITHMETIC_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0() ||
				   context == grammarAccess.getArithmeticLiteralRule() ||
				   context == grammarAccess.getArithmeticTermRule() ||
				   context == grammarAccess.getBasicTermRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_ArithmeticLiteral(context, (ArithmeticLiteral) semanticObject); 
					return; 
				}
				else break;
			case LPackage.BASIC_TERMS:
				if(context == grammarAccess.getBasicTermRule() ||
				   context == grammarAccess.getBasicTermsRule() ||
				   context == grammarAccess.getFunctionalTermRule() ||
				   context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getMaybeLiteralRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_BasicTerms(context, (BasicTerms) semanticObject); 
					return; 
				}
				else break;
			case LPackage.BOUND:
				if(context == grammarAccess.getBoundRule()) {
					sequence_Bound(context, (Bound) semanticObject); 
					return; 
				}
				else break;
			case LPackage.BUILT_IN_ATOM:
				if(context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBuiltInAtomRule()) {
					sequence_BuiltInAtom(context, (BuiltInAtom) semanticObject); 
					return; 
				}
				else break;
			case LPackage.CARDINALITY_CONSTRAINT:
				if(context == grammarAccess.getCardinalityConstraintRule() ||
				   context == grammarAccess.getHeadRule()) {
					sequence_CardinalityConstraint(context, (CardinalityConstraint) semanticObject); 
					return; 
				}
				else break;
			case LPackage.CONSTANT_DECLARATION:
				if(context == grammarAccess.getConstantDeclarationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ConstantDeclaration(context, (ConstantDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LPackage.LIMIT:
				if(context == grammarAccess.getLimitRule()) {
					sequence_Limit(context, (Limit) semanticObject); 
					return; 
				}
				else break;
			case LPackage.MULTIPLICATION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0() ||
				   context == grammarAccess.getArithmeticTermRule() ||
				   context == grammarAccess.getBasicTermRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Multiplication(context, (Multiplication) semanticObject); 
					return; 
				}
				else break;
			case LPackage.NUMERIC_CONSTANT:
				if(context == grammarAccess.getNumericConstantRule()) {
					sequence_NumericConstant(context, (NumericConstant) semanticObject); 
					return; 
				}
				else break;
			case LPackage.OR_SENTENCE:
				if(context == grammarAccess.getAndSentenceRule() ||
				   context == grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getNotSentenceRule() ||
				   context == grammarAccess.getOrSentenceRule() ||
				   context == grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPrimarySentenceRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_OrSentence(context, (OrSentence) semanticObject); 
					return; 
				}
				else break;
			case LPackage.PREDICATE_ATOM:
				if(context == grammarAccess.getAndSentenceRule() ||
				   context == grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getNotSentenceRule() ||
				   context == grammarAccess.getOrSentenceRule() ||
				   context == grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAtomRule() ||
				   context == grammarAccess.getPrimarySentenceRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getSentenceLiteralRule()) {
					sequence_PredicateAtom(context, (PredicateAtom) semanticObject); 
					return; 
				}
				else break;
			case LPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case LPackage.RANGE:
				if(context == grammarAccess.getRangeRule()) {
					sequence_Range(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case LPackage.RULE:
				if(context == grammarAccess.getRuleRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case LPackage.SET:
				if(context == grammarAccess.getSetRule()) {
					sequence_Set(context, (Set) semanticObject); 
					return; 
				}
				else break;
			case LPackage.SET_ADDITION:
				if(context == grammarAccess.getSetAdditionRule() ||
				   context == grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0() ||
				   context == grammarAccess.getSetExpressionRule() ||
				   context == grammarAccess.getSetMultiplicationRule() ||
				   context == grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getSetPrimaryRule()) {
					sequence_SetAddition(context, (SetAddition) semanticObject); 
					return; 
				}
				else break;
			case LPackage.SET_CONSTRUCT:
				if(context == grammarAccess.getSetConstructRule()) {
					sequence_SetConstruct(context, (SetConstruct) semanticObject); 
					return; 
				}
				else break;
			case LPackage.SET_LITERAL:
				if(context == grammarAccess.getSetAdditionRule() ||
				   context == grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0() ||
				   context == grammarAccess.getSetExpressionRule() ||
				   context == grammarAccess.getSetLiteralRule() ||
				   context == grammarAccess.getSetMultiplicationRule() ||
				   context == grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getSetPrimaryRule()) {
					sequence_SetLiteral(context, (SetLiteral) semanticObject); 
					return; 
				}
				else break;
			case LPackage.SET_MULTIPLICATION:
				if(context == grammarAccess.getSetAdditionRule() ||
				   context == grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0() ||
				   context == grammarAccess.getSetExpressionRule() ||
				   context == grammarAccess.getSetMultiplicationRule() ||
				   context == grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getSetPrimaryRule()) {
					sequence_SetMultiplication(context, (SetMultiplication) semanticObject); 
					return; 
				}
				else break;
			case LPackage.TVARS:
				if(context == grammarAccess.getTVarsRule()) {
					sequence_TVars(context, (TVars) semanticObject); 
					return; 
				}
				else break;
			case LPackage.TYPE_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTypeDeclarationRule()) {
					sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LPackage.TYPED_VARIABLE:
				if(context == grammarAccess.getBasicTermRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTypedVariableRule()) {
					sequence_TypedVariable(context, (TypedVariable) semanticObject); 
					return; 
				}
				else break;
			case LPackage.VARIABLE:
				if(context == grammarAccess.getQuantifiedTermRule() ||
				   context == grammarAccess.getTVarRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (lhs=Addition_Addition_1_0 rhs=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Addition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.ADDITION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.ADDITION__LHS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.ADDITION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.ADDITION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndSentence_AndSentence_1_0 right=NotSentence)
	 */
	protected void sequence_AndSentence(EObject context, AndSentence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.AND_SENTENCE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.AND_SENTENCE__LEFT));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.AND_SENTENCE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.AND_SENTENCE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndSentenceAccess().getRightNotSentenceParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=ID | value=INT)
	 */
	protected void sequence_ArithmeticLiteral(EObject context, ArithmeticLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (car=BasicTerm cdr+=BasicTerm*)
	 */
	protected void sequence_BasicTerms(EObject context, BasicTerms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     av=ArithmeticTerm
	 */
	protected void sequence_Bound(EObject context, Bound semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.BOUND__AV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.BOUND__AV));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0(), semanticObject.getAv());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=BasicTerm op=AtomOp rhs=BasicTerm)
	 */
	protected void sequence_BuiltInAtom(EObject context, BuiltInAtom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.BUILT_IN_ATOM__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.BUILT_IN_ATOM__LHS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.BUILT_IN_ATOM__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.BUILT_IN_ATOM__OP));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.BUILT_IN_ATOM__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.BUILT_IN_ATOM__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Bound id=ID terms=BasicTerms rhs=Bound)
	 */
	protected void sequence_CardinalityConstraint(EObject context, CardinalityConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__LHS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__ID));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__TERMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__TERMS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getCardinalityConstraintAccess().getIdIDTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getCardinalityConstraintAccess().getTermsBasicTermsParserRuleCall_6_0(), semanticObject.getTerms());
		feeder.accept(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_11_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=LID cv=ArithmeticTerm)
	 */
	protected void sequence_ConstantDeclaration(EObject context, ConstantDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__ID));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__CV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__CV));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantDeclarationAccess().getIdLIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getConstantDeclarationAccess().getCvArithmeticTermParserRuleCall_2_0(), semanticObject.getCv());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     cv=ArithmeticTerm
	 */
	protected void sequence_Limit(EObject context, Limit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.LIMIT__CV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.LIMIT__CV));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLimitAccess().getCvArithmeticTermParserRuleCall_0(), semanticObject.getCv());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Multiplication_Multiplication_1_0 rhs=Primary)
	 */
	protected void sequence_Multiplication(EObject context, Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.MULTIPLICATION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.MULTIPLICATION__LHS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.MULTIPLICATION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.MULTIPLICATION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_NumericConstant(EObject context, NumericConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.NUMERIC_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.NUMERIC_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumericConstantAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrSentence_OrSentence_1_0 right=AndSentence)
	 */
	protected void sequence_OrSentence(EObject context, OrSentence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.OR_SENTENCE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.OR_SENTENCE__LEFT));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.OR_SENTENCE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.OR_SENTENCE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fid=ID terms=BasicTerms?)
	 */
	protected void sequence_PredicateAtom(EObject context, PredicateAtom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Limit rhs=Limit)
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.RANGE__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.RANGE__LHS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.RANGE__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.RANGE__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeAccess().getLhsLimitParserRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getRangeAccess().getRhsLimitParserRuleCall_4_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=Head body=Sentence?)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SetAddition_SetAddition_1_0 right=SetMultiplication)
	 */
	protected void sequence_SetAddition(EObject context, SetAddition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.SET_ADDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.SET_ADDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.SET_ADDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.SET_ADDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=BasicTerm rhs=TVars)
	 */
	protected void sequence_SetConstruct(EObject context, SetConstruct semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.SET_CONSTRUCT__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.SET_CONSTRUCT__LHS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.SET_CONSTRUCT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.SET_CONSTRUCT__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetConstructAccess().getLhsBasicTermParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getSetConstructAccess().getRhsTVarsParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='set' | value='range' | value='set_constr')
	 */
	protected void sequence_SetLiteral(EObject context, SetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SetMultiplication_SetMultiplication_1_0 right=SetPrimary)
	 */
	protected void sequence_SetMultiplication(EObject context, SetMultiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.SET_MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.SET_MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.SET_MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.SET_MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs='{' terms=BasicTerms?)
	 */
	protected void sequence_Set(EObject context, Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (car=TVar cdr+=TVar*)
	 */
	protected void sequence_TVars(EObject context, TVars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID exp=SetExpression)
	 */
	protected void sequence_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPE_DECLARATION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPE_DECLARATION__ID));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPE_DECLARATION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPE_DECLARATION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDeclarationAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID var=Variable)
	 */
	protected void sequence_TypedVariable(EObject context, TypedVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPED_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPED_VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPED_VARIABLE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPED_VARIABLE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedVariableAccess().getTypeIDTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     identifier=UID
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.VARIABLE__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.VARIABLE__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getIdentifierUIDTerminalRuleCall_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
}
