package com.tencent.mm.plugin.appbrand.ipc;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.lang.reflect.Constructor;

public abstract class AppBrandProxyUIProcessTask
  implements MMActivity.a
{
  public b hWZ;
  
  public AppBrandProxyUIProcessTask()
  {
    GMTrace.i(10277454086144L, 76573);
    GMTrace.o(10277454086144L, 76573);
  }
  
  public final MMActivity VD()
  {
    GMTrace.i(10277588303872L, 76574);
    MMActivity localMMActivity = this.hWZ.VD();
    GMTrace.o(10277588303872L, 76574);
    return localMMActivity;
  }
  
  public void VF()
  {
    GMTrace.i(10278125174784L, 76578);
    GMTrace.o(10278125174784L, 76578);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10277990957056L, 76577);
    GMTrace.o(10277990957056L, 76577);
  }
  
  public abstract void a(ProcessRequest paramProcessRequest);
  
  public final void a(final ProcessResult paramProcessResult)
  {
    GMTrace.i(10277722521600L, 76575);
    paramProcessResult = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10280809529344L, 76598);
        if (AppBrandProxyUIProcessTask.this.hWZ == null)
        {
          GMTrace.o(10280809529344L, 76598);
          return;
        }
        AppBrandProxyUIProcessTask.this.hWZ.a(paramProcessResult);
        GMTrace.o(10280809529344L, 76598);
      }
    };
    if (this.hWZ == null)
    {
      GMTrace.o(10277722521600L, 76575);
      return;
    }
    this.hWZ.runOnUiThread(paramProcessResult);
    GMTrace.o(10277722521600L, 76575);
  }
  
  public static abstract class ProcessRequest
    implements Parcelable
  {
    public ProcessRequest()
    {
      GMTrace.i(10283762319360L, 76620);
      GMTrace.o(10283762319360L, 76620);
    }
    
    public ProcessRequest(Parcel paramParcel)
    {
      GMTrace.i(10283896537088L, 76621);
      h(paramParcel);
      GMTrace.o(10283896537088L, 76621);
    }
    
    public boolean VG()
    {
      GMTrace.i(10284030754816L, 76622);
      GMTrace.o(10284030754816L, 76622);
      return false;
    }
    
    public String VH()
    {
      GMTrace.i(16153506217984L, 120353);
      GMTrace.o(16153506217984L, 120353);
      return null;
    }
    
    public abstract Class<? extends AppBrandProxyUIProcessTask> VI();
    
    public int describeContents()
    {
      GMTrace.i(10284164972544L, 76623);
      GMTrace.o(10284164972544L, 76623);
      return 0;
    }
    
    public void h(Parcel paramParcel)
    {
      GMTrace.i(10284433408000L, 76625);
      GMTrace.o(10284433408000L, 76625);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10284299190272L, 76624);
      GMTrace.o(10284299190272L, 76624);
    }
  }
  
  public static abstract class ProcessResult
    implements Parcelable
  {
    public ProcessResult()
    {
      GMTrace.i(10284701843456L, 76627);
      GMTrace.o(10284701843456L, 76627);
    }
    
    public ProcessResult(Parcel paramParcel)
    {
      GMTrace.i(10284836061184L, 76628);
      h(paramParcel);
      GMTrace.o(10284836061184L, 76628);
    }
    
    public abstract void h(Parcel paramParcel);
  }
  
  static final class a
  {
    static <_Model extends AppBrandProxyUIProcessTask> _Model qb(String paramString)
    {
      GMTrace.i(10290070552576L, 76667);
      try
      {
        Object localObject = Class.forName(paramString).getDeclaredConstructor(new Class[0]);
        ((Constructor)localObject).setAccessible(true);
        localObject = (AppBrandProxyUIProcessTask)((Constructor)localObject).newInstance(new Object[0]);
        GMTrace.o(10290070552576L, 76667);
        return (_Model)localObject;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.AppBrand.IpcProxyUIModelFactory", "create mode object using className(%s), exp = %s", new Object[] { paramString, bg.f(localException) });
        GMTrace.o(10290070552576L, 76667);
      }
      return null;
    }
  }
  
  public static abstract interface b<R extends AppBrandProxyUIProcessTask.ProcessResult>
  {
    public abstract void c(R paramR);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\AppBrandProxyUIProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */