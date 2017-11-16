package com.tencent.mm.ac;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.kernel.a;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.q;

public final class b
{
  public static String S(String paramString1, String paramString2)
  {
    GMTrace.i(390842023936L, 2912);
    paramString1 = paramString1 + "?access_token=" + paramString2;
    GMTrace.o(390842023936L, 2912);
    return paramString1;
  }
  
  private static String W(long paramLong)
  {
    GMTrace.i(391647330304L, 2918);
    String str = new o(paramLong) + "@qqim";
    GMTrace.o(391647330304L, 2918);
    return str;
  }
  
  public static Bitmap X(long paramLong)
  {
    GMTrace.i(392184201216L, 2922);
    Bitmap localBitmap = a(W(paramLong), false, -1);
    GMTrace.o(392184201216L, 2922);
    return localBitmap;
  }
  
  public static Bitmap a(String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(392586854400L, 2925);
    if ((bg.nm(paramString)) || (!com.tencent.mm.kernel.h.xw().wL()))
    {
      GMTrace.o(392586854400L, 2925);
      return null;
    }
    if (!com.tencent.mm.kernel.h.xy().xk())
    {
      paramString = n.Dh().ba(ab.getContext());
      GMTrace.o(392586854400L, 2925);
      return paramString;
    }
    String str = paramString;
    if (x.fw(paramString)) {
      str = x.Tt(paramString);
    }
    paramString = n.Dv().b(str, paramBoolean, paramInt);
    GMTrace.o(392586854400L, 2925);
    return paramString;
  }
  
  public static h a(String paramString, aos paramaos)
  {
    GMTrace.i(392989507584L, 2928);
    h localh = new h();
    localh.eQl = -1;
    localh.username = paramString;
    localh.gsT = paramaos.ubW;
    localh.gsU = paramaos.ubV;
    w.i("MicroMsg.AvatarLogic", "dkhurl contact %s b[%s] s[%s]", new Object[] { localh.getUsername(), localh.Do(), localh.Dp() });
    boolean bool;
    if (paramaos.uEp != 0)
    {
      bool = true;
      localh.bi(bool);
      if ((paramaos.uEk != 3) && (paramaos.uEk != 4)) {
        break label129;
      }
      localh.fiZ = paramaos.uEk;
    }
    for (;;)
    {
      GMTrace.o(392989507584L, 2928);
      return localh;
      bool = false;
      break;
      label129:
      if (paramaos.uEk == 2)
      {
        localh.fiZ = 3;
        if (!q.zE().equals(paramString))
        {
          n.Dh();
          d.u(paramString, false);
          n.Dh();
          d.u(paramString, true);
          n.Dv().hS(paramString);
        }
      }
    }
  }
  
  public static Bitmap c(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(392452636672L, 2924);
    if ((bg.nm(paramString)) || (!com.tencent.mm.kernel.h.xw().wL()))
    {
      GMTrace.o(392452636672L, 2924);
      return null;
    }
    n.Dh();
    w.d("MicroMsg.AvatarStorage", "getHDBitmap user:%s, width:%d, height:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bg.nm(paramString)) {}
    for (Object localObject = null; localObject == null; localObject = com.tencent.mm.sdk.platformtools.d.a(d.t(paramString, true), paramInt1, paramInt2, null, 0, new int[] { 0, 1 }))
    {
      localObject = new e();
      ((e)localObject).a(paramString, new e.b()
      {
        public final int aN(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(381983653888L, 2846);
          this.gsa.Dl();
          w.i("MicroMsg.AvatarLogic", "getHDHeadImage onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          GMTrace.o(381983653888L, 2846);
          return 0;
        }
      });
      paramString = a(paramString, false, paramInt3);
      GMTrace.o(392452636672L, 2924);
      return paramString;
    }
    paramString = (String)localObject;
    if (paramInt3 > 5) {
      paramString = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, false, paramInt3);
    }
    GMTrace.o(392452636672L, 2924);
    return paramString;
  }
  
  public static boolean c(long paramLong, int paramInt)
  {
    GMTrace.i(391915765760L, 2920);
    if (paramInt != 3)
    {
      GMTrace.o(391915765760L, 2920);
      return false;
    }
    boolean bool = hP(W(paramLong));
    GMTrace.o(391915765760L, 2920);
    return bool;
  }
  
  public static Bitmap hJ(String paramString)
  {
    GMTrace.i(390976241664L, 2913);
    paramString = a(paramString + "@google", false, -1);
    GMTrace.o(390976241664L, 2913);
    return paramString;
  }
  
  private static String hK(String paramString)
  {
    GMTrace.i(391110459392L, 2914);
    paramString = "http://graph.facebook.com/" + paramString + "/picture";
    GMTrace.o(391110459392L, 2914);
    return paramString;
  }
  
  public static void hL(String paramString)
  {
    GMTrace.i(391244677120L, 2915);
    if (bg.nm(paramString))
    {
      GMTrace.o(391244677120L, 2915);
      return;
    }
    String str = paramString + "@fb";
    h localh2 = n.Di().ig(str);
    if ((localh2 != null) && (str.equals(localh2.getUsername())) && (3 == localh2.fiZ))
    {
      GMTrace.o(391244677120L, 2915);
      return;
    }
    h localh1 = localh2;
    if (localh2 == null) {
      localh1 = new h();
    }
    localh1.username = str;
    localh1.fiZ = 3;
    localh1.gsU = hK(paramString);
    localh1.gsT = hK(paramString);
    localh1.bi(true);
    localh1.eQl = 31;
    n.Di().a(localh1);
    GMTrace.o(391244677120L, 2915);
  }
  
  public static Bitmap hM(String paramString)
  {
    GMTrace.i(391378894848L, 2916);
    paramString = a(paramString + "@fb", false, -1);
    GMTrace.o(391378894848L, 2916);
    return paramString;
  }
  
  public static long hN(String paramString)
  {
    GMTrace.i(391513112576L, 2917);
    if (!x.Tr(paramString))
    {
      GMTrace.o(391513112576L, 2917);
      return -1L;
    }
    paramString = paramString.split("@");
    try
    {
      long l = bg.getLong(paramString[0], -1L);
      GMTrace.o(391513112576L, 2917);
      return l;
    }
    catch (Exception paramString)
    {
      GMTrace.o(391513112576L, 2917);
    }
    return -1L;
  }
  
  public static long hO(String paramString)
  {
    GMTrace.i(391781548032L, 2919);
    if (!x.Tq(paramString))
    {
      GMTrace.o(391781548032L, 2919);
      return -1L;
    }
    paramString = paramString.split("@");
    try
    {
      long l = bg.getLong(paramString[0], -1L);
      GMTrace.o(391781548032L, 2919);
      return l;
    }
    catch (Exception paramString)
    {
      GMTrace.o(391781548032L, 2919);
    }
    return -1L;
  }
  
  public static boolean hP(String paramString)
  {
    GMTrace.i(392049983488L, 2921);
    if (paramString == null)
    {
      w.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
      GMTrace.o(392049983488L, 2921);
      return false;
    }
    if (!paramString.endsWith("@qqim"))
    {
      w.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
      GMTrace.o(392049983488L, 2921);
      return false;
    }
    h localh = new h();
    localh.username = paramString;
    localh.fiZ = 3;
    localh.eQl = 3;
    boolean bool = n.Di().a(localh);
    GMTrace.o(392049983488L, 2921);
    return bool;
  }
  
  public static String hQ(String paramString)
  {
    GMTrace.i(392721072128L, 2926);
    if ((bg.nm(paramString)) || (!com.tencent.mm.kernel.h.xw().wL()))
    {
      GMTrace.o(392721072128L, 2926);
      return null;
    }
    if (!com.tencent.mm.kernel.h.xy().xk())
    {
      GMTrace.o(392721072128L, 2926);
      return null;
    }
    if (x.fw(paramString))
    {
      n.Dh();
      paramString = d.t(x.Tt(paramString), false);
      GMTrace.o(392721072128L, 2926);
      return paramString;
    }
    n.Dh();
    paramString = d.t(paramString, false);
    GMTrace.o(392721072128L, 2926);
    return paramString;
  }
  
  public static void hR(String paramString)
  {
    GMTrace.i(392855289856L, 2927);
    h localh = n.Di().ig(paramString);
    if (localh == null)
    {
      GMTrace.o(392855289856L, 2927);
      return;
    }
    if (!paramString.equals(localh.getUsername()))
    {
      GMTrace.o(392855289856L, 2927);
      return;
    }
    localh.gsW = 0;
    localh.eQl = 64;
    n.Di().a(localh);
    GMTrace.o(392855289856L, 2927);
  }
  
  public static boolean y(String paramString, int paramInt)
  {
    GMTrace.i(392318418944L, 2923);
    if (bg.nm(paramString))
    {
      GMTrace.o(392318418944L, 2923);
      return false;
    }
    h localh2 = n.Di().ig(paramString);
    if ((localh2 != null) && (paramString.equals(localh2.getUsername())) && (paramInt == localh2.fiZ))
    {
      GMTrace.o(392318418944L, 2923);
      return true;
    }
    h localh1 = localh2;
    if (localh2 == null) {
      localh1 = new h();
    }
    localh1.username = paramString;
    localh1.fiZ = paramInt;
    localh1.eQl = 3;
    boolean bool = n.Di().a(localh1);
    GMTrace.o(392318418944L, 2923);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */