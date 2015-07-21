/**
 * Copyright 2015 National Aeronautics and Space Administration.
 * @generated NOT
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
import net.certware.argument.language.ui.internal.LActivator;
import net.certware.argument.language.ui.preferences.PreferenceConstants;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
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
	
	private IPropertyChangeListener propertyChangeListener = null;

	/**
	 * Constructor creates listener for preference changes
	 */
	LOutlineTreeProvider() {
		super();

		/**
		 * Create listener for preference changes to outline view.
		 */
		propertyChangeListener = new IPropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				/**
				 * Refresh outline view if an outline preference was updated.
				 */
				if ( event.getProperty().startsWith("outline")) { //$NON-NLS-1$
					IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
					IContentOutlinePage outline = (IContentOutlinePage) editor.getAdapter(IContentOutlinePage.class);
					if (outline instanceof LOutlinePage ) {
						((LOutlinePage)outline).scheduleRefresh();
					}
				}
			}
		};
		
		// add listener to the preference store
		// remove in finalize method
		LActivator.getInstance().getPreferenceStore().addPropertyChangeListener(propertyChangeListener);
	} // constructor
	
	/**
	 * Add property change listener removal to finalize for cleanup.
	 */
	public void finalize() throws Throwable {
		LActivator.getInstance().getPreferenceStore().removePropertyChangeListener(propertyChangeListener);
		super.finalize();
	}

	/* feature nodes are leafs and not expandable */
	protected boolean _isLeaf(Feature feature) {
		return true;
	}

	/* 
	 * Outline children for Set nodes. 
	 * Just show ground terms without delimiters.
	 * Ground terms are either arithmetic or functional terms. 
	 */
	protected void _createChildren(IOutlineNode parentNode,Set mySet) {
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
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_0);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getSetExpressionTextStyle()));
		return style;
	}

	/* 
	 * Set expression text styler
	 * TODO move to properties sheet 
	 * P_SET_EXPRESSION_TEXT_COLOR
	 * P_SET_EXPRESSION_TEXT_FONT
	 */
	protected TextStyle getSetExpressionTextStyle() {
		IPreferenceStore ps = LActivator.getInstance().getPreferenceStore();
		RGB color = PreferenceConverter.getColor(ps,PreferenceConstants.P_SET_EXPRESSION_TEXT_COLOR); 
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(color);
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	/*
	 * Type declaration text, outline only 
	 */
	public Object _text(TypeDeclaration typeDeclaration) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_1);
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
	 * P_TYPE_DECLARATION_TEXT_COLOR
	 * P_TYPE_DECLARATION_TEXT_FONT
	 */
	protected TextStyle getTypeDeclarationTextStyle() {
		IPreferenceStore ps = LActivator.getInstance().getPreferenceStore();
		RGB color = PreferenceConverter.getColor(ps,PreferenceConstants.P_TYPE_DECLARATION_TEXT_COLOR); 
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(color);
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	/* 
	 * Constant declaration text, outline only
	 */
	public Object _text(ConstantDeclaration constantDeclaration) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_2);
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
	 * P_CONSTANT_DECLARATION_TEXT_COLOR
	 * P_CONSTANT_DECLARATION_TEXT_FONT
	 */
	protected TextStyle getConstantDeclarationTextStyle() {
		IPreferenceStore ps = LActivator.getInstance().getPreferenceStore();
		RGB color = PreferenceConverter.getColor(ps,PreferenceConstants.P_CONSTANT_DECLARATION_TEXT_COLOR); 
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(color);
		// textStyle.setColor(new RGB(153,0,76)); // burgundy
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	/*
	 * Rule text styler
	 * Reused for several elements currently
	 * TODO move to properties sheet
	 * P_RULE_TEXT_COLOR
	 * P_RULE_TEXT_FONT
	 */
	protected TextStyle getRuleTextStyle() {
		IPreferenceStore ps = LActivator.getInstance().getPreferenceStore();
		RGB color = PreferenceConverter.getColor(ps,PreferenceConstants.P_RULE_TEXT_COLOR); 
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(color);
		// textStyle.setColor(new RGB(32,32,32)); // dark gray
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	/*
	 * And sentence text
	 */
	protected Object _text(AndSentence and) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_3);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getConditionalTextStyle()));
		return style;
	}

	/*
	 * Or sentence text
	 */
	protected Object _text(OrSentence or) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_4);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getConditionalTextStyle()));
		return style;
	}

	/*
	 * Conditional text styler
	 * P_CONDITIONAL_TEXT_COLOR
	 * P_CONDITIONAL_TEXT_STU:E
	 */
	protected TextStyle getConditionalTextStyle() {
		IPreferenceStore ps = LActivator.getInstance().getPreferenceStore();
		RGB color = PreferenceConverter.getColor(ps,PreferenceConstants.P_CONDITIONAL_TEXT_COLOR); 
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(color);
		// textStyle.setColor(new RGB(255,128,0)); // orange
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	/*
	 * Terms text
	 */
	protected Object _text(Terms terms) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_5);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));
		return style;
	}

	/*
	 * Basic term text
	 */
	protected Object _text(BasicTerm term) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_6);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));
		return style;
	}

	/*
	 * Functional term text
	 */
	protected Object _text(FunctionalTerm term) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_7);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));
		return style;
	}

	/*
	 * Program text
	 */
	protected Object _text(Program p) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_8);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));
		return style;
	}

	/*
	 * Statement text
	 */
	protected Object _text(Statement s) {
		StringBuffer sb = new StringBuffer(Messages.LOutlineTreeProvider_9);
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getRuleTextStyle()));
		return style;
	}


}