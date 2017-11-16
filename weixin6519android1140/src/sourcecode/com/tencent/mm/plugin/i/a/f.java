package com.tencent.mm.plugin.i.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.ArrayList;
import java.util.List;

public final class f
  extends a
{
  public f()
  {
    GMTrace.i(20662282354688L, 153946);
    GMTrace.o(20662282354688L, 153946);
  }
  
  protected final List<com.tencent.mm.plugin.i.b.a> I(au paramau)
  {
    GMTrace.i(20662416572416L, 153947);
    if (paramau == null)
    {
      GMTrace.o(20662416572416L, 153947);
      return null;
    }
    com.tencent.mm.plugin.i.b.a locala = J(paramau);
    paramau = q.getFullPath(paramau.field_imgPath);
    long l = e.aY(paramau);
    locala.field_msgSubType = 10;
    locala.field_path = tH(paramau);
    locala.field_size = l;
    w.i("MicroMsg.VoiceMsgHandler", "%s create voice wx file index voice[%s]", new Object[] { aiJ(), locala });
    paramau = new ArrayList();
    paramau.add(locala);
    GMTrace.o(20662416572416L, 153947);
    return paramau;
  }
  
  protected final String aiJ()
  {
    GMTrace.i(20662550790144L, 153948);
    String str = "voice_" + hashCode();
    GMTrace.o(20662550790144L, 153948);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */