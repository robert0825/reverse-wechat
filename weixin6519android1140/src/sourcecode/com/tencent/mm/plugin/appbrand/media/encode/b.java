package com.tencent.mm.plugin.appbrand.media.encode;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class b
  implements c
{
  String irM;
  String irN;
  c.a irO;
  int irP;
  int irQ;
  byte[] irR;
  int irS;
  
  public b()
  {
    GMTrace.i(19847714963456L, 147877);
    this.irM = "audio/mp4a-latm";
    this.irN = "audio/mpeg";
    this.irO = null;
    this.irP = 0;
    this.irQ = 0;
    this.irS = 0;
    GMTrace.o(19847714963456L, 147877);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(19847983398912L, 147879);
    this.irO = parama;
    GMTrace.o(19847983398912L, 147879);
  }
  
  public boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(19848386052096L, 147882);
    GMTrace.o(19848386052096L, 147882);
    return false;
  }
  
  public final void b(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(19848788705280L, 147885);
    if (this.irO == null)
    {
      w.e("MicroMsg.AudioEncoder", "mEncodeListener is null, return");
      GMTrace.o(19848788705280L, 147885);
      return;
    }
    if (this.irQ == 0)
    {
      w.e("MicroMsg.AudioEncoder", "no frameSize, return");
      GMTrace.o(19848788705280L, 147885);
      return;
    }
    if (paramInt > this.irQ) {
      w.w("MicroMsg.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.irQ) });
    }
    w.d("MicroMsg.AudioEncoder", "bufferedSize:%d, buffSize:%d", new Object[] { Integer.valueOf(this.irS), Integer.valueOf(paramInt) });
    int i = this.irS + paramInt;
    if ((i >= this.irQ) && (paramArrayOfByte != null))
    {
      w.d("MicroMsg.AudioEncoder", "flush all, currentBufferedSize:%d", new Object[] { Integer.valueOf(i) });
      if (i > this.irR.length)
      {
        w.i("MicroMsg.AudioEncoder", "expand the end codeBuffer:%d", new Object[] { Integer.valueOf(i) });
        byte[] arrayOfByte = this.irR;
        this.irR = new byte[i];
        System.arraycopy(arrayOfByte, 0, this.irR, 0, this.irS);
      }
      System.arraycopy(paramArrayOfByte, 0, this.irR, this.irS, paramInt);
      this.irO.a(this.irR, i, false);
      this.irS = 0;
    }
    for (;;)
    {
      if (paramBoolean)
      {
        w.i("MicroMsg.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", new Object[] { Integer.valueOf(this.irS) });
        this.irO.a(this.irR, this.irS, paramBoolean);
        this.irS = 0;
      }
      GMTrace.o(19848788705280L, 147885);
      return;
      if (paramArrayOfByte != null)
      {
        System.arraycopy(paramArrayOfByte, 0, this.irR, this.irS, paramInt);
        this.irS = i;
        w.d("MicroMsg.AudioEncoder", "append buff, currentBufferedSize:%d", new Object[] { Integer.valueOf(this.irS) });
      }
    }
  }
  
  public void close()
  {
    GMTrace.i(19848654487552L, 147884);
    GMTrace.o(19848654487552L, 147884);
  }
  
  public boolean e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(19848251834368L, 147881);
    GMTrace.o(19848251834368L, 147881);
    return false;
  }
  
  public void flush()
  {
    GMTrace.i(19848520269824L, 147883);
    GMTrace.o(19848520269824L, 147883);
  }
  
  public final void ja(int paramInt)
  {
    GMTrace.i(19847849181184L, 147878);
    w.i("MicroMsg.AudioEncoder", "mMinBufferSize:%d", new Object[] { Integer.valueOf(this.irP) });
    this.irP = paramInt;
    GMTrace.o(19847849181184L, 147878);
  }
  
  public final void jb(int paramInt)
  {
    GMTrace.i(19848117616640L, 147880);
    w.i("MicroMsg.AudioEncoder", "setEncodeBuffFrameSize frameSize:%d", new Object[] { Integer.valueOf(paramInt) });
    this.irQ = (paramInt * 1024);
    this.irR = new byte[paramInt * 1024];
    GMTrace.o(19848117616640L, 147880);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\encode\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */