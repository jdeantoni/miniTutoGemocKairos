/*
 * generated by Xtext 2.14.0
 */
package fr.inria.kairos.tuto.concretesyntax.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractKairosSystemValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://team.inria.fr/kairos/kairosTuto"));
		return result;
	}
}
