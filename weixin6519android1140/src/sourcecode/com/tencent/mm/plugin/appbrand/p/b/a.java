package com.tencent.mm.plugin.appbrand.p.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d.d.a;
import com.tencent.mm.plugin.appbrand.p.e.c;
import com.tencent.mm.plugin.appbrand.p.e.e;
import com.tencent.mm.plugin.appbrand.p.e.f;
import com.tencent.mm.plugin.appbrand.p.e.h;
import com.tencent.mm.plugin.appbrand.p.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  public static int iHP;
  public static int iHQ;
  public static final byte[] iHR;
  protected d.a iHS;
  protected int iHu;
  
  static
  {
    GMTrace.i(10171153645568L, 75781);
    iHP = 1000;
    iHQ = 64;
    iHR = com.tencent.mm.plugin.appbrand.p.f.b.sH("<policy-file-request/>\000");
    GMTrace.o(10171153645568L, 75781);
  }
  
  public a()
  {
    GMTrace.i(10168603508736L, 75762);
    this.iHu = 0;
    this.iHS = null;
    GMTrace.o(10168603508736L, 75762);
  }
  
  public static com.tencent.mm.plugin.appbrand.p.a.b<List> b(f paramf)
  {
    GMTrace.i(10169945686016L, 75772);
    Object localObject1 = new StringBuilder(100);
    if ((paramf instanceof com.tencent.mm.plugin.appbrand.p.e.a))
    {
      ((StringBuilder)localObject1).append("GET ");
      ((StringBuilder)localObject1).append(((com.tencent.mm.plugin.appbrand.p.e.a)paramf).abS());
      ((StringBuilder)localObject1).append(" HTTP/1.1");
    }
    Object localObject2;
    for (;;)
    {
      ((StringBuilder)localObject1).append("\r\n");
      localObject2 = paramf.abU();
      while (((Iterator)localObject2).hasNext())
      {
        String str1 = (String)((Iterator)localObject2).next();
        String str2 = paramf.sF(str1);
        ((StringBuilder)localObject1).append(str1);
        ((StringBuilder)localObject1).append(": ");
        ((StringBuilder)localObject1).append(str2);
        ((StringBuilder)localObject1).append("\r\n");
      }
      if ((paramf instanceof h))
      {
        ((StringBuilder)localObject1).append("HTTP/1.1 101 " + ((h)paramf).abT());
      }
      else
      {
        ((StringBuilder)localObject1).append("GET ");
        ((StringBuilder)localObject1).append(((com.tencent.mm.plugin.appbrand.p.e.a)paramf).abS());
        ((StringBuilder)localObject1).append(" HTTP/1.1");
        w.e("MicroMsg.AppBrandNetWork.Draft", "unknow role");
      }
    }
    ((StringBuilder)localObject1).append("\r\n");
    localObject1 = com.tencent.mm.plugin.appbrand.p.f.b.sI(((StringBuilder)localObject1).toString());
    paramf = paramf.abV();
    if (paramf == null) {}
    for (int i = 0;; i = paramf.length)
    {
      localObject2 = ByteBuffer.allocate(i + localObject1.length);
      ((ByteBuffer)localObject2).put((byte[])localObject1);
      if (paramf != null) {
        ((ByteBuffer)localObject2).put(paramf);
      }
      ((ByteBuffer)localObject2).flip();
      paramf = Collections.singletonList(localObject2);
      GMTrace.o(10169945686016L, 75772);
      return paramf;
    }
  }
  
  private static String h(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10168737726464L, 75763);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramByteBuffer.remaining());
    byte b;
    for (int i = 48;; i = b) {
      if (paramByteBuffer.hasRemaining())
      {
        b = paramByteBuffer.get();
        localByteBuffer.put(b);
        if ((i == 13) && (b == 10))
        {
          localByteBuffer.limit(localByteBuffer.position() - 2);
          localByteBuffer.position(0);
        }
      }
      else
      {
        for (paramByteBuffer = localByteBuffer; paramByteBuffer == null; paramByteBuffer = null)
        {
          GMTrace.o(10168737726464L, 75763);
          return null;
          paramByteBuffer.position(paramByteBuffer.position() - localByteBuffer.position());
        }
        paramByteBuffer = com.tencent.mm.plugin.appbrand.p.f.b.q(paramByteBuffer.array(), paramByteBuffer.limit());
        GMTrace.o(10168737726464L, 75763);
        return paramByteBuffer;
      }
    }
  }
  
  public static int jO(int paramInt)
  {
    GMTrace.i(10170885210112L, 75779);
    if (paramInt < 0) {
      throw new com.tencent.mm.plugin.appbrand.p.c.b("Negative count");
    }
    GMTrace.o(10170885210112L, 75779);
    return paramInt;
  }
  
  public abstract List<com.tencent.mm.plugin.appbrand.p.d.d> Q(String paramString, boolean paramBoolean);
  
  public abstract b a(com.tencent.mm.plugin.appbrand.p.e.a parama);
  
  public abstract b a(com.tencent.mm.plugin.appbrand.p.e.a parama, h paramh);
  
  public abstract com.tencent.mm.plugin.appbrand.p.e.b a(com.tencent.mm.plugin.appbrand.p.e.b paramb);
  
  public abstract c a(com.tencent.mm.plugin.appbrand.p.e.a parama, i parami);
  
  public abstract List<com.tencent.mm.plugin.appbrand.p.d.d> a(ByteBuffer paramByteBuffer, boolean paramBoolean);
  
  public abstract int abL();
  
  public abstract a abM();
  
  public abstract ByteBuffer d(com.tencent.mm.plugin.appbrand.p.d.d paramd);
  
  public abstract List<com.tencent.mm.plugin.appbrand.p.d.d> i(ByteBuffer paramByteBuffer);
  
  public final f j(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10170750992384L, 75778);
    int i = this.iHu;
    Object localObject1 = h(paramByteBuffer);
    if (localObject1 == null) {
      throw new com.tencent.mm.plugin.appbrand.p.c.a(paramByteBuffer.capacity() + 128);
    }
    Object localObject2 = ((String)localObject1).split(" ", 3);
    if (localObject2.length != 3) {
      throw new com.tencent.mm.plugin.appbrand.p.c.d();
    }
    if (i == com.tencent.mm.plugin.appbrand.p.a.b.iHg)
    {
      localObject1 = new e();
      i locali = (i)localObject1;
      locali.a(Short.parseShort(localObject2[1]));
      locali.sE(localObject2[2]);
    }
    for (;;)
    {
      localObject2 = h(paramByteBuffer);
      if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
        break;
      }
      localObject2 = ((String)localObject2).split(":", 2);
      if (localObject2.length != 2)
      {
        throw new com.tencent.mm.plugin.appbrand.p.c.d("not an http header");
        localObject1 = new com.tencent.mm.plugin.appbrand.p.e.d();
        ((com.tencent.mm.plugin.appbrand.p.e.b)localObject1).sD(localObject2[1]);
      }
      else
      {
        ((c)localObject1).put(localObject2[0], localObject2[1].replaceFirst("^ +", ""));
      }
    }
    if (localObject2 == null) {
      throw new com.tencent.mm.plugin.appbrand.p.c.a();
    }
    GMTrace.o(10170750992384L, 75778);
    return (f)localObject1;
  }
  
  public final void jP(int paramInt)
  {
    GMTrace.i(10171019427840L, 75780);
    this.iHu = paramInt;
    GMTrace.o(10171019427840L, 75780);
  }
  
  public abstract void reset();
  
  public static enum a
  {
    static
    {
      GMTrace.i(10173703782400L, 75800);
      iHT = 1;
      iHU = 2;
      iHV = 3;
      iHW = new int[] { iHT, iHU, iHV };
      GMTrace.o(10173703782400L, 75800);
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(10176388136960L, 75820);
      iHX = new b("MATCHED", 0);
      iHY = new b("NOT_MATCHED", 1);
      iHZ = new b[] { iHX, iHY };
      GMTrace.o(10176388136960L, 75820);
    }
    
    private b()
    {
      GMTrace.i(10176253919232L, 75819);
      GMTrace.o(10176253919232L, 75819);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */