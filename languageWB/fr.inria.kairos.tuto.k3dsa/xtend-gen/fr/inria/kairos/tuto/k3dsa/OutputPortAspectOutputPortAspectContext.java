package fr.inria.kairos.tuto.k3dsa;

import fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.OutputPort;
import java.util.Map;

@SuppressWarnings("all")
public class OutputPortAspectOutputPortAspectContext {
  public final static OutputPortAspectOutputPortAspectContext INSTANCE = new OutputPortAspectOutputPortAspectContext();
  
  public static OutputPortAspectOutputPortAspectProperties getSelf(final OutputPort _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OutputPort, OutputPortAspectOutputPortAspectProperties> map = new java.util.WeakHashMap<fr.inria.kairos.tuto.model.kairosTuto.OutputPort, fr.inria.kairos.tuto.k3dsa.OutputPortAspectOutputPortAspectProperties>();
  
  public Map<OutputPort, OutputPortAspectOutputPortAspectProperties> getMap() {
    return map;
  }
}
