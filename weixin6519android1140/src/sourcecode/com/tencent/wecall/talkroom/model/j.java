package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.pb.common.c.c;

public final class j
{
  public static boolean Zd(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return paramString.startsWith("client_");
  }
  
  public static int crK()
  {
    try
    {
      int i = a.crb().mqe;
      return i;
    }
    catch (Exception localException)
    {
      c.k("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomId err: ", localException });
    }
    return 0;
  }
  
  public static long crL()
  {
    try
    {
      long l = a.crb().ykD;
      return l;
    }
    catch (Exception localException)
    {
      c.k("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomKey err: ", localException });
    }
    return 0L;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */