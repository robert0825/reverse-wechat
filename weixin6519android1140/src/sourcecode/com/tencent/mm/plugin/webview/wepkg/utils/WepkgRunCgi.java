package com.tencent.mm.plugin.webview.wepkg.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class WepkgRunCgi
{
  public static void a(com.tencent.mm.ad.b paramb, Parcel paramParcel)
  {
    GMTrace.i(16083176128512L, 119829);
    paramParcel.writeString(paramb.gtC.gtK.getClass().getName());
    Object localObject = new byte[0];
    try
    {
      arrayOfByte = paramb.gtC.gtK.toByteArray();
      localObject = arrayOfByte;
    }
    catch (Exception localException2)
    {
      byte[] arrayOfByte;
      for (;;) {}
    }
    paramParcel.writeInt(localObject.length);
    paramParcel.writeByteArray((byte[])localObject);
    paramParcel.writeString(paramb.gtD.gtK.getClass().getName());
    localObject = new byte[0];
    try
    {
      arrayOfByte = paramb.gtD.gtK.toByteArray();
      localObject = arrayOfByte;
    }
    catch (Exception localException1)
    {
      for (;;) {}
    }
    paramParcel.writeInt(localObject.length);
    paramParcel.writeByteArray((byte[])localObject);
    paramParcel.writeString(paramb.uri);
    paramParcel.writeInt(paramb.gtE);
    paramParcel.writeInt(paramb.gtC.cmdId);
    paramParcel.writeInt(paramb.gtD.cmdId);
    GMTrace.o(16083176128512L, 119829);
  }
  
  public static com.tencent.mm.ad.b k(Parcel paramParcel)
  {
    GMTrace.i(12370311118848L, 92166);
    b.a locala = new b.a();
    String str = paramParcel.readString();
    byte[] arrayOfByte = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(arrayOfByte);
    try
    {
      locala.gtF = ((a)Class.forName(str).newInstance()).aD(arrayOfByte);
      str = paramParcel.readString();
      arrayOfByte = new byte[paramParcel.readInt()];
      paramParcel.readByteArray(arrayOfByte);
      try
      {
        locala.gtG = ((a)Class.forName(str).newInstance()).aD(arrayOfByte);
        locala.uri = paramParcel.readString();
        locala.gtE = paramParcel.readInt();
        locala.gtH = paramParcel.readInt();
        locala.gtI = paramParcel.readInt();
        paramParcel = locala.DA();
        GMTrace.o(12370311118848L, 92166);
        return paramParcel;
      }
      catch (Exception localException3)
      {
        for (;;)
        {
          if ((localException3 instanceof b.a.a.b)) {
            try
            {
              locala.gtG = ((a)Class.forName(str).newInstance());
            }
            catch (Exception localException1)
            {
              w.e("MicroMsg.Wepkg.WepkgRunCgi", "readCommReqRespFromParcel, resp fields not ready, re-create one but exp = %s", new Object[] { bg.f(localException1) });
            }
          }
        }
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  private static final class RemoteCgiTask
    extends WepkgMainProcessTask
    implements u.a
  {
    public static final Parcelable.Creator<RemoteCgiTask> CREATOR;
    private int kwP;
    private int kxb;
    private String kxc;
    public int rZw;
    private com.tencent.mm.ad.b rZx;
    public com.tencent.mm.ad.b rZy;
    public WepkgRunCgi.a rZz;
    
    static
    {
      GMTrace.i(12370042683392L, 92164);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(12370042683392L, 92164);
    }
    
    public RemoteCgiTask()
    {
      GMTrace.i(12369774247936L, 92162);
      this.rZw = 0;
      GMTrace.o(12369774247936L, 92162);
    }
    
    RemoteCgiTask(Parcel paramParcel)
    {
      GMTrace.i(12369908465664L, 92163);
      this.rZw = 0;
      f(paramParcel);
      GMTrace.o(12369908465664L, 92163);
    }
    
    public final void RY()
    {
      GMTrace.i(12368968941568L, 92156);
      u.a(this.rZy, this, true);
      GMTrace.o(12368968941568L, 92156);
    }
    
    public final void VK()
    {
      GMTrace.i(12369237377024L, 92158);
      d.aS(this);
      if (this.rZz != null) {
        this.rZz.a(this.kxb, this.kwP, this.kxc, this.rZx);
      }
      GMTrace.o(12369237377024L, 92158);
    }
    
    public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.b paramb, k paramk)
    {
      GMTrace.i(12369103159296L, 92157);
      this.kxb = paramInt1;
      this.kwP = paramInt2;
      this.kxc = paramString;
      this.rZx = paramb;
      this.rZw = 2;
      xC();
      GMTrace.o(12369103159296L, 92157);
      return 0;
    }
    
    public final int describeContents()
    {
      GMTrace.i(12369371594752L, 92159);
      GMTrace.o(12369371594752L, 92159);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(12369640030208L, 92161);
      super.f(paramParcel);
      this.rZw = paramParcel.readInt();
      switch (this.rZw)
      {
      }
      for (;;)
      {
        GMTrace.o(12369640030208L, 92161);
        return;
        this.rZy = WepkgRunCgi.k(paramParcel);
        GMTrace.o(12369640030208L, 92161);
        return;
        this.kxb = paramParcel.readInt();
        this.kwP = paramParcel.readInt();
        this.kxc = paramParcel.readString();
        this.rZx = WepkgRunCgi.k(paramParcel);
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(12369505812480L, 92160);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.rZw);
      switch (this.rZw)
      {
      }
      for (;;)
      {
        GMTrace.o(12369505812480L, 92160);
        return;
        WepkgRunCgi.a(this.rZy, paramParcel);
        GMTrace.o(12369505812480L, 92160);
        return;
        paramParcel.writeInt(this.kxb);
        paramParcel.writeInt(this.kwP);
        paramParcel.writeString(this.kxc);
        WepkgRunCgi.a(this.rZx, paramParcel);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.b paramb);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\utils\WepkgRunCgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */