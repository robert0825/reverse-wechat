package com.tencent.mm.modelfriend;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URLEncoder;
import java.util.List;
import org.apache.http.NameValuePair;

public final class n
{
  public static String G(List<NameValuePair> paramList)
  {
    GMTrace.i(4454417956864L, 33188);
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      NameValuePair localNameValuePair = (NameValuePair)paramList.get(i);
      if (!TextUtils.isEmpty(localNameValuePair.getName()))
      {
        if (i != 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append(URLEncoder.encode(localNameValuePair.getName(), "UTF-8"));
        localStringBuilder.append("=");
        if (!TextUtils.isEmpty(localNameValuePair.getValue())) {
          localStringBuilder.append(URLEncoder.encode(localNameValuePair.getValue(), "UTF-8"));
        }
      }
      i += 1;
    }
    paramList = localStringBuilder.toString();
    GMTrace.o(4454417956864L, 33188);
    return paramList;
  }
  
  public static boolean bd(Context paramContext)
  {
    GMTrace.i(4454552174592L, 33189);
    Intent localIntent1 = new Intent("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
    Intent localIntent2 = new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT");
    if ((paramContext.getPackageManager().resolveActivity(localIntent2, 0) != null) && (paramContext.getPackageManager().resolveActivity(localIntent1, 0) != null))
    {
      if (Build.VERSION.SDK_INT >= 8)
      {
        if (paramContext.getSharedPreferences(ab.bPU(), 0).getBoolean("googleauth", false))
        {
          GMTrace.o(4454552174592L, 33189);
          return false;
        }
        GMTrace.o(4454552174592L, 33189);
        return true;
      }
      GMTrace.o(4454552174592L, 33189);
      return false;
    }
    GMTrace.o(4454552174592L, 33189);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelfriend\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */