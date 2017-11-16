package com.tencent.mm.plugin.wear.model.a;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.s;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.c.au;
import com.google.android.gms.c.au.a;
import com.google.android.gms.c.av;
import com.google.android.gms.c.be;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.c.a;
import com.google.android.gms.common.api.c.a.1;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.api.v.a;
import com.google.android.gms.common.api.v.b;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c.d;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.k;
import com.google.android.gms.wearable.k.b;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.n.a;
import com.google.android.gms.wearable.p;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class a
  implements b
{
  private com.google.android.gms.common.api.c rAp;
  
  public a()
  {
    GMTrace.i(9210423148544L, 68623);
    c.a locala = new c.a(ab.getContext());
    Object localObject1 = p.axX;
    locala.agW.put(localObject1, null);
    locala.agQ.addAll(((com.google.android.gms.common.api.a)localObject1).jF().jH());
    boolean bool;
    Object localObject2;
    if (!locala.agW.isEmpty())
    {
      bool = true;
      com.google.android.gms.common.internal.w.c(bool, "must call addApi() to add at least one API");
      if (locala.agY < 0) {
        break label220;
      }
      localObject2 = new com.google.android.gms.common.api.o(locala.mContext.getApplicationContext(), locala.ahb, locala.jP(), locala.ahc, locala.ahd, locala.agW, locala.ahe, locala.ahf, locala.agY, -1);
      localObject1 = u.a(locala.agX);
      if (localObject1 != null) {
        break label209;
      }
      new Handler(locala.mContext.getMainLooper()).post(new c.a.1(locala, (com.google.android.gms.common.api.c)localObject2));
    }
    for (;;)
    {
      this.rAp = ((com.google.android.gms.common.api.c)localObject2);
      GMTrace.o(9210423148544L, 68623);
      return;
      bool = false;
      break;
      label209:
      locala.a((u)localObject1, (com.google.android.gms.common.api.c)localObject2);
      continue;
      label220:
      if (locala.agZ >= 0)
      {
        v localv = v.c(locala.agX);
        int i = locala.agZ;
        if (localv.aG() != null)
        {
          localObject1 = localv.bX(i);
          if (localObject1 != null)
          {
            localObject2 = ((v.a)localObject1).aiQ;
            label269:
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = new com.google.android.gms.common.api.o(locala.mContext.getApplicationContext(), locala.ahb, locala.jP(), locala.ahc, locala.ahd, locala.agW, locala.ahe, locala.ahf, -1, locala.agZ);
            }
            i = locala.agZ;
            localObject2 = locala.aha;
            com.google.android.gms.common.internal.w.j(localObject1, "GoogleApiClient instance cannot be null");
            if (localv.aiO.indexOfKey(i) >= 0) {
              break label450;
            }
          }
        }
        label450:
        for (bool = true;; bool = false)
        {
          com.google.android.gms.common.internal.w.b(bool, "Already managing a GoogleApiClient with id " + i);
          localObject2 = new v.b((com.google.android.gms.common.api.c)localObject1, (c.c)localObject2);
          localv.aiO.put(i, localObject2);
          localObject2 = localObject1;
          if (localv.aG() == null) {
            break;
          }
          android.support.v4.app.t.DEBUG = false;
          localv.aI().a(i, localv);
          localObject2 = localObject1;
          break;
          localObject2 = null;
          break label269;
        }
      }
      localObject2 = new com.google.android.gms.common.api.o(locala.mContext, locala.ahb, locala.jP(), locala.ahc, locala.ahd, locala.agW, locala.ahe, locala.ahf, -1, -1);
    }
  }
  
  public final byte[] a(Asset paramAsset)
  {
    GMTrace.i(9210825801728L, 68626);
    paramAsset = (c.d)p.aAs.a(bBw(), paramAsset).jS();
    Status localStatus = paramAsset.jT();
    if (!localStatus.isSuccess())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.Wear.GlobalConnection", "read asset data not success errorCode=%d | errorMsg=%s", new Object[] { Integer.valueOf(localStatus.agz), localStatus.ahr });
      GMTrace.o(9210825801728L, 68626);
      return null;
    }
    paramAsset = com.tencent.mm.loader.stub.b.c(paramAsset.getInputStream());
    GMTrace.o(9210825801728L, 68626);
    return paramAsset;
  }
  
  public final void bBv()
  {
    GMTrace.i(18826720706560L, 140270);
    this.rAp.disconnect();
    bBw();
    GMTrace.o(18826720706560L, 140270);
  }
  
  public final com.google.android.gms.common.api.c bBw()
  {
    GMTrace.i(9210691584000L, 68625);
    if (!this.rAp.isConnected())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.GlobalConnection", "connect to google api client");
      localObject = this.rAp.a(TimeUnit.SECONDS);
      if (!((ConnectionResult)localObject).isSuccess()) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.Wear.GlobalConnection", "google api client connect error, code=%d, ", new Object[] { Integer.valueOf(((ConnectionResult)localObject).agz) });
      }
    }
    Object localObject = this.rAp;
    GMTrace.o(9210691584000L, 68625);
    return (com.google.android.gms.common.api.c)localObject;
  }
  
  public final HashSet<String> bBx()
  {
    GMTrace.i(9211094237184L, 68628);
    HashSet localHashSet = new HashSet();
    Object localObject = (n.a)p.aAv.b(bBw()).jS();
    if (localObject != null)
    {
      localObject = ((n.a)localObject).nd().iterator();
      while (((Iterator)localObject).hasNext()) {
        localHashSet.add(((m)((Iterator)localObject).next()).getId());
      }
    }
    GMTrace.o(9211094237184L, 68628);
    return localHashSet;
  }
  
  public final boolean bBy()
  {
    GMTrace.i(9211496890368L, 68631);
    if (!bBw().isConnected())
    {
      GMTrace.o(9211496890368L, 68631);
      return false;
    }
    if (bBx().size() == 0)
    {
      GMTrace.o(9211496890368L, 68631);
      return false;
    }
    GMTrace.o(9211496890368L, 68631);
    return true;
  }
  
  public final void bBz()
  {
    GMTrace.i(18826854924288L, 140271);
    com.google.android.gms.wearable.h localh = (com.google.android.gms.wearable.h)p.aAs.a(bBw()).jS();
    Iterator localIterator = localh.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      String str = localf.getUri().toString();
      if (str.startsWith("/wechat"))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.GlobalConnection", "delete data item %s", new Object[] { str });
        p.aAs.b(bBw(), localf.getUri());
      }
    }
    localh.release();
    GMTrace.o(18826854924288L, 140271);
  }
  
  public final void finish()
  {
    GMTrace.i(9211631108096L, 68632);
    this.rAp.disconnect();
    GMTrace.o(9211631108096L, 68632);
  }
  
  public final boolean g(Uri paramUri)
  {
    GMTrace.i(9211362672640L, 68630);
    p.aAs.b(bBw(), paramUri);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.GlobalConnection", "delete data item %s", new Object[] { paramUri });
    GMTrace.o(9211362672640L, 68630);
    return true;
  }
  
  public final boolean isAvailable()
  {
    GMTrace.i(9210557366272L, 68624);
    if ((com.tencent.mm.plugin.wear.model.h.aqZ()) || (com.tencent.mm.plugin.wear.model.h.aqY()))
    {
      GMTrace.o(9210557366272L, 68624);
      return true;
    }
    GMTrace.o(9210557366272L, 68624);
    return false;
  }
  
  public final b.a s(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(9210960019456L, 68627);
    Object localObject = bBx();
    b.a locala = new b.a();
    Iterator localIterator = ((HashSet)localObject).iterator();
    String str;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!bBw().isConnected())
      {
        localObject = new b.a((byte)0);
        label75:
        if (((b.a)localObject).code == 0) {
          break label232;
        }
      }
    }
    for (;;)
    {
      GMTrace.o(9210960019456L, 68627);
      return (b.a)localObject;
      localObject = new b.a();
      Status localStatus = ((k.b)p.aAu.a(bBw(), str, paramString, paramArrayOfByte).b(TimeUnit.SECONDS)).jT();
      if (!localStatus.isSuccess())
      {
        ((b.a)localObject).code = 131072;
        ((b.a)localObject).eAR = localStatus.ahr;
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.Wear.GlobalConnection", "send message not success errorCode=%d | errorMsg=%s", new Object[] { Integer.valueOf(localStatus.agz), localStatus.ahr });
      }
      if (paramArrayOfByte == null) {}
      for (int i = 0;; i = paramArrayOfByte.length)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Wear.GlobalConnection", "send Message %s %s %d", new Object[] { str, paramString, Integer.valueOf(i) });
        break label75;
        label232:
        break;
      }
      localObject = locala;
    }
  }
  
  public final b.a t(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(9211228454912L, 68629);
    if (!bBw().isConnected())
    {
      paramString = new b.a((byte)0);
      GMTrace.o(9211228454912L, 68629);
      return paramString;
    }
    paramString = new com.google.android.gms.wearable.o(PutDataRequest.aE(paramString));
    paramString.aAo.putLong("key_timestamp", System.currentTimeMillis());
    paramString.aAo.a("key_data", Asset.i(paramArrayOfByte));
    paramArrayOfByte = paramString.aAo;
    Object localObject1 = new av();
    Object localObject2 = new ArrayList();
    ((av)localObject1).awu = au.a(paramArrayOfByte, (List)localObject2);
    paramArrayOfByte = new au.a((av)localObject1, (List)localObject2);
    paramString.aAp.aAe = be.c(paramArrayOfByte.aws);
    int j = paramArrayOfByte.awt.size();
    int i = 0;
    while (i < j)
    {
      localObject1 = Integer.toString(i);
      localObject2 = (Asset)paramArrayOfByte.awt.get(i);
      if (localObject1 == null) {
        throw new IllegalStateException("asset key cannot be null: " + localObject2);
      }
      if (localObject2 == null) {
        throw new IllegalStateException("asset cannot be null: key=" + (String)localObject1);
      }
      if (Log.isLoggable("DataMap", 3)) {
        new StringBuilder("asPutDataRequest: adding asset: ").append((String)localObject1).append(" ").append(localObject2);
      }
      paramString.aAp.b((String)localObject1, (Asset)localObject2);
      i += 1;
    }
    paramString = paramString.aAp;
    p.aAs.a(bBw(), paramString);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Wear.GlobalConnection", "send data request path=%s | length=%d", new Object[] { paramString.mUri.getPath(), Integer.valueOf(paramString.aAe.length) });
    paramString = new b.a();
    GMTrace.o(9211228454912L, 68629);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */