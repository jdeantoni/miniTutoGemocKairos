package fr.inria.kairos.tuto.concretesyntax.design;

import fr.inria.kairos.tuto.model.kairosTuto.Actor;
import fr.inria.kairos.tuto.model.kairosTuto.InputPort;
import fr.inria.kairos.tuto.model.kairosTuto.KairosSystem;
import fr.inria.kairos.tuto.model.kairosTuto.OutputPort;
import kairossystem.xdsml.api.impl.KairosSystemRTDAccessor;

/**
 * The services class used by VSM.
 */
public class Services {
    
    public String getValues(InputPort p) {
      return KairosSystemRTDAccessor.getinBuffer(p).toString();
    }
    
    public String getValues(OutputPort p) {
       return KairosSystemRTDAccessor.getoutBuffer(p).toString();
     }
    
    public Integer getTime(KairosSystem ks) {
       return KairosSystemRTDAccessor.gettime(ks);
     }
    public Integer getState(Actor a) {
        return KairosSystemRTDAccessor.getstate(a);
      }
}
