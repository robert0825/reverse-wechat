package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.n;

public final class g
  implements a
{
  public g()
  {
    GMTrace.i(18717870129152L, 139459);
    GMTrace.o(18717870129152L, 139459);
  }
  
  public final void a(Object paramObject, Parcel paramParcel)
  {
    GMTrace.i(18718138564608L, 139461);
    paramObject = (f)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    ((f)paramObject).e(paramParcel);
    GMTrace.o(18718138564608L, 139461);
  }
  
  public final boolean an(Object paramObject)
  {
    GMTrace.i(18718004346880L, 139460);
    boolean bool = paramObject instanceof f;
    GMTrace.o(18718004346880L, 139460);
    return bool;
  }
  
  public final Object d(Parcel paramParcel)
  {
    GMTrace.i(18718272782336L, 139462);
    f localf = (f)n.d(paramParcel.readString(), f.class);
    if (localf != null)
    {
      localf.readFromParcel(paramParcel);
      GMTrace.o(18718272782336L, 139462);
      return localf;
    }
    GMTrace.o(18718272782336L, 139462);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */