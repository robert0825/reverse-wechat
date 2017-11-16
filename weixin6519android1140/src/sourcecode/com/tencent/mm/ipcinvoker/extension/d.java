package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;

public final class d
  implements a
{
  public d()
  {
    GMTrace.i(18716125298688L, 139446);
    GMTrace.o(18716125298688L, 139446);
  }
  
  public final void a(Object paramObject, Parcel paramParcel)
  {
    GMTrace.i(18716393734144L, 139448);
    paramParcel.writeParcelable((Parcelable)paramObject, 0);
    GMTrace.o(18716393734144L, 139448);
  }
  
  public final boolean an(Object paramObject)
  {
    GMTrace.i(18716259516416L, 139447);
    boolean bool = paramObject instanceof Parcelable;
    GMTrace.o(18716259516416L, 139447);
    return bool;
  }
  
  public final Object d(Parcel paramParcel)
  {
    GMTrace.i(18716527951872L, 139449);
    paramParcel = paramParcel.readParcelable(getClass().getClassLoader());
    GMTrace.o(18716527951872L, 139449);
    return paramParcel;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */