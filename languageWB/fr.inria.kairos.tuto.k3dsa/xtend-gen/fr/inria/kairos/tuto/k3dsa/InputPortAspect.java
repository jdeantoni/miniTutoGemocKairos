package fr.inria.kairos.tuto.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.InputPort;
import java.util.Queue;

@Aspect(className = InputPort.class)
@SuppressWarnings("all")
public class InputPortAspect {
  public static Queue<Integer> inBuffer(final InputPort _self) {
    final fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Queue<Integer> inBuffer()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.InputPort){
    	result = fr.inria.kairos.tuto.k3dsa.InputPortAspect._privk3_inBuffer(_self_, (fr.inria.kairos.tuto.model.kairosTuto.InputPort)_self);
    };
    return (java.util.Queue<java.lang.Integer>)result;
  }
  
  public static void inBuffer(final InputPort _self, final Queue<Integer> inBuffer) {
    final fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void inBuffer(Queue<Integer>)
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.InputPort){
    	fr.inria.kairos.tuto.k3dsa.InputPortAspect._privk3_inBuffer(_self_, (fr.inria.kairos.tuto.model.kairosTuto.InputPort)_self,inBuffer);
    };
  }
  
  protected static Queue<Integer> _privk3_inBuffer(final InputPortAspectInputPortAspectProperties _self_, final InputPort _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInBuffer") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Queue) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.inBuffer;
  }
  
  protected static void _privk3_inBuffer(final InputPortAspectInputPortAspectProperties _self_, final InputPort _self, final Queue<Integer> inBuffer) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInBuffer")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inBuffer);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.inBuffer = inBuffer;
    }
  }
}
