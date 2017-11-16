package com.tencent.mm.plugin.search.ui;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.az.l;
import com.tencent.mm.az.o;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.kt;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.g.a.th;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.appbrand.k.f.a;
import com.tencent.mm.plugin.appbrand.k.f.c;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.azj;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.protocal.c.bax;
import com.tencent.mm.protocal.c.bay;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayout;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class FTSMainUI
  extends FTSBaseVoiceSearchUI
  implements a.a
{
  long ipr;
  private Dialog kAu;
  private int lzo;
  int oCf;
  private FTSMainUIEducationLayout oDf;
  private LinearLayout oDg;
  private LinearLayout oDh;
  private LinearLayout oDi;
  private View oDj;
  private View oDk;
  private f oDl;
  private TextView oDm;
  private TextView oDn;
  private View oDo;
  private View oDp;
  private TextView oDq;
  private String oDr;
  o oDs;
  private Map<String, Integer> oDt;
  private g oDu;
  private g.b oDv;
  private com.tencent.mm.ad.e oDw;
  private View.OnClickListener oDx;
  private com.tencent.mm.sdk.b.c<th> oDy;
  
  public FTSMainUI()
  {
    GMTrace.i(11854780825600L, 88325);
    this.oDt = new HashMap();
    this.oDv = new g.b()
    {
      public final void bdX()
      {
        GMTrace.i(19512439078912L, 145379);
        Object localObject1 = FTSMainUI.a(FTSMainUI.this);
        if (((f)localObject1).eQb != null)
        {
          localObject1 = ((f)localObject1).eQb;
          if ((FTSMainUI.a(FTSMainUI.this).getVisibility() != 0) || (bg.nm((String)localObject1)) || (FTSMainUI.b(FTSMainUI.this).containsKey(localObject1))) {
            break label227;
          }
          FTSMainUI.b(FTSMainUI.this).put(localObject1, Integer.valueOf(1));
          localObject2 = FTSMainUI.a(FTSMainUI.this);
          if (((f)localObject2).hSv == null) {
            break label208;
          }
        }
        long l;
        StringBuilder localStringBuilder;
        label208:
        for (Object localObject2 = ((f)localObject2).hSv;; localObject2 = "")
        {
          l = System.currentTimeMillis();
          Object localObject3 = FTSMainUI.a(FTSMainUI.this);
          localStringBuilder = new StringBuilder("");
          if (((f)localObject3).oCP == null) {
            break label215;
          }
          localObject3 = ((f)localObject3).oCP.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            azj localazj = (azj)((Iterator)localObject3).next();
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append("|");
            }
            localStringBuilder.append(localazj.uNE);
          }
          localObject1 = "";
          break;
        }
        label215:
        com.tencent.mm.az.k.a((String)localObject1, (String)localObject2, l, localStringBuilder.toString());
        label227:
        GMTrace.o(19512439078912L, 145379);
      }
    };
    this.oCf = -1;
    this.oDw = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(19514586562560L, 145395);
        if (paramAnonymousk.getType() == 1944)
        {
          FTSMainUI.this.oDs = null;
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.w("MicroMsg.FTS.FTSMainUI", "search local page error" + paramAnonymousString);
            GMTrace.o(19514586562560L, 145395);
            return;
          }
          if (FTSMainUI.h(FTSMainUI.this).getVisibility() == 0)
          {
            paramAnonymousString = (o)paramAnonymousk;
            if (FTSMainUI.a(FTSMainUI.this).a(((bay)paramAnonymousString.fUa.gtD.gtK).uOs, ((bay)paramAnonymousString.fUa.gtD.gtK).tXx, ((bax)paramAnonymousString.fUa.gtC.gtK).uOq)) {
              FTSMainUI.a(FTSMainUI.this).setVisibility(0);
            }
          }
        }
        GMTrace.o(19514586562560L, 145395);
      }
    };
    this.oDx = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19515526086656L, 145402);
        try
        {
          if (paramAnonymousView.getTag() != null)
          {
            j = ((JSONObject)paramAnonymousView.getTag()).optInt("businessType");
            i = j;
            if (j == 0)
            {
              paramAnonymousView = ((TextView)paramAnonymousView).getText().toString();
              if (!paramAnonymousView.equals(FTSMainUI.this.getString(R.l.dWp))) {
                break label126;
              }
              i = 2;
            }
            if (i == 0) {
              break label307;
            }
            paramAnonymousView = FTSMainUI.this;
            if (System.currentTimeMillis() - paramAnonymousView.ipr <= 1000L) {
              break label307;
            }
            paramAnonymousView.ipr = System.currentTimeMillis();
            if (com.tencent.mm.az.e.Kr()) {
              break label173;
            }
            w.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
            GMTrace.o(19515526086656L, 145402);
          }
        }
        catch (Exception localException)
        {
          int i;
          for (;;)
          {
            int j = 0;
            continue;
            label126:
            if (paramAnonymousView.equals(FTSMainUI.this.getString(R.l.dWs)))
            {
              i = 8;
            }
            else
            {
              i = j;
              if (paramAnonymousView.equals(FTSMainUI.this.getString(R.l.dWq))) {
                i = 1;
              }
            }
          }
          label173:
          Object localObject = l.kN("searchID");
          com.tencent.mm.az.k.b(i, 14, (String)localObject);
          w.i("MicroMsg.FTS.FTSMainUI", "FTSWebReportLogic.kvReportGlobalTabClick reported type %d, searchId %s", new Object[] { Integer.valueOf(i), localObject });
          paramAnonymousView.aLo();
          paramAnonymousView = com.tencent.mm.az.e.Kv();
          paramAnonymousView.putExtra("ftsneedkeyboard", true);
          paramAnonymousView.putExtra("ftsbizscene", 14);
          paramAnonymousView.putExtra("ftsType", i);
          localObject = com.tencent.mm.az.e.a(14, true, i);
          ((Map)localObject).put("sessionId", com.tencent.mm.az.h.gRD);
          paramAnonymousView.putExtra("ftssessionid", com.tencent.mm.az.h.gRD);
          paramAnonymousView.putExtra("rawUrl", com.tencent.mm.az.e.n((Map)localObject));
          paramAnonymousView.putExtra("key_load_js_without_delay", true);
          com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", paramAnonymousView);
          label307:
          GMTrace.o(19515526086656L, 145402);
        }
      }
    };
    this.oDy = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(11854780825600L, 88325);
  }
  
  private void bdY()
  {
    GMTrace.i(11856257220608L, 88336);
    this.oDf.setVisibility(0);
    this.oDf.ar();
    GMTrace.o(11856257220608L, 88336);
  }
  
  private void bdZ()
  {
    GMTrace.i(11856391438336L, 88337);
    this.oDf.setVisibility(8);
    GMTrace.o(11856391438336L, 88337);
  }
  
  private void bea()
  {
    GMTrace.i(11857465180160L, 88345);
    this.oDu.oCK = true;
    Object localObject1 = this.eQb;
    if ((localObject1 == null) || (bg.nm(((String)localObject1).trim())))
    {
      GMTrace.o(11857465180160L, 88345);
      return;
    }
    if (System.currentTimeMillis() - this.ipr <= 1000L)
    {
      GMTrace.o(11857465180160L, 88345);
      return;
    }
    this.ipr = System.currentTimeMillis();
    if (!com.tencent.mm.az.e.Kr())
    {
      w.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
      GMTrace.o(11857465180160L, 88345);
      return;
    }
    localObject1 = com.tencent.mm.az.e.Kv();
    ((Intent)localObject1).putExtra("ftsbizscene", 3);
    ((Intent)localObject1).putExtra("ftsQuery", this.eQb);
    ((Intent)localObject1).putExtra("ftsInitToSearch", true);
    Object localObject2 = com.tencent.mm.az.e.a(3, true, 0);
    ((Map)localObject2).put("query", this.eQb);
    ((Map)localObject2).put("sessionId", com.tencent.mm.az.h.gRD);
    ((Intent)localObject1).putExtra("ftssessionid", com.tencent.mm.az.h.gRD);
    ((Intent)localObject1).putExtra("rawUrl", com.tencent.mm.az.e.n((Map)localObject2));
    localObject2 = new kt();
    ((kt)localObject2).eOU.scene = 0;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
    com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.fts.FTSSOSHomeWebViewUI", (Intent)localObject1);
    com.tencent.mm.az.k.gS(3);
    if (!bg.nm(this.eQb)) {
      com.tencent.mm.az.k.d(this.eQb, 2, 2, 3);
    }
    this.oDj.setEnabled(false);
    GMTrace.o(11857465180160L, 88345);
  }
  
  private static boolean beb()
  {
    GMTrace.i(19512841732096L, 145382);
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100285");
    try
    {
      int i = Integer.valueOf((String)localc.bSg().get("isOpen")).intValue();
      if (i == 0)
      {
        GMTrace.o(19512841732096L, 145382);
        return false;
      }
      GMTrace.o(19512841732096L, 145382);
      return true;
    }
    catch (Exception localException)
    {
      GMTrace.o(19512841732096L, 145382);
    }
    return false;
  }
  
  public final void D(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11858136268800L, 88350);
    super.D(paramInt, paramBoolean);
    this.oDl.setVisibility(8);
    if (this.oDs != null)
    {
      at.wS().c(this.oDs);
      this.oDs = null;
    }
    if ((!paramBoolean) && (paramInt == 0) && (this.oDu.oDb)) {
      this.oDi.setVisibility(0);
    }
    while (!paramBoolean)
    {
      this.oDj.setVisibility(8);
      this.oDo.setVisibility(8);
      GMTrace.o(11858136268800L, 88350);
      return;
      this.oDi.setVisibility(8);
    }
    paramBoolean = com.tencent.mm.plugin.search.a.b.Gc(this.eQb);
    boolean bool = com.tencent.mm.plugin.search.a.b.Gd(this.eQb);
    if (paramInt > 0)
    {
      if ((paramBoolean) || (bool)) {
        this.oDp.setVisibility(0);
      }
      this.oDk.setVisibility(0);
    }
    for (;;)
    {
      if ((paramBoolean) || (bool)) {
        this.oDo.setVisibility(0);
      }
      this.oDj.setVisibility(0);
      if ((this.eQb != null) && (this.eQb.length() > 0))
      {
        this.oDs = new o(this.eQb);
        at.wS().a(this.oDs, 0);
      }
      GMTrace.o(11858136268800L, 88350);
      return;
      this.oDp.setVisibility(8);
      if ((paramBoolean) || (bool)) {
        this.oDk.setVisibility(0);
      } else {
        this.oDk.setVisibility(8);
      }
    }
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(11855317696512L, 88329);
    this.oDu = new g(paramc, this.lzo, this.oDv);
    paramc = this.oDu;
    GMTrace.o(11855317696512L, 88329);
    return paramc;
  }
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    GMTrace.i(11858002051072L, 88349);
    super.a(paramBoolean, paramArrayOfString, paramLong, paramInt);
    if (paramBoolean)
    {
      com.tencent.mm.bj.d.a(this, ".ui.voicesearch.VoiceSearchResultUI", new Intent().putExtra("VoiceSearchResultUI_Resultlist", paramArrayOfString).putExtra("VoiceSearchResultUI_VoiceId", paramLong).putExtra("VoiceSearchResultUI_ShowType", paramInt));
      GMTrace.o(11858002051072L, 88349);
      return;
    }
    com.tencent.mm.bj.d.a(this, ".ui.voicesearch.VoiceSearchResultUI", new Intent().putExtra("VoiceSearchResultUI_Resultlist", new String[0]).putExtra("VoiceSearchResultUI_Error", this.vKB.vKW.getString(R.l.dwI)).putExtra("VoiceSearchResultUI_VoiceId", paramLong).putExtra("VoiceSearchResultUI_ShowType", paramInt));
    GMTrace.o(11858002051072L, 88349);
  }
  
  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    GMTrace.i(15616232652800L, 116350);
    w.i("MicroMsg.FTS.FTSMainUI", "onGetLocation %b %f|%f", new Object[] { Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    com.tencent.mm.modelgeo.c.Ir().c(this);
    GMTrace.o(15616232652800L, 116350);
    return false;
  }
  
  public final View alh()
  {
    GMTrace.i(11857330962432L, 88344);
    if (this.oDg == null)
    {
      this.oDg = ((LinearLayout)getLayoutInflater().inflate(R.i.cxN, null));
      this.oDm = ((TextView)this.oDg.findViewById(R.h.caD));
      this.oDn = ((TextView)this.oDg.findViewById(R.h.bCj));
    }
    try
    {
      Object localObject = l.kM("webSearchBar").optString("wording");
      w.i("MicroMsg.FTS.FTSMainUI", "set searchNetworkTips %s", new Object[] { localObject });
      this.oDn.setText((CharSequence)localObject);
      this.oDk = this.oDg.findViewById(R.h.caB);
      this.oDj = this.oDg.findViewById(R.h.caC);
      this.oDj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19511633772544L, 145373);
          FTSMainUI.c(FTSMainUI.this);
          GMTrace.o(19511633772544L, 145373);
        }
      });
      this.oDl = new f(this);
      this.oDl.oCO = new f.b()
      {
        public final void a(azj paramAnonymousazj, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(19512707514368L, 145381);
          String str = FTSMainUI.this.eQb;
          Object localObject;
          if (paramAnonymousazj.lQF == 1)
          {
            FTSMainUI.a(FTSMainUI.this, FTSMainUI.this.eQb);
            FTSMainUI.this.eQb = paramAnonymousazj.uNE;
            localObject = new HashMap();
            ((Map)localObject).put("prefixSug", FTSMainUI.d(FTSMainUI.this));
            ((Map)localObject).put("sugId", paramAnonymousString);
            ((Map)localObject).put("sceneActionType", "6");
            FTSMainUI.a(FTSMainUI.this, (Map)localObject);
          }
          for (;;)
          {
            com.tencent.mm.az.k.a(str, paramAnonymousString, paramAnonymousInt, paramAnonymousazj.uNE);
            GMTrace.o(19512707514368L, 145381);
            return;
            if ((paramAnonymousazj.lQF == 4) && (!bg.nm(paramAnonymousazj.lPE)))
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("rawUrl", paramAnonymousazj.lPE);
              ((Intent)localObject).putExtra("convertActivityFromTranslucent", false);
              com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            }
          }
        }
      };
      int i = this.oDg.indexOfChild(this.oDj);
      if ((i >= 0) && (i < this.oDg.getChildCount())) {
        this.oDg.addView(this.oDl, i + 1);
      }
      this.oDq = ((TextView)this.oDg.findViewById(R.h.cak));
      this.oDp = this.oDg.findViewById(R.h.cai);
      this.oDo = this.oDg.findViewById(R.h.caj);
      this.oDo.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19511767990272L, 145374);
          FTSMainUI.b(FTSMainUI.this, FTSMainUI.this.eQb);
          GMTrace.o(19511767990272L, 145374);
        }
      });
      this.oDh = ((LinearLayout)this.oDg.findViewById(R.h.bBa));
      localObject = this.oDg;
      GMTrace.o(11857330962432L, 88344);
      return (View)localObject;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void b(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16483950264320L, 122815);
    GMTrace.o(16483950264320L, 122815);
  }
  
  protected final void bdG()
  {
    GMTrace.i(11858270486528L, 88351);
    super.bdG();
    Object localObject = com.tencent.mm.pluginsdk.ui.d.h.c(this, com.tencent.mm.plugin.fts.d.f.a(getString(R.l.dyA), "", com.tencent.mm.plugin.fts.d.b.a.d(this.eQb, this.eQb)).lAJ, com.tencent.mm.br.a.V(this, R.f.aQF));
    this.oDm.setText((CharSequence)localObject);
    localObject = null;
    if (com.tencent.mm.plugin.search.a.b.Gc(this.eQb)) {
      localObject = com.tencent.mm.plugin.fts.d.f.a(getString(R.l.dyn), "", com.tencent.mm.plugin.fts.d.b.a.d(this.eQb, this.eQb)).lAJ;
    }
    for (;;)
    {
      localObject = com.tencent.mm.pluginsdk.ui.d.h.c(this, (CharSequence)localObject, com.tencent.mm.br.a.V(this, R.f.aQF));
      this.oDq.setText((CharSequence)localObject);
      GMTrace.o(11858270486528L, 88351);
      return;
      if (com.tencent.mm.plugin.search.a.b.Gd(this.eQb)) {
        localObject = com.tencent.mm.plugin.fts.d.f.a(getString(R.l.dyo), "", com.tencent.mm.plugin.fts.d.b.a.d(this.eQb, this.eQb)).lAJ;
      }
    }
  }
  
  protected final void bdL()
  {
    GMTrace.i(11855049261056L, 88327);
    switch (getIntent().getIntExtra("from_tab_index", -1))
    {
    default: 
      this.lzo = 0;
      GMTrace.o(11855049261056L, 88327);
      return;
    case 0: 
      this.lzo = 1;
      GMTrace.o(11855049261056L, 88327);
      return;
    case 1: 
      this.lzo = 2;
      GMTrace.o(11855049261056L, 88327);
      return;
    case 2: 
      this.lzo = 3;
      GMTrace.o(11855049261056L, 88327);
      return;
    }
    this.lzo = 4;
    GMTrace.o(11855049261056L, 88327);
  }
  
  protected final void bdO()
  {
    GMTrace.i(11857196744704L, 88343);
    super.bdO();
    bdZ();
    this.oDi.setVisibility(8);
    GMTrace.o(11857196744704L, 88343);
  }
  
  protected final void bdP()
  {
    GMTrace.i(11857062526976L, 88342);
    super.bdP();
    bdZ();
    this.oDi.setVisibility(8);
    this.oCn.setVisibility(0);
    this.mct.setVisibility(8);
    GMTrace.o(11857062526976L, 88342);
  }
  
  protected final void bdQ()
  {
    GMTrace.i(11856928309248L, 88341);
    super.bdQ();
    bdZ();
    this.oDi.setVisibility(8);
    GMTrace.o(11856928309248L, 88341);
  }
  
  protected final void bdR()
  {
    GMTrace.i(11856794091520L, 88340);
    super.bdR();
    bdY();
    this.oDi.setVisibility(8);
    GMTrace.o(11856794091520L, 88340);
  }
  
  protected final boolean bdS()
  {
    GMTrace.i(11855183478784L, 88328);
    boolean bool = v.bPH();
    GMTrace.o(11855183478784L, 88328);
    return bool;
  }
  
  protected final void bdT()
  {
    GMTrace.i(11856525656064L, 88338);
    super.bdT();
    bdZ();
    this.oDi.setVisibility(8);
    GMTrace.o(11856525656064L, 88338);
  }
  
  protected final void bdU()
  {
    GMTrace.i(11856659873792L, 88339);
    super.bdU();
    bdY();
    this.oDi.setVisibility(8);
    GMTrace.o(11856659873792L, 88339);
  }
  
  protected final void bdV()
  {
    GMTrace.i(11857733615616L, 88347);
    if (this.oDh != null) {
      this.oDh.setVisibility(0);
    }
    GMTrace.o(11857733615616L, 88347);
  }
  
  protected final void bdW()
  {
    GMTrace.i(11857867833344L, 88348);
    if (this.oDh != null) {
      this.oDh.setVisibility(8);
    }
    GMTrace.o(11857867833344L, 88348);
  }
  
  public void finish()
  {
    GMTrace.i(11855988785152L, 88334);
    aLo();
    super.finish();
    GMTrace.o(11855988785152L, 88334);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11855451914240L, 88330);
    int i = R.i.cxQ;
    GMTrace.o(11855451914240L, 88330);
    return i;
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(11857599397888L, 88346);
    if (this.oDu.getCount() == 0) {
      bea();
    }
    boolean bool = super.nC(paramString);
    GMTrace.o(11857599397888L, 88346);
    return bool;
  }
  
  public void onClickSnsHotArticle(String paramString)
  {
    GMTrace.i(11858404704256L, 88352);
    if (System.currentTimeMillis() - this.ipr <= 1000L)
    {
      GMTrace.o(11858404704256L, 88352);
      return;
    }
    this.ipr = System.currentTimeMillis();
    if (!com.tencent.mm.az.e.Kr())
    {
      w.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
      GMTrace.o(11858404704256L, 88352);
      return;
    }
    Intent localIntent = com.tencent.mm.az.e.Kv();
    localIntent.putExtra("ftsbizscene", 15);
    localIntent.putExtra("ftsQuery", paramString);
    localIntent.putExtra("title", paramString);
    localIntent.putExtra("isWebwx", paramString);
    localIntent.putExtra("ftscaneditable", false);
    Object localObject = com.tencent.mm.az.e.a(15, false, 2);
    ((Map)localObject).put("query", paramString);
    ((Map)localObject).put("sceneActionType", "2");
    localIntent.putExtra("rawUrl", com.tencent.mm.az.e.n((Map)localObject));
    localObject = new kt();
    ((kt)localObject).eOU.scene = 0;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localIntent.putExtra("ftsInitToSearch", true);
    com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.fts.FTSSOSHomeWebViewUI", localIntent);
    com.tencent.mm.az.k.p(15, paramString);
    GMTrace.o(11858404704256L, 88352);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11854915043328L, 88326);
    super.onCreate(paramBundle);
    com.tencent.mm.az.h.gRD = com.tencent.mm.az.e.gN(3);
    com.tencent.mm.az.h.gQ(this.lzo);
    this.oDf = ((FTSMainUIEducationLayout)findViewById(R.h.caq));
    this.oDi = ((LinearLayout)findViewById(R.h.caA));
    this.oDf.i(this.oDx);
    this.oDf.xdm = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11866323550208L, 88411);
        FTSMainUI.this.onClickSnsHotArticle((String)paramAnonymousView.getTag());
        GMTrace.o(11866323550208L, 88411);
      }
    };
    this.oDf.chD();
    if (beb())
    {
      this.oDf.xdl = true;
      this.oDf.xdn = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19515660304384L, 145403);
          FTSMainUI localFTSMainUI = FTSMainUI.this;
          if (paramAnonymousView.getTag().equals("more-click"))
          {
            ((com.tencent.mm.plugin.appbrand.k.f)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.f.class)).a(localFTSMainUI, com.tencent.mm.az.h.gRD, f.a.izt);
            GMTrace.o(19515660304384L, 145403);
            return;
          }
          if (paramAnonymousView.getTag().equals("more-swipe"))
          {
            ((com.tencent.mm.plugin.appbrand.k.f)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.f.class)).a(localFTSMainUI, com.tencent.mm.az.h.gRD, f.a.izu);
            GMTrace.o(19515660304384L, 145403);
            return;
          }
          ((com.tencent.mm.plugin.appbrand.k.f)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.f.class)).a(localFTSMainUI, (f.c)paramAnonymousView.getTag(), com.tencent.mm.az.h.gRD);
          GMTrace.o(19515660304384L, 145403);
        }
      };
    }
    com.tencent.mm.plugin.search.a.c.bdD();
    com.tencent.mm.modelgeo.c.Ir().a(this, true);
    if (com.tencent.mm.plugin.search.a.c.bdC() == null)
    {
      finish();
      GMTrace.o(11854915043328L, 88326);
      return;
    }
    com.tencent.mm.plugin.search.a.c.bdC().aCB();
    l.gU(3);
    com.tencent.mm.sdk.b.a.vgX.a(this.oDy);
    at.wS().a(1944, this.oDw);
    GMTrace.o(11854915043328L, 88326);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11855720349696L, 88332);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19511365337088L, 145371);
        gk localgk = new gk();
        localgk.eJy.context = com.tencent.mm.sdk.platformtools.ab.getContext();
        localgk.eJy.actionCode = 3;
        com.tencent.mm.sdk.b.a.vgX.m(localgk);
        GMTrace.o(19511365337088L, 145371);
      }
    });
    com.tencent.mm.modelgeo.c.Ir().c(this);
    if (com.tencent.mm.plugin.fts.d.h.aCF() != null) {
      com.tencent.mm.plugin.fts.d.h.aCF().aCC();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.oDy);
    at.wS().b(1944, this.oDw);
    super.onDestroy();
    GMTrace.o(11855720349696L, 88332);
  }
  
  protected void onResume()
  {
    GMTrace.i(11855854567424L, 88333);
    super.onResume();
    Object localObject = new rv();
    ((rv)localObject).eWF.eCX = 0L;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new Intent();
    ((Intent)localObject).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    sendBroadcast((Intent)localObject);
    if (this.oDj != null) {
      this.oDj.setEnabled(true);
    }
    if (!bg.nm(this.oDr))
    {
      this.eQb = this.oDr;
      this.oDr = null;
    }
    GMTrace.o(11855854567424L, 88333);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\FTSMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */