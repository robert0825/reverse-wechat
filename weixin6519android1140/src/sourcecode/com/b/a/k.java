package com.b.a;

import java.io.Writer;

public final class k
  extends l
{
  private final char[] abb;
  
  k(char[] paramArrayOfChar)
  {
    this.abb = paramArrayOfChar;
  }
  
  protected final i a(Writer paramWriter)
  {
    return new a(paramWriter, this.abb);
  }
  
  private static final class a
    extends i
  {
    private final char[] abb;
    private int abc;
    
    public a(Writer paramWriter, char[] paramArrayOfChar)
    {
      super();
      this.abb = paramArrayOfChar;
    }
    
    private boolean hM()
    {
      int i = 0;
      if (this.abb == null) {
        return false;
      }
      this.aba.write(10);
      while (i < this.abc)
      {
        this.aba.write(this.abb);
        i += 1;
      }
      return true;
    }
    
    protected final void hF()
    {
      this.abc += 1;
      this.aba.write(91);
      hM();
    }
    
    protected final void hG()
    {
      this.abc -= 1;
      hM();
      this.aba.write(93);
    }
    
    protected final void hH()
    {
      this.aba.write(44);
      if (!hM()) {
        this.aba.write(32);
      }
    }
    
    protected final void hI()
    {
      this.abc += 1;
      this.aba.write(123);
      hM();
    }
    
    protected final void hJ()
    {
      this.abc -= 1;
      hM();
      this.aba.write(125);
    }
    
    protected final void hK()
    {
      this.aba.write(58);
      this.aba.write(32);
    }
    
    protected final void hL()
    {
      this.aba.write(44);
      if (!hM()) {
        this.aba.write(32);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */