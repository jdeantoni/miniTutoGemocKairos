/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package kairossystem.xdsml.api.impl;
import org.eclipse.emf.ecore.EObject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class KairosSystemRTDAccessor {
  public static java.lang.Integer getstate(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.ActorAspect", "state");
	}
	public static boolean setstate(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.ActorAspect", "state", newValue);
	}
  public static java.util.Queue getinBuffer(EObject eObject) {
		return (java.util.Queue)  getAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.InputPortAspect", "inBuffer");
	}
	public static boolean setinBuffer(EObject eObject, java.util.Queue newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.InputPortAspect", "inBuffer", newValue);
	}
  public static java.lang.Integer gettime(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.KairosSystemAspect", "time");
	}
	public static boolean settime(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.KairosSystemAspect", "time", newValue);
	}
  public static java.util.Queue getoutBuffer(EObject eObject) {
		return (java.util.Queue)  getAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.OutputPortAspect", "outBuffer");
	}
	public static boolean setoutBuffer(EObject eObject, java.util.Queue newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.tuto.dsl.KairosSystem", "fr.inria.kairos.tuto.k3dsa.OutputPortAspect", "outBuffer", newValue);
	}

public static Object getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
			List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
			Class<?> aspect = null;
			for (Class<?> a : aspects) {
				try {
					if (Class.forName(aspectName).isAssignableFrom(a)) {
						aspect = a;
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			if (aspect == null) {
				return null;
			}
			Object res = null;
			 try {
				res = aspect.getDeclaredMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
				if (res != null) {
				return res;
				}else {
					return null;
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
			 return null;
		}
	
	
	public static boolean setAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName, Object newValue) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			}
		}
		if (aspect == null) {
			return false;
		}
			 try {
				 aspect.getMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className(), newValue.getClass()).invoke(eObject, eObject, newValue);
				return true;
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).getClass().getInterfaces()) {
						
						try {
							aspect.getMethod(propertyName, c, newValue.getClass()).invoke(eObject, eObject, newValue);
							return true;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()+"::set"+propertyName);
						}
					}
				}
			return false;
	}
};