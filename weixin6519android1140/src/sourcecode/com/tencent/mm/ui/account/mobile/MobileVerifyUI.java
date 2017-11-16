package com.tencent.mm.ui.account.mobile;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.m;
import com.tencent.mm.pluginsdk.i.o;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.account.RegByMobileVoiceVerifyUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.MMEditText.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bj;
import java.util.Timer;
import java.util.TimerTask;

public class MobileVerifyUI
  extends MMActivity
{
  String aDn;
  protected String eMW;
  int gUV;
  protected ProgressDialog htG;
  String llm;
  private Timer mTimer;
  private ContentResolver oWB;
  private String[] oWG;
  String osl;
  protected Button qXb;
  SecurityImage vMf;
  protected String vQG;
  private com.tencent.mm.pluginsdk.i.a vQt;
  protected boolean vRq;
  private int vTa;
  private int vVP;
  protected EditText vVi;
  protected MMFormInputView vWA;
  protected TextView vWB;
  protected TextView vWC;
  protected TextView vWD;
  protected ScrollView vWE;
  private c vWF;
  private long vWG;
  private boolean vWH;
  private String vWI;
  private boolean vWJ;
  Boolean vWK;
  Boolean vWL;
  protected boolean vWM;
  protected boolean vWN;
  protected int vWO;
  private b vWP;
  String vWQ;
  protected TextView vWa;
  
  public MobileVerifyUI()
  {
    GMTrace.i(2622077534208L, 19536);
    this.htG = null;
    this.vWG = 0L;
    this.vWH = false;
    this.vWJ = false;
    this.vMf = null;
    this.vTa = 30;
    this.vWM = false;
    this.vWN = false;
    this.vWO = -1;
    this.vRq = false;
    GMTrace.o(2622077534208L, 19536);
  }
  
  private void QK()
  {
    GMTrace.i(2623419711488L, 19546);
    this.vWJ = false;
    this.vWB.setEnabled(false);
    this.vWC.setVisibility(0);
    this.vWC.setText(getResources().getQuantityString(R.j.cIu, this.vTa, new Object[] { Integer.valueOf(this.vTa) }));
    this.vWB.setVisibility(8);
    aHR();
    this.vWP.Bw(a.vWZ);
    com.tencent.mm.ui.base.h.bm(this, getString(R.l.dIM));
    GMTrace.o(2623419711488L, 19546);
  }
  
  private void aHR()
  {
    GMTrace.i(2622882840576L, 19542);
    if (!this.vWH)
    {
      this.mTimer = new Timer();
      this.vWH = true;
      this.vWG = this.vTa;
      TimerTask local1 = new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(2629593726976L, 19592);
          MobileVerifyUI.this.vWC.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2603421270016L, 19397);
              MobileVerifyUI.b(MobileVerifyUI.this);
              if (MobileVerifyUI.c(MobileVerifyUI.this) >= 0L)
              {
                MobileVerifyUI.this.vWC.setText(MobileVerifyUI.this.getResources().getQuantityString(R.j.cIu, (int)MobileVerifyUI.c(MobileVerifyUI.this), new Object[] { Integer.valueOf((int)MobileVerifyUI.c(MobileVerifyUI.this)) }));
                GMTrace.o(2603421270016L, 19397);
                return;
              }
              MobileVerifyUI.this.vWC.setVisibility(8);
              MobileVerifyUI.this.vWB.setVisibility(0);
              MobileVerifyUI.d(MobileVerifyUI.this);
              MobileVerifyUI.this.vWB.setEnabled(true);
              MobileVerifyUI.this.vWB.setText(MobileVerifyUI.this.getString(R.l.dIW));
              GMTrace.o(2603421270016L, 19397);
            }
          });
          GMTrace.o(2629593726976L, 19592);
        }
      };
      this.mTimer.schedule(local1, 1000L, 1000L);
    }
    GMTrace.o(2622882840576L, 19542);
  }
  
  /* Error */
  private void bYZ()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc2_w 226
    //   6: sipush 19552
    //   9: invokestatic 108	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: ldc -27
    //   14: invokestatic 235	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   17: astore 8
    //   19: aload_0
    //   20: aload_0
    //   21: invokevirtual 239	com/tencent/mm/ui/account/mobile/MobileVerifyUI:getContentResolver	()Landroid/content/ContentResolver;
    //   24: putfield 241	com/tencent/mm/ui/account/mobile/MobileVerifyUI:oWB	Landroid/content/ContentResolver;
    //   27: ldc -13
    //   29: astore 6
    //   31: iconst_0
    //   32: istore_1
    //   33: iload_1
    //   34: aload_0
    //   35: getfield 245	com/tencent/mm/ui/account/mobile/MobileVerifyUI:oWG	[Ljava/lang/String;
    //   38: arraylength
    //   39: if_icmpge +99 -> 138
    //   42: iload_1
    //   43: aload_0
    //   44: getfield 245	com/tencent/mm/ui/account/mobile/MobileVerifyUI:oWG	[Ljava/lang/String;
    //   47: arraylength
    //   48: iconst_1
    //   49: isub
    //   50: if_icmpne +47 -> 97
    //   53: new 247	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 248	java/lang/StringBuilder:<init>	()V
    //   60: aload 6
    //   62: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: ldc -2
    //   67: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload_0
    //   71: getfield 245	com/tencent/mm/ui/account/mobile/MobileVerifyUI:oWG	[Ljava/lang/String;
    //   74: iload_1
    //   75: aaload
    //   76: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: ldc_w 256
    //   82: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: astore 6
    //   90: iload_1
    //   91: iconst_1
    //   92: iadd
    //   93: istore_1
    //   94: goto -61 -> 33
    //   97: new 247	java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial 248	java/lang/StringBuilder:<init>	()V
    //   104: aload 6
    //   106: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: ldc_w 262
    //   112: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: aload_0
    //   116: getfield 245	com/tencent/mm/ui/account/mobile/MobileVerifyUI:oWG	[Ljava/lang/String;
    //   119: iload_1
    //   120: aaload
    //   121: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc_w 264
    //   127: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: astore 6
    //   135: goto -45 -> 90
    //   138: new 247	java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial 248	java/lang/StringBuilder:<init>	()V
    //   145: aload 6
    //   147: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc_w 266
    //   153: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokestatic 272	java/lang/System:currentTimeMillis	()J
    //   159: ldc2_w 273
    //   162: lsub
    //   163: invokevirtual 277	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   166: ldc_w 279
    //   169: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: astore 6
    //   177: ldc_w 281
    //   180: new 247	java/lang/StringBuilder
    //   183: dup
    //   184: ldc_w 283
    //   187: invokespecial 286	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: aload 6
    //   192: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: invokestatic 292	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   201: aload 6
    //   203: ifnull +14 -> 217
    //   206: aload 6
    //   208: ldc_w 294
    //   211: invokevirtual 300	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   214: ifeq +13 -> 227
    //   217: ldc2_w 226
    //   220: sipush 19552
    //   223: invokestatic 131	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   226: return
    //   227: aload_0
    //   228: getfield 241	com/tencent/mm/ui/account/mobile/MobileVerifyUI:oWB	Landroid/content/ContentResolver;
    //   231: aload 8
    //   233: iconst_3
    //   234: anewarray 296	java/lang/String
    //   237: dup
    //   238: iconst_0
    //   239: ldc_w 302
    //   242: aastore
    //   243: dup
    //   244: iconst_1
    //   245: ldc_w 304
    //   248: aastore
    //   249: dup
    //   250: iconst_2
    //   251: ldc_w 306
    //   254: aastore
    //   255: aload 6
    //   257: aconst_null
    //   258: aconst_null
    //   259: invokevirtual 312	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   262: astore 6
    //   264: aload 6
    //   266: ifnonnull +35 -> 301
    //   269: aload 6
    //   271: ifnull +20 -> 291
    //   274: aload 6
    //   276: invokeinterface 318 1 0
    //   281: ifne +10 -> 291
    //   284: aload 6
    //   286: invokeinterface 321 1 0
    //   291: ldc2_w 226
    //   294: sipush 19552
    //   297: invokestatic 131	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   300: return
    //   301: iconst_m1
    //   302: istore_1
    //   303: lconst_0
    //   304: lstore_2
    //   305: aload 6
    //   307: invokeinterface 324 1 0
    //   312: ifeq +34 -> 346
    //   315: aload 6
    //   317: iconst_2
    //   318: invokeinterface 328 2 0
    //   323: lstore 4
    //   325: lload 4
    //   327: lload_2
    //   328: lcmp
    //   329: ifle +304 -> 633
    //   332: aload 6
    //   334: invokeinterface 332 1 0
    //   339: istore_1
    //   340: lload 4
    //   342: lstore_2
    //   343: goto +290 -> 633
    //   346: aload_0
    //   347: aconst_null
    //   348: putfield 334	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vWI	Ljava/lang/String;
    //   351: iload_1
    //   352: iflt +146 -> 498
    //   355: aload 6
    //   357: iload_1
    //   358: invokeinterface 337 2 0
    //   363: pop
    //   364: aload 6
    //   366: aload 6
    //   368: ldc_w 302
    //   371: invokeinterface 341 2 0
    //   376: invokeinterface 342 2 0
    //   381: astore 8
    //   383: ldc_w 344
    //   386: invokestatic 350	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   389: aload 8
    //   391: invokevirtual 354	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   394: astore 8
    //   396: aload 8
    //   398: invokevirtual 359	java/util/regex/Matcher:find	()Z
    //   401: ifeq +10 -> 411
    //   404: aload 8
    //   406: invokevirtual 362	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   409: astore 7
    //   411: aload_0
    //   412: aload 7
    //   414: putfield 334	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vWI	Ljava/lang/String;
    //   417: aload_0
    //   418: getfield 116	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vWJ	Z
    //   421: ifne +77 -> 498
    //   424: aload_0
    //   425: iconst_1
    //   426: putfield 116	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vWJ	Z
    //   429: aload_0
    //   430: getfield 364	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vVi	Landroid/widget/EditText;
    //   433: aload_0
    //   434: getfield 334	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vWI	Ljava/lang/String;
    //   437: invokevirtual 367	android/widget/EditText:setText	(Ljava/lang/CharSequence;)V
    //   440: aload_0
    //   441: invokevirtual 370	com/tencent/mm/ui/account/mobile/MobileVerifyUI:aLo	()V
    //   444: aload_0
    //   445: getfield 364	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vVi	Landroid/widget/EditText;
    //   448: invokevirtual 374	android/widget/EditText:getText	()Landroid/text/Editable;
    //   451: invokevirtual 375	java/lang/Object:toString	()Ljava/lang/String;
    //   454: invokevirtual 378	java/lang/String:trim	()Ljava/lang/String;
    //   457: ldc_w 294
    //   460: invokevirtual 300	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   463: ifne +35 -> 498
    //   466: aload_0
    //   467: getfield 110	com/tencent/mm/ui/account/mobile/MobileVerifyUI:htG	Landroid/app/ProgressDialog;
    //   470: ifnull +15 -> 485
    //   473: aload_0
    //   474: getfield 110	com/tencent/mm/ui/account/mobile/MobileVerifyUI:htG	Landroid/app/ProgressDialog;
    //   477: invokevirtual 383	android/app/ProgressDialog:dismiss	()V
    //   480: aload_0
    //   481: aconst_null
    //   482: putfield 110	com/tencent/mm/ui/account/mobile/MobileVerifyUI:htG	Landroid/app/ProgressDialog;
    //   485: aload_0
    //   486: getfield 181	com/tencent/mm/ui/account/mobile/MobileVerifyUI:vWP	Lcom/tencent/mm/ui/account/mobile/MobileVerifyUI$b;
    //   489: getstatic 386	com/tencent/mm/ui/account/mobile/MobileVerifyUI$a:vXa	I
    //   492: invokeinterface 188 2 0
    //   497: pop
    //   498: aload 6
    //   500: ifnull +108 -> 608
    //   503: aload 6
    //   505: invokeinterface 318 1 0
    //   510: ifne +98 -> 608
    //   513: aload 6
    //   515: invokeinterface 321 1 0
    //   520: ldc2_w 226
    //   523: sipush 19552
    //   526: invokestatic 131	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   529: return
    //   530: astore 7
    //   532: aconst_null
    //   533: astore 6
    //   535: ldc_w 281
    //   538: aload 7
    //   540: invokevirtual 387	java/lang/Exception:toString	()Ljava/lang/String;
    //   543: invokestatic 390	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   546: aload 6
    //   548: ifnull +60 -> 608
    //   551: aload 6
    //   553: invokeinterface 318 1 0
    //   558: ifne +50 -> 608
    //   561: aload 6
    //   563: invokeinterface 321 1 0
    //   568: ldc2_w 226
    //   571: sipush 19552
    //   574: invokestatic 131	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   577: return
    //   578: astore 7
    //   580: aconst_null
    //   581: astore 6
    //   583: aload 6
    //   585: ifnull +20 -> 605
    //   588: aload 6
    //   590: invokeinterface 318 1 0
    //   595: ifne +10 -> 605
    //   598: aload 6
    //   600: invokeinterface 321 1 0
    //   605: aload 7
    //   607: athrow
    //   608: ldc2_w 226
    //   611: sipush 19552
    //   614: invokestatic 131	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   617: return
    //   618: astore 7
    //   620: goto -37 -> 583
    //   623: astore 7
    //   625: goto -42 -> 583
    //   628: astore 7
    //   630: goto -95 -> 535
    //   633: goto -328 -> 305
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	636	0	this	MobileVerifyUI
    //   32	326	1	i	int
    //   304	39	2	l1	long
    //   323	18	4	l2	long
    //   29	570	6	localObject1	Object
    //   1	412	7	str	String
    //   530	9	7	localException1	Exception
    //   578	28	7	localObject2	Object
    //   618	1	7	localObject3	Object
    //   623	1	7	localObject4	Object
    //   628	1	7	localException2	Exception
    //   17	388	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   227	264	530	java/lang/Exception
    //   227	264	578	finally
    //   305	325	618	finally
    //   332	340	618	finally
    //   346	351	618	finally
    //   355	396	618	finally
    //   396	411	618	finally
    //   411	485	618	finally
    //   485	498	618	finally
    //   535	546	623	finally
    //   305	325	628	java/lang/Exception
    //   332	340	628	java/lang/Exception
    //   346	351	628	java/lang/Exception
    //   355	396	628	java/lang/Exception
    //   396	411	628	java/lang/Exception
    //   411	485	628	java/lang/Exception
    //   485	498	628	java/lang/Exception
  }
  
  private void bxP()
  {
    GMTrace.i(2623285493760L, 19545);
    aLo();
    if (this.vVi.getText().toString().trim().equals(""))
    {
      com.tencent.mm.ui.base.h.h(this, R.l.dad, R.l.cUG);
      GMTrace.o(2623285493760L, 19545);
      return;
    }
    this.vWP.Bw(a.vWY);
    GMTrace.o(2623285493760L, 19545);
  }
  
  private void goBack()
  {
    GMTrace.i(2623688146944L, 19548);
    com.tencent.mm.plugin.c.b.nz(this.osl);
    if (!this.vWP.Bw(a.vWX))
    {
      finish();
      GMTrace.o(2623688146944L, 19548);
      return;
    }
    GMTrace.o(2623688146944L, 19548);
  }
  
  protected final void MP()
  {
    GMTrace.i(2623151276032L, 19544);
    w.d("MicroMsg.MobileVerifyUI", "init getintent mobile:" + this.eMW);
    this.vWA = ((MMFormInputView)findViewById(R.h.bhc));
    Object localObject = this.vWA;
    if (((MMFormInputView)localObject).nUE != null) {
      ((MMFormInputView)localObject).nUE.setImeOptions(5);
    }
    for (;;)
    {
      this.vWA.setInputType(3);
      this.vVi = this.vWA.nUE;
      this.vWB = ((TextView)findViewById(R.h.bNW));
      this.vWC = ((TextView)findViewById(R.h.bNV));
      this.vWa = ((TextView)findViewById(R.h.bha));
      this.vWa.setText(this.eMW);
      this.eMW = an.Sa(this.eMW);
      this.vWB.setText(getString(R.l.dIX));
      this.vWD = ((TextView)findViewById(R.h.bhd));
      this.qXb = ((Button)findViewById(R.h.bQR));
      this.vWE = ((ScrollView)findViewById(R.h.bZP));
      this.oWG = getResources().getStringArray(R.c.aMx);
      localObject = getString(R.l.dRo);
      this.vWD.setText(Html.fromHtml((String)localObject));
      localObject = new InputFilter()
      {
        public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          GMTrace.i(2596039294976L, 19342);
          paramAnonymousCharSequence = bg.M(paramAnonymousCharSequence);
          GMTrace.o(2596039294976L, 19342);
          return paramAnonymousCharSequence;
        }
      };
      this.vWC.setVisibility(0);
      this.vWC.setText(getResources().getQuantityString(R.j.cIu, this.vTa, new Object[] { Integer.valueOf(this.vTa) }));
      aHR();
      this.vWJ = false;
      this.vVi.setFilters(new InputFilter[] { localObject });
      this.vVi.addTextChangedListener(new MMEditText.c(this.vVi, null, 12));
      this.qXb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2615769300992L, 19489);
          MobileVerifyUI.e(MobileVerifyUI.this);
          GMTrace.o(2615769300992L, 19489);
        }
      });
      this.qXb.setEnabled(false);
      this.vVi.setTextSize(15.0F);
      this.vVi.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(2621674881024L, 19533);
          if (bg.nm(MobileVerifyUI.this.vVi.getText().toString()))
          {
            MobileVerifyUI.this.vVi.setTextSize(15.0F);
            MobileVerifyUI.this.vVi.setGravity(16);
          }
          while ((MobileVerifyUI.this.vVi.getText() != null) && (MobileVerifyUI.this.vVi.getText().toString().length() > 0))
          {
            MobileVerifyUI.this.qXb.setEnabled(true);
            GMTrace.o(2621674881024L, 19533);
            return;
            MobileVerifyUI.this.vVi.setTextSize(24.0F);
            MobileVerifyUI.this.vVi.setGravity(16);
          }
          MobileVerifyUI.this.qXb.setEnabled(false);
          GMTrace.o(2621674881024L, 19533);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2621809098752L, 19534);
          GMTrace.o(2621809098752L, 19534);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2621943316480L, 19535);
          GMTrace.o(2621943316480L, 19535);
        }
      });
      this.vWB.setOnClickListener(new View.OnClickListener()
      {
        private final int vWT;
        private final int vWU;
        private final int vWV;
        
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2609461067776L, 19442);
          paramAnonymousView = new l(MobileVerifyUI.this);
          paramAnonymousView.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(2599797391360L, 19370);
              paramAnonymous2n.e(0, MobileVerifyUI.this.getString(R.l.dIX));
              if (com.tencent.mm.ap.b.ky(MobileVerifyUI.this.eMW)) {
                paramAnonymous2n.e(1, MobileVerifyUI.this.getString(R.l.daf));
              }
              if ((MobileVerifyUI.f(MobileVerifyUI.this) == 2) && (MobileVerifyUI.this.vWN)) {
                paramAnonymous2n.e(2, MobileVerifyUI.this.getString(R.l.dRs));
              }
              GMTrace.o(2599797391360L, 19370);
            }
          };
          paramAnonymousView.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(2631204339712L, 19604);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              default: 
                GMTrace.o(2631204339712L, 19604);
                return;
              case 0: 
                MobileVerifyUI.g(MobileVerifyUI.this);
                GMTrace.o(2631204339712L, 19604);
                return;
              }
              MobileVerifyUI.this.aLo();
              if (MobileVerifyUI.f(MobileVerifyUI.this) == 2) {
                com.tencent.mm.plugin.c.b.nz("R200_500");
              }
              for (;;)
              {
                paramAnonymous2MenuItem = new Intent(MobileVerifyUI.this, RegByMobileVoiceVerifyUI.class);
                Bundle localBundle = new Bundle();
                localBundle.putString("bindmcontact_mobile", MobileVerifyUI.this.eMW);
                localBundle.putInt("voice_verify_type", MobileVerifyUI.h(MobileVerifyUI.this));
                paramAnonymous2MenuItem.putExtras(localBundle);
                MobileVerifyUI.this.startActivity(paramAnonymous2MenuItem);
                break;
                if (MobileVerifyUI.f(MobileVerifyUI.this) == 3) {
                  com.tencent.mm.plugin.c.b.nz("F200_300");
                }
              }
            }
          };
          paramAnonymousView.bpI();
          GMTrace.o(2609461067776L, 19442);
        }
      });
      this.vWB.setEnabled(false);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2579664732160L, 19220);
          MobileVerifyUI.i(MobileVerifyUI.this);
          GMTrace.o(2579664732160L, 19220);
          return true;
        }
      });
      this.vVi.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(2580872691712L, 19229);
          if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
          {
            MobileVerifyUI.e(MobileVerifyUI.this);
            GMTrace.o(2580872691712L, 19229);
            return true;
          }
          GMTrace.o(2580872691712L, 19229);
          return false;
        }
      });
      this.vVi.setOnKeyListener(new View.OnKeyListener()
      {
        public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(2588254666752L, 19284);
          if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
          {
            MobileVerifyUI.e(MobileVerifyUI.this);
            GMTrace.o(2588254666752L, 19284);
            return true;
          }
          GMTrace.o(2588254666752L, 19284);
          return false;
        }
      });
      GMTrace.o(2623151276032L, 19544);
      return;
      w.e("MicroMsg.MMFormInputView", "contentET is null!");
    }
  }
  
  public final void aoK()
  {
    GMTrace.i(2623017058304L, 19543);
    if (this.vKB.vLo == 1)
    {
      this.vWE.scrollTo(0, this.vWE.getChildAt(0).getMeasuredHeight() - this.vWE.getMeasuredHeight());
      GMTrace.o(2623017058304L, 19543);
      return;
    }
    this.vWE.scrollTo(0, 0);
    GMTrace.o(2623017058304L, 19543);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2622748622848L, 19541);
    int i = R.i.cCu;
    GMTrace.o(2622748622848L, 19541);
    return i;
  }
  
  protected final void lt(boolean paramBoolean)
  {
    GMTrace.i(2624090800128L, 19551);
    Intent localIntent = new Intent(this, RegByMobileSetPwdUI.class);
    localIntent.putExtra("kintent_hint", getString(R.l.dZu));
    localIntent.putExtra("kintent_cancelable", paramBoolean);
    startActivityForResult(localIntent, 0);
    GMTrace.o(2624090800128L, 19551);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2622211751936L, 19537);
    super.onCreate(paramBundle);
    if (bj.BC().BD() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.vWL = Boolean.valueOf(bool);
      this.vVP = getIntent().getIntExtra("mobile_verify_purpose", 0);
      this.vWQ = getIntent().getStringExtra("MicroMsg.MobileVerifyUIIntent_sms_code");
      this.llm = getIntent().getStringExtra("kintent_password");
      this.aDn = getIntent().getStringExtra("kintent_nickname");
      this.vWK = Boolean.valueOf(getIntent().getBooleanExtra("kintent_hasavatar", false));
      this.vRq = getIntent().getBooleanExtra("from_deep_link", false);
      this.vQG = getIntent().getStringExtra("regsession_id");
      switch (this.vVP)
      {
      default: 
        w.e("MicroMsg.MobileVerifyUI", "wrong purpose %s", new Object[] { Integer.valueOf(this.vVP) });
        finish();
        GMTrace.o(2622211751936L, 19537);
        return;
      }
    }
    this.vWP = new h();
    if ((this.llm != null) && (this.llm.length() >= 8))
    {
      this.gUV = 1;
      paramBundle = getString(R.l.cZK);
      if (d.tJF) {
        paramBundle = getString(R.l.app_name) + getString(R.l.cRD);
      }
      sq(paramBundle);
      this.vTa = getIntent().getIntExtra("mobileverify_countdownsec", 30);
      this.vWM = getIntent().getBooleanExtra("mobileverify_fb", false);
      this.vWN = getIntent().getBooleanExtra("mobileverify_reg_qq", false);
      this.eMW = getIntent().getExtras().getString("bindmcontact_mobile");
      this.osl = com.tencent.mm.plugin.c.b.Qu();
      MP();
      this.vWP.a(this);
      if (this.vWQ == null) {
        break label458;
      }
      this.vVi.setText(this.vWQ);
      bxP();
    }
    for (;;)
    {
      this.vQt = new com.tencent.mm.pluginsdk.i.a();
      GMTrace.o(2622211751936L, 19537);
      return;
      this.gUV = 4;
      break;
      this.vWP = new f();
      break;
      this.vWP = new g();
      break;
      label458:
      this.vWF = new c(this);
      getContentResolver().registerContentObserver(Uri.parse("content://sms/"), true, this.vWF);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(2622345969664L, 19538);
    if (this.vWF != null)
    {
      getContentResolver().unregisterContentObserver(this.vWF);
      this.vWF = null;
    }
    if (this.vQt != null) {
      this.vQt.close();
    }
    super.onDestroy();
    GMTrace.o(2622345969664L, 19538);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2623553929216L, 19547);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(2623553929216L, 19547);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2623553929216L, 19547);
    return bool;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(2623822364672L, 19549);
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("nofification_type");
      w.d("MicroMsg.MobileVerifyUI", "[oneliang][notificationType]%s", new Object[] { paramIntent });
      if ((paramIntent != null) && (paramIntent.equals("no_reg_notification"))) {
        QK();
      }
    }
    GMTrace.o(2623822364672L, 19549);
  }
  
  public void onPause()
  {
    GMTrace.i(2622614405120L, 19540);
    super.onPause();
    this.vWP.stop();
    GMTrace.o(2622614405120L, 19540);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(2624359235584L, 19553);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.MobileVerifyUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(2624359235584L, 19553);
        return;
      }
    }
    w.i("MicroMsg.MobileVerifyUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(2624359235584L, 19553);
      return;
      if (paramArrayOfInt[0] == 0) {
        bYZ();
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(2622480187392L, 19539);
    super.onResume();
    this.vWP.start();
    GMTrace.o(2622480187392L, 19539);
  }
  
  protected final boolean q(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(2623956582400L, 19550);
    Object localObject = com.tencent.mm.h.a.dH(paramString);
    if (localObject != null)
    {
      ((com.tencent.mm.h.a)localObject).a(this, null, null);
      GMTrace.o(2623956582400L, 19550);
      return true;
    }
    if (paramInt1 == 4) {}
    int i;
    switch (paramInt2)
    {
    default: 
      switch (paramInt2)
      {
      default: 
        i = 0;
      }
      break;
    }
    while (i != 0)
    {
      GMTrace.o(2623956582400L, 19550);
      return true;
      if (at.wS().DN() == 5)
      {
        com.tencent.mm.ui.base.h.h(this, R.l.dLj, R.l.dLi);
        GMTrace.o(2623956582400L, 19550);
        return true;
      }
      m.bw(this);
      GMTrace.o(2623956582400L, 19550);
      return true;
      Toast.makeText(this, R.l.cZq, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, R.l.cZn, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, R.l.cZp, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, R.l.cZs, 0).show();
      i = 1;
      continue;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.cZZ), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2628788420608L, 19586);
          GMTrace.o(2628788420608L, 19586);
        }
      });
      i = 1;
      continue;
      com.tencent.mm.ui.base.h.a(this, R.l.cZX, R.l.bhd, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2615366647808L, 19486);
          GMTrace.o(2615366647808L, 19486);
        }
      });
      i = 1;
      continue;
      at.hold();
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      if (TextUtils.isEmpty(at.wy())) {}
      for (localObject = com.tencent.mm.br.a.X(this.vKB.vKW, R.l.dHY);; localObject = at.wy())
      {
        com.tencent.mm.ui.base.h.a(localActionBarActivity, (String)localObject, this.vKB.vKW.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2582751739904L, 19243);
            GMTrace.o(2582751739904L, 19243);
          }
        }, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2629056856064L, 19588);
            GMTrace.o(2629056856064L, 19588);
          }
        });
        i = 1;
        break;
      }
    }
    paramString = new o(paramInt1, paramInt2, paramString);
    if (this.vQt.a(this, paramString))
    {
      GMTrace.o(2623956582400L, 19550);
      return true;
    }
    GMTrace.o(2623956582400L, 19550);
    return false;
  }
  
  protected static enum a
  {
    static
    {
      GMTrace.i(2586644054016L, 19272);
      vWX = 1;
      vWY = 2;
      vWZ = 3;
      vXa = 4;
      vXb = new int[] { vWX, vWY, vWZ, vXa };
      GMTrace.o(2586644054016L, 19272);
    }
    
    public static int[] bZh()
    {
      GMTrace.i(2586509836288L, 19271);
      int[] arrayOfInt = (int[])vXb.clone();
      GMTrace.o(2586509836288L, 19271);
      return arrayOfInt;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean Bw(int paramInt);
    
    public abstract void a(MobileVerifyUI paramMobileVerifyUI);
    
    public abstract void start();
    
    public abstract void stop();
  }
  
  public final class c
    extends ContentObserver
  {
    private Activity activity;
    
    public c(Activity paramActivity)
    {
      super();
      GMTrace.i(2604092358656L, 19402);
      this.activity = paramActivity;
      GMTrace.o(2604092358656L, 19402);
    }
    
    public final void onChange(boolean paramBoolean)
    {
      GMTrace.i(2604226576384L, 19403);
      super.onChange(paramBoolean);
      if (MobileVerifyUI.f(MobileVerifyUI.this) != 3)
      {
        paramBoolean = com.tencent.mm.pluginsdk.h.a.a(this.activity, "android.permission.READ_SMS", 128, "", "");
        w.i("MicroMsg.MobileVerifyUI", "summerper checkPermission checkSMS[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW(), this.activity });
        if (!paramBoolean)
        {
          GMTrace.o(2604226576384L, 19403);
          return;
        }
        MobileVerifyUI.j(MobileVerifyUI.this);
      }
      GMTrace.o(2604226576384L, 19403);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\MobileVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */