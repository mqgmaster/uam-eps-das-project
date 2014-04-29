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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ejercicio'", "'{'", "'enunciado'", "'puntuacionEj'", "'categoria'", "'order'", "'respuesta'", "'}'", "'-'", "'.'", "'E'", "'e'", "'Clasico'", "'puntuacion'", "'penalizacion'", "'ejercicios'", "','", "'Wizard'", "'WizardAdaptativo'", "'RespuestaUnica'", "'correctas'", "'alternativas'", "'RespuestaMultiple'", "'TextoLibre'", "'Ordenacion'"
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
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:186:1: ruleEjercicio returns [EObject current=null] : (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? (otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) )? otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' ) ;
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
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:189:28: ( (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? (otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) )? otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:190:1: (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? (otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) )? otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:190:1: (otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? (otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) )? otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:190:3: otherlv_0= 'Ejercicio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) (otherlv_5= 'puntuacionEj' ( (lv_puntuacionEj_6_0= ruleEDouble ) ) )? (otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) )? otherlv_9= 'order' ( (lv_order_10_0= ruleEInt ) ) otherlv_11= 'respuesta' ( (lv_respuesta_12_0= ruleRespuesta ) ) otherlv_13= '}'
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

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:260:4: (otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:260:6: otherlv_7= 'categoria' ( (lv_categoria_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEjercicio556); 

                        	newLeafNode(otherlv_7, grammarAccess.getEjercicioAccess().getCategoriaKeyword_6_0());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:264:1: ( (lv_categoria_8_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:265:1: (lv_categoria_8_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:265:1: (lv_categoria_8_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:266:3: lv_categoria_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEjercicioAccess().getCategoriaEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEjercicio577);
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


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEjercicio591); 

                	newLeafNode(otherlv_9, grammarAccess.getEjercicioAccess().getOrderKeyword_7());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:286:1: ( (lv_order_10_0= ruleEInt ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:287:1: (lv_order_10_0= ruleEInt )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:287:1: (lv_order_10_0= ruleEInt )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:288:3: lv_order_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getEjercicioAccess().getOrderEIntParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEjercicio612);
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

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEjercicio624); 

                	newLeafNode(otherlv_11, grammarAccess.getEjercicioAccess().getRespuestaKeyword_9());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:308:1: ( (lv_respuesta_12_0= ruleRespuesta ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:309:1: (lv_respuesta_12_0= ruleRespuesta )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:309:1: (lv_respuesta_12_0= ruleRespuesta )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:310:3: lv_respuesta_12_0= ruleRespuesta
            {
             
            	        newCompositeNode(grammarAccess.getEjercicioAccess().getRespuestaRespuestaParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRespuesta_in_ruleEjercicio645);
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

            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEjercicio657); 

                	newLeafNode(otherlv_13, grammarAccess.getEjercicioAccess().getRightCurlyBracketKeyword_11());
                

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
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble694);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble705); 

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
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:352:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEDouble744); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:357:3: (this_INT_1= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:357:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble762); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDouble782); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble797); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:377:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:377:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:377:2: (kw= 'E' | kw= 'e' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==22) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:378:2: kw= 'E'
                            {
                            kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDouble817); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:385:2: kw= 'e'
                            {
                            kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEDouble836); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:390:2: (kw= '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:391:2: kw= '-'
                            {
                            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEDouble851); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble868); 

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
            pushFollow(FollowSets000.FOLLOW_ruleClasico_in_entryRuleClasico915);
            iv_ruleClasico=ruleClasico();

            state._fsp--;

             current =iv_ruleClasico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClasico925); 

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
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClasico962); 

                	newLeafNode(otherlv_0, grammarAccess.getClasicoAccess().getClasicoKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClasico974); 

                	newLeafNode(otherlv_1, grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClasico986); 

                	newLeafNode(otherlv_2, grammarAccess.getClasicoAccess().getPuntuacionKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:436:1: ( (lv_puntuacion_3_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:437:1: (lv_puntuacion_3_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:437:1: (lv_puntuacion_3_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:438:3: lv_puntuacion_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getClasicoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleClasico1007);
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

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleClasico1019); 

                	newLeafNode(otherlv_4, grammarAccess.getClasicoAccess().getPenalizacionKeyword_4());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:458:1: ( (lv_penalizacion_5_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:459:1: (lv_penalizacion_5_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:459:1: (lv_penalizacion_5_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:460:3: lv_penalizacion_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getClasicoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleClasico1040);
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

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleClasico1052); 

                	newLeafNode(otherlv_6, grammarAccess.getClasicoAccess().getEjerciciosKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClasico1064); 

                	newLeafNode(otherlv_7, grammarAccess.getClasicoAccess().getLeftCurlyBracketKeyword_7());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:484:1: ( (lv_ejercicios_8_0= ruleEjercicio ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:485:1: (lv_ejercicios_8_0= ruleEjercicio )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:485:1: (lv_ejercicios_8_0= ruleEjercicio )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:486:3: lv_ejercicios_8_0= ruleEjercicio
            {
             
            	        newCompositeNode(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleClasico1085);
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
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:502:4: otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleClasico1098); 

            	        	newLeafNode(otherlv_9, grammarAccess.getClasicoAccess().getCommaKeyword_9_0());
            	        
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:506:1: ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:507:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    {
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:507:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:508:3: lv_ejercicios_10_0= ruleEjercicio
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClasicoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleClasico1119);
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
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClasico1133); 

                	newLeafNode(otherlv_11, grammarAccess.getClasicoAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClasico1145); 

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
            pushFollow(FollowSets000.FOLLOW_ruleWizard_in_entryRuleWizard1181);
            iv_ruleWizard=ruleWizard();

            state._fsp--;

             current =iv_ruleWizard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWizard1191); 

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
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleWizard1228); 

                	newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizard1240); 

                	newLeafNode(otherlv_1, grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWizard1252); 

                	newLeafNode(otherlv_2, grammarAccess.getWizardAccess().getPuntuacionKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:565:1: ( (lv_puntuacion_3_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:566:1: (lv_puntuacion_3_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:566:1: (lv_puntuacion_3_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:567:3: lv_puntuacion_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizard1273);
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

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleWizard1285); 

                	newLeafNode(otherlv_4, grammarAccess.getWizardAccess().getPenalizacionKeyword_4());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:587:1: ( (lv_penalizacion_5_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:588:1: (lv_penalizacion_5_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:588:1: (lv_penalizacion_5_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:589:3: lv_penalizacion_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizard1306);
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

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleWizard1318); 

                	newLeafNode(otherlv_6, grammarAccess.getWizardAccess().getEjerciciosKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizard1330); 

                	newLeafNode(otherlv_7, grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_7());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:613:1: ( (lv_ejercicios_8_0= ruleEjercicio ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:614:1: (lv_ejercicios_8_0= ruleEjercicio )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:614:1: (lv_ejercicios_8_0= ruleEjercicio )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:615:3: lv_ejercicios_8_0= ruleEjercicio
            {
             
            	        newCompositeNode(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizard1351);
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
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:631:4: otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleWizard1364); 

            	        	newLeafNode(otherlv_9, grammarAccess.getWizardAccess().getCommaKeyword_9_0());
            	        
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:635:1: ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:636:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    {
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:636:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:637:3: lv_ejercicios_10_0= ruleEjercicio
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWizardAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizard1385);
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
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizard1399); 

                	newLeafNode(otherlv_11, grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizard1411); 

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
            pushFollow(FollowSets000.FOLLOW_ruleWizardAdaptativo_in_entryRuleWizardAdaptativo1447);
            iv_ruleWizardAdaptativo=ruleWizardAdaptativo();

            state._fsp--;

             current =iv_ruleWizardAdaptativo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWizardAdaptativo1457); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:678:1: ruleWizardAdaptativo returns [EObject current=null] : (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
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
        AntlrDatatypeRuleToken lv_puntuacion_3_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_5_0 = null;

        EObject lv_ejercicios_8_0 = null;

        EObject lv_ejercicios_10_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:681:28: ( (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:682:1: (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:682:1: (otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:682:3: otherlv_0= 'WizardAdaptativo' otherlv_1= '{' otherlv_2= 'puntuacion' ( (lv_puntuacion_3_0= ruleEDouble ) ) otherlv_4= 'penalizacion' ( (lv_penalizacion_5_0= ruleEDouble ) ) otherlv_6= 'ejercicios' otherlv_7= '{' ( (lv_ejercicios_8_0= ruleEjercicio ) ) (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleWizardAdaptativo1494); 

                	newLeafNode(otherlv_0, grammarAccess.getWizardAdaptativoAccess().getWizardAdaptativoKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizardAdaptativo1506); 

                	newLeafNode(otherlv_1, grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWizardAdaptativo1518); 

                	newLeafNode(otherlv_2, grammarAccess.getWizardAdaptativoAccess().getPuntuacionKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:694:1: ( (lv_puntuacion_3_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:695:1: (lv_puntuacion_3_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:695:1: (lv_puntuacion_3_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:696:3: lv_puntuacion_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getPuntuacionEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1539);
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

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleWizardAdaptativo1551); 

                	newLeafNode(otherlv_4, grammarAccess.getWizardAdaptativoAccess().getPenalizacionKeyword_4());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:716:1: ( (lv_penalizacion_5_0= ruleEDouble ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:717:1: (lv_penalizacion_5_0= ruleEDouble )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:717:1: (lv_penalizacion_5_0= ruleEDouble )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:718:3: lv_penalizacion_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getPenalizacionEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1572);
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

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleWizardAdaptativo1584); 

                	newLeafNode(otherlv_6, grammarAccess.getWizardAdaptativoAccess().getEjerciciosKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWizardAdaptativo1596); 

                	newLeafNode(otherlv_7, grammarAccess.getWizardAdaptativoAccess().getLeftCurlyBracketKeyword_7());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:742:1: ( (lv_ejercicios_8_0= ruleEjercicio ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:743:1: (lv_ejercicios_8_0= ruleEjercicio )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:743:1: (lv_ejercicios_8_0= ruleEjercicio )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:744:3: lv_ejercicios_8_0= ruleEjercicio
            {
             
            	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1617);
            lv_ejercicios_8_0=ruleEjercicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWizardAdaptativoRule());
            	        }
                   		add(
                   			current, 
                   			"ejercicios",
                    		lv_ejercicios_8_0, 
                    		"Ejercicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:760:2: (otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:760:4: otherlv_9= ',' ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleWizardAdaptativo1630); 

            	        	newLeafNode(otherlv_9, grammarAccess.getWizardAdaptativoAccess().getCommaKeyword_9_0());
            	        
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:764:1: ( (lv_ejercicios_10_0= ruleEjercicio ) )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:765:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    {
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:765:1: (lv_ejercicios_10_0= ruleEjercicio )
            	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:766:3: lv_ejercicios_10_0= ruleEjercicio
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWizardAdaptativoAccess().getEjerciciosEjercicioParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1651);
            	    lv_ejercicios_10_0=ruleEjercicio();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWizardAdaptativoRule());
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
            	    break loop12;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizardAdaptativo1665); 

                	newLeafNode(otherlv_11, grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWizardAdaptativo1677); 

                	newLeafNode(otherlv_12, grammarAccess.getWizardAdaptativoAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:798:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:799:2: (iv_ruleEString= ruleEString EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:800:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1714);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1725); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:807:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:810:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:811:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:811:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:811:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1765); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:819:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1791); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:834:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:835:2: (iv_ruleEInt= ruleEInt EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:836:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1837);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1848); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:843:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:846:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:847:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:847:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:847:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:847:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:848:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEInt1887); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1904); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:868:1: entryRuleRespuestaUnica returns [EObject current=null] : iv_ruleRespuestaUnica= ruleRespuestaUnica EOF ;
    public final EObject entryRuleRespuestaUnica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuestaUnica = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:869:2: (iv_ruleRespuestaUnica= ruleRespuestaUnica EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:870:2: iv_ruleRespuestaUnica= ruleRespuestaUnica EOF
            {
             newCompositeNode(grammarAccess.getRespuestaUnicaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuestaUnica_in_entryRuleRespuestaUnica1949);
            iv_ruleRespuestaUnica=ruleRespuestaUnica();

            state._fsp--;

             current =iv_ruleRespuestaUnica; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuestaUnica1959); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:877:1: ruleRespuestaUnica returns [EObject current=null] : ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:880:28: ( ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:881:1: ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:881:1: ( () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:881:2: () otherlv_1= 'RespuestaUnica' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:881:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:882:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRespuestaUnica2005); 

                	newLeafNode(otherlv_1, grammarAccess.getRespuestaUnicaAccess().getRespuestaUnicaKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaUnica2017); 

                	newLeafNode(otherlv_2, grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:895:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:895:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRespuestaUnica2030); 

                        	newLeafNode(otherlv_3, grammarAccess.getRespuestaUnicaAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaUnica2042); 

                        	newLeafNode(otherlv_4, grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:903:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:904:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:904:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:905:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2063);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:921:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==27) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:921:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaUnica2076); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:925:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:926:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:926:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:927:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2097);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaUnica2111); 

                        	newLeafNode(otherlv_8, grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:947:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:947:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRespuestaUnica2126); 

                        	newLeafNode(otherlv_9, grammarAccess.getRespuestaUnicaAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaUnica2138); 

                        	newLeafNode(otherlv_10, grammarAccess.getRespuestaUnicaAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:955:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:956:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:956:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:957:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2159);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:973:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:973:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaUnica2172); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRespuestaUnicaAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:977:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:978:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:978:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:979:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaUnicaAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaUnica2193);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaUnica2207); 

                        	newLeafNode(otherlv_14, grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaUnica2221); 

                	newLeafNode(otherlv_15, grammarAccess.getRespuestaUnicaAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1011:1: entryRuleRespuestaMultiple returns [EObject current=null] : iv_ruleRespuestaMultiple= ruleRespuestaMultiple EOF ;
    public final EObject entryRuleRespuestaMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuestaMultiple = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1012:2: (iv_ruleRespuestaMultiple= ruleRespuestaMultiple EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1013:2: iv_ruleRespuestaMultiple= ruleRespuestaMultiple EOF
            {
             newCompositeNode(grammarAccess.getRespuestaMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRespuestaMultiple_in_entryRuleRespuestaMultiple2257);
            iv_ruleRespuestaMultiple=ruleRespuestaMultiple();

            state._fsp--;

             current =iv_ruleRespuestaMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRespuestaMultiple2267); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1020:1: ruleRespuestaMultiple returns [EObject current=null] : ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1023:28: ( ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1024:1: ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1024:1: ( () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1024:2: () otherlv_1= 'RespuestaMultiple' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1024:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1025:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRespuestaMultiple2313); 

                	newLeafNode(otherlv_1, grammarAccess.getRespuestaMultipleAccess().getRespuestaMultipleKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaMultiple2325); 

                	newLeafNode(otherlv_2, grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1038:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1038:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRespuestaMultiple2338); 

                        	newLeafNode(otherlv_3, grammarAccess.getRespuestaMultipleAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaMultiple2350); 

                        	newLeafNode(otherlv_4, grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1046:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1047:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1047:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1048:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2371);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1064:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==27) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1064:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaMultiple2384); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1068:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1069:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1069:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1070:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2405);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaMultiple2419); 

                        	newLeafNode(otherlv_8, grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1090:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1090:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRespuestaMultiple2434); 

                        	newLeafNode(otherlv_9, grammarAccess.getRespuestaMultipleAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRespuestaMultiple2446); 

                        	newLeafNode(otherlv_10, grammarAccess.getRespuestaMultipleAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1098:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1099:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1099:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1100:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2467);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1116:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==27) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1116:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRespuestaMultiple2480); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRespuestaMultipleAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1120:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1121:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1121:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1122:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRespuestaMultipleAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRespuestaMultiple2501);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaMultiple2515); 

                        	newLeafNode(otherlv_14, grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRespuestaMultiple2529); 

                	newLeafNode(otherlv_15, grammarAccess.getRespuestaMultipleAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1154:1: entryRuleTextoLibre returns [EObject current=null] : iv_ruleTextoLibre= ruleTextoLibre EOF ;
    public final EObject entryRuleTextoLibre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextoLibre = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1155:2: (iv_ruleTextoLibre= ruleTextoLibre EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1156:2: iv_ruleTextoLibre= ruleTextoLibre EOF
            {
             newCompositeNode(grammarAccess.getTextoLibreRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextoLibre_in_entryRuleTextoLibre2565);
            iv_ruleTextoLibre=ruleTextoLibre();

            state._fsp--;

             current =iv_ruleTextoLibre; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextoLibre2575); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1163:1: ruleTextoLibre returns [EObject current=null] : ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1166:28: ( ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1167:1: ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1167:1: ( () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1167:2: () otherlv_1= 'TextoLibre' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1167:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1168:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextoLibreAccess().getTextoLibreAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTextoLibre2621); 

                	newLeafNode(otherlv_1, grammarAccess.getTextoLibreAccess().getTextoLibreKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextoLibre2633); 

                	newLeafNode(otherlv_2, grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1181:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1181:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTextoLibre2646); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextoLibreAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextoLibre2658); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1189:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1190:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1190:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1191:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre2679);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1207:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==27) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1207:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTextoLibre2692); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTextoLibreAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1211:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1212:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1212:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1213:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre2713);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextoLibre2727); 

                        	newLeafNode(otherlv_8, grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1233:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1233:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTextoLibre2742); 

                        	newLeafNode(otherlv_9, grammarAccess.getTextoLibreAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextoLibre2754); 

                        	newLeafNode(otherlv_10, grammarAccess.getTextoLibreAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1241:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1242:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1242:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1243:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre2775);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1259:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==27) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1259:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTextoLibre2788); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTextoLibreAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1263:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1264:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1264:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1265:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextoLibreAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextoLibre2809);
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextoLibre2823); 

                        	newLeafNode(otherlv_14, grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextoLibre2837); 

                	newLeafNode(otherlv_15, grammarAccess.getTextoLibreAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1297:1: entryRuleOrdenacion returns [EObject current=null] : iv_ruleOrdenacion= ruleOrdenacion EOF ;
    public final EObject entryRuleOrdenacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdenacion = null;


        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1298:2: (iv_ruleOrdenacion= ruleOrdenacion EOF )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1299:2: iv_ruleOrdenacion= ruleOrdenacion EOF
            {
             newCompositeNode(grammarAccess.getOrdenacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrdenacion_in_entryRuleOrdenacion2873);
            iv_ruleOrdenacion=ruleOrdenacion();

            state._fsp--;

             current =iv_ruleOrdenacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrdenacion2883); 

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
    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1306:1: ruleOrdenacion returns [EObject current=null] : ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
        AntlrDatatypeRuleToken lv_correctas_5_0 = null;

        AntlrDatatypeRuleToken lv_correctas_7_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_11_0 = null;

        AntlrDatatypeRuleToken lv_alternativas_13_0 = null;


         enterRule(); 
            
        try {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1309:28: ( ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1310:1: ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1310:1: ( () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1310:2: () otherlv_1= 'Ordenacion' otherlv_2= '{' (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1310:2: ()
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1311:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrdenacionAccess().getOrdenacionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOrdenacion2929); 

                	newLeafNode(otherlv_1, grammarAccess.getOrdenacionAccess().getOrdenacionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdenacion2941); 

                	newLeafNode(otherlv_2, grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1324:1: (otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1324:3: otherlv_3= 'correctas' otherlv_4= '{' ( (lv_correctas_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOrdenacion2954); 

                        	newLeafNode(otherlv_3, grammarAccess.getOrdenacionAccess().getCorrectasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdenacion2966); 

                        	newLeafNode(otherlv_4, grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1332:1: ( (lv_correctas_5_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1333:1: (lv_correctas_5_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1333:1: (lv_correctas_5_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1334:3: lv_correctas_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion2987);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1350:2: (otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==27) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1350:4: otherlv_6= ',' ( (lv_correctas_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrdenacion3000); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getOrdenacionAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1354:1: ( (lv_correctas_7_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1355:1: (lv_correctas_7_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1355:1: (lv_correctas_7_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1356:3: lv_correctas_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getCorrectasEStringParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3021);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdenacion3035); 

                        	newLeafNode(otherlv_8, grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1376:3: (otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1376:5: otherlv_9= 'alternativas' otherlv_10= '{' ( (lv_alternativas_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOrdenacion3050); 

                        	newLeafNode(otherlv_9, grammarAccess.getOrdenacionAccess().getAlternativasKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdenacion3062); 

                        	newLeafNode(otherlv_10, grammarAccess.getOrdenacionAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1384:1: ( (lv_alternativas_11_0= ruleEString ) )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1385:1: (lv_alternativas_11_0= ruleEString )
                    {
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1385:1: (lv_alternativas_11_0= ruleEString )
                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1386:3: lv_alternativas_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3083);
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

                    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1402:2: (otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==27) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1402:4: otherlv_12= ',' ( (lv_alternativas_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrdenacion3096); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getOrdenacionAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1406:1: ( (lv_alternativas_13_0= ruleEString ) )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1407:1: (lv_alternativas_13_0= ruleEString )
                    	    {
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1407:1: (lv_alternativas_13_0= ruleEString )
                    	    // ../autoevaluacion.editor/src-gen/autoevaluacion/parser/antlr/internal/InternalAutoevaluacion.g:1408:3: lv_alternativas_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrdenacionAccess().getAlternativasEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrdenacion3117);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdenacion3131); 

                        	newLeafNode(otherlv_14, grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdenacion3145); 

                	newLeafNode(otherlv_15, grammarAccess.getOrdenacionAccess().getRightCurlyBracketKeyword_5());
                

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
        public static final BitSet FOLLOW_ruleEString_in_ruleEjercicio507 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_14_in_ruleEjercicio520 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleEjercicio541 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleEjercicio556 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEjercicio577 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEjercicio591 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEjercicio612 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEjercicio624 = new BitSet(new long[]{0x0000000E40000000L});
        public static final BitSet FOLLOW_ruleRespuesta_in_ruleEjercicio645 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEjercicio657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEDouble744 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble762 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEDouble782 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble797 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_21_in_ruleEDouble817 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_22_in_ruleEDouble836 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_19_in_ruleEDouble851 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasico_in_entryRuleClasico915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClasico925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleClasico962 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClasico974 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleClasico986 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleClasico1007 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleClasico1019 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleClasico1040 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleClasico1052 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClasico1064 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleClasico1085 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleClasico1098 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleClasico1119 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleClasico1133 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleClasico1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizard_in_entryRuleWizard1181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWizard1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleWizard1228 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizard1240 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleWizard1252 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizard1273 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleWizard1285 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizard1306 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleWizard1318 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizard1330 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizard1351 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleWizard1364 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizard1385 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleWizard1399 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWizard1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWizardAdaptativo_in_entryRuleWizardAdaptativo1447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWizardAdaptativo1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleWizardAdaptativo1494 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizardAdaptativo1506 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleWizardAdaptativo1518 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1539 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleWizardAdaptativo1551 = new BitSet(new long[]{0x0000000000180010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWizardAdaptativo1572 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleWizardAdaptativo1584 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWizardAdaptativo1596 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1617 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleWizardAdaptativo1630 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEjercicio_in_ruleWizardAdaptativo1651 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleWizardAdaptativo1665 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWizardAdaptativo1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEInt1887 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaUnica_in_entryRuleRespuestaUnica1949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuestaUnica1959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRespuestaUnica2005 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaUnica2017 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_31_in_ruleRespuestaUnica2030 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaUnica2042 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2063 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaUnica2076 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2097 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaUnica2111 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_ruleRespuestaUnica2126 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaUnica2138 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2159 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaUnica2172 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaUnica2193 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaUnica2207 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaUnica2221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRespuestaMultiple_in_entryRuleRespuestaMultiple2257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRespuestaMultiple2267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleRespuestaMultiple2313 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaMultiple2325 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_31_in_ruleRespuestaMultiple2338 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaMultiple2350 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2371 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaMultiple2384 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2405 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaMultiple2419 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_ruleRespuestaMultiple2434 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRespuestaMultiple2446 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2467 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleRespuestaMultiple2480 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRespuestaMultiple2501 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaMultiple2515 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRespuestaMultiple2529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextoLibre_in_entryRuleTextoLibre2565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextoLibre2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleTextoLibre2621 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextoLibre2633 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_31_in_ruleTextoLibre2646 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextoLibre2658 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre2679 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleTextoLibre2692 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre2713 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleTextoLibre2727 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_ruleTextoLibre2742 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextoLibre2754 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre2775 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleTextoLibre2788 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextoLibre2809 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleTextoLibre2823 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTextoLibre2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrdenacion_in_entryRuleOrdenacion2873 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdenacion2883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleOrdenacion2929 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdenacion2941 = new BitSet(new long[]{0x0000000180040000L});
        public static final BitSet FOLLOW_31_in_ruleOrdenacion2954 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdenacion2966 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion2987 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleOrdenacion3000 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3021 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdenacion3035 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_ruleOrdenacion3050 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdenacion3062 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3083 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleOrdenacion3096 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrdenacion3117 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdenacion3131 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdenacion3145 = new BitSet(new long[]{0x0000000000000002L});
    }


}