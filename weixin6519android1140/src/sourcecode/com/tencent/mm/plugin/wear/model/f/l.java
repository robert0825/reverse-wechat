package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.btf;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class l
  extends c
{
  private String eDs;
  private int rzY;
  
  public l(int paramInt, String paramString)
  {
    GMTrace.i(9189082529792L, 68464);
    this.rzY = paramInt;
    this.eDs = paramString;
    GMTrace.o(9189082529792L, 68464);
  }
  
  public final String getName()
  {
    GMTrace.i(9189216747520L, 68465);
    GMTrace.o(9189216747520L, 68465);
    return "WearVoipControllerTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9189350965248L, 68466);
    switch (this.rzY)
    {
    }
    for (;;)
    {
      GMTrace.o(9189350965248L, 68466);
      return;
      btf localbtf = new btf();
      localbtf.vbv = this.eDs;
      localbtf.jio = h.KX(this.eDs);
      try
      {
        a.bBm();
        r.a(this.rzY, localbtf.toByteArray(), false);
        GMTrace.o(9189350965248L, 68466);
        return;
      }
      catch (IOException localIOException)
      {
        GMTrace.o(9189350965248L, 68466);
        return;
      }
      try
      {
        a.bBm();
        r.a(this.rzY, this.eDs.getBytes("utf8"), false);
        GMTrace.o(9189350965248L, 68466);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */