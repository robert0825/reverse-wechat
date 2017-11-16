package com.tencent.mm.plugin.emoji.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;

public final class a
{
  public static boolean asF()
  {
    GMTrace.i(11283818610688L, 84071);
    boolean bool = h.arl().kjz.bUv();
    GMTrace.o(11283818610688L, 84071);
    return bool;
  }
  
  public static final String ati()
  {
    GMTrace.i(11284355481600L, 84075);
    String str = EmojiGroupInfo.vCl;
    GMTrace.o(11284355481600L, 84075);
    return str;
  }
  
  public static boolean b(EmojiGroupInfo paramEmojiGroupInfo)
  {
    GMTrace.i(11284087046144L, 84073);
    if (paramEmojiGroupInfo == null)
    {
      GMTrace.o(11284087046144L, 84073);
      return false;
    }
    boolean bool = wB(paramEmojiGroupInfo.field_productID);
    GMTrace.o(11284087046144L, 84073);
    return bool;
  }
  
  public static boolean d(rh paramrh)
  {
    GMTrace.i(11283952828416L, 84072);
    if (paramrh == null)
    {
      GMTrace.o(11283952828416L, 84072);
      return false;
    }
    boolean bool = wB(paramrh.tRS);
    GMTrace.o(11283952828416L, 84072);
    return bool;
  }
  
  public static boolean wB(String paramString)
  {
    GMTrace.i(11284221263872L, 84074);
    if (paramString == null)
    {
      GMTrace.o(11284221263872L, 84074);
      return false;
    }
    boolean bool = paramString.equals(ati());
    GMTrace.o(11284221263872L, 84074);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */