package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.f;

public final class a
  extends com.tencent.mm.ipcinvoker.extension.event.a<a>
{
  private static final a hWe;
  
  static
  {
    GMTrace.i(18943221694464L, 141138);
    hWe = new a();
    GMTrace.o(18943221694464L, 141138);
  }
  
  public a()
  {
    GMTrace.i(18943087476736L, 141137);
    GMTrace.o(18943087476736L, 141137);
  }
  
  public static final class a
    implements f
  {
    public int height;
    public String id;
    public int width;
    
    public a()
    {
      GMTrace.i(18943490129920L, 141140);
      GMTrace.o(18943490129920L, 141140);
    }
    
    public final void e(Parcel paramParcel)
    {
      GMTrace.i(18943624347648L, 141141);
      paramParcel.writeString(this.id);
      paramParcel.writeInt(this.width);
      paramParcel.writeInt(this.height);
      GMTrace.o(18943624347648L, 141141);
    }
    
    public final void readFromParcel(Parcel paramParcel)
    {
      GMTrace.i(18943758565376L, 141142);
      this.id = paramParcel.readString();
      this.width = paramParcel.readInt();
      this.height = paramParcel.readInt();
      GMTrace.o(18943758565376L, 141142);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */