package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.nio.ByteBuffer;

public final class t
{
  private ByteBuffer vhE;
  private boolean vhF;
  
  public t()
  {
    GMTrace.i(13911130636288L, 103646);
    GMTrace.o(13911130636288L, 103646);
  }
  
  private int Aj(int paramInt)
  {
    GMTrace.i(13912472813568L, 103656);
    if (this.vhE.limit() - this.vhE.position() > paramInt)
    {
      GMTrace.o(13912472813568L, 103656);
      return 0;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(this.vhE.limit() + 4096);
    localByteBuffer.put(this.vhE.array(), 0, this.vhE.position());
    this.vhE = localByteBuffer;
    GMTrace.o(13912472813568L, 103656);
    return 0;
  }
  
  public final void Ai(int paramInt)
  {
    GMTrace.i(13911935942656L, 103652);
    this.vhE.position(this.vhE.position() + paramInt);
    GMTrace.o(13911935942656L, 103652);
  }
  
  public final int Ak(int paramInt)
  {
    GMTrace.i(13912607031296L, 103657);
    if (!this.vhF) {
      throw new Exception("Buffer For Parse");
    }
    Aj(4);
    this.vhE.putInt(paramInt);
    GMTrace.o(13912607031296L, 103657);
    return 0;
  }
  
  public final int RL(String paramString)
  {
    GMTrace.i(13913009684480L, 103660);
    if (!this.vhF) {
      throw new Exception("Buffer For Parse");
    }
    byte[] arrayOfByte = null;
    if (paramString != null) {
      arrayOfByte = paramString.getBytes();
    }
    paramString = arrayOfByte;
    if (arrayOfByte == null) {
      paramString = new byte[0];
    }
    if (paramString.length > 2048) {
      throw new Exception("Buffer String Length Error");
    }
    Aj(paramString.length + 2);
    this.vhE.putShort((short)paramString.length);
    if (paramString.length > 0) {
      this.vhE.put(paramString);
    }
    GMTrace.o(13913009684480L, 103660);
    return 0;
  }
  
  public final void bPA()
  {
    GMTrace.i(13912070160384L, 103653);
    if (this.vhF) {
      throw new Exception("Buffer For Build");
    }
    int i = this.vhE.getShort();
    if (i > 2048)
    {
      this.vhE = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0)
    {
      GMTrace.o(13912070160384L, 103653);
      return;
    }
    this.vhE.position(i + this.vhE.position());
    GMTrace.o(13912070160384L, 103653);
  }
  
  public final boolean bPB()
  {
    GMTrace.i(13912204378112L, 103654);
    if (this.vhE.limit() - this.vhE.position() <= 1)
    {
      GMTrace.o(13912204378112L, 103654);
      return true;
    }
    GMTrace.o(13912204378112L, 103654);
    return false;
  }
  
  public final int bPC()
  {
    GMTrace.i(13912338595840L, 103655);
    this.vhE = ByteBuffer.allocate(4096);
    this.vhE.put((byte)123);
    this.vhF = true;
    GMTrace.o(13912338595840L, 103655);
    return 0;
  }
  
  public final byte[] bPD()
  {
    GMTrace.i(13913143902208L, 103661);
    if (!this.vhF) {
      throw new Exception("Buffer For Parse");
    }
    Aj(1);
    this.vhE.put((byte)125);
    byte[] arrayOfByte = new byte[this.vhE.position()];
    System.arraycopy(this.vhE.array(), 0, arrayOfByte, 0, arrayOfByte.length);
    GMTrace.o(13913143902208L, 103661);
    return arrayOfByte;
  }
  
  public final int bl(byte[] paramArrayOfByte)
  {
    GMTrace.i(13911264854016L, 103647);
    int i;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      i = -1;
    }
    while (i != 0)
    {
      this.vhE = null;
      GMTrace.o(13911264854016L, 103647);
      return -1;
      if (paramArrayOfByte[0] != 123) {
        i = -2;
      } else if (paramArrayOfByte[(paramArrayOfByte.length - 1)] != 125) {
        i = -3;
      } else {
        i = 0;
      }
    }
    this.vhE = ByteBuffer.wrap(paramArrayOfByte);
    this.vhE.position(1);
    this.vhF = false;
    GMTrace.o(13911264854016L, 103647);
    return 0;
  }
  
  public final int bm(byte[] paramArrayOfByte)
  {
    GMTrace.i(13912875466752L, 103659);
    if (!this.vhF) {
      throw new Exception("Buffer For Parse");
    }
    byte[] arrayOfByte = null;
    if (paramArrayOfByte != null) {
      arrayOfByte = paramArrayOfByte;
    }
    paramArrayOfByte = arrayOfByte;
    if (arrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    if (paramArrayOfByte.length > 2048) {
      throw new Exception("Buffer String Length Error");
    }
    Aj(paramArrayOfByte.length + 2);
    this.vhE.putShort((short)paramArrayOfByte.length);
    if (paramArrayOfByte.length > 0) {
      this.vhE.put(paramArrayOfByte);
    }
    GMTrace.o(13912875466752L, 103659);
    return 0;
  }
  
  public final int eH(long paramLong)
  {
    GMTrace.i(13912741249024L, 103658);
    if (!this.vhF) {
      throw new Exception("Buffer For Parse");
    }
    Aj(8);
    this.vhE.putLong(paramLong);
    GMTrace.o(13912741249024L, 103658);
    return 0;
  }
  
  public final byte[] getBuffer()
  {
    GMTrace.i(13911667507200L, 103650);
    if (this.vhF) {
      throw new Exception("Buffer For Build");
    }
    int i = this.vhE.getShort();
    if (i > 2048)
    {
      this.vhE = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0)
    {
      GMTrace.o(13911667507200L, 103650);
      return new byte[0];
    }
    byte[] arrayOfByte = new byte[i];
    this.vhE.get(arrayOfByte, 0, i);
    GMTrace.o(13911667507200L, 103650);
    return arrayOfByte;
  }
  
  public final int getInt()
  {
    GMTrace.i(13911399071744L, 103648);
    if (this.vhF) {
      throw new Exception("Buffer For Build");
    }
    int i = this.vhE.getInt();
    GMTrace.o(13911399071744L, 103648);
    return i;
  }
  
  public final long getLong()
  {
    GMTrace.i(13911533289472L, 103649);
    if (this.vhF) {
      throw new Exception("Buffer For Build");
    }
    long l = this.vhE.getLong();
    GMTrace.o(13911533289472L, 103649);
    return l;
  }
  
  public final String getString()
  {
    GMTrace.i(13911801724928L, 103651);
    if (this.vhF) {
      throw new Exception("Buffer For Build");
    }
    int i = this.vhE.getShort();
    if (i > 2048)
    {
      this.vhE = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0)
    {
      GMTrace.o(13911801724928L, 103651);
      return "";
    }
    Object localObject = new byte[i];
    this.vhE.get((byte[])localObject, 0, i);
    localObject = new String((byte[])localObject, "UTF-8");
    GMTrace.o(13911801724928L, 103651);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */