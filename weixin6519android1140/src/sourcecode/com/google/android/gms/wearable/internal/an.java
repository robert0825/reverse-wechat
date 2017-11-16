package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.c.a;
import com.google.android.gms.wearable.c.c;
import com.google.android.gms.wearable.c.d;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.n.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

final class an
{
  static abstract class a<T>
    extends a
  {
    private com.google.android.gms.common.api.k.b<T> aBR;
    
    public a(com.google.android.gms.common.api.k.b<T> paramb)
    {
      this.aBR = paramb;
    }
    
    public final void aj(T paramT)
    {
      com.google.android.gms.common.api.k.b localb = this.aBR;
      if (localb != null)
      {
        localb.W(paramT);
        this.aBR = null;
      }
    }
  }
  
  static final class b
    extends an.a<c.c>
  {
    public b(com.google.android.gms.common.api.k.b<c.c> paramb)
    {
      super();
    }
    
    public final void a(DeleteDataItemsResponse paramDeleteDataItemsResponse)
    {
      aj(new bg.b(ak.cA(paramDeleteDataItemsResponse.statusCode), paramDeleteDataItemsResponse.aBr));
    }
  }
  
  static final class c
    extends an.a<n.a>
  {
    public c(com.google.android.gms.common.api.k.b<n.a> paramb)
    {
      super();
    }
    
    public final void a(GetConnectedNodesResponse paramGetConnectedNodesResponse)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(paramGetConnectedNodesResponse.aBA);
      aj(new ac.a(ak.cA(paramGetConnectedNodesResponse.statusCode), localArrayList));
    }
  }
  
  static final class d
    extends an.a<h>
  {
    public d(com.google.android.gms.common.api.k.b<h> paramb)
    {
      super();
    }
    
    public final void b(DataHolder paramDataHolder)
    {
      aj(new h(paramDataHolder));
    }
  }
  
  static final class e
    extends an.a<c.d>
  {
    public e(com.google.android.gms.common.api.k.b<c.d> paramb)
    {
      super();
    }
    
    public final void a(GetFdForAssetResponse paramGetFdForAssetResponse)
    {
      aj(new bg.c(ak.cA(paramGetFdForAssetResponse.statusCode), paramGetFdForAssetResponse.aBC));
    }
  }
  
  static final class f
    extends a
  {
    public final void f(Status paramStatus) {}
  }
  
  static final class g
    extends an.a<c.a>
  {
    private final List<FutureTask<Boolean>> aBS;
    
    g(com.google.android.gms.common.api.k.b<c.a> paramb, List<FutureTask<Boolean>> paramList)
    {
      super();
      this.aBS = paramList;
    }
    
    public final void a(PutDataResponse paramPutDataResponse)
    {
      aj(new bg.a(ak.cA(paramPutDataResponse.statusCode), paramPutDataResponse.aBB));
      if (paramPutDataResponse.statusCode != 0)
      {
        paramPutDataResponse = this.aBS.iterator();
        while (paramPutDataResponse.hasNext()) {
          ((FutureTask)paramPutDataResponse.next()).cancel(true);
        }
      }
    }
  }
  
  static final class h
    extends an.a<com.google.android.gms.wearable.k.b>
  {
    public h(com.google.android.gms.common.api.k.b<com.google.android.gms.wearable.k.b> paramb)
    {
      super();
    }
    
    public final void a(SendMessageResponse paramSendMessageResponse)
    {
      aj(new z.a(ak.cA(paramSendMessageResponse.statusCode), paramSendMessageResponse.aoi));
    }
  }
  
  static final class i
    extends an.a<Status>
  {
    public i(com.google.android.gms.common.api.k.b<Status> paramb)
    {
      super();
    }
    
    public final void a(ChannelReceiveFileResponse paramChannelReceiveFileResponse)
    {
      aj(new Status(paramChannelReceiveFileResponse.statusCode));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */