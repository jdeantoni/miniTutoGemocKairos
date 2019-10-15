package fr.inria.kairos.tuto.k3dsa;

import fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties;
import fr.inria.kairos.tuto.model.kairosTuto.Actor;
import java.util.Map;

@SuppressWarnings("all")
public class ActorAspectActorAspectContext {
  public final static ActorAspectActorAspectContext INSTANCE = new ActorAspectActorAspectContext();
  
  public static ActorAspectActorAspectProperties getSelf(final Actor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Actor, ActorAspectActorAspectProperties> map = new java.util.WeakHashMap<fr.inria.kairos.tuto.model.kairosTuto.Actor, fr.inria.kairos.tuto.k3dsa.ActorAspectActorAspectProperties>();
  
  public Map<Actor, ActorAspectActorAspectProperties> getMap() {
    return map;
  }
}
