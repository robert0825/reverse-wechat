package com.tencent.mm.plugin.appbrand.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class AppBrandMusicClientService
{
  public static AppBrandMusicClientService irl;
  public HashMap<String, b> irk;
  public volatile String irm;
  
  static
  {
    GMTrace.i(18245692162048L, 135941);
    irl = new AppBrandMusicClientService();
    GMTrace.o(18245692162048L, 135941);
  }
  
  private AppBrandMusicClientService()
  {
    GMTrace.i(18245423726592L, 135939);
    this.irk = new HashMap();
    this.irm = "";
    GMTrace.o(18245423726592L, 135939);
  }
  
  public static boolean rg(String paramString)
  {
    GMTrace.i(18843497922560L, 140395);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(18843497922560L, 140395);
      return false;
    }
    try
    {
      boolean bool = ((IPCBoolean)XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), a.class)).value;
      GMTrace.o(18843497922560L, 140395);
      return bool;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandMusicClientService", "isPlayingMusic ? %s, e = %s", new Object[] { paramString, localException });
      GMTrace.o(18843497922560L, 140395);
    }
    return false;
  }
  
  public final void iX(int paramInt)
  {
    GMTrace.i(18843363704832L, 140394);
    w.i("MicroMsg.AppBrandMusicClientService", "notifyAction, action:%d", new Object[] { Integer.valueOf(paramInt) });
    Iterator localIterator = this.irk.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (localObject != null)
      {
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (b)((Map.Entry)localObject).getValue();
        if ((!TextUtils.isEmpty(this.irm)) && (this.irm.equalsIgnoreCase(str)))
        {
          w.i("MicroMsg.AppBrandMusicClientService", "current play music appId is %s", new Object[] { this.irm });
          if (localObject != null) {
            if (paramInt == 10) {
              ((b)localObject).Ti();
            } else if (paramInt == 2) {
              ((b)localObject).onStop();
            }
          }
        }
      }
    }
    GMTrace.o(18843363704832L, 140394);
  }
  
  private static class StopBackgroundMusicTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StopBackgroundMusicTask> CREATOR;
    public String appId;
    
    static
    {
      GMTrace.i(18842289963008L, 140386);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18842289963008L, 140386);
    }
    
    public StopBackgroundMusicTask()
    {
      GMTrace.i(18841618874368L, 140381);
      GMTrace.o(18841618874368L, 140381);
    }
    
    public StopBackgroundMusicTask(Parcel paramParcel)
    {
      GMTrace.i(18841753092096L, 140382);
      f(paramParcel);
      GMTrace.o(18841753092096L, 140382);
    }
    
    public final void RY()
    {
      GMTrace.i(18841887309824L, 140383);
      w.i("MicroMsg.AppBrandMusicClientService", "runInMainProcess");
      String str = c.a.irp.irn;
      if ((!bg.nm(str)) && (!str.equals(this.appId)))
      {
        w.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { str, this.appId });
        VL();
        GMTrace.o(18841887309824L, 140383);
        return;
      }
      if (!c.a.irp.rh(this.appId))
      {
        w.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, can't not stop, preAppId:%s, appId:%s", new Object[] { str, this.appId });
        VL();
        GMTrace.o(18841887309824L, 140383);
        return;
      }
      if (com.tencent.mm.at.c.JW()) {
        w.i("MicroMsg.AppBrandMusicClientService", "stop music ok");
      }
      for (;;)
      {
        VL();
        GMTrace.o(18841887309824L, 140383);
        return;
        w.e("MicroMsg.AppBrandMusicClientService", "stop music fail");
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18842021527552L, 140384);
      this.appId = paramParcel.readString();
      GMTrace.o(18842021527552L, 140384);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18842155745280L, 140385);
      paramParcel.writeString(this.appId);
      GMTrace.o(18842155745280L, 140385);
    }
  }
  
  private static final class a
    implements i<IPCString, IPCBoolean>
  {
    private a()
    {
      GMTrace.i(18843095269376L, 140392);
      GMTrace.o(18843095269376L, 140392);
    }
  }
  
  public static abstract interface b
  {
    public abstract void Ti();
    
    public abstract void onStop();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\AppBrandMusicClientService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */