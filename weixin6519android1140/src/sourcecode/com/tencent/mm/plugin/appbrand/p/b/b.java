package com.tencent.mm.plugin.appbrand.p.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d.d.a;
import com.tencent.mm.plugin.appbrand.p.d.e;
import com.tencent.mm.plugin.appbrand.p.e.f;
import com.tencent.mm.plugin.appbrand.p.e.h;
import com.tencent.mm.plugin.appbrand.p.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class b
  extends a
{
  private ByteBuffer iIa;
  private com.tencent.mm.plugin.appbrand.p.d.d iIb;
  private final Random iIc;
  
  public b()
  {
    GMTrace.i(10173838000128L, 75801);
    this.iIb = null;
    this.iIc = new Random();
    GMTrace.o(10173838000128L, 75801);
  }
  
  public static int c(f paramf)
  {
    GMTrace.i(10173972217856L, 75802);
    paramf = paramf.sF("Sec-WebSocket-Version");
    if (paramf.length() > 0) {
      try
      {
        int i = new Integer(paramf.trim()).intValue();
        GMTrace.o(10173972217856L, 75802);
        return i;
      }
      catch (NumberFormatException paramf)
      {
        GMTrace.o(10173972217856L, 75802);
        return -1;
      }
    }
    GMTrace.o(10173972217856L, 75802);
    return -1;
  }
  
  private static byte[] h(long paramLong, int paramInt)
  {
    GMTrace.i(10175180177408L, 75811);
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      arrayOfByte[i] = ((byte)(int)(paramLong >>> paramInt * 8 - 8 - i * 8));
      i += 1;
    }
    GMTrace.o(10175180177408L, 75811);
    return arrayOfByte;
  }
  
  private com.tencent.mm.plugin.appbrand.p.d.d k(ByteBuffer paramByteBuffer)
  {
    int m = 10;
    int n = 0;
    GMTrace.i(10175448612864L, 75813);
    int i1 = paramByteBuffer.remaining();
    if (i1 < 2) {
      throw new a(2);
    }
    int j = paramByteBuffer.get();
    if (j >> 8 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      i = (byte)((j & 0x7F) >> 4);
      if (i == 0) {
        break;
      }
      throw new com.tencent.mm.plugin.appbrand.p.c.c("bad rsv " + i);
    }
    int i = paramByteBuffer.get();
    if ((i & 0xFFFFFF80) != 0) {}
    for (int k = 1;; k = 0)
    {
      i = (byte)(i & 0x7F);
      j = (byte)(j & 0xF);
      switch (j)
      {
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      default: 
        throw new com.tencent.mm.plugin.appbrand.p.c.c("unknow optcode " + (short)j);
      }
    }
    d.a locala = d.a.iIj;
    while ((!bool) && ((locala == d.a.iIm) || (locala == d.a.iIn) || (locala == d.a.iIo)))
    {
      throw new com.tencent.mm.plugin.appbrand.p.c.c("control frames may no be fragmented");
      locala = d.a.iIk;
      continue;
      locala = d.a.iIl;
      continue;
      locala = d.a.iIo;
      continue;
      locala = d.a.iIm;
      continue;
      locala = d.a.iIn;
    }
    Object localObject;
    if ((i < 0) || (i > 125))
    {
      if ((locala == d.a.iIm) || (locala == d.a.iIn) || (locala == d.a.iIo)) {
        throw new com.tencent.mm.plugin.appbrand.p.c.c("more than 125 octets");
      }
      if (i == 126)
      {
        if (i1 < 4) {
          throw new a(4);
        }
        localObject = new byte[3];
        localObject[1] = paramByteBuffer.get();
        localObject[2] = paramByteBuffer.get();
        i = new BigInteger((byte[])localObject).intValue();
        j = 4;
      }
    }
    for (;;)
    {
      if (k != 0) {}
      for (m = 4;; m = 0)
      {
        j = m + j + i;
        if (i1 >= j) {
          break label527;
        }
        throw new a(j);
        if (i1 < 10) {
          throw new a(10);
        }
        localObject = new byte[8];
        j = 0;
        while (j < 8)
        {
          localObject[j] = paramByteBuffer.get();
          j += 1;
        }
        long l = new BigInteger((byte[])localObject).longValue();
        if (l > 2147483647L)
        {
          w.e("MicroMsg.AppBrandNetWork.Draft_10", "Payloadsize is to big...");
          j = m;
          break;
        }
        i = (int)l;
        j = m;
        break;
      }
      label527:
      localObject = ByteBuffer.allocate(jO(i));
      if (k != 0)
      {
        byte[] arrayOfByte = new byte[4];
        paramByteBuffer.get(arrayOfByte);
        j = n;
        while (j < i)
        {
          ((ByteBuffer)localObject).put((byte)(paramByteBuffer.get() ^ arrayOfByte[(j % 4)]));
          j += 1;
        }
      }
      ((ByteBuffer)localObject).put(paramByteBuffer.array(), paramByteBuffer.position(), ((ByteBuffer)localObject).limit());
      paramByteBuffer.position(paramByteBuffer.position() + ((ByteBuffer)localObject).limit());
      if (locala == d.a.iIo) {
        paramByteBuffer = new com.tencent.mm.plugin.appbrand.p.d.b();
      }
      for (;;)
      {
        ((ByteBuffer)localObject).flip();
        paramByteBuffer.l((ByteBuffer)localObject);
        GMTrace.o(10175448612864L, 75813);
        return paramByteBuffer;
        paramByteBuffer = new e();
        paramByteBuffer.cB(bool);
        paramByteBuffer.a(locala);
      }
      j = 2;
    }
  }
  
  private static String sC(String paramString)
  {
    GMTrace.i(10174777524224L, 75808);
    paramString = paramString.trim();
    paramString = paramString + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA1");
      paramString = com.tencent.mm.plugin.appbrand.p.f.a.O(localMessageDigest.digest(paramString.getBytes()));
      GMTrace.o(10174777524224L, 75808);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      w.e("MicroMsg.AppBrandNetWork.Draft_10", "not such algorithm " + paramString.toString());
      GMTrace.o(10174777524224L, 75808);
    }
    return "";
  }
  
  public final List<com.tencent.mm.plugin.appbrand.p.d.d> Q(String paramString, boolean paramBoolean)
  {
    GMTrace.i(10174643306496L, 75807);
    e locale = new e();
    try
    {
      locale.l(ByteBuffer.wrap(com.tencent.mm.plugin.appbrand.p.f.b.sH(paramString)));
      locale.cB(true);
      locale.a(d.a.iIk);
      locale.cC(paramBoolean);
      paramString = Collections.singletonList(locale);
      GMTrace.o(10174643306496L, 75807);
      return paramString;
    }
    catch (com.tencent.mm.plugin.appbrand.p.c.b paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + paramString.toString());
      }
    }
  }
  
  public a.b a(com.tencent.mm.plugin.appbrand.p.e.a parama)
  {
    GMTrace.i(10174240653312L, 75804);
    int i = c(parama);
    if ((i == 7) || (i == 8))
    {
      if ((parama.sF("Upgrade").equalsIgnoreCase("websocket")) && (parama.sF("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade"))) {}
      for (i = 1; i != 0; i = 0)
      {
        parama = a.b.iHX;
        GMTrace.o(10174240653312L, 75804);
        return parama;
      }
      parama = a.b.iHY;
      GMTrace.o(10174240653312L, 75804);
      return parama;
    }
    parama = a.b.iHY;
    GMTrace.o(10174240653312L, 75804);
    return parama;
  }
  
  public final a.b a(com.tencent.mm.plugin.appbrand.p.e.a parama, h paramh)
  {
    int j = 1;
    GMTrace.i(10174106435584L, 75803);
    Object localObject = parama.sF("Sec-WebSocket-Protocol");
    String str = paramh.sF("Sec-WebSocket-Protocol");
    if ((!bg.nm((String)localObject)) && (!bg.nm(str)))
    {
      w.d("MicroMsg.AppBrandNetWork.Draft_10", "respProtocol is %s", new Object[] { str });
      localObject = ((String)localObject).split(", ");
      int k = localObject.length;
      i = 0;
      if (i >= k) {
        break label229;
      }
      if (!str.equals(localObject[i])) {}
    }
    label229:
    for (int i = j;; i = 0)
    {
      if (i == 0)
      {
        parama = a.b.iHY;
        GMTrace.o(10174106435584L, 75803);
        return parama;
        i += 1;
        break;
      }
      if ((!parama.sG("Sec-WebSocket-Key")) || (!paramh.sG("Sec-WebSocket-Accept")))
      {
        parama = a.b.iHY;
        GMTrace.o(10174106435584L, 75803);
        return parama;
      }
      paramh = paramh.sF("Sec-WebSocket-Accept");
      if (sC(parama.sF("Sec-WebSocket-Key")).equals(paramh))
      {
        parama = a.b.iHX;
        GMTrace.o(10174106435584L, 75803);
        return parama;
      }
      parama = a.b.iHY;
      GMTrace.o(10174106435584L, 75803);
      return parama;
    }
  }
  
  public com.tencent.mm.plugin.appbrand.p.e.b a(com.tencent.mm.plugin.appbrand.p.e.b paramb)
  {
    GMTrace.i(10174911741952L, 75809);
    paramb.put("Upgrade", "websocket");
    paramb.put("Connection", "Upgrade");
    paramb.put("Sec-WebSocket-Version", "8");
    byte[] arrayOfByte = new byte[16];
    this.iIc.nextBytes(arrayOfByte);
    paramb.put("Sec-WebSocket-Key", com.tencent.mm.plugin.appbrand.p.f.a.O(arrayOfByte));
    GMTrace.o(10174911741952L, 75809);
    return paramb;
  }
  
  public com.tencent.mm.plugin.appbrand.p.e.c a(com.tencent.mm.plugin.appbrand.p.e.a parama, i parami)
  {
    GMTrace.i(10175045959680L, 75810);
    parami.put("Upgrade", "websocket");
    parami.put("Connection", parama.sF("Connection"));
    parami.sE("Switching Protocols");
    parama = parama.sF("Sec-WebSocket-Key");
    if (parama == null) {
      throw new com.tencent.mm.plugin.appbrand.p.c.d("missing Sec-WebSocket-Key");
    }
    parami.put("Sec-WebSocket-Accept", sC(parama));
    GMTrace.o(10175045959680L, 75810);
    return parami;
  }
  
  public final List<com.tencent.mm.plugin.appbrand.p.d.d> a(ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    GMTrace.i(10174509088768L, 75806);
    e locale = new e();
    try
    {
      locale.l(paramByteBuffer);
      locale.cB(true);
      locale.a(d.a.iIl);
      locale.cC(paramBoolean);
      paramByteBuffer = Collections.singletonList(locale);
      GMTrace.o(10174509088768L, 75806);
      return paramByteBuffer;
    }
    catch (com.tencent.mm.plugin.appbrand.p.c.b paramByteBuffer)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + paramByteBuffer.toString());
      }
    }
  }
  
  public final int abL()
  {
    GMTrace.i(10175851266048L, 75816);
    int i = a.a.iHV;
    GMTrace.o(10175851266048L, 75816);
    return i;
  }
  
  public a abM()
  {
    GMTrace.i(10175717048320L, 75815);
    b localb = new b();
    GMTrace.o(10175717048320L, 75815);
    return localb;
  }
  
  public final ByteBuffer d(com.tencent.mm.plugin.appbrand.p.d.d paramd)
  {
    int k = -128;
    int i1 = 0;
    GMTrace.i(10174374871040L, 75805);
    ByteBuffer localByteBuffer1 = paramd.abO();
    int m;
    int j;
    label49:
    int i;
    label58:
    int n;
    label66:
    ByteBuffer localByteBuffer2;
    d.a locala;
    if (this.iHu == com.tencent.mm.plugin.appbrand.p.a.b.iHg)
    {
      m = 1;
      if (localByteBuffer1.remaining() > 125) {
        break label238;
      }
      j = 1;
      if (j <= 1) {
        break label260;
      }
      i = j + 1;
      if (m == 0) {
        break label265;
      }
      n = 4;
      localByteBuffer2 = ByteBuffer.allocate(n + (i + 1) + localByteBuffer1.remaining());
      locala = paramd.abR();
      if (locala != d.a.iIj) {
        break label271;
      }
      i = 0;
      label101:
      if (!paramd.abP()) {
        break label371;
      }
      n = -128;
      label114:
      localByteBuffer2.put((byte)(i | (byte)n));
      paramd = h(localByteBuffer1.remaining(), j);
      if (j != 1) {
        break label383;
      }
      i = paramd[0];
      if (m == 0) {
        break label377;
      }
      label151:
      localByteBuffer2.put((byte)(i | k));
    }
    for (;;)
    {
      if (m == 0) {
        break label471;
      }
      paramd = ByteBuffer.allocate(4);
      paramd.putInt(this.iIc.nextInt());
      localByteBuffer2.put(paramd.array());
      i = i1;
      while (localByteBuffer1.hasRemaining())
      {
        localByteBuffer2.put((byte)(localByteBuffer1.get() ^ paramd.get(i % 4)));
        i += 1;
      }
      m = 0;
      break;
      label238:
      if (localByteBuffer1.remaining() <= 65535)
      {
        j = 2;
        break label49;
      }
      j = 8;
      break label49;
      label260:
      i = j;
      break label58;
      label265:
      n = 0;
      break label66;
      label271:
      if (locala == d.a.iIk)
      {
        i = 1;
        break label101;
      }
      if (locala == d.a.iIl)
      {
        i = 2;
        break label101;
      }
      if (locala == d.a.iIo)
      {
        i = 8;
        break label101;
      }
      if (locala == d.a.iIm)
      {
        i = 9;
        break label101;
      }
      if (locala == d.a.iIn)
      {
        i = 10;
        break label101;
      }
      w.e("MicroMsg.AppBrandNetWork.Draft_10", "Don't know how to handle force close" + locala.toString());
      i = 8;
      break label101;
      label371:
      n = 0;
      break label114;
      label377:
      k = 0;
      break label151;
      label383:
      if (j == 2)
      {
        if (m != 0) {}
        for (;;)
        {
          localByteBuffer2.put((byte)(k | 0x7E));
          localByteBuffer2.put(paramd);
          break;
          k = 0;
        }
      }
      if (j == 8)
      {
        if (m != 0) {}
        for (;;)
        {
          localByteBuffer2.put((byte)(k | 0x7F));
          localByteBuffer2.put(paramd);
          break;
          k = 0;
        }
      }
      w.e("MicroMsg.AppBrandNetWork.Draft_10", "Size representation not supported/specified");
    }
    label471:
    localByteBuffer2.put(localByteBuffer1);
    localByteBuffer2.flip();
    GMTrace.o(10174374871040L, 75805);
    return localByteBuffer2;
  }
  
  public final List<com.tencent.mm.plugin.appbrand.p.d.d> i(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10175314395136L, 75812);
    for (;;)
    {
      Object localObject = new LinkedList();
      if (this.iIa != null) {}
      try
      {
        paramByteBuffer.mark();
        int i = paramByteBuffer.remaining();
        int j = this.iIa.remaining();
        if (j > i)
        {
          this.iIa.put(paramByteBuffer.array(), paramByteBuffer.position(), i);
          paramByteBuffer.position(i + paramByteBuffer.position());
          localObject = Collections.emptyList();
          GMTrace.o(10175314395136L, 75812);
          return (List<com.tencent.mm.plugin.appbrand.p.d.d>)localObject;
        }
        this.iIa.put(paramByteBuffer.array(), paramByteBuffer.position(), j);
        paramByteBuffer.position(paramByteBuffer.position() + j);
        ((List)localObject).add(k((ByteBuffer)this.iIa.duplicate().position(0)));
        this.iIa = null;
        while (paramByteBuffer.hasRemaining())
        {
          paramByteBuffer.mark();
          try
          {
            ((List)localObject).add(k(paramByteBuffer));
          }
          catch (a locala2)
          {
            paramByteBuffer.reset();
            this.iIa = ByteBuffer.allocate(jO(locala2.iId));
            this.iIa.put(paramByteBuffer);
          }
        }
        GMTrace.o(10175314395136L, 75812);
        return (List<com.tencent.mm.plugin.appbrand.p.d.d>)localObject;
      }
      catch (a locala1)
      {
        this.iIa.limit();
        ByteBuffer localByteBuffer = ByteBuffer.allocate(jO(locala1.iId));
        this.iIa.rewind();
        localByteBuffer.put(this.iIa);
        this.iIa = localByteBuffer;
      }
    }
  }
  
  public final void reset()
  {
    GMTrace.i(10175582830592L, 75814);
    this.iIa = null;
    GMTrace.o(10175582830592L, 75814);
  }
  
  private final class a
    extends Throwable
  {
    int iId;
    
    public a(int paramInt)
    {
      GMTrace.i(10171287863296L, 75782);
      this.iId = paramInt;
      GMTrace.o(10171287863296L, 75782);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */