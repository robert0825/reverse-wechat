package com.b.a;

import java.io.Writer;

final class m
  extends Writer
{
  private final char[] aaL;
  private int aaN = 0;
  private final Writer aba;
  
  m(Writer paramWriter)
  {
    this.aba = paramWriter;
    this.aaL = new char[''];
  }
  
  public final void close() {}
  
  public final void flush()
  {
    this.aba.write(this.aaL, 0, this.aaN);
    this.aaN = 0;
  }
  
  public final void write(int paramInt)
  {
    if (this.aaN > this.aaL.length - 1) {
      flush();
    }
    char[] arrayOfChar = this.aaL;
    int i = this.aaN;
    this.aaN = (i + 1);
    arrayOfChar[i] = ((char)paramInt);
  }
  
  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    if (this.aaN > this.aaL.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.aaL.length)
      {
        this.aba.write(paramString, paramInt1, paramInt2);
        return;
      }
    }
    paramString.getChars(paramInt1, paramInt1 + paramInt2, this.aaL, this.aaN);
    this.aaN += paramInt2;
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.aaN > this.aaL.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.aaL.length)
      {
        this.aba.write(paramArrayOfChar, paramInt1, paramInt2);
        return;
      }
    }
    System.arraycopy(paramArrayOfChar, paramInt1, this.aaL, this.aaN, paramInt2);
    this.aaN += paramInt2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */