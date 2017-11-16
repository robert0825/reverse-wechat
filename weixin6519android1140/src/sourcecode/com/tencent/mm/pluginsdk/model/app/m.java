package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.x.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public final class m
  implements t
{
  private List<String> tnD;
  public Vector<String> toc;
  private volatile boolean tod;
  
  public m()
  {
    GMTrace.i(814835826688L, 6071);
    this.tod = false;
    this.toc = new Vector();
    this.tnD = new ArrayList();
    a.aGk().a(1, this);
    GMTrace.o(814835826688L, 6071);
  }
  
  private void aFX()
  {
    int i = 20;
    GMTrace.i(815238479872L, 6074);
    if (this.tod)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppSettingService", "tryDoScene fail, doing Scene");
      GMTrace.o(815238479872L, 6074);
      return;
    }
    if (this.toc.size() <= 0)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppSettingService", "tryDoScene fail, appIdList is empty");
      GMTrace.o(815238479872L, 6074);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppSettingService", "tryDoScene, appid list size = " + this.toc.size());
    int j = this.toc.size();
    if (j > 20) {}
    for (;;)
    {
      this.tod = true;
      this.tnD.addAll(this.toc.subList(0, i));
      x localx = new x(1, new ae(this.tnD));
      h.xx().fYr.a(localx, 0);
      GMTrace.o(815238479872L, 6074);
      return;
      i = j;
    }
  }
  
  public final void LD(String paramString)
  {
    GMTrace.i(814970044416L, 6072);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppSettingService", "appId = " + paramString);
    if (bg.nm(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSettingService", "add appId is null");
      GMTrace.o(814970044416L, 6072);
      return;
    }
    if (!this.toc.contains(paramString)) {
      this.toc.add(paramString);
    }
    aFX();
    GMTrace.o(814970044416L, 6072);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, w paramw)
  {
    GMTrace.i(815372697600L, 6075);
    if (paramw.getType() != 1)
    {
      GMTrace.o(815372697600L, 6075);
      return;
    }
    this.tod = false;
    paramString = ((ae)paramw).tov;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppSettingService", "onSceneEnd, list size = " + paramString.size());
    this.toc.removeAll(this.tnD);
    this.tnD.clear();
    aFX();
    GMTrace.o(815372697600L, 6075);
  }
  
  public final void bX(List<String> paramList)
  {
    GMTrace.i(815104262144L, 6073);
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSettingService", "addAll list is null");
      GMTrace.o(815104262144L, 6073);
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((!bg.nm(str)) && (!this.toc.contains(str))) {
        this.toc.add(str);
      }
    }
    aFX();
    GMTrace.o(815104262144L, 6073);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */