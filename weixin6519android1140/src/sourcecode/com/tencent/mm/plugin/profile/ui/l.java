package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.d.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import junit.framework.Assert;

abstract class l
  implements a, m.b
{
  protected Context context;
  protected f htU;
  protected x iBi;
  protected HelperHeaderPreference.a nNB;
  
  public l(Context paramContext, HelperHeaderPreference.a parama)
  {
    GMTrace.i(6808596905984L, 50728);
    this.context = paramContext;
    this.nNB = parama;
    GMTrace.o(6808596905984L, 50728);
  }
  
  private void ahK()
  {
    GMTrace.i(6809939083264L, 50738);
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(QI());
    boolean bool = aXJ();
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
    if (localHelperHeaderPreference != null) {
      localHelperHeaderPreference.a(this.iBi, this.nNB);
    }
    if (!bool)
    {
      this.htU.VH("contact_info_plugin_view");
      this.htU.VH("contact_info_plugin_clear_data");
      this.htU.VH("contact_info_plugin_uninstall");
      GMTrace.o(6809939083264L, 50738);
      return;
    }
    this.htU.VH("contact_info_plugin_install");
    GMTrace.o(6809939083264L, 50738);
  }
  
  protected abstract int QI();
  
  public void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(6809267994624L, 50733);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetPlugin", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetPlugin", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(6809267994624L, 50733);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(6809267994624L, 50733);
      return;
    }
    ahK();
    GMTrace.o(6809267994624L, 50733);
  }
  
  public boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6809402212352L, 50734);
    if (paramx != null)
    {
      paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      if (bg.nl(paramx.field_username).length() <= 0) {
        break label93;
      }
    }
    label93:
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramf != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      at.AR();
      c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      ahK();
      GMTrace.o(6809402212352L, 50734);
      return true;
      paramBoolean = false;
      break;
    }
  }
  
  protected abstract boolean aXJ();
  
  public boolean ahL()
  {
    GMTrace.i(6809536430080L, 50735);
    at.AR();
    c.xh().b(this);
    this.htU.VG("contact_info_header_helper");
    GMTrace.o(6809536430080L, 50735);
    return true;
  }
  
  protected abstract void clear();
  
  protected abstract void gB(boolean paramBoolean);
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6809804865536L, 50737);
    GMTrace.o(6809804865536L, 50737);
  }
  
  public boolean tF(String paramString)
  {
    GMTrace.i(6809670647808L, 50736);
    if ("contact_info_plugin_clear_data".equals(paramString))
    {
      h.a(this.context, this.context.getString(R.l.diY), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6775310909440L, 50480);
          l.this.clear();
          GMTrace.o(6775310909440L, 50480);
        }
      }, null);
      GMTrace.o(6809670647808L, 50736);
      return true;
    }
    if (paramString.equals("contact_info_plugin_install"))
    {
      gB(true);
      GMTrace.o(6809670647808L, 50736);
      return true;
    }
    if (paramString.equals("contact_info_plugin_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6763365531648L, 50391);
          l.this.gB(false);
          GMTrace.o(6763365531648L, 50391);
        }
      }, null);
      GMTrace.o(6809670647808L, 50736);
      return true;
    }
    w.e("MicroMsg.ContactWidgetPlugin", "handleEvent : unexpected key = " + paramString);
    GMTrace.o(6809670647808L, 50736);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */