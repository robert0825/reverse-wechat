package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.d.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class d
  implements a
{
  private final Context context;
  private f htU;
  
  public d(Context paramContext)
  {
    GMTrace.i(6744843485184L, 50253);
    this.context = paramContext;
    GMTrace.o(6744843485184L, 50253);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6745111920640L, 50255);
    boolean bool;
    label36:
    label48:
    Object localObject;
    if (paramx != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bg.nl(paramx.field_username).length() <= 0) {
        break label278;
      }
      bool = true;
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label284;
      }
      bool = true;
      Assert.assertTrue(bool);
      ahL();
      this.htU = paramf;
      paramf.removeAll();
      paramf.addPreferencesFromResource(R.o.eou);
      localObject = (NormalUserHeaderPreference)paramf.VG("contact_info_header_normal");
      if (localObject != null)
      {
        ((NormalUserHeaderPreference)localObject).tDu = "ContactWidgetBottleContact";
        ((NormalUserHeaderPreference)localObject).a(paramx, 0, null);
      }
      localObject = (NormalUserFooterPreference)paramf.VG("contact_info_footer_normal");
      bool = ((Activity)this.context).getIntent().getBooleanExtra("Contact_FMessageCard", false);
      if ((localObject != null) && (!((NormalUserFooterPreference)localObject).a(paramx, "", paramBoolean, false, true, 25, 0, bool, false, 0L, ""))) {
        paramf.c((Preference)localObject);
      }
      localObject = (KeyValuePreference)paramf.VG("contact_info_signature");
      if ((paramx.signature == null) || (paramx.signature.trim().equals(""))) {
        break label290;
      }
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).wko = false;
        ((KeyValuePreference)localObject).setTitle(this.context.getString(R.l.dkO));
        ((KeyValuePreference)localObject).setSummary(h.a(this.context, paramx.signature));
        ((KeyValuePreference)localObject).lP(false);
      }
    }
    for (;;)
    {
      GMTrace.o(6745111920640L, 50255);
      return true;
      bool = false;
      break;
      label278:
      bool = false;
      break label36;
      label284:
      bool = false;
      break label48;
      label290:
      paramf.c((Preference)localObject);
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6745246138368L, 50256);
    if (this.htU == null)
    {
      GMTrace.o(6745246138368L, 50256);
      return true;
    }
    Object localObject = (FriendPreference)this.htU.VG("contact_info_friend");
    if (localObject != null) {
      ((FriendPreference)localObject).ahL();
    }
    localObject = (NormalUserHeaderPreference)this.htU.VG("contact_info_header_normal");
    if (localObject != null) {
      ((NormalUserHeaderPreference)localObject).onDetach();
    }
    localObject = (NormalUserFooterPreference)this.htU.VG("contact_info_footer_normal");
    if (localObject != null) {
      ((NormalUserFooterPreference)localObject).ahL();
    }
    GMTrace.o(6745246138368L, 50256);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6745380356096L, 50257);
    GMTrace.o(6745380356096L, 50257);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6744977702912L, 50254);
    GMTrace.o(6744977702912L, 50254);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */