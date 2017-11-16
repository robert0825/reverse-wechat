package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ot;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.card.a.c.a;
import com.tencent.mm.plugin.card.a.d.a;
import com.tencent.mm.plugin.card.a.g.a;
import com.tencent.mm.plugin.card.a.i.a;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.aa;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.v;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.ui.view.x;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.jv;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CardDetailUI
  extends MMActivity
  implements com.tencent.mm.ad.e, c.a, d.a, i.a, au.a
{
  private final String TAG;
  private float fJn;
  private float fJo;
  private a.a fJt;
  private String gjw;
  private com.tencent.mm.modelgeo.c gxh;
  private com.tencent.mm.ui.base.r ihl;
  private int jBM;
  private boolean jBZ;
  private boolean jCV;
  private int jDS;
  private String jDT;
  private String jDU;
  private String jDV;
  e jEi;
  private String jEj;
  private String jEk;
  private String jEl;
  private boolean jEm;
  private boolean jEn;
  private boolean jEo;
  private String jEp;
  private e.a jEq;
  private boolean jEr;
  private boolean jEs;
  private boolean jEt;
  private boolean jEu;
  private String jEv;
  private Vibrator jsv;
  private int jtE;
  private String jwL;
  private com.tencent.mm.plugin.card.base.b jwZ;
  private String jxB;
  private boolean jxS;
  private ArrayList<jp> jxf;
  ae mHandler;
  private long mStartTime;
  
  public CardDetailUI()
  {
    GMTrace.i(4975719612416L, 37072);
    this.TAG = "MicroMsg.CardDetailUI";
    this.ihl = null;
    this.jwL = "";
    this.jxB = "";
    this.jEj = "";
    this.jEk = "";
    this.jEl = "";
    this.jDT = "";
    this.jDU = "";
    this.jDV = "";
    this.jxS = false;
    this.jEm = false;
    this.jEn = false;
    this.jEo = false;
    this.gjw = "";
    this.jEp = "";
    this.jBZ = false;
    this.mHandler = new ae();
    this.jtE = 3;
    this.jDS = 0;
    this.jBM = -1;
    this.jEr = false;
    this.jEs = true;
    this.mStartTime = 0L;
    this.jEt = false;
    this.jCV = false;
    this.jEu = false;
    this.fJn = -85.0F;
    this.fJo = -1000.0F;
    this.jEv = "";
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15360547880960L, 114445);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15360547880960L, 114445);
          return true;
        }
        if ((CardDetailUI.a(CardDetailUI.this) == -85.0F) && (CardDetailUI.b(CardDetailUI.this) == -1000.0F))
        {
          CardDetailUI.a(CardDetailUI.this, paramAnonymousFloat2);
          CardDetailUI.b(CardDetailUI.this, paramAnonymousFloat1);
          al.akt().s(CardDetailUI.a(CardDetailUI.this), CardDetailUI.b(CardDetailUI.this));
        }
        if (CardDetailUI.c(CardDetailUI.this))
        {
          CardDetailUI.d(CardDetailUI.this);
          CardDetailUI.e(CardDetailUI.this);
        }
        CardDetailUI.f(CardDetailUI.this);
        GMTrace.o(15360547880960L, 114445);
        return false;
      }
    };
    GMTrace.o(4975719612416L, 37072);
  }
  
  private void a(i.b paramb)
  {
    GMTrace.i(4980417232896L, 37107);
    if (this.jEi.eIE)
    {
      w.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
      GMTrace.o(4980417232896L, 37107);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
    this.jEi.a(this.jEo, paramb, true);
    GMTrace.o(4980417232896L, 37107);
  }
  
  private void aiS()
  {
    GMTrace.i(4978806620160L, 37095);
    if (this.gxh == null) {
      this.gxh = com.tencent.mm.modelgeo.c.Ir();
    }
    this.gxh.a(this.fJt, true);
    GMTrace.o(4978806620160L, 37095);
  }
  
  private void aiU()
  {
    GMTrace.i(4978940837888L, 37096);
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    GMTrace.o(4978940837888L, 37096);
  }
  
  private void akN()
  {
    GMTrace.i(4977330225152L, 37084);
    this.jEq.jtE = this.jtE;
    this.jEq.jBM = this.jBM;
    this.jEq.jwL = this.jwL;
    this.jEi.a(this.jwZ, this.jEq, this.jxf);
    this.jEi.akN();
    al.aky().jwZ = this.jwZ;
    GMTrace.o(4977330225152L, 37084);
  }
  
  private void akW()
  {
    GMTrace.i(4979075055616L, 37097);
    this.gxh = com.tencent.mm.modelgeo.c.Ir();
    aiS();
    GMTrace.o(4979075055616L, 37097);
  }
  
  private void ali()
  {
    GMTrace.i(4976659136512L, 37079);
    at.wS().a(645, this);
    at.wS().a(651, this);
    at.wS().a(563, this);
    at.wS().a(652, this);
    at.wS().a(560, this);
    at.wS().a(699, this);
    at.wS().a(902, this);
    at.wS().a(904, this);
    at.wS().a(1163, this);
    GMTrace.o(4976659136512L, 37079);
  }
  
  private void alj()
  {
    GMTrace.i(4976793354240L, 37080);
    at.wS().b(645, this);
    at.wS().b(651, this);
    at.wS().b(563, this);
    at.wS().b(652, this);
    at.wS().b(560, this);
    at.wS().b(699, this);
    at.wS().b(902, this);
    at.wS().b(904, this);
    at.wS().b(1163, this);
    GMTrace.o(4976793354240L, 37080);
  }
  
  private void alk()
  {
    GMTrace.i(4977061789696L, 37082);
    this.jBM = this.jtE;
    this.jEq = new e.a();
    this.jEq.jtE = this.jtE;
    this.jEq.jBM = this.jBM;
    this.jEq.jwL = this.jwL;
    this.jEq.jEj = this.jEj;
    this.jEq.jEl = this.jEl;
    this.jEq.jEk = this.jEk;
    this.jEq.jDT = this.jDT;
    this.jEq.jDU = this.jDU;
    this.jEq.jxS = this.jxS;
    this.jEq.jFf = getIntent().getIntExtra("key_from_appbrand_type", 0);
    GMTrace.o(4977061789696L, 37082);
  }
  
  private void all()
  {
    int j = 1;
    int i = 1;
    GMTrace.i(4977196007424L, 37083);
    if ((this.jEt) || (this.jwZ == null))
    {
      GMTrace.o(4977196007424L, 37083);
      return;
    }
    this.jEt = true;
    if (this.jxS)
    {
      localg = com.tencent.mm.plugin.report.service.g.ork;
      j = this.jwZ.ajv().jxG;
      str1 = this.jwZ.ajA();
      str2 = this.jwZ.ajz();
      k = this.jBM;
      str3 = this.jEj;
      if (this.jwZ.ajt()) {}
      for (;;)
      {
        localg.i(11324, new Object[] { "ShareCardDetailUI", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
        GMTrace.o(4977196007424L, 37083);
        return;
        i = 0;
      }
    }
    com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
    int k = this.jwZ.ajv().jxG;
    String str1 = this.jwZ.ajA();
    String str2 = this.jwZ.ajz();
    int m = this.jBM;
    String str3 = this.jEj;
    if (this.jwZ.ajt()) {}
    for (i = j;; i = 0)
    {
      localg.i(11324, new Object[] { "CardDetailView", Integer.valueOf(k), str1, str2, Integer.valueOf(0), Integer.valueOf(m), str3, Integer.valueOf(i), "" });
      GMTrace.o(4977196007424L, 37083);
      return;
    }
  }
  
  private void alm()
  {
    GMTrace.i(4978001313792L, 37089);
    Object localObject = new bhb();
    ((bhb)localObject).uSV = this.gjw;
    ((bhb)localObject).jyV = this.jEp;
    w.i("MicroMsg.CardDetailUI", "GetCardItemInfo templateId:%s", new Object[] { this.gjw });
    localObject = new aa(this.jwL, this.jtE, this.jEj, this.jEl, this.jDT, this.jDU, this.jDS, this.jDV, (bhb)localObject);
    at.wS().a((com.tencent.mm.ad.k)localObject, 0);
    GMTrace.o(4978001313792L, 37089);
  }
  
  private void aln()
  {
    GMTrace.i(4978135531520L, 37090);
    Object localObject;
    if (!TextUtils.isEmpty(this.jwZ.ajA())) {
      localObject = this.jwZ.ajA();
    }
    while ((this.jwZ != null) && (this.jwZ.ajv().tZM == 1))
    {
      float f2 = this.fJn;
      float f3 = this.fJo;
      float f1;
      if (f2 != -85.0F)
      {
        f1 = f3;
        if (f3 != -1000.0F) {}
      }
      else
      {
        f2 = al.akt().fJn;
        f1 = al.akt().fJo;
      }
      localObject = new v((String)localObject, f1, f2, this.jwZ.ajz());
      at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      GMTrace.o(4978135531520L, 37090);
      return;
      if (!TextUtils.isEmpty(this.jwL))
      {
        localObject = this.jwL;
      }
      else
      {
        w.e("MicroMsg.CardDetailUI", "doNetSceneCardShopLBS card id is null, return");
        GMTrace.o(4978135531520L, 37090);
        return;
      }
    }
    if ((this.jwZ != null) && (this.jwZ.ajv().tZM > 1))
    {
      if ((this.fJn != -85.0F) && (this.fJo != -1000.0F))
      {
        this.jEu = false;
        localObject = new v((String)localObject, this.fJo, this.fJn, this.jwZ.ajz());
        at.wS().a((com.tencent.mm.ad.k)localObject, 0);
        GMTrace.o(4978135531520L, 37090);
        return;
      }
      if (!this.jEu)
      {
        this.jEu = true;
        if (this.jCV)
        {
          aiS();
          GMTrace.o(4978135531520L, 37090);
        }
      }
    }
    else if (this.jwZ != null)
    {
      this.jwZ.a(null);
      akN();
      if (this.jwZ.ajb())
      {
        localObject = al.akv().uk(this.jwL);
        if (localObject != null)
        {
          ((ShareCardInfo)localObject).a(null);
          al.akv().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.jwL });
        }
        GMTrace.o(4978135531520L, 37090);
        return;
      }
      localObject = al.akn().tU(this.jwL);
      if (localObject != null)
      {
        ((CardInfo)localObject).a(null);
        al.akn().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.jwL });
      }
    }
    GMTrace.o(4978135531520L, 37090);
  }
  
  private void alo()
  {
    GMTrace.i(4978269749248L, 37091);
    com.tencent.mm.plugin.card.sharecard.model.c localc = new com.tencent.mm.plugin.card.sharecard.model.c(this.jwL);
    at.wS().a(localc, 0);
    GMTrace.o(4978269749248L, 37091);
  }
  
  private void b(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    GMTrace.i(4977598660608L, 37086);
    w.e("MicroMsg.CardDetailUI", "handleAcceptError, errCode = " + paramInt1 + " errMsg = " + paramString1 + " ret_code:" + paramInt2 + " ret_msg:" + paramString2);
    if (paramInt2 == 10000)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2)) {
        paramString1 = getString(R.l.dbU);
      }
      this.jwZ.ajw().status = 4;
      akN();
    }
    for (;;)
    {
      com.tencent.mm.plugin.card.b.d.b(this, paramString1);
      GMTrace.o(4977598660608L, 37086);
      return;
      if (paramInt2 == 10001)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(R.l.dbX);
        }
        this.jwZ.ajw().status = 5;
        akN();
      }
      else if (paramInt2 == 10002)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(R.l.ddn);
        }
      }
      else
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(R.l.dbS);
        }
      }
    }
  }
  
  private void du(boolean paramBoolean)
  {
    GMTrace.i(4977732878336L, 37087);
    if (paramBoolean)
    {
      this.ihl = com.tencent.mm.ui.base.r.b(this, getString(R.l.bKJ), true, 0, null);
      GMTrace.o(4977732878336L, 37087);
      return;
    }
    if ((this.ihl != null) && (this.ihl.isShowing()))
    {
      this.ihl.dismiss();
      this.ihl = null;
    }
    GMTrace.o(4977732878336L, 37087);
  }
  
  private void dw(boolean paramBoolean)
  {
    GMTrace.i(4977867096064L, 37088);
    if (paramBoolean) {
      com.tencent.mm.plugin.card.b.l.bK(this.jEi.jEU, this.jEi.jET);
    }
    GMTrace.o(4977867096064L, 37088);
  }
  
  private void dx(boolean paramBoolean)
  {
    GMTrace.i(4978538184704L, 37093);
    if (((this.jBM == 7) || (this.jBM == 8) || (this.jBM == 16) || (this.jBM == 26)) && (this.jtE == 3))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_code", this.jEv);
      setResult(-1, localIntent);
      if (paramBoolean) {
        finish();
      }
      GMTrace.o(4978538184704L, 37093);
      return;
    }
    if (((this.jBM == 7) && (this.jtE == 7)) || ((this.jBM == 16) && (this.jtE == 16)) || ((this.jBM == 8) && (this.jtE == 8)) || ((this.jBM == 26) && (this.jtE == 26)))
    {
      setResult(0);
      if (paramBoolean)
      {
        finish();
        GMTrace.o(4978538184704L, 37093);
      }
    }
    else if (paramBoolean)
    {
      finish();
    }
    GMTrace.o(4978538184704L, 37093);
  }
  
  private void lP(int paramInt)
  {
    GMTrace.i(4978672402432L, 37094);
    if ((this.jBM != 7) && (this.jBM != 16))
    {
      w.i("MicroMsg.CardDetailUI", "mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_JSAPI and mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_NEARBY_PEOPLE_JSAPI ,don't push accept event");
      GMTrace.o(4978672402432L, 37094);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new com.tencent.mm.plugin.card.model.e();
    ((com.tencent.mm.plugin.card.model.e)localObject).jxF = this.jwZ.ajA();
    ((com.tencent.mm.plugin.card.model.e)localObject).eTK = this.jEl;
    ((com.tencent.mm.plugin.card.model.e)localObject).code = this.jEv;
    localLinkedList.add(localObject);
    localObject = new com.tencent.mm.g.a.b();
    ((com.tencent.mm.g.a.b)localObject).ezO.aGY = paramInt;
    if (paramInt == -1) {}
    for (((com.tencent.mm.g.a.b)localObject).ezO.ezP = com.tencent.mm.plugin.card.b.h.a(localLinkedList, true, this.jBM);; ((com.tencent.mm.g.a.b)localObject).ezO.ezP = com.tencent.mm.plugin.card.b.h.a(localLinkedList, false, this.jBM))
    {
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(4978672402432L, 37094);
      return;
    }
  }
  
  /* Error */
  private void tL(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 785
    //   5: ldc_w 787
    //   8: invokestatic 89	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 127	com/tencent/mm/plugin/card/ui/CardDetailUI:jBZ	Z
    //   15: ifeq +23 -> 38
    //   18: ldc 91
    //   20: ldc_w 789
    //   23: invokestatic 430	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 785
    //   29: ldc_w 787
    //   32: invokestatic 166	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: ldc 91
    //   40: ldc_w 791
    //   43: invokestatic 200	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: aload_0
    //   47: iconst_1
    //   48: putfield 127	com/tencent/mm/plugin/card/ui/CardDetailUI:jBZ	Z
    //   51: new 328	android/content/Intent
    //   54: dup
    //   55: aload_0
    //   56: ldc_w 793
    //   59: invokespecial 796	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   62: astore_2
    //   63: aload_2
    //   64: ldc_w 798
    //   67: aload_0
    //   68: getfield 182	com/tencent/mm/plugin/card/ui/CardDetailUI:jwZ	Lcom/tencent/mm/plugin/card/base/b;
    //   71: invokeinterface 221 1 0
    //   76: invokevirtual 604	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   79: pop
    //   80: aload_2
    //   81: ldc_w 800
    //   84: aload_1
    //   85: invokevirtual 604	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   88: pop
    //   89: aload_2
    //   90: ldc_w 802
    //   93: aload_0
    //   94: getfield 182	com/tencent/mm/plugin/card/ui/CardDetailUI:jwZ	Lcom/tencent/mm/plugin/card/base/b;
    //   97: invokeinterface 349 1 0
    //   102: getfield 805	com/tencent/mm/protocal/c/ju:gjg	Ljava/lang/String;
    //   105: invokevirtual 604	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   108: pop
    //   109: aload_2
    //   110: ldc_w 807
    //   113: aload_0
    //   114: getfield 134	com/tencent/mm/plugin/card/ui/CardDetailUI:jtE	I
    //   117: invokevirtual 810	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   120: pop
    //   121: aload_2
    //   122: ldc_w 812
    //   125: iconst_0
    //   126: invokevirtual 810	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   129: pop
    //   130: aload_0
    //   131: aload_2
    //   132: invokevirtual 816	com/tencent/mm/plugin/card/ui/CardDetailUI:startActivity	(Landroid/content/Intent;)V
    //   135: ldc2_w 785
    //   138: ldc_w 787
    //   141: invokestatic 166	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   144: goto -109 -> 35
    //   147: astore_1
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_1
    //   151: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	CardDetailUI
    //   0	152	1	paramString	String
    //   62	70	2	localIntent	Intent
    // Exception table:
    //   from	to	target	type
    //   2	35	147	finally
    //   38	144	147	finally
  }
  
  protected final void MP()
  {
    GMTrace.i(4976927571968L, 37081);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5004710641664L, 37288);
        CardDetailUI.g(CardDetailUI.this);
        GMTrace.o(5004710641664L, 37288);
        return true;
      }
    });
    this.jsv = ((Vibrator)getSystemService("vibrator"));
    Object localObject2;
    if (this.jEi == null)
    {
      this.jEi = new e(this, this.vKB.hqF);
      localObject1 = this.jEi;
      ((e)localObject1).jEQ = new j(((e)localObject1).iPC);
      localObject2 = ((e)localObject1).jEQ;
      ((j)localObject2).jBI = ((j)localObject2).hyB.getWindow().getAttributes().screenBrightness;
      if (((j)localObject2).hwd == null)
      {
        View localView = View.inflate(((j)localObject2).hyB, R.i.crs, null);
        ((j)localObject2).hwf = localView.findViewById(R.h.bTG);
        ((j)localObject2).hwe = ((ImageView)localView.findViewById(R.h.bTF));
        ((j)localObject2).jIL = ((TextView)localView.findViewById(R.h.bTI));
        ((j)localObject2).jIM = ((TextView)localView.findViewById(R.h.bTH));
        ((j)localObject2).jIN = localView.findViewById(R.h.bTE);
        ((j)localObject2).jIO = ((ImageView)localView.findViewById(R.h.bTD));
        ((j)localObject2).jIP = ((MMVerticalTextView)localView.findViewById(R.h.cjY));
        ((j)localObject2).jIQ = ((MMVerticalTextView)localView.findViewById(R.h.cjZ));
        localView.setOnClickListener(new j.2((j)localObject2));
        ((j)localObject2).hwd = new com.tencent.mm.ui.base.q(localView, -1, -1, true);
        ((j)localObject2).hwd.update();
        ((j)localObject2).hwd.setBackgroundDrawable(new ColorDrawable(16777215));
        ((j)localObject2).hwd.setOnDismissListener(new j.3((j)localObject2));
      }
      ((e)localObject1).jES = new com.tencent.mm.plugin.card.a.f(((e)localObject1).iPC);
      ((e)localObject1).iPC.vKC = ((MMActivity.a)localObject1);
      com.tencent.mm.sdk.b.a.vgX.b(((e)localObject1).jFb);
      localObject1 = this.jEi;
      if (((e)localObject1).jEz == null)
      {
        ((e)localObject1).jEz = new x();
        ((e)localObject1).jEz.a((n)localObject1);
      }
      if (((e)localObject1).jEB == null)
      {
        ((e)localObject1).jEB = new com.tencent.mm.plugin.card.ui.view.o();
        ((e)localObject1).jEB.a((n)localObject1);
      }
      if (((e)localObject1).jEC == null)
      {
        ((e)localObject1).jEC = new com.tencent.mm.plugin.card.ui.view.a();
        ((e)localObject1).jEC.a((n)localObject1);
      }
      ((e)localObject1).Ev = ((ListView)((e)localObject1).findViewById(R.h.blX));
      ((e)localObject1).jEF = new m(((e)localObject1).iPC.vKB.vKW);
      ((e)localObject1).jEF.jJy = ((e)localObject1).hwh;
      ((e)localObject1).Ev.setAdapter(((e)localObject1).jEF);
      ((e)localObject1).jEF.notifyDataSetChanged();
      ((e)localObject1).Ev.setOnItemClickListener(new e.1((e)localObject1));
      ((e)localObject1).dl = ((LinearLayout)((e)localObject1).findViewById(R.h.bGc));
      ((e)localObject1).jEO = new com.tencent.mm.plugin.card.ui.view.d();
      ((e)localObject1).jEO.a((n)localObject1);
      ((e)localObject1).jEQ.jwZ = ((e)localObject1).jwZ;
    }
    int i = getIntent().getIntExtra("key_from_scene", -1);
    w.i("MicroMsg.CardDetailUI", "scene:%d", new Object[] { Integer.valueOf(i) });
    int j;
    if ((i == 2) || (i == 6) || (i == 5))
    {
      this.jtE = i;
      localObject1 = getIntent().getStringExtra("key_card_app_msg");
      localObject2 = com.tencent.mm.plugin.card.b.g.uy((String)localObject1);
      if (localObject2 != null)
      {
        this.jwL = ((com.tencent.mm.plugin.card.model.d)localObject2).eTJ;
        this.jEj = ((com.tencent.mm.plugin.card.model.d)localObject2).jyR;
        this.jEl = ((com.tencent.mm.plugin.card.model.d)localObject2).eTK;
        j = ((com.tencent.mm.plugin.card.model.d)localObject2).jyU;
        w.i("MicroMsg.CardDetailUI", "scene is " + i + ", isRecommend is " + j);
        if ((j == 1) && (i == 2)) {
          this.jtE = 23;
        }
        this.jEp = ((com.tencent.mm.plugin.card.model.d)localObject2).jyV;
        w.i("MicroMsg.CardDetailUI", "recommend_card_id is " + this.jEp);
      }
      this.jEk = com.tencent.mm.plugin.card.b.g.uz((String)localObject1);
      alk();
      if (!TextUtils.isEmpty(this.jwL)) {
        break label1760;
      }
      w.e("MicroMsg.CardDetailUI", "initData, mCardId is null");
      dx(true);
    }
    for (;;)
    {
      this.jEi.a(this.jwZ, this.jEq, this.jxf);
      this.jEi.jEY = new e.d()
      {
        public final void alo()
        {
          GMTrace.i(4970082467840L, 37030);
          CardDetailUI.n(CardDetailUI.this);
          GMTrace.o(4970082467840L, 37030);
        }
        
        public final void alp()
        {
          GMTrace.i(4969142943744L, 37023);
          CardDetailUI.h(CardDetailUI.this);
          GMTrace.o(4969142943744L, 37023);
        }
        
        public final void alq()
        {
          GMTrace.i(4969411379200L, 37025);
          CardDetailUI.i(CardDetailUI.this);
          GMTrace.o(4969411379200L, 37025);
        }
        
        public final void alr()
        {
          GMTrace.i(4969545596928L, 37026);
          CardDetailUI.j(CardDetailUI.this);
          GMTrace.o(4969545596928L, 37026);
        }
        
        public final void als()
        {
          GMTrace.i(4969679814656L, 37027);
          CardDetailUI.g(CardDetailUI.this);
          GMTrace.o(4969679814656L, 37027);
        }
        
        public final void alt()
        {
          GMTrace.i(4969814032384L, 37028);
          CardDetailUI.k(CardDetailUI.this);
          GMTrace.o(4969814032384L, 37028);
        }
        
        public final void alu()
        {
          GMTrace.i(4970216685568L, 37031);
          w.i("MicroMsg.CardDetailUI", "onConsumeCodeUIResult()");
          GMTrace.o(4970216685568L, 37031);
        }
        
        public final void d(com.tencent.mm.plugin.card.base.b paramAnonymousb)
        {
          GMTrace.i(4969948250112L, 37029);
          CardDetailUI.a(CardDetailUI.this, paramAnonymousb);
          CardDetailUI.b(CardDetailUI.this, paramAnonymousb.ajz());
          CardDetailUI.l(CardDetailUI.this).jwL = CardDetailUI.m(CardDetailUI.this);
          GMTrace.o(4969948250112L, 37029);
        }
        
        public final void dy(boolean paramAnonymousBoolean)
        {
          GMTrace.i(4970350903296L, 37032);
          w.i("MicroMsg.CardDetailUI", "doMark()");
          CardDetailUI.o(CardDetailUI.this);
          CardDetailUI.p(CardDetailUI.this);
          CardDetailUI.a(CardDetailUI.this, paramAnonymousBoolean);
          if (CardDetailUI.q(CardDetailUI.this).ajo())
          {
            al.akz().y(CardDetailUI.m(CardDetailUI.this), com.tencent.mm.plugin.card.b.l.uK(CardDetailUI.q(CardDetailUI.this).ajB()), 2);
            GMTrace.o(4970350903296L, 37032);
            return;
          }
          al.akz().y(CardDetailUI.m(CardDetailUI.this), com.tencent.mm.plugin.card.b.l.uK(CardDetailUI.q(CardDetailUI.this).ajB()), 1);
          GMTrace.o(4970350903296L, 37032);
        }
        
        public final void up(String paramAnonymousString)
        {
          GMTrace.i(4969277161472L, 37024);
          CardDetailUI.a(CardDetailUI.this, paramAnonymousString);
          GMTrace.o(4969277161472L, 37024);
        }
      };
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
      w.i("MicroMsg.CardDetailUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      this.jCV = bool;
      if (this.jCV)
      {
        this.gxh = com.tencent.mm.modelgeo.c.Ir();
        aiS();
      }
      GMTrace.o(4976927571968L, 37081);
      return;
      if ((com.tencent.mm.plugin.card.b.l.lW(i)) || (i == 0) || (i == 1) || (i == 3) || (i == 4) || (i == 9) || (i == 12) || (i == 15) || (i == 17) || (i == 21))
      {
        this.jtE = i;
        this.jwL = getIntent().getStringExtra("key_card_id");
        this.jEl = getIntent().getStringExtra("key_card_ext");
        this.jxS = getIntent().getBooleanExtra("key_is_share_card", false);
        this.jDS = getIntent().getIntExtra("key_stastic_scene", 0);
        this.jDV = getIntent().getStringExtra("key_consumed_card_id");
        if ((i == 7) || (i == 16))
        {
          this.jDT = getIntent().getStringExtra("src_username");
          this.jDU = getIntent().getStringExtra("js_url");
          this.gjw = getIntent().getStringExtra("key_template_id");
          break;
        }
        if ((this.jxS) && (i == 3))
        {
          this.jxB = getIntent().getStringExtra("key_card_tp_id");
          this.jwL = com.tencent.mm.plugin.card.sharecard.a.b.bD(this.jwL, this.jxB);
          break;
        }
        if (i != 8) {
          break;
        }
        this.jEr = getIntent().getBooleanExtra("key_is_sms_add_card", false);
        break;
      }
      if ((i == 50) || (i == 27))
      {
        this.jtE = getIntent().getIntExtra("key_previous_scene", 50);
        if ((this.jtE != 26) && (this.jtE != 27)) {
          this.jtE = 3;
        }
        this.gjw = getIntent().getStringExtra("key_template_id");
        if (this.jtE == 27)
        {
          localObject1 = (com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info");
          if (localObject1 != null)
          {
            this.jwZ = ((com.tencent.mm.plugin.card.base.b)localObject1);
            this.jwL = this.jwZ.ajz();
            alk();
            aln();
            if (this.jwZ.ajp()) {
              al.akA().tK(this.jwZ.ajz());
            }
            akN();
          }
          all();
          com.tencent.mm.plugin.card.b.l.amU();
        }
        else
        {
          localObject1 = com.tencent.mm.plugin.card.b.k.aK(getIntent().getStringExtra("card_list"), this.jtE);
          if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
          {
            w.e("MicroMsg.CardDetailUI", "initData tempList size is empty");
            dx(true);
          }
          for (;;)
          {
            alk();
            break;
            du(true);
            this.jwL = ((jv)((LinkedList)localObject1).get(0)).jxF;
            i = getIntent().getIntExtra("key_previous_scene", 51);
            localObject2 = new bhb();
            ((bhb)localObject2).uSV = this.gjw;
            w.i("MicroMsg.CardDetailUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.gjw });
            localObject1 = new com.tencent.mm.plugin.card.model.t((LinkedList)localObject1, (bhb)localObject2, i);
            at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
          }
        }
      }
      else if (i == 51)
      {
        if (getIntent().getIntExtra("key_previous_scene", 51) == 26) {}
        for (this.jtE = 26;; this.jtE = 3)
        {
          this.jwL = getIntent().getStringExtra("key_card_id");
          this.jwZ = al.aks().jwB;
          if (this.jwZ == null) {
            this.jwZ = al.akn().tU(this.jwL);
          }
          alk();
          if (this.jwZ != null) {
            break label1608;
          }
          w.e("MicroMsg.CardDetailUI", "initData, mCardId is null from scene == ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_VIEW_UI");
          dx(true);
          break;
        }
        label1608:
        aln();
        akN();
        all();
        if (this.jwZ.ajp()) {
          al.akA().tK(this.jwZ.ajz());
        }
      }
      else
      {
        if (i == 26)
        {
          this.jtE = i;
          this.jwL = getIntent().getStringExtra("key_card_id");
          this.jEl = getIntent().getStringExtra("key_card_ext");
          break;
        }
        this.jtE = i;
        localObject1 = getIntent().getStringExtra("key_card_app_msg");
        localObject2 = com.tencent.mm.plugin.card.b.g.uy((String)localObject1);
        if (localObject2 != null)
        {
          this.jwL = ((com.tencent.mm.plugin.card.model.d)localObject2).eTJ;
          this.jEj = ((com.tencent.mm.plugin.card.model.d)localObject2).jyR;
          this.jEl = ((com.tencent.mm.plugin.card.model.d)localObject2).eTK;
        }
        this.jEk = com.tencent.mm.plugin.card.b.g.uz((String)localObject1);
        break;
        label1760:
        if ((i == 2) || (i == 6) || ((i == 4) && (!this.jxS)) || (i == 5) || (i == 17) || (i == 21) || (i == 23)) {
          i = 1;
        }
        for (;;)
        {
          if ((i == 0) && (this.jwZ != null)) {
            break label1977;
          }
          w.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene1 is true or no cardinfo with cardId = " + this.jwL + " isShareCard is " + this.jxS);
          du(true);
          if (!this.jxS) {
            break label1970;
          }
          alo();
          break;
          if (i == 15)
          {
            localObject1 = al.aks().getValue("key_accept_card_info");
            if ((localObject1 != null) && ((localObject1 instanceof CardInfo)))
            {
              this.jwZ = ((CardInfo)localObject1);
              i = 0;
            }
            else
            {
              i = 1;
            }
          }
          else if (this.jxS)
          {
            this.jwZ = al.akv().uk(this.jwL);
            i = 0;
          }
          else
          {
            this.jwZ = al.akn().tU(this.jwL);
            i = 0;
          }
        }
        label1970:
        alm();
      }
    }
    label1977:
    w.d("MicroMsg.CardDetailUI", "initData(), cardId = " + this.jwL);
    Object localObject1 = this.jwZ.ajy();
    if (localObject1 != null)
    {
      this.jxf = new ArrayList();
      this.jxf.add(localObject1);
    }
    akN();
    if (this.jwZ.ajp()) {
      al.akA().tK(this.jwZ.ajz());
    }
    if (this.jxS)
    {
      this.jEs = true;
      i = 1;
      label2084:
      if (i == 0) {
        break label2220;
      }
      w.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene2 is true or no cardinfo with cardId = " + this.jwL + " isShareCard is " + this.jxS);
      if (!this.jxS) {
        break label2213;
      }
      alo();
    }
    for (;;)
    {
      all();
      break;
      if ((int)(System.currentTimeMillis() / 1000L) - this.jwZ.ajC() >= 86400L) {}
      for (j = 1;; j = 0)
      {
        if (j == 0) {
          break label2191;
        }
        this.jEs = true;
        i = 1;
        break;
      }
      label2191:
      if (!this.jwZ.ajm()) {
        break label2084;
      }
      this.jEs = true;
      i = 1;
      break label2084;
      label2213:
      alm();
      continue;
      label2220:
      aln();
    }
  }
  
  public final void Zp()
  {
    GMTrace.i(4976524918784L, 37078);
    super.Zp();
    if (this.jBM == 26) {
      overridePendingTransition(0, 0);
    }
    GMTrace.o(4976524918784L, 37078);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(4977464442880L, 37085);
    w.i("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      du(false);
      Object localObject;
      if ((paramk instanceof aa))
      {
        paramString = ((aa)paramk).jzG;
        if (TextUtils.isEmpty(paramString))
        {
          w.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetCardItemInfo return json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        paramk = this.jwZ;
        localObject = new CardInfo();
        com.tencent.mm.plugin.card.b.f.a((CardInfo)localObject, paramString);
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).ajz()))
        {
          this.jwL = ((com.tencent.mm.plugin.card.base.b)localObject).ajz();
          this.jwZ = ((com.tencent.mm.plugin.card.base.b)localObject);
          aln();
          if (this.jtE == 3)
          {
            if (paramk != null)
            {
              ((CardInfo)this.jwZ).field_stickyAnnouncement = ((CardInfo)paramk).field_stickyAnnouncement;
              ((CardInfo)this.jwZ).field_stickyEndTime = ((CardInfo)paramk).field_stickyEndTime;
              ((CardInfo)this.jwZ).field_stickyIndex = ((CardInfo)paramk).field_stickyIndex;
              ((CardInfo)this.jwZ).field_label_wording = ((CardInfo)paramk).field_label_wording;
              this.jwZ.a(paramk.ajy());
            }
            if (!this.jEs) {
              break label384;
            }
            com.tencent.mm.plugin.card.b.l.j(this.jwZ);
          }
        }
        for (;;)
        {
          akN();
          all();
          if (this.jwZ.ajp()) {
            al.akA().tK(this.jwZ.ajz());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          if ((!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).ajz())) || (this.jwL.equals(((com.tencent.mm.plugin.card.base.b)localObject).ajA()))) {
            break;
          }
          w.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.jwL, ((com.tencent.mm.plugin.card.base.b)localObject).ajA() });
          GMTrace.o(4977464442880L, 37085);
          return;
          label384:
          w.e("MicroMsg.CardDetailUI", "onSceneEnd(), NetSceneGetCardItemInfo updateDataToDB is false");
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.model.o))
      {
        if (this.jBM == 26) {
          du(false);
        }
        localObject = ((com.tencent.mm.plugin.card.model.o)paramk).jzG;
        paramInt1 = ((com.tencent.mm.plugin.card.model.o)paramk).jzH;
        paramk = ((com.tencent.mm.plugin.card.model.o)paramk).jzI;
        if (paramInt1 != 0) {
          b(paramInt2, paramString, paramInt1, paramk);
        }
        while (TextUtils.isEmpty((CharSequence)localObject))
        {
          w.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneAcceptCardItem return json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
          com.tencent.mm.ui.base.h.bm(this, getResources().getString(R.l.dce));
        }
        this.jtE = 3;
        if (this.jwZ == null) {
          this.jwZ = new CardInfo();
        }
        com.tencent.mm.plugin.card.b.f.a((CardInfo)this.jwZ, (String)localObject);
        if (!TextUtils.isEmpty(this.jwZ.ajz())) {
          this.jwL = this.jwZ.ajz();
        }
        if (this.jEi.alI() == 1)
        {
          paramString = this.jEi;
          if (paramString.jES != null)
          {
            paramString = paramString.jES;
            if (paramString.jxe != null) {
              paramString.jxe.jxV = false;
            }
          }
        }
        if (this.jBM != 26)
        {
          aln();
          akN();
        }
        com.tencent.mm.plugin.card.b.l.amU();
        paramString = this.jwZ;
        if (paramString.ajc())
        {
          at.AR();
          paramk = (Integer)com.tencent.mm.y.c.xh().get(w.a.vrn, Integer.valueOf(0));
          if ((paramk == null) || (paramk.intValue() != 1))
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vrn, Integer.valueOf(1));
            if (!com.tencent.mm.plugin.card.b.l.amX()) {
              break label873;
            }
            com.tencent.mm.plugin.card.b.d.c(this, R.i.crB, R.l.dcb, paramString.ajv().jyS);
          }
          label721:
          this.jEv = this.jwZ.ajF();
          if ((this.jBM != 7) && (this.jBM != 16)) {
            break label895;
          }
          paramString = new Intent();
          paramString.putExtra("key_code", this.jEv);
          setResult(-1, paramString);
          lP(-1);
        }
        for (;;)
        {
          if (this.jwZ.ajp()) {
            al.akA().tK(this.jwZ.ajz());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          at.AR();
          paramk = (Integer)com.tencent.mm.y.c.xh().get(282884, null);
          if ((paramk != null) && (paramk.intValue() == 1)) {
            break label721;
          }
          at.AR();
          com.tencent.mm.y.c.xh().set(282884, Integer.valueOf(1));
          break;
          label873:
          com.tencent.mm.plugin.card.b.d.c(this, R.i.crA, R.l.dca, paramString.ajv().jyS);
          break label721;
          label895:
          if ((!this.jEr) && (this.jBM == 8)) {
            dx(true);
          } else if ((this.jBM == 26) && (paramInt1 == 0)) {
            dx(true);
          }
        }
      }
      if ((paramk instanceof v))
      {
        this.jxf = ((v)paramk).jzP;
        if ((this.jwZ != null) && (this.jxf != null) && (this.jxf.size() > 0))
        {
          this.jwZ.a((jp)this.jxf.get(0));
          akN();
          if (this.jwZ.ajb())
          {
            paramString = al.akv().uk(this.jwL);
            if (paramString != null)
            {
              paramString.a((jp)this.jxf.get(0));
              al.akv().c(paramString, new String[] { this.jwL });
            }
            GMTrace.o(4977464442880L, 37085);
            return;
          }
          paramString = al.akn().tU(this.jwL);
          if (paramString != null)
          {
            paramString.a((jp)this.jxf.get(0));
            al.akn().c(paramString, new String[] { this.jwL });
          }
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        if ((this.jwZ != null) && (this.jxf == null))
        {
          this.jwZ.a(null);
          akN();
          if (this.jwZ.ajb())
          {
            paramString = al.akv().uk(this.jwL);
            if (paramString != null)
            {
              paramString.a(null);
              al.akv().c(paramString, new String[] { this.jwL });
            }
            GMTrace.o(4977464442880L, 37085);
            return;
          }
          paramString = al.akn().tU(this.jwL);
          if (paramString != null)
          {
            paramString.a(null);
            al.akn().c(paramString, new String[] { this.jwL });
          }
        }
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof af))
      {
        paramInt1 = ((af)paramk).jzH;
        localObject = ((af)paramk).jzI;
        if (paramInt1 == 10000)
        {
          paramString = (String)localObject;
          if (TextUtils.isEmpty((CharSequence)localObject)) {
            paramString = getString(R.l.dcG);
          }
          com.tencent.mm.plugin.card.b.d.b(this, paramString);
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        this.jEl = ((af)paramk).eTK;
        dw(true);
        paramString = this.jwZ.ajw();
        paramString.status = 3;
        this.jwZ.a(paramString);
        com.tencent.mm.plugin.card.b.l.j(this.jwZ);
        akN();
        if (this.jBM == 3)
        {
          dx(true);
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        if (this.jBM == 15)
        {
          paramString = new ot();
          com.tencent.mm.sdk.b.a.vgX.m(paramString);
        }
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.model.r))
      {
        com.tencent.mm.ui.base.h.bm(this, getResources().getString(R.l.dcv));
        al.akm();
        com.tencent.mm.plugin.card.a.b.lD(4);
        dx(true);
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.model.t))
      {
        paramString = ((com.tencent.mm.plugin.card.model.t)paramk).jzN;
        if ((paramString != null) && (paramString.size() > 0))
        {
          paramString = (com.tencent.mm.plugin.card.base.b)paramString.get(0);
          if ((paramString != null) && (!this.jwL.equals(paramString.ajA())))
          {
            w.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.jwL, paramString.ajA() });
            GMTrace.o(4977464442880L, 37085);
            return;
          }
          this.jwZ = paramString;
          if (this.jwZ != null)
          {
            this.jwL = this.jwZ.ajz();
            aln();
            if (this.jwZ.ajp()) {
              al.akA().tK(this.jwZ.ajz());
            }
          }
          if (this.jtE == 26) {
            this.jtE = 3;
          }
          akN();
        }
        all();
        com.tencent.mm.plugin.card.b.l.amU();
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.g))
      {
        paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).jzG;
        paramInt1 = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).jzH;
        paramk = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).jzI;
        if (paramInt1 != 0)
        {
          paramString = paramk;
          if (TextUtils.isEmpty(paramk)) {
            paramString = getString(R.l.dbT);
          }
          com.tencent.mm.plugin.card.b.d.b(this, paramString);
          w.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, accept card error, ret_msg:%s", new Object[] { paramString });
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        com.tencent.mm.ui.base.h.bm(this, getResources().getString(R.l.dbW));
        if (TextUtils.isEmpty(paramString))
        {
          w.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        this.jtE = 3;
        if (this.jwZ == null)
        {
          this.jwZ = new ShareCardInfo();
          com.tencent.mm.plugin.card.b.f.a((ShareCardInfo)this.jwZ, paramString);
          paramk = (ShareCardInfo)this.jwZ;
          if (!TextUtils.isEmpty(paramString)) {
            break label2146;
          }
          w.e("MicroMsg.CardInfoParser", "parserShareCardItemEncryptCodeForSingle jsonContent is null");
          label1877:
          if (!TextUtils.isEmpty(this.jwZ.ajz())) {
            this.jwL = this.jwZ.ajz();
          }
          if (TextUtils.isEmpty(this.jwZ.ajB())) {
            ((ShareCardInfo)this.jwZ).field_from_username = com.tencent.mm.y.q.zE();
          }
          com.tencent.mm.plugin.card.b.l.a((ShareCardInfo)this.jwZ);
          aln();
          akN();
          com.tencent.mm.plugin.card.b.l.amW();
          al.aku().aic();
          this.jEv = this.jwZ.ajF();
          if ((this.jBM != 7) && (this.jBM != 16)) {
            break label2238;
          }
          paramString = new Intent();
          paramString.putExtra("key_code", this.jEv);
          setResult(-1, paramString);
          lP(-1);
        }
        for (;;)
        {
          at.AR();
          paramString = (Integer)com.tencent.mm.y.c.xh().get(w.a.vrl, Integer.valueOf(0));
          if ((paramString == null) || (paramString.intValue() != 1))
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vrl, Integer.valueOf(1));
            com.tencent.mm.plugin.card.b.d.c(this, R.i.crD, R.l.ddJ, "");
          }
          if (this.jwZ.ajp()) {
            al.akA().tK(this.jwZ.ajz());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          if (!(this.jwZ instanceof CardInfo)) {
            break;
          }
          this.jwZ = new ShareCardInfo();
          break;
          try
          {
            label2146:
            paramString = new JSONObject(paramString).optJSONArray("card_list");
            if (paramString == null) {
              break label1877;
            }
            paramk.jxK = paramString.optJSONObject(0).optString("encrypt_code");
            w.i("MicroMsg.CardInfoParser", "encrypt_code:" + paramk.jxK);
          }
          catch (JSONException paramString)
          {
            w.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
            w.e("MicroMsg.CardInfoParser", paramString.getMessage());
          }
          break label1877;
          label2238:
          if ((!this.jEr) && (this.jBM == 8)) {
            dx(true);
          }
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.c))
      {
        paramk = ((com.tencent.mm.plugin.card.sharecard.model.c)paramk).jzG;
        if (TextUtils.isEmpty(paramk))
        {
          w.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetShareCard json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        paramString = this.jwZ;
        this.jwZ = new ShareCardInfo();
        localObject = (ShareCardInfo)this.jwZ;
        if (TextUtils.isEmpty(paramk))
        {
          w.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
          if (paramString != null)
          {
            if (!TextUtils.isEmpty(paramString.ajB())) {
              ((ShareCardInfo)this.jwZ).field_from_username = ((ShareCardInfo)paramString).field_from_username;
            }
            ((ShareCardInfo)this.jwZ).field_app_id = ((ShareCardInfo)paramString).field_app_id;
            ((ShareCardInfo)this.jwZ).field_consumer = ((ShareCardInfo)paramString).field_consumer;
            ((ShareCardInfo)this.jwZ).field_share_time = ((ShareCardInfo)paramString).field_share_time;
            ((ShareCardInfo)this.jwZ).field_updateTime = ((ShareCardInfo)paramString).field_updateTime;
            ((ShareCardInfo)this.jwZ).field_begin_time = ((ShareCardInfo)paramString).field_begin_time;
            ((ShareCardInfo)this.jwZ).field_end_time = ((ShareCardInfo)paramString).field_end_time;
            ((ShareCardInfo)this.jwZ).field_block_mask = ((ShareCardInfo)paramString).field_block_mask;
            this.jwZ.a(paramString.ajy());
            ((ShareCardInfo)this.jwZ).field_categoryType = ((ShareCardInfo)paramString).field_categoryType;
            ((ShareCardInfo)this.jwZ).field_itemIndex = ((ShareCardInfo)paramString).field_itemIndex;
            if (((ShareCardInfo)paramString).field_status != ((ShareCardInfo)this.jwZ).field_status)
            {
              w.i("MicroMsg.CardDetailUI", "getsharecared return, the status is " + ((ShareCardInfo)this.jwZ).field_status);
              com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.jwZ);
            }
          }
          if (!TextUtils.isEmpty(this.jwZ.ajz())) {
            this.jwL = this.jwZ.ajz();
          }
          akN();
          aln();
          all();
          if (this.jtE == 3)
          {
            if (!this.jEs) {
              break label2744;
            }
            com.tencent.mm.plugin.card.b.l.j(this.jwZ);
          }
        }
        for (;;)
        {
          if (this.jwZ.ajp()) {
            al.akA().tK(this.jwZ.ajz());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          try
          {
            com.tencent.mm.plugin.card.b.f.a((ShareCardInfo)localObject, new JSONObject(paramk));
          }
          catch (JSONException paramk)
          {
            w.printErrStackTrace("MicroMsg.CardInfoParser", paramk, "", new Object[0]);
          }
          break;
          label2744:
          w.e("MicroMsg.CardDetailUI", "onSceneEnd() sharecard updateDataToDB is false");
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.a))
      {
        if (((com.tencent.mm.plugin.card.sharecard.model.a)paramk).jzH != 0)
        {
          com.tencent.mm.plugin.card.b.d.b(this, getString(R.l.dct));
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        w.i("MicroMsg.CardDetailUI", "delete share card, card id is " + this.jwZ.ajz());
        com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.jwZ);
        com.tencent.mm.ui.base.h.bm(this, getResources().getString(R.l.dcv));
        al.aku().akE();
        dx(true);
        GMTrace.o(4977464442880L, 37085);
      }
    }
    else
    {
      w.e("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " cmd:" + paramk.getType());
      du(false);
      if (!(paramk instanceof af)) {
        break label3023;
      }
      dw(false);
      paramInt1 = ((af)paramk).jzH;
      paramk = ((af)paramk).jzI;
      if (paramInt1 != 10000) {
        break label3086;
      }
      paramString = paramk;
      if (TextUtils.isEmpty(paramk)) {
        paramString = getString(R.l.dcG);
      }
    }
    label3023:
    label3086:
    for (;;)
    {
      paramk = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paramk = getString(R.l.den);
      }
      Toast.makeText(this.vKB.vKW, paramk, 0).show();
      GMTrace.o(4977464442880L, 37085);
      return;
      if ((paramk instanceof com.tencent.mm.plugin.card.model.o))
      {
        lP(0);
        b(paramInt2, paramString, ((com.tencent.mm.plugin.card.model.o)paramk).jzH, ((com.tencent.mm.plugin.card.model.o)paramk).jzI);
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof v))
      {
        GMTrace.o(4977464442880L, 37085);
        return;
      }
    }
  }
  
  public final void abx()
  {
    GMTrace.i(18899466715136L, 140812);
    com.tencent.mm.plugin.card.ui.view.g localg = this.jEi.jEE;
    if (localg != null) {
      localg.amQ();
    }
    GMTrace.o(18899466715136L, 140812);
  }
  
  public final void ajN()
  {
    GMTrace.i(4980551450624L, 37108);
    w.i("MicroMsg.CardDetailUI", "code change");
    if ((this.jEi.jEE instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.jEi.jEE).jIS = al.akA().getCode();
      this.jEi.akN();
    }
    GMTrace.o(4980551450624L, 37108);
  }
  
  public final void ajS()
  {
    GMTrace.i(4979611926528L, 37101);
    w.i("MicroMsg.CardDetailUI", "onVibrate");
    this.jsv.vibrate(300L);
    GMTrace.o(4979611926528L, 37101);
  }
  
  public final void ajT()
  {
    GMTrace.i(4979746144256L, 37102);
    w.i("MicroMsg.CardDetailUI", "onFinishUI");
    GMTrace.o(4979746144256L, 37102);
  }
  
  public final void b(String paramString, i.b paramb)
  {
    GMTrace.i(4980014579712L, 37104);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.jwL)))
    {
      w.e("MicroMsg.CardDetailUI", "onMarkSuccess(), the mark card id is diff from current id!");
      GMTrace.o(4980014579712L, 37104);
      return;
    }
    du(false);
    w.i("MicroMsg.CardDetailUI", "onMarkSuccess()");
    w.i("MicroMsg.CardDetailUI", "markSucc:" + paramb.jxt + " markCardId: " + paramb.jxu);
    this.jEn = false;
    if (paramb.jxt == 1)
    {
      if ((!TextUtils.isEmpty(paramb.jxu)) && (!this.jwZ.ajz().equals(paramb.jxu)))
      {
        w.i("MicroMsg.CardDetailUI", "markCardId is diff as now id!");
        if (this.jwZ.ajb())
        {
          paramString = al.akv().uk(paramb.jxu);
          if (paramString != null)
          {
            this.jwZ = paramString;
            this.jwL = paramb.jxu;
            akN();
            al.aky().d(this.jwZ);
            w.i("MicroMsg.CardDetailUI", "update the mCardInfo");
            this.jEm = true;
            a(paramb);
            GMTrace.o(4980014579712L, 37104);
            return;
          }
          w.e("MicroMsg.CardDetailUI", "The mark card id not exist the card info in DB!， mark failed!");
          com.tencent.mm.plugin.card.b.d.b(this, getString(R.l.dcZ));
          this.jEm = false;
          GMTrace.o(4980014579712L, 37104);
        }
      }
      else
      {
        w.i("MicroMsg.CardDetailUI", "markCardId is same as now id!");
        this.jEm = true;
        a(paramb);
        GMTrace.o(4980014579712L, 37104);
      }
    }
    else
    {
      this.jEm = false;
      com.tencent.mm.plugin.card.b.d.b(this, getString(R.l.dda));
    }
    GMTrace.o(4980014579712L, 37104);
  }
  
  public final void bz(String paramString1, String paramString2)
  {
    GMTrace.i(4980148797440L, 37105);
    if ((!TextUtils.isEmpty(paramString1)) && (!paramString1.equals(this.jwL)))
    {
      w.e("MicroMsg.CardDetailUI", "onMarkFail(), the mark card id is diff from current id!");
      GMTrace.o(4980148797440L, 37105);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "onMarkFail()");
    this.jEm = false;
    this.jEn = false;
    du(false);
    paramString1 = paramString2;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = getString(R.l.dcZ);
    }
    com.tencent.mm.plugin.card.b.d.b(this, paramString1);
    GMTrace.o(4980148797440L, 37105);
  }
  
  public final void f(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(4979477708800L, 37100);
    if (paramb == null)
    {
      w.e("MicroMsg.CardDetailUI", "cardInfo is empty, not to do onDataChange");
      GMTrace.o(4979477708800L, 37100);
      return;
    }
    if ((this.jwZ == null) || (!this.jwZ.ajz().equals(paramb.ajz())))
    {
      w.e("MicroMsg.CardDetailUI", "is not the same card, not to do onDataChange");
      GMTrace.o(4979477708800L, 37100);
      return;
    }
    if (!this.jEi.alJ())
    {
      w.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onDataChange");
      GMTrace.o(4979477708800L, 37100);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "onDataChange");
    this.jwZ = paramb;
    this.jwL = this.jwZ.ajz();
    if ((this.jwZ.ajp()) && (al.akA().isEmpty())) {
      al.akA().tK(this.jwZ.ajz());
    }
    akN();
    GMTrace.o(4979477708800L, 37100);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4975853830144L, 37073);
    int i = R.i.cqS;
    GMTrace.o(4975853830144L, 37073);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4975988047872L, 37074);
    super.onCreate(paramBundle);
    this.mStartTime = System.currentTimeMillis();
    ali();
    paramBundle = al.aky();
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    at.wS().a(910, paramBundle);
    al.aku().a(paramBundle);
    com.tencent.mm.plugin.card.a.b localb = al.akm();
    if (localb.jwK == null) {
      localb.jwK = new ArrayList();
    }
    if (paramBundle != null) {
      localb.jwK.add(new WeakReference(paramBundle));
    }
    paramBundle.Yt = new WeakReference(localActionBarActivity);
    al.aky().a(this);
    al.akz().a(this);
    paramBundle = al.akA();
    at.wS().a(577, paramBundle);
    paramBundle.jwM.clear();
    paramBundle.jwN = 0;
    al.akA().a(this);
    MP();
    GMTrace.o(4975988047872L, 37074);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4976390701056L, 37077);
    al.aky().c(this);
    alj();
    al.aky().b(this);
    al.aky().release();
    al.akz().b(this);
    al.akA().b(this);
    al.akA().release();
    e locale = this.jEi;
    Object localObject = locale.jES;
    ((com.tencent.mm.plugin.card.a.f)localObject).jwZ = null;
    ((com.tencent.mm.plugin.card.a.f)localObject).jxd.clear();
    locale.jES = null;
    localObject = locale.jEQ;
    com.tencent.mm.plugin.card.b.l.u(((j)localObject).jIK);
    int i = ((j)localObject).jIR.size() - 1;
    while (i >= 0)
    {
      com.tencent.mm.plugin.card.b.l.u((Bitmap)((j)localObject).jIR.remove(i));
      i -= 1;
    }
    ((j)localObject).jIR.clear();
    if (((j)localObject).hwd.isShowing()) {
      ((j)localObject).hwd.dismiss();
    }
    ((j)localObject).hwd = null;
    ((j)localObject).alX();
    ((j)localObject).hyB = null;
    ((j)localObject).jwZ = null;
    locale.jEQ = null;
    if (locale.jED != null) {
      locale.jED.release();
    }
    locale.iPC.vKC = null;
    com.tencent.mm.sdk.b.a.vgX.c(locale.jFb);
    locale.jEz.destroy();
    locale.jEC.destroy();
    locale.jEB.destroy();
    locale.jEO.destroy();
    if (locale.jEP != null) {
      locale.jEP.destroy();
    }
    if (locale.jEH != null) {
      locale.jEH.destroy();
    }
    if (locale.jEG != null) {
      locale.jEG.destroy();
    }
    if (locale.jEI != null) {
      locale.jEI.destroy();
    }
    if (locale.jEJ != null) {
      locale.jEJ.destroy();
    }
    if (locale.jEK != null) {
      locale.jEK.destroy();
    }
    if (locale.jEL != null) {
      locale.jEL.destroy();
    }
    if (locale.jEM != null) {
      locale.jEM.destroy();
    }
    if (locale.jEN != null) {
      locale.jEN.destroy();
    }
    if (locale.jEE != null) {
      locale.jEE.destroy();
    }
    locale.jEy = null;
    localObject = al.akD();
    long l;
    if ((((com.tencent.mm.plugin.card.a.g)localObject).jwK == null) || (locale == null))
    {
      al.akD().release();
      this.jsv.cancel();
      aiU();
      l = System.currentTimeMillis() - this.mStartTime;
      if (this.jwZ == null) {
        break label699;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(13219, new Object[] { "CardDetailView", Integer.valueOf(this.jtE), this.jwZ.ajA(), this.jwZ.ajz(), Long.valueOf(l) });
      label544:
      if (((this.jEm) || (this.jEn)) && (this.jwZ != null) && (this.jwZ.ajb()))
      {
        if (!this.jwZ.ajo()) {
          break label752;
        }
        al.akz().aG(this.jwL, 2);
      }
    }
    for (;;)
    {
      super.onDestroy();
      GMTrace.o(4976390701056L, 37077);
      return;
      i = 0;
      for (;;)
      {
        if (i >= ((com.tencent.mm.plugin.card.a.g)localObject).jwK.size()) {
          break label697;
        }
        WeakReference localWeakReference = (WeakReference)((com.tencent.mm.plugin.card.a.g)localObject).jwK.get(i);
        if (localWeakReference != null)
        {
          g.a locala = (g.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(locale)))
          {
            ((com.tencent.mm.plugin.card.a.g)localObject).jwK.remove(localWeakReference);
            break;
          }
        }
        i += 1;
      }
      label697:
      break;
      label699:
      com.tencent.mm.plugin.report.service.g.ork.i(13219, new Object[] { "CardDetailView", Integer.valueOf(this.jtE), this.jwL, this.jwL, Long.valueOf(l) });
      break label544;
      label752:
      al.akz().aG(this.jwL, 1);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4978403966976L, 37092);
    if (paramInt == 4)
    {
      w.e("MicroMsg.CardDetailUI", "onKeyDown finishUI");
      dx(false);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(4978403966976L, 37092);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(4976256483328L, 37076);
    alj();
    super.onPause();
    this.jEi.eIE = true;
    al.aky().a(this, false);
    au.a(null);
    GMTrace.o(4976256483328L, 37076);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(4979209273344L, 37098);
    w.i("MicroMsg.CardDetailUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(4979209273344L, 37098);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        w.i("MicroMsg.CardDetailUI", "onMPermissionGranted LocationPermissionGranted " + this.jCV);
        if (!this.jCV)
        {
          this.jCV = true;
          akW();
        }
        GMTrace.o(4979209273344L, 37098);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5029943574528L, 37476);
          CardDetailUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(5029943574528L, 37476);
        }
      }, null);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(4976122265600L, 37075);
    super.onResume();
    ali();
    if (this.gxh != null) {
      this.gxh.a(this.fJt, true);
    }
    this.jEi.eIE = false;
    au.a(this);
    al.aky().a(this, true);
    if (((this.jEm) || (this.jEn)) && (this.jwZ.ajb()))
    {
      if (this.jwZ.ajo())
      {
        al.akz().aG(this.jwL, 2);
        localObject = al.aky();
        String str = this.jwL;
        localObject = (Boolean)((com.tencent.mm.plugin.card.a.d)localObject).jwY.get(str);
        int i;
        if ((localObject != null) && (((Boolean)localObject).booleanValue()))
        {
          i = 1;
          if ((i == 0) || (TextUtils.isEmpty(al.aky().jxb))) {
            break label201;
          }
          w.i("MicroMsg.CardDetailUI", "onResume, do launch succ UI!");
          tM(al.aky().jxb);
        }
        for (;;)
        {
          this.jEi.jEE.d(com.tencent.mm.plugin.card.b.c.jLf);
          GMTrace.o(4976122265600L, 37075);
          return;
          i = 0;
          break;
          label201:
          w.i("MicroMsg.CardDetailUI", "onResume, not need launch succ ui or jsonRet is empty!");
        }
      }
      al.akz().aG(this.jwL, 1);
      Object localObject = this.jEi.jEE;
      if (localObject != null) {
        ((com.tencent.mm.plugin.card.ui.view.g)localObject).d(com.tencent.mm.plugin.card.b.c.jLf);
      }
    }
    GMTrace.o(4976122265600L, 37075);
  }
  
  public final void onSuccess()
  {
    GMTrace.i(4980819886080L, 37110);
    if ((this.jEi.jEE instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.jEi.jEE).jIS = al.akA().getCode();
      this.jEi.akN();
    }
    w.i("MicroMsg.CardDetailUI", "code get success");
    GMTrace.o(4980819886080L, 37110);
  }
  
  public final void tJ(String paramString)
  {
    GMTrace.i(4980685668352L, 37109);
    if (!TextUtils.isEmpty(paramString)) {
      com.tencent.mm.plugin.card.b.d.a(this, paramString, true);
    }
    GMTrace.o(4980685668352L, 37109);
  }
  
  public final void tM(final String paramString)
  {
    GMTrace.i(4979880361984L, 37103);
    if (!this.jEi.alJ())
    {
      w.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onStartConsumedSuccUI");
      GMTrace.o(4979880361984L, 37103);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "onStartConsumedSuccUI");
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5008602955776L, 37317);
        CardDetailUI.c(CardDetailUI.this, paramString);
        GMTrace.o(5008602955776L, 37317);
      }
    });
    GMTrace.o(4979880361984L, 37103);
  }
  
  public final void tP(String paramString)
  {
    GMTrace.i(4980283015168L, 37106);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.jwL)))
    {
      w.e("MicroMsg.CardDetailUI", "onUnmarkSuccess(), the mark card id is diff from current id!");
      GMTrace.o(4980283015168L, 37106);
      return;
    }
    this.jEm = false;
    GMTrace.o(4980283015168L, 37106);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */