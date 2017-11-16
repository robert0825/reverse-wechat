package com.tencent.mm.plugin.hp.d;

import android.content.Context;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aps;
import com.tencent.mm.protocal.c.azd;
import com.tencent.mm.protocal.c.bjd;
import com.tencent.mm.protocal.c.bje;
import com.tencent.mm.protocal.c.bjf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public final int fileSize;
  public final Integer mhE;
  public HashMap<Integer, LinkedList<aps>> mhF;
  public final Integer mhG;
  public final Integer mhH;
  public final String mhI;
  public final String mhJ;
  public final String mhK;
  public String mhL;
  public String mhM;
  public int versionCode;
  
  public b(bjf parambjf)
  {
    GMTrace.i(15370479992832L, 114519);
    this.mhF = new HashMap();
    if (parambjf == null)
    {
      this.mhE = Integer.valueOf(1);
      this.mhI = "";
      this.mhJ = "";
      this.mhG = Integer.valueOf(-1);
      this.mhH = Integer.valueOf(-1);
      this.mhK = "";
      this.fileSize = 0;
      this.mhL = "";
      this.mhM = "";
      this.versionCode = 0;
      GMTrace.o(15370479992832L, 114519);
      return;
    }
    if (parambjf.uUv != null)
    {
      this.mhJ = parambjf.uUv.ugH;
      this.mhI = parambjf.uUv.lPM;
    }
    Object localObject;
    for (this.fileSize = parambjf.uUv.ufa;; this.fileSize = 0)
    {
      this.mhE = Integer.valueOf(parambjf.state);
      this.mhH = Integer.valueOf(parambjf.uUu);
      if ((parambjf.uUs == null) || (parambjf.uUs.isEmpty())) {
        break;
      }
      int j = parambjf.uUs.size();
      int i = 0;
      while (i < j)
      {
        localObject = (bje)parambjf.uUs.get(i);
        if ((((bje)localObject).uUr != null) && (!((bje)localObject).uUr.isEmpty())) {
          this.mhF.put(Integer.valueOf(((bje)localObject).type), ((bje)localObject).uUr);
        }
        i += 1;
      }
      this.mhJ = "";
      this.mhI = "";
    }
    this.mhG = Integer.valueOf(parambjf.uUt);
    this.mhK = parambjf.udq;
    if ((parambjf.uUx != null) && (!parambjf.uUx.isEmpty()))
    {
      parambjf = parambjf.uUx.iterator();
      while (parambjf.hasNext())
      {
        localObject = (bjd)parambjf.next();
        if ((localObject != null) && (!bg.nm(((bjd)localObject).amf))) {
          if (((bjd)localObject).amf.equalsIgnoreCase("newApkMd5")) {
            this.mhL = ((bjd)localObject).value;
          } else if (((bjd)localObject).amf.equalsIgnoreCase("oldApkMd5")) {
            this.mhM = ((bjd)localObject).value;
          } else if (((bjd)localObject).amf.equalsIgnoreCase("versionCode")) {
            this.versionCode = bg.Sy(((bjd)localObject).value);
          }
        }
      }
      GMTrace.o(15370479992832L, 114519);
      return;
    }
    this.mhL = "";
    this.mhM = "";
    this.versionCode = 0;
    GMTrace.o(15370479992832L, 114519);
  }
  
  public static String a(HashMap<Integer, LinkedList<aps>> paramHashMap, int paramInt)
  {
    GMTrace.i(15371016863744L, 114523);
    if ((paramHashMap == null) || (paramHashMap.isEmpty()))
    {
      GMTrace.o(15371016863744L, 114523);
      return "";
    }
    Object localObject1 = "";
    LinkedList localLinkedList = (LinkedList)paramHashMap.get(Integer.valueOf(paramInt));
    Object localObject2 = localObject1;
    if (localLinkedList != null)
    {
      localObject2 = localObject1;
      if (!localLinkedList.isEmpty())
      {
        int i = localLinkedList.size();
        paramInt = 0;
        paramHashMap = (HashMap<Integer, LinkedList<aps>>)localObject1;
        localObject2 = paramHashMap;
        if (paramInt < i)
        {
          localObject1 = (aps)localLinkedList.get(paramInt);
          if (((aps)localObject1).lang.equalsIgnoreCase("default")) {
            paramHashMap = new String(Base64.decode(((aps)localObject1).content, 0));
          }
        }
      }
    }
    for (;;)
    {
      paramInt += 1;
      break;
      if (((aps)localObject1).lang.equalsIgnoreCase(v.bPK()))
      {
        paramHashMap = new String(Base64.decode(((aps)localObject1).content, 0));
        GMTrace.o(15371016863744L, 114523);
        return paramHashMap;
        GMTrace.o(15371016863744L, 114523);
        return (String)localObject2;
      }
    }
  }
  
  public final String aHA()
  {
    GMTrace.i(15371151081472L, 114524);
    if (aHz())
    {
      String str = a(this.mhF, 4);
      GMTrace.o(15371151081472L, 114524);
      return str;
    }
    GMTrace.o(15371151081472L, 114524);
    return "";
  }
  
  public final boolean aHx()
  {
    GMTrace.i(15370614210560L, 114520);
    Context localContext = ab.getContext();
    if (!am.isConnected(localContext))
    {
      GMTrace.o(15370614210560L, 114520);
      return false;
    }
    if (this.mhH.intValue() == 1)
    {
      GMTrace.o(15370614210560L, 114520);
      return true;
    }
    if (this.mhH.intValue() == 3)
    {
      boolean bool = am.isWifi(localContext);
      GMTrace.o(15370614210560L, 114520);
      return bool;
    }
    GMTrace.o(15370614210560L, 114520);
    return true;
  }
  
  public final boolean aHy()
  {
    GMTrace.i(15370748428288L, 114521);
    if ((this.mhE.intValue() == 2) || (this.mhE.intValue() == 4))
    {
      GMTrace.o(15370748428288L, 114521);
      return true;
    }
    GMTrace.o(15370748428288L, 114521);
    return false;
  }
  
  public final boolean aHz()
  {
    GMTrace.i(15370882646016L, 114522);
    if ((this.mhF != null) && (!this.mhF.isEmpty()) && (this.mhF.containsKey(Integer.valueOf(4))))
    {
      GMTrace.o(15370882646016L, 114522);
      return true;
    }
    GMTrace.o(15370882646016L, 114522);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(15371285299200L, 114525);
    String str = "responseState:" + this.mhE + "\ncdnUrl:" + this.mhI + "\nfileMd5:" + this.mhJ + "\npackageType:" + this.mhG + "\nnetworkType:" + this.mhH + "\npatchId:" + this.mhK;
    GMTrace.o(15371285299200L, 114525);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */