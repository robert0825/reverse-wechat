package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import java.util.Map;

public final class be
{
  public static int gow;
  
  static
  {
    GMTrace.i(646661013504L, 4818);
    gow = 0;
    GMTrace.o(646661013504L, 4818);
  }
  
  public static String Bq()
  {
    GMTrace.i(645989924864L, 4813);
    Object localObject = new StringBuilder();
    if (gow != 0)
    {
      ((StringBuilder)localObject).append("<");
      ((StringBuilder)localObject).append("bizflag");
      ((StringBuilder)localObject).append(">");
      ((StringBuilder)localObject).append(gow);
      ((StringBuilder)localObject).append("</");
      ((StringBuilder)localObject).append("bizflag");
      ((StringBuilder)localObject).append(">");
    }
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(645989924864L, 4813);
    return (String)localObject;
  }
  
  public static String Br()
  {
    GMTrace.i(646258360320L, 4815);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(bg.nl(Bq()));
    if (((StringBuilder)localObject).length() > 0)
    {
      ((StringBuilder)localObject).insert(0, "<msgsource>");
      ((StringBuilder)localObject).append("</msgsource>");
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(646258360320L, 4815);
      return (String)localObject;
    }
    GMTrace.o(646258360320L, 4815);
    return null;
  }
  
  public static String Bs()
  {
    GMTrace.i(646392578048L, 4816);
    String str = (String)h.xy().xh().get(70, null);
    if (!bg.nm(str)) {
      h.xy().xh().set(70, "");
    }
    w.d("MicroMsg.MsgSourceHelper", "getMsg ccr[%s]", new Object[] { str });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msgsource>");
    localStringBuilder.append(bg.nl(str));
    if (gow != 0)
    {
      localStringBuilder.append("<");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
      localStringBuilder.append(gow);
      localStringBuilder.append("</");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
    }
    localStringBuilder.append("</msgsource>");
    str = localStringBuilder.toString();
    GMTrace.o(646392578048L, 4816);
    return str;
  }
  
  public static void gW(String paramString)
  {
    GMTrace.i(646526795776L, 4817);
    w.i("MicroMsg.MsgSourceHelper", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", new Object[] { paramString, "" });
    GMTrace.o(646526795776L, 4817);
  }
  
  public static int k(au paramau)
  {
    GMTrace.i(646124142592L, 4814);
    if (paramau == null)
    {
      GMTrace.o(646124142592L, 4814);
      return 0;
    }
    paramau = bh.q(paramau.fwv, "msgsource");
    if (paramau != null)
    {
      paramau = (String)paramau.get(".msgsource.bizflag");
      if (bg.nm(paramau)) {}
    }
    for (int i = bg.getInt(paramau, 0);; i = 0)
    {
      GMTrace.o(646124142592L, 4814);
      return i;
    }
  }
  
  public static void s(String paramString, boolean paramBoolean)
  {
    GMTrace.i(645855707136L, 4812);
    if ("bizflag".equals(paramString))
    {
      if (paramBoolean)
      {
        gow |= 0x1;
        GMTrace.o(645855707136L, 4812);
        return;
      }
      gow &= 0xFFFFFFFE;
    }
    GMTrace.o(645855707136L, 4812);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */