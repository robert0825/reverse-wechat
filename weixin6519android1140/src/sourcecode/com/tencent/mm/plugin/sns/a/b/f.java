package com.tencent.mm.plugin.sns.a.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class f
{
  private static String GH(String paramString)
  {
    GMTrace.i(8168759361536L, 60862);
    if (bg.nm(paramString))
    {
      GMTrace.o(8168759361536L, 60862);
      return "";
    }
    paramString = Base64.decode(paramString, 0);
    bhf localbhf = new bhf();
    try
    {
      localbhf.aD(paramString);
      paramString = o.a(localbhf.uTb);
      GMTrace.o(8168759361536L, 60862);
      return paramString;
    }
    catch (IOException paramString)
    {
      w.e("SnsAdExtUtil", "", new Object[] { paramString });
      GMTrace.o(8168759361536L, 60862);
    }
    return "";
  }
  
  public static String a(long paramLong, Object... paramVarArgs)
  {
    GMTrace.i(8168490926080L, 60860);
    ae.biX();
    paramVarArgs = new StringBuilder(i.l(paramVarArgs));
    a(paramLong, paramVarArgs);
    paramVarArgs = paramVarArgs.toString();
    GMTrace.o(8168490926080L, 60860);
    return paramVarArgs;
  }
  
  public static String a(biz parambiz)
  {
    GMTrace.i(20052933869568L, 149406);
    if (parambiz != null)
    {
      parambiz = GH(parambiz.pTh);
      GMTrace.o(20052933869568L, 149406);
      return parambiz;
    }
    w.v("SnsAdExtUtil", "getSnsStatExt timeLineObject null");
    GMTrace.o(20052933869568L, 149406);
    return null;
  }
  
  public static void a(long paramLong, StringBuilder paramStringBuilder)
  {
    GMTrace.i(8168625143808L, 60861);
    Object localObject = ae.bjg().dN(paramLong);
    if (localObject != null)
    {
      localObject = ((e)localObject).blD();
      if (localObject != null)
      {
        localObject = o.lG(((biz)localObject).pTh);
        StringBuilder localStringBuilder = paramStringBuilder.append(",");
        if (localObject == null) {}
        for (int i = -1;; i = ((bhg)localObject).cfz)
        {
          localStringBuilder.append(i);
          paramStringBuilder.append(",").append(o.a((bhg)localObject));
          GMTrace.o(8168625143808L, 60861);
          return;
        }
      }
      w.v("SnsAdExtUtil", "l timeLineObject null, snsId %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(8168625143808L, 60861);
      return;
    }
    w.v("SnsAdExtUtil", "l snsInfo null, snsId %d", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(8168625143808L, 60861);
  }
  
  public static void a(String paramString, d paramd)
  {
    GMTrace.i(8168356708352L, 60859);
    Object localObject = ae.bjd().Ir(paramString);
    if (localObject != null)
    {
      localObject = ((m)localObject).blD();
      if (localObject != null)
      {
        o.a(((biz)localObject).pTh, paramd);
        GMTrace.o(8168356708352L, 60859);
        return;
      }
      w.v("SnsAdExtUtil", "timeLineObject null, snsId %s", new Object[] { paramString });
      GMTrace.o(8168356708352L, 60859);
      return;
    }
    w.v("SnsAdExtUtil", "snsInfo null, snsId %s", new Object[] { paramString });
    GMTrace.o(8168356708352L, 60859);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */