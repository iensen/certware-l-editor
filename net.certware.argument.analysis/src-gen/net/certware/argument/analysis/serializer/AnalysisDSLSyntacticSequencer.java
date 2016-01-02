package net.certware.argument.analysis.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.certware.argument.analysis.services.AnalysisDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AnalysisDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AnalysisDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Atom___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_Output_SATISFIABLETerminalRuleCall_1_0_or_UNSATISFIABLETerminalRuleCall_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AnalysisDSLGrammarAccess) access;
		match_Atom___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()));
		match_Output_SATISFIABLETerminalRuleCall_1_0_or_UNSATISFIABLETerminalRuleCall_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOutputAccess().getSATISFIABLETerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getOutputAccess().getUNSATISFIABLETerminalRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSATISFIABLERule())
			return getSATISFIABLEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getUNSATISFIABLERule())
			return getUNSATISFIABLEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal SATISFIABLE : 'SATISFIABLE';
	 */
	protected String getSATISFIABLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "SATISFIABLE";
	}
	
	/**
	 * terminal UNSATISFIABLE : 'UNSATISFIABLE';
	 */
	protected String getUNSATISFIABLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "UNSATISFIABLE";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Atom___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_Atom___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Output_SATISFIABLETerminalRuleCall_1_0_or_UNSATISFIABLETerminalRuleCall_1_1.equals(syntax))
				emit_Output_SATISFIABLETerminalRuleCall_1_0_or_UNSATISFIABLETerminalRuleCall_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Atom___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SATISFIABLE | UNSATISFIABLE
	 */
	protected void emit_Output_SATISFIABLETerminalRuleCall_1_0_or_UNSATISFIABLETerminalRuleCall_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}