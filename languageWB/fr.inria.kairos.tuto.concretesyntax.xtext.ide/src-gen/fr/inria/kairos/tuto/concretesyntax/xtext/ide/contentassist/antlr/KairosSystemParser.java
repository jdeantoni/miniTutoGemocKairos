/*
 * generated by Xtext 2.14.0
 */
package fr.inria.kairos.tuto.concretesyntax.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.inria.kairos.tuto.concretesyntax.xtext.ide.contentassist.antlr.internal.InternalKairosSystemParser;
import fr.inria.kairos.tuto.concretesyntax.xtext.services.KairosSystemGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class KairosSystemParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(KairosSystemGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, KairosSystemGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getKairosSystemAccess().getGroup(), "rule__KairosSystem__Group__0");
			builder.put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
			builder.put(grammarAccess.getActorAccess().getGroup_3(), "rule__Actor__Group_3__0");
			builder.put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
			builder.put(grammarAccess.getInputPortAccess().getGroup(), "rule__InputPort__Group__0");
			builder.put(grammarAccess.getInputPortAccess().getGroup_5(), "rule__InputPort__Group_5__0");
			builder.put(grammarAccess.getOutputPortAccess().getGroup(), "rule__OutputPort__Group__0");
			builder.put(grammarAccess.getOutputPortAccess().getGroup_5(), "rule__OutputPort__Group_5__0");
			builder.put(grammarAccess.getKairosSystemAccess().getNameAssignment_2(), "rule__KairosSystem__NameAssignment_2");
			builder.put(grammarAccess.getKairosSystemAccess().getOwnedActorsAssignment_3(), "rule__KairosSystem__OwnedActorsAssignment_3");
			builder.put(grammarAccess.getKairosSystemAccess().getOwnedConnectorsAssignment_4(), "rule__KairosSystem__OwnedConnectorsAssignment_4");
			builder.put(grammarAccess.getActorAccess().getPeriodAssignment_3_1(), "rule__Actor__PeriodAssignment_3_1");
			builder.put(grammarAccess.getActorAccess().getNameAssignment_4(), "rule__Actor__NameAssignment_4");
			builder.put(grammarAccess.getActorAccess().getOwnedInputPortsAssignment_6(), "rule__Actor__OwnedInputPortsAssignment_6");
			builder.put(grammarAccess.getActorAccess().getOwnedOutputPortsAssignment_7(), "rule__Actor__OwnedOutputPortsAssignment_7");
			builder.put(grammarAccess.getConnectorAccess().getNameAssignment_1(), "rule__Connector__NameAssignment_1");
			builder.put(grammarAccess.getConnectorAccess().getOutputportAssignment_4(), "rule__Connector__OutputportAssignment_4");
			builder.put(grammarAccess.getConnectorAccess().getInputportAssignment_6(), "rule__Connector__InputportAssignment_6");
			builder.put(grammarAccess.getInputPortAccess().getNameAssignment_3(), "rule__InputPort__NameAssignment_3");
			builder.put(grammarAccess.getInputPortAccess().getConnectorAssignment_5_1(), "rule__InputPort__ConnectorAssignment_5_1");
			builder.put(grammarAccess.getOutputPortAccess().getNameAssignment_3(), "rule__OutputPort__NameAssignment_3");
			builder.put(grammarAccess.getOutputPortAccess().getConnectorAssignment_5_1(), "rule__OutputPort__ConnectorAssignment_5_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private KairosSystemGrammarAccess grammarAccess;

	@Override
	protected InternalKairosSystemParser createParser() {
		InternalKairosSystemParser result = new InternalKairosSystemParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public KairosSystemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KairosSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
