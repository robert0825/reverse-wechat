package org.a.d;

import java.io.OutputStream;

public final class a
{
  public final String scope;
  public final String ytB;
  public final String ytC;
  public final String ytD;
  public final h ytF;
  private final OutputStream ytG;
  
  public a(String paramString1, String paramString2, String paramString3, h paramh, String paramString4, OutputStream paramOutputStream)
  {
    this.ytB = paramString1;
    this.ytC = paramString2;
    this.ytD = paramString3;
    this.ytF = paramh;
    this.scope = paramString4;
    this.ytG = paramOutputStream;
  }
  
  public final void xI(String paramString)
  {
    if (this.ytG != null) {
      paramString = paramString + "\n";
    }
    try
    {
      this.ytG.write(paramString.getBytes("UTF8"));
      return;
    }
    catch (Exception paramString)
    {
      throw new RuntimeException("there were problems while writting to the debug stream", paramString);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */