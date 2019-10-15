package fr.inria.kairos.tuto.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.OutputPort;
import java.util.Queue;

@Aspect(className = OutputPort.class)
@SuppressWarnings("all")
public class OutputPortAspect {
  public static Queue<Integer> outBuffer(final OutputPort _self) {
    final fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Queue<Integer> outBuffer()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.OutputPort){
    	result = fr.inria.kairos.tuto.k3dsa.OutputPortAspect._privk3_outBuffer(_self_, (fr.inria.kairos.tuto.model.kairosTuto.OutputPort)_self);
    };
    return (java.util.Queue<java.lang.Integer>)result;
  }
  
  public static void outBuffer(final OutputPort _self, final Queue<Integer> outBuffer) {
    final fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void outBuffer(Queue<Integer>)
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.OutputPort){
    	fr.inria.kairos.tuto.k3dsa.OutputPortAspect._privk3_outBuffer(_self_, (fr.inria.kairos.tuto.model.kairosTuto.OutputPort)_self,outBuffer);
    };
  }
  
  protected static Queue<Integer> _privk3_outBuffer(final OutputPortAspectOutputPortAspectProperties _self_, final OutputPort _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOutBuffer") &&
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
    return _self_.outBuffer;
  }
  
  protected static void _privk3_outBuffer(final OutputPortAspectOutputPortAspectProperties _self_, final OutputPort _self, final Queue<Integer> outBuffer) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOutBuffer")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, outBuffer);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.outBuffer = outBuffer;
    }
  }
}
