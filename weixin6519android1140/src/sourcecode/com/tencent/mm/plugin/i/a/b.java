package com.tencent.mm.plugin.i.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends a
{
  public b()
  {
    GMTrace.i(20661477048320L, 153940);
    GMTrace.o(20661477048320L, 153940);
  }
  
  protected final List<com.tencent.mm.plugin.i.b.a> I(au paramau)
  {
    Object localObject2 = null;
    GMTrace.i(20661611266048L, 153941);
    if (paramau == null)
    {
      GMTrace.o(20661611266048L, 153941);
      return null;
    }
    Object localObject1 = bg.Sx(paramau.field_content);
    if (localObject1 != null) {}
    for (localObject1 = f.a.eS((String)localObject1);; localObject1 = null)
    {
      if (localObject1 == null)
      {
        w.e("MicroMsg.AppMsgImgMsgHandler", "content is null");
        GMTrace.o(20661611266048L, 153941);
        return null;
      }
      com.tencent.mm.plugin.i.b.a locala = J(paramau);
      com.tencent.mm.pluginsdk.model.app.b localb = an.afP().Op(((f.a)localObject1).eAE);
      long l = 0L;
      localObject1 = localObject2;
      if (localb != null)
      {
        localObject1 = localb.field_fileFullPath;
        l = e.aY((String)localObject1);
      }
      locala.field_msgSubType = 30;
      locala.field_path = tH((String)localObject1);
      locala.field_size = l;
      localObject1 = n.IZ().x(paramau.field_imgPath, true);
      l = e.aY((String)localObject1);
      paramau = J(paramau);
      paramau.field_msgSubType = 31;
      paramau.field_path = tH((String)localObject1);
      paramau.field_size = l;
      w.i("MicroMsg.AppMsgImgMsgHandler", "%s create app msg wx file index app[%s] thumb[%s]", new Object[] { aiJ(), locala, paramau });
      localObject1 = new ArrayList();
      ((List)localObject1).add(locala);
      ((List)localObject1).add(paramau);
      GMTrace.o(20661611266048L, 153941);
      return (List<com.tencent.mm.plugin.i.b.a>)localObject1;
    }
  }
  
  protected final String aiJ()
  {
    GMTrace.i(20661745483776L, 153942);
    String str = "AppMsgImg_" + hashCode();
    GMTrace.o(20661745483776L, 153942);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */