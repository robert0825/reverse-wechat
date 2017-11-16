package com.tencent.mm.plugin.g.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends j
{
  private byte jkL;
  
  public g()
  {
    GMTrace.i(4800833912832L, 35769);
    this.jkL = 0;
    GMTrace.o(4800833912832L, 35769);
  }
  
  final boolean Y(byte[] paramArrayOfByte)
  {
    GMTrace.i(4800968130560L, 35770);
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.exdevice.IBeaconTLVSectionA", "valueByte is null or nil");
      GMTrace.o(4800968130560L, 35770);
      return false;
    }
    if (2 != this.mLength)
    {
      w.d("MicroMsg.exdevice.IBeaconTLVSectionA", "IBEACON_TLV_SECTION_A_LENGTH != mLength(%d)", new Object[] { Integer.valueOf(this.mLength) });
      GMTrace.o(4800968130560L, 35770);
      return false;
    }
    this.jkL = paramArrayOfByte[0];
    GMTrace.o(4800968130560L, 35770);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */