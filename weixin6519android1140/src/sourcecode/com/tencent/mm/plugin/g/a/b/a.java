package com.tencent.mm.plugin.g.a.b;

import android.bluetooth.BluetoothGattCharacteristic;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  private int jkU;
  private byte[] jkV;
  private int jkW;
  private int jkX;
  BluetoothGattCharacteristic jkY;
  
  public a()
  {
    GMTrace.i(4818282217472L, 35899);
    this.jkU = 20;
    this.jkV = null;
    this.jkW = 0;
    this.jkX = 0;
    this.jkY = null;
    GMTrace.o(4818282217472L, 35899);
  }
  
  public final byte[] agY()
  {
    GMTrace.i(4818550652928L, 35901);
    int i = this.jkX - this.jkW;
    if (i == 0)
    {
      GMTrace.o(4818550652928L, 35901);
      return null;
    }
    if (i < this.jkU) {}
    for (;;)
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.jkV, this.jkW, arrayOfByte, 0, i);
      this.jkW = (i + this.jkW);
      GMTrace.o(4818550652928L, 35901);
      return arrayOfByte;
      i = this.jkU;
    }
  }
  
  public final void setData(byte[] paramArrayOfByte)
  {
    GMTrace.i(4818416435200L, 35900);
    if (paramArrayOfByte == null)
    {
      this.jkV = null;
      this.jkX = 0;
      this.jkW = 0;
      GMTrace.o(4818416435200L, 35900);
      return;
    }
    this.jkV = new byte[paramArrayOfByte.length];
    System.arraycopy(paramArrayOfByte, 0, this.jkV, 0, paramArrayOfByte.length);
    this.jkX = paramArrayOfByte.length;
    this.jkW = 0;
    GMTrace.o(4818416435200L, 35900);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */