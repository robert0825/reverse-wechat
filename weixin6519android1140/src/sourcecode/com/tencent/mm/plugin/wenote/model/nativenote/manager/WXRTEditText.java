package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView.t;
import android.text.Editable;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ParagraphStyle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.b.c;
import com.tencent.mm.plugin.wenote.model.nativenote.c.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.PasterEditText;
import java.util.ArrayList;

public class WXRTEditText
  extends PasterEditText
  implements SpanWatcher
{
  private aj htb;
  public int lEi;
  public boolean scP;
  public int scR;
  c seC;
  private int seD;
  private int seE;
  private boolean seF;
  private boolean seG;
  private int seH;
  private int seI;
  private String seJ;
  public String seK;
  private Spannable seL;
  public int seM;
  private WXRTEditText seN;
  public RecyclerView.t seO;
  private boolean seP;
  private boolean seQ;
  private boolean seR;
  private boolean seS;
  private boolean seT;
  private boolean seU;
  private boolean seV;
  private j seW;
  public boolean seX;
  public boolean seY;
  public int seZ;
  private Paint sfa;
  private com.tencent.mm.plugin.wenote.model.nativenote.c.b sfb;
  public boolean sfc;
  private Path sfd;
  private int sfe;
  private int sff;
  private int sfg;
  private boolean sfh;
  TextWatcher sfi;
  int sfj;
  
  public WXRTEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17219060760576L, 128292);
    this.seD = -1;
    this.seE = -1;
    this.seF = false;
    this.seK = "";
    this.seM = 0;
    this.seN = null;
    this.lEi = 0;
    this.scP = false;
    this.seU = false;
    this.seX = false;
    this.scR = 0;
    this.seY = false;
    this.seZ = -1;
    this.sfa = null;
    this.htb = null;
    this.sfb = null;
    this.sfc = false;
    this.sfd = null;
    this.sfe = -1;
    this.sff = -1;
    this.sfg = -1;
    this.sfh = false;
    this.sfi = new TextWatcher()
    {
      /* Error */
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: ldc2_w 33
        //   5: ldc 35
        //   7: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: ldc 37
        //   12: ldc 38
        //   14: invokestatic 44	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
        //   17: aload_1
        //   18: invokevirtual 48	java/lang/Object:toString	()Ljava/lang/String;
        //   21: astore_3
        //   22: aload_0
        //   23: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   26: getfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   29: ifnonnull +334 -> 363
        //   32: ldc 54
        //   34: astore_1
        //   35: aload_0
        //   36: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   39: invokestatic 58	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:f	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)I
        //   42: ifeq +12 -> 54
        //   45: aload_0
        //   46: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   49: ldc 54
        //   51: putfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   54: aload_0
        //   55: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   58: invokestatic 61	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:d	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   61: ifne +165 -> 226
        //   64: aload_0
        //   65: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   68: invokevirtual 65	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHL	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/e;
        //   71: getfield 71	com/tencent/mm/plugin/wenote/model/nativenote/manager/e:Vw	I
        //   74: aload_0
        //   75: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   78: invokevirtual 65	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHL	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/e;
        //   81: getfield 74	com/tencent/mm/plugin/wenote/model/nativenote/manager/e:vt	I
        //   84: if_icmpne +142 -> 226
        //   87: aload_1
        //   88: ldc 76
        //   90: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
        //   93: ifne +29 -> 122
        //   96: new 84	java/lang/StringBuilder
        //   99: dup
        //   100: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   103: aload_1
        //   104: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: ldc 76
        //   109: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   115: aload_3
        //   116: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   119: ifne +29 -> 148
        //   122: aload_1
        //   123: ldc 76
        //   125: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
        //   128: ifeq +98 -> 226
        //   131: aload_1
        //   132: ldc 96
        //   134: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
        //   137: ifne +89 -> 226
        //   140: aload_1
        //   141: aload_3
        //   142: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   145: ifeq +81 -> 226
        //   148: aload_0
        //   149: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   152: invokevirtual 100	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getText	()Landroid/text/Editable;
        //   155: aload_1
        //   156: invokevirtual 104	java/lang/String:length	()I
        //   159: aload_1
        //   160: invokevirtual 104	java/lang/String:length	()I
        //   163: ldc 106
        //   165: invokeinterface 112 4 0
        //   170: checkcast 114	[Landroid/text/style/ParagraphStyle;
        //   173: arraylength
        //   174: ifle +52 -> 226
        //   177: aload_0
        //   178: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   181: invokevirtual 117	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionStart	()I
        //   184: istore_2
        //   185: aload_0
        //   186: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   189: iconst_1
        //   190: invokestatic 121	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Z)Z
        //   193: pop
        //   194: aload_0
        //   195: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   198: invokevirtual 100	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getText	()Landroid/text/Editable;
        //   201: ldc 76
        //   203: invokeinterface 124 2 0
        //   208: pop
        //   209: aload_0
        //   210: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   213: iconst_0
        //   214: invokestatic 121	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Z)Z
        //   217: pop
        //   218: aload_0
        //   219: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   222: iload_2
        //   223: invokevirtual 128	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:setSelection	(I)V
        //   226: aload_0
        //   227: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   230: invokestatic 132	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:g	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
        //   233: ifnull +89 -> 322
        //   236: aload_0
        //   237: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   240: invokestatic 61	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:d	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   243: ifne +79 -> 322
        //   246: aload_1
        //   247: aload_3
        //   248: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   251: ifne +71 -> 322
        //   254: aload_0
        //   255: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   258: invokevirtual 136	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHK	()Landroid/text/Spannable;
        //   261: astore_1
        //   262: aload_0
        //   263: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   266: aload_3
        //   267: putfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   270: aload_0
        //   271: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   274: invokestatic 132	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:g	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
        //   277: astore_3
        //   278: aload_0
        //   279: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   282: invokestatic 140	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:h	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   285: astore 4
        //   287: aload_0
        //   288: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   291: invokestatic 143	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:i	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Landroid/text/Spannable;
        //   294: astore 5
        //   296: aload_0
        //   297: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   300: invokevirtual 117	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionStart	()I
        //   303: pop
        //   304: aload_3
        //   305: aload 4
        //   307: aload 5
        //   309: aload_1
        //   310: aload_0
        //   311: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   314: invokevirtual 146	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionEnd	()I
        //   317: invokeinterface 151 5 0
        //   322: aload_0
        //   323: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   326: invokestatic 154	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:e	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   329: pop
        //   330: aload_0
        //   331: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   334: invokestatic 157	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:j	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   337: pop
        //   338: aload_0
        //   339: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   342: invokestatic 160	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:k	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)V
        //   345: aload_0
        //   346: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   349: invokestatic 163	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:l	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)V
        //   352: ldc2_w 33
        //   355: ldc 35
        //   357: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   360: aload_0
        //   361: monitorexit
        //   362: return
        //   363: aload_0
        //   364: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   367: getfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   370: astore_1
        //   371: goto -336 -> 35
        //   374: astore_1
        //   375: aload_0
        //   376: monitorexit
        //   377: aload_1
        //   378: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	379	0	this	2
        //   0	379	1	paramAnonymousEditable	Editable
        //   184	39	2	i	int
        //   21	284	3	localObject	Object
        //   285	21	4	localWXRTEditText	WXRTEditText
        //   294	14	5	localSpannable	Spannable
        // Exception table:
        //   from	to	target	type
        //   2	32	374	finally
        //   35	54	374	finally
        //   54	122	374	finally
        //   122	148	374	finally
        //   148	226	374	finally
        //   226	322	374	finally
        //   322	360	374	finally
        //   363	371	374	finally
      }
      
      /* Error */
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: ldc2_w 166
        //   5: ldc -88
        //   7: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: aload_0
        //   11: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   14: invokestatic 172	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:c	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Ljava/lang/String;
        //   17: ifnonnull +115 -> 132
        //   20: ldc 54
        //   22: astore 5
        //   24: aload_0
        //   25: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   28: invokestatic 61	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:d	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   31: ifne +90 -> 121
        //   34: aload_1
        //   35: invokeinterface 175 1 0
        //   40: aload 5
        //   42: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   45: ifne +76 -> 121
        //   48: aload_0
        //   49: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   52: aload_0
        //   53: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   56: invokevirtual 117	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionStart	()I
        //   59: invokestatic 178	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;I)I
        //   62: pop
        //   63: aload_0
        //   64: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   67: aload_0
        //   68: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   71: invokevirtual 146	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionEnd	()I
        //   74: invokestatic 181	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;I)I
        //   77: pop
        //   78: aload_0
        //   79: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   82: aload_1
        //   83: invokeinterface 175 1 0
        //   88: invokestatic 184	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Ljava/lang/String;)Ljava/lang/String;
        //   91: pop
        //   92: aload_0
        //   93: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   96: aload_0
        //   97: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   100: invokestatic 172	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:c	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Ljava/lang/String;
        //   103: putfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   106: aload_0
        //   107: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   110: aload_0
        //   111: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   114: invokevirtual 136	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHK	()Landroid/text/Spannable;
        //   117: invokestatic 187	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Landroid/text/Spannable;)Landroid/text/Spannable;
        //   120: pop
        //   121: ldc2_w 166
        //   124: ldc -88
        //   126: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   129: aload_0
        //   130: monitorexit
        //   131: return
        //   132: aload_0
        //   133: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   136: invokestatic 172	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:c	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Ljava/lang/String;
        //   139: astore 5
        //   141: goto -117 -> 24
        //   144: astore_1
        //   145: aload_0
        //   146: monitorexit
        //   147: aload_1
        //   148: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	149	0	this	2
        //   0	149	1	paramAnonymousCharSequence	CharSequence
        //   0	149	2	paramAnonymousInt1	int
        //   0	149	3	paramAnonymousInt2	int
        //   0	149	4	paramAnonymousInt3	int
        //   22	118	5	str	String
        // Exception table:
        //   from	to	target	type
        //   2	20	144	finally
        //   24	121	144	finally
        //   121	129	144	finally
        //   132	141	144	finally
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        try
        {
          GMTrace.i(20642283913216L, 153797);
          WXRTEditText.e(WXRTEditText.this);
          GMTrace.o(20642283913216L, 153797);
          return;
        }
        finally
        {
          paramAnonymousCharSequence = finally;
          throw paramAnonymousCharSequence;
        }
      }
    };
    this.sfj = 0;
    init();
    GMTrace.o(17219060760576L, 128292);
  }
  
  public WXRTEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17219194978304L, 128293);
    this.seD = -1;
    this.seE = -1;
    this.seF = false;
    this.seK = "";
    this.seM = 0;
    this.seN = null;
    this.lEi = 0;
    this.scP = false;
    this.seU = false;
    this.seX = false;
    this.scR = 0;
    this.seY = false;
    this.seZ = -1;
    this.sfa = null;
    this.htb = null;
    this.sfb = null;
    this.sfc = false;
    this.sfd = null;
    this.sfe = -1;
    this.sff = -1;
    this.sfg = -1;
    this.sfh = false;
    this.sfi = new TextWatcher()
    {
      /* Error */
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: ldc2_w 33
        //   5: ldc 35
        //   7: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: ldc 37
        //   12: ldc 38
        //   14: invokestatic 44	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
        //   17: aload_1
        //   18: invokevirtual 48	java/lang/Object:toString	()Ljava/lang/String;
        //   21: astore_3
        //   22: aload_0
        //   23: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   26: getfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   29: ifnonnull +334 -> 363
        //   32: ldc 54
        //   34: astore_1
        //   35: aload_0
        //   36: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   39: invokestatic 58	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:f	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)I
        //   42: ifeq +12 -> 54
        //   45: aload_0
        //   46: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   49: ldc 54
        //   51: putfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   54: aload_0
        //   55: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   58: invokestatic 61	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:d	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   61: ifne +165 -> 226
        //   64: aload_0
        //   65: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   68: invokevirtual 65	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHL	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/e;
        //   71: getfield 71	com/tencent/mm/plugin/wenote/model/nativenote/manager/e:Vw	I
        //   74: aload_0
        //   75: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   78: invokevirtual 65	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHL	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/e;
        //   81: getfield 74	com/tencent/mm/plugin/wenote/model/nativenote/manager/e:vt	I
        //   84: if_icmpne +142 -> 226
        //   87: aload_1
        //   88: ldc 76
        //   90: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
        //   93: ifne +29 -> 122
        //   96: new 84	java/lang/StringBuilder
        //   99: dup
        //   100: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   103: aload_1
        //   104: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: ldc 76
        //   109: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   115: aload_3
        //   116: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   119: ifne +29 -> 148
        //   122: aload_1
        //   123: ldc 76
        //   125: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
        //   128: ifeq +98 -> 226
        //   131: aload_1
        //   132: ldc 96
        //   134: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
        //   137: ifne +89 -> 226
        //   140: aload_1
        //   141: aload_3
        //   142: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   145: ifeq +81 -> 226
        //   148: aload_0
        //   149: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   152: invokevirtual 100	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getText	()Landroid/text/Editable;
        //   155: aload_1
        //   156: invokevirtual 104	java/lang/String:length	()I
        //   159: aload_1
        //   160: invokevirtual 104	java/lang/String:length	()I
        //   163: ldc 106
        //   165: invokeinterface 112 4 0
        //   170: checkcast 114	[Landroid/text/style/ParagraphStyle;
        //   173: arraylength
        //   174: ifle +52 -> 226
        //   177: aload_0
        //   178: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   181: invokevirtual 117	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionStart	()I
        //   184: istore_2
        //   185: aload_0
        //   186: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   189: iconst_1
        //   190: invokestatic 121	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Z)Z
        //   193: pop
        //   194: aload_0
        //   195: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   198: invokevirtual 100	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getText	()Landroid/text/Editable;
        //   201: ldc 76
        //   203: invokeinterface 124 2 0
        //   208: pop
        //   209: aload_0
        //   210: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   213: iconst_0
        //   214: invokestatic 121	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Z)Z
        //   217: pop
        //   218: aload_0
        //   219: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   222: iload_2
        //   223: invokevirtual 128	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:setSelection	(I)V
        //   226: aload_0
        //   227: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   230: invokestatic 132	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:g	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
        //   233: ifnull +89 -> 322
        //   236: aload_0
        //   237: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   240: invokestatic 61	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:d	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   243: ifne +79 -> 322
        //   246: aload_1
        //   247: aload_3
        //   248: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   251: ifne +71 -> 322
        //   254: aload_0
        //   255: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   258: invokevirtual 136	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHK	()Landroid/text/Spannable;
        //   261: astore_1
        //   262: aload_0
        //   263: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   266: aload_3
        //   267: putfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   270: aload_0
        //   271: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   274: invokestatic 132	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:g	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
        //   277: astore_3
        //   278: aload_0
        //   279: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   282: invokestatic 140	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:h	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   285: astore 4
        //   287: aload_0
        //   288: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   291: invokestatic 143	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:i	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Landroid/text/Spannable;
        //   294: astore 5
        //   296: aload_0
        //   297: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   300: invokevirtual 117	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionStart	()I
        //   303: pop
        //   304: aload_3
        //   305: aload 4
        //   307: aload 5
        //   309: aload_1
        //   310: aload_0
        //   311: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   314: invokevirtual 146	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionEnd	()I
        //   317: invokeinterface 151 5 0
        //   322: aload_0
        //   323: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   326: invokestatic 154	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:e	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   329: pop
        //   330: aload_0
        //   331: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   334: invokestatic 157	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:j	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   337: pop
        //   338: aload_0
        //   339: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   342: invokestatic 160	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:k	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)V
        //   345: aload_0
        //   346: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   349: invokestatic 163	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:l	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)V
        //   352: ldc2_w 33
        //   355: ldc 35
        //   357: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   360: aload_0
        //   361: monitorexit
        //   362: return
        //   363: aload_0
        //   364: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   367: getfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   370: astore_1
        //   371: goto -336 -> 35
        //   374: astore_1
        //   375: aload_0
        //   376: monitorexit
        //   377: aload_1
        //   378: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	379	0	this	2
        //   0	379	1	paramAnonymousEditable	Editable
        //   184	39	2	i	int
        //   21	284	3	localObject	Object
        //   285	21	4	localWXRTEditText	WXRTEditText
        //   294	14	5	localSpannable	Spannable
        // Exception table:
        //   from	to	target	type
        //   2	32	374	finally
        //   35	54	374	finally
        //   54	122	374	finally
        //   122	148	374	finally
        //   148	226	374	finally
        //   226	322	374	finally
        //   322	360	374	finally
        //   363	371	374	finally
      }
      
      /* Error */
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: ldc2_w 166
        //   5: ldc -88
        //   7: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: aload_0
        //   11: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   14: invokestatic 172	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:c	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Ljava/lang/String;
        //   17: ifnonnull +115 -> 132
        //   20: ldc 54
        //   22: astore 5
        //   24: aload_0
        //   25: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   28: invokestatic 61	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:d	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Z
        //   31: ifne +90 -> 121
        //   34: aload_1
        //   35: invokeinterface 175 1 0
        //   40: aload 5
        //   42: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   45: ifne +76 -> 121
        //   48: aload_0
        //   49: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   52: aload_0
        //   53: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   56: invokevirtual 117	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionStart	()I
        //   59: invokestatic 178	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;I)I
        //   62: pop
        //   63: aload_0
        //   64: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   67: aload_0
        //   68: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   71: invokevirtual 146	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getSelectionEnd	()I
        //   74: invokestatic 181	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;I)I
        //   77: pop
        //   78: aload_0
        //   79: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   82: aload_1
        //   83: invokeinterface 175 1 0
        //   88: invokestatic 184	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Ljava/lang/String;)Ljava/lang/String;
        //   91: pop
        //   92: aload_0
        //   93: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   96: aload_0
        //   97: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   100: invokestatic 172	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:c	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Ljava/lang/String;
        //   103: putfield 52	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seK	Ljava/lang/String;
        //   106: aload_0
        //   107: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   110: aload_0
        //   111: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   114: invokevirtual 136	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:bHK	()Landroid/text/Spannable;
        //   117: invokestatic 187	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:a	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;Landroid/text/Spannable;)Landroid/text/Spannable;
        //   120: pop
        //   121: ldc2_w 166
        //   124: ldc -88
        //   126: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   129: aload_0
        //   130: monitorexit
        //   131: return
        //   132: aload_0
        //   133: getfield 14	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText$2:sfk	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;
        //   136: invokestatic 172	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:c	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText;)Ljava/lang/String;
        //   139: astore 5
        //   141: goto -117 -> 24
        //   144: astore_1
        //   145: aload_0
        //   146: monitorexit
        //   147: aload_1
        //   148: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	149	0	this	2
        //   0	149	1	paramAnonymousCharSequence	CharSequence
        //   0	149	2	paramAnonymousInt1	int
        //   0	149	3	paramAnonymousInt2	int
        //   0	149	4	paramAnonymousInt3	int
        //   22	118	5	str	String
        // Exception table:
        //   from	to	target	type
        //   2	20	144	finally
        //   24	121	144	finally
        //   121	129	144	finally
        //   132	141	144	finally
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        try
        {
          GMTrace.i(20642283913216L, 153797);
          WXRTEditText.e(WXRTEditText.this);
          GMTrace.o(20642283913216L, 153797);
          return;
        }
        finally
        {
          paramAnonymousCharSequence = finally;
          throw paramAnonymousCharSequence;
        }
      }
    };
    this.sfj = 0;
    init();
    GMTrace.o(17219194978304L, 128293);
  }
  
  private void b(Spannable paramSpannable)
  {
    GMTrace.i(17221074026496L, 128307);
    int i = getSelectionStart();
    b(com.tencent.mm.bt.g.bRE().a(getContext(), paramSpannable, getTextSize()));
    int j = getText().length() - paramSpannable.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length()) {
        setSelection(i);
      }
      GMTrace.o(17221074026496L, 128307);
      return;
    }
    setSelection(i);
    GMTrace.o(17221074026496L, 128307);
  }
  
  private void b(Spanned paramSpanned)
  {
    GMTrace.i(17219731849216L, 128297);
    bHN();
    bHP();
    super.setText(paramSpanned, TextView.BufferType.EDITABLE);
    bHQ();
    bHR();
    u.a(this, new t[0]);
    bHO();
    GMTrace.o(17219731849216L, 128297);
  }
  
  private void bHR()
  {
    GMTrace.i(20636378333184L, 153753);
    Editable localEditable = getText();
    if (localEditable.getSpans(0, localEditable.length(), getClass()) != null) {
      localEditable.setSpan(this, 0, localEditable.length(), 18);
    }
    GMTrace.o(20636378333184L, 153753);
  }
  
  private void bHU()
  {
    GMTrace.i(20637049421824L, 153758);
    if (this.htb == null)
    {
      this.htb = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(20643357655040L, 153805);
          if ((WXRTEditText.m(WXRTEditText.this) != null) && (WXRTEditText.m(WXRTEditText.this).getType() == 1))
          {
            int i = WXRTEditText.m(WXRTEditText.this).sfV;
            WXRTEditText.n(WXRTEditText.this);
            WXRTEditText.this.T(i, false);
          }
          GMTrace.o(20643357655040L, 153805);
          return true;
        }
      }, false);
      GMTrace.o(20637049421824L, 153758);
      return;
    }
    this.htb.stopTimer();
    GMTrace.o(20637049421824L, 153758);
  }
  
  private void bHV()
  {
    GMTrace.i(20637317857280L, 153760);
    if (this.sfb == null)
    {
      this.sfb = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
      GMTrace.o(20637317857280L, 153760);
      return;
    }
    this.sfb.reset();
    GMTrace.o(20637317857280L, 153760);
  }
  
  private void dP(int paramInt1, int paramInt2)
  {
    GMTrace.i(20637452075008L, 153761);
    if (this.seM == 2)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().r(this.seZ, 1, this.seZ, 1);
      GMTrace.o(20637452075008L, 153761);
      return;
    }
    if (this.seM == 1)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().r(this.seZ, 0, this.seZ, 0);
      GMTrace.o(20637452075008L, 153761);
      return;
    }
    com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().r(this.seZ, paramInt1, this.seZ, paramInt2);
    GMTrace.o(20637452075008L, 153761);
  }
  
  private void init()
  {
    GMTrace.i(17219463413760L, 128295);
    this.seN = this;
    removeTextChangedListener(this.sfi);
    addTextChangedListener(this.sfi);
    setMovementMethod(com.tencent.mm.plugin.wenote.model.nativenote.spans.i.bIu());
    this.seZ = -1;
    this.sfa = new Paint(1);
    this.sfa.setColor(1347529272);
    this.sfb = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
    this.sfd = new Path();
    this.sfe = -1;
    this.sff = -1;
    this.sfg = -1;
    if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled())
    {
      setHighlightColor(0);
      setCustomSelectionActionModeCallback(new ActionMode.Callback()
      {
        public final boolean onActionItemClicked(ActionMode paramAnonymousActionMode, MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20639331123200L, 153775);
          GMTrace.o(20639331123200L, 153775);
          return false;
        }
        
        public final boolean onCreateActionMode(ActionMode paramAnonymousActionMode, Menu paramAnonymousMenu)
        {
          GMTrace.i(20639196905472L, 153774);
          GMTrace.o(20639196905472L, 153774);
          return false;
        }
        
        public final void onDestroyActionMode(ActionMode paramAnonymousActionMode)
        {
          GMTrace.i(20639062687744L, 153773);
          GMTrace.o(20639062687744L, 153773);
        }
        
        public final boolean onPrepareActionMode(ActionMode paramAnonymousActionMode, Menu paramAnonymousMenu)
        {
          GMTrace.i(20638928470016L, 153772);
          GMTrace.o(20638928470016L, 153772);
          return false;
        }
      });
    }
    GMTrace.o(17219463413760L, 128295);
  }
  
  private void jQ(boolean paramBoolean)
  {
    try
    {
      GMTrace.i(20636512550912L, 153754);
      if (!this.seT) {
        this.seS = paramBoolean;
      }
      GMTrace.o(20636512550912L, 153754);
      return;
    }
    finally {}
  }
  
  public final void NJ(String paramString)
  {
    GMTrace.i(17219597631488L, 128296);
    bHN();
    if (!bg.nm(paramString)) {
      b(com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(paramString));
    }
    for (;;)
    {
      bHO();
      GMTrace.o(17219597631488L, 128296);
      return;
      setText("");
    }
  }
  
  public final void T(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20637183639552L, 153759);
    Editable localEditable = getText();
    if (localEditable == null)
    {
      GMTrace.o(20637183639552L, 153759);
      return;
    }
    Layout localLayout = getLayout();
    if (localLayout == null)
    {
      GMTrace.o(20637183639552L, 153759);
      return;
    }
    int k = localEditable.length();
    if ((paramInt < 0) || (paramInt > k))
    {
      GMTrace.o(20637183639552L, 153759);
      return;
    }
    int i;
    if (k == 0)
    {
      paramInt = 0;
      i = 0;
    }
    for (;;)
    {
      if ((i < 0) || (i > k) || (paramInt < 0) || (paramInt > k))
      {
        GMTrace.o(20637183639552L, 153759);
        return;
        if (paramInt < k)
        {
          if ((paramBoolean) || (localEditable.charAt(paramInt) != '\n'))
          {
            int j = localLayout.getOffsetToRightOf(paramInt);
            i = paramInt;
            paramInt = j;
          }
        }
        else if ((paramInt == k) && (paramBoolean)) {
          i = localLayout.getOffsetToLeftOf(paramInt);
        }
      }
      else
      {
        if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().isEditable())
        {
          requestFocus();
          this.sfc = true;
          setSelection(i, paramInt);
          this.sfc = false;
          if (this.seC != null)
          {
            this.seC.d(true, 50L);
            this.seC.yA(1);
          }
        }
        dP(i, paramInt);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().G(true, true);
        GMTrace.o(20637183639552L, 153759);
        return;
      }
      i = paramInt;
    }
  }
  
  public final String a(i parami)
  {
    GMTrace.i(17220671373312L, 128304);
    if (parami == i.sfm)
    {
      parami = getText().toString();
      GMTrace.o(17220671373312L, 128304);
      return parami;
    }
    if (parami == i.sfn)
    {
      parami = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(getText());
      GMTrace.o(17220671373312L, 128304);
      return parami;
    }
    GMTrace.o(17220671373312L, 128304);
    return "";
  }
  
  public final <V, C extends com.tencent.mm.plugin.wenote.model.nativenote.spans.g<V>> void a(t<V, C> paramt, V paramV)
  {
    GMTrace.i(20636244115456L, 153752);
    if ((!this.seU) && (!this.seR))
    {
      if (this.seG) {}
      for (Spannable localSpannable = null;; localSpannable = bHK())
      {
        paramt.a(this, paramV);
        try
        {
          if ((this.seC != null) && (!this.seG))
          {
            paramt = bHK();
            paramV = this.seC;
            getSelectionStart();
            getSelectionEnd();
            getSelectionStart();
            paramV.a(this, localSpannable, paramt, getSelectionEnd());
          }
          this.seV = true;
          GMTrace.o(20636244115456L, 153752);
          return;
        }
        finally {}
      }
    }
    GMTrace.o(20636244115456L, 153752);
  }
  
  public final void bHJ()
  {
    GMTrace.i(20635304591360L, 153745);
    if (this.seC != null)
    {
      this.seC.d(true, 50L);
      this.seC.yA(1);
    }
    GMTrace.o(20635304591360L, 153745);
  }
  
  public final Spannable bHK()
  {
    GMTrace.i(17220537155584L, 128303);
    Object localObject = super.getText();
    if (localObject != null) {}
    for (;;)
    {
      localObject = new a((CharSequence)localObject);
      GMTrace.o(17220537155584L, 128303);
      return (Spannable)localObject;
      localObject = "";
    }
  }
  
  public final e bHL()
  {
    GMTrace.i(20635438809088L, 153746);
    e locale = new e(getSelectionStart(), getSelectionEnd());
    GMTrace.o(20635438809088L, 153746);
    return locale;
  }
  
  public final int bHM()
  {
    GMTrace.i(17220805591040L, 128305);
    if (this.seO.gb() == -1)
    {
      GMTrace.o(17220805591040L, 128305);
      return 0;
    }
    int i = this.seO.gb();
    GMTrace.o(17220805591040L, 128305);
    return i;
  }
  
  public final void bHN()
  {
    try
    {
      GMTrace.i(17221208244224L, 128308);
      this.seG = true;
      GMTrace.o(17221208244224L, 128308);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void bHO()
  {
    try
    {
      GMTrace.i(17221342461952L, 128309);
      this.seG = false;
      GMTrace.o(17221342461952L, 128309);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void bHP()
  {
    try
    {
      GMTrace.i(20635573026816L, 153747);
      this.seF = true;
      GMTrace.o(20635573026816L, 153747);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void bHQ()
  {
    try
    {
      GMTrace.i(20635707244544L, 153748);
      this.seF = false;
      GMTrace.o(20635707244544L, 153748);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final e bHS()
  {
    int k = 0;
    GMTrace.i(20636646768640L, 153755);
    Object localObject = bHT();
    e locale = new e(this);
    int j = ((j)localObject).getLineForOffset(locale.Vw);
    int i;
    int m;
    if (locale.isEmpty())
    {
      i = locale.vt;
      m = ((j)localObject).getLineForOffset(i);
      if ((((j)localObject).sfp != 0) && (j >= 0)) {
        break label125;
      }
      i = 0;
      label74:
      j = k;
      if (((j)localObject).sfp != 0)
      {
        if (m >= 0) {
          break label180;
        }
        j = k;
      }
    }
    for (;;)
    {
      localObject = new e(i, j);
      GMTrace.o(20636646768640L, 153755);
      return (e)localObject;
      i = locale.vt - 1;
      break;
      label125:
      if (j < ((j)localObject).sfp)
      {
        i = ((n)((j)localObject).sfq.get(j)).Vw;
        break label74;
      }
      i = ((n)((j)localObject).sfq.get(((j)localObject).sfp - 1)).vt - 1;
      break label74;
      label180:
      if (m < ((j)localObject).sfp) {
        j = ((n)((j)localObject).sfq.get(m)).vt;
      } else {
        j = ((n)((j)localObject).sfq.get(((j)localObject).sfp - 1)).vt - 1;
      }
    }
  }
  
  public j bHT()
  {
    GMTrace.i(20636780986368L, 153756);
    try
    {
      if ((this.seW == null) || (this.seV))
      {
        this.seW = new j(getText());
        this.seV = false;
      }
      j localj = this.seW;
      GMTrace.o(20636780986368L, 153756);
      return localj;
    }
    finally {}
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17220134502400L, 128300);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(17220134502400L, 128300);
    return bool;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(20636915204096L, 153757);
    Object localObject;
    d locald;
    int m;
    int k;
    int i;
    int j;
    if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled()) && (this.seM == 0))
    {
      localObject = getText();
      if (localObject != null)
      {
        locald = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bId();
        m = 0;
        switch (com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().yF(this.seZ))
        {
        default: 
          k = 0;
          i = -1;
          j = 0;
          if ((i >= 0) && (j <= ((Editable)localObject).length()) && (i <= j)) {
            break;
          }
        }
      }
    }
    do
    {
      do
      {
        super.onDraw(paramCanvas);
        GMTrace.o(20636915204096L, 153757);
        return;
      } while (locald.startOffset == locald.sge);
      i = locald.startOffset;
      j = locald.sge;
      k = 0;
      break;
      j = ((Editable)localObject).length();
      m = 1;
      k = 1;
      i = 0;
      break;
      i = locald.startOffset;
      j = ((Editable)localObject).length();
      m = 1;
      k = 0;
      break;
      j = locald.sge;
      k = 1;
      i = 0;
      break;
      localObject = getLayout();
    } while (localObject == null);
    if (this.sfe == -1) {
      this.sfe = getPaddingLeft();
    }
    if (this.sff == -1) {
      this.sff = getPaddingTop();
    }
    if (this.sfg == -1) {
      this.sfg = getPaddingBottom();
    }
    if (this.sfd == null) {
      this.sfd = new Path();
    }
    this.sfd.reset();
    label550:
    label838:
    for (;;)
    {
      int n;
      int i1;
      int i2;
      float f1;
      float f2;
      float f3;
      float f4;
      float f5;
      float f6;
      try
      {
        n = ((Layout)localObject).getLineForOffset(i);
        i1 = ((Layout)localObject).getLineForOffset(j);
        if (n > i1) {
          break;
        }
        i2 = ((Layout)localObject).getWidth();
        f1 = ((Layout)localObject).getPrimaryHorizontal(i) + this.sfe;
        f2 = ((Layout)localObject).getLineTop(n) + this.sff;
        f3 = ((Layout)localObject).getLineBottom(n) + this.sff;
        f4 = ((Layout)localObject).getPrimaryHorizontal(j) + this.sfe;
        f5 = ((Layout)localObject).getLineTop(i1) + this.sff;
        f6 = ((Layout)localObject).getLineBottom(i1) + this.sff;
        if ((k == 0) || (m == 0)) {
          break label550;
        }
        this.sfd.addRect(this.sfe, 0.0F, this.sfe + i2, f6 + this.sfg, Path.Direction.CW);
        if (this.sfd.isEmpty()) {
          break;
        }
        if (this.sfa == null)
        {
          this.sfa = new Paint(1);
          this.sfa.setColor(1347529272);
        }
        paramCanvas.drawPath(this.sfd, this.sfa);
      }
      catch (Exception localException)
      {
        w.e("noteeditor.WXRTEditText", "tryDrawCover: ", new Object[] { localException });
      }
      break;
      if (n == i1)
      {
        if (k != 0) {
          this.sfd.addRect(this.sfe, 0.0F, f4, f6, Path.Direction.CW);
        } else if (m != 0) {
          this.sfd.addRect(f1, f2, this.sfe + i2, f6 + this.sfg, Path.Direction.CW);
        } else {
          this.sfd.addRect(f1, f2, f4, f6, Path.Direction.CW);
        }
      }
      else
      {
        if (k != 0)
        {
          this.sfd.addRect(this.sfe, 0.0F, this.sfe + i2, f3, Path.Direction.CW);
          this.sfd.addRect(this.sfe, f5, f4, f6, Path.Direction.CW);
        }
        for (;;)
        {
          if (i1 - n <= 1) {
            break label838;
          }
          this.sfd.addRect(this.sfe, f3, this.sfe + i2, f5, Path.Direction.CW);
          break;
          if (m != 0)
          {
            this.sfd.addRect(f1, f2, this.sfe + i2, f3, Path.Direction.CW);
            this.sfd.addRect(this.sfe, f5, this.sfe + i2, f6 + this.sfg, Path.Direction.CW);
          }
          else
          {
            this.sfd.addRect(f1, f2, this.sfe + i2, f3, Path.Direction.CW);
            this.sfd.addRect(this.sfe, f5, f4, f6, Path.Direction.CW);
          }
        }
      }
    }
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    GMTrace.i(17220268720128L, 128301);
    this.sfh = false;
    this.seD = -1;
    this.seE = -1;
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (this.seC != null) {
      this.seC.a(this, paramBoolean, bHM());
    }
    if ((paramBoolean) && (!this.sfh)) {
      onSelectionChanged(getSelectionStart(), getSelectionEnd());
    }
    GMTrace.o(17220268720128L, 128301);
  }
  
  protected void onSelectionChanged(int paramInt1, int paramInt2)
  {
    GMTrace.i(17220402937856L, 128302);
    try
    {
      if (this.seF)
      {
        GMTrace.o(17220402937856L, 128302);
        return;
      }
      this.sfh = true;
      if (paramInt1 < 0)
      {
        GMTrace.o(17220402937856L, 128302);
        return;
      }
    }
    finally {}
    if ((this.seD != paramInt1) || (this.seE != paramInt2))
    {
      this.seD = paramInt1;
      this.seE = paramInt2;
      super.onSelectionChanged(paramInt1, paramInt2);
      if (paramInt2 <= paramInt1) {
        break label253;
      }
    }
    label253:
    for (boolean bool = true;; bool = false)
    {
      this.seQ = bool;
      if ((!this.seR) && (!this.seS))
      {
        this.seT = true;
        u.a(this, new t[0]);
        this.seT = false;
        jQ(true);
      }
      if (this.seC != null)
      {
        this.seU = true;
        this.seC.a(this, paramInt1, paramInt2);
        this.seU = false;
      }
      if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled()) && (!this.sfc) && (hasFocus()) && (this.seZ >= 0))
      {
        dP(paramInt1, paramInt2);
        if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().yF(this.seZ) == 1)
        {
          com.tencent.mm.plugin.wenote.model.nativenote.c.e locale = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb();
          if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit)
          {
            locale.e(true, 0L);
            locale.bIj();
            locale.bIh();
          }
        }
      }
      GMTrace.o(17220402937856L, 128302);
      return;
    }
  }
  
  public void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    GMTrace.i(20635841462272L, 153749);
    this.seP = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle))) {
      jQ(false);
    }
    GMTrace.o(20635841462272L, 153749);
  }
  
  public void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20636109897728L, 153751);
    this.seP = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle))) {
      jQ(false);
    }
    GMTrace.o(20636109897728L, 153751);
  }
  
  public void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    GMTrace.i(20635975680000L, 153750);
    this.seP = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle))) {
      jQ(false);
    }
    GMTrace.o(20635975680000L, 153750);
  }
  
  /* Error */
  public boolean onTextContextMenuItem(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 770
    //   3: ldc_w 772
    //   6: invokestatic 76	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iload_1
    //   10: ldc_w 773
    //   13: if_icmpne +23 -> 36
    //   16: aload_0
    //   17: getfield 337	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seC	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   20: invokeinterface 776 1 0
    //   25: ldc2_w 770
    //   28: ldc_w 772
    //   31: invokestatic 136	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: iconst_1
    //   35: ireturn
    //   36: iload_1
    //   37: ldc_w 777
    //   40: if_icmpeq +10 -> 50
    //   43: iload_1
    //   44: ldc_w 778
    //   47: if_icmpne +94 -> 141
    //   50: invokestatic 783	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:Ty	()V
    //   53: aload_0
    //   54: iload_1
    //   55: invokespecial 785	com/tencent/mm/ui/base/PasterEditText:onTextContextMenuItem	(I)Z
    //   58: istore_3
    //   59: iload_1
    //   60: ldc_w 786
    //   63: if_icmpne +20 -> 83
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield 129	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:sfj	I
    //   71: aload_0
    //   72: invokevirtual 206	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getText	()Landroid/text/Editable;
    //   75: astore 4
    //   77: aload_0
    //   78: aload 4
    //   80: invokespecial 788	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Landroid/text/Spannable;)V
    //   83: iload_1
    //   84: ldc_w 786
    //   87: if_icmpne +43 -> 130
    //   90: aload_0
    //   91: getfield 94	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:scP	Z
    //   94: ifeq +36 -> 130
    //   97: aload_0
    //   98: getfield 337	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seC	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   101: ifnull +24 -> 125
    //   104: aload_0
    //   105: getfield 337	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seC	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   108: iconst_0
    //   109: lconst_0
    //   110: invokeinterface 481 4 0
    //   115: aload_0
    //   116: getfield 337	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seC	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   119: iconst_0
    //   120: invokeinterface 484 2 0
    //   125: aload_0
    //   126: iconst_0
    //   127: putfield 94	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:scP	Z
    //   130: ldc2_w 770
    //   133: ldc_w 772
    //   136: invokestatic 136	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: iload_3
    //   140: ireturn
    //   141: iload_1
    //   142: ldc_w 786
    //   145: if_icmpne -92 -> 53
    //   148: aload_0
    //   149: invokevirtual 192	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getContext	()Landroid/content/Context;
    //   152: invokestatic 792	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:dz	(Landroid/content/Context;)I
    //   155: istore_2
    //   156: iload_2
    //   157: iconst_2
    //   158: if_icmpne +9 -> 167
    //   161: invokestatic 783	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:Ty	()V
    //   164: goto -111 -> 53
    //   167: iload_2
    //   168: iconst_3
    //   169: if_icmpne -116 -> 53
    //   172: aload_0
    //   173: getfield 337	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:seC	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   176: aload_0
    //   177: invokeinterface 794 2 0
    //   182: ldc2_w 770
    //   185: ldc_w 772
    //   188: invokestatic 136	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   191: iconst_1
    //   192: ireturn
    //   193: astore 4
    //   195: ldc_w 700
    //   198: ldc_w 796
    //   201: iconst_1
    //   202: anewarray 258	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload 4
    //   209: aastore
    //   210: invokestatic 707	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   213: ldc2_w 770
    //   216: ldc_w 772
    //   219: invokestatic 136	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   222: iconst_0
    //   223: ireturn
    //   224: astore 5
    //   226: ldc_w 700
    //   229: ldc_w 798
    //   232: iconst_1
    //   233: anewarray 258	java/lang/Object
    //   236: dup
    //   237: iconst_0
    //   238: aload_0
    //   239: getfield 129	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:sfj	I
    //   242: invokestatic 804	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   245: aastore
    //   246: invokestatic 707	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   249: aload_0
    //   250: getfield 129	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:sfj	I
    //   253: iconst_3
    //   254: if_icmpge +45 -> 299
    //   257: aload_0
    //   258: aload_0
    //   259: getfield 129	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:sfj	I
    //   262: iconst_1
    //   263: iadd
    //   264: putfield 129	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:sfj	I
    //   267: aload_0
    //   268: new 806	android/text/SpannableStringBuilder
    //   271: dup
    //   272: iconst_2
    //   273: anewarray 808	java/lang/CharSequence
    //   276: dup
    //   277: iconst_0
    //   278: ldc_w 810
    //   281: aastore
    //   282: dup
    //   283: iconst_1
    //   284: aload 4
    //   286: aastore
    //   287: invokestatic 816	android/text/TextUtils:concat	([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   290: invokespecial 817	android/text/SpannableStringBuilder:<init>	(Ljava/lang/CharSequence;)V
    //   293: invokespecial 788	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Landroid/text/Spannable;)V
    //   296: goto -213 -> 83
    //   299: aload 5
    //   301: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	302	0	this	WXRTEditText
    //   0	302	1	paramInt	int
    //   155	15	2	i	int
    //   58	82	3	bool	boolean
    //   75	4	4	localEditable	Editable
    //   193	92	4	localNullPointerException	NullPointerException
    //   224	76	5	localIndexOutOfBoundsException	IndexOutOfBoundsException
    // Exception table:
    //   from	to	target	type
    //   53	59	193	java/lang/NullPointerException
    //   77	83	224	java/lang/IndexOutOfBoundsException
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    GMTrace.i(17220000284672L, 128299);
    Object localObject1;
    int i;
    label402:
    boolean bool1;
    if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled())
    {
      localObject1 = getText();
      if (localObject1 == null)
      {
        bHV();
        GMTrace.o(17220000284672L, 128299);
        return true;
      }
      int j = ((Editable)localObject1).length();
      i = getOffsetForPosition(paramMotionEvent.getX(), paramMotionEvent.getY());
      if ((j < 0) || (i < 0) || (i > j))
      {
        bHV();
        GMTrace.o(17220000284672L, 128299);
        return true;
      }
      switch (paramMotionEvent.getAction())
      {
      }
      do
      {
        do
        {
          for (;;)
          {
            GMTrace.o(17220000284672L, 128299);
            return true;
            j = (int)paramMotionEvent.getX();
            int k = (int)paramMotionEvent.getY();
            Object localObject2 = getLayout();
            k = ((Layout)localObject2).getOffsetForHorizontal(((Layout)localObject2).getLineForVertical(k), j);
            localObject2 = (k[])getText().getSpans(k, k + 1, k.class);
            if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().isEditable()) && (j < b.bHn()) && (localObject2.length != 0))
            {
              w.i("noteeditor.WXRTEditText", "clicked todo");
              this.seC.bHj();
              localObject2[0].a(this, (Spannable)localObject1, paramMotionEvent, localObject2[0]);
            }
            else
            {
              bHV();
              this.sfb.a(1, paramMotionEvent.getRawX(), paramMotionEvent.getRawY(), paramMotionEvent.getX(), paramMotionEvent.getY(), i);
              bHU();
              this.htb.z(500L, 0L);
              continue;
              bHV();
              bHU();
            }
          }
          bHU();
        } while (this.sfb == null);
        localObject1 = this.sfb;
        float f1 = paramMotionEvent.getRawX();
        float f2 = paramMotionEvent.getRawY();
        float f3 = paramMotionEvent.getX();
        float f4 = paramMotionEvent.getY();
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).sfW = f1;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).sfX = f2;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).sfY = f3;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).sfZ = f4;
        if (((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).jHw != 1) {
          break;
        }
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).sga = i;
        j = this.sfb.getType();
        bHV();
      } while (j != 2);
      if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().isEditable()) {
        if (hasFocus())
        {
          if ((getSelectionStart() != getSelectionEnd()) || (i != getSelectionStart())) {
            break label721;
          }
          bool1 = true;
          bool2 = true;
        }
      }
    }
    for (;;)
    {
      this.sfc = true;
      setSelection(i);
      this.sfc = false;
      if (this.seC != null)
      {
        this.seC.d(true, 50L);
        this.seC.yA(1);
      }
      dP(i, i);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().G(bool2, bool1);
      break;
      ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).sga = 0;
      break label402;
      requestFocus();
      bool1 = false;
      bool2 = false;
      continue;
      paramMotionEvent = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bId();
      bool1 = bool2;
      if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIi())
      {
        bool1 = bool2;
        if (paramMotionEvent.bIa() == 1)
        {
          bool1 = bool2;
          if (paramMotionEvent.gsM == this.seZ)
          {
            bool1 = bool2;
            if (paramMotionEvent.startOffset == i) {
              bool1 = true;
            }
          }
        }
      }
      dP(i, i);
      paramMotionEvent = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb();
      if (!com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit) {
        break;
      }
      paramMotionEvent.bIj();
      paramMotionEvent.bIh();
      paramMotionEvent.e(true, 50L);
      paramMotionEvent.jS(true);
      paramMotionEvent.jR(bool1);
      break;
      if ((paramMotionEvent.getAction() == 1) && (this.seC != null))
      {
        this.seC.d(true, 300L);
        this.seC.yA(1);
      }
      bool1 = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(17220000284672L, 128299);
      return bool1;
      label721:
      bool1 = false;
      bool2 = true;
    }
  }
  
  public void setMaxHeight(int paramInt)
  {
    GMTrace.i(17219329196032L, 128294);
    super.setMaxHeight(paramInt);
    GMTrace.o(17219329196032L, 128294);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(17219866066944L, 128298);
    bHN();
    super.setText(paramString);
    bHO();
    GMTrace.o(17219866066944L, 128298);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\WXRTEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */