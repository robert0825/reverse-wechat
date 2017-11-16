package com.tencent.mm.plugin.talkroom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.g.a.ra;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rd;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements com.tencent.mm.pluginsdk.d.c
{
  public Plugin()
  {
    GMTrace.i(5209124241408L, 38811);
    com.tencent.mm.sdk.b.a.vgX.b(new com.tencent.mm.sdk.b.c() {});
    com.tencent.mm.sdk.b.a.vgX.b(new b((byte)0));
    com.tencent.mm.sdk.b.a.vgX.b(new a((byte)0));
    com.tencent.mm.sdk.b.a.vgX.b(new c((byte)0));
    GMTrace.o(5209124241408L, 38811);
  }
  
  public o createApplication()
  {
    GMTrace.i(5209258459136L, 38812);
    a locala = new a();
    GMTrace.o(5209258459136L, 38812);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5209526894592L, 38814);
    com.tencent.mm.plugin.talkroom.model.b localb = new com.tencent.mm.plugin.talkroom.model.b();
    GMTrace.o(5209526894592L, 38814);
    return localb;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(5209392676864L, 38813);
    GMTrace.o(5209392676864L, 38813);
    return null;
  }
  
  private final class a
    extends com.tencent.mm.sdk.b.c<ra>
  {
    private a()
    {
      GMTrace.i(5208184717312L, 38804);
      this.vhf = ra.class.getName().hashCode();
      GMTrace.o(5208184717312L, 38804);
    }
  }
  
  private static final class b
    extends com.tencent.mm.sdk.b.c<rb>
  {
    private b()
    {
      GMTrace.i(5143760207872L, 38324);
      this.vhf = rb.class.getName().hashCode();
      GMTrace.o(5143760207872L, 38324);
    }
  }
  
  private final class c
    extends com.tencent.mm.sdk.b.c<rd>
  {
    private c()
    {
      GMTrace.i(5143357554688L, 38321);
      this.vhf = rd.class.getName().hashCode();
      GMTrace.o(5143357554688L, 38321);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */