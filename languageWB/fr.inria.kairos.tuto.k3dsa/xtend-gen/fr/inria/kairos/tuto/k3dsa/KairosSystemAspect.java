package fr.inria.kairos.tuto.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.KairosSystem;

@Aspect(className = KairosSystem.class)
@SuppressWarnings("all")
public class KairosSystemAspect {
  public static void incTime(final KairosSystem _self) {
    final fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void incTime()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.KairosSystem){
    	fr.inria.kairos.tuto.k3dsa.KairosSystemAspect._privk3_incTime(_self_, (fr.inria.kairos.tuto.model.kairosTuto.KairosSystem)_self);
    };
  }
  
  public static Integer time(final KairosSystem _self) {
    final fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer time()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.KairosSystem){
    	result = fr.inria.kairos.tuto.k3dsa.KairosSystemAspect._privk3_time(_self_, (fr.inria.kairos.tuto.model.kairosTuto.KairosSystem)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void time(final KairosSystem _self, final Integer time) {
    final fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void time(Integer)
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.KairosSystem){
    	fr.inria.kairos.tuto.k3dsa.KairosSystemAspect._privk3_time(_self_, (fr.inria.kairos.tuto.model.kairosTuto.KairosSystem)_self,time);
    };
  }
  
  protected static void _privk3_incTime(final KairosSystemAspectKairosSystemAspectProperties _self_, final KairosSystem _self) {
    Integer _time = KairosSystemAspect.time(_self);
    int _plus = ((_time).intValue() + 1);
    KairosSystemAspect.time(_self, Integer.valueOf(_plus));
  }
  
  protected static Integer _privk3_time(final KairosSystemAspectKairosSystemAspectProperties _self_, final KairosSystem _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.time;
  }
  
  protected static void _privk3_time(final KairosSystemAspectKairosSystemAspectProperties _self_, final KairosSystem _self, final Integer time) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, time);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.time = time;
    }
  }
}
