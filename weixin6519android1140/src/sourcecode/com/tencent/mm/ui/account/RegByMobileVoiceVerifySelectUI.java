package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ap.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;

public class RegByMobileVoiceVerifySelectUI
  extends MMPreference
  implements e
{
  private f htU;
  private String oJk;
  private LanguagePreference.a[] vSR;
  
  public RegByMobileVoiceVerifySelectUI()
  {
    GMTrace.i(2727035797504L, 20318);
    GMTrace.o(2727035797504L, 20318);
  }
  
  public static String Vt(String paramString)
  {
    GMTrace.i(2727975321600L, 20325);
    LanguagePreference.a[] arrayOfa = bYL();
    paramString = b.kz(paramString);
    int j = arrayOfa.length;
    int i = 0;
    while (i < j)
    {
      LanguagePreference.a locala = arrayOfa[i];
      if (locala.vQc.equalsIgnoreCase(paramString))
      {
        paramString = locala.vQa;
        GMTrace.o(2727975321600L, 20325);
        return paramString;
      }
      i += 1;
    }
    GMTrace.o(2727975321600L, 20325);
    return "English";
  }
  
  private static LanguagePreference.a[] bYL()
  {
    GMTrace.i(2728109539328L, 20326);
    String[] arrayOfString1 = ab.getContext().getString(R.l.dae).trim().split(",");
    LanguagePreference.a[] arrayOfa = new LanguagePreference.a[arrayOfString1.length];
    int i = 0;
    while (i < arrayOfString1.length)
    {
      String[] arrayOfString2 = arrayOfString1[i].trim().split(":");
      arrayOfa[i] = new LanguagePreference.a(arrayOfString2[1], arrayOfString2[2], arrayOfString2[0], false);
      i += 1;
    }
    GMTrace.o(2728109539328L, 20326);
    return arrayOfa;
  }
  
  protected final void MP()
  {
    GMTrace.i(2727841103872L, 20324);
    aLo();
    this.oJk = getIntent().getExtras().getString("voice_verify_code");
    oM(R.l.dah);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2678046326784L, 19953);
        RegByMobileVoiceVerifySelectUI.this.aLo();
        RegByMobileVoiceVerifySelectUI.this.finish();
        GMTrace.o(2678046326784L, 19953);
        return true;
      }
    });
    this.vSR = bYL();
    if ((this.vSR == null) || (this.vSR.length <= 0))
    {
      GMTrace.o(2727841103872L, 20324);
      return;
    }
    this.htU.removeAll();
    Object localObject = new PreferenceCategory(this);
    this.htU.a((Preference)localObject);
    localObject = this.vSR;
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      LanguagePreference.a locala = localObject[i];
      if (locala.vQc.equalsIgnoreCase(this.oJk)) {
        locala.mbA = true;
      }
      LanguagePreference localLanguagePreference = new LanguagePreference(this);
      localLanguagePreference.a(locala);
      localLanguagePreference.setKey(locala.vQc);
      this.htU.a(localLanguagePreference);
      i += 1;
    }
    GMTrace.o(2727841103872L, 20324);
  }
  
  public final int QI()
  {
    GMTrace.i(2727572668416L, 20322);
    int i = R.i.cqg;
    GMTrace.o(2727572668416L, 20322);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2727170015232L, 20319);
    GMTrace.o(2727170015232L, 20319);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(2727706886144L, 20323);
    if ((paramPreference instanceof LanguagePreference))
    {
      paramf = ((LanguagePreference)paramPreference).vPZ;
      if (paramf == null)
      {
        GMTrace.o(2727706886144L, 20323);
        return false;
      }
      paramPreference = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("voice_verify_language", paramf.vQa);
      localBundle.putString("voice_verify_code", paramf.vQc);
      paramPreference.putExtras(localBundle);
      setResult(0, paramPreference);
      finish();
      GMTrace.o(2727706886144L, 20323);
      return true;
    }
    GMTrace.o(2727706886144L, 20323);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2727304232960L, 20320);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    MP();
    GMTrace.o(2727304232960L, 20320);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2727438450688L, 20321);
    super.onDestroy();
    GMTrace.o(2727438450688L, 20321);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\RegByMobileVoiceVerifySelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */