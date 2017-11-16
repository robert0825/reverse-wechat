package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import org.json.JSONException;
import org.json.JSONObject;

public class SwitchRealnameVerifyModeUI
  extends WalletBaseUI
  implements View.OnClickListener
{
  private int gGg;
  private View rcY;
  private View rcZ;
  private View rda;
  private TextView rdb;
  private TextView rdc;
  private TextView rdd;
  private TextView rde;
  private TextView rdf;
  private TextView rdg;
  private TextView rdh;
  private String rdi;
  private String rdj;
  private String rdk;
  private boolean rdl;
  private boolean rdm;
  
  public SwitchRealnameVerifyModeUI()
  {
    GMTrace.i(6861076037632L, 51119);
    this.gGg = 0;
    this.rdm = false;
    GMTrace.o(6861076037632L, 51119);
  }
  
  private static JSONObject bya()
  {
    GMTrace.i(6861881344000L, 51125);
    com.tencent.mm.kernel.h.xz();
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vue, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      if (!bg.nm((String)localObject)) {
        try
        {
          localObject = new JSONObject((String)localObject);
          long l1 = System.currentTimeMillis() / 1000L;
          long l2 = ((JSONObject)localObject).getLong("timestamp");
          long l3 = ((JSONObject)localObject).getLong("cache_time");
          w.i("MicroMsg.SwitchRealnameVerifyModeUI", " dddd time=" + l1 + ";timestamp=" + l2 + ";cachetime=" + l3);
          if (l1 - l2 > l3)
          {
            w.e("MicroMsg.SwitchRealnameVerifyModeUI", "wording data from cache is out of date");
            GMTrace.o(6861881344000L, 51125);
            return null;
          }
          GMTrace.o(6861881344000L, 51125);
          return (JSONObject)localObject;
        }
        catch (JSONException localJSONException)
        {
          w.printErrStackTrace("MicroMsg.SwitchRealnameVerifyModeUI", localJSONException, "", new Object[0]);
          w.e("MicroMsg.SwitchRealnameVerifyModeUI", "parse wording data form cache error");
          GMTrace.o(6861881344000L, 51125);
          return null;
        }
      }
    }
    w.i("MicroMsg.SwitchRealnameVerifyModeUI", "cache is null");
    GMTrace.o(6861881344000L, 51125);
    return null;
  }
  
  private boolean iS(boolean paramBoolean)
  {
    GMTrace.i(6862015561728L, 51126);
    JSONObject localJSONObject = bya();
    if ((paramBoolean) && (localJSONObject == null)) {
      localJSONObject = new JSONObject();
    }
    for (;;)
    {
      if (localJSONObject != null)
      {
        String str = bg.aq(localJSONObject.optString("cache_header_titles", getString(a.i.sYF)), getString(a.i.sYF));
        if (this.rdm)
        {
          ((TextView)findViewById(a.f.sHr)).setText(a.i.tfp);
          if (!localJSONObject.optBoolean("isShowBindCardVerify", false)) {
            break label429;
          }
          this.rdg.setText(localJSONObject.optString("bindCardVerifyTitle"));
          this.rdh.setText(localJSONObject.optString("bindCardVerifySubtitle"));
          this.rda.setVisibility(0);
          label123:
          if (!localJSONObject.optBoolean("isShowBindCard", false)) {
            break label441;
          }
          this.rdb.setText(localJSONObject.optString("bindcardTitle", getString(a.i.sYG)));
          this.rdc.setText(localJSONObject.optString("bindcardSubTitle", getString(a.i.sYH)));
          this.rcY.setVisibility(0);
          label182:
          if (!localJSONObject.optBoolean("isShowBindId", false)) {
            break label453;
          }
          this.rdd.setText(localJSONObject.optString("bindIdTitle", getString(a.i.sYI)));
          this.rde.setText(localJSONObject.optString("bindIdSubTitle", getString(a.i.sYJ)));
          this.rcZ.setVisibility(0);
          label243:
          this.rdj = localJSONObject.optString("bindCardVerifyAlertViewRightBtnTxt", "");
          this.rdk = localJSONObject.optString("bindCardVerifyAlertViewContent", "");
          this.rdl = localJSONObject.optBoolean("isShowBindCardVerifyAlertView", false);
          str = localJSONObject.optString("extral_wording", "");
          if (bg.nm(str)) {
            break label465;
          }
          this.rdf.setText(str);
          this.rdf.setVisibility(0);
        }
        for (;;)
        {
          this.rdj = localJSONObject.optString("bindCardVerifyAlertViewRightBtnTxt", "");
          this.rdk = localJSONObject.optString("bindCardVerifyAlertViewContent");
          this.rdl = localJSONObject.optBoolean("isShowBindCardVerifyAlertView", false);
          paramBoolean = localJSONObject.optBoolean("question_answer_switch", false);
          this.rdi = localJSONObject.optString("question_answer_url", "");
          if ((paramBoolean) && (!bg.nm(this.rdi))) {
            a(0, a.e.spj, new MenuItem.OnMenuItemClickListener()
            {
              public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
              {
                GMTrace.i(6837453717504L, 50943);
                com.tencent.mm.wallet_core.ui.e.a(18, bg.Pu(), SwitchRealnameVerifyModeUI.a(SwitchRealnameVerifyModeUI.this));
                com.tencent.mm.wallet_core.ui.e.m(SwitchRealnameVerifyModeUI.this.vKB.vKW, SwitchRealnameVerifyModeUI.b(SwitchRealnameVerifyModeUI.this), false);
                GMTrace.o(6837453717504L, 50943);
                return true;
              }
            });
          }
          GMTrace.o(6862015561728L, 51126);
          return true;
          ((TextView)findViewById(a.f.sHr)).setText(str);
          break;
          label429:
          this.rda.setVisibility(8);
          break label123;
          label441:
          this.rcY.setVisibility(8);
          break label182;
          label453:
          this.rcZ.setVisibility(8);
          break label243;
          label465:
          this.rdf.setVisibility(8);
        }
      }
      GMTrace.o(6862015561728L, 51126);
      return paramBoolean;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(6861344473088L, 51121);
    oM(a.i.tfn);
    this.rcY = findViewById(a.f.sHs);
    this.rcZ = findViewById(a.f.sHt);
    this.rda = findViewById(a.f.sHu);
    this.rcZ.setOnClickListener(this);
    this.rcY.setOnClickListener(this);
    this.rda.setOnClickListener(this);
    this.rdb = ((TextView)findViewById(a.f.sqP));
    this.rdc = ((TextView)findViewById(a.f.sqO));
    this.rdd = ((TextView)findViewById(a.f.sqS));
    this.rde = ((TextView)findViewById(a.f.sqR));
    this.rdf = ((TextView)findViewById(a.f.svo));
    this.rdg = ((TextView)findViewById(a.f.sIc));
    this.rdh = ((TextView)findViewById(a.f.sIb));
    if (this.rdm) {
      ((TextView)findViewById(a.f.sHr)).setText(a.i.tfp);
    }
    if (!iS(false))
    {
      com.tencent.mm.plugin.wallet_core.id_verify.model.b localb = new com.tencent.mm.plugin.wallet_core.id_verify.model.b();
      hN(1666);
      l(localb);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6846983176192L, 51014);
        paramAnonymousMenuItem = SwitchRealnameVerifyModeUI.this.cmp();
        if (paramAnonymousMenuItem != null)
        {
          com.tencent.mm.wallet_core.ui.e.a(14, bg.Pu(), SwitchRealnameVerifyModeUI.a(SwitchRealnameVerifyModeUI.this));
          if (paramAnonymousMenuItem != null) {
            paramAnonymousMenuItem.c(SwitchRealnameVerifyModeUI.this, 0);
          }
          for (;;)
          {
            GMTrace.o(6846983176192L, 51014);
            return true;
            SwitchRealnameVerifyModeUI.this.finish();
          }
        }
        GMTrace.o(6846983176192L, 51014);
        return false;
      }
    });
    GMTrace.o(6861344473088L, 51121);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6861478690816L, 51122);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        hO(580);
        ((com.tencent.mm.plugin.wallet_core.c.a)paramk).aWg();
        paramString = cmp();
        if (paramString != null)
        {
          paramString = paramString.ler;
          paramString.putInt("real_name_verify_mode", 1);
          com.tencent.mm.wallet_core.a.i(this, paramString);
        }
        GMTrace.o(6861478690816L, 51122);
        return true;
      }
    }
    else if ((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.b))
    {
      hO(1666);
      iS(true);
    }
    GMTrace.o(6861478690816L, 51122);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6861612908544L, 51123);
    int i = a.g.sQc;
    GMTrace.o(6861612908544L, 51123);
    return i;
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(6861747126272L, 51124);
    int i = paramView.getId();
    paramView = cmp();
    Bundle localBundle;
    if (paramView != null)
    {
      localBundle = paramView.ler;
      if (i != a.f.sHs) {
        break label231;
      }
      com.tencent.mm.wallet_core.ui.e.a(15, bg.Pu(), this.gGg);
      if (localBundle.getInt("realname_scene") == 1)
      {
        if (getIntent() == null)
        {
          paramView = "";
          if (bg.nm("")) {
            paramView = getString(a.i.tgK);
          }
          com.tencent.mm.ui.base.h.a(this, paramView, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6838795894784L, 50953);
              SwitchRealnameVerifyModeUI.this.finish();
              GMTrace.o(6838795894784L, 50953);
            }
          });
          GMTrace.o(6861747126272L, 51124);
          return;
        }
        hN(580);
        r(new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url")));
        GMTrace.o(6861747126272L, 51124);
        return;
      }
      localBundle.putInt("real_name_verify_mode", 1);
    }
    for (;;)
    {
      com.tencent.mm.wallet_core.a.i(this, localBundle);
      GMTrace.o(6861747126272L, 51124);
      return;
      label231:
      if (i == a.f.sHt)
      {
        com.tencent.mm.wallet_core.ui.e.a(17, bg.Pu(), this.gGg);
        localBundle.putInt("real_name_verify_mode", 2);
      }
      else if (i == a.f.sHu)
      {
        com.tencent.mm.wallet_core.ui.e.a(16, bg.Pu(), this.gGg);
        if ((this.rdl) && (!bg.nm(this.rdk)))
        {
          com.tencent.mm.ui.base.h.a(this, this.rdk, "", this.rdj, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6856109981696L, 51082);
              paramAnonymousDialogInterface = paramView.ler;
              paramAnonymousDialogInterface.putInt("real_name_verify_mode", 3);
              paramAnonymousDialogInterface.putString("verify_card_flag", "1");
              com.tencent.mm.wallet_core.a.i(SwitchRealnameVerifyModeUI.this, paramAnonymousDialogInterface);
              GMTrace.o(6856109981696L, 51082);
            }
          });
          GMTrace.o(6861747126272L, 51124);
          return;
        }
        localBundle.putInt("real_name_verify_mode", 3);
        localBundle.putString("verify_card_flag", "1");
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6861210255360L, 51120);
    super.onCreate(paramBundle);
    this.rdm = this.ui.getBoolean("key_from_set_pwd", false);
    MP();
    cmp();
    this.gGg = this.ui.getInt("entry_scene", this.gGg);
    com.tencent.mm.wallet_core.ui.e.a(13, bg.Pu(), this.gGg);
    if (this.rdm) {
      oM(a.i.tfo);
    }
    GMTrace.o(6861210255360L, 51120);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6862149779456L, 51127);
    if (paramInt == 4)
    {
      com.tencent.mm.wallet_core.b localb = cmp();
      if (localb != null)
      {
        com.tencent.mm.wallet_core.ui.e.a(14, bg.Pu(), this.gGg);
        localb.c(this, 0);
        GMTrace.o(6862149779456L, 51127);
        return true;
      }
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6862149779456L, 51127);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\SwitchRealnameVerifyModeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */