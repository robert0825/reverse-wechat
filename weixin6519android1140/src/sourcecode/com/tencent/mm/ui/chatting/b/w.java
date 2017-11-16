package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.ViewStub;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.j;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.chatting.cv;
import com.tencent.mm.ui.chatting.ed;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.ak.d;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;

public final class w
{
  public boolean jrl;
  public ak.d quN;
  public ChatFooter.c wKh;
  public h wtd;
  public com.tencent.mm.ui.chatting.p wyS;
  
  public w(h paramh)
  {
    GMTrace.i(19198638030848L, 143041);
    this.wyS = null;
    this.jrl = false;
    this.quN = new ak.d()
    {
      public final void j(String paramAnonymousString, final long paramAnonymousLong)
      {
        GMTrace.i(19206959529984L, 143103);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChattingUI.VoiceImp", "onVoiceRemind " + paramAnonymousString + " time " + paramAnonymousLong);
        if (s.ga(at.getNotification().rx())) {
          com.tencent.mm.ui.base.h.a(w.this.wtd.cdg().vKB.vKW, false, paramAnonymousString, w.this.wtd.cdg().vKB.vKW.getString(R.l.ehd), w.this.wtd.cdg().vKB.vKW.getString(R.l.eha), w.this.wtd.cdg().vKB.vKW.getString(R.l.ehc), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, final int paramAnonymous2Int)
            {
              GMTrace.i(19204543610880L, 143085);
              at.AR();
              if (com.tencent.mm.y.c.yM().G(at.getNotification().rx(), paramAnonymousLong))
              {
                at.AR();
                paramAnonymous2Int = com.tencent.mm.y.c.yM().c(at.getNotification().rx(), paramAnonymousLong, w.this.wtd.cdn().gQB - w.this.wtd.cdn().getCount());
                if (paramAnonymous2Int < 0)
                {
                  GMTrace.o(19204543610880L, 143085);
                  return;
                }
                if (w.this.wtd.cdn().getCount() > paramAnonymous2Int) {
                  w.this.wtd.cdm().post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(19215683682304L, 143168);
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingUI.VoiceImp", "position " + paramAnonymous2Int);
                      l.a(w.this.wtd.cdm(), paramAnonymous2Int, false);
                      GMTrace.o(19215683682304L, 143168);
                    }
                  });
                }
              }
              GMTrace.o(19204543610880L, 143085);
            }
          }, null);
        }
        GMTrace.o(19206959529984L, 143103);
      }
    };
    this.wKh = new ChatFooter.c()
    {
      View wKm;
      
      public final void f(Boolean paramAnonymousBoolean)
      {
        GMTrace.i(19205617352704L, 143093);
        if (paramAnonymousBoolean.booleanValue())
        {
          if (this.wKm == null) {
            this.wKm = ((ViewStub)w.this.wtd.cdg().findViewById(R.h.clh)).inflate();
          }
          this.wKm.setVisibility(0);
          GMTrace.o(19205617352704L, 143093);
          return;
        }
        if ((this.wKm != null) && (this.wKm.getVisibility() == 0)) {
          this.wKm.setVisibility(8);
        }
        GMTrace.o(19205617352704L, 143093);
      }
    };
    this.wtd = paramh;
    GMTrace.o(19198638030848L, 143041);
  }
  
  public final boolean aP(au paramau)
  {
    GMTrace.i(19199309119488L, 143046);
    if (paramau.bTu())
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.u.fo(this.wtd.cdg().vKB.vKW);
        GMTrace.o(19199309119488L, 143046);
        return true;
      }
      if (paramau.field_msgId == this.wyS.wta) {
        this.wyS.lV(true);
      }
      if (!this.wtd.ccY().field_username.equals("medianote"))
      {
        at.AR();
        com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.e(paramau.field_talker, paramau.field_msgSvrId));
      }
      ed.aG(paramau);
      GMTrace.o(19199309119488L, 143046);
      return true;
    }
    GMTrace.o(19199309119488L, 143046);
    return false;
  }
  
  public final void ceN()
  {
    GMTrace.i(19198906466304L, 143043);
    if (this.wtd.cdc())
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChattingUI.VoiceImp", "trigger title icon, in show mode");
      this.wtd.cdg().lk(false);
      this.wtd.cdg().Bf(8);
      this.wtd.cdg().Ba(8);
      GMTrace.o(19198906466304L, 143043);
      return;
    }
    Object localObject;
    if (vc())
    {
      this.wtd.cdg().Ba(0);
      at.AR();
      localObject = (Boolean)com.tencent.mm.y.c.xh().get(26, null);
      if (localObject != null) {
        break label173;
      }
      this.jrl = false;
      label123:
      localObject = this.wtd.cdg();
      if (!this.jrl) {
        break label184;
      }
    }
    label173:
    label184:
    for (int i = 0;; i = 8)
    {
      ((com.tencent.mm.ui.u)localObject).Bf(i);
      GMTrace.o(19198906466304L, 143043);
      return;
      this.wtd.cdg().Ba(8);
      break;
      this.jrl = ((Boolean)localObject).booleanValue();
      break label123;
    }
  }
  
  public final void mi(boolean paramBoolean)
  {
    GMTrace.i(19199174901760L, 143045);
    if (this.wyS == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingUI.VoiceImp", "setForceSpeakOff error, autoPlay is null!!!");
      GMTrace.o(19199174901760L, 143045);
      return;
    }
    if (paramBoolean)
    {
      this.wyS.jri = false;
      this.jrl = true;
      at.AR();
      com.tencent.mm.y.c.xh().set(26, Boolean.valueOf(true));
      this.wtd.cdg().Bf(0);
      this.wtd.cbU();
      Toast.makeText(this.wtd.cdg().vKB.vKW, this.wtd.cdg().Bg(R.l.dxa), 0).show();
      this.wyS.cbS();
      this.wtd.cdg().Be(R.k.cII);
      GMTrace.o(19199174901760L, 143045);
      return;
    }
    if (!at.AS().sh()) {
      this.wyS.jri = true;
    }
    for (;;)
    {
      this.jrl = false;
      at.AR();
      com.tencent.mm.y.c.xh().set(26, Boolean.valueOf(false));
      this.wtd.cdg().Bf(8);
      this.wtd.cbU();
      Toast.makeText(this.wtd.cdg().vKB.vKW, this.wtd.cdg().Bg(R.l.dxb), 0).show();
      this.wyS.cbS();
      this.wtd.cdg().Be(R.k.cIP);
      GMTrace.o(19199174901760L, 143045);
      return;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingUI.VoiceImp", "setForceSpeakOff true but isBluetoothOn");
    }
  }
  
  public final void releaseWakeLock()
  {
    GMTrace.i(19199040684032L, 143044);
    this.wtd.cdm().setKeepScreenOn(false);
    GMTrace.o(19199040684032L, 143044);
  }
  
  public final boolean vc()
  {
    GMTrace.i(19198772248576L, 143042);
    if (this.wtd.ccV())
    {
      if (this.wtd.ccW())
      {
        bool = this.wtd.cde().fN(1);
        GMTrace.o(19198772248576L, 143042);
        return bool;
      }
      boolean bool = this.wtd.cdf().fN(1);
      GMTrace.o(19198772248576L, 143042);
      return bool;
    }
    if (((this.wtd.ccT()) && (this.wtd.ccY().fji == 0)) || (this.wtd.ccY().vc()))
    {
      GMTrace.o(19198772248576L, 143042);
      return true;
    }
    GMTrace.o(19198772248576L, 143042);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */