package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.o;
import com.tencent.mm.ao.o.a;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.wallet_core.c.r;
import org.json.JSONObject;

public class WalletSecuritySettingUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private f htU;
  private boolean rbF;
  private WalletSecuritySettingHeaderPref rbG;
  private IconPreference rbH;
  private IconPreference rbI;
  private IconPreference rbJ;
  private IconPreference rbK;
  private Preference rbL;
  private a rbM;
  private d rbN;
  private c rbO;
  private b rbP;
  private ProgressDialog rbQ;
  
  public WalletSecuritySettingUI()
  {
    GMTrace.i(19539953713152L, 145584);
    this.rbF = true;
    GMTrace.o(19539953713152L, 145584);
  }
  
  private void M(JSONObject paramJSONObject)
  {
    GMTrace.i(19541161672704L, 145593);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.WalletSecuritySettingUI", "alvinluo security info json is null");
      onError(getString(a.i.tfY));
      GMTrace.o(19541161672704L, 145593);
      return;
    }
    for (;;)
    {
      try
      {
        this.htU = this.wky;
        localObject = paramJSONObject.getString("more_security_title");
        this.rbL = this.htU.VG("wallet_security_more_title");
        this.rbL.setTitle((CharSequence)localObject);
        if (paramJSONObject.has("basic_security_item"))
        {
          localObject = paramJSONObject.getJSONObject("basic_security_item");
          this.rbM = new a();
          this.rbM.title = ((JSONObject)localObject).optString("title");
          this.rbM.desc = ((JSONObject)localObject).optString("desc");
          this.rbM.nvc = ((JSONObject)localObject).optString("logo_url");
        }
        if (paramJSONObject.has("wallet_lock_info"))
        {
          localObject = paramJSONObject.getJSONObject("wallet_lock_info");
          this.rbN = new d();
          this.rbN.title = ((JSONObject)localObject).optString("wallet_lock_title");
          this.rbN.desc = ((JSONObject)localObject).optString("wallet_lock_desc");
          this.rbN.nvc = ((JSONObject)localObject).getString("wallet_lock_logo_url");
          this.rbN.status = ((JSONObject)localObject).optInt("wallet_lock_status");
          this.rbN.rcb = ((JSONObject)localObject).optString("wallet_lock_status_name");
          this.rbN.rcc = ((JSONObject)localObject).optBoolean("is_open_touch_pay", false);
        }
        if (paramJSONObject.has("property_security_info"))
        {
          localObject = paramJSONObject.getJSONObject("property_security_info");
          this.rbO = new c();
          this.rbO.title = ((JSONObject)localObject).optString("title", "");
          this.rbO.desc = ((JSONObject)localObject).optString("desc", "");
          this.rbO.nvc = ((JSONObject)localObject).optString("logo_url", "");
          this.rbO.status = ((JSONObject)localObject).optInt("status", 0);
          this.rbO.rbZ = ((JSONObject)localObject).optString("status_name");
          this.rbO.jumpType = ((JSONObject)localObject).optInt("jump_type");
          this.rbO.rbT = ((JSONObject)localObject).optString("jump_h5_url");
          this.rbO.rca = ((JSONObject)localObject).optString("tinyapp_username");
          this.rbO.rbU = ((JSONObject)localObject).optString("tinyapp_path");
        }
        if (paramJSONObject.has("safe_manager_info"))
        {
          localObject = paramJSONObject.getJSONObject("safe_manager_info");
          this.rbP = new b(this);
          this.rbP.title = ((JSONObject)localObject).optString("title", "");
          this.rbP.desc = ((JSONObject)localObject).optString("desc", "");
          this.rbP.nvc = ((JSONObject)localObject).optString("logo_url", "");
          this.rbP.rbX = ((JSONObject)localObject).optString("installed_status_name");
          this.rbP.rbW = ((JSONObject)localObject).optString("uninstall_status_name");
          this.rbP.rbY = ((JSONObject)localObject).optString("protected_mode_name");
          this.rbP.rbT = ((JSONObject)localObject).optString("jump_h5_url");
        }
        r.clT().ab(paramJSONObject);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vzs, paramJSONObject.toString());
        this.rbG = ((WalletSecuritySettingHeaderPref)this.htU.VG("wallet_security_basic_info"));
        if (this.rbM != null)
        {
          paramJSONObject = this.rbG;
          localObject = this.rbM.title;
          String str1 = this.rbM.desc;
          String str2 = this.rbM.rbV;
          paramJSONObject.kXe = ((String)localObject);
          paramJSONObject.rbB = str1;
          paramJSONObject.rbC = str2;
          paramJSONObject.ar();
          if (bg.nm(this.rbM.rbV))
          {
            paramJSONObject = this.rbG;
            if (paramJSONObject.rbA != null) {
              paramJSONObject.rbA.setVisibility(8);
            }
          }
        }
        if (this.rbN != null) {
          continue;
        }
        this.htU.bc("wallet_security_wallet_lock", true);
        this.htU.bc("wallet_security_digital_certificate", false);
        this.rbH = ((IconPreference)this.htU.VG("wallet_security_digital_certificate"));
        r.clT();
        com.tencent.mm.kernel.h.xz();
        if (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvi, Integer.valueOf(0))).intValue() <= 0) {
          continue;
        }
        i = 1;
      }
      catch (Exception paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", paramJSONObject, "", new Object[0]);
        onError(getString(a.i.tfY));
        continue;
        int i = 0;
        continue;
        if (!r.clT().clU()) {
          continue;
        }
        if (this.rbH == null) {
          continue;
        }
        this.rbH.setSummary(a.i.tfZ);
        a(r.clT().xDH, this.rbH);
        this.rbH.setTitle(r.clT().xDF);
        this.rbH.setSummary(r.clT().xDG);
        this.rbH.VJ(r.clT().xDE);
        this.rbH.caX();
        continue;
        if (this.rbH == null) {
          continue;
        }
        this.rbH.setSummary(a.i.tga);
        continue;
        a(this.rbP.nvc, this.rbI);
        this.rbI.setTitle(this.rbP.title);
        Object localObject = this.rbI;
        paramJSONObject = this.rbP;
        if (paramJSONObject.status != 0) {
          continue;
        }
        paramJSONObject = paramJSONObject.rbW;
        ((IconPreference)localObject).setSummary(paramJSONObject);
        this.rbI.VJ(this.rbP.desc);
        this.rbI.caX();
        continue;
        if (paramJSONObject.status != 1) {
          continue;
        }
        paramJSONObject = paramJSONObject.rbX;
        continue;
        paramJSONObject = paramJSONObject.rbY;
        continue;
        a(this.rbO.nvc, this.rbK);
        this.rbK.setTitle(this.rbO.title);
        this.rbK.setSummary(this.rbO.rbZ);
        this.rbK.VJ(this.rbO.desc);
        this.rbK.caX();
        continue;
      }
      if (i != 0) {
        continue;
      }
      this.htU.bc("wallet_security_digital_certificate", true);
      this.htU.bc("wallet_security_pay_guard", false);
      this.rbI = ((IconPreference)this.htU.VG("wallet_security_pay_guard"));
      if (this.rbI != null) {
        this.rbI.setSummary(a.i.tga);
      }
      if (this.rbP != null) {
        continue;
      }
      this.htU.bc("wallet_security_pay_guard", true);
      this.htU = this.wky;
      this.htU.bc("wallet_security_safety_insurance", false);
      this.rbK = ((IconPreference)this.htU.VG("wallet_security_safety_insurance"));
      if (this.rbK != null) {
        this.rbK.setSummary(a.i.tgb);
      }
      if (this.rbO != null) {
        continue;
      }
      this.htU.bc("wallet_security_safety_insurance", true);
      this.htU.notifyDataSetChanged();
      if ((this.rbQ != null) && (this.rbQ.isShowing())) {
        this.rbQ.dismiss();
      }
      GMTrace.o(19541161672704L, 145593);
      return;
      this.htU.bc("wallet_security_wallet_lock", false);
      this.rbJ = ((IconPreference)this.htU.VG("wallet_security_wallet_lock"));
      a(this.rbN.nvc, this.rbJ);
      this.rbJ.setTitle(this.rbN.title);
      this.rbJ.setSummary(this.rbN.rcb);
      this.rbJ.VJ(this.rbN.desc);
      this.rbJ.caX();
    }
  }
  
  private void a(String paramString, final IconPreference paramIconPreference)
  {
    GMTrace.i(19541295890432L, 145594);
    if (paramIconPreference == null)
    {
      GMTrace.o(19541295890432L, 145594);
      return;
    }
    com.tencent.mm.ao.n.IY();
    Bitmap localBitmap = com.tencent.mm.ao.b.hC(paramString);
    if (localBitmap != null)
    {
      paramIconPreference.drawable = new BitmapDrawable(this.vKB.vKW.getResources(), localBitmap);
      GMTrace.o(19541295890432L, 145594);
      return;
    }
    if (!bg.nm(paramString)) {
      com.tencent.mm.ao.n.Jc().a(paramString, new o.a()
      {
        public final void g(String paramAnonymousString, Bitmap paramAnonymousBitmap)
        {
          GMTrace.i(19541832761344L, 145598);
          w.i("MicroMsg.WalletSecuritySettingUI", "alvinluo icon url: %s", new Object[] { paramAnonymousString });
          paramIconPreference.drawable = new BitmapDrawable(WalletSecuritySettingUI.this.vKB.vKW.getResources(), paramAnonymousBitmap);
          GMTrace.o(19541832761344L, 145598);
        }
      });
    }
    GMTrace.o(19541295890432L, 145594);
  }
  
  private void onError(String paramString)
  {
    GMTrace.i(19541027454976L, 145592);
    if ((this.rbQ != null) && (this.rbQ.isShowing())) {
      this.rbQ.dismiss();
    }
    com.tencent.mm.ui.base.h.a(this, paramString, "", false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19539148406784L, 145578);
        WalletSecuritySettingUI.this.finish();
        GMTrace.o(19539148406784L, 145578);
      }
    });
    GMTrace.o(19541027454976L, 145592);
  }
  
  protected final void MP()
  {
    GMTrace.i(19540356366336L, 145587);
    super.MP();
    this.htU = this.wky;
    if (this.htU != null) {
      this.htU.addPreferencesFromResource(a.l.tkd);
    }
    com.tencent.mm.kernel.h.xz();
    String str = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzs, "");
    if (!bg.nm(str)) {
      try
      {
        M(new JSONObject(str));
        GMTrace.o(19540356366336L, 145587);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", localException, "", new Object[0]);
      }
    }
    GMTrace.o(19540356366336L, 145587);
  }
  
  public final int QI()
  {
    GMTrace.i(19540222148608L, 145586);
    GMTrace.o(19540222148608L, 145586);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(19540893237248L, 145591);
    w.v("MicroMsg.WalletSecuritySettingUI", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof com.tencent.mm.plugin.wallet.pwd.a.d))
    {
      paramString = ((com.tencent.mm.plugin.wallet.pwd.a.d)paramk).raC;
      w.v("MicroMsg.WalletSecuritySettingUI", "alvinluo json: %s", new Object[] { paramString });
      M(paramString);
    }
    GMTrace.o(19540893237248L, 145591);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(19540759019520L, 145590);
    if ("wallet_security_digital_certificate".equals(paramPreference.hiu))
    {
      com.tencent.mm.bj.d.b(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new Intent());
      GMTrace.o(19540759019520L, 145590);
      return true;
    }
    if ("wallet_security_pay_guard".equals(paramPreference.hiu))
    {
      if (this.rbP == null)
      {
        GMTrace.o(19540759019520L, 145590);
        return true;
      }
      w.i("MicroMsg.WalletSecuritySettingUI", "jump url %s ", new Object[] { this.rbP.getUrl() });
      com.tencent.mm.wallet_core.ui.e.br(this, this.rbP.getUrl());
      GMTrace.o(19540759019520L, 145590);
      return true;
    }
    if ("wallet_security_wallet_lock".equals(paramPreference.hiu))
    {
      paramf = new Intent();
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).c(this, paramf);
      GMTrace.o(19540759019520L, 145590);
      return true;
    }
    if ("wallet_security_safety_insurance".equals(paramPreference.hiu))
    {
      if (this.rbO == null)
      {
        GMTrace.o(19540759019520L, 145590);
        return true;
      }
      if (this.rbO.jumpType == 2)
      {
        paramf = new qi();
        paramf.eUY.eVc = 0;
        paramf.eUY.userName = this.rbO.rca;
        paramf.eUY.eVa = this.rbO.rbU;
        a.vgX.m(paramf);
      }
      for (;;)
      {
        GMTrace.o(19540759019520L, 145590);
        return true;
        paramf = new Intent();
        paramf.putExtra("rawUrl", this.rbO.rbT);
        w.d("MicroMsg.WalletSecuritySettingUI", "raw url: %s", new Object[] { paramf.getStringExtra("rawUrl") });
        com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
      }
    }
    GMTrace.o(19540759019520L, 145590);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19540087930880L, 145585);
    super.onCreate(paramBundle);
    MP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(19544651333632L, 145619);
        WalletSecuritySettingUI.this.finish();
        GMTrace.o(19544651333632L, 145619);
        return false;
      }
    });
    GMTrace.o(19540087930880L, 145585);
  }
  
  protected void onPause()
  {
    GMTrace.i(19540624801792L, 145589);
    super.onPause();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(385, this);
    GMTrace.o(19540624801792L, 145589);
  }
  
  protected void onResume()
  {
    String str = null;
    GMTrace.i(19540490584064L, 145588);
    super.onResume();
    this.rbG = ((WalletSecuritySettingHeaderPref)this.htU.VG("wallet_security_basic_info"));
    if (this.rbG != null)
    {
      localObject1 = this.rbG;
      Object localObject2 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19537672011776L, 145567);
          if ((WalletSecuritySettingUI.a(WalletSecuritySettingUI.this) != null) && (bg.nm(WalletSecuritySettingUI.a(WalletSecuritySettingUI.this).rbT)))
          {
            w.e("MicroMsg.WalletSecuritySettingUI", "alivnluo jump h5 url is null");
            GMTrace.o(19537672011776L, 145567);
            return;
          }
          if ((WalletSecuritySettingUI.a(WalletSecuritySettingUI.this) != null) && (WalletSecuritySettingUI.a(WalletSecuritySettingUI.this).jumpType == 1) && (!bg.nm(WalletSecuritySettingUI.a(WalletSecuritySettingUI.this).rbT)))
          {
            paramAnonymousView = new Intent();
            w.i("MicroMsg.WalletSecuritySettingUI", "alvinluo jump url: %s", new Object[] { WalletSecuritySettingUI.a(WalletSecuritySettingUI.this).rbT });
            paramAnonymousView.putExtra("rawUrl", WalletSecuritySettingUI.a(WalletSecuritySettingUI.this).rbT);
            com.tencent.mm.bj.d.b(WalletSecuritySettingUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
            GMTrace.o(19537672011776L, 145567);
            return;
          }
          if ((WalletSecuritySettingUI.a(WalletSecuritySettingUI.this) != null) && (WalletSecuritySettingUI.a(WalletSecuritySettingUI.this).jumpType == 2)) {
            bg.nm(WalletSecuritySettingUI.a(WalletSecuritySettingUI.this).rbU);
          }
          GMTrace.o(19537672011776L, 145567);
        }
      };
      if (((WalletSecuritySettingHeaderPref)localObject1).rbA != null) {
        break label311;
      }
      bool = true;
      w.v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo details == null: %b", new Object[] { Boolean.valueOf(bool) });
      ((WalletSecuritySettingHeaderPref)localObject1).rbD = ((View.OnClickListener)localObject2);
      if (((WalletSecuritySettingHeaderPref)localObject1).rbA != null) {
        ((WalletSecuritySettingHeaderPref)localObject1).rbA.setOnClickListener((View.OnClickListener)localObject2);
      }
      localObject1 = this.rbG;
      localObject2 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19538343100416L, 145572);
          w.v("MicroMsg.WalletSecuritySettingUI", "alvinluo click close");
          WalletSecuritySettingUI.this.finish();
          GMTrace.o(19538343100416L, 145572);
        }
      };
      if (((WalletSecuritySettingHeaderPref)localObject1).iZs != null) {
        break label316;
      }
      bool = true;
      label131:
      w.v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo closeBtn == null: %b", new Object[] { Boolean.valueOf(bool) });
      ((WalletSecuritySettingHeaderPref)localObject1).rbE = ((View.OnClickListener)localObject2);
      if (((WalletSecuritySettingHeaderPref)localObject1).iZs != null) {
        ((WalletSecuritySettingHeaderPref)localObject1).iZs.setOnClickListener((View.OnClickListener)localObject2);
      }
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(385, this);
    if (this.rbF)
    {
      this.rbQ = com.tencent.mm.ui.base.h.a(this, getString(a.i.cUV), false, null);
      this.rbF = false;
    }
    boolean bool = ((com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class)).azt();
    Object localObject1 = ab.bPV();
    if (localObject1 != null) {
      str = ((SharedPreferences)localObject1).getString("cpu_id", null);
    }
    for (localObject1 = ((SharedPreferences)localObject1).getString("uid", null);; localObject1 = null)
    {
      w.i("MicroMsg.WalletSecuritySettingUI", "alvinluo getSecurityInfo isOpenTouchPay: %b", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.plugin.wallet.pwd.a.d(bool, str, (String)localObject1), 0);
      GMTrace.o(19540490584064L, 145588);
      return;
      label311:
      bool = false;
      break;
      label316:
      bool = false;
      break label131;
    }
  }
  
  private final class a
  {
    String desc;
    int jumpType;
    String nvc;
    String rbT;
    String rbU;
    String rbV;
    String title;
    
    public a()
    {
      GMTrace.i(19537806229504L, 145568);
      GMTrace.o(19537806229504L, 145568);
    }
  }
  
  private final class b
  {
    String desc;
    String nvc;
    String rbT;
    String rbW;
    String rbX;
    String rbY;
    int status;
    String title;
    
    b(Context paramContext)
    {
      GMTrace.i(19539282624512L, 145579);
      if (com.tencent.mm.pluginsdk.model.app.p.n(paramContext, "com.tencent.qqpimsecure"))
      {
        if (bg.bb(paramContext, "com.tencent.server.back.BackEngine"))
        {
          this.status = 2;
          GMTrace.o(19539282624512L, 145579);
          return;
        }
        this.status = 1;
        GMTrace.o(19539282624512L, 145579);
        return;
      }
      this.status = 0;
      GMTrace.o(19539282624512L, 145579);
    }
    
    private String ed(String paramString1, String paramString2)
    {
      GMTrace.i(19539551059968L, 145581);
      paramString1 = Uri.parse(this.rbT).buildUpon().appendQueryParameter(paramString1, paramString2).build().toString();
      GMTrace.o(19539551059968L, 145581);
      return paramString1;
    }
    
    public final String getUrl()
    {
      GMTrace.i(19539416842240L, 145580);
      if (this.status == 0)
      {
        str = ed("qqpimsecurestatus", "not_installed");
        GMTrace.o(19539416842240L, 145580);
        return str;
      }
      if (this.status == 1)
      {
        str = ed("qqpimsecurestatus", "not_run");
        GMTrace.o(19539416842240L, 145580);
        return str;
      }
      String str = ed("qqpimsecurestatus", "runing");
      GMTrace.o(19539416842240L, 145580);
      return str;
    }
  }
  
  private final class c
  {
    String desc;
    int jumpType;
    String nvc;
    String rbT;
    String rbU;
    String rbZ;
    String rca;
    int status;
    String title;
    
    public c()
    {
      GMTrace.i(19544382898176L, 145617);
      GMTrace.o(19544382898176L, 145617);
    }
  }
  
  private final class d
  {
    String desc;
    String nvc;
    String rcb;
    boolean rcc;
    int status;
    String title;
    
    public d()
    {
      GMTrace.i(19541564325888L, 145596);
      GMTrace.o(19541564325888L, 145596);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletSecuritySettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */