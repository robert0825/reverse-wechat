package com.tencent.mm.plugin.walletlock.gesture.a;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.bm.b;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.asc;
import com.tencent.mm.protocal.c.asd;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.io.ByteArrayOutputStream;
import java.util.List;

public final class e
{
  public static byte[] KQ(String paramString)
  {
    GMTrace.i(20241375559680L, 150810);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i < paramString.length())
    {
      localByteArrayOutputStream.write(Integer.parseInt(paramString.substring(i, i + 2), 16));
      i += 2;
    }
    paramString = localByteArrayOutputStream.toByteArray();
    GMTrace.o(20241375559680L, 150810);
    return paramString;
  }
  
  public static void a(g paramg)
  {
    GMTrace.i(20241241341952L, 150809);
    if (paramg.rxG == -1L)
    {
      GMTrace.o(20241241341952L, 150809);
      return;
    }
    long l = SystemClock.elapsedRealtime();
    if (l < paramg.rxG)
    {
      paramg.rxG = l;
      paramg.rxH += l;
      w.d("MicroMsg.GestureUtil", String.format("Rebooted, need to add additional %d ms, now elapsed %d ms", new Object[] { Long.valueOf(l), Long.valueOf(paramg.rxH) }));
      GMTrace.o(20241241341952L, 150809);
      return;
    }
    paramg.rxH = (l - paramg.rxG + paramg.rxH);
    paramg.rxG = l;
    GMTrace.o(20241241341952L, 150809);
  }
  
  private static byte[] aN(byte[] paramArrayOfByte)
  {
    GMTrace.i(20240838688768L, 150806);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i < paramArrayOfByte.length - 1)
    {
      localByteArrayOutputStream.write("0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[i])) << 4 | "0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[(i + 1)])));
      i += 2;
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    GMTrace.o(20240838688768L, 150806);
    return paramArrayOfByte;
  }
  
  public static String aO(byte[] paramArrayOfByte)
  {
    GMTrace.i(20241509777408L, 150811);
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() < 2) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(str);
      i += 1;
    }
    paramArrayOfByte = localStringBuilder.toString();
    GMTrace.o(20241509777408L, 150811);
    return paramArrayOfByte;
  }
  
  public static boolean b(asc paramasc)
  {
    GMTrace.i(20240570253312L, 150804);
    if ((paramasc == null) || (paramasc.uIc == null) || (paramasc.uIc.uNP == null))
    {
      GMTrace.o(20240570253312L, 150804);
      return false;
    }
    byte[] arrayOfByte = paramasc.uIc.uNP.tJp;
    if ((arrayOfByte.length == 0) || ((arrayOfByte.length & 0x1) != 0))
    {
      GMTrace.o(20240570253312L, 150804);
      return false;
    }
    long l = new o(paramasc.uin).longValue();
    arrayOfByte = aN(arrayOfByte);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramasc.version);
    if (paramasc.uIa.uNQ) {
      localStringBuilder.append(new String(paramasc.uIa.uNP.tJp));
    }
    localStringBuilder.append(l);
    int i = UtilsJni.doEcdsaVerify(a.rxC, localStringBuilder.toString().getBytes(), arrayOfByte);
    w.d("MicroMsg.GestureUtil", String.format("verifyPatternBuffer, ret:%d", new Object[] { Integer.valueOf(i) }));
    if (i == 1)
    {
      GMTrace.o(20240570253312L, 150804);
      return true;
    }
    GMTrace.o(20240570253312L, 150804);
    return false;
  }
  
  public static boolean b(asd paramasd)
  {
    GMTrace.i(20240704471040L, 150805);
    if ((paramasd == null) || (paramasd.uIe == null) || (paramasd.uIe.uNP == null))
    {
      GMTrace.o(20240704471040L, 150805);
      return false;
    }
    byte[] arrayOfByte = paramasd.uIe.uNP.tJp;
    if ((arrayOfByte.length == 0) || ((arrayOfByte.length & 0x1) != 0))
    {
      GMTrace.o(20240704471040L, 150805);
      return false;
    }
    arrayOfByte = aN(arrayOfByte);
    h.xw();
    long l = new o(com.tencent.mm.kernel.a.ww()).longValue();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramasd.uId);
    localStringBuilder.append(l);
    int i = UtilsJni.doEcdsaVerify(a.rxC, localStringBuilder.toString().getBytes(), arrayOfByte);
    if (((i != 1) && (paramasd.uIf == 1)) || ((i == 1) && (paramasd.uIf == 0))) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GestureUtil", String.format("verifyPatternInfo, verifyRes:%d ret:%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) }));
      GMTrace.o(20240704471040L, 150805);
      return bool;
    }
  }
  
  public static boolean bAG()
  {
    GMTrace.i(20240972906496L, 150807);
    if ((!h.xw().wL()) || (com.tencent.mm.kernel.a.wF()))
    {
      w.w("MicroMsg.GestureUtil", "not login !!");
      GMTrace.o(20240972906496L, 150807);
      return false;
    }
    asd localasd = d.bAN();
    asc localasc = d.bAM();
    int j;
    if (localasd == null) {
      j = 1;
    }
    for (;;)
    {
      int i;
      label64:
      boolean bool1;
      label74:
      label81:
      boolean bool2;
      if (localasc == null)
      {
        i = 1;
        if (j != 0) {
          break label252;
        }
        bool1 = b(localasd);
        if (localasd != null) {
          break label257;
        }
        j = -1;
        w.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock serverInfo:%s status:%d  svrinfoValid:%s", new Object[] { localasd, Integer.valueOf(j), Boolean.valueOf(bool1) });
        if (i != 0) {
          break label266;
        }
        bool2 = b(localasc);
        label122:
        if (localasc != null) {
          break label271;
        }
        i = -1;
        label129:
        w.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock localBuff:%s status:%d  localBuffValid:%s", new Object[] { localasc, Integer.valueOf(i), Boolean.valueOf(bool2) });
        if ((bool1) && (!bool2)) {
          break label429;
        }
      }
      try
      {
        w.i("MicroMsg.GestureUtil", "Both info & buff are valid, choose one to trust.");
        if (localasd.uId > localasc.version)
        {
          w.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, srvInfo wins.", new Object[] { Integer.valueOf(localasd.uId), Integer.valueOf(localasc.version) });
          if (localasd.uIf == 1)
          {
            GMTrace.o(20240972906496L, 150807);
            return true;
            j = 0;
            continue;
            i = 0;
            break label64;
            label252:
            bool1 = false;
            break label74;
            label257:
            j = localasd.uIf;
            break label81;
            label266:
            bool2 = false;
            break label122;
            label271:
            i = localasc.uIb;
            break label129;
          }
          else
          {
            GMTrace.o(20240972906496L, 150807);
            return false;
          }
        }
        else
        {
          if (localasd.uId == localasc.version)
          {
            w.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, draw.", new Object[] { Integer.valueOf(localasd.uId), Integer.valueOf(localasc.version) });
            if (localasd.uIf == 1)
            {
              GMTrace.o(20240972906496L, 150807);
              return true;
            }
            GMTrace.o(20240972906496L, 150807);
            return false;
          }
          w.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, localBuff wins.", new Object[] { Integer.valueOf(localasd.uId), Integer.valueOf(localasc.version) });
          if (localasc.uIb == 1)
          {
            GMTrace.o(20240972906496L, 150807);
            return true;
          }
          GMTrace.o(20240972906496L, 150807);
          return false;
        }
      }
      catch (Exception localException)
      {
        label429:
        w.printErrStackTrace("MicroMsg.GestureUtil", localException, "isUserSetWalletLock throw an exception.", new Object[0]);
        GMTrace.o(20240972906496L, 150807);
      }
    }
    w.i("MicroMsg.GestureUtil", "Info is valid but buf is invalid, we trust info this time.");
    if (localasd.uIf == 1)
    {
      GMTrace.o(20240972906496L, 150807);
      return true;
    }
    GMTrace.o(20240972906496L, 150807);
    return false;
    if (bool2)
    {
      w.i("MicroMsg.GestureUtil", "Info is invalid but buff is valid, we trust buff this time.");
      if (localasc.uIb == 1)
      {
        GMTrace.o(20240972906496L, 150807);
        return true;
      }
      GMTrace.o(20240972906496L, 150807);
      return false;
    }
    w.w("MicroMsg.GestureUtil", "Both buff & info are invalid, do not activate this time and wait for next sync.");
    GMTrace.o(20240972906496L, 150807);
    return false;
    return false;
  }
  
  public static byte[] bP(List<f> paramList)
  {
    GMTrace.i(20241107124224L, 150808);
    if (paramList == null) {
      throw new IllegalArgumentException("pattern is null");
    }
    int j = paramList.size();
    Object localObject = new byte[j];
    int i = 0;
    while (i < j)
    {
      f localf = (f)paramList.get(i);
      int k = localf.rxD;
      localObject[i] = ((byte)(localf.rxE + k * 3 + 1));
      i += 1;
    }
    paramList = new StringBuilder();
    i = 0;
    while (i < j)
    {
      paramList.append(localObject[i]);
      i += 1;
    }
    paramList = paramList.toString();
    localObject = q.zE();
    localObject = com.tencent.mm.a.g.n((com.tencent.mm.a.g.n(paramList.getBytes()) + (String)localObject).getBytes());
    paramList = com.tencent.mm.a.g.n(((String)localObject + paramList).getBytes()).getBytes();
    GMTrace.o(20241107124224L, 150808);
    return paramList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\gesture\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */