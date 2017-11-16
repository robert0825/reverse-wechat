package com.tencent.mm.plugin.luckymoney.sns;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;

public class SnsLuckyMoneyFreePwdSetting
  extends WalletPreferenceUI
{
  protected com.tencent.mm.ui.base.preference.f iAA;
  protected CheckBoxPreference mLG;
  
  public SnsLuckyMoneyFreePwdSetting()
  {
    GMTrace.i(9893188730880L, 73710);
    GMTrace.o(9893188730880L, 73710);
  }
  
  private void aMp()
  {
    boolean bool = true;
    GMTrace.i(9893859819520L, 73715);
    if (com.tencent.mm.plugin.luckymoney.sns.b.a.aMs() == 1)
    {
      this.mLG.sdM = bool;
      this.ghC.edit().putBoolean("open_sns_pay_pref", bool).commit();
      if (TextUtils.isEmpty(com.tencent.mm.plugin.luckymoney.sns.b.a.aMt())) {
        break label155;
      }
      w.i("MicroMsg.mmui.MMPreference", "SetSnsPayTitle:" + com.tencent.mm.plugin.luckymoney.sns.b.a.aMt());
      this.mLG.setTitle(com.tencent.mm.plugin.luckymoney.sns.b.a.aMt());
      label90:
      if (TextUtils.isEmpty(com.tencent.mm.plugin.luckymoney.sns.b.a.aMu())) {
        break label175;
      }
      w.i("MicroMsg.mmui.MMPreference", "SetSnsPayWording:" + com.tencent.mm.plugin.luckymoney.sns.b.a.aMu());
      this.mLG.setSummary(com.tencent.mm.plugin.luckymoney.sns.b.a.aMu());
    }
    for (;;)
    {
      this.iAA.notifyDataSetChanged();
      GMTrace.o(9893859819520L, 73715);
      return;
      bool = false;
      break;
      label155:
      w.i("MicroMsg.mmui.MMPreference", "SetSnsPayTitle is empty");
      this.mLG.setTitle(a.i.sUv);
      break label90;
      label175:
      w.i("MicroMsg.mmui.MMPreference", "getSetSnsPayWording is empty");
      this.mLG.setSummary(a.i.sUu);
    }
  }
  
  private void fN(boolean paramBoolean)
  {
    GMTrace.i(9893994037248L, 73716);
    this.ghC.edit().putBoolean("open_sns_pay_pref", paramBoolean).commit();
    this.mLG.sdM = paramBoolean;
    this.iAA.notifyDataSetChanged();
    GMTrace.o(9893994037248L, 73716);
  }
  
  private static void pW(int paramInt)
  {
    GMTrace.i(9893322948608L, 73711);
    pr localpr = new pr();
    localpr.eUv.key = paramInt;
    localpr.eUv.value = 1;
    localpr.eUv.eUw = true;
    com.tencent.mm.sdk.b.a.vgX.m(localpr);
    GMTrace.o(9893322948608L, 73711);
  }
  
  protected final void MP()
  {
    GMTrace.i(9893591384064L, 73713);
    this.iAA = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9889564852224L, 73683);
        SnsLuckyMoneyFreePwdSetting.this.finish();
        GMTrace.o(9889564852224L, 73683);
        return false;
      }
    });
    oM(a.i.sUw);
    this.mLG = ((CheckBoxPreference)this.iAA.VG("open_sns_pay_pref"));
    aMp();
    GMTrace.o(9893591384064L, 73713);
  }
  
  public final int QI()
  {
    GMTrace.i(9894396690432L, 73719);
    int i = a.l.tjZ;
    GMTrace.o(9894396690432L, 73719);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(9894530908160L, 73720);
    if ("open_sns_pay_pref".equals(paramPreference.hiu))
    {
      if ((this.mLG.isChecked()) || (com.tencent.mm.plugin.luckymoney.sns.b.a.aMs() != 1)) {
        break label73;
      }
      cmu().a(new com.tencent.mm.plugin.luckymoney.sns.a.a(0, "", ""), true, 1);
      pW(117);
    }
    for (;;)
    {
      GMTrace.o(9894530908160L, 73720);
      return false;
      label73:
      pW(120);
      com.tencent.mm.wallet_core.a.a(this, a.class, null, null);
    }
  }
  
  public final boolean f(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9894262472704L, 73718);
    if ((paramk instanceof com.tencent.mm.plugin.luckymoney.sns.a.a))
    {
      w.i("MicroMsg.mmui.MMPreference", "free pwd setting onWalletSceneEnd, errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label129;
      }
      if (((com.tencent.mm.plugin.luckymoney.sns.a.a)paramk).mMf != 1) {
        break label108;
      }
      w.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 1");
      pW(119);
      fN(true);
    }
    for (;;)
    {
      GMTrace.o(9894262472704L, 73718);
      return false;
      label108:
      fN(false);
      pW(118);
      w.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 0");
      continue;
      label129:
      pW(119);
      w.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is failed, do nothing");
      aMp();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9893457166336L, 73712);
    super.onCreate(paramBundle);
    MP();
    pW(116);
    GMTrace.o(9893457166336L, 73712);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9894128254976L, 73717);
    super.onDestroy();
    GMTrace.o(9894128254976L, 73717);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(9894665125888L, 73721);
    super.onNewIntent(paramIntent);
    GMTrace.o(9894665125888L, 73721);
  }
  
  protected void onResume()
  {
    GMTrace.i(9893725601792L, 73714);
    aMp();
    super.onResume();
    GMTrace.o(9893725601792L, 73714);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\sns\SnsLuckyMoneyFreePwdSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */