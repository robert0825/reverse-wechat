package com.tencent.mm.plugin.fingerprint;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.fingerprint.a.a;

public class PluginFingerprint
  extends d
  implements a
{
  public PluginFingerprint()
  {
    GMTrace.i(20852468875264L, 155363);
    GMTrace.o(20852468875264L, 155363);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(20853005746176L, 155367);
    parame.eR("");
    GMTrace.o(20853005746176L, 155367);
  }
  
  public void dependency()
  {
    GMTrace.i(20852871528448L, 155366);
    GMTrace.o(20852871528448L, 155366);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(20853139963904L, 155368);
    parame.eR("");
    GMTrace.o(20853139963904L, 155368);
  }
  
  public void installed()
  {
    GMTrace.i(20852737310720L, 155365);
    alias(PluginFingerprint.class);
    GMTrace.o(20852737310720L, 155365);
  }
  
  public String name()
  {
    GMTrace.i(20852603092992L, 155364);
    GMTrace.o(20852603092992L, 155364);
    return "plugin-fingerprint";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\PluginFingerprint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */