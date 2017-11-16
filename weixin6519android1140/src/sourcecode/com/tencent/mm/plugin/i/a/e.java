package com.tencent.mm.plugin.i.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.ArrayList;
import java.util.List;

public final class e
  extends a
{
  public e()
  {
    GMTrace.i(20661879701504L, 153943);
    GMTrace.o(20661879701504L, 153943);
  }
  
  protected final List<com.tencent.mm.plugin.i.b.a> I(au paramau)
  {
    GMTrace.i(20662013919232L, 153944);
    if (paramau == null)
    {
      GMTrace.o(20662013919232L, 153944);
      return null;
    }
    o.Nh();
    Object localObject = s.mk(paramau.field_imgPath);
    long l = com.tencent.mm.a.e.aY((String)localObject);
    com.tencent.mm.plugin.i.b.a locala = J(paramau);
    locala.field_msgSubType = 1;
    locala.field_path = tH((String)localObject);
    locala.field_size = l;
    o.Nh();
    localObject = s.ml(paramau.field_imgPath);
    l = com.tencent.mm.a.e.aY((String)localObject);
    paramau = J(paramau);
    paramau.field_msgSubType = 2;
    paramau.field_path = tH((String)localObject);
    paramau.field_size = l;
    w.i("MicroMsg.VideoMsgHandler", "%s create video wx file index video[%s] thumb[%s]", new Object[] { aiJ(), locala, paramau });
    localObject = new ArrayList();
    ((List)localObject).add(locala);
    ((List)localObject).add(paramau);
    GMTrace.o(20662013919232L, 153944);
    return (List<com.tencent.mm.plugin.i.b.a>)localObject;
  }
  
  protected final String aiJ()
  {
    GMTrace.i(20662148136960L, 153945);
    String str = "video_" + hashCode();
    GMTrace.o(20662148136960L, 153945);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */