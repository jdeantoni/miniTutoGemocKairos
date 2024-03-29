/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package kairossystem.xdsml.api.impl;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.ElementState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelStateFactory;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.helper.IK3ModelStateHelper;import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class KairosSystemModelStateHelper implements IK3ModelStateHelper{
	private static class AttributeNameToValue implements Serializable{

		private static final long serialVersionUID = 0;		String name;
		Object value;
		public AttributeNameToValue(String n, Object v) {
			name = n;
			value = v;
		}


		@Override
		public boolean equals(Object obj) {
			if (! (obj instanceof AttributeNameToValue)) {
				return false;
			}
			AttributeNameToValue a2n = (AttributeNameToValue)obj;
			if (this.name.compareTo(a2n.name) != 0) {
				return false;
			}
			if (this.value == null) {
				return a2n.value == null;
			}
			if (!this.value.equals(a2n.value)) {
				return false;
			}
			return true;
		}	}
		K3ModelStateFactory theFactory = K3ModelStateFactory.eINSTANCE; 
	public K3ModelState getK3ModelState(EObject model) {
		K3ModelState res = theFactory.createK3ModelState();

		TreeIterator<EObject> allContentIt = model.eAllContents();
		while (allContentIt.hasNext()) {
			EObject elem = allContentIt.next();

			Class<?> clazz =null;
			clazz = K3DslHelper.getTarget(fr.inria.kairos.tuto.k3dsa.InputPortAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("inBuffer", KairosSystemRTDAccessor.getinBuffer(elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(fr.inria.kairos.tuto.k3dsa.ActorAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("state", KairosSystemRTDAccessor.getstate(elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(fr.inria.kairos.tuto.k3dsa.OutputPortAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("outBuffer", KairosSystemRTDAccessor.getoutBuffer(elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(fr.inria.kairos.tuto.k3dsa.KairosSystemAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("time", KairosSystemRTDAccessor.gettime(elem));
				elemState.getSavedRTDs().add(n2v0);
			}
		}
		return res;
		}

	public void restoreModelState(K3ModelState state) {
		for(ElementState elemState : state.getOwnedElementstates()) {
			for(Object o : elemState.getSavedRTDs()) {
				AttributeNameToValue n2v = (AttributeNameToValue)o;
				try {
					if (n2v.value != null) {
						Method m = KairosSystemRTDAccessor.class.getMethod("set"+n2v.name, EObject.class, n2v.value.getClass());
						m.invoke(null, elemState.getModelElement(), n2v.value);
					}
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : n2v.value.getClass().getInterfaces()) {
						
						try {
							m = KairosSystemRTDAccessor.class.getMethod("set"+n2v.name, EObject.class, n2v.value.getClass().getInterfaces()[0]);
							m.invoke(null, elemState.getModelElement(), n2v.value);
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+n2v.value.getClass().getName()+"::set"+n2v.name);
						}
					}
				}
			}
		}
	}

};