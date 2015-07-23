package net.certware.argument.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.argument.language.l.Addition;
import net.certware.argument.language.l.AndSentence;
import net.certware.argument.language.l.ArithmeticLiteral;
import net.certware.argument.language.l.ArithmeticTerm;
import net.certware.argument.language.l.BasicPredicateAtom;
import net.certware.argument.language.l.BasicTerms;
import net.certware.argument.language.l.Bound;
import net.certware.argument.language.l.BuiltInAtom;
import net.certware.argument.language.l.CardinalityConstraint;
import net.certware.argument.language.l.ConstantDeclaration;
import net.certware.argument.language.l.ExistentialQuantifiedTerm;
import net.certware.argument.language.l.GroundAddition;
import net.certware.argument.language.l.GroundArithmeticLiteral;
import net.certware.argument.language.l.GroundMultiplication;
import net.certware.argument.language.l.GroundTerms;
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
import net.certware.argument.language.l.SetMultiplication;
import net.certware.argument.language.l.TVar;
import net.certware.argument.language.l.TVars;
import net.certware.argument.language.l.Terms;
import net.certware.argument.language.l.TypeDeclaration;
import net.certware.argument.language.l.TypeId;
import net.certware.argument.language.l.TypedVariable;
import net.certware.argument.language.l.UniversalQuantifiedTerm;
import net.certware.argument.language.l.Variable;
import net.certware.argument.language.l.pAndSentence;
import net.certware.argument.language.l.pOrSentence;
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
				   context == grammarAccess.getTermRule()) {
					sequence_Addition(context, (Addition) semanticObject); 
					return; 
				}
				else break;
			case LPackage.AND_SENTENCE:
				if(context == grammarAccess.getAndSentenceRule() ||
				   context == grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getNotSentenceRule() ||
				   context == grammarAccess.getOrSentenceRule() ||
				   context == grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPrimarySentenceRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getPAndSentenceRule() ||
				   context == grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPNotSentenceRule() ||
				   context == grammarAccess.getPOrSentenceRule() ||
				   context == grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPPrimarySentenceRule() ||
				   context == grammarAccess.getPSentenceRule()) {
					sequence_AndSentence(context, (AndSentence) semanticObject); 
					return; 
				}
				else break;
			case LPackage.ARITHMETIC_LITERAL:
				if(context == grammarAccess.getArithmeticLiteralRule()) {
					sequence_ArithmeticLiteral(context, (ArithmeticLiteral) semanticObject); 
					return; 
				}
				else break;
			case LPackage.ARITHMETIC_TERM:
				if(context == grammarAccess.getGroundAdditionRule() ||
				   context == grammarAccess.getGroundAdditionAccess().getGroundAdditionLhsAction_1_0() ||
				   context == grammarAccess.getGroundArithmeticTermRule() ||
				   context == grammarAccess.getGroundMultiplicationRule() ||
				   context == grammarAccess.getGroundMultiplicationAccess().getGroundMultiplicationLhsAction_1_0() ||
				   context == grammarAccess.getGroundPrimaryRule() ||
				   context == grammarAccess.getGroundTermRule()) {
					sequence_GroundPrimary(context, (ArithmeticTerm) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0() ||
				   context == grammarAccess.getArithmeticTermRule() ||
				   context == grammarAccess.getBasicTermRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Primary(context, (ArithmeticTerm) semanticObject); 
					return; 
				}
				else break;
			case LPackage.BASIC_PREDICATE_ATOM:
				if(context == grammarAccess.getBasicPredicateAtomRule() ||
				   context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getMaybeLiteralRule()) {
					sequence_BasicPredicateAtom(context, (BasicPredicateAtom) semanticObject); 
					return; 
				}
				else break;
			case LPackage.BASIC_TERMS:
				if(context == grammarAccess.getBasicTermsRule()) {
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
				if(context == grammarAccess.getAndSentenceRule() ||
				   context == grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBuiltInAtomRule() ||
				   context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getNotSentenceRule() ||
				   context == grammarAccess.getOrSentenceRule() ||
				   context == grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPrimarySentenceRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getSentenceLiteralRule() ||
				   context == grammarAccess.getPAndSentenceRule() ||
				   context == grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPNotSentenceRule() ||
				   context == grammarAccess.getPOrSentenceRule() ||
				   context == grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPPrimarySentenceRule() ||
				   context == grammarAccess.getPSentenceRule()) {
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
			case LPackage.EXISTENTIAL_QUANTIFIED_TERM:
				if(context == grammarAccess.getExistentialQuantifiedTermRule() ||
				   context == grammarAccess.getQuantifiedTermRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_ExistentialQuantifiedTerm(context, (ExistentialQuantifiedTerm) semanticObject); 
					return; 
				}
				else break;
			case LPackage.GROUND_ADDITION:
				if(context == grammarAccess.getGroundAdditionRule() ||
				   context == grammarAccess.getGroundAdditionAccess().getGroundAdditionLhsAction_1_0() ||
				   context == grammarAccess.getGroundArithmeticTermRule() ||
				   context == grammarAccess.getGroundTermRule()) {
					sequence_GroundAddition(context, (GroundAddition) semanticObject); 
					return; 
				}
				else break;
			case LPackage.GROUND_ARITHMETIC_LITERAL:
				if(context == grammarAccess.getGroundArithmeticLiteralRule()) {
					sequence_GroundArithmeticLiteral(context, (GroundArithmeticLiteral) semanticObject); 
					return; 
				}
				else break;
			case LPackage.GROUND_MULTIPLICATION:
				if(context == grammarAccess.getGroundAdditionRule() ||
				   context == grammarAccess.getGroundAdditionAccess().getGroundAdditionLhsAction_1_0() ||
				   context == grammarAccess.getGroundArithmeticTermRule() ||
				   context == grammarAccess.getGroundMultiplicationRule() ||
				   context == grammarAccess.getGroundMultiplicationAccess().getGroundMultiplicationLhsAction_1_0() ||
				   context == grammarAccess.getGroundTermRule()) {
					sequence_GroundMultiplication(context, (GroundMultiplication) semanticObject); 
					return; 
				}
				else break;
			case LPackage.GROUND_TERMS:
				if(context == grammarAccess.getGroundFunctionalTermRule() ||
				   context == grammarAccess.getGroundTermRule() ||
				   context == grammarAccess.getGroundTermsRule()) {
					sequence_GroundTerms(context, (GroundTerms) semanticObject); 
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
				   context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getNotSentenceRule() ||
				   context == grammarAccess.getOrSentenceRule() ||
				   context == grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPrimarySentenceRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getPAndSentenceRule() ||
				   context == grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPNotSentenceRule() ||
				   context == grammarAccess.getPOrSentenceRule() ||
				   context == grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPPrimarySentenceRule() ||
				   context == grammarAccess.getPSentenceRule()) {
					sequence_OrSentence(context, (OrSentence) semanticObject); 
					return; 
				}
				else break;
			case LPackage.PREDICATE_ATOM:
				if(context == grammarAccess.getAndSentenceRule() ||
				   context == grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getNotSentenceRule() ||
				   context == grammarAccess.getOrSentenceRule() ||
				   context == grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAtomRule() ||
				   context == grammarAccess.getPrimarySentenceRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getSentenceLiteralRule() ||
				   context == grammarAccess.getPAndSentenceRule() ||
				   context == grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPNotSentenceRule() ||
				   context == grammarAccess.getPOrSentenceRule() ||
				   context == grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPPrimarySentenceRule() ||
				   context == grammarAccess.getPSentenceRule() ||
				   context == grammarAccess.getPSentenceLiteralRule()) {
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
				if(context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getSetAdditionRule() ||
				   context == grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0() ||
				   context == grammarAccess.getSetExpressionRule() ||
				   context == grammarAccess.getSetLiteralRule() ||
				   context == grammarAccess.getSetMultiplicationRule() ||
				   context == grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getSetPrimaryRule()) {
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
				if(context == grammarAccess.getSetRule() ||
				   context == grammarAccess.getSetAdditionRule() ||
				   context == grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0() ||
				   context == grammarAccess.getSetExpressionRule() ||
				   context == grammarAccess.getSetLiteralRule() ||
				   context == grammarAccess.getSetMultiplicationRule() ||
				   context == grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getSetPrimaryRule()) {
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
				if(context == grammarAccess.getSetAdditionRule() ||
				   context == grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0() ||
				   context == grammarAccess.getSetConstructRule() ||
				   context == grammarAccess.getSetExpressionRule() ||
				   context == grammarAccess.getSetLiteralRule() ||
				   context == grammarAccess.getSetMultiplicationRule() ||
				   context == grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getSetPrimaryRule()) {
					sequence_SetConstruct(context, (SetConstruct) semanticObject); 
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
			case LPackage.TVAR:
				if(context == grammarAccess.getTVarRule()) {
					sequence_TVar(context, (TVar) semanticObject); 
					return; 
				}
				else break;
			case LPackage.TVARS:
				if(context == grammarAccess.getTVarsRule()) {
					sequence_TVars(context, (TVars) semanticObject); 
					return; 
				}
				else break;
			case LPackage.TERMS:
				if(context == grammarAccess.getBasicTermRule() ||
				   context == grammarAccess.getFunctionalTermRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermsRule()) {
					sequence_Terms(context, (Terms) semanticObject); 
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
			case LPackage.TYPE_ID:
				if(context == grammarAccess.getTypeIdRule()) {
					sequence_TypeId(context, (TypeId) semanticObject); 
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
			case LPackage.UNIVERSAL_QUANTIFIED_TERM:
				if(context == grammarAccess.getQuantifiedTermRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getUniversalQuantifiedTermRule()) {
					sequence_UniversalQuantifiedTerm(context, (UniversalQuantifiedTerm) semanticObject); 
					return; 
				}
				else break;
			case LPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case LPackage.PAND_SENTENCE:
				if(context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getPAndSentenceRule() ||
				   context == grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPOrSentenceRule() ||
				   context == grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPSentenceRule()) {
					sequence_pAndSentence(context, (pAndSentence) semanticObject); 
					return; 
				}
				else break;
			case LPackage.POR_SENTENCE:
				if(context == grammarAccess.getHeadRule() ||
				   context == grammarAccess.getPOrSentenceRule() ||
				   context == grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0() ||
				   context == grammarAccess.getPSentenceRule()) {
					sequence_pOrSentence(context, (pOrSentence) semanticObject); 
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
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (v=Variable | tv=TypedVariable | const=LID | value=INT)
	 */
	protected void sequence_ArithmeticLiteral(EObject context, ArithmeticLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fid=LID terms=BasicTerms?)
	 */
	protected void sequence_BasicPredicateAtom(EObject context, BasicPredicateAtom semanticObject) {
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
	 *     (lhs=Bound atom=BasicPredicateAtom rhs=Bound)
	 */
	protected void sequence_CardinalityConstraint(EObject context, CardinalityConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__LHS));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__ATOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__ATOM));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CARDINALITY_CONSTRAINT__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getCardinalityConstraintAccess().getAtomBasicPredicateAtomParserRuleCall_4_0(), semanticObject.getAtom());
		feeder.accept(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_8_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LID cv=GroundArithmeticTerm)
	 */
	protected void sequence_ConstantDeclaration(EObject context, ConstantDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__CV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.CONSTANT_DECLARATION__CV));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantDeclarationAccess().getNameLIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantDeclarationAccess().getCvGroundArithmeticTermParserRuleCall_3_0(), semanticObject.getCv());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=[TVar|ID]
	 */
	protected void sequence_ExistentialQuantifiedTerm(EObject context, ExistentialQuantifiedTerm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.EXISTENTIAL_QUANTIFIED_TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.EXISTENTIAL_QUANTIFIED_TERM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExistentialQuantifiedTermAccess().getNameTVarIDTerminalRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=GroundAddition_GroundAddition_1_0 rhs=GroundMultiplication)
	 */
	protected void sequence_GroundAddition(EObject context, GroundAddition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=LID | value=INT)
	 */
	protected void sequence_GroundArithmeticLiteral(EObject context, GroundArithmeticLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=GroundMultiplication_GroundMultiplication_1_0 rhs=Primary)
	 */
	protected void sequence_GroundMultiplication(EObject context, GroundMultiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((minus='-'? term=GroundArithmeticLiteral) | (minus='-'? term=Addition))
	 */
	protected void sequence_GroundPrimary(EObject context, ArithmeticTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (car=GroundTerm cdr+=GroundTerm*)
	 */
	protected void sequence_GroundTerms(EObject context, GroundTerms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     cv=GroundArithmeticTerm
	 */
	protected void sequence_Limit(EObject context, Limit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.LIMIT__CV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.LIMIT__CV));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLimitAccess().getCvGroundArithmeticTermParserRuleCall_0(), semanticObject.getCv());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Multiplication_Multiplication_1_0 rhs=Primary)
	 */
	protected void sequence_Multiplication(EObject context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (fid=LID terms=Terms?)
	 */
	protected void sequence_PredicateAtom(EObject context, PredicateAtom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((minus='-'? term=ArithmeticLiteral) | (minus='-'? term=Addition))
	 */
	protected void sequence_Primary(EObject context, ArithmeticTerm semanticObject) {
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
	 *     (head=Head (condition='if' body=Sentence)?)
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
	 *     (lhs='{' terms=GroundTerms?)
	 */
	protected void sequence_Set(EObject context, Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=Variable id=[TypeId|LID])
	 */
	protected void sequence_TVar(EObject context, TVar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TVAR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TVAR__VAR));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TVAR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TVAR__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTVarAccess().getVarVariableParserRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getTVarAccess().getIdTypeIdLIDTerminalRuleCall_2_0_1(), semanticObject.getId());
		feeder.finish();
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
	 *     (car=Term cdr+=Term*)
	 */
	protected void sequence_Terms(EObject context, Terms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TypeId exp=SetExpression)
	 */
	protected void sequence_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPE_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPE_DECLARATION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPE_DECLARATION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDeclarationAccess().getNameTypeIdParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=LID
	 */
	protected void sequence_TypeId(EObject context, TypeId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPE_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPE_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeIdAccess().getNameLIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LID var=Variable)
	 */
	protected void sequence_TypedVariable(EObject context, TypedVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPED_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPED_VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.TYPED_VARIABLE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.TYPED_VARIABLE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedVariableAccess().getNameLIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=[TypeId|LID]
	 */
	protected void sequence_UniversalQuantifiedTerm(EObject context, UniversalQuantifiedTerm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.UNIVERSAL_QUANTIFIED_TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.UNIVERSAL_QUANTIFIED_TERM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUniversalQuantifiedTermAccess().getNameTypeIdLIDTerminalRuleCall_1_0_1(), semanticObject.getName());
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
	
	
	/**
	 * Constraint:
	 *     (left=pAndSentence_pAndSentence_1_0 right=pNotSentence)
	 */
	protected void sequence_pAndSentence(EObject context, pAndSentence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.PAND_SENTENCE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.PAND_SENTENCE__LEFT));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.PAND_SENTENCE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.PAND_SENTENCE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPAndSentenceAccess().getRightPNotSentenceParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=pOrSentence_pOrSentence_1_0 right=pAndSentence)
	 */
	protected void sequence_pOrSentence(EObject context, pOrSentence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.POR_SENTENCE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.POR_SENTENCE__LEFT));
			if(transientValues.isValueTransient(semanticObject, LPackage.Literals.POR_SENTENCE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LPackage.Literals.POR_SENTENCE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPOrSentenceAccess().getRightPAndSentenceParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
}
