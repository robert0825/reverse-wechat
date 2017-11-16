package com.tencent.mm.plugin.nfc.b;

import android.nfc.Tag;
import com.tencent.gmtrace.GMTrace;

public abstract class b
{
  public Tag nxi;
  public byte[] nxj;
  
  public b()
  {
    GMTrace.i(8964402053120L, 66790);
    this.nxj = null;
    GMTrace.o(8964402053120L, 66790);
  }
  
  public boolean a(Tag paramTag)
  {
    GMTrace.i(8964536270848L, 66791);
    this.nxi = paramTag;
    if (paramTag != null) {
      this.nxj = paramTag.getId();
    }
    GMTrace.o(8964536270848L, 66791);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */