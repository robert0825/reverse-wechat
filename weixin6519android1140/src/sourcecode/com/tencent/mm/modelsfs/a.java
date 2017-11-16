package com.tencent.mm.modelsfs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.imgenc.MMIMAGEENCJNI;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private static boolean gSY;
  private long gSZ;
  private String gTa;
  private long gTb;
  private long mNativePtr;
  
  static
  {
    GMTrace.i(13839458369536L, 103112);
    gSY = false;
    GMTrace.o(13839458369536L, 103112);
  }
  
  public a(long paramLong)
  {
    GMTrace.i(13838384627712L, 103104);
    this.gSZ = 0L;
    this.mNativePtr = 0L;
    this.gTb = 0L;
    this.gTa = String.valueOf(paramLong);
    init();
    GMTrace.o(13838384627712L, 103104);
  }
  
  public a(String paramString)
  {
    GMTrace.i(13838518845440L, 103105);
    this.gSZ = 0L;
    this.mNativePtr = 0L;
    this.gTb = 0L;
    this.gTa = paramString;
    init();
    GMTrace.o(13838518845440L, 103105);
  }
  
  private void init()
  {
    GMTrace.i(13838653063168L, 103106);
    w.i("MicroMsg.EncEngine", "init  key  enckey " + this.gTa + "  hashcode " + hashCode());
    this.mNativePtr = MMIMAGEENCJNI.open(this.gTa);
    try
    {
      w.i("MicroMsg.EncEngine", "mNativePtr " + this.mNativePtr + " " + hashCode());
      GMTrace.o(13838653063168L, 103106);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.EncEngine", "exception " + localException.getMessage());
      GMTrace.o(13838653063168L, 103106);
    }
  }
  
  public final long KV()
  {
    GMTrace.i(13838921498624L, 103108);
    this.gTb = this.gSZ;
    long l = this.gTb;
    GMTrace.o(13838921498624L, 103108);
    return l;
  }
  
  public final void free()
  {
    GMTrace.i(13839324151808L, 103111);
    w.i("MicroMsg.EncEngine", "free mNativePtr: " + this.mNativePtr + " hashcode " + hashCode());
    MMIMAGEENCJNI.free(this.mNativePtr);
    this.mNativePtr = 0L;
    GMTrace.o(13839324151808L, 103111);
  }
  
  public final int j(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(13839055716352L, 103109);
    if (this.mNativePtr == 0L) {
      w.i("MicroMsg.EncEngine", "transFor " + bg.bQW().toString());
    }
    if (gSY) {
      w.i("MicroMsg.EncEngine", "trans for  " + hashCode() + " " + paramArrayOfByte.length);
    }
    if ((gSY) && (this.gSZ < 64L)) {
      w.d("MicroMsg.EncEngine", "dump before _offset " + this.gSZ + "  length:" + paramInt + " " + bg.bp(paramArrayOfByte) + " hashcode " + hashCode());
    }
    MMIMAGEENCJNI.transFor(this.mNativePtr, paramArrayOfByte, this.gSZ, paramInt);
    if ((gSY) && (this.gSZ < 64L)) {
      w.d("MicroMsg.EncEngine", "dump after _offset " + this.gSZ + "  length:" + paramInt + " " + bg.bp(paramArrayOfByte) + " hashcode " + hashCode());
    }
    this.gSZ += paramInt;
    GMTrace.o(13839055716352L, 103109);
    return paramInt;
  }
  
  public final void reset()
  {
    GMTrace.i(13838787280896L, 103107);
    w.i("MicroMsg.EncEngine", "reset " + bg.bQW());
    free();
    if (this.gTb == 0L)
    {
      init();
      this.gSZ = 0L;
      GMTrace.o(13838787280896L, 103107);
      return;
    }
    init();
    MMIMAGEENCJNI.seek(this.mNativePtr, this.gTb, 1);
    this.gSZ = this.gTb;
    GMTrace.o(13838787280896L, 103107);
  }
  
  public final void seek(long paramLong)
  {
    GMTrace.i(13839189934080L, 103110);
    this.gSZ = paramLong;
    MMIMAGEENCJNI.seek(this.mNativePtr, paramLong, 1);
    GMTrace.o(13839189934080L, 103110);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */