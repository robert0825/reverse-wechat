package com.tencent.mm.plugin.emoji;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.f;
import com.tencent.mm.bt.g;
import com.tencent.mm.pluginsdk.ui.d.h;

public final class a
  implements com.tencent.mm.plugin.emoji.b.a
{
  public a()
  {
    GMTrace.i(18617341050880L, 138710);
    GMTrace.o(18617341050880L, 138710);
  }
  
  public final SpannableString a(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    GMTrace.i(20845489553408L, 155311);
    paramContext = g.bRE().a(paramContext, paramCharSequence, paramFloat);
    GMTrace.o(20845489553408L, 155311);
    return paramContext;
  }
  
  public final SpannableString b(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    GMTrace.i(20845623771136L, 155312);
    paramContext = h.b(paramContext, paramCharSequence, paramFloat);
    GMTrace.o(20845623771136L, 155312);
    return paramContext;
  }
  
  public final String bO(String paramString1, String paramString2)
  {
    GMTrace.i(18912217399296L, 140907);
    g.bRE();
    paramString1 = f.bRB().fb(paramString1, paramString2);
    GMTrace.o(18912217399296L, 140907);
    return paramString1;
  }
  
  public final boolean w(CharSequence paramCharSequence)
  {
    GMTrace.i(20845757988864L, 155313);
    boolean bool = g.bRE().w(paramCharSequence);
    GMTrace.o(20845757988864L, 155313);
    return bool;
  }
  
  public final boolean x(CharSequence paramCharSequence)
  {
    GMTrace.i(20845892206592L, 155314);
    boolean bool = g.bRE().x(paramCharSequence);
    GMTrace.o(20845892206592L, 155314);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */