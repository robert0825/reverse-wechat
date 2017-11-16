package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.br;
import com.tencent.mm.g.a.br.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n;

public final class MenuDelegate_SendToDesktop
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public MenuDelegate_SendToDesktop()
  {
    super(l.isv - 1);
    GMTrace.i(15560532295680L, 115935);
    GMTrace.o(15560532295680L, 115935);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17666005794816L, 131622);
    if (com.tencent.mm.plugin.appbrand.a.nL(paramString).scene != 1023) {
      paramn.e(this.isD, paramContext.getString(o.i.hGw));
    }
    GMTrace.o(17666005794816L, 131622);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15560800731136L, 115937);
    paramk = com.tencent.mm.plugin.appbrand.a.nK(paramString);
    String str = paramk.eAr;
    if ((paramContext == null) || (TextUtils.isEmpty(str)))
    {
      w.i("MicroMsg.MenuDelegate_SendToDesktop", "performItemClick failed, context or username is null or nil.");
      GMTrace.o(15560800731136L, 115937);
      return;
    }
    AppBrandMainProcessService.a(new SendShortcutToDesktopTask(paramContext, str, paramString, paramk.hRg.hKB));
    com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.ivj.hZo, 14, "", bg.Pu(), 1, 0);
    GMTrace.o(15560800731136L, 115937);
  }
  
  private static class SendShortcutToDesktopTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SendShortcutToDesktopTask> CREATOR;
    public int eII;
    private String hyD;
    public boolean isi;
    private Context mContext;
    public String username;
    
    static
    {
      GMTrace.i(15556505763840L, 115905);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15556505763840L, 115905);
    }
    
    public SendShortcutToDesktopTask(Context paramContext, String paramString1, String paramString2, int paramInt)
    {
      GMTrace.i(15555029368832L, 115894);
      this.mContext = paramContext;
      this.username = paramString1;
      this.hyD = paramString2;
      this.eII = paramInt;
      GMTrace.o(15555029368832L, 115894);
    }
    
    public SendShortcutToDesktopTask(Parcel paramParcel)
    {
      GMTrace.i(15555163586560L, 115895);
      f(paramParcel);
      GMTrace.o(15555163586560L, 115895);
    }
    
    public final void RY()
    {
      GMTrace.i(15555297804288L, 115896);
      final Context localContext = ab.getContext();
      String str = this.username;
      int i = this.eII;
      if ((localContext == null) || (str == null)) {
        w.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or username is null.");
      }
      for (;;)
      {
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15559995424768L, 115931);
            MenuDelegate_SendToDesktop.SendShortcutToDesktopTask localSendShortcutToDesktopTask = MenuDelegate_SendToDesktop.SendShortcutToDesktopTask.this;
            boolean bool = com.tencent.mm.plugin.appbrand.k.d(localContext, MenuDelegate_SendToDesktop.SendShortcutToDesktopTask.this.username, MenuDelegate_SendToDesktop.SendShortcutToDesktopTask.this.eII);
            localSendShortcutToDesktopTask.isi = bool;
            if (bool) {
              g.ork.a(443L, 1L, 1L, false);
            }
            MenuDelegate_SendToDesktop.SendShortcutToDesktopTask.a(MenuDelegate_SendToDesktop.SendShortcutToDesktopTask.this);
            GMTrace.o(15559995424768L, 115931);
          }
        }, 1000L);
        GMTrace.o(15555297804288L, 115896);
        return;
        Object localObject = new br();
        ((br)localObject).eCO.username = str;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((br)localObject).eCP.eCR == null)
        {
          w.e("MicroMsg.AppBrandShortcutManager", "no such user");
        }
        else
        {
          localObject = com.tencent.mm.plugin.appbrand.k.a(localContext, (br)localObject, i, com.tencent.mm.plugin.appbrand.k.a(localContext, com.tencent.mm.plugin.appbrand.k.a((br)localObject), i), false);
          if (localObject == null)
          {
            w.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
          }
          else
          {
            com.tencent.mm.plugin.base.model.b.o(localContext, (Intent)localObject);
            w.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", new Object[] { str });
          }
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(15555432022016L, 115897);
      if ((this.mContext == null) || (!this.isi))
      {
        GMTrace.o(15555432022016L, 115897);
        return;
      }
      Object localObject = com.tencent.mm.plugin.appbrand.a.nK(this.hyD);
      if (localObject == null)
      {
        GMTrace.o(15555432022016L, 115897);
        return;
      }
      localObject = "pref_appbrand_" + ((AppBrandSysConfig)localObject).uin;
      localObject = MultiProcessSharedPreferences.getSharedPreferences(this.mContext, (String)localObject, 4);
      if (!((SharedPreferences)localObject).contains("has_show_send_to_desktop_tips"))
      {
        if (com.tencent.mm.plugin.appbrand.a.nI(this.hyD) != null)
        {
          Context localContext = this.mContext;
          int i = o.i.hEF;
          int j = o.i.cUG;
          h.b(localContext, localContext.getString(i), localContext.getString(j), false);
        }
        ((SharedPreferences)localObject).edit().putBoolean("has_show_send_to_desktop_tips", true).commit();
      }
      GMTrace.o(15555432022016L, 115897);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15555566239744L, 115898);
      this.username = paramParcel.readString();
      this.eII = paramParcel.readInt();
      if (paramParcel.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.isi = bool;
        GMTrace.o(15555566239744L, 115898);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15555700457472L, 115899);
      paramParcel.writeString(this.username);
      paramParcel.writeInt(this.eII);
      if (this.isi) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        GMTrace.o(15555700457472L, 115899);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\MenuDelegate_SendToDesktop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */