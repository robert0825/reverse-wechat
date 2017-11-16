package com.tencent.mm.plugin.appbrand.media.encode;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.media.g;
import com.tencent.mm.sdk.platformtools.w;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class d
  extends b
{
  private int gVQ;
  private byte[] irT;
  private FileOutputStream mFileOutputStream;
  private String mFilePath;
  
  public d()
  {
    GMTrace.i(19850533535744L, 147898);
    this.mFilePath = "";
    this.gVQ = 2;
    GMTrace.o(19850533535744L, 147898);
  }
  
  public final boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(19850801971200L, 147900);
    if (this.irP <= 0)
    {
      w.e("MicroMsg.MP3AudioEncoder", "mMinBufferSize %d is invalid", new Object[] { Integer.valueOf(this.irP) });
      GMTrace.o(19850801971200L, 147900);
      return false;
    }
    if (this.mFileOutputStream == null)
    {
      w.e("MicroMsg.MP3AudioEncoder", "mFileOutputStream is null");
      GMTrace.o(19850801971200L, 147900);
      return false;
    }
    if (this.irT == null)
    {
      i = (int)(7200.0D + this.irP * this.gVQ * 1.25D);
      w.i("MicroMsg.MP3AudioEncoder", "channelCnt:%d, mMinBufferSize:%d, size:%d, ", new Object[] { Integer.valueOf(this.gVQ), Integer.valueOf(this.irP), Integer.valueOf(i) });
      this.irT = new byte[i];
    }
    short[] arrayOfShort = new short[paramInt / 2];
    int i = 0;
    while (i < arrayOfShort.length)
    {
      arrayOfShort[i] = ((short)(paramArrayOfByte[(i * 2)] & 0xFF | (paramArrayOfByte[(i * 2 + 1)] & 0xFF) << 8));
      i += 1;
    }
    i = Mp3EncodeJni.encode(arrayOfShort, arrayOfShort, paramInt / 2, this.irT);
    w.d("MicroMsg.MP3AudioEncoder", "len:%d, shorts.len:%d, encodedSize:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(arrayOfShort.length), Integer.valueOf(i) });
    paramBoolean = false;
    if (i > 0) {
      w.d("MicroMsg.MP3AudioEncoder", "encodeSize:%d, len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    }
    for (;;)
    {
      try
      {
        this.mFileOutputStream.write(this.irT, 0, i);
        b(this.irT, i, false);
        paramBoolean = true;
      }
      catch (IOException paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.MP3AudioEncoder", paramArrayOfByte, "encode write", new Object[0]);
        g.iZ(20);
        continue;
      }
      GMTrace.o(19850801971200L, 147900);
      return paramBoolean;
      w.e("MicroMsg.MP3AudioEncoder", "Mp3EncodeJni encode fail, encodedSize:%d", new Object[] { Integer.valueOf(i) });
    }
  }
  
  public final void close()
  {
    GMTrace.i(19851070406656L, 147902);
    w.i("MicroMsg.MP3AudioEncoder", "close");
    Mp3EncodeJni.close();
    if (this.mFileOutputStream != null) {}
    try
    {
      this.mFileOutputStream.close();
      this.mFileOutputStream = null;
      GMTrace.o(19851070406656L, 147902);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MP3AudioEncoder", localIOException, "close", new Object[0]);
        g.iZ(20);
      }
    }
  }
  
  public final boolean e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    GMTrace.i(19850667753472L, 147899);
    w.i("MicroMsg.MP3AudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mFilePath = paramString;
    this.gVQ = paramInt2;
    paramInt1 = Mp3EncodeJni.init(paramInt1, paramInt2, paramInt1, paramInt3 / 1000, 5);
    w.i("MicroMsg.MP3AudioEncoder", "Mp3EncodeJni.init ret :%d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 == -1)
    {
      g.iZ(17);
      GMTrace.o(19850667753472L, 147899);
      return false;
    }
    w.i("MicroMsg.MP3AudioEncoder", "lame MPEG version:%d", new Object[] { Integer.valueOf(Mp3EncodeJni.getVersion()) });
    try
    {
      this.mFileOutputStream = new FileOutputStream(paramString);
      GMTrace.o(19850667753472L, 147899);
      return bool;
    }
    catch (FileNotFoundException paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MP3AudioEncoder", paramString, "init", new Object[0]);
        g.iZ(18);
        bool = false;
      }
    }
  }
  
  public final void flush()
  {
    GMTrace.i(19850936188928L, 147901);
    w.i("MicroMsg.MP3AudioEncoder", "flush");
    if ((this.mFileOutputStream == null) || (this.irT == null))
    {
      w.e("MicroMsg.MP3AudioEncoder", "flush, mFileOutputStream or mMp3Buffer is null");
      GMTrace.o(19850936188928L, 147901);
      return;
    }
    int i = Mp3EncodeJni.flush(this.irT);
    if (i > 0) {
      try
      {
        this.mFileOutputStream.write(this.irT, 0, i);
        b(this.irT, i, true);
        GMTrace.o(19850936188928L, 147901);
        return;
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.MP3AudioEncoder", localIOException, "flush write", new Object[0]);
        g.iZ(20);
        GMTrace.o(19850936188928L, 147901);
        return;
      }
    }
    w.e("MicroMsg.MP3AudioEncoder", "flush fail, flushResult:%d", new Object[] { Integer.valueOf(i) });
    GMTrace.o(19850936188928L, 147901);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\encode\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */