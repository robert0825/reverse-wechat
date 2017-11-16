package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hx;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.w;

public final class HCEEventLogic
{
  public static String iiX;
  private static b iiY;
  private static c.b iiZ;
  
  static
  {
    GMTrace.i(20716506316800L, 154350);
    iiX = null;
    iiY = null;
    iiZ = new c.b()
    {
      public final void a(c.c paramAnonymousc)
      {
        GMTrace.i(20718653800448L, 154366);
        super.a(paramAnonymousc);
        HCEEventLogic.c(HCEEventLogic.iiX, 23, null);
        GMTrace.o(20718653800448L, 154366);
      }
      
      public final void onCreate()
      {
        GMTrace.i(20718385364992L, 154364);
        super.onCreate();
        HCEEventLogic.c(HCEEventLogic.iiX, 21, null);
        GMTrace.o(20718385364992L, 154364);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(20718788018176L, 154367);
        super.onDestroy();
        HCEEventLogic.c(HCEEventLogic.iiX, 24, null);
        GMTrace.o(20718788018176L, 154367);
      }
      
      public final void onResume()
      {
        GMTrace.i(20718519582720L, 154365);
        super.onResume();
        HCEEventLogic.c(HCEEventLogic.iiX, 22, null);
        GMTrace.o(20718519582720L, 154365);
      }
    };
    GMTrace.o(20716506316800L, 154350);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(20715969445888L, 154346);
    iiY = paramb;
    GMTrace.o(20715969445888L, 154346);
  }
  
  public static void b(String paramString, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(20716237881344L, 154348);
    w.i("MicroMsg.HCEEventLogic", "alvinluo HCE EVENT mm to AppBrand, type: %d, appId: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    com.tencent.mm.plugin.appbrand.ipc.d.a(new HCEMMToAppBrandMessageEvent(paramInt, paramString, paramBundle));
    GMTrace.o(20716237881344L, 154348);
  }
  
  public static void c(String paramString, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(20716372099072L, 154349);
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    w.i("MicroMsg.HCEEventLogic", "alvinluo HCEEventLogic sendHCEEventToMM appId: %s, eventType: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    paramString = new SendHCEEventToMMTask(paramString, paramInt, localBundle);
    com.tencent.mm.plugin.appbrand.o.d.aR(paramString);
    AppBrandMainProcessService.a(paramString);
    GMTrace.o(20716372099072L, 154349);
  }
  
  public static void j(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(20716103663616L, 154347);
    if (iiY != null) {
      iiY.k(paramString1, paramInt, paramString2);
    }
    GMTrace.o(20716103663616L, 154347);
  }
  
  public static void qJ(String paramString)
  {
    GMTrace.i(20715701010432L, 154344);
    if ((iiX != null) && (iiZ != null))
    {
      w.i("MicroMsg.HCEEventLogic", "alvinluo remove HCELifeCycleListener before add, appId: %s", new Object[] { iiX });
      c.b(iiX, iiZ);
    }
    iiX = paramString;
    c.a(paramString, iiZ);
    GMTrace.o(20715701010432L, 154344);
  }
  
  public static void qK(String paramString)
  {
    GMTrace.i(20715835228160L, 154345);
    if (paramString != null) {
      c.b(paramString, iiZ);
    }
    GMTrace.o(20715835228160L, 154345);
  }
  
  public static final class HCEMMToAppBrandMessageEvent
    implements Parcelable
  {
    public static final Parcelable.Creator<HCEMMToAppBrandMessageEvent> CREATOR;
    public String appId;
    public int ijb;
    public Bundle ijc;
    
    static
    {
      GMTrace.i(20711540260864L, 154313);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20711540260864L, 154313);
    }
    
    public HCEMMToAppBrandMessageEvent(int paramInt, String paramString, Bundle paramBundle)
    {
      GMTrace.i(20711003389952L, 154309);
      this.ijb = paramInt;
      this.appId = paramString;
      this.ijc = paramBundle;
      GMTrace.o(20711003389952L, 154309);
    }
    
    HCEMMToAppBrandMessageEvent(Parcel paramParcel)
    {
      GMTrace.i(20711406043136L, 154312);
      this.ijb = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.ijc = paramParcel.readBundle();
      GMTrace.o(20711406043136L, 154312);
    }
    
    public final int describeContents()
    {
      GMTrace.i(20711137607680L, 154310);
      GMTrace.o(20711137607680L, 154310);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20711271825408L, 154311);
      paramParcel.writeInt(this.ijb);
      paramParcel.writeString(this.appId);
      paramParcel.writeBundle(this.ijc);
      GMTrace.o(20711271825408L, 154311);
    }
  }
  
  private static class SendHCEEventToMMTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SendHCEEventToMMTask> CREATOR;
    private String appId;
    private int ijb;
    private Bundle ijc;
    
    static
    {
      GMTrace.i(20710600736768L, 154306);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20710600736768L, 154306);
    }
    
    protected SendHCEEventToMMTask(Parcel paramParcel)
    {
      GMTrace.i(20709795430400L, 154300);
      f(paramParcel);
      GMTrace.o(20709795430400L, 154300);
    }
    
    public SendHCEEventToMMTask(String paramString, int paramInt, Bundle paramBundle)
    {
      GMTrace.i(20709661212672L, 154299);
      this.ijb = paramInt;
      this.appId = paramString;
      this.ijc = paramBundle;
      GMTrace.o(20709661212672L, 154299);
    }
    
    public final void RY()
    {
      GMTrace.i(20709929648128L, 154301);
      hx localhx = new hx();
      localhx.eLr.type = this.ijb;
      localhx.eLr.appId = this.appId;
      localhx.eLr.extras = this.ijc;
      com.tencent.mm.sdk.b.a.vgX.m(localhx);
      VL();
      GMTrace.o(20709929648128L, 154301);
    }
    
    public final void VK()
    {
      GMTrace.i(20710063865856L, 154302);
      super.VK();
      com.tencent.mm.plugin.appbrand.o.d.aS(this);
      GMTrace.o(20710063865856L, 154302);
    }
    
    public int describeContents()
    {
      GMTrace.i(20710198083584L, 154303);
      GMTrace.o(20710198083584L, 154303);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(20710332301312L, 154304);
      super.f(paramParcel);
      this.ijb = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.ijc = paramParcel.readBundle();
      GMTrace.o(20710332301312L, 154304);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20710466519040L, 154305);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.ijb);
      paramParcel.writeString(this.appId);
      paramParcel.writeBundle(this.ijc);
      GMTrace.o(20710466519040L, 154305);
    }
  }
  
  public static final class a
  {
    private static boolean ija;
    
    static
    {
      GMTrace.i(20714224615424L, 154333);
      ija = false;
      GMTrace.o(20714224615424L, 154333);
    }
    
    /* Error */
    public static void Xc()
    {
      // Byte code:
      //   0: ldc 2
      //   2: monitorenter
      //   3: ldc2_w 30
      //   6: ldc 32
      //   8: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   11: getstatic 24	com/tencent/mm/plugin/appbrand/jsapi/nfc/HCEEventLogic$a:ija	Z
      //   14: ifeq +15 -> 29
      //   17: ldc2_w 30
      //   20: ldc 32
      //   22: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   25: ldc 2
      //   27: monitorexit
      //   28: return
      //   29: new 9	com/tencent/mm/plugin/appbrand/jsapi/nfc/HCEEventLogic$a$1
      //   32: dup
      //   33: invokespecial 35	com/tencent/mm/plugin/appbrand/jsapi/nfc/HCEEventLogic$a$1:<init>	()V
      //   36: invokestatic 40	com/tencent/mm/plugin/appbrand/ipc/MMToClientEvent:a	(Lcom/tencent/mm/plugin/appbrand/ipc/MMToClientEvent$a;)V
      //   39: iconst_1
      //   40: putstatic 24	com/tencent/mm/plugin/appbrand/jsapi/nfc/HCEEventLogic$a:ija	Z
      //   43: ldc2_w 30
      //   46: ldc 32
      //   48: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   51: goto -26 -> 25
      //   54: astore_0
      //   55: ldc 2
      //   57: monitorexit
      //   58: aload_0
      //   59: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   54	5	0	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   3	25	54	finally
      //   29	51	54	finally
    }
  }
  
  public static abstract interface b
  {
    public abstract void k(String paramString1, int paramInt, String paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\nfc\HCEEventLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */