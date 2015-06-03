/*
* generated by Xtext
*/
package de.laegler.xdocker.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.laegler.xdocker.lang.services.XDockerLangGrammarAccess;

public class XDockerLangParser extends AbstractContentAssistParser {
	
	@Inject
	private XDockerLangGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.laegler.xdocker.lang.ui.contentassist.antlr.internal.InternalXDockerLangParser createParser() {
		de.laegler.xdocker.lang.ui.contentassist.antlr.internal.InternalXDockerLangParser result = new de.laegler.xdocker.lang.ui.contentassist.antlr.internal.InternalXDockerLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getXDockerInstructionAccess().getAlternatives(), "rule__XDockerInstruction__Alternatives");
					put(grammarAccess.getXDockerModelAccess().getInstructionAssignment(), "rule__XDockerModel__InstructionAssignment");
					put(grammarAccess.getXDockerFromAccess().getNameAssignment(), "rule__XDockerFrom__NameAssignment");
					put(grammarAccess.getXDockerMaintainerAccess().getNameAssignment(), "rule__XDockerMaintainer__NameAssignment");
					put(grammarAccess.getXDockerRunAccess().getNameAssignment(), "rule__XDockerRun__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.laegler.xdocker.lang.ui.contentassist.antlr.internal.InternalXDockerLangParser typedParser = (de.laegler.xdocker.lang.ui.contentassist.antlr.internal.InternalXDockerLangParser) parser;
			typedParser.entryRuleXDockerModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XDockerLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XDockerLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}