package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.balance.a.c;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.a;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.wallet_core.c.t;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.y.q;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(3)
public class WalletBalanceSaveUI
  extends WalletBaseUI
{
  private final int hqZ;
  private View jBw;
  protected WalletFormView jZE;
  protected Button kES;
  public double oni;
  private ArrayList<Bankcard> qTU;
  protected Bankcard qTV;
  private String qTW;
  public WalletFormView qTY;
  
  public WalletBalanceSaveUI()
  {
    GMTrace.i(7707050377216L, 57422);
    this.hqZ = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 270);
    GMTrace.o(7707050377216L, 57422);
  }
  
  private void ar()
  {
    GMTrace.i(7707855683584L, 57428);
    if (this.qTY != null)
    {
      if (this.qTV != null)
      {
        this.qTY.setText(getString(a.i.sZD, new Object[] { this.qTV.field_bankName, this.qTV.field_bankcardTail }));
        this.qTY.vl(this.qTV.field_bankcardTypeName);
        String str = this.qTV.field_avail_save_wording;
        if (this.qTY.ogg == null)
        {
          w.e("MicroMsg.WalletBalanceSaveUI", "why layout is null !!!???");
          GMTrace.o(7707855683584L, 57428);
          return;
        }
        if (!bg.nm(str))
        {
          this.qTY.ogg.setText(this.qTV.field_avail_save_wording);
          GMTrace.o(7707855683584L, 57428);
          return;
        }
        w.i("MicroMsg.WalletBalanceSaveUI", "hy: wording's missing. use default");
        this.qTY.ogg.setText("");
        GMTrace.o(7707855683584L, 57428);
        return;
      }
      this.qTY.setText(this.qTW);
      if (this.qTY.ogg != null) {
        this.qTY.ogg.setText("");
      }
      this.qTY.vl(getString(a.i.sZC));
    }
    GMTrace.o(7707855683584L, 57428);
  }
  
  private void bbq()
  {
    GMTrace.i(7707318812672L, 57424);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    Object localObject = com.tencent.mm.plugin.wallet.a.p.bxe();
    this.qTU = ((af)localObject).bze();
    this.qTV = ((af)localObject).a(this.qTU, null, false, true);
    int i;
    if ((this.qTV != null) && (bg.nm(this.qTV.field_forbidWord)))
    {
      this.qTV = null;
      i = 0;
    }
    for (;;)
    {
      if (i < this.qTU.size())
      {
        if ((this.qTU.get(i) != null) && (bg.nm(((Bankcard)this.qTU.get(i)).field_forbidWord))) {
          this.qTV = ((Bankcard)this.qTU.get(i));
        }
      }
      else
      {
        if ((this.qTV != null) && (!bg.nm(this.qTV.field_forbidWord))) {
          this.qTV = null;
        }
        localObject = this.qTU;
        if (localObject == null) {
          break;
        }
        i = 0;
        while (i < ((ArrayList)localObject).size())
        {
          w.v("MicroMsg.WalletBalanceSaveUI", "pos %s word %s", new Object[] { Integer.valueOf(i), ((Bankcard)((ArrayList)localObject).get(i)).field_forbidWord });
          i += 1;
        }
      }
      i += 1;
    }
    GMTrace.o(7707318812672L, 57424);
  }
  
  protected final void MP()
  {
    GMTrace.i(7707721465856L, 57427);
    oM(a.i.sZI);
    this.jBw = findViewById(a.f.sHa);
    this.jZE = ((WalletFormView)findViewById(a.f.sCz));
    com.tencent.mm.wallet_core.ui.formview.a.e(this.jZE);
    this.jZE.izE.setText(t.clX());
    e(this.jZE, 2, false);
    this.kES = ((Button)findViewById(a.f.bQR));
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7726511947776L, 57567);
        WalletBalanceSaveUI.this.oni = bg.getDouble(WalletBalanceSaveUI.this.jZE.getText(), 0.0D);
        if ((WalletBalanceSaveUI.this.oni > 0.0D) && (WalletBalanceSaveUI.this.jZE.QW()))
        {
          WalletBalanceSaveUI.this.bwQ();
          GMTrace.o(7726511947776L, 57567);
          return;
        }
        u.makeText(WalletBalanceSaveUI.this.vKB.vKW, a.i.sZH, 0).show();
        GMTrace.o(7726511947776L, 57567);
      }
    });
    this.qTY = ((WalletFormView)findViewById(a.f.spV));
    if (this.qTY != null)
    {
      com.tencent.mm.wallet_core.ui.formview.a.g(this.qTY);
      this.qTY.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7724230246400L, 57550);
          paramAnonymousView = WalletBalanceSaveUI.this.vKB.vKW;
          ArrayList localArrayList = WalletBalanceSaveUI.a(WalletBalanceSaveUI.this);
          String str = WalletBalanceSaveUI.b(WalletBalanceSaveUI.this);
          Bankcard localBankcard = WalletBalanceSaveUI.this.qTV;
          h.a local1 = new h.a()
          {
            public final void te(int paramAnonymous2Int)
            {
              GMTrace.i(7725303988224L, 57558);
              if ((WalletBalanceSaveUI.a(WalletBalanceSaveUI.this) == null) || (paramAnonymous2Int < 0) || (paramAnonymous2Int >= WalletBalanceSaveUI.a(WalletBalanceSaveUI.this).size())) {}
              for (WalletBalanceSaveUI.this.qTV = null;; WalletBalanceSaveUI.this.qTV = ((Bankcard)WalletBalanceSaveUI.a(WalletBalanceSaveUI.this).get(paramAnonymous2Int)))
              {
                if ((WalletBalanceSaveUI.this.qTV != null) && (!bg.nm(WalletBalanceSaveUI.this.qTV.field_forbidWord)))
                {
                  h.a(WalletBalanceSaveUI.this.vKB.vKW, WalletBalanceSaveUI.this.getString(a.i.sZG), "", WalletBalanceSaveUI.this.getString(a.i.cTM), new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(7727048818688L, 57571);
                      GMTrace.o(7727048818688L, 57571);
                    }
                  });
                  WalletBalanceSaveUI.this.qTV = null;
                }
                WalletBalanceSaveUI.c(WalletBalanceSaveUI.this);
                GMTrace.o(7725303988224L, 57558);
                return;
              }
            }
          };
          com.tencent.mm.plugin.wallet_core.ui.g.a(paramAnonymousView, localArrayList, str, paramAnonymousView.getString(a.i.sZJ), localBankcard, local1);
          GMTrace.o(7724230246400L, 57550);
        }
      });
    }
    this.mLW = new com.tencent.mm.wallet_core.ui.a()
    {
      public final void gU(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18390378872832L, 137019);
        if (paramAnonymousBoolean)
        {
          WalletBalanceSaveUI.d(WalletBalanceSaveUI.this);
          GMTrace.o(18390378872832L, 137019);
          return;
        }
        WalletBalanceSaveUI.e(WalletBalanceSaveUI.this).scrollTo(0, 0);
        GMTrace.o(18390378872832L, 137019);
      }
    };
    GMTrace.o(7707721465856L, 57427);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7708124119040L, 57430);
    GMTrace.o(7708124119040L, 57430);
    return 1;
  }
  
  public void bwQ()
  {
    GMTrace.i(7707989901312L, 57429);
    if (this.qTV != null)
    {
      l(new c(this.oni, "CNY", this.qTV.field_bindSerial, this.qTV.field_bankcardType));
      GMTrace.o(7707989901312L, 57429);
      return;
    }
    l(new c(this.oni, "CNY", "", ""));
    GMTrace.o(7707989901312L, 57429);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7707184594944L, 57423);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramk instanceof c)) {
        break label275;
      }
      Object localObject = (c)paramk;
      boolean bool;
      if ("1".equals(((c)localObject).eXD))
      {
        w.i("MicroMsg.WalletBalanceSaveUI", "need realname verify");
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceSaveUI");
        paramString.putString("realname_verify_process_jump_plugin", "wallet");
        String str = ((c)localObject).eXE;
        str = ((c)localObject).eXF;
        localObject = ((c)localObject).eXG;
        aNg();
        bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString, 0);
      }
      while (bool)
      {
        GMTrace.o(7707184594944L, 57423);
        return false;
        if ("2".equals(((c)localObject).eXD))
        {
          w.i("MicroMsg.WalletBalanceSaveUI", "need upload credit");
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, ((c)localObject).eXE, ((c)localObject).eXH, ((c)localObject).eXF, ((c)localObject).eXG, aNg(), null);
        }
        else
        {
          w.i("MicroMsg.WalletBalanceSaveUI", "realnameGuideFlag =  " + ((c)localObject).eXD);
          bool = false;
        }
      }
      paramk = ((c)paramk).eJQ;
      if (this.qTV != null) {
        break label264;
      }
      paramString = "";
      com.tencent.mm.pluginsdk.wallet.g.a(this, paramString, paramk, "", 11, 1);
    }
    for (;;)
    {
      GMTrace.o(7707184594944L, 57423);
      return false;
      label264:
      paramString = this.qTV.field_bindSerial;
      break;
      label275:
      if ((paramk instanceof o))
      {
        bbq();
        ar();
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7707453030400L, 57425);
    int i = a.g.sON;
    GMTrace.o(7707453030400L, 57425);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7707587248128L, 57426);
    super.onCreate(paramBundle);
    if (!q.zR()) {
      b(new o(null, 3), false);
    }
    bbq();
    this.qTW = getString(a.i.sZF);
    MP();
    ar();
    com.tencent.mm.wallet_core.c.p.eP(3, 0);
    GMTrace.o(7707587248128L, 57426);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\WalletBalanceSaveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */