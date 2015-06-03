/*
* generated by Xtext
*/
package de.laegler.xdocker.lang.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class XDockerLangGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class XDockerModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XDockerModel");
		private final Assignment cInstructionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cInstructionXDockerInstructionParserRuleCall_0 = (RuleCall)cInstructionAssignment.eContents().get(0);
		
		//XDockerModel:
		//	instruction+=XDockerInstruction*;
		public ParserRule getRule() { return rule; }

		//instruction+=XDockerInstruction*
		public Assignment getInstructionAssignment() { return cInstructionAssignment; }

		//XDockerInstruction
		public RuleCall getInstructionXDockerInstructionParserRuleCall_0() { return cInstructionXDockerInstructionParserRuleCall_0; }
	}

	public class XDockerInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XDockerInstruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cXDockerFromParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cXDockerMaintainerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cXDockerRunParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////	CMD | LABEL | EXPOSE | ENV | ADD | COPY | ENTRYPOINT | VOLUME | USER | WORKDIR | ONBUILD
		//XDockerInstruction:
		//	XDockerFrom | XDockerMaintainer | XDockerRun;
		public ParserRule getRule() { return rule; }

		//XDockerFrom | XDockerMaintainer | XDockerRun
		public Alternatives getAlternatives() { return cAlternatives; }

		//XDockerFrom
		public RuleCall getXDockerFromParserRuleCall_0() { return cXDockerFromParserRuleCall_0; }

		//XDockerMaintainer
		public RuleCall getXDockerMaintainerParserRuleCall_1() { return cXDockerMaintainerParserRuleCall_1; }

		//XDockerRun
		public RuleCall getXDockerRunParserRuleCall_2() { return cXDockerRunParserRuleCall_2; }
	}

	public class XDockerFromElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XDockerFrom");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameFROMTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//XDockerFrom:
		//	name=FROM;
		public ParserRule getRule() { return rule; }

		//name=FROM
		public Assignment getNameAssignment() { return cNameAssignment; }

		//FROM
		public RuleCall getNameFROMTerminalRuleCall_0() { return cNameFROMTerminalRuleCall_0; }
	}

	public class XDockerMaintainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XDockerMaintainer");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameMAINTAINERTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//XDockerMaintainer:
		//	name=MAINTAINER;
		public ParserRule getRule() { return rule; }

		//name=MAINTAINER
		public Assignment getNameAssignment() { return cNameAssignment; }

		//MAINTAINER
		public RuleCall getNameMAINTAINERTerminalRuleCall_0() { return cNameMAINTAINERTerminalRuleCall_0; }
	}

	public class XDockerRunElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XDockerRun");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameRUNTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//XDockerRun:
		//	name=RUN;
		public ParserRule getRule() { return rule; }

		//name=RUN
		public Assignment getNameAssignment() { return cNameAssignment; }

		//RUN
		public RuleCall getNameRUNTerminalRuleCall_0() { return cNameRUNTerminalRuleCall_0; }
	}
	
	
	private final XDockerModelElements pXDockerModel;
	private final XDockerInstructionElements pXDockerInstruction;
	private final XDockerFromElements pXDockerFrom;
	private final XDockerMaintainerElements pXDockerMaintainer;
	private final XDockerRunElements pXDockerRun;
	private final TerminalRule tFROM;
	private final TerminalRule tMAINTAINER;
	private final TerminalRule tRUN;
	private final TerminalRule tEXAMPLE_HEADING;
	private final TerminalRule tNNL;
	private final TerminalRule tNL;
	private final TerminalRule tSPACES;
	private final TerminalRule tFEATURE_TEXT;
	private final TerminalRule tIN_ORDER_TO;
	private final TerminalRule tAS_A;
	private final TerminalRule tI_WANT_TO;
	private final TerminalRule tSCENARIO_TEXT;
	private final TerminalRule tSCENARIO_OUTLINE_TEXT;
	private final TerminalRule tBACKGROUND_TEXT;
	private final TerminalRule tWHEN_TEXT;
	private final TerminalRule tTHEN_TEXT;
	private final TerminalRule tGIVEN_TEXT;
	private final TerminalRule tAND_TEXT;
	private final TerminalRule tEXAMPLE_ROW_END;
	private final TerminalRule tEXAMPLE_CELL;
	private final TerminalRule tCODE;
	private final TerminalRule tTAG;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tTEXT;
	private final TerminalRule tWS;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public XDockerLangGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pXDockerModel = new XDockerModelElements();
		this.pXDockerInstruction = new XDockerInstructionElements();
		this.pXDockerFrom = new XDockerFromElements();
		this.pXDockerMaintainer = new XDockerMaintainerElements();
		this.pXDockerRun = new XDockerRunElements();
		this.tFROM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "FROM");
		this.tMAINTAINER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "MAINTAINER");
		this.tRUN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "RUN");
		this.tEXAMPLE_HEADING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXAMPLE_HEADING");
		this.tNNL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NNL");
		this.tNL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NL");
		this.tSPACES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SPACES");
		this.tFEATURE_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "FEATURE_TEXT");
		this.tIN_ORDER_TO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IN_ORDER_TO");
		this.tAS_A = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "AS_A");
		this.tI_WANT_TO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "I_WANT_TO");
		this.tSCENARIO_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SCENARIO_TEXT");
		this.tSCENARIO_OUTLINE_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SCENARIO_OUTLINE_TEXT");
		this.tBACKGROUND_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BACKGROUND_TEXT");
		this.tWHEN_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WHEN_TEXT");
		this.tTHEN_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "THEN_TEXT");
		this.tGIVEN_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "GIVEN_TEXT");
		this.tAND_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "AND_TEXT");
		this.tEXAMPLE_ROW_END = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXAMPLE_ROW_END");
		this.tEXAMPLE_CELL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXAMPLE_CELL");
		this.tCODE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CODE");
		this.tTAG = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TAG");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT");
		this.tTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TEXT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.laegler.xdocker.lang.XDockerLang".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//XDockerModel:
	//	instruction+=XDockerInstruction*;
	public XDockerModelElements getXDockerModelAccess() {
		return pXDockerModel;
	}
	
	public ParserRule getXDockerModelRule() {
		return getXDockerModelAccess().getRule();
	}

	////	CMD | LABEL | EXPOSE | ENV | ADD | COPY | ENTRYPOINT | VOLUME | USER | WORKDIR | ONBUILD
	//XDockerInstruction:
	//	XDockerFrom | XDockerMaintainer | XDockerRun;
	public XDockerInstructionElements getXDockerInstructionAccess() {
		return pXDockerInstruction;
	}
	
	public ParserRule getXDockerInstructionRule() {
		return getXDockerInstructionAccess().getRule();
	}

	//XDockerFrom:
	//	name=FROM;
	public XDockerFromElements getXDockerFromAccess() {
		return pXDockerFrom;
	}
	
	public ParserRule getXDockerFromRule() {
		return getXDockerFromAccess().getRule();
	}

	//XDockerMaintainer:
	//	name=MAINTAINER;
	public XDockerMaintainerElements getXDockerMaintainerAccess() {
		return pXDockerMaintainer;
	}
	
	public ParserRule getXDockerMaintainerRule() {
		return getXDockerMaintainerAccess().getRule();
	}

	//XDockerRun:
	//	name=RUN;
	public XDockerRunElements getXDockerRunAccess() {
		return pXDockerRun;
	}
	
	public ParserRule getXDockerRunRule() {
		return getXDockerRunAccess().getRule();
	}

	////CMD:
	////    'CMD' value=TEXT
	////;
	////LABEL:
	////    'LABEL'
	////;
	////EXPOSE:
	////    'EXPOSE'
	////;
	////
	////ENV:
	////    'ENV'
	////;
	////
	////ADD:
	////    'ADD'
	////;
	////
	////COPY:
	////    'COPY'
	////;
	////ENTRYPOINT:
	////    'ENTRYPOINT'
	////;
	////VOLUME:
	////    'VOLUME'
	////;
	////USER:
	////    'USER'
	////;
	////WORKDIR:
	////    'WORKDIR'
	////;
	////ONBUILD:
	////    'ONBUILD'
	////;
	//terminal FROM:
	//	"FROM" NNL* NL;
	public TerminalRule getFROMRule() {
		return tFROM;
	} 

	//terminal MAINTAINER:
	//	"MAINTAINER" NNL* NL;
	public TerminalRule getMAINTAINERRule() {
		return tMAINTAINER;
	} 

	//terminal RUN:
	//	"RUN" NNL* NL;
	public TerminalRule getRUNRule() {
		return tRUN;
	} 

	//terminal EXAMPLE_HEADING:
	//	"Examples" SPACES ":" SPACES "\r"? "\n";
	public TerminalRule getEXAMPLE_HEADINGRule() {
		return tEXAMPLE_HEADING;
	} 

	//terminal fragment NNL:
	//	!("\r" | "\n");
	public TerminalRule getNNLRule() {
		return tNNL;
	} 

	//terminal fragment NL:
	//	"\r"? "\n"?;
	public TerminalRule getNLRule() {
		return tNL;
	} 

	//terminal fragment SPACES:
	//	(" " | "\t")*;
	public TerminalRule getSPACESRule() {
		return tSPACES;
	} 

	//terminal FEATURE_TEXT:
	//	("Narrative:" | "Feature:") NNL* NL;
	public TerminalRule getFEATURE_TEXTRule() {
		return tFEATURE_TEXT;
	} 

	//terminal IN_ORDER_TO:
	//	"In order to" NNL* NL;
	public TerminalRule getIN_ORDER_TORule() {
		return tIN_ORDER_TO;
	} 

	//terminal AS_A:
	//	"As a" NNL* NL;
	public TerminalRule getAS_ARule() {
		return tAS_A;
	} 

	//terminal I_WANT_TO:
	//	"I want to " NNL* NL;
	public TerminalRule getI_WANT_TORule() {
		return tI_WANT_TO;
	} 

	//terminal SCENARIO_TEXT:
	//	"Scenario" SPACES ":" NNL* NL;
	public TerminalRule getSCENARIO_TEXTRule() {
		return tSCENARIO_TEXT;
	} 

	//terminal SCENARIO_OUTLINE_TEXT:
	//	"Scenario" SPACES "Outline" SPACES ":" NNL* NL;
	public TerminalRule getSCENARIO_OUTLINE_TEXTRule() {
		return tSCENARIO_OUTLINE_TEXT;
	} 

	//terminal BACKGROUND_TEXT:
	//	"Background" SPACES ":" NNL* NL;
	public TerminalRule getBACKGROUND_TEXTRule() {
		return tBACKGROUND_TEXT;
	} 

	//terminal WHEN_TEXT:
	//	"When " NNL* NL;
	public TerminalRule getWHEN_TEXTRule() {
		return tWHEN_TEXT;
	} 

	//terminal THEN_TEXT:
	//	"Then " NNL* NL;
	public TerminalRule getTHEN_TEXTRule() {
		return tTHEN_TEXT;
	} 

	//terminal GIVEN_TEXT:
	//	"Given " NNL* NL;
	public TerminalRule getGIVEN_TEXTRule() {
		return tGIVEN_TEXT;
	} 

	//terminal AND_TEXT:
	//	"And " NNL* NL;
	public TerminalRule getAND_TEXTRule() {
		return tAND_TEXT;
	} 

	//terminal EXAMPLE_ROW_END:
	//	"|" SPACES NL;
	public TerminalRule getEXAMPLE_ROW_ENDRule() {
		return tEXAMPLE_ROW_END;
	} 

	//terminal EXAMPLE_CELL:
	//	"|" !("\r" | "\n" | "|")+;
	public TerminalRule getEXAMPLE_CELLRule() {
		return tEXAMPLE_CELL;
	} 

	//terminal CODE:
	//	"\"\"\""->"\"\"\"" | "\'\'\'"->"\'\'\'";
	public TerminalRule getCODERule() {
		return tCODE;
	} 

	//terminal TAG:
	//	"@" NNL+ NL;
	public TerminalRule getTAGRule() {
		return tTAG;
	} 

	//terminal SL_COMMENT:
	//	"#" NNL+ NL;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	} 

	//terminal TEXT:
	//	!("|" | " " | "\t" | "\r" | "\n" | "@") NNL* NL;
	public TerminalRule getTEXTRule() {
		return tTEXT;
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return tWS;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}