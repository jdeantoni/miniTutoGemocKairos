package fr.inria.kairos.tuto.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.tuto.k3dsa.ConnectorAspectConnectorAspectProperties;
import fr.inria.kairos.tuto.k3dsa.InputPortAspect;
import fr.inria.kairos.tuto.k3dsa.OutputPortAspect;
import fr.inria.kairos.tuto.model.kairosTuto.Connector;
import java.util.Queue;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = Connector.class)
@SuppressWarnings("all")
public class ConnectorAspect {
  public static void transfer(final Connector _self) {
    final fr.inria.kairos.tuto.k3dsa.ConnectorAspectConnectorAspectProperties _self_ = fr.inria.kairos.tuto.k3dsa.ConnectorAspectConnectorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void transfer()
    if (_self instanceof fr.inria.kairos.tuto.model.kairosTuto.Connector){
    	fr.inria.kairos.tuto.k3dsa.ConnectorAspect._privk3_transfer(_self_, (fr.inria.kairos.tuto.model.kairosTuto.Connector)_self);
    };
  }
  
  protected static void _privk3_transfer(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    Integer h = IterableExtensions.<Integer>head(OutputPortAspect.outBuffer(_self.getOutputport()));
    OutputPortAspect.outBuffer(_self.getOutputport()).remove();
    InputPortAspect.inBuffer(_self.getInputport()).add(h);
    String _name = _self.getName();
    String _plus = (_name + " transfer ");
    String _plus_1 = (_plus + h);
    String _plus_2 = (_plus_1 + " inBuff=");
    Queue<Integer> _inBuffer = InputPortAspect.inBuffer(_self.getInputport());
    String _plus_3 = (_plus_2 + _inBuffer);
    InputOutput.<String>println(_plus_3);
  }
}
