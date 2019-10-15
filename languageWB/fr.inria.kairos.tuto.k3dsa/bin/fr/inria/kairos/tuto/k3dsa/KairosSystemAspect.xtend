package fr.inria.kairos.tuto.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.kairos.tuto.model.kairosTuto.Actor
import fr.inria.kairos.tuto.model.kairosTuto.InputPort
import java.util.Queue
import java.util.LinkedList
import fr.inria.kairos.tuto.model.kairosTuto.OutputPort
import fr.inria.kairos.tuto.model.kairosTuto.Connector
import static extension fr.inria.kairos.tuto.k3dsa.InputPortAspect.*
import static extension fr.inria.kairos.tuto.k3dsa.OutputPortAspect.*
import java.util.ArrayList

@Aspect(className=fr.inria.kairos.tuto.model.kairosTuto.KairosSystem)
class KairosSystemAspect {
	public var Integer time = 0
	def void incTime(){
		_self.time = _self.time + 1
	}
}

@Aspect(className=Actor)
class ActorAspect {
	public Integer state = 0 //0 stop; 1 started; 2 transformation done;
	public ArrayList<Integer> values = new ArrayList
	
	def void read(){
		for(op : _self.ownedInputPorts){
			if(op.inBuffer.size == 0){
				println(_self.name+" read buffer is empty :-(:")
			}
			var h = op.inBuffer.head
			_self.values.add(h);
			op.inBuffer.remove
			println(_self.name+" read: "+h)
		}
		
	}
	
	def void start(){
		println(_self.name+" start")
		_self.state = 1
	}
	
	def void transform(){
		var ArrayList<Integer> newVal = new ArrayList
		for(v: _self.values){
			println(_self.name+" transform: "+v+" into "+v%5)
			newVal.add(v%5)
		}
		_self.values = newVal
		_self.state = 2
	}
	def void stop(){
		println(_self.name+" stop")
		_self.state = 0
	}
	
	def void write(){
		if (_self.ownedInputPorts.size == 0){
			var double v = Math.random();
			for(op : _self.ownedOutputPorts){
				println(_self.name+" write "+(v* 20).intValue)
				op.outBuffer.add((v* 20).intValue);
			}
		}else{
			var int i = 0
			for(op : _self.ownedOutputPorts){
				println(_self.name+" write "+_self.values.get(i))
				op.outBuffer.add(_self.values.get(i));
				_self.values.remove(i)
				i = i + 1
			}
		}
		
	}
}

@Aspect(className=InputPort)
class InputPortAspect {
	public Queue<Integer> inBuffer = new LinkedList	
}

@Aspect(className=OutputPort)
class OutputPortAspect {
	public Queue<Integer> outBuffer = new LinkedList	
}

@Aspect(className=Connector)
class ConnectorAspect {
	def void transfer(){
		var h = _self.outputport.outBuffer.head
		_self.outputport.outBuffer.remove
		_self.inputport.inBuffer.add(h)
		println(_self.name+" transfer "+h+" inBuff="+_self.inputport.inBuffer)
	}	
}

	
