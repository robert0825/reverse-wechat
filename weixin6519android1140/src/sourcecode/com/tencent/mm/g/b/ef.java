package com.tencent.mm.g.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import junit.framework.Assert;

public final class ef
  extends g
{
  private static ef fIu;
  private static HashMap<Integer, g.d> fIv;
  
  static
  {
    GMTrace.i(4170010591232L, 31069);
    fIu = null;
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("FavItemInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4122497515520L, 30715);
        String str = i.a(ba.qM(), "FavItemInfo");
        GMTrace.o(4122497515520L, 30715);
        return new String[] { str };
      }
    });
    fIv.put(Integer.valueOf("FavSearchInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4123302821888L, 30721);
        String str = i.a(bb.qM(), "FavSearchInfo");
        GMTrace.o(4123302821888L, 30721);
        return new String[] { str };
      }
    });
    fIv.put(Integer.valueOf("FavEditInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4114310234112L, 30654);
        String str = i.a(az.qM(), "FavEditInfo");
        GMTrace.o(4114310234112L, 30654);
        return new String[] { str };
      }
    });
    fIv.put(Integer.valueOf("FavCdnInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4138603642880L, 30835);
        String str = i.a(ax.qM(), "FavCdnInfo");
        GMTrace.o(4138603642880L, 30835);
        return new String[] { str };
      }
    });
    fIv.put(Integer.valueOf("FavConfigInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4115115540480L, 30660);
        String str = i.a(ay.qM(), "FavConfigInfo");
        GMTrace.o(4115115540480L, 30660);
        return new String[] { str };
      }
    });
    GMTrace.o(4170010591232L, 31069);
  }
  
  private ef()
  {
    GMTrace.i(4169607938048L, 31066);
    long l = System.currentTimeMillis();
    h.xw();
    if (a.ww() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      str = h.xy().cachePath + "enFavorite.db";
      w.d("MicroMsg.FavoriteDataBase", "db path", new Object[] { str });
      h.xw();
      if (a("", str, a.ww(), p.sZ(), fIv)) {
        break;
      }
      throw new com.tencent.mm.y.b((byte)0);
    }
    String str = this.vDx;
    if (!bg.nm(str))
    {
      w.e("MicroMsg.FavoriteDataBase", "dbinit failed :" + str);
      com.tencent.mm.sdk.a.b.r("init db Favorite Failed: [ " + str + "]", "DBinit");
    }
    w.d("MicroMsg.FavoriteDataBase", "init db Favorite time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(4169607938048L, 31066);
  }
  
  public static ef re()
  {
    GMTrace.i(4169742155776L, 31067);
    if (fIu == null) {
      fIu = new ef();
    }
    ef localef = fIu;
    GMTrace.o(4169742155776L, 31067);
    return localef;
  }
  
  public final void dk(String paramString)
  {
    GMTrace.i(4169876373504L, 31068);
    super.dk(paramString);
    fIu = null;
    GMTrace.o(4169876373504L, 31068);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */