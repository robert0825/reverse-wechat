package com.tencent.mm.plugin.ipcall.ui;

import com.tencent.gmtrace.GMTrace;

final class a
{
  String countryCode;
  String gLy;
  private int mmZ;
  String mna;
  
  public a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(11697209212928L, 87151);
    this.gLy = paramString1;
    this.countryCode = paramString2;
    this.mmZ = paramInt;
    this.mna = paramString3;
    GMTrace.o(11697209212928L, 87151);
  }
  
  public final int aIZ()
  {
    GMTrace.i(11697343430656L, 87152);
    if (this.mmZ == 0)
    {
      GMTrace.o(11697343430656L, 87152);
      return 0;
    }
    String[] arrayOfString = IPCallCountryCodeScrollbar.mpm;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfString[i].equals(String.valueOf((char)this.mmZ)))
      {
        i = this.mmZ;
        GMTrace.o(11697343430656L, 87152);
        return i;
      }
      i += 1;
    }
    i = "#".charAt(0);
    GMTrace.o(11697343430656L, 87152);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */