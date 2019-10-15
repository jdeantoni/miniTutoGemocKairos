/*
 * generated by Xtext 2.14.0
 */
package fr.inria.kairos.tuto.concretesyntax.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class KairosSystemGrammarAccess extends AbstractGrammarElementFinder {
	
	public class KairosSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.KairosSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cKairosSystemAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cKairosSystemKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cOwnedActorsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOwnedActorsActorParserRuleCall_3_0 = (RuleCall)cOwnedActorsAssignment_3.eContents().get(0);
		private final Assignment cOwnedConnectorsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedConnectorsConnectorParserRuleCall_4_0 = (RuleCall)cOwnedConnectorsAssignment_4.eContents().get(0);
		
		//KairosSystem:
		//	{KairosSystem}
		//	'KairosSystem'
		//	name=EString
		//	ownedActors+=Actor*
		//	ownedConnectors+=Connector*;
		@Override public ParserRule getRule() { return rule; }
		
		//{KairosSystem} 'KairosSystem' name=EString ownedActors+=Actor* ownedConnectors+=Connector*
		public Group getGroup() { return cGroup; }
		
		//{KairosSystem}
		public Action getKairosSystemAction_0() { return cKairosSystemAction_0; }
		
		//'KairosSystem'
		public Keyword getKairosSystemKeyword_1() { return cKairosSystemKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//ownedActors+=Actor*
		public Assignment getOwnedActorsAssignment_3() { return cOwnedActorsAssignment_3; }
		
		//Actor
		public RuleCall getOwnedActorsActorParserRuleCall_3_0() { return cOwnedActorsActorParserRuleCall_3_0; }
		
		//ownedConnectors+=Connector*
		public Assignment getOwnedConnectorsAssignment_4() { return cOwnedConnectorsAssignment_4; }
		
		//Connector
		public RuleCall getOwnedConnectorsConnectorParserRuleCall_4_0() { return cOwnedConnectorsConnectorParserRuleCall_4_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ActorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.Actor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEveryKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPeriodAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPeriodINTTerminalRuleCall_3_1_0 = (RuleCall)cPeriodAssignment_3_1.eContents().get(0);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameEStringParserRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cOwnedInputPortsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOwnedInputPortsInputPortParserRuleCall_6_0 = (RuleCall)cOwnedInputPortsAssignment_6.eContents().get(0);
		private final Assignment cOwnedOutputPortsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cOwnedOutputPortsOutputPortParserRuleCall_7_0 = (RuleCall)cOwnedOutputPortsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Actor:
		//	{Actor}
		//	'Actor' ':' ('every' period=INT)?
		//	name=EString
		//	'{'
		//	ownedInputPorts+=InputPort*
		//	ownedOutputPorts+=OutputPort*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Actor} 'Actor' ':' ('every' period=INT)? name=EString '{' ownedInputPorts+=InputPort* ownedOutputPorts+=OutputPort* '}'
		public Group getGroup() { return cGroup; }
		
		//{Actor}
		public Action getActorAction_0() { return cActorAction_0; }
		
		//'Actor'
		public Keyword getActorKeyword_1() { return cActorKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//('every' period=INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'every'
		public Keyword getEveryKeyword_3_0() { return cEveryKeyword_3_0; }
		
		//period=INT
		public Assignment getPeriodAssignment_3_1() { return cPeriodAssignment_3_1; }
		
		//INT
		public RuleCall getPeriodINTTerminalRuleCall_3_1_0() { return cPeriodINTTerminalRuleCall_3_1_0; }
		
		//name=EString
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_4_0() { return cNameEStringParserRuleCall_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//ownedInputPorts+=InputPort*
		public Assignment getOwnedInputPortsAssignment_6() { return cOwnedInputPortsAssignment_6; }
		
		//InputPort
		public RuleCall getOwnedInputPortsInputPortParserRuleCall_6_0() { return cOwnedInputPortsInputPortParserRuleCall_6_0; }
		
		//ownedOutputPorts+=OutputPort*
		public Assignment getOwnedOutputPortsAssignment_7() { return cOwnedOutputPortsAssignment_7; }
		
		//OutputPort
		public RuleCall getOwnedOutputPortsOutputPortParserRuleCall_7_0() { return cOwnedOutputPortsOutputPortParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class ConnectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.Connector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFromKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cOutputportAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cOutputportOutputPortCrossReference_4_0 = (CrossReference)cOutputportAssignment_4.eContents().get(0);
		private final RuleCall cOutputportOutputPortEStringParserRuleCall_4_0_1 = (RuleCall)cOutputportOutputPortCrossReference_4_0.eContents().get(1);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cInputportAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cInputportInputPortCrossReference_6_0 = (CrossReference)cInputportAssignment_6.eContents().get(0);
		private final RuleCall cInputportInputPortEStringParserRuleCall_6_0_1 = (RuleCall)cInputportInputPortCrossReference_6_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Connector:
		//	'Connector'
		//	name=EString
		//	'('
		//	'from' outputport=[OutputPort|EString]
		//	'to' inputport=[InputPort|EString]
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'Connector' name=EString '(' 'from' outputport=[OutputPort|EString] 'to' inputport=[InputPort|EString] ')'
		public Group getGroup() { return cGroup; }
		
		//'Connector'
		public Keyword getConnectorKeyword_0() { return cConnectorKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//'from'
		public Keyword getFromKeyword_3() { return cFromKeyword_3; }
		
		//outputport=[OutputPort|EString]
		public Assignment getOutputportAssignment_4() { return cOutputportAssignment_4; }
		
		//[OutputPort|EString]
		public CrossReference getOutputportOutputPortCrossReference_4_0() { return cOutputportOutputPortCrossReference_4_0; }
		
		//EString
		public RuleCall getOutputportOutputPortEStringParserRuleCall_4_0_1() { return cOutputportOutputPortEStringParserRuleCall_4_0_1; }
		
		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }
		
		//inputport=[InputPort|EString]
		public Assignment getInputportAssignment_6() { return cInputportAssignment_6; }
		
		//[InputPort|EString]
		public CrossReference getInputportInputPortCrossReference_6_0() { return cInputportInputPortCrossReference_6_0; }
		
		//EString
		public RuleCall getInputportInputPortEStringParserRuleCall_6_0_1() { return cInputportInputPortEStringParserRuleCall_6_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class InputPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.InputPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInputPortAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPortKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cConnectorKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cConnectorAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cConnectorConnectorCrossReference_5_1_0 = (CrossReference)cConnectorAssignment_5_1.eContents().get(0);
		private final RuleCall cConnectorConnectorEStringParserRuleCall_5_1_0_1 = (RuleCall)cConnectorConnectorCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//InputPort:
		//	{InputPort}
		//	'In' 'Port'
		//	name=EString
		//	'{' ('connector' connector=[Connector|EString])?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{InputPort} 'In' 'Port' name=EString '{' ('connector' connector=[Connector|EString])? '}'
		public Group getGroup() { return cGroup; }
		
		//{InputPort}
		public Action getInputPortAction_0() { return cInputPortAction_0; }
		
		//'In'
		public Keyword getInKeyword_1() { return cInKeyword_1; }
		
		//'Port'
		public Keyword getPortKeyword_2() { return cPortKeyword_2; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//('connector' connector=[Connector|EString])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'connector'
		public Keyword getConnectorKeyword_5_0() { return cConnectorKeyword_5_0; }
		
		//connector=[Connector|EString]
		public Assignment getConnectorAssignment_5_1() { return cConnectorAssignment_5_1; }
		
		//[Connector|EString]
		public CrossReference getConnectorConnectorCrossReference_5_1_0() { return cConnectorConnectorCrossReference_5_1_0; }
		
		//EString
		public RuleCall getConnectorConnectorEStringParserRuleCall_5_1_0_1() { return cConnectorConnectorEStringParserRuleCall_5_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class OutputPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.OutputPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOutputPortAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPortKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cConnectorKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cConnectorAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cConnectorConnectorCrossReference_5_1_0 = (CrossReference)cConnectorAssignment_5_1.eContents().get(0);
		private final RuleCall cConnectorConnectorEStringParserRuleCall_5_1_0_1 = (RuleCall)cConnectorConnectorCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//OutputPort:
		//	{OutputPort}
		//	'Out' 'Port'
		//	name=EString
		//	'{' ('connector' connector=[Connector|EString])?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{OutputPort} 'Out' 'Port' name=EString '{' ('connector' connector=[Connector|EString])? '}'
		public Group getGroup() { return cGroup; }
		
		//{OutputPort}
		public Action getOutputPortAction_0() { return cOutputPortAction_0; }
		
		//'Out'
		public Keyword getOutKeyword_1() { return cOutKeyword_1; }
		
		//'Port'
		public Keyword getPortKeyword_2() { return cPortKeyword_2; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//('connector' connector=[Connector|EString])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'connector'
		public Keyword getConnectorKeyword_5_0() { return cConnectorKeyword_5_0; }
		
		//connector=[Connector|EString]
		public Assignment getConnectorAssignment_5_1() { return cConnectorAssignment_5_1; }
		
		//[Connector|EString]
		public CrossReference getConnectorConnectorCrossReference_5_1_0() { return cConnectorConnectorCrossReference_5_1_0; }
		
		//EString
		public RuleCall getConnectorConnectorEStringParserRuleCall_5_1_0_1() { return cConnectorConnectorEStringParserRuleCall_5_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	
	
	private final KairosSystemElements pKairosSystem;
	private final EStringElements pEString;
	private final ActorElements pActor;
	private final ConnectorElements pConnector;
	private final InputPortElements pInputPort;
	private final OutputPortElements pOutputPort;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public KairosSystemGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pKairosSystem = new KairosSystemElements();
		this.pEString = new EStringElements();
		this.pActor = new ActorElements();
		this.pConnector = new ConnectorElements();
		this.pInputPort = new InputPortElements();
		this.pOutputPort = new OutputPortElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//KairosSystem:
	//	{KairosSystem}
	//	'KairosSystem'
	//	name=EString
	//	ownedActors+=Actor*
	//	ownedConnectors+=Connector*;
	public KairosSystemElements getKairosSystemAccess() {
		return pKairosSystem;
	}
	
	public ParserRule getKairosSystemRule() {
		return getKairosSystemAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Actor:
	//	{Actor}
	//	'Actor' ':' ('every' period=INT)?
	//	name=EString
	//	'{'
	//	ownedInputPorts+=InputPort*
	//	ownedOutputPorts+=OutputPort*
	//	'}';
	public ActorElements getActorAccess() {
		return pActor;
	}
	
	public ParserRule getActorRule() {
		return getActorAccess().getRule();
	}
	
	//Connector:
	//	'Connector'
	//	name=EString
	//	'('
	//	'from' outputport=[OutputPort|EString]
	//	'to' inputport=[InputPort|EString]
	//	')';
	public ConnectorElements getConnectorAccess() {
		return pConnector;
	}
	
	public ParserRule getConnectorRule() {
		return getConnectorAccess().getRule();
	}
	
	//InputPort:
	//	{InputPort}
	//	'In' 'Port'
	//	name=EString
	//	'{' ('connector' connector=[Connector|EString])?
	//	'}';
	public InputPortElements getInputPortAccess() {
		return pInputPort;
	}
	
	public ParserRule getInputPortRule() {
		return getInputPortAccess().getRule();
	}
	
	//OutputPort:
	//	{OutputPort}
	//	'Out' 'Port'
	//	name=EString
	//	'{' ('connector' connector=[Connector|EString])?
	//	'}';
	public OutputPortElements getOutputPortAccess() {
		return pOutputPort;
	}
	
	public ParserRule getOutputPortRule() {
		return getOutputPortAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
