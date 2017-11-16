package org.a.e;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.a.c.e;
import org.a.c.f;
import org.a.d.i;
import org.a.d.j;
import org.a.d.k;

public final class a
  implements b
{
  private org.a.d.a yui;
  private org.a.a.a.b yuj;
  
  public a(org.a.a.a.b paramb, org.a.d.a parama)
  {
    this.yuj = paramb;
    this.yui = parama;
  }
  
  private void a(org.a.d.c paramc, i parami)
  {
    paramc.fN("oauth_timestamp", new org.a.f.d().ctH());
    paramc.fN("oauth_nonce", new org.a.f.d().getNonce());
    paramc.fN("oauth_consumer_key", this.yui.ytB);
    paramc.fN("oauth_signature_method", new org.a.f.a().ctG());
    paramc.fN("oauth_version", "1.0");
    if (this.yui.scope != null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        paramc.fN("scope", this.yui.scope);
      }
      this.yui.xI("generating signature...");
      String str = new org.a.c.c().a(paramc);
      parami = new org.a.f.a().ap(str, this.yui.ytC, parami.uDu);
      this.yui.xI("base string is: " + str);
      this.yui.xI("signature is: " + parami);
      paramc.fN("oauth_signature", parami);
      this.yui.xI("appended additional OAuth parameters: " + org.a.g.b.aq(paramc.ytK));
      return;
    }
  }
  
  private void b(org.a.d.c paramc)
  {
    switch (ctF()[this.yui.ytF.ordinal()])
    {
    }
    for (;;)
    {
      return;
      this.yui.xI("using Http Header signature");
      paramc.addHeader("Authorization", new e().a(paramc));
      return;
      this.yui.xI("using Querystring signature");
      Iterator localIterator = paramc.ytK.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramc.fO((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }
  
  public final i a(i parami, k paramk)
  {
    this.yui.xI("obtaining access token from " + this.yuj.ctu());
    org.a.d.c localc = new org.a.d.c(j.yua, this.yuj.ctu());
    localc.fN("oauth_token", parami.token);
    localc.fN("oauth_verifier", paramk.value);
    this.yui.xI("setting token to: " + parami + " and verifier to: " + paramk);
    a(localc, parami);
    b(localc);
    parami = localc.ctz();
    return new org.a.c.g().Zl(parami.getBody());
  }
  
  public final void a(i parami, org.a.d.c paramc)
  {
    this.yui.xI("signing request: " + paramc.ctx());
    if (("".equals(parami.token)) && ("".equals(parami.uDu))) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        paramc.fN("oauth_token", parami.token);
      }
      this.yui.xI("setting token to: " + parami);
      a(paramc, parami);
      b(paramc);
      return;
    }
  }
  
  public final String b(i parami)
  {
    return this.yuj.b(parami);
  }
  
  public final i ctE()
  {
    this.yui.xI("obtaining request token from " + this.yuj.ctt());
    Object localObject = new org.a.d.c(j.yua, this.yuj.ctt());
    this.yui.xI("setting oauth_callback to " + this.yui.ytD);
    ((org.a.d.c)localObject).fN("oauth_callback", this.yui.ytD);
    a((org.a.d.c)localObject, org.a.d.b.ytJ);
    b((org.a.d.c)localObject);
    this.yui.xI("sending request...");
    localObject = ((org.a.d.c)localObject).ctz();
    String str = ((org.a.d.g)localObject).getBody();
    this.yui.xI("response status code: " + ((org.a.d.g)localObject).code);
    this.yui.xI("response body: " + str);
    return new org.a.c.g().Zl(str);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */