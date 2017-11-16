package com.tencent.mm.plugin.sns.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;

public final class u
{
  public static boolean GE(String paramString)
  {
    GMTrace.i(8302842871808L, 61861);
    if ((paramString != null) && (paramString.startsWith("sns_table_")))
    {
      GMTrace.o(8302842871808L, 61861);
      return true;
    }
    GMTrace.o(8302842871808L, 61861);
    return false;
  }
  
  public static boolean IL(String paramString)
  {
    GMTrace.i(8302708654080L, 61860);
    if ((paramString != null) && (paramString.startsWith("ad_table_")))
    {
      GMTrace.o(8302708654080L, 61860);
      return true;
    }
    GMTrace.o(8302708654080L, 61860);
    return false;
  }
  
  public static long IM(String paramString)
  {
    GMTrace.i(8302977089536L, 61862);
    if (bg.nm(paramString))
    {
      GMTrace.o(8302977089536L, 61862);
      return 0L;
    }
    if (paramString.startsWith("ad_table_"))
    {
      l = bg.Sz(paramString.substring(9));
      GMTrace.o(8302977089536L, 61862);
      return l;
    }
    if (paramString.startsWith("sns_table_"))
    {
      l = bg.Sz(paramString.substring(10));
      GMTrace.o(8302977089536L, 61862);
      return l;
    }
    long l = bg.Sz(paramString);
    GMTrace.o(8302977089536L, 61862);
    return l;
  }
  
  public static int IN(String paramString)
  {
    GMTrace.i(8303111307264L, 61863);
    if (bg.nm(paramString))
    {
      GMTrace.o(8303111307264L, 61863);
      return 0;
    }
    if (paramString.startsWith("ad_table_"))
    {
      i = bg.Sy(paramString.substring(9));
      GMTrace.o(8303111307264L, 61863);
      return i;
    }
    int i = bg.Sy(paramString.substring(10));
    GMTrace.o(8303111307264L, 61863);
    return i;
  }
  
  public static boolean IO(String paramString)
  {
    GMTrace.i(8303245524992L, 61864);
    if (paramString.startsWith("ad_table_"))
    {
      if (bg.Sz(paramString.substring(9)) != 0L)
      {
        GMTrace.o(8303245524992L, 61864);
        return true;
      }
      GMTrace.o(8303245524992L, 61864);
      return false;
    }
    if (bg.Sz(paramString.substring(10)) != 0L)
    {
      GMTrace.o(8303245524992L, 61864);
      return true;
    }
    GMTrace.o(8303245524992L, 61864);
    return false;
  }
  
  public static boolean IP(String paramString)
  {
    GMTrace.i(8303379742720L, 61865);
    if (!IO(paramString))
    {
      GMTrace.o(8303379742720L, 61865);
      return true;
    }
    GMTrace.o(8303379742720L, 61865);
    return false;
  }
  
  public static String W(String paramString, long paramLong)
  {
    GMTrace.i(8302440218624L, 61858);
    paramString = paramString + paramLong;
    GMTrace.o(8302440218624L, 61858);
    return paramString;
  }
  
  public static String X(String paramString, long paramLong)
  {
    GMTrace.i(8302574436352L, 61859);
    paramString = paramString + paramLong;
    GMTrace.o(8302574436352L, 61859);
    return paramString;
  }
  
  public static int Y(String paramString1, String paramString2, String paramString3)
  {
    int k = 0;
    GMTrace.i(20838241796096L, 155257);
    paramString1 = Z(paramString1, paramString2, paramString3);
    int j = k;
    int i;
    if (!bg.nm(paramString1))
    {
      paramString1 = paramString1.split("&");
      i = 0;
    }
    for (;;)
    {
      j = k;
      if (i < paramString1.length)
      {
        if ((paramString1[i] != null) && (paramString1[i].contains("voteResultIndex="))) {
          j = Integer.valueOf(paramString1[i].substring(16)).intValue();
        }
      }
      else
      {
        GMTrace.o(20838241796096L, 155257);
        return j;
      }
      i += 1;
    }
  }
  
  public static String Z(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20838376013824L, 155258);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString1 != null)
    {
      localStringBuilder.append(paramString1);
      if (paramString2 == null) {
        break label90;
      }
      label30:
      localStringBuilder.append(paramString2);
      if (paramString3 == null) {
        break label96;
      }
    }
    for (;;)
    {
      localStringBuilder.append(paramString3);
      if (localStringBuilder.length() <= 0) {
        break label102;
      }
      paramString1 = ab.getContext().getSharedPreferences("SnsAdVote", 0).getString(localStringBuilder.toString(), "");
      GMTrace.o(20838376013824L, 155258);
      return paramString1;
      paramString1 = "";
      break;
      label90:
      paramString2 = "";
      break label30;
      label96:
      paramString3 = "";
    }
    label102:
    GMTrace.o(20838376013824L, 155258);
    return "";
  }
  
  public static int dP(String paramString1, String paramString2)
  {
    GMTrace.i(20838107578368L, 155256);
    h.xw();
    int i = Y(paramString1, paramString2, a.wx());
    GMTrace.o(20838107578368L, 155256);
    return i;
  }
  
  public static void e(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(20838510231552L, 155259);
    if (TextUtils.isEmpty(paramString1))
    {
      GMTrace.o(20838510231552L, 155259);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString1 != null)
    {
      localStringBuilder.append(paramString1);
      if (paramString2 == null) {
        break label89;
      }
      label48:
      localStringBuilder.append(paramString2);
      if (paramString3 == null) {
        break label95;
      }
    }
    for (;;)
    {
      localStringBuilder.append(paramString3);
      if (localStringBuilder.length() > 0) {
        break label101;
      }
      GMTrace.o(20838510231552L, 155259);
      return;
      paramString1 = "";
      break;
      label89:
      paramString2 = "";
      break label48;
      label95:
      paramString3 = "";
    }
    label101:
    paramString1 = ab.getContext().getSharedPreferences("SnsAdVote", 0).edit();
    paramString1.putString(localStringBuilder.toString(), "voteResultIndex=" + paramInt1 + "&isUpdate=" + paramInt2);
    paramString1.commit();
    GMTrace.o(20838510231552L, 155259);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */