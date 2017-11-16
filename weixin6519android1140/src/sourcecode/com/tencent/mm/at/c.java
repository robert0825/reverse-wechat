package com.tencent.mm.at;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public final class c
{
  private static float[] J(List<float[]> paramList)
  {
    GMTrace.i(4411065630720L, 32865);
    float[] arrayOfFloat;
    int i;
    if (paramList.size() > 4)
    {
      arrayOfFloat = null;
      i = 0;
      if (i < paramList.size())
      {
        if (((float[])paramList.get(i))[2] >= Float.MAX_VALUE) {
          break label154;
        }
        arrayOfFloat = (float[])paramList.get(i);
      }
    }
    label154:
    for (;;)
    {
      i += 1;
      break;
      if (arrayOfFloat[2] <= 0.15D)
      {
        GMTrace.o(4411065630720L, 32865);
        return arrayOfFloat;
      }
      if (arrayOfFloat[1] > 0.5D) {
        arrayOfFloat[1] -= 0.1F;
      }
      arrayOfFloat[2] -= 0.1F;
      GMTrace.o(4411065630720L, 32865);
      return arrayOfFloat;
      paramList = (float[])paramList.get(0);
      paramList[2] = 0.15F;
      GMTrace.o(4411065630720L, 32865);
      return paramList;
    }
  }
  
  public static boolean JU()
  {
    GMTrace.i(15005273554944L, 111798);
    if ((b.JR()) && (!b.JQ()))
    {
      b.sp();
      GMTrace.o(15005273554944L, 111798);
      return true;
    }
    GMTrace.o(15005273554944L, 111798);
    return false;
  }
  
  public static boolean JV()
  {
    GMTrace.i(15005407772672L, 111799);
    if (b.JQ())
    {
      b.so();
      GMTrace.o(15005407772672L, 111799);
      return true;
    }
    GMTrace.o(15005407772672L, 111799);
    return false;
  }
  
  public static boolean JW()
  {
    GMTrace.i(15005541990400L, 111800);
    if (b.JR())
    {
      b.JO();
      GMTrace.o(15005541990400L, 111800);
      return true;
    }
    GMTrace.o(15005541990400L, 111800);
    return false;
  }
  
  public static boolean JX()
  {
    GMTrace.i(4410662977536L, 32862);
    if ((JZ()) || (JY()))
    {
      GMTrace.o(4410662977536L, 32862);
      return true;
    }
    GMTrace.o(4410662977536L, 32862);
    return false;
  }
  
  public static boolean JY()
  {
    GMTrace.i(4410797195264L, 32863);
    int i = g.ut().getInt("ShakeMusicGlobalSwitch", 0);
    w.i("MicroMsg.Music.MusicHelperUtils", "isShakeMusicGlobalUser: %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      GMTrace.o(4410797195264L, 32863);
      return false;
    }
    GMTrace.o(4410797195264L, 32863);
    return true;
  }
  
  public static boolean JZ()
  {
    GMTrace.i(4410931412992L, 32864);
    Object localObject = TimeZone.getDefault();
    TimeZone localTimeZone = TimeZone.getTimeZone("GMT+08:00");
    if (((TimeZone)localObject).getRawOffset() != localTimeZone.getRawOffset())
    {
      GMTrace.o(4410931412992L, 32864);
      return false;
    }
    localObject = (TelephonyManager)ab.getContext().getSystemService("phone");
    if (localObject != null)
    {
      localObject = ((TelephonyManager)localObject).getNetworkCountryIso();
      if ((!bg.nm((String)localObject)) && (!((String)localObject).equalsIgnoreCase("cn")))
      {
        GMTrace.o(4410931412992L, 32864);
        return false;
      }
    }
    GMTrace.o(4410931412992L, 32864);
    return true;
  }
  
  public static boolean kD(String paramString)
  {
    GMTrace.i(4410528759808L, 32861);
    apv localapv = b.JS();
    if ((localapv != null) && (localapv.uFw.equals(paramString)))
    {
      GMTrace.o(4410528759808L, 32861);
      return true;
    }
    GMTrace.o(4410528759808L, 32861);
    return false;
  }
  
  public static int[] o(Bitmap paramBitmap)
  {
    GMTrace.i(4411199848448L, 32866);
    Object localObject = Bitmap.createScaledBitmap(paramBitmap, 4, 4, false);
    paramBitmap = new int[16];
    ((Bitmap)localObject).getPixels(paramBitmap, 0, 4, 0, 0, 4, 4);
    float[][] arrayOfFloat = new float[16][];
    int i = 0;
    while (i < 16)
    {
      localObject = new float[3];
      Color.colorToHSV(paramBitmap[i], (float[])localObject);
      arrayOfFloat[i] = localObject;
      i += 1;
    }
    int[] arrayOfInt = new int[8];
    SparseArray localSparseArray = new SparseArray();
    i = 0;
    if (i < 16)
    {
      j = 1;
      for (;;)
      {
        if (j <= 7)
        {
          if (arrayOfFloat[i][0] < 360.0F * (j / 7.0F))
          {
            arrayOfInt[j] += 1;
            localObject = (List)localSparseArray.get(j);
            paramBitmap = (Bitmap)localObject;
            if (localObject == null) {
              paramBitmap = new ArrayList();
            }
            paramBitmap.add(arrayOfFloat[i]);
            localSparseArray.put(j, paramBitmap);
          }
        }
        else
        {
          i += 1;
          break;
        }
        j += 1;
      }
    }
    int k = -1;
    i = 1;
    int m;
    for (int j = 0; i <= 7; j = m)
    {
      m = j;
      if (arrayOfInt[i] > j)
      {
        m = arrayOfInt[i];
        k = i;
      }
      i += 1;
    }
    paramBitmap = J((List)localSparseArray.get(k, new ArrayList()));
    localObject = new float[3];
    if (paramBitmap[2] <= 0.15D)
    {
      localObject[0] = paramBitmap[0];
      localObject[1] = paramBitmap[1];
      paramBitmap[2] += 0.7F;
    }
    for (;;)
    {
      if (localObject[1] > 0.5F) {
        localObject[1] -= 0.1F;
      }
      i = Color.HSVToColor(paramBitmap);
      j = Color.HSVToColor((float[])localObject);
      GMTrace.o(4411199848448L, 32866);
      return new int[] { i, j };
      localObject[0] = paramBitmap[0];
      localObject[1] = paramBitmap[1];
      if (paramBitmap[2] + 0.5D >= 1.0D) {
        paramBitmap[2] -= 0.5F;
      } else {
        paramBitmap[2] += 0.5F;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\at\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */