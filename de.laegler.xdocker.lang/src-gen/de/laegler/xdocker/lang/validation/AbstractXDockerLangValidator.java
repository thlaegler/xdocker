/*
 * generated by Xtext
 */
package de.laegler.xdocker.lang.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractXDockerLangValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage.eINSTANCE);
		return result;
	}
}