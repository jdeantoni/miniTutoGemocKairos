package fr.inria.kairos.tuto.k3dsa;

import fr.inria.kairos.tuto.k3dsa.ConnectorAspectConnectorAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.Connector;
import java.util.Map;

@SuppressWarnings("all")
public class ConnectorAspectConnectorAspectContext {
  public final static ConnectorAspectConnectorAspectContext INSTANCE = new ConnectorAspectConnectorAspectContext();
  
  public static ConnectorAspectConnectorAspectProperties getSelf(final Connector _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.kairos.tuto.k3dsa.ConnectorAspectConnectorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connector, ConnectorAspectConnectorAspectProperties> map = new java.util.WeakHashMap<fr.inria.kairos.tuto.model.kairosTuto.Connector, fr.inria.kairos.tuto.k3dsa.ConnectorAspectConnectorAspectProperties>();
  
  public Map<Connector, ConnectorAspectConnectorAspectProperties> getMap() {
    return map;
  }
}
