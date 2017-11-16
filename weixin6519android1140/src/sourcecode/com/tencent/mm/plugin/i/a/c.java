package com.tencent.mm.plugin.i.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends a
{
  public c()
  {
    GMTrace.i(20660671741952L, 153934);
    GMTrace.o(20660671741952L, 153934);
  }
  
  protected final List<com.tencent.mm.plugin.i.b.a> I(au paramau)
  {
    long l = 0L;
    b localb2 = null;
    Object localObject2 = null;
    b localb1 = null;
    GMTrace.i(20660805959680L, 153935);
    if (paramau == null)
    {
      GMTrace.o(20660805959680L, 153935);
      return null;
    }
    Object localObject1 = bg.Sx(paramau.field_content);
    if (localObject1 != null) {}
    for (localObject1 = f.a.eS((String)localObject1);; localObject1 = null)
    {
      if (localObject1 == null)
      {
        w.e("MicroMsg.AppMsgMsgHandler", "content is null");
        GMTrace.o(20660805959680L, 153935);
        return null;
      }
      com.tencent.mm.plugin.i.b.a locala = J(paramau);
      int i;
      switch (((f.a)localObject1).type)
      {
      case 3: 
      case 4: 
      case 5: 
      default: 
        GMTrace.o(20660805959680L, 153935);
        return null;
      case 2: 
        localb2 = an.afP().Op(((f.a)localObject1).eAE);
        localObject1 = localb1;
        if (localb2 != null)
        {
          localObject1 = localb2.field_fileFullPath;
          l = e.aY((String)localObject1);
        }
        locala.field_msgSubType = 30;
        locala.field_path = tH((String)localObject1);
        locala.field_size = l;
        i = 31;
      }
      for (;;)
      {
        localObject1 = n.IZ().x(paramau.field_imgPath, true);
        l = e.aY((String)localObject1);
        paramau = J(paramau);
        paramau.field_msgSubType = i;
        paramau.field_path = tH((String)localObject1);
        paramau.field_size = l;
        w.i("MicroMsg.AppMsgMsgHandler", "%s create app msg wx file index app[%s] thumb[%s]", new Object[] { aiJ(), locala, paramau });
        localObject1 = new ArrayList();
        ((List)localObject1).add(locala);
        ((List)localObject1).add(paramau);
        GMTrace.o(20660805959680L, 153935);
        return (List<com.tencent.mm.plugin.i.b.a>)localObject1;
        localb1 = an.afP().Op(((f.a)localObject1).eAE);
        localObject1 = localb2;
        if (localb1 != null)
        {
          localObject1 = localb1.field_fileFullPath;
          l = e.aY((String)localObject1);
        }
        locala.field_msgSubType = 32;
        locala.field_path = tH((String)localObject1);
        locala.field_size = l;
        i = 33;
        continue;
        localb1 = an.afP().Op(((f.a)localObject1).eAE);
        localObject1 = localObject2;
        if (localb1 != null)
        {
          localObject1 = localb1.field_fileFullPath;
          l = e.aY((String)localObject1);
        }
        locala.field_msgSubType = 34;
        locala.field_path = tH((String)localObject1);
        locala.field_size = l;
        i = 35;
      }
    }
  }
  
  protected final String aiJ()
  {
    GMTrace.i(20660940177408L, 153936);
    String str = "AppMsg_" + hashCode();
    GMTrace.o(20660940177408L, 153936);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */