package com.tencent.mm.plugin.report.service;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mm.plugin.report.b.a;
import com.tencent.mm.protocal.c.ahj;
import com.tencent.mm.protocal.c.app;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class d
{
  private static Map<Long, Long> oqS;
  private static a oqT;
  private static int oqU;
  private static boolean oqV;
  
  static
  {
    GMTrace.i(13123138355200L, 97775);
    oqT = new a();
    oqU = -1;
    oqV = false;
    GMTrace.o(13123138355200L, 97775);
  }
  
  public static void a(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13122333048832L, 97769);
    if (paramBoolean2) {
      try
      {
        SmcLogic.writeImportKvData(paramLong, paramString, paramBoolean1);
        GMTrace.o(13122333048832L, 97769);
        return;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.KVEasyReport", "localReport :%s", new Object[] { bg.f(paramString) });
        GMTrace.o(13122333048832L, 97769);
        return;
      }
    }
    SmcLogic.writeKvData(paramLong, paramString, paramBoolean1);
    GMTrace.o(13122333048832L, 97769);
  }
  
  public static void a(long paramLong, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13122467266560L, 97770);
    if (paramBoolean2) {
      try
      {
        SmcLogic.writeImportKvPbData(paramLong, paramArrayOfByte, paramBoolean1);
        GMTrace.o(13122467266560L, 97770);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        w.e("MicroMsg.KVEasyReport", "localReport :%s", new Object[] { bg.f(paramArrayOfByte) });
        GMTrace.o(13122467266560L, 97770);
        return;
      }
    }
    SmcLogic.writeKvPbData(paramLong, paramArrayOfByte, paramBoolean1);
    GMTrace.o(13122467266560L, 97770);
  }
  
  public static void b(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    GMTrace.i(13122601484288L, 97771);
    long l;
    do
    {
      SmcLogic.reportIDKey(paramLong1, paramLong2, paramLong3, paramBoolean);
      if (!oqV) {
        break;
      }
      if (oqS == null) {
        bbW();
      }
      l = bg.a((Long)oqS.get(Long.valueOf(paramLong1)), 0L);
      paramLong1 = l;
    } while (l > 0L);
    GMTrace.o(13122601484288L, 97771);
  }
  
  public static void bbW()
  {
    try
    {
      GMTrace.i(13123004137472L, 97774);
      if (oqS == null) {
        oqS = new HashMap(20);
      }
      Object localObject1 = a.bbN();
      if ((localObject1 != null) && (((ahj)localObject1).uwM != oqU))
      {
        oqU = ((ahj)localObject1).uwM;
        oqS.clear();
        localObject1 = ((ahj)localObject1).uwN;
        if (localObject1 != null)
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            app localapp = (app)((Iterator)localObject1).next();
            oqS.put(new Long(localapp.uFm), new Long(localapp.uFn));
          }
        }
      }
    }
    finally {}
    tmp145_142[0] = Integer.valueOf(oqU);
    Object[] tmp154_145 = tmp145_142;
    tmp154_145[1] = Integer.valueOf(oqS.size());
    Object[] tmp168_154 = tmp154_145;
    tmp168_154[2] = oqS;
    Object[] tmp174_168 = tmp168_154;
    tmp174_168[3] = bg.bQW();
    w.i("MicroMsg.KVEasyReport", "summerhv reloadHeavyUserIDMap heavyUserIDMap[%d][%d][%s], stack[%s]", tmp174_168);
    GMTrace.o(13123004137472L, 97774);
  }
  
  public static void c(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    GMTrace.i(13122735702016L, 97772);
    if (paramArrayList != null) {
      SmcLogic.reportListIDKey((IDKey[])paramArrayList.toArray(new IDKey[paramArrayList.size()]), paramBoolean);
    }
    GMTrace.o(13122735702016L, 97772);
  }
  
  public static void gW(boolean paramBoolean)
  {
    GMTrace.i(13122869919744L, 97773);
    w.i("MicroMsg.KVEasyReport", "summerhv setHeavyUser [%b %b], stack[%s]", new Object[] { Boolean.valueOf(oqV), Boolean.valueOf(paramBoolean), bg.bQW() });
    oqV = paramBoolean;
    GMTrace.o(13122869919744L, 97773);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */