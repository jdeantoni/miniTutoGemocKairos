package fr.inria.kairos.tuto.k3dsa;

import fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.KairosSystem;
import java.util.Map;

@SuppressWarnings("all")
public class KairosSystemAspectKairosSystemAspectContext {
  public final static KairosSystemAspectKairosSystemAspectContext INSTANCE = new KairosSystemAspectKairosSystemAspectContext();
  
  public static KairosSystemAspectKairosSystemAspectProperties getSelf(final KairosSystem _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<KairosSystem, KairosSystemAspectKairosSystemAspectProperties> map = new java.util.WeakHashMap<fr.inria.kairos.tuto.model.kairosTuto.KairosSystem, fr.inria.kairos.tuto.k3dsa.KairosSystemAspectKairosSystemAspectProperties>();
  
  public Map<KairosSystem, KairosSystemAspectKairosSystemAspectProperties> getMap() {
    return map;
  }
}
