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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Ejercicio'", "'{'", "'enunciado'", "'categoria'", "'order'", "'respuesta'", "'}'", "'puntuacionEj'", "'-'", "'.'", "'Clasico'", "'puntuacion'", "'penalizacion'", "'ejercicios'", "','", "'Wizard'", "'WizardAdaptativo'", "'RespuestaUnica'", "'correctas'", "'alternativas'", "'RespuestaMultiple'", "'TextoLibre'", "'Ordenacion'"
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

            if ( (LA5_0==20) ) {
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:728:1: rule__Ejercicio__Group__6__Impl : ( 'categoria' ) ;
    public final void rule__Ejercicio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:732:1: ( ( 'categoria' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:733:1: ( 'categoria' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:733:1: ( 'categoria' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:734:1: 'categoria'
            {
             before(grammarAccess.getEjercicioAccess().getCategoriaKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Ejercicio__Group__6__Impl1499); 
             after(grammarAccess.getEjercicioAccess().getCategoriaKeyword_6()); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:747:1: rule__Ejercicio__Group__7 : rule__Ejercicio__Group__7__Impl rule__Ejercicio__Group__8 ;
    public final void rule__Ejercicio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:751:1: ( rule__Ejercicio__Group__7__Impl rule__Ejercicio__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:752:2: rule__Ejercicio__Group__7__Impl rule__Ejercicio__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__7__Impl_in_rule__Ejercicio__Group__71530);
            rule__Ejercicio__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__8_in_rule__Ejercicio__Group__71533);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:759:1: rule__Ejercicio__Group__7__Impl : ( ( rule__Ejercicio__CategoriaAssignment_7 ) ) ;
    public final void rule__Ejercicio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:763:1: ( ( ( rule__Ejercicio__CategoriaAssignment_7 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:764:1: ( ( rule__Ejercicio__CategoriaAssignment_7 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:764:1: ( ( rule__Ejercicio__CategoriaAssignment_7 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:765:1: ( rule__Ejercicio__CategoriaAssignment_7 )
            {
             before(grammarAccess.getEjercicioAccess().getCategoriaAssignment_7()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:766:1: ( rule__Ejercicio__CategoriaAssignment_7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:766:2: rule__Ejercicio__CategoriaAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__CategoriaAssignment_7_in_rule__Ejercicio__Group__7__Impl1560);
            rule__Ejercicio__CategoriaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getCategoriaAssignment_7()); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__8__Impl_in_rule__Ejercicio__Group__81590);
            rule__Ejercicio__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__9_in_rule__Ejercicio__Group__81593);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:788:1: rule__Ejercicio__Group__8__Impl : ( 'order' ) ;
    public final void rule__Ejercicio__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:792:1: ( ( 'order' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:793:1: ( 'order' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:793:1: ( 'order' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:794:1: 'order'
            {
             before(grammarAccess.getEjercicioAccess().getOrderKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Ejercicio__Group__8__Impl1621); 
             after(grammarAccess.getEjercicioAccess().getOrderKeyword_8()); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:807:1: rule__Ejercicio__Group__9 : rule__Ejercicio__Group__9__Impl rule__Ejercicio__Group__10 ;
    public final void rule__Ejercicio__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:811:1: ( rule__Ejercicio__Group__9__Impl rule__Ejercicio__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:812:2: rule__Ejercicio__Group__9__Impl rule__Ejercicio__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__9__Impl_in_rule__Ejercicio__Group__91652);
            rule__Ejercicio__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__10_in_rule__Ejercicio__Group__91655);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:819:1: rule__Ejercicio__Group__9__Impl : ( ( rule__Ejercicio__OrderAssignment_9 ) ) ;
    public final void rule__Ejercicio__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:823:1: ( ( ( rule__Ejercicio__OrderAssignment_9 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:824:1: ( ( rule__Ejercicio__OrderAssignment_9 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:824:1: ( ( rule__Ejercicio__OrderAssignment_9 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:825:1: ( rule__Ejercicio__OrderAssignment_9 )
            {
             before(grammarAccess.getEjercicioAccess().getOrderAssignment_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:826:1: ( rule__Ejercicio__OrderAssignment_9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:826:2: rule__Ejercicio__OrderAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__OrderAssignment_9_in_rule__Ejercicio__Group__9__Impl1682);
            rule__Ejercicio__OrderAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getOrderAssignment_9()); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__10__Impl_in_rule__Ejercicio__Group__101712);
            rule__Ejercicio__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__11_in_rule__Ejercicio__Group__101715);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:848:1: rule__Ejercicio__Group__10__Impl : ( 'respuesta' ) ;
    public final void rule__Ejercicio__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:852:1: ( ( 'respuesta' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:853:1: ( 'respuesta' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:853:1: ( 'respuesta' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:854:1: 'respuesta'
            {
             before(grammarAccess.getEjercicioAccess().getRespuestaKeyword_10()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ejercicio__Group__10__Impl1743); 
             after(grammarAccess.getEjercicioAccess().getRespuestaKeyword_10()); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:867:1: rule__Ejercicio__Group__11 : rule__Ejercicio__Group__11__Impl rule__Ejercicio__Group__12 ;
    public final void rule__Ejercicio__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:871:1: ( rule__Ejercicio__Group__11__Impl rule__Ejercicio__Group__12 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:872:2: rule__Ejercicio__Group__11__Impl rule__Ejercicio__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__11__Impl_in_rule__Ejercicio__Group__111774);
            rule__Ejercicio__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__12_in_rule__Ejercicio__Group__111777);
            rule__Ejercicio__Group__12();

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:879:1: rule__Ejercicio__Group__11__Impl : ( ( rule__Ejercicio__RespuestaAssignment_11 ) ) ;
    public final void rule__Ejercicio__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:883:1: ( ( ( rule__Ejercicio__RespuestaAssignment_11 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:884:1: ( ( rule__Ejercicio__RespuestaAssignment_11 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:884:1: ( ( rule__Ejercicio__RespuestaAssignment_11 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:885:1: ( rule__Ejercicio__RespuestaAssignment_11 )
            {
             before(grammarAccess.getEjercicioAccess().getRespuestaAssignment_11()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:886:1: ( rule__Ejercicio__RespuestaAssignment_11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:886:2: rule__Ejercicio__RespuestaAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__RespuestaAssignment_11_in_rule__Ejercicio__Group__11__Impl1804);
            rule__Ejercicio__RespuestaAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEjercicioAccess().getRespuestaAssignment_11()); 

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


    // $ANTLR start "rule__Ejercicio__Group__12"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:896:1: rule__Ejercicio__Group__12 : rule__Ejercicio__Group__12__Impl ;
    public final void rule__Ejercicio__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:900:1: ( rule__Ejercicio__Group__12__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:901:2: rule__Ejercicio__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group__12__Impl_in_rule__Ejercicio__Group__121834);
            rule__Ejercicio__Group__12__Impl();

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
    // $ANTLR end "rule__Ejercicio__Group__12"


    // $ANTLR start "rule__Ejercicio__Group__12__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:907:1: rule__Ejercicio__Group__12__Impl : ( '}' ) ;
    public final void rule__Ejercicio__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:911:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:912:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:912:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:913:1: '}'
            {
             before(grammarAccess.getEjercicioAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ejercicio__Group__12__Impl1862); 
             after(grammarAccess.getEjercicioAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Ejercicio__Group__12__Impl"


    // $ANTLR start "rule__Ejercicio__Group_5__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:952:1: rule__Ejercicio__Group_5__0 : rule__Ejercicio__Group_5__0__Impl rule__Ejercicio__Group_5__1 ;
    public final void rule__Ejercicio__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:956:1: ( rule__Ejercicio__Group_5__0__Impl rule__Ejercicio__Group_5__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:957:2: rule__Ejercicio__Group_5__0__Impl rule__Ejercicio__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_5__0__Impl_in_rule__Ejercicio__Group_5__01919);
            rule__Ejercicio__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_5__1_in_rule__Ejercicio__Group_5__01922);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:964:1: rule__Ejercicio__Group_5__0__Impl : ( 'puntuacionEj' ) ;
    public final void rule__Ejercicio__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:968:1: ( ( 'puntuacionEj' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:969:1: ( 'puntuacionEj' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:969:1: ( 'puntuacionEj' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:970:1: 'puntuacionEj'
            {
             before(grammarAccess.getEjercicioAccess().getPuntuacionEjKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Ejercicio__Group_5__0__Impl1950); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:983:1: rule__Ejercicio__Group_5__1 : rule__Ejercicio__Group_5__1__Impl ;
    public final void rule__Ejercicio__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:987:1: ( rule__Ejercicio__Group_5__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:988:2: rule__Ejercicio__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__Group_5__1__Impl_in_rule__Ejercicio__Group_5__11981);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:994:1: rule__Ejercicio__Group_5__1__Impl : ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) ) ;
    public final void rule__Ejercicio__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:998:1: ( ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:999:1: ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:999:1: ( ( rule__Ejercicio__PuntuacionEjAssignment_5_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1000:1: ( rule__Ejercicio__PuntuacionEjAssignment_5_1 )
            {
             before(grammarAccess.getEjercicioAccess().getPuntuacionEjAssignment_5_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1001:1: ( rule__Ejercicio__PuntuacionEjAssignment_5_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1001:2: rule__Ejercicio__PuntuacionEjAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ejercicio__PuntuacionEjAssignment_5_1_in_rule__Ejercicio__Group_5__1__Impl2008);
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


    // $ANTLR start "rule__EDouble__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1015:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1019:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1020:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02042);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02045);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1027:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1031:1: ( ( ( '-' )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1032:1: ( ( '-' )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1032:1: ( ( '-' )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1033:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1034:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1035:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EDouble__Group__0__Impl2074); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1046:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1050:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1051:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__12107);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__12110);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1058:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1062:1: ( ( ( RULE_INT )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1063:1: ( ( RULE_INT )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1063:1: ( ( RULE_INT )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1064:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1065:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1065:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl2138); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1075:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1079:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1080:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__22169);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__22172);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1087:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1091:1: ( ( '.' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1092:1: ( '.' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1092:1: ( '.' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1093:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EDouble__Group__2__Impl2200); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1106:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1110:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1111:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__32231);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__32234);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1118:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1122:1: ( ( RULE_INT ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1123:1: ( RULE_INT )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1123:1: ( RULE_INT )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1124:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl2261); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1135:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1139:1: ( rule__EDouble__Group__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1140:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__42290);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1146:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1150:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1151:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1151:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1152:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1153:1: ( rule__EDouble__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1153:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl2317);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1173:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1177:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1178:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__02358);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__02361);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1185:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1189:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1190:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1190:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1191:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1192:1: ( rule__EDouble__Alternatives_4_0 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1192:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl2388);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1202:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1206:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1207:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__12418);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__12421);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1214:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1218:1: ( ( ( '-' )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1219:1: ( ( '-' )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1219:1: ( ( '-' )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1220:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1221:1: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1222:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EDouble__Group_4__1__Impl2450); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1233:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1237:1: ( rule__EDouble__Group_4__2__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1238:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__22483);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1244:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1248:1: ( ( RULE_INT ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1249:1: ( RULE_INT )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1249:1: ( RULE_INT )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1250:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl2510); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1267:1: rule__Clasico__Group__0 : rule__Clasico__Group__0__Impl rule__Clasico__Group__1 ;
    public final void rule__Clasico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1271:1: ( rule__Clasico__Group__0__Impl rule__Clasico__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1272:2: rule__Clasico__Group__0__Impl rule__Clasico__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__0__Impl_in_rule__Clasico__Group__02545);
            rule__Clasico__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__1_in_rule__Clasico__Group__02548);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1279:1: rule__Clasico__Group__0__Impl : ( 'Clasico' ) ;
    public final void rule__Clasico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1283:1: ( ( 'Clasico' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1284:1: ( 'Clasico' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1284:1: ( 'Clasico' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1285:1: 'Clasico'
            {
             before(grammarAccess.getClasicoAccess().getClasicoKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Clasico__Group__0__Impl2576); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1298:1: rule__Clasico__Group__1 : rule__Clasico__Group__1__Impl rule__Clasico__Group__2 ;
    public final void rule__Clasico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1302:1: ( rule__Clasico__Group__1__Impl rule__Clasico__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1303:2: rule__Clasico__Group__1__Impl rule__Clasico__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__1__Impl_in_rule__Clasico__Group__12607);
            rule__Clasico__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__2_in_rule__Clasico__Group__12610);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1310:1: rule__Clasico__Group__1__Impl : ( '{' ) ;
    public final void rule__Clasico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1314:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1315:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1315:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1316:1: '{'
            {
             before(grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Clasico__Group__1__Impl2638); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1329:1: rule__Clasico__Group__2 : rule__Clasico__Group__2__Impl rule__Clasico__Group__3 ;
    public final void rule__Clasico__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1333:1: ( rule__Clasico__Group__2__Impl rule__Clasico__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1334:2: rule__Clasico__Group__2__Impl rule__Clasico__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__2__Impl_in_rule__Clasico__Group__22669);
            rule__Clasico__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__3_in_rule__Clasico__Group__22672);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1341:1: rule__Clasico__Group__2__Impl : ( 'puntuacion' ) ;
    public final void rule__Clasico__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1345:1: ( ( 'puntuacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1346:1: ( 'puntuacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1346:1: ( 'puntuacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1347:1: 'puntuacion'
            {
             before(grammarAccess.getClasicoAccess().getPuntuacionKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Clasico__Group__2__Impl2700); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1360:1: rule__Clasico__Group__3 : rule__Clasico__Group__3__Impl rule__Clasico__Group__4 ;
    public final void rule__Clasico__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1364:1: ( rule__Clasico__Group__3__Impl rule__Clasico__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1365:2: rule__Clasico__Group__3__Impl rule__Clasico__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__3__Impl_in_rule__Clasico__Group__32731);
            rule__Clasico__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__4_in_rule__Clasico__Group__32734);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1372:1: rule__Clasico__Group__3__Impl : ( ( rule__Clasico__PuntuacionAssignment_3 ) ) ;
    public final void rule__Clasico__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1376:1: ( ( ( rule__Clasico__PuntuacionAssignment_3 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1377:1: ( ( rule__Clasico__PuntuacionAssignment_3 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1377:1: ( ( rule__Clasico__PuntuacionAssignment_3 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1378:1: ( rule__Clasico__PuntuacionAssignment_3 )
            {
             before(grammarAccess.getClasicoAccess().getPuntuacionAssignment_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1379:1: ( rule__Clasico__PuntuacionAssignment_3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1379:2: rule__Clasico__PuntuacionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__PuntuacionAssignment_3_in_rule__Clasico__Group__3__Impl2761);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1389:1: rule__Clasico__Group__4 : rule__Clasico__Group__4__Impl rule__Clasico__Group__5 ;
    public final void rule__Clasico__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1393:1: ( rule__Clasico__Group__4__Impl rule__Clasico__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1394:2: rule__Clasico__Group__4__Impl rule__Clasico__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__4__Impl_in_rule__Clasico__Group__42791);
            rule__Clasico__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__5_in_rule__Clasico__Group__42794);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1401:1: rule__Clasico__Group__4__Impl : ( 'penalizacion' ) ;
    public final void rule__Clasico__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1405:1: ( ( 'penalizacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1406:1: ( 'penalizacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1406:1: ( 'penalizacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1407:1: 'penalizacion'
            {
             before(grammarAccess.getClasicoAccess().getPenalizacionKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Clasico__Group__4__Impl2822); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1420:1: rule__Clasico__Group__5 : rule__Clasico__Group__5__Impl rule__Clasico__Group__6 ;
    public final void rule__Clasico__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1424:1: ( rule__Clasico__Group__5__Impl rule__Clasico__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1425:2: rule__Clasico__Group__5__Impl rule__Clasico__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__5__Impl_in_rule__Clasico__Group__52853);
            rule__Clasico__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__6_in_rule__Clasico__Group__52856);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1432:1: rule__Clasico__Group__5__Impl : ( ( rule__Clasico__PenalizacionAssignment_5 ) ) ;
    public final void rule__Clasico__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1436:1: ( ( ( rule__Clasico__PenalizacionAssignment_5 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1437:1: ( ( rule__Clasico__PenalizacionAssignment_5 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1437:1: ( ( rule__Clasico__PenalizacionAssignment_5 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1438:1: ( rule__Clasico__PenalizacionAssignment_5 )
            {
             before(grammarAccess.getClasicoAccess().getPenalizacionAssignment_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1439:1: ( rule__Clasico__PenalizacionAssignment_5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1439:2: rule__Clasico__PenalizacionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__PenalizacionAssignment_5_in_rule__Clasico__Group__5__Impl2883);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1449:1: rule__Clasico__Group__6 : rule__Clasico__Group__6__Impl rule__Clasico__Group__7 ;
    public final void rule__Clasico__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1453:1: ( rule__Clasico__Group__6__Impl rule__Clasico__Group__7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1454:2: rule__Clasico__Group__6__Impl rule__Clasico__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__6__Impl_in_rule__Clasico__Group__62913);
            rule__Clasico__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__7_in_rule__Clasico__Group__62916);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1461:1: rule__Clasico__Group__6__Impl : ( 'ejercicios' ) ;
    public final void rule__Clasico__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1465:1: ( ( 'ejercicios' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1466:1: ( 'ejercicios' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1466:1: ( 'ejercicios' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1467:1: 'ejercicios'
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Clasico__Group__6__Impl2944); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1480:1: rule__Clasico__Group__7 : rule__Clasico__Group__7__Impl rule__Clasico__Group__8 ;
    public final void rule__Clasico__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1484:1: ( rule__Clasico__Group__7__Impl rule__Clasico__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1485:2: rule__Clasico__Group__7__Impl rule__Clasico__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__7__Impl_in_rule__Clasico__Group__72975);
            rule__Clasico__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__8_in_rule__Clasico__Group__72978);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1492:1: rule__Clasico__Group__7__Impl : ( '{' ) ;
    public final void rule__Clasico__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1496:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1497:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1497:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1498:1: '{'
            {
             before(grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Clasico__Group__7__Impl3006); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1511:1: rule__Clasico__Group__8 : rule__Clasico__Group__8__Impl rule__Clasico__Group__9 ;
    public final void rule__Clasico__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1515:1: ( rule__Clasico__Group__8__Impl rule__Clasico__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1516:2: rule__Clasico__Group__8__Impl rule__Clasico__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__8__Impl_in_rule__Clasico__Group__83037);
            rule__Clasico__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__9_in_rule__Clasico__Group__83040);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1523:1: rule__Clasico__Group__8__Impl : ( ( rule__Clasico__EjerciciosAssignment_8 ) ) ;
    public final void rule__Clasico__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1527:1: ( ( ( rule__Clasico__EjerciciosAssignment_8 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1528:1: ( ( rule__Clasico__EjerciciosAssignment_8 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1528:1: ( ( rule__Clasico__EjerciciosAssignment_8 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1529:1: ( rule__Clasico__EjerciciosAssignment_8 )
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosAssignment_8()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1530:1: ( rule__Clasico__EjerciciosAssignment_8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1530:2: rule__Clasico__EjerciciosAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__EjerciciosAssignment_8_in_rule__Clasico__Group__8__Impl3067);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1540:1: rule__Clasico__Group__9 : rule__Clasico__Group__9__Impl rule__Clasico__Group__10 ;
    public final void rule__Clasico__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1544:1: ( rule__Clasico__Group__9__Impl rule__Clasico__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1545:2: rule__Clasico__Group__9__Impl rule__Clasico__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__9__Impl_in_rule__Clasico__Group__93097);
            rule__Clasico__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__10_in_rule__Clasico__Group__93100);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1552:1: rule__Clasico__Group__9__Impl : ( ( rule__Clasico__Group_9__0 )* ) ;
    public final void rule__Clasico__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1556:1: ( ( ( rule__Clasico__Group_9__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1557:1: ( ( rule__Clasico__Group_9__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1557:1: ( ( rule__Clasico__Group_9__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1558:1: ( rule__Clasico__Group_9__0 )*
            {
             before(grammarAccess.getClasicoAccess().getGroup_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1559:1: ( rule__Clasico__Group_9__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1559:2: rule__Clasico__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__0_in_rule__Clasico__Group__9__Impl3127);
            	    rule__Clasico__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1569:1: rule__Clasico__Group__10 : rule__Clasico__Group__10__Impl rule__Clasico__Group__11 ;
    public final void rule__Clasico__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1573:1: ( rule__Clasico__Group__10__Impl rule__Clasico__Group__11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1574:2: rule__Clasico__Group__10__Impl rule__Clasico__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__10__Impl_in_rule__Clasico__Group__103158);
            rule__Clasico__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__11_in_rule__Clasico__Group__103161);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1581:1: rule__Clasico__Group__10__Impl : ( '}' ) ;
    public final void rule__Clasico__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1585:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1586:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1586:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1587:1: '}'
            {
             before(grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Clasico__Group__10__Impl3189); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1600:1: rule__Clasico__Group__11 : rule__Clasico__Group__11__Impl ;
    public final void rule__Clasico__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1604:1: ( rule__Clasico__Group__11__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1605:2: rule__Clasico__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group__11__Impl_in_rule__Clasico__Group__113220);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1611:1: rule__Clasico__Group__11__Impl : ( '}' ) ;
    public final void rule__Clasico__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1615:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1616:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1616:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1617:1: '}'
            {
             before(grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Clasico__Group__11__Impl3248); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1654:1: rule__Clasico__Group_9__0 : rule__Clasico__Group_9__0__Impl rule__Clasico__Group_9__1 ;
    public final void rule__Clasico__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1658:1: ( rule__Clasico__Group_9__0__Impl rule__Clasico__Group_9__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1659:2: rule__Clasico__Group_9__0__Impl rule__Clasico__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__0__Impl_in_rule__Clasico__Group_9__03303);
            rule__Clasico__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__1_in_rule__Clasico__Group_9__03306);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1666:1: rule__Clasico__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Clasico__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1670:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1671:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1671:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1672:1: ','
            {
             before(grammarAccess.getClasicoAccess().getCommaKeyword_9_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Clasico__Group_9__0__Impl3334); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1685:1: rule__Clasico__Group_9__1 : rule__Clasico__Group_9__1__Impl ;
    public final void rule__Clasico__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1689:1: ( rule__Clasico__Group_9__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1690:2: rule__Clasico__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__Group_9__1__Impl_in_rule__Clasico__Group_9__13365);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1696:1: rule__Clasico__Group_9__1__Impl : ( ( rule__Clasico__EjerciciosAssignment_9_1 ) ) ;
    public final void rule__Clasico__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1700:1: ( ( ( rule__Clasico__EjerciciosAssignment_9_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1701:1: ( ( rule__Clasico__EjerciciosAssignment_9_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1701:1: ( ( rule__Clasico__EjerciciosAssignment_9_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1702:1: ( rule__Clasico__EjerciciosAssignment_9_1 )
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosAssignment_9_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1703:1: ( rule__Clasico__EjerciciosAssignment_9_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1703:2: rule__Clasico__EjerciciosAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clasico__EjerciciosAssignment_9_1_in_rule__Clasico__Group_9__1__Impl3392);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1717:1: rule__Wizard__Group__0 : rule__Wizard__Group__0__Impl rule__Wizard__Group__1 ;
    public final void rule__Wizard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1721:1: ( rule__Wizard__Group__0__Impl rule__Wizard__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1722:2: rule__Wizard__Group__0__Impl rule__Wizard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__0__Impl_in_rule__Wizard__Group__03426);
            rule__Wizard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__1_in_rule__Wizard__Group__03429);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1729:1: rule__Wizard__Group__0__Impl : ( 'Wizard' ) ;
    public final void rule__Wizard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1733:1: ( ( 'Wizard' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1734:1: ( 'Wizard' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1734:1: ( 'Wizard' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1735:1: 'Wizard'
            {
             before(grammarAccess.getWizardAccess().getWizardKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Wizard__Group__0__Impl3457); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1748:1: rule__Wizard__Group__1 : rule__Wizard__Group__1__Impl rule__Wizard__Group__2 ;
    public final void rule__Wizard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1752:1: ( rule__Wizard__Group__1__Impl rule__Wizard__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1753:2: rule__Wizard__Group__1__Impl rule__Wizard__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__1__Impl_in_rule__Wizard__Group__13488);
            rule__Wizard__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__2_in_rule__Wizard__Group__13491);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1760:1: rule__Wizard__Group__1__Impl : ( '{' ) ;
    public final void rule__Wizard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1764:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1765:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1765:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1766:1: '{'
            {
             before(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Wizard__Group__1__Impl3519); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1779:1: rule__Wizard__Group__2 : rule__Wizard__Group__2__Impl rule__Wizard__Group__3 ;
    public final void rule__Wizard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1783:1: ( rule__Wizard__Group__2__Impl rule__Wizard__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1784:2: rule__Wizard__Group__2__Impl rule__Wizard__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__2__Impl_in_rule__Wizard__Group__23550);
            rule__Wizard__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__3_in_rule__Wizard__Group__23553);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1791:1: rule__Wizard__Group__2__Impl : ( 'puntuacion' ) ;
    public final void rule__Wizard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1795:1: ( ( 'puntuacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1796:1: ( 'puntuacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1796:1: ( 'puntuacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1797:1: 'puntuacion'
            {
             before(grammarAccess.getWizardAccess().getPuntuacionKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Wizard__Group__2__Impl3581); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1810:1: rule__Wizard__Group__3 : rule__Wizard__Group__3__Impl rule__Wizard__Group__4 ;
    public final void rule__Wizard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1814:1: ( rule__Wizard__Group__3__Impl rule__Wizard__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1815:2: rule__Wizard__Group__3__Impl rule__Wizard__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__3__Impl_in_rule__Wizard__Group__33612);
            rule__Wizard__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__4_in_rule__Wizard__Group__33615);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1822:1: rule__Wizard__Group__3__Impl : ( ( rule__Wizard__PuntuacionAssignment_3 ) ) ;
    public final void rule__Wizard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1826:1: ( ( ( rule__Wizard__PuntuacionAssignment_3 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1827:1: ( ( rule__Wizard__PuntuacionAssignment_3 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1827:1: ( ( rule__Wizard__PuntuacionAssignment_3 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1828:1: ( rule__Wizard__PuntuacionAssignment_3 )
            {
             before(grammarAccess.getWizardAccess().getPuntuacionAssignment_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1829:1: ( rule__Wizard__PuntuacionAssignment_3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1829:2: rule__Wizard__PuntuacionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__PuntuacionAssignment_3_in_rule__Wizard__Group__3__Impl3642);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1839:1: rule__Wizard__Group__4 : rule__Wizard__Group__4__Impl rule__Wizard__Group__5 ;
    public final void rule__Wizard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1843:1: ( rule__Wizard__Group__4__Impl rule__Wizard__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1844:2: rule__Wizard__Group__4__Impl rule__Wizard__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__4__Impl_in_rule__Wizard__Group__43672);
            rule__Wizard__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__5_in_rule__Wizard__Group__43675);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1851:1: rule__Wizard__Group__4__Impl : ( 'penalizacion' ) ;
    public final void rule__Wizard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1855:1: ( ( 'penalizacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1856:1: ( 'penalizacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1856:1: ( 'penalizacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1857:1: 'penalizacion'
            {
             before(grammarAccess.getWizardAccess().getPenalizacionKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Wizard__Group__4__Impl3703); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1870:1: rule__Wizard__Group__5 : rule__Wizard__Group__5__Impl rule__Wizard__Group__6 ;
    public final void rule__Wizard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1874:1: ( rule__Wizard__Group__5__Impl rule__Wizard__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1875:2: rule__Wizard__Group__5__Impl rule__Wizard__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__5__Impl_in_rule__Wizard__Group__53734);
            rule__Wizard__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__6_in_rule__Wizard__Group__53737);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1882:1: rule__Wizard__Group__5__Impl : ( ( rule__Wizard__PenalizacionAssignment_5 ) ) ;
    public final void rule__Wizard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1886:1: ( ( ( rule__Wizard__PenalizacionAssignment_5 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1887:1: ( ( rule__Wizard__PenalizacionAssignment_5 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1887:1: ( ( rule__Wizard__PenalizacionAssignment_5 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1888:1: ( rule__Wizard__PenalizacionAssignment_5 )
            {
             before(grammarAccess.getWizardAccess().getPenalizacionAssignment_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1889:1: ( rule__Wizard__PenalizacionAssignment_5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1889:2: rule__Wizard__PenalizacionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__PenalizacionAssignment_5_in_rule__Wizard__Group__5__Impl3764);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1899:1: rule__Wizard__Group__6 : rule__Wizard__Group__6__Impl rule__Wizard__Group__7 ;
    public final void rule__Wizard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1903:1: ( rule__Wizard__Group__6__Impl rule__Wizard__Group__7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1904:2: rule__Wizard__Group__6__Impl rule__Wizard__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__6__Impl_in_rule__Wizard__Group__63794);
            rule__Wizard__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__7_in_rule__Wizard__Group__63797);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1911:1: rule__Wizard__Group__6__Impl : ( 'ejercicios' ) ;
    public final void rule__Wizard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1915:1: ( ( 'ejercicios' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1916:1: ( 'ejercicios' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1916:1: ( 'ejercicios' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1917:1: 'ejercicios'
            {
             before(grammarAccess.getWizardAccess().getEjerciciosKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Wizard__Group__6__Impl3825); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1930:1: rule__Wizard__Group__7 : rule__Wizard__Group__7__Impl rule__Wizard__Group__8 ;
    public final void rule__Wizard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1934:1: ( rule__Wizard__Group__7__Impl rule__Wizard__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1935:2: rule__Wizard__Group__7__Impl rule__Wizard__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__7__Impl_in_rule__Wizard__Group__73856);
            rule__Wizard__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__8_in_rule__Wizard__Group__73859);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1942:1: rule__Wizard__Group__7__Impl : ( '{' ) ;
    public final void rule__Wizard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1946:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1947:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1947:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1948:1: '{'
            {
             before(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Wizard__Group__7__Impl3887); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1961:1: rule__Wizard__Group__8 : rule__Wizard__Group__8__Impl rule__Wizard__Group__9 ;
    public final void rule__Wizard__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1965:1: ( rule__Wizard__Group__8__Impl rule__Wizard__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1966:2: rule__Wizard__Group__8__Impl rule__Wizard__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__8__Impl_in_rule__Wizard__Group__83918);
            rule__Wizard__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__9_in_rule__Wizard__Group__83921);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1973:1: rule__Wizard__Group__8__Impl : ( ( rule__Wizard__EjerciciosAssignment_8 ) ) ;
    public final void rule__Wizard__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1977:1: ( ( ( rule__Wizard__EjerciciosAssignment_8 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1978:1: ( ( rule__Wizard__EjerciciosAssignment_8 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1978:1: ( ( rule__Wizard__EjerciciosAssignment_8 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1979:1: ( rule__Wizard__EjerciciosAssignment_8 )
            {
             before(grammarAccess.getWizardAccess().getEjerciciosAssignment_8()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1980:1: ( rule__Wizard__EjerciciosAssignment_8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1980:2: rule__Wizard__EjerciciosAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__EjerciciosAssignment_8_in_rule__Wizard__Group__8__Impl3948);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1990:1: rule__Wizard__Group__9 : rule__Wizard__Group__9__Impl rule__Wizard__Group__10 ;
    public final void rule__Wizard__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1994:1: ( rule__Wizard__Group__9__Impl rule__Wizard__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:1995:2: rule__Wizard__Group__9__Impl rule__Wizard__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__9__Impl_in_rule__Wizard__Group__93978);
            rule__Wizard__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__10_in_rule__Wizard__Group__93981);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2002:1: rule__Wizard__Group__9__Impl : ( ( rule__Wizard__Group_9__0 )* ) ;
    public final void rule__Wizard__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2006:1: ( ( ( rule__Wizard__Group_9__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2007:1: ( ( rule__Wizard__Group_9__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2007:1: ( ( rule__Wizard__Group_9__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2008:1: ( rule__Wizard__Group_9__0 )*
            {
             before(grammarAccess.getWizardAccess().getGroup_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2009:1: ( rule__Wizard__Group_9__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2009:2: rule__Wizard__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__0_in_rule__Wizard__Group__9__Impl4008);
            	    rule__Wizard__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2019:1: rule__Wizard__Group__10 : rule__Wizard__Group__10__Impl rule__Wizard__Group__11 ;
    public final void rule__Wizard__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2023:1: ( rule__Wizard__Group__10__Impl rule__Wizard__Group__11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2024:2: rule__Wizard__Group__10__Impl rule__Wizard__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__10__Impl_in_rule__Wizard__Group__104039);
            rule__Wizard__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__11_in_rule__Wizard__Group__104042);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2031:1: rule__Wizard__Group__10__Impl : ( '}' ) ;
    public final void rule__Wizard__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2035:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2036:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2036:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2037:1: '}'
            {
             before(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Wizard__Group__10__Impl4070); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2050:1: rule__Wizard__Group__11 : rule__Wizard__Group__11__Impl ;
    public final void rule__Wizard__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2054:1: ( rule__Wizard__Group__11__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2055:2: rule__Wizard__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group__11__Impl_in_rule__Wizard__Group__114101);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2061:1: rule__Wizard__Group__11__Impl : ( '}' ) ;
    public final void rule__Wizard__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2065:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2066:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2066:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2067:1: '}'
            {
             before(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Wizard__Group__11__Impl4129); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2104:1: rule__Wizard__Group_9__0 : rule__Wizard__Group_9__0__Impl rule__Wizard__Group_9__1 ;
    public final void rule__Wizard__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2108:1: ( rule__Wizard__Group_9__0__Impl rule__Wizard__Group_9__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2109:2: rule__Wizard__Group_9__0__Impl rule__Wizard__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__0__Impl_in_rule__Wizard__Group_9__04184);
            rule__Wizard__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__1_in_rule__Wizard__Group_9__04187);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2116:1: rule__Wizard__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Wizard__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2120:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2121:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2121:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2122:1: ','
            {
             before(grammarAccess.getWizardAccess().getCommaKeyword_9_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Wizard__Group_9__0__Impl4215); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2135:1: rule__Wizard__Group_9__1 : rule__Wizard__Group_9__1__Impl ;
    public final void rule__Wizard__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2139:1: ( rule__Wizard__Group_9__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2140:2: rule__Wizard__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__Group_9__1__Impl_in_rule__Wizard__Group_9__14246);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2146:1: rule__Wizard__Group_9__1__Impl : ( ( rule__Wizard__EjerciciosAssignment_9_1 ) ) ;
    public final void rule__Wizard__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2150:1: ( ( ( rule__Wizard__EjerciciosAssignment_9_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2151:1: ( ( rule__Wizard__EjerciciosAssignment_9_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2151:1: ( ( rule__Wizard__EjerciciosAssignment_9_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2152:1: ( rule__Wizard__EjerciciosAssignment_9_1 )
            {
             before(grammarAccess.getWizardAccess().getEjerciciosAssignment_9_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2153:1: ( rule__Wizard__EjerciciosAssignment_9_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2153:2: rule__Wizard__EjerciciosAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wizard__EjerciciosAssignment_9_1_in_rule__Wizard__Group_9__1__Impl4273);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2167:1: rule__WizardAdaptativo__Group__0 : rule__WizardAdaptativo__Group__0__Impl rule__WizardAdaptativo__Group__1 ;
    public final void rule__WizardAdaptativo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2171:1: ( rule__WizardAdaptativo__Group__0__Impl rule__WizardAdaptativo__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2172:2: rule__WizardAdaptativo__Group__0__Impl rule__WizardAdaptativo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__0__Impl_in_rule__WizardAdaptativo__Group__04307);
            rule__WizardAdaptativo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__1_in_rule__WizardAdaptativo__Group__04310);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2179:1: rule__WizardAdaptativo__Group__0__Impl : ( 'WizardAdaptativo' ) ;
    public final void rule__WizardAdaptativo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2183:1: ( ( 'WizardAdaptativo' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2184:1: ( 'WizardAdaptativo' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2184:1: ( 'WizardAdaptativo' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2185:1: 'WizardAdaptativo'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getWizardAdaptativoKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__WizardAdaptativo__Group__0__Impl4338); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2198:1: rule__WizardAdaptativo__Group__1 : rule__WizardAdaptativo__Group__1__Impl rule__WizardAdaptativo__Group__2 ;
    public final void rule__WizardAdaptativo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2202:1: ( rule__WizardAdaptativo__Group__1__Impl rule__WizardAdaptativo__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2203:2: rule__WizardAdaptativo__Group__1__Impl rule__WizardAdaptativo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__1__Impl_in_rule__WizardAdaptativo__Group__14369);
            rule__WizardAdaptativo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__2_in_rule__WizardAdaptativo__Group__14372);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2210:1: rule__WizardAdaptativo__Group__1__Impl : ( '{' ) ;
    public final void rule__WizardAdaptativo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2214:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2215:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2215:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2216:1: '{'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WizardAdaptativo__Group__1__Impl4400); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2229:1: rule__WizardAdaptativo__Group__2 : rule__WizardAdaptativo__Group__2__Impl rule__WizardAdaptativo__Group__3 ;
    public final void rule__WizardAdaptativo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2233:1: ( rule__WizardAdaptativo__Group__2__Impl rule__WizardAdaptativo__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2234:2: rule__WizardAdaptativo__Group__2__Impl rule__WizardAdaptativo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__2__Impl_in_rule__WizardAdaptativo__Group__24431);
            rule__WizardAdaptativo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__3_in_rule__WizardAdaptativo__Group__24434);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2241:1: rule__WizardAdaptativo__Group__2__Impl : ( 'puntuacion' ) ;
    public final void rule__WizardAdaptativo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2245:1: ( ( 'puntuacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2246:1: ( 'puntuacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2246:1: ( 'puntuacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2247:1: 'puntuacion'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPuntuacionKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__WizardAdaptativo__Group__2__Impl4462); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2260:1: rule__WizardAdaptativo__Group__3 : rule__WizardAdaptativo__Group__3__Impl rule__WizardAdaptativo__Group__4 ;
    public final void rule__WizardAdaptativo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2264:1: ( rule__WizardAdaptativo__Group__3__Impl rule__WizardAdaptativo__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2265:2: rule__WizardAdaptativo__Group__3__Impl rule__WizardAdaptativo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__3__Impl_in_rule__WizardAdaptativo__Group__34493);
            rule__WizardAdaptativo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__4_in_rule__WizardAdaptativo__Group__34496);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2272:1: rule__WizardAdaptativo__Group__3__Impl : ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) ) ;
    public final void rule__WizardAdaptativo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2276:1: ( ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2277:1: ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2277:1: ( ( rule__WizardAdaptativo__PuntuacionAssignment_3 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2278:1: ( rule__WizardAdaptativo__PuntuacionAssignment_3 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPuntuacionAssignment_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2279:1: ( rule__WizardAdaptativo__PuntuacionAssignment_3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2279:2: rule__WizardAdaptativo__PuntuacionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__PuntuacionAssignment_3_in_rule__WizardAdaptativo__Group__3__Impl4523);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2289:1: rule__WizardAdaptativo__Group__4 : rule__WizardAdaptativo__Group__4__Impl rule__WizardAdaptativo__Group__5 ;
    public final void rule__WizardAdaptativo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2293:1: ( rule__WizardAdaptativo__Group__4__Impl rule__WizardAdaptativo__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2294:2: rule__WizardAdaptativo__Group__4__Impl rule__WizardAdaptativo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__4__Impl_in_rule__WizardAdaptativo__Group__44553);
            rule__WizardAdaptativo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__5_in_rule__WizardAdaptativo__Group__44556);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2301:1: rule__WizardAdaptativo__Group__4__Impl : ( 'penalizacion' ) ;
    public final void rule__WizardAdaptativo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2305:1: ( ( 'penalizacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2306:1: ( 'penalizacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2306:1: ( 'penalizacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2307:1: 'penalizacion'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPenalizacionKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__WizardAdaptativo__Group__4__Impl4584); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2320:1: rule__WizardAdaptativo__Group__5 : rule__WizardAdaptativo__Group__5__Impl rule__WizardAdaptativo__Group__6 ;
    public final void rule__WizardAdaptativo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2324:1: ( rule__WizardAdaptativo__Group__5__Impl rule__WizardAdaptativo__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2325:2: rule__WizardAdaptativo__Group__5__Impl rule__WizardAdaptativo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__5__Impl_in_rule__WizardAdaptativo__Group__54615);
            rule__WizardAdaptativo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__6_in_rule__WizardAdaptativo__Group__54618);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2332:1: rule__WizardAdaptativo__Group__5__Impl : ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) ) ;
    public final void rule__WizardAdaptativo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2336:1: ( ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2337:1: ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2337:1: ( ( rule__WizardAdaptativo__PenalizacionAssignment_5 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2338:1: ( rule__WizardAdaptativo__PenalizacionAssignment_5 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPenalizacionAssignment_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2339:1: ( rule__WizardAdaptativo__PenalizacionAssignment_5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2339:2: rule__WizardAdaptativo__PenalizacionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__PenalizacionAssignment_5_in_rule__WizardAdaptativo__Group__5__Impl4645);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2349:1: rule__WizardAdaptativo__Group__6 : rule__WizardAdaptativo__Group__6__Impl rule__WizardAdaptativo__Group__7 ;
    public final void rule__WizardAdaptativo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2353:1: ( rule__WizardAdaptativo__Group__6__Impl rule__WizardAdaptativo__Group__7 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2354:2: rule__WizardAdaptativo__Group__6__Impl rule__WizardAdaptativo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__6__Impl_in_rule__WizardAdaptativo__Group__64675);
            rule__WizardAdaptativo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__7_in_rule__WizardAdaptativo__Group__64678);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2361:1: rule__WizardAdaptativo__Group__6__Impl : ( 'ejercicios' ) ;
    public final void rule__WizardAdaptativo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2365:1: ( ( 'ejercicios' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2366:1: ( 'ejercicios' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2366:1: ( 'ejercicios' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2367:1: 'ejercicios'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__WizardAdaptativo__Group__6__Impl4706); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2380:1: rule__WizardAdaptativo__Group__7 : rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8 ;
    public final void rule__WizardAdaptativo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2384:1: ( rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2385:2: rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__7__Impl_in_rule__WizardAdaptativo__Group__74737);
            rule__WizardAdaptativo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__8_in_rule__WizardAdaptativo__Group__74740);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2392:1: rule__WizardAdaptativo__Group__7__Impl : ( '{' ) ;
    public final void rule__WizardAdaptativo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2396:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2397:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2397:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2398:1: '{'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WizardAdaptativo__Group__7__Impl4768); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2411:1: rule__WizardAdaptativo__Group__8 : rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9 ;
    public final void rule__WizardAdaptativo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2415:1: ( rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2416:2: rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__8__Impl_in_rule__WizardAdaptativo__Group__84799);
            rule__WizardAdaptativo__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__9_in_rule__WizardAdaptativo__Group__84802);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2423:1: rule__WizardAdaptativo__Group__8__Impl : ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) ) ;
    public final void rule__WizardAdaptativo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2427:1: ( ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2428:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2428:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_8 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2429:1: ( rule__WizardAdaptativo__EjerciciosAssignment_8 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_8()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2430:1: ( rule__WizardAdaptativo__EjerciciosAssignment_8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2430:2: rule__WizardAdaptativo__EjerciciosAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_8_in_rule__WizardAdaptativo__Group__8__Impl4829);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2440:1: rule__WizardAdaptativo__Group__9 : rule__WizardAdaptativo__Group__9__Impl rule__WizardAdaptativo__Group__10 ;
    public final void rule__WizardAdaptativo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2444:1: ( rule__WizardAdaptativo__Group__9__Impl rule__WizardAdaptativo__Group__10 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2445:2: rule__WizardAdaptativo__Group__9__Impl rule__WizardAdaptativo__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__9__Impl_in_rule__WizardAdaptativo__Group__94859);
            rule__WizardAdaptativo__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__10_in_rule__WizardAdaptativo__Group__94862);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2452:1: rule__WizardAdaptativo__Group__9__Impl : ( ( rule__WizardAdaptativo__Group_9__0 )* ) ;
    public final void rule__WizardAdaptativo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2456:1: ( ( ( rule__WizardAdaptativo__Group_9__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2457:1: ( ( rule__WizardAdaptativo__Group_9__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2457:1: ( ( rule__WizardAdaptativo__Group_9__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2458:1: ( rule__WizardAdaptativo__Group_9__0 )*
            {
             before(grammarAccess.getWizardAdaptativoAccess().getGroup_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2459:1: ( rule__WizardAdaptativo__Group_9__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2459:2: rule__WizardAdaptativo__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__0_in_rule__WizardAdaptativo__Group__9__Impl4889);
            	    rule__WizardAdaptativo__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2469:1: rule__WizardAdaptativo__Group__10 : rule__WizardAdaptativo__Group__10__Impl rule__WizardAdaptativo__Group__11 ;
    public final void rule__WizardAdaptativo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2473:1: ( rule__WizardAdaptativo__Group__10__Impl rule__WizardAdaptativo__Group__11 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2474:2: rule__WizardAdaptativo__Group__10__Impl rule__WizardAdaptativo__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__10__Impl_in_rule__WizardAdaptativo__Group__104920);
            rule__WizardAdaptativo__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__11_in_rule__WizardAdaptativo__Group__104923);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2481:1: rule__WizardAdaptativo__Group__10__Impl : ( '}' ) ;
    public final void rule__WizardAdaptativo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2485:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2486:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2486:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2487:1: '}'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WizardAdaptativo__Group__10__Impl4951); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2500:1: rule__WizardAdaptativo__Group__11 : rule__WizardAdaptativo__Group__11__Impl ;
    public final void rule__WizardAdaptativo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2504:1: ( rule__WizardAdaptativo__Group__11__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2505:2: rule__WizardAdaptativo__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__11__Impl_in_rule__WizardAdaptativo__Group__114982);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2511:1: rule__WizardAdaptativo__Group__11__Impl : ( '}' ) ;
    public final void rule__WizardAdaptativo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2515:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2516:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2516:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2517:1: '}'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WizardAdaptativo__Group__11__Impl5010); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2554:1: rule__WizardAdaptativo__Group_9__0 : rule__WizardAdaptativo__Group_9__0__Impl rule__WizardAdaptativo__Group_9__1 ;
    public final void rule__WizardAdaptativo__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2558:1: ( rule__WizardAdaptativo__Group_9__0__Impl rule__WizardAdaptativo__Group_9__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2559:2: rule__WizardAdaptativo__Group_9__0__Impl rule__WizardAdaptativo__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__0__Impl_in_rule__WizardAdaptativo__Group_9__05065);
            rule__WizardAdaptativo__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__1_in_rule__WizardAdaptativo__Group_9__05068);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2566:1: rule__WizardAdaptativo__Group_9__0__Impl : ( ',' ) ;
    public final void rule__WizardAdaptativo__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2570:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2571:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2571:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2572:1: ','
            {
             before(grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_9_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__WizardAdaptativo__Group_9__0__Impl5096); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2585:1: rule__WizardAdaptativo__Group_9__1 : rule__WizardAdaptativo__Group_9__1__Impl ;
    public final void rule__WizardAdaptativo__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2589:1: ( rule__WizardAdaptativo__Group_9__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2590:2: rule__WizardAdaptativo__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_9__1__Impl_in_rule__WizardAdaptativo__Group_9__15127);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2596:1: rule__WizardAdaptativo__Group_9__1__Impl : ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) ) ;
    public final void rule__WizardAdaptativo__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2600:1: ( ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2601:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2601:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2602:1: ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_9_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2603:1: ( rule__WizardAdaptativo__EjerciciosAssignment_9_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2603:2: rule__WizardAdaptativo__EjerciciosAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_9_1_in_rule__WizardAdaptativo__Group_9__1__Impl5154);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2617:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2621:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2622:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05188);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05191);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2629:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2633:1: ( ( ( '-' )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2634:1: ( ( '-' )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2634:1: ( ( '-' )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2635:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2636:1: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2637:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EInt__Group__0__Impl5220); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2648:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2652:1: ( rule__EInt__Group__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2653:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15253);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2659:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2663:1: ( ( RULE_INT ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2664:1: ( RULE_INT )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2664:1: ( RULE_INT )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2665:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5280); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2680:1: rule__RespuestaUnica__Group__0 : rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1 ;
    public final void rule__RespuestaUnica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2684:1: ( rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2685:2: rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__0__Impl_in_rule__RespuestaUnica__Group__05313);
            rule__RespuestaUnica__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__1_in_rule__RespuestaUnica__Group__05316);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2692:1: rule__RespuestaUnica__Group__0__Impl : ( () ) ;
    public final void rule__RespuestaUnica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2696:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2697:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2697:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2698:1: ()
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2699:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2701:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2711:1: rule__RespuestaUnica__Group__1 : rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2 ;
    public final void rule__RespuestaUnica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2715:1: ( rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2716:2: rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__1__Impl_in_rule__RespuestaUnica__Group__15374);
            rule__RespuestaUnica__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__2_in_rule__RespuestaUnica__Group__15377);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2723:1: rule__RespuestaUnica__Group__1__Impl : ( 'RespuestaUnica' ) ;
    public final void rule__RespuestaUnica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2727:1: ( ( 'RespuestaUnica' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2728:1: ( 'RespuestaUnica' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2728:1: ( 'RespuestaUnica' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2729:1: 'RespuestaUnica'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RespuestaUnica__Group__1__Impl5405); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2742:1: rule__RespuestaUnica__Group__2 : rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3 ;
    public final void rule__RespuestaUnica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2746:1: ( rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2747:2: rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__2__Impl_in_rule__RespuestaUnica__Group__25436);
            rule__RespuestaUnica__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__3_in_rule__RespuestaUnica__Group__25439);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2754:1: rule__RespuestaUnica__Group__2__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2758:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2759:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2759:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2760:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group__2__Impl5467); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2773:1: rule__RespuestaUnica__Group__3 : rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4 ;
    public final void rule__RespuestaUnica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2777:1: ( rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2778:2: rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__3__Impl_in_rule__RespuestaUnica__Group__35498);
            rule__RespuestaUnica__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__4_in_rule__RespuestaUnica__Group__35501);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2785:1: rule__RespuestaUnica__Group__3__Impl : ( ( rule__RespuestaUnica__Group_3__0 )? ) ;
    public final void rule__RespuestaUnica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2789:1: ( ( ( rule__RespuestaUnica__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2790:1: ( ( rule__RespuestaUnica__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2790:1: ( ( rule__RespuestaUnica__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2791:1: ( rule__RespuestaUnica__Group_3__0 )?
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2792:1: ( rule__RespuestaUnica__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2792:2: rule__RespuestaUnica__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__0_in_rule__RespuestaUnica__Group__3__Impl5528);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2802:1: rule__RespuestaUnica__Group__4 : rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5 ;
    public final void rule__RespuestaUnica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2806:1: ( rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2807:2: rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__4__Impl_in_rule__RespuestaUnica__Group__45559);
            rule__RespuestaUnica__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__5_in_rule__RespuestaUnica__Group__45562);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2814:1: rule__RespuestaUnica__Group__4__Impl : ( ( rule__RespuestaUnica__Group_4__0 )? ) ;
    public final void rule__RespuestaUnica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2818:1: ( ( ( rule__RespuestaUnica__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2819:1: ( ( rule__RespuestaUnica__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2819:1: ( ( rule__RespuestaUnica__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2820:1: ( rule__RespuestaUnica__Group_4__0 )?
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2821:1: ( rule__RespuestaUnica__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2821:2: rule__RespuestaUnica__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__0_in_rule__RespuestaUnica__Group__4__Impl5589);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2831:1: rule__RespuestaUnica__Group__5 : rule__RespuestaUnica__Group__5__Impl ;
    public final void rule__RespuestaUnica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2835:1: ( rule__RespuestaUnica__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2836:2: rule__RespuestaUnica__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__5__Impl_in_rule__RespuestaUnica__Group__55620);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2842:1: rule__RespuestaUnica__Group__5__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2846:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2847:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2847:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2848:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaUnica__Group__5__Impl5648); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2873:1: rule__RespuestaUnica__Group_3__0 : rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1 ;
    public final void rule__RespuestaUnica__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2877:1: ( rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2878:2: rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__0__Impl_in_rule__RespuestaUnica__Group_3__05691);
            rule__RespuestaUnica__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__1_in_rule__RespuestaUnica__Group_3__05694);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2885:1: rule__RespuestaUnica__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__RespuestaUnica__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2889:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2890:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2890:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2891:1: 'correctas'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RespuestaUnica__Group_3__0__Impl5722); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2904:1: rule__RespuestaUnica__Group_3__1 : rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2 ;
    public final void rule__RespuestaUnica__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2908:1: ( rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2909:2: rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__1__Impl_in_rule__RespuestaUnica__Group_3__15753);
            rule__RespuestaUnica__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__2_in_rule__RespuestaUnica__Group_3__15756);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2916:1: rule__RespuestaUnica__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2920:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2921:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2921:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2922:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group_3__1__Impl5784); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2935:1: rule__RespuestaUnica__Group_3__2 : rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3 ;
    public final void rule__RespuestaUnica__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2939:1: ( rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2940:2: rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__2__Impl_in_rule__RespuestaUnica__Group_3__25815);
            rule__RespuestaUnica__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__3_in_rule__RespuestaUnica__Group_3__25818);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2947:1: rule__RespuestaUnica__Group_3__2__Impl : ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) ) ;
    public final void rule__RespuestaUnica__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2951:1: ( ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2952:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2952:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2953:1: ( rule__RespuestaUnica__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2954:1: ( rule__RespuestaUnica__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2954:2: rule__RespuestaUnica__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_2_in_rule__RespuestaUnica__Group_3__2__Impl5845);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2964:1: rule__RespuestaUnica__Group_3__3 : rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4 ;
    public final void rule__RespuestaUnica__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2968:1: ( rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2969:2: rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__3__Impl_in_rule__RespuestaUnica__Group_3__35875);
            rule__RespuestaUnica__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__4_in_rule__RespuestaUnica__Group_3__35878);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2976:1: rule__RespuestaUnica__Group_3__3__Impl : ( ( rule__RespuestaUnica__Group_3_3__0 )* ) ;
    public final void rule__RespuestaUnica__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2980:1: ( ( ( rule__RespuestaUnica__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2981:1: ( ( rule__RespuestaUnica__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2981:1: ( ( rule__RespuestaUnica__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2982:1: ( rule__RespuestaUnica__Group_3_3__0 )*
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2983:1: ( rule__RespuestaUnica__Group_3_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2983:2: rule__RespuestaUnica__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__0_in_rule__RespuestaUnica__Group_3__3__Impl5905);
            	    rule__RespuestaUnica__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2993:1: rule__RespuestaUnica__Group_3__4 : rule__RespuestaUnica__Group_3__4__Impl ;
    public final void rule__RespuestaUnica__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2997:1: ( rule__RespuestaUnica__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2998:2: rule__RespuestaUnica__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__4__Impl_in_rule__RespuestaUnica__Group_3__45936);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3004:1: rule__RespuestaUnica__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3008:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3009:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3009:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3010:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaUnica__Group_3__4__Impl5964); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3033:1: rule__RespuestaUnica__Group_3_3__0 : rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1 ;
    public final void rule__RespuestaUnica__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3037:1: ( rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3038:2: rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__0__Impl_in_rule__RespuestaUnica__Group_3_3__06005);
            rule__RespuestaUnica__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__1_in_rule__RespuestaUnica__Group_3_3__06008);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3045:1: rule__RespuestaUnica__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaUnica__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3049:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3050:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3050:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3051:1: ','
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaUnica__Group_3_3__0__Impl6036); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3064:1: rule__RespuestaUnica__Group_3_3__1 : rule__RespuestaUnica__Group_3_3__1__Impl ;
    public final void rule__RespuestaUnica__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3068:1: ( rule__RespuestaUnica__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3069:2: rule__RespuestaUnica__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__1__Impl_in_rule__RespuestaUnica__Group_3_3__16067);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3075:1: rule__RespuestaUnica__Group_3_3__1__Impl : ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__RespuestaUnica__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3079:1: ( ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3080:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3080:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3081:1: ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3082:1: ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3082:2: rule__RespuestaUnica__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_3_1_in_rule__RespuestaUnica__Group_3_3__1__Impl6094);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3096:1: rule__RespuestaUnica__Group_4__0 : rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1 ;
    public final void rule__RespuestaUnica__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3100:1: ( rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3101:2: rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__0__Impl_in_rule__RespuestaUnica__Group_4__06128);
            rule__RespuestaUnica__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__1_in_rule__RespuestaUnica__Group_4__06131);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3108:1: rule__RespuestaUnica__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__RespuestaUnica__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3112:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3113:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3113:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3114:1: 'alternativas'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RespuestaUnica__Group_4__0__Impl6159); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3127:1: rule__RespuestaUnica__Group_4__1 : rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2 ;
    public final void rule__RespuestaUnica__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3131:1: ( rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3132:2: rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__1__Impl_in_rule__RespuestaUnica__Group_4__16190);
            rule__RespuestaUnica__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__2_in_rule__RespuestaUnica__Group_4__16193);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3139:1: rule__RespuestaUnica__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3143:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3144:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3144:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3145:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group_4__1__Impl6221); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3158:1: rule__RespuestaUnica__Group_4__2 : rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3 ;
    public final void rule__RespuestaUnica__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3162:1: ( rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3163:2: rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__2__Impl_in_rule__RespuestaUnica__Group_4__26252);
            rule__RespuestaUnica__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__3_in_rule__RespuestaUnica__Group_4__26255);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3170:1: rule__RespuestaUnica__Group_4__2__Impl : ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) ) ;
    public final void rule__RespuestaUnica__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3174:1: ( ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3175:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3175:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3176:1: ( rule__RespuestaUnica__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3177:1: ( rule__RespuestaUnica__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3177:2: rule__RespuestaUnica__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_2_in_rule__RespuestaUnica__Group_4__2__Impl6282);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3187:1: rule__RespuestaUnica__Group_4__3 : rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4 ;
    public final void rule__RespuestaUnica__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3191:1: ( rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3192:2: rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__3__Impl_in_rule__RespuestaUnica__Group_4__36312);
            rule__RespuestaUnica__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__4_in_rule__RespuestaUnica__Group_4__36315);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3199:1: rule__RespuestaUnica__Group_4__3__Impl : ( ( rule__RespuestaUnica__Group_4_3__0 )* ) ;
    public final void rule__RespuestaUnica__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3203:1: ( ( ( rule__RespuestaUnica__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3204:1: ( ( rule__RespuestaUnica__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3204:1: ( ( rule__RespuestaUnica__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3205:1: ( rule__RespuestaUnica__Group_4_3__0 )*
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3206:1: ( rule__RespuestaUnica__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3206:2: rule__RespuestaUnica__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__0_in_rule__RespuestaUnica__Group_4__3__Impl6342);
            	    rule__RespuestaUnica__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3216:1: rule__RespuestaUnica__Group_4__4 : rule__RespuestaUnica__Group_4__4__Impl ;
    public final void rule__RespuestaUnica__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3220:1: ( rule__RespuestaUnica__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3221:2: rule__RespuestaUnica__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__4__Impl_in_rule__RespuestaUnica__Group_4__46373);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3227:1: rule__RespuestaUnica__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3231:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3232:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3232:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3233:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaUnica__Group_4__4__Impl6401); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3256:1: rule__RespuestaUnica__Group_4_3__0 : rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1 ;
    public final void rule__RespuestaUnica__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3260:1: ( rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3261:2: rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__0__Impl_in_rule__RespuestaUnica__Group_4_3__06442);
            rule__RespuestaUnica__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__1_in_rule__RespuestaUnica__Group_4_3__06445);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3268:1: rule__RespuestaUnica__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaUnica__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3272:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3273:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3273:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3274:1: ','
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaUnica__Group_4_3__0__Impl6473); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3287:1: rule__RespuestaUnica__Group_4_3__1 : rule__RespuestaUnica__Group_4_3__1__Impl ;
    public final void rule__RespuestaUnica__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3291:1: ( rule__RespuestaUnica__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3292:2: rule__RespuestaUnica__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__1__Impl_in_rule__RespuestaUnica__Group_4_3__16504);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3298:1: rule__RespuestaUnica__Group_4_3__1__Impl : ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__RespuestaUnica__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3302:1: ( ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3303:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3303:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3304:1: ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3305:1: ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3305:2: rule__RespuestaUnica__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_3_1_in_rule__RespuestaUnica__Group_4_3__1__Impl6531);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3319:1: rule__RespuestaMultiple__Group__0 : rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1 ;
    public final void rule__RespuestaMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3323:1: ( rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3324:2: rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__0__Impl_in_rule__RespuestaMultiple__Group__06565);
            rule__RespuestaMultiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__1_in_rule__RespuestaMultiple__Group__06568);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3331:1: rule__RespuestaMultiple__Group__0__Impl : ( () ) ;
    public final void rule__RespuestaMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3335:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3336:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3336:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3337:1: ()
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3338:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3340:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3350:1: rule__RespuestaMultiple__Group__1 : rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2 ;
    public final void rule__RespuestaMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3354:1: ( rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3355:2: rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__1__Impl_in_rule__RespuestaMultiple__Group__16626);
            rule__RespuestaMultiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__2_in_rule__RespuestaMultiple__Group__16629);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3362:1: rule__RespuestaMultiple__Group__1__Impl : ( 'RespuestaMultiple' ) ;
    public final void rule__RespuestaMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3366:1: ( ( 'RespuestaMultiple' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3367:1: ( 'RespuestaMultiple' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3367:1: ( 'RespuestaMultiple' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3368:1: 'RespuestaMultiple'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__RespuestaMultiple__Group__1__Impl6657); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3381:1: rule__RespuestaMultiple__Group__2 : rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3 ;
    public final void rule__RespuestaMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3385:1: ( rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3386:2: rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__2__Impl_in_rule__RespuestaMultiple__Group__26688);
            rule__RespuestaMultiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__3_in_rule__RespuestaMultiple__Group__26691);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3393:1: rule__RespuestaMultiple__Group__2__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3397:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3398:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3398:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3399:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group__2__Impl6719); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3412:1: rule__RespuestaMultiple__Group__3 : rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4 ;
    public final void rule__RespuestaMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3416:1: ( rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3417:2: rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__3__Impl_in_rule__RespuestaMultiple__Group__36750);
            rule__RespuestaMultiple__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__4_in_rule__RespuestaMultiple__Group__36753);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3424:1: rule__RespuestaMultiple__Group__3__Impl : ( ( rule__RespuestaMultiple__Group_3__0 )? ) ;
    public final void rule__RespuestaMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3428:1: ( ( ( rule__RespuestaMultiple__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3429:1: ( ( rule__RespuestaMultiple__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3429:1: ( ( rule__RespuestaMultiple__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3430:1: ( rule__RespuestaMultiple__Group_3__0 )?
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3431:1: ( rule__RespuestaMultiple__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3431:2: rule__RespuestaMultiple__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__0_in_rule__RespuestaMultiple__Group__3__Impl6780);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3441:1: rule__RespuestaMultiple__Group__4 : rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5 ;
    public final void rule__RespuestaMultiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3445:1: ( rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3446:2: rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__4__Impl_in_rule__RespuestaMultiple__Group__46811);
            rule__RespuestaMultiple__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__5_in_rule__RespuestaMultiple__Group__46814);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3453:1: rule__RespuestaMultiple__Group__4__Impl : ( ( rule__RespuestaMultiple__Group_4__0 )? ) ;
    public final void rule__RespuestaMultiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3457:1: ( ( ( rule__RespuestaMultiple__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3458:1: ( ( rule__RespuestaMultiple__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3458:1: ( ( rule__RespuestaMultiple__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3459:1: ( rule__RespuestaMultiple__Group_4__0 )?
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3460:1: ( rule__RespuestaMultiple__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3460:2: rule__RespuestaMultiple__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__0_in_rule__RespuestaMultiple__Group__4__Impl6841);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3470:1: rule__RespuestaMultiple__Group__5 : rule__RespuestaMultiple__Group__5__Impl ;
    public final void rule__RespuestaMultiple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3474:1: ( rule__RespuestaMultiple__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3475:2: rule__RespuestaMultiple__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__5__Impl_in_rule__RespuestaMultiple__Group__56872);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3481:1: rule__RespuestaMultiple__Group__5__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3485:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3486:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3486:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3487:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaMultiple__Group__5__Impl6900); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3512:1: rule__RespuestaMultiple__Group_3__0 : rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1 ;
    public final void rule__RespuestaMultiple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3516:1: ( rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3517:2: rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__0__Impl_in_rule__RespuestaMultiple__Group_3__06943);
            rule__RespuestaMultiple__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__1_in_rule__RespuestaMultiple__Group_3__06946);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3524:1: rule__RespuestaMultiple__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__RespuestaMultiple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3528:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3529:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3529:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3530:1: 'correctas'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RespuestaMultiple__Group_3__0__Impl6974); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3543:1: rule__RespuestaMultiple__Group_3__1 : rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2 ;
    public final void rule__RespuestaMultiple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3547:1: ( rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3548:2: rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__1__Impl_in_rule__RespuestaMultiple__Group_3__17005);
            rule__RespuestaMultiple__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__2_in_rule__RespuestaMultiple__Group_3__17008);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3555:1: rule__RespuestaMultiple__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3559:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3560:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3560:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3561:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group_3__1__Impl7036); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3574:1: rule__RespuestaMultiple__Group_3__2 : rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3 ;
    public final void rule__RespuestaMultiple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3578:1: ( rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3579:2: rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__2__Impl_in_rule__RespuestaMultiple__Group_3__27067);
            rule__RespuestaMultiple__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__3_in_rule__RespuestaMultiple__Group_3__27070);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3586:1: rule__RespuestaMultiple__Group_3__2__Impl : ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) ) ;
    public final void rule__RespuestaMultiple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3590:1: ( ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3591:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3591:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3592:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3593:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3593:2: rule__RespuestaMultiple__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_2_in_rule__RespuestaMultiple__Group_3__2__Impl7097);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3603:1: rule__RespuestaMultiple__Group_3__3 : rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4 ;
    public final void rule__RespuestaMultiple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3607:1: ( rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3608:2: rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__3__Impl_in_rule__RespuestaMultiple__Group_3__37127);
            rule__RespuestaMultiple__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__4_in_rule__RespuestaMultiple__Group_3__37130);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3615:1: rule__RespuestaMultiple__Group_3__3__Impl : ( ( rule__RespuestaMultiple__Group_3_3__0 )* ) ;
    public final void rule__RespuestaMultiple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3619:1: ( ( ( rule__RespuestaMultiple__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3620:1: ( ( rule__RespuestaMultiple__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3620:1: ( ( rule__RespuestaMultiple__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3621:1: ( rule__RespuestaMultiple__Group_3_3__0 )*
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3622:1: ( rule__RespuestaMultiple__Group_3_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3622:2: rule__RespuestaMultiple__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__0_in_rule__RespuestaMultiple__Group_3__3__Impl7157);
            	    rule__RespuestaMultiple__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3632:1: rule__RespuestaMultiple__Group_3__4 : rule__RespuestaMultiple__Group_3__4__Impl ;
    public final void rule__RespuestaMultiple__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3636:1: ( rule__RespuestaMultiple__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3637:2: rule__RespuestaMultiple__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__4__Impl_in_rule__RespuestaMultiple__Group_3__47188);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3643:1: rule__RespuestaMultiple__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3647:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3648:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3648:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3649:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaMultiple__Group_3__4__Impl7216); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3672:1: rule__RespuestaMultiple__Group_3_3__0 : rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1 ;
    public final void rule__RespuestaMultiple__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3676:1: ( rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3677:2: rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__0__Impl_in_rule__RespuestaMultiple__Group_3_3__07257);
            rule__RespuestaMultiple__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__1_in_rule__RespuestaMultiple__Group_3_3__07260);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3684:1: rule__RespuestaMultiple__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaMultiple__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3688:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3689:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3689:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3690:1: ','
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaMultiple__Group_3_3__0__Impl7288); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3703:1: rule__RespuestaMultiple__Group_3_3__1 : rule__RespuestaMultiple__Group_3_3__1__Impl ;
    public final void rule__RespuestaMultiple__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3707:1: ( rule__RespuestaMultiple__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3708:2: rule__RespuestaMultiple__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__1__Impl_in_rule__RespuestaMultiple__Group_3_3__17319);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3714:1: rule__RespuestaMultiple__Group_3_3__1__Impl : ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__RespuestaMultiple__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3718:1: ( ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3719:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3719:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3720:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3721:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3721:2: rule__RespuestaMultiple__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_3_1_in_rule__RespuestaMultiple__Group_3_3__1__Impl7346);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3735:1: rule__RespuestaMultiple__Group_4__0 : rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1 ;
    public final void rule__RespuestaMultiple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3739:1: ( rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3740:2: rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__0__Impl_in_rule__RespuestaMultiple__Group_4__07380);
            rule__RespuestaMultiple__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__1_in_rule__RespuestaMultiple__Group_4__07383);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3747:1: rule__RespuestaMultiple__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__RespuestaMultiple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3751:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3752:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3752:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3753:1: 'alternativas'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RespuestaMultiple__Group_4__0__Impl7411); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3766:1: rule__RespuestaMultiple__Group_4__1 : rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2 ;
    public final void rule__RespuestaMultiple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3770:1: ( rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3771:2: rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__1__Impl_in_rule__RespuestaMultiple__Group_4__17442);
            rule__RespuestaMultiple__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__2_in_rule__RespuestaMultiple__Group_4__17445);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3778:1: rule__RespuestaMultiple__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3782:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3783:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3783:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3784:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group_4__1__Impl7473); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3797:1: rule__RespuestaMultiple__Group_4__2 : rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3 ;
    public final void rule__RespuestaMultiple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3801:1: ( rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3802:2: rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__2__Impl_in_rule__RespuestaMultiple__Group_4__27504);
            rule__RespuestaMultiple__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__3_in_rule__RespuestaMultiple__Group_4__27507);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3809:1: rule__RespuestaMultiple__Group_4__2__Impl : ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) ) ;
    public final void rule__RespuestaMultiple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3813:1: ( ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3814:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3814:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3815:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3816:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3816:2: rule__RespuestaMultiple__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_2_in_rule__RespuestaMultiple__Group_4__2__Impl7534);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3826:1: rule__RespuestaMultiple__Group_4__3 : rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4 ;
    public final void rule__RespuestaMultiple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3830:1: ( rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3831:2: rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__3__Impl_in_rule__RespuestaMultiple__Group_4__37564);
            rule__RespuestaMultiple__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__4_in_rule__RespuestaMultiple__Group_4__37567);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3838:1: rule__RespuestaMultiple__Group_4__3__Impl : ( ( rule__RespuestaMultiple__Group_4_3__0 )* ) ;
    public final void rule__RespuestaMultiple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3842:1: ( ( ( rule__RespuestaMultiple__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3843:1: ( ( rule__RespuestaMultiple__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3843:1: ( ( rule__RespuestaMultiple__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3844:1: ( rule__RespuestaMultiple__Group_4_3__0 )*
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3845:1: ( rule__RespuestaMultiple__Group_4_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3845:2: rule__RespuestaMultiple__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__0_in_rule__RespuestaMultiple__Group_4__3__Impl7594);
            	    rule__RespuestaMultiple__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3855:1: rule__RespuestaMultiple__Group_4__4 : rule__RespuestaMultiple__Group_4__4__Impl ;
    public final void rule__RespuestaMultiple__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3859:1: ( rule__RespuestaMultiple__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3860:2: rule__RespuestaMultiple__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__4__Impl_in_rule__RespuestaMultiple__Group_4__47625);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3866:1: rule__RespuestaMultiple__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3870:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3871:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3871:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3872:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaMultiple__Group_4__4__Impl7653); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3895:1: rule__RespuestaMultiple__Group_4_3__0 : rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1 ;
    public final void rule__RespuestaMultiple__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3899:1: ( rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3900:2: rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__0__Impl_in_rule__RespuestaMultiple__Group_4_3__07694);
            rule__RespuestaMultiple__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__1_in_rule__RespuestaMultiple__Group_4_3__07697);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3907:1: rule__RespuestaMultiple__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaMultiple__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3911:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3912:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3912:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3913:1: ','
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaMultiple__Group_4_3__0__Impl7725); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3926:1: rule__RespuestaMultiple__Group_4_3__1 : rule__RespuestaMultiple__Group_4_3__1__Impl ;
    public final void rule__RespuestaMultiple__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3930:1: ( rule__RespuestaMultiple__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3931:2: rule__RespuestaMultiple__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__1__Impl_in_rule__RespuestaMultiple__Group_4_3__17756);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3937:1: rule__RespuestaMultiple__Group_4_3__1__Impl : ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__RespuestaMultiple__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3941:1: ( ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3942:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3942:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3943:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3944:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3944:2: rule__RespuestaMultiple__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_3_1_in_rule__RespuestaMultiple__Group_4_3__1__Impl7783);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3958:1: rule__TextoLibre__Group__0 : rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1 ;
    public final void rule__TextoLibre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3962:1: ( rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3963:2: rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__0__Impl_in_rule__TextoLibre__Group__07817);
            rule__TextoLibre__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__1_in_rule__TextoLibre__Group__07820);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3970:1: rule__TextoLibre__Group__0__Impl : ( () ) ;
    public final void rule__TextoLibre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3974:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3975:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3975:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3976:1: ()
            {
             before(grammarAccess.getTextoLibreAccess().getTextoLibreAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3977:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3979:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3989:1: rule__TextoLibre__Group__1 : rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2 ;
    public final void rule__TextoLibre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3993:1: ( rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3994:2: rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__1__Impl_in_rule__TextoLibre__Group__17878);
            rule__TextoLibre__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__2_in_rule__TextoLibre__Group__17881);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4001:1: rule__TextoLibre__Group__1__Impl : ( 'TextoLibre' ) ;
    public final void rule__TextoLibre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4005:1: ( ( 'TextoLibre' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4006:1: ( 'TextoLibre' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4006:1: ( 'TextoLibre' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4007:1: 'TextoLibre'
            {
             before(grammarAccess.getTextoLibreAccess().getTextoLibreKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TextoLibre__Group__1__Impl7909); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4020:1: rule__TextoLibre__Group__2 : rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3 ;
    public final void rule__TextoLibre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4024:1: ( rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4025:2: rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__2__Impl_in_rule__TextoLibre__Group__27940);
            rule__TextoLibre__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__3_in_rule__TextoLibre__Group__27943);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4032:1: rule__TextoLibre__Group__2__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4036:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4037:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4037:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4038:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group__2__Impl7971); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4051:1: rule__TextoLibre__Group__3 : rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4 ;
    public final void rule__TextoLibre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4055:1: ( rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4056:2: rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__3__Impl_in_rule__TextoLibre__Group__38002);
            rule__TextoLibre__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__4_in_rule__TextoLibre__Group__38005);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4063:1: rule__TextoLibre__Group__3__Impl : ( ( rule__TextoLibre__Group_3__0 )? ) ;
    public final void rule__TextoLibre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4067:1: ( ( ( rule__TextoLibre__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4068:1: ( ( rule__TextoLibre__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4068:1: ( ( rule__TextoLibre__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4069:1: ( rule__TextoLibre__Group_3__0 )?
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4070:1: ( rule__TextoLibre__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4070:2: rule__TextoLibre__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__0_in_rule__TextoLibre__Group__3__Impl8032);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4080:1: rule__TextoLibre__Group__4 : rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5 ;
    public final void rule__TextoLibre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4084:1: ( rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4085:2: rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__4__Impl_in_rule__TextoLibre__Group__48063);
            rule__TextoLibre__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__5_in_rule__TextoLibre__Group__48066);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4092:1: rule__TextoLibre__Group__4__Impl : ( ( rule__TextoLibre__Group_4__0 )? ) ;
    public final void rule__TextoLibre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4096:1: ( ( ( rule__TextoLibre__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4097:1: ( ( rule__TextoLibre__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4097:1: ( ( rule__TextoLibre__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4098:1: ( rule__TextoLibre__Group_4__0 )?
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4099:1: ( rule__TextoLibre__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4099:2: rule__TextoLibre__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__0_in_rule__TextoLibre__Group__4__Impl8093);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4109:1: rule__TextoLibre__Group__5 : rule__TextoLibre__Group__5__Impl ;
    public final void rule__TextoLibre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4113:1: ( rule__TextoLibre__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4114:2: rule__TextoLibre__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__5__Impl_in_rule__TextoLibre__Group__58124);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4120:1: rule__TextoLibre__Group__5__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4124:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4125:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4125:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4126:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextoLibre__Group__5__Impl8152); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4151:1: rule__TextoLibre__Group_3__0 : rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1 ;
    public final void rule__TextoLibre__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4155:1: ( rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4156:2: rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__0__Impl_in_rule__TextoLibre__Group_3__08195);
            rule__TextoLibre__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__1_in_rule__TextoLibre__Group_3__08198);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4163:1: rule__TextoLibre__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__TextoLibre__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4167:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4168:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4168:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4169:1: 'correctas'
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TextoLibre__Group_3__0__Impl8226); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4182:1: rule__TextoLibre__Group_3__1 : rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2 ;
    public final void rule__TextoLibre__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4186:1: ( rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4187:2: rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__1__Impl_in_rule__TextoLibre__Group_3__18257);
            rule__TextoLibre__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__2_in_rule__TextoLibre__Group_3__18260);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4194:1: rule__TextoLibre__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4198:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4199:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4199:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4200:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group_3__1__Impl8288); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4213:1: rule__TextoLibre__Group_3__2 : rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3 ;
    public final void rule__TextoLibre__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4217:1: ( rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4218:2: rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__2__Impl_in_rule__TextoLibre__Group_3__28319);
            rule__TextoLibre__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__3_in_rule__TextoLibre__Group_3__28322);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4225:1: rule__TextoLibre__Group_3__2__Impl : ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) ) ;
    public final void rule__TextoLibre__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4229:1: ( ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4230:1: ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4230:1: ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4231:1: ( rule__TextoLibre__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4232:1: ( rule__TextoLibre__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4232:2: rule__TextoLibre__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__CorrectasAssignment_3_2_in_rule__TextoLibre__Group_3__2__Impl8349);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4242:1: rule__TextoLibre__Group_3__3 : rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4 ;
    public final void rule__TextoLibre__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4246:1: ( rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4247:2: rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__3__Impl_in_rule__TextoLibre__Group_3__38379);
            rule__TextoLibre__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__4_in_rule__TextoLibre__Group_3__38382);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4254:1: rule__TextoLibre__Group_3__3__Impl : ( ( rule__TextoLibre__Group_3_3__0 )* ) ;
    public final void rule__TextoLibre__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4258:1: ( ( ( rule__TextoLibre__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4259:1: ( ( rule__TextoLibre__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4259:1: ( ( rule__TextoLibre__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4260:1: ( rule__TextoLibre__Group_3_3__0 )*
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4261:1: ( rule__TextoLibre__Group_3_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4261:2: rule__TextoLibre__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__0_in_rule__TextoLibre__Group_3__3__Impl8409);
            	    rule__TextoLibre__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4271:1: rule__TextoLibre__Group_3__4 : rule__TextoLibre__Group_3__4__Impl ;
    public final void rule__TextoLibre__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4275:1: ( rule__TextoLibre__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4276:2: rule__TextoLibre__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__4__Impl_in_rule__TextoLibre__Group_3__48440);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4282:1: rule__TextoLibre__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4286:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4287:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4287:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4288:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextoLibre__Group_3__4__Impl8468); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4311:1: rule__TextoLibre__Group_3_3__0 : rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1 ;
    public final void rule__TextoLibre__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4315:1: ( rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4316:2: rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__0__Impl_in_rule__TextoLibre__Group_3_3__08509);
            rule__TextoLibre__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__1_in_rule__TextoLibre__Group_3_3__08512);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4323:1: rule__TextoLibre__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TextoLibre__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4327:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4328:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4328:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4329:1: ','
            {
             before(grammarAccess.getTextoLibreAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TextoLibre__Group_3_3__0__Impl8540); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4342:1: rule__TextoLibre__Group_3_3__1 : rule__TextoLibre__Group_3_3__1__Impl ;
    public final void rule__TextoLibre__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4346:1: ( rule__TextoLibre__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4347:2: rule__TextoLibre__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__1__Impl_in_rule__TextoLibre__Group_3_3__18571);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4353:1: rule__TextoLibre__Group_3_3__1__Impl : ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__TextoLibre__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4357:1: ( ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4358:1: ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4358:1: ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4359:1: ( rule__TextoLibre__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4360:1: ( rule__TextoLibre__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4360:2: rule__TextoLibre__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__CorrectasAssignment_3_3_1_in_rule__TextoLibre__Group_3_3__1__Impl8598);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4374:1: rule__TextoLibre__Group_4__0 : rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1 ;
    public final void rule__TextoLibre__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4378:1: ( rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4379:2: rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__0__Impl_in_rule__TextoLibre__Group_4__08632);
            rule__TextoLibre__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__1_in_rule__TextoLibre__Group_4__08635);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4386:1: rule__TextoLibre__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__TextoLibre__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4390:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4391:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4391:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4392:1: 'alternativas'
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TextoLibre__Group_4__0__Impl8663); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4405:1: rule__TextoLibre__Group_4__1 : rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2 ;
    public final void rule__TextoLibre__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4409:1: ( rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4410:2: rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__1__Impl_in_rule__TextoLibre__Group_4__18694);
            rule__TextoLibre__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__2_in_rule__TextoLibre__Group_4__18697);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4417:1: rule__TextoLibre__Group_4__1__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4421:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4422:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4422:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4423:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group_4__1__Impl8725); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4436:1: rule__TextoLibre__Group_4__2 : rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3 ;
    public final void rule__TextoLibre__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4440:1: ( rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4441:2: rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__2__Impl_in_rule__TextoLibre__Group_4__28756);
            rule__TextoLibre__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__3_in_rule__TextoLibre__Group_4__28759);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4448:1: rule__TextoLibre__Group_4__2__Impl : ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) ) ;
    public final void rule__TextoLibre__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4452:1: ( ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4453:1: ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4453:1: ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4454:1: ( rule__TextoLibre__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4455:1: ( rule__TextoLibre__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4455:2: rule__TextoLibre__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__AlternativasAssignment_4_2_in_rule__TextoLibre__Group_4__2__Impl8786);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4465:1: rule__TextoLibre__Group_4__3 : rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4 ;
    public final void rule__TextoLibre__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4469:1: ( rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4470:2: rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__3__Impl_in_rule__TextoLibre__Group_4__38816);
            rule__TextoLibre__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__4_in_rule__TextoLibre__Group_4__38819);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4477:1: rule__TextoLibre__Group_4__3__Impl : ( ( rule__TextoLibre__Group_4_3__0 )* ) ;
    public final void rule__TextoLibre__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4481:1: ( ( ( rule__TextoLibre__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4482:1: ( ( rule__TextoLibre__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4482:1: ( ( rule__TextoLibre__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4483:1: ( rule__TextoLibre__Group_4_3__0 )*
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4484:1: ( rule__TextoLibre__Group_4_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4484:2: rule__TextoLibre__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__0_in_rule__TextoLibre__Group_4__3__Impl8846);
            	    rule__TextoLibre__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4494:1: rule__TextoLibre__Group_4__4 : rule__TextoLibre__Group_4__4__Impl ;
    public final void rule__TextoLibre__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4498:1: ( rule__TextoLibre__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4499:2: rule__TextoLibre__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__4__Impl_in_rule__TextoLibre__Group_4__48877);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4505:1: rule__TextoLibre__Group_4__4__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4509:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4510:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4510:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4511:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextoLibre__Group_4__4__Impl8905); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4534:1: rule__TextoLibre__Group_4_3__0 : rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1 ;
    public final void rule__TextoLibre__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4538:1: ( rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4539:2: rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__0__Impl_in_rule__TextoLibre__Group_4_3__08946);
            rule__TextoLibre__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__1_in_rule__TextoLibre__Group_4_3__08949);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4546:1: rule__TextoLibre__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__TextoLibre__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4550:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4551:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4551:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4552:1: ','
            {
             before(grammarAccess.getTextoLibreAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TextoLibre__Group_4_3__0__Impl8977); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4565:1: rule__TextoLibre__Group_4_3__1 : rule__TextoLibre__Group_4_3__1__Impl ;
    public final void rule__TextoLibre__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4569:1: ( rule__TextoLibre__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4570:2: rule__TextoLibre__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__1__Impl_in_rule__TextoLibre__Group_4_3__19008);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4576:1: rule__TextoLibre__Group_4_3__1__Impl : ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__TextoLibre__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4580:1: ( ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4581:1: ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4581:1: ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4582:1: ( rule__TextoLibre__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4583:1: ( rule__TextoLibre__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4583:2: rule__TextoLibre__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__AlternativasAssignment_4_3_1_in_rule__TextoLibre__Group_4_3__1__Impl9035);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4597:1: rule__Ordenacion__Group__0 : rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1 ;
    public final void rule__Ordenacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4601:1: ( rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4602:2: rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__0__Impl_in_rule__Ordenacion__Group__09069);
            rule__Ordenacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__1_in_rule__Ordenacion__Group__09072);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4609:1: rule__Ordenacion__Group__0__Impl : ( () ) ;
    public final void rule__Ordenacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4613:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4614:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4614:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4615:1: ()
            {
             before(grammarAccess.getOrdenacionAccess().getOrdenacionAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4616:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4618:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4628:1: rule__Ordenacion__Group__1 : rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2 ;
    public final void rule__Ordenacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4632:1: ( rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4633:2: rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__1__Impl_in_rule__Ordenacion__Group__19130);
            rule__Ordenacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__2_in_rule__Ordenacion__Group__19133);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4640:1: rule__Ordenacion__Group__1__Impl : ( 'Ordenacion' ) ;
    public final void rule__Ordenacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4644:1: ( ( 'Ordenacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4645:1: ( 'Ordenacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4645:1: ( 'Ordenacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4646:1: 'Ordenacion'
            {
             before(grammarAccess.getOrdenacionAccess().getOrdenacionKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Ordenacion__Group__1__Impl9161); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4659:1: rule__Ordenacion__Group__2 : rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3 ;
    public final void rule__Ordenacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4663:1: ( rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4664:2: rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__2__Impl_in_rule__Ordenacion__Group__29192);
            rule__Ordenacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__3_in_rule__Ordenacion__Group__29195);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4671:1: rule__Ordenacion__Group__2__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4675:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4676:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4676:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4677:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group__2__Impl9223); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4690:1: rule__Ordenacion__Group__3 : rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4 ;
    public final void rule__Ordenacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4694:1: ( rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4695:2: rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__3__Impl_in_rule__Ordenacion__Group__39254);
            rule__Ordenacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__4_in_rule__Ordenacion__Group__39257);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4702:1: rule__Ordenacion__Group__3__Impl : ( ( rule__Ordenacion__Group_3__0 )? ) ;
    public final void rule__Ordenacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4706:1: ( ( ( rule__Ordenacion__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4707:1: ( ( rule__Ordenacion__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4707:1: ( ( rule__Ordenacion__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4708:1: ( rule__Ordenacion__Group_3__0 )?
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4709:1: ( rule__Ordenacion__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4709:2: rule__Ordenacion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__0_in_rule__Ordenacion__Group__3__Impl9284);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4719:1: rule__Ordenacion__Group__4 : rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5 ;
    public final void rule__Ordenacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4723:1: ( rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4724:2: rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__4__Impl_in_rule__Ordenacion__Group__49315);
            rule__Ordenacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__5_in_rule__Ordenacion__Group__49318);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4731:1: rule__Ordenacion__Group__4__Impl : ( ( rule__Ordenacion__Group_4__0 )? ) ;
    public final void rule__Ordenacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4735:1: ( ( ( rule__Ordenacion__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4736:1: ( ( rule__Ordenacion__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4736:1: ( ( rule__Ordenacion__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4737:1: ( rule__Ordenacion__Group_4__0 )?
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4738:1: ( rule__Ordenacion__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4738:2: rule__Ordenacion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__0_in_rule__Ordenacion__Group__4__Impl9345);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4748:1: rule__Ordenacion__Group__5 : rule__Ordenacion__Group__5__Impl ;
    public final void rule__Ordenacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4752:1: ( rule__Ordenacion__Group__5__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4753:2: rule__Ordenacion__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__5__Impl_in_rule__Ordenacion__Group__59376);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4759:1: rule__Ordenacion__Group__5__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4763:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4764:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4764:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4765:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ordenacion__Group__5__Impl9404); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4790:1: rule__Ordenacion__Group_3__0 : rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1 ;
    public final void rule__Ordenacion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4794:1: ( rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4795:2: rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__0__Impl_in_rule__Ordenacion__Group_3__09447);
            rule__Ordenacion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__1_in_rule__Ordenacion__Group_3__09450);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4802:1: rule__Ordenacion__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__Ordenacion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4806:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4807:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4807:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4808:1: 'correctas'
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ordenacion__Group_3__0__Impl9478); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4821:1: rule__Ordenacion__Group_3__1 : rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2 ;
    public final void rule__Ordenacion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4825:1: ( rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4826:2: rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__1__Impl_in_rule__Ordenacion__Group_3__19509);
            rule__Ordenacion__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__2_in_rule__Ordenacion__Group_3__19512);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4833:1: rule__Ordenacion__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4837:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4838:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4838:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4839:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group_3__1__Impl9540); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4852:1: rule__Ordenacion__Group_3__2 : rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3 ;
    public final void rule__Ordenacion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4856:1: ( rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4857:2: rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__2__Impl_in_rule__Ordenacion__Group_3__29571);
            rule__Ordenacion__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__3_in_rule__Ordenacion__Group_3__29574);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4864:1: rule__Ordenacion__Group_3__2__Impl : ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) ) ;
    public final void rule__Ordenacion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4868:1: ( ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4869:1: ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4869:1: ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4870:1: ( rule__Ordenacion__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4871:1: ( rule__Ordenacion__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4871:2: rule__Ordenacion__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__CorrectasAssignment_3_2_in_rule__Ordenacion__Group_3__2__Impl9601);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4881:1: rule__Ordenacion__Group_3__3 : rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4 ;
    public final void rule__Ordenacion__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4885:1: ( rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4886:2: rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__3__Impl_in_rule__Ordenacion__Group_3__39631);
            rule__Ordenacion__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__4_in_rule__Ordenacion__Group_3__39634);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4893:1: rule__Ordenacion__Group_3__3__Impl : ( ( rule__Ordenacion__Group_3_3__0 )* ) ;
    public final void rule__Ordenacion__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4897:1: ( ( ( rule__Ordenacion__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4898:1: ( ( rule__Ordenacion__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4898:1: ( ( rule__Ordenacion__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4899:1: ( rule__Ordenacion__Group_3_3__0 )*
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4900:1: ( rule__Ordenacion__Group_3_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4900:2: rule__Ordenacion__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__0_in_rule__Ordenacion__Group_3__3__Impl9661);
            	    rule__Ordenacion__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4910:1: rule__Ordenacion__Group_3__4 : rule__Ordenacion__Group_3__4__Impl ;
    public final void rule__Ordenacion__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4914:1: ( rule__Ordenacion__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4915:2: rule__Ordenacion__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__4__Impl_in_rule__Ordenacion__Group_3__49692);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4921:1: rule__Ordenacion__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4925:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4926:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4926:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4927:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ordenacion__Group_3__4__Impl9720); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4950:1: rule__Ordenacion__Group_3_3__0 : rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1 ;
    public final void rule__Ordenacion__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4954:1: ( rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4955:2: rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__0__Impl_in_rule__Ordenacion__Group_3_3__09761);
            rule__Ordenacion__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__1_in_rule__Ordenacion__Group_3_3__09764);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4962:1: rule__Ordenacion__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Ordenacion__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4966:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4967:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4967:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4968:1: ','
            {
             before(grammarAccess.getOrdenacionAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ordenacion__Group_3_3__0__Impl9792); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4981:1: rule__Ordenacion__Group_3_3__1 : rule__Ordenacion__Group_3_3__1__Impl ;
    public final void rule__Ordenacion__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4985:1: ( rule__Ordenacion__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4986:2: rule__Ordenacion__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__1__Impl_in_rule__Ordenacion__Group_3_3__19823);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4992:1: rule__Ordenacion__Group_3_3__1__Impl : ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__Ordenacion__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4996:1: ( ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4997:1: ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4997:1: ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4998:1: ( rule__Ordenacion__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4999:1: ( rule__Ordenacion__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4999:2: rule__Ordenacion__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__CorrectasAssignment_3_3_1_in_rule__Ordenacion__Group_3_3__1__Impl9850);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5013:1: rule__Ordenacion__Group_4__0 : rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1 ;
    public final void rule__Ordenacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5017:1: ( rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5018:2: rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__0__Impl_in_rule__Ordenacion__Group_4__09884);
            rule__Ordenacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__1_in_rule__Ordenacion__Group_4__09887);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5025:1: rule__Ordenacion__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__Ordenacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5029:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5030:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5030:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5031:1: 'alternativas'
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Ordenacion__Group_4__0__Impl9915); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5044:1: rule__Ordenacion__Group_4__1 : rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2 ;
    public final void rule__Ordenacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5048:1: ( rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5049:2: rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__1__Impl_in_rule__Ordenacion__Group_4__19946);
            rule__Ordenacion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__2_in_rule__Ordenacion__Group_4__19949);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5056:1: rule__Ordenacion__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5060:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5061:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5061:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5062:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group_4__1__Impl9977); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5075:1: rule__Ordenacion__Group_4__2 : rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3 ;
    public final void rule__Ordenacion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5079:1: ( rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5080:2: rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__2__Impl_in_rule__Ordenacion__Group_4__210008);
            rule__Ordenacion__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__3_in_rule__Ordenacion__Group_4__210011);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5087:1: rule__Ordenacion__Group_4__2__Impl : ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) ) ;
    public final void rule__Ordenacion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5091:1: ( ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5092:1: ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5092:1: ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5093:1: ( rule__Ordenacion__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5094:1: ( rule__Ordenacion__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5094:2: rule__Ordenacion__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__AlternativasAssignment_4_2_in_rule__Ordenacion__Group_4__2__Impl10038);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5104:1: rule__Ordenacion__Group_4__3 : rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4 ;
    public final void rule__Ordenacion__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5108:1: ( rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5109:2: rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__3__Impl_in_rule__Ordenacion__Group_4__310068);
            rule__Ordenacion__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__4_in_rule__Ordenacion__Group_4__310071);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5116:1: rule__Ordenacion__Group_4__3__Impl : ( ( rule__Ordenacion__Group_4_3__0 )* ) ;
    public final void rule__Ordenacion__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5120:1: ( ( ( rule__Ordenacion__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5121:1: ( ( rule__Ordenacion__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5121:1: ( ( rule__Ordenacion__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5122:1: ( rule__Ordenacion__Group_4_3__0 )*
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5123:1: ( rule__Ordenacion__Group_4_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5123:2: rule__Ordenacion__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__0_in_rule__Ordenacion__Group_4__3__Impl10098);
            	    rule__Ordenacion__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5133:1: rule__Ordenacion__Group_4__4 : rule__Ordenacion__Group_4__4__Impl ;
    public final void rule__Ordenacion__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5137:1: ( rule__Ordenacion__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5138:2: rule__Ordenacion__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__4__Impl_in_rule__Ordenacion__Group_4__410129);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5144:1: rule__Ordenacion__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5148:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5149:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5149:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5150:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ordenacion__Group_4__4__Impl10157); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5173:1: rule__Ordenacion__Group_4_3__0 : rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1 ;
    public final void rule__Ordenacion__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5177:1: ( rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5178:2: rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__0__Impl_in_rule__Ordenacion__Group_4_3__010198);
            rule__Ordenacion__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__1_in_rule__Ordenacion__Group_4_3__010201);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5185:1: rule__Ordenacion__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Ordenacion__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5189:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5190:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5190:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5191:1: ','
            {
             before(grammarAccess.getOrdenacionAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ordenacion__Group_4_3__0__Impl10229); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5204:1: rule__Ordenacion__Group_4_3__1 : rule__Ordenacion__Group_4_3__1__Impl ;
    public final void rule__Ordenacion__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5208:1: ( rule__Ordenacion__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5209:2: rule__Ordenacion__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__1__Impl_in_rule__Ordenacion__Group_4_3__110260);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5215:1: rule__Ordenacion__Group_4_3__1__Impl : ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__Ordenacion__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5219:1: ( ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5220:1: ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5220:1: ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5221:1: ( rule__Ordenacion__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5222:1: ( rule__Ordenacion__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5222:2: rule__Ordenacion__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__AlternativasAssignment_4_3_1_in_rule__Ordenacion__Group_4_3__1__Impl10287);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5237:1: rule__Ejercicio__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ejercicio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5241:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5242:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5242:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5243:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__NameAssignment_110326);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5252:1: rule__Ejercicio__EnunciadoAssignment_4 : ( ruleEString ) ;
    public final void rule__Ejercicio__EnunciadoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5256:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5257:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5257:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5258:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getEnunciadoEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__EnunciadoAssignment_410357);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5267:1: rule__Ejercicio__PuntuacionEjAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Ejercicio__PuntuacionEjAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5271:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5272:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5272:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5273:1: ruleEDouble
            {
             before(grammarAccess.getEjercicioAccess().getPuntuacionEjEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Ejercicio__PuntuacionEjAssignment_5_110388);
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


    // $ANTLR start "rule__Ejercicio__CategoriaAssignment_7"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5282:1: rule__Ejercicio__CategoriaAssignment_7 : ( ruleEString ) ;
    public final void rule__Ejercicio__CategoriaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5286:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5287:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5287:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5288:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getCategoriaEStringParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__CategoriaAssignment_710419);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getCategoriaEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Ejercicio__CategoriaAssignment_7"


    // $ANTLR start "rule__Ejercicio__OrderAssignment_9"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5297:1: rule__Ejercicio__OrderAssignment_9 : ( ruleEInt ) ;
    public final void rule__Ejercicio__OrderAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5301:1: ( ( ruleEInt ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5302:1: ( ruleEInt )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5302:1: ( ruleEInt )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5303:1: ruleEInt
            {
             before(grammarAccess.getEjercicioAccess().getOrderEIntParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Ejercicio__OrderAssignment_910450);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getOrderEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Ejercicio__OrderAssignment_9"


    // $ANTLR start "rule__Ejercicio__RespuestaAssignment_11"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5312:1: rule__Ejercicio__RespuestaAssignment_11 : ( ruleRespuesta ) ;
    public final void rule__Ejercicio__RespuestaAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5316:1: ( ( ruleRespuesta ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5317:1: ( ruleRespuesta )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5317:1: ( ruleRespuesta )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5318:1: ruleRespuesta
            {
             before(grammarAccess.getEjercicioAccess().getRespuestaRespuestaParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuesta_in_rule__Ejercicio__RespuestaAssignment_1110481);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getEjercicioAccess().getRespuestaRespuestaParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Ejercicio__RespuestaAssignment_11"


    // $ANTLR start "rule__Clasico__PuntuacionAssignment_3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5327:1: rule__Clasico__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Clasico__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5331:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5332:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5332:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5333:1: ruleEDouble
            {
             before(grammarAccess.getClasicoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Clasico__PuntuacionAssignment_310512);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5342:1: rule__Clasico__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Clasico__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5346:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5347:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5347:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5348:1: ruleEDouble
            {
             before(grammarAccess.getClasicoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Clasico__PenalizacionAssignment_510543);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5357:1: rule__Clasico__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__Clasico__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5361:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5362:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5362:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5363:1: ruleEjercicio
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_810574);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5372:1: rule__Clasico__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__Clasico__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5376:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5377:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5377:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5378:1: ruleEjercicio
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_9_110605);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5387:1: rule__Wizard__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Wizard__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5391:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5392:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5392:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5393:1: ruleEDouble
            {
             before(grammarAccess.getWizardAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Wizard__PuntuacionAssignment_310636);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5402:1: rule__Wizard__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Wizard__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5406:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5407:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5407:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5408:1: ruleEDouble
            {
             before(grammarAccess.getWizardAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Wizard__PenalizacionAssignment_510667);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5417:1: rule__Wizard__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__Wizard__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5421:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5422:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5422:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5423:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_810698);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5432:1: rule__Wizard__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__Wizard__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5436:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5437:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5437:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5438:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_9_110729);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5447:1: rule__WizardAdaptativo__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__WizardAdaptativo__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5451:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5452:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5452:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5453:1: ruleEDouble
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PuntuacionAssignment_310760);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5462:1: rule__WizardAdaptativo__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__WizardAdaptativo__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5466:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5467:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5467:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5468:1: ruleEDouble
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PenalizacionAssignment_510791);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5477:1: rule__WizardAdaptativo__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__WizardAdaptativo__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5481:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5482:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5482:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5483:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_810822);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5492:1: rule__WizardAdaptativo__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__WizardAdaptativo__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5496:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5497:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5497:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5498:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_9_110853);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5507:1: rule__RespuestaUnica__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5511:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5512:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5512:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5513:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_210884);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5522:1: rule__RespuestaUnica__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5526:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5527:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5527:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5528:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_3_110915);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5537:1: rule__RespuestaUnica__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5541:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5542:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5542:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5543:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_210946);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5552:1: rule__RespuestaUnica__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5556:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5557:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5557:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5558:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_3_110977);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5567:1: rule__RespuestaMultiple__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5571:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5572:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5572:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5573:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_211008);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5582:1: rule__RespuestaMultiple__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5586:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5587:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5587:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5588:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_3_111039);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5597:1: rule__RespuestaMultiple__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5601:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5602:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5602:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5603:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_211070);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5612:1: rule__RespuestaMultiple__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5616:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5617:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5617:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5618:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_3_111101);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5627:1: rule__TextoLibre__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__TextoLibre__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5631:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5632:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5632:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5633:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_211132);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5642:1: rule__TextoLibre__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__TextoLibre__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5646:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5647:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5647:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5648:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_3_111163);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5657:1: rule__TextoLibre__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__TextoLibre__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5661:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5662:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5662:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5663:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_211194);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5672:1: rule__TextoLibre__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__TextoLibre__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5676:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5677:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5677:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5678:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_3_111225);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5687:1: rule__Ordenacion__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__Ordenacion__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5691:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5692:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5692:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5693:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_211256);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5702:1: rule__Ordenacion__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__Ordenacion__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5706:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5707:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5707:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5708:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_3_111287);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5717:1: rule__Ordenacion__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Ordenacion__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5721:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5722:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5722:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5723:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_211318);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5732:1: rule__Ordenacion__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__Ordenacion__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5736:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5737:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5737:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5738:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_3_111349);
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
        public static final BitSet FOLLOW_rule__Ejercicio__Group__4__Impl_in_rule__Ejercicio__Group__41347 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__5_in_rule__Ejercicio__Group__41350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__EnunciadoAssignment_4_in_rule__Ejercicio__Group__4__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__5__Impl_in_rule__Ejercicio__Group__51407 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__6_in_rule__Ejercicio__Group__51410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__0_in_rule__Ejercicio__Group__5__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__6__Impl_in_rule__Ejercicio__Group__61468 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__7_in_rule__Ejercicio__Group__61471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Ejercicio__Group__6__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__7__Impl_in_rule__Ejercicio__Group__71530 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__8_in_rule__Ejercicio__Group__71533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__CategoriaAssignment_7_in_rule__Ejercicio__Group__7__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__8__Impl_in_rule__Ejercicio__Group__81590 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__9_in_rule__Ejercicio__Group__81593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Ejercicio__Group__8__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__9__Impl_in_rule__Ejercicio__Group__91652 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__10_in_rule__Ejercicio__Group__91655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__OrderAssignment_9_in_rule__Ejercicio__Group__9__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__10__Impl_in_rule__Ejercicio__Group__101712 = new BitSet(new long[]{0x0000000E40000000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__11_in_rule__Ejercicio__Group__101715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ejercicio__Group__10__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__11__Impl_in_rule__Ejercicio__Group__111774 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__12_in_rule__Ejercicio__Group__111777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__RespuestaAssignment_11_in_rule__Ejercicio__Group__11__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group__12__Impl_in_rule__Ejercicio__Group__121834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ejercicio__Group__12__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__0__Impl_in_rule__Ejercicio__Group_5__01919 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__1_in_rule__Ejercicio__Group_5__01922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Ejercicio__Group_5__0__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__Group_5__1__Impl_in_rule__Ejercicio__Group_5__11981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ejercicio__PuntuacionEjAssignment_5_1_in_rule__Ejercicio__Group_5__1__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02042 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EDouble__Group__0__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__12107 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__12110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__22169 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__22172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EDouble__Group__2__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__32231 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__32234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__42290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__02358 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__02361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__12418 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__12421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EDouble__Group_4__1__Impl2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__22483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__0__Impl_in_rule__Clasico__Group__02545 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__1_in_rule__Clasico__Group__02548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Clasico__Group__0__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__1__Impl_in_rule__Clasico__Group__12607 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__2_in_rule__Clasico__Group__12610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Clasico__Group__1__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__2__Impl_in_rule__Clasico__Group__22669 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Clasico__Group__3_in_rule__Clasico__Group__22672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Clasico__Group__2__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__3__Impl_in_rule__Clasico__Group__32731 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__4_in_rule__Clasico__Group__32734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__PuntuacionAssignment_3_in_rule__Clasico__Group__3__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__4__Impl_in_rule__Clasico__Group__42791 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Clasico__Group__5_in_rule__Clasico__Group__42794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Clasico__Group__4__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__5__Impl_in_rule__Clasico__Group__52853 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__6_in_rule__Clasico__Group__52856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__PenalizacionAssignment_5_in_rule__Clasico__Group__5__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__6__Impl_in_rule__Clasico__Group__62913 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__7_in_rule__Clasico__Group__62916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Clasico__Group__6__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__7__Impl_in_rule__Clasico__Group__72975 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__8_in_rule__Clasico__Group__72978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Clasico__Group__7__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__8__Impl_in_rule__Clasico__Group__83037 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__9_in_rule__Clasico__Group__83040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__EjerciciosAssignment_8_in_rule__Clasico__Group__8__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__9__Impl_in_rule__Clasico__Group__93097 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__10_in_rule__Clasico__Group__93100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__0_in_rule__Clasico__Group__9__Impl3127 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__10__Impl_in_rule__Clasico__Group__103158 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Clasico__Group__11_in_rule__Clasico__Group__103161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Clasico__Group__10__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group__11__Impl_in_rule__Clasico__Group__113220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Clasico__Group__11__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__0__Impl_in_rule__Clasico__Group_9__03303 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__1_in_rule__Clasico__Group_9__03306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Clasico__Group_9__0__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__Group_9__1__Impl_in_rule__Clasico__Group_9__13365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clasico__EjerciciosAssignment_9_1_in_rule__Clasico__Group_9__1__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__0__Impl_in_rule__Wizard__Group__03426 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__1_in_rule__Wizard__Group__03429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Wizard__Group__0__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__1__Impl_in_rule__Wizard__Group__13488 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__2_in_rule__Wizard__Group__13491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Wizard__Group__1__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__2__Impl_in_rule__Wizard__Group__23550 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Wizard__Group__3_in_rule__Wizard__Group__23553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Wizard__Group__2__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__3__Impl_in_rule__Wizard__Group__33612 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__4_in_rule__Wizard__Group__33615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__PuntuacionAssignment_3_in_rule__Wizard__Group__3__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__4__Impl_in_rule__Wizard__Group__43672 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__Wizard__Group__5_in_rule__Wizard__Group__43675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Wizard__Group__4__Impl3703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__5__Impl_in_rule__Wizard__Group__53734 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__6_in_rule__Wizard__Group__53737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__PenalizacionAssignment_5_in_rule__Wizard__Group__5__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__6__Impl_in_rule__Wizard__Group__63794 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__7_in_rule__Wizard__Group__63797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Wizard__Group__6__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__7__Impl_in_rule__Wizard__Group__73856 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__8_in_rule__Wizard__Group__73859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Wizard__Group__7__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__8__Impl_in_rule__Wizard__Group__83918 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__9_in_rule__Wizard__Group__83921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__EjerciciosAssignment_8_in_rule__Wizard__Group__8__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__9__Impl_in_rule__Wizard__Group__93978 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__10_in_rule__Wizard__Group__93981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__0_in_rule__Wizard__Group__9__Impl4008 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__10__Impl_in_rule__Wizard__Group__104039 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Wizard__Group__11_in_rule__Wizard__Group__104042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Wizard__Group__10__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group__11__Impl_in_rule__Wizard__Group__114101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Wizard__Group__11__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__0__Impl_in_rule__Wizard__Group_9__04184 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__1_in_rule__Wizard__Group_9__04187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Wizard__Group_9__0__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__Group_9__1__Impl_in_rule__Wizard__Group_9__14246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wizard__EjerciciosAssignment_9_1_in_rule__Wizard__Group_9__1__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__0__Impl_in_rule__WizardAdaptativo__Group__04307 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__1_in_rule__WizardAdaptativo__Group__04310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__WizardAdaptativo__Group__0__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__1__Impl_in_rule__WizardAdaptativo__Group__14369 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__2_in_rule__WizardAdaptativo__Group__14372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WizardAdaptativo__Group__1__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__2__Impl_in_rule__WizardAdaptativo__Group__24431 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__3_in_rule__WizardAdaptativo__Group__24434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__WizardAdaptativo__Group__2__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__3__Impl_in_rule__WizardAdaptativo__Group__34493 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__4_in_rule__WizardAdaptativo__Group__34496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__PuntuacionAssignment_3_in_rule__WizardAdaptativo__Group__3__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__4__Impl_in_rule__WizardAdaptativo__Group__44553 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__5_in_rule__WizardAdaptativo__Group__44556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__WizardAdaptativo__Group__4__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__5__Impl_in_rule__WizardAdaptativo__Group__54615 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__6_in_rule__WizardAdaptativo__Group__54618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__PenalizacionAssignment_5_in_rule__WizardAdaptativo__Group__5__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__6__Impl_in_rule__WizardAdaptativo__Group__64675 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__7_in_rule__WizardAdaptativo__Group__64678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__WizardAdaptativo__Group__6__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__7__Impl_in_rule__WizardAdaptativo__Group__74737 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__8_in_rule__WizardAdaptativo__Group__74740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WizardAdaptativo__Group__7__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__8__Impl_in_rule__WizardAdaptativo__Group__84799 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__9_in_rule__WizardAdaptativo__Group__84802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_8_in_rule__WizardAdaptativo__Group__8__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__9__Impl_in_rule__WizardAdaptativo__Group__94859 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__10_in_rule__WizardAdaptativo__Group__94862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__0_in_rule__WizardAdaptativo__Group__9__Impl4889 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__10__Impl_in_rule__WizardAdaptativo__Group__104920 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__11_in_rule__WizardAdaptativo__Group__104923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WizardAdaptativo__Group__10__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__11__Impl_in_rule__WizardAdaptativo__Group__114982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WizardAdaptativo__Group__11__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__0__Impl_in_rule__WizardAdaptativo__Group_9__05065 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__1_in_rule__WizardAdaptativo__Group_9__05068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__WizardAdaptativo__Group_9__0__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_9__1__Impl_in_rule__WizardAdaptativo__Group_9__15127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_9_1_in_rule__WizardAdaptativo__Group_9__1__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05188 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EInt__Group__0__Impl5220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__0__Impl_in_rule__RespuestaUnica__Group__05313 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__1_in_rule__RespuestaUnica__Group__05316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__1__Impl_in_rule__RespuestaUnica__Group__15374 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__2_in_rule__RespuestaUnica__Group__15377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RespuestaUnica__Group__1__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__2__Impl_in_rule__RespuestaUnica__Group__25436 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__3_in_rule__RespuestaUnica__Group__25439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group__2__Impl5467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__3__Impl_in_rule__RespuestaUnica__Group__35498 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__4_in_rule__RespuestaUnica__Group__35501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__0_in_rule__RespuestaUnica__Group__3__Impl5528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__4__Impl_in_rule__RespuestaUnica__Group__45559 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__5_in_rule__RespuestaUnica__Group__45562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__0_in_rule__RespuestaUnica__Group__4__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__5__Impl_in_rule__RespuestaUnica__Group__55620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaUnica__Group__5__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__0__Impl_in_rule__RespuestaUnica__Group_3__05691 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__1_in_rule__RespuestaUnica__Group_3__05694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RespuestaUnica__Group_3__0__Impl5722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__1__Impl_in_rule__RespuestaUnica__Group_3__15753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__2_in_rule__RespuestaUnica__Group_3__15756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group_3__1__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__2__Impl_in_rule__RespuestaUnica__Group_3__25815 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__3_in_rule__RespuestaUnica__Group_3__25818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_2_in_rule__RespuestaUnica__Group_3__2__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__3__Impl_in_rule__RespuestaUnica__Group_3__35875 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__4_in_rule__RespuestaUnica__Group_3__35878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__0_in_rule__RespuestaUnica__Group_3__3__Impl5905 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__4__Impl_in_rule__RespuestaUnica__Group_3__45936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaUnica__Group_3__4__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__0__Impl_in_rule__RespuestaUnica__Group_3_3__06005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__1_in_rule__RespuestaUnica__Group_3_3__06008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaUnica__Group_3_3__0__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__1__Impl_in_rule__RespuestaUnica__Group_3_3__16067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_3_1_in_rule__RespuestaUnica__Group_3_3__1__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__0__Impl_in_rule__RespuestaUnica__Group_4__06128 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__1_in_rule__RespuestaUnica__Group_4__06131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RespuestaUnica__Group_4__0__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__1__Impl_in_rule__RespuestaUnica__Group_4__16190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__2_in_rule__RespuestaUnica__Group_4__16193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group_4__1__Impl6221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__2__Impl_in_rule__RespuestaUnica__Group_4__26252 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__3_in_rule__RespuestaUnica__Group_4__26255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_2_in_rule__RespuestaUnica__Group_4__2__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__3__Impl_in_rule__RespuestaUnica__Group_4__36312 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__4_in_rule__RespuestaUnica__Group_4__36315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__0_in_rule__RespuestaUnica__Group_4__3__Impl6342 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__4__Impl_in_rule__RespuestaUnica__Group_4__46373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaUnica__Group_4__4__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__0__Impl_in_rule__RespuestaUnica__Group_4_3__06442 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__1_in_rule__RespuestaUnica__Group_4_3__06445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaUnica__Group_4_3__0__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__1__Impl_in_rule__RespuestaUnica__Group_4_3__16504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_3_1_in_rule__RespuestaUnica__Group_4_3__1__Impl6531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__0__Impl_in_rule__RespuestaMultiple__Group__06565 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__1_in_rule__RespuestaMultiple__Group__06568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__1__Impl_in_rule__RespuestaMultiple__Group__16626 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__2_in_rule__RespuestaMultiple__Group__16629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__RespuestaMultiple__Group__1__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__2__Impl_in_rule__RespuestaMultiple__Group__26688 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__3_in_rule__RespuestaMultiple__Group__26691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group__2__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__3__Impl_in_rule__RespuestaMultiple__Group__36750 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__4_in_rule__RespuestaMultiple__Group__36753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__0_in_rule__RespuestaMultiple__Group__3__Impl6780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__4__Impl_in_rule__RespuestaMultiple__Group__46811 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__5_in_rule__RespuestaMultiple__Group__46814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__0_in_rule__RespuestaMultiple__Group__4__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__5__Impl_in_rule__RespuestaMultiple__Group__56872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaMultiple__Group__5__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__0__Impl_in_rule__RespuestaMultiple__Group_3__06943 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__1_in_rule__RespuestaMultiple__Group_3__06946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RespuestaMultiple__Group_3__0__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__1__Impl_in_rule__RespuestaMultiple__Group_3__17005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__2_in_rule__RespuestaMultiple__Group_3__17008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group_3__1__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__2__Impl_in_rule__RespuestaMultiple__Group_3__27067 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__3_in_rule__RespuestaMultiple__Group_3__27070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_2_in_rule__RespuestaMultiple__Group_3__2__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__3__Impl_in_rule__RespuestaMultiple__Group_3__37127 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__4_in_rule__RespuestaMultiple__Group_3__37130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__0_in_rule__RespuestaMultiple__Group_3__3__Impl7157 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__4__Impl_in_rule__RespuestaMultiple__Group_3__47188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaMultiple__Group_3__4__Impl7216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__0__Impl_in_rule__RespuestaMultiple__Group_3_3__07257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__1_in_rule__RespuestaMultiple__Group_3_3__07260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaMultiple__Group_3_3__0__Impl7288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__1__Impl_in_rule__RespuestaMultiple__Group_3_3__17319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_3_1_in_rule__RespuestaMultiple__Group_3_3__1__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__0__Impl_in_rule__RespuestaMultiple__Group_4__07380 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__1_in_rule__RespuestaMultiple__Group_4__07383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RespuestaMultiple__Group_4__0__Impl7411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__1__Impl_in_rule__RespuestaMultiple__Group_4__17442 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__2_in_rule__RespuestaMultiple__Group_4__17445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group_4__1__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__2__Impl_in_rule__RespuestaMultiple__Group_4__27504 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__3_in_rule__RespuestaMultiple__Group_4__27507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_2_in_rule__RespuestaMultiple__Group_4__2__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__3__Impl_in_rule__RespuestaMultiple__Group_4__37564 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__4_in_rule__RespuestaMultiple__Group_4__37567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__0_in_rule__RespuestaMultiple__Group_4__3__Impl7594 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__4__Impl_in_rule__RespuestaMultiple__Group_4__47625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaMultiple__Group_4__4__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__0__Impl_in_rule__RespuestaMultiple__Group_4_3__07694 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__1_in_rule__RespuestaMultiple__Group_4_3__07697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaMultiple__Group_4_3__0__Impl7725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__1__Impl_in_rule__RespuestaMultiple__Group_4_3__17756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_3_1_in_rule__RespuestaMultiple__Group_4_3__1__Impl7783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__0__Impl_in_rule__TextoLibre__Group__07817 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__1_in_rule__TextoLibre__Group__07820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__1__Impl_in_rule__TextoLibre__Group__17878 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__2_in_rule__TextoLibre__Group__17881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TextoLibre__Group__1__Impl7909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__2__Impl_in_rule__TextoLibre__Group__27940 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__3_in_rule__TextoLibre__Group__27943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group__2__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__3__Impl_in_rule__TextoLibre__Group__38002 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__4_in_rule__TextoLibre__Group__38005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__0_in_rule__TextoLibre__Group__3__Impl8032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__4__Impl_in_rule__TextoLibre__Group__48063 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__5_in_rule__TextoLibre__Group__48066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__0_in_rule__TextoLibre__Group__4__Impl8093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__5__Impl_in_rule__TextoLibre__Group__58124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextoLibre__Group__5__Impl8152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__0__Impl_in_rule__TextoLibre__Group_3__08195 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__1_in_rule__TextoLibre__Group_3__08198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TextoLibre__Group_3__0__Impl8226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__1__Impl_in_rule__TextoLibre__Group_3__18257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__2_in_rule__TextoLibre__Group_3__18260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group_3__1__Impl8288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__2__Impl_in_rule__TextoLibre__Group_3__28319 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__3_in_rule__TextoLibre__Group_3__28322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__CorrectasAssignment_3_2_in_rule__TextoLibre__Group_3__2__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__3__Impl_in_rule__TextoLibre__Group_3__38379 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__4_in_rule__TextoLibre__Group_3__38382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__0_in_rule__TextoLibre__Group_3__3__Impl8409 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__4__Impl_in_rule__TextoLibre__Group_3__48440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextoLibre__Group_3__4__Impl8468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__0__Impl_in_rule__TextoLibre__Group_3_3__08509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__1_in_rule__TextoLibre__Group_3_3__08512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TextoLibre__Group_3_3__0__Impl8540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__1__Impl_in_rule__TextoLibre__Group_3_3__18571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__CorrectasAssignment_3_3_1_in_rule__TextoLibre__Group_3_3__1__Impl8598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__0__Impl_in_rule__TextoLibre__Group_4__08632 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__1_in_rule__TextoLibre__Group_4__08635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TextoLibre__Group_4__0__Impl8663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__1__Impl_in_rule__TextoLibre__Group_4__18694 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__2_in_rule__TextoLibre__Group_4__18697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group_4__1__Impl8725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__2__Impl_in_rule__TextoLibre__Group_4__28756 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__3_in_rule__TextoLibre__Group_4__28759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__AlternativasAssignment_4_2_in_rule__TextoLibre__Group_4__2__Impl8786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__3__Impl_in_rule__TextoLibre__Group_4__38816 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__4_in_rule__TextoLibre__Group_4__38819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__0_in_rule__TextoLibre__Group_4__3__Impl8846 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__4__Impl_in_rule__TextoLibre__Group_4__48877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextoLibre__Group_4__4__Impl8905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__0__Impl_in_rule__TextoLibre__Group_4_3__08946 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__1_in_rule__TextoLibre__Group_4_3__08949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TextoLibre__Group_4_3__0__Impl8977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__1__Impl_in_rule__TextoLibre__Group_4_3__19008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__AlternativasAssignment_4_3_1_in_rule__TextoLibre__Group_4_3__1__Impl9035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__0__Impl_in_rule__Ordenacion__Group__09069 = new BitSet(new long[]{0x0000000E40000000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__1_in_rule__Ordenacion__Group__09072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__1__Impl_in_rule__Ordenacion__Group__19130 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__2_in_rule__Ordenacion__Group__19133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Ordenacion__Group__1__Impl9161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__2__Impl_in_rule__Ordenacion__Group__29192 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__3_in_rule__Ordenacion__Group__29195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group__2__Impl9223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__3__Impl_in_rule__Ordenacion__Group__39254 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__4_in_rule__Ordenacion__Group__39257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__0_in_rule__Ordenacion__Group__3__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__4__Impl_in_rule__Ordenacion__Group__49315 = new BitSet(new long[]{0x0000000180080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__5_in_rule__Ordenacion__Group__49318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__0_in_rule__Ordenacion__Group__4__Impl9345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__5__Impl_in_rule__Ordenacion__Group__59376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ordenacion__Group__5__Impl9404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__0__Impl_in_rule__Ordenacion__Group_3__09447 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__1_in_rule__Ordenacion__Group_3__09450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ordenacion__Group_3__0__Impl9478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__1__Impl_in_rule__Ordenacion__Group_3__19509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__2_in_rule__Ordenacion__Group_3__19512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group_3__1__Impl9540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__2__Impl_in_rule__Ordenacion__Group_3__29571 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__3_in_rule__Ordenacion__Group_3__29574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__CorrectasAssignment_3_2_in_rule__Ordenacion__Group_3__2__Impl9601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__3__Impl_in_rule__Ordenacion__Group_3__39631 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__4_in_rule__Ordenacion__Group_3__39634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__0_in_rule__Ordenacion__Group_3__3__Impl9661 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__4__Impl_in_rule__Ordenacion__Group_3__49692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ordenacion__Group_3__4__Impl9720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__0__Impl_in_rule__Ordenacion__Group_3_3__09761 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__1_in_rule__Ordenacion__Group_3_3__09764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ordenacion__Group_3_3__0__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__1__Impl_in_rule__Ordenacion__Group_3_3__19823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__CorrectasAssignment_3_3_1_in_rule__Ordenacion__Group_3_3__1__Impl9850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__0__Impl_in_rule__Ordenacion__Group_4__09884 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__1_in_rule__Ordenacion__Group_4__09887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Ordenacion__Group_4__0__Impl9915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__1__Impl_in_rule__Ordenacion__Group_4__19946 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__2_in_rule__Ordenacion__Group_4__19949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group_4__1__Impl9977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__2__Impl_in_rule__Ordenacion__Group_4__210008 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__3_in_rule__Ordenacion__Group_4__210011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__AlternativasAssignment_4_2_in_rule__Ordenacion__Group_4__2__Impl10038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__3__Impl_in_rule__Ordenacion__Group_4__310068 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__4_in_rule__Ordenacion__Group_4__310071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__0_in_rule__Ordenacion__Group_4__3__Impl10098 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__4__Impl_in_rule__Ordenacion__Group_4__410129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ordenacion__Group_4__4__Impl10157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__0__Impl_in_rule__Ordenacion__Group_4_3__010198 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__1_in_rule__Ordenacion__Group_4_3__010201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ordenacion__Group_4_3__0__Impl10229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__1__Impl_in_rule__Ordenacion__Group_4_3__110260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__AlternativasAssignment_4_3_1_in_rule__Ordenacion__Group_4_3__1__Impl10287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__NameAssignment_110326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__EnunciadoAssignment_410357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Ejercicio__PuntuacionEjAssignment_5_110388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__CategoriaAssignment_710419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Ejercicio__OrderAssignment_910450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuesta_in_rule__Ejercicio__RespuestaAssignment_1110481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Clasico__PuntuacionAssignment_310512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Clasico__PenalizacionAssignment_510543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_810574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_9_110605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Wizard__PuntuacionAssignment_310636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Wizard__PenalizacionAssignment_510667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_810698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_9_110729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PuntuacionAssignment_310760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PenalizacionAssignment_510791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_810822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_9_110853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_210884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_3_110915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_210946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_3_110977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_211008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_3_111039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_211070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_3_111101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_211132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_3_111163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_211194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_3_111225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_211256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_3_111287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_211318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_3_111349 = new BitSet(new long[]{0x0000000000000002L});
    }


}