package com.tencent.mm.plugin.gallery.stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.k.b;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.report.service.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class GalleryStubService
  extends Service
{
  private a.a lCe;
  
  public GalleryStubService()
  {
    GMTrace.i(11975039909888L, 89221);
    this.lCe = new a.a()
    {
      public final void Z(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(11975442563072L, 89224);
        com.tencent.mm.plugin.report.service.g.ork.A(paramAnonymousInt, paramAnonymousString);
        GMTrace.o(11975442563072L, 89224);
      }
      
      public final void a(String paramAnonymousString1, String paramAnonymousString2, boolean paramAnonymousBoolean1, int paramAnonymousInt, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(11975576780800L, 89225);
        if (a.vgX != null)
        {
          ig localig = new ig();
          localig.eLH.eLI = Boolean.valueOf(paramAnonymousBoolean1);
          localig.eLH.imagePath = paramAnonymousString1;
          localig.eLH.eLJ = paramAnonymousInt;
          localig.eLH.toUser = paramAnonymousString2;
          localig.eLH.eLK = Boolean.valueOf(paramAnonymousBoolean2);
          a.vgX.m(localig);
        }
        GMTrace.o(11975576780800L, 89225);
      }
      
      public final void aDr()
      {
        GMTrace.i(11975710998528L, 89226);
        f.tq(19);
        GMTrace.o(11975710998528L, 89226);
      }
      
      public final int aDs()
      {
        GMTrace.i(11975845216256L, 89227);
        int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitVideoSize"), 20971520);
        GMTrace.o(11975845216256L, 89227);
        return i;
      }
      
      public final boolean eK(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11976247869440L, 89230);
        at.AR();
        paramAnonymousBoolean = c.xh().getBoolean(w.a.vwi, paramAnonymousBoolean);
        GMTrace.o(11976247869440L, 89230);
        return paramAnonymousBoolean;
      }
      
      public final int ua()
      {
        GMTrace.i(11976113651712L, 89229);
        int i = b.ua();
        GMTrace.o(11976113651712L, 89229);
        return i;
      }
      
      public final int ub()
      {
        GMTrace.i(11975979433984L, 89228);
        int i = b.ub();
        GMTrace.o(11975979433984L, 89228);
        return i;
      }
      
      public final int zh(String paramAnonymousString)
      {
        GMTrace.i(15104863109120L, 112540);
        PInt localPInt = new PInt();
        com.tencent.mm.modelvideo.t.a(paramAnonymousString, localPInt, new PInt());
        int i = localPInt.value;
        GMTrace.o(15104863109120L, 112540);
        return i;
      }
    };
    GMTrace.o(11975039909888L, 89221);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(11975174127616L, 89222);
    w.d("MicroMsg.GalleryStubService", "on bind, intent[%s]", new Object[] { paramIntent });
    paramIntent = this.lCe;
    GMTrace.o(11975174127616L, 89222);
    return paramIntent;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\stub\GalleryStubService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */