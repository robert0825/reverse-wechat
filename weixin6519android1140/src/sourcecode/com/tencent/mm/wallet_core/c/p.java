package com.tencent.mm.wallet_core.c;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;

public final class p
{
  public static int rqQ;
  public static int rqR;
  public static long xDy;
  
  static
  {
    GMTrace.i(1446732890112L, 10779);
    xDy = 0L;
    rqQ = 1;
    rqR = 2;
    GMTrace.o(1446732890112L, 10779);
  }
  
  private static boolean EM(int paramInt)
  {
    GMTrace.i(1446464454656L, 10777);
    if ((paramInt == 1581) || (paramInt == 1685))
    {
      GMTrace.o(1446464454656L, 10777);
      return true;
    }
    GMTrace.o(1446464454656L, 10777);
    return false;
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, String paramString)
  {
    GMTrace.i(1445927583744L, 10773);
    int i;
    int j;
    if ((eQ(paramInt1, paramInt2)) || (eR(paramInt1, paramInt2)) || (eS(paramInt1, paramInt2)) || (EM(paramInt1)) || (eT(paramInt1, paramInt2)))
    {
      w.i("MicroMsg.WalletReportUtil", "reportIDKeyWalletPay the cmdType is for idkey report cmdType:" + paramInt1 + " cmdid:" + paramInt2);
      i = -1;
      if (paramInt5 != 4) {
        break label417;
      }
      i = 132;
      j = i;
      if (i == -1)
      {
        w.e("MicroMsg.WalletReportUtil", "reportIDKeyWalletPay get ID by scene is -1, the scene is " + paramInt5);
        paramInt5 = -1;
        j = paramInt5;
        if (paramInt1 == 385)
        {
          j = paramInt5;
          if (paramInt2 == 74) {
            j = 134;
          }
        }
        if ((paramInt1 != 385) || (paramInt2 != 75)) {
          break label605;
        }
        j = 139;
      }
      label171:
      paramInt5 = j;
      if (j == -1)
      {
        w.e("MicroMsg.WalletReportUtil", "reportIDKeyWalletPay the cmdType is for idkey report cmdType:" + paramInt1 + " cmdid:" + paramInt2 + " , ID is -1");
        paramInt5 = -1;
        if (!TextUtils.isEmpty(paramString)) {
          break label745;
        }
        paramInt5 = -1;
      }
    }
    Object localObject1;
    for (;;)
    {
      if (paramInt5 != -1) {
        break label781;
      }
      w.e("MicroMsg.WalletReportUtil", "reportIDKeyWalletPay the processName is for idkey report processName:" + paramString + " , ID is -1");
      GMTrace.o(1445927583744L, 10773);
      return;
      if ((paramInt1 == 385) && (paramInt2 == 19)) {}
      for (paramInt1 = 1; paramInt1 != 0; paramInt1 = 0)
      {
        paramString = new ArrayList();
        localObject1 = new IDKey();
        ((IDKey)localObject1).SetID(136);
        ((IDKey)localObject1).SetValue(1L);
        ((IDKey)localObject1).SetKey(0);
        paramString.add(localObject1);
        if ((paramInt3 != 0) || (paramInt4 != 0))
        {
          localObject1 = new IDKey();
          ((IDKey)localObject1).SetID(136);
          ((IDKey)localObject1).SetValue(1L);
          ((IDKey)localObject1).SetKey(1);
          paramString.add(localObject1);
        }
        g.ork.b(paramString, true);
        GMTrace.o(1445927583744L, 10773);
        return;
      }
      GMTrace.o(1445927583744L, 10773);
      return;
      label417:
      if (paramInt5 == 1)
      {
        i = 163;
        break;
      }
      if ((paramInt5 == 2) || (paramInt5 == 36))
      {
        i = 131;
        break;
      }
      if (paramInt5 == 3)
      {
        i = 130;
        break;
      }
      if (paramInt5 == 5)
      {
        i = 153;
        break;
      }
      if (paramInt5 == 100)
      {
        i = 133;
        break;
      }
      if ((paramInt5 == 6) || (paramInt5 == 1001))
      {
        i = 152;
        break;
      }
      if (paramInt5 == 11)
      {
        i = 134;
        break;
      }
      if (paramInt5 == 21)
      {
        i = 139;
        break;
      }
      if ((paramInt5 == 31) || (paramInt5 == 33) || (paramInt5 == 32))
      {
        i = 118;
        break;
      }
      if (paramInt5 == 37)
      {
        i = 117;
        break;
      }
      if (paramInt5 != 39) {
        break;
      }
      i = 298;
      break;
      label605:
      if (EM(paramInt1))
      {
        j = 117;
        break label171;
      }
      if (eT(paramInt1, paramInt2))
      {
        j = 145;
        break label171;
      }
      if (paramInt1 == 397)
      {
        j = 131;
        break label171;
      }
      if (paramInt1 == 398)
      {
        j = 130;
        break label171;
      }
      if (paramInt1 == 422)
      {
        j = 153;
        break label171;
      }
      if (paramInt1 == 556)
      {
        j = 152;
        break label171;
      }
      if (paramInt1 == 498)
      {
        j = 133;
        break label171;
      }
      if ((paramInt1 == 1544) || (paramInt1 == 1582))
      {
        j = 118;
        break label171;
      }
      if (paramInt1 != 1575) {
        break label171;
      }
      j = 117;
      break label171;
      label745:
      if (paramString.equals("BalanceFetchProcess")) {
        paramInt5 = 139;
      } else if (paramString.equals("BalanceSaveProcess")) {
        paramInt5 = 134;
      }
    }
    label781:
    paramString = new IDKey();
    paramString.SetID(paramInt5);
    paramString.SetValue(1L);
    Object localObject2;
    IDKey localIDKey1;
    IDKey localIDKey2;
    if (eQ(paramInt1, paramInt2))
    {
      paramString.SetKey(26);
      localObject1 = new ArrayList();
      localObject2 = new IDKey();
      ((IDKey)localObject2).SetID(paramInt5);
      ((IDKey)localObject2).SetValue(1L);
      localIDKey1 = new IDKey();
      localIDKey1.SetID(paramInt5);
      localIDKey1.SetValue(1L);
      localIDKey2 = new IDKey();
      localIDKey2.SetID(paramInt5);
      localIDKey2.SetValue((int)paramLong);
      if (!eQ(paramInt1, paramInt2)) {
        break label1322;
      }
      ((IDKey)localObject2).SetKey(19);
      if (paramLong > 1000L) {
        break label1261;
      }
      localIDKey1.SetKey(20);
      localIDKey2.SetKey(23);
      label934:
      ((ArrayList)localObject1).add(localObject2);
      ((ArrayList)localObject1).add(localIDKey1);
      ((ArrayList)localObject1).add(localIDKey2);
      g.ork.b((ArrayList)localObject1, true);
      localObject1 = new ArrayList();
      if ((paramInt3 != 0) || (paramInt4 != 0))
      {
        localObject2 = new ArrayList();
        localIDKey1 = new IDKey();
        localIDKey1.SetID(paramInt5);
        localIDKey1.SetValue(1L);
        localIDKey2 = new IDKey();
        localIDKey2.SetID(paramInt5);
        localIDKey2.SetValue(1L);
        if (!eQ(paramInt1, paramInt2)) {
          break label1933;
        }
        localIDKey1.SetKey(27);
        if (paramInt4 >= 0) {
          break label1919;
        }
        localIDKey2.SetKey(28);
      }
    }
    for (;;)
    {
      ((ArrayList)localObject2).add(localIDKey1);
      ((ArrayList)localObject2).add(localIDKey2);
      ((ArrayList)localObject1).addAll((Collection)localObject2);
      ((ArrayList)localObject1).add(paramString);
      g.ork.b((ArrayList)localObject1, true);
      GMTrace.o(1445927583744L, 10773);
      return;
      if (eR(paramInt1, paramInt2))
      {
        paramString.SetKey(45);
        break;
      }
      if (EM(paramInt1))
      {
        if (paramInt1 == 1581)
        {
          paramString.SetKey(64);
          break;
        }
        paramString.SetKey(83);
        break;
      }
      if (eT(paramInt1, paramInt2))
      {
        if (paramInt2 == 0)
        {
          paramString.SetKey(7);
          break;
        }
        paramString.SetKey(26);
        break;
      }
      if (eS(paramInt1, paramInt2))
      {
        paramString.SetKey(7);
        break;
      }
      w.e("MicroMsg.WalletReportUtil", "reportIDKeyWalletPay the cmdType is for idkey report cmdType:" + paramInt1 + " cmdid:" + paramInt2 + " , ID is -1");
      GMTrace.o(1445927583744L, 10773);
      return;
      label1261:
      if ((paramLong > 1000L) && (paramLong <= 3000L))
      {
        localIDKey1.SetKey(21);
        localIDKey2.SetKey(24);
        break label934;
      }
      if (paramLong <= 3000L) {
        break label934;
      }
      localIDKey1.SetKey(22);
      localIDKey2.SetKey(25);
      break label934;
      label1322:
      if (eR(paramInt1, paramInt2))
      {
        ((IDKey)localObject2).SetKey(38);
        if (paramLong <= 1000L)
        {
          localIDKey1.SetKey(39);
          localIDKey2.SetKey(42);
          break label934;
        }
        if ((paramLong > 1000L) && (paramLong <= 3000L))
        {
          localIDKey1.SetKey(40);
          localIDKey2.SetKey(43);
          break label934;
        }
        if (paramLong <= 3000L) {
          break label934;
        }
        localIDKey1.SetKey(41);
        localIDKey2.SetKey(44);
        break label934;
      }
      if (paramInt1 == 1581)
      {
        ((IDKey)localObject2).SetKey(57);
        if (paramLong <= 1000L)
        {
          localIDKey1.SetKey(58);
          localIDKey2.SetKey(61);
          break label934;
        }
        if ((paramLong > 1000L) && (paramLong <= 3000L))
        {
          localIDKey1.SetKey(59);
          localIDKey2.SetKey(62);
          break label934;
        }
        if (paramLong <= 3000L) {
          break label934;
        }
        localIDKey1.SetKey(60);
        localIDKey2.SetKey(63);
        break label934;
      }
      if (paramInt1 == 1685)
      {
        ((IDKey)localObject2).SetKey(76);
        if (paramLong <= 1000L)
        {
          localIDKey1.SetKey(77);
          localIDKey2.SetKey(80);
          break label934;
        }
        if ((paramLong > 1000L) && (paramLong <= 3000L))
        {
          localIDKey1.SetKey(78);
          localIDKey2.SetKey(81);
          break label934;
        }
        if (paramLong <= 3000L) {
          break label934;
        }
        localIDKey1.SetKey(79);
        localIDKey2.SetKey(82);
        break label934;
      }
      if ((paramInt1 == 1558) && (paramInt2 == 0))
      {
        ((IDKey)localObject2).SetKey(0);
        if (paramLong <= 1000L)
        {
          localIDKey1.SetKey(1);
          localIDKey2.SetKey(4);
          break label934;
        }
        if ((paramLong > 1000L) && (paramLong <= 3000L))
        {
          localIDKey1.SetKey(2);
          localIDKey2.SetKey(5);
          break label934;
        }
        if (paramLong <= 3000L) {
          break label934;
        }
        localIDKey1.SetKey(3);
        localIDKey2.SetKey(6);
        break label934;
      }
      if ((paramInt1 == 1558) && (paramInt2 == 1))
      {
        ((IDKey)localObject2).SetKey(19);
        if (paramLong <= 1000L)
        {
          localIDKey1.SetKey(20);
          localIDKey2.SetKey(23);
          break label934;
        }
        if ((paramLong > 1000L) && (paramLong <= 3000L))
        {
          localIDKey1.SetKey(21);
          localIDKey2.SetKey(24);
          break label934;
        }
        if (paramLong <= 3000L) {
          break label934;
        }
        localIDKey1.SetKey(22);
        localIDKey2.SetKey(25);
        break label934;
      }
      ((IDKey)localObject2).SetKey(0);
      if (paramLong <= 1000L)
      {
        localIDKey1.SetKey(1);
        localIDKey2.SetKey(4);
        break label934;
      }
      if ((paramLong > 1000L) && (paramLong <= 3000L))
      {
        localIDKey1.SetKey(2);
        localIDKey2.SetKey(5);
        break label934;
      }
      if (paramLong <= 3000L) {
        break label934;
      }
      localIDKey1.SetKey(3);
      localIDKey2.SetKey(6);
      break label934;
      label1919:
      if (paramInt4 > 0)
      {
        localIDKey2.SetKey(29);
        continue;
        label1933:
        if (eR(paramInt1, paramInt2))
        {
          localIDKey1.SetKey(46);
          if (paramInt4 < 0) {
            localIDKey2.SetKey(47);
          } else if (paramInt4 > 0) {
            localIDKey2.SetKey(48);
          }
        }
        else if (paramInt1 == 1581)
        {
          localIDKey1.SetKey(65);
          if (paramInt4 < 0) {
            localIDKey2.SetKey(66);
          } else if (paramInt4 > 0) {
            localIDKey2.SetKey(67);
          }
        }
        else if (paramInt1 == 1685)
        {
          localIDKey1.SetKey(84);
          if (paramInt4 < 0) {
            localIDKey2.SetKey(85);
          } else if (paramInt4 > 0) {
            localIDKey2.SetKey(86);
          }
        }
        else if ((paramInt1 == 1558) && (paramInt2 == 0))
        {
          localIDKey1.SetKey(8);
          if (paramInt4 < 0) {
            localIDKey2.SetKey(9);
          } else if (paramInt4 > 0) {
            localIDKey2.SetKey(10);
          }
        }
        else if ((paramInt1 == 1558) && (paramInt2 == 1))
        {
          localIDKey1.SetKey(27);
          if (paramInt4 < 0) {
            localIDKey2.SetKey(28);
          } else if (paramInt4 > 0) {
            localIDKey2.SetKey(29);
          }
        }
        else
        {
          localIDKey1.SetKey(8);
          if (paramInt4 < 0) {
            localIDKey2.SetKey(9);
          } else if (paramInt4 > 0) {
            localIDKey2.SetKey(10);
          }
        }
      }
    }
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    GMTrace.i(1445659148288L, 10771);
    if ((paramString3 == null) || (paramString3.length() <= 0))
    {
      GMTrace.o(1445659148288L, 10771);
      return;
    }
    for (;;)
    {
      int i;
      Object localObject3;
      try
      {
        boolean bool = Character.isDigit(paramString3.charAt(0));
        if (!bool) {
          break label446;
        }
        i = 0;
        localObject3 = null;
        localObject1 = paramString3;
        localObject6 = localObject3;
        localObject5 = localObject1;
        paramString3 = (String)localObject3;
        localObject4 = localObject1;
      }
      catch (Exception localException1)
      {
        Object localObject1;
        char c;
        localObject3 = null;
        Object localObject4 = paramString3;
        paramString3 = (String)localObject3;
        w.e("MicroMsg.WalletReportUtil", "", new Object[] { localException1 });
        localObject5 = localObject4;
        localObject6 = paramString3;
        g.ork.i(10756, new Object[] { paramString1, paramString2, localObject5, localObject6, Integer.valueOf(paramInt), paramString4 });
        GMTrace.o(1445659148288L, 10771);
        return;
      }
      try
      {
        if (i >= ((String)localObject1).length()) {
          continue;
        }
        paramString3 = (String)localObject3;
        localObject4 = localObject1;
        c = ((String)localObject1).charAt(i);
        paramString3 = (String)localObject3;
        localObject4 = localObject1;
        localObject5 = localObject3;
        localObject6 = localObject1;
        if (Character.isDigit(c)) {
          break label429;
        }
        paramString3 = (String)localObject3;
        localObject4 = localObject1;
        localObject5 = localObject3;
        localObject6 = localObject1;
        if (".".equalsIgnoreCase(String.valueOf(c))) {
          break label429;
        }
        paramString3 = (String)localObject3;
        localObject4 = localObject1;
        localObject5 = ((String)localObject1).substring(i).trim();
        paramString3 = (String)localObject5;
        localObject4 = localObject1;
        localObject6 = ((String)localObject1).substring(0, i - 1).trim();
      }
      catch (Exception localException2)
      {
        continue;
        i += 1;
        localObject3 = localObject5;
        localObject2 = localObject6;
      }
      Object localObject6 = localObject1;
      Object localObject5 = localObject3;
      paramString3 = (String)localObject1;
      localObject4 = localObject3;
      if (i < ((String)localObject3).length())
      {
        paramString3 = (String)localObject1;
        localObject4 = localObject3;
        c = ((String)localObject3).charAt(i);
        paramString3 = (String)localObject1;
        localObject4 = localObject3;
        if (!Character.isDigit(c))
        {
          localObject6 = localObject1;
          localObject5 = localObject3;
          paramString3 = (String)localObject1;
          localObject4 = localObject3;
          if (!".".equalsIgnoreCase(String.valueOf(c))) {}
        }
        else
        {
          paramString3 = (String)localObject1;
          localObject4 = localObject3;
          localObject1 = ((String)localObject3).substring(0, i - 1).trim();
          paramString3 = (String)localObject1;
          localObject4 = localObject3;
          localObject5 = ((String)localObject3).substring(i).trim();
          localObject6 = localObject1;
        }
        i += 1;
        localObject1 = localObject6;
        localObject3 = localObject5;
      }
      else
      {
        label429:
        continue;
        label446:
        i = 0;
        Object localObject2 = null;
        localObject3 = paramString3;
      }
    }
  }
  
  public static void clQ()
  {
    GMTrace.i(1445390712832L, 10769);
    xDy = System.currentTimeMillis();
    GMTrace.o(1445390712832L, 10769);
  }
  
  public static int clR()
  {
    GMTrace.i(1445524930560L, 10770);
    int i = (int)((System.currentTimeMillis() - xDy) / 1000L);
    GMTrace.o(1445524930560L, 10770);
    return i;
  }
  
  public static void eP(int paramInt1, int paramInt2)
  {
    GMTrace.i(1445793366016L, 10772);
    g.ork.i(12097, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()) });
    GMTrace.o(1445793366016L, 10772);
  }
  
  private static boolean eQ(int paramInt1, int paramInt2)
  {
    GMTrace.i(1446061801472L, 10774);
    if ((paramInt1 == 385) && (paramInt2 == 112))
    {
      GMTrace.o(1446061801472L, 10774);
      return true;
    }
    GMTrace.o(1446061801472L, 10774);
    return false;
  }
  
  private static boolean eR(int paramInt1, int paramInt2)
  {
    GMTrace.i(1446196019200L, 10775);
    if ((paramInt1 == 385) && ((paramInt2 == 0) || (paramInt2 == 1) || (paramInt2 == 16)))
    {
      GMTrace.o(1446196019200L, 10775);
      return true;
    }
    GMTrace.o(1446196019200L, 10775);
    return false;
  }
  
  private static boolean eS(int paramInt1, int paramInt2)
  {
    GMTrace.i(1446330236928L, 10776);
    if ((paramInt1 == 398) || ((paramInt1 == 385) && ((paramInt2 == 74) || (paramInt2 == 75))) || (paramInt1 == 1544) || (paramInt1 == 1582) || (paramInt1 == 498) || (paramInt1 == 397) || (paramInt1 == 1575) || (paramInt1 == 1639) || (paramInt1 == 556) || (paramInt1 == 422))
    {
      GMTrace.o(1446330236928L, 10776);
      return true;
    }
    GMTrace.o(1446330236928L, 10776);
    return false;
  }
  
  private static boolean eT(int paramInt1, int paramInt2)
  {
    GMTrace.i(1446598672384L, 10778);
    if ((paramInt1 == 1558) && ((paramInt2 == 0) || (paramInt2 == 1)))
    {
      GMTrace.o(1446598672384L, 10778);
      return true;
    }
    GMTrace.o(1446598672384L, 10778);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */