package net.certware.argument.analysis.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage;
import net.certware.argument.analysis.analysisDSL.Atom;
import net.certware.argument.analysis.analysisDSL.ClassicLiteral;
import net.certware.argument.analysis.analysisDSL.Line;
import net.certware.argument.analysis.analysisDSL.Output;
import net.certware.argument.analysis.analysisDSL.Term;
import net.certware.argument.analysis.analysisDSL.Terms;
import net.certware.argument.analysis.services.AnalysisDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class AnalysisDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnalysisDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnalysisDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnalysisDSLPackage.ATOM:
				if(context == grammarAccess.getAtomRule()) {
					sequence_Atom(context, (Atom) semanticObject); 
					return; 
				}
				else break;
			case AnalysisDSLPackage.CLASSIC_LITERAL:
				if(context == grammarAccess.getClassicLiteralRule()) {
					sequence_ClassicLiteral(context, (ClassicLiteral) semanticObject); 
					return; 
				}
				else break;
			case AnalysisDSLPackage.LINE:
				if(context == grammarAccess.getLineRule()) {
					sequence_Line(context, (Line) semanticObject); 
					return; 
				}
				else break;
			case AnalysisDSLPackage.OUTPUT:
				if(context == grammarAccess.getOutputRule()) {
					sequence_Output(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case AnalysisDSLPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case AnalysisDSLPackage.TERMS:
				if(context == grammarAccess.getTermsRule()) {
					sequence_Terms(context, (Terms) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=PREDICATE_NAME terms=Terms?)
	 */
	protected void sequence_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (neg='-'? atom=Atom)
	 */
	protected void sequence_ClassicLiteral(EObject context, ClassicLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     items+=ClassicLiteral+
	 */
	protected void sequence_Line(EObject context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lines+=Line+
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cs=CONSTANT_SYMBOL | (sign='-'? n=NUMBER) | (fs=FUNCTIONAL_SYMBOL terms=Terms))
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (car=Term cdr+=Term*)
	 */
	protected void sequence_Terms(EObject context, Terms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
