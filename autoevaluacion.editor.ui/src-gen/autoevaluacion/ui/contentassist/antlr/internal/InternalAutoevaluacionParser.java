package autoevaluacion.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import autoevaluacion.services.AutoevaluacionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutoevaluacionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Ejercicio'", "'{'", "'enunciado'", "'order'", "'respuesta'", "'}'", "'puntuacionEj'", "'categoria'", "'-'", "'.'", "'Clasico'", "'puntuacion'", "'penalizacion'", "'ejercicios'", "','", "'Wizard'", "'WizardAdaptativo'", "'RespuestaUnica'", "'correctas'", "'alternativas'", "'RespuestaMultiple'", "'TextoLibre'", "'Ordenacion'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAutoevaluacionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAutoevaluacionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAutoevaluacionParser.tokenNames; }
    public String getGrammarFileName() { return "../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g"; }


     
     	private AutoevaluacionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AutoevaluacionGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleHoja"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:60:1: entryRuleHoja : ruleHoja EOF ;
    public final void entryRuleHoja() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:61:1: ( ruleHoja EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:62:1: ruleHoja EOF
            {
             before(grammarAccess.getHojaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHoja_in_entryRuleHoja61);
            ruleHoja();

            state._fsp--;

             after(grammarAccess.getHojaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHoja68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHoja"


    // $ANTLR start "ruleHoja"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:69:1: ruleHoja : ( ( rule__Hoja__Alternatives ) ) ;
    public final void ruleHoja() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:73:2: ( ( ( rule__Hoja__Alternatives ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:74:1: ( ( rule__Hoja__Alternatives ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:74:1: ( ( rule__Hoja__Alternatives ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:75:1: ( rule__Hoja__Alternatives )
            {
             before(grammarAccess.getHojaAccess().getAlternatives()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:76:1: ( rule__Hoja__Alternatives )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:76:2: rule__Hoja__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hoja__Alternatives_in_ruleHoja94);
            rule__Hoja__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHojaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHoja"


    // $ANTLR start "entryRuleRespuesta"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:88:1: entryRuleRespuesta : ruleRespuesta EOF ;
    public final void entryRuleRespuesta() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:89:1: ( ruleRespuesta EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:90:1: ruleRespuesta EOF
            {
             before(grammarAccess.getRespuestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuesta_in_entryRuleRespuesta121);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getRespuestaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuesta128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRespuesta"


    // $ANTLR start "ruleRespuesta"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:97:1: ruleRespuesta : ( ( rule__Respuesta__Alternatives ) ) ;
    public final void ruleRespuesta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:101:2: ( ( ( rule__Respuesta__Alternatives ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:102:1: ( ( rule__Respuesta__Alternatives ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:102:1: ( ( rule__Respuesta__Alternatives ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:103:1: ( rule__Respuesta__Alternatives )
            {
             before(grammarAccess.getRespuestaAccess().getAlternatives()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:104:1: ( rule__Respuesta__Alternatives )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:104:2: rule__Respuesta__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Respuesta__Alternatives_in_ruleRespuesta154);
            rule__Respuesta__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRespuesta"


    // $ANTLR start "entryRuleEjercicio"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:116:1: entryRuleEjercicio : ruleEjercicio EOF ;
    public final void entryRuleEjercicio() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:117:1: ( ruleEjercicio EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:118:1: ruleEjercicio EOF
            {
             before(grammarAccess.getEjercicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_entryRuleEjercicio181);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getEjercicioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEjercicio188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEjercicio"


    // $ANTLR start "ruleEjercicio"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:125:1: ruleEjercicio : ( ( rule__Ejercicio__Group__0 ) ) ;
    public final void ruleEjercicio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:129:2: ( ( ( rule__Ejercicio__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:130:1: ( ( rule__Ejercicio__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:130:1: ( ( rule__Ejercicio__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:131:1: ( rule__Ejercicio__Group__0 )
            {
             before(grammarAccess.getEjercicioAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:132:1: ( rule__Ejercicio__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:132:2: rule__Ejercicio__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__0_in_ruleEjercicio214);
            rule__Ejercicio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEjercicio"


    // $ANTLR start "entryRuleEDouble"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:144:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:145:1: ( ruleEDouble EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:146:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble241);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:153:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:157:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:158:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:158:1: ( ( rule__EDouble__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:159:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:160:1: ( rule__EDouble__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:160:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble274);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleClasico"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:172:1: entryRuleClasico : ruleClasico EOF ;
    public final void entryRuleClasico() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:173:1: ( ruleClasico EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:174:1: ruleClasico EOF
            {
             before(grammarAccess.getClasicoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClasico_in_entryRuleClasico301);
            ruleClasico();

            state._fsp--;

             after(grammarAccess.getClasicoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClasico308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClasico"


    // $ANTLR start "ruleClasico"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:181:1: ruleClasico : ( ( rule__Clasico__Group__0 ) ) ;
    public final void ruleClasico() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:185:2: ( ( ( rule__Clasico__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:186:1: ( ( rule__Clasico__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:186:1: ( ( rule__Clasico__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:187:1: ( rule__Clasico__Group__0 )
            {
             before(grammarAccess.getClasicoAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:188:1: ( rule__Clasico__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:188:2: rule__Clasico__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__0_in_ruleClasico334);
            rule__Clasico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClasicoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClasico"


    // $ANTLR start "entryRuleWizard"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:200:1: entryRuleWizard : ruleWizard EOF ;
    public final void entryRuleWizard() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:201:1: ( ruleWizard EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:202:1: ruleWizard EOF
            {
             before(grammarAccess.getWizardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWizard_in_entryRuleWizard361);
            ruleWizard();

            state._fsp--;

             after(grammarAccess.getWizardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWizard368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:209:1: ruleWizard : ( ( rule__Wizard__Group__0 ) ) ;
    public final void ruleWizard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:213:2: ( ( ( rule__Wizard__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:214:1: ( ( rule__Wizard__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:214:1: ( ( rule__Wizard__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:215:1: ( rule__Wizard__Group__0 )
            {
             before(grammarAccess.getWizardAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:216:1: ( rule__Wizard__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:216:2: rule__Wizard__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__0_in_ruleWizard394);
            rule__Wizard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleWizardAdaptativo"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:228:1: entryRuleWizardAdaptativo : ruleWizardAdaptativo EOF ;
    public final void entryRuleWizardAdaptativo() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:229:1: ( ruleWizardAdaptativo EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:230:1: ruleWizardAdaptativo EOF
            {
             before(grammarAccess.getWizardAdaptativoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWizardAdaptativo_in_entryRuleWizardAdaptativo421);
            ruleWizardAdaptativo();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWizardAdaptativo428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWizardAdaptativo"


    // $ANTLR start "ruleWizardAdaptativo"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:237:1: ruleWizardAdaptativo : ( ( rule__WizardAdaptativo__Group__0 ) ) ;
    public final void ruleWizardAdaptativo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:241:2: ( ( ( rule__WizardAdaptativo__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:242:1: ( ( rule__WizardAdaptativo__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:242:1: ( ( rule__WizardAdaptativo__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:243:1: ( rule__WizardAdaptativo__Group__0 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:244:1: ( rule__WizardAdaptativo__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:244:2: rule__WizardAdaptativo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__0_in_ruleWizardAdaptativo454);
            rule__WizardAdaptativo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWizardAdaptativo"


    // $ANTLR start "entryRuleEString"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:257:1: ( ruleEString EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString481);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:272:1: ( rule__EString__Alternatives )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString514);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:284:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:285:1: ( ruleEInt EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:286:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt541);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:293:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:297:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:298:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:298:1: ( ( rule__EInt__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:299:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:300:1: ( rule__EInt__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:300:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt574);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleRespuestaUnica"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:312:1: entryRuleRespuestaUnica : ruleRespuestaUnica EOF ;
    public final void entryRuleRespuestaUnica() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:313:1: ( ruleRespuestaUnica EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:314:1: ruleRespuestaUnica EOF
            {
             before(grammarAccess.getRespuestaUnicaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuestaUnica_in_entryRuleRespuestaUnica601);
            ruleRespuestaUnica();

            state._fsp--;

             after(grammarAccess.getRespuestaUnicaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuestaUnica608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRespuestaUnica"


    // $ANTLR start "ruleRespuestaUnica"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:321:1: ruleRespuestaUnica : ( ( rule__RespuestaUnica__Group__0 ) ) ;
    public final void ruleRespuestaUnica() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:325:2: ( ( ( rule__RespuestaUnica__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:326:1: ( ( rule__RespuestaUnica__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:326:1: ( ( rule__RespuestaUnica__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:327:1: ( rule__RespuestaUnica__Group__0 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:328:1: ( rule__RespuestaUnica__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:328:2: rule__RespuestaUnica__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__0_in_ruleRespuestaUnica634);
            rule__RespuestaUnica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaUnicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRespuestaUnica"


    // $ANTLR start "entryRuleRespuestaMultiple"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:340:1: entryRuleRespuestaMultiple : ruleRespuestaMultiple EOF ;
    public final void entryRuleRespuestaMultiple() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:341:1: ( ruleRespuestaMultiple EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:342:1: ruleRespuestaMultiple EOF
            {
             before(grammarAccess.getRespuestaMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuestaMultiple_in_entryRuleRespuestaMultiple661);
            ruleRespuestaMultiple();

            state._fsp--;

             after(grammarAccess.getRespuestaMultipleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuestaMultiple668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRespuestaMultiple"


    // $ANTLR start "ruleRespuestaMultiple"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:349:1: ruleRespuestaMultiple : ( ( rule__RespuestaMultiple__Group__0 ) ) ;
    public final void ruleRespuestaMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:353:2: ( ( ( rule__RespuestaMultiple__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:354:1: ( ( rule__RespuestaMultiple__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:354:1: ( ( rule__RespuestaMultiple__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:355:1: ( rule__RespuestaMultiple__Group__0 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:356:1: ( rule__RespuestaMultiple__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:356:2: rule__RespuestaMultiple__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__0_in_ruleRespuestaMultiple694);
            rule__RespuestaMultiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaMultipleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRespuestaMultiple"


    // $ANTLR start "entryRuleTextoLibre"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:368:1: entryRuleTextoLibre : ruleTextoLibre EOF ;
    public final void entryRuleTextoLibre() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:369:1: ( ruleTextoLibre EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:370:1: ruleTextoLibre EOF
            {
             before(grammarAccess.getTextoLibreRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextoLibre_in_entryRuleTextoLibre721);
            ruleTextoLibre();

            state._fsp--;

             after(grammarAccess.getTextoLibreRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextoLibre728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextoLibre"


    // $ANTLR start "ruleTextoLibre"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:377:1: ruleTextoLibre : ( ( rule__TextoLibre__Group__0 ) ) ;
    public final void ruleTextoLibre() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:381:2: ( ( ( rule__TextoLibre__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:382:1: ( ( rule__TextoLibre__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:382:1: ( ( rule__TextoLibre__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:383:1: ( rule__TextoLibre__Group__0 )
            {
             before(grammarAccess.getTextoLibreAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:384:1: ( rule__TextoLibre__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:384:2: rule__TextoLibre__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__0_in_ruleTextoLibre754);
            rule__TextoLibre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextoLibreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextoLibre"


    // $ANTLR start "entryRuleOrdenacion"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:396:1: entryRuleOrdenacion : ruleOrdenacion EOF ;
    public final void entryRuleOrdenacion() throws RecognitionException {
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:397:1: ( ruleOrdenacion EOF )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:398:1: ruleOrdenacion EOF
            {
             before(grammarAccess.getOrdenacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrdenacion_in_entryRuleOrdenacion781);
            ruleOrdenacion();

            state._fsp--;

             after(grammarAccess.getOrdenacionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrdenacion788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrdenacion"


    // $ANTLR start "ruleOrdenacion"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:405:1: ruleOrdenacion : ( ( rule__Ordenacion__Group__0 ) ) ;
    public final void ruleOrdenacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:409:2: ( ( ( rule__Ordenacion__Group__0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:410:1: ( ( rule__Ordenacion__Group__0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:410:1: ( ( rule__Ordenacion__Group__0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:411:1: ( rule__Ordenacion__Group__0 )
            {
             before(grammarAccess.getOrdenacionAccess().getGroup()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:412:1: ( rule__Ordenacion__Group__0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:412:2: rule__Ordenacion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__0_in_ruleOrdenacion814);
            rule__Ordenacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdenacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrdenacion"


    // $ANTLR start "rule__Hoja__Alternatives"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:424:1: rule__Hoja__Alternatives : ( ( ruleClasico ) | ( ruleWizard ) | ( ruleWizardAdaptativo ) );
    public final void rule__Hoja__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:428:1: ( ( ruleClasico ) | ( ruleWizard ) | ( ruleWizardAdaptativo ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:429:1: ( ruleClasico )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:429:1: ( ruleClasico )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:430:1: ruleClasico
                    {
                     before(grammarAccess.getHojaAccess().getClasicoParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClasico_in_rule__Hoja__Alternatives850);
                    ruleClasico();

                    state._fsp--;

                     after(grammarAccess.getHojaAccess().getClasicoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:435:6: ( ruleWizard )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:435:6: ( ruleWizard )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:436:1: ruleWizard
                    {
                     before(grammarAccess.getHojaAccess().getWizardParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWizard_in_rule__Hoja__Alternatives867);
                    ruleWizard();

                    state._fsp--;

                     after(grammarAccess.getHojaAccess().getWizardParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:441:6: ( ruleWizardAdaptativo )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:441:6: ( ruleWizardAdaptativo )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:442:1: ruleWizardAdaptativo
                    {
                     before(grammarAccess.getHojaAccess().getWizardAdaptativoParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWizardAdaptativo_in_rule__Hoja__Alternatives884);
                    ruleWizardAdaptativo();

                    state._fsp--;

                     after(grammarAccess.getHojaAccess().getWizardAdaptativoParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hoja__Alternatives"


    // $ANTLR start "rule__Respuesta__Alternatives"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:452:1: rule__Respuesta__Alternatives : ( ( ruleRespuestaUnica ) | ( ruleRespuestaMultiple ) | ( ruleTextoLibre ) | ( ruleOrdenacion ) );
    public final void rule__Respuesta__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:456:1: ( ( ruleRespuestaUnica ) | ( ruleRespuestaMultiple ) | ( ruleTextoLibre ) | ( ruleOrdenacion ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:457:1: ( ruleRespuestaUnica )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:457:1: ( ruleRespuestaUnica )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:458:1: ruleRespuestaUnica
                    {
                     before(grammarAccess.getRespuestaAccess().getRespuestaUnicaParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRespuestaUnica_in_rule__Respuesta__Alternatives916);
                    ruleRespuestaUnica();

                    state._fsp--;

                     after(grammarAccess.getRespuestaAccess().getRespuestaUnicaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:463:6: ( ruleRespuestaMultiple )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:463:6: ( ruleRespuestaMultiple )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:464:1: ruleRespuestaMultiple
                    {
                     before(grammarAccess.getRespuestaAccess().getRespuestaMultipleParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRespuestaMultiple_in_rule__Respuesta__Alternatives933);
                    ruleRespuestaMultiple();

                    state._fsp--;

                     after(grammarAccess.getRespuestaAccess().getRespuestaMultipleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:469:6: ( ruleTextoLibre )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:469:6: ( ruleTextoLibre )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:470:1: ruleTextoLibre
                    {
                     before(grammarAccess.getRespuestaAccess().getTextoLibreParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTextoLibre_in_rule__Respuesta__Alternatives950);
                    ruleTextoLibre();

                    state._fsp--;

                     after(grammarAccess.getRespuestaAccess().getTextoLibreParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:475:6: ( ruleOrdenacion )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:475:6: ( ruleOrdenacion )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:476:1: ruleOrdenacion
                    {
                     before(grammarAccess.getRespuestaAccess().getOrdenacionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrdenacion_in_rule__Respuesta__Alternatives967);
                    ruleOrdenacion();

                    state._fsp--;

                     after(grammarAccess.getRespuestaAccess().getOrdenacionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:486:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:490:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:491:1: ( 'E' )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:491:1: ( 'E' )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:492:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_01000); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:499:6: ( 'e' )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:499:6: ( 'e' )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:500:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_01020); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:512:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:516:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:517:1: ( RULE_STRING )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:517:1: ( RULE_STRING )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:518:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1054); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:523:6: ( RULE_ID )
                    {
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:523:6: ( RULE_ID )
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:524:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1071); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Ejercicio__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:536:1: rule__Ejercicio__Group__0 : rule__Ejercicio__Group__0__Impl rule__Ejercicio__Group__1 ;
    public final void rule__Ejercicio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:540:1: ( rule__Ejercicio__Group__0__Impl rule__Ejercicio__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:541:2: rule__Ejercicio__Group__0__Impl rule__Ejercicio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__0__Impl_in_rule__Ejercicio__Group__01101);
            rule__Ejercicio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__1_in_rule__Ejercicio__Group__01104);
            rule__Ejercicio__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__0"


    // $ANTLR start "rule__Ejercicio__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:548:1: rule__Ejercicio__Group__0__Impl : ( 'Ejercicio' ) ;
    public final void rule__Ejercicio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:552:1: ( ( 'Ejercicio' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:553:1: ( 'Ejercicio' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:553:1: ( 'Ejercicio' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:554:1: 'Ejercicio'
            {
             before(grammarAccess.getEjercicioAccess().getEjercicioKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Ejercicio__Group__0__Impl1132); 
             after(grammarAccess.getEjercicioAccess().getEjercicioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__0__Impl"


    // $ANTLR start "rule__Ejercicio__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:567:1: rule__Ejercicio__Group__1 : rule__Ejercicio__Group__1__Impl rule__Ejercicio__Group__2 ;
    public final void rule__Ejercicio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:571:1: ( rule__Ejercicio__Group__1__Impl rule__Ejercicio__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:572:2: rule__Ejercicio__Group__1__Impl rule__Ejercicio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__1__Impl_in_rule__Ejercicio__Group__11163);
            rule__Ejercicio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__2_in_rule__Ejercicio__Group__11166);
            rule__Ejercicio__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__1"


    // $ANTLR start "rule__Ejercicio__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:579:1: rule__Ejercicio__Group__1__Impl : ( ( rule__Ejercicio__NameAssignment_1 ) ) ;
    public final void rule__Ejercicio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:583:1: ( ( ( rule__Ejercicio__NameAssignment_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:584:1: ( ( rule__Ejercicio__NameAssignment_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:584:1: ( ( rule__Ejercicio__NameAssignment_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:585:1: ( rule__Ejercicio__NameAssignment_1 )
            {
             before(grammarAccess.getEjercicioAccess().getNameAssignment_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:586:1: ( rule__Ejercicio__NameAssignment_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:586:2: rule__Ejercicio__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__NameAssignment_1_in_rule__Ejercicio__Group__1__Impl1193);
            rule__Ejercicio__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__1__Impl"


    // $ANTLR start "rule__Ejercicio__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:596:1: rule__Ejercicio__Group__2 : rule__Ejercicio__Group__2__Impl rule__Ejercicio__Group__3 ;
    public final void rule__Ejercicio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:600:1: ( rule__Ejercicio__Group__2__Impl rule__Ejercicio__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:601:2: rule__Ejercicio__Group__2__Impl rule__Ejercicio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__2__Impl_in_rule__Ejercicio__Group__21223);
            rule__Ejercicio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__3_in_rule__Ejercicio__Group__21226);
            rule__Ejercicio__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__2"


    // $ANTLR start "rule__Ejercicio__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:608:1: rule__Ejercicio__Group__2__Impl : ( '{' ) ;
    public final void rule__Ejercicio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:612:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:613:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:613:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:614:1: '{'
            {
             before(grammarAccess.getEjercicioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ejercicio__Group__2__Impl1254); 
             after(grammarAccess.getEjercicioAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__2__Impl"


    // $ANTLR start "rule__Ejercicio__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:627:1: rule__Ejercicio__Group__3 : rule__Ejercicio__Group__3__Impl rule__Ejercicio__Group__4 ;
    public final void rule__Ejercicio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:631:1: ( rule__Ejercicio__Group__3__Impl rule__Ejercicio__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:632:2: rule__Ejercicio__Group__3__Impl rule__Ejercicio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__3__Impl_in_rule__Ejercicio__Group__31285);
            rule__Ejercicio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__4_in_rule__Ejercicio__Group__31288);
            rule__Ejercicio__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__3"


    // $ANTLR start "rule__Ejercicio__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:639:1: rule__Ejercicio__Group__3__Impl : ( 'enunciado' ) ;
    public final void rule__Ejercicio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:643:1: ( ( 'enunciado' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:644:1: ( 'enunciado' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:644:1: ( 'enunciado' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:645:1: 'enunciado'
            {
             before(grammarAccess.getEjercicioAccess().getEnunciadoKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Ejercicio__Group__3__Impl1316); 
             after(grammarAccess.getEjercicioAccess().getEnunciadoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__3__Impl"


    // $ANTLR start "rule__Ejercicio__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:658:1: rule__Ejercicio__Group__4 : rule__Ejercicio__Group__4__Impl rule__Ejercicio__Group__5 ;
    public final void rule__Ejercicio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:662:1: ( rule__Ejercicio__Group__4__Impl rule__Ejercicio__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:663:2: rule__Ejercicio__Group__4__Impl rule__Ejercicio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__4__Impl_in_rule__Ejercicio__Group__41347);
            rule__Ejercicio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__5_in_rule__Ejercicio__Group__41350);
            rule__Ejercicio__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__4"


    // $ANTLR start "rule__Ejercicio__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:670:1: rule__Ejercicio__Group__4__Impl : ( ( rule__Ejercicio__EnunciadoAssignment_4 ) ) ;
    public final void rule__Ejercicio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:674:1: ( ( ( rule__Ejercicio__EnunciadoAssignment_4 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:675:1: ( ( rule__Ejercicio__EnunciadoAssignment_4 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:675:1: ( ( rule__Ejercicio__EnunciadoAssignment_4 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:676:1: ( rule__Ejercicio__EnunciadoAssignment_4 )
            {
             before(grammarAccess.getEjercicioAccess().getEnunciadoAssignment_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:677:1: ( rule__Ejercicio__EnunciadoAssignment_4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:677:2: rule__Ejercicio__EnunciadoAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__EnunciadoAssignment_4_in_rule__Ejercicio__Group__4__Impl1377);
            rule__Ejercicio__EnunciadoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getEnunciadoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__4__Impl"


    // $ANTLR start "rule__Ejercicio__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:687:1: rule__Ejercicio__Group__5 : rule__Ejercicio__Group__5__Impl rule__Ejercicio__Group__6 ;
    public final void rule__Ejercicio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:691:1: ( rule__Ejercicio__Group__5__Impl rule__Ejercicio__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:692:2: rule__Ejercicio__Group__5__Impl rule__Ejercicio__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__5__Impl_in_rule__Ejercicio__Group__51407);
            rule__Ejercicio__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__6_in_rule__Ejercicio__Group__51410);
            rule__Ejercicio__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__5"


    // $ANTLR start "rule__Ejercicio__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:699:1: rule__Ejercicio__Group__5__Impl : ( ( rule__Ejercicio__Group_5__0 )? ) ;
    public final void rule__Ejercicio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:703:1: ( ( ( rule__Ejercicio__Group_5__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:704:1: ( ( rule__Ejercicio__Group_5__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:704:1: ( ( rule__Ejercicio__Group_5__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:705:1: ( rule__Ejercicio__Group_5__0 )?
            {
             before(grammarAccess.getEjercicioAccess().getGroup_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:706:1: ( rule__Ejercicio__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:706:2: rule__Ejercicio__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_5__0_in_rule__Ejercicio__Group__5__Impl1437);
                    rule__Ejercicio__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEjercicioAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__5__Impl"


    // $ANTLR start "rule__Ejercicio__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:716:1: rule__Ejercicio__Group__6 : rule__Ejercicio__Group__6__Impl rule__Ejercicio__Group__7 ;
    public final void rule__Ejercicio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:720:1: ( rule__Ejercicio__Group__6__Impl rule__Ejercicio__Group__7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:721:2: rule__Ejercicio__Group__6__Impl rule__Ejercicio__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__6__Impl_in_rule__Ejercicio__Group__61468);
            rule__Ejercicio__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__7_in_rule__Ejercicio__Group__61471);
            rule__Ejercicio__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__6"


    // $ANTLR start "rule__Ejercicio__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:728:1: rule__Ejercicio__Group__6__Impl : ( ( rule__Ejercicio__Group_6__0 )? ) ;
    public final void rule__Ejercicio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:732:1: ( ( ( rule__Ejercicio__Group_6__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:733:1: ( ( rule__Ejercicio__Group_6__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:733:1: ( ( rule__Ejercicio__Group_6__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:734:1: ( rule__Ejercicio__Group_6__0 )?
            {
             before(grammarAccess.getEjercicioAccess().getGroup_6()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:735:1: ( rule__Ejercicio__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:735:2: rule__Ejercicio__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_6__0_in_rule__Ejercicio__Group__6__Impl1498);
                    rule__Ejercicio__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEjercicioAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__6__Impl"


    // $ANTLR start "rule__Ejercicio__Group__7"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:745:1: rule__Ejercicio__Group__7 : rule__Ejercicio__Group__7__Impl rule__Ejercicio__Group__8 ;
    public final void rule__Ejercicio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:749:1: ( rule__Ejercicio__Group__7__Impl rule__Ejercicio__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:750:2: rule__Ejercicio__Group__7__Impl rule__Ejercicio__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__7__Impl_in_rule__Ejercicio__Group__71529);
            rule__Ejercicio__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__8_in_rule__Ejercicio__Group__71532);
            rule__Ejercicio__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__7"


    // $ANTLR start "rule__Ejercicio__Group__7__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:757:1: rule__Ejercicio__Group__7__Impl : ( 'order' ) ;
    public final void rule__Ejercicio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:761:1: ( ( 'order' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:762:1: ( 'order' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:762:1: ( 'order' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:763:1: 'order'
            {
             before(grammarAccess.getEjercicioAccess().getOrderKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Ejercicio__Group__7__Impl1560); 
             after(grammarAccess.getEjercicioAccess().getOrderKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__7__Impl"


    // $ANTLR start "rule__Ejercicio__Group__8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:776:1: rule__Ejercicio__Group__8 : rule__Ejercicio__Group__8__Impl rule__Ejercicio__Group__9 ;
    public final void rule__Ejercicio__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:780:1: ( rule__Ejercicio__Group__8__Impl rule__Ejercicio__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:781:2: rule__Ejercicio__Group__8__Impl rule__Ejercicio__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__8__Impl_in_rule__Ejercicio__Group__81591);
            rule__Ejercicio__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__9_in_rule__Ejercicio__Group__81594);
            rule__Ejercicio__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__8"


    // $ANTLR start "rule__Ejercicio__Group__8__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:788:1: rule__Ejercicio__Group__8__Impl : ( ( rule__Ejercicio__OrderAssignment_8 ) ) ;
    public final void rule__Ejercicio__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:792:1: ( ( ( rule__Ejercicio__OrderAssignment_8 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:793:1: ( ( rule__Ejercicio__OrderAssignment_8 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:793:1: ( ( rule__Ejercicio__OrderAssignment_8 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:794:1: ( rule__Ejercicio__OrderAssignment_8 )
            {
             before(grammarAccess.getEjercicioAccess().getOrderAssignment_8()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:795:1: ( rule__Ejercicio__OrderAssignment_8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:795:2: rule__Ejercicio__OrderAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__OrderAssignment_8_in_rule__Ejercicio__Group__8__Impl1621);
            rule__Ejercicio__OrderAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getOrderAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__8__Impl"


    // $ANTLR start "rule__Ejercicio__Group__9"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:805:1: rule__Ejercicio__Group__9 : rule__Ejercicio__Group__9__Impl rule__Ejercicio__Group__10 ;
    public final void rule__Ejercicio__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:809:1: ( rule__Ejercicio__Group__9__Impl rule__Ejercicio__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:810:2: rule__Ejercicio__Group__9__Impl rule__Ejercicio__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__9__Impl_in_rule__Ejercicio__Group__91651);
            rule__Ejercicio__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__10_in_rule__Ejercicio__Group__91654);
            rule__Ejercicio__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__9"


    // $ANTLR start "rule__Ejercicio__Group__9__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:817:1: rule__Ejercicio__Group__9__Impl : ( 'respuesta' ) ;
    public final void rule__Ejercicio__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:821:1: ( ( 'respuesta' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:822:1: ( 'respuesta' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:822:1: ( 'respuesta' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:823:1: 'respuesta'
            {
             before(grammarAccess.getEjercicioAccess().getRespuestaKeyword_9()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Ejercicio__Group__9__Impl1682); 
             after(grammarAccess.getEjercicioAccess().getRespuestaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__9__Impl"


    // $ANTLR start "rule__Ejercicio__Group__10"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:836:1: rule__Ejercicio__Group__10 : rule__Ejercicio__Group__10__Impl rule__Ejercicio__Group__11 ;
    public final void rule__Ejercicio__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:840:1: ( rule__Ejercicio__Group__10__Impl rule__Ejercicio__Group__11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:841:2: rule__Ejercicio__Group__10__Impl rule__Ejercicio__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__10__Impl_in_rule__Ejercicio__Group__101713);
            rule__Ejercicio__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__11_in_rule__Ejercicio__Group__101716);
            rule__Ejercicio__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__10"


    // $ANTLR start "rule__Ejercicio__Group__10__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:848:1: rule__Ejercicio__Group__10__Impl : ( ( rule__Ejercicio__RespuestaAssignment_10 ) ) ;
    public final void rule__Ejercicio__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:852:1: ( ( ( rule__Ejercicio__RespuestaAssignment_10 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:853:1: ( ( rule__Ejercicio__RespuestaAssignment_10 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:853:1: ( ( rule__Ejercicio__RespuestaAssignment_10 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:854:1: ( rule__Ejercicio__RespuestaAssignment_10 )
            {
             before(grammarAccess.getEjercicioAccess().getRespuestaAssignment_10()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:855:1: ( rule__Ejercicio__RespuestaAssignment_10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:855:2: rule__Ejercicio__RespuestaAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__RespuestaAssignment_10_in_rule__Ejercicio__Group__10__Impl1743);
            rule__Ejercicio__RespuestaAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getRespuestaAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__10__Impl"


    // $ANTLR start "rule__Ejercicio__Group__11"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:865:1: rule__Ejercicio__Group__11 : rule__Ejercicio__Group__11__Impl ;
    public final void rule__Ejercicio__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:869:1: ( rule__Ejercicio__Group__11__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:870:2: rule__Ejercicio__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__11__Impl_in_rule__Ejercicio__Group__111773);
            rule__Ejercicio__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__11"


    // $ANTLR start "rule__Ejercicio__Group__11__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:876:1: rule__Ejercicio__Group__11__Impl : ( '}' ) ;
    public final void rule__Ejercicio__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:880:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:881:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:881:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:882:1: '}'
            {
             before(grammarAccess.getEjercicioAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ejercicio__Group__11__Impl1801); 
             after(grammarAccess.getEjercicioAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group__11__Impl"


    // $ANTLR start "rule__Ejercicio__Group_5__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:919:1: rule__Ejercicio__Group_5__0 : rule__Ejercicio__Group_5__0__Impl rule__Ejercicio__Group_5__1 ;
    public final void rule__Ejercicio__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:923:1: ( rule__Ejercicio__Group_5__0__Impl rule__Ejercicio__Group_5__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:924:2: rule__Ejercicio__Group_5__0__Impl rule__Ejercicio__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_5__0__Impl_in_rule__Ejercicio__Group_5__01856);
            rule__Ejercicio__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_5__1_in_rule__Ejercicio__Group_5__01859);
            rule__Ejercicio__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_5__0"


    // $ANTLR start "rule__Ejercicio__Group_5__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:931:1: rule__Ejercicio__Group_5__0__Impl : ( 'puntuacionEj' ) ;
    public final void rule__Ejercicio__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:935:1: ( ( 'puntuacionEj' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:936:1: ( 'puntuacionEj' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:936:1: ( 'puntuacionEj' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:937:1: 'puntuacionEj'
            {
             before(grammarAccess.getEjercicioAccess().getPuntuacionEjKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ejercicio__Group_5__0__Impl1887); 
             after(grammarAccess.getEjercicioAccess().getPuntuacionEjKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_5__0__Impl"


    // $ANTLR start "rule__Ejercicio__Group_5__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:950:1: rule__Ejercicio__Group_5__1 : rule__Ejercicio__Group_5__1__Impl ;
    public final void rule__Ejercicio__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:954:1: ( rule__Ejercicio__Group_5__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:955:2: rule__Ejercicio__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_5__1__Impl_in_rule__Ejercicio__Group_5__11918);
            rule__Ejercicio__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_5__1"


    // $ANTLR start "rule__Ejercicio__Group_5__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:961:1: rule__Ejercicio__Group_5__1__Impl : ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) ) ;
    public final void rule__Ejercicio__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:965:1: ( ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:966:1: ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:966:1: ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:967:1: ( rule__Ejercicio__PuntuacionEjAssignment_5_1 )
            {
             before(grammarAccess.getEjercicioAccess().getPuntuacionEjAssignment_5_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:968:1: ( rule__Ejercicio__PuntuacionEjAssignment_5_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:968:2: rule__Ejercicio__PuntuacionEjAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__PuntuacionEjAssignment_5_1_in_rule__Ejercicio__Group_5__1__Impl1945);
            rule__Ejercicio__PuntuacionEjAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getPuntuacionEjAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_5__1__Impl"


    // $ANTLR start "rule__Ejercicio__Group_6__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:982:1: rule__Ejercicio__Group_6__0 : rule__Ejercicio__Group_6__0__Impl rule__Ejercicio__Group_6__1 ;
    public final void rule__Ejercicio__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:986:1: ( rule__Ejercicio__Group_6__0__Impl rule__Ejercicio__Group_6__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:987:2: rule__Ejercicio__Group_6__0__Impl rule__Ejercicio__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_6__0__Impl_in_rule__Ejercicio__Group_6__01979);
            rule__Ejercicio__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_6__1_in_rule__Ejercicio__Group_6__01982);
            rule__Ejercicio__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_6__0"


    // $ANTLR start "rule__Ejercicio__Group_6__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:994:1: rule__Ejercicio__Group_6__0__Impl : ( 'categoria' ) ;
    public final void rule__Ejercicio__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:998:1: ( ( 'categoria' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:999:1: ( 'categoria' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:999:1: ( 'categoria' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1000:1: 'categoria'
            {
             before(grammarAccess.getEjercicioAccess().getCategoriaKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Ejercicio__Group_6__0__Impl2010); 
             after(grammarAccess.getEjercicioAccess().getCategoriaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_6__0__Impl"


    // $ANTLR start "rule__Ejercicio__Group_6__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1013:1: rule__Ejercicio__Group_6__1 : rule__Ejercicio__Group_6__1__Impl ;
    public final void rule__Ejercicio__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1017:1: ( rule__Ejercicio__Group_6__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1018:2: rule__Ejercicio__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_6__1__Impl_in_rule__Ejercicio__Group_6__12041);
            rule__Ejercicio__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_6__1"


    // $ANTLR start "rule__Ejercicio__Group_6__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1024:1: rule__Ejercicio__Group_6__1__Impl : ( ( rule__Ejercicio__CategoriaAssignment_6_1 ) ) ;
    public final void rule__Ejercicio__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1028:1: ( ( ( rule__Ejercicio__CategoriaAssignment_6_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1029:1: ( ( rule__Ejercicio__CategoriaAssignment_6_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1029:1: ( ( rule__Ejercicio__CategoriaAssignment_6_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1030:1: ( rule__Ejercicio__CategoriaAssignment_6_1 )
            {
             before(grammarAccess.getEjercicioAccess().getCategoriaAssignment_6_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1031:1: ( rule__Ejercicio__CategoriaAssignment_6_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1031:2: rule__Ejercicio__CategoriaAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__CategoriaAssignment_6_1_in_rule__Ejercicio__Group_6__1__Impl2068);
            rule__Ejercicio__CategoriaAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getCategoriaAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__Group_6__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1045:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1049:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1050:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02102);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02105);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1057:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1061:1: ( ( ( '-' )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1062:1: ( ( '-' )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1062:1: ( ( '-' )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1063:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1064:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1065:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EDouble__Group__0__Impl2134); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1076:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1080:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1081:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__12167);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__12170);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1088:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1092:1: ( ( ( RULE_INT )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1093:1: ( ( RULE_INT )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1093:1: ( ( RULE_INT )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1094:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1095:1: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1095:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl2198); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1105:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1109:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1110:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__22229);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__22232);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1117:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1121:1: ( ( '.' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1122:1: ( '.' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1122:1: ( '.' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1123:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EDouble__Group__2__Impl2260); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1136:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1140:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1141:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__32291);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__32294);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1148:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1152:1: ( ( RULE_INT ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1153:1: ( RULE_INT )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1153:1: ( RULE_INT )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1154:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl2321); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1165:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1169:1: ( rule__EDouble__Group__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1170:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__42350);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1176:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1180:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1181:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1181:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1182:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1183:1: ( rule__EDouble__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1183:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl2377);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1203:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1207:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1208:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__02418);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__02421);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1215:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1219:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1220:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1220:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1221:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1222:1: ( rule__EDouble__Alternatives_4_0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1222:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl2448);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1232:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1236:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1237:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__12478);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__12481);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1244:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1248:1: ( ( ( '-' )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1249:1: ( ( '-' )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1249:1: ( ( '-' )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1250:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1251:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1252:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EDouble__Group_4__1__Impl2510); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1263:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1267:1: ( rule__EDouble__Group_4__2__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1268:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__22543);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1274:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1278:1: ( ( RULE_INT ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1279:1: ( RULE_INT )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1279:1: ( RULE_INT )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1280:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl2570); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Clasico__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1297:1: rule__Clasico__Group__0 : rule__Clasico__Group__0__Impl rule__Clasico__Group__1 ;
    public final void rule__Clasico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1301:1: ( rule__Clasico__Group__0__Impl rule__Clasico__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1302:2: rule__Clasico__Group__0__Impl rule__Clasico__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__0__Impl_in_rule__Clasico__Group__02605);
            rule__Clasico__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__1_in_rule__Clasico__Group__02608);
            rule__Clasico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__0"


    // $ANTLR start "rule__Clasico__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1309:1: rule__Clasico__Group__0__Impl : ( 'Clasico' ) ;
    public final void rule__Clasico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1313:1: ( ( 'Clasico' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1314:1: ( 'Clasico' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1314:1: ( 'Clasico' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1315:1: 'Clasico'
            {
             before(grammarAccess.getClasicoAccess().getClasicoKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Clasico__Group__0__Impl2636); 
             after(grammarAccess.getClasicoAccess().getClasicoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__0__Impl"


    // $ANTLR start "rule__Clasico__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1328:1: rule__Clasico__Group__1 : rule__Clasico__Group__1__Impl rule__Clasico__Group__2 ;
    public final void rule__Clasico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1332:1: ( rule__Clasico__Group__1__Impl rule__Clasico__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1333:2: rule__Clasico__Group__1__Impl rule__Clasico__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__1__Impl_in_rule__Clasico__Group__12667);
            rule__Clasico__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__2_in_rule__Clasico__Group__12670);
            rule__Clasico__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__1"


    // $ANTLR start "rule__Clasico__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1340:1: rule__Clasico__Group__1__Impl : ( '{' ) ;
    public final void rule__Clasico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1344:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1345:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1345:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1346:1: '{'
            {
             before(grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Clasico__Group__1__Impl2698); 
             after(grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__1__Impl"


    // $ANTLR start "rule__Clasico__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1359:1: rule__Clasico__Group__2 : rule__Clasico__Group__2__Impl rule__Clasico__Group__3 ;
    public final void rule__Clasico__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1363:1: ( rule__Clasico__Group__2__Impl rule__Clasico__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1364:2: rule__Clasico__Group__2__Impl rule__Clasico__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__2__Impl_in_rule__Clasico__Group__22729);
            rule__Clasico__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__3_in_rule__Clasico__Group__22732);
            rule__Clasico__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__2"


    // $ANTLR start "rule__Clasico__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1371:1: rule__Clasico__Group__2__Impl : ( 'puntuacion' ) ;
    public final void rule__Clasico__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1375:1: ( ( 'puntuacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1376:1: ( 'puntuacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1376:1: ( 'puntuacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1377:1: 'puntuacion'
            {
             before(grammarAccess.getClasicoAccess().getPuntuacionKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Clasico__Group__2__Impl2760); 
             after(grammarAccess.getClasicoAccess().getPuntuacionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__2__Impl"


    // $ANTLR start "rule__Clasico__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1390:1: rule__Clasico__Group__3 : rule__Clasico__Group__3__Impl rule__Clasico__Group__4 ;
    public final void rule__Clasico__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1394:1: ( rule__Clasico__Group__3__Impl rule__Clasico__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1395:2: rule__Clasico__Group__3__Impl rule__Clasico__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__3__Impl_in_rule__Clasico__Group__32791);
            rule__Clasico__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__4_in_rule__Clasico__Group__32794);
            rule__Clasico__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__3"


    // $ANTLR start "rule__Clasico__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1402:1: rule__Clasico__Group__3__Impl : ( ( rule__Clasico__PuntuacionAssignment_3 ) ) ;
    public final void rule__Clasico__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1406:1: ( ( ( rule__Clasico__PuntuacionAssignment_3 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1407:1: ( ( rule__Clasico__PuntuacionAssignment_3 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1407:1: ( ( rule__Clasico__PuntuacionAssignment_3 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1408:1: ( rule__Clasico__PuntuacionAssignment_3 )
            {
             before(grammarAccess.getClasicoAccess().getPuntuacionAssignment_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1409:1: ( rule__Clasico__PuntuacionAssignment_3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1409:2: rule__Clasico__PuntuacionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__PuntuacionAssignment_3_in_rule__Clasico__Group__3__Impl2821);
            rule__Clasico__PuntuacionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClasicoAccess().getPuntuacionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__3__Impl"


    // $ANTLR start "rule__Clasico__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1419:1: rule__Clasico__Group__4 : rule__Clasico__Group__4__Impl rule__Clasico__Group__5 ;
    public final void rule__Clasico__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1423:1: ( rule__Clasico__Group__4__Impl rule__Clasico__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1424:2: rule__Clasico__Group__4__Impl rule__Clasico__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__4__Impl_in_rule__Clasico__Group__42851);
            rule__Clasico__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__5_in_rule__Clasico__Group__42854);
            rule__Clasico__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__4"


    // $ANTLR start "rule__Clasico__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1431:1: rule__Clasico__Group__4__Impl : ( 'penalizacion' ) ;
    public final void rule__Clasico__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1435:1: ( ( 'penalizacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1436:1: ( 'penalizacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1436:1: ( 'penalizacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1437:1: 'penalizacion'
            {
             before(grammarAccess.getClasicoAccess().getPenalizacionKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Clasico__Group__4__Impl2882); 
             after(grammarAccess.getClasicoAccess().getPenalizacionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__4__Impl"


    // $ANTLR start "rule__Clasico__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1450:1: rule__Clasico__Group__5 : rule__Clasico__Group__5__Impl rule__Clasico__Group__6 ;
    public final void rule__Clasico__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1454:1: ( rule__Clasico__Group__5__Impl rule__Clasico__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1455:2: rule__Clasico__Group__5__Impl rule__Clasico__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__5__Impl_in_rule__Clasico__Group__52913);
            rule__Clasico__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__6_in_rule__Clasico__Group__52916);
            rule__Clasico__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__5"


    // $ANTLR start "rule__Clasico__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1462:1: rule__Clasico__Group__5__Impl : ( ( rule__Clasico__PenalizacionAssignment_5 ) ) ;
    public final void rule__Clasico__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1466:1: ( ( ( rule__Clasico__PenalizacionAssignment_5 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1467:1: ( ( rule__Clasico__PenalizacionAssignment_5 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1467:1: ( ( rule__Clasico__PenalizacionAssignment_5 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1468:1: ( rule__Clasico__PenalizacionAssignment_5 )
            {
             before(grammarAccess.getClasicoAccess().getPenalizacionAssignment_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1469:1: ( rule__Clasico__PenalizacionAssignment_5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1469:2: rule__Clasico__PenalizacionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__PenalizacionAssignment_5_in_rule__Clasico__Group__5__Impl2943);
            rule__Clasico__PenalizacionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClasicoAccess().getPenalizacionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__5__Impl"


    // $ANTLR start "rule__Clasico__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1479:1: rule__Clasico__Group__6 : rule__Clasico__Group__6__Impl rule__Clasico__Group__7 ;
    public final void rule__Clasico__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1483:1: ( rule__Clasico__Group__6__Impl rule__Clasico__Group__7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1484:2: rule__Clasico__Group__6__Impl rule__Clasico__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__6__Impl_in_rule__Clasico__Group__62973);
            rule__Clasico__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__7_in_rule__Clasico__Group__62976);
            rule__Clasico__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__6"


    // $ANTLR start "rule__Clasico__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1491:1: rule__Clasico__Group__6__Impl : ( 'ejercicios' ) ;
    public final void rule__Clasico__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1495:1: ( ( 'ejercicios' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1496:1: ( 'ejercicios' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1496:1: ( 'ejercicios' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1497:1: 'ejercicios'
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Clasico__Group__6__Impl3004); 
             after(grammarAccess.getClasicoAccess().getEjerciciosKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__6__Impl"


    // $ANTLR start "rule__Clasico__Group__7"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1510:1: rule__Clasico__Group__7 : rule__Clasico__Group__7__Impl rule__Clasico__Group__8 ;
    public final void rule__Clasico__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1514:1: ( rule__Clasico__Group__7__Impl rule__Clasico__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1515:2: rule__Clasico__Group__7__Impl rule__Clasico__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__7__Impl_in_rule__Clasico__Group__73035);
            rule__Clasico__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__8_in_rule__Clasico__Group__73038);
            rule__Clasico__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__7"


    // $ANTLR start "rule__Clasico__Group__7__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1522:1: rule__Clasico__Group__7__Impl : ( '{' ) ;
    public final void rule__Clasico__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1526:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1527:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1527:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1528:1: '{'
            {
             before(grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Clasico__Group__7__Impl3066); 
             after(grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__7__Impl"


    // $ANTLR start "rule__Clasico__Group__8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1541:1: rule__Clasico__Group__8 : rule__Clasico__Group__8__Impl rule__Clasico__Group__9 ;
    public final void rule__Clasico__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1545:1: ( rule__Clasico__Group__8__Impl rule__Clasico__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1546:2: rule__Clasico__Group__8__Impl rule__Clasico__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__8__Impl_in_rule__Clasico__Group__83097);
            rule__Clasico__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__9_in_rule__Clasico__Group__83100);
            rule__Clasico__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__8"


    // $ANTLR start "rule__Clasico__Group__8__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1553:1: rule__Clasico__Group__8__Impl : ( ( rule__Clasico__EjerciciosAssignment_8 ) ) ;
    public final void rule__Clasico__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1557:1: ( ( ( rule__Clasico__EjerciciosAssignment_8 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1558:1: ( ( rule__Clasico__EjerciciosAssignment_8 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1558:1: ( ( rule__Clasico__EjerciciosAssignment_8 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1559:1: ( rule__Clasico__EjerciciosAssignment_8 )
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosAssignment_8()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1560:1: ( rule__Clasico__EjerciciosAssignment_8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1560:2: rule__Clasico__EjerciciosAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__EjerciciosAssignment_8_in_rule__Clasico__Group__8__Impl3127);
            rule__Clasico__EjerciciosAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getClasicoAccess().getEjerciciosAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__8__Impl"


    // $ANTLR start "rule__Clasico__Group__9"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1570:1: rule__Clasico__Group__9 : rule__Clasico__Group__9__Impl rule__Clasico__Group__10 ;
    public final void rule__Clasico__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1574:1: ( rule__Clasico__Group__9__Impl rule__Clasico__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1575:2: rule__Clasico__Group__9__Impl rule__Clasico__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__9__Impl_in_rule__Clasico__Group__93157);
            rule__Clasico__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__10_in_rule__Clasico__Group__93160);
            rule__Clasico__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__9"


    // $ANTLR start "rule__Clasico__Group__9__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1582:1: rule__Clasico__Group__9__Impl : ( ( rule__Clasico__Group_9__0 )* ) ;
    public final void rule__Clasico__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1586:1: ( ( ( rule__Clasico__Group_9__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1587:1: ( ( rule__Clasico__Group_9__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1587:1: ( ( rule__Clasico__Group_9__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1588:1: ( rule__Clasico__Group_9__0 )*
            {
             before(grammarAccess.getClasicoAccess().getGroup_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1589:1: ( rule__Clasico__Group_9__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1589:2: rule__Clasico__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__0_in_rule__Clasico__Group__9__Impl3187);
            	    rule__Clasico__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClasicoAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__9__Impl"


    // $ANTLR start "rule__Clasico__Group__10"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1599:1: rule__Clasico__Group__10 : rule__Clasico__Group__10__Impl rule__Clasico__Group__11 ;
    public final void rule__Clasico__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1603:1: ( rule__Clasico__Group__10__Impl rule__Clasico__Group__11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1604:2: rule__Clasico__Group__10__Impl rule__Clasico__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__10__Impl_in_rule__Clasico__Group__103218);
            rule__Clasico__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__11_in_rule__Clasico__Group__103221);
            rule__Clasico__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__10"


    // $ANTLR start "rule__Clasico__Group__10__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1611:1: rule__Clasico__Group__10__Impl : ( '}' ) ;
    public final void rule__Clasico__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1615:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1616:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1616:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1617:1: '}'
            {
             before(grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Clasico__Group__10__Impl3249); 
             after(grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__10__Impl"


    // $ANTLR start "rule__Clasico__Group__11"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1630:1: rule__Clasico__Group__11 : rule__Clasico__Group__11__Impl ;
    public final void rule__Clasico__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1634:1: ( rule__Clasico__Group__11__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1635:2: rule__Clasico__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__11__Impl_in_rule__Clasico__Group__113280);
            rule__Clasico__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__11"


    // $ANTLR start "rule__Clasico__Group__11__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1641:1: rule__Clasico__Group__11__Impl : ( '}' ) ;
    public final void rule__Clasico__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1645:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1646:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1646:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1647:1: '}'
            {
             before(grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Clasico__Group__11__Impl3308); 
             after(grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group__11__Impl"


    // $ANTLR start "rule__Clasico__Group_9__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1684:1: rule__Clasico__Group_9__0 : rule__Clasico__Group_9__0__Impl rule__Clasico__Group_9__1 ;
    public final void rule__Clasico__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1688:1: ( rule__Clasico__Group_9__0__Impl rule__Clasico__Group_9__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1689:2: rule__Clasico__Group_9__0__Impl rule__Clasico__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__0__Impl_in_rule__Clasico__Group_9__03363);
            rule__Clasico__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__1_in_rule__Clasico__Group_9__03366);
            rule__Clasico__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group_9__0"


    // $ANTLR start "rule__Clasico__Group_9__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1696:1: rule__Clasico__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Clasico__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1700:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1701:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1701:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1702:1: ','
            {
             before(grammarAccess.getClasicoAccess().getCommaKeyword_9_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Clasico__Group_9__0__Impl3394); 
             after(grammarAccess.getClasicoAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group_9__0__Impl"


    // $ANTLR start "rule__Clasico__Group_9__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1715:1: rule__Clasico__Group_9__1 : rule__Clasico__Group_9__1__Impl ;
    public final void rule__Clasico__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1719:1: ( rule__Clasico__Group_9__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1720:2: rule__Clasico__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__1__Impl_in_rule__Clasico__Group_9__13425);
            rule__Clasico__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group_9__1"


    // $ANTLR start "rule__Clasico__Group_9__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1726:1: rule__Clasico__Group_9__1__Impl : ( ( rule__Clasico__EjerciciosAssignment_9_1 ) ) ;
    public final void rule__Clasico__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1730:1: ( ( ( rule__Clasico__EjerciciosAssignment_9_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1731:1: ( ( rule__Clasico__EjerciciosAssignment_9_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1731:1: ( ( rule__Clasico__EjerciciosAssignment_9_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1732:1: ( rule__Clasico__EjerciciosAssignment_9_1 )
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosAssignment_9_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1733:1: ( rule__Clasico__EjerciciosAssignment_9_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1733:2: rule__Clasico__EjerciciosAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__EjerciciosAssignment_9_1_in_rule__Clasico__Group_9__1__Impl3452);
            rule__Clasico__EjerciciosAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getClasicoAccess().getEjerciciosAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__Group_9__1__Impl"


    // $ANTLR start "rule__Wizard__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1747:1: rule__Wizard__Group__0 : rule__Wizard__Group__0__Impl rule__Wizard__Group__1 ;
    public final void rule__Wizard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1751:1: ( rule__Wizard__Group__0__Impl rule__Wizard__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1752:2: rule__Wizard__Group__0__Impl rule__Wizard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__0__Impl_in_rule__Wizard__Group__03486);
            rule__Wizard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__1_in_rule__Wizard__Group__03489);
            rule__Wizard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0"


    // $ANTLR start "rule__Wizard__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1759:1: rule__Wizard__Group__0__Impl : ( 'Wizard' ) ;
    public final void rule__Wizard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1763:1: ( ( 'Wizard' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1764:1: ( 'Wizard' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1764:1: ( 'Wizard' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1765:1: 'Wizard'
            {
             before(grammarAccess.getWizardAccess().getWizardKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Wizard__Group__0__Impl3517); 
             after(grammarAccess.getWizardAccess().getWizardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0__Impl"


    // $ANTLR start "rule__Wizard__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1778:1: rule__Wizard__Group__1 : rule__Wizard__Group__1__Impl rule__Wizard__Group__2 ;
    public final void rule__Wizard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1782:1: ( rule__Wizard__Group__1__Impl rule__Wizard__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1783:2: rule__Wizard__Group__1__Impl rule__Wizard__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__1__Impl_in_rule__Wizard__Group__13548);
            rule__Wizard__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__2_in_rule__Wizard__Group__13551);
            rule__Wizard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1"


    // $ANTLR start "rule__Wizard__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1790:1: rule__Wizard__Group__1__Impl : ( '{' ) ;
    public final void rule__Wizard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1794:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1795:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1795:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1796:1: '{'
            {
             before(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Wizard__Group__1__Impl3579); 
             after(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1__Impl"


    // $ANTLR start "rule__Wizard__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1809:1: rule__Wizard__Group__2 : rule__Wizard__Group__2__Impl rule__Wizard__Group__3 ;
    public final void rule__Wizard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1813:1: ( rule__Wizard__Group__2__Impl rule__Wizard__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1814:2: rule__Wizard__Group__2__Impl rule__Wizard__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__2__Impl_in_rule__Wizard__Group__23610);
            rule__Wizard__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__3_in_rule__Wizard__Group__23613);
            rule__Wizard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2"


    // $ANTLR start "rule__Wizard__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1821:1: rule__Wizard__Group__2__Impl : ( 'puntuacion' ) ;
    public final void rule__Wizard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1825:1: ( ( 'puntuacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1826:1: ( 'puntuacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1826:1: ( 'puntuacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1827:1: 'puntuacion'
            {
             before(grammarAccess.getWizardAccess().getPuntuacionKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Wizard__Group__2__Impl3641); 
             after(grammarAccess.getWizardAccess().getPuntuacionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2__Impl"


    // $ANTLR start "rule__Wizard__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1840:1: rule__Wizard__Group__3 : rule__Wizard__Group__3__Impl rule__Wizard__Group__4 ;
    public final void rule__Wizard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1844:1: ( rule__Wizard__Group__3__Impl rule__Wizard__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1845:2: rule__Wizard__Group__3__Impl rule__Wizard__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__3__Impl_in_rule__Wizard__Group__33672);
            rule__Wizard__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__4_in_rule__Wizard__Group__33675);
            rule__Wizard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3"


    // $ANTLR start "rule__Wizard__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1852:1: rule__Wizard__Group__3__Impl : ( ( rule__Wizard__PuntuacionAssignment_3 ) ) ;
    public final void rule__Wizard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1856:1: ( ( ( rule__Wizard__PuntuacionAssignment_3 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1857:1: ( ( rule__Wizard__PuntuacionAssignment_3 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1857:1: ( ( rule__Wizard__PuntuacionAssignment_3 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1858:1: ( rule__Wizard__PuntuacionAssignment_3 )
            {
             before(grammarAccess.getWizardAccess().getPuntuacionAssignment_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1859:1: ( rule__Wizard__PuntuacionAssignment_3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1859:2: rule__Wizard__PuntuacionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__PuntuacionAssignment_3_in_rule__Wizard__Group__3__Impl3702);
            rule__Wizard__PuntuacionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getPuntuacionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3__Impl"


    // $ANTLR start "rule__Wizard__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1869:1: rule__Wizard__Group__4 : rule__Wizard__Group__4__Impl rule__Wizard__Group__5 ;
    public final void rule__Wizard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1873:1: ( rule__Wizard__Group__4__Impl rule__Wizard__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1874:2: rule__Wizard__Group__4__Impl rule__Wizard__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__4__Impl_in_rule__Wizard__Group__43732);
            rule__Wizard__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__5_in_rule__Wizard__Group__43735);
            rule__Wizard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4"


    // $ANTLR start "rule__Wizard__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1881:1: rule__Wizard__Group__4__Impl : ( 'penalizacion' ) ;
    public final void rule__Wizard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1885:1: ( ( 'penalizacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1886:1: ( 'penalizacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1886:1: ( 'penalizacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1887:1: 'penalizacion'
            {
             before(grammarAccess.getWizardAccess().getPenalizacionKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Wizard__Group__4__Impl3763); 
             after(grammarAccess.getWizardAccess().getPenalizacionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4__Impl"


    // $ANTLR start "rule__Wizard__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1900:1: rule__Wizard__Group__5 : rule__Wizard__Group__5__Impl rule__Wizard__Group__6 ;
    public final void rule__Wizard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1904:1: ( rule__Wizard__Group__5__Impl rule__Wizard__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1905:2: rule__Wizard__Group__5__Impl rule__Wizard__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__5__Impl_in_rule__Wizard__Group__53794);
            rule__Wizard__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__6_in_rule__Wizard__Group__53797);
            rule__Wizard__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__5"


    // $ANTLR start "rule__Wizard__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1912:1: rule__Wizard__Group__5__Impl : ( ( rule__Wizard__PenalizacionAssignment_5 ) ) ;
    public final void rule__Wizard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1916:1: ( ( ( rule__Wizard__PenalizacionAssignment_5 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1917:1: ( ( rule__Wizard__PenalizacionAssignment_5 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1917:1: ( ( rule__Wizard__PenalizacionAssignment_5 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1918:1: ( rule__Wizard__PenalizacionAssignment_5 )
            {
             before(grammarAccess.getWizardAccess().getPenalizacionAssignment_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1919:1: ( rule__Wizard__PenalizacionAssignment_5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1919:2: rule__Wizard__PenalizacionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__PenalizacionAssignment_5_in_rule__Wizard__Group__5__Impl3824);
            rule__Wizard__PenalizacionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getPenalizacionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__5__Impl"


    // $ANTLR start "rule__Wizard__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1929:1: rule__Wizard__Group__6 : rule__Wizard__Group__6__Impl rule__Wizard__Group__7 ;
    public final void rule__Wizard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1933:1: ( rule__Wizard__Group__6__Impl rule__Wizard__Group__7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1934:2: rule__Wizard__Group__6__Impl rule__Wizard__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__6__Impl_in_rule__Wizard__Group__63854);
            rule__Wizard__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__7_in_rule__Wizard__Group__63857);
            rule__Wizard__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__6"


    // $ANTLR start "rule__Wizard__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1941:1: rule__Wizard__Group__6__Impl : ( 'ejercicios' ) ;
    public final void rule__Wizard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1945:1: ( ( 'ejercicios' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1946:1: ( 'ejercicios' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1946:1: ( 'ejercicios' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1947:1: 'ejercicios'
            {
             before(grammarAccess.getWizardAccess().getEjerciciosKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Wizard__Group__6__Impl3885); 
             after(grammarAccess.getWizardAccess().getEjerciciosKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__6__Impl"


    // $ANTLR start "rule__Wizard__Group__7"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1960:1: rule__Wizard__Group__7 : rule__Wizard__Group__7__Impl rule__Wizard__Group__8 ;
    public final void rule__Wizard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1964:1: ( rule__Wizard__Group__7__Impl rule__Wizard__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1965:2: rule__Wizard__Group__7__Impl rule__Wizard__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__7__Impl_in_rule__Wizard__Group__73916);
            rule__Wizard__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__8_in_rule__Wizard__Group__73919);
            rule__Wizard__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__7"


    // $ANTLR start "rule__Wizard__Group__7__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1972:1: rule__Wizard__Group__7__Impl : ( '{' ) ;
    public final void rule__Wizard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1976:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1977:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1977:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1978:1: '{'
            {
             before(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Wizard__Group__7__Impl3947); 
             after(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__7__Impl"


    // $ANTLR start "rule__Wizard__Group__8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1991:1: rule__Wizard__Group__8 : rule__Wizard__Group__8__Impl rule__Wizard__Group__9 ;
    public final void rule__Wizard__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1995:1: ( rule__Wizard__Group__8__Impl rule__Wizard__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1996:2: rule__Wizard__Group__8__Impl rule__Wizard__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__8__Impl_in_rule__Wizard__Group__83978);
            rule__Wizard__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__9_in_rule__Wizard__Group__83981);
            rule__Wizard__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__8"


    // $ANTLR start "rule__Wizard__Group__8__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2003:1: rule__Wizard__Group__8__Impl : ( ( rule__Wizard__EjerciciosAssignment_8 ) ) ;
    public final void rule__Wizard__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2007:1: ( ( ( rule__Wizard__EjerciciosAssignment_8 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2008:1: ( ( rule__Wizard__EjerciciosAssignment_8 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2008:1: ( ( rule__Wizard__EjerciciosAssignment_8 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2009:1: ( rule__Wizard__EjerciciosAssignment_8 )
            {
             before(grammarAccess.getWizardAccess().getEjerciciosAssignment_8()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2010:1: ( rule__Wizard__EjerciciosAssignment_8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2010:2: rule__Wizard__EjerciciosAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__EjerciciosAssignment_8_in_rule__Wizard__Group__8__Impl4008);
            rule__Wizard__EjerciciosAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getEjerciciosAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__8__Impl"


    // $ANTLR start "rule__Wizard__Group__9"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2020:1: rule__Wizard__Group__9 : rule__Wizard__Group__9__Impl rule__Wizard__Group__10 ;
    public final void rule__Wizard__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2024:1: ( rule__Wizard__Group__9__Impl rule__Wizard__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2025:2: rule__Wizard__Group__9__Impl rule__Wizard__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__9__Impl_in_rule__Wizard__Group__94038);
            rule__Wizard__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__10_in_rule__Wizard__Group__94041);
            rule__Wizard__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__9"


    // $ANTLR start "rule__Wizard__Group__9__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2032:1: rule__Wizard__Group__9__Impl : ( ( rule__Wizard__Group_9__0 )* ) ;
    public final void rule__Wizard__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2036:1: ( ( ( rule__Wizard__Group_9__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2037:1: ( ( rule__Wizard__Group_9__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2037:1: ( ( rule__Wizard__Group_9__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2038:1: ( rule__Wizard__Group_9__0 )*
            {
             before(grammarAccess.getWizardAccess().getGroup_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2039:1: ( rule__Wizard__Group_9__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2039:2: rule__Wizard__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__0_in_rule__Wizard__Group__9__Impl4068);
            	    rule__Wizard__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getWizardAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__9__Impl"


    // $ANTLR start "rule__Wizard__Group__10"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2049:1: rule__Wizard__Group__10 : rule__Wizard__Group__10__Impl rule__Wizard__Group__11 ;
    public final void rule__Wizard__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2053:1: ( rule__Wizard__Group__10__Impl rule__Wizard__Group__11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2054:2: rule__Wizard__Group__10__Impl rule__Wizard__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__10__Impl_in_rule__Wizard__Group__104099);
            rule__Wizard__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__11_in_rule__Wizard__Group__104102);
            rule__Wizard__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__10"


    // $ANTLR start "rule__Wizard__Group__10__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2061:1: rule__Wizard__Group__10__Impl : ( '}' ) ;
    public final void rule__Wizard__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2065:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2066:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2066:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2067:1: '}'
            {
             before(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Wizard__Group__10__Impl4130); 
             after(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__10__Impl"


    // $ANTLR start "rule__Wizard__Group__11"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2080:1: rule__Wizard__Group__11 : rule__Wizard__Group__11__Impl ;
    public final void rule__Wizard__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2084:1: ( rule__Wizard__Group__11__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2085:2: rule__Wizard__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__11__Impl_in_rule__Wizard__Group__114161);
            rule__Wizard__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__11"


    // $ANTLR start "rule__Wizard__Group__11__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2091:1: rule__Wizard__Group__11__Impl : ( '}' ) ;
    public final void rule__Wizard__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2095:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2096:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2096:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2097:1: '}'
            {
             before(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Wizard__Group__11__Impl4189); 
             after(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__11__Impl"


    // $ANTLR start "rule__Wizard__Group_9__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2134:1: rule__Wizard__Group_9__0 : rule__Wizard__Group_9__0__Impl rule__Wizard__Group_9__1 ;
    public final void rule__Wizard__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2138:1: ( rule__Wizard__Group_9__0__Impl rule__Wizard__Group_9__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2139:2: rule__Wizard__Group_9__0__Impl rule__Wizard__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__0__Impl_in_rule__Wizard__Group_9__04244);
            rule__Wizard__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__1_in_rule__Wizard__Group_9__04247);
            rule__Wizard__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_9__0"


    // $ANTLR start "rule__Wizard__Group_9__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2146:1: rule__Wizard__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Wizard__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2150:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2151:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2151:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2152:1: ','
            {
             before(grammarAccess.getWizardAccess().getCommaKeyword_9_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Wizard__Group_9__0__Impl4275); 
             after(grammarAccess.getWizardAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_9__0__Impl"


    // $ANTLR start "rule__Wizard__Group_9__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2165:1: rule__Wizard__Group_9__1 : rule__Wizard__Group_9__1__Impl ;
    public final void rule__Wizard__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2169:1: ( rule__Wizard__Group_9__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2170:2: rule__Wizard__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__1__Impl_in_rule__Wizard__Group_9__14306);
            rule__Wizard__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_9__1"


    // $ANTLR start "rule__Wizard__Group_9__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2176:1: rule__Wizard__Group_9__1__Impl : ( ( rule__Wizard__EjerciciosAssignment_9_1 ) ) ;
    public final void rule__Wizard__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2180:1: ( ( ( rule__Wizard__EjerciciosAssignment_9_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2181:1: ( ( rule__Wizard__EjerciciosAssignment_9_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2181:1: ( ( rule__Wizard__EjerciciosAssignment_9_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2182:1: ( rule__Wizard__EjerciciosAssignment_9_1 )
            {
             before(grammarAccess.getWizardAccess().getEjerciciosAssignment_9_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2183:1: ( rule__Wizard__EjerciciosAssignment_9_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2183:2: rule__Wizard__EjerciciosAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__EjerciciosAssignment_9_1_in_rule__Wizard__Group_9__1__Impl4333);
            rule__Wizard__EjerciciosAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getEjerciciosAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_9__1__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2197:1: rule__WizardAdaptativo__Group__0 : rule__WizardAdaptativo__Group__0__Impl rule__WizardAdaptativo__Group__1 ;
    public final void rule__WizardAdaptativo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2201:1: ( rule__WizardAdaptativo__Group__0__Impl rule__WizardAdaptativo__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2202:2: rule__WizardAdaptativo__Group__0__Impl rule__WizardAdaptativo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__0__Impl_in_rule__WizardAdaptativo__Group__04367);
            rule__WizardAdaptativo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__1_in_rule__WizardAdaptativo__Group__04370);
            rule__WizardAdaptativo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__0"


    // $ANTLR start "rule__WizardAdaptativo__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2209:1: rule__WizardAdaptativo__Group__0__Impl : ( 'WizardAdaptativo' ) ;
    public final void rule__WizardAdaptativo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2213:1: ( ( 'WizardAdaptativo' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2214:1: ( 'WizardAdaptativo' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2214:1: ( 'WizardAdaptativo' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2215:1: 'WizardAdaptativo'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getWizardAdaptativoKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__WizardAdaptativo__Group__0__Impl4398); 
             after(grammarAccess.getWizardAdaptativoAccess().getWizardAdaptativoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__0__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2228:1: rule__WizardAdaptativo__Group__1 : rule__WizardAdaptativo__Group__1__Impl rule__WizardAdaptativo__Group__2 ;
    public final void rule__WizardAdaptativo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2232:1: ( rule__WizardAdaptativo__Group__1__Impl rule__WizardAdaptativo__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2233:2: rule__WizardAdaptativo__Group__1__Impl rule__WizardAdaptativo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__1__Impl_in_rule__WizardAdaptativo__Group__14429);
            rule__WizardAdaptativo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__2_in_rule__WizardAdaptativo__Group__14432);
            rule__WizardAdaptativo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__1"


    // $ANTLR start "rule__WizardAdaptativo__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2240:1: rule__WizardAdaptativo__Group__1__Impl : ( '{' ) ;
    public final void rule__WizardAdaptativo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2244:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2245:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2245:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2246:1: '{'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WizardAdaptativo__Group__1__Impl4460); 
             after(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__1__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2259:1: rule__WizardAdaptativo__Group__2 : rule__WizardAdaptativo__Group__2__Impl rule__WizardAdaptativo__Group__3 ;
    public final void rule__WizardAdaptativo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2263:1: ( rule__WizardAdaptativo__Group__2__Impl rule__WizardAdaptativo__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2264:2: rule__WizardAdaptativo__Group__2__Impl rule__WizardAdaptativo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__2__Impl_in_rule__WizardAdaptativo__Group__24491);
            rule__WizardAdaptativo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__3_in_rule__WizardAdaptativo__Group__24494);
            rule__WizardAdaptativo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__2"


    // $ANTLR start "rule__WizardAdaptativo__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2271:1: rule__WizardAdaptativo__Group__2__Impl : ( 'puntuacion' ) ;
    public final void rule__WizardAdaptativo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2275:1: ( ( 'puntuacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2276:1: ( 'puntuacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2276:1: ( 'puntuacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2277:1: 'puntuacion'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPuntuacionKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__WizardAdaptativo__Group__2__Impl4522); 
             after(grammarAccess.getWizardAdaptativoAccess().getPuntuacionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__2__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2290:1: rule__WizardAdaptativo__Group__3 : rule__WizardAdaptativo__Group__3__Impl rule__WizardAdaptativo__Group__4 ;
    public final void rule__WizardAdaptativo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2294:1: ( rule__WizardAdaptativo__Group__3__Impl rule__WizardAdaptativo__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2295:2: rule__WizardAdaptativo__Group__3__Impl rule__WizardAdaptativo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__3__Impl_in_rule__WizardAdaptativo__Group__34553);
            rule__WizardAdaptativo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__4_in_rule__WizardAdaptativo__Group__34556);
            rule__WizardAdaptativo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__3"


    // $ANTLR start "rule__WizardAdaptativo__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2302:1: rule__WizardAdaptativo__Group__3__Impl : ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) ) ;
    public final void rule__WizardAdaptativo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2306:1: ( ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2307:1: ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2307:1: ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2308:1: ( rule__WizardAdaptativo__PuntuacionAssignment_3 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPuntuacionAssignment_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2309:1: ( rule__WizardAdaptativo__PuntuacionAssignment_3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2309:2: rule__WizardAdaptativo__PuntuacionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__PuntuacionAssignment_3_in_rule__WizardAdaptativo__Group__3__Impl4583);
            rule__WizardAdaptativo__PuntuacionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getPuntuacionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__3__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2319:1: rule__WizardAdaptativo__Group__4 : rule__WizardAdaptativo__Group__4__Impl rule__WizardAdaptativo__Group__5 ;
    public final void rule__WizardAdaptativo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2323:1: ( rule__WizardAdaptativo__Group__4__Impl rule__WizardAdaptativo__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2324:2: rule__WizardAdaptativo__Group__4__Impl rule__WizardAdaptativo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__4__Impl_in_rule__WizardAdaptativo__Group__44613);
            rule__WizardAdaptativo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__5_in_rule__WizardAdaptativo__Group__44616);
            rule__WizardAdaptativo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__4"


    // $ANTLR start "rule__WizardAdaptativo__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2331:1: rule__WizardAdaptativo__Group__4__Impl : ( 'penalizacion' ) ;
    public final void rule__WizardAdaptativo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2335:1: ( ( 'penalizacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2336:1: ( 'penalizacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2336:1: ( 'penalizacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2337:1: 'penalizacion'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPenalizacionKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__WizardAdaptativo__Group__4__Impl4644); 
             after(grammarAccess.getWizardAdaptativoAccess().getPenalizacionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__4__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2350:1: rule__WizardAdaptativo__Group__5 : rule__WizardAdaptativo__Group__5__Impl rule__WizardAdaptativo__Group__6 ;
    public final void rule__WizardAdaptativo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2354:1: ( rule__WizardAdaptativo__Group__5__Impl rule__WizardAdaptativo__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2355:2: rule__WizardAdaptativo__Group__5__Impl rule__WizardAdaptativo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__5__Impl_in_rule__WizardAdaptativo__Group__54675);
            rule__WizardAdaptativo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__6_in_rule__WizardAdaptativo__Group__54678);
            rule__WizardAdaptativo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__5"


    // $ANTLR start "rule__WizardAdaptativo__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2362:1: rule__WizardAdaptativo__Group__5__Impl : ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) ) ;
    public final void rule__WizardAdaptativo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2366:1: ( ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2367:1: ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2367:1: ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2368:1: ( rule__WizardAdaptativo__PenalizacionAssignment_5 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPenalizacionAssignment_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2369:1: ( rule__WizardAdaptativo__PenalizacionAssignment_5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2369:2: rule__WizardAdaptativo__PenalizacionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__PenalizacionAssignment_5_in_rule__WizardAdaptativo__Group__5__Impl4705);
            rule__WizardAdaptativo__PenalizacionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getPenalizacionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__5__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2379:1: rule__WizardAdaptativo__Group__6 : rule__WizardAdaptativo__Group__6__Impl rule__WizardAdaptativo__Group__7 ;
    public final void rule__WizardAdaptativo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2383:1: ( rule__WizardAdaptativo__Group__6__Impl rule__WizardAdaptativo__Group__7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2384:2: rule__WizardAdaptativo__Group__6__Impl rule__WizardAdaptativo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__6__Impl_in_rule__WizardAdaptativo__Group__64735);
            rule__WizardAdaptativo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__7_in_rule__WizardAdaptativo__Group__64738);
            rule__WizardAdaptativo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__6"


    // $ANTLR start "rule__WizardAdaptativo__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2391:1: rule__WizardAdaptativo__Group__6__Impl : ( 'ejercicios' ) ;
    public final void rule__WizardAdaptativo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2395:1: ( ( 'ejercicios' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2396:1: ( 'ejercicios' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2396:1: ( 'ejercicios' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2397:1: 'ejercicios'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__WizardAdaptativo__Group__6__Impl4766); 
             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__6__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__7"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2410:1: rule__WizardAdaptativo__Group__7 : rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8 ;
    public final void rule__WizardAdaptativo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2414:1: ( rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2415:2: rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__7__Impl_in_rule__WizardAdaptativo__Group__74797);
            rule__WizardAdaptativo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__8_in_rule__WizardAdaptativo__Group__74800);
            rule__WizardAdaptativo__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__7"


    // $ANTLR start "rule__WizardAdaptativo__Group__7__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2422:1: rule__WizardAdaptativo__Group__7__Impl : ( '{' ) ;
    public final void rule__WizardAdaptativo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2426:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2427:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2427:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2428:1: '{'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WizardAdaptativo__Group__7__Impl4828); 
             after(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__7__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2441:1: rule__WizardAdaptativo__Group__8 : rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9 ;
    public final void rule__WizardAdaptativo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2445:1: ( rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2446:2: rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__8__Impl_in_rule__WizardAdaptativo__Group__84859);
            rule__WizardAdaptativo__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__9_in_rule__WizardAdaptativo__Group__84862);
            rule__WizardAdaptativo__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__8"


    // $ANTLR start "rule__WizardAdaptativo__Group__8__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2453:1: rule__WizardAdaptativo__Group__8__Impl : ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) ) ;
    public final void rule__WizardAdaptativo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2457:1: ( ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2458:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2458:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2459:1: ( rule__WizardAdaptativo__EjerciciosAssignment_8 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_8()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2460:1: ( rule__WizardAdaptativo__EjerciciosAssignment_8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2460:2: rule__WizardAdaptativo__EjerciciosAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_8_in_rule__WizardAdaptativo__Group__8__Impl4889);
            rule__WizardAdaptativo__EjerciciosAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__8__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__9"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2470:1: rule__WizardAdaptativo__Group__9 : rule__WizardAdaptativo__Group__9__Impl rule__WizardAdaptativo__Group__10 ;
    public final void rule__WizardAdaptativo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2474:1: ( rule__WizardAdaptativo__Group__9__Impl rule__WizardAdaptativo__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2475:2: rule__WizardAdaptativo__Group__9__Impl rule__WizardAdaptativo__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__9__Impl_in_rule__WizardAdaptativo__Group__94919);
            rule__WizardAdaptativo__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__10_in_rule__WizardAdaptativo__Group__94922);
            rule__WizardAdaptativo__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__9"


    // $ANTLR start "rule__WizardAdaptativo__Group__9__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2482:1: rule__WizardAdaptativo__Group__9__Impl : ( ( rule__WizardAdaptativo__Group_9__0 )* ) ;
    public final void rule__WizardAdaptativo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2486:1: ( ( ( rule__WizardAdaptativo__Group_9__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2487:1: ( ( rule__WizardAdaptativo__Group_9__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2487:1: ( ( rule__WizardAdaptativo__Group_9__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2488:1: ( rule__WizardAdaptativo__Group_9__0 )*
            {
             before(grammarAccess.getWizardAdaptativoAccess().getGroup_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2489:1: ( rule__WizardAdaptativo__Group_9__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2489:2: rule__WizardAdaptativo__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__0_in_rule__WizardAdaptativo__Group__9__Impl4949);
            	    rule__WizardAdaptativo__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWizardAdaptativoAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__9__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__10"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2499:1: rule__WizardAdaptativo__Group__10 : rule__WizardAdaptativo__Group__10__Impl rule__WizardAdaptativo__Group__11 ;
    public final void rule__WizardAdaptativo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2503:1: ( rule__WizardAdaptativo__Group__10__Impl rule__WizardAdaptativo__Group__11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2504:2: rule__WizardAdaptativo__Group__10__Impl rule__WizardAdaptativo__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__10__Impl_in_rule__WizardAdaptativo__Group__104980);
            rule__WizardAdaptativo__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__11_in_rule__WizardAdaptativo__Group__104983);
            rule__WizardAdaptativo__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__10"


    // $ANTLR start "rule__WizardAdaptativo__Group__10__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2511:1: rule__WizardAdaptativo__Group__10__Impl : ( '}' ) ;
    public final void rule__WizardAdaptativo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2515:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2516:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2516:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2517:1: '}'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__WizardAdaptativo__Group__10__Impl5011); 
             after(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__10__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group__11"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2530:1: rule__WizardAdaptativo__Group__11 : rule__WizardAdaptativo__Group__11__Impl ;
    public final void rule__WizardAdaptativo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2534:1: ( rule__WizardAdaptativo__Group__11__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2535:2: rule__WizardAdaptativo__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__11__Impl_in_rule__WizardAdaptativo__Group__115042);
            rule__WizardAdaptativo__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__11"


    // $ANTLR start "rule__WizardAdaptativo__Group__11__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2541:1: rule__WizardAdaptativo__Group__11__Impl : ( '}' ) ;
    public final void rule__WizardAdaptativo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2545:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2546:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2546:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2547:1: '}'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__WizardAdaptativo__Group__11__Impl5070); 
             after(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__11__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_9__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2584:1: rule__WizardAdaptativo__Group_9__0 : rule__WizardAdaptativo__Group_9__0__Impl rule__WizardAdaptativo__Group_9__1 ;
    public final void rule__WizardAdaptativo__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2588:1: ( rule__WizardAdaptativo__Group_9__0__Impl rule__WizardAdaptativo__Group_9__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2589:2: rule__WizardAdaptativo__Group_9__0__Impl rule__WizardAdaptativo__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__0__Impl_in_rule__WizardAdaptativo__Group_9__05125);
            rule__WizardAdaptativo__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__1_in_rule__WizardAdaptativo__Group_9__05128);
            rule__WizardAdaptativo__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_9__0"


    // $ANTLR start "rule__WizardAdaptativo__Group_9__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2596:1: rule__WizardAdaptativo__Group_9__0__Impl : ( ',' ) ;
    public final void rule__WizardAdaptativo__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2600:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2601:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2601:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2602:1: ','
            {
             before(grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_9_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__WizardAdaptativo__Group_9__0__Impl5156); 
             after(grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_9__0__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_9__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2615:1: rule__WizardAdaptativo__Group_9__1 : rule__WizardAdaptativo__Group_9__1__Impl ;
    public final void rule__WizardAdaptativo__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2619:1: ( rule__WizardAdaptativo__Group_9__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2620:2: rule__WizardAdaptativo__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__1__Impl_in_rule__WizardAdaptativo__Group_9__15187);
            rule__WizardAdaptativo__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_9__1"


    // $ANTLR start "rule__WizardAdaptativo__Group_9__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2626:1: rule__WizardAdaptativo__Group_9__1__Impl : ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) ) ;
    public final void rule__WizardAdaptativo__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2630:1: ( ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2631:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2631:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2632:1: ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_9_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2633:1: ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2633:2: rule__WizardAdaptativo__EjerciciosAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_9_1_in_rule__WizardAdaptativo__Group_9__1__Impl5214);
            rule__WizardAdaptativo__EjerciciosAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_9__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2647:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2651:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2652:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05248);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05251);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2659:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2663:1: ( ( ( '-' )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2664:1: ( ( '-' )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2664:1: ( ( '-' )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2665:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2666:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2667:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EInt__Group__0__Impl5280); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2678:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2682:1: ( rule__EInt__Group__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2683:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15313);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2689:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2693:1: ( ( RULE_INT ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2694:1: ( RULE_INT )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2694:1: ( RULE_INT )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2695:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5340); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2710:1: rule__RespuestaUnica__Group__0 : rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1 ;
    public final void rule__RespuestaUnica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2714:1: ( rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2715:2: rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__0__Impl_in_rule__RespuestaUnica__Group__05373);
            rule__RespuestaUnica__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__1_in_rule__RespuestaUnica__Group__05376);
            rule__RespuestaUnica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__0"


    // $ANTLR start "rule__RespuestaUnica__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2722:1: rule__RespuestaUnica__Group__0__Impl : ( () ) ;
    public final void rule__RespuestaUnica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2726:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2727:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2727:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2728:1: ()
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2729:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2731:1: 
            {
            }

             after(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__0__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2741:1: rule__RespuestaUnica__Group__1 : rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2 ;
    public final void rule__RespuestaUnica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2745:1: ( rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2746:2: rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__1__Impl_in_rule__RespuestaUnica__Group__15434);
            rule__RespuestaUnica__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__2_in_rule__RespuestaUnica__Group__15437);
            rule__RespuestaUnica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__1"


    // $ANTLR start "rule__RespuestaUnica__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2753:1: rule__RespuestaUnica__Group__1__Impl : ( 'RespuestaUnica' ) ;
    public final void rule__RespuestaUnica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2757:1: ( ( 'RespuestaUnica' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2758:1: ( 'RespuestaUnica' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2758:1: ( 'RespuestaUnica' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2759:1: 'RespuestaUnica'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RespuestaUnica__Group__1__Impl5465); 
             after(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__1__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2772:1: rule__RespuestaUnica__Group__2 : rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3 ;
    public final void rule__RespuestaUnica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2776:1: ( rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2777:2: rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__2__Impl_in_rule__RespuestaUnica__Group__25496);
            rule__RespuestaUnica__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__3_in_rule__RespuestaUnica__Group__25499);
            rule__RespuestaUnica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__2"


    // $ANTLR start "rule__RespuestaUnica__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2784:1: rule__RespuestaUnica__Group__2__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2788:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2789:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2789:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2790:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group__2__Impl5527); 
             after(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__2__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2803:1: rule__RespuestaUnica__Group__3 : rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4 ;
    public final void rule__RespuestaUnica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2807:1: ( rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2808:2: rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__3__Impl_in_rule__RespuestaUnica__Group__35558);
            rule__RespuestaUnica__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__4_in_rule__RespuestaUnica__Group__35561);
            rule__RespuestaUnica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__3"


    // $ANTLR start "rule__RespuestaUnica__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2815:1: rule__RespuestaUnica__Group__3__Impl : ( ( rule__RespuestaUnica__Group_3__0 )? ) ;
    public final void rule__RespuestaUnica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2819:1: ( ( ( rule__RespuestaUnica__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2820:1: ( ( rule__RespuestaUnica__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2820:1: ( ( rule__RespuestaUnica__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2821:1: ( rule__RespuestaUnica__Group_3__0 )?
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2822:1: ( rule__RespuestaUnica__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2822:2: rule__RespuestaUnica__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__0_in_rule__RespuestaUnica__Group__3__Impl5588);
                    rule__RespuestaUnica__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRespuestaUnicaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__3__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2832:1: rule__RespuestaUnica__Group__4 : rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5 ;
    public final void rule__RespuestaUnica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2836:1: ( rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2837:2: rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__4__Impl_in_rule__RespuestaUnica__Group__45619);
            rule__RespuestaUnica__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__5_in_rule__RespuestaUnica__Group__45622);
            rule__RespuestaUnica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__4"


    // $ANTLR start "rule__RespuestaUnica__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2844:1: rule__RespuestaUnica__Group__4__Impl : ( ( rule__RespuestaUnica__Group_4__0 )? ) ;
    public final void rule__RespuestaUnica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2848:1: ( ( ( rule__RespuestaUnica__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2849:1: ( ( rule__RespuestaUnica__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2849:1: ( ( rule__RespuestaUnica__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2850:1: ( rule__RespuestaUnica__Group_4__0 )?
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2851:1: ( rule__RespuestaUnica__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2851:2: rule__RespuestaUnica__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__0_in_rule__RespuestaUnica__Group__4__Impl5649);
                    rule__RespuestaUnica__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRespuestaUnicaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__4__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2861:1: rule__RespuestaUnica__Group__5 : rule__RespuestaUnica__Group__5__Impl ;
    public final void rule__RespuestaUnica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2865:1: ( rule__RespuestaUnica__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2866:2: rule__RespuestaUnica__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__5__Impl_in_rule__RespuestaUnica__Group__55680);
            rule__RespuestaUnica__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__5"


    // $ANTLR start "rule__RespuestaUnica__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2872:1: rule__RespuestaUnica__Group__5__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2876:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2877:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2877:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2878:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RespuestaUnica__Group__5__Impl5708); 
             after(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__5__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2903:1: rule__RespuestaUnica__Group_3__0 : rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1 ;
    public final void rule__RespuestaUnica__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2907:1: ( rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2908:2: rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__0__Impl_in_rule__RespuestaUnica__Group_3__05751);
            rule__RespuestaUnica__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__1_in_rule__RespuestaUnica__Group_3__05754);
            rule__RespuestaUnica__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__0"


    // $ANTLR start "rule__RespuestaUnica__Group_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2915:1: rule__RespuestaUnica__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__RespuestaUnica__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2919:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2920:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2920:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2921:1: 'correctas'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RespuestaUnica__Group_3__0__Impl5782); 
             after(grammarAccess.getRespuestaUnicaAccess().getCorrectasKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__0__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2934:1: rule__RespuestaUnica__Group_3__1 : rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2 ;
    public final void rule__RespuestaUnica__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2938:1: ( rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2939:2: rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__1__Impl_in_rule__RespuestaUnica__Group_3__15813);
            rule__RespuestaUnica__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__2_in_rule__RespuestaUnica__Group_3__15816);
            rule__RespuestaUnica__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__1"


    // $ANTLR start "rule__RespuestaUnica__Group_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2946:1: rule__RespuestaUnica__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2950:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2951:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2951:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2952:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group_3__1__Impl5844); 
             after(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__1__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2965:1: rule__RespuestaUnica__Group_3__2 : rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3 ;
    public final void rule__RespuestaUnica__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2969:1: ( rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2970:2: rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__2__Impl_in_rule__RespuestaUnica__Group_3__25875);
            rule__RespuestaUnica__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__3_in_rule__RespuestaUnica__Group_3__25878);
            rule__RespuestaUnica__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__2"


    // $ANTLR start "rule__RespuestaUnica__Group_3__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2977:1: rule__RespuestaUnica__Group_3__2__Impl : ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) ) ;
    public final void rule__RespuestaUnica__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2981:1: ( ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2982:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2982:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2983:1: ( rule__RespuestaUnica__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2984:1: ( rule__RespuestaUnica__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2984:2: rule__RespuestaUnica__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_2_in_rule__RespuestaUnica__Group_3__2__Impl5905);
            rule__RespuestaUnica__CorrectasAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__2__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2994:1: rule__RespuestaUnica__Group_3__3 : rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4 ;
    public final void rule__RespuestaUnica__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2998:1: ( rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2999:2: rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__3__Impl_in_rule__RespuestaUnica__Group_3__35935);
            rule__RespuestaUnica__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__4_in_rule__RespuestaUnica__Group_3__35938);
            rule__RespuestaUnica__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__3"


    // $ANTLR start "rule__RespuestaUnica__Group_3__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3006:1: rule__RespuestaUnica__Group_3__3__Impl : ( ( rule__RespuestaUnica__Group_3_3__0 )* ) ;
    public final void rule__RespuestaUnica__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3010:1: ( ( ( rule__RespuestaUnica__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3011:1: ( ( rule__RespuestaUnica__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3011:1: ( ( rule__RespuestaUnica__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3012:1: ( rule__RespuestaUnica__Group_3_3__0 )*
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3013:1: ( rule__RespuestaUnica__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3013:2: rule__RespuestaUnica__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__0_in_rule__RespuestaUnica__Group_3__3__Impl5965);
            	    rule__RespuestaUnica__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRespuestaUnicaAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__3__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3023:1: rule__RespuestaUnica__Group_3__4 : rule__RespuestaUnica__Group_3__4__Impl ;
    public final void rule__RespuestaUnica__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3027:1: ( rule__RespuestaUnica__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3028:2: rule__RespuestaUnica__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__4__Impl_in_rule__RespuestaUnica__Group_3__45996);
            rule__RespuestaUnica__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__4"


    // $ANTLR start "rule__RespuestaUnica__Group_3__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3034:1: rule__RespuestaUnica__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3038:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3039:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3039:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3040:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RespuestaUnica__Group_3__4__Impl6024); 
             after(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3__4__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3063:1: rule__RespuestaUnica__Group_3_3__0 : rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1 ;
    public final void rule__RespuestaUnica__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3067:1: ( rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3068:2: rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__0__Impl_in_rule__RespuestaUnica__Group_3_3__06065);
            rule__RespuestaUnica__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__1_in_rule__RespuestaUnica__Group_3_3__06068);
            rule__RespuestaUnica__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3_3__0"


    // $ANTLR start "rule__RespuestaUnica__Group_3_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3075:1: rule__RespuestaUnica__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaUnica__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3079:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3080:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3080:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3081:1: ','
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaUnica__Group_3_3__0__Impl6096); 
             after(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3_3__0__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3094:1: rule__RespuestaUnica__Group_3_3__1 : rule__RespuestaUnica__Group_3_3__1__Impl ;
    public final void rule__RespuestaUnica__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3098:1: ( rule__RespuestaUnica__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3099:2: rule__RespuestaUnica__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__1__Impl_in_rule__RespuestaUnica__Group_3_3__16127);
            rule__RespuestaUnica__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3_3__1"


    // $ANTLR start "rule__RespuestaUnica__Group_3_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3105:1: rule__RespuestaUnica__Group_3_3__1__Impl : ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__RespuestaUnica__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3109:1: ( ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3110:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3110:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3111:1: ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3112:1: ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3112:2: rule__RespuestaUnica__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_3_1_in_rule__RespuestaUnica__Group_3_3__1__Impl6154);
            rule__RespuestaUnica__CorrectasAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_3_3__1__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_4__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3126:1: rule__RespuestaUnica__Group_4__0 : rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1 ;
    public final void rule__RespuestaUnica__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3130:1: ( rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3131:2: rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__0__Impl_in_rule__RespuestaUnica__Group_4__06188);
            rule__RespuestaUnica__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__1_in_rule__RespuestaUnica__Group_4__06191);
            rule__RespuestaUnica__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__0"


    // $ANTLR start "rule__RespuestaUnica__Group_4__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3138:1: rule__RespuestaUnica__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__RespuestaUnica__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3142:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3143:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3143:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3144:1: 'alternativas'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RespuestaUnica__Group_4__0__Impl6219); 
             after(grammarAccess.getRespuestaUnicaAccess().getAlternativasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__0__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_4__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3157:1: rule__RespuestaUnica__Group_4__1 : rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2 ;
    public final void rule__RespuestaUnica__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3161:1: ( rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3162:2: rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__1__Impl_in_rule__RespuestaUnica__Group_4__16250);
            rule__RespuestaUnica__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__2_in_rule__RespuestaUnica__Group_4__16253);
            rule__RespuestaUnica__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__1"


    // $ANTLR start "rule__RespuestaUnica__Group_4__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3169:1: rule__RespuestaUnica__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3173:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3174:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3174:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3175:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group_4__1__Impl6281); 
             after(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__1__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_4__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3188:1: rule__RespuestaUnica__Group_4__2 : rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3 ;
    public final void rule__RespuestaUnica__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3192:1: ( rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3193:2: rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__2__Impl_in_rule__RespuestaUnica__Group_4__26312);
            rule__RespuestaUnica__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__3_in_rule__RespuestaUnica__Group_4__26315);
            rule__RespuestaUnica__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__2"


    // $ANTLR start "rule__RespuestaUnica__Group_4__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3200:1: rule__RespuestaUnica__Group_4__2__Impl : ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) ) ;
    public final void rule__RespuestaUnica__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3204:1: ( ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3205:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3205:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3206:1: ( rule__RespuestaUnica__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3207:1: ( rule__RespuestaUnica__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3207:2: rule__RespuestaUnica__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_2_in_rule__RespuestaUnica__Group_4__2__Impl6342);
            rule__RespuestaUnica__AlternativasAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__2__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_4__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3217:1: rule__RespuestaUnica__Group_4__3 : rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4 ;
    public final void rule__RespuestaUnica__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3221:1: ( rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3222:2: rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__3__Impl_in_rule__RespuestaUnica__Group_4__36372);
            rule__RespuestaUnica__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__4_in_rule__RespuestaUnica__Group_4__36375);
            rule__RespuestaUnica__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__3"


    // $ANTLR start "rule__RespuestaUnica__Group_4__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3229:1: rule__RespuestaUnica__Group_4__3__Impl : ( ( rule__RespuestaUnica__Group_4_3__0 )* ) ;
    public final void rule__RespuestaUnica__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3233:1: ( ( ( rule__RespuestaUnica__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3234:1: ( ( rule__RespuestaUnica__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3234:1: ( ( rule__RespuestaUnica__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3235:1: ( rule__RespuestaUnica__Group_4_3__0 )*
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3236:1: ( rule__RespuestaUnica__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3236:2: rule__RespuestaUnica__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__0_in_rule__RespuestaUnica__Group_4__3__Impl6402);
            	    rule__RespuestaUnica__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRespuestaUnicaAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__3__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_4__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3246:1: rule__RespuestaUnica__Group_4__4 : rule__RespuestaUnica__Group_4__4__Impl ;
    public final void rule__RespuestaUnica__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3250:1: ( rule__RespuestaUnica__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3251:2: rule__RespuestaUnica__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__4__Impl_in_rule__RespuestaUnica__Group_4__46433);
            rule__RespuestaUnica__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__4"


    // $ANTLR start "rule__RespuestaUnica__Group_4__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3257:1: rule__RespuestaUnica__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3261:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3262:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3262:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3263:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RespuestaUnica__Group_4__4__Impl6461); 
             after(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4__4__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_4_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3286:1: rule__RespuestaUnica__Group_4_3__0 : rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1 ;
    public final void rule__RespuestaUnica__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3290:1: ( rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3291:2: rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__0__Impl_in_rule__RespuestaUnica__Group_4_3__06502);
            rule__RespuestaUnica__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__1_in_rule__RespuestaUnica__Group_4_3__06505);
            rule__RespuestaUnica__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4_3__0"


    // $ANTLR start "rule__RespuestaUnica__Group_4_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3298:1: rule__RespuestaUnica__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaUnica__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3302:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3303:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3303:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3304:1: ','
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaUnica__Group_4_3__0__Impl6533); 
             after(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4_3__0__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_4_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3317:1: rule__RespuestaUnica__Group_4_3__1 : rule__RespuestaUnica__Group_4_3__1__Impl ;
    public final void rule__RespuestaUnica__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3321:1: ( rule__RespuestaUnica__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3322:2: rule__RespuestaUnica__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__1__Impl_in_rule__RespuestaUnica__Group_4_3__16564);
            rule__RespuestaUnica__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4_3__1"


    // $ANTLR start "rule__RespuestaUnica__Group_4_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3328:1: rule__RespuestaUnica__Group_4_3__1__Impl : ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__RespuestaUnica__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3332:1: ( ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3333:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3333:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3334:1: ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3335:1: ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3335:2: rule__RespuestaUnica__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_3_1_in_rule__RespuestaUnica__Group_4_3__1__Impl6591);
            rule__RespuestaUnica__AlternativasAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_4_3__1__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3349:1: rule__RespuestaMultiple__Group__0 : rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1 ;
    public final void rule__RespuestaMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3353:1: ( rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3354:2: rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__0__Impl_in_rule__RespuestaMultiple__Group__06625);
            rule__RespuestaMultiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__1_in_rule__RespuestaMultiple__Group__06628);
            rule__RespuestaMultiple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__0"


    // $ANTLR start "rule__RespuestaMultiple__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3361:1: rule__RespuestaMultiple__Group__0__Impl : ( () ) ;
    public final void rule__RespuestaMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3365:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3366:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3366:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3367:1: ()
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3368:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3370:1: 
            {
            }

             after(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__0__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3380:1: rule__RespuestaMultiple__Group__1 : rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2 ;
    public final void rule__RespuestaMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3384:1: ( rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3385:2: rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__1__Impl_in_rule__RespuestaMultiple__Group__16686);
            rule__RespuestaMultiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__2_in_rule__RespuestaMultiple__Group__16689);
            rule__RespuestaMultiple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__1"


    // $ANTLR start "rule__RespuestaMultiple__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3392:1: rule__RespuestaMultiple__Group__1__Impl : ( 'RespuestaMultiple' ) ;
    public final void rule__RespuestaMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3396:1: ( ( 'RespuestaMultiple' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3397:1: ( 'RespuestaMultiple' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3397:1: ( 'RespuestaMultiple' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3398:1: 'RespuestaMultiple'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__RespuestaMultiple__Group__1__Impl6717); 
             after(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__1__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3411:1: rule__RespuestaMultiple__Group__2 : rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3 ;
    public final void rule__RespuestaMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3415:1: ( rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3416:2: rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__2__Impl_in_rule__RespuestaMultiple__Group__26748);
            rule__RespuestaMultiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__3_in_rule__RespuestaMultiple__Group__26751);
            rule__RespuestaMultiple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__2"


    // $ANTLR start "rule__RespuestaMultiple__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3423:1: rule__RespuestaMultiple__Group__2__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3427:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3428:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3428:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3429:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group__2__Impl6779); 
             after(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__2__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3442:1: rule__RespuestaMultiple__Group__3 : rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4 ;
    public final void rule__RespuestaMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3446:1: ( rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3447:2: rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__3__Impl_in_rule__RespuestaMultiple__Group__36810);
            rule__RespuestaMultiple__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__4_in_rule__RespuestaMultiple__Group__36813);
            rule__RespuestaMultiple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__3"


    // $ANTLR start "rule__RespuestaMultiple__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3454:1: rule__RespuestaMultiple__Group__3__Impl : ( ( rule__RespuestaMultiple__Group_3__0 )? ) ;
    public final void rule__RespuestaMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3458:1: ( ( ( rule__RespuestaMultiple__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3459:1: ( ( rule__RespuestaMultiple__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3459:1: ( ( rule__RespuestaMultiple__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3460:1: ( rule__RespuestaMultiple__Group_3__0 )?
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3461:1: ( rule__RespuestaMultiple__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3461:2: rule__RespuestaMultiple__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__0_in_rule__RespuestaMultiple__Group__3__Impl6840);
                    rule__RespuestaMultiple__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRespuestaMultipleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__3__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3471:1: rule__RespuestaMultiple__Group__4 : rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5 ;
    public final void rule__RespuestaMultiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3475:1: ( rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3476:2: rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__4__Impl_in_rule__RespuestaMultiple__Group__46871);
            rule__RespuestaMultiple__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__5_in_rule__RespuestaMultiple__Group__46874);
            rule__RespuestaMultiple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__4"


    // $ANTLR start "rule__RespuestaMultiple__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3483:1: rule__RespuestaMultiple__Group__4__Impl : ( ( rule__RespuestaMultiple__Group_4__0 )? ) ;
    public final void rule__RespuestaMultiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3487:1: ( ( ( rule__RespuestaMultiple__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3488:1: ( ( rule__RespuestaMultiple__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3488:1: ( ( rule__RespuestaMultiple__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3489:1: ( rule__RespuestaMultiple__Group_4__0 )?
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3490:1: ( rule__RespuestaMultiple__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3490:2: rule__RespuestaMultiple__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__0_in_rule__RespuestaMultiple__Group__4__Impl6901);
                    rule__RespuestaMultiple__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRespuestaMultipleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__4__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3500:1: rule__RespuestaMultiple__Group__5 : rule__RespuestaMultiple__Group__5__Impl ;
    public final void rule__RespuestaMultiple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3504:1: ( rule__RespuestaMultiple__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3505:2: rule__RespuestaMultiple__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__5__Impl_in_rule__RespuestaMultiple__Group__56932);
            rule__RespuestaMultiple__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__5"


    // $ANTLR start "rule__RespuestaMultiple__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3511:1: rule__RespuestaMultiple__Group__5__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3515:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3516:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3516:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3517:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RespuestaMultiple__Group__5__Impl6960); 
             after(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__5__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3542:1: rule__RespuestaMultiple__Group_3__0 : rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1 ;
    public final void rule__RespuestaMultiple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3546:1: ( rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3547:2: rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__0__Impl_in_rule__RespuestaMultiple__Group_3__07003);
            rule__RespuestaMultiple__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__1_in_rule__RespuestaMultiple__Group_3__07006);
            rule__RespuestaMultiple__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__0"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3554:1: rule__RespuestaMultiple__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__RespuestaMultiple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3558:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3559:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3559:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3560:1: 'correctas'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RespuestaMultiple__Group_3__0__Impl7034); 
             after(grammarAccess.getRespuestaMultipleAccess().getCorrectasKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__0__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3573:1: rule__RespuestaMultiple__Group_3__1 : rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2 ;
    public final void rule__RespuestaMultiple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3577:1: ( rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3578:2: rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__1__Impl_in_rule__RespuestaMultiple__Group_3__17065);
            rule__RespuestaMultiple__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__2_in_rule__RespuestaMultiple__Group_3__17068);
            rule__RespuestaMultiple__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__1"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3585:1: rule__RespuestaMultiple__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3589:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3590:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3590:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3591:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group_3__1__Impl7096); 
             after(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__1__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3604:1: rule__RespuestaMultiple__Group_3__2 : rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3 ;
    public final void rule__RespuestaMultiple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3608:1: ( rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3609:2: rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__2__Impl_in_rule__RespuestaMultiple__Group_3__27127);
            rule__RespuestaMultiple__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__3_in_rule__RespuestaMultiple__Group_3__27130);
            rule__RespuestaMultiple__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__2"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3616:1: rule__RespuestaMultiple__Group_3__2__Impl : ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) ) ;
    public final void rule__RespuestaMultiple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3620:1: ( ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3621:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3621:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3622:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3623:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3623:2: rule__RespuestaMultiple__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_2_in_rule__RespuestaMultiple__Group_3__2__Impl7157);
            rule__RespuestaMultiple__CorrectasAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__2__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3633:1: rule__RespuestaMultiple__Group_3__3 : rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4 ;
    public final void rule__RespuestaMultiple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3637:1: ( rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3638:2: rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__3__Impl_in_rule__RespuestaMultiple__Group_3__37187);
            rule__RespuestaMultiple__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__4_in_rule__RespuestaMultiple__Group_3__37190);
            rule__RespuestaMultiple__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__3"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3645:1: rule__RespuestaMultiple__Group_3__3__Impl : ( ( rule__RespuestaMultiple__Group_3_3__0 )* ) ;
    public final void rule__RespuestaMultiple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3649:1: ( ( ( rule__RespuestaMultiple__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3650:1: ( ( rule__RespuestaMultiple__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3650:1: ( ( rule__RespuestaMultiple__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3651:1: ( rule__RespuestaMultiple__Group_3_3__0 )*
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3652:1: ( rule__RespuestaMultiple__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3652:2: rule__RespuestaMultiple__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__0_in_rule__RespuestaMultiple__Group_3__3__Impl7217);
            	    rule__RespuestaMultiple__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRespuestaMultipleAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__3__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3662:1: rule__RespuestaMultiple__Group_3__4 : rule__RespuestaMultiple__Group_3__4__Impl ;
    public final void rule__RespuestaMultiple__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3666:1: ( rule__RespuestaMultiple__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3667:2: rule__RespuestaMultiple__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__4__Impl_in_rule__RespuestaMultiple__Group_3__47248);
            rule__RespuestaMultiple__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__4"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3673:1: rule__RespuestaMultiple__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3677:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3678:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3678:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3679:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RespuestaMultiple__Group_3__4__Impl7276); 
             after(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3__4__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3702:1: rule__RespuestaMultiple__Group_3_3__0 : rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1 ;
    public final void rule__RespuestaMultiple__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3706:1: ( rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3707:2: rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__0__Impl_in_rule__RespuestaMultiple__Group_3_3__07317);
            rule__RespuestaMultiple__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__1_in_rule__RespuestaMultiple__Group_3_3__07320);
            rule__RespuestaMultiple__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3_3__0"


    // $ANTLR start "rule__RespuestaMultiple__Group_3_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3714:1: rule__RespuestaMultiple__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaMultiple__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3718:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3719:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3719:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3720:1: ','
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaMultiple__Group_3_3__0__Impl7348); 
             after(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3_3__0__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3733:1: rule__RespuestaMultiple__Group_3_3__1 : rule__RespuestaMultiple__Group_3_3__1__Impl ;
    public final void rule__RespuestaMultiple__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3737:1: ( rule__RespuestaMultiple__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3738:2: rule__RespuestaMultiple__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__1__Impl_in_rule__RespuestaMultiple__Group_3_3__17379);
            rule__RespuestaMultiple__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3_3__1"


    // $ANTLR start "rule__RespuestaMultiple__Group_3_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3744:1: rule__RespuestaMultiple__Group_3_3__1__Impl : ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__RespuestaMultiple__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3748:1: ( ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3749:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3749:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3750:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3751:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3751:2: rule__RespuestaMultiple__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_3_1_in_rule__RespuestaMultiple__Group_3_3__1__Impl7406);
            rule__RespuestaMultiple__CorrectasAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_3_3__1__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3765:1: rule__RespuestaMultiple__Group_4__0 : rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1 ;
    public final void rule__RespuestaMultiple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3769:1: ( rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3770:2: rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__0__Impl_in_rule__RespuestaMultiple__Group_4__07440);
            rule__RespuestaMultiple__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__1_in_rule__RespuestaMultiple__Group_4__07443);
            rule__RespuestaMultiple__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__0"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3777:1: rule__RespuestaMultiple__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__RespuestaMultiple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3781:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3782:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3782:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3783:1: 'alternativas'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RespuestaMultiple__Group_4__0__Impl7471); 
             after(grammarAccess.getRespuestaMultipleAccess().getAlternativasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__0__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3796:1: rule__RespuestaMultiple__Group_4__1 : rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2 ;
    public final void rule__RespuestaMultiple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3800:1: ( rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3801:2: rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__1__Impl_in_rule__RespuestaMultiple__Group_4__17502);
            rule__RespuestaMultiple__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__2_in_rule__RespuestaMultiple__Group_4__17505);
            rule__RespuestaMultiple__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__1"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3808:1: rule__RespuestaMultiple__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3812:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3813:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3813:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3814:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group_4__1__Impl7533); 
             after(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__1__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3827:1: rule__RespuestaMultiple__Group_4__2 : rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3 ;
    public final void rule__RespuestaMultiple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3831:1: ( rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3832:2: rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__2__Impl_in_rule__RespuestaMultiple__Group_4__27564);
            rule__RespuestaMultiple__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__3_in_rule__RespuestaMultiple__Group_4__27567);
            rule__RespuestaMultiple__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__2"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3839:1: rule__RespuestaMultiple__Group_4__2__Impl : ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) ) ;
    public final void rule__RespuestaMultiple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3843:1: ( ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3844:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3844:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3845:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3846:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3846:2: rule__RespuestaMultiple__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_2_in_rule__RespuestaMultiple__Group_4__2__Impl7594);
            rule__RespuestaMultiple__AlternativasAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__2__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3856:1: rule__RespuestaMultiple__Group_4__3 : rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4 ;
    public final void rule__RespuestaMultiple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3860:1: ( rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3861:2: rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__3__Impl_in_rule__RespuestaMultiple__Group_4__37624);
            rule__RespuestaMultiple__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__4_in_rule__RespuestaMultiple__Group_4__37627);
            rule__RespuestaMultiple__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__3"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3868:1: rule__RespuestaMultiple__Group_4__3__Impl : ( ( rule__RespuestaMultiple__Group_4_3__0 )* ) ;
    public final void rule__RespuestaMultiple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3872:1: ( ( ( rule__RespuestaMultiple__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3873:1: ( ( rule__RespuestaMultiple__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3873:1: ( ( rule__RespuestaMultiple__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3874:1: ( rule__RespuestaMultiple__Group_4_3__0 )*
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3875:1: ( rule__RespuestaMultiple__Group_4_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3875:2: rule__RespuestaMultiple__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__0_in_rule__RespuestaMultiple__Group_4__3__Impl7654);
            	    rule__RespuestaMultiple__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRespuestaMultipleAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__3__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3885:1: rule__RespuestaMultiple__Group_4__4 : rule__RespuestaMultiple__Group_4__4__Impl ;
    public final void rule__RespuestaMultiple__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3889:1: ( rule__RespuestaMultiple__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3890:2: rule__RespuestaMultiple__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__4__Impl_in_rule__RespuestaMultiple__Group_4__47685);
            rule__RespuestaMultiple__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__4"


    // $ANTLR start "rule__RespuestaMultiple__Group_4__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3896:1: rule__RespuestaMultiple__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3900:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3901:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3901:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3902:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RespuestaMultiple__Group_4__4__Impl7713); 
             after(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4__4__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_4_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3925:1: rule__RespuestaMultiple__Group_4_3__0 : rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1 ;
    public final void rule__RespuestaMultiple__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3929:1: ( rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3930:2: rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__0__Impl_in_rule__RespuestaMultiple__Group_4_3__07754);
            rule__RespuestaMultiple__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__1_in_rule__RespuestaMultiple__Group_4_3__07757);
            rule__RespuestaMultiple__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4_3__0"


    // $ANTLR start "rule__RespuestaMultiple__Group_4_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3937:1: rule__RespuestaMultiple__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaMultiple__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3941:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3942:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3942:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3943:1: ','
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaMultiple__Group_4_3__0__Impl7785); 
             after(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4_3__0__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_4_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3956:1: rule__RespuestaMultiple__Group_4_3__1 : rule__RespuestaMultiple__Group_4_3__1__Impl ;
    public final void rule__RespuestaMultiple__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3960:1: ( rule__RespuestaMultiple__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3961:2: rule__RespuestaMultiple__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__1__Impl_in_rule__RespuestaMultiple__Group_4_3__17816);
            rule__RespuestaMultiple__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4_3__1"


    // $ANTLR start "rule__RespuestaMultiple__Group_4_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3967:1: rule__RespuestaMultiple__Group_4_3__1__Impl : ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__RespuestaMultiple__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3971:1: ( ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3972:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3972:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3973:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3974:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3974:2: rule__RespuestaMultiple__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_3_1_in_rule__RespuestaMultiple__Group_4_3__1__Impl7843);
            rule__RespuestaMultiple__AlternativasAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_4_3__1__Impl"


    // $ANTLR start "rule__TextoLibre__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3988:1: rule__TextoLibre__Group__0 : rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1 ;
    public final void rule__TextoLibre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3992:1: ( rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3993:2: rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__0__Impl_in_rule__TextoLibre__Group__07877);
            rule__TextoLibre__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__1_in_rule__TextoLibre__Group__07880);
            rule__TextoLibre__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__0"


    // $ANTLR start "rule__TextoLibre__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4000:1: rule__TextoLibre__Group__0__Impl : ( () ) ;
    public final void rule__TextoLibre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4004:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4005:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4005:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4006:1: ()
            {
             before(grammarAccess.getTextoLibreAccess().getTextoLibreAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4007:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4009:1: 
            {
            }

             after(grammarAccess.getTextoLibreAccess().getTextoLibreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__0__Impl"


    // $ANTLR start "rule__TextoLibre__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4019:1: rule__TextoLibre__Group__1 : rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2 ;
    public final void rule__TextoLibre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4023:1: ( rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4024:2: rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__1__Impl_in_rule__TextoLibre__Group__17938);
            rule__TextoLibre__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__2_in_rule__TextoLibre__Group__17941);
            rule__TextoLibre__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__1"


    // $ANTLR start "rule__TextoLibre__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4031:1: rule__TextoLibre__Group__1__Impl : ( 'TextoLibre' ) ;
    public final void rule__TextoLibre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4035:1: ( ( 'TextoLibre' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4036:1: ( 'TextoLibre' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4036:1: ( 'TextoLibre' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4037:1: 'TextoLibre'
            {
             before(grammarAccess.getTextoLibreAccess().getTextoLibreKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TextoLibre__Group__1__Impl7969); 
             after(grammarAccess.getTextoLibreAccess().getTextoLibreKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__1__Impl"


    // $ANTLR start "rule__TextoLibre__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4050:1: rule__TextoLibre__Group__2 : rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3 ;
    public final void rule__TextoLibre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4054:1: ( rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4055:2: rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__2__Impl_in_rule__TextoLibre__Group__28000);
            rule__TextoLibre__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__3_in_rule__TextoLibre__Group__28003);
            rule__TextoLibre__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__2"


    // $ANTLR start "rule__TextoLibre__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4062:1: rule__TextoLibre__Group__2__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4066:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4067:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4067:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4068:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group__2__Impl8031); 
             after(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__2__Impl"


    // $ANTLR start "rule__TextoLibre__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4081:1: rule__TextoLibre__Group__3 : rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4 ;
    public final void rule__TextoLibre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4085:1: ( rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4086:2: rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__3__Impl_in_rule__TextoLibre__Group__38062);
            rule__TextoLibre__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__4_in_rule__TextoLibre__Group__38065);
            rule__TextoLibre__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__3"


    // $ANTLR start "rule__TextoLibre__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4093:1: rule__TextoLibre__Group__3__Impl : ( ( rule__TextoLibre__Group_3__0 )? ) ;
    public final void rule__TextoLibre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4097:1: ( ( ( rule__TextoLibre__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4098:1: ( ( rule__TextoLibre__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4098:1: ( ( rule__TextoLibre__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4099:1: ( rule__TextoLibre__Group_3__0 )?
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4100:1: ( rule__TextoLibre__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4100:2: rule__TextoLibre__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__0_in_rule__TextoLibre__Group__3__Impl8092);
                    rule__TextoLibre__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextoLibreAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__3__Impl"


    // $ANTLR start "rule__TextoLibre__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4110:1: rule__TextoLibre__Group__4 : rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5 ;
    public final void rule__TextoLibre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4114:1: ( rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4115:2: rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__4__Impl_in_rule__TextoLibre__Group__48123);
            rule__TextoLibre__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__5_in_rule__TextoLibre__Group__48126);
            rule__TextoLibre__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__4"


    // $ANTLR start "rule__TextoLibre__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4122:1: rule__TextoLibre__Group__4__Impl : ( ( rule__TextoLibre__Group_4__0 )? ) ;
    public final void rule__TextoLibre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4126:1: ( ( ( rule__TextoLibre__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4127:1: ( ( rule__TextoLibre__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4127:1: ( ( rule__TextoLibre__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4128:1: ( rule__TextoLibre__Group_4__0 )?
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4129:1: ( rule__TextoLibre__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4129:2: rule__TextoLibre__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__0_in_rule__TextoLibre__Group__4__Impl8153);
                    rule__TextoLibre__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextoLibreAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__4__Impl"


    // $ANTLR start "rule__TextoLibre__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4139:1: rule__TextoLibre__Group__5 : rule__TextoLibre__Group__5__Impl ;
    public final void rule__TextoLibre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4143:1: ( rule__TextoLibre__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4144:2: rule__TextoLibre__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__5__Impl_in_rule__TextoLibre__Group__58184);
            rule__TextoLibre__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__5"


    // $ANTLR start "rule__TextoLibre__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4150:1: rule__TextoLibre__Group__5__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4154:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4155:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4155:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4156:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TextoLibre__Group__5__Impl8212); 
             after(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__5__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4181:1: rule__TextoLibre__Group_3__0 : rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1 ;
    public final void rule__TextoLibre__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4185:1: ( rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4186:2: rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__0__Impl_in_rule__TextoLibre__Group_3__08255);
            rule__TextoLibre__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__1_in_rule__TextoLibre__Group_3__08258);
            rule__TextoLibre__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__0"


    // $ANTLR start "rule__TextoLibre__Group_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4193:1: rule__TextoLibre__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__TextoLibre__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4197:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4198:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4198:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4199:1: 'correctas'
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TextoLibre__Group_3__0__Impl8286); 
             after(grammarAccess.getTextoLibreAccess().getCorrectasKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__0__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4212:1: rule__TextoLibre__Group_3__1 : rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2 ;
    public final void rule__TextoLibre__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4216:1: ( rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4217:2: rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__1__Impl_in_rule__TextoLibre__Group_3__18317);
            rule__TextoLibre__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__2_in_rule__TextoLibre__Group_3__18320);
            rule__TextoLibre__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__1"


    // $ANTLR start "rule__TextoLibre__Group_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4224:1: rule__TextoLibre__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4228:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4229:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4229:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4230:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group_3__1__Impl8348); 
             after(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__1__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4243:1: rule__TextoLibre__Group_3__2 : rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3 ;
    public final void rule__TextoLibre__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4247:1: ( rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4248:2: rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__2__Impl_in_rule__TextoLibre__Group_3__28379);
            rule__TextoLibre__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__3_in_rule__TextoLibre__Group_3__28382);
            rule__TextoLibre__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__2"


    // $ANTLR start "rule__TextoLibre__Group_3__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4255:1: rule__TextoLibre__Group_3__2__Impl : ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) ) ;
    public final void rule__TextoLibre__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4259:1: ( ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4260:1: ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4260:1: ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4261:1: ( rule__TextoLibre__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4262:1: ( rule__TextoLibre__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4262:2: rule__TextoLibre__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__CorrectasAssignment_3_2_in_rule__TextoLibre__Group_3__2__Impl8409);
            rule__TextoLibre__CorrectasAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__2__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4272:1: rule__TextoLibre__Group_3__3 : rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4 ;
    public final void rule__TextoLibre__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4276:1: ( rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4277:2: rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__3__Impl_in_rule__TextoLibre__Group_3__38439);
            rule__TextoLibre__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__4_in_rule__TextoLibre__Group_3__38442);
            rule__TextoLibre__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__3"


    // $ANTLR start "rule__TextoLibre__Group_3__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4284:1: rule__TextoLibre__Group_3__3__Impl : ( ( rule__TextoLibre__Group_3_3__0 )* ) ;
    public final void rule__TextoLibre__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4288:1: ( ( ( rule__TextoLibre__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4289:1: ( ( rule__TextoLibre__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4289:1: ( ( rule__TextoLibre__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4290:1: ( rule__TextoLibre__Group_3_3__0 )*
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4291:1: ( rule__TextoLibre__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4291:2: rule__TextoLibre__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__0_in_rule__TextoLibre__Group_3__3__Impl8469);
            	    rule__TextoLibre__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTextoLibreAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__3__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4301:1: rule__TextoLibre__Group_3__4 : rule__TextoLibre__Group_3__4__Impl ;
    public final void rule__TextoLibre__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4305:1: ( rule__TextoLibre__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4306:2: rule__TextoLibre__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__4__Impl_in_rule__TextoLibre__Group_3__48500);
            rule__TextoLibre__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__4"


    // $ANTLR start "rule__TextoLibre__Group_3__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4312:1: rule__TextoLibre__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4316:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4317:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4317:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4318:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TextoLibre__Group_3__4__Impl8528); 
             after(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3__4__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4341:1: rule__TextoLibre__Group_3_3__0 : rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1 ;
    public final void rule__TextoLibre__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4345:1: ( rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4346:2: rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__0__Impl_in_rule__TextoLibre__Group_3_3__08569);
            rule__TextoLibre__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__1_in_rule__TextoLibre__Group_3_3__08572);
            rule__TextoLibre__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3_3__0"


    // $ANTLR start "rule__TextoLibre__Group_3_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4353:1: rule__TextoLibre__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TextoLibre__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4357:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4358:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4358:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4359:1: ','
            {
             before(grammarAccess.getTextoLibreAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TextoLibre__Group_3_3__0__Impl8600); 
             after(grammarAccess.getTextoLibreAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3_3__0__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4372:1: rule__TextoLibre__Group_3_3__1 : rule__TextoLibre__Group_3_3__1__Impl ;
    public final void rule__TextoLibre__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4376:1: ( rule__TextoLibre__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4377:2: rule__TextoLibre__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__1__Impl_in_rule__TextoLibre__Group_3_3__18631);
            rule__TextoLibre__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3_3__1"


    // $ANTLR start "rule__TextoLibre__Group_3_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4383:1: rule__TextoLibre__Group_3_3__1__Impl : ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__TextoLibre__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4387:1: ( ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4388:1: ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4388:1: ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4389:1: ( rule__TextoLibre__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4390:1: ( rule__TextoLibre__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4390:2: rule__TextoLibre__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__CorrectasAssignment_3_3_1_in_rule__TextoLibre__Group_3_3__1__Impl8658);
            rule__TextoLibre__CorrectasAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_3_3__1__Impl"


    // $ANTLR start "rule__TextoLibre__Group_4__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4404:1: rule__TextoLibre__Group_4__0 : rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1 ;
    public final void rule__TextoLibre__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4408:1: ( rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4409:2: rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__0__Impl_in_rule__TextoLibre__Group_4__08692);
            rule__TextoLibre__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__1_in_rule__TextoLibre__Group_4__08695);
            rule__TextoLibre__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__0"


    // $ANTLR start "rule__TextoLibre__Group_4__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4416:1: rule__TextoLibre__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__TextoLibre__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4420:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4421:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4421:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4422:1: 'alternativas'
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TextoLibre__Group_4__0__Impl8723); 
             after(grammarAccess.getTextoLibreAccess().getAlternativasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__0__Impl"


    // $ANTLR start "rule__TextoLibre__Group_4__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4435:1: rule__TextoLibre__Group_4__1 : rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2 ;
    public final void rule__TextoLibre__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4439:1: ( rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4440:2: rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__1__Impl_in_rule__TextoLibre__Group_4__18754);
            rule__TextoLibre__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__2_in_rule__TextoLibre__Group_4__18757);
            rule__TextoLibre__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__1"


    // $ANTLR start "rule__TextoLibre__Group_4__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4447:1: rule__TextoLibre__Group_4__1__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4451:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4452:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4452:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4453:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group_4__1__Impl8785); 
             after(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__1__Impl"


    // $ANTLR start "rule__TextoLibre__Group_4__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4466:1: rule__TextoLibre__Group_4__2 : rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3 ;
    public final void rule__TextoLibre__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4470:1: ( rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4471:2: rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__2__Impl_in_rule__TextoLibre__Group_4__28816);
            rule__TextoLibre__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__3_in_rule__TextoLibre__Group_4__28819);
            rule__TextoLibre__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__2"


    // $ANTLR start "rule__TextoLibre__Group_4__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4478:1: rule__TextoLibre__Group_4__2__Impl : ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) ) ;
    public final void rule__TextoLibre__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4482:1: ( ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4483:1: ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4483:1: ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4484:1: ( rule__TextoLibre__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4485:1: ( rule__TextoLibre__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4485:2: rule__TextoLibre__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__AlternativasAssignment_4_2_in_rule__TextoLibre__Group_4__2__Impl8846);
            rule__TextoLibre__AlternativasAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__2__Impl"


    // $ANTLR start "rule__TextoLibre__Group_4__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4495:1: rule__TextoLibre__Group_4__3 : rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4 ;
    public final void rule__TextoLibre__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4499:1: ( rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4500:2: rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__3__Impl_in_rule__TextoLibre__Group_4__38876);
            rule__TextoLibre__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__4_in_rule__TextoLibre__Group_4__38879);
            rule__TextoLibre__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__3"


    // $ANTLR start "rule__TextoLibre__Group_4__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4507:1: rule__TextoLibre__Group_4__3__Impl : ( ( rule__TextoLibre__Group_4_3__0 )* ) ;
    public final void rule__TextoLibre__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4511:1: ( ( ( rule__TextoLibre__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4512:1: ( ( rule__TextoLibre__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4512:1: ( ( rule__TextoLibre__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4513:1: ( rule__TextoLibre__Group_4_3__0 )*
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4514:1: ( rule__TextoLibre__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==27) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4514:2: rule__TextoLibre__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__0_in_rule__TextoLibre__Group_4__3__Impl8906);
            	    rule__TextoLibre__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTextoLibreAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__3__Impl"


    // $ANTLR start "rule__TextoLibre__Group_4__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4524:1: rule__TextoLibre__Group_4__4 : rule__TextoLibre__Group_4__4__Impl ;
    public final void rule__TextoLibre__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4528:1: ( rule__TextoLibre__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4529:2: rule__TextoLibre__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__4__Impl_in_rule__TextoLibre__Group_4__48937);
            rule__TextoLibre__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__4"


    // $ANTLR start "rule__TextoLibre__Group_4__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4535:1: rule__TextoLibre__Group_4__4__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4539:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4540:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4540:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4541:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TextoLibre__Group_4__4__Impl8965); 
             after(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4__4__Impl"


    // $ANTLR start "rule__TextoLibre__Group_4_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4564:1: rule__TextoLibre__Group_4_3__0 : rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1 ;
    public final void rule__TextoLibre__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4568:1: ( rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4569:2: rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__0__Impl_in_rule__TextoLibre__Group_4_3__09006);
            rule__TextoLibre__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__1_in_rule__TextoLibre__Group_4_3__09009);
            rule__TextoLibre__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4_3__0"


    // $ANTLR start "rule__TextoLibre__Group_4_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4576:1: rule__TextoLibre__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__TextoLibre__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4580:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4581:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4581:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4582:1: ','
            {
             before(grammarAccess.getTextoLibreAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TextoLibre__Group_4_3__0__Impl9037); 
             after(grammarAccess.getTextoLibreAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4_3__0__Impl"


    // $ANTLR start "rule__TextoLibre__Group_4_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4595:1: rule__TextoLibre__Group_4_3__1 : rule__TextoLibre__Group_4_3__1__Impl ;
    public final void rule__TextoLibre__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4599:1: ( rule__TextoLibre__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4600:2: rule__TextoLibre__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__1__Impl_in_rule__TextoLibre__Group_4_3__19068);
            rule__TextoLibre__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4_3__1"


    // $ANTLR start "rule__TextoLibre__Group_4_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4606:1: rule__TextoLibre__Group_4_3__1__Impl : ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__TextoLibre__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4610:1: ( ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4611:1: ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4611:1: ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4612:1: ( rule__TextoLibre__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4613:1: ( rule__TextoLibre__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4613:2: rule__TextoLibre__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__AlternativasAssignment_4_3_1_in_rule__TextoLibre__Group_4_3__1__Impl9095);
            rule__TextoLibre__AlternativasAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_4_3__1__Impl"


    // $ANTLR start "rule__Ordenacion__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4627:1: rule__Ordenacion__Group__0 : rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1 ;
    public final void rule__Ordenacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4631:1: ( rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4632:2: rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__0__Impl_in_rule__Ordenacion__Group__09129);
            rule__Ordenacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__1_in_rule__Ordenacion__Group__09132);
            rule__Ordenacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__0"


    // $ANTLR start "rule__Ordenacion__Group__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4639:1: rule__Ordenacion__Group__0__Impl : ( () ) ;
    public final void rule__Ordenacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4643:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4644:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4644:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4645:1: ()
            {
             before(grammarAccess.getOrdenacionAccess().getOrdenacionAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4646:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4648:1: 
            {
            }

             after(grammarAccess.getOrdenacionAccess().getOrdenacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__0__Impl"


    // $ANTLR start "rule__Ordenacion__Group__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4658:1: rule__Ordenacion__Group__1 : rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2 ;
    public final void rule__Ordenacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4662:1: ( rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4663:2: rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__1__Impl_in_rule__Ordenacion__Group__19190);
            rule__Ordenacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__2_in_rule__Ordenacion__Group__19193);
            rule__Ordenacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__1"


    // $ANTLR start "rule__Ordenacion__Group__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4670:1: rule__Ordenacion__Group__1__Impl : ( 'Ordenacion' ) ;
    public final void rule__Ordenacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4674:1: ( ( 'Ordenacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4675:1: ( 'Ordenacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4675:1: ( 'Ordenacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4676:1: 'Ordenacion'
            {
             before(grammarAccess.getOrdenacionAccess().getOrdenacionKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Ordenacion__Group__1__Impl9221); 
             after(grammarAccess.getOrdenacionAccess().getOrdenacionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__1__Impl"


    // $ANTLR start "rule__Ordenacion__Group__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4689:1: rule__Ordenacion__Group__2 : rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3 ;
    public final void rule__Ordenacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4693:1: ( rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4694:2: rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__2__Impl_in_rule__Ordenacion__Group__29252);
            rule__Ordenacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__3_in_rule__Ordenacion__Group__29255);
            rule__Ordenacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__2"


    // $ANTLR start "rule__Ordenacion__Group__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4701:1: rule__Ordenacion__Group__2__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4705:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4706:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4706:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4707:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group__2__Impl9283); 
             after(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__2__Impl"


    // $ANTLR start "rule__Ordenacion__Group__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4720:1: rule__Ordenacion__Group__3 : rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4 ;
    public final void rule__Ordenacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4724:1: ( rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4725:2: rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__3__Impl_in_rule__Ordenacion__Group__39314);
            rule__Ordenacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__4_in_rule__Ordenacion__Group__39317);
            rule__Ordenacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__3"


    // $ANTLR start "rule__Ordenacion__Group__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4732:1: rule__Ordenacion__Group__3__Impl : ( ( rule__Ordenacion__Group_3__0 )? ) ;
    public final void rule__Ordenacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4736:1: ( ( ( rule__Ordenacion__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4737:1: ( ( rule__Ordenacion__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4737:1: ( ( rule__Ordenacion__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4738:1: ( rule__Ordenacion__Group_3__0 )?
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4739:1: ( rule__Ordenacion__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4739:2: rule__Ordenacion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__0_in_rule__Ordenacion__Group__3__Impl9344);
                    rule__Ordenacion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrdenacionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__3__Impl"


    // $ANTLR start "rule__Ordenacion__Group__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4749:1: rule__Ordenacion__Group__4 : rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5 ;
    public final void rule__Ordenacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4753:1: ( rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4754:2: rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__4__Impl_in_rule__Ordenacion__Group__49375);
            rule__Ordenacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__5_in_rule__Ordenacion__Group__49378);
            rule__Ordenacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__4"


    // $ANTLR start "rule__Ordenacion__Group__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4761:1: rule__Ordenacion__Group__4__Impl : ( ( rule__Ordenacion__Group_4__0 )? ) ;
    public final void rule__Ordenacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4765:1: ( ( ( rule__Ordenacion__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4766:1: ( ( rule__Ordenacion__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4766:1: ( ( rule__Ordenacion__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4767:1: ( rule__Ordenacion__Group_4__0 )?
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4768:1: ( rule__Ordenacion__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4768:2: rule__Ordenacion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__0_in_rule__Ordenacion__Group__4__Impl9405);
                    rule__Ordenacion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrdenacionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__4__Impl"


    // $ANTLR start "rule__Ordenacion__Group__5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4778:1: rule__Ordenacion__Group__5 : rule__Ordenacion__Group__5__Impl ;
    public final void rule__Ordenacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4782:1: ( rule__Ordenacion__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4783:2: rule__Ordenacion__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__5__Impl_in_rule__Ordenacion__Group__59436);
            rule__Ordenacion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__5"


    // $ANTLR start "rule__Ordenacion__Group__5__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4789:1: rule__Ordenacion__Group__5__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4793:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4794:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4794:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4795:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ordenacion__Group__5__Impl9464); 
             after(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__5__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4820:1: rule__Ordenacion__Group_3__0 : rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1 ;
    public final void rule__Ordenacion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4824:1: ( rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4825:2: rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__0__Impl_in_rule__Ordenacion__Group_3__09507);
            rule__Ordenacion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__1_in_rule__Ordenacion__Group_3__09510);
            rule__Ordenacion__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__0"


    // $ANTLR start "rule__Ordenacion__Group_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4832:1: rule__Ordenacion__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__Ordenacion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4836:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4837:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4837:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4838:1: 'correctas'
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ordenacion__Group_3__0__Impl9538); 
             after(grammarAccess.getOrdenacionAccess().getCorrectasKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__0__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4851:1: rule__Ordenacion__Group_3__1 : rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2 ;
    public final void rule__Ordenacion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4855:1: ( rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4856:2: rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__1__Impl_in_rule__Ordenacion__Group_3__19569);
            rule__Ordenacion__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__2_in_rule__Ordenacion__Group_3__19572);
            rule__Ordenacion__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__1"


    // $ANTLR start "rule__Ordenacion__Group_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4863:1: rule__Ordenacion__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4867:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4868:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4868:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4869:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group_3__1__Impl9600); 
             after(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__1__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4882:1: rule__Ordenacion__Group_3__2 : rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3 ;
    public final void rule__Ordenacion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4886:1: ( rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4887:2: rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__2__Impl_in_rule__Ordenacion__Group_3__29631);
            rule__Ordenacion__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__3_in_rule__Ordenacion__Group_3__29634);
            rule__Ordenacion__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__2"


    // $ANTLR start "rule__Ordenacion__Group_3__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4894:1: rule__Ordenacion__Group_3__2__Impl : ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) ) ;
    public final void rule__Ordenacion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4898:1: ( ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4899:1: ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4899:1: ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4900:1: ( rule__Ordenacion__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4901:1: ( rule__Ordenacion__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4901:2: rule__Ordenacion__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__CorrectasAssignment_3_2_in_rule__Ordenacion__Group_3__2__Impl9661);
            rule__Ordenacion__CorrectasAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__2__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4911:1: rule__Ordenacion__Group_3__3 : rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4 ;
    public final void rule__Ordenacion__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4915:1: ( rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4916:2: rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__3__Impl_in_rule__Ordenacion__Group_3__39691);
            rule__Ordenacion__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__4_in_rule__Ordenacion__Group_3__39694);
            rule__Ordenacion__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__3"


    // $ANTLR start "rule__Ordenacion__Group_3__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4923:1: rule__Ordenacion__Group_3__3__Impl : ( ( rule__Ordenacion__Group_3_3__0 )* ) ;
    public final void rule__Ordenacion__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4927:1: ( ( ( rule__Ordenacion__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4928:1: ( ( rule__Ordenacion__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4928:1: ( ( rule__Ordenacion__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4929:1: ( rule__Ordenacion__Group_3_3__0 )*
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4930:1: ( rule__Ordenacion__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4930:2: rule__Ordenacion__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__0_in_rule__Ordenacion__Group_3__3__Impl9721);
            	    rule__Ordenacion__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getOrdenacionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__3__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4940:1: rule__Ordenacion__Group_3__4 : rule__Ordenacion__Group_3__4__Impl ;
    public final void rule__Ordenacion__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4944:1: ( rule__Ordenacion__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4945:2: rule__Ordenacion__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__4__Impl_in_rule__Ordenacion__Group_3__49752);
            rule__Ordenacion__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__4"


    // $ANTLR start "rule__Ordenacion__Group_3__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4951:1: rule__Ordenacion__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4955:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4956:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4956:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4957:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ordenacion__Group_3__4__Impl9780); 
             after(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3__4__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4980:1: rule__Ordenacion__Group_3_3__0 : rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1 ;
    public final void rule__Ordenacion__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4984:1: ( rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4985:2: rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__0__Impl_in_rule__Ordenacion__Group_3_3__09821);
            rule__Ordenacion__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__1_in_rule__Ordenacion__Group_3_3__09824);
            rule__Ordenacion__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3_3__0"


    // $ANTLR start "rule__Ordenacion__Group_3_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4992:1: rule__Ordenacion__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Ordenacion__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4996:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4997:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4997:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4998:1: ','
            {
             before(grammarAccess.getOrdenacionAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ordenacion__Group_3_3__0__Impl9852); 
             after(grammarAccess.getOrdenacionAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3_3__0__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5011:1: rule__Ordenacion__Group_3_3__1 : rule__Ordenacion__Group_3_3__1__Impl ;
    public final void rule__Ordenacion__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5015:1: ( rule__Ordenacion__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5016:2: rule__Ordenacion__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__1__Impl_in_rule__Ordenacion__Group_3_3__19883);
            rule__Ordenacion__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3_3__1"


    // $ANTLR start "rule__Ordenacion__Group_3_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5022:1: rule__Ordenacion__Group_3_3__1__Impl : ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__Ordenacion__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5026:1: ( ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5027:1: ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5027:1: ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5028:1: ( rule__Ordenacion__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5029:1: ( rule__Ordenacion__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5029:2: rule__Ordenacion__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__CorrectasAssignment_3_3_1_in_rule__Ordenacion__Group_3_3__1__Impl9910);
            rule__Ordenacion__CorrectasAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_3_3__1__Impl"


    // $ANTLR start "rule__Ordenacion__Group_4__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5043:1: rule__Ordenacion__Group_4__0 : rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1 ;
    public final void rule__Ordenacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5047:1: ( rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5048:2: rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__0__Impl_in_rule__Ordenacion__Group_4__09944);
            rule__Ordenacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__1_in_rule__Ordenacion__Group_4__09947);
            rule__Ordenacion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__0"


    // $ANTLR start "rule__Ordenacion__Group_4__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5055:1: rule__Ordenacion__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__Ordenacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5059:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5060:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5060:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5061:1: 'alternativas'
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Ordenacion__Group_4__0__Impl9975); 
             after(grammarAccess.getOrdenacionAccess().getAlternativasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__0__Impl"


    // $ANTLR start "rule__Ordenacion__Group_4__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5074:1: rule__Ordenacion__Group_4__1 : rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2 ;
    public final void rule__Ordenacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5078:1: ( rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5079:2: rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__1__Impl_in_rule__Ordenacion__Group_4__110006);
            rule__Ordenacion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__2_in_rule__Ordenacion__Group_4__110009);
            rule__Ordenacion__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__1"


    // $ANTLR start "rule__Ordenacion__Group_4__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5086:1: rule__Ordenacion__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5090:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5091:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5091:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5092:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group_4__1__Impl10037); 
             after(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__1__Impl"


    // $ANTLR start "rule__Ordenacion__Group_4__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5105:1: rule__Ordenacion__Group_4__2 : rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3 ;
    public final void rule__Ordenacion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5109:1: ( rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5110:2: rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__2__Impl_in_rule__Ordenacion__Group_4__210068);
            rule__Ordenacion__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__3_in_rule__Ordenacion__Group_4__210071);
            rule__Ordenacion__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__2"


    // $ANTLR start "rule__Ordenacion__Group_4__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5117:1: rule__Ordenacion__Group_4__2__Impl : ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) ) ;
    public final void rule__Ordenacion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5121:1: ( ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5122:1: ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5122:1: ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5123:1: ( rule__Ordenacion__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5124:1: ( rule__Ordenacion__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5124:2: rule__Ordenacion__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__AlternativasAssignment_4_2_in_rule__Ordenacion__Group_4__2__Impl10098);
            rule__Ordenacion__AlternativasAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__2__Impl"


    // $ANTLR start "rule__Ordenacion__Group_4__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5134:1: rule__Ordenacion__Group_4__3 : rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4 ;
    public final void rule__Ordenacion__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5138:1: ( rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5139:2: rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__3__Impl_in_rule__Ordenacion__Group_4__310128);
            rule__Ordenacion__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__4_in_rule__Ordenacion__Group_4__310131);
            rule__Ordenacion__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__3"


    // $ANTLR start "rule__Ordenacion__Group_4__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5146:1: rule__Ordenacion__Group_4__3__Impl : ( ( rule__Ordenacion__Group_4_3__0 )* ) ;
    public final void rule__Ordenacion__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5150:1: ( ( ( rule__Ordenacion__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5151:1: ( ( rule__Ordenacion__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5151:1: ( ( rule__Ordenacion__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5152:1: ( rule__Ordenacion__Group_4_3__0 )*
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5153:1: ( rule__Ordenacion__Group_4_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5153:2: rule__Ordenacion__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__0_in_rule__Ordenacion__Group_4__3__Impl10158);
            	    rule__Ordenacion__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getOrdenacionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__3__Impl"


    // $ANTLR start "rule__Ordenacion__Group_4__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5163:1: rule__Ordenacion__Group_4__4 : rule__Ordenacion__Group_4__4__Impl ;
    public final void rule__Ordenacion__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5167:1: ( rule__Ordenacion__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5168:2: rule__Ordenacion__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__4__Impl_in_rule__Ordenacion__Group_4__410189);
            rule__Ordenacion__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__4"


    // $ANTLR start "rule__Ordenacion__Group_4__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5174:1: rule__Ordenacion__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5178:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5179:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5179:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5180:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ordenacion__Group_4__4__Impl10217); 
             after(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4__4__Impl"


    // $ANTLR start "rule__Ordenacion__Group_4_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5203:1: rule__Ordenacion__Group_4_3__0 : rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1 ;
    public final void rule__Ordenacion__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5207:1: ( rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5208:2: rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__0__Impl_in_rule__Ordenacion__Group_4_3__010258);
            rule__Ordenacion__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__1_in_rule__Ordenacion__Group_4_3__010261);
            rule__Ordenacion__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4_3__0"


    // $ANTLR start "rule__Ordenacion__Group_4_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5215:1: rule__Ordenacion__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Ordenacion__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5219:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5220:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5220:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5221:1: ','
            {
             before(grammarAccess.getOrdenacionAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ordenacion__Group_4_3__0__Impl10289); 
             after(grammarAccess.getOrdenacionAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4_3__0__Impl"


    // $ANTLR start "rule__Ordenacion__Group_4_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5234:1: rule__Ordenacion__Group_4_3__1 : rule__Ordenacion__Group_4_3__1__Impl ;
    public final void rule__Ordenacion__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5238:1: ( rule__Ordenacion__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5239:2: rule__Ordenacion__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__1__Impl_in_rule__Ordenacion__Group_4_3__110320);
            rule__Ordenacion__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4_3__1"


    // $ANTLR start "rule__Ordenacion__Group_4_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5245:1: rule__Ordenacion__Group_4_3__1__Impl : ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__Ordenacion__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5249:1: ( ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5250:1: ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5250:1: ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5251:1: ( rule__Ordenacion__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5252:1: ( rule__Ordenacion__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5252:2: rule__Ordenacion__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__AlternativasAssignment_4_3_1_in_rule__Ordenacion__Group_4_3__1__Impl10347);
            rule__Ordenacion__AlternativasAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_4_3__1__Impl"


    // $ANTLR start "rule__Ejercicio__NameAssignment_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5267:1: rule__Ejercicio__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ejercicio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5271:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5272:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5272:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5273:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__NameAssignment_110386);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__NameAssignment_1"


    // $ANTLR start "rule__Ejercicio__EnunciadoAssignment_4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5282:1: rule__Ejercicio__EnunciadoAssignment_4 : ( ruleEString ) ;
    public final void rule__Ejercicio__EnunciadoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5286:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5287:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5287:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5288:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getEnunciadoEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__EnunciadoAssignment_410417);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getEnunciadoEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__EnunciadoAssignment_4"


    // $ANTLR start "rule__Ejercicio__PuntuacionEjAssignment_5_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5297:1: rule__Ejercicio__PuntuacionEjAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Ejercicio__PuntuacionEjAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5301:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5302:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5302:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5303:1: ruleEDouble
            {
             before(grammarAccess.getEjercicioAccess().getPuntuacionEjEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Ejercicio__PuntuacionEjAssignment_5_110448);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getPuntuacionEjEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__PuntuacionEjAssignment_5_1"


    // $ANTLR start "rule__Ejercicio__CategoriaAssignment_6_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5312:1: rule__Ejercicio__CategoriaAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Ejercicio__CategoriaAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5316:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5317:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5317:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5318:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getCategoriaEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__CategoriaAssignment_6_110479);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getCategoriaEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__CategoriaAssignment_6_1"


    // $ANTLR start "rule__Ejercicio__OrderAssignment_8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5327:1: rule__Ejercicio__OrderAssignment_8 : ( ruleEInt ) ;
    public final void rule__Ejercicio__OrderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5331:1: ( ( ruleEInt ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5332:1: ( ruleEInt )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5332:1: ( ruleEInt )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5333:1: ruleEInt
            {
             before(grammarAccess.getEjercicioAccess().getOrderEIntParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Ejercicio__OrderAssignment_810510);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getOrderEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__OrderAssignment_8"


    // $ANTLR start "rule__Ejercicio__RespuestaAssignment_10"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5342:1: rule__Ejercicio__RespuestaAssignment_10 : ( ruleRespuesta ) ;
    public final void rule__Ejercicio__RespuestaAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5346:1: ( ( ruleRespuesta ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5347:1: ( ruleRespuesta )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5347:1: ( ruleRespuesta )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5348:1: ruleRespuesta
            {
             before(grammarAccess.getEjercicioAccess().getRespuestaRespuestaParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuesta_in_rule__Ejercicio__RespuestaAssignment_1010541);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getRespuestaRespuestaParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ejercicio__RespuestaAssignment_10"


    // $ANTLR start "rule__Clasico__PuntuacionAssignment_3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5357:1: rule__Clasico__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Clasico__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5361:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5362:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5362:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5363:1: ruleEDouble
            {
             before(grammarAccess.getClasicoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Clasico__PuntuacionAssignment_310572);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getClasicoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__PuntuacionAssignment_3"


    // $ANTLR start "rule__Clasico__PenalizacionAssignment_5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5372:1: rule__Clasico__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Clasico__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5376:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5377:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5377:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5378:1: ruleEDouble
            {
             before(grammarAccess.getClasicoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Clasico__PenalizacionAssignment_510603);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getClasicoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__PenalizacionAssignment_5"


    // $ANTLR start "rule__Clasico__EjerciciosAssignment_8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5387:1: rule__Clasico__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__Clasico__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5391:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5392:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5392:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5393:1: ruleEjercicio
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_810634);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__EjerciciosAssignment_8"


    // $ANTLR start "rule__Clasico__EjerciciosAssignment_9_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5402:1: rule__Clasico__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__Clasico__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5406:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5407:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5407:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5408:1: ruleEjercicio
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_9_110665);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clasico__EjerciciosAssignment_9_1"


    // $ANTLR start "rule__Wizard__PuntuacionAssignment_3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5417:1: rule__Wizard__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Wizard__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5421:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5422:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5422:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5423:1: ruleEDouble
            {
             before(grammarAccess.getWizardAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Wizard__PuntuacionAssignment_310696);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PuntuacionAssignment_3"


    // $ANTLR start "rule__Wizard__PenalizacionAssignment_5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5432:1: rule__Wizard__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Wizard__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5436:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5437:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5437:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5438:1: ruleEDouble
            {
             before(grammarAccess.getWizardAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Wizard__PenalizacionAssignment_510727);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PenalizacionAssignment_5"


    // $ANTLR start "rule__Wizard__EjerciciosAssignment_8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5447:1: rule__Wizard__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__Wizard__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5451:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5452:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5452:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5453:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_810758);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__EjerciciosAssignment_8"


    // $ANTLR start "rule__Wizard__EjerciciosAssignment_9_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5462:1: rule__Wizard__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__Wizard__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5466:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5467:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5467:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5468:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_9_110789);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__EjerciciosAssignment_9_1"


    // $ANTLR start "rule__WizardAdaptativo__PuntuacionAssignment_3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5477:1: rule__WizardAdaptativo__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__WizardAdaptativo__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5481:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5482:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5482:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5483:1: ruleEDouble
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PuntuacionAssignment_310820);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__PuntuacionAssignment_3"


    // $ANTLR start "rule__WizardAdaptativo__PenalizacionAssignment_5"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5492:1: rule__WizardAdaptativo__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__WizardAdaptativo__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5496:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5497:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5497:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5498:1: ruleEDouble
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PenalizacionAssignment_510851);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__PenalizacionAssignment_5"


    // $ANTLR start "rule__WizardAdaptativo__EjerciciosAssignment_8"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5507:1: rule__WizardAdaptativo__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__WizardAdaptativo__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5511:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5512:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5512:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5513:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_810882);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__EjerciciosAssignment_8"


    // $ANTLR start "rule__WizardAdaptativo__EjerciciosAssignment_9_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5522:1: rule__WizardAdaptativo__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__WizardAdaptativo__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5526:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5527:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5527:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5528:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_9_110913);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__EjerciciosAssignment_9_1"


    // $ANTLR start "rule__RespuestaUnica__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5537:1: rule__RespuestaUnica__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5541:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5542:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5542:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5543:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_210944);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__CorrectasAssignment_3_2"


    // $ANTLR start "rule__RespuestaUnica__CorrectasAssignment_3_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5552:1: rule__RespuestaUnica__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5556:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5557:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5557:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5558:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_3_110975);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__CorrectasAssignment_3_3_1"


    // $ANTLR start "rule__RespuestaUnica__AlternativasAssignment_4_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5567:1: rule__RespuestaUnica__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5571:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5572:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5572:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5573:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_211006);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__AlternativasAssignment_4_2"


    // $ANTLR start "rule__RespuestaUnica__AlternativasAssignment_4_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5582:1: rule__RespuestaUnica__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5586:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5587:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5587:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5588:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_3_111037);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__AlternativasAssignment_4_3_1"


    // $ANTLR start "rule__RespuestaMultiple__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5597:1: rule__RespuestaMultiple__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5601:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5602:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5602:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5603:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_211068);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__CorrectasAssignment_3_2"


    // $ANTLR start "rule__RespuestaMultiple__CorrectasAssignment_3_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5612:1: rule__RespuestaMultiple__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5616:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5617:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5617:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5618:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_3_111099);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__CorrectasAssignment_3_3_1"


    // $ANTLR start "rule__RespuestaMultiple__AlternativasAssignment_4_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5627:1: rule__RespuestaMultiple__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5631:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5632:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5632:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5633:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_211130);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__AlternativasAssignment_4_2"


    // $ANTLR start "rule__RespuestaMultiple__AlternativasAssignment_4_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5642:1: rule__RespuestaMultiple__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5646:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5647:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5647:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5648:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_3_111161);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__AlternativasAssignment_4_3_1"


    // $ANTLR start "rule__TextoLibre__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5657:1: rule__TextoLibre__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__TextoLibre__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5661:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5662:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5662:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5663:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_211192);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__CorrectasAssignment_3_2"


    // $ANTLR start "rule__TextoLibre__CorrectasAssignment_3_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5672:1: rule__TextoLibre__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__TextoLibre__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5676:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5677:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5677:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5678:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_3_111223);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__CorrectasAssignment_3_3_1"


    // $ANTLR start "rule__TextoLibre__AlternativasAssignment_4_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5687:1: rule__TextoLibre__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__TextoLibre__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5691:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5692:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5692:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5693:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_211254);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__AlternativasAssignment_4_2"


    // $ANTLR start "rule__TextoLibre__AlternativasAssignment_4_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5702:1: rule__TextoLibre__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__TextoLibre__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5706:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5707:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5707:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5708:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_3_111285);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__AlternativasAssignment_4_3_1"


    // $ANTLR start "rule__Ordenacion__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5717:1: rule__Ordenacion__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__Ordenacion__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5721:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5722:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5722:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5723:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_211316);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__CorrectasAssignment_3_2"


    // $ANTLR start "rule__Ordenacion__CorrectasAssignment_3_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5732:1: rule__Ordenacion__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__Ordenacion__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5736:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5737:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5737:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5738:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_3_111347);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__CorrectasAssignment_3_3_1"


    // $ANTLR start "rule__Ordenacion__AlternativasAssignment_4_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5747:1: rule__Ordenacion__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Ordenacion__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5751:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5752:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5752:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5753:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_211378);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__AlternativasAssignment_4_2"


    // $ANTLR start "rule__Ordenacion__AlternativasAssignment_4_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5762:1: rule__Ordenacion__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__Ordenacion__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5766:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5767:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5767:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5768:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_3_111409);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__AlternativasAssignment_4_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleHoja_in_entryRuleHoja61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHoja68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hoja__Alternatives_in_ruleHoja94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuesta_in_entryRuleRespuesta121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuesta128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Respuesta__Alternatives_in_ruleRespuesta154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_entryRuleEjercicio181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEjercicio188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__0_in_ruleEjercicio214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasico_in_entryRuleClasico301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClasico308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__0_in_ruleClasico334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizard_in_entryRuleWizard361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWizard368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__0_in_ruleWizard394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizardAdaptativo_in_entryRuleWizardAdaptativo421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWizardAdaptativo428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__0_in_ruleWizardAdaptativo454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaUnica_in_entryRuleRespuestaUnica601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuestaUnica608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__0_in_ruleRespuestaUnica634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaMultiple_in_entryRuleRespuestaMultiple661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuestaMultiple668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__0_in_ruleRespuestaMultiple694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextoLibre_in_entryRuleTextoLibre721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextoLibre728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__0_in_ruleTextoLibre754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrdenacion_in_entryRuleOrdenacion781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdenacion788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__0_in_ruleOrdenacion814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasico_in_rule__Hoja__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizard_in_rule__Hoja__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizardAdaptativo_in_rule__Hoja__Alternatives884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaUnica_in_rule__Respuesta__Alternatives916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaMultiple_in_rule__Respuesta__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextoLibre_in_rule__Respuesta__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrdenacion_in_rule__Respuesta__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_01000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_01020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__0__Impl_in_rule__Ejercicio__Group__01101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__1_in_rule__Ejercicio__Group__01104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Ejercicio__Group__0__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__1__Impl_in_rule__Ejercicio__Group__11163 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__2_in_rule__Ejercicio__Group__11166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__NameAssignment_1_in_rule__Ejercicio__Group__1__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__2__Impl_in_rule__Ejercicio__Group__21223 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__3_in_rule__Ejercicio__Group__21226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ejercicio__Group__2__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__3__Impl_in_rule__Ejercicio__Group__31285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__4_in_rule__Ejercicio__Group__31288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Ejercicio__Group__3__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__4__Impl_in_rule__Ejercicio__Group__41347 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__5_in_rule__Ejercicio__Group__41350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__EnunciadoAssignment_4_in_rule__Ejercicio__Group__4__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__5__Impl_in_rule__Ejercicio__Group__51407 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__6_in_rule__Ejercicio__Group__51410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__0_in_rule__Ejercicio__Group__5__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__6__Impl_in_rule__Ejercicio__Group__61468 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__7_in_rule__Ejercicio__Group__61471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_6__0_in_rule__Ejercicio__Group__6__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__7__Impl_in_rule__Ejercicio__Group__71529 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__8_in_rule__Ejercicio__Group__71532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Ejercicio__Group__7__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__8__Impl_in_rule__Ejercicio__Group__81591 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__9_in_rule__Ejercicio__Group__81594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__OrderAssignment_8_in_rule__Ejercicio__Group__8__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__9__Impl_in_rule__Ejercicio__Group__91651 = new BitSet(new long[]{0x0000000E40000000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__10_in_rule__Ejercicio__Group__91654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Ejercicio__Group__9__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__10__Impl_in_rule__Ejercicio__Group__101713 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__11_in_rule__Ejercicio__Group__101716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__RespuestaAssignment_10_in_rule__Ejercicio__Group__10__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__11__Impl_in_rule__Ejercicio__Group__111773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ejercicio__Group__11__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__0__Impl_in_rule__Ejercicio__Group_5__01856 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__1_in_rule__Ejercicio__Group_5__01859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ejercicio__Group_5__0__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__1__Impl_in_rule__Ejercicio__Group_5__11918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__PuntuacionEjAssignment_5_1_in_rule__Ejercicio__Group_5__1__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_6__0__Impl_in_rule__Ejercicio__Group_6__01979 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_6__1_in_rule__Ejercicio__Group_6__01982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Ejercicio__Group_6__0__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_6__1__Impl_in_rule__Ejercicio__Group_6__12041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__CategoriaAssignment_6_1_in_rule__Ejercicio__Group_6__1__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02102 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EDouble__Group__0__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__12167 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__12170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__22229 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__22232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EDouble__Group__2__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__32291 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__32294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__42350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__02418 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__02421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__12478 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__12481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EDouble__Group_4__1__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__22543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__0__Impl_in_rule__Clasico__Group__02605 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__1_in_rule__Clasico__Group__02608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Clasico__Group__0__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__1__Impl_in_rule__Clasico__Group__12667 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__2_in_rule__Clasico__Group__12670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Clasico__Group__1__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__2__Impl_in_rule__Clasico__Group__22729 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Clasico__Group__3_in_rule__Clasico__Group__22732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Clasico__Group__2__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__3__Impl_in_rule__Clasico__Group__32791 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__4_in_rule__Clasico__Group__32794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__PuntuacionAssignment_3_in_rule__Clasico__Group__3__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__4__Impl_in_rule__Clasico__Group__42851 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Clasico__Group__5_in_rule__Clasico__Group__42854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Clasico__Group__4__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__5__Impl_in_rule__Clasico__Group__52913 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__6_in_rule__Clasico__Group__52916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__PenalizacionAssignment_5_in_rule__Clasico__Group__5__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__6__Impl_in_rule__Clasico__Group__62973 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__7_in_rule__Clasico__Group__62976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Clasico__Group__6__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__7__Impl_in_rule__Clasico__Group__73035 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__8_in_rule__Clasico__Group__73038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Clasico__Group__7__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__8__Impl_in_rule__Clasico__Group__83097 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__9_in_rule__Clasico__Group__83100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__EjerciciosAssignment_8_in_rule__Clasico__Group__8__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__9__Impl_in_rule__Clasico__Group__93157 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__10_in_rule__Clasico__Group__93160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__0_in_rule__Clasico__Group__9__Impl3187 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__10__Impl_in_rule__Clasico__Group__103218 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__11_in_rule__Clasico__Group__103221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Clasico__Group__10__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__11__Impl_in_rule__Clasico__Group__113280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Clasico__Group__11__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__0__Impl_in_rule__Clasico__Group_9__03363 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__1_in_rule__Clasico__Group_9__03366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Clasico__Group_9__0__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__1__Impl_in_rule__Clasico__Group_9__13425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__EjerciciosAssignment_9_1_in_rule__Clasico__Group_9__1__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__0__Impl_in_rule__Wizard__Group__03486 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__1_in_rule__Wizard__Group__03489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Wizard__Group__0__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__1__Impl_in_rule__Wizard__Group__13548 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__2_in_rule__Wizard__Group__13551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Wizard__Group__1__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__2__Impl_in_rule__Wizard__Group__23610 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Wizard__Group__3_in_rule__Wizard__Group__23613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Wizard__Group__2__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__3__Impl_in_rule__Wizard__Group__33672 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__4_in_rule__Wizard__Group__33675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__PuntuacionAssignment_3_in_rule__Wizard__Group__3__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__4__Impl_in_rule__Wizard__Group__43732 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Wizard__Group__5_in_rule__Wizard__Group__43735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Wizard__Group__4__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__5__Impl_in_rule__Wizard__Group__53794 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__6_in_rule__Wizard__Group__53797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__PenalizacionAssignment_5_in_rule__Wizard__Group__5__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__6__Impl_in_rule__Wizard__Group__63854 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__7_in_rule__Wizard__Group__63857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Wizard__Group__6__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__7__Impl_in_rule__Wizard__Group__73916 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__8_in_rule__Wizard__Group__73919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Wizard__Group__7__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__8__Impl_in_rule__Wizard__Group__83978 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__9_in_rule__Wizard__Group__83981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__EjerciciosAssignment_8_in_rule__Wizard__Group__8__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__9__Impl_in_rule__Wizard__Group__94038 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__10_in_rule__Wizard__Group__94041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__0_in_rule__Wizard__Group__9__Impl4068 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__10__Impl_in_rule__Wizard__Group__104099 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__11_in_rule__Wizard__Group__104102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Wizard__Group__10__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__11__Impl_in_rule__Wizard__Group__114161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Wizard__Group__11__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__0__Impl_in_rule__Wizard__Group_9__04244 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__1_in_rule__Wizard__Group_9__04247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Wizard__Group_9__0__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__1__Impl_in_rule__Wizard__Group_9__14306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__EjerciciosAssignment_9_1_in_rule__Wizard__Group_9__1__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__0__Impl_in_rule__WizardAdaptativo__Group__04367 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__1_in_rule__WizardAdaptativo__Group__04370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__WizardAdaptativo__Group__0__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__1__Impl_in_rule__WizardAdaptativo__Group__14429 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__2_in_rule__WizardAdaptativo__Group__14432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WizardAdaptativo__Group__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__2__Impl_in_rule__WizardAdaptativo__Group__24491 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__3_in_rule__WizardAdaptativo__Group__24494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__WizardAdaptativo__Group__2__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__3__Impl_in_rule__WizardAdaptativo__Group__34553 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__4_in_rule__WizardAdaptativo__Group__34556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__PuntuacionAssignment_3_in_rule__WizardAdaptativo__Group__3__Impl4583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__4__Impl_in_rule__WizardAdaptativo__Group__44613 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__5_in_rule__WizardAdaptativo__Group__44616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__WizardAdaptativo__Group__4__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__5__Impl_in_rule__WizardAdaptativo__Group__54675 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__6_in_rule__WizardAdaptativo__Group__54678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__PenalizacionAssignment_5_in_rule__WizardAdaptativo__Group__5__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__6__Impl_in_rule__WizardAdaptativo__Group__64735 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__7_in_rule__WizardAdaptativo__Group__64738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__WizardAdaptativo__Group__6__Impl4766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__7__Impl_in_rule__WizardAdaptativo__Group__74797 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__8_in_rule__WizardAdaptativo__Group__74800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WizardAdaptativo__Group__7__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__8__Impl_in_rule__WizardAdaptativo__Group__84859 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__9_in_rule__WizardAdaptativo__Group__84862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_8_in_rule__WizardAdaptativo__Group__8__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__9__Impl_in_rule__WizardAdaptativo__Group__94919 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__10_in_rule__WizardAdaptativo__Group__94922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__0_in_rule__WizardAdaptativo__Group__9__Impl4949 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__10__Impl_in_rule__WizardAdaptativo__Group__104980 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__11_in_rule__WizardAdaptativo__Group__104983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__WizardAdaptativo__Group__10__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__11__Impl_in_rule__WizardAdaptativo__Group__115042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__WizardAdaptativo__Group__11__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__0__Impl_in_rule__WizardAdaptativo__Group_9__05125 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__1_in_rule__WizardAdaptativo__Group_9__05128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__WizardAdaptativo__Group_9__0__Impl5156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__1__Impl_in_rule__WizardAdaptativo__Group_9__15187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_9_1_in_rule__WizardAdaptativo__Group_9__1__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05248 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EInt__Group__0__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__0__Impl_in_rule__RespuestaUnica__Group__05373 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__1_in_rule__RespuestaUnica__Group__05376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__1__Impl_in_rule__RespuestaUnica__Group__15434 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__2_in_rule__RespuestaUnica__Group__15437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RespuestaUnica__Group__1__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__2__Impl_in_rule__RespuestaUnica__Group__25496 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__3_in_rule__RespuestaUnica__Group__25499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group__2__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__3__Impl_in_rule__RespuestaUnica__Group__35558 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__4_in_rule__RespuestaUnica__Group__35561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__0_in_rule__RespuestaUnica__Group__3__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__4__Impl_in_rule__RespuestaUnica__Group__45619 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__5_in_rule__RespuestaUnica__Group__45622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__0_in_rule__RespuestaUnica__Group__4__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__5__Impl_in_rule__RespuestaUnica__Group__55680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RespuestaUnica__Group__5__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__0__Impl_in_rule__RespuestaUnica__Group_3__05751 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__1_in_rule__RespuestaUnica__Group_3__05754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RespuestaUnica__Group_3__0__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__1__Impl_in_rule__RespuestaUnica__Group_3__15813 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__2_in_rule__RespuestaUnica__Group_3__15816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group_3__1__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__2__Impl_in_rule__RespuestaUnica__Group_3__25875 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__3_in_rule__RespuestaUnica__Group_3__25878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_2_in_rule__RespuestaUnica__Group_3__2__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__3__Impl_in_rule__RespuestaUnica__Group_3__35935 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__4_in_rule__RespuestaUnica__Group_3__35938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__0_in_rule__RespuestaUnica__Group_3__3__Impl5965 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__4__Impl_in_rule__RespuestaUnica__Group_3__45996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RespuestaUnica__Group_3__4__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__0__Impl_in_rule__RespuestaUnica__Group_3_3__06065 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__1_in_rule__RespuestaUnica__Group_3_3__06068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaUnica__Group_3_3__0__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__1__Impl_in_rule__RespuestaUnica__Group_3_3__16127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_3_1_in_rule__RespuestaUnica__Group_3_3__1__Impl6154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__0__Impl_in_rule__RespuestaUnica__Group_4__06188 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__1_in_rule__RespuestaUnica__Group_4__06191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RespuestaUnica__Group_4__0__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__1__Impl_in_rule__RespuestaUnica__Group_4__16250 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__2_in_rule__RespuestaUnica__Group_4__16253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group_4__1__Impl6281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__2__Impl_in_rule__RespuestaUnica__Group_4__26312 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__3_in_rule__RespuestaUnica__Group_4__26315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_2_in_rule__RespuestaUnica__Group_4__2__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__3__Impl_in_rule__RespuestaUnica__Group_4__36372 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__4_in_rule__RespuestaUnica__Group_4__36375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__0_in_rule__RespuestaUnica__Group_4__3__Impl6402 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__4__Impl_in_rule__RespuestaUnica__Group_4__46433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RespuestaUnica__Group_4__4__Impl6461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__0__Impl_in_rule__RespuestaUnica__Group_4_3__06502 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__1_in_rule__RespuestaUnica__Group_4_3__06505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaUnica__Group_4_3__0__Impl6533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__1__Impl_in_rule__RespuestaUnica__Group_4_3__16564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_3_1_in_rule__RespuestaUnica__Group_4_3__1__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__0__Impl_in_rule__RespuestaMultiple__Group__06625 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__1_in_rule__RespuestaMultiple__Group__06628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__1__Impl_in_rule__RespuestaMultiple__Group__16686 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__2_in_rule__RespuestaMultiple__Group__16689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__RespuestaMultiple__Group__1__Impl6717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__2__Impl_in_rule__RespuestaMultiple__Group__26748 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__3_in_rule__RespuestaMultiple__Group__26751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group__2__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__3__Impl_in_rule__RespuestaMultiple__Group__36810 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__4_in_rule__RespuestaMultiple__Group__36813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__0_in_rule__RespuestaMultiple__Group__3__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__4__Impl_in_rule__RespuestaMultiple__Group__46871 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__5_in_rule__RespuestaMultiple__Group__46874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__0_in_rule__RespuestaMultiple__Group__4__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__5__Impl_in_rule__RespuestaMultiple__Group__56932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RespuestaMultiple__Group__5__Impl6960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__0__Impl_in_rule__RespuestaMultiple__Group_3__07003 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__1_in_rule__RespuestaMultiple__Group_3__07006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RespuestaMultiple__Group_3__0__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__1__Impl_in_rule__RespuestaMultiple__Group_3__17065 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__2_in_rule__RespuestaMultiple__Group_3__17068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group_3__1__Impl7096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__2__Impl_in_rule__RespuestaMultiple__Group_3__27127 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__3_in_rule__RespuestaMultiple__Group_3__27130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_2_in_rule__RespuestaMultiple__Group_3__2__Impl7157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__3__Impl_in_rule__RespuestaMultiple__Group_3__37187 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__4_in_rule__RespuestaMultiple__Group_3__37190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__0_in_rule__RespuestaMultiple__Group_3__3__Impl7217 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__4__Impl_in_rule__RespuestaMultiple__Group_3__47248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RespuestaMultiple__Group_3__4__Impl7276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__0__Impl_in_rule__RespuestaMultiple__Group_3_3__07317 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__1_in_rule__RespuestaMultiple__Group_3_3__07320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaMultiple__Group_3_3__0__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__1__Impl_in_rule__RespuestaMultiple__Group_3_3__17379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_3_1_in_rule__RespuestaMultiple__Group_3_3__1__Impl7406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__0__Impl_in_rule__RespuestaMultiple__Group_4__07440 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__1_in_rule__RespuestaMultiple__Group_4__07443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RespuestaMultiple__Group_4__0__Impl7471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__1__Impl_in_rule__RespuestaMultiple__Group_4__17502 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__2_in_rule__RespuestaMultiple__Group_4__17505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group_4__1__Impl7533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__2__Impl_in_rule__RespuestaMultiple__Group_4__27564 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__3_in_rule__RespuestaMultiple__Group_4__27567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_2_in_rule__RespuestaMultiple__Group_4__2__Impl7594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__3__Impl_in_rule__RespuestaMultiple__Group_4__37624 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__4_in_rule__RespuestaMultiple__Group_4__37627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__0_in_rule__RespuestaMultiple__Group_4__3__Impl7654 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__4__Impl_in_rule__RespuestaMultiple__Group_4__47685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RespuestaMultiple__Group_4__4__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__0__Impl_in_rule__RespuestaMultiple__Group_4_3__07754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__1_in_rule__RespuestaMultiple__Group_4_3__07757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaMultiple__Group_4_3__0__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__1__Impl_in_rule__RespuestaMultiple__Group_4_3__17816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_3_1_in_rule__RespuestaMultiple__Group_4_3__1__Impl7843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__0__Impl_in_rule__TextoLibre__Group__07877 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__1_in_rule__TextoLibre__Group__07880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__1__Impl_in_rule__TextoLibre__Group__17938 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__2_in_rule__TextoLibre__Group__17941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TextoLibre__Group__1__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__2__Impl_in_rule__TextoLibre__Group__28000 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__3_in_rule__TextoLibre__Group__28003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group__2__Impl8031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__3__Impl_in_rule__TextoLibre__Group__38062 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__4_in_rule__TextoLibre__Group__38065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__0_in_rule__TextoLibre__Group__3__Impl8092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__4__Impl_in_rule__TextoLibre__Group__48123 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__5_in_rule__TextoLibre__Group__48126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__0_in_rule__TextoLibre__Group__4__Impl8153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__5__Impl_in_rule__TextoLibre__Group__58184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TextoLibre__Group__5__Impl8212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__0__Impl_in_rule__TextoLibre__Group_3__08255 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__1_in_rule__TextoLibre__Group_3__08258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TextoLibre__Group_3__0__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__1__Impl_in_rule__TextoLibre__Group_3__18317 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__2_in_rule__TextoLibre__Group_3__18320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group_3__1__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__2__Impl_in_rule__TextoLibre__Group_3__28379 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__3_in_rule__TextoLibre__Group_3__28382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__CorrectasAssignment_3_2_in_rule__TextoLibre__Group_3__2__Impl8409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__3__Impl_in_rule__TextoLibre__Group_3__38439 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__4_in_rule__TextoLibre__Group_3__38442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__0_in_rule__TextoLibre__Group_3__3__Impl8469 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__4__Impl_in_rule__TextoLibre__Group_3__48500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TextoLibre__Group_3__4__Impl8528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__0__Impl_in_rule__TextoLibre__Group_3_3__08569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__1_in_rule__TextoLibre__Group_3_3__08572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TextoLibre__Group_3_3__0__Impl8600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__1__Impl_in_rule__TextoLibre__Group_3_3__18631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__CorrectasAssignment_3_3_1_in_rule__TextoLibre__Group_3_3__1__Impl8658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__0__Impl_in_rule__TextoLibre__Group_4__08692 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__1_in_rule__TextoLibre__Group_4__08695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TextoLibre__Group_4__0__Impl8723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__1__Impl_in_rule__TextoLibre__Group_4__18754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__2_in_rule__TextoLibre__Group_4__18757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group_4__1__Impl8785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__2__Impl_in_rule__TextoLibre__Group_4__28816 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__3_in_rule__TextoLibre__Group_4__28819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__AlternativasAssignment_4_2_in_rule__TextoLibre__Group_4__2__Impl8846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__3__Impl_in_rule__TextoLibre__Group_4__38876 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__4_in_rule__TextoLibre__Group_4__38879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__0_in_rule__TextoLibre__Group_4__3__Impl8906 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__4__Impl_in_rule__TextoLibre__Group_4__48937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TextoLibre__Group_4__4__Impl8965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__0__Impl_in_rule__TextoLibre__Group_4_3__09006 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__1_in_rule__TextoLibre__Group_4_3__09009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TextoLibre__Group_4_3__0__Impl9037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__1__Impl_in_rule__TextoLibre__Group_4_3__19068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__AlternativasAssignment_4_3_1_in_rule__TextoLibre__Group_4_3__1__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__0__Impl_in_rule__Ordenacion__Group__09129 = new BitSet(new long[]{0x0000000E40000000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__1_in_rule__Ordenacion__Group__09132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__1__Impl_in_rule__Ordenacion__Group__19190 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__2_in_rule__Ordenacion__Group__19193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Ordenacion__Group__1__Impl9221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__2__Impl_in_rule__Ordenacion__Group__29252 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__3_in_rule__Ordenacion__Group__29255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group__2__Impl9283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__3__Impl_in_rule__Ordenacion__Group__39314 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__4_in_rule__Ordenacion__Group__39317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__0_in_rule__Ordenacion__Group__3__Impl9344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__4__Impl_in_rule__Ordenacion__Group__49375 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__5_in_rule__Ordenacion__Group__49378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__0_in_rule__Ordenacion__Group__4__Impl9405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__5__Impl_in_rule__Ordenacion__Group__59436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ordenacion__Group__5__Impl9464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__0__Impl_in_rule__Ordenacion__Group_3__09507 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__1_in_rule__Ordenacion__Group_3__09510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ordenacion__Group_3__0__Impl9538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__1__Impl_in_rule__Ordenacion__Group_3__19569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__2_in_rule__Ordenacion__Group_3__19572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group_3__1__Impl9600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__2__Impl_in_rule__Ordenacion__Group_3__29631 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__3_in_rule__Ordenacion__Group_3__29634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__CorrectasAssignment_3_2_in_rule__Ordenacion__Group_3__2__Impl9661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__3__Impl_in_rule__Ordenacion__Group_3__39691 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__4_in_rule__Ordenacion__Group_3__39694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__0_in_rule__Ordenacion__Group_3__3__Impl9721 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__4__Impl_in_rule__Ordenacion__Group_3__49752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ordenacion__Group_3__4__Impl9780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__0__Impl_in_rule__Ordenacion__Group_3_3__09821 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__1_in_rule__Ordenacion__Group_3_3__09824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ordenacion__Group_3_3__0__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__1__Impl_in_rule__Ordenacion__Group_3_3__19883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__CorrectasAssignment_3_3_1_in_rule__Ordenacion__Group_3_3__1__Impl9910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__0__Impl_in_rule__Ordenacion__Group_4__09944 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__1_in_rule__Ordenacion__Group_4__09947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Ordenacion__Group_4__0__Impl9975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__1__Impl_in_rule__Ordenacion__Group_4__110006 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__2_in_rule__Ordenacion__Group_4__110009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group_4__1__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__2__Impl_in_rule__Ordenacion__Group_4__210068 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__3_in_rule__Ordenacion__Group_4__210071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__AlternativasAssignment_4_2_in_rule__Ordenacion__Group_4__2__Impl10098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__3__Impl_in_rule__Ordenacion__Group_4__310128 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__4_in_rule__Ordenacion__Group_4__310131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__0_in_rule__Ordenacion__Group_4__3__Impl10158 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__4__Impl_in_rule__Ordenacion__Group_4__410189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ordenacion__Group_4__4__Impl10217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__0__Impl_in_rule__Ordenacion__Group_4_3__010258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__1_in_rule__Ordenacion__Group_4_3__010261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ordenacion__Group_4_3__0__Impl10289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__1__Impl_in_rule__Ordenacion__Group_4_3__110320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__AlternativasAssignment_4_3_1_in_rule__Ordenacion__Group_4_3__1__Impl10347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__NameAssignment_110386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__EnunciadoAssignment_410417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Ejercicio__PuntuacionEjAssignment_5_110448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__CategoriaAssignment_6_110479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Ejercicio__OrderAssignment_810510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuesta_in_rule__Ejercicio__RespuestaAssignment_1010541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Clasico__PuntuacionAssignment_310572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Clasico__PenalizacionAssignment_510603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_810634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_9_110665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Wizard__PuntuacionAssignment_310696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Wizard__PenalizacionAssignment_510727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_810758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_9_110789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PuntuacionAssignment_310820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PenalizacionAssignment_510851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_810882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_9_110913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_210944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_3_110975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_211006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_3_111037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_211068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_3_111099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_211130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_3_111161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_211192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_3_111223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_211254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_3_111285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_211316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_3_111347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_211378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_3_111409 = new BitSet(new long[]{0x0000000000000002L});
    }


}