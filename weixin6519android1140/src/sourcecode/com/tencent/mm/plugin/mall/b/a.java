package com.tencent.mm.plugin.mall.b;

import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.qw;
import com.tencent.mm.sdk.platformtools.bg;
import java.text.SimpleDateFormat;

public final class a
{
  private static SimpleDateFormat jLo;
  private static SimpleDateFormat jLp;
  private static final String mSX;
  
  static
  {
    GMTrace.i(8008100741120L, 59665);
    jLo = null;
    jLp = null;
    mSX = e.ghz + "wallet/mall";
    GMTrace.o(8008100741120L, 59665);
  }
  
  public static void aNs()
  {
    GMTrace.i(8007698087936L, 59662);
    qw localqw = new qw();
    localqw.eVI.eVJ = false;
    com.tencent.mm.sdk.b.a.vgX.m(localqw);
    GMTrace.o(8007698087936L, 59662);
  }
  
  public static void f(ImageView paramImageView, String paramString, int paramInt)
  {
    Object localObject = null;
    GMTrace.i(8007966523392L, 59664);
    if (paramImageView == null)
    {
      GMTrace.o(8007966523392L, 59664);
      return;
    }
    paramImageView.setImageBitmap(null);
    if (!bg.nm(paramString))
    {
      c.a locala = new c.a();
      if (bg.nm(paramString)) {}
      for (;;)
      {
        locala.gKF = ((String)localObject);
        locala.gKC = true;
        locala.gKY = true;
        locala.gKZ = false;
        if (paramInt != 0) {
          locala.gKR = paramInt;
        }
        localObject = locala.Jn();
        n.Jd().a(paramString, paramImageView, (c)localObject);
        GMTrace.o(8007966523392L, 59664);
        return;
        localObject = String.format("%s/%s", new Object[] { mSX, g.n(paramString.getBytes()) });
      }
    }
    if (paramInt != 0) {
      paramImageView.setImageResource(paramInt);
    }
    GMTrace.o(8007966523392L, 59664);
  }
  
  public static void j(ImageView paramImageView, String paramString)
  {
    GMTrace.i(8007832305664L, 59663);
    f(paramImageView, paramString, 0);
    GMTrace.o(8007832305664L, 59663);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */