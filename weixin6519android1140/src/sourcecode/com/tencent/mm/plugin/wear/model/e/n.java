package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.h;
import java.util.ArrayList;
import java.util.List;

public final class n
  extends a
{
  public n()
  {
    GMTrace.i(9203846479872L, 68574);
    GMTrace.o(9203846479872L, 68574);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9203980697600L, 68575);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11033));
    localArrayList.add(Integer.valueOf(11030));
    GMTrace.o(9203980697600L, 68575);
    return localArrayList;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9204114915328L, 68576);
    switch (paramInt)
    {
    case 11031: 
    case 11032: 
    default: 
      GMTrace.o(9204114915328L, 68576);
      return null;
    case 11030: 
      if (new String(paramArrayOfByte).equals("arm_v7"))
      {
        paramArrayOfByte = h.KY("wechatvoicesilk_v7a");
        GMTrace.o(9204114915328L, 68576);
        return paramArrayOfByte;
      }
      paramArrayOfByte = h.KY("wechatvoicesilk");
      GMTrace.o(9204114915328L, 68576);
      return paramArrayOfByte;
    }
    paramArrayOfByte = h.KY("stlport_shared");
    GMTrace.o(9204114915328L, 68576);
    return paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */