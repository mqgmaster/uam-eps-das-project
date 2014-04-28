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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Ejercicio'", "'{'", "'enunciado'", "'categoria'", "'order'", "'respuesta'", "'}'", "'puntuacionEj'", "'-'", "'.'", "'Clasico'", "'puntuacion'", "'penalizacion'", "'ejercicios'", "','", "'Wizard'", "'WizardAdaptativo'", "'ejerciciosRespondidos'", "'('", "')'", "'RespuestaUnica'", "'correctas'", "'alternativas'", "'seleccionadas'", "'RespuestaMultiple'", "'TextoLibre'", "'Ordenacion'"
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
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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
            case 33:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 39:
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2361:1: rule__WizardAdaptativo__Group__6__Impl : ( ( rule__WizardAdaptativo__Group_6__0 )? ) ;
    public final void rule__WizardAdaptativo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2365:1: ( ( ( rule__WizardAdaptativo__Group_6__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2366:1: ( ( rule__WizardAdaptativo__Group_6__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2366:1: ( ( rule__WizardAdaptativo__Group_6__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2367:1: ( rule__WizardAdaptativo__Group_6__0 )?
            {
             before(grammarAccess.getWizardAdaptativoAccess().getGroup_6()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2368:1: ( rule__WizardAdaptativo__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2368:2: rule__WizardAdaptativo__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__0_in_rule__WizardAdaptativo__Group__6__Impl4705);
                    rule__WizardAdaptativo__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWizardAdaptativoAccess().getGroup_6()); 

            }


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2378:1: rule__WizardAdaptativo__Group__7 : rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8 ;
    public final void rule__WizardAdaptativo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2382:1: ( rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2383:2: rule__WizardAdaptativo__Group__7__Impl rule__WizardAdaptativo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__7__Impl_in_rule__WizardAdaptativo__Group__74736);
            rule__WizardAdaptativo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__8_in_rule__WizardAdaptativo__Group__74739);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2390:1: rule__WizardAdaptativo__Group__7__Impl : ( 'ejercicios' ) ;
    public final void rule__WizardAdaptativo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2394:1: ( ( 'ejercicios' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2395:1: ( 'ejercicios' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2395:1: ( 'ejercicios' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2396:1: 'ejercicios'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosKeyword_7()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__WizardAdaptativo__Group__7__Impl4767); 
             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosKeyword_7()); 

            }


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2409:1: rule__WizardAdaptativo__Group__8 : rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9 ;
    public final void rule__WizardAdaptativo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2413:1: ( rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2414:2: rule__WizardAdaptativo__Group__8__Impl rule__WizardAdaptativo__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__8__Impl_in_rule__WizardAdaptativo__Group__84798);
            rule__WizardAdaptativo__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__9_in_rule__WizardAdaptativo__Group__84801);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2421:1: rule__WizardAdaptativo__Group__8__Impl : ( '{' ) ;
    public final void rule__WizardAdaptativo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2425:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2426:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2426:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2427:1: '{'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WizardAdaptativo__Group__8__Impl4829); 
             after(grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__9__Impl_in_rule__WizardAdaptativo__Group__94860);
            rule__WizardAdaptativo__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__10_in_rule__WizardAdaptativo__Group__94863);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2452:1: rule__WizardAdaptativo__Group__9__Impl : ( ( rule__WizardAdaptativo__EjerciciosAssignment_9 ) ) ;
    public final void rule__WizardAdaptativo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2456:1: ( ( ( rule__WizardAdaptativo__EjerciciosAssignment_9 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2457:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_9 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2457:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_9 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2458:1: ( rule__WizardAdaptativo__EjerciciosAssignment_9 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_9()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2459:1: ( rule__WizardAdaptativo__EjerciciosAssignment_9 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2459:2: rule__WizardAdaptativo__EjerciciosAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_9_in_rule__WizardAdaptativo__Group__9__Impl4890);
            rule__WizardAdaptativo__EjerciciosAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_9()); 

            }


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2481:1: rule__WizardAdaptativo__Group__10__Impl : ( ( rule__WizardAdaptativo__Group_10__0 )* ) ;
    public final void rule__WizardAdaptativo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2485:1: ( ( ( rule__WizardAdaptativo__Group_10__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2486:1: ( ( rule__WizardAdaptativo__Group_10__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2486:1: ( ( rule__WizardAdaptativo__Group_10__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2487:1: ( rule__WizardAdaptativo__Group_10__0 )*
            {
             before(grammarAccess.getWizardAdaptativoAccess().getGroup_10()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2488:1: ( rule__WizardAdaptativo__Group_10__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2488:2: rule__WizardAdaptativo__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_10__0_in_rule__WizardAdaptativo__Group__10__Impl4950);
            	    rule__WizardAdaptativo__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWizardAdaptativoAccess().getGroup_10()); 

            }


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2498:1: rule__WizardAdaptativo__Group__11 : rule__WizardAdaptativo__Group__11__Impl rule__WizardAdaptativo__Group__12 ;
    public final void rule__WizardAdaptativo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2502:1: ( rule__WizardAdaptativo__Group__11__Impl rule__WizardAdaptativo__Group__12 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2503:2: rule__WizardAdaptativo__Group__11__Impl rule__WizardAdaptativo__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__11__Impl_in_rule__WizardAdaptativo__Group__114981);
            rule__WizardAdaptativo__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__12_in_rule__WizardAdaptativo__Group__114984);
            rule__WizardAdaptativo__Group__12();

            state._fsp--;


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2510:1: rule__WizardAdaptativo__Group__11__Impl : ( '}' ) ;
    public final void rule__WizardAdaptativo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2514:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2515:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2515:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2516:1: '}'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WizardAdaptativo__Group__11__Impl5012); 
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


    // $ANTLR start "rule__WizardAdaptativo__Group__12"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2529:1: rule__WizardAdaptativo__Group__12 : rule__WizardAdaptativo__Group__12__Impl ;
    public final void rule__WizardAdaptativo__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2533:1: ( rule__WizardAdaptativo__Group__12__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2534:2: rule__WizardAdaptativo__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group__12__Impl_in_rule__WizardAdaptativo__Group__125043);
            rule__WizardAdaptativo__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__12"


    // $ANTLR start "rule__WizardAdaptativo__Group__12__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2540:1: rule__WizardAdaptativo__Group__12__Impl : ( '}' ) ;
    public final void rule__WizardAdaptativo__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2544:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2545:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2545:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2546:1: '}'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WizardAdaptativo__Group__12__Impl5071); 
             after(grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group__12__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2585:1: rule__WizardAdaptativo__Group_6__0 : rule__WizardAdaptativo__Group_6__0__Impl rule__WizardAdaptativo__Group_6__1 ;
    public final void rule__WizardAdaptativo__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2589:1: ( rule__WizardAdaptativo__Group_6__0__Impl rule__WizardAdaptativo__Group_6__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2590:2: rule__WizardAdaptativo__Group_6__0__Impl rule__WizardAdaptativo__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__0__Impl_in_rule__WizardAdaptativo__Group_6__05128);
            rule__WizardAdaptativo__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__1_in_rule__WizardAdaptativo__Group_6__05131);
            rule__WizardAdaptativo__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__0"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2597:1: rule__WizardAdaptativo__Group_6__0__Impl : ( 'ejerciciosRespondidos' ) ;
    public final void rule__WizardAdaptativo__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2601:1: ( ( 'ejerciciosRespondidos' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2602:1: ( 'ejerciciosRespondidos' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2602:1: ( 'ejerciciosRespondidos' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2603:1: 'ejerciciosRespondidos'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__WizardAdaptativo__Group_6__0__Impl5159); 
             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__0__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2616:1: rule__WizardAdaptativo__Group_6__1 : rule__WizardAdaptativo__Group_6__1__Impl rule__WizardAdaptativo__Group_6__2 ;
    public final void rule__WizardAdaptativo__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2620:1: ( rule__WizardAdaptativo__Group_6__1__Impl rule__WizardAdaptativo__Group_6__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2621:2: rule__WizardAdaptativo__Group_6__1__Impl rule__WizardAdaptativo__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__1__Impl_in_rule__WizardAdaptativo__Group_6__15190);
            rule__WizardAdaptativo__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__2_in_rule__WizardAdaptativo__Group_6__15193);
            rule__WizardAdaptativo__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__1"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2628:1: rule__WizardAdaptativo__Group_6__1__Impl : ( '(' ) ;
    public final void rule__WizardAdaptativo__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2632:1: ( ( '(' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2633:1: ( '(' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2633:1: ( '(' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2634:1: '('
            {
             before(grammarAccess.getWizardAdaptativoAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__WizardAdaptativo__Group_6__1__Impl5221); 
             after(grammarAccess.getWizardAdaptativoAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__1__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2647:1: rule__WizardAdaptativo__Group_6__2 : rule__WizardAdaptativo__Group_6__2__Impl rule__WizardAdaptativo__Group_6__3 ;
    public final void rule__WizardAdaptativo__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2651:1: ( rule__WizardAdaptativo__Group_6__2__Impl rule__WizardAdaptativo__Group_6__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2652:2: rule__WizardAdaptativo__Group_6__2__Impl rule__WizardAdaptativo__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__2__Impl_in_rule__WizardAdaptativo__Group_6__25252);
            rule__WizardAdaptativo__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__3_in_rule__WizardAdaptativo__Group_6__25255);
            rule__WizardAdaptativo__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__2"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2659:1: rule__WizardAdaptativo__Group_6__2__Impl : ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2 ) ) ;
    public final void rule__WizardAdaptativo__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2663:1: ( ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2664:1: ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2664:1: ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2665:1: ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosAssignment_6_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2666:1: ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2666:2: rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2_in_rule__WizardAdaptativo__Group_6__2__Impl5282);
            rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__2__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2676:1: rule__WizardAdaptativo__Group_6__3 : rule__WizardAdaptativo__Group_6__3__Impl rule__WizardAdaptativo__Group_6__4 ;
    public final void rule__WizardAdaptativo__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2680:1: ( rule__WizardAdaptativo__Group_6__3__Impl rule__WizardAdaptativo__Group_6__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2681:2: rule__WizardAdaptativo__Group_6__3__Impl rule__WizardAdaptativo__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__3__Impl_in_rule__WizardAdaptativo__Group_6__35312);
            rule__WizardAdaptativo__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__4_in_rule__WizardAdaptativo__Group_6__35315);
            rule__WizardAdaptativo__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__3"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2688:1: rule__WizardAdaptativo__Group_6__3__Impl : ( ( rule__WizardAdaptativo__Group_6_3__0 )* ) ;
    public final void rule__WizardAdaptativo__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2692:1: ( ( ( rule__WizardAdaptativo__Group_6_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2693:1: ( ( rule__WizardAdaptativo__Group_6_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2693:1: ( ( rule__WizardAdaptativo__Group_6_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2694:1: ( rule__WizardAdaptativo__Group_6_3__0 )*
            {
             before(grammarAccess.getWizardAdaptativoAccess().getGroup_6_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2695:1: ( rule__WizardAdaptativo__Group_6_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2695:2: rule__WizardAdaptativo__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6_3__0_in_rule__WizardAdaptativo__Group_6__3__Impl5342);
            	    rule__WizardAdaptativo__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWizardAdaptativoAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__3__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2705:1: rule__WizardAdaptativo__Group_6__4 : rule__WizardAdaptativo__Group_6__4__Impl ;
    public final void rule__WizardAdaptativo__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2709:1: ( rule__WizardAdaptativo__Group_6__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2710:2: rule__WizardAdaptativo__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6__4__Impl_in_rule__WizardAdaptativo__Group_6__45373);
            rule__WizardAdaptativo__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__4"


    // $ANTLR start "rule__WizardAdaptativo__Group_6__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2716:1: rule__WizardAdaptativo__Group_6__4__Impl : ( ')' ) ;
    public final void rule__WizardAdaptativo__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2720:1: ( ( ')' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2721:1: ( ')' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2721:1: ( ')' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2722:1: ')'
            {
             before(grammarAccess.getWizardAdaptativoAccess().getRightParenthesisKeyword_6_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__WizardAdaptativo__Group_6__4__Impl5401); 
             after(grammarAccess.getWizardAdaptativoAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6__4__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_6_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2745:1: rule__WizardAdaptativo__Group_6_3__0 : rule__WizardAdaptativo__Group_6_3__0__Impl rule__WizardAdaptativo__Group_6_3__1 ;
    public final void rule__WizardAdaptativo__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2749:1: ( rule__WizardAdaptativo__Group_6_3__0__Impl rule__WizardAdaptativo__Group_6_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2750:2: rule__WizardAdaptativo__Group_6_3__0__Impl rule__WizardAdaptativo__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6_3__0__Impl_in_rule__WizardAdaptativo__Group_6_3__05442);
            rule__WizardAdaptativo__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6_3__1_in_rule__WizardAdaptativo__Group_6_3__05445);
            rule__WizardAdaptativo__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6_3__0"


    // $ANTLR start "rule__WizardAdaptativo__Group_6_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2757:1: rule__WizardAdaptativo__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__WizardAdaptativo__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2761:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2762:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2762:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2763:1: ','
            {
             before(grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__WizardAdaptativo__Group_6_3__0__Impl5473); 
             after(grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6_3__0__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_6_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2776:1: rule__WizardAdaptativo__Group_6_3__1 : rule__WizardAdaptativo__Group_6_3__1__Impl ;
    public final void rule__WizardAdaptativo__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2780:1: ( rule__WizardAdaptativo__Group_6_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2781:2: rule__WizardAdaptativo__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_6_3__1__Impl_in_rule__WizardAdaptativo__Group_6_3__15504);
            rule__WizardAdaptativo__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6_3__1"


    // $ANTLR start "rule__WizardAdaptativo__Group_6_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2787:1: rule__WizardAdaptativo__Group_6_3__1__Impl : ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1 ) ) ;
    public final void rule__WizardAdaptativo__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2791:1: ( ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2792:1: ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2792:1: ( ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2793:1: ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosAssignment_6_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2794:1: ( rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2794:2: rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1_in_rule__WizardAdaptativo__Group_6_3__1__Impl5531);
            rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_6_3__1__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_10__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2808:1: rule__WizardAdaptativo__Group_10__0 : rule__WizardAdaptativo__Group_10__0__Impl rule__WizardAdaptativo__Group_10__1 ;
    public final void rule__WizardAdaptativo__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2812:1: ( rule__WizardAdaptativo__Group_10__0__Impl rule__WizardAdaptativo__Group_10__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2813:2: rule__WizardAdaptativo__Group_10__0__Impl rule__WizardAdaptativo__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_10__0__Impl_in_rule__WizardAdaptativo__Group_10__05565);
            rule__WizardAdaptativo__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_10__1_in_rule__WizardAdaptativo__Group_10__05568);
            rule__WizardAdaptativo__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_10__0"


    // $ANTLR start "rule__WizardAdaptativo__Group_10__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2820:1: rule__WizardAdaptativo__Group_10__0__Impl : ( ',' ) ;
    public final void rule__WizardAdaptativo__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2824:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2825:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2825:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2826:1: ','
            {
             before(grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_10_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__WizardAdaptativo__Group_10__0__Impl5596); 
             after(grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_10__0__Impl"


    // $ANTLR start "rule__WizardAdaptativo__Group_10__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2839:1: rule__WizardAdaptativo__Group_10__1 : rule__WizardAdaptativo__Group_10__1__Impl ;
    public final void rule__WizardAdaptativo__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2843:1: ( rule__WizardAdaptativo__Group_10__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2844:2: rule__WizardAdaptativo__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__Group_10__1__Impl_in_rule__WizardAdaptativo__Group_10__15627);
            rule__WizardAdaptativo__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_10__1"


    // $ANTLR start "rule__WizardAdaptativo__Group_10__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2850:1: rule__WizardAdaptativo__Group_10__1__Impl : ( ( rule__WizardAdaptativo__EjerciciosAssignment_10_1 ) ) ;
    public final void rule__WizardAdaptativo__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2854:1: ( ( ( rule__WizardAdaptativo__EjerciciosAssignment_10_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2855:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_10_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2855:1: ( ( rule__WizardAdaptativo__EjerciciosAssignment_10_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2856:1: ( rule__WizardAdaptativo__EjerciciosAssignment_10_1 )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_10_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2857:1: ( rule__WizardAdaptativo__EjerciciosAssignment_10_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2857:2: rule__WizardAdaptativo__EjerciciosAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_10_1_in_rule__WizardAdaptativo__Group_10__1__Impl5654);
            rule__WizardAdaptativo__EjerciciosAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__Group_10__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2871:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2875:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2876:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05688);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05691);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2883:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2887:1: ( ( ( '-' )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2888:1: ( ( '-' )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2888:1: ( ( '-' )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2889:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2890:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2891:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EInt__Group__0__Impl5720); 

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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2902:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2906:1: ( rule__EInt__Group__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2907:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15753);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2913:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2917:1: ( ( RULE_INT ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2918:1: ( RULE_INT )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2918:1: ( RULE_INT )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2919:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5780); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2934:1: rule__RespuestaUnica__Group__0 : rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1 ;
    public final void rule__RespuestaUnica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2938:1: ( rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2939:2: rule__RespuestaUnica__Group__0__Impl rule__RespuestaUnica__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__0__Impl_in_rule__RespuestaUnica__Group__05813);
            rule__RespuestaUnica__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__1_in_rule__RespuestaUnica__Group__05816);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2946:1: rule__RespuestaUnica__Group__0__Impl : ( () ) ;
    public final void rule__RespuestaUnica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2950:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2951:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2951:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2952:1: ()
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2953:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2955:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2965:1: rule__RespuestaUnica__Group__1 : rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2 ;
    public final void rule__RespuestaUnica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2969:1: ( rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2970:2: rule__RespuestaUnica__Group__1__Impl rule__RespuestaUnica__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__1__Impl_in_rule__RespuestaUnica__Group__15874);
            rule__RespuestaUnica__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__2_in_rule__RespuestaUnica__Group__15877);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2977:1: rule__RespuestaUnica__Group__1__Impl : ( 'RespuestaUnica' ) ;
    public final void rule__RespuestaUnica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2981:1: ( ( 'RespuestaUnica' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2982:1: ( 'RespuestaUnica' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2982:1: ( 'RespuestaUnica' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2983:1: 'RespuestaUnica'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__RespuestaUnica__Group__1__Impl5905); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:2996:1: rule__RespuestaUnica__Group__2 : rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3 ;
    public final void rule__RespuestaUnica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3000:1: ( rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3001:2: rule__RespuestaUnica__Group__2__Impl rule__RespuestaUnica__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__2__Impl_in_rule__RespuestaUnica__Group__25936);
            rule__RespuestaUnica__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__3_in_rule__RespuestaUnica__Group__25939);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3008:1: rule__RespuestaUnica__Group__2__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3012:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3013:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3013:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3014:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group__2__Impl5967); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3027:1: rule__RespuestaUnica__Group__3 : rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4 ;
    public final void rule__RespuestaUnica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3031:1: ( rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3032:2: rule__RespuestaUnica__Group__3__Impl rule__RespuestaUnica__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__3__Impl_in_rule__RespuestaUnica__Group__35998);
            rule__RespuestaUnica__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__4_in_rule__RespuestaUnica__Group__36001);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3039:1: rule__RespuestaUnica__Group__3__Impl : ( ( rule__RespuestaUnica__Group_3__0 )? ) ;
    public final void rule__RespuestaUnica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3043:1: ( ( ( rule__RespuestaUnica__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3044:1: ( ( rule__RespuestaUnica__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3044:1: ( ( rule__RespuestaUnica__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3045:1: ( rule__RespuestaUnica__Group_3__0 )?
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3046:1: ( rule__RespuestaUnica__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3046:2: rule__RespuestaUnica__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__0_in_rule__RespuestaUnica__Group__3__Impl6028);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3056:1: rule__RespuestaUnica__Group__4 : rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5 ;
    public final void rule__RespuestaUnica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3060:1: ( rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3061:2: rule__RespuestaUnica__Group__4__Impl rule__RespuestaUnica__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__4__Impl_in_rule__RespuestaUnica__Group__46059);
            rule__RespuestaUnica__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__5_in_rule__RespuestaUnica__Group__46062);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3068:1: rule__RespuestaUnica__Group__4__Impl : ( ( rule__RespuestaUnica__Group_4__0 )? ) ;
    public final void rule__RespuestaUnica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3072:1: ( ( ( rule__RespuestaUnica__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3073:1: ( ( rule__RespuestaUnica__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3073:1: ( ( rule__RespuestaUnica__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3074:1: ( rule__RespuestaUnica__Group_4__0 )?
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3075:1: ( rule__RespuestaUnica__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3075:2: rule__RespuestaUnica__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__0_in_rule__RespuestaUnica__Group__4__Impl6089);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3085:1: rule__RespuestaUnica__Group__5 : rule__RespuestaUnica__Group__5__Impl rule__RespuestaUnica__Group__6 ;
    public final void rule__RespuestaUnica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3089:1: ( rule__RespuestaUnica__Group__5__Impl rule__RespuestaUnica__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3090:2: rule__RespuestaUnica__Group__5__Impl rule__RespuestaUnica__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__5__Impl_in_rule__RespuestaUnica__Group__56120);
            rule__RespuestaUnica__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__6_in_rule__RespuestaUnica__Group__56123);
            rule__RespuestaUnica__Group__6();

            state._fsp--;


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3097:1: rule__RespuestaUnica__Group__5__Impl : ( ( rule__RespuestaUnica__Group_5__0 )? ) ;
    public final void rule__RespuestaUnica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3101:1: ( ( ( rule__RespuestaUnica__Group_5__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3102:1: ( ( rule__RespuestaUnica__Group_5__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3102:1: ( ( rule__RespuestaUnica__Group_5__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3103:1: ( rule__RespuestaUnica__Group_5__0 )?
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3104:1: ( rule__RespuestaUnica__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3104:2: rule__RespuestaUnica__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__0_in_rule__RespuestaUnica__Group__5__Impl6150);
                    rule__RespuestaUnica__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRespuestaUnicaAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RespuestaUnica__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3114:1: rule__RespuestaUnica__Group__6 : rule__RespuestaUnica__Group__6__Impl ;
    public final void rule__RespuestaUnica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3118:1: ( rule__RespuestaUnica__Group__6__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3119:2: rule__RespuestaUnica__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group__6__Impl_in_rule__RespuestaUnica__Group__66181);
            rule__RespuestaUnica__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__6"


    // $ANTLR start "rule__RespuestaUnica__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3125:1: rule__RespuestaUnica__Group__6__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3129:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3130:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3130:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3131:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaUnica__Group__6__Impl6209); 
             after(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group__6__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3158:1: rule__RespuestaUnica__Group_3__0 : rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1 ;
    public final void rule__RespuestaUnica__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3162:1: ( rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3163:2: rule__RespuestaUnica__Group_3__0__Impl rule__RespuestaUnica__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__0__Impl_in_rule__RespuestaUnica__Group_3__06254);
            rule__RespuestaUnica__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__1_in_rule__RespuestaUnica__Group_3__06257);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3170:1: rule__RespuestaUnica__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__RespuestaUnica__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3174:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3175:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3175:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3176:1: 'correctas'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__RespuestaUnica__Group_3__0__Impl6285); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3189:1: rule__RespuestaUnica__Group_3__1 : rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2 ;
    public final void rule__RespuestaUnica__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3193:1: ( rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3194:2: rule__RespuestaUnica__Group_3__1__Impl rule__RespuestaUnica__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__1__Impl_in_rule__RespuestaUnica__Group_3__16316);
            rule__RespuestaUnica__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__2_in_rule__RespuestaUnica__Group_3__16319);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3201:1: rule__RespuestaUnica__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3205:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3206:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3206:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3207:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group_3__1__Impl6347); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3220:1: rule__RespuestaUnica__Group_3__2 : rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3 ;
    public final void rule__RespuestaUnica__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3224:1: ( rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3225:2: rule__RespuestaUnica__Group_3__2__Impl rule__RespuestaUnica__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__2__Impl_in_rule__RespuestaUnica__Group_3__26378);
            rule__RespuestaUnica__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__3_in_rule__RespuestaUnica__Group_3__26381);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3232:1: rule__RespuestaUnica__Group_3__2__Impl : ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) ) ;
    public final void rule__RespuestaUnica__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3236:1: ( ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3237:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3237:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3238:1: ( rule__RespuestaUnica__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3239:1: ( rule__RespuestaUnica__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3239:2: rule__RespuestaUnica__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_2_in_rule__RespuestaUnica__Group_3__2__Impl6408);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3249:1: rule__RespuestaUnica__Group_3__3 : rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4 ;
    public final void rule__RespuestaUnica__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3253:1: ( rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3254:2: rule__RespuestaUnica__Group_3__3__Impl rule__RespuestaUnica__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__3__Impl_in_rule__RespuestaUnica__Group_3__36438);
            rule__RespuestaUnica__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__4_in_rule__RespuestaUnica__Group_3__36441);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3261:1: rule__RespuestaUnica__Group_3__3__Impl : ( ( rule__RespuestaUnica__Group_3_3__0 )* ) ;
    public final void rule__RespuestaUnica__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3265:1: ( ( ( rule__RespuestaUnica__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3266:1: ( ( rule__RespuestaUnica__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3266:1: ( ( rule__RespuestaUnica__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3267:1: ( rule__RespuestaUnica__Group_3_3__0 )*
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3268:1: ( rule__RespuestaUnica__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3268:2: rule__RespuestaUnica__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__0_in_rule__RespuestaUnica__Group_3__3__Impl6468);
            	    rule__RespuestaUnica__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3278:1: rule__RespuestaUnica__Group_3__4 : rule__RespuestaUnica__Group_3__4__Impl ;
    public final void rule__RespuestaUnica__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3282:1: ( rule__RespuestaUnica__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3283:2: rule__RespuestaUnica__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3__4__Impl_in_rule__RespuestaUnica__Group_3__46499);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3289:1: rule__RespuestaUnica__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3293:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3294:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3294:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3295:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaUnica__Group_3__4__Impl6527); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3318:1: rule__RespuestaUnica__Group_3_3__0 : rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1 ;
    public final void rule__RespuestaUnica__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3322:1: ( rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3323:2: rule__RespuestaUnica__Group_3_3__0__Impl rule__RespuestaUnica__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__0__Impl_in_rule__RespuestaUnica__Group_3_3__06568);
            rule__RespuestaUnica__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__1_in_rule__RespuestaUnica__Group_3_3__06571);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3330:1: rule__RespuestaUnica__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaUnica__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3334:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3335:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3335:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3336:1: ','
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaUnica__Group_3_3__0__Impl6599); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3349:1: rule__RespuestaUnica__Group_3_3__1 : rule__RespuestaUnica__Group_3_3__1__Impl ;
    public final void rule__RespuestaUnica__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3353:1: ( rule__RespuestaUnica__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3354:2: rule__RespuestaUnica__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_3_3__1__Impl_in_rule__RespuestaUnica__Group_3_3__16630);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3360:1: rule__RespuestaUnica__Group_3_3__1__Impl : ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__RespuestaUnica__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3364:1: ( ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3365:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3365:1: ( ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3366:1: ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3367:1: ( rule__RespuestaUnica__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3367:2: rule__RespuestaUnica__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_3_1_in_rule__RespuestaUnica__Group_3_3__1__Impl6657);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3381:1: rule__RespuestaUnica__Group_4__0 : rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1 ;
    public final void rule__RespuestaUnica__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3385:1: ( rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3386:2: rule__RespuestaUnica__Group_4__0__Impl rule__RespuestaUnica__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__0__Impl_in_rule__RespuestaUnica__Group_4__06691);
            rule__RespuestaUnica__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__1_in_rule__RespuestaUnica__Group_4__06694);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3393:1: rule__RespuestaUnica__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__RespuestaUnica__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3397:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3398:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3398:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3399:1: 'alternativas'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__RespuestaUnica__Group_4__0__Impl6722); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3412:1: rule__RespuestaUnica__Group_4__1 : rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2 ;
    public final void rule__RespuestaUnica__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3416:1: ( rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3417:2: rule__RespuestaUnica__Group_4__1__Impl rule__RespuestaUnica__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__1__Impl_in_rule__RespuestaUnica__Group_4__16753);
            rule__RespuestaUnica__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__2_in_rule__RespuestaUnica__Group_4__16756);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3424:1: rule__RespuestaUnica__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3428:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3429:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3429:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3430:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group_4__1__Impl6784); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3443:1: rule__RespuestaUnica__Group_4__2 : rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3 ;
    public final void rule__RespuestaUnica__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3447:1: ( rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3448:2: rule__RespuestaUnica__Group_4__2__Impl rule__RespuestaUnica__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__2__Impl_in_rule__RespuestaUnica__Group_4__26815);
            rule__RespuestaUnica__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__3_in_rule__RespuestaUnica__Group_4__26818);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3455:1: rule__RespuestaUnica__Group_4__2__Impl : ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) ) ;
    public final void rule__RespuestaUnica__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3459:1: ( ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3460:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3460:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3461:1: ( rule__RespuestaUnica__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3462:1: ( rule__RespuestaUnica__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3462:2: rule__RespuestaUnica__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_2_in_rule__RespuestaUnica__Group_4__2__Impl6845);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3472:1: rule__RespuestaUnica__Group_4__3 : rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4 ;
    public final void rule__RespuestaUnica__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3476:1: ( rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3477:2: rule__RespuestaUnica__Group_4__3__Impl rule__RespuestaUnica__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__3__Impl_in_rule__RespuestaUnica__Group_4__36875);
            rule__RespuestaUnica__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__4_in_rule__RespuestaUnica__Group_4__36878);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3484:1: rule__RespuestaUnica__Group_4__3__Impl : ( ( rule__RespuestaUnica__Group_4_3__0 )* ) ;
    public final void rule__RespuestaUnica__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3488:1: ( ( ( rule__RespuestaUnica__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3489:1: ( ( rule__RespuestaUnica__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3489:1: ( ( rule__RespuestaUnica__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3490:1: ( rule__RespuestaUnica__Group_4_3__0 )*
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3491:1: ( rule__RespuestaUnica__Group_4_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3491:2: rule__RespuestaUnica__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__0_in_rule__RespuestaUnica__Group_4__3__Impl6905);
            	    rule__RespuestaUnica__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3501:1: rule__RespuestaUnica__Group_4__4 : rule__RespuestaUnica__Group_4__4__Impl ;
    public final void rule__RespuestaUnica__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3505:1: ( rule__RespuestaUnica__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3506:2: rule__RespuestaUnica__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4__4__Impl_in_rule__RespuestaUnica__Group_4__46936);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3512:1: rule__RespuestaUnica__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3516:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3517:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3517:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3518:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaUnica__Group_4__4__Impl6964); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3541:1: rule__RespuestaUnica__Group_4_3__0 : rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1 ;
    public final void rule__RespuestaUnica__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3545:1: ( rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3546:2: rule__RespuestaUnica__Group_4_3__0__Impl rule__RespuestaUnica__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__0__Impl_in_rule__RespuestaUnica__Group_4_3__07005);
            rule__RespuestaUnica__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__1_in_rule__RespuestaUnica__Group_4_3__07008);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3553:1: rule__RespuestaUnica__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaUnica__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3557:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3558:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3558:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3559:1: ','
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaUnica__Group_4_3__0__Impl7036); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3572:1: rule__RespuestaUnica__Group_4_3__1 : rule__RespuestaUnica__Group_4_3__1__Impl ;
    public final void rule__RespuestaUnica__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3576:1: ( rule__RespuestaUnica__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3577:2: rule__RespuestaUnica__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_4_3__1__Impl_in_rule__RespuestaUnica__Group_4_3__17067);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3583:1: rule__RespuestaUnica__Group_4_3__1__Impl : ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__RespuestaUnica__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3587:1: ( ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3588:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3588:1: ( ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3589:1: ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3590:1: ( rule__RespuestaUnica__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3590:2: rule__RespuestaUnica__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_3_1_in_rule__RespuestaUnica__Group_4_3__1__Impl7094);
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


    // $ANTLR start "rule__RespuestaUnica__Group_5__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3604:1: rule__RespuestaUnica__Group_5__0 : rule__RespuestaUnica__Group_5__0__Impl rule__RespuestaUnica__Group_5__1 ;
    public final void rule__RespuestaUnica__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3608:1: ( rule__RespuestaUnica__Group_5__0__Impl rule__RespuestaUnica__Group_5__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3609:2: rule__RespuestaUnica__Group_5__0__Impl rule__RespuestaUnica__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__0__Impl_in_rule__RespuestaUnica__Group_5__07128);
            rule__RespuestaUnica__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__1_in_rule__RespuestaUnica__Group_5__07131);
            rule__RespuestaUnica__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__0"


    // $ANTLR start "rule__RespuestaUnica__Group_5__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3616:1: rule__RespuestaUnica__Group_5__0__Impl : ( 'seleccionadas' ) ;
    public final void rule__RespuestaUnica__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3620:1: ( ( 'seleccionadas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3621:1: ( 'seleccionadas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3621:1: ( 'seleccionadas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3622:1: 'seleccionadas'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__RespuestaUnica__Group_5__0__Impl7159); 
             after(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__0__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_5__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3635:1: rule__RespuestaUnica__Group_5__1 : rule__RespuestaUnica__Group_5__1__Impl rule__RespuestaUnica__Group_5__2 ;
    public final void rule__RespuestaUnica__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3639:1: ( rule__RespuestaUnica__Group_5__1__Impl rule__RespuestaUnica__Group_5__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3640:2: rule__RespuestaUnica__Group_5__1__Impl rule__RespuestaUnica__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__1__Impl_in_rule__RespuestaUnica__Group_5__17190);
            rule__RespuestaUnica__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__2_in_rule__RespuestaUnica__Group_5__17193);
            rule__RespuestaUnica__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__1"


    // $ANTLR start "rule__RespuestaUnica__Group_5__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3647:1: rule__RespuestaUnica__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RespuestaUnica__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3651:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3652:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3652:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3653:1: '{'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaUnica__Group_5__1__Impl7221); 
             after(grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__1__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_5__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3666:1: rule__RespuestaUnica__Group_5__2 : rule__RespuestaUnica__Group_5__2__Impl rule__RespuestaUnica__Group_5__3 ;
    public final void rule__RespuestaUnica__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3670:1: ( rule__RespuestaUnica__Group_5__2__Impl rule__RespuestaUnica__Group_5__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3671:2: rule__RespuestaUnica__Group_5__2__Impl rule__RespuestaUnica__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__2__Impl_in_rule__RespuestaUnica__Group_5__27252);
            rule__RespuestaUnica__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__3_in_rule__RespuestaUnica__Group_5__27255);
            rule__RespuestaUnica__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__2"


    // $ANTLR start "rule__RespuestaUnica__Group_5__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3678:1: rule__RespuestaUnica__Group_5__2__Impl : ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_2 ) ) ;
    public final void rule__RespuestaUnica__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3682:1: ( ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3683:1: ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3683:1: ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3684:1: ( rule__RespuestaUnica__SeleccionadasAssignment_5_2 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasAssignment_5_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3685:1: ( rule__RespuestaUnica__SeleccionadasAssignment_5_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3685:2: rule__RespuestaUnica__SeleccionadasAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__SeleccionadasAssignment_5_2_in_rule__RespuestaUnica__Group_5__2__Impl7282);
            rule__RespuestaUnica__SeleccionadasAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__2__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_5__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3695:1: rule__RespuestaUnica__Group_5__3 : rule__RespuestaUnica__Group_5__3__Impl rule__RespuestaUnica__Group_5__4 ;
    public final void rule__RespuestaUnica__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3699:1: ( rule__RespuestaUnica__Group_5__3__Impl rule__RespuestaUnica__Group_5__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3700:2: rule__RespuestaUnica__Group_5__3__Impl rule__RespuestaUnica__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__3__Impl_in_rule__RespuestaUnica__Group_5__37312);
            rule__RespuestaUnica__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__4_in_rule__RespuestaUnica__Group_5__37315);
            rule__RespuestaUnica__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__3"


    // $ANTLR start "rule__RespuestaUnica__Group_5__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3707:1: rule__RespuestaUnica__Group_5__3__Impl : ( ( rule__RespuestaUnica__Group_5_3__0 )* ) ;
    public final void rule__RespuestaUnica__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3711:1: ( ( ( rule__RespuestaUnica__Group_5_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3712:1: ( ( rule__RespuestaUnica__Group_5_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3712:1: ( ( rule__RespuestaUnica__Group_5_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3713:1: ( rule__RespuestaUnica__Group_5_3__0 )*
            {
             before(grammarAccess.getRespuestaUnicaAccess().getGroup_5_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3714:1: ( rule__RespuestaUnica__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3714:2: rule__RespuestaUnica__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5_3__0_in_rule__RespuestaUnica__Group_5__3__Impl7342);
            	    rule__RespuestaUnica__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRespuestaUnicaAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__3__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_5__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3724:1: rule__RespuestaUnica__Group_5__4 : rule__RespuestaUnica__Group_5__4__Impl ;
    public final void rule__RespuestaUnica__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3728:1: ( rule__RespuestaUnica__Group_5__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3729:2: rule__RespuestaUnica__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5__4__Impl_in_rule__RespuestaUnica__Group_5__47373);
            rule__RespuestaUnica__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__4"


    // $ANTLR start "rule__RespuestaUnica__Group_5__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3735:1: rule__RespuestaUnica__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RespuestaUnica__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3739:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3740:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3740:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3741:1: '}'
            {
             before(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaUnica__Group_5__4__Impl7401); 
             after(grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5__4__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_5_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3764:1: rule__RespuestaUnica__Group_5_3__0 : rule__RespuestaUnica__Group_5_3__0__Impl rule__RespuestaUnica__Group_5_3__1 ;
    public final void rule__RespuestaUnica__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3768:1: ( rule__RespuestaUnica__Group_5_3__0__Impl rule__RespuestaUnica__Group_5_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3769:2: rule__RespuestaUnica__Group_5_3__0__Impl rule__RespuestaUnica__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5_3__0__Impl_in_rule__RespuestaUnica__Group_5_3__07442);
            rule__RespuestaUnica__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5_3__1_in_rule__RespuestaUnica__Group_5_3__07445);
            rule__RespuestaUnica__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5_3__0"


    // $ANTLR start "rule__RespuestaUnica__Group_5_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3776:1: rule__RespuestaUnica__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaUnica__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3780:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3781:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3781:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3782:1: ','
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaUnica__Group_5_3__0__Impl7473); 
             after(grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5_3__0__Impl"


    // $ANTLR start "rule__RespuestaUnica__Group_5_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3795:1: rule__RespuestaUnica__Group_5_3__1 : rule__RespuestaUnica__Group_5_3__1__Impl ;
    public final void rule__RespuestaUnica__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3799:1: ( rule__RespuestaUnica__Group_5_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3800:2: rule__RespuestaUnica__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__Group_5_3__1__Impl_in_rule__RespuestaUnica__Group_5_3__17504);
            rule__RespuestaUnica__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5_3__1"


    // $ANTLR start "rule__RespuestaUnica__Group_5_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3806:1: rule__RespuestaUnica__Group_5_3__1__Impl : ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_3_1 ) ) ;
    public final void rule__RespuestaUnica__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3810:1: ( ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3811:1: ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3811:1: ( ( rule__RespuestaUnica__SeleccionadasAssignment_5_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3812:1: ( rule__RespuestaUnica__SeleccionadasAssignment_5_3_1 )
            {
             before(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasAssignment_5_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3813:1: ( rule__RespuestaUnica__SeleccionadasAssignment_5_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3813:2: rule__RespuestaUnica__SeleccionadasAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaUnica__SeleccionadasAssignment_5_3_1_in_rule__RespuestaUnica__Group_5_3__1__Impl7531);
            rule__RespuestaUnica__SeleccionadasAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__Group_5_3__1__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3827:1: rule__RespuestaMultiple__Group__0 : rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1 ;
    public final void rule__RespuestaMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3831:1: ( rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3832:2: rule__RespuestaMultiple__Group__0__Impl rule__RespuestaMultiple__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__0__Impl_in_rule__RespuestaMultiple__Group__07565);
            rule__RespuestaMultiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__1_in_rule__RespuestaMultiple__Group__07568);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3839:1: rule__RespuestaMultiple__Group__0__Impl : ( () ) ;
    public final void rule__RespuestaMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3843:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3844:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3844:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3845:1: ()
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3846:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3848:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3858:1: rule__RespuestaMultiple__Group__1 : rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2 ;
    public final void rule__RespuestaMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3862:1: ( rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3863:2: rule__RespuestaMultiple__Group__1__Impl rule__RespuestaMultiple__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__1__Impl_in_rule__RespuestaMultiple__Group__17626);
            rule__RespuestaMultiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__2_in_rule__RespuestaMultiple__Group__17629);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3870:1: rule__RespuestaMultiple__Group__1__Impl : ( 'RespuestaMultiple' ) ;
    public final void rule__RespuestaMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3874:1: ( ( 'RespuestaMultiple' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3875:1: ( 'RespuestaMultiple' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3875:1: ( 'RespuestaMultiple' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3876:1: 'RespuestaMultiple'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__RespuestaMultiple__Group__1__Impl7657); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3889:1: rule__RespuestaMultiple__Group__2 : rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3 ;
    public final void rule__RespuestaMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3893:1: ( rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3894:2: rule__RespuestaMultiple__Group__2__Impl rule__RespuestaMultiple__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__2__Impl_in_rule__RespuestaMultiple__Group__27688);
            rule__RespuestaMultiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__3_in_rule__RespuestaMultiple__Group__27691);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3901:1: rule__RespuestaMultiple__Group__2__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3905:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3906:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3906:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3907:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group__2__Impl7719); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3920:1: rule__RespuestaMultiple__Group__3 : rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4 ;
    public final void rule__RespuestaMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3924:1: ( rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3925:2: rule__RespuestaMultiple__Group__3__Impl rule__RespuestaMultiple__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__3__Impl_in_rule__RespuestaMultiple__Group__37750);
            rule__RespuestaMultiple__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__4_in_rule__RespuestaMultiple__Group__37753);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3932:1: rule__RespuestaMultiple__Group__3__Impl : ( ( rule__RespuestaMultiple__Group_3__0 )? ) ;
    public final void rule__RespuestaMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3936:1: ( ( ( rule__RespuestaMultiple__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3937:1: ( ( rule__RespuestaMultiple__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3937:1: ( ( rule__RespuestaMultiple__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3938:1: ( rule__RespuestaMultiple__Group_3__0 )?
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3939:1: ( rule__RespuestaMultiple__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3939:2: rule__RespuestaMultiple__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__0_in_rule__RespuestaMultiple__Group__3__Impl7780);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3949:1: rule__RespuestaMultiple__Group__4 : rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5 ;
    public final void rule__RespuestaMultiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3953:1: ( rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3954:2: rule__RespuestaMultiple__Group__4__Impl rule__RespuestaMultiple__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__4__Impl_in_rule__RespuestaMultiple__Group__47811);
            rule__RespuestaMultiple__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__5_in_rule__RespuestaMultiple__Group__47814);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3961:1: rule__RespuestaMultiple__Group__4__Impl : ( ( rule__RespuestaMultiple__Group_4__0 )? ) ;
    public final void rule__RespuestaMultiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3965:1: ( ( ( rule__RespuestaMultiple__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3966:1: ( ( rule__RespuestaMultiple__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3966:1: ( ( rule__RespuestaMultiple__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3967:1: ( rule__RespuestaMultiple__Group_4__0 )?
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3968:1: ( rule__RespuestaMultiple__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3968:2: rule__RespuestaMultiple__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__0_in_rule__RespuestaMultiple__Group__4__Impl7841);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3978:1: rule__RespuestaMultiple__Group__5 : rule__RespuestaMultiple__Group__5__Impl rule__RespuestaMultiple__Group__6 ;
    public final void rule__RespuestaMultiple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3982:1: ( rule__RespuestaMultiple__Group__5__Impl rule__RespuestaMultiple__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3983:2: rule__RespuestaMultiple__Group__5__Impl rule__RespuestaMultiple__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__5__Impl_in_rule__RespuestaMultiple__Group__57872);
            rule__RespuestaMultiple__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__6_in_rule__RespuestaMultiple__Group__57875);
            rule__RespuestaMultiple__Group__6();

            state._fsp--;


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3990:1: rule__RespuestaMultiple__Group__5__Impl : ( ( rule__RespuestaMultiple__Group_5__0 )? ) ;
    public final void rule__RespuestaMultiple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3994:1: ( ( ( rule__RespuestaMultiple__Group_5__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3995:1: ( ( rule__RespuestaMultiple__Group_5__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3995:1: ( ( rule__RespuestaMultiple__Group_5__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3996:1: ( rule__RespuestaMultiple__Group_5__0 )?
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3997:1: ( rule__RespuestaMultiple__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:3997:2: rule__RespuestaMultiple__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__0_in_rule__RespuestaMultiple__Group__5__Impl7902);
                    rule__RespuestaMultiple__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRespuestaMultipleAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RespuestaMultiple__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4007:1: rule__RespuestaMultiple__Group__6 : rule__RespuestaMultiple__Group__6__Impl ;
    public final void rule__RespuestaMultiple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4011:1: ( rule__RespuestaMultiple__Group__6__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4012:2: rule__RespuestaMultiple__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group__6__Impl_in_rule__RespuestaMultiple__Group__67933);
            rule__RespuestaMultiple__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__6"


    // $ANTLR start "rule__RespuestaMultiple__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4018:1: rule__RespuestaMultiple__Group__6__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4022:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4023:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4023:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4024:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaMultiple__Group__6__Impl7961); 
             after(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group__6__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4051:1: rule__RespuestaMultiple__Group_3__0 : rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1 ;
    public final void rule__RespuestaMultiple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4055:1: ( rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4056:2: rule__RespuestaMultiple__Group_3__0__Impl rule__RespuestaMultiple__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__0__Impl_in_rule__RespuestaMultiple__Group_3__08006);
            rule__RespuestaMultiple__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__1_in_rule__RespuestaMultiple__Group_3__08009);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4063:1: rule__RespuestaMultiple__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__RespuestaMultiple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4067:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4068:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4068:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4069:1: 'correctas'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__RespuestaMultiple__Group_3__0__Impl8037); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4082:1: rule__RespuestaMultiple__Group_3__1 : rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2 ;
    public final void rule__RespuestaMultiple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4086:1: ( rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4087:2: rule__RespuestaMultiple__Group_3__1__Impl rule__RespuestaMultiple__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__1__Impl_in_rule__RespuestaMultiple__Group_3__18068);
            rule__RespuestaMultiple__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__2_in_rule__RespuestaMultiple__Group_3__18071);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4094:1: rule__RespuestaMultiple__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4098:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4099:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4099:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4100:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group_3__1__Impl8099); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4113:1: rule__RespuestaMultiple__Group_3__2 : rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3 ;
    public final void rule__RespuestaMultiple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4117:1: ( rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4118:2: rule__RespuestaMultiple__Group_3__2__Impl rule__RespuestaMultiple__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__2__Impl_in_rule__RespuestaMultiple__Group_3__28130);
            rule__RespuestaMultiple__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__3_in_rule__RespuestaMultiple__Group_3__28133);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4125:1: rule__RespuestaMultiple__Group_3__2__Impl : ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) ) ;
    public final void rule__RespuestaMultiple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4129:1: ( ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4130:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4130:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4131:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4132:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4132:2: rule__RespuestaMultiple__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_2_in_rule__RespuestaMultiple__Group_3__2__Impl8160);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4142:1: rule__RespuestaMultiple__Group_3__3 : rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4 ;
    public final void rule__RespuestaMultiple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4146:1: ( rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4147:2: rule__RespuestaMultiple__Group_3__3__Impl rule__RespuestaMultiple__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__3__Impl_in_rule__RespuestaMultiple__Group_3__38190);
            rule__RespuestaMultiple__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__4_in_rule__RespuestaMultiple__Group_3__38193);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4154:1: rule__RespuestaMultiple__Group_3__3__Impl : ( ( rule__RespuestaMultiple__Group_3_3__0 )* ) ;
    public final void rule__RespuestaMultiple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4158:1: ( ( ( rule__RespuestaMultiple__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4159:1: ( ( rule__RespuestaMultiple__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4159:1: ( ( rule__RespuestaMultiple__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4160:1: ( rule__RespuestaMultiple__Group_3_3__0 )*
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4161:1: ( rule__RespuestaMultiple__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4161:2: rule__RespuestaMultiple__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__0_in_rule__RespuestaMultiple__Group_3__3__Impl8220);
            	    rule__RespuestaMultiple__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4171:1: rule__RespuestaMultiple__Group_3__4 : rule__RespuestaMultiple__Group_3__4__Impl ;
    public final void rule__RespuestaMultiple__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4175:1: ( rule__RespuestaMultiple__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4176:2: rule__RespuestaMultiple__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3__4__Impl_in_rule__RespuestaMultiple__Group_3__48251);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4182:1: rule__RespuestaMultiple__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4186:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4187:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4187:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4188:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaMultiple__Group_3__4__Impl8279); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4211:1: rule__RespuestaMultiple__Group_3_3__0 : rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1 ;
    public final void rule__RespuestaMultiple__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4215:1: ( rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4216:2: rule__RespuestaMultiple__Group_3_3__0__Impl rule__RespuestaMultiple__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__0__Impl_in_rule__RespuestaMultiple__Group_3_3__08320);
            rule__RespuestaMultiple__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__1_in_rule__RespuestaMultiple__Group_3_3__08323);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4223:1: rule__RespuestaMultiple__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaMultiple__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4227:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4228:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4228:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4229:1: ','
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaMultiple__Group_3_3__0__Impl8351); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4242:1: rule__RespuestaMultiple__Group_3_3__1 : rule__RespuestaMultiple__Group_3_3__1__Impl ;
    public final void rule__RespuestaMultiple__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4246:1: ( rule__RespuestaMultiple__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4247:2: rule__RespuestaMultiple__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_3_3__1__Impl_in_rule__RespuestaMultiple__Group_3_3__18382);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4253:1: rule__RespuestaMultiple__Group_3_3__1__Impl : ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__RespuestaMultiple__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4257:1: ( ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4258:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4258:1: ( ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4259:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4260:1: ( rule__RespuestaMultiple__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4260:2: rule__RespuestaMultiple__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_3_1_in_rule__RespuestaMultiple__Group_3_3__1__Impl8409);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4274:1: rule__RespuestaMultiple__Group_4__0 : rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1 ;
    public final void rule__RespuestaMultiple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4278:1: ( rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4279:2: rule__RespuestaMultiple__Group_4__0__Impl rule__RespuestaMultiple__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__0__Impl_in_rule__RespuestaMultiple__Group_4__08443);
            rule__RespuestaMultiple__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__1_in_rule__RespuestaMultiple__Group_4__08446);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4286:1: rule__RespuestaMultiple__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__RespuestaMultiple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4290:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4291:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4291:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4292:1: 'alternativas'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__RespuestaMultiple__Group_4__0__Impl8474); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4305:1: rule__RespuestaMultiple__Group_4__1 : rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2 ;
    public final void rule__RespuestaMultiple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4309:1: ( rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4310:2: rule__RespuestaMultiple__Group_4__1__Impl rule__RespuestaMultiple__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__1__Impl_in_rule__RespuestaMultiple__Group_4__18505);
            rule__RespuestaMultiple__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__2_in_rule__RespuestaMultiple__Group_4__18508);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4317:1: rule__RespuestaMultiple__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4321:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4322:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4322:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4323:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group_4__1__Impl8536); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4336:1: rule__RespuestaMultiple__Group_4__2 : rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3 ;
    public final void rule__RespuestaMultiple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4340:1: ( rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4341:2: rule__RespuestaMultiple__Group_4__2__Impl rule__RespuestaMultiple__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__2__Impl_in_rule__RespuestaMultiple__Group_4__28567);
            rule__RespuestaMultiple__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__3_in_rule__RespuestaMultiple__Group_4__28570);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4348:1: rule__RespuestaMultiple__Group_4__2__Impl : ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) ) ;
    public final void rule__RespuestaMultiple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4352:1: ( ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4353:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4353:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4354:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4355:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4355:2: rule__RespuestaMultiple__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_2_in_rule__RespuestaMultiple__Group_4__2__Impl8597);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4365:1: rule__RespuestaMultiple__Group_4__3 : rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4 ;
    public final void rule__RespuestaMultiple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4369:1: ( rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4370:2: rule__RespuestaMultiple__Group_4__3__Impl rule__RespuestaMultiple__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__3__Impl_in_rule__RespuestaMultiple__Group_4__38627);
            rule__RespuestaMultiple__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__4_in_rule__RespuestaMultiple__Group_4__38630);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4377:1: rule__RespuestaMultiple__Group_4__3__Impl : ( ( rule__RespuestaMultiple__Group_4_3__0 )* ) ;
    public final void rule__RespuestaMultiple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4381:1: ( ( ( rule__RespuestaMultiple__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4382:1: ( ( rule__RespuestaMultiple__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4382:1: ( ( rule__RespuestaMultiple__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4383:1: ( rule__RespuestaMultiple__Group_4_3__0 )*
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4384:1: ( rule__RespuestaMultiple__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==27) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4384:2: rule__RespuestaMultiple__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__0_in_rule__RespuestaMultiple__Group_4__3__Impl8657);
            	    rule__RespuestaMultiple__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4394:1: rule__RespuestaMultiple__Group_4__4 : rule__RespuestaMultiple__Group_4__4__Impl ;
    public final void rule__RespuestaMultiple__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4398:1: ( rule__RespuestaMultiple__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4399:2: rule__RespuestaMultiple__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4__4__Impl_in_rule__RespuestaMultiple__Group_4__48688);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4405:1: rule__RespuestaMultiple__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4409:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4410:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4410:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4411:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaMultiple__Group_4__4__Impl8716); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4434:1: rule__RespuestaMultiple__Group_4_3__0 : rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1 ;
    public final void rule__RespuestaMultiple__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4438:1: ( rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4439:2: rule__RespuestaMultiple__Group_4_3__0__Impl rule__RespuestaMultiple__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__0__Impl_in_rule__RespuestaMultiple__Group_4_3__08757);
            rule__RespuestaMultiple__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__1_in_rule__RespuestaMultiple__Group_4_3__08760);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4446:1: rule__RespuestaMultiple__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaMultiple__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4450:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4451:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4451:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4452:1: ','
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaMultiple__Group_4_3__0__Impl8788); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4465:1: rule__RespuestaMultiple__Group_4_3__1 : rule__RespuestaMultiple__Group_4_3__1__Impl ;
    public final void rule__RespuestaMultiple__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4469:1: ( rule__RespuestaMultiple__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4470:2: rule__RespuestaMultiple__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_4_3__1__Impl_in_rule__RespuestaMultiple__Group_4_3__18819);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4476:1: rule__RespuestaMultiple__Group_4_3__1__Impl : ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__RespuestaMultiple__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4480:1: ( ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4481:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4481:1: ( ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4482:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4483:1: ( rule__RespuestaMultiple__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4483:2: rule__RespuestaMultiple__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_3_1_in_rule__RespuestaMultiple__Group_4_3__1__Impl8846);
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


    // $ANTLR start "rule__RespuestaMultiple__Group_5__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4497:1: rule__RespuestaMultiple__Group_5__0 : rule__RespuestaMultiple__Group_5__0__Impl rule__RespuestaMultiple__Group_5__1 ;
    public final void rule__RespuestaMultiple__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4501:1: ( rule__RespuestaMultiple__Group_5__0__Impl rule__RespuestaMultiple__Group_5__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4502:2: rule__RespuestaMultiple__Group_5__0__Impl rule__RespuestaMultiple__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__0__Impl_in_rule__RespuestaMultiple__Group_5__08880);
            rule__RespuestaMultiple__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__1_in_rule__RespuestaMultiple__Group_5__08883);
            rule__RespuestaMultiple__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__0"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4509:1: rule__RespuestaMultiple__Group_5__0__Impl : ( 'seleccionadas' ) ;
    public final void rule__RespuestaMultiple__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4513:1: ( ( 'seleccionadas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4514:1: ( 'seleccionadas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4514:1: ( 'seleccionadas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4515:1: 'seleccionadas'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__RespuestaMultiple__Group_5__0__Impl8911); 
             after(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__0__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4528:1: rule__RespuestaMultiple__Group_5__1 : rule__RespuestaMultiple__Group_5__1__Impl rule__RespuestaMultiple__Group_5__2 ;
    public final void rule__RespuestaMultiple__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4532:1: ( rule__RespuestaMultiple__Group_5__1__Impl rule__RespuestaMultiple__Group_5__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4533:2: rule__RespuestaMultiple__Group_5__1__Impl rule__RespuestaMultiple__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__1__Impl_in_rule__RespuestaMultiple__Group_5__18942);
            rule__RespuestaMultiple__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__2_in_rule__RespuestaMultiple__Group_5__18945);
            rule__RespuestaMultiple__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__1"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4540:1: rule__RespuestaMultiple__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RespuestaMultiple__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4544:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4545:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4545:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4546:1: '{'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RespuestaMultiple__Group_5__1__Impl8973); 
             after(grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__1__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4559:1: rule__RespuestaMultiple__Group_5__2 : rule__RespuestaMultiple__Group_5__2__Impl rule__RespuestaMultiple__Group_5__3 ;
    public final void rule__RespuestaMultiple__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4563:1: ( rule__RespuestaMultiple__Group_5__2__Impl rule__RespuestaMultiple__Group_5__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4564:2: rule__RespuestaMultiple__Group_5__2__Impl rule__RespuestaMultiple__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__2__Impl_in_rule__RespuestaMultiple__Group_5__29004);
            rule__RespuestaMultiple__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__3_in_rule__RespuestaMultiple__Group_5__29007);
            rule__RespuestaMultiple__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__2"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4571:1: rule__RespuestaMultiple__Group_5__2__Impl : ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_2 ) ) ;
    public final void rule__RespuestaMultiple__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4575:1: ( ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4576:1: ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4576:1: ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4577:1: ( rule__RespuestaMultiple__SeleccionadasAssignment_5_2 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasAssignment_5_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4578:1: ( rule__RespuestaMultiple__SeleccionadasAssignment_5_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4578:2: rule__RespuestaMultiple__SeleccionadasAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__SeleccionadasAssignment_5_2_in_rule__RespuestaMultiple__Group_5__2__Impl9034);
            rule__RespuestaMultiple__SeleccionadasAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__2__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4588:1: rule__RespuestaMultiple__Group_5__3 : rule__RespuestaMultiple__Group_5__3__Impl rule__RespuestaMultiple__Group_5__4 ;
    public final void rule__RespuestaMultiple__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4592:1: ( rule__RespuestaMultiple__Group_5__3__Impl rule__RespuestaMultiple__Group_5__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4593:2: rule__RespuestaMultiple__Group_5__3__Impl rule__RespuestaMultiple__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__3__Impl_in_rule__RespuestaMultiple__Group_5__39064);
            rule__RespuestaMultiple__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__4_in_rule__RespuestaMultiple__Group_5__39067);
            rule__RespuestaMultiple__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__3"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4600:1: rule__RespuestaMultiple__Group_5__3__Impl : ( ( rule__RespuestaMultiple__Group_5_3__0 )* ) ;
    public final void rule__RespuestaMultiple__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4604:1: ( ( ( rule__RespuestaMultiple__Group_5_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4605:1: ( ( rule__RespuestaMultiple__Group_5_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4605:1: ( ( rule__RespuestaMultiple__Group_5_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4606:1: ( rule__RespuestaMultiple__Group_5_3__0 )*
            {
             before(grammarAccess.getRespuestaMultipleAccess().getGroup_5_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4607:1: ( rule__RespuestaMultiple__Group_5_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4607:2: rule__RespuestaMultiple__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5_3__0_in_rule__RespuestaMultiple__Group_5__3__Impl9094);
            	    rule__RespuestaMultiple__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRespuestaMultipleAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__3__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4617:1: rule__RespuestaMultiple__Group_5__4 : rule__RespuestaMultiple__Group_5__4__Impl ;
    public final void rule__RespuestaMultiple__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4621:1: ( rule__RespuestaMultiple__Group_5__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4622:2: rule__RespuestaMultiple__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5__4__Impl_in_rule__RespuestaMultiple__Group_5__49125);
            rule__RespuestaMultiple__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__4"


    // $ANTLR start "rule__RespuestaMultiple__Group_5__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4628:1: rule__RespuestaMultiple__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RespuestaMultiple__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4632:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4633:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4633:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4634:1: '}'
            {
             before(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RespuestaMultiple__Group_5__4__Impl9153); 
             after(grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5__4__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_5_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4657:1: rule__RespuestaMultiple__Group_5_3__0 : rule__RespuestaMultiple__Group_5_3__0__Impl rule__RespuestaMultiple__Group_5_3__1 ;
    public final void rule__RespuestaMultiple__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4661:1: ( rule__RespuestaMultiple__Group_5_3__0__Impl rule__RespuestaMultiple__Group_5_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4662:2: rule__RespuestaMultiple__Group_5_3__0__Impl rule__RespuestaMultiple__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5_3__0__Impl_in_rule__RespuestaMultiple__Group_5_3__09194);
            rule__RespuestaMultiple__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5_3__1_in_rule__RespuestaMultiple__Group_5_3__09197);
            rule__RespuestaMultiple__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5_3__0"


    // $ANTLR start "rule__RespuestaMultiple__Group_5_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4669:1: rule__RespuestaMultiple__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RespuestaMultiple__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4673:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4674:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4674:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4675:1: ','
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RespuestaMultiple__Group_5_3__0__Impl9225); 
             after(grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5_3__0__Impl"


    // $ANTLR start "rule__RespuestaMultiple__Group_5_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4688:1: rule__RespuestaMultiple__Group_5_3__1 : rule__RespuestaMultiple__Group_5_3__1__Impl ;
    public final void rule__RespuestaMultiple__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4692:1: ( rule__RespuestaMultiple__Group_5_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4693:2: rule__RespuestaMultiple__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__Group_5_3__1__Impl_in_rule__RespuestaMultiple__Group_5_3__19256);
            rule__RespuestaMultiple__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5_3__1"


    // $ANTLR start "rule__RespuestaMultiple__Group_5_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4699:1: rule__RespuestaMultiple__Group_5_3__1__Impl : ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1 ) ) ;
    public final void rule__RespuestaMultiple__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4703:1: ( ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4704:1: ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4704:1: ( ( rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4705:1: ( rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1 )
            {
             before(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasAssignment_5_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4706:1: ( rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4706:2: rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1_in_rule__RespuestaMultiple__Group_5_3__1__Impl9283);
            rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__Group_5_3__1__Impl"


    // $ANTLR start "rule__TextoLibre__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4720:1: rule__TextoLibre__Group__0 : rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1 ;
    public final void rule__TextoLibre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4724:1: ( rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4725:2: rule__TextoLibre__Group__0__Impl rule__TextoLibre__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__0__Impl_in_rule__TextoLibre__Group__09317);
            rule__TextoLibre__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__1_in_rule__TextoLibre__Group__09320);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4732:1: rule__TextoLibre__Group__0__Impl : ( () ) ;
    public final void rule__TextoLibre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4736:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4737:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4737:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4738:1: ()
            {
             before(grammarAccess.getTextoLibreAccess().getTextoLibreAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4739:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4741:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4751:1: rule__TextoLibre__Group__1 : rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2 ;
    public final void rule__TextoLibre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4755:1: ( rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4756:2: rule__TextoLibre__Group__1__Impl rule__TextoLibre__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__1__Impl_in_rule__TextoLibre__Group__19378);
            rule__TextoLibre__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__2_in_rule__TextoLibre__Group__19381);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4763:1: rule__TextoLibre__Group__1__Impl : ( 'TextoLibre' ) ;
    public final void rule__TextoLibre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4767:1: ( ( 'TextoLibre' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4768:1: ( 'TextoLibre' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4768:1: ( 'TextoLibre' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4769:1: 'TextoLibre'
            {
             before(grammarAccess.getTextoLibreAccess().getTextoLibreKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__TextoLibre__Group__1__Impl9409); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4782:1: rule__TextoLibre__Group__2 : rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3 ;
    public final void rule__TextoLibre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4786:1: ( rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4787:2: rule__TextoLibre__Group__2__Impl rule__TextoLibre__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__2__Impl_in_rule__TextoLibre__Group__29440);
            rule__TextoLibre__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__3_in_rule__TextoLibre__Group__29443);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4794:1: rule__TextoLibre__Group__2__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4798:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4799:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4799:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4800:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group__2__Impl9471); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4813:1: rule__TextoLibre__Group__3 : rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4 ;
    public final void rule__TextoLibre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4817:1: ( rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4818:2: rule__TextoLibre__Group__3__Impl rule__TextoLibre__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__3__Impl_in_rule__TextoLibre__Group__39502);
            rule__TextoLibre__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__4_in_rule__TextoLibre__Group__39505);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4825:1: rule__TextoLibre__Group__3__Impl : ( ( rule__TextoLibre__Group_3__0 )? ) ;
    public final void rule__TextoLibre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4829:1: ( ( ( rule__TextoLibre__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4830:1: ( ( rule__TextoLibre__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4830:1: ( ( rule__TextoLibre__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4831:1: ( rule__TextoLibre__Group_3__0 )?
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4832:1: ( rule__TextoLibre__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4832:2: rule__TextoLibre__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__0_in_rule__TextoLibre__Group__3__Impl9532);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4842:1: rule__TextoLibre__Group__4 : rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5 ;
    public final void rule__TextoLibre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4846:1: ( rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4847:2: rule__TextoLibre__Group__4__Impl rule__TextoLibre__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__4__Impl_in_rule__TextoLibre__Group__49563);
            rule__TextoLibre__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__5_in_rule__TextoLibre__Group__49566);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4854:1: rule__TextoLibre__Group__4__Impl : ( ( rule__TextoLibre__Group_4__0 )? ) ;
    public final void rule__TextoLibre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4858:1: ( ( ( rule__TextoLibre__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4859:1: ( ( rule__TextoLibre__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4859:1: ( ( rule__TextoLibre__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4860:1: ( rule__TextoLibre__Group_4__0 )?
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4861:1: ( rule__TextoLibre__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4861:2: rule__TextoLibre__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__0_in_rule__TextoLibre__Group__4__Impl9593);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4871:1: rule__TextoLibre__Group__5 : rule__TextoLibre__Group__5__Impl rule__TextoLibre__Group__6 ;
    public final void rule__TextoLibre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4875:1: ( rule__TextoLibre__Group__5__Impl rule__TextoLibre__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4876:2: rule__TextoLibre__Group__5__Impl rule__TextoLibre__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__5__Impl_in_rule__TextoLibre__Group__59624);
            rule__TextoLibre__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__6_in_rule__TextoLibre__Group__59627);
            rule__TextoLibre__Group__6();

            state._fsp--;


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4883:1: rule__TextoLibre__Group__5__Impl : ( ( rule__TextoLibre__Group_5__0 )? ) ;
    public final void rule__TextoLibre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4887:1: ( ( ( rule__TextoLibre__Group_5__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4888:1: ( ( rule__TextoLibre__Group_5__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4888:1: ( ( rule__TextoLibre__Group_5__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4889:1: ( rule__TextoLibre__Group_5__0 )?
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4890:1: ( rule__TextoLibre__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4890:2: rule__TextoLibre__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__0_in_rule__TextoLibre__Group__5__Impl9654);
                    rule__TextoLibre__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextoLibreAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextoLibre__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4900:1: rule__TextoLibre__Group__6 : rule__TextoLibre__Group__6__Impl ;
    public final void rule__TextoLibre__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4904:1: ( rule__TextoLibre__Group__6__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4905:2: rule__TextoLibre__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group__6__Impl_in_rule__TextoLibre__Group__69685);
            rule__TextoLibre__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__6"


    // $ANTLR start "rule__TextoLibre__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4911:1: rule__TextoLibre__Group__6__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4915:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4916:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4916:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4917:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextoLibre__Group__6__Impl9713); 
             after(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group__6__Impl"


    // $ANTLR start "rule__TextoLibre__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4944:1: rule__TextoLibre__Group_3__0 : rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1 ;
    public final void rule__TextoLibre__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4948:1: ( rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4949:2: rule__TextoLibre__Group_3__0__Impl rule__TextoLibre__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__0__Impl_in_rule__TextoLibre__Group_3__09758);
            rule__TextoLibre__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__1_in_rule__TextoLibre__Group_3__09761);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4956:1: rule__TextoLibre__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__TextoLibre__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4960:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4961:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4961:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4962:1: 'correctas'
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TextoLibre__Group_3__0__Impl9789); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4975:1: rule__TextoLibre__Group_3__1 : rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2 ;
    public final void rule__TextoLibre__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4979:1: ( rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4980:2: rule__TextoLibre__Group_3__1__Impl rule__TextoLibre__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__1__Impl_in_rule__TextoLibre__Group_3__19820);
            rule__TextoLibre__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__2_in_rule__TextoLibre__Group_3__19823);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4987:1: rule__TextoLibre__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4991:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4992:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4992:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:4993:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group_3__1__Impl9851); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5006:1: rule__TextoLibre__Group_3__2 : rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3 ;
    public final void rule__TextoLibre__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5010:1: ( rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5011:2: rule__TextoLibre__Group_3__2__Impl rule__TextoLibre__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__2__Impl_in_rule__TextoLibre__Group_3__29882);
            rule__TextoLibre__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__3_in_rule__TextoLibre__Group_3__29885);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5018:1: rule__TextoLibre__Group_3__2__Impl : ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) ) ;
    public final void rule__TextoLibre__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5022:1: ( ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5023:1: ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5023:1: ( ( rule__TextoLibre__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5024:1: ( rule__TextoLibre__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5025:1: ( rule__TextoLibre__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5025:2: rule__TextoLibre__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__CorrectasAssignment_3_2_in_rule__TextoLibre__Group_3__2__Impl9912);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5035:1: rule__TextoLibre__Group_3__3 : rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4 ;
    public final void rule__TextoLibre__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5039:1: ( rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5040:2: rule__TextoLibre__Group_3__3__Impl rule__TextoLibre__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__3__Impl_in_rule__TextoLibre__Group_3__39942);
            rule__TextoLibre__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__4_in_rule__TextoLibre__Group_3__39945);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5047:1: rule__TextoLibre__Group_3__3__Impl : ( ( rule__TextoLibre__Group_3_3__0 )* ) ;
    public final void rule__TextoLibre__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5051:1: ( ( ( rule__TextoLibre__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5052:1: ( ( rule__TextoLibre__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5052:1: ( ( rule__TextoLibre__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5053:1: ( rule__TextoLibre__Group_3_3__0 )*
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5054:1: ( rule__TextoLibre__Group_3_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5054:2: rule__TextoLibre__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__0_in_rule__TextoLibre__Group_3__3__Impl9972);
            	    rule__TextoLibre__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5064:1: rule__TextoLibre__Group_3__4 : rule__TextoLibre__Group_3__4__Impl ;
    public final void rule__TextoLibre__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5068:1: ( rule__TextoLibre__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5069:2: rule__TextoLibre__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3__4__Impl_in_rule__TextoLibre__Group_3__410003);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5075:1: rule__TextoLibre__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5079:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5080:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5080:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5081:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextoLibre__Group_3__4__Impl10031); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5104:1: rule__TextoLibre__Group_3_3__0 : rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1 ;
    public final void rule__TextoLibre__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5108:1: ( rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5109:2: rule__TextoLibre__Group_3_3__0__Impl rule__TextoLibre__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__0__Impl_in_rule__TextoLibre__Group_3_3__010072);
            rule__TextoLibre__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__1_in_rule__TextoLibre__Group_3_3__010075);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5116:1: rule__TextoLibre__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TextoLibre__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5120:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5121:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5121:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5122:1: ','
            {
             before(grammarAccess.getTextoLibreAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TextoLibre__Group_3_3__0__Impl10103); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5135:1: rule__TextoLibre__Group_3_3__1 : rule__TextoLibre__Group_3_3__1__Impl ;
    public final void rule__TextoLibre__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5139:1: ( rule__TextoLibre__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5140:2: rule__TextoLibre__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_3_3__1__Impl_in_rule__TextoLibre__Group_3_3__110134);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5146:1: rule__TextoLibre__Group_3_3__1__Impl : ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__TextoLibre__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5150:1: ( ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5151:1: ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5151:1: ( ( rule__TextoLibre__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5152:1: ( rule__TextoLibre__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5153:1: ( rule__TextoLibre__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5153:2: rule__TextoLibre__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__CorrectasAssignment_3_3_1_in_rule__TextoLibre__Group_3_3__1__Impl10161);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5167:1: rule__TextoLibre__Group_4__0 : rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1 ;
    public final void rule__TextoLibre__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5171:1: ( rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5172:2: rule__TextoLibre__Group_4__0__Impl rule__TextoLibre__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__0__Impl_in_rule__TextoLibre__Group_4__010195);
            rule__TextoLibre__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__1_in_rule__TextoLibre__Group_4__010198);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5179:1: rule__TextoLibre__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__TextoLibre__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5183:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5184:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5184:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5185:1: 'alternativas'
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TextoLibre__Group_4__0__Impl10226); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5198:1: rule__TextoLibre__Group_4__1 : rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2 ;
    public final void rule__TextoLibre__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5202:1: ( rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5203:2: rule__TextoLibre__Group_4__1__Impl rule__TextoLibre__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__1__Impl_in_rule__TextoLibre__Group_4__110257);
            rule__TextoLibre__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__2_in_rule__TextoLibre__Group_4__110260);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5210:1: rule__TextoLibre__Group_4__1__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5214:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5215:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5215:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5216:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group_4__1__Impl10288); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5229:1: rule__TextoLibre__Group_4__2 : rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3 ;
    public final void rule__TextoLibre__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5233:1: ( rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5234:2: rule__TextoLibre__Group_4__2__Impl rule__TextoLibre__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__2__Impl_in_rule__TextoLibre__Group_4__210319);
            rule__TextoLibre__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__3_in_rule__TextoLibre__Group_4__210322);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5241:1: rule__TextoLibre__Group_4__2__Impl : ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) ) ;
    public final void rule__TextoLibre__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5245:1: ( ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5246:1: ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5246:1: ( ( rule__TextoLibre__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5247:1: ( rule__TextoLibre__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5248:1: ( rule__TextoLibre__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5248:2: rule__TextoLibre__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__AlternativasAssignment_4_2_in_rule__TextoLibre__Group_4__2__Impl10349);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5258:1: rule__TextoLibre__Group_4__3 : rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4 ;
    public final void rule__TextoLibre__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5262:1: ( rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5263:2: rule__TextoLibre__Group_4__3__Impl rule__TextoLibre__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__3__Impl_in_rule__TextoLibre__Group_4__310379);
            rule__TextoLibre__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__4_in_rule__TextoLibre__Group_4__310382);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5270:1: rule__TextoLibre__Group_4__3__Impl : ( ( rule__TextoLibre__Group_4_3__0 )* ) ;
    public final void rule__TextoLibre__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5274:1: ( ( ( rule__TextoLibre__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5275:1: ( ( rule__TextoLibre__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5275:1: ( ( rule__TextoLibre__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5276:1: ( rule__TextoLibre__Group_4_3__0 )*
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5277:1: ( rule__TextoLibre__Group_4_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5277:2: rule__TextoLibre__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__0_in_rule__TextoLibre__Group_4__3__Impl10409);
            	    rule__TextoLibre__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5287:1: rule__TextoLibre__Group_4__4 : rule__TextoLibre__Group_4__4__Impl ;
    public final void rule__TextoLibre__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5291:1: ( rule__TextoLibre__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5292:2: rule__TextoLibre__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4__4__Impl_in_rule__TextoLibre__Group_4__410440);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5298:1: rule__TextoLibre__Group_4__4__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5302:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5303:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5303:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5304:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextoLibre__Group_4__4__Impl10468); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5327:1: rule__TextoLibre__Group_4_3__0 : rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1 ;
    public final void rule__TextoLibre__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5331:1: ( rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5332:2: rule__TextoLibre__Group_4_3__0__Impl rule__TextoLibre__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__0__Impl_in_rule__TextoLibre__Group_4_3__010509);
            rule__TextoLibre__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__1_in_rule__TextoLibre__Group_4_3__010512);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5339:1: rule__TextoLibre__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__TextoLibre__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5343:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5344:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5344:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5345:1: ','
            {
             before(grammarAccess.getTextoLibreAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TextoLibre__Group_4_3__0__Impl10540); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5358:1: rule__TextoLibre__Group_4_3__1 : rule__TextoLibre__Group_4_3__1__Impl ;
    public final void rule__TextoLibre__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5362:1: ( rule__TextoLibre__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5363:2: rule__TextoLibre__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_4_3__1__Impl_in_rule__TextoLibre__Group_4_3__110571);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5369:1: rule__TextoLibre__Group_4_3__1__Impl : ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__TextoLibre__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5373:1: ( ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5374:1: ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5374:1: ( ( rule__TextoLibre__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5375:1: ( rule__TextoLibre__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5376:1: ( rule__TextoLibre__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5376:2: rule__TextoLibre__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__AlternativasAssignment_4_3_1_in_rule__TextoLibre__Group_4_3__1__Impl10598);
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


    // $ANTLR start "rule__TextoLibre__Group_5__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5390:1: rule__TextoLibre__Group_5__0 : rule__TextoLibre__Group_5__0__Impl rule__TextoLibre__Group_5__1 ;
    public final void rule__TextoLibre__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5394:1: ( rule__TextoLibre__Group_5__0__Impl rule__TextoLibre__Group_5__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5395:2: rule__TextoLibre__Group_5__0__Impl rule__TextoLibre__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__0__Impl_in_rule__TextoLibre__Group_5__010632);
            rule__TextoLibre__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__1_in_rule__TextoLibre__Group_5__010635);
            rule__TextoLibre__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__0"


    // $ANTLR start "rule__TextoLibre__Group_5__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5402:1: rule__TextoLibre__Group_5__0__Impl : ( 'seleccionadas' ) ;
    public final void rule__TextoLibre__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5406:1: ( ( 'seleccionadas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5407:1: ( 'seleccionadas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5407:1: ( 'seleccionadas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5408:1: 'seleccionadas'
            {
             before(grammarAccess.getTextoLibreAccess().getSeleccionadasKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__TextoLibre__Group_5__0__Impl10663); 
             after(grammarAccess.getTextoLibreAccess().getSeleccionadasKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__0__Impl"


    // $ANTLR start "rule__TextoLibre__Group_5__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5421:1: rule__TextoLibre__Group_5__1 : rule__TextoLibre__Group_5__1__Impl rule__TextoLibre__Group_5__2 ;
    public final void rule__TextoLibre__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5425:1: ( rule__TextoLibre__Group_5__1__Impl rule__TextoLibre__Group_5__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5426:2: rule__TextoLibre__Group_5__1__Impl rule__TextoLibre__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__1__Impl_in_rule__TextoLibre__Group_5__110694);
            rule__TextoLibre__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__2_in_rule__TextoLibre__Group_5__110697);
            rule__TextoLibre__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__1"


    // $ANTLR start "rule__TextoLibre__Group_5__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5433:1: rule__TextoLibre__Group_5__1__Impl : ( '{' ) ;
    public final void rule__TextoLibre__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5437:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5438:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5438:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5439:1: '{'
            {
             before(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextoLibre__Group_5__1__Impl10725); 
             after(grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__1__Impl"


    // $ANTLR start "rule__TextoLibre__Group_5__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5452:1: rule__TextoLibre__Group_5__2 : rule__TextoLibre__Group_5__2__Impl rule__TextoLibre__Group_5__3 ;
    public final void rule__TextoLibre__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5456:1: ( rule__TextoLibre__Group_5__2__Impl rule__TextoLibre__Group_5__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5457:2: rule__TextoLibre__Group_5__2__Impl rule__TextoLibre__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__2__Impl_in_rule__TextoLibre__Group_5__210756);
            rule__TextoLibre__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__3_in_rule__TextoLibre__Group_5__210759);
            rule__TextoLibre__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__2"


    // $ANTLR start "rule__TextoLibre__Group_5__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5464:1: rule__TextoLibre__Group_5__2__Impl : ( ( rule__TextoLibre__SeleccionadasAssignment_5_2 ) ) ;
    public final void rule__TextoLibre__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5468:1: ( ( ( rule__TextoLibre__SeleccionadasAssignment_5_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5469:1: ( ( rule__TextoLibre__SeleccionadasAssignment_5_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5469:1: ( ( rule__TextoLibre__SeleccionadasAssignment_5_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5470:1: ( rule__TextoLibre__SeleccionadasAssignment_5_2 )
            {
             before(grammarAccess.getTextoLibreAccess().getSeleccionadasAssignment_5_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5471:1: ( rule__TextoLibre__SeleccionadasAssignment_5_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5471:2: rule__TextoLibre__SeleccionadasAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__SeleccionadasAssignment_5_2_in_rule__TextoLibre__Group_5__2__Impl10786);
            rule__TextoLibre__SeleccionadasAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTextoLibreAccess().getSeleccionadasAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__2__Impl"


    // $ANTLR start "rule__TextoLibre__Group_5__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5481:1: rule__TextoLibre__Group_5__3 : rule__TextoLibre__Group_5__3__Impl rule__TextoLibre__Group_5__4 ;
    public final void rule__TextoLibre__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5485:1: ( rule__TextoLibre__Group_5__3__Impl rule__TextoLibre__Group_5__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5486:2: rule__TextoLibre__Group_5__3__Impl rule__TextoLibre__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__3__Impl_in_rule__TextoLibre__Group_5__310816);
            rule__TextoLibre__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__4_in_rule__TextoLibre__Group_5__310819);
            rule__TextoLibre__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__3"


    // $ANTLR start "rule__TextoLibre__Group_5__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5493:1: rule__TextoLibre__Group_5__3__Impl : ( ( rule__TextoLibre__Group_5_3__0 )* ) ;
    public final void rule__TextoLibre__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5497:1: ( ( ( rule__TextoLibre__Group_5_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5498:1: ( ( rule__TextoLibre__Group_5_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5498:1: ( ( rule__TextoLibre__Group_5_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5499:1: ( rule__TextoLibre__Group_5_3__0 )*
            {
             before(grammarAccess.getTextoLibreAccess().getGroup_5_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5500:1: ( rule__TextoLibre__Group_5_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5500:2: rule__TextoLibre__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5_3__0_in_rule__TextoLibre__Group_5__3__Impl10846);
            	    rule__TextoLibre__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTextoLibreAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__3__Impl"


    // $ANTLR start "rule__TextoLibre__Group_5__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5510:1: rule__TextoLibre__Group_5__4 : rule__TextoLibre__Group_5__4__Impl ;
    public final void rule__TextoLibre__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5514:1: ( rule__TextoLibre__Group_5__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5515:2: rule__TextoLibre__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5__4__Impl_in_rule__TextoLibre__Group_5__410877);
            rule__TextoLibre__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__4"


    // $ANTLR start "rule__TextoLibre__Group_5__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5521:1: rule__TextoLibre__Group_5__4__Impl : ( '}' ) ;
    public final void rule__TextoLibre__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5525:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5526:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5526:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5527:1: '}'
            {
             before(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextoLibre__Group_5__4__Impl10905); 
             after(grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5__4__Impl"


    // $ANTLR start "rule__TextoLibre__Group_5_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5550:1: rule__TextoLibre__Group_5_3__0 : rule__TextoLibre__Group_5_3__0__Impl rule__TextoLibre__Group_5_3__1 ;
    public final void rule__TextoLibre__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5554:1: ( rule__TextoLibre__Group_5_3__0__Impl rule__TextoLibre__Group_5_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5555:2: rule__TextoLibre__Group_5_3__0__Impl rule__TextoLibre__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5_3__0__Impl_in_rule__TextoLibre__Group_5_3__010946);
            rule__TextoLibre__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5_3__1_in_rule__TextoLibre__Group_5_3__010949);
            rule__TextoLibre__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5_3__0"


    // $ANTLR start "rule__TextoLibre__Group_5_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5562:1: rule__TextoLibre__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__TextoLibre__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5566:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5567:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5567:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5568:1: ','
            {
             before(grammarAccess.getTextoLibreAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TextoLibre__Group_5_3__0__Impl10977); 
             after(grammarAccess.getTextoLibreAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5_3__0__Impl"


    // $ANTLR start "rule__TextoLibre__Group_5_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5581:1: rule__TextoLibre__Group_5_3__1 : rule__TextoLibre__Group_5_3__1__Impl ;
    public final void rule__TextoLibre__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5585:1: ( rule__TextoLibre__Group_5_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5586:2: rule__TextoLibre__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__Group_5_3__1__Impl_in_rule__TextoLibre__Group_5_3__111008);
            rule__TextoLibre__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5_3__1"


    // $ANTLR start "rule__TextoLibre__Group_5_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5592:1: rule__TextoLibre__Group_5_3__1__Impl : ( ( rule__TextoLibre__SeleccionadasAssignment_5_3_1 ) ) ;
    public final void rule__TextoLibre__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5596:1: ( ( ( rule__TextoLibre__SeleccionadasAssignment_5_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5597:1: ( ( rule__TextoLibre__SeleccionadasAssignment_5_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5597:1: ( ( rule__TextoLibre__SeleccionadasAssignment_5_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5598:1: ( rule__TextoLibre__SeleccionadasAssignment_5_3_1 )
            {
             before(grammarAccess.getTextoLibreAccess().getSeleccionadasAssignment_5_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5599:1: ( rule__TextoLibre__SeleccionadasAssignment_5_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5599:2: rule__TextoLibre__SeleccionadasAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextoLibre__SeleccionadasAssignment_5_3_1_in_rule__TextoLibre__Group_5_3__1__Impl11035);
            rule__TextoLibre__SeleccionadasAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextoLibreAccess().getSeleccionadasAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__Group_5_3__1__Impl"


    // $ANTLR start "rule__Ordenacion__Group__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5613:1: rule__Ordenacion__Group__0 : rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1 ;
    public final void rule__Ordenacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5617:1: ( rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5618:2: rule__Ordenacion__Group__0__Impl rule__Ordenacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__0__Impl_in_rule__Ordenacion__Group__011069);
            rule__Ordenacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__1_in_rule__Ordenacion__Group__011072);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5625:1: rule__Ordenacion__Group__0__Impl : ( () ) ;
    public final void rule__Ordenacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5629:1: ( ( () ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5630:1: ( () )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5630:1: ( () )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5631:1: ()
            {
             before(grammarAccess.getOrdenacionAccess().getOrdenacionAction_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5632:1: ()
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5634:1: 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5644:1: rule__Ordenacion__Group__1 : rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2 ;
    public final void rule__Ordenacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5648:1: ( rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5649:2: rule__Ordenacion__Group__1__Impl rule__Ordenacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__1__Impl_in_rule__Ordenacion__Group__111130);
            rule__Ordenacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__2_in_rule__Ordenacion__Group__111133);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5656:1: rule__Ordenacion__Group__1__Impl : ( 'Ordenacion' ) ;
    public final void rule__Ordenacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5660:1: ( ( 'Ordenacion' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5661:1: ( 'Ordenacion' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5661:1: ( 'Ordenacion' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5662:1: 'Ordenacion'
            {
             before(grammarAccess.getOrdenacionAccess().getOrdenacionKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Ordenacion__Group__1__Impl11161); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5675:1: rule__Ordenacion__Group__2 : rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3 ;
    public final void rule__Ordenacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5679:1: ( rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5680:2: rule__Ordenacion__Group__2__Impl rule__Ordenacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__2__Impl_in_rule__Ordenacion__Group__211192);
            rule__Ordenacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__3_in_rule__Ordenacion__Group__211195);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5687:1: rule__Ordenacion__Group__2__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5691:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5692:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5692:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5693:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group__2__Impl11223); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5706:1: rule__Ordenacion__Group__3 : rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4 ;
    public final void rule__Ordenacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5710:1: ( rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5711:2: rule__Ordenacion__Group__3__Impl rule__Ordenacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__3__Impl_in_rule__Ordenacion__Group__311254);
            rule__Ordenacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__4_in_rule__Ordenacion__Group__311257);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5718:1: rule__Ordenacion__Group__3__Impl : ( ( rule__Ordenacion__Group_3__0 )? ) ;
    public final void rule__Ordenacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5722:1: ( ( ( rule__Ordenacion__Group_3__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5723:1: ( ( rule__Ordenacion__Group_3__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5723:1: ( ( rule__Ordenacion__Group_3__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5724:1: ( rule__Ordenacion__Group_3__0 )?
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5725:1: ( rule__Ordenacion__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5725:2: rule__Ordenacion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__0_in_rule__Ordenacion__Group__3__Impl11284);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5735:1: rule__Ordenacion__Group__4 : rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5 ;
    public final void rule__Ordenacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5739:1: ( rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5740:2: rule__Ordenacion__Group__4__Impl rule__Ordenacion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__4__Impl_in_rule__Ordenacion__Group__411315);
            rule__Ordenacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__5_in_rule__Ordenacion__Group__411318);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5747:1: rule__Ordenacion__Group__4__Impl : ( ( rule__Ordenacion__Group_4__0 )? ) ;
    public final void rule__Ordenacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5751:1: ( ( ( rule__Ordenacion__Group_4__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5752:1: ( ( rule__Ordenacion__Group_4__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5752:1: ( ( rule__Ordenacion__Group_4__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5753:1: ( rule__Ordenacion__Group_4__0 )?
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_4()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5754:1: ( rule__Ordenacion__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5754:2: rule__Ordenacion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__0_in_rule__Ordenacion__Group__4__Impl11345);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5764:1: rule__Ordenacion__Group__5 : rule__Ordenacion__Group__5__Impl rule__Ordenacion__Group__6 ;
    public final void rule__Ordenacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5768:1: ( rule__Ordenacion__Group__5__Impl rule__Ordenacion__Group__6 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5769:2: rule__Ordenacion__Group__5__Impl rule__Ordenacion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__5__Impl_in_rule__Ordenacion__Group__511376);
            rule__Ordenacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__6_in_rule__Ordenacion__Group__511379);
            rule__Ordenacion__Group__6();

            state._fsp--;


            }

        }
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5776:1: rule__Ordenacion__Group__5__Impl : ( ( rule__Ordenacion__Group_5__0 )? ) ;
    public final void rule__Ordenacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5780:1: ( ( ( rule__Ordenacion__Group_5__0 )? ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5781:1: ( ( rule__Ordenacion__Group_5__0 )? )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5781:1: ( ( rule__Ordenacion__Group_5__0 )? )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5782:1: ( rule__Ordenacion__Group_5__0 )?
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_5()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5783:1: ( rule__Ordenacion__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5783:2: rule__Ordenacion__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__0_in_rule__Ordenacion__Group__5__Impl11406);
                    rule__Ordenacion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrdenacionAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ordenacion__Group__6"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5793:1: rule__Ordenacion__Group__6 : rule__Ordenacion__Group__6__Impl ;
    public final void rule__Ordenacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5797:1: ( rule__Ordenacion__Group__6__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5798:2: rule__Ordenacion__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group__6__Impl_in_rule__Ordenacion__Group__611437);
            rule__Ordenacion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__6"


    // $ANTLR start "rule__Ordenacion__Group__6__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5804:1: rule__Ordenacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5808:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5809:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5809:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5810:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ordenacion__Group__6__Impl11465); 
             after(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group__6__Impl"


    // $ANTLR start "rule__Ordenacion__Group_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5837:1: rule__Ordenacion__Group_3__0 : rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1 ;
    public final void rule__Ordenacion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5841:1: ( rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5842:2: rule__Ordenacion__Group_3__0__Impl rule__Ordenacion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__0__Impl_in_rule__Ordenacion__Group_3__011510);
            rule__Ordenacion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__1_in_rule__Ordenacion__Group_3__011513);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5849:1: rule__Ordenacion__Group_3__0__Impl : ( 'correctas' ) ;
    public final void rule__Ordenacion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5853:1: ( ( 'correctas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5854:1: ( 'correctas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5854:1: ( 'correctas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5855:1: 'correctas'
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Ordenacion__Group_3__0__Impl11541); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5868:1: rule__Ordenacion__Group_3__1 : rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2 ;
    public final void rule__Ordenacion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5872:1: ( rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5873:2: rule__Ordenacion__Group_3__1__Impl rule__Ordenacion__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__1__Impl_in_rule__Ordenacion__Group_3__111572);
            rule__Ordenacion__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__2_in_rule__Ordenacion__Group_3__111575);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5880:1: rule__Ordenacion__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5884:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5885:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5885:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5886:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group_3__1__Impl11603); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5899:1: rule__Ordenacion__Group_3__2 : rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3 ;
    public final void rule__Ordenacion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5903:1: ( rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5904:2: rule__Ordenacion__Group_3__2__Impl rule__Ordenacion__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__2__Impl_in_rule__Ordenacion__Group_3__211634);
            rule__Ordenacion__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__3_in_rule__Ordenacion__Group_3__211637);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5911:1: rule__Ordenacion__Group_3__2__Impl : ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) ) ;
    public final void rule__Ordenacion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5915:1: ( ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5916:1: ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5916:1: ( ( rule__Ordenacion__CorrectasAssignment_3_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5917:1: ( rule__Ordenacion__CorrectasAssignment_3_2 )
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5918:1: ( rule__Ordenacion__CorrectasAssignment_3_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5918:2: rule__Ordenacion__CorrectasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__CorrectasAssignment_3_2_in_rule__Ordenacion__Group_3__2__Impl11664);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5928:1: rule__Ordenacion__Group_3__3 : rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4 ;
    public final void rule__Ordenacion__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5932:1: ( rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5933:2: rule__Ordenacion__Group_3__3__Impl rule__Ordenacion__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__3__Impl_in_rule__Ordenacion__Group_3__311694);
            rule__Ordenacion__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__4_in_rule__Ordenacion__Group_3__311697);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5940:1: rule__Ordenacion__Group_3__3__Impl : ( ( rule__Ordenacion__Group_3_3__0 )* ) ;
    public final void rule__Ordenacion__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5944:1: ( ( ( rule__Ordenacion__Group_3_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5945:1: ( ( rule__Ordenacion__Group_3_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5945:1: ( ( rule__Ordenacion__Group_3_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5946:1: ( rule__Ordenacion__Group_3_3__0 )*
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_3_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5947:1: ( rule__Ordenacion__Group_3_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==27) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5947:2: rule__Ordenacion__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__0_in_rule__Ordenacion__Group_3__3__Impl11724);
            	    rule__Ordenacion__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5957:1: rule__Ordenacion__Group_3__4 : rule__Ordenacion__Group_3__4__Impl ;
    public final void rule__Ordenacion__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5961:1: ( rule__Ordenacion__Group_3__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5962:2: rule__Ordenacion__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3__4__Impl_in_rule__Ordenacion__Group_3__411755);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5968:1: rule__Ordenacion__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5972:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5973:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5973:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5974:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ordenacion__Group_3__4__Impl11783); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:5997:1: rule__Ordenacion__Group_3_3__0 : rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1 ;
    public final void rule__Ordenacion__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6001:1: ( rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6002:2: rule__Ordenacion__Group_3_3__0__Impl rule__Ordenacion__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__0__Impl_in_rule__Ordenacion__Group_3_3__011824);
            rule__Ordenacion__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__1_in_rule__Ordenacion__Group_3_3__011827);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6009:1: rule__Ordenacion__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Ordenacion__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6013:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6014:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6014:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6015:1: ','
            {
             before(grammarAccess.getOrdenacionAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ordenacion__Group_3_3__0__Impl11855); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6028:1: rule__Ordenacion__Group_3_3__1 : rule__Ordenacion__Group_3_3__1__Impl ;
    public final void rule__Ordenacion__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6032:1: ( rule__Ordenacion__Group_3_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6033:2: rule__Ordenacion__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_3_3__1__Impl_in_rule__Ordenacion__Group_3_3__111886);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6039:1: rule__Ordenacion__Group_3_3__1__Impl : ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) ) ;
    public final void rule__Ordenacion__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6043:1: ( ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6044:1: ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6044:1: ( ( rule__Ordenacion__CorrectasAssignment_3_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6045:1: ( rule__Ordenacion__CorrectasAssignment_3_3_1 )
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasAssignment_3_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6046:1: ( rule__Ordenacion__CorrectasAssignment_3_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6046:2: rule__Ordenacion__CorrectasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__CorrectasAssignment_3_3_1_in_rule__Ordenacion__Group_3_3__1__Impl11913);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6060:1: rule__Ordenacion__Group_4__0 : rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1 ;
    public final void rule__Ordenacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6064:1: ( rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6065:2: rule__Ordenacion__Group_4__0__Impl rule__Ordenacion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__0__Impl_in_rule__Ordenacion__Group_4__011947);
            rule__Ordenacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__1_in_rule__Ordenacion__Group_4__011950);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6072:1: rule__Ordenacion__Group_4__0__Impl : ( 'alternativas' ) ;
    public final void rule__Ordenacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6076:1: ( ( 'alternativas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6077:1: ( 'alternativas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6077:1: ( 'alternativas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6078:1: 'alternativas'
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Ordenacion__Group_4__0__Impl11978); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6091:1: rule__Ordenacion__Group_4__1 : rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2 ;
    public final void rule__Ordenacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6095:1: ( rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6096:2: rule__Ordenacion__Group_4__1__Impl rule__Ordenacion__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__1__Impl_in_rule__Ordenacion__Group_4__112009);
            rule__Ordenacion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__2_in_rule__Ordenacion__Group_4__112012);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6103:1: rule__Ordenacion__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6107:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6108:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6108:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6109:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group_4__1__Impl12040); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6122:1: rule__Ordenacion__Group_4__2 : rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3 ;
    public final void rule__Ordenacion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6126:1: ( rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6127:2: rule__Ordenacion__Group_4__2__Impl rule__Ordenacion__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__2__Impl_in_rule__Ordenacion__Group_4__212071);
            rule__Ordenacion__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__3_in_rule__Ordenacion__Group_4__212074);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6134:1: rule__Ordenacion__Group_4__2__Impl : ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) ) ;
    public final void rule__Ordenacion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6138:1: ( ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6139:1: ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6139:1: ( ( rule__Ordenacion__AlternativasAssignment_4_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6140:1: ( rule__Ordenacion__AlternativasAssignment_4_2 )
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6141:1: ( rule__Ordenacion__AlternativasAssignment_4_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6141:2: rule__Ordenacion__AlternativasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__AlternativasAssignment_4_2_in_rule__Ordenacion__Group_4__2__Impl12101);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6151:1: rule__Ordenacion__Group_4__3 : rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4 ;
    public final void rule__Ordenacion__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6155:1: ( rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6156:2: rule__Ordenacion__Group_4__3__Impl rule__Ordenacion__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__3__Impl_in_rule__Ordenacion__Group_4__312131);
            rule__Ordenacion__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__4_in_rule__Ordenacion__Group_4__312134);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6163:1: rule__Ordenacion__Group_4__3__Impl : ( ( rule__Ordenacion__Group_4_3__0 )* ) ;
    public final void rule__Ordenacion__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6167:1: ( ( ( rule__Ordenacion__Group_4_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6168:1: ( ( rule__Ordenacion__Group_4_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6168:1: ( ( rule__Ordenacion__Group_4_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6169:1: ( rule__Ordenacion__Group_4_3__0 )*
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_4_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6170:1: ( rule__Ordenacion__Group_4_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==27) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6170:2: rule__Ordenacion__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__0_in_rule__Ordenacion__Group_4__3__Impl12161);
            	    rule__Ordenacion__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6180:1: rule__Ordenacion__Group_4__4 : rule__Ordenacion__Group_4__4__Impl ;
    public final void rule__Ordenacion__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6184:1: ( rule__Ordenacion__Group_4__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6185:2: rule__Ordenacion__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4__4__Impl_in_rule__Ordenacion__Group_4__412192);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6191:1: rule__Ordenacion__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6195:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6196:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6196:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6197:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ordenacion__Group_4__4__Impl12220); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6220:1: rule__Ordenacion__Group_4_3__0 : rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1 ;
    public final void rule__Ordenacion__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6224:1: ( rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6225:2: rule__Ordenacion__Group_4_3__0__Impl rule__Ordenacion__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__0__Impl_in_rule__Ordenacion__Group_4_3__012261);
            rule__Ordenacion__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__1_in_rule__Ordenacion__Group_4_3__012264);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6232:1: rule__Ordenacion__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Ordenacion__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6236:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6237:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6237:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6238:1: ','
            {
             before(grammarAccess.getOrdenacionAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ordenacion__Group_4_3__0__Impl12292); 
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6251:1: rule__Ordenacion__Group_4_3__1 : rule__Ordenacion__Group_4_3__1__Impl ;
    public final void rule__Ordenacion__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6255:1: ( rule__Ordenacion__Group_4_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6256:2: rule__Ordenacion__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_4_3__1__Impl_in_rule__Ordenacion__Group_4_3__112323);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6262:1: rule__Ordenacion__Group_4_3__1__Impl : ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) ) ;
    public final void rule__Ordenacion__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6266:1: ( ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6267:1: ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6267:1: ( ( rule__Ordenacion__AlternativasAssignment_4_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6268:1: ( rule__Ordenacion__AlternativasAssignment_4_3_1 )
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasAssignment_4_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6269:1: ( rule__Ordenacion__AlternativasAssignment_4_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6269:2: rule__Ordenacion__AlternativasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__AlternativasAssignment_4_3_1_in_rule__Ordenacion__Group_4_3__1__Impl12350);
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


    // $ANTLR start "rule__Ordenacion__Group_5__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6283:1: rule__Ordenacion__Group_5__0 : rule__Ordenacion__Group_5__0__Impl rule__Ordenacion__Group_5__1 ;
    public final void rule__Ordenacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6287:1: ( rule__Ordenacion__Group_5__0__Impl rule__Ordenacion__Group_5__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6288:2: rule__Ordenacion__Group_5__0__Impl rule__Ordenacion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__0__Impl_in_rule__Ordenacion__Group_5__012384);
            rule__Ordenacion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__1_in_rule__Ordenacion__Group_5__012387);
            rule__Ordenacion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__0"


    // $ANTLR start "rule__Ordenacion__Group_5__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6295:1: rule__Ordenacion__Group_5__0__Impl : ( 'seleccionadas' ) ;
    public final void rule__Ordenacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6299:1: ( ( 'seleccionadas' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6300:1: ( 'seleccionadas' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6300:1: ( 'seleccionadas' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6301:1: 'seleccionadas'
            {
             before(grammarAccess.getOrdenacionAccess().getSeleccionadasKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Ordenacion__Group_5__0__Impl12415); 
             after(grammarAccess.getOrdenacionAccess().getSeleccionadasKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__0__Impl"


    // $ANTLR start "rule__Ordenacion__Group_5__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6314:1: rule__Ordenacion__Group_5__1 : rule__Ordenacion__Group_5__1__Impl rule__Ordenacion__Group_5__2 ;
    public final void rule__Ordenacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6318:1: ( rule__Ordenacion__Group_5__1__Impl rule__Ordenacion__Group_5__2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6319:2: rule__Ordenacion__Group_5__1__Impl rule__Ordenacion__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__1__Impl_in_rule__Ordenacion__Group_5__112446);
            rule__Ordenacion__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__2_in_rule__Ordenacion__Group_5__112449);
            rule__Ordenacion__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__1"


    // $ANTLR start "rule__Ordenacion__Group_5__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6326:1: rule__Ordenacion__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Ordenacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6330:1: ( ( '{' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6331:1: ( '{' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6331:1: ( '{' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6332:1: '{'
            {
             before(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Ordenacion__Group_5__1__Impl12477); 
             after(grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__1__Impl"


    // $ANTLR start "rule__Ordenacion__Group_5__2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6345:1: rule__Ordenacion__Group_5__2 : rule__Ordenacion__Group_5__2__Impl rule__Ordenacion__Group_5__3 ;
    public final void rule__Ordenacion__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6349:1: ( rule__Ordenacion__Group_5__2__Impl rule__Ordenacion__Group_5__3 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6350:2: rule__Ordenacion__Group_5__2__Impl rule__Ordenacion__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__2__Impl_in_rule__Ordenacion__Group_5__212508);
            rule__Ordenacion__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__3_in_rule__Ordenacion__Group_5__212511);
            rule__Ordenacion__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__2"


    // $ANTLR start "rule__Ordenacion__Group_5__2__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6357:1: rule__Ordenacion__Group_5__2__Impl : ( ( rule__Ordenacion__SeleccionadasAssignment_5_2 ) ) ;
    public final void rule__Ordenacion__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6361:1: ( ( ( rule__Ordenacion__SeleccionadasAssignment_5_2 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6362:1: ( ( rule__Ordenacion__SeleccionadasAssignment_5_2 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6362:1: ( ( rule__Ordenacion__SeleccionadasAssignment_5_2 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6363:1: ( rule__Ordenacion__SeleccionadasAssignment_5_2 )
            {
             before(grammarAccess.getOrdenacionAccess().getSeleccionadasAssignment_5_2()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6364:1: ( rule__Ordenacion__SeleccionadasAssignment_5_2 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6364:2: rule__Ordenacion__SeleccionadasAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__SeleccionadasAssignment_5_2_in_rule__Ordenacion__Group_5__2__Impl12538);
            rule__Ordenacion__SeleccionadasAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOrdenacionAccess().getSeleccionadasAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__2__Impl"


    // $ANTLR start "rule__Ordenacion__Group_5__3"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6374:1: rule__Ordenacion__Group_5__3 : rule__Ordenacion__Group_5__3__Impl rule__Ordenacion__Group_5__4 ;
    public final void rule__Ordenacion__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6378:1: ( rule__Ordenacion__Group_5__3__Impl rule__Ordenacion__Group_5__4 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6379:2: rule__Ordenacion__Group_5__3__Impl rule__Ordenacion__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__3__Impl_in_rule__Ordenacion__Group_5__312568);
            rule__Ordenacion__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__4_in_rule__Ordenacion__Group_5__312571);
            rule__Ordenacion__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__3"


    // $ANTLR start "rule__Ordenacion__Group_5__3__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6386:1: rule__Ordenacion__Group_5__3__Impl : ( ( rule__Ordenacion__Group_5_3__0 )* ) ;
    public final void rule__Ordenacion__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6390:1: ( ( ( rule__Ordenacion__Group_5_3__0 )* ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6391:1: ( ( rule__Ordenacion__Group_5_3__0 )* )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6391:1: ( ( rule__Ordenacion__Group_5_3__0 )* )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6392:1: ( rule__Ordenacion__Group_5_3__0 )*
            {
             before(grammarAccess.getOrdenacionAccess().getGroup_5_3()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6393:1: ( rule__Ordenacion__Group_5_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6393:2: rule__Ordenacion__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5_3__0_in_rule__Ordenacion__Group_5__3__Impl12598);
            	    rule__Ordenacion__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getOrdenacionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__3__Impl"


    // $ANTLR start "rule__Ordenacion__Group_5__4"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6403:1: rule__Ordenacion__Group_5__4 : rule__Ordenacion__Group_5__4__Impl ;
    public final void rule__Ordenacion__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6407:1: ( rule__Ordenacion__Group_5__4__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6408:2: rule__Ordenacion__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5__4__Impl_in_rule__Ordenacion__Group_5__412629);
            rule__Ordenacion__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__4"


    // $ANTLR start "rule__Ordenacion__Group_5__4__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6414:1: rule__Ordenacion__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Ordenacion__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6418:1: ( ( '}' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6419:1: ( '}' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6419:1: ( '}' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6420:1: '}'
            {
             before(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ordenacion__Group_5__4__Impl12657); 
             after(grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5__4__Impl"


    // $ANTLR start "rule__Ordenacion__Group_5_3__0"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6443:1: rule__Ordenacion__Group_5_3__0 : rule__Ordenacion__Group_5_3__0__Impl rule__Ordenacion__Group_5_3__1 ;
    public final void rule__Ordenacion__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6447:1: ( rule__Ordenacion__Group_5_3__0__Impl rule__Ordenacion__Group_5_3__1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6448:2: rule__Ordenacion__Group_5_3__0__Impl rule__Ordenacion__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5_3__0__Impl_in_rule__Ordenacion__Group_5_3__012698);
            rule__Ordenacion__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5_3__1_in_rule__Ordenacion__Group_5_3__012701);
            rule__Ordenacion__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5_3__0"


    // $ANTLR start "rule__Ordenacion__Group_5_3__0__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6455:1: rule__Ordenacion__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Ordenacion__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6459:1: ( ( ',' ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6460:1: ( ',' )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6460:1: ( ',' )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6461:1: ','
            {
             before(grammarAccess.getOrdenacionAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ordenacion__Group_5_3__0__Impl12729); 
             after(grammarAccess.getOrdenacionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5_3__0__Impl"


    // $ANTLR start "rule__Ordenacion__Group_5_3__1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6474:1: rule__Ordenacion__Group_5_3__1 : rule__Ordenacion__Group_5_3__1__Impl ;
    public final void rule__Ordenacion__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6478:1: ( rule__Ordenacion__Group_5_3__1__Impl )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6479:2: rule__Ordenacion__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__Group_5_3__1__Impl_in_rule__Ordenacion__Group_5_3__112760);
            rule__Ordenacion__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5_3__1"


    // $ANTLR start "rule__Ordenacion__Group_5_3__1__Impl"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6485:1: rule__Ordenacion__Group_5_3__1__Impl : ( ( rule__Ordenacion__SeleccionadasAssignment_5_3_1 ) ) ;
    public final void rule__Ordenacion__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6489:1: ( ( ( rule__Ordenacion__SeleccionadasAssignment_5_3_1 ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6490:1: ( ( rule__Ordenacion__SeleccionadasAssignment_5_3_1 ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6490:1: ( ( rule__Ordenacion__SeleccionadasAssignment_5_3_1 ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6491:1: ( rule__Ordenacion__SeleccionadasAssignment_5_3_1 )
            {
             before(grammarAccess.getOrdenacionAccess().getSeleccionadasAssignment_5_3_1()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6492:1: ( rule__Ordenacion__SeleccionadasAssignment_5_3_1 )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6492:2: rule__Ordenacion__SeleccionadasAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ordenacion__SeleccionadasAssignment_5_3_1_in_rule__Ordenacion__Group_5_3__1__Impl12787);
            rule__Ordenacion__SeleccionadasAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdenacionAccess().getSeleccionadasAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__Group_5_3__1__Impl"


    // $ANTLR start "rule__Ejercicio__NameAssignment_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6507:1: rule__Ejercicio__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ejercicio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6511:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6512:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6512:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6513:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__NameAssignment_112826);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6522:1: rule__Ejercicio__EnunciadoAssignment_4 : ( ruleEString ) ;
    public final void rule__Ejercicio__EnunciadoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6526:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6527:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6527:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6528:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getEnunciadoEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__EnunciadoAssignment_412857);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6537:1: rule__Ejercicio__PuntuacionEjAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Ejercicio__PuntuacionEjAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6541:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6542:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6542:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6543:1: ruleEDouble
            {
             before(grammarAccess.getEjercicioAccess().getPuntuacionEjEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Ejercicio__PuntuacionEjAssignment_5_112888);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6552:1: rule__Ejercicio__CategoriaAssignment_7 : ( ruleEString ) ;
    public final void rule__Ejercicio__CategoriaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6556:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6557:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6557:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6558:1: ruleEString
            {
             before(grammarAccess.getEjercicioAccess().getCategoriaEStringParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ejercicio__CategoriaAssignment_712919);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6567:1: rule__Ejercicio__OrderAssignment_9 : ( ruleEInt ) ;
    public final void rule__Ejercicio__OrderAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6571:1: ( ( ruleEInt ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6572:1: ( ruleEInt )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6572:1: ( ruleEInt )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6573:1: ruleEInt
            {
             before(grammarAccess.getEjercicioAccess().getOrderEIntParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Ejercicio__OrderAssignment_912950);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6582:1: rule__Ejercicio__RespuestaAssignment_11 : ( ruleRespuesta ) ;
    public final void rule__Ejercicio__RespuestaAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6586:1: ( ( ruleRespuesta ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6587:1: ( ruleRespuesta )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6587:1: ( ruleRespuesta )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6588:1: ruleRespuesta
            {
             before(grammarAccess.getEjercicioAccess().getRespuestaRespuestaParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuesta_in_rule__Ejercicio__RespuestaAssignment_1112981);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6597:1: rule__Clasico__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Clasico__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6601:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6602:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6602:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6603:1: ruleEDouble
            {
             before(grammarAccess.getClasicoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Clasico__PuntuacionAssignment_313012);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6612:1: rule__Clasico__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Clasico__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6616:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6617:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6617:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6618:1: ruleEDouble
            {
             before(grammarAccess.getClasicoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Clasico__PenalizacionAssignment_513043);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6627:1: rule__Clasico__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__Clasico__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6631:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6632:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6632:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6633:1: ruleEjercicio
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_813074);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6642:1: rule__Clasico__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__Clasico__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6646:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6647:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6647:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6648:1: ruleEjercicio
            {
             before(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_9_113105);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6657:1: rule__Wizard__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Wizard__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6661:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6662:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6662:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6663:1: ruleEDouble
            {
             before(grammarAccess.getWizardAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Wizard__PuntuacionAssignment_313136);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6672:1: rule__Wizard__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Wizard__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6676:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6677:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6677:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6678:1: ruleEDouble
            {
             before(grammarAccess.getWizardAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Wizard__PenalizacionAssignment_513167);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6687:1: rule__Wizard__EjerciciosAssignment_8 : ( ruleEjercicio ) ;
    public final void rule__Wizard__EjerciciosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6691:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6692:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6692:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6693:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_813198);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6702:1: rule__Wizard__EjerciciosAssignment_9_1 : ( ruleEjercicio ) ;
    public final void rule__Wizard__EjerciciosAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6706:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6707:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6707:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6708:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_9_113229);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6717:1: rule__WizardAdaptativo__PuntuacionAssignment_3 : ( ruleEDouble ) ;
    public final void rule__WizardAdaptativo__PuntuacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6721:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6722:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6722:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6723:1: ruleEDouble
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PuntuacionAssignment_313260);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6732:1: rule__WizardAdaptativo__PenalizacionAssignment_5 : ( ruleEDouble ) ;
    public final void rule__WizardAdaptativo__PenalizacionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6736:1: ( ( ruleEDouble ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6737:1: ( ruleEDouble )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6737:1: ( ruleEDouble )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6738:1: ruleEDouble
            {
             before(grammarAccess.getWizardAdaptativoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PenalizacionAssignment_513291);
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


    // $ANTLR start "rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6747:1: rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6751:1: ( ( ( ruleEString ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6752:1: ( ( ruleEString ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6752:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6753:1: ( ruleEString )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioCrossReference_6_2_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6754:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6755:1: ruleEString
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_213326);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2"


    // $ANTLR start "rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6766:1: rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6770:1: ( ( ( ruleEString ) ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6771:1: ( ( ruleEString ) )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6771:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6772:1: ( ruleEString )
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioCrossReference_6_3_1_0()); 
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6773:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6774:1: ruleEString
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_113365);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1"


    // $ANTLR start "rule__WizardAdaptativo__EjerciciosAssignment_9"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6785:1: rule__WizardAdaptativo__EjerciciosAssignment_9 : ( ruleEjercicio ) ;
    public final void rule__WizardAdaptativo__EjerciciosAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6789:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6790:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6790:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6791:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_913400);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__EjerciciosAssignment_9"


    // $ANTLR start "rule__WizardAdaptativo__EjerciciosAssignment_10_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6800:1: rule__WizardAdaptativo__EjerciciosAssignment_10_1 : ( ruleEjercicio ) ;
    public final void rule__WizardAdaptativo__EjerciciosAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6804:1: ( ( ruleEjercicio ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6805:1: ( ruleEjercicio )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6805:1: ( ruleEjercicio )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6806:1: ruleEjercicio
            {
             before(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_10_113431);
            ruleEjercicio();

            state._fsp--;

             after(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WizardAdaptativo__EjerciciosAssignment_10_1"


    // $ANTLR start "rule__RespuestaUnica__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6815:1: rule__RespuestaUnica__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6819:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6820:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6820:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6821:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_213462);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6830:1: rule__RespuestaUnica__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6834:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6835:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6835:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6836:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_3_113493);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6845:1: rule__RespuestaUnica__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6849:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6850:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6850:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6851:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_213524);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6860:1: rule__RespuestaUnica__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6864:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6865:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6865:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6866:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_3_113555);
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


    // $ANTLR start "rule__RespuestaUnica__SeleccionadasAssignment_5_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6875:1: rule__RespuestaUnica__SeleccionadasAssignment_5_2 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__SeleccionadasAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6879:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6880:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6880:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6881:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__SeleccionadasAssignment_5_213586);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__SeleccionadasAssignment_5_2"


    // $ANTLR start "rule__RespuestaUnica__SeleccionadasAssignment_5_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6890:1: rule__RespuestaUnica__SeleccionadasAssignment_5_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaUnica__SeleccionadasAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6894:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6895:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6895:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6896:1: ruleEString
            {
             before(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaUnica__SeleccionadasAssignment_5_3_113617);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaUnica__SeleccionadasAssignment_5_3_1"


    // $ANTLR start "rule__RespuestaMultiple__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6905:1: rule__RespuestaMultiple__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6909:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6910:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6910:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6911:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_213648);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6920:1: rule__RespuestaMultiple__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6924:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6925:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6925:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6926:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_3_113679);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6935:1: rule__RespuestaMultiple__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6939:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6940:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6940:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6941:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_213710);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6950:1: rule__RespuestaMultiple__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6954:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6955:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6955:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6956:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_3_113741);
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


    // $ANTLR start "rule__RespuestaMultiple__SeleccionadasAssignment_5_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6965:1: rule__RespuestaMultiple__SeleccionadasAssignment_5_2 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__SeleccionadasAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6969:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6970:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6970:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6971:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__SeleccionadasAssignment_5_213772);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__SeleccionadasAssignment_5_2"


    // $ANTLR start "rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6980:1: rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1 : ( ruleEString ) ;
    public final void rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6984:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6985:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6985:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6986:1: ruleEString
            {
             before(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RespuestaMultiple__SeleccionadasAssignment_5_3_113803);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1"


    // $ANTLR start "rule__TextoLibre__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6995:1: rule__TextoLibre__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__TextoLibre__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:6999:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7000:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7000:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7001:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_213834);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7010:1: rule__TextoLibre__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__TextoLibre__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7014:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7015:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7015:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7016:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_3_113865);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7025:1: rule__TextoLibre__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__TextoLibre__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7029:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7030:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7030:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7031:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_213896);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7040:1: rule__TextoLibre__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__TextoLibre__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7044:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7045:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7045:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7046:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_3_113927);
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


    // $ANTLR start "rule__TextoLibre__SeleccionadasAssignment_5_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7055:1: rule__TextoLibre__SeleccionadasAssignment_5_2 : ( ruleEString ) ;
    public final void rule__TextoLibre__SeleccionadasAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7059:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7060:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7060:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7061:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__SeleccionadasAssignment_5_213958);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextoLibreAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__SeleccionadasAssignment_5_2"


    // $ANTLR start "rule__TextoLibre__SeleccionadasAssignment_5_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7070:1: rule__TextoLibre__SeleccionadasAssignment_5_3_1 : ( ruleEString ) ;
    public final void rule__TextoLibre__SeleccionadasAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7074:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7075:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7075:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7076:1: ruleEString
            {
             before(grammarAccess.getTextoLibreAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextoLibre__SeleccionadasAssignment_5_3_113989);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextoLibreAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextoLibre__SeleccionadasAssignment_5_3_1"


    // $ANTLR start "rule__Ordenacion__CorrectasAssignment_3_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7085:1: rule__Ordenacion__CorrectasAssignment_3_2 : ( ruleEString ) ;
    public final void rule__Ordenacion__CorrectasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7089:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7090:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7090:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7091:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_214020);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7100:1: rule__Ordenacion__CorrectasAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__Ordenacion__CorrectasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7104:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7105:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7105:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7106:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_3_114051);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7115:1: rule__Ordenacion__AlternativasAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Ordenacion__AlternativasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7119:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7120:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7120:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7121:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_214082);
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
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7130:1: rule__Ordenacion__AlternativasAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__Ordenacion__AlternativasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7134:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7135:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7135:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7136:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_3_114113);
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


    // $ANTLR start "rule__Ordenacion__SeleccionadasAssignment_5_2"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7145:1: rule__Ordenacion__SeleccionadasAssignment_5_2 : ( ruleEString ) ;
    public final void rule__Ordenacion__SeleccionadasAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7149:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7150:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7150:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7151:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__SeleccionadasAssignment_5_214144);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrdenacionAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__SeleccionadasAssignment_5_2"


    // $ANTLR start "rule__Ordenacion__SeleccionadasAssignment_5_3_1"
    // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7160:1: rule__Ordenacion__SeleccionadasAssignment_5_3_1 : ( ruleEString ) ;
    public final void rule__Ordenacion__SeleccionadasAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7164:1: ( ( ruleEString ) )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7165:1: ( ruleEString )
            {
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7165:1: ( ruleEString )
            // ../autoevaluacion.editor.ui/src-gen/autoevaluacion/ui/contentassist/antlr/internal/InternalAutoevaluacion.g:7166:1: ruleEString
            {
             before(grammarAccess.getOrdenacionAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ordenacion__SeleccionadasAssignment_5_3_114175);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrdenacionAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordenacion__SeleccionadasAssignment_5_3_1"

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
        public static final BitSet FOLLOW_rule__Ejercicio__Group__10__Impl_in_rule__Ejercicio__Group__101712 = new BitSet(new long[]{0x000000E200000000L});
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
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__5__Impl_in_rule__WizardAdaptativo__Group__54615 = new BitSet(new long[]{0x0000000044000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__6_in_rule__WizardAdaptativo__Group__54618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__PenalizacionAssignment_5_in_rule__WizardAdaptativo__Group__5__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__6__Impl_in_rule__WizardAdaptativo__Group__64675 = new BitSet(new long[]{0x0000000044000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__7_in_rule__WizardAdaptativo__Group__64678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__0_in_rule__WizardAdaptativo__Group__6__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__7__Impl_in_rule__WizardAdaptativo__Group__74736 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__8_in_rule__WizardAdaptativo__Group__74739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__WizardAdaptativo__Group__7__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__8__Impl_in_rule__WizardAdaptativo__Group__84798 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__9_in_rule__WizardAdaptativo__Group__84801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WizardAdaptativo__Group__8__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__9__Impl_in_rule__WizardAdaptativo__Group__94860 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__10_in_rule__WizardAdaptativo__Group__94863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_9_in_rule__WizardAdaptativo__Group__9__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__10__Impl_in_rule__WizardAdaptativo__Group__104920 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__11_in_rule__WizardAdaptativo__Group__104923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_10__0_in_rule__WizardAdaptativo__Group__10__Impl4950 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__11__Impl_in_rule__WizardAdaptativo__Group__114981 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__12_in_rule__WizardAdaptativo__Group__114984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WizardAdaptativo__Group__11__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group__12__Impl_in_rule__WizardAdaptativo__Group__125043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WizardAdaptativo__Group__12__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__0__Impl_in_rule__WizardAdaptativo__Group_6__05128 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__1_in_rule__WizardAdaptativo__Group_6__05131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__WizardAdaptativo__Group_6__0__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__1__Impl_in_rule__WizardAdaptativo__Group_6__15190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__2_in_rule__WizardAdaptativo__Group_6__15193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__WizardAdaptativo__Group_6__1__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__2__Impl_in_rule__WizardAdaptativo__Group_6__25252 = new BitSet(new long[]{0x0000000108000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__3_in_rule__WizardAdaptativo__Group_6__25255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_2_in_rule__WizardAdaptativo__Group_6__2__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__3__Impl_in_rule__WizardAdaptativo__Group_6__35312 = new BitSet(new long[]{0x0000000108000000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__4_in_rule__WizardAdaptativo__Group_6__35315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6_3__0_in_rule__WizardAdaptativo__Group_6__3__Impl5342 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6__4__Impl_in_rule__WizardAdaptativo__Group_6__45373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__WizardAdaptativo__Group_6__4__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6_3__0__Impl_in_rule__WizardAdaptativo__Group_6_3__05442 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6_3__1_in_rule__WizardAdaptativo__Group_6_3__05445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__WizardAdaptativo__Group_6_3__0__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_6_3__1__Impl_in_rule__WizardAdaptativo__Group_6_3__15504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_1_in_rule__WizardAdaptativo__Group_6_3__1__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_10__0__Impl_in_rule__WizardAdaptativo__Group_10__05565 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_10__1_in_rule__WizardAdaptativo__Group_10__05568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__WizardAdaptativo__Group_10__0__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__Group_10__1__Impl_in_rule__WizardAdaptativo__Group_10__15627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WizardAdaptativo__EjerciciosAssignment_10_1_in_rule__WizardAdaptativo__Group_10__1__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05688 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EInt__Group__0__Impl5720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__0__Impl_in_rule__RespuestaUnica__Group__05813 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__1_in_rule__RespuestaUnica__Group__05816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__1__Impl_in_rule__RespuestaUnica__Group__15874 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__2_in_rule__RespuestaUnica__Group__15877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__RespuestaUnica__Group__1__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__2__Impl_in_rule__RespuestaUnica__Group__25936 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__3_in_rule__RespuestaUnica__Group__25939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group__2__Impl5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__3__Impl_in_rule__RespuestaUnica__Group__35998 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__4_in_rule__RespuestaUnica__Group__36001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__0_in_rule__RespuestaUnica__Group__3__Impl6028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__4__Impl_in_rule__RespuestaUnica__Group__46059 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__5_in_rule__RespuestaUnica__Group__46062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__0_in_rule__RespuestaUnica__Group__4__Impl6089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__5__Impl_in_rule__RespuestaUnica__Group__56120 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__6_in_rule__RespuestaUnica__Group__56123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__0_in_rule__RespuestaUnica__Group__5__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group__6__Impl_in_rule__RespuestaUnica__Group__66181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaUnica__Group__6__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__0__Impl_in_rule__RespuestaUnica__Group_3__06254 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__1_in_rule__RespuestaUnica__Group_3__06257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__RespuestaUnica__Group_3__0__Impl6285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__1__Impl_in_rule__RespuestaUnica__Group_3__16316 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__2_in_rule__RespuestaUnica__Group_3__16319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group_3__1__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__2__Impl_in_rule__RespuestaUnica__Group_3__26378 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__3_in_rule__RespuestaUnica__Group_3__26381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_2_in_rule__RespuestaUnica__Group_3__2__Impl6408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__3__Impl_in_rule__RespuestaUnica__Group_3__36438 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__4_in_rule__RespuestaUnica__Group_3__36441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__0_in_rule__RespuestaUnica__Group_3__3__Impl6468 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3__4__Impl_in_rule__RespuestaUnica__Group_3__46499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaUnica__Group_3__4__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__0__Impl_in_rule__RespuestaUnica__Group_3_3__06568 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__1_in_rule__RespuestaUnica__Group_3_3__06571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaUnica__Group_3_3__0__Impl6599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_3_3__1__Impl_in_rule__RespuestaUnica__Group_3_3__16630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__CorrectasAssignment_3_3_1_in_rule__RespuestaUnica__Group_3_3__1__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__0__Impl_in_rule__RespuestaUnica__Group_4__06691 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__1_in_rule__RespuestaUnica__Group_4__06694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__RespuestaUnica__Group_4__0__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__1__Impl_in_rule__RespuestaUnica__Group_4__16753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__2_in_rule__RespuestaUnica__Group_4__16756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group_4__1__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__2__Impl_in_rule__RespuestaUnica__Group_4__26815 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__3_in_rule__RespuestaUnica__Group_4__26818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_2_in_rule__RespuestaUnica__Group_4__2__Impl6845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__3__Impl_in_rule__RespuestaUnica__Group_4__36875 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__4_in_rule__RespuestaUnica__Group_4__36878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__0_in_rule__RespuestaUnica__Group_4__3__Impl6905 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4__4__Impl_in_rule__RespuestaUnica__Group_4__46936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaUnica__Group_4__4__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__0__Impl_in_rule__RespuestaUnica__Group_4_3__07005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__1_in_rule__RespuestaUnica__Group_4_3__07008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaUnica__Group_4_3__0__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_4_3__1__Impl_in_rule__RespuestaUnica__Group_4_3__17067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__AlternativasAssignment_4_3_1_in_rule__RespuestaUnica__Group_4_3__1__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__0__Impl_in_rule__RespuestaUnica__Group_5__07128 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__1_in_rule__RespuestaUnica__Group_5__07131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__RespuestaUnica__Group_5__0__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__1__Impl_in_rule__RespuestaUnica__Group_5__17190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__2_in_rule__RespuestaUnica__Group_5__17193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaUnica__Group_5__1__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__2__Impl_in_rule__RespuestaUnica__Group_5__27252 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__3_in_rule__RespuestaUnica__Group_5__27255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__SeleccionadasAssignment_5_2_in_rule__RespuestaUnica__Group_5__2__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__3__Impl_in_rule__RespuestaUnica__Group_5__37312 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__4_in_rule__RespuestaUnica__Group_5__37315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5_3__0_in_rule__RespuestaUnica__Group_5__3__Impl7342 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5__4__Impl_in_rule__RespuestaUnica__Group_5__47373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaUnica__Group_5__4__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5_3__0__Impl_in_rule__RespuestaUnica__Group_5_3__07442 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5_3__1_in_rule__RespuestaUnica__Group_5_3__07445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaUnica__Group_5_3__0__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__Group_5_3__1__Impl_in_rule__RespuestaUnica__Group_5_3__17504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaUnica__SeleccionadasAssignment_5_3_1_in_rule__RespuestaUnica__Group_5_3__1__Impl7531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__0__Impl_in_rule__RespuestaMultiple__Group__07565 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__1_in_rule__RespuestaMultiple__Group__07568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__1__Impl_in_rule__RespuestaMultiple__Group__17626 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__2_in_rule__RespuestaMultiple__Group__17629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__RespuestaMultiple__Group__1__Impl7657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__2__Impl_in_rule__RespuestaMultiple__Group__27688 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__3_in_rule__RespuestaMultiple__Group__27691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group__2__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__3__Impl_in_rule__RespuestaMultiple__Group__37750 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__4_in_rule__RespuestaMultiple__Group__37753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__0_in_rule__RespuestaMultiple__Group__3__Impl7780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__4__Impl_in_rule__RespuestaMultiple__Group__47811 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__5_in_rule__RespuestaMultiple__Group__47814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__0_in_rule__RespuestaMultiple__Group__4__Impl7841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__5__Impl_in_rule__RespuestaMultiple__Group__57872 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__6_in_rule__RespuestaMultiple__Group__57875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__0_in_rule__RespuestaMultiple__Group__5__Impl7902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group__6__Impl_in_rule__RespuestaMultiple__Group__67933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaMultiple__Group__6__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__0__Impl_in_rule__RespuestaMultiple__Group_3__08006 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__1_in_rule__RespuestaMultiple__Group_3__08009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__RespuestaMultiple__Group_3__0__Impl8037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__1__Impl_in_rule__RespuestaMultiple__Group_3__18068 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__2_in_rule__RespuestaMultiple__Group_3__18071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group_3__1__Impl8099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__2__Impl_in_rule__RespuestaMultiple__Group_3__28130 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__3_in_rule__RespuestaMultiple__Group_3__28133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_2_in_rule__RespuestaMultiple__Group_3__2__Impl8160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__3__Impl_in_rule__RespuestaMultiple__Group_3__38190 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__4_in_rule__RespuestaMultiple__Group_3__38193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__0_in_rule__RespuestaMultiple__Group_3__3__Impl8220 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3__4__Impl_in_rule__RespuestaMultiple__Group_3__48251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaMultiple__Group_3__4__Impl8279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__0__Impl_in_rule__RespuestaMultiple__Group_3_3__08320 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__1_in_rule__RespuestaMultiple__Group_3_3__08323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaMultiple__Group_3_3__0__Impl8351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_3_3__1__Impl_in_rule__RespuestaMultiple__Group_3_3__18382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__CorrectasAssignment_3_3_1_in_rule__RespuestaMultiple__Group_3_3__1__Impl8409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__0__Impl_in_rule__RespuestaMultiple__Group_4__08443 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__1_in_rule__RespuestaMultiple__Group_4__08446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__RespuestaMultiple__Group_4__0__Impl8474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__1__Impl_in_rule__RespuestaMultiple__Group_4__18505 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__2_in_rule__RespuestaMultiple__Group_4__18508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group_4__1__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__2__Impl_in_rule__RespuestaMultiple__Group_4__28567 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__3_in_rule__RespuestaMultiple__Group_4__28570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_2_in_rule__RespuestaMultiple__Group_4__2__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__3__Impl_in_rule__RespuestaMultiple__Group_4__38627 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__4_in_rule__RespuestaMultiple__Group_4__38630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__0_in_rule__RespuestaMultiple__Group_4__3__Impl8657 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4__4__Impl_in_rule__RespuestaMultiple__Group_4__48688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaMultiple__Group_4__4__Impl8716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__0__Impl_in_rule__RespuestaMultiple__Group_4_3__08757 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__1_in_rule__RespuestaMultiple__Group_4_3__08760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaMultiple__Group_4_3__0__Impl8788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_4_3__1__Impl_in_rule__RespuestaMultiple__Group_4_3__18819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__AlternativasAssignment_4_3_1_in_rule__RespuestaMultiple__Group_4_3__1__Impl8846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__0__Impl_in_rule__RespuestaMultiple__Group_5__08880 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__1_in_rule__RespuestaMultiple__Group_5__08883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__RespuestaMultiple__Group_5__0__Impl8911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__1__Impl_in_rule__RespuestaMultiple__Group_5__18942 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__2_in_rule__RespuestaMultiple__Group_5__18945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RespuestaMultiple__Group_5__1__Impl8973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__2__Impl_in_rule__RespuestaMultiple__Group_5__29004 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__3_in_rule__RespuestaMultiple__Group_5__29007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__SeleccionadasAssignment_5_2_in_rule__RespuestaMultiple__Group_5__2__Impl9034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__3__Impl_in_rule__RespuestaMultiple__Group_5__39064 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__4_in_rule__RespuestaMultiple__Group_5__39067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5_3__0_in_rule__RespuestaMultiple__Group_5__3__Impl9094 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5__4__Impl_in_rule__RespuestaMultiple__Group_5__49125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RespuestaMultiple__Group_5__4__Impl9153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5_3__0__Impl_in_rule__RespuestaMultiple__Group_5_3__09194 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5_3__1_in_rule__RespuestaMultiple__Group_5_3__09197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RespuestaMultiple__Group_5_3__0__Impl9225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__Group_5_3__1__Impl_in_rule__RespuestaMultiple__Group_5_3__19256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RespuestaMultiple__SeleccionadasAssignment_5_3_1_in_rule__RespuestaMultiple__Group_5_3__1__Impl9283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__0__Impl_in_rule__TextoLibre__Group__09317 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__1_in_rule__TextoLibre__Group__09320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__1__Impl_in_rule__TextoLibre__Group__19378 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__2_in_rule__TextoLibre__Group__19381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__TextoLibre__Group__1__Impl9409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__2__Impl_in_rule__TextoLibre__Group__29440 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__3_in_rule__TextoLibre__Group__29443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group__2__Impl9471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__3__Impl_in_rule__TextoLibre__Group__39502 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__4_in_rule__TextoLibre__Group__39505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__0_in_rule__TextoLibre__Group__3__Impl9532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__4__Impl_in_rule__TextoLibre__Group__49563 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__5_in_rule__TextoLibre__Group__49566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__0_in_rule__TextoLibre__Group__4__Impl9593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__5__Impl_in_rule__TextoLibre__Group__59624 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__6_in_rule__TextoLibre__Group__59627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__0_in_rule__TextoLibre__Group__5__Impl9654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group__6__Impl_in_rule__TextoLibre__Group__69685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextoLibre__Group__6__Impl9713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__0__Impl_in_rule__TextoLibre__Group_3__09758 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__1_in_rule__TextoLibre__Group_3__09761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TextoLibre__Group_3__0__Impl9789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__1__Impl_in_rule__TextoLibre__Group_3__19820 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__2_in_rule__TextoLibre__Group_3__19823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group_3__1__Impl9851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__2__Impl_in_rule__TextoLibre__Group_3__29882 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__3_in_rule__TextoLibre__Group_3__29885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__CorrectasAssignment_3_2_in_rule__TextoLibre__Group_3__2__Impl9912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__3__Impl_in_rule__TextoLibre__Group_3__39942 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__4_in_rule__TextoLibre__Group_3__39945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__0_in_rule__TextoLibre__Group_3__3__Impl9972 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3__4__Impl_in_rule__TextoLibre__Group_3__410003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextoLibre__Group_3__4__Impl10031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__0__Impl_in_rule__TextoLibre__Group_3_3__010072 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__1_in_rule__TextoLibre__Group_3_3__010075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TextoLibre__Group_3_3__0__Impl10103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_3_3__1__Impl_in_rule__TextoLibre__Group_3_3__110134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__CorrectasAssignment_3_3_1_in_rule__TextoLibre__Group_3_3__1__Impl10161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__0__Impl_in_rule__TextoLibre__Group_4__010195 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__1_in_rule__TextoLibre__Group_4__010198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TextoLibre__Group_4__0__Impl10226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__1__Impl_in_rule__TextoLibre__Group_4__110257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__2_in_rule__TextoLibre__Group_4__110260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group_4__1__Impl10288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__2__Impl_in_rule__TextoLibre__Group_4__210319 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__3_in_rule__TextoLibre__Group_4__210322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__AlternativasAssignment_4_2_in_rule__TextoLibre__Group_4__2__Impl10349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__3__Impl_in_rule__TextoLibre__Group_4__310379 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__4_in_rule__TextoLibre__Group_4__310382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__0_in_rule__TextoLibre__Group_4__3__Impl10409 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4__4__Impl_in_rule__TextoLibre__Group_4__410440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextoLibre__Group_4__4__Impl10468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__0__Impl_in_rule__TextoLibre__Group_4_3__010509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__1_in_rule__TextoLibre__Group_4_3__010512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TextoLibre__Group_4_3__0__Impl10540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_4_3__1__Impl_in_rule__TextoLibre__Group_4_3__110571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__AlternativasAssignment_4_3_1_in_rule__TextoLibre__Group_4_3__1__Impl10598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__0__Impl_in_rule__TextoLibre__Group_5__010632 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__1_in_rule__TextoLibre__Group_5__010635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__TextoLibre__Group_5__0__Impl10663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__1__Impl_in_rule__TextoLibre__Group_5__110694 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__2_in_rule__TextoLibre__Group_5__110697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextoLibre__Group_5__1__Impl10725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__2__Impl_in_rule__TextoLibre__Group_5__210756 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__3_in_rule__TextoLibre__Group_5__210759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__SeleccionadasAssignment_5_2_in_rule__TextoLibre__Group_5__2__Impl10786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__3__Impl_in_rule__TextoLibre__Group_5__310816 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__4_in_rule__TextoLibre__Group_5__310819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5_3__0_in_rule__TextoLibre__Group_5__3__Impl10846 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5__4__Impl_in_rule__TextoLibre__Group_5__410877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextoLibre__Group_5__4__Impl10905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5_3__0__Impl_in_rule__TextoLibre__Group_5_3__010946 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5_3__1_in_rule__TextoLibre__Group_5_3__010949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TextoLibre__Group_5_3__0__Impl10977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__Group_5_3__1__Impl_in_rule__TextoLibre__Group_5_3__111008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextoLibre__SeleccionadasAssignment_5_3_1_in_rule__TextoLibre__Group_5_3__1__Impl11035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__0__Impl_in_rule__Ordenacion__Group__011069 = new BitSet(new long[]{0x000000E200000000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__1_in_rule__Ordenacion__Group__011072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__1__Impl_in_rule__Ordenacion__Group__111130 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__2_in_rule__Ordenacion__Group__111133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Ordenacion__Group__1__Impl11161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__2__Impl_in_rule__Ordenacion__Group__211192 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__3_in_rule__Ordenacion__Group__211195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group__2__Impl11223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__3__Impl_in_rule__Ordenacion__Group__311254 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__4_in_rule__Ordenacion__Group__311257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__0_in_rule__Ordenacion__Group__3__Impl11284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__4__Impl_in_rule__Ordenacion__Group__411315 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__5_in_rule__Ordenacion__Group__411318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__0_in_rule__Ordenacion__Group__4__Impl11345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__5__Impl_in_rule__Ordenacion__Group__511376 = new BitSet(new long[]{0x0000001C00080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__6_in_rule__Ordenacion__Group__511379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__0_in_rule__Ordenacion__Group__5__Impl11406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group__6__Impl_in_rule__Ordenacion__Group__611437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ordenacion__Group__6__Impl11465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__0__Impl_in_rule__Ordenacion__Group_3__011510 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__1_in_rule__Ordenacion__Group_3__011513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Ordenacion__Group_3__0__Impl11541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__1__Impl_in_rule__Ordenacion__Group_3__111572 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__2_in_rule__Ordenacion__Group_3__111575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group_3__1__Impl11603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__2__Impl_in_rule__Ordenacion__Group_3__211634 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__3_in_rule__Ordenacion__Group_3__211637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__CorrectasAssignment_3_2_in_rule__Ordenacion__Group_3__2__Impl11664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__3__Impl_in_rule__Ordenacion__Group_3__311694 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__4_in_rule__Ordenacion__Group_3__311697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__0_in_rule__Ordenacion__Group_3__3__Impl11724 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3__4__Impl_in_rule__Ordenacion__Group_3__411755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ordenacion__Group_3__4__Impl11783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__0__Impl_in_rule__Ordenacion__Group_3_3__011824 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__1_in_rule__Ordenacion__Group_3_3__011827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ordenacion__Group_3_3__0__Impl11855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_3_3__1__Impl_in_rule__Ordenacion__Group_3_3__111886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__CorrectasAssignment_3_3_1_in_rule__Ordenacion__Group_3_3__1__Impl11913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__0__Impl_in_rule__Ordenacion__Group_4__011947 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__1_in_rule__Ordenacion__Group_4__011950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Ordenacion__Group_4__0__Impl11978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__1__Impl_in_rule__Ordenacion__Group_4__112009 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__2_in_rule__Ordenacion__Group_4__112012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group_4__1__Impl12040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__2__Impl_in_rule__Ordenacion__Group_4__212071 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__3_in_rule__Ordenacion__Group_4__212074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__AlternativasAssignment_4_2_in_rule__Ordenacion__Group_4__2__Impl12101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__3__Impl_in_rule__Ordenacion__Group_4__312131 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__4_in_rule__Ordenacion__Group_4__312134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__0_in_rule__Ordenacion__Group_4__3__Impl12161 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4__4__Impl_in_rule__Ordenacion__Group_4__412192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ordenacion__Group_4__4__Impl12220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__0__Impl_in_rule__Ordenacion__Group_4_3__012261 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__1_in_rule__Ordenacion__Group_4_3__012264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ordenacion__Group_4_3__0__Impl12292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_4_3__1__Impl_in_rule__Ordenacion__Group_4_3__112323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__AlternativasAssignment_4_3_1_in_rule__Ordenacion__Group_4_3__1__Impl12350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__0__Impl_in_rule__Ordenacion__Group_5__012384 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__1_in_rule__Ordenacion__Group_5__012387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Ordenacion__Group_5__0__Impl12415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__1__Impl_in_rule__Ordenacion__Group_5__112446 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__2_in_rule__Ordenacion__Group_5__112449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Ordenacion__Group_5__1__Impl12477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__2__Impl_in_rule__Ordenacion__Group_5__212508 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__3_in_rule__Ordenacion__Group_5__212511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__SeleccionadasAssignment_5_2_in_rule__Ordenacion__Group_5__2__Impl12538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__3__Impl_in_rule__Ordenacion__Group_5__312568 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__4_in_rule__Ordenacion__Group_5__312571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5_3__0_in_rule__Ordenacion__Group_5__3__Impl12598 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5__4__Impl_in_rule__Ordenacion__Group_5__412629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ordenacion__Group_5__4__Impl12657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5_3__0__Impl_in_rule__Ordenacion__Group_5_3__012698 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5_3__1_in_rule__Ordenacion__Group_5_3__012701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ordenacion__Group_5_3__0__Impl12729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__Group_5_3__1__Impl_in_rule__Ordenacion__Group_5_3__112760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ordenacion__SeleccionadasAssignment_5_3_1_in_rule__Ordenacion__Group_5_3__1__Impl12787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__NameAssignment_112826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__EnunciadoAssignment_412857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Ejercicio__PuntuacionEjAssignment_5_112888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ejercicio__CategoriaAssignment_712919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Ejercicio__OrderAssignment_912950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuesta_in_rule__Ejercicio__RespuestaAssignment_1112981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Clasico__PuntuacionAssignment_313012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Clasico__PenalizacionAssignment_513043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_813074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Clasico__EjerciciosAssignment_9_113105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Wizard__PuntuacionAssignment_313136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Wizard__PenalizacionAssignment_513167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_813198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__Wizard__EjerciciosAssignment_9_113229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PuntuacionAssignment_313260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__WizardAdaptativo__PenalizacionAssignment_513291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_213326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WizardAdaptativo__EjerciciosRespondidosAssignment_6_3_113365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_913400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_rule__WizardAdaptativo__EjerciciosAssignment_10_113431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_213462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__CorrectasAssignment_3_3_113493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_213524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__AlternativasAssignment_4_3_113555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__SeleccionadasAssignment_5_213586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaUnica__SeleccionadasAssignment_5_3_113617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_213648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__CorrectasAssignment_3_3_113679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_213710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__AlternativasAssignment_4_3_113741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__SeleccionadasAssignment_5_213772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RespuestaMultiple__SeleccionadasAssignment_5_3_113803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_213834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__CorrectasAssignment_3_3_113865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_213896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__AlternativasAssignment_4_3_113927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__SeleccionadasAssignment_5_213958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextoLibre__SeleccionadasAssignment_5_3_113989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_214020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__CorrectasAssignment_3_3_114051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_214082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__AlternativasAssignment_4_3_114113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__SeleccionadasAssignment_5_214144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ordenacion__SeleccionadasAssignment_5_3_114175 = new BitSet(new long[]{0x0000000000000002L});
    }


}