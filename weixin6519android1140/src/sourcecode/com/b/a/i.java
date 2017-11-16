package com.b.a;

import java.io.Writer;

class i
{
  private static final char[] aaS = { 92, 34 };
  private static final char[] aaT = { 92, 92 };
  private static final char[] aaU = { 92, 110 };
  private static final char[] aaV = { 92, 114 };
  private static final char[] aaW = { 92, 116 };
  private static final char[] aaX = { 92, 117, 50, 48, 50, 56 };
  private static final char[] aaY = { 92, 117, 50, 48, 50, 57 };
  private static final char[] aaZ = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected final Writer aba;
  
  i(Writer paramWriter)
  {
    this.aba = paramWriter;
  }
  
  private void E(String paramString)
  {
    int m = paramString.length();
    int i = 0;
    int j = 0;
    if (i < m)
    {
      int k = paramString.charAt(i);
      char[] arrayOfChar;
      if (k > 92) {
        if ((k < 8232) || (k > 8233)) {
          arrayOfChar = null;
        }
      }
      for (;;)
      {
        k = j;
        if (arrayOfChar != null)
        {
          this.aba.write(paramString, j, i - j);
          this.aba.write(arrayOfChar);
          k = i + 1;
        }
        i += 1;
        j = k;
        break;
        if (k == 8232)
        {
          arrayOfChar = aaX;
        }
        else
        {
          arrayOfChar = aaY;
          continue;
          if (k == 92)
          {
            arrayOfChar = aaT;
          }
          else if (k > 34)
          {
            arrayOfChar = null;
          }
          else if (k == 34)
          {
            arrayOfChar = aaS;
          }
          else if (k > 31)
          {
            arrayOfChar = null;
          }
          else if (k == 10)
          {
            arrayOfChar = aaU;
          }
          else if (k == 13)
          {
            arrayOfChar = aaV;
          }
          else if (k == 9)
          {
            arrayOfChar = aaW;
          }
          else
          {
            arrayOfChar = new char[6];
            arrayOfChar[0] = '\\';
            arrayOfChar[1] = 'u';
            arrayOfChar[2] = '0';
            arrayOfChar[3] = '0';
            arrayOfChar[4] = aaZ[(k >> 4 & 0xF)];
            arrayOfChar[5] = aaZ[(k & 0xF)];
          }
        }
      }
    }
    this.aba.write(paramString, j, m - j);
  }
  
  protected final void B(String paramString)
  {
    this.aba.write(paramString);
  }
  
  protected final void C(String paramString)
  {
    this.aba.write(paramString);
  }
  
  protected final void D(String paramString)
  {
    this.aba.write(34);
    E(paramString);
    this.aba.write(34);
  }
  
  protected void hF()
  {
    this.aba.write(91);
  }
  
  protected void hG()
  {
    this.aba.write(93);
  }
  
  protected void hH()
  {
    this.aba.write(44);
  }
  
  protected void hI()
  {
    this.aba.write(123);
  }
  
  protected void hJ()
  {
    this.aba.write(125);
  }
  
  protected void hK()
  {
    this.aba.write(58);
  }
  
  protected void hL()
  {
    this.aba.write(44);
  }
  
  protected final void writeString(String paramString)
  {
    this.aba.write(34);
    E(paramString);
    this.aba.write(34);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */