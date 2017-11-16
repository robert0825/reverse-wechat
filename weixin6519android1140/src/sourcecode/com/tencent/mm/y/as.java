package com.tencent.mm.y;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.loader.stub.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class as
  extends c
{
  public static as gnb;
  
  static
  {
    GMTrace.i(13477338939392L, 100414);
    gnb = new as(c.ghB);
    GMTrace.o(13477338939392L, 100414);
  }
  
  private as(c paramc)
  {
    super(paramc.ghC);
    GMTrace.i(13476802068480L, 100410);
    GMTrace.o(13476802068480L, 100410);
  }
  
  public final void M(String paramString1, String paramString2)
  {
    GMTrace.i(13476936286208L, 100411);
    w.d("MicroMsg.LastLoginInfo", "save key : %s value : %s", new Object[] { paramString1, paramString2 });
    this.ghC.edit().putString(paramString1, paramString2).commit();
    if (paramString1.equals("login_weixin_username")) {
      ab.getContext().getSharedPreferences("notify_key_pref_no_account", 4).edit().putString("login_weixin_username", paramString2).commit();
    }
    GMTrace.o(13476936286208L, 100411);
  }
  
  public final void c(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(13477070503936L, 100412);
    int i = 0;
    if (paramInt != 0)
    {
      i = 1;
      M("last_login_bind_qq", String.valueOf(paramInt));
    }
    paramInt = i;
    if (!bg.nm(paramString2))
    {
      paramInt = i | 0x2;
      M("last_login_bind_email", String.valueOf(paramString2));
    }
    i = paramInt;
    if (!bg.nm(paramString1))
    {
      i = paramInt | 0x4;
      M("last_login_bind_mobile", paramString1);
    }
    M("last_bind_info", String.valueOf(i));
    GMTrace.o(13477070503936L, 100412);
  }
  
  public final void gM(String paramString)
  {
    GMTrace.i(13477204721664L, 100413);
    w.i("MicroMsg.LastLoginInfo", "Save last avatar: " + paramString);
    String str1 = paramString + ".bm";
    String str2 = e.ghv + "last_avatar";
    String str3 = str2 + ".bm";
    w.i("MicroMsg.LastLoginInfo", "delete old avatar path[%s], ret[%b]", new Object[] { str3, Boolean.valueOf(FileOp.deleteFile(str2) | FileOp.deleteFile(str3)) });
    if (FileOp.o(paramString, str2) <= 0L) {
      FileOp.o(str1, str3);
    }
    M("last_avatar_path", str2);
    GMTrace.o(13477204721664L, 100413);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */