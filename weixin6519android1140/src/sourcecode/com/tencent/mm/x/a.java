package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public class a
  extends c
{
  public boolean gin;
  public String gio;
  
  public a()
  {
    GMTrace.i(16384360710144L, 122073);
    GMTrace.o(16384360710144L, 122073);
  }
  
  public final void a(StringBuilder paramStringBuilder, f.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
  {
    GMTrace.i(16384629145600L, 122075);
    paramStringBuilder.append("<weappinfo>");
    if (!bg.nm(parama.gkQ)) {
      paramStringBuilder.append("<pagepath>" + f.a.eT(parama.gkQ) + "</pagepath>");
    }
    paramStringBuilder.append("<username>" + bg.Sw(parama.gkR) + "</username>");
    paramStringBuilder.append("<appid>" + bg.Sw(parama.gkS) + "</appid>");
    if (parama.gkZ != 0) {
      paramStringBuilder.append("<version>" + parama.gkZ + "</version>");
    }
    if (parama.gkT != 0) {
      paramStringBuilder.append("<type>" + parama.gkT + "</type>");
    }
    if (!bg.nm(parama.gla)) {
      paramStringBuilder.append("<weappiconurl>" + f.a.eT(parama.gla) + "</weappiconurl>");
    }
    if (!bg.nm(parama.gkW)) {
      paramStringBuilder.append("<shareId>" + f.a.eT(parama.gkW) + "</shareId>");
    }
    if ((parama.gkY == 1) || (parama.gkY == 2))
    {
      paramStringBuilder.append("<pkginfo>");
      paramStringBuilder.append("<type>");
      paramStringBuilder.append(parama.gkY);
      paramStringBuilder.append("</type>");
      paramStringBuilder.append("<md5>");
      paramStringBuilder.append(parama.gkU);
      paramStringBuilder.append("</md5>");
      paramStringBuilder.append("</pkginfo>");
    }
    if (!bg.nm(parama.gkX)) {
      paramStringBuilder.append("<sharekey>" + f.a.eT(parama.gkX) + "</sharekey>");
    }
    if (this.gin)
    {
      paramStringBuilder.append("<wadynamicpageinfo>");
      paramStringBuilder.append("<shouldUseDynamicPage>1</shouldUseDynamicPage>");
      paramStringBuilder.append("<cacheKey>");
      paramStringBuilder.append(f.a.eT(this.gio));
      paramStringBuilder.append("</cacheKey>");
      paramStringBuilder.append("</wadynamicpageinfo>");
    }
    paramStringBuilder.append("</weappinfo>");
    GMTrace.o(16384629145600L, 122075);
  }
  
  public final void a(Map<String, String> paramMap, f.a parama)
  {
    GMTrace.i(16384763363328L, 122076);
    if (bg.getInt((String)paramMap.get(".msg.appmsg.weappinfo.wadynamicpageinfo.shouldUseDynamicPage"), 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.gin = bool;
      this.gio = ((String)paramMap.get(".msg.appmsg.weappinfo.wadynamicpageinfo.cacheKey"));
      GMTrace.o(16384763363328L, 122076);
      return;
    }
  }
  
  public final c yw()
  {
    GMTrace.i(16384494927872L, 122074);
    a locala = new a();
    locala.gin = this.gin;
    locala.gio = this.gio;
    GMTrace.o(16384494927872L, 122074);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */