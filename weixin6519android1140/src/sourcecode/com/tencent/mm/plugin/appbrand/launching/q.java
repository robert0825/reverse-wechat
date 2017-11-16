package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.t;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.config.r.2;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Locale;

final class q
  extends l<Pair<WxaAttributes, Boolean>>
{
  private String appId;
  private final String hQy;
  private final int hZb;
  private final int iqC;
  private final int iqd;
  private String username;
  
  q(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    GMTrace.i(20671006507008L, 154011);
    this.username = paramString1;
    this.appId = paramString2;
    this.hZb = paramInt1;
    this.iqC = paramInt2;
    this.iqd = paramInt3;
    this.hQy = paramString3;
    GMTrace.o(20671006507008L, 154011);
  }
  
  public final Pair<WxaAttributes, Boolean> Yw()
  {
    GMTrace.i(20671140724736L, 154012);
    boolean bool1 = false;
    if (!bg.nm(this.username))
    {
      this.appId = com.tencent.mm.plugin.appbrand.config.q.pu(this.username);
      bool1 = bg.nm(this.appId);
    }
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = this.appId;
      if (this.hZb == 0)
      {
        localObject2 = com.tencent.mm.plugin.appbrand.app.e.Sl().a((String)localObject1, 0, new String[] { "version", "pkgPath", "versionMd5" });
        if (localObject2 == null)
        {
          w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, get null manifest record by appId %s, forceSync", new Object[] { localObject1 });
          bool1 = true;
        }
      }
    }
    for (;;)
    {
      long l1 = bg.Pv();
      if (!bg.nm(this.appId))
      {
        localObject1 = this.appId;
        localObject1 = r.a((String)localObject1, bool1, new r.2((String)localObject1));
        label147:
        if (((Pair)localObject1).first != null) {
          break label742;
        }
        int i = o.i.hGk;
        if (((Pair)localObject1).second != null) {
          break label691;
        }
        localObject2 = "";
        label171:
        m.rb(m.e(i, new Object[] { localObject2 }));
        com.tencent.mm.plugin.appbrand.report.a.x("", 7, this.hZb + 1);
      }
      for (;;)
      {
        if ((!bool1) && (((Pair)localObject1).first != null))
        {
          if (bg.nm(this.username)) {
            this.username = ((WxaAttributes)((Pair)localObject1).first).field_username;
          }
          r.pC(this.username);
        }
        if ((!bool1) || (((Pair)localObject1).second == null) || (((a.a)((Pair)localObject1).second).errType != 2)) {
          break label795;
        }
        m.rb(m.e(o.i.hGk, new Object[] { String.format(Locale.US, "(%d,%d)", new Object[] { Integer.valueOf(((a.a)((Pair)localObject1).second).errType), Integer.valueOf(((a.a)((Pair)localObject1).second).errCode) }) }));
        localObject1 = Pair.create(null, Boolean.valueOf(true));
        GMTrace.o(20671140724736L, 154012);
        return (Pair<WxaAttributes, Boolean>)localObject1;
        if ((this.iqC > 0) && (this.iqC > ((t)localObject2).field_version))
        {
          w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, preferVersion[%d], localVersion[%d], forceSync", new Object[] { Integer.valueOf(this.iqC), Integer.valueOf(((t)localObject2).field_version) });
          bool1 = true;
          break;
        }
        if ((com.tencent.mm.a.e.aZ(((t)localObject2).field_pkgPath)) && (((t)localObject2).field_versionMd5.equals(g.bg(((t)localObject2).field_pkgPath))))
        {
          bool1 = true;
          label442:
          if (!bool1) {
            b.deleteFile(((t)localObject2).field_pkgPath);
          }
          if (bg.nm(this.hQy)) {
            break label542;
          }
          if ((!bool1) || (!com.tencent.mm.plugin.appbrand.appcache.a.aA(((t)localObject2).field_pkgPath, this.hQy))) {
            break label532;
          }
        }
        label532:
        for (boolean bool2 = true;; bool2 = false)
        {
          w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, latestPkgExists[%B], enterPath[%s], pathAccessible[%B]", new Object[] { Boolean.valueOf(bool1), this.hQy, Boolean.valueOf(bool2) });
          if (bool2) {
            break label537;
          }
          bool1 = true;
          break;
          bool1 = false;
          break label442;
        }
        label537:
        bool1 = false;
        break;
        label542:
        if (bool1) {
          w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "local available pkg version[%d] LATEST, no need force update", new Object[] { Integer.valueOf(((t)localObject2).field_version) });
        }
        for (;;)
        {
          bool1 = false;
          break;
          localObject1 = n.ol((String)localObject1);
          if (localObject1 == null)
          {
            w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, no local available pkg, force update");
            bool1 = true;
            break;
          }
          if ((this.iqC > 0) && (this.iqC > ((WxaPkgWrappingInfo)localObject1).hKC))
          {
            w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, local available pkg version[%d], preferred version[%d], force update", new Object[] { Integer.valueOf(((WxaPkgWrappingInfo)localObject1).hKC), Integer.valueOf(this.iqC) });
            bool1 = true;
            break;
          }
          w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, local available pkg version[%d], no need force update", new Object[] { Integer.valueOf(((WxaPkgWrappingInfo)localObject1).hKC) });
        }
        localObject1 = r.J(this.username, bool1);
        break label147;
        label691:
        localObject2 = String.format(Locale.US, "(%d,%d)", new Object[] { Integer.valueOf(((a.a)((Pair)localObject1).second).errType), Integer.valueOf(((a.a)((Pair)localObject1).second).errCode) });
        break label171;
        label742:
        long l2 = bg.Pv();
        if (((Pair)localObject1).second != null) {
          h.a(h.a.iqn, this.appId, ((WxaAttributes)((Pair)localObject1).first).UF().eVc, this.hZb, this.iqd, l2 - l1);
        }
      }
      label795:
      localObject2 = ((Pair)localObject1).first;
      if (((Pair)localObject1).second != null) {}
      for (bool1 = true;; bool1 = false)
      {
        localObject1 = Pair.create(localObject2, Boolean.valueOf(bool1));
        GMTrace.o(20671140724736L, 154012);
        return (Pair<WxaAttributes, Boolean>)localObject1;
      }
    }
  }
  
  final String getTag()
  {
    GMTrace.i(17334085353472L, 129149);
    GMTrace.o(17334085353472L, 129149);
    return "MicroMsg.AppBrand.PrepareStepGetWxaAttrs";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */