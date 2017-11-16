package com.tencent.mm.plugin.voip.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bgz;
import com.tencent.mm.protocal.c.boe;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.bpy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;

public final class a
{
  public static boolean qNL;
  static BufferedOutputStream qNM;
  
  static
  {
    GMTrace.i(5375017353216L, 40047);
    qNL = false;
    qNM = null;
    GMTrace.o(5375017353216L, 40047);
  }
  
  public static int AS(String paramString)
  {
    GMTrace.i(19595654070272L, 145999);
    try
    {
      byte[] arrayOfByte = InetAddress.getByName(paramString).getAddress();
      if (arrayOfByte != null)
      {
        int j = 0;
        int k;
        for (int i = 0; j < arrayOfByte.length; i = k & 0xFF | i << 8)
        {
          k = arrayOfByte[j];
          j += 1;
        }
        w.d("MicroMsg.Voip", "ipAddressStrToInt, ip: %s, result: %d", new Object[] { paramString, Integer.valueOf(i) });
        GMTrace.o(19595654070272L, 145999);
        return i;
      }
    }
    catch (UnknownHostException paramString)
    {
      w.printErrStackTrace("MicroMsg.Voip", paramString, "", new Object[0]);
      GMTrace.o(19595654070272L, 145999);
    }
    return 0;
  }
  
  private static void JS(String paramString)
  {
    GMTrace.i(5373272522752L, 40034);
    if (qNM == null)
    {
      GMTrace.o(5373272522752L, 40034);
      return;
    }
    try
    {
      qNM.write(paramString.getBytes());
      GMTrace.o(5373272522752L, 40034);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.Voip", paramString, "", new Object[0]);
      GMTrace.o(5373272522752L, 40034);
    }
  }
  
  public static void a(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    GMTrace.i(5374346264576L, 40042);
    byte[] arrayOfByte = paramArrayOfByte;
    if (bg.bq(paramArrayOfByte)) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte = new String(arrayOfByte);
    if (paramInt == 4) {
      w.e(paramString, paramArrayOfByte);
    }
    while (!paramString.equals("MicroMsg.v2Core"))
    {
      JS(paramString + ":" + paramArrayOfByte + " \n");
      GMTrace.o(5374346264576L, 40042);
      return;
      if (paramInt == 2) {
        w.i(paramString, paramArrayOfByte);
      } else {
        w.d(paramString, paramArrayOfByte);
      }
    }
    JS(paramString + ":" + paramArrayOfByte);
    GMTrace.o(5374346264576L, 40042);
  }
  
  public static int[] a(bof parambof)
  {
    GMTrace.i(5374614700032L, 40044);
    w.d("MicroMsg.Voip", "convertSvrAddr: voipAddr.Cnt " + parambof.uYd);
    if (3 >= parambof.uYd) {}
    for (int i = parambof.uYd;; i = 3)
    {
      w.d("MicroMsg.Voip", "convertSvrAddr: addrCnt " + i);
      int[] arrayOfInt = new int[i * 2];
      int j = 0;
      while (j < i)
      {
        arrayOfInt[(j * 2)] = ((boe)parambof.uYe.get(j)).uTR;
        arrayOfInt[(j * 2 + 1)] = ((boe)parambof.uYe.get(j)).uKd;
        w.d("MicroMsg.Voip", "convertSvrAddr: ip " + wx(((boe)parambof.uYe.get(j)).uTR) + " Port: " + ((boe)parambof.uYe.get(j)).uKd);
        j += 1;
      }
      GMTrace.o(5374614700032L, 40044);
      return arrayOfInt;
    }
  }
  
  public static int[] a(bpy parambpy)
  {
    GMTrace.i(5374748917760L, 40045);
    w.d("MicroMsg.Voip", "convertSpeedTestPara: testID= " + parambpy.vab + " SvrListCnt= " + parambpy.vag);
    if (3 >= parambpy.vag) {}
    for (int i = parambpy.vag;; i = 3)
    {
      int[] arrayOfInt = new int[i * 6];
      int j = 0;
      while (j < i)
      {
        arrayOfInt[(j * 6)] = ((bgz)parambpy.vah.get(j)).uSu.uTR;
        arrayOfInt[(j * 6 + 1)] = ((bgz)parambpy.vah.get(j)).uSu.uKd;
        arrayOfInt[(j * 6 + 2)] = ((bgz)parambpy.vah.get(j)).uSt;
        arrayOfInt[(j * 6 + 3)] = ((bgz)parambpy.vah.get(j)).uSP;
        arrayOfInt[(j * 6 + 4)] = ((bgz)parambpy.vah.get(j)).uSQ;
        arrayOfInt[(j * 6 + 5)] = ((bgz)parambpy.vah.get(j)).uSR;
        w.d("MicroMsg.Voip", "convertSpeedTestPara: ip " + wx(((bgz)parambpy.vah.get(j)).uSu.uTR) + " Port: " + ((bgz)parambpy.vah.get(j)).uSu.uKd + " TestCnt= " + ((bgz)parambpy.vah.get(j)).uSt + " TestGap= " + ((bgz)parambpy.vah.get(j)).uSP + " Timeout= " + ((bgz)parambpy.vah.get(j)).uSQ + " PktSize= " + ((bgz)parambpy.vah.get(j)).uSR);
        j += 1;
      }
      GMTrace.o(5374748917760L, 40045);
      return arrayOfInt;
    }
  }
  
  public static int aL(byte[] paramArrayOfByte)
  {
    int i = 0;
    GMTrace.i(5373540958208L, 40036);
    int j = 0;
    while (i < 4)
    {
      j |= (paramArrayOfByte[i] & 0xFF) << i * 8;
      i += 1;
    }
    GMTrace.o(5373540958208L, 40036);
    return j;
  }
  
  public static void bvI()
  {
    GMTrace.i(5373406740480L, 40035);
    if (qNM == null)
    {
      GMTrace.o(5373406740480L, 40035);
      return;
    }
    try
    {
      qNM.flush();
      GMTrace.o(5373406740480L, 40035);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Voip", localException, "", new Object[0]);
      GMTrace.o(5373406740480L, 40035);
    }
  }
  
  public static void dU(String paramString1, String paramString2)
  {
    GMTrace.i(5373809393664L, 40038);
    w.e(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    JS(paramString1 + ":" + paramString2 + " \n");
    GMTrace.o(5373809393664L, 40038);
  }
  
  public static void dV(String paramString1, String paramString2)
  {
    GMTrace.i(5373943611392L, 40039);
    w.i(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    JS(paramString1 + ":" + paramString2 + " \n");
    GMTrace.o(5373943611392L, 40039);
  }
  
  public static void dW(String paramString1, String paramString2)
  {
    GMTrace.i(5374077829120L, 40040);
    w.d(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    JS(paramString1 + ":" + paramString2 + " \n");
    GMTrace.o(5374077829120L, 40040);
  }
  
  public static void dX(String paramString1, String paramString2)
  {
    GMTrace.i(5374212046848L, 40041);
    w.w(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    JS(paramString1 + ":" + paramString2 + " \n");
    GMTrace.o(5374212046848L, 40041);
  }
  
  public static int getNetType(Context paramContext)
  {
    GMTrace.i(5373004087296L, 40032);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        GMTrace.o(5373004087296L, 40032);
        return 2;
      }
      int i = paramContext.getType();
      if (i == 1)
      {
        GMTrace.o(5373004087296L, 40032);
        return 4;
      }
      i = paramContext.getType();
      if (i != 0)
      {
        GMTrace.o(5373004087296L, 40032);
        return 2;
      }
      i = paramContext.getSubtype();
      if (i == 1)
      {
        GMTrace.o(5373004087296L, 40032);
        return 1;
      }
      i = paramContext.getSubtype();
      if (i == 2)
      {
        GMTrace.o(5373004087296L, 40032);
        return 1;
      }
      i = paramContext.getSubtype();
      if (i == 13)
      {
        GMTrace.o(5373004087296L, 40032);
        return 5;
      }
      if ((paramContext.getSubtype() < 3) || (paramContext.getSubtype() >= 13))
      {
        i = paramContext.getSubtype();
        if (i <= 13) {}
      }
      else
      {
        GMTrace.o(5373004087296L, 40032);
        return 3;
      }
      GMTrace.o(5373004087296L, 40032);
      return 1;
    }
    catch (NullPointerException paramContext)
    {
      w.printErrStackTrace("MicroMsg.Voip", paramContext, "", new Object[0]);
      GMTrace.o(5373004087296L, 40032);
    }
    return 2;
  }
  
  public static byte[] wv(int paramInt)
  {
    GMTrace.i(5373675175936L, 40037);
    byte[] arrayOfByte = new byte[4];
    int i = 0;
    while (i < 4)
    {
      arrayOfByte[i] = ((byte)(paramInt >>> i * 8));
      i += 1;
    }
    GMTrace.o(5373675175936L, 40037);
    return arrayOfByte;
  }
  
  public static void ww(int paramInt)
  {
    GMTrace.i(5374480482304L, 40043);
    long l = paramInt;
    try
    {
      Thread.sleep(l);
      GMTrace.o(5374480482304L, 40043);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      w.printErrStackTrace("MicroMsg.Voip", localInterruptedException, "", new Object[0]);
      GMTrace.o(5374480482304L, 40043);
    }
  }
  
  private static String wx(int paramInt)
  {
    GMTrace.i(5374883135488L, 40046);
    try
    {
      String str = InetAddress.getByAddress(new byte[] { (byte)(paramInt >>> 24 & 0xFF), (byte)(paramInt >>> 16 & 0xFF), (byte)(paramInt >>> 8 & 0xFF), (byte)(paramInt & 0xFF) }).getHostAddress();
      GMTrace.o(5374883135488L, 40046);
      return str;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Voip", localException, "", new Object[0]);
      GMTrace.o(5374883135488L, 40046);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */