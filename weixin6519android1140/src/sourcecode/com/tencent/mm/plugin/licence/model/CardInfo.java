package com.tencent.mm.plugin.licence.model;

import com.tencent.gmtrace.GMTrace;

public class CardInfo
{
  public byte[] bitmapData;
  public int bitmapLen;
  public int height;
  public int width;
  
  public CardInfo(int paramInt1, int paramInt2)
  {
    GMTrace.i(8932055580672L, 66549);
    this.width = 0;
    this.height = 0;
    this.bitmapLen = 0;
    this.bitmapData = new byte[(int)(0.8D * paramInt1) * (int)(0.52D * paramInt1) * 3 + 54];
    GMTrace.o(8932055580672L, 66549);
  }
  
  public byte[] getData()
  {
    GMTrace.i(8932592451584L, 66553);
    byte[] arrayOfByte = this.bitmapData;
    GMTrace.o(8932592451584L, 66553);
    return arrayOfByte;
  }
  
  public int getHeight()
  {
    GMTrace.i(8932324016128L, 66551);
    int i = this.height;
    GMTrace.o(8932324016128L, 66551);
    return i;
  }
  
  public int getSize()
  {
    GMTrace.i(8932458233856L, 66552);
    int i = this.bitmapLen;
    GMTrace.o(8932458233856L, 66552);
    return i;
  }
  
  public int getWidth()
  {
    GMTrace.i(8932189798400L, 66550);
    int i = this.width;
    GMTrace.o(8932189798400L, 66550);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\licence\model\CardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */