package autoevaluacion.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import autoevaluacion.services.AutoevaluacionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutoevaluacionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ejercicio'", "'{'", "'enunciado'", "'puntuacionEj'", "'categoria'", "'order'", "'respuesta'", "'}'", "'-'", "'.'", "'E'", "'e'", "'Clasico'", "'puntuacion'", "'penalizacion'", "'ejercicios'", "','", "'Wizard'", "'WizardAdaptativo'", "'ejerciciosRespondidos'", "'('", "')'", "'RespuestaUnica'", "'correctas'", "'alternativas'", "'seleccionadas'", "'RespuestaMultiple'", "'TextoLibre'", "'Ordenacion'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g"; }



     	private AutoevaluacionGrammarAccess grammarAccess;
     	
        public InternalAutoevaluacionParser(TokenStream input, AutoevaluacionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Hoja";	
       	}
       	
       	@Override
       	protected AutoevaluacionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHoja"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:67:1: entryRuleHoja returns [EObject current=null] : iv_ruleHoja= ruleHoja EOF ;
    public final EObject entryRuleHoja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoja = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:68:2: (iv_ruleHoja= ruleHoja EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:69:2: iv_ruleHoja= ruleHoja EOF
            {
             newCompositeNode(grammarAccess.getHojaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHoja_in_entryRuleHoja75);
            iv_ruleHoja=ruleHoja();

            state._fsp--;

             current =iv_ruleHoja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHoja85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHoja"


    // $ANTLR start "ruleHoja"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:76:1: ruleHoja returns [EObject current=null] : (this_Clasico_0= ruleClasico | this_Wizard_1= ruleWizard | this_WizardAdaptativo_2= ruleWizardAdaptativo ) ;
    public final EObject ruleHoja() throws RecognitionException {
        EObject current = null;

        EObject this_Clasico_0 = null;

        EObject this_Wizard_1 = null;

        EObject this_WizardAdaptativo_2 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:79:28: ( (this_Clasico_0= ruleClasico | this_Wizard_1= ruleWizard | this_WizardAdaptativo_2= ruleWizardAdaptativo ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:80:1: (this_Clasico_0= ruleClasico | this_Wizard_1= ruleWizard | this_WizardAdaptativo_2= ruleWizardAdaptativo )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:80:1: (this_Clasico_0= ruleClasico | this_Wizard_1= ruleWizard | this_WizardAdaptativo_2= ruleWizardAdaptativo )
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
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:81:5: this_Clasico_0= ruleClasico
                    {
                     
                            newCompositeNode(grammarAccess.getHojaAccess().getClasicoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClasico_in_ruleHoja132);
                    this_Clasico_0=ruleClasico();

                    state._fsp--;

                     
                            current = this_Clasico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:91:5: this_Wizard_1= ruleWizard
                    {
                     
                            newCompositeNode(grammarAccess.getHojaAccess().getWizardParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWizard_in_ruleHoja159);
                    this_Wizard_1=ruleWizard();

                    state._fsp--;

                     
                            current = this_Wizard_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:101:5: this_WizardAdaptativo_2= ruleWizardAdaptativo
                    {
                     
                            newCompositeNode(grammarAccess.getHojaAccess().getWizardAdaptativoParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWizardAdaptativo_in_ruleHoja186);
                    this_WizardAdaptativo_2=ruleWizardAdaptativo();

                    state._fsp--;

                     
                            current = this_WizardAdaptativo_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHoja"


    // $ANTLR start "entryRuleRespuesta"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:117:1: entryRuleRespuesta returns [EObject current=null] : iv_ruleRespuesta= ruleRespuesta EOF ;
    public final EObject entryRuleRespuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuesta = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:118:2: (iv_ruleRespuesta= ruleRespuesta EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:119:2: iv_ruleRespuesta= ruleRespuesta EOF
            {
             newCompositeNode(grammarAccess.getRespuestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuesta_in_entryRuleRespuesta221);
            iv_ruleRespuesta=ruleRespuesta();

            state._fsp--;

             current =iv_ruleRespuesta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuesta231); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRespuesta"


    // $ANTLR start "ruleRespuesta"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:126:1: ruleRespuesta returns [EObject current=null] : (this_RespuestaUnica_0= ruleRespuestaUnica | this_RespuestaMultiple_1= ruleRespuestaMultiple | this_TextoLibre_2= ruleTextoLibre | this_Ordenacion_3= ruleOrdenacion ) ;
    public final EObject ruleRespuesta() throws RecognitionException {
        EObject current = null;

        EObject this_RespuestaUnica_0 = null;

        EObject this_RespuestaMultiple_1 = null;

        EObject this_TextoLibre_2 = null;

        EObject this_Ordenacion_3 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:129:28: ( (this_RespuestaUnica_0= ruleRespuestaUnica | this_RespuestaMultiple_1= ruleRespuestaMultiple | this_TextoLibre_2= ruleTextoLibre | this_Ordenacion_3= ruleOrdenacion ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:130:1: (this_RespuestaUnica_0= ruleRespuestaUnica | this_RespuestaMultiple_1= ruleRespuestaMultiple | this_TextoLibre_2= ruleTextoLibre | this_Ordenacion_3= ruleOrdenacion )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:130:1: (this_RespuestaUnica_0= ruleRespuestaUnica | this_RespuestaMultiple_1= ruleRespuestaMultiple | this_TextoLibre_2= ruleTextoLibre | this_Ordenacion_3= ruleOrdenacion )
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
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:131:5: this_RespuestaUnica_0= ruleRespuestaUnica
                    {
                     
                            newCompositeNode(grammarAccess.getRespuestaAccess().getRespuestaUnicaParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRespuestaUnica_in_ruleRespuesta278);
                    this_RespuestaUnica_0=ruleRespuestaUnica();

                    state._fsp--;

                     
                            current = this_RespuestaUnica_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:141:5: this_RespuestaMultiple_1= ruleRespuestaMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getRespuestaAccess().getRespuestaMultipleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRespuestaMultiple_in_ruleRespuesta305);
                    this_RespuestaMultiple_1=ruleRespuestaMultiple();

                    state._fsp--;

                     
                            current = this_RespuestaMultiple_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:151:5: this_TextoLibre_2= ruleTextoLibre
                    {
                     
                            newCompositeNode(grammarAccess.getRespuestaAccess().getTextoLibreParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTextoLibre_in_ruleRespuesta332);
                    this_TextoLibre_2=ruleTextoLibre();

                    state._fsp--;

                     
                            current = this_TextoLibre_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:161:5: this_Ordenacion_3= ruleOrdenacion
                    {
                     
                            newCompositeNode(grammarAccess.getRespuestaAccess().getOrdenacionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrdenacion_in_ruleRespuesta359);
                    this_Ordenacion_3=ruleOrdenacion();

                    state._fsp--;

                     
                            current = this_Ordenacion_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRespuesta"


    // $ANTLR start "entryRuleEjercicio"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:177:1: entryRuleEjercicio returns [EObject current=null] : iv_ruleEjercicio= ruleEjercicio EOF ;
    public final EObject entryRuleEjercicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEjercicio = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:178:2: (iv_ruleEjercicio= ruleEjercicio EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:179:2: iv_ruleEjercicio= ruleEjercicio EOF
            {
             newCompositeNode(grammarAccess.getEjercicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_entryRuleEjercicio394);
            iv_ruleEjercicio=ruleEjercicio();

            state._fsp--;

             current =iv_ruleEjercicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEjercicio404); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEjercicio"


    // $ANTLR start "ruleEjercicio"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:186:1: ruleEjercicio returns [EObject current=null] : (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' ) ;
    public final EObject ruleEjercicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_enunciado_4_0 = null;

        AntlrDatatypeRuleToken lv_puntuacionEj_6_0 = null;

        AntlrDatatypeRuleToken lv_categoria_8_0 = null;

        AntlrDatatypeRuleToken lv_order_10_0 = null;

        EObject lv_respuesta_12_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:189:28: ( (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:190:1: (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:190:1: (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:190:3: otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEjercicio441); 

                	newLeafNode(otherlv_0, grammarAccess.getEjercicioAccess().getEjercicioKeyword_0());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:194:1: ( (lv_name_1_0= ruleEString ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:195:1: (lv_name_1_0= ruleEString )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:195:1: (lv_name_1_0= ruleEString )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:196:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEjercicioAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEjercicio462);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEjercicioRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEjercicio474); 

                	newLeafNode(otherlv_2, grammarAccess.getEjercicioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEjercicio486); 

                	newLeafNode(otherlv_3, grammarAccess.getEjercicioAccess().getEnunciadoKeyword_3());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:220:1: ( (lv_enunciado_4_0= ruleEString ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:221:1: (lv_enunciado_4_0= ruleEString )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:221:1: (lv_enunciado_4_0= ruleEString )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:222:3: lv_enunciado_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEjercicioAccess().getEnunciadoEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEjercicio507);
            lv_enunciado_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEjercicioRule());
            	        }
                   		set(
                   			current, 
                   			"enunciado",
                    		lv_enunciado_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:238:2: (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:238:4: otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEjercicio520); 

                        	newLeafNode(otherlv_5, grammarAccess.getEjercicioAccess().getPuntuacionEjKeyword_5_0());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:242:1: ( (lv_puntuacionEj_6_0= ruleEDouble ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:243:1: (lv_puntuacionEj_6_0= ruleEDouble )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:243:1: (lv_puntuacionEj_6_0= ruleEDouble )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:244:3: lv_puntuacionEj_6_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getEjercicioAccess().getPuntuacionEjEDoubleParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleEjercicio541);
                    lv_puntuacionEj_6_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEjercicioRule());
                    	        }
                           		set(
                           			current, 
                           			"puntuacionEj",
                            		lv_puntuacionEj_6_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEjercicio555); 

                	newLeafNode(otherlv_7, grammarAccess.getEjercicioAccess().getCategoriaKeyword_6());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:264:1: ( (lv_categoria_8_0= ruleEString ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:265:1: (lv_categoria_8_0= ruleEString )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:265:1: (lv_categoria_8_0= ruleEString )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:266:3: lv_categoria_8_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEjercicioAccess().getCategoriaEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEjercicio576);
            lv_categoria_8_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEjercicioRule());
            	        }
                   		set(
                   			current, 
                   			"categoria",
                    		lv_categoria_8_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEjercicio588); 

                	newLeafNode(otherlv_9, grammarAccess.getEjercicioAccess().getOrderKeyword_8());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:286:1: ( (lv_order_10_0= ruleEInt ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:287:1: (lv_order_10_0= ruleEInt )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:287:1: (lv_order_10_0= ruleEInt )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:288:3: lv_order_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getEjercicioAccess().getOrderEIntParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEjercicio609);
            lv_order_10_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEjercicioRule());
            	        }
                   		set(
                   			current, 
                   			"order",
                    		lv_order_10_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEjercicio621); 

                	newLeafNode(otherlv_11, grammarAccess.getEjercicioAccess().getRespuestaKeyword_10());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:308:1: ( (lv_respuesta_12_0= ruleRespuesta ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:309:1: (lv_respuesta_12_0= ruleRespuesta )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:309:1: (lv_respuesta_12_0= ruleRespuesta )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:310:3: lv_respuesta_12_0= ruleRespuesta
            {
             
            	        newCompositeNode(grammarAccess.getEjercicioAccess().getRespuestaRespuestaParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRespuesta_in_ruleEjercicio642);
            lv_respuesta_12_0=ruleRespuesta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEjercicioRule());
            	        }
                   		set(
                   			current, 
                   			"respuesta",
                    		lv_respuesta_12_0, 
                    		"Respuesta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEjercicio654); 

                	newLeafNode(otherlv_13, grammarAccess.getEjercicioAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEjercicio"


    // $ANTLR start "entryRuleEDouble"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:338:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:339:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:340:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble691);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:347:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:350:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:351:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:351:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:351:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:351:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:352:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEDouble741); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:357:3: (this_INT_1= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:357:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble759); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDouble779); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble794); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:377:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:377:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:377:2: (kw= 'E' | kw= 'e' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==22) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:378:2: kw= 'E'
                            {
                            kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDouble814); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:385:2: kw= 'e'
                            {
                            kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEDouble833); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:390:2: (kw= '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:391:2: kw= '-'
                            {
                            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEDouble848); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble865); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleClasico"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:411:1: entryRuleClasico returns [EObject current=null] : iv_ruleClasico= ruleClasico EOF ;
    public final EObject entryRuleClasico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasico = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:412:2: (iv_ruleClasico= ruleClasico EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:413:2: iv_ruleClasico= ruleClasico EOF
            {
             newCompositeNode(grammarAccess.getClasicoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClasico_in_entryRuleClasico912);
            iv_ruleClasico=ruleClasico();

            state._fsp--;

             current =iv_ruleClasico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClasico922); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClasico"


    // $ANTLR start "ruleClasico"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:420:1: ruleClasico returns [EObject current=null] : (otherlv_0= 'Clasico' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleClasico() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_puntuacion_3_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_5_0 = null;

        EObject lv_ejercicios_8_0 = null;

        EObject lv_ejercicios_10_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:423:28: ( (otherlv_0= 'Clasico' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:424:1: (otherlv_0= 'Clasico' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:424:1: (otherlv_0= 'Clasico' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:424:3: otherlv_0= 'Clasico' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClasico959); 

                	newLeafNode(otherlv_0, grammarAccess.getClasicoAccess().getClasicoKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClasico971); 

                	newLeafNode(otherlv_1, grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClasico983); 

                	newLeafNode(otherlv_2, grammarAccess.getClasicoAccess().getPuntuacionKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:436:1: ( (lv_puntuacion_3_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:437:1: (lv_puntuacion_3_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:437:1: (lv_puntuacion_3_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:438:3: lv_puntuacion_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getClasicoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleClasico1004);
            lv_puntuacion_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClasicoRule());
            	        }
                   		set(
                   			current, 
                   			"puntuacion",
                    		lv_puntuacion_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleClasico1016); 

                	newLeafNode(otherlv_4, grammarAccess.getClasicoAccess().getPenalizacionKeyword_4());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:458:1: ( (lv_penalizacion_5_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:459:1: (lv_penalizacion_5_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:459:1: (lv_penalizacion_5_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:460:3: lv_penalizacion_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getClasicoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleClasico1037);
            lv_penalizacion_5_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClasicoRule());
            	        }
                   		set(
                   			current, 
                   			"penalizacion",
                    		lv_penalizacion_5_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleClasico1049); 

                	newLeafNode(otherlv_6, grammarAccess.getClasicoAccess().getEjerciciosKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClasico1061); 

                	newLeafNode(otherlv_7, grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_7());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:484:1: ( (lv_ejercicios_8_0= ruleEjercicio ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:485:1: (lv_ejercicios_8_0= ruleEjercicio )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:485:1: (lv_ejercicios_8_0= ruleEjercicio )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:486:3: lv_ejercicios_8_0= ruleEjercicio
            {
             
            	        newCompositeNode(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleClasico1082);
            lv_ejercicios_8_0=ruleEjercicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClasicoRule());
            	        }
                   		add(
                   			current, 
                   			"ejercicios",
                    		lv_ejercicios_8_0, 
                    		"Ejercicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:502:2: (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:502:4: otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleClasico1095); 

            	        	newLeafNode(otherlv_9, grammarAccess.getClasicoAccess().getCommaKeyword_9_0());
            	        
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:506:1: ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:507:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    {
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:507:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:508:3: lv_ejercicios_10_0= ruleEjercicio
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleClasico1116);
            	    lv_ejercicios_10_0=ruleEjercicio();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClasicoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ejercicios",
            	            		lv_ejercicios_10_0, 
            	            		"Ejercicio");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClasico1130); 

                	newLeafNode(otherlv_11, grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClasico1142); 

                	newLeafNode(otherlv_12, grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClasico"


    // $ANTLR start "entryRuleWizard"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:540:1: entryRuleWizard returns [EObject current=null] : iv_ruleWizard= ruleWizard EOF ;
    public final EObject entryRuleWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizard = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:541:2: (iv_ruleWizard= ruleWizard EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:542:2: iv_ruleWizard= ruleWizard EOF
            {
             newCompositeNode(grammarAccess.getWizardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWizard_in_entryRuleWizard1178);
            iv_ruleWizard=ruleWizard();

            state._fsp--;

             current =iv_ruleWizard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWizard1188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:549:1: ruleWizard returns [EObject current=null] : (otherlv_0= 'Wizard' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleWizard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_puntuacion_3_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_5_0 = null;

        EObject lv_ejercicios_8_0 = null;

        EObject lv_ejercicios_10_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:552:28: ( (otherlv_0= 'Wizard' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:553:1: (otherlv_0= 'Wizard' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:553:1: (otherlv_0= 'Wizard' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:553:3: otherlv_0= 'Wizard' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleWizard1225); 

                	newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizard1237); 

                	newLeafNode(otherlv_1, grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWizard1249); 

                	newLeafNode(otherlv_2, grammarAccess.getWizardAccess().getPuntuacionKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:565:1: ( (lv_puntuacion_3_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:566:1: (lv_puntuacion_3_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:566:1: (lv_puntuacion_3_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:567:3: lv_puntuacion_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizard1270);
            lv_puntuacion_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWizardRule());
            	        }
                   		set(
                   			current, 
                   			"puntuacion",
                    		lv_puntuacion_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleWizard1282); 

                	newLeafNode(otherlv_4, grammarAccess.getWizardAccess().getPenalizacionKeyword_4());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:587:1: ( (lv_penalizacion_5_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:588:1: (lv_penalizacion_5_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:588:1: (lv_penalizacion_5_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:589:3: lv_penalizacion_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizard1303);
            lv_penalizacion_5_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWizardRule());
            	        }
                   		set(
                   			current, 
                   			"penalizacion",
                    		lv_penalizacion_5_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleWizard1315); 

                	newLeafNode(otherlv_6, grammarAccess.getWizardAccess().getEjerciciosKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizard1327); 

                	newLeafNode(otherlv_7, grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_7());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:613:1: ( (lv_ejercicios_8_0= ruleEjercicio ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:614:1: (lv_ejercicios_8_0= ruleEjercicio )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:614:1: (lv_ejercicios_8_0= ruleEjercicio )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:615:3: lv_ejercicios_8_0= ruleEjercicio
            {
             
            	        newCompositeNode(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizard1348);
            lv_ejercicios_8_0=ruleEjercicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWizardRule());
            	        }
                   		add(
                   			current, 
                   			"ejercicios",
                    		lv_ejercicios_8_0, 
                    		"Ejercicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:631:2: (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:631:4: otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleWizard1361); 

            	        	newLeafNode(otherlv_9, grammarAccess.getWizardAccess().getCommaKeyword_9_0());
            	        
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:635:1: ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:636:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    {
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:636:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:637:3: lv_ejercicios_10_0= ruleEjercicio
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizard1382);
            	    lv_ejercicios_10_0=ruleEjercicio();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWizardRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ejercicios",
            	            		lv_ejercicios_10_0, 
            	            		"Ejercicio");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizard1396); 

                	newLeafNode(otherlv_11, grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizard1408); 

                	newLeafNode(otherlv_12, grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleWizardAdaptativo"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:669:1: entryRuleWizardAdaptativo returns [EObject current=null] : iv_ruleWizardAdaptativo= ruleWizardAdaptativo EOF ;
    public final EObject entryRuleWizardAdaptativo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizardAdaptativo = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:670:2: (iv_ruleWizardAdaptativo= ruleWizardAdaptativo EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:671:2: iv_ruleWizardAdaptativo= ruleWizardAdaptativo EOF
            {
             newCompositeNode(grammarAccess.getWizardAdaptativoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWizardAdaptativo_in_entryRuleWizardAdaptativo1444);
            iv_ruleWizardAdaptativo=ruleWizardAdaptativo();

            state._fsp--;

             current =iv_ruleWizardAdaptativo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWizardAdaptativo1454); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizardAdaptativo"


    // $ANTLR start "ruleWizardAdaptativo"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:678:1: ruleWizardAdaptativo returns [EObject current=null] : (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) (otherlv_6= 'ejerciciosRespondidos' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'ejercicios' otherlv_13= '{' ( (lv_ejercicios_14_0= ruleEjercicio ) ) (otherlv_15= ',' ( (lv_ejercicios_16_0= ruleEjercicio ) ) )* otherlv_17= '}' otherlv_18= '}' ) ;
    public final EObject ruleWizardAdaptativo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_puntuacion_3_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_5_0 = null;

        EObject lv_ejercicios_14_0 = null;

        EObject lv_ejercicios_16_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:681:28: ( (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) (otherlv_6= 'ejerciciosRespondidos' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'ejercicios' otherlv_13= '{' ( (lv_ejercicios_14_0= ruleEjercicio ) ) (otherlv_15= ',' ( (lv_ejercicios_16_0= ruleEjercicio ) ) )* otherlv_17= '}' otherlv_18= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:682:1: (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) (otherlv_6= 'ejerciciosRespondidos' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'ejercicios' otherlv_13= '{' ( (lv_ejercicios_14_0= ruleEjercicio ) ) (otherlv_15= ',' ( (lv_ejercicios_16_0= ruleEjercicio ) ) )* otherlv_17= '}' otherlv_18= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:682:1: (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) (otherlv_6= 'ejerciciosRespondidos' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'ejercicios' otherlv_13= '{' ( (lv_ejercicios_14_0= ruleEjercicio ) ) (otherlv_15= ',' ( (lv_ejercicios_16_0= ruleEjercicio ) ) )* otherlv_17= '}' otherlv_18= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:682:3: otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) (otherlv_6= 'ejerciciosRespondidos' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'ejercicios' otherlv_13= '{' ( (lv_ejercicios_14_0= ruleEjercicio ) ) (otherlv_15= ',' ( (lv_ejercicios_16_0= ruleEjercicio ) ) )* otherlv_17= '}' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleWizardAdaptativo1491); 

                	newLeafNode(otherlv_0, grammarAccess.getWizardAdaptativoAccess().getWizardAdaptativoKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizardAdaptativo1503); 

                	newLeafNode(otherlv_1, grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWizardAdaptativo1515); 

                	newLeafNode(otherlv_2, grammarAccess.getWizardAdaptativoAccess().getPuntuacionKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:694:1: ( (lv_puntuacion_3_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:695:1: (lv_puntuacion_3_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:695:1: (lv_puntuacion_3_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:696:3: lv_puntuacion_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1536);
            lv_puntuacion_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWizardAdaptativoRule());
            	        }
                   		set(
                   			current, 
                   			"puntuacion",
                    		lv_puntuacion_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleWizardAdaptativo1548); 

                	newLeafNode(otherlv_4, grammarAccess.getWizardAdaptativoAccess().getPenalizacionKeyword_4());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:716:1: ( (lv_penalizacion_5_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:717:1: (lv_penalizacion_5_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:717:1: (lv_penalizacion_5_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:718:3: lv_penalizacion_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1569);
            lv_penalizacion_5_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWizardAdaptativoRule());
            	        }
                   		set(
                   			current, 
                   			"penalizacion",
                    		lv_penalizacion_5_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:734:2: (otherlv_6= 'ejerciciosRespondidos' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:734:4: otherlv_6= 'ejerciciosRespondidos' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleWizardAdaptativo1582); 

                        	newLeafNode(otherlv_6, grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleWizardAdaptativo1594); 

                        	newLeafNode(otherlv_7, grammarAccess.getWizardAdaptativoAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:742:1: ( ( ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:743:1: ( ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:743:1: ( ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:744:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWizardAdaptativoRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWizardAdaptativo1617);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:757:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==27) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:757:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleWizardAdaptativo1630); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:761:1: ( ( ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:762:1: ( ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:762:1: ( ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:763:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWizardAdaptativoRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getEjerciciosRespondidosEjercicioCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWizardAdaptativo1653);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleWizardAdaptativo1667); 

                        	newLeafNode(otherlv_11, grammarAccess.getWizardAdaptativoAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleWizardAdaptativo1681); 

                	newLeafNode(otherlv_12, grammarAccess.getWizardAdaptativoAccess().getEjerciciosKeyword_7());
                
            otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizardAdaptativo1693); 

                	newLeafNode(otherlv_13, grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_8());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:788:1: ( (lv_ejercicios_14_0= ruleEjercicio ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:789:1: (lv_ejercicios_14_0= ruleEjercicio )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:789:1: (lv_ejercicios_14_0= ruleEjercicio )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:790:3: lv_ejercicios_14_0= ruleEjercicio
            {
             
            	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1714);
            lv_ejercicios_14_0=ruleEjercicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWizardAdaptativoRule());
            	        }
                   		add(
                   			current, 
                   			"ejercicios",
                    		lv_ejercicios_14_0, 
                    		"Ejercicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:806:2: (otherlv_15= ',' ( (lv_ejercicios_16_0= ruleEjercicio ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:806:4: otherlv_15= ',' ( (lv_ejercicios_16_0= ruleEjercicio ) )
            	    {
            	    otherlv_15=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleWizardAdaptativo1727); 

            	        	newLeafNode(otherlv_15, grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_10_0());
            	        
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:810:1: ( (lv_ejercicios_16_0= ruleEjercicio ) )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:811:1: (lv_ejercicios_16_0= ruleEjercicio )
            	    {
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:811:1: (lv_ejercicios_16_0= ruleEjercicio )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:812:3: lv_ejercicios_16_0= ruleEjercicio
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1748);
            	    lv_ejercicios_16_0=ruleEjercicio();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWizardAdaptativoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ejercicios",
            	            		lv_ejercicios_16_0, 
            	            		"Ejercicio");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizardAdaptativo1762); 

                	newLeafNode(otherlv_17, grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizardAdaptativo1774); 

                	newLeafNode(otherlv_18, grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizardAdaptativo"


    // $ANTLR start "entryRuleEString"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:844:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:845:2: (iv_ruleEString= ruleEString EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:846:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1811);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1822); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:853:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:856:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:857:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:857:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:857:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1862); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:865:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1888); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:880:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:881:2: (iv_ruleEInt= ruleEInt EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:882:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1934);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1945); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:889:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:892:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:893:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:893:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:893:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:893:2: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:894:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEInt1984); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2001); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleRespuestaUnica"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:914:1: entryRuleRespuestaUnica returns [EObject current=null] : iv_ruleRespuestaUnica= ruleRespuestaUnica EOF ;
    public final EObject entryRuleRespuestaUnica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuestaUnica = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:915:2: (iv_ruleRespuestaUnica= ruleRespuestaUnica EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:916:2: iv_ruleRespuestaUnica= ruleRespuestaUnica EOF
            {
             newCompositeNode(grammarAccess.getRespuestaUnicaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuestaUnica_in_entryRuleRespuestaUnica2046);
            iv_ruleRespuestaUnica=ruleRespuestaUnica();

            state._fsp--;

             current =iv_ruleRespuestaUnica; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuestaUnica2056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRespuestaUnica"


    // $ANTLR start "ruleRespuestaUnica"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:923:1: ruleRespuestaUnica returns [EObject current=null] : ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleRespuestaUnica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_17_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_19_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:926:28: ( ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:927:1: ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:927:1: ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:927:2: () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:927:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:928:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRespuestaUnica2102); 

                	newLeafNode(otherlv_1, grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaUnica2114); 

                	newLeafNode(otherlv_2, grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:941:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:941:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRespuestaUnica2127); 

                        	newLeafNode(otherlv_3, grammarAccess.getRespuestaUnicaAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaUnica2139); 

                        	newLeafNode(otherlv_4, grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:949:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:950:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:950:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:951:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2160);
                    lv_correctas_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRespuestaUnicaRule());
                    	        }
                           		add(
                           			current, 
                           			"correctas",
                            		lv_correctas_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:967:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:967:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaUnica2173); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:971:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:972:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:972:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:973:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2194);
                    	    lv_correctas_7_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRespuestaUnicaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"correctas",
                    	            		lv_correctas_7_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaUnica2208); 

                        	newLeafNode(otherlv_8, grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:993:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:993:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRespuestaUnica2223); 

                        	newLeafNode(otherlv_9, grammarAccess.getRespuestaUnicaAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaUnica2235); 

                        	newLeafNode(otherlv_10, grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1001:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1002:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1002:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1003:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2256);
                    lv_alternativas_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRespuestaUnicaRule());
                    	        }
                           		add(
                           			current, 
                           			"alternativas",
                            		lv_alternativas_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1019:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==27) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1019:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaUnica2269); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1023:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1024:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1024:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1025:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2290);
                    	    lv_alternativas_13_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRespuestaUnicaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"alternativas",
                    	            		lv_alternativas_13_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaUnica2304); 

                        	newLeafNode(otherlv_14, grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1045:3: (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1045:5: otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRespuestaUnica2319); 

                        	newLeafNode(otherlv_15, grammarAccess.getRespuestaUnicaAccess().getSeleccionadasKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaUnica2331); 

                        	newLeafNode(otherlv_16, grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1053:1: ( (lv_seleccionadas_17_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1054:1: (lv_seleccionadas_17_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1054:1: (lv_seleccionadas_17_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1055:3: lv_seleccionadas_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2352);
                    lv_seleccionadas_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRespuestaUnicaRule());
                    	        }
                           		add(
                           			current, 
                           			"seleccionadas",
                            		lv_seleccionadas_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1071:2: (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1071:4: otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaUnica2365); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1075:1: ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1076:1: (lv_seleccionadas_19_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1076:1: (lv_seleccionadas_19_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1077:3: lv_seleccionadas_19_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2386);
                    	    lv_seleccionadas_19_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRespuestaUnicaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"seleccionadas",
                    	            		lv_seleccionadas_19_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaUnica2400); 

                        	newLeafNode(otherlv_20, grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaUnica2414); 

                	newLeafNode(otherlv_21, grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRespuestaUnica"


    // $ANTLR start "entryRuleRespuestaMultiple"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1109:1: entryRuleRespuestaMultiple returns [EObject current=null] : iv_ruleRespuestaMultiple= ruleRespuestaMultiple EOF ;
    public final EObject entryRuleRespuestaMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuestaMultiple = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1110:2: (iv_ruleRespuestaMultiple= ruleRespuestaMultiple EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1111:2: iv_ruleRespuestaMultiple= ruleRespuestaMultiple EOF
            {
             newCompositeNode(grammarAccess.getRespuestaMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuestaMultiple_in_entryRuleRespuestaMultiple2450);
            iv_ruleRespuestaMultiple=ruleRespuestaMultiple();

            state._fsp--;

             current =iv_ruleRespuestaMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuestaMultiple2460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRespuestaMultiple"


    // $ANTLR start "ruleRespuestaMultiple"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1118:1: ruleRespuestaMultiple returns [EObject current=null] : ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleRespuestaMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_17_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_19_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1121:28: ( ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1122:1: ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1122:1: ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1122:2: () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1122:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1123:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRespuestaMultiple2506); 

                	newLeafNode(otherlv_1, grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaMultiple2518); 

                	newLeafNode(otherlv_2, grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1136:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1136:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRespuestaMultiple2531); 

                        	newLeafNode(otherlv_3, grammarAccess.getRespuestaMultipleAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaMultiple2543); 

                        	newLeafNode(otherlv_4, grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1144:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1145:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1145:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1146:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2564);
                    lv_correctas_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRespuestaMultipleRule());
                    	        }
                           		add(
                           			current, 
                           			"correctas",
                            		lv_correctas_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1162:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==27) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1162:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaMultiple2577); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1166:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1167:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1167:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1168:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2598);
                    	    lv_correctas_7_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRespuestaMultipleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"correctas",
                    	            		lv_correctas_7_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaMultiple2612); 

                        	newLeafNode(otherlv_8, grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1188:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1188:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRespuestaMultiple2627); 

                        	newLeafNode(otherlv_9, grammarAccess.getRespuestaMultipleAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaMultiple2639); 

                        	newLeafNode(otherlv_10, grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1196:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1197:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1197:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1198:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2660);
                    lv_alternativas_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRespuestaMultipleRule());
                    	        }
                           		add(
                           			current, 
                           			"alternativas",
                            		lv_alternativas_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1214:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==27) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1214:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaMultiple2673); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1218:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1219:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1219:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1220:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2694);
                    	    lv_alternativas_13_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRespuestaMultipleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"alternativas",
                    	            		lv_alternativas_13_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaMultiple2708); 

                        	newLeafNode(otherlv_14, grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1240:3: (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1240:5: otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRespuestaMultiple2723); 

                        	newLeafNode(otherlv_15, grammarAccess.getRespuestaMultipleAccess().getSeleccionadasKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaMultiple2735); 

                        	newLeafNode(otherlv_16, grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1248:1: ( (lv_seleccionadas_17_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1249:1: (lv_seleccionadas_17_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1249:1: (lv_seleccionadas_17_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1250:3: lv_seleccionadas_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2756);
                    lv_seleccionadas_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRespuestaMultipleRule());
                    	        }
                           		add(
                           			current, 
                           			"seleccionadas",
                            		lv_seleccionadas_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1266:2: (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==27) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1266:4: otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaMultiple2769); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1270:1: ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1271:1: (lv_seleccionadas_19_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1271:1: (lv_seleccionadas_19_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1272:3: lv_seleccionadas_19_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2790);
                    	    lv_seleccionadas_19_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRespuestaMultipleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"seleccionadas",
                    	            		lv_seleccionadas_19_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaMultiple2804); 

                        	newLeafNode(otherlv_20, grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaMultiple2818); 

                	newLeafNode(otherlv_21, grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRespuestaMultiple"


    // $ANTLR start "entryRuleTextoLibre"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1304:1: entryRuleTextoLibre returns [EObject current=null] : iv_ruleTextoLibre= ruleTextoLibre EOF ;
    public final EObject entryRuleTextoLibre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextoLibre = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1305:2: (iv_ruleTextoLibre= ruleTextoLibre EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1306:2: iv_ruleTextoLibre= ruleTextoLibre EOF
            {
             newCompositeNode(grammarAccess.getTextoLibreRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextoLibre_in_entryRuleTextoLibre2854);
            iv_ruleTextoLibre=ruleTextoLibre();

            state._fsp--;

             current =iv_ruleTextoLibre; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextoLibre2864); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextoLibre"


    // $ANTLR start "ruleTextoLibre"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1313:1: ruleTextoLibre returns [EObject current=null] : ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleTextoLibre() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_17_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_19_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1316:28: ( ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1317:1: ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1317:1: ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1317:2: () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1317:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1318:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextoLibreAccess().getTextoLibreAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleTextoLibre2910); 

                	newLeafNode(otherlv_1, grammarAccess.getTextoLibreAccess().getTextoLibreKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextoLibre2922); 

                	newLeafNode(otherlv_2, grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1331:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1331:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTextoLibre2935); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextoLibreAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextoLibre2947); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1339:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1340:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1340:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1341:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre2968);
                    lv_correctas_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextoLibreRule());
                    	        }
                           		add(
                           			current, 
                           			"correctas",
                            		lv_correctas_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1357:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==27) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1357:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTextoLibre2981); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTextoLibreAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1361:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1362:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1362:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1363:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre3002);
                    	    lv_correctas_7_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTextoLibreRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"correctas",
                    	            		lv_correctas_7_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextoLibre3016); 

                        	newLeafNode(otherlv_8, grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1383:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1383:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTextoLibre3031); 

                        	newLeafNode(otherlv_9, grammarAccess.getTextoLibreAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextoLibre3043); 

                        	newLeafNode(otherlv_10, grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1391:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1392:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1392:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1393:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre3064);
                    lv_alternativas_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextoLibreRule());
                    	        }
                           		add(
                           			current, 
                           			"alternativas",
                            		lv_alternativas_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1409:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==27) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1409:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTextoLibre3077); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTextoLibreAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1413:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1414:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1414:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1415:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre3098);
                    	    lv_alternativas_13_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTextoLibreRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"alternativas",
                    	            		lv_alternativas_13_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextoLibre3112); 

                        	newLeafNode(otherlv_14, grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1435:3: (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1435:5: otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTextoLibre3127); 

                        	newLeafNode(otherlv_15, grammarAccess.getTextoLibreAccess().getSeleccionadasKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextoLibre3139); 

                        	newLeafNode(otherlv_16, grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1443:1: ( (lv_seleccionadas_17_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1444:1: (lv_seleccionadas_17_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1444:1: (lv_seleccionadas_17_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1445:3: lv_seleccionadas_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre3160);
                    lv_seleccionadas_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextoLibreRule());
                    	        }
                           		add(
                           			current, 
                           			"seleccionadas",
                            		lv_seleccionadas_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1461:2: (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==27) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1461:4: otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTextoLibre3173); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getTextoLibreAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1465:1: ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1466:1: (lv_seleccionadas_19_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1466:1: (lv_seleccionadas_19_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1467:3: lv_seleccionadas_19_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre3194);
                    	    lv_seleccionadas_19_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTextoLibreRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"seleccionadas",
                    	            		lv_seleccionadas_19_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextoLibre3208); 

                        	newLeafNode(otherlv_20, grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextoLibre3222); 

                	newLeafNode(otherlv_21, grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextoLibre"


    // $ANTLR start "entryRuleOrdenacion"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1499:1: entryRuleOrdenacion returns [EObject current=null] : iv_ruleOrdenacion= ruleOrdenacion EOF ;
    public final EObject entryRuleOrdenacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdenacion = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1500:2: (iv_ruleOrdenacion= ruleOrdenacion EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1501:2: iv_ruleOrdenacion= ruleOrdenacion EOF
            {
             newCompositeNode(grammarAccess.getOrdenacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrdenacion_in_entryRuleOrdenacion3258);
            iv_ruleOrdenacion=ruleOrdenacion();

            state._fsp--;

             current =iv_ruleOrdenacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrdenacion3268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrdenacion"


    // $ANTLR start "ruleOrdenacion"
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1508:1: ruleOrdenacion returns [EObject current=null] : ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleOrdenacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_17_0 = null;

        AntlrDatatypeRuleToken lv_seleccionadas_19_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1511:28: ( ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1512:1: ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1512:1: ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1512:2: () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1512:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1513:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrdenacionAccess().getOrdenacionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOrdenacion3314); 

                	newLeafNode(otherlv_1, grammarAccess.getOrdenacionAccess().getOrdenacionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdenacion3326); 

                	newLeafNode(otherlv_2, grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1526:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1526:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOrdenacion3339); 

                        	newLeafNode(otherlv_3, grammarAccess.getOrdenacionAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdenacion3351); 

                        	newLeafNode(otherlv_4, grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1534:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1535:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1535:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1536:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3372);
                    lv_correctas_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrdenacionRule());
                    	        }
                           		add(
                           			current, 
                           			"correctas",
                            		lv_correctas_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1552:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1552:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrdenacion3385); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getOrdenacionAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1556:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1557:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1557:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1558:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3406);
                    	    lv_correctas_7_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrdenacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"correctas",
                    	            		lv_correctas_7_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdenacion3420); 

                        	newLeafNode(otherlv_8, grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1578:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1578:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOrdenacion3435); 

                        	newLeafNode(otherlv_9, grammarAccess.getOrdenacionAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdenacion3447); 

                        	newLeafNode(otherlv_10, grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1586:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1587:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1587:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1588:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3468);
                    lv_alternativas_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrdenacionRule());
                    	        }
                           		add(
                           			current, 
                           			"alternativas",
                            		lv_alternativas_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1604:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==27) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1604:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrdenacion3481); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getOrdenacionAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1608:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1609:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1609:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1610:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3502);
                    	    lv_alternativas_13_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrdenacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"alternativas",
                    	            		lv_alternativas_13_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdenacion3516); 

                        	newLeafNode(otherlv_14, grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1630:3: (otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1630:5: otherlv_15= 'seleccionadas' otherlv_16= '{' ( (lv_seleccionadas_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOrdenacion3531); 

                        	newLeafNode(otherlv_15, grammarAccess.getOrdenacionAccess().getSeleccionadasKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdenacion3543); 

                        	newLeafNode(otherlv_16, grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1638:1: ( (lv_seleccionadas_17_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1639:1: (lv_seleccionadas_17_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1639:1: (lv_seleccionadas_17_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1640:3: lv_seleccionadas_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getSeleccionadasEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3564);
                    lv_seleccionadas_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrdenacionRule());
                    	        }
                           		add(
                           			current, 
                           			"seleccionadas",
                            		lv_seleccionadas_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1656:2: (otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1656:4: otherlv_18= ',' ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrdenacion3577); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getOrdenacionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1660:1: ( (lv_seleccionadas_19_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1661:1: (lv_seleccionadas_19_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1661:1: (lv_seleccionadas_19_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1662:3: lv_seleccionadas_19_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getSeleccionadasEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3598);
                    	    lv_seleccionadas_19_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrdenacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"seleccionadas",
                    	            		lv_seleccionadas_19_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdenacion3612); 

                        	newLeafNode(otherlv_20, grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdenacion3626); 

                	newLeafNode(otherlv_21, grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrdenacion"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleHoja_in_entryRuleHoja75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHoja85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasico_in_ruleHoja132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizard_in_ruleHoja159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizardAdaptativo_in_ruleHoja186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuesta_in_entryRuleRespuesta221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuesta231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaUnica_in_ruleRespuesta278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaMultiple_in_ruleRespuesta305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextoLibre_in_ruleRespuesta332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrdenacion_in_ruleRespuesta359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEjercicio_in_entryRuleEjercicio394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEjercicio404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEjercicio441 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEjercicio462 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEjercicio474 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEjercicio486 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEjercicio507 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleEjercicio520 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleEjercicio541 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEjercicio555 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEjercicio576 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEjercicio588 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEjercicio609 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEjercicio621 = new BitSet(new long[]{0x000000E200000000L});
        public static final BitSet FOLLOW_ruleRespuesta_in_ruleEjercicio642 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEjercicio654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEDouble741 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble759 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEDouble779 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble794 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_21_in_ruleEDouble814 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_22_in_ruleEDouble833 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_19_in_ruleEDouble848 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasico_in_entryRuleClasico912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClasico922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleClasico959 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClasico971 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleClasico983 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleClasico1004 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleClasico1016 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleClasico1037 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleClasico1049 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClasico1061 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleClasico1082 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleClasico1095 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleClasico1116 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleClasico1130 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleClasico1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizard_in_entryRuleWizard1178 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWizard1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleWizard1225 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizard1237 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleWizard1249 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizard1270 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleWizard1282 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizard1303 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleWizard1315 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizard1327 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizard1348 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleWizard1361 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizard1382 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleWizard1396 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWizard1408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizardAdaptativo_in_entryRuleWizardAdaptativo1444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWizardAdaptativo1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleWizardAdaptativo1491 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizardAdaptativo1503 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleWizardAdaptativo1515 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1536 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleWizardAdaptativo1548 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1569 = new BitSet(new long[]{0x0000000044000000L});
        public static final BitSet FOLLOW_30_in_ruleWizardAdaptativo1582 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleWizardAdaptativo1594 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWizardAdaptativo1617 = new BitSet(new long[]{0x0000000108000000L});
        public static final BitSet FOLLOW_27_in_ruleWizardAdaptativo1630 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWizardAdaptativo1653 = new BitSet(new long[]{0x0000000108000000L});
        public static final BitSet FOLLOW_32_in_ruleWizardAdaptativo1667 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleWizardAdaptativo1681 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizardAdaptativo1693 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1714 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleWizardAdaptativo1727 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1748 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleWizardAdaptativo1762 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWizardAdaptativo1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1811 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEInt1984 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaUnica_in_entryRuleRespuestaUnica2046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuestaUnica2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleRespuestaUnica2102 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaUnica2114 = new BitSet(new long[]{0x0000001C00040000L});
        public static final BitSet FOLLOW_34_in_ruleRespuestaUnica2127 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaUnica2139 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2160 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaUnica2173 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2194 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaUnica2208 = new BitSet(new long[]{0x0000001800040000L});
        public static final BitSet FOLLOW_35_in_ruleRespuestaUnica2223 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaUnica2235 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2256 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaUnica2269 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2290 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaUnica2304 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_36_in_ruleRespuestaUnica2319 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaUnica2331 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2352 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaUnica2365 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2386 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaUnica2400 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaUnica2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaMultiple_in_entryRuleRespuestaMultiple2450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuestaMultiple2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleRespuestaMultiple2506 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaMultiple2518 = new BitSet(new long[]{0x0000001C00040000L});
        public static final BitSet FOLLOW_34_in_ruleRespuestaMultiple2531 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaMultiple2543 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2564 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaMultiple2577 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2598 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaMultiple2612 = new BitSet(new long[]{0x0000001800040000L});
        public static final BitSet FOLLOW_35_in_ruleRespuestaMultiple2627 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaMultiple2639 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2660 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaMultiple2673 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2694 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaMultiple2708 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_36_in_ruleRespuestaMultiple2723 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaMultiple2735 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2756 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaMultiple2769 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2790 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaMultiple2804 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaMultiple2818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextoLibre_in_entryRuleTextoLibre2854 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextoLibre2864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleTextoLibre2910 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextoLibre2922 = new BitSet(new long[]{0x0000001C00040000L});
        public static final BitSet FOLLOW_34_in_ruleTextoLibre2935 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextoLibre2947 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre2968 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleTextoLibre2981 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre3002 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleTextoLibre3016 = new BitSet(new long[]{0x0000001800040000L});
        public static final BitSet FOLLOW_35_in_ruleTextoLibre3031 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextoLibre3043 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre3064 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleTextoLibre3077 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre3098 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleTextoLibre3112 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_36_in_ruleTextoLibre3127 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextoLibre3139 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre3160 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleTextoLibre3173 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre3194 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleTextoLibre3208 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTextoLibre3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrdenacion_in_entryRuleOrdenacion3258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdenacion3268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleOrdenacion3314 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdenacion3326 = new BitSet(new long[]{0x0000001C00040000L});
        public static final BitSet FOLLOW_34_in_ruleOrdenacion3339 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdenacion3351 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3372 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleOrdenacion3385 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3406 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdenacion3420 = new BitSet(new long[]{0x0000001800040000L});
        public static final BitSet FOLLOW_35_in_ruleOrdenacion3435 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdenacion3447 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3468 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleOrdenacion3481 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3502 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdenacion3516 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_36_in_ruleOrdenacion3531 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdenacion3543 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3564 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleOrdenacion3577 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3598 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdenacion3612 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdenacion3626 = new BitSet(new long[]{0x0000000000000002L});
    }


}