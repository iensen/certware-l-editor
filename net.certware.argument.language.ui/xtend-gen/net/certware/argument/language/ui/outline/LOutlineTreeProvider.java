/**
 * Copyright 2015 National Aeronautics and Space Administration.
 */
package net.certware.argument.language.ui.outline;

import net.certware.argument.language.l.AndSentence;
import net.certware.argument.language.l.BasicTerm;
import net.certware.argument.language.l.ConstantDeclaration;
import net.certware.argument.language.l.FunctionalTerm;
import net.certware.argument.language.l.GroundTerm;
import net.certware.argument.language.l.OrSentence;
import net.certware.argument.language.l.Program;
import net.certware.argument.language.l.Set;
import net.certware.argument.language.l.SetExpression;
import net.certware.argument.language.l.Statement;
import net.certware.argument.language.l.Terms;
import net.certware.argument.language.l.TypeDeclaration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;

import com.google.inject.Inject;

/**
 * Customization of the default outline structure.
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
public class LOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject
	private StylerFactory stylerFactory; // outline text styler factory
	
	/* feature nodes are leafs and not expandable */
	protected boolean _isLeaf(Feature feature) {
		return true;
	}
		
	/* 
	 * Outline children for Set nodes. 
	 * Just show ground terms without delimiters.
	 * Ground terms are either arithmetic or functional terms. 
	 */
	protected void _createChildren(IOutlineNode parentNode,	Set mySet) {
		for ( GroundTerm groundTerm : mySet.getTerms().getCdr() ) {
			// createNode(parentNode,groundTerm); // skipped 
			for ( EObject item : groundTerm.eContents() ) {
				createNode(parentNode,item);
			}
		}
	}

	/* 
	 * Set expression text, outline only 
	 */
	public Object _text(SetExpression setExpression) {
		StringBuffer sb = new StringBuffer("set {}");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getSetExpressionTextStyle()));
		return style;
	}
	
	/* 
	 * Set expression text styler
	 * TODO move to properties sheet 
	 */
	protected TextStyle getSetExpressionTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0,102,204)); // royal blue
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	/*
	 * Type declaration text, outline only 
	 */
	public Object _text(TypeDeclaration typeDeclaration) {
		StringBuffer sb = new StringBuffer("type");
		sb.append(' ');
		sb.append(typeDeclaration.getId());
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getTypeDeclarationTextStyle()));
		return style;
	}
	
	/* 
	 * Type declaration text styler
	 * TODO move to properties sheet 
	 */
	protected TextStyle getTypeDeclarationTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(153,0,153)); // purple
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	/* 
	 * Constant declaration text, outline only
	 */
	public Object _text(ConstantDeclaration constantDeclaration) {
		StringBuffer sb = new StringBuffer("const");
		sb.append(' ');
		sb.append(constantDeclaration.getId());
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getConstantDeclarationTextStyle()));
		return style;
	}
	
	/* 
	 * Constant declaration styler
	 * TODO move to properties sheet
	 */
	protected TextStyle getConstantDeclarationTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(153,0,76)); // burgundy
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
		
	/*
	 * Rule text styler
	 * Reused for several elements currently
	 * TODO move to properties sheet
	 */
	protected TextStyle getRuleTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(32,32,32)); // dark gray
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	/*
	 * And sentence text
	 */
	protected Object _text(AndSentence and) {
		StringBuffer sb = new StringBuffer("and");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getConditionalTextStyle()));		
		return style;
	}

	/*
	 * Or sentence text
	 */
	protected Object _text(OrSentence or) {
		StringBuffer sb = new StringBuffer("or");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getConditionalTextStyle()));		
		return style;
	}
		
	/*
	 * Conditional text styler
	 */
	protected TextStyle getConditionalTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(255,128,0)); // orange
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	/*
	 * Terms text
	 */
	protected Object _text(Terms terms) {
		StringBuffer sb = new StringBuffer("terms");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));	
		return style;
	}
	
	/*
	 * Basic term text
	 */
	protected Object _text(BasicTerm term) {
		StringBuffer sb = new StringBuffer("basic term");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));	
		return style;
	}
	
	/*
	 * Functional term text
	 */
	protected Object _text(FunctionalTerm term) {
		StringBuffer sb = new StringBuffer("functional term");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));	
		return style;
	}

	/*
	 * Program text
	 */
	protected Object _text(Program p) {
		StringBuffer sb = new StringBuffer("program");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));	
		return style;
	}

	/*
	 * Statement text
	 */
	protected Object _text(Statement s) {
		StringBuffer sb = new StringBuffer("statement");
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));	
		return style;
	}
	
	
}
