package fr.inria.kairos.tuto.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties;
import fr.inria.kairos.tuto.k3dsa.InputPortAspect;
import fr.inria.kairos.tuto.k3dsa.OutputPortAspect;
import fr.inria.kairos.tuto.model.kairosTuto.Actor;
import fr.inria.kairos.tuto.model.kairosTuto.InputPort;
import fr.inria.kairos.tuto.model.kairosTuto.OutputPort;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = Actor.class)
@SuppressWarnings("all")
public class ActorAspect {
  public static void read(final Actor _self) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void read()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_read(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self);
    };
  }
  
  public static void start(final Actor _self) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_start(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self);
    };
  }
  
  public static void transform(final Actor _self) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void transform()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_transform(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self);
    };
  }
  
  public static void stop(final Actor _self) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void stop()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_stop(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self);
    };
  }
  
  public static void write(final Actor _self) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void write()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_write(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self);
    };
  }
  
  public static Integer state(final Actor _self) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer state()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	result = fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_state(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void state(final Actor _self, final Integer state) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void state(Integer)
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_state(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self,state);
    };
  }
  
  public static ArrayList<Integer> values(final Actor _self) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ArrayList<Integer> values()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	result = fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_values(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self);
    };
    return (java.util.ArrayList<java.lang.Integer>)result;
  }
  
  public static void values(final Actor _self, final ArrayList<Integer> values) {
    final fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void values(ArrayList<Integer>)
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Actor){
    	fr.inria.kairos.tuto.k3dsa.ActorAspect._privk3_values(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Actor)_self,values);
    };
  }
  
  protected static void _privk3_read(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    EList<InputPort> _ownedInputPorts = _self.getOwnedInputPorts();
    for (final InputPort op : _ownedInputPorts) {
      {
        int _size = InputPortAspect.inBuffer(op).size();
        boolean _equals = (_size == 0);
        if (_equals) {
          String _name = _self.getName();
          String _plus = (_name + " read buffer is empty :-(:");
          InputOutput.<String>println(_plus);
        }
        Integer h = IterableExtensions.<Integer>head(InputPortAspect.inBuffer(op));
        ActorAspect.values(_self).add(h);
        InputPortAspect.inBuffer(op).remove();
        String _name_1 = _self.getName();
        String _plus_1 = (_name_1 + " read: ");
        String _plus_2 = (_plus_1 + h);
        InputOutput.<String>println(_plus_2);
      }
    }
  }
  
  protected static void _privk3_start(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = (_name + " start");
    InputOutput.<String>println(_plus);
    ActorAspect.state(_self, Integer.valueOf(1));
  }
  
  protected static void _privk3_transform(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    ArrayList<Integer> newVal = new ArrayList<Integer>();
    ArrayList<Integer> _values = ActorAspect.values(_self);
    for (final Integer v : _values) {
      {
        String _name = _self.getName();
        String _plus = (_name + " transform: ");
        String _plus_1 = (_plus + v);
        String _plus_2 = (_plus_1 + " into ");
        String _plus_3 = (_plus_2 + Integer.valueOf(((v).intValue() % 5)));
        InputOutput.<String>println(_plus_3);
        newVal.add(Integer.valueOf(((v).intValue() % 5)));
      }
    }
    ActorAspect.values(_self, newVal);
    ActorAspect.state(_self, Integer.valueOf(2));
  }
  
  protected static void _privk3_stop(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = (_name + " stop");
    InputOutput.<String>println(_plus);
    ActorAspect.state(_self, Integer.valueOf(0));
  }
  
  protected static void _privk3_write(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    int _size = _self.getOwnedInputPorts().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      double v = Math.random();
      EList<OutputPort> _ownedOutputPorts = _self.getOwnedOutputPorts();
      for (final OutputPort op : _ownedOutputPorts) {
        {
          String _name = _self.getName();
          String _plus = (_name + " write ");
          int _intValue = Double.valueOf((v * 20)).intValue();
          String _plus_1 = (_plus + Integer.valueOf(_intValue));
          InputOutput.<String>println(_plus_1);
          OutputPortAspect.outBuffer(op).add(Integer.valueOf(Double.valueOf((v * 20)).intValue()));
        }
      }
    } else {
      int i = 0;
      EList<OutputPort> _ownedOutputPorts_1 = _self.getOwnedOutputPorts();
      for (final OutputPort op_1 : _ownedOutputPorts_1) {
        {
          String _name = _self.getName();
          String _plus = (_name + " write ");
          Integer _get = ActorAspect.values(_self).get(i);
          String _plus_1 = (_plus + _get);
          InputOutput.<String>println(_plus_1);
          OutputPortAspect.outBuffer(op_1).add(ActorAspect.values(_self).get(i));
          ActorAspect.values(_self).remove(i);
          i = (i + 1);
        }
      }
    }
  }
  
  protected static Integer _privk3_state(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getState") &&
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
    return _self_.state;
  }
  
  protected static void _privk3_state(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer state) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, state);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.state = state;
    }
  }
  
  protected static ArrayList<Integer> _privk3_values(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValues") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.ArrayList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.values;
  }
  
  protected static void _privk3_values(final ActorAspectActorAspectProperties _self_, final Actor _self, final ArrayList<Integer> values) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValues")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, values);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.values = values;
    }
  }
}
