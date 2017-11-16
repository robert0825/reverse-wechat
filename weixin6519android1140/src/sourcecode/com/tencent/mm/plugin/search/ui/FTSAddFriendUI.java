package com.tencent.mm.plugin.search.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.az.l;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.g.a.ah.b;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class FTSAddFriendUI
  extends FTSBaseUI
{
  private long ipr;
  private Dialog kAu;
  private bak kMA;
  private String lgm;
  private View oBN;
  private View oBO;
  private View oBP;
  private View oBQ;
  private View oBR;
  private View oBS;
  private ImageView oBT;
  private TextView oBU;
  private TextView oBV;
  private TextView oBW;
  private TextView oBX;
  private TextView oBY;
  private boolean oBZ;
  protected boolean oCa;
  private int oCb;
  private a oCc;
  private int oCd;
  private int oCe;
  int oCf;
  
  public FTSAddFriendUI()
  {
    GMTrace.i(11831426940928L, 88151);
    this.lgm = "";
    this.oCb = 1;
    this.oCf = -1;
    GMTrace.o(11831426940928L, 88151);
  }
  
  private void Ge(final String paramString)
  {
    GMTrace.i(11833037553664L, 88163);
    this.oBZ = true;
    this.oCa = false;
    this.oCb = 1;
    if ((paramString == null) || (paramString.length() == 0) || (paramString.trim().length() == 0))
    {
      GMTrace.o(11833037553664L, 88163);
      return;
    }
    if (Character.isDigit(paramString.charAt(0))) {}
    for (int i = 15;; i = 3)
    {
      this.oCf = i;
      final e local4 = new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(18366085464064L, 136838);
          at.wS().b(106, this);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            switch (paramAnonymousInt2)
            {
            default: 
              FTSAddFriendUI.d(FTSAddFriendUI.this).setText(R.l.dLD);
            }
            for (;;)
            {
              FTSAddFriendUI.a(FTSAddFriendUI.this, -1);
              FTSAddFriendUI.b(FTSAddFriendUI.this, 1);
              FTSAddFriendUI.g(FTSAddFriendUI.this);
              GMTrace.o(18366085464064L, 136838);
              return;
              if (paramAnonymousInt1 == 4) {
                break;
              }
              FTSAddFriendUI.d(FTSAddFriendUI.this).setText(FTSAddFriendUI.this.getString(R.l.dxe));
              continue;
              paramAnonymousString = com.tencent.mm.h.a.dH(paramAnonymousString);
              if (paramAnonymousString != null) {
                FTSAddFriendUI.d(FTSAddFriendUI.this).setText(paramAnonymousString.desc);
              } else {
                FTSAddFriendUI.d(FTSAddFriendUI.this).setText(R.l.dLD);
              }
            }
          }
          FTSAddFriendUI.a(FTSAddFriendUI.this, ((ab)paramAnonymousk).LK());
          if (FTSAddFriendUI.e(FTSAddFriendUI.this).uqk > 0)
          {
            if (FTSAddFriendUI.e(FTSAddFriendUI.this).uql.isEmpty())
            {
              h.a(FTSAddFriendUI.this, R.l.cRe, 0, true, null);
              GMTrace.o(18366085464064L, 136838);
              return;
            }
            paramAnonymousString = new Intent();
            paramAnonymousString.putExtra("add_more_friend_search_scene", 3);
            if (FTSAddFriendUI.e(FTSAddFriendUI.this).uql.size() <= 1) {
              break label341;
            }
          }
          for (;;)
          {
            try
            {
              paramAnonymousString.putExtra("result", FTSAddFriendUI.e(FTSAddFriendUI.this).toByteArray());
              com.tencent.mm.plugin.search.a.hnH.w(paramAnonymousString, FTSAddFriendUI.this.vKB.vKW);
              FTSAddFriendUI.a(FTSAddFriendUI.this, 1);
              FTSAddFriendUI.f(FTSAddFriendUI.this);
            }
            catch (IOException paramAnonymousString)
            {
              w.printErrStackTrace("MicroMsg.FTS.FTSAddFriendUI", paramAnonymousString, "", new Object[0]);
              continue;
            }
            label341:
            com.tencent.mm.pluginsdk.ui.tools.c.a(paramAnonymousString, (bai)FTSAddFriendUI.e(FTSAddFriendUI.this).uql.getFirst(), FTSAddFriendUI.this.oCf);
          }
        }
      };
      this.oCd = 0;
      this.oCe = 0;
      at.wS().a(106, local4);
      paramString = new ab(paramString, 3);
      at.wS().a(paramString, 0);
      getString(R.l.cUG);
      this.kAu = h.a(this, getString(R.l.cRh), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(18361924714496L, 136807);
          at.wS().c(paramString);
          at.wS().b(106, local4);
          FTSAddFriendUI.h(FTSAddFriendUI.this);
          GMTrace.o(18361924714496L, 136807);
        }
      });
      GMTrace.o(11833037553664L, 88163);
      return;
    }
  }
  
  private void bdH()
  {
    GMTrace.i(11832769118208L, 88161);
    if (bg.nl(com.tencent.mm.platformtools.n.a(this.kMA.ufy)).length() > 0)
    {
      if (2 != this.kMA.uOi) {
        break label129;
      }
      this.oCf = 15;
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a(localIntent, this.kMA, this.oCf);
      if ((this.oCf == 15) && (2 == this.kMA.uOi)) {
        localIntent.putExtra("Contact_Search_Mobile", this.lgm.trim());
      }
      localIntent.putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.plugin.search.a.hnH.d(localIntent, this);
      GMTrace.o(11832769118208L, 88161);
      return;
      label129:
      if (1 == this.kMA.uOi) {
        this.oCf = 1;
      }
    }
  }
  
  private void bdI()
  {
    GMTrace.i(11833171771392L, 88164);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18368635600896L, 136857);
        if (FTSAddFriendUI.j(FTSAddFriendUI.this) != null)
        {
          FTSAddFriendUI.j(FTSAddFriendUI.this).dismiss();
          FTSAddFriendUI.h(FTSAddFriendUI.this);
        }
        GMTrace.o(18368635600896L, 136857);
      }
    });
    GMTrace.o(11833171771392L, 88164);
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(11831829594112L, 88154);
    if (this.oCc == null) {
      this.oCc = new a(paramc);
    }
    paramc = this.oCc;
    GMTrace.o(11831829594112L, 88154);
    return paramc;
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(17433272254464L, 129888);
    super.a(paramString1, paramString2, paramList, paramb);
    this.oBZ = false;
    GMTrace.o(17433272254464L, 129888);
  }
  
  public final boolean aaM()
  {
    GMTrace.i(16487305707520L, 122840);
    Ge(this.eQb);
    aLo();
    GMTrace.o(16487305707520L, 122840);
    return true;
  }
  
  public final void b(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16487037272064L, 122838);
    if ((parama instanceof com.tencent.mm.plugin.search.ui.a.a))
    {
      this.lgm = parama.eQb;
      Ge(parama.eQb);
    }
    GMTrace.o(16487037272064L, 122838);
  }
  
  protected final void bdG()
  {
    GMTrace.i(11832500682752L, 88159);
    super.bdG();
    this.oBN.setVisibility(8);
    GMTrace.o(11832500682752L, 88159);
  }
  
  public final void bdJ()
  {
    GMTrace.i(18368367165440L, 136855);
    if (!this.oCq.xdt.wjB.hasFocus())
    {
      this.oCq.xdt.chz();
      aLs();
    }
    GMTrace.o(18368367165440L, 136855);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11832366465024L, 88158);
    int i = R.i.cxE;
    GMTrace.o(11832366465024L, 88158);
    return i;
  }
  
  public void onClickBg(View paramView)
  {
    GMTrace.i(11833305989120L, 88165);
    GMTrace.o(11833305989120L, 88165);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11831561158656L, 88152);
    super.onCreate(paramBundle);
    this.oBN = findViewById(R.h.bql);
    this.oBO = findViewById(R.h.bFN);
    this.oBS = findViewById(R.h.bqm);
    this.oBP = findViewById(R.h.bRd);
    this.oBQ = findViewById(R.h.bMX);
    this.oBR = findViewById(R.h.can);
    this.oBT = ((ImageView)findViewById(R.h.bqk));
    this.oBU = ((TextView)findViewById(R.h.brA));
    this.oBV = ((TextView)findViewById(R.h.bqp));
    this.oBW = ((TextView)findViewById(R.h.caO));
    this.oBX = ((TextView)findViewById(R.h.bqq));
    this.oBY = ((TextView)findViewById(R.h.cao));
    try
    {
      paramBundle = l.kM("webSearchBar").optString("wording");
      w.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", new Object[] { paramBundle });
      this.oBY.setText(paramBundle);
      this.vKB.hqF.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18368232947712L, 136854);
          FTSAddFriendUI.this.oCq.xdt.chz();
          FTSAddFriendUI.this.oCq.xdt.chy();
          GMTrace.o(18368232947712L, 136854);
        }
      }, 128L);
      GMTrace.o(11831561158656L, 88152);
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11832903335936L, 88162);
    super.onDestroy();
    if ((this.oBZ) && (!this.oCa)) {
      com.tencent.mm.az.k.d(this.eQb, this.oCb, 3, 16);
    }
    GMTrace.o(11832903335936L, 88162);
  }
  
  protected final void stopSearch()
  {
    GMTrace.i(11832634900480L, 88160);
    super.stopSearch();
    this.oBN.setVisibility(8);
    GMTrace.o(11832634900480L, 88160);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\FTSAddFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */