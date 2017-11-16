package com.tencent.mm.plugin.exdevice.j;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import junit.framework.Assert;

public final class a
{
  private final int kLY;
  private ByteBuffer kLZ;
  private ByteBuffer kMa;
  
  public a(int paramInt)
  {
    GMTrace.i(11112556789760L, 82795);
    this.kLY = 1024;
    w.d("MicroMsg.exdevice.AutoBuffer", "******AutoBuffer****** capacity = " + paramInt);
    if (paramInt >= 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      this.kMa = ByteBuffer.allocate(paramInt);
      this.kLZ = this.kMa.asReadOnlyBuffer();
      if (this.kMa == null) {
        break label111;
      }
      bool1 = true;
      label80:
      Assert.assertTrue(bool1);
      if (this.kLZ == null) {
        break label116;
      }
    }
    label111:
    label116:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      GMTrace.o(11112556789760L, 82795);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label80;
    }
  }
  
  public final int getSize()
  {
    GMTrace.i(11112691007488L, 82796);
    w.d("MicroMsg.exdevice.AutoBuffer", "size = " + this.kMa.position());
    int i = this.kMa.position();
    GMTrace.o(11112691007488L, 82796);
    return i;
  }
  
  public final short readShort()
  {
    GMTrace.i(11112825225216L, 82797);
    if (getSize() <= 1) {
      throw new IOException("There is only one byte in array");
    }
    short s = this.kLZ.getShort();
    w.d("MicroMsg.exdevice.AutoBuffer", "getShort = " + s);
    GMTrace.o(11112825225216L, 82797);
    return s;
  }
  
  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool2 = true;
    GMTrace.i(11112959442944L, 82798);
    Assert.assertTrue(true);
    if (paramInt >= 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramArrayOfByte.length < 0) {
        break label119;
      }
      bool1 = true;
      label32:
      Assert.assertTrue(bool1);
      if (paramArrayOfByte.length < paramInt + 0) {
        break label124;
      }
      bool1 = true;
      label46:
      Assert.assertTrue(bool1);
      if (this.kLZ.remaining() < paramInt) {
        break label129;
      }
    }
    label119:
    label124:
    label129:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      w.d("MicroMsg.exdevice.AutoBuffer", "readByte dstOffset = 0" + " byteCount = " + paramInt);
      this.kLZ.get(paramArrayOfByte, 0, paramInt);
      GMTrace.o(11112959442944L, 82798);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label32;
      bool1 = false;
      break label46;
    }
  }
  
  public final void v(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool2 = true;
    GMTrace.i(11113093660672L, 82799);
    Assert.assertTrue(true);
    if (paramInt >= 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramArrayOfByte == null) {
        break label198;
      }
    }
    label198:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      w.d("MicroMsg.exdevice.AutoBuffer", "writeByte srcOffset = 0" + " byteCount = " + paramInt);
      if (paramInt <= this.kMa.remaining()) {
        break label204;
      }
      w.d("MicroMsg.exdevice.AutoBuffer", "byteCount > mWriteStream.remaining() Recalloc");
      w.d("MicroMsg.exdevice.AutoBuffer", "getCapacity = " + this.kMa.capacity());
      ByteBuffer localByteBuffer = ByteBuffer.allocate(this.kMa.capacity() + paramInt + 1024);
      int i = this.kLZ.position();
      localByteBuffer.put(this.kMa.array());
      localByteBuffer.put(paramArrayOfByte, 0, paramInt);
      this.kMa = localByteBuffer;
      this.kLZ = localByteBuffer.asReadOnlyBuffer();
      this.kLZ.position(i);
      GMTrace.o(11113093660672L, 82799);
      return;
      bool1 = false;
      break;
    }
    label204:
    this.kMa.put(paramArrayOfByte, 0, paramInt);
    GMTrace.o(11113093660672L, 82799);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */