package com.tencent.recovery.wx.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.recovery.util.Util;
import java.util.UUID;

public class WXUtil
{
  public static final String EX(int paramInt)
  {
    return "KeyConfigHttpCode[" + paramInt + "]";
  }
  
  public static final String EY(int paramInt)
  {
    return "KeyPatchHttpCode[" + paramInt + "]";
  }
  
  public static final String XO(String paramString)
  {
    if (paramString.contains("?")) {
      return paramString + "uuid=" + UUID.randomUUID().toString();
    }
    return paramString + "?uuid=" + UUID.randomUUID().toString();
  }
  
  public static String fT(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0).getString("last_login_uin", "0");
  }
  
  public static String fU(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0);
    Object localObject2 = localSharedPreferences.getString("login_weixin_username", "");
    Object localObject1 = localObject2;
    if (Util.nm((String)localObject2)) {
      localObject1 = localSharedPreferences.getString("login_user_name", "");
    }
    localObject2 = localObject1;
    if (Util.nm((String)localObject1)) {
      localObject2 = String.valueOf(Util.fP(paramContext));
    }
    return (String)localObject2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\wx\util\WXUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */