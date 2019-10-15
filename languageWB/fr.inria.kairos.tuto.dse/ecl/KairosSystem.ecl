import 'http://team.inria.fr/kairos/kairosTuto'
import _'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "platform:/resource/fr.inria.kairos.tuto.moccml/mocc/KairosSystemLib.moccml"


package kairosTuto

	 --add DSE 

context KairosSystem
	def : time : Event = self.incTime()

context Actor

	def : startIt : Event = self.start()
	def : stopIt : Event = self.stop()
	def : transformIt : Event = self.transform()
	def : readIt : Event = self.read()
	def : writeIt : Event = self.write()
	
context Connector
	def : transferIt : Event = self.transfer()
	
--       add MoCCML mapping

context Connector
	inv connectorBehavior:
		let delay : Integer = self.name.size() in
		let writeDelayed : Event = Expression DelayFor(
				self.outputport.oclAsType(ecore::EObject).eContainer().oclAsType(Actor).writeIt,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(KairosSystem).time,
				delay
				) in
		Relation Coincides(writeDelayed, self.inputport.oclAsType(ecore::EObject).eContainer().oclAsType(Actor).readIt)
 		
 	inv connectorBehavior2:
		Relation Alternates(self.outputport.oclAsType(ecore::EObject).eContainer().oclAsType(Actor).writeIt, self.transferIt)
	inv connectorBehavior3:
		Relation Alternates(self.transferIt, self.inputport.oclAsType(ecore::EObject).eContainer().oclAsType(Actor).readIt)

context Actor
	inv TaskBehavior:
		(Relation KairosTask(self.startIt, self.stopIt, self.readIt, self.writeIt, self.transformIt))
		


 endpackage