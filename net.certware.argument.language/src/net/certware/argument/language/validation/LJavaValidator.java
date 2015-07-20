/*
* generated by Xtext
* Updated manually.
* @author mrb
*/
package net.certware.argument.language.validation;

import java.util.List;

import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.Program;
import net.certware.argument.language.l.Range;
import net.certware.argument.language.l.Rule;
import net.certware.argument.language.l.TVar;
import net.certware.argument.language.l.TypeDeclaration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules. 
 * Using Guice injection method with the Java-based EValidator API. 
 */
public class LJavaValidator extends net.certware.argument.language.validation.AbstractLJavaValidator {

	/**
	 * Check program has at least one sentence.
	 * @param program
	 * @category error if program has no sentences
	 */
	@Check public void checkProgramEmpty(Program program) {
		if ( program.getStatements().isEmpty() ) {
			error(Messages.getString("LJavaValidator.0"), //$NON-NLS-1$
					LPackage.Literals.PROGRAM__STATEMENTS);
		}
	}
	
	/**
	 * Check whether range has both left and right sides.
	 * @param range
	 * @category warning if either left or right elements is empty
	 */
	@Check public void checkRangeIncludesLeftAndRight(Range range) {
		if ( range.getLhs().eContents().isEmpty() == true ||
				range.getRhs().eContents().isEmpty() == true ) {
			warning(Messages.getString("LJavaValidator.1"), //$NON-NLS-1$
					LPackage.Literals.RANGE__LHS);
		}
	}
	
	/**
	 * Check type variable refers to defined type.
	 * @param tvar
	 * @category error if type variable refers to undefined type
	 */
	@Check public void checkTypeVariableRefersToDefinedType(TVar tvar) {
		boolean found = false;
		String id = tvar.getId();
		if ( id.isEmpty() ) // premature test, bail out
			return;

		EObject program = EcoreUtil2.getRootContainer(tvar);
		List<TypeDeclaration> typeDeclarations = 
				EcoreUtil2.getAllContentsOfType(program, TypeDeclaration.class);
		
		for ( TypeDeclaration td : typeDeclarations ) {
			if ( td.getId().equals( id )) {
				found = true;
				break;
			}
		}
				
		if ( ! found ) {	// haven't found a declaration, emit error
			error(Messages.getString("LJavaValidator.2"), //$NON-NLS-1$
					LPackage.Literals.TVAR__ID);
		}
	}

	/**
	 * Check body of conditional rule.
	 * May not reach here because parser seems to trap the condition.
	 * @param rule program rule with 'if' part provided
	 * @category error when 'if' provided but body empty
	 */
	@Check public void checkRuleConditionWithoutBody(Rule rule) {
		if ( rule.getCondition().equalsIgnoreCase("if")) { //$NON-NLS-1$
			if ( rule.eIsSet(LPackage.Literals.RULE__BODY) == false ) {
				error(Messages.getString("LJavaValidator.3"), //$NON-NLS-1$
						LPackage.Literals.RULE__BODY);
			}
		}
	}
}