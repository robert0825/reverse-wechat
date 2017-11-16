package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.id_verify.model.g;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import java.util.LinkedList;
import java.util.List;

public class WalletRealNameVerifyUI
  extends WalletBaseUI
  implements View.OnClickListener, WalletFormView.a
{
  private String countryCode;
  private String goU;
  private String goV;
  private Button kES;
  private TextView msY;
  private Profession[] rcz;
  private WalletFormView rdq;
  private WalletFormView rdr;
  private WalletFormView rds;
  private WalletFormView rdt;
  private CheckBox rdu;
  private TextView rdv;
  private ElementQuery rdw;
  private Profession rdx;
  private boolean rdy;
  private boolean rdz;
  
  public WalletRealNameVerifyUI()
  {
    GMTrace.i(6847117393920L, 51015);
    this.rdy = false;
    this.rdz = false;
    GMTrace.o(6847117393920L, 51015);
  }
  
  protected final void MP()
  {
    GMTrace.i(6847385829376L, 51017);
    oM(a.i.tfn);
    this.kES = ((Button)findViewById(a.f.bQR));
    this.rdq = ((WalletFormView)findViewById(a.f.sCF));
    this.rdr = ((WalletFormView)findViewById(a.f.ssQ));
    this.rds = ((WalletFormView)findViewById(a.f.sEy));
    this.rdt = ((WalletFormView)findViewById(a.f.sEx));
    this.rdv = ((TextView)findViewById(a.f.swf));
    this.rdq.xFu = this;
    this.rdr.xFu = this;
    this.rds.xFu = this;
    this.rdt.xFu = this;
    this.rdq.setFocusable(true);
    this.rdq.ogf.setVisibility(8);
    com.tencent.mm.wallet_core.ui.formview.a.c(this.rdr);
    com.tencent.mm.wallet_core.ui.formview.a.b localb = this.rdr.xFw;
    if ((localb instanceof a.a)) {
      ((a.a)localb).ER(1);
    }
    this.rds.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6837185282048L, 50941);
        paramAnonymousView = new Intent(WalletRealNameVerifyUI.this.vKB.vKW, WalletSelectProfessionUI.class);
        paramAnonymousView.putExtra("key_profession_list", WalletRealNameVerifyUI.a(WalletRealNameVerifyUI.this));
        WalletRealNameVerifyUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(6837185282048L, 50941);
      }
    });
    this.rdt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6849130659840L, 51030);
        paramAnonymousView = new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true).putExtra("ShowSelectedLocation", false).putExtra("IsRealNameVerifyScene", true).putExtra("IsNeedShowSearchBar", true);
        WalletRealNameVerifyUI.this.startActivityForResult(paramAnonymousView, 2);
        GMTrace.o(6849130659840L, 51030);
      }
    });
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6846714740736L, 51012);
        paramAnonymousView = WalletRealNameVerifyUI.b(WalletRealNameVerifyUI.this).getText();
        String str = WalletRealNameVerifyUI.c(WalletRealNameVerifyUI.this).getText();
        WalletRealNameVerifyUI.a(WalletRealNameVerifyUI.this, paramAnonymousView, str);
        GMTrace.o(6846714740736L, 51012);
      }
    });
    e(this.rdr, 1, false);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6858794336256L, 51102);
        ((a)WalletRealNameVerifyUI.this.cmp()).c(WalletRealNameVerifyUI.this, 0);
        WalletRealNameVerifyUI.this.finish();
        GMTrace.o(6858794336256L, 51102);
        return true;
      }
    });
    this.rdu = ((CheckBox)findViewById(a.f.spJ));
    this.msY = ((TextView)findViewById(a.f.spI));
    this.rdu.setChecked(true);
    this.rdu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6849399095296L, 51032);
        if (paramAnonymousBoolean)
        {
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setEnabled(true);
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setClickable(true);
          GMTrace.o(6849399095296L, 51032);
          return;
        }
        WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setEnabled(false);
        WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setClickable(false);
        GMTrace.o(6849399095296L, 51032);
      }
    });
    this.msY.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6859331207168L, 51106);
        paramAnonymousView = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousView.add(WalletRealNameVerifyUI.this.getString(a.i.tad));
        localLinkedList.add(Integer.valueOf(0));
        if ((WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this) != null) && (WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this).rgm))
        {
          paramAnonymousView.add(WalletRealNameVerifyUI.this.getString(a.i.tac));
          localLinkedList.add(Integer.valueOf(1));
        }
        h.a(WalletRealNameVerifyUI.this, "", paramAnonymousView, localLinkedList, "", new h.d()
        {
          public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(6859062771712L, 51104);
            Intent localIntent = new Intent();
            switch (paramAnonymous2Int1)
            {
            }
            for (;;)
            {
              localIntent.putExtra("showShare", false);
              com.tencent.mm.bj.d.b(WalletRealNameVerifyUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
              GMTrace.o(6859062771712L, 51104);
              return;
              localIntent.putExtra("rawUrl", WalletRealNameVerifyUI.this.getString(a.i.sYV, new Object[] { v.bPK() }));
              continue;
              if (WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this) != null) {
                localIntent.putExtra("rawUrl", WalletRealNameVerifyUI.this.getString(a.i.sYU, new Object[] { v.bPK(), WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this).nDt }));
              }
            }
          }
        });
        GMTrace.o(6859331207168L, 51106);
      }
    });
    GMTrace.o(6847385829376L, 51017);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    boolean bool2 = false;
    GMTrace.i(6847520047104L, 51018);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.d))
      {
        com.tencent.mm.wallet_core.b localb = cmp();
        paramString = null;
        if (localb != null) {
          paramString = localb.ler;
        }
        paramk = ((com.tencent.mm.plugin.wallet_core.id_verify.model.d)paramk).token;
        w.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response succ");
        if (localb != null)
        {
          paramString.putString("key_real_name_token", paramk);
          paramString.putString("key_country_code", this.countryCode);
          paramString.putString("key_province_code", this.goV);
          paramString.putString("key_city_code", this.goU);
          paramString.putParcelable("key_profession", this.rdx);
          localb.a(this, 0, paramString);
        }
        GMTrace.o(6847520047104L, 51018);
        return true;
      }
      if ((paramk instanceof g))
      {
        paramString = (g)paramk;
        if (paramString.rcx == 1) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          this.rdy = bool1;
          bool1 = bool2;
          if (paramString.rcy == 1) {
            bool1 = true;
          }
          this.rdz = bool1;
          if (!this.rdz) {
            this.rds.setVisibility(8);
          }
          if (!this.rdy) {
            this.rdt.setVisibility(8);
          }
          if ((this.rdy) || (this.rdz)) {
            this.rdv.setText(a.i.tfl);
          }
          this.rcz = paramString.rdO;
          GMTrace.o(6847520047104L, 51018);
          return true;
        }
      }
    }
    else
    {
      w.e("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response fail");
    }
    GMTrace.o(6847520047104L, 51018);
    return false;
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(6848056918016L, 51022);
    w.d("MicroMsg.WalletRealNameVerifyUI", "check info");
    String str1 = this.rdq.getText();
    String str2 = this.rdr.getText();
    int i;
    if (bg.nm(str1)) {
      i = 0;
    }
    for (;;)
    {
      if (i == 0)
      {
        this.kES.setEnabled(false);
        this.kES.setClickable(false);
        GMTrace.o(6848056918016L, 51022);
        return;
        if (bg.nm(str2))
        {
          i = 0;
          continue;
        }
        if (this.rdy)
        {
          if ((!bg.nm(this.countryCode)) || (!bg.nm(this.goV)) || (!bg.nm(this.goU))) {}
          for (i = 1;; i = 0)
          {
            if (i != 0) {
              break label140;
            }
            i = 0;
            break;
          }
        }
        label140:
        if ((this.rdz) && (this.rdx == null)) {
          i = 0;
        }
      }
      else
      {
        this.kES.setEnabled(true);
        this.kES.setClickable(true);
        GMTrace.o(6848056918016L, 51022);
        return;
      }
      i = 1;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6847654264832L, 51019);
    int i = a.g.sQb;
    GMTrace.o(6847654264832L, 51019);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6847922700288L, 51021);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        this.rdx = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
        this.rds.setText(this.rdx.rdP);
        GMTrace.o(6847922700288L, 51021);
        return;
      }
      w.i("MicroMsg.WalletRealNameVerifyUI", "no choose!");
      GMTrace.o(6847922700288L, 51021);
      return;
    }
    if (paramInt1 == 2)
    {
      if (paramInt2 == -1)
      {
        String str1 = paramIntent.getStringExtra("CountryName");
        String str2 = paramIntent.getStringExtra("ProviceName");
        String str3 = paramIntent.getStringExtra("CityName");
        this.countryCode = paramIntent.getStringExtra("Country");
        this.goV = paramIntent.getStringExtra("Contact_Province");
        this.goU = paramIntent.getStringExtra("Contact_City");
        paramIntent = new StringBuilder();
        if (!bg.nm(str1)) {
          paramIntent.append(str1);
        }
        if (!bg.nm(str2)) {
          paramIntent.append(" ").append(str2);
        }
        if (!bg.nm(str3)) {
          paramIntent.append(" ").append(str3);
        }
        this.rdt.setText(paramIntent.toString());
        GMTrace.o(6847922700288L, 51021);
        return;
      }
      w.i("MicroMsg.WalletRealNameVerifyUI", "no area choose!");
    }
    GMTrace.o(6847922700288L, 51021);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(6847788482560L, 51020);
    GMTrace.o(6847788482560L, 51020);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6847251611648L, 51016);
    super.onCreate(paramBundle);
    this.xEL.hN(1616);
    this.rdw = ((ElementQuery)this.ui.getParcelable("elemt_query"));
    MP();
    r(new g());
    GMTrace.o(6847251611648L, 51016);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14438203654144L, 107573);
    this.xEL.hO(1616);
    super.onDestroy();
    GMTrace.o(14438203654144L, 107573);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\WalletRealNameVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */