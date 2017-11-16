package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.m;
import junit.framework.Assert;

public final class h
  implements com.tencent.mm.pluginsdk.d.a
{
  public Context context;
  private f htU;
  private x iBi;
  private String jNA;
  public q jNF;
  private boolean nLx;
  private boolean nLy;
  private int nLz;
  private int nNb;
  public ContactListExpandPreference nNc;
  
  public h(Context paramContext)
  {
    GMTrace.i(6807657381888L, 50721);
    this.context = paramContext;
    this.nNc = new ContactListExpandPreference(paramContext, 0);
    GMTrace.o(6807657381888L, 50721);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6807925817344L, 50723);
    if (paramx != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bg.nl(paramx.field_username).length() <= 0) {
        break label369;
      }
      bool = true;
      label36:
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label375;
      }
    }
    label369:
    label375:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.htU = paramf;
      this.iBi = paramx;
      this.nLx = paramBoolean;
      this.nLz = paramInt;
      this.nLy = ((Activity)this.context).getIntent().getBooleanExtra("User_Verify", false);
      this.nNb = ((Activity)this.context).getIntent().getIntExtra("Kdel_from", -1);
      this.jNA = paramx.field_username;
      at.AR();
      this.jNF = c.yT().gD(this.jNA);
      this.htU.removeAll();
      paramf = new PreferenceSmallCategory(this.context);
      this.htU.a(paramf);
      this.nNc.setKey("roominfo_contact_anchor");
      this.htU.a(this.nNc);
      paramf = new PreferenceCategory(this.context);
      this.htU.a(paramf);
      paramf = new NormalUserFooterPreference(this.context);
      paramf.setLayoutResource(R.i.ctJ);
      paramf.setKey("contact_info_footer_normal");
      if (paramf.a(this.iBi, "", this.nLx, this.nLy, false, this.nLz, this.nNb, false, false, 0L, "")) {
        this.htU.a(paramf);
      }
      this.nNc.a(this.htU, this.nNc.hiu);
      paramf = m.fi(this.jNA);
      this.nNc.kf(false).kg(false);
      this.nNc.m(this.jNA, paramf);
      this.nNc.a(new ContactListExpandPreference.a()
      {
        public final void anE()
        {
          GMTrace.i(6723637084160L, 50095);
          GMTrace.o(6723637084160L, 50095);
        }
        
        public final void ma(int paramAnonymousInt)
        {
          GMTrace.i(6723368648704L, 50093);
          GMTrace.o(6723368648704L, 50093);
        }
        
        public final void mb(int paramAnonymousInt)
        {
          GMTrace.i(6723502866432L, 50094);
          if (h.this.nNc.zj(paramAnonymousInt))
          {
            String str = h.this.nNc.zk(paramAnonymousInt);
            if (bg.nm(str))
            {
              GMTrace.o(6723502866432L, 50094);
              return;
            }
            Intent localIntent = new Intent();
            localIntent.setClass(h.this.context, ContactInfoUI.class);
            localIntent.putExtra("Contact_User", str);
            localIntent.putExtra("Contact_RoomNickname", h.this.jNF.fs(str));
            h.this.context.startActivity(localIntent);
          }
          GMTrace.o(6723502866432L, 50094);
        }
        
        public final void mc(int paramAnonymousInt)
        {
          GMTrace.i(6723771301888L, 50096);
          GMTrace.o(6723771301888L, 50096);
        }
      });
      GMTrace.o(6807925817344L, 50723);
      return true;
      bool = false;
      break;
      bool = false;
      break label36;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6808060035072L, 50724);
    NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)this.htU.VG("contact_info_footer_normal");
    if (localNormalUserFooterPreference != null) {
      localNormalUserFooterPreference.ahL();
    }
    GMTrace.o(6808060035072L, 50724);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6808194252800L, 50725);
    GMTrace.o(6808194252800L, 50725);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6807791599616L, 50722);
    w.d("MicroMsg.ContactWidgetGroupCard", "handleEvent " + paramString);
    at.AR();
    paramString = c.yK().TE(paramString);
    if ((paramString == null) || ((int)paramString.fTq <= 0))
    {
      GMTrace.o(6807791599616L, 50722);
      return true;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(this.context, ContactInfoUI.class);
    localIntent.putExtra("Contact_User", paramString.field_username);
    this.context.startActivity(localIntent);
    GMTrace.o(6807791599616L, 50722);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */