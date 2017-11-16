package com.tencent.mm.plugin.scanner.util;

import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import d.a;

public final class c
  extends a
{
  public final byte[] eSn;
  public int height;
  public int left;
  final int oAk;
  final int oAl;
  public int top;
  public int width;
  
  public c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect)
  {
    super(paramRect.width(), paramRect.height());
    GMTrace.i(6174149705728L, 46001);
    w.v("MicroMsg.scanner.PlanarYUVLuminanceSource", "init yuvData.len: %d,  dataW: %d, dataH: %d, left: %d, top: %d, width: %d, height: %d ", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramRect.left), Integer.valueOf(paramRect.top), Integer.valueOf(paramRect.width()), Integer.valueOf(paramRect.height()) });
    this.eSn = paramArrayOfByte;
    this.oAk = paramInt1;
    this.oAl = paramInt2;
    if ((paramRect.left < 0) || (paramRect.left >= paramInt1))
    {
      i = 0;
      this.left = i;
      i = j;
      if (paramRect.top >= 0)
      {
        if (paramRect.top < paramInt2) {
          break label278;
        }
        i = j;
      }
      label170:
      this.top = i;
      if (this.left + paramRect.width() <= paramInt1) {
        break label288;
      }
      i = paramInt1 - this.left;
      label198:
      this.width = i;
      if (this.top + paramRect.height() <= paramInt2) {
        break label298;
      }
    }
    label278:
    label288:
    label298:
    for (int i = paramInt2 - this.top;; i = paramRect.height())
    {
      this.height = i;
      if ((this.left + this.width <= paramInt1) && (this.top + this.height <= paramInt2)) {
        break label308;
      }
      throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
      i = paramRect.left;
      break;
      i = paramRect.top;
      break label170;
      i = paramRect.width();
      break label198;
    }
    label308:
    GMTrace.o(6174149705728L, 46001);
  }
  
  public static void bdm()
  {
    GMTrace.i(6174418141184L, 46003);
    m localm = m.bdA();
    if (localm.oBq != null) {
      localm.oBq = null;
    }
    if (localm.oBr != null) {
      localm.oBr = null;
    }
    System.gc();
    GMTrace.o(6174418141184L, 46003);
  }
  
  public final byte[] bdn()
  {
    int i = 0;
    GMTrace.i(6174552358912L, 46004);
    Object localObject;
    if ((this.width == this.oAk) && (this.height == this.oAl))
    {
      localObject = this.eSn;
      GMTrace.o(6174552358912L, 46004);
      return (byte[])localObject;
    }
    int k;
    int j;
    try
    {
      k = this.width * this.height;
      localObject = m.bdA();
      if (((m)localObject).oBq == null) {
        ((m)localObject).oBq = new byte[k];
      }
      for (;;)
      {
        localObject = ((m)localObject).oBq;
        j = this.top * this.oAk + this.left;
        if (this.width != this.oAk) {
          break;
        }
        System.arraycopy(this.eSn, j, localObject, 0, k);
        GMTrace.o(6174552358912L, 46004);
        return (byte[])localObject;
        if (((m)localObject).oBq.length != k)
        {
          ((m)localObject).oBq = null;
          ((m)localObject).oBq = new byte[k];
        }
      }
      arrayOfByte = this.eSn;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.scanner.PlanarYUVLuminanceSource", " yuvData.len:" + this.eSn.length + " dataWidth:" + this.oAk + " dataHeight:" + this.oAl + " left:" + this.left + " top:" + this.top + " width:" + this.width + " height:" + this.height + " tStr:" + localException.toString());
      GMTrace.o(6174552358912L, 46004);
      return null;
    }
    byte[] arrayOfByte;
    while (i < this.height)
    {
      System.arraycopy(arrayOfByte, j, localException, this.width * i, this.width);
      k = this.oAk;
      j += k;
      i += 1;
    }
    GMTrace.o(6174552358912L, 46004);
    return localException;
  }
  
  public final byte[] bdo()
  {
    int i = 0;
    GMTrace.i(6174686576640L, 46005);
    byte[] arrayOfByte1;
    if ((this.width == this.oAk) && (this.height == this.oAl))
    {
      arrayOfByte1 = this.eSn;
      GMTrace.o(6174686576640L, 46005);
      return arrayOfByte1;
    }
    try
    {
      int k = this.width * this.height;
      arrayOfByte1 = new byte[k];
      int j = this.top * this.oAk + this.left;
      if (this.width == this.oAk)
      {
        System.arraycopy(this.eSn, j, arrayOfByte1, 0, k);
        GMTrace.o(6174686576640L, 46005);
        return arrayOfByte1;
      }
      byte[] arrayOfByte2 = this.eSn;
      while (i < this.height)
      {
        System.arraycopy(arrayOfByte2, j, arrayOfByte1, this.width * i, this.width);
        k = this.oAk;
        j += k;
        i += 1;
      }
      GMTrace.o(6174686576640L, 46005);
      return arrayOfByte1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.scanner.PlanarYUVLuminanceSource", " yuvData.len:" + this.eSn.length + " dataWidth:" + this.oAk + " dataHeight:" + this.oAl + " left:" + this.left + " top:" + this.top + " width:" + this.width + " height:" + this.height + " tStr:" + localException.toString());
      GMTrace.o(6174686576640L, 46005);
    }
    return null;
  }
  
  public final byte[] k(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(6174283923456L, 46002);
    if ((paramInt < 0) || (paramInt >= this.height)) {
      throw new IllegalArgumentException("Requested row is outside the image: " + paramInt);
    }
    byte[] arrayOfByte;
    if (paramArrayOfByte != null)
    {
      arrayOfByte = paramArrayOfByte;
      if (paramArrayOfByte.length >= this.width) {}
    }
    else
    {
      arrayOfByte = new byte[this.width];
    }
    int i = this.top;
    int j = this.oAk;
    int k = this.left;
    System.arraycopy(this.eSn, (i + paramInt) * j + k, arrayOfByte, 0, this.width);
    GMTrace.o(6174283923456L, 46002);
    return arrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */