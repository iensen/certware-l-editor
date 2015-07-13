/**
 * Copyright 2015 National Aeronautics and Space Administration.
 */
package net.certware.argument.language.ui.outline;

import net.certware.argument.language.l.ConstantDeclaration;
import net.certware.argument.language.l.TypeDeclaration;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;

import com.google.inject.Inject;

/**
 * Customization of the default outline structure.
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 * @generated false
 */
public class LOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject
	private StylerFactory stylerFactory; // outline text styler factory
	
	/* feature nodes are leafs and not expandable */
	protected boolean _isLeaf(Feature feature) {
		return true;
	}
	
	/* statement node */ 
	protected void _createNode(DocumentRootNode parentNode,
			TypeDeclaration typeDeclaration) {
		createEObjectNode(parentNode,typeDeclaration);
		System.err.println("caught type declaration " + typeDeclaration.getId());
	}
	
	/* type declaration text, outline only */
	public Object _text(TypeDeclaration typeDeclaration) {
		StringBuffer sb = new StringBuffer("type");
		sb.append(' ');
		sb.append(typeDeclaration.getId());
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getTypeDeclarationTextStyle()));
		return style;
	}
	
	/* type declaration text styler */
	protected TextStyle getTypeDeclarationTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(153,0,153)); // purple
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	/* constant declaration text, outline only */
	public Object _text(ConstantDeclaration constantDeclaration) {
		StringBuffer sb = new StringBuffer("const");
		sb.append(' ');
		sb.append(constantDeclaration.getId());
		StyledString style = new StyledString(sb.toString(),
				stylerFactory.
				createXtextStyleAdapterStyler(getConstantDeclarationTextStyle()));
		return style;
	}
	
	/* constant declaration text styler */
	protected TextStyle getConstantDeclarationTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(153,0,76)); // burgundy
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
		
//import net.certware.argument.language.l.Program;
//import net.certware.argument.language.l.Statement;
//	/* skip the program element serving as root */
//	/* this flattens the outline view, but puts root on every item
//	protected void _createChildren(DocumentRootNode parentNode,Program program) {
//		for (Statement element : program.getStatements()) {
//			createNode(parentNode,element);
//		}
//	}
//	*/
	
}
