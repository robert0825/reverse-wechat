package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements com.tencent.mm.ipcinvoker.extension.a
{
  public c()
  {
    GMTrace.i(18685121003520L, 139215);
    GMTrace.o(18685121003520L, 139215);
  }
  
  public final void a(Object paramObject, Parcel paramParcel)
  {
    GMTrace.i(18685389438976L, 139217);
    if (paramObject == null)
    {
      paramParcel.writeString(null);
      GMTrace.o(18685389438976L, 139217);
      return;
    }
    paramObject = (com.tencent.mm.bm.a)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    try
    {
      paramObject = ((com.tencent.mm.bm.a)paramObject).toByteArray();
      paramParcel.writeInt(paramObject.length);
      paramParcel.writeByteArray((byte[])paramObject);
      GMTrace.o(18685389438976L, 139217);
      return;
    }
    catch (Exception paramObject)
    {
      for (;;)
      {
        w.e("MicroMsg.XIPC.MMProtoBufTransfer", "writeToParcel, e = %s", new Object[] { paramObject });
        paramObject = new byte[0];
      }
    }
  }
  
  public final boolean an(Object paramObject)
  {
    GMTrace.i(18685255221248L, 139216);
    boolean bool = paramObject instanceof com.tencent.mm.bm.a;
    GMTrace.o(18685255221248L, 139216);
    return bool;
  }
  
  public final Object d(Parcel paramParcel)
  {
    GMTrace.i(18685523656704L, 139218);
    String str = paramParcel.readString();
    if (TextUtils.isEmpty(str))
    {
      GMTrace.o(18685523656704L, 139218);
      return null;
    }
    byte[] arrayOfByte = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(arrayOfByte);
    try
    {
      paramParcel = (com.tencent.mm.bm.a)Class.forName(str).newInstance();
      paramParcel.aD(arrayOfByte);
      GMTrace.o(18685523656704L, 139218);
      return paramParcel;
    }
    catch (Exception paramParcel)
    {
      for (;;)
      {
        w.e("MicroMsg.XIPC.MMProtoBufTransfer", "readFromParcel, e = %s", new Object[] { paramParcel });
        paramParcel = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\wx_extension\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */