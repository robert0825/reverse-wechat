package com.b.a;

public final class j
  extends RuntimeException
{
  private final int column;
  private final int line;
  private final int offset;
  
  j(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramString + " at " + paramInt2 + ":" + paramInt3);
    this.offset = paramInt1;
    this.line = paramInt2;
    this.column = paramInt3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\b\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */