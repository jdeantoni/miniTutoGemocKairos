package fr.inria.kairos.tuto.k3dsa;

import fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.InputPort;
import java.util.Map;

@SuppressWarnings("all")
public class InputPortAspectInputPortAspectContext {
  public final static InputPortAspectInputPortAspectContext INSTANCE = new InputPortAspectInputPortAspectContext();
  
  public static InputPortAspectInputPortAspectProperties getSelf(final InputPort _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InputPort, InputPortAspectInputPortAspectProperties> map = new java.util.WeakHashMap<fr.inria.kairos.tuto.model.kairosTuto.InputPort, fr.inria.kairos.tuto.k3dsa.InputPortAspectInputPortAspectProperties>();
  
  public Map<InputPort, InputPortAspectInputPortAspectProperties> getMap() {
    return map;
  }
}
