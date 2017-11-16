package com.tencent.mm.plugin.auth;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bz.a.a;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.y.au;
import com.tencent.mm.y.au.a;
import com.tencent.mm.y.y;

public class PluginAuth
  extends d
  implements com.tencent.mm.plugin.auth.a.b
{
  private final a iUH;
  
  public PluginAuth()
  {
    GMTrace.i(13177899188224L, 98183);
    this.iUH = new a();
    GMTrace.o(13177899188224L, 98183);
  }
  
  public com.tencent.mm.vending.b.b addHandleAuthResponse(com.tencent.mm.plugin.auth.a.a parama)
  {
    GMTrace.i(13178704494592L, 98189);
    parama = this.iUH.bT(parama);
    GMTrace.o(13178704494592L, 98189);
    return parama;
  }
  
  public void configure(e parame)
  {
    GMTrace.i(13178301841408L, 98186);
    au.a(new au.a()
    {
      public final void a(i.f paramAnonymousf, i.g paramAnonymousg)
      {
        GMTrace.i(13180180889600L, 98200);
        y.a(paramAnonymousg.tKc, true);
        PluginAuth.this.getHandleAuthResponseCallbacks().a(paramAnonymousf, paramAnonymousg, true);
        GMTrace.o(13180180889600L, 98200);
      }
    });
    GMTrace.o(13178301841408L, 98186);
  }
  
  public void dependency()
  {
    GMTrace.i(13178167623680L, 98185);
    dependsOn(n.class);
    GMTrace.o(13178167623680L, 98185);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(13178436059136L, 98187);
    GMTrace.o(13178436059136L, 98187);
  }
  
  public com.tencent.mm.plugin.auth.a.a getHandleAuthResponseCallbacks()
  {
    GMTrace.i(13178838712320L, 98190);
    a locala = this.iUH;
    GMTrace.o(13178838712320L, 98190);
    return locala;
  }
  
  public void installed()
  {
    GMTrace.i(13178033405952L, 98184);
    alias(com.tencent.mm.plugin.auth.a.b.class);
    GMTrace.o(13178033405952L, 98184);
  }
  
  public String toString()
  {
    GMTrace.i(13178570276864L, 98188);
    GMTrace.o(13178570276864L, 98188);
    return "plugin-auth";
  }
  
  private static final class a
    extends com.tencent.mm.bz.a<com.tencent.mm.plugin.auth.a.a>
    implements com.tencent.mm.plugin.auth.a.a
  {
    public a()
    {
      GMTrace.i(13179509800960L, 98195);
      GMTrace.o(13179509800960L, 98195);
    }
    
    public final void a(final i.f paramf, final i.g paramg, final boolean paramBoolean)
    {
      GMTrace.i(13179644018688L, 98196);
      a(new a.a() {});
      GMTrace.o(13179644018688L, 98196);
    }
    
    public final void a(final y.b paramb, final String paramString1, final int paramInt1, final String paramString2, final String paramString3, final int paramInt2)
    {
      GMTrace.i(13179778236416L, 98197);
      a(new a.a() {});
      GMTrace.o(13179778236416L, 98197);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\auth\PluginAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */