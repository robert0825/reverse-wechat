package com.b.a;

import java.io.Reader;
import java.io.StringReader;

final class f
{
  private final Reader aaK;
  private final char[] aaL;
  private int aaM;
  private int aaN;
  private int aaO;
  private int aaP;
  private StringBuilder aaQ;
  private int aaR;
  private int index;
  private int line;
  
  private f(Reader paramReader, int paramInt)
  {
    this.aaK = paramReader;
    this.aaL = new char[paramInt];
    this.line = 1;
    this.aaR = -1;
  }
  
  f(String paramString)
  {
    this(new StringReader(paramString), Math.max(10, Math.min(1024, paramString.length())));
  }
  
  private void a(char paramChar)
  {
    if (!b(paramChar)) {
      throw z("'" + paramChar + "'");
    }
  }
  
  private boolean b(char paramChar)
  {
    if (this.aaP != paramChar) {
      return false;
    }
    hz();
    return true;
  }
  
  private void hA()
  {
    if (this.aaQ == null) {
      this.aaQ = new StringBuilder();
    }
    this.aaR = (this.index - 1);
  }
  
  private String hB()
  {
    int i;
    String str;
    if (this.aaP == -1)
    {
      i = this.index;
      if (this.aaQ.length() <= 0) {
        break label78;
      }
      this.aaQ.append(this.aaL, this.aaR, i - this.aaR);
      str = this.aaQ.toString();
      this.aaQ.setLength(0);
    }
    for (;;)
    {
      this.aaR = -1;
      return str;
      i = this.index - 1;
      break;
      label78:
      str = new String(this.aaL, this.aaR, i - this.aaR);
    }
  }
  
  private String hw()
  {
    hz();
    hA();
    while (this.aaP != 34)
    {
      if (this.aaP == 92)
      {
        if (this.aaP == -1) {}
        for (int i = this.index;; i = this.index - 1)
        {
          this.aaQ.append(this.aaL, this.aaR, i - this.aaR);
          this.aaR = -1;
          hz();
          switch (this.aaP)
          {
          default: 
            throw z("valid escape sequence");
          }
        }
        this.aaQ.append((char)this.aaP);
        for (;;)
        {
          hz();
          hA();
          break;
          this.aaQ.append('\b');
          continue;
          this.aaQ.append('\f');
          continue;
          this.aaQ.append('\n');
          continue;
          this.aaQ.append('\r');
          continue;
          this.aaQ.append('\t');
          continue;
          localObject = new char[4];
          i = 0;
          while (i < 4)
          {
            hz();
            if (((this.aaP >= 48) && (this.aaP <= 57)) || ((this.aaP >= 97) && (this.aaP <= 102)) || ((this.aaP >= 65) && (this.aaP <= 70))) {}
            for (int j = 1; j == 0; j = 0) {
              throw z("hexadecimal digit");
            }
            localObject[i] = ((char)this.aaP);
            i += 1;
          }
          this.aaQ.append((char)Integer.parseInt(new String((char[])localObject), 16));
        }
      }
      if (this.aaP < 32) {
        throw z("valid string character");
      }
      hz();
    }
    Object localObject = hB();
    hz();
    return (String)localObject;
  }
  
  private boolean hx()
  {
    if ((this.aaP >= 48) && (this.aaP <= 57)) {}
    for (int i = 1; i == 0; i = 0) {
      return false;
    }
    hz();
    return true;
  }
  
  private j z(String paramString)
  {
    if (hC()) {
      return A("Unexpected end of input");
    }
    return A("Expected " + paramString);
  }
  
  final j A(String paramString)
  {
    int j = this.aaM + this.index;
    int k = this.aaO;
    if (hC()) {}
    for (int i = j;; i = j - 1) {
      return new j(paramString, i, this.line, j - k - 1);
    }
  }
  
  final boolean hC()
  {
    return this.aaP == -1;
  }
  
  final h hv()
  {
    Object localObject1;
    switch (this.aaP)
    {
    default: 
      throw z("value");
    case 110: 
      hz();
      a('u');
      a('l');
      a('l');
      localObject1 = a.aat;
    case 116: 
    case 102: 
    case 34: 
    case 91: 
    case 123: 
      do
      {
        Object localObject2;
        do
        {
          do
          {
            do
            {
              return (h)localObject1;
              hz();
              a('r');
              a('u');
              a('e');
              return a.aau;
              hz();
              a('a');
              a('l');
              a('s');
              a('e');
              return a.aav;
              return new g(hw());
              hz();
              localObject2 = new b();
              hy();
              localObject1 = localObject2;
            } while (b(']'));
            do
            {
              hy();
              ((b)localObject2).a(hv());
              hy();
            } while (b(','));
            localObject1 = localObject2;
          } while (b(']'));
          throw z("',' or ']'");
          hz();
          localObject2 = new e();
          hy();
          localObject1 = localObject2;
        } while (b('}'));
        do
        {
          hy();
          if (this.aaP != 34) {
            throw z("name");
          }
          localObject1 = hw();
          hy();
          if (!b(':')) {
            throw z("':'");
          }
          hy();
          ((e)localObject2).a((String)localObject1, hv());
          hy();
        } while (b(','));
        localObject1 = localObject2;
      } while (b('}'));
      throw z("',' or '}'");
    }
    hA();
    b('-');
    int i = this.aaP;
    if (!hx()) {
      throw z("digit");
    }
    while ((i != 48) && (hx())) {}
    if (b('.'))
    {
      if (!hx()) {
        throw z("digit");
      }
      while (hx()) {}
    }
    if ((b('e')) || (b('E')))
    {
      if (!b('+')) {
        b('-');
      }
      if (!hx()) {
        throw z("digit");
      }
      while (hx()) {}
    }
    return new d(hB());
  }
  
  final void hy()
  {
    if ((this.aaP == 32) || (this.aaP == 9) || (this.aaP == 10) || (this.aaP == 13)) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        return;
      }
      hz();
      break;
    }
  }
  
  final void hz()
  {
    if (this.index == this.aaN)
    {
      if (this.aaR != -1)
      {
        this.aaQ.append(this.aaL, this.aaR, this.aaN - this.aaR);
        this.aaR = 0;
      }
      this.aaM += this.aaN;
      this.aaN = this.aaK.read(this.aaL, 0, this.aaL.length);
      this.index = 0;
      if (this.aaN == -1)
      {
        this.aaP = -1;
        return;
      }
    }
    if (this.aaP == 10)
    {
      this.line += 1;
      this.aaO = (this.aaM + this.index);
    }
    char[] arrayOfChar = this.aaL;
    int i = this.index;
    this.index = (i + 1);
    this.aaP = arrayOfChar[i];
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */