package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.n;

public final class b
  implements a
{
  public b()
  {
    GMTrace.i(18718675435520L, 139465);
    GMTrace.o(18718675435520L, 139465);
  }
  
  public final void a(Object paramObject, Parcel paramParcel)
  {
    GMTrace.i(18718943870976L, 139467);
    paramObject = (com.tencent.mm.ipcinvoker.d.a)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    paramParcel.writeBundle(((com.tencent.mm.ipcinvoker.d.a)paramObject).toBundle());
    GMTrace.o(18718943870976L, 139467);
  }
  
  public final boolean an(Object paramObject)
  {
    GMTrace.i(18718809653248L, 139466);
    boolean bool = paramObject instanceof com.tencent.mm.ipcinvoker.d.a;
    GMTrace.o(18718809653248L, 139466);
    return bool;
  }
  
  public final Object d(Parcel paramParcel)
  {
    GMTrace.i(18719078088704L, 139468);
    String str = paramParcel.readString();
    paramParcel.readBundle();
    paramParcel = (com.tencent.mm.ipcinvoker.d.a)n.d(str, com.tencent.mm.ipcinvoker.d.a.class);
    if (paramParcel != null)
    {
      GMTrace.o(18719078088704L, 139468);
      return paramParcel;
    }
    GMTrace.o(18719078088704L, 139468);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */