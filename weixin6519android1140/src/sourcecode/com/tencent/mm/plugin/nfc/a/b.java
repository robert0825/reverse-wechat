package com.tencent.mm.plugin.nfc.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.nfc.c.a;

public abstract interface b
{
  public static final byte[] nxb;
  public static final byte[] nxc;
  public static final byte[] nxd;
  public static final byte[] nxe;
  public static final byte[] nxf;
  
  static
  {
    GMTrace.i(8960509739008L, 66761);
    nxb = a.hexStringToByteArray("FF010000");
    nxc = a.hexStringToByteArray("FF020000");
    nxd = a.hexStringToByteArray("FF030000");
    nxe = a.hexStringToByteArray("FF040000");
    nxf = a.hexStringToByteArray("006C0000");
    GMTrace.o(8960509739008L, 66761);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */