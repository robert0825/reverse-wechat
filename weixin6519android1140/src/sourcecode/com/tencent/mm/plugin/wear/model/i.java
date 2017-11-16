package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.g;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.LinkedList;

public final class i
{
  private g.a eHc;
  private g.b eHd;
  AudioManager fMS;
  public a rAk;
  BroadcastReceiver rAl;
  
  public i()
  {
    GMTrace.i(9193377497088L, 68496);
    this.eHc = new g.a()
    {
      public final void onCompletion()
      {
        GMTrace.i(9196867158016L, 68522);
        i.this.rAk.lbS.a(null);
        i.this.rAk.lbS.a(null);
        i.this.b(i.this.rAk);
        GMTrace.o(9196867158016L, 68522);
      }
    };
    this.eHd = new g.b()
    {
      public final void onError()
      {
        GMTrace.i(9179821506560L, 68395);
        i.this.rAk.lbS.a(null);
        i.this.rAk.lbS.a(null);
        i.this.b(i.this.rAk);
        GMTrace.o(9179821506560L, 68395);
      }
    };
    this.rAl = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(9184519127040L, 68430);
        if ((paramAnonymousIntent.hasExtra("state")) && (paramAnonymousIntent.getIntExtra("state", 2) == 0)) {
          i.this.bBu();
        }
        GMTrace.o(9184519127040L, 68430);
      }
    };
    this.fMS = ((AudioManager)ab.getContext().getSystemService("audio"));
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
    ab.getContext().registerReceiver(this.rAl, localIntentFilter);
    GMTrace.o(9193377497088L, 68496);
  }
  
  private static a a(a parama)
  {
    GMTrace.i(9193645932544L, 68498);
    if (parama != null)
    {
      parama.lbS.stop();
      parama.lbS.a(null);
      parama.lbS.a(null);
      parama.rAn.clear();
    }
    GMTrace.o(9193645932544L, 68498);
    return null;
  }
  
  public final void b(a parama)
  {
    GMTrace.i(9193780150272L, 68499);
    while (parama != null) {
      if (parama.rAn.size() > 0)
      {
        au localau = (au)parama.rAn.getLast();
        parama.rAn.removeLast();
        q.D(localau);
        String str = q.getFullPath(localau.field_imgPath);
        w.i("MicroMsg.Wear.WearVoicePlayLogic", "play: msgid=%d, fullpath=%s", new Object[] { Long.valueOf(localau.field_msgId), str });
        if (parama.lbS.a(str, true, true, -1))
        {
          parama.lbS.a(this.eHc);
          parama.lbS.a(this.eHd);
          GMTrace.o(9193780150272L, 68499);
        }
      }
      else
      {
        a(parama);
      }
    }
    GMTrace.o(9193780150272L, 68499);
  }
  
  public final void bBu()
  {
    GMTrace.i(9193511714816L, 68497);
    a(this.rAk);
    GMTrace.o(9193511714816L, 68497);
  }
  
  private final class a
  {
    g lbS;
    LinkedList<au> rAn;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */