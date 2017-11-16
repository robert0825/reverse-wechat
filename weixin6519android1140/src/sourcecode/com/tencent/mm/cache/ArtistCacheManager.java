package com.tencent.mm.cache;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ArtistCacheManager
  extends BroadcastReceiver
{
  private static ArtistCacheManager fMb;
  public static HashMap<String, a> fMc;
  private static HashSet<com.tencent.mm.d.a> fMd;
  public String fMe;
  
  static
  {
    GMTrace.i(19617397342208L, 146161);
    fMc = new HashMap();
    fMd = new HashSet();
    GMTrace.o(19617397342208L, 146161);
  }
  
  public ArtistCacheManager()
  {
    GMTrace.i(19616860471296L, 146157);
    GMTrace.o(19616860471296L, 146157);
  }
  
  public static ArtistCacheManager rR()
  {
    GMTrace.i(19616994689024L, 146158);
    if (fMb == null) {
      fMb = new ArtistCacheManager();
    }
    ArtistCacheManager localArtistCacheManager = fMb;
    GMTrace.o(19616994689024L, 146158);
    return localArtistCacheManager;
  }
  
  public final <T extends d> T a(com.tencent.mm.d.a parama)
  {
    Object localObject = null;
    GMTrace.i(19617128906752L, 146159);
    if (fMc.containsKey(this.fMe))
    {
      a locala = (a)fMc.get(this.fMe);
      if (!locala.fMh.containsKey(parama)) {
        switch (3.fMg[parama.ordinal()])
        {
        }
      }
      for (;;)
      {
        if (localObject != null) {
          ((d)localObject).onCreate();
        }
        if ((localObject != null) && (!locala.fMh.containsKey(parama))) {
          locala.fMh.put(parama, localObject);
        }
        parama = (d)locala.fMh.get(parama);
        GMTrace.o(19617128906752L, 146159);
        return parama;
        localObject = new b();
        continue;
        localObject = new c();
        continue;
        localObject = new g();
        continue;
        localObject = new a();
      }
    }
    w.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", new Object[] { this.fMe });
    GMTrace.o(19617128906752L, 146159);
    return null;
  }
  
  @Deprecated
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(19617263124480L, 146160);
    w.i("MicroMsg.ArtistCacheManager", "[onReceive]");
    if ((paramIntent != null) && (paramIntent.getAction().equals("com.tencent.mm.plugin.photoedit.action.clear")))
    {
      w.i("MicroMsg.ArtistCacheManager", "[clearAllCache]");
      paramContext = fMc.entrySet().iterator();
      while (paramContext.hasNext()) {
        ((a)((Map.Entry)paramContext.next()).getValue()).clearAll();
      }
      fMd.clear();
      fMb = null;
      com.tencent.mm.sdk.f.e.bRp();
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19617665777664L, 146163);
          com.tencent.mm.by.a.Xk(com.tencent.mm.compatible.util.e.fRY);
          GMTrace.o(19617665777664L, 146163);
        }
      }, "MicroMsg.ArtistCacheManager[clearAllCache]");
    }
    GMTrace.o(19617263124480L, 146160);
  }
  
  public final class a
  {
    public HashMap<com.tencent.mm.d.a, d> fMh;
    
    public a()
    {
      GMTrace.i(19616592035840L, 146155);
      this.fMh = new HashMap();
      GMTrace.o(19616592035840L, 146155);
    }
    
    public final void clearAll()
    {
      GMTrace.i(19616726253568L, 146156);
      Iterator localIterator = this.fMh.entrySet().iterator();
      while (localIterator.hasNext()) {
        ((d)((Map.Entry)localIterator.next()).getValue()).onDestroy();
      }
      GMTrace.o(19616726253568L, 146156);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\cache\ArtistCacheManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */