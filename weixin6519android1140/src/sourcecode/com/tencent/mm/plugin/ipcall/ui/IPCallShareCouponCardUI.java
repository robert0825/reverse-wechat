package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.pluginsdk.ui.applet.o.b;
import com.tencent.mm.protocal.c.afn;
import com.tencent.mm.protocal.c.bqo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.j.a.a;
import com.tencent.mm.ui.j.a.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class IPCallShareCouponCardUI
  extends MMActivity
  implements com.tencent.mm.ad.e, a.a, com.tencent.mm.ui.j.a.b
{
  private int DB;
  private String fLH;
  private View hS;
  private ProgressDialog htG;
  private String mTitle;
  private ProgressDialog moR;
  private View msA;
  private TextView msd;
  private TextView mse;
  private TextView msf;
  private TextView msg;
  private Button msh;
  private ImageView msi;
  private com.tencent.mm.ui.j.a msj;
  private ProgressDialog msk;
  private i msl;
  private ImageView msm;
  private ProgressBar msn;
  private com.tencent.mm.plugin.ipcall.a.e.e mso;
  private String msp;
  private String msq;
  private String msr;
  private String mss;
  private String mst;
  private String msu;
  private String msv;
  private String msw;
  private String msx;
  private bqo msy;
  private String msz;
  
  public IPCallShareCouponCardUI()
  {
    GMTrace.i(11678284513280L, 87010);
    this.msj = new com.tencent.mm.ui.j.a();
    this.htG = null;
    this.msk = null;
    this.msl = null;
    this.moR = null;
    this.msm = null;
    this.msn = null;
    this.mso = new com.tencent.mm.plugin.ipcall.a.e.e();
    this.msp = null;
    this.fLH = null;
    this.msq = null;
    this.mTitle = null;
    this.msr = null;
    this.mss = null;
    this.mst = null;
    this.msu = null;
    this.msv = null;
    this.msw = null;
    this.msx = null;
    this.msy = null;
    this.msz = null;
    this.DB = 0;
    GMTrace.o(11678284513280L, 87010);
  }
  
  public static String A(Context paramContext, int paramInt)
  {
    GMTrace.i(11679358255104L, 87018);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), paramContext.getString(R.l.dEK));
    localHashMap.put(Integer.valueOf(0), paramContext.getString(R.l.ekK));
    localHashMap.put(Integer.valueOf(1), paramContext.getString(R.l.dEP));
    localHashMap.put(Integer.valueOf(3), paramContext.getString(R.l.dEL));
    localHashMap.put(Integer.valueOf(2), paramContext.getString(R.l.dEO));
    localHashMap.put(Integer.valueOf(5), paramContext.getString(R.l.dEQ));
    localHashMap.put(Integer.valueOf(4), paramContext.getString(R.l.dER));
    localHashMap.put(Integer.valueOf(6), paramContext.getString(R.l.dEN));
    localHashMap.put(Integer.valueOf(7), paramContext.getString(R.l.dEM));
    if (localHashMap.containsKey(Integer.valueOf(paramInt)))
    {
      paramContext = (String)localHashMap.get(Integer.valueOf(paramInt));
      GMTrace.o(11679358255104L, 87018);
      return paramContext;
    }
    GMTrace.o(11679358255104L, 87018);
    return null;
  }
  
  /* Error */
  private static byte[] AC(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 225
    //   3: ldc -29
    //   5: invokestatic 103	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 233	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   11: pop
    //   12: invokestatic 239	com/tencent/mm/y/c:yU	()Ljava/lang/String;
    //   15: astore_1
    //   16: invokestatic 233	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   19: pop
    //   20: aload_1
    //   21: invokestatic 242	com/tencent/mm/y/c:yV	()Ljava/lang/String;
    //   24: ldc -12
    //   26: aload_0
    //   27: invokevirtual 248	java/lang/String:getBytes	()[B
    //   30: invokestatic 254	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   33: ldc_w 256
    //   36: invokestatic 262	com/tencent/mm/sdk/platformtools/h:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   39: astore_0
    //   40: aload_0
    //   41: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   44: ifeq +22 -> 66
    //   47: ldc_w 270
    //   50: ldc_w 272
    //   53: invokestatic 277	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: ldc2_w 225
    //   59: ldc -29
    //   61: invokestatic 156	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   64: aconst_null
    //   65: areturn
    //   66: new 279	java/io/RandomAccessFile
    //   69: dup
    //   70: aload_0
    //   71: ldc_w 281
    //   74: invokespecial 283	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: astore_1
    //   78: aload_1
    //   79: astore_0
    //   80: aload_1
    //   81: invokevirtual 287	java/io/RandomAccessFile:length	()J
    //   84: l2i
    //   85: newarray <illegal type>
    //   87: astore_2
    //   88: aload_1
    //   89: astore_0
    //   90: aload_1
    //   91: aload_2
    //   92: invokevirtual 291	java/io/RandomAccessFile:read	([B)I
    //   95: pop
    //   96: aload_1
    //   97: invokevirtual 294	java/io/RandomAccessFile:close	()V
    //   100: ldc2_w 225
    //   103: ldc -29
    //   105: invokestatic 156	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   108: aload_2
    //   109: areturn
    //   110: astore_2
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: astore_0
    //   115: ldc_w 270
    //   118: aload_2
    //   119: ldc_w 296
    //   122: iconst_0
    //   123: anewarray 298	java/lang/Object
    //   126: invokestatic 302	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_1
    //   130: ifnull +7 -> 137
    //   133: aload_1
    //   134: invokevirtual 294	java/io/RandomAccessFile:close	()V
    //   137: ldc2_w 225
    //   140: ldc -29
    //   142: invokestatic 156	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   145: aconst_null
    //   146: areturn
    //   147: astore_1
    //   148: aconst_null
    //   149: astore_0
    //   150: aload_0
    //   151: ifnull +7 -> 158
    //   154: aload_0
    //   155: invokevirtual 294	java/io/RandomAccessFile:close	()V
    //   158: aload_1
    //   159: athrow
    //   160: astore_0
    //   161: goto -61 -> 100
    //   164: astore_0
    //   165: goto -28 -> 137
    //   168: astore_0
    //   169: goto -11 -> 158
    //   172: astore_1
    //   173: goto -23 -> 150
    //   176: astore_2
    //   177: goto -64 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	paramString	String
    //   15	119	1	localObject1	Object
    //   147	12	1	localObject2	Object
    //   172	1	1	localObject3	Object
    //   87	22	2	arrayOfByte	byte[]
    //   110	9	2	localException1	Exception
    //   176	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   66	78	110	java/lang/Exception
    //   66	78	147	finally
    //   96	100	160	java/lang/Exception
    //   133	137	164	java/lang/Exception
    //   154	158	168	java/lang/Exception
    //   80	88	172	finally
    //   90	96	172	finally
    //   115	129	172	finally
    //   80	88	176	java/lang/Exception
    //   90	96	176	java/lang/Exception
  }
  
  public static void a(Context paramContext, int paramInt, TextView paramTextView, ImageView paramImageView)
  {
    GMTrace.i(11679224037376L, 87017);
    paramContext = A(paramContext, paramInt);
    if (paramContext != null) {
      paramTextView.setText(paramContext);
    }
    paramInt = pA(paramInt);
    if (paramInt != -1) {
      paramImageView.setImageResource(paramInt);
    }
    GMTrace.o(11679224037376L, 87017);
  }
  
  private static Bitmap aJt()
  {
    GMTrace.i(11680163561472L, 87024);
    Object localObject = AC(q.zE());
    if (localObject == null)
    {
      GMTrace.o(11680163561472L, 87024);
      return null;
    }
    localObject = com.tencent.mm.sdk.platformtools.d.bg((byte[])localObject);
    GMTrace.o(11680163561472L, 87024);
    return (Bitmap)localObject;
  }
  
  private static boolean ag(Context paramContext, String paramString)
  {
    GMTrace.i(11679626690560L, 87020);
    if (bg.nm(paramString))
    {
      GMTrace.o(11679626690560L, 87020);
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      GMTrace.o(11679626690560L, 87020);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      GMTrace.o(11679626690560L, 87020);
    }
    return false;
  }
  
  private void k(final int paramInt, final String paramString1, String paramString2)
  {
    GMTrace.i(11680431996928L, 87026);
    this.msA = View.inflate(this.vKB.vKW, R.i.ctz, null);
    final EditText localEditText = (EditText)this.msA.findViewById(R.h.bqa);
    this.msm = ((ImageView)this.msA.findViewById(R.h.bpY));
    this.msn = ((ProgressBar)this.msA.findViewById(R.h.bKF));
    localEditText.setText(paramString1);
    Object localObject = aJt();
    if (localObject == null)
    {
      localObject = q.zE();
      at.AR();
      localObject = new com.tencent.mm.ax.a((String)localObject, bg.e((Integer)com.tencent.mm.y.c.xh().get(66561, null)));
      at.wS().a((k)localObject, 0);
      this.msn.setVisibility(0);
    }
    for (;;)
    {
      com.tencent.mm.pluginsdk.ui.applet.e.a(this.vKB, paramString2, this.msA, getResources().getString(R.l.cUs), new o.b()
      {
        public final void fx(boolean paramAnonymousBoolean)
        {
          GMTrace.i(11648622395392L, 86789);
          if (paramAnonymousBoolean)
          {
            if (localEditText == null) {}
            for (final Object localObject = paramString1;; localObject = localEditText.getText().toString())
            {
              localObject = new com.tencent.mm.modelmulti.i(paramInt, (String)localObject);
              IPCallShareCouponCardUI localIPCallShareCouponCardUI1 = IPCallShareCouponCardUI.this;
              IPCallShareCouponCardUI localIPCallShareCouponCardUI2 = IPCallShareCouponCardUI.this;
              IPCallShareCouponCardUI.this.getString(R.l.cUG);
              IPCallShareCouponCardUI.b(localIPCallShareCouponCardUI1, h.a(localIPCallShareCouponCardUI2, IPCallShareCouponCardUI.this.getString(R.l.cUt), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(11674526416896L, 86982);
                  at.wS().c(localObject);
                  GMTrace.o(11674526416896L, 86982);
                }
              }));
              at.wS().a((k)localObject, 0);
              GMTrace.o(11648622395392L, 86789);
              return;
            }
          }
          GMTrace.o(11648622395392L, 86789);
        }
      });
      GMTrace.o(11680431996928L, 87026);
      return;
      if (this.msm != null) {
        this.msm.setImageBitmap((Bitmap)localObject);
      }
    }
  }
  
  public static int pA(int paramInt)
  {
    GMTrace.i(11679492472832L, 87019);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), Integer.valueOf(R.k.cJZ));
    localHashMap.put(Integer.valueOf(0), Integer.valueOf(R.k.cKL));
    localHashMap.put(Integer.valueOf(1), Integer.valueOf(R.k.cKK));
    localHashMap.put(Integer.valueOf(3), Integer.valueOf(R.k.cKa));
    localHashMap.put(Integer.valueOf(2), Integer.valueOf(R.k.cKM));
    localHashMap.put(Integer.valueOf(5), Integer.valueOf(R.k.cKN));
    localHashMap.put(Integer.valueOf(4), Integer.valueOf(R.k.cKO));
    localHashMap.put(Integer.valueOf(6), Integer.valueOf(R.k.cKb));
    localHashMap.put(Integer.valueOf(7), Integer.valueOf(R.k.cKJ));
    if (localHashMap.containsKey(Integer.valueOf(paramInt)))
    {
      paramInt = ((Integer)localHashMap.get(Integer.valueOf(paramInt))).intValue();
      GMTrace.o(11679492472832L, 87019);
      return paramInt;
    }
    GMTrace.o(11679492472832L, 87019);
    return -1;
  }
  
  private void pB(int paramInt)
  {
    GMTrace.i(11679895126016L, 87022);
    h.a(this.vKB.vKW, paramInt, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11671573626880L, 86960);
        GMTrace.o(11671573626880L, 86960);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11699222478848L, 87166);
        GMTrace.o(11699222478848L, 87166);
      }
    });
    GMTrace.o(11679895126016L, 87022);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11678418731008L, 87011);
    GMTrace.o(11678418731008L, 87011);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11679089819648L, 87016);
    String str;
    final Object localObject1;
    Object localObject2;
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.g)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.hS.setVisibility(0);
        paramString = com.tencent.mm.plugin.ipcall.b.c.aJI();
        if (paramString != null)
        {
          this.msp = paramString.uve;
          this.fLH = paramString.lPj;
          this.msq = paramString.uvf;
          this.mTitle = paramString.eBt;
          this.msr = paramString.mmS;
          this.mss = paramString.uvg;
          this.msu = paramString.uvh;
          this.msv = paramString.uvi;
          this.msw = paramString.uvj;
          this.msx = paramString.uvl;
          this.msy = paramString.uvk;
          this.msz = paramString.uvm;
        }
        this.msd.setText(this.msx);
        this.mse.setText(String.format(this.vKB.vKW.getString(R.l.dFE), new Object[] { this.msp }));
        this.msh.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11639764025344L, 86723);
            IPCallShareCouponCardUI.a(IPCallShareCouponCardUI.this);
            GMTrace.o(11639764025344L, 86723);
          }
        });
        this.msf.setText(String.format(getString(R.l.dFG), new Object[] { this.msx }));
        paramk = this.msg;
        str = String.format(getString(R.l.dFF), new Object[] { this.msx });
        localObject1 = getString(R.l.dFI);
        if (bg.nm((String)localObject1))
        {
          paramk.setText(str);
          if ((this.moR != null) && (this.moR.isShowing())) {
            this.moR.dismiss();
          }
          GMTrace.o(11679089819648L, 87016);
          return;
        }
        paramString = getString(R.l.dFK);
        localObject2 = paramk.getPaint();
        float f1 = ((TextPaint)localObject2).measureText(str);
        float f2 = ((TextPaint)localObject2).measureText(paramString);
        paramInt1 = com.tencent.mm.br.a.ef(this.vKB.vKW);
        paramInt2 = ((LinearLayout.LayoutParams)paramk.getLayoutParams()).leftMargin;
        paramInt1 -= ((LinearLayout.LayoutParams)paramk.getLayoutParams()).rightMargin + paramInt2;
        paramInt2 = (int)Math.ceil(f1 / paramInt1);
        int i = (int)Math.ceil((f1 + f2) / paramInt1);
        paramInt1 = paramInt2;
        if (paramInt2 == 0) {
          paramInt1 = 1;
        }
        if (i <= paramInt1) {
          break label789;
        }
        paramString = "\n" + paramString;
      }
    }
    label789:
    for (;;)
    {
      paramk.setGravity(17);
      localObject2 = Spannable.Factory.getInstance().newSpannable(str + paramString);
      localObject1 = new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11654527975424L, 86833);
          ((TextView)paramAnonymousView).setHighlightColor(IPCallShareCouponCardUI.this.getResources().getColor(R.e.transparent));
          com.tencent.mm.plugin.report.service.g.ork.i(13340, new Object[] { Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(1) });
          h.b(IPCallShareCouponCardUI.this.vKB.vKW, localObject1, IPCallShareCouponCardUI.this.getString(R.l.dFL), true).a(R.l.dEc, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(11637884977152L, 86709);
              GMTrace.o(11637884977152L, 86709);
            }
          });
          GMTrace.o(11654527975424L, 86833);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(11654662193152L, 86834);
          paramAnonymousTextPaint.setColor(IPCallShareCouponCardUI.this.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(false);
          GMTrace.o(11654662193152L, 86834);
        }
      };
      paramInt1 = str.length();
      paramInt2 = str.length();
      ((Spannable)localObject2).setSpan(localObject1, paramInt1, paramString.length() + paramInt2, 33);
      paramk.setText((CharSequence)localObject2);
      paramk.setMovementMethod(LinkMovementMethod.getInstance());
      break;
      if ((this.moR != null) && (this.moR.isShowing()))
      {
        this.moR.dismiss();
        h.a(this.vKB.vKW, getString(R.l.dEq), getString(R.l.dEm), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11651843620864L, 86813);
            IPCallShareCouponCardUI.this.finish();
            GMTrace.o(11651843620864L, 86813);
          }
        });
        GMTrace.o(11679089819648L, 87016);
        return;
        if ((paramk instanceof com.tencent.mm.modelmulti.i))
        {
          if (this.htG != null)
          {
            this.htG.dismiss();
            this.htG = null;
          }
          if (com.tencent.mm.plugin.subapp.b.hnI.b(this.vKB.vKW, paramInt1, paramInt2, paramString))
          {
            GMTrace.o(11679089819648L, 87016);
            return;
          }
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            h.h(this.vKB.vKW, R.l.dXF, R.l.cUG);
            GMTrace.o(11679089819648L, 87016);
            return;
          }
          h.bm(this, getResources().getString(R.l.div));
          GMTrace.o(11679089819648L, 87016);
          return;
        }
        if ((paramk instanceof com.tencent.mm.ax.a))
        {
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            GMTrace.o(11679089819648L, 87016);
            return;
          }
          if (this.msm != null)
          {
            if (this.msn != null) {
              this.msn.setVisibility(8);
            }
            this.msm.setImageBitmap(aJt());
          }
        }
      }
      GMTrace.o(11679089819648L, 87016);
      return;
    }
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(11679760908288L, 87021);
    if (this.msk != null) {
      this.msk.cancel();
    }
    switch (8.msI[paramc.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(11679760908288L, 87021);
      return;
      pB(R.l.eeQ);
      GMTrace.o(11679760908288L, 87021);
      return;
      GMTrace.o(11679760908288L, 87021);
      return;
      pB(R.l.eeP);
    }
  }
  
  public final void b(a.c paramc)
  {
    GMTrace.i(11680029343744L, 87023);
    GMTrace.o(11680029343744L, 87023);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11678955601920L, 87015);
    int i = R.i.cAg;
    GMTrace.o(11678955601920L, 87015);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(11680566214656L, 87027);
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      if (!bg.nm(paramIntent)) {
        com.tencent.mm.pluginsdk.ui.applet.e.a(this.vKB, this.mTitle, this.msq, this.fLH, null, true, getResources().getString(R.l.cUs), new o.a()
        {
          public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
          {
            GMTrace.i(11668352401408L, 86936);
            if (paramAnonymousBoolean)
            {
              Object localObject = new f.a();
              ((f.a)localObject).title = IPCallShareCouponCardUI.d(IPCallShareCouponCardUI.this);
              ((f.a)localObject).url = IPCallShareCouponCardUI.e(IPCallShareCouponCardUI.this);
              ((f.a)localObject).description = IPCallShareCouponCardUI.f(IPCallShareCouponCardUI.this);
              ((f.a)localObject).thumburl = IPCallShareCouponCardUI.g(IPCallShareCouponCardUI.this);
              ((f.a)localObject).type = 5;
              com.tencent.mm.pluginsdk.model.app.l.a((f.a)localObject, null, null, paramIntent, "", null, null);
              if (!bg.nm(paramAnonymousString))
              {
                localObject = new ol();
                ((ol)localObject).eTx.eTy = paramIntent;
                ((ol)localObject).eTx.content = paramAnonymousString;
                ((ol)localObject).eTx.type = s.go(paramIntent);
                ((ol)localObject).eTx.flags = 0;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
              }
              h.bm(IPCallShareCouponCardUI.this.vKB.vKW, IPCallShareCouponCardUI.this.getResources().getString(R.l.cUy));
              GMTrace.o(11668352401408L, 86936);
              return;
            }
            GMTrace.o(11668352401408L, 86936);
          }
        });
      }
    }
    GMTrace.o(11680566214656L, 87027);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11678552948736L, 87012);
    super.onCreate(paramBundle);
    oM(R.l.dFJ);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11690632544256L, 87102);
        IPCallShareCouponCardUI.this.finish();
        GMTrace.o(11690632544256L, 87102);
        return true;
      }
    });
    this.hS = findViewById(R.h.layout);
    this.msd = ((TextView)findViewById(R.h.bsm));
    this.mse = ((TextView)findViewById(R.h.bsT));
    this.msf = ((TextView)findViewById(R.h.bsl));
    this.msg = ((TextView)findViewById(R.h.bsn));
    this.msh = ((Button)findViewById(R.h.cem));
    this.msi = ((ImageView)findViewById(R.h.bFV));
    this.hS.setVisibility(8);
    com.tencent.mm.pluginsdk.ui.a.b.a(this.msi, q.zE(), 0.5F, false);
    paramBundle = this.vKB.vKW;
    getString(R.l.cUG);
    this.moR = h.a(paramBundle, getString(R.l.dEs), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11632113614848L, 86666);
        try
        {
          IPCallShareCouponCardUI.this.finish();
          GMTrace.o(11632113614848L, 86666);
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          w.e("MicroMsg.IPCallShareCouponCardUI", "loadFromSystemAddressBook error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
          GMTrace.o(11632113614848L, 86666);
        }
      }
    });
    com.tencent.mm.plugin.ipcall.a.f.b.aIT().fs(false);
    this.DB = getIntent().getIntExtra("IPCallShareCouponCardUI_KFrom", 0);
    at.wS().a(257, this);
    at.wS().a(1804, this);
    GMTrace.o(11678552948736L, 87012);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11678821384192L, 87014);
    super.onDestroy();
    at.wS().b(257, this);
    at.wS().b(1804, this);
    GMTrace.o(11678821384192L, 87014);
  }
  
  protected void onResume()
  {
    GMTrace.i(11678687166464L, 87013);
    super.onResume();
    GMTrace.o(11678687166464L, 87013);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallShareCouponCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */