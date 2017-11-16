package com.tencent.recovery.wx.util;

class MyByteArray
{
  public byte[] epQ;
  public int epR = 0;
  
  public MyByteArray()
  {
    this.epQ = new byte['Ā'];
  }
  
  public MyByteArray(byte paramByte)
  {
    this.epQ = new byte[] { paramByte };
  }
  
  public MyByteArray(byte[] paramArrayOfByte)
  {
    this.epQ = paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\wx\util\MyByteArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */