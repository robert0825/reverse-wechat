package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.a.a;
import com.google.android.gms.wearable.b.a;
import com.google.android.gms.wearable.c.b;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.k.a;
import com.google.android.gms.wearable.n.b;
import com.google.android.gms.wearable.n.c;
import com.google.android.gms.wearable.q.a;
import com.google.android.gms.wearable.r.a;
import java.util.List;

final class ap<T>
  extends w.a
{
  q.a aCg;
  r.a aCh;
  c.b aCi;
  k.a aCj;
  n.b aCk;
  n.c aCl;
  b.a aCm;
  a.a aCn;
  final IntentFilter[] aCo;
  final String aCp;
  final String aCq;
  
  public final void a(DataHolder paramDataHolder)
  {
    if (this.aCi != null) {
      try
      {
        this.aCi.a(new e(paramDataHolder));
        return;
      }
      finally
      {
        paramDataHolder.close();
      }
    }
    paramDataHolder.close();
  }
  
  public final void a(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable) {}
  
  public final void a(AncsNotificationParcelable paramAncsNotificationParcelable) {}
  
  public final void a(CapabilityInfoParcelable paramCapabilityInfoParcelable) {}
  
  public final void a(ChannelEventParcelable paramChannelEventParcelable)
  {
    if (this.aCm != null) {
      paramChannelEventParcelable.a(this.aCm);
    }
  }
  
  public final void a(MessageEventParcelable paramMessageEventParcelable)
  {
    if (this.aCj != null) {
      this.aCj.a(paramMessageEventParcelable);
    }
  }
  
  public final void a(NodeParcelable paramNodeParcelable)
  {
    if (this.aCk != null) {
      this.aCk.a(paramNodeParcelable);
    }
  }
  
  public final void b(NodeParcelable paramNodeParcelable)
  {
    if (this.aCk != null) {
      this.aCk.b(paramNodeParcelable);
    }
  }
  
  public final void n(List<NodeParcelable> paramList) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */