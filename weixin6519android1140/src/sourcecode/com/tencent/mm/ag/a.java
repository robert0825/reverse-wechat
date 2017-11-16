package com.tencent.mm.ag;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.Map;

public final class a
{
  private static int gyQ;
  private static int gyR;
  
  static
  {
    GMTrace.i(1370497220608L, 10211);
    gyQ = 0;
    gyR = 0;
    GMTrace.o(1370497220608L, 10211);
  }
  
  public static String a(a parama)
  {
    GMTrace.i(1370228785152L, 10209);
    if (parama == null)
    {
      GMTrace.o(1370228785152L, 10209);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder("");
    localStringBuilder.append(bg.nl(parama.gza));
    localStringBuilder.append("\n-------------------\n");
    localStringBuilder.append(bg.nl(parama.gyY));
    localStringBuilder.append("\n-------------------\n");
    localStringBuilder.append(bg.nl(parama.gyV));
    parama = localStringBuilder.toString();
    GMTrace.o(1370228785152L, 10209);
    return parama;
  }
  
  public static String b(a parama)
  {
    GMTrace.i(1370363002880L, 10210);
    StringBuilder localStringBuilder = new StringBuilder("");
    if (!q.fp(parama.eMI))
    {
      localStringBuilder.append(parama.gyS);
      localStringBuilder.append(": ");
    }
    if (bg.nm(parama.gza)) {
      if (bg.nm(parama.gyY)) {
        parama = parama.gyV;
      }
    }
    for (;;)
    {
      localStringBuilder.append(parama);
      parama = localStringBuilder.toString();
      GMTrace.o(1370363002880L, 10210);
      return parama;
      parama = parama.gyY;
      continue;
      parama = parama.gza;
    }
  }
  
  public static final class a
  {
    private static final f<Integer, a> gli;
    public String eMI;
    public String gyS;
    public String gyT;
    public String gyU;
    public String gyV;
    public String gyW;
    public String gyX;
    public String gyY;
    public String gyZ;
    public String gza;
    public String toUser;
    
    static
    {
      GMTrace.i(1370094567424L, 10208);
      gli = new f(100);
      GMTrace.o(1370094567424L, 10208);
    }
    
    public a()
    {
      GMTrace.i(1369826131968L, 10206);
      GMTrace.o(1369826131968L, 10206);
    }
    
    public static final a jq(String paramString)
    {
      GMTrace.i(1369960349696L, 10207);
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.BrandQALogic", "empty xml to parse");
        GMTrace.o(1369960349696L, 10207);
        return null;
      }
      int i = paramString.indexOf("<qamsg");
      Object localObject = paramString;
      if (i > 0) {
        localObject = paramString.substring(i);
      }
      i = ((String)localObject).hashCode();
      paramString = (a)gli.get(Integer.valueOf(i));
      if (paramString != null)
      {
        GMTrace.o(1369960349696L, 10207);
        return paramString;
      }
      paramString = bh.q((String)localObject, "qamsg");
      if (paramString == null)
      {
        w.e("MicroMsg.BrandQALogic", "parse msg failed");
        GMTrace.o(1369960349696L, 10207);
        return null;
      }
      try
      {
        localObject = new a();
        ((a)localObject).eMI = ((String)paramString.get(".qamsg.$fromUser"));
        ((a)localObject).gyS = ((String)paramString.get(".qamsg.$fromNickname"));
        ((a)localObject).toUser = ((String)paramString.get(".qamsg.$title"));
        ((a)localObject).gyT = ((String)paramString.get(".qamsg.question.$id"));
        ((a)localObject).gyU = ((String)paramString.get(".qamsg.question.$fromUser"));
        ((a)localObject).gyV = ((String)paramString.get(".qamsg.question.content"));
        ((a)localObject).gyW = ((String)paramString.get(".qamsg.answer.$id"));
        ((a)localObject).gyX = ((String)paramString.get(".qamsg.answer.$fromUser"));
        ((a)localObject).gyY = ((String)paramString.get(".qamsg.answer.content"));
        ((a)localObject).gyW = ((String)paramString.get(".qamsg.answer1.$id"));
        ((a)localObject).gyZ = ((String)paramString.get(".qamsg.answer1.$fromUser"));
        ((a)localObject).gza = ((String)paramString.get(".qamsg.answer1.content"));
        gli.m(Integer.valueOf(i), localObject);
        GMTrace.o(1369960349696L, 10207);
        return (a)localObject;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.BrandQALogic", "parse qamessage xml failed");
        w.printErrStackTrace("MicroMsg.BrandQALogic", paramString, "", new Object[0]);
        GMTrace.o(1369960349696L, 10207);
      }
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ag\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */