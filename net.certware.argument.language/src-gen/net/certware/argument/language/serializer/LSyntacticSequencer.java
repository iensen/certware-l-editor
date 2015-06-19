package net.certware.argument.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.certware.argument.language.services.LGrammarAccess;
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
public class LSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Addition_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0;
	protected AbstractElementAlias match_Multiplication_AsteriskKeyword_1_1_0_or_PercentSignKeyword_1_1_2_or_SolidusKeyword_1_1_1;
	protected AbstractElementAlias match_NotSentence_NotKeyword_1_0_q;
	protected AbstractElementAlias match_NotSentence_PrimarySentence___LeftParenthesisKeyword_1_0_NotKeyword_1_0_q__a;
	protected AbstractElementAlias match_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__a;
	protected AbstractElementAlias match_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__p;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_SetMultiplication_AsteriskKeyword_1_1_0_or_ReverseSolidusKeyword_1_1_1;
	protected AbstractElementAlias match_SetPrimary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_SetPrimary_LeftParenthesisKeyword_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LGrammarAccess) access;
		match_Addition_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1_0()));
		match_Multiplication_AsteriskKeyword_1_1_0_or_PercentSignKeyword_1_1_2_or_SolidusKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_1_2()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()));
		match_NotSentence_NotKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getNotSentenceAccess().getNotKeyword_1_0());
		match_NotSentence_PrimarySentence___LeftParenthesisKeyword_1_0_NotKeyword_1_0_q__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, true, grammarAccess.getNotSentenceAccess().getNotKeyword_1_0()));
		match_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__a = new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getNotSentenceAccess().getNotKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()));
		match_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__p = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getNotSentenceAccess().getNotKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()));
		match_Primary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_SetMultiplication_AsteriskKeyword_1_1_0_or_ReverseSolidusKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1()));
		match_SetPrimary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_SetPrimary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQuantifierRule())
			return getQuantifierToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Quantifier:
	 * 	'every' | 'some'
	 * ;
	 */
	protected String getQuantifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "every";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Addition_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0.equals(syntax))
				emit_Addition_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Multiplication_AsteriskKeyword_1_1_0_or_PercentSignKeyword_1_1_2_or_SolidusKeyword_1_1_1.equals(syntax))
				emit_Multiplication_AsteriskKeyword_1_1_0_or_PercentSignKeyword_1_1_2_or_SolidusKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotSentence_NotKeyword_1_0_q.equals(syntax))
				emit_NotSentence_NotKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotSentence_PrimarySentence___LeftParenthesisKeyword_1_0_NotKeyword_1_0_q__a.equals(syntax))
				emit_NotSentence_PrimarySentence___LeftParenthesisKeyword_1_0_NotKeyword_1_0_q__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__a.equals(syntax))
				emit_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__p.equals(syntax))
				emit_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SetMultiplication_AsteriskKeyword_1_1_0_or_ReverseSolidusKeyword_1_1_1.equals(syntax))
				emit_SetMultiplication_AsteriskKeyword_1_1_0_or_ReverseSolidusKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SetPrimary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_SetPrimary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SetPrimary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_SetPrimary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '+' | '-'
	 */
	protected void emit_Addition_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*' | '/' | '%'
	 */
	protected void emit_Multiplication_AsteriskKeyword_1_1_0_or_PercentSignKeyword_1_1_2_or_SolidusKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'not'?
	 */
	protected void emit_NotSentence_NotKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' 'not'?)*
	 */
	protected void emit_NotSentence_PrimarySentence___LeftParenthesisKeyword_1_0_NotKeyword_1_0_q__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('not'? '(')*
	 */
	protected void emit_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('not'? '(')+
	 */
	protected void emit_NotSentence_PrimarySentence___NotKeyword_1_0_q_LeftParenthesisKeyword_1_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*' | '\'
	 */
	protected void emit_SetMultiplication_AsteriskKeyword_1_1_0_or_ReverseSolidusKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_SetPrimary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_SetPrimary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
