package com.tencent.qqpinyin.voicerecoapi;

public final class a
{
  public static int MAX_FRAME_SIZE = 2000;
  private byte[] xOS = null;
  public byte[] xOT = null;
  private int xOU = 0;
  public int xOV = 0;
  public TRSpeexNative xOW = new TRSpeexNative();
  
  public final byte[] D(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.xOU == 0) {
      throw new b(-102);
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      throw new b(-104);
    }
    paramInt = this.xOW.nativeTRSpeexEncode(this.xOU, paramArrayOfByte, 0, paramInt, this.xOS);
    if (paramInt < 0) {
      throw new b(paramInt);
    }
    if (paramInt == 0) {
      return null;
    }
    paramArrayOfByte = new byte[paramInt];
    System.arraycopy(this.xOS, 0, paramArrayOfByte, 0, paramInt);
    return paramArrayOfByte;
  }
  
  public final int cnc()
  {
    int i;
    if (this.xOU != 0) {
      i = -103;
    }
    int j;
    do
    {
      return i;
      j = this.xOW.nativeTRSpeexInit();
      i = j;
    } while (j == -1);
    this.xOU = j;
    this.xOS = new byte[MAX_FRAME_SIZE * 10];
    return 0;
  }
  
  public final int cnd()
  {
    if (this.xOU == 0) {
      return -102;
    }
    this.xOS = null;
    int i = this.xOW.nativeTRSpeexRelease(this.xOU);
    this.xOU = 0;
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\qqpinyin\voicerecoapi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */