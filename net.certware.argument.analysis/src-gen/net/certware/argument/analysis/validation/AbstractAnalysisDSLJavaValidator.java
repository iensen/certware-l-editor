/*
* generated by Xtext
*/
package net.certware.argument.analysis.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractAnalysisDSLJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage.eINSTANCE);
		return result;
	}

}