package com.tencent.qqpinyin.voicerecoapi;

public final class b
  extends Exception
{
  private String hZP = "";
  private int mErrorCode;
  
  public b(int paramInt)
  {
    this.mErrorCode = paramInt;
    String str;
    switch (paramInt)
    {
    default: 
      str = "unknown error";
    }
    for (;;)
    {
      this.hZP = str;
      new StringBuilder("errorCode: ").append(this.mErrorCode).append("\t msg: ").append(this.hZP);
      return;
      str = "speex engine error";
      continue;
      str = "out of memory";
      continue;
      str = "should init at first";
      continue;
      str = "already init";
      continue;
      str = "null param or 0 length";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\qqpinyin\voicerecoapi\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */