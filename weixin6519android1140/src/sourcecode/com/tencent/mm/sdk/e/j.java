package com.tencent.mm.sdk.e;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;

public abstract class j
  implements f
{
  public final k<a, l> vmx;
  private final k<Object, String> vmy;
  
  public j()
  {
    GMTrace.i(13959717453824L, 104008);
    this.vmx = new k() {};
    this.vmy = new k() {};
    GMTrace.o(13959717453824L, 104008);
  }
  
  public final void SS(String paramString)
  {
    GMTrace.i(13960656977920L, 104015);
    paramString = new l(paramString);
    this.vmx.bI(paramString);
    this.vmx.doNotify();
    GMTrace.o(13960656977920L, 104015);
  }
  
  public final void a(a parama, Looper paramLooper)
  {
    GMTrace.i(13960254324736L, 104012);
    this.vmx.a(parama, paramLooper);
    GMTrace.o(13960254324736L, 104012);
  }
  
  public final void a(String paramString, int paramInt, Object paramObject)
  {
    GMTrace.i(13960791195648L, 104016);
    l locall = new l();
    locall.eBq = paramString;
    locall.iqq = paramInt;
    locall.obj = paramObject;
    locall.vmG = this;
    this.vmx.bI(locall);
    this.vmx.doNotify();
    GMTrace.o(13960791195648L, 104016);
  }
  
  public void c(a parama)
  {
    GMTrace.i(13960120107008L, 104011);
    this.vmx.a(parama, Looper.getMainLooper());
    GMTrace.o(13960120107008L, 104011);
  }
  
  public final void doNotify()
  {
    GMTrace.i(13960522760192L, 104014);
    l locall = new l("*");
    this.vmx.bI(locall);
    this.vmx.doNotify();
    GMTrace.o(13960522760192L, 104014);
  }
  
  public final void j(a parama)
  {
    GMTrace.i(13960388542464L, 104013);
    this.vmx.remove(parama);
    GMTrace.o(13960388542464L, 104013);
  }
  
  public void lock()
  {
    GMTrace.i(13959851671552L, 104009);
    this.vmx.lock();
    GMTrace.o(13959851671552L, 104009);
  }
  
  public void unlock()
  {
    GMTrace.i(13959985889280L, 104010);
    this.vmx.unlock();
    GMTrace.o(13959985889280L, 104010);
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, l paraml);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */