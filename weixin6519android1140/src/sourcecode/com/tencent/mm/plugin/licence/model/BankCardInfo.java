package com.tencent.mm.plugin.licence.model;

import com.tencent.gmtrace.GMTrace;

public class BankCardInfo
{
  private static final String TAG = "BankCardInfo";
  public byte[] bitmapData;
  public int bitmapLen;
  private String cardNum;
  private int cardNumLen;
  public int height;
  private int[] rectX;
  private int[] rectY;
  public int width;
  
  public BankCardInfo(int paramInt1, int paramInt2)
  {
    GMTrace.i(14556583690240L, 108455);
    this.cardNumLen = 0;
    this.cardNum = "";
    this.rectY = new int[20];
    this.rectX = new int[20];
    this.width = 0;
    this.height = 0;
    this.bitmapLen = 0;
    this.bitmapData = new byte[(int)(0.8D * paramInt1) * (int)(0.52D * paramInt1) * 3 + 54];
    GMTrace.o(14556583690240L, 108455);
  }
  
  public String getCardNum()
  {
    GMTrace.i(14556986343424L, 108458);
    String str = this.cardNum;
    GMTrace.o(14556986343424L, 108458);
    return str;
  }
  
  public int getCardNumLen()
  {
    GMTrace.i(14556717907968L, 108456);
    int i = this.cardNumLen;
    GMTrace.o(14556717907968L, 108456);
    return i;
  }
  
  public int[] getRectX()
  {
    GMTrace.i(14557523214336L, 108462);
    int[] arrayOfInt = this.rectX;
    GMTrace.o(14557523214336L, 108462);
    return arrayOfInt;
  }
  
  public int[] getRectY()
  {
    GMTrace.i(14557254778880L, 108460);
    int[] arrayOfInt = this.rectY;
    GMTrace.o(14557254778880L, 108460);
    return arrayOfInt;
  }
  
  public void setCardNum(String paramString)
  {
    GMTrace.i(14557120561152L, 108459);
    this.cardNum = paramString;
    GMTrace.o(14557120561152L, 108459);
  }
  
  public void setCardNumLen(int paramInt)
  {
    GMTrace.i(14556852125696L, 108457);
    this.cardNumLen = paramInt;
    GMTrace.o(14556852125696L, 108457);
  }
  
  public void setRectX(int[] paramArrayOfInt)
  {
    GMTrace.i(14557657432064L, 108463);
    this.rectX = paramArrayOfInt;
    GMTrace.o(14557657432064L, 108463);
  }
  
  public void setRectY(int[] paramArrayOfInt)
  {
    GMTrace.i(14557388996608L, 108461);
    this.rectY = paramArrayOfInt;
    GMTrace.o(14557388996608L, 108461);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\licence\model\BankCardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */