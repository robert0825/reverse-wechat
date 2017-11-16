package com.tencent.c.e.a.a;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.c.e.a.b.e;
import com.tencent.c.e.a.b.g;
import com.tencent.c.f.d;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private static final int[] xSb = { 1, 5, 4, 8, 9, 2 };
  private static int xSc = -1;
  
  private static String XP(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static com.tencent.c.e.a.b.a a(int paramInt1, int paramInt2, Context paramContext, int paramInt3, SparseArray<i> paramSparseArray, List<k> paramList)
  {
    com.tencent.c.e.a.b.a locala = new com.tencent.c.e.a.b.a();
    locala.xSx = 0L;
    locala.xSy = "";
    locala.xSA = com.tencent.c.f.i.bx(paramContext, paramContext.getPackageName()).versionCode;
    locala.xQp = "14D6ACDE3C2F2F48";
    locala.ePH = 500000;
    locala.requestType = paramInt3;
    locala.xSB = XP(paramContext.getPackageName());
    ArrayList localArrayList = new ArrayList();
    paramInt3 = 0;
    while (paramInt3 < paramSparseArray.size())
    {
      localArrayList.addAll(((i)paramSparseArray.valueAt(paramInt3)).dh(paramList));
      paramInt3 += 1;
    }
    if ((localArrayList.size() <= 0) || (localArrayList.get(0) == null)) {
      throw new IllegalArgumentException("invalid stateUnits");
    }
    paramSparseArray = new e();
    paramSparseArray.xSJ = ((g)localArrayList.get(0)).xSO;
    paramSparseArray.xSK = localArrayList;
    paramSparseArray.xRK = paramInt1;
    paramSparseArray.action = paramInt2;
    paramList = new ArrayList();
    paramList.add(paramSparseArray);
    locala.xSz = paramList;
    locala.imei = XP(d.fX(paramContext));
    locala.imsi = XP(d.fY(paramContext));
    locala.gxw = XP(Build.BRAND);
    locala.model = XP(Build.MODEL);
    locala.xSC = XP(Build.FINGERPRINT);
    locala.xSD = fV(paramContext);
    locala.sdkVer = Build.VERSION.SDK_INT;
    locala.xNS = 2;
    return locala;
  }
  
  private static int fV(Context paramContext)
  {
    if (xSc == -1)
    {
      paramContext = (SensorManager)paramContext.getSystemService("sensor");
      if (paramContext == null) {
        return xSc;
      }
      int i = 0;
      int j = 1;
      if (i < xSb.length)
      {
        if (paramContext.getDefaultSensor(xSb[i]) == null) {}
        for (int k = 0;; k = 1)
        {
          j |= k << i;
          i += 1;
          break;
        }
      }
      xSc = j;
    }
    return xSc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */