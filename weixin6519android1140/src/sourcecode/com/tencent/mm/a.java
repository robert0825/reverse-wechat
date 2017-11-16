package com.tencent.mm;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.j;
import com.tencent.mm.api.k;
import com.tencent.mm.api.m;
import com.tencent.mm.api.m.a;
import com.tencent.mm.api.m.b;
import com.tencent.mm.api.m.c;
import com.tencent.mm.cache.ArtistCacheManager;
import com.tencent.mm.cache.ArtistCacheManager.1;
import com.tencent.mm.cache.ArtistCacheManager.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.view.c;
import java.util.HashMap;

public final class a
  extends m
{
  private com.tencent.mm.view.a aLf;
  private k aLg;
  
  public a()
  {
    GMTrace.i(19627597889536L, 146237);
    GMTrace.o(19627597889536L, 146237);
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(19627866324992L, 146239);
    com.tencent.mm.bl.b localb = this.aLf.ckE();
    if (!ot().oF()) {}
    for (boolean bool = true;; bool = false)
    {
      localb.a(paramj, bool);
      GMTrace.o(19627866324992L, 146239);
      return;
    }
  }
  
  public final void a(m.a parama)
  {
    GMTrace.i(19628134760448L, 146241);
    super.a(parama);
    parama = ArtistCacheManager.rR();
    String str = bg.aq(this.eqF.path, "MicroMsg.MMPhotoEditorImpl");
    parama.fMe = str;
    if (!ArtistCacheManager.fMc.containsKey(str)) {
      ArtistCacheManager.fMc.put(str, new ArtistCacheManager.a(parama));
    }
    GMTrace.o(19628134760448L, 146241);
  }
  
  public final com.tencent.mm.api.b ad(Context paramContext)
  {
    GMTrace.i(19627732107264L, 146238);
    if (this.aLf == null)
    {
      if (this.eqF.eqH != m.c.eqM) {
        break label59;
      }
      this.aLf = new c(paramContext, this.eqF);
    }
    for (;;)
    {
      paramContext = this.aLf;
      GMTrace.o(19627732107264L, 146238);
      return paramContext;
      label59:
      if (this.eqF.eqH == m.c.eqN) {
        this.aLf = new com.tencent.mm.view.b(paramContext, this.eqF);
      }
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19628268978176L, 146242);
    if (!this.eqF.eqI)
    {
      ArtistCacheManager localArtistCacheManager = ArtistCacheManager.rR();
      String str = bg.aq(this.eqF.path, "MicroMsg.MMPhotoEditorImpl");
      localArtistCacheManager.fMe = null;
      if (ArtistCacheManager.fMc.containsKey(str))
      {
        ((ArtistCacheManager.a)ArtistCacheManager.fMc.get(str)).clearAll();
        ArtistCacheManager.fMc.remove(str);
      }
      e.bRp();
      e.post(new ArtistCacheManager.1(localArtistCacheManager), "MicroMsg.ArtistCacheManager[clearAllCache]");
    }
    if (this.aLf != null) {
      this.aLf.ckE().onDestroy();
    }
    GMTrace.o(19628268978176L, 146242);
  }
  
  public final boolean os()
  {
    GMTrace.i(19628000542720L, 146240);
    boolean bool = this.aLf.ckE().os();
    GMTrace.o(19628000542720L, 146240);
    return bool;
  }
  
  public final k ot()
  {
    GMTrace.i(19628403195904L, 146243);
    if (this.aLg == null) {
      this.aLg = new com.tencent.mm.bp.a(this.aLf.ckE());
    }
    k localk = this.aLg;
    GMTrace.o(19628403195904L, 146243);
    return localk;
  }
  
  public static final class a
    implements m.b
  {
    public a()
    {
      GMTrace.i(19673500352512L, 146579);
      GMTrace.o(19673500352512L, 146579);
    }
    
    public final m ou()
    {
      GMTrace.i(19673634570240L, 146580);
      a locala = new a();
      GMTrace.o(19673634570240L, 146580);
      return locala;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */