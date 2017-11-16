package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.modelvideo.c;
import com.tencent.mm.modelvideo.c.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.network.ab;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.pluginsdk.model.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import java.util.ArrayList;

public final class v
{
  private long wKc;
  public h wtd;
  
  public v(h paramh)
  {
    GMTrace.i(19211120279552L, 143134);
    this.wKc = -1L;
    this.wtd = paramh;
    GMTrace.o(19211120279552L, 143134);
  }
  
  public final void Q(Intent paramIntent)
  {
    GMTrace.i(19211657150464L, 143138);
    final c localc = new c();
    localc.a(this.wtd.cdg().vKB.vKW, paramIntent, new c.a()
    {
      public final void a(int paramAnonymousInt1, String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt2)
      {
        GMTrace.i(19218502254592L, 143189);
        if (paramAnonymousInt1 == -50002) {
          Toast.makeText(v.this.wtd.cdg().vKB.vKW, v.this.wtd.cdg().vKB.vKW.getString(R.l.ego), 0).show();
        }
        for (;;)
        {
          v.this.wtd.dismissDialog();
          GMTrace.o(19218502254592L, 143189);
          return;
          if (paramAnonymousInt1 < 0)
          {
            Toast.makeText(v.this.wtd.cdg().vKB.vKW, v.this.wtd.cdg().vKB.vKW.getString(R.l.egn), 0).show();
          }
          else
          {
            com.tencent.mm.modelvideo.t.b(paramAnonymousString1, paramAnonymousInt2, v.this.wtd.ccY().field_username, paramAnonymousString2);
            com.tencent.mm.modelvideo.t.mr(paramAnonymousString1);
          }
        }
      }
    });
    paramIntent = this.wtd.cdg().vKB.vKW;
    this.wtd.cdg().Bg(R.l.cUG);
    paramIntent = com.tencent.mm.ui.base.h.a(paramIntent, this.wtd.cdg().Bg(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(19217965383680L, 143185);
        localc.hab = null;
        GMTrace.o(19217965383680L, 143185);
      }
    });
    this.wtd.c(paramIntent);
    GMTrace.o(19211657150464L, 143138);
  }
  
  public final void aj(final ArrayList<String> paramArrayList)
  {
    GMTrace.i(19211388715008L, 143136);
    w.v("MicroMsg.ChattingUI.VideoImp", "send video path: %s", new Object[] { paramArrayList.toString() });
    paramArrayList = new j(this.wtd.cdg().vKB.vKW, paramArrayList, null, this.wtd.ccY().field_username, 2, new j.a()
    {
      public final void bJj()
      {
        GMTrace.i(19218233819136L, 143187);
        v.this.wtd.dismissDialog();
        GMTrace.o(19218233819136L, 143187);
      }
    });
    Object localObject = this.wtd.cdg().vKB.vKW;
    this.wtd.cdg().Bg(R.l.cUG);
    localObject = com.tencent.mm.ui.base.h.a((Context)localObject, this.wtd.cdg().Bg(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(19196490547200L, 143025);
        paramArrayList.bJh();
        GMTrace.o(19196490547200L, 143025);
      }
    });
    this.wtd.c((com.tencent.mm.ui.base.r)localObject);
    com.tencent.mm.sdk.f.e.post(paramArrayList, "ChattingUI_importMultiVideo");
    GMTrace.o(19211388715008L, 143136);
  }
  
  public final void an(final Intent paramIntent)
  {
    GMTrace.i(19211522932736L, 143137);
    w.d("MicroMsg.ChattingUI.VideoImp", "sendVedio");
    if (!ab.bv(this.wtd.cdg().vKB.vKW))
    {
      com.tencent.mm.ui.base.h.a(this.wtd.cdg().vKB.vKW, R.l.egp, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19216220553216L, 143172);
          v.this.Q(paramIntent);
          GMTrace.o(19216220553216L, 143172);
        }
      }, null);
      GMTrace.o(19211522932736L, 143137);
      return;
    }
    Q(paramIntent);
    GMTrace.o(19211522932736L, 143137);
  }
  
  public final void ao(Intent paramIntent)
  {
    GMTrace.i(19211791368192L, 143139);
    w.d("MicroMsg.ChattingUI.VideoImp", "sendVedioFromCustomRecord");
    if (paramIntent == null)
    {
      w.e("MicroMsg.ChattingUI.VideoImp", "data == null");
      GMTrace.o(19211791368192L, 143139);
      return;
    }
    Object localObject = paramIntent.getStringExtra("VideoRecorder_ToUser");
    String str = paramIntent.getStringExtra("VideoRecorder_FileName");
    int i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
    w.e("MicroMsg.ChattingUI.VideoImp", "fileName " + str + " length " + i + " user " + (String)localObject);
    if ((bg.nm((String)localObject)) || (bg.nm(str)) || (i < 0))
    {
      GMTrace.o(19211791368192L, 143139);
      return;
    }
    if ((((String)localObject).equals("medianote")) && ((q.zI() & 0x4000) == 0))
    {
      paramIntent = new com.tencent.mm.modelvideo.r();
      paramIntent.euR = str;
      paramIntent.hcv = i;
      paramIntent.eQu = ((String)localObject);
      paramIntent.hcn = ((String)com.tencent.mm.kernel.h.xy().xh().get(2, ""));
      paramIntent.hcs = bg.Pu();
      paramIntent.hct = bg.Pu();
      paramIntent.hcp = i;
      paramIntent.hbc = i;
      o.Nh();
      i = s.mm(s.mk(str));
      if (i <= 0)
      {
        w.e("MicroMsg.VideoLogic", "get Video size failed :" + str);
        GMTrace.o(19211791368192L, 143139);
        return;
      }
      paramIntent.gsL = i;
      o.Nh();
      localObject = s.ml(str);
      i = s.mm((String)localObject);
      if (i <= 0)
      {
        w.e("MicroMsg.VideoLogic", "get Thumb size failed :" + (String)localObject + " size:" + i);
        GMTrace.o(19211791368192L, 143139);
        return;
      }
      paramIntent.hcr = i;
      w.d("MicroMsg.VideoLogic", "init record file:" + str + " thumbsize:" + paramIntent.hcr + " videosize:" + paramIntent.gsL);
      paramIntent.status = 199;
      localObject = new au();
      ((au)localObject).db(paramIntent.Nq());
      ((au)localObject).setType(43);
      ((au)localObject).dC(1);
      ((au)localObject).dc(str);
      ((au)localObject).dB(2);
      ((au)localObject).E(bc.gR(paramIntent.Nq()));
      paramIntent.hcw = ((int)bc.i((au)localObject));
      o.Nh().a(paramIntent);
      GMTrace.o(19211791368192L, 143139);
      return;
    }
    com.tencent.mm.modelvideo.t.b(str, i, (String)localObject, null);
    com.tencent.mm.modelvideo.t.mr(str);
    this.wtd.me(true);
    GMTrace.o(19211791368192L, 143139);
  }
  
  public final void cY(final String paramString, final int paramInt)
  {
    GMTrace.i(19211254497280L, 143135);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19215415246848L, 143166);
        com.tencent.mm.modelvideo.t.P(paramString, paramInt);
        GMTrace.o(19215415246848L, 143166);
      }
    });
    GMTrace.o(19211254497280L, 143135);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */