package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.contact.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.z.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MMToClientEvent
  extends MainProcessTask
{
  public static final Parcelable.Creator<MMToClientEvent> CREATOR;
  private static volatile MMToClientEvent hXe;
  private static final Set<a> hXf;
  public String appId;
  int eAs;
  String eHt;
  public int hXb;
  String hXc;
  Object hXd;
  public int type;
  
  static
  {
    GMTrace.i(10276380344320L, 76565);
    hXf = new HashSet();
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10276380344320L, 76565);
  }
  
  private MMToClientEvent()
  {
    GMTrace.i(10274635513856L, 76552);
    GMTrace.o(10274635513856L, 76552);
  }
  
  public MMToClientEvent(Parcel paramParcel)
  {
    GMTrace.i(10274769731584L, 76553);
    f(paramParcel);
    GMTrace.o(10274769731584L, 76553);
  }
  
  private static MMToClientEvent VJ()
  {
    GMTrace.i(10274903949312L, 76554);
    if (hXe == null) {}
    try
    {
      if (hXe == null) {
        hXe = new MMToClientEvent();
      }
      MMToClientEvent localMMToClientEvent = hXe;
      GMTrace.o(10274903949312L, 76554);
      return localMMToClientEvent;
    }
    finally {}
  }
  
  public static void a(a parama)
  {
    GMTrace.i(10275440820224L, 76558);
    synchronized (hXf)
    {
      hXf.add(parama);
      GMTrace.o(10275440820224L, 76558);
      return;
    }
  }
  
  private void aM(final Object paramObject)
  {
    GMTrace.i(14428674195456L, 107502);
    if (paramObject == null)
    {
      GMTrace.o(14428674195456L, 107502);
      return;
    }
    final LinkedList localLinkedList = new LinkedList();
    synchronized (hXf)
    {
      Iterator localIterator = hXf.iterator();
      if (localIterator.hasNext()) {
        localLinkedList.add((a)localIterator.next());
      }
    }
    com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16153774653440L, 120355);
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext()) {
          ((MMToClientEvent.a)localIterator.next()).aJ(paramObject);
        }
        GMTrace.o(16153774653440L, 120355);
      }
    });
    GMTrace.o(14428674195456L, 107502);
  }
  
  public static void b(a parama)
  {
    GMTrace.i(10275575037952L, 76559);
    if (parama != null) {
      synchronized (hXf)
      {
        hXf.remove(parama);
        GMTrace.o(10275575037952L, 76559);
        return;
      }
    }
    GMTrace.o(10275575037952L, 76559);
  }
  
  public static void qc(String paramString)
  {
    GMTrace.i(10275172384768L, 76556);
    VJ().hXb = 1;
    VJ().appId = paramString;
    AppBrandMainProcessService.a(VJ());
    GMTrace.o(10275172384768L, 76556);
  }
  
  public static void qd(String paramString)
  {
    GMTrace.i(10275306602496L, 76557);
    VJ().hXb = 2;
    VJ().appId = paramString;
    AppBrandMainProcessService.a(VJ());
    GMTrace.o(10275306602496L, 76557);
  }
  
  public final void RY()
  {
    GMTrace.i(10275038167040L, 76555);
    switch (this.hXb)
    {
    }
    for (;;)
    {
      GMTrace.o(10275038167040L, 76555);
      return;
      d.a(this);
      GMTrace.o(10275038167040L, 76555);
      return;
      d.b(this);
    }
  }
  
  public final void VK()
  {
    GMTrace.i(10275843473408L, 76561);
    switch (this.hXb)
    {
    }
    for (;;)
    {
      GMTrace.o(10275843473408L, 76561);
      return;
      Object localObject = new z.a();
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", Integer.valueOf(this.type));
      localHashMap.put("data", this.eHt);
      ((z.a)localObject).ai(this.appId, 0).r(localHashMap).VR();
      GMTrace.o(10275843473408L, 76561);
      return;
      localObject = new d.a();
      localHashMap = new HashMap();
      localHashMap.put("count", Integer.valueOf(this.eAs));
      localHashMap.put("data", this.eHt);
      ((d.a)localObject).ai(this.appId, 0).r(localHashMap).VR();
      GMTrace.o(10275843473408L, 76561);
      return;
      aM(this.hXd);
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10275977691136L, 76562);
    this.hXb = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.eHt = paramParcel.readString();
    this.eAs = paramParcel.readInt();
    try
    {
      this.hXc = paramParcel.readString();
      if (!bg.nm(this.hXc))
      {
        Class localClass = Class.forName(this.hXc);
        if (localClass != null) {
          this.hXd = paramParcel.readParcelable(localClass.getClassLoader());
        }
      }
      GMTrace.o(10275977691136L, 76562);
      return;
    }
    catch (Exception paramParcel)
    {
      w.v("MicroMsg.MMToClientEvent", "unparcel custom data e %s", new Object[] { paramParcel });
      GMTrace.o(10275977691136L, 76562);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10276111908864L, 76563);
    paramParcel.writeInt(this.hXb);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.eHt);
    paramParcel.writeInt(this.eAs);
    if ((!bg.nm(this.hXc)) && (this.hXd != null))
    {
      paramParcel.writeString(this.hXc);
      paramParcel.writeParcelable((Parcelable)this.hXd, paramInt);
    }
    GMTrace.o(10276111908864L, 76563);
  }
  
  public static abstract interface a
  {
    public abstract void aJ(Object paramObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\MMToClientEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */