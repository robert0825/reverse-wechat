package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.mall.a.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.ach;
import com.tencent.mm.protocal.c.asx;
import com.tencent.mm.protocal.c.asy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class MallIndexMenuUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private f htU;
  private int mRi;
  private List<asy> mSv;
  private HashMap<String, asx> mSw;
  private boolean mSx;
  
  public MallIndexMenuUI()
  {
    GMTrace.i(20960916799488L, 156171);
    this.mSw = new HashMap();
    GMTrace.o(20960916799488L, 156171);
  }
  
  public final int QI()
  {
    GMTrace.i(20961185234944L, 156173);
    GMTrace.o(20961185234944L, 156173);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(20961587888128L, 156176);
    w.i("MicroMsg.MallIndexMenuUI", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.MallIndexMenuUI", "GetPayMenu error!");
      GMTrace.o(20961587888128L, 156176);
      return;
    }
    Object localObject1 = ((b)paramk).mRk;
    paramString = ((ach)localObject1).title;
    paramk = ((ach)localObject1).usE;
    if (((ach)localObject1).usE != null)
    {
      paramInt1 = ((ach)localObject1).usE.size();
      w.i("MicroMsg.MallIndexMenuUI", "onGYNetEnd, title: %s, sectors: %s, sectors.size: %s", new Object[] { paramString, paramk, Integer.valueOf(paramInt1) });
      w.i("MicroMsg.MallIndexMenuUI", "initPayMenuFromResponse: %s", new Object[] { localObject1 });
      if (localObject1 == null) {
        break label648;
      }
      this.htU.removeAll();
      if (!bg.nm(((ach)localObject1).title)) {
        sq(((ach)localObject1).title);
      }
      paramString = new JSONObject();
      h.xz();
      paramk = (String)h.xy().xh().get(w.a.vzX, "");
      if (bg.nm(paramk)) {
        break label589;
      }
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        paramk = new JSONObject(paramk);
        paramString = paramk;
        if ((((ach)localObject1).usE == null) || (((ach)localObject1).usE.size() <= 0)) {
          break label648;
        }
        this.mSv = ((ach)localObject1).usE;
        paramk = ((ach)localObject1).usE.iterator();
        paramInt2 = 1;
        paramInt1 = 0;
        if (!paramk.hasNext()) {
          break label648;
        }
        localObject1 = (asy)paramk.next();
        if ((((asy)localObject1).uIR == null) || (((asy)localObject1).uIR.size() <= 0)) {
          break label657;
        }
        if ((paramInt2 == 0) && (bg.nm(((asy)localObject1).title))) {
          this.htU.a(new PreferenceSmallCategory(this));
        }
        if (!bg.nm(((asy)localObject1).title))
        {
          localObject2 = new PreferenceTitleCategory(this);
          ((PreferenceTitleCategory)localObject2).setTitle(((asy)localObject1).title);
          this.htU.a((Preference)localObject2);
        }
        localObject1 = ((asy)localObject1).uIR.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label643;
        }
        localObject2 = (asx)((Iterator)localObject1).next();
        w.i("MicroMsg.MallIndexMenuUI", "label name: %s", new Object[] { ((asx)localObject2).name });
        CdnImageIconPreference localCdnImageIconPreference = new CdnImageIconPreference(this);
        if (!bg.nm(((asx)localObject2).title)) {
          localCdnImageIconPreference.setTitle(((asx)localObject2).title);
        }
        if (!bg.nm(((asx)localObject2).desc)) {
          localCdnImageIconPreference.setSummary(((asx)localObject2).desc);
        }
        if (!bg.nm(((asx)localObject2).jxH)) {
          localCdnImageIconPreference.iconUrl = ((asx)localObject2).jxH;
        }
        localCdnImageIconPreference.setKey(((asx)localObject2).name);
        if (paramString.optInt(((asx)localObject2).name, 0) == 1) {
          localCdnImageIconPreference.Cm(0);
        }
        if (bg.nm(((asx)localObject2).name)) {
          break label592;
        }
        this.mSw.put(((asx)localObject2).name, localObject2);
        this.htU.a(localCdnImageIconPreference);
        paramInt1 += 1;
        continue;
        paramInt1 = 0;
      }
      catch (JSONException paramk) {}
      label589:
      continue;
      label592:
      this.mSw.put(paramInt1 + ((asx)localObject2).name + ((asx)localObject2).uIP + ((asx)localObject2).title, localObject2);
    }
    label643:
    paramInt2 = 0;
    label648:
    label657:
    for (;;)
    {
      break;
      GMTrace.o(20961587888128L, 156176);
      return;
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(20961453670400L, 156175);
    paramf = paramPreference.hiu;
    w.i("MicroMsg.MallIndexMenuUI", "onPreferenceTreeClick, key: %s", new Object[] { paramf });
    asx localasx = (asx)this.mSw.get(paramf);
    Object localObject;
    if (localasx != null)
    {
      paramf = new JSONObject();
      h.xz();
      localObject = (String)h.xy().xh().get(w.a.vzX, "");
      if (bg.nm((String)localObject)) {}
    }
    for (;;)
    {
      try
      {
        localObject = new JSONObject((String)localObject);
        paramf = (f)localObject;
        if (paramf.optInt(localasx.name, 0) != 1) {
          break label1005;
        }
        paramf.remove(localasx.name);
        if (paramf.length() > 0) {
          break label245;
        }
        h.xz();
        h.xy().xh().a(w.a.vzX, "");
        if ((paramPreference instanceof IconPreference)) {
          ((IconPreference)paramPreference).Cm(8);
        }
        i = 1;
        switch (localasx.uIP)
        {
        default: 
          GMTrace.o(20961453670400L, 156175);
          return true;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MallIndexMenuUI", localException, "parse redDotConfig json failed: %s", new Object[] { localException.getMessage() });
      }
      continue;
      label245:
      h.xz();
      h.xy().xh().a(w.a.vzX, paramf.toString());
      continue;
      w.i("MicroMsg.MallIndexMenuUI", "jump type h5, url: %s", new Object[] { localasx.uIQ });
      if (!bg.nm(localasx.uIQ)) {
        com.tencent.mm.wallet_core.ui.e.m(this, localasx.uIQ, false);
      }
      paramf = g.ork;
      if (i != 0) {}
      for (int i = 1;; i = 0)
      {
        paramf.i(14872, new Object[] { Integer.valueOf(1), Integer.valueOf(i), localasx.uIQ, "" });
        break;
      }
      w.i("MicroMsg.MallIndexMenuUI", "jump type tiny app, username: %s, path: %s", new Object[] { localasx.rgY, localasx.rgY });
      if (!bg.nm(localasx.rgY))
      {
        paramf = new qi();
        paramf.eUY.userName = localasx.rgY;
        paramf.eUY.eVa = bg.aq(localasx.rgZ, "");
        paramf.eUY.scene = 1066;
        paramf.eUY.eVb = 0;
        com.tencent.mm.sdk.b.a.vgX.m(paramf);
      }
      paramf = g.ork;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.i(14872, new Object[] { Integer.valueOf(2), Integer.valueOf(i), "", localasx.rgY });
        break;
      }
      w.i("MicroMsg.MallIndexMenuUI", "jump type payment management");
      d.x(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
      paramf = g.ork;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.i(14872, new Object[] { Integer.valueOf(3), Integer.valueOf(i), "", "" });
        break;
      }
      w.i("MicroMsg.MallIndexMenuUI", "jump type payment security");
      d.x(this, "wallet", ".pwd.ui.WalletSecuritySettingUI");
      paramf = g.ork;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.i(14872, new Object[] { Integer.valueOf(4), Integer.valueOf(i), "", "" });
        break;
      }
      w.i("MicroMsg.MallIndexMenuUI", "jump type wallet switch");
      d.b(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
      paramf = g.ork;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.i(14872, new Object[] { Integer.valueOf(5), Integer.valueOf(i), "", "" });
        break;
      }
      if ("pay_my_msg".equals(paramf))
      {
        if (com.tencent.mm.plugin.wallet_core.model.n.byx().byW().byO())
        {
          paramf = new Intent();
          paramf.putExtra("rawUrl", "https://wx.tenpay.com/userroll/readtemplate?t=userroll/index_tmpl");
          d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        }
        for (;;)
        {
          com.tencent.mm.wallet_core.ui.e.EQ(20);
          GMTrace.o(20961453670400L, 156175);
          return true;
          com.tencent.mm.wallet_core.a.b(this, "ShowOrdersInfoProcess", null);
        }
      }
      if ("pay_manage".equals(paramf))
      {
        if (q.zR()) {
          d.x(this, "wallet_payu", ".pwd.ui.WalletPayUPasswordSettingUI");
        }
        for (;;)
        {
          com.tencent.mm.wallet_core.ui.e.EQ(21);
          GMTrace.o(20961453670400L, 156175);
          return true;
          d.x(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
        }
      }
      if ("pay_security".equals(paramf))
      {
        d.x(this, "wallet", ".pwd.ui.WalletSecuritySettingUI");
        com.tencent.mm.wallet_core.ui.e.EQ(22);
      }
      do
      {
        GMTrace.o(20961453670400L, 156175);
        return false;
        if ("pay_help_center".equals(paramf))
        {
          paramPreference = new Intent();
          if (q.zR()) {}
          for (paramf = "https://wx.tenpay.com/cgi-bin/mmpayweb-bin/readtemplate?t=payu_faq_tmpl";; paramf = "https://kf.qq.com/touch/scene_product.html?scene_id=kf1")
          {
            paramPreference.putExtra("rawUrl", paramf);
            d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
            com.tencent.mm.wallet_core.ui.e.EQ(23);
            GMTrace.o(20961453670400L, 156175);
            return true;
          }
        }
      } while (!"pay_wallet_switch".equals(paramf));
      d.b(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
      GMTrace.o(20961453670400L, 156175);
      return true;
      label1005:
      i = 0;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20961722105856L, 156177);
    if (paramInt1 == 1)
    {
      h.xz();
      this.mRi = ((Integer)h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
      if (paramInt2 == -1)
      {
        if (q.zS())
        {
          finish();
          GMTrace.o(20961722105856L, 156177);
          return;
        }
        finish();
        paramIntent = new ne();
        paramIntent.eSl.context = this.vKB.vKW;
        com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
      }
    }
    GMTrace.o(20961722105856L, 156177);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20961051017216L, 156172);
    super.onCreate(paramBundle);
    this.mSx = getIntent().getBooleanExtra("key_default_show_currency", false);
    h.xz();
    h.xy().xh().a(w.a.vzY, Boolean.valueOf(false));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20961990541312L, 156179);
        MallIndexMenuUI.this.finish();
        GMTrace.o(20961990541312L, 156179);
        return true;
      }
    });
    this.htU = this.wky;
    oM(a.i.sVw);
    h.wS().a(1754, this);
    paramBundle = new b();
    h.wS().a(paramBundle, 0);
    GMTrace.o(20961051017216L, 156172);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20961319452672L, 156174);
    super.onDestroy();
    h.wS().b(1754, this);
    GMTrace.o(20961319452672L, 156174);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\MallIndexMenuUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */