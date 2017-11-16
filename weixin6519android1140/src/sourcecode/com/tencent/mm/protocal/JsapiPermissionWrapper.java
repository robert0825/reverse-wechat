package com.tencent.mm.protocal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JsapiPermissionWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<JsapiPermissionWrapper> CREATOR;
  public static final JsapiPermissionWrapper tJP;
  public static final JsapiPermissionWrapper tJQ;
  public static final JsapiPermissionWrapper tJR;
  public static final JsapiPermissionWrapper tJS;
  public byte[] tJT;
  private int tJU;
  private Set<Integer> tJV;
  private Set<Integer> tJW;
  
  static
  {
    GMTrace.i(4058207223808L, 30236);
    tJP = new JsapiPermissionWrapper(1);
    tJQ = new JsapiPermissionWrapper(2);
    tJR = new JsapiPermissionWrapper(3);
    tJS = new JsapiPermissionWrapper(4);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4058207223808L, 30236);
  }
  
  public JsapiPermissionWrapper()
  {
    GMTrace.i(4055791304704L, 30218);
    this.tJT = null;
    this.tJU = 0;
    this.tJT = null;
    GMTrace.o(4055791304704L, 30218);
  }
  
  public JsapiPermissionWrapper(int paramInt)
  {
    GMTrace.i(4056059740160L, 30220);
    this.tJT = null;
    this.tJU = 0;
    this.tJU = paramInt;
    this.tJT = new byte[0];
    GMTrace.o(4056059740160L, 30220);
  }
  
  public JsapiPermissionWrapper(Parcel paramParcel)
  {
    GMTrace.i(4056999264256L, 30227);
    this.tJT = null;
    this.tJU = 0;
    this.tJT = paramParcel.createByteArray();
    this.tJU = paramParcel.readInt();
    o(paramParcel.createIntArray());
    p(paramParcel.createIntArray());
    GMTrace.o(4056999264256L, 30227);
  }
  
  public JsapiPermissionWrapper(byte[] paramArrayOfByte)
  {
    GMTrace.i(4055925522432L, 30219);
    this.tJT = null;
    this.tJU = 0;
    if (paramArrayOfByte == null)
    {
      this.tJT = null;
      GMTrace.o(4055925522432L, 30219);
      return;
    }
    this.tJT = paramArrayOfByte;
    GMTrace.o(4055925522432L, 30219);
  }
  
  public static boolean bOi()
  {
    GMTrace.i(4056462393344L, 30223);
    GMTrace.o(4056462393344L, 30223);
    return true;
  }
  
  private int[] bOj()
  {
    GMTrace.i(4057401917440L, 30230);
    if (this.tJV != null)
    {
      int[] arrayOfInt = new int[this.tJV.size()];
      Iterator localIterator = this.tJV.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        if (localInteger == null) {}
        for (int j = 0;; j = localInteger.intValue())
        {
          arrayOfInt[i] = j;
          i += 1;
          break;
        }
      }
      GMTrace.o(4057401917440L, 30230);
      return arrayOfInt;
    }
    GMTrace.o(4057401917440L, 30230);
    return new int[0];
  }
  
  private int[] bOk()
  {
    GMTrace.i(4057670352896L, 30232);
    if (this.tJW != null)
    {
      int[] arrayOfInt = new int[this.tJW.size()];
      Iterator localIterator = this.tJW.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        if (localInteger == null) {}
        for (int j = 0;; j = localInteger.intValue())
        {
          arrayOfInt[i] = j;
          i += 1;
          break;
        }
      }
      GMTrace.o(4057670352896L, 30232);
      return arrayOfInt;
    }
    GMTrace.o(4057670352896L, 30232);
    return new int[0];
  }
  
  public final void a(int paramInt, byte paramByte)
  {
    int i = 0;
    GMTrace.i(17506555133952L, 130434);
    if ((this.tJT == null) || (paramInt < 0) || (paramInt >= this.tJT.length))
    {
      if (this.tJT == null) {}
      for (;;)
      {
        w.e("MicroMsg.JsapiPermissionWrapper", "setPermission pos out of range, %s, %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        GMTrace.o(17506555133952L, 130434);
        return;
        i = this.tJT.length;
      }
    }
    this.tJT[paramInt] = paramByte;
    GMTrace.o(17506555133952L, 130434);
  }
  
  public int describeContents()
  {
    GMTrace.i(4056730828800L, 30225);
    GMTrace.o(4056730828800L, 30225);
    return 0;
  }
  
  public final boolean eS(int paramInt)
  {
    GMTrace.i(4056328175616L, 30222);
    if (zN(paramInt) == 1)
    {
      GMTrace.o(4056328175616L, 30222);
      return true;
    }
    GMTrace.o(4056328175616L, 30222);
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(4057938788352L, 30234);
    if (!(paramObject instanceof JsapiPermissionWrapper))
    {
      GMTrace.o(4057938788352L, 30234);
      return false;
    }
    paramObject = (JsapiPermissionWrapper)paramObject;
    if (this.tJT == ((JsapiPermissionWrapper)paramObject).tJT)
    {
      GMTrace.o(4057938788352L, 30234);
      return true;
    }
    if ((this.tJT == null) || (((JsapiPermissionWrapper)paramObject).tJT == null) || (this.tJT.length != ((JsapiPermissionWrapper)paramObject).tJT.length))
    {
      GMTrace.o(4057938788352L, 30234);
      return false;
    }
    int i = 0;
    while (i < this.tJT.length)
    {
      if (this.tJT[i] != paramObject.tJT[i])
      {
        GMTrace.o(4057938788352L, 30234);
        return false;
      }
      i += 1;
    }
    GMTrace.o(4057938788352L, 30234);
    return true;
  }
  
  public final void fromBundle(Bundle paramBundle)
  {
    GMTrace.i(4057267699712L, 30229);
    this.tJT = paramBundle.getByteArray("jsapi_perm_wrapper_bytes");
    this.tJU = paramBundle.getInt("jsapi_perm_wrapper_hardcodePermission");
    o(paramBundle.getIntArray("jsapi_perm_wrapper_blacklist"));
    p(paramBundle.getIntArray("jsapi_perm_wrapper_whitelist"));
    GMTrace.o(4057267699712L, 30229);
  }
  
  public final void o(int[] paramArrayOfInt)
  {
    GMTrace.i(4057536135168L, 30231);
    if (this.tJV == null) {
      this.tJV = new HashSet();
    }
    while ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
    {
      int i = 0;
      while (i < paramArrayOfInt.length)
      {
        this.tJV.add(Integer.valueOf(paramArrayOfInt[i]));
        i += 1;
      }
      this.tJV.clear();
    }
    GMTrace.o(4057536135168L, 30231);
  }
  
  public final void p(int[] paramArrayOfInt)
  {
    GMTrace.i(4057804570624L, 30233);
    if (this.tJW == null) {
      this.tJW = new HashSet();
    }
    while ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
    {
      int i = 0;
      while (i < paramArrayOfInt.length)
      {
        this.tJW.add(Integer.valueOf(paramArrayOfInt[i]));
        i += 1;
      }
      this.tJW.clear();
    }
    GMTrace.o(4057804570624L, 30233);
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    GMTrace.i(4057133481984L, 30228);
    paramBundle.putByteArray("jsapi_perm_wrapper_bytes", this.tJT);
    paramBundle.putInt("jsapi_perm_wrapper_hardcodePermission", this.tJU);
    paramBundle.putIntArray("jsapi_perm_wrapper_blacklist", bOj());
    paramBundle.putIntArray("jsapi_perm_wrapper_whitelist", bOk());
    GMTrace.o(4057133481984L, 30228);
  }
  
  public String toString()
  {
    GMTrace.i(4056596611072L, 30224);
    if (this.tJT == null)
    {
      GMTrace.o(4056596611072L, 30224);
      return "null";
    }
    long l = System.currentTimeMillis();
    Object localObject = new StringBuilder(180);
    byte[] arrayOfByte = this.tJT;
    int j = arrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      ((StringBuilder)localObject).append(arrayOfByte[i]);
      i += 1;
    }
    localObject = ((StringBuilder)localObject).toString();
    w.d("MicroMsg.JsapiPermissionWrapper", "toString cost %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(4056596611072L, 30224);
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4056865046528L, 30226);
    paramParcel.writeByteArray(this.tJT);
    paramParcel.writeInt(this.tJU);
    paramParcel.writeIntArray(bOj());
    paramParcel.writeIntArray(bOk());
    GMTrace.o(4056865046528L, 30226);
  }
  
  public final int zN(int paramInt)
  {
    GMTrace.i(4056193957888L, 30221);
    if ((this.tJW != null) && (this.tJW.contains(Integer.valueOf(paramInt)))) {}
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(4056193957888L, 30221);
      return 1;
    }
    if ((this.tJV != null) && (this.tJV.contains(Integer.valueOf(paramInt)))) {}
    for (i = 1; i != 0; i = 0)
    {
      GMTrace.o(4056193957888L, 30221);
      return 0;
    }
    if (this.tJU == 1)
    {
      if ((paramInt == 34) || (paramInt == 75))
      {
        w.i("MicroMsg.JsapiPermissionWrapper", "on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(4056193957888L, 30221);
        return 0;
      }
      GMTrace.o(4056193957888L, 30221);
      return 1;
    }
    if (this.tJU == 2)
    {
      if (paramInt == -3)
      {
        GMTrace.o(4056193957888L, 30221);
        return 1;
      }
      GMTrace.o(4056193957888L, 30221);
      return 0;
    }
    if (this.tJU == 3)
    {
      if ((paramInt == 34) || (paramInt == 75) || (paramInt == 23))
      {
        w.i("MicroMsg.JsapiPermissionWrapper", "on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(4056193957888L, 30221);
        return 0;
      }
      GMTrace.o(4056193957888L, 30221);
      return 1;
    }
    if (this.tJU == 4)
    {
      if ((paramInt == 34) || (paramInt == 75))
      {
        w.i("MicroMsg.JsapiPermissionWrapper", "hy: on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(4056193957888L, 30221);
        return 0;
      }
      GMTrace.o(4056193957888L, 30221);
      return 1;
    }
    if ((paramInt == -2) || (paramInt == -3))
    {
      GMTrace.o(4056193957888L, 30221);
      return 1;
    }
    if ((this.tJT == null) || (paramInt < 0) || (paramInt >= this.tJT.length))
    {
      GMTrace.o(4056193957888L, 30221);
      return 0;
    }
    paramInt = this.tJT[paramInt];
    GMTrace.o(4056193957888L, 30221);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\JsapiPermissionWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */