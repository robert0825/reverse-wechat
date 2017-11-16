package com.tencent.mm.ui.chatting.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.kw;
import com.tencent.mm.g.a.kw.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.base.v;
import com.tencent.mm.ui.chatting.ee;
import com.tencent.mm.ui.chatting.ee.a;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import com.tencent.mm.y.d.a;
import com.tencent.mm.y.m;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class i
  extends a
  implements s.a, d.a
{
  public static boolean wzL;
  public String filename;
  public com.tencent.mm.y.d imE;
  private aj jGW;
  public long lastCheckTime;
  int lhm;
  private com.tencent.mm.plugin.s.b mVG;
  public boolean pUD;
  long pUH;
  long pUI;
  public aj pUJ;
  private long pUN;
  int pUO;
  private f.e pUs;
  private com.tencent.mm.plugin.sight.decode.ui.b tsA;
  public long tsv;
  public HashMap<String, a> wMh;
  private com.tencent.mm.sdk.b.c wNc;
  final SparseArray<r> wNd;
  public l wNe;
  public boolean wNf;
  public boolean wNg;
  public boolean wNh;
  public int wNi;
  private int wNj;
  private int wNk;
  private boolean wNl;
  ae wNm;
  private int wNn;
  public com.tencent.mm.sdk.b.c<kw> wNo;
  public boolean wNp;
  private int wNq;
  private int[] wNr;
  
  static
  {
    GMTrace.i(2480343613440L, 18480);
    wzL = false;
    GMTrace.o(2480343613440L, 18480);
  }
  
  public i(b paramb)
  {
    super(paramb);
    GMTrace.i(2473364291584L, 18428);
    this.wNd = new SparseArray();
    this.wNf = false;
    this.wNg = false;
    this.wNh = false;
    this.wNi = 0;
    this.tsv = 0L;
    this.lastCheckTime = 0L;
    this.wNj = 0;
    this.wNk = 0;
    this.pUH = 0L;
    this.pUI = 0L;
    this.lhm = 0;
    this.wNl = false;
    this.wNm = new ae(Looper.getMainLooper(), new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2437259722752L, 18159);
        if (paramAnonymousMessage.what == 1)
        {
          paramAnonymousMessage = i.this.wKr.cfh();
          if ((paramAnonymousMessage != null) && (!bg.nm(i.this.filename)))
          {
            w.i("MicroMsg.Imagegallery.handler.video", "%d ui on pause, pause video now. %s", new Object[] { Integer.valueOf(hashCode()), i.this.filename });
            if (!i.this.wNg) {
              com.tencent.mm.modelvideo.t.d(i.this.filename, paramAnonymousMessage.cfU().wNI.getCurrentPosition(), i.this.pUD);
            }
            i.this.a(paramAnonymousMessage);
            i.this.imE.bf(false);
            if (i.this.pUD)
            {
              com.tencent.mm.sdk.b.a.vgX.c(i.this.wNo);
              i.this.wNe.cfW();
              i.this.pUD = false;
            }
          }
          i.this.wNf = false;
        }
        GMTrace.o(2437259722752L, 18159);
        return false;
      }
    });
    this.wNn = 0;
    this.pUJ = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(2439809859584L, 18178);
        if (!i.this.wNe.isStreaming())
        {
          GMTrace.o(2439809859584L, 18178);
          return false;
        }
        j localj = i.this.wKr.cfh();
        if (localj == null)
        {
          GMTrace.o(2439809859584L, 18178);
          return false;
        }
        if (localj.wNF == null)
        {
          GMTrace.o(2439809859584L, 18178);
          return false;
        }
        if (localj.cfU().wNF.getVisibility() != 0)
        {
          GMTrace.o(2439809859584L, 18178);
          return false;
        }
        boolean bool = true;
        if (localj.cfU().wNI.isPlaying()) {
          bool = i.this.b(localj);
        }
        if (bool)
        {
          int i = localj.cfU().wNI.getCurrentPosition() / 1000;
          bool = i.this.wNe.hm(i);
          GMTrace.o(2439809859584L, 18178);
          return bool;
        }
        GMTrace.o(2439809859584L, 18178);
        return false;
      }
    }, true);
    this.jGW = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(14662078824448L, 109241);
        j localj = i.this.wKr.cfh();
        if (localj == null)
        {
          GMTrace.o(14662078824448L, 109241);
          return false;
        }
        if (localj.wNF == null)
        {
          GMTrace.o(14662078824448L, 109241);
          return false;
        }
        if (localj.cfU().wNF.getVisibility() != 0)
        {
          GMTrace.o(14662078824448L, 109241);
          return false;
        }
        int i = i.this.wKr.wKs.cfB();
        if ((r)i.this.wNd.get(i) == null)
        {
          i.this.Dy(i);
          GMTrace.o(14662078824448L, 109241);
          return false;
        }
        if (!localj.cfU().wNI.isPlaying())
        {
          w.i("MicroMsg.Imagegallery.handler.video", "it is not playing, stop offline timer");
          GMTrace.o(14662078824448L, 109241);
          return false;
        }
        i.this.wNi = localj.cfU().wNI.getCurrentPosition();
        i.this.Dz(i.this.wNi / 1000);
        GMTrace.o(14662078824448L, 109241);
        return true;
      }
    }, true);
    this.tsA = new com.tencent.mm.plugin.sight.decode.ui.b()
    {
      public final void Xw()
      {
        GMTrace.i(14660065558528L, 109226);
        if (i.this.wKr.cfh() != null) {
          i.this.a(i.this.wKr.cfh());
        }
        i.this.wKr.wKs.wMQ.stopTimer();
        GMTrace.o(14660065558528L, 109226);
      }
      
      public final void iM(int paramAnonymousInt)
      {
        GMTrace.i(14660199776256L, 109227);
        localObject = null;
        try
        {
          String str = i.this.wKr.cfh().cfU().wNI.NE();
          localObject = str;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "", new Object[0]);
            w.e("MicroMsg.Imagegallery.handler.video", "on seek get video path error: " + localException.toString());
            continue;
            boolean bool = i.this.wNe.ag(paramAnonymousInt, true);
            continue;
            localObject = i.this.wKr.cfg();
            if ((localObject != null) && (((au)localObject).bTG())) {
              com.tencent.mm.modelvideo.t.d(((ce)localObject).field_imgPath, paramAnonymousInt * 1000, i.this.pUD);
            }
            i.this.wKr.Di(i.this.wKr.wKs.cfB());
          }
        }
        w.i("MicroMsg.Imagegallery.handler.video", "on seek to time[%d] isOnlinePlay[%b] videoPath[%s]", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(i.this.pUD), localObject });
        if (!bg.nm((String)localObject)) {
          if (!i.this.pUD)
          {
            i.this.B(paramAnonymousInt, true);
            bool = true;
            if (bool) {
              i.this.bF(false);
            }
            i.this.wKr.wKs.cfy();
            GMTrace.o(14660199776256L, 109227);
            return;
          }
        }
      }
    };
    this.wNo = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(kw paramAnonymouskw)
      {
        GMTrace.i(14654562631680L, 109185);
        if (!i.this.wNe.Ja(paramAnonymouskw.eOZ.mediaId))
        {
          GMTrace.o(14654562631680L, 109185);
          return false;
        }
        Object localObject1;
        Object localObject2;
        int i;
        if ((paramAnonymouskw.eOZ.retCode != 0) && (paramAnonymouskw.eOZ.retCode != 44530))
        {
          w.w("MicroMsg.Imagegallery.handler.video", "stream download online video error. retCode: " + paramAnonymouskw.eOZ.retCode);
          localObject1 = i.this;
          localObject2 = paramAnonymouskw.eOZ.mediaId;
          i = paramAnonymouskw.eOZ.retCode;
          w.i("MicroMsg.Imagegallery.handler.video", "download online video error. mediaId: " + (String)localObject2);
          ((i)localObject1).bnS();
          paramAnonymouskw = ((i)localObject1).wNe;
          w.i("MicroMsg.OnlineVideoUIHelper", "deal stream error.");
          if (paramAnonymouskw.Ja((String)localObject2))
          {
            paramAnonymouskw.hak = 2;
            o.Ni().b(paramAnonymouskw.mediaId, paramAnonymouskw.cfZ());
          }
          g.ork.a(354L, 9L, 1L, false);
          if (i == 55524)
          {
            w.w("MicroMsg.Imagegallery.handler.video", "download online video time out, quit imageGalleryUI.");
            af.t(new i.17((i)localObject1));
          }
          for (;;)
          {
            GMTrace.o(14654562631680L, 109185);
            return false;
            af.t(new i.2((i)localObject1, i));
          }
        }
        switch (paramAnonymouskw.eOZ.eHJ)
        {
        default: 
          w.w("MicroMsg.Imagegallery.handler.video", "unknown event opcode " + paramAnonymouskw.eOZ.eHJ);
        }
        for (;;)
        {
          GMTrace.o(14654562631680L, 109185);
          return false;
          localObject1 = i.this.wNe;
          long l2 = paramAnonymouskw.eOZ.offset;
          long l1 = paramAnonymouskw.eOZ.ePa;
          boolean bool = paramAnonymouskw.eOZ.ePb;
          w.i("MicroMsg.OnlineVideoUIHelper", "deal moov ready moovPos[%d] needSeekTime[%d] timeDuration[%d] startDownload[%d %d]", new Object[] { Long.valueOf(l2), Integer.valueOf(((l)localObject1).hao), Integer.valueOf(((l)localObject1).han), Long.valueOf(l1), Long.valueOf(((l)localObject1).gAP) });
          if (((l)localObject1).han != 0) {
            w.w("MicroMsg.OnlineVideoUIHelper", "moov had callback, do nothing.");
          }
          for (;;)
          {
            i.this.pUD = true;
            break;
            if (l1 > ((l)localObject1).gAP) {}
            for (;;)
            {
              ((l)localObject1).gAP = l1;
              g.ork.a(354L, 5L, 1L, false);
              ((l)localObject1).pUZ = bg.Pv();
              o.Nh();
              paramAnonymouskw = com.tencent.mm.modelvideo.s.mk(((l)localObject1).filename);
              try
              {
                if (((l)localObject1).ham != null) {
                  break label573;
                }
                w.w("MicroMsg.OnlineVideoUIHelper", "parser is null, thread is error.");
              }
              catch (Exception paramAnonymouskw)
              {
                w.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", paramAnonymouskw, "", new Object[0]);
                w.e("MicroMsg.OnlineVideoUIHelper", "deal moov ready error: " + paramAnonymouskw.toString());
              }
              break;
              l1 = ((l)localObject1).gAP;
            }
            label573:
            if (((l)localObject1).ham.n(paramAnonymouskw, l2))
            {
              ((l)localObject1).han = ((l)localObject1).ham.hnp;
              w.i("MicroMsg.OnlineVideoUIHelper", "mp4 parse moov success. duration %d filename %s isFastStart %b", new Object[] { Integer.valueOf(((l)localObject1).han), ((l)localObject1).filename, Boolean.valueOf(bool) });
              if (!bool) {
                af.t(new l.1((l)localObject1));
              }
              if (((l)localObject1).hao == -1) {}
              for (((l)localObject1).hal = 1;; ((l)localObject1).hal = 2)
              {
                g.ork.a(354L, 7L, 1L, false);
                break;
              }
            }
            w.w("MicroMsg.OnlineVideoUIHelper", "mp4 parse moov error.");
            o.Ni();
            com.tencent.mm.modelcdntran.f.e(((l)localObject1).mediaId, 0, -1);
            com.tencent.mm.modelvideo.t.O(((l)localObject1).filename, 15);
            g.ork.a(354L, 8L, 1L, false);
            w.w("MicroMsg.OnlineVideoUIHelper", "%d rpt parse moov fail %s ", new Object[] { Integer.valueOf(localObject1.hashCode()), ((l)localObject1).filename });
            g.ork.i(13836, new Object[] { Integer.valueOf(302), Long.valueOf(bg.Pu()), "" });
          }
          localObject1 = i.this.wNe;
          localObject2 = paramAnonymouskw.eOZ.mediaId;
          i = paramAnonymouskw.eOZ.offset;
          int j = paramAnonymouskw.eOZ.length;
          ((l)localObject1).hau = false;
          if ((i < 0) || (j < 0)) {
            w.w("MicroMsg.OnlineVideoUIHelper", "deal data available error offset[%d], length[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          }
          while (!((l)localObject1).Ja((String)localObject2))
          {
            if (paramAnonymouskw.eOZ.length <= 0) {
              break;
            }
            i.this.bF(true);
            break;
          }
          localObject2 = ((l)localObject1).mediaId + i + "_" + j;
          localObject2 = (Integer)((l)localObject1).pUV.get(localObject2);
          if ((localObject2 != null) && (((Integer)localObject2).intValue() > 0)) {
            ((l)localObject1).har = ((Integer)localObject2).intValue();
          }
          for (;;)
          {
            w.i("MicroMsg.OnlineVideoUIHelper", "deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(((l)localObject1).har) });
            break;
            try
            {
              ((l)localObject1).har = ((l)localObject1).ham.bi(i, j);
            }
            catch (Exception localException)
            {
              w.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", localException, "", new Object[0]);
              w.e("MicroMsg.OnlineVideoUIHelper", "deal data available file pos to video time error: " + localException.toString());
            }
          }
          i.this.bF(true);
          continue;
          paramAnonymouskw = i.this.wNe;
          w.i("MicroMsg.OnlineVideoUIHelper", "deal stream finish. playStatus %d ", new Object[] { Integer.valueOf(paramAnonymouskw.hal) });
          paramAnonymouskw.hau = false;
          paramAnonymouskw.hak = 3;
          if (paramAnonymouskw.hal == 0)
          {
            w.w("MicroMsg.OnlineVideoUIHelper", "it had not moov callback and download finish start to play video.");
            paramAnonymouskw.bnZ();
            g.ork.a(354L, 6L, 1L, false);
          }
          for (;;)
          {
            paramAnonymouskw.cfY();
            g.ork.a(354L, 26L, 1L, false);
            i.this.bF(true);
            break;
            if (paramAnonymouskw.hal == 5)
            {
              w.w("MicroMsg.OnlineVideoUIHelper", "it had play error, it request all video data finish, start to play." + paramAnonymouskw.mediaId);
              paramAnonymouskw.bnZ();
            }
          }
          localObject1 = i.this.wNe;
          String str = paramAnonymouskw.eOZ.mediaId;
          i = paramAnonymouskw.eOZ.offset;
          if (((l)localObject1).Ja(str))
          {
            ((l)localObject1).pUX = (i * 100 / ((l)localObject1).hJt);
            w.i("MicroMsg.OnlineVideoUIHelper", "deal progress callback. downloadedPercent : " + ((l)localObject1).pUX);
          }
          if (((l)localObject1).pUX >= 100)
          {
            ((l)localObject1).hak = 3;
            continue;
            paramAnonymouskw = i.this.wNe;
            w.i("MicroMsg.OnlineVideoUIHelper", "deal had dup video.");
            paramAnonymouskw.cfY();
            paramAnonymouskw.bnZ();
          }
        }
      }
    };
    this.wNp = false;
    this.wNq = 0;
    this.wNr = new int[] { 64536, 63536, 3400 };
    this.pUs = new f.e()
    {
      public final void aQG()
      {
        GMTrace.i(14661005082624L, 109233);
        w.i("MicroMsg.Imagegallery.handler.video", "%d on texture update.", new Object[] { Integer.valueOf(i.this.hashCode()) });
        try
        {
          i.this.wKr.cfh().a(true, 1.0F);
          GMTrace.o(14661005082624L, 109233);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.Imagegallery.handler.video", "texture view update. error " + localException.toString());
          GMTrace.o(14661005082624L, 109233);
        }
      }
    };
    this.mVG = new com.tencent.mm.plugin.s.b()
    {
      public final long aOw()
      {
        GMTrace.i(14655502155776L, 109192);
        w.i("MicroMsg.Imagegallery.handler.video", "%d video get online cache sec", new Object[] { Integer.valueOf(i.this.hashCode()) });
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vww, Boolean.valueOf(true));
        try
        {
          if ((i.this.pUD) && (i.this.wNe != null))
          {
            int i = i.this.wNe.har;
            long l = i;
            GMTrace.o(14655502155776L, 109192);
            return l;
          }
        }
        catch (Exception localException)
        {
          GMTrace.o(14655502155776L, 109192);
        }
        return 0L;
      }
    };
    this.wMh = new HashMap();
    this.wNe = new l(this);
    com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.vgX;
    paramb = new ee(ee.a.wGQ, paramb.wKs);
    this.wNc = paramb;
    locala.b(paramb);
    com.tencent.mm.sdk.b.a.vgX.b(this.wNo);
    this.imE = new com.tencent.mm.y.d();
    GMTrace.o(2473364291584L, 18428);
  }
  
  private void a(final au paramau, final r paramr)
  {
    GMTrace.i(2474303815680L, 18435);
    if ((!ab.bv(this.wKr.wKs.vKB.vKW)) && (!wzL))
    {
      com.tencent.mm.ui.base.h.a(this.wKr.wKs.vKB.vKW, R.l.egp, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2480880484352L, 18484);
          i.wzL = true;
          i.this.b(paramau, paramr);
          GMTrace.o(2480880484352L, 18484);
        }
      }, null);
      GMTrace.o(2474303815680L, 18435);
      return;
    }
    b(paramau, paramr);
    GMTrace.o(2474303815680L, 18435);
  }
  
  private boolean b(a parama)
  {
    GMTrace.i(2474706468864L, 18438);
    if (parama == null)
    {
      GMTrace.o(2474706468864L, 18438);
      return false;
    }
    o.Nh().a(this);
    if (this.wKr.wKs.cfB() == parama.pos)
    {
      parama = Db(parama.pos);
      if (parama != null)
      {
        parama.cfU().wNQ.setVisibility(8);
        parama.cfU().wNJ.setVisibility(8);
        parama.cfU().wNH.setVisibility(8);
      }
      this.wNp = true;
      this.wKr.wKs.cfz();
      GMTrace.o(2474706468864L, 18438);
      return true;
    }
    this.wKr.Dk(parama.pos);
    GMTrace.o(2474706468864L, 18438);
    return false;
  }
  
  private void bnP()
  {
    GMTrace.i(2475645992960L, 18445);
    w.i("MicroMsg.Imagegallery.handler.video", "clear timer");
    this.pUJ.stopTimer();
    this.jGW.stopTimer();
    GMTrace.o(2475645992960L, 18445);
  }
  
  private void bnR()
  {
    GMTrace.i(2477122387968L, 18456);
    this.pUN = bg.Pv();
    w.d("MicroMsg.Imagegallery.handler.video", "notePlayVideo filename %s notePlayVideo %d ", new Object[] { this.filename, Long.valueOf(this.pUN) });
    GMTrace.o(2477122387968L, 18456);
  }
  
  public static r br(au paramau)
  {
    GMTrace.i(2473632727040L, 18430);
    if (!b.aY(paramau))
    {
      GMTrace.o(2473632727040L, 18430);
      return null;
    }
    paramau = com.tencent.mm.modelvideo.t.mw(paramau.field_imgPath);
    GMTrace.o(2473632727040L, 18430);
    return paramau;
  }
  
  private void cY(final String paramString, final int paramInt)
  {
    GMTrace.i(2474572251136L, 18437);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2445312786432L, 18219);
        com.tencent.mm.modelvideo.t.P(paramString, paramInt);
        GMTrace.o(2445312786432L, 18219);
      }
    });
    GMTrace.o(2474572251136L, 18437);
  }
  
  private void cfQ()
  {
    GMTrace.i(2476182863872L, 18449);
    try
    {
      this.wKr.wKs.cfq().wMy.oSQ = this.tsA;
      GMTrace.o(2476182863872L, 18449);
      return;
    }
    catch (Exception localException)
    {
      GMTrace.o(2476182863872L, 18449);
    }
  }
  
  protected final void B(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2476451299328L, 18451);
    j localj = this.wKr.cfh();
    if (localj == null)
    {
      GMTrace.o(2476451299328L, 18451);
      return;
    }
    bnR();
    localj.cfU().wNQ.setVisibility(8);
    localj.cfU().wNI.c(paramInt * 1000, paramBoolean);
    this.wKr.wKs.mn(false);
    bF(false);
    GMTrace.o(2476451299328L, 18451);
  }
  
  public final void Dy(int paramInt)
  {
    GMTrace.i(2475914428416L, 18447);
    this.wNd.remove(paramInt);
    GMTrace.o(2475914428416L, 18447);
  }
  
  protected final void Dz(int paramInt)
  {
    GMTrace.i(2476853952512L, 18454);
    paramInt = Math.max(0, paramInt);
    this.wKr.wKs.cfq().wMy.seek(paramInt);
    GMTrace.o(2476853952512L, 18454);
  }
  
  protected final void MT()
  {
    GMTrace.i(2476585517056L, 18452);
    j localj = this.wKr.cfh();
    if (localj == null)
    {
      GMTrace.o(2476585517056L, 18452);
      return;
    }
    w.i("MicroMsg.Imagegallery.handler.video", "start to pause");
    this.wKr.wKs.mn(true);
    localj.cfU().wNQ.setVisibility(0);
    localj.cfU().wNI.pause();
    bnS();
    GMTrace.o(2476585517056L, 18452);
  }
  
  protected final void Wt(String paramString)
  {
    GMTrace.i(2476988170240L, 18455);
    if ((!this.wNp) && (!b((a)this.wMh.get(paramString)))) {
      w.w("MicroMsg.Imagegallery.handler.video", "show tool bar error.");
    }
    GMTrace.o(2476988170240L, 18455);
  }
  
  public final void a(s.a.a parama)
  {
    GMTrace.i(2476048646144L, 18448);
    Object localObject = parama.euR;
    if ((bg.nm((String)localObject)) || (this.wMh == null))
    {
      GMTrace.o(2476048646144L, 18448);
      return;
    }
    parama = (a)this.wMh.get(localObject);
    if (parama == null)
    {
      GMTrace.o(2476048646144L, 18448);
      return;
    }
    au localau = parama.eAH;
    if ((localau == null) || (localau.field_imgPath == null) || (!localau.field_imgPath.equals(localObject)))
    {
      GMTrace.o(2476048646144L, 18448);
      return;
    }
    localObject = br(localau);
    if (localObject == null)
    {
      GMTrace.o(2476048646144L, 18448);
      return;
    }
    if ((localau.bTO()) || (((r)localObject).status == 198))
    {
      if (b(parama)) {
        Toast.makeText(this.wKr.wKs, R.l.egq, 0).show();
      }
      GMTrace.o(2476048646144L, 18448);
      return;
    }
    int i = com.tencent.mm.modelvideo.t.f((r)localObject);
    j localj = Db(parama.pos);
    if ((this.wKr.wKs.cfB() == parama.pos) && (localj != null))
    {
      this.wKr.wKs.cfA();
      this.wNp = false;
      localj.cfU().wNJ.setVisibility(0);
      localj.cfU().wNJ.setProgress(i);
    }
    while (i < localj.cfU().wNJ.xqu)
    {
      GMTrace.o(2476048646144L, 18448);
      return;
      if (localj == null)
      {
        GMTrace.o(2476048646144L, 18448);
        return;
      }
    }
    w.d("MicroMsg.Imagegallery.handler.video", "onNotifyChange, status:%d", new Object[] { Integer.valueOf(((r)localObject).status) });
    if (((((r)localObject).status == 199) || (((r)localObject).status == 199)) && (b(parama)))
    {
      this.wKr.wKs.eO(true);
      i = this.wKr.wKs.fi(localau.field_msgId);
    }
    switch (i)
    {
    default: 
      w.w("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode[%d] is error", new Object[] { Integer.valueOf(i) });
      GMTrace.o(2476048646144L, 18448);
      return;
    case 0: 
    case 3: 
      a(localau, (r)localObject, this.wKr.wKs.cfB(), false);
      GMTrace.o(2476048646144L, 18448);
      return;
    case 1: 
      w.d("MicroMsg.Imagegallery.handler.video", "do restransmit video");
      g.ork.a(354L, 15L, 1L, false);
      this.wKr.bf(localau);
      this.wKr.wKs.fj(-1L);
      if (this.pUD)
      {
        i = this.wKr.cfh().wNI.getCurrentPosition();
        com.tencent.mm.modelvideo.t.d(this.filename, i, this.pUD);
        this.wNl = true;
      }
      this.pUD = false;
      GMTrace.o(2476048646144L, 18448);
      return;
    }
    g.ork.a(354L, 16L, 1L, false);
    b.a(this.wKr.wKs, localau, true);
    this.wKr.wKs.fj(-1L);
    if (this.pUD)
    {
      i = this.wKr.cfh().wNI.getCurrentPosition();
      com.tencent.mm.modelvideo.t.d(this.filename, i, this.pUD);
      this.wNl = true;
    }
    this.pUD = false;
    GMTrace.o(2476048646144L, 18448);
  }
  
  public final void a(au paramau, r paramr, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2474169597952L, 18434);
    if ((paramau == null) || (paramr == null))
    {
      GMTrace.o(2474169597952L, 18434);
      return;
    }
    if (paramau.bTO())
    {
      Toast.makeText(this.wKr.wKs, R.l.egq, 0).show();
      GMTrace.o(2474169597952L, 18434);
      return;
    }
    Object localObject3;
    Object localObject1;
    if (paramr.hcC == -1)
    {
      localObject3 = paramr.Ns();
      localObject1 = localObject3;
      if (!com.tencent.mm.a.e.aZ((String)localObject3))
      {
        o.Nh();
        localObject1 = com.tencent.mm.modelvideo.s.mk(paramau.field_imgPath);
        if ((localObject1 != null) && (com.tencent.mm.a.e.aZ((String)localObject1))) {
          break label341;
        }
        Toast.makeText(this.wKr.wKs, R.l.egq, 0).show();
        GMTrace.o(2474169597952L, 18434);
      }
    }
    else
    {
      o.Nh();
      localObject3 = com.tencent.mm.modelvideo.s.mk(paramau.field_imgPath);
      localObject1 = localObject3;
      if (paramau.field_isSend == 1)
      {
        localObject1 = localObject3;
        if (paramr.hcF != null)
        {
          localObject1 = localObject3;
          if (!paramr.hcF.uBZ) {}
        }
      }
    }
    for (;;)
    {
      String str;
      boolean bool;
      try
      {
        str = FileOp.kZ((String)localObject3);
        localObject1 = str;
        if (!str.endsWith("/")) {
          localObject1 = str + "/";
        }
        str = com.tencent.mm.a.e.bc((String)localObject3);
        localObject1 = (String)localObject1 + str + "_hd.mp4";
        bool = FileOp.aZ((String)localObject1);
        w.i("MicroMsg.Imagegallery.handler.video", "local capture video, hdFilePath: %s, exist: %s", new Object[] { localObject1, Boolean.valueOf(bool) });
        if (!bool) {
          break label1194;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.Imagegallery.handler.video", "try to get hd filePath error: %s", new Object[] { localException.getMessage() });
        localObject2 = localObject3;
      }
      break;
      label341:
      localObject3 = Db(paramInt);
      if (localObject3 == null)
      {
        GMTrace.o(2474169597952L, 18434);
        return;
      }
      if (com.tencent.mm.y.s.eb(paramr.Nq())) {}
      for (int i = m.fk(paramr.Nq());; i = 0)
      {
        bool = q.mc((String)localObject2);
        int j = this.wKr.wKs.fi(paramau.field_msgId);
        w.i("MicroMsg.Imagegallery.handler.video", "play video pos[%d], isOnlinePlay[%b] opcode[%d] resetByCompletion[%b]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Integer.valueOf(j), Boolean.valueOf(this.wNl) });
        if (!bool)
        {
          if ((com.tencent.mm.compatible.d.p.fQL.fPJ == 1) && (com.tencent.mm.pluginsdk.k.b.a.a.b(paramr.getFileName(), this.wKr.wKs.vKB.vKW, bool)))
          {
            GMTrace.o(2474169597952L, 18434);
            return;
          }
          at.AR();
          if ((((Integer)com.tencent.mm.y.c.xh().get(w.a.vvu, Integer.valueOf(0))).intValue() == 1) && (((j)localObject3).wNK != null))
          {
            ((j)localObject3).wNK.setVisibility(0);
            ((j)localObject3).wNK.setText(com.tencent.mm.plugin.sight.base.d.CG((String)localObject2));
          }
          int k = paramr.hcv;
          int m = paramr.gsL;
          paramau = paramr.Nq();
          str = r.mg(paramr.Nt());
          long l = paramr.hcs;
          ((j)localObject3).pIq = k;
          ((j)localObject3).wNV = m;
          ((j)localObject3).wNW = i;
          ((j)localObject3).eMI = paramau;
          ((j)localObject3).eML = str;
          ((j)localObject3).hcs = l;
          this.pUD = paramBoolean;
          this.wNf = true;
          this.filename = paramr.getFileName();
          if (j == 3)
          {
            ((j)localObject3).cfU().wNI.setMute(true);
            if ((((j)localObject3).cfU().wNI.NE() == null) || (!((j)localObject3).cfU().wNI.NE().equals(localObject2)) || (((j)localObject3).cfU().wNI.isPlaying()) || (this.wNl)) {
              break label901;
            }
            ((j)localObject3).a(true, 1.0F);
            ((j)localObject3).cfU().wNI.start();
            bnR();
            if (!paramBoolean) {
              Wt(this.filename);
            }
            Dz(((j)localObject3).cfU().wNI.getCurrentPosition() / 1000);
            bF(false);
            this.wNd.put(paramInt, paramr);
            this.wKr.wKs.mn(false);
            this.wKr.wKs.vKB.vKW.getWindow().addFlags(128);
            if (com.tencent.mm.compatible.util.d.eu(18)) {
              Wt(this.filename);
            }
            this.imE.a(this);
          }
        }
        for (;;)
        {
          ((j)localObject3).cfU().wNJ.setVisibility(8);
          GMTrace.o(2474169597952L, 18434);
          return;
          ((j)localObject3).cfU().wNI.setMute(false);
          break;
          label901:
          this.wNh = false;
          this.wNl = false;
          ((j)localObject3).cfU().wNI.setVideoPath((String)localObject2);
          if ((((j)localObject3).cfU().wNI instanceof VideoPlayerTextureView))
          {
            ((VideoPlayerTextureView)((j)localObject3).cfU().wNI).mVG = this.mVG;
            paramau = (VideoPlayerTextureView)((j)localObject3).cfU().wNI;
            if (this.pUD) {
              break label1021;
            }
          }
          for (bool = false;; bool = com.tencent.mm.y.c.xh().getBoolean(w.a.vww, false))
          {
            paramau.fT(bool);
            ((VideoPlayerTextureView)((j)localObject3).cfU().wNI).fU(paramBoolean);
            ((j)localObject3).a(true, 0.0F);
            break;
            label1021:
            at.AR();
          }
          g.ork.i(12084, new Object[] { Integer.valueOf(paramr.gsL), Integer.valueOf(paramr.hcv * 1000), Integer.valueOf(0), Integer.valueOf(3), paramr.Nq(), Integer.valueOf(i), r.mg(paramr.Nt()), Long.valueOf(paramr.hcs) });
          if (!com.tencent.mm.pluginsdk.k.b.a.a.c((String)localObject2, this.wKr.wKs.vKB.vKW, bool)) {
            Toast.makeText(this.wKr.wKs.vKB.vKW, this.wKr.wKs.getString(R.l.egz), 0).show();
          }
        }
      }
      label1194:
      Object localObject2 = localObject3;
    }
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(2474974904320L, 18440);
    if (paramj == null)
    {
      GMTrace.o(2474974904320L, 18440);
      return;
    }
    bnP();
    w.d("MicroMsg.Imagegallery.handler.video", "pause video.");
    if (paramj.cfU().wNI.isPlaying())
    {
      paramj.cfU().wNI.pause();
      bnS();
    }
    GMTrace.o(2474974904320L, 18440);
  }
  
  public final boolean a(j paramj, au paramau, int paramInt)
  {
    GMTrace.i(2473498509312L, 18429);
    super.a(paramj, paramau, paramInt);
    r localr = br(paramau);
    if (paramau == null)
    {
      w.e("MicroMsg.Imagegallery.handler.video", "msg is null!!");
      GMTrace.o(2473498509312L, 18429);
      return false;
    }
    if (this.wMh != null) {
      this.wMh.put(paramau.field_imgPath, new a(paramau, paramInt));
    }
    while (localr == null)
    {
      GMTrace.o(2473498509312L, 18429);
      return false;
      w.e("MicroMsg.Imagegallery.handler.video", "mCacheMap is null!");
    }
    o.Nh();
    paramau = BackwardSupportUtil.b.c(com.tencent.mm.modelvideo.s.ml(paramau.field_imgPath), 1.0F);
    paramj.cfU().wNG.setImageBitmap(paramau);
    if (paramj.cfU().wNI.isPlaying()) {
      paramj.cfU().wNI.stop();
    }
    paramj.wNK.setVisibility(8);
    paramj.cfU().wNJ.setVisibility(8);
    paramj.cfU().wNQ.setVisibility(8);
    paramj.a(false, 0.0F);
    this.wNj = 0;
    this.pUH = bg.Pv();
    GMTrace.o(2473498509312L, 18429);
    return true;
  }
  
  protected final void az(final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(2476317081600L, 18450);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2426253869056L, 18077);
        w.i("MicroMsg.Imagegallery.handler.video", "prepare video filename %s isOnlinePlay %b ", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        if (i.this.wMh == null)
        {
          w.w("MicroMsg.Imagegallery.handler.video", "prepare video but cache map is null.");
          GMTrace.o(2426253869056L, 18077);
          return;
        }
        i.a locala = (i.a)i.this.wMh.get(paramString);
        if ((locala == null) || (locala.eAH == null))
        {
          GMTrace.o(2426253869056L, 18077);
          return;
        }
        r localr = i.br(locala.eAH);
        if (i.this.wKr.wKs.cfB() == locala.pos)
        {
          i.this.a(locala.eAH, localr, locala.pos, paramBoolean);
          i.this.Wt(paramString);
          GMTrace.o(2426253869056L, 18077);
          return;
        }
        w.w("MicroMsg.Imagegallery.handler.video", "playVideo, but currentItem is not correct.[%d, %d]", new Object[] { Integer.valueOf(i.this.wKr.wKs.cfB()), Integer.valueOf(locala.pos) });
        GMTrace.o(2426253869056L, 18077);
      }
    });
    GMTrace.o(2476317081600L, 18450);
  }
  
  public final void b(au paramau, r paramr)
  {
    GMTrace.i(2474438033408L, 18436);
    w.i("MicroMsg.Imagegallery.handler.video", "startDownloading [%d]", new Object[] { Integer.valueOf(hashCode()) });
    if ((paramau == null) || (paramr == null))
    {
      GMTrace.o(2474438033408L, 18436);
      return;
    }
    j localj = this.wKr.cfh();
    if (localj == null)
    {
      GMTrace.o(2474438033408L, 18436);
      return;
    }
    int i = this.wKr.wKs.fi(paramau.field_msgId);
    w.d("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode : " + i);
    switch (i)
    {
    default: 
      w.w("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode[%d] is error", new Object[] { Integer.valueOf(i) });
      GMTrace.o(2474438033408L, 18436);
      return;
    case 3: 
      w.i("MicroMsg.Imagegallery.handler.video", "%d mute play video [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i) });
    case 0: 
      l locall = this.wNe;
      String str1 = paramau.field_imgPath;
      com.tencent.mm.modelcontrol.d.Gv();
      if (!com.tencent.mm.modelcontrol.d.GA()) {
        i = 0;
      }
      while (i != 0)
      {
        w.i("MicroMsg.Imagegallery.handler.video", "start online play video.");
        this.pUD = true;
        o.Nh().a(this);
        this.wKr.wKs.cfA();
        this.wNp = false;
        localj.cfU().wNH.setVisibility(8);
        localj.cfU().wNJ.setVisibility(8);
        localj.cfU().wNQ.setVisibility(0);
        GMTrace.o(2474438033408L, 18436);
        return;
        locall.reset();
        Object localObject1 = com.tencent.mm.modelvideo.t.mw(str1);
        if (localObject1 != null)
        {
          i = ((r)localObject1).gsL;
          if (i < locall.wOr.wOt)
          {
            w.i("MicroMsg.OnlineVideoUIHelper", "video size[%d] less than config size[%d], do not stream video", new Object[] { Integer.valueOf(i), Integer.valueOf(locall.wOr.wOt) });
            com.tencent.mm.modelvideo.t.b((r)localObject1, 9);
            g.ork.a(354L, 17L, 1L, false);
            i = 0;
            continue;
          }
        }
        com.tencent.mm.modelvideo.t.P(str1, 1);
        n.Nf();
        o.Ni();
        if (bg.nm(str1)) {
          localObject1 = null;
        }
        for (;;)
        {
          if (localObject1 == null)
          {
            i = 0;
            break;
            r localr = com.tencent.mm.modelvideo.t.mw(str1);
            if (localr == null)
            {
              localObject1 = null;
            }
            else
            {
              localObject1 = bh.q(localr.Nt(), "msg");
              if (localObject1 == null)
              {
                w.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
                localObject1 = null;
              }
              else
              {
                Object localObject2 = (String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl");
                if (bg.nm((String)localObject2))
                {
                  w.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
                  localObject1 = null;
                }
                else
                {
                  int j = Integer.valueOf((String)((Map)localObject1).get(".msg.videomsg.$length")).intValue();
                  Object localObject3 = (String)((Map)localObject1).get(".msg.videomsg.$md5");
                  String str2 = (String)((Map)localObject1).get(".msg.videomsg.$aeskey");
                  String str3 = (String)((Map)localObject1).get(".msg.videomsg.$fileparam");
                  String str4 = com.tencent.mm.modelcdntran.d.a("downvideo", localr.hcs, localr.Nq(), localr.getFileName());
                  if (bg.nm(str4))
                  {
                    w.w("MicroMsg.OnlineVideoService", "cdntra genClientId failed not use cdn file:%s", new Object[] { localr.getFileName() });
                    localObject1 = null;
                  }
                  else
                  {
                    o.Nh();
                    String str5 = com.tencent.mm.modelvideo.s.mk(str1);
                    localObject1 = new com.tencent.mm.modelcdntran.j();
                    ((com.tencent.mm.modelcdntran.j)localObject1).filename = str1;
                    ((com.tencent.mm.modelcdntran.j)localObject1).gAQ = ((String)localObject3);
                    ((com.tencent.mm.modelcdntran.j)localObject1).gAR = j;
                    ((com.tencent.mm.modelcdntran.j)localObject1).gAS = 1;
                    ((com.tencent.mm.modelcdntran.j)localObject1).eMI = localr.Nr();
                    ((com.tencent.mm.modelcdntran.j)localObject1).gAT = localr.Nq();
                    if (com.tencent.mm.y.s.eb(localr.Nq()))
                    {
                      i = m.fk(localr.Nq());
                      label748:
                      ((com.tencent.mm.modelcdntran.j)localObject1).eMK = i;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_mediaId = str4;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_fullpath = str5;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_totalLen = j;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_aesKey = str2;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_fileId = ((String)localObject2);
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_priority = com.tencent.mm.modelcdntran.b.gzd;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_wxmsgparam = str3;
                      if (!com.tencent.mm.y.s.eb(localr.Nq())) {
                        break label989;
                      }
                      i = 1;
                      label825:
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_chattype = i;
                      ((com.tencent.mm.modelcdntran.j)localObject1).gAU = localr.gAU;
                      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B(localr.Nq(), localr.eSf);
                      localObject3 = bc.gT(((ce)localObject2).fwv);
                      if (localObject3 == null) {
                        break label994;
                      }
                      i = ((bc.b)localObject3).goc;
                      label893:
                      ((com.tencent.mm.modelcdntran.j)localObject1).initialDownloadLength = i;
                      ((com.tencent.mm.modelcdntran.j)localObject1).initialDownloadOffset = 0;
                      ((com.tencent.mm.modelcdntran.j)localObject1).gAW = ((ce)localObject2).field_createTime;
                      ((com.tencent.mm.modelcdntran.j)localObject1).eSf = ((ce)localObject2).field_msgSvrId;
                      if (localObject3 == null) {
                        break label999;
                      }
                    }
                    label989:
                    label994:
                    label999:
                    for (i = ((bc.b)localObject3).god;; i = 0)
                    {
                      ((com.tencent.mm.modelcdntran.j)localObject1).gAX = i;
                      if (((com.tencent.mm.modelcdntran.j)localObject1).initialDownloadLength > 0) {
                        g.ork.a(354L, 36L, 1L, false);
                      }
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_autostart = false;
                      ((com.tencent.mm.modelcdntran.j)localObject1).field_requestVideoFormat = com.tencent.mm.modelcontrol.d.a(1, localr);
                      break;
                      i = 0;
                      break label748;
                      i = 0;
                      break label825;
                      i = 0;
                      break label893;
                    }
                  }
                }
              }
            }
          }
        }
        locall.mediaId = ((com.tencent.mm.modelcdntran.j)localObject1).field_mediaId;
        locall.hJt = ((com.tencent.mm.modelcdntran.j)localObject1).gAR;
        locall.filename = str1;
        locall.hak = 1;
        locall.han = 0;
        boolean bool = o.Nm().NF();
        o.Ni().a((com.tencent.mm.modelcdntran.j)localObject1, bool);
        locall.gAP = bg.Pv();
        g.ork.a(354L, 1L, 1L, false);
        w.i("MicroMsg.OnlineVideoUIHelper", "download online video.[%s, %s] start time[%d]", new Object[] { locall.mediaId, str1, Long.valueOf(locall.gAP) });
        i = 1;
      }
      w.i("MicroMsg.Imagegallery.handler.video", "start offline play video.");
      this.pUD = false;
      o.Nh().a(this, Looper.getMainLooper());
      com.tencent.mm.modelvideo.t.ms(paramau.field_imgPath);
      this.wKr.wKs.cfA();
      this.wNp = false;
      localj.cfU().wNH.setVisibility(8);
      localj.cfU().wNJ.setVisibility(0);
      localj.cfU().wNJ.setProgress(com.tencent.mm.modelvideo.t.f(paramr));
      GMTrace.o(2474438033408L, 18436);
      return;
    }
    if (paramr.Nv())
    {
      w.i("MicroMsg.Imagegallery.handler.video", "start complete online video");
      com.tencent.mm.modelvideo.t.mA(paramau.field_imgPath);
    }
    for (;;)
    {
      o.Nh().a(this, Looper.getMainLooper());
      this.wKr.wKs.cfA();
      this.wNp = false;
      localj.cfU().wNH.setVisibility(8);
      localj.cfU().wNJ.setVisibility(0);
      localj.cfU().wNJ.setProgress(com.tencent.mm.modelvideo.t.f(paramr));
      if (i != 2) {
        break;
      }
      g.ork.a(354L, 14L, 1L, false);
      GMTrace.o(2474438033408L, 18436);
      return;
      w.i("MicroMsg.Imagegallery.handler.video", "start complete offline video");
      cY(paramau.field_imgPath, 10);
      com.tencent.mm.modelvideo.t.ms(paramau.field_imgPath);
    }
    g.ork.a(354L, 11L, 1L, false);
    GMTrace.o(2474438033408L, 18436);
  }
  
  public final boolean b(j paramj)
  {
    GMTrace.i(2477390823424L, 18458);
    int i = this.wNi;
    this.wNi = paramj.cfU().wNI.getCurrentPosition();
    int j;
    if (i != this.wNi)
    {
      this.lastCheckTime = bg.Pv();
      long l = paramj.cfU().wNI.bgP();
      if ((l > 0L) && (l != this.tsv))
      {
        this.tsv = l;
        j = this.wNj;
        switch (j)
        {
        default: 
          this.wNj = 0;
        }
      }
    }
    do
    {
      for (;;)
      {
        GMTrace.o(2477390823424L, 18458);
        return true;
        i = 21;
        for (;;)
        {
          w.w("MicroMsg.Imagegallery.handler.video", "%d rpt rptRepairEffect idKey %d errorTime %d filename %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j), this.filename });
          g.ork.a(354L, i, 1L, false);
          g.ork.i(13836, new Object[] { Integer.valueOf(301), Long.valueOf(bg.Pu()), "" });
          break;
          i = 22;
          continue;
          i = 23;
        }
        if (this.wNj != -1)
        {
          this.wNj += 1;
          w.w("MicroMsg.Imagegallery.handler.video", "media play is playing[%d], but surface is not update!! repair time[%d]", new Object[] { Integer.valueOf(this.wNj), Integer.valueOf(this.wNk) });
          if (this.wNk >= 2) {
            this.wNe.cfX();
          }
          switch (this.wNj)
          {
          case 0: 
          case 1: 
          default: 
            w.w("MicroMsg.Imagegallery.handler.video", "rpt surface not update!!");
            w.w("MicroMsg.Imagegallery.handler.video", "%d rpt rptSurfaceNotUpdate %s", new Object[] { Integer.valueOf(hashCode()), this.filename });
            g.ork.i(13836, new Object[] { Integer.valueOf(300), Long.valueOf(bg.Pu()), "" });
            g.ork.a(354L, 20L, 1L, false);
            this.wNj = -1;
          }
        }
      }
      i = this.wNi / 1000;
      w.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
      B(i, true);
      this.wNk += 1;
      GMTrace.o(2477390823424L, 18458);
      return false;
      j = (this.wNi - 2000) / 1000;
      i = j;
      if (j < 0) {
        i = 0;
      }
      w.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
      B(i, true);
      this.wNk += 1;
      GMTrace.o(2477390823424L, 18458);
      return false;
      j = (this.wNi - 4000) / 1000;
      i = j;
      if (j < 0) {
        i = 0;
      }
      w.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
      B(i, true);
      this.wNk += 1;
      GMTrace.o(2477390823424L, 18458);
      return false;
      w.i("MicroMsg.Imagegallery.handler.video", "check time[%d, %d], play time[%d, %d]", new Object[] { Long.valueOf(this.lastCheckTime), Long.valueOf(bg.Pv()), Integer.valueOf(i), Integer.valueOf(this.wNi) });
    } while ((this.lastCheckTime <= 0L) || (bg.aH(this.lastCheckTime) < 1500L));
    w.w("MicroMsg.Imagegallery.handler.video", "play time not update! request all video data to play. ");
    i = this.wKr.cfh().wNI.getCurrentPosition();
    bnP();
    com.tencent.mm.modelvideo.t.d(this.filename, i, this.pUD);
    this.wKr.cfh().wNI.stop();
    this.wNe.cfX();
    paramj = (a)this.wMh.get(this.filename);
    if ((paramj == null) || (paramj.eAH == null))
    {
      GMTrace.o(2477390823424L, 18458);
      return false;
    }
    r localr = br(paramj.eAH);
    a(paramj.eAH, localr, paramj.pos, this.pUD);
    this.lastCheckTime = 0L;
    GMTrace.o(2477390823424L, 18458);
    return false;
  }
  
  protected final void bF(boolean paramBoolean)
  {
    GMTrace.i(14661407735808L, 109236);
    if (!this.wNg)
    {
      if (this.pUD)
      {
        if (paramBoolean)
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(14660333993984L, 109228);
              for (;;)
              {
                try
                {
                  if (!bg.nm(i.this.wKr.cfh().cfU().wNI.NE())) {
                    continue;
                  }
                  i = com.tencent.mm.modelvideo.t.t(i.this.wNe.han, i.this.filename);
                  i.this.wNe.hm(i);
                }
                catch (Exception localException)
                {
                  int i;
                  w.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "start timer error[%s]", new Object[] { localException.toString() });
                  continue;
                }
                i.this.pUJ.z(500L, 500L);
                GMTrace.o(14660333993984L, 109228);
                return;
                i = i.this.wKr.cfh().cfU().wNI.getCurrentPosition() / 1000;
              }
            }
          });
          GMTrace.o(14661407735808L, 109236);
          return;
        }
        this.pUJ.z(500L, 500L);
        GMTrace.o(14661407735808L, 109236);
        return;
      }
      this.jGW.z(500L, 500L);
    }
    GMTrace.o(14661407735808L, 109236);
  }
  
  protected final boolean bnQ()
  {
    GMTrace.i(2476719734784L, 18453);
    j localj = this.wKr.cfh();
    if (localj == null)
    {
      GMTrace.o(2476719734784L, 18453);
      return false;
    }
    boolean bool = true;
    if (!localj.cfU().wNI.isPlaying())
    {
      w.i("MicroMsg.Imagegallery.handler.video", "start to play");
      this.wKr.wKs.mn(false);
      localj.cfU().wNQ.setVisibility(8);
      bool = localj.cfU().wNI.start();
      bnR();
    }
    if (localj.cfU().wNQ.getVisibility() != 8) {
      localj.cfU().wNQ.setVisibility(8);
    }
    GMTrace.o(2476719734784L, 18453);
    return bool;
  }
  
  public final void bnS()
  {
    GMTrace.i(2477256605696L, 18457);
    if (this.pUN > 0L) {
      this.pUO = ((int)(this.pUO + (bg.Pv() - this.pUN) / 1000L));
    }
    w.i("MicroMsg.Imagegallery.handler.video", "notePauseVideo filename %s playVideoDuration %d ", new Object[] { this.filename, Integer.valueOf(this.pUO) });
    this.pUN = 0L;
    GMTrace.o(2477256605696L, 18457);
  }
  
  public final void cfO()
  {
    GMTrace.i(2475243339776L, 18442);
    this.wNg = false;
    this.lhm = 0;
    if (this.wKr != null) {}
    for (Object localObject = this.wKr.cfh(); localObject == null; localObject = null)
    {
      w.w("MicroMsg.Imagegallery.handler.video", "notify video prepared, but holder is null.");
      GMTrace.o(2475243339776L, 18442);
      return;
    }
    final int i = bg.eN(((j)localObject).cfU().wNI.getDuration());
    int j = this.wKr.wKs.cfq().wMy.oSX;
    w.i("MicroMsg.Imagegallery.handler.video", "%d videoDuration %d hadSetTotalTime %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j) });
    if ((j <= 0) || (Math.abs(j - i) >= 2)) {
      this.wKr.wKs.cfq().wMy.tY(i);
    }
    cfQ();
    if ((i == 0) || (i >= 1800))
    {
      w.w("MicroMsg.Imagegallery.handler.video", "%d repair video duration[%d] error. filename[%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), this.filename });
      i = com.tencent.mm.modelvideo.t.t(i, this.filename);
      w.i("MicroMsg.Imagegallery.handler.video", "notify video prepared. isOnlinePlay[%b] playDuration[%d] playVideoWhenNotify[%b] hadPlayError[%b].", new Object[] { Boolean.valueOf(this.pUD), Integer.valueOf(i), Boolean.valueOf(this.wNf), Boolean.valueOf(this.wNg) });
      ((j)localObject).cfU().wNI.a(this.pUs);
      if (!this.wNf) {
        break label415;
      }
      if (this.pUD) {
        break label356;
      }
      this.wNe.reset();
      bnR();
      B(i, true);
    }
    for (;;)
    {
      bF(false);
      GMTrace.o(2475243339776L, 18442);
      return;
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14661273518080L, 109235);
          Object localObject = i.this.filename;
          int i = i;
          localObject = com.tencent.mm.modelvideo.t.mw((String)localObject);
          if (localObject != null)
          {
            int j = ((r)localObject).hcv;
            if ((j <= 0) || (Math.abs(j - i) > 2))
            {
              ((r)localObject).hcv = i;
              ((r)localObject).eQl = 4096;
              w.i("MicroMsg.VideoLogic", "repair video duration ret %b, duration[%d, %d]", new Object[] { Boolean.valueOf(com.tencent.mm.modelvideo.t.e((r)localObject)), Integer.valueOf(j), Integer.valueOf(i) });
            }
          }
          GMTrace.o(14661273518080L, 109235);
        }
      });
      break;
      label356:
      localObject = this.wNe;
      if (i > 0)
      {
        w.i("MicroMsg.OnlineVideoUIHelper", "seek to last duration : " + i);
        ((l)localObject).hao = i;
        ((l)localObject).haq = true;
        ((l)localObject).hal = 2;
      }
      this.wNe.hm(0);
    }
    label415:
    if (!this.pUD) {
      B(i, false);
    }
    for (;;)
    {
      Dz(i);
      this.wKr.wKs.mn(true);
      bnP();
      GMTrace.o(2475243339776L, 18442);
      return;
      this.wNe.ag(i, false);
    }
  }
  
  public final void cfP()
  {
    GMTrace.i(2475377557504L, 18443);
    w.i("MicroMsg.Imagegallery.handler.video", "notify video completion. isOnlinePlay : " + this.pUD);
    bnP();
    bnS();
    Object localObject1;
    if ((this.pUD) && (this.wKr != null) && (this.wKr.cfh() != null))
    {
      localObject1 = this.wKr.cfh().cfU().wNI;
      if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.ui.tools.f)localObject1).getCurrentPosition() + 2000 < ((com.tencent.mm.pluginsdk.ui.tools.f)localObject1).getDuration())) {
        w.e("MicroMsg.Imagegallery.handler.video", "notify video completion, but cur pos[%d] is less than duration[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.pluginsdk.ui.tools.f)localObject1).getCurrentPosition()), Integer.valueOf(((com.tencent.mm.pluginsdk.ui.tools.f)localObject1).getDuration()) });
      }
    }
    for (int i = 0;; i = 1)
    {
      if (i != 0)
      {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2408537128960L, 17945);
            i.this.wNh = true;
            Object localObject = i.this;
            i.this.tsv = 0L;
            ((i)localObject).lastCheckTime = 0L;
            i.this.imE.bf(false);
            i.this.bnS();
            if (i.this.pUD)
            {
              i.this.wNe.cfW();
              i.this.wNe.reset();
              i.this.pUD = false;
              i.this.wNp = false;
            }
            com.tencent.mm.modelvideo.t.d(i.this.filename, 0, i.this.pUD);
            if (i.this.wMh != null)
            {
              localObject = (i.a)i.this.wMh.get(i.this.filename);
              if (localObject != null)
              {
                j localj = i.this.wKr.cfh();
                localj.cfU().wNI.stop();
                i.this.wNi = 0;
                i.this.a(localj, ((i.a)localObject).eAH, ((i.a)localObject).pos);
                i.this.Dz(0);
                if (localj.cfU().wNQ.getVisibility() != 8) {
                  localj.cfU().wNQ.setVisibility(8);
                }
              }
            }
            GMTrace.o(2408537128960L, 17945);
          }
        });
        GMTrace.o(2475377557504L, 18443);
        return;
      }
      try
      {
        i = this.wKr.cfh().wNI.getCurrentPosition();
        com.tencent.mm.modelvideo.t.d(this.filename, i, this.pUD);
        this.wKr.cfh().wNI.stop();
        this.wNe.cfX();
        i = this.wNn + 1;
        this.wNn = i;
        if (i <= 3)
        {
          localObject1 = (a)this.wMh.get(this.filename);
          if (localObject1 != null)
          {
            localObject2 = ((a)localObject1).eAH;
            if (localObject2 != null) {}
          }
          else
          {
            GMTrace.o(2475377557504L, 18443);
            return;
          }
          Object localObject2 = br(((a)localObject1).eAH);
          a(((a)localObject1).eAH, (r)localObject2, ((a)localObject1).pos, this.pUD);
        }
        GMTrace.o(2475377557504L, 18443);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "notify video completion error[%s]", new Object[] { localException.toString() });
        GMTrace.o(2475377557504L, 18443);
        return;
      }
    }
  }
  
  public final void cfo()
  {
    GMTrace.i(2474840686592L, 18439);
    w.i("MicroMsg.Imagegallery.handler.video", "stopAll. video handler hash code : " + hashCode());
    this.pUI = bg.Pv();
    SparseArray localSparseArray = this.wKr.wgn;
    int j = 0;
    int i = 0;
    if (j < localSparseArray.size())
    {
      int k = localSparseArray.keyAt(j);
      if ((localSparseArray.get(k) == null) || (((View)localSparseArray.get(k)).getTag() == null)) {
        break label422;
      }
      j localj = (j)((View)localSparseArray.get(k)).getTag();
      if ((localj.wNF == null) || (localj.cfU().wNF.getVisibility() != 0) || ((((View)localj.cfU().wNI).getVisibility() != 0) && (bg.nm(localj.cfU().wNI.NE())) && ((!this.pUD) || (!this.wNe.isStreaming())))) {
        break label422;
      }
      w.i("MicroMsg.Imagegallery.handler.video", "stop");
      bnP();
      if (localj != null)
      {
        bnS();
        if (this.pUD) {
          this.wNe.cfW();
        }
        if (!this.wNg) {
          com.tencent.mm.modelvideo.t.d(this.filename, this.wNi - 1000, this.pUD);
        }
        localj.cfU().wNJ.setVisibility(8);
        localj.cfU().wNQ.setVisibility(8);
        localj.cfU().wNI.stop();
        Dz(0);
        localj.a(false, 0.0F);
        this.pUD = false;
        this.wNp = false;
        this.wNl = false;
        this.filename = null;
        this.pUO = 0;
        this.pUN = 0L;
        this.wNq = 0;
        this.wNn = 0;
        this.wNk = 0;
        this.wNj = 0;
        this.tsv = 0L;
        this.lastCheckTime = 0L;
      }
      i = 1;
    }
    label422:
    for (;;)
    {
      j += 1;
      break;
      this.imE.bf(false);
      if ((i == 0) && (this.pUD))
      {
        this.wNe.cfW();
        this.pUD = false;
      }
      bnP();
      this.wNd.clear();
      GMTrace.o(2474840686592L, 18439);
      return;
    }
  }
  
  public final void detach()
  {
    GMTrace.i(2475109122048L, 18441);
    w.i("MicroMsg.Imagegallery.handler.video", "detach.[%d]", new Object[] { Integer.valueOf(hashCode()) });
    this.pUI = bg.Pv();
    this.wNm.removeMessages(1);
    bnP();
    com.tencent.mm.sdk.b.a.vgX.c(this.wNc);
    com.tencent.mm.sdk.b.a.vgX.c(this.wNo);
    cfo();
    this.wKr.wKs.vKB.vKW.getWindow().clearFlags(128);
    this.wKr.wKs.cfq().wMy.oSQ = null;
    super.detach();
    this.wMh.clear();
    this.wMh = null;
    o.Nh().a(this);
    this.wNd.clear();
    l locall = this.wNe;
    locall.reset();
    locall.ham = null;
    locall.wOq = null;
    locall.wOr = null;
    if (com.tencent.mm.plugin.s.e.aOz()) {
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14655904808960L, 109195);
          String str = com.tencent.mm.plugin.s.e.aOA();
          if (!bg.nm(str))
          {
            g.ork.A(14092, str);
            GMTrace.o(14655904808960L, 109195);
            return;
          }
          g.ork.A(14092, "0");
          GMTrace.o(14655904808960L, 109195);
        }
      });
    }
    o.Nm().NF();
    o.Nm().run();
    GMTrace.o(2475109122048L, 18441);
  }
  
  public final void eu(int paramInt1, int paramInt2)
  {
    GMTrace.i(2475511775232L, 18444);
    boolean bool2 = this.pUD;
    final Object localObject = this.wNe;
    boolean bool1;
    if ((!bg.nm(((l)localObject).mediaId)) && (((l)localObject).hak == 1))
    {
      bool1 = true;
      w.e("MicroMsg.Imagegallery.handler.video", "notify video error, what %d, extras %d isOnlinePlay %b isLoading %b ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      this.wNg = true;
      this.lhm = paramInt2;
      if (!this.pUD) {
        break label290;
      }
      if (paramInt1 != -1) {
        break label199;
      }
      bnP();
      this.wKr.cfh().wNI.stop();
      this.wNe.cfX();
    }
    label199:
    label262:
    do
    {
      for (;;)
      {
        this.wNp = false;
        this.wKr.wKs.mn(true);
        this.wKr.cfh().cfU().wNQ.setVisibility(0);
        bnS();
        g.ork.a(354L, 18L, 1L, false);
        GMTrace.o(2475511775232L, 18444);
        return;
        bool1 = false;
        break;
        if (paramInt1 != -2) {
          break label262;
        }
        bnP();
        paramInt1 = this.wKr.cfh().wNI.getCurrentPosition();
        com.tencent.mm.modelvideo.t.d(this.filename, paramInt1, this.pUD);
        this.wKr.cfh().wNI.stop();
        this.wNe.cfX();
      }
    } while (paramInt1 != -3);
    this.wNg = false;
    this.wNe.cfX();
    GMTrace.o(2475511775232L, 18444);
    return;
    label290:
    com.tencent.mm.modelvideo.t.mz(this.filename);
    bnS();
    if ((this.wKr != null) && (this.wKr.cfh() != null) && (this.wKr.cfh().wNI != null))
    {
      localObject = this.wKr.cfh().wNI.NE();
      this.wKr.cfh().wNI.stop();
    }
    while (this.wNh)
    {
      w.i("MicroMsg.Imagegallery.handler.video", "%d had play completion don't show error tips", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(2475511775232L, 18444);
      return;
      localObject = "";
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2438736117760L, 18170);
        if ((i.this.wKr == null) || (i.this.wKr.cfh() == null) || (i.this.wMh == null))
        {
          w.w("MicroMsg.Imagegallery.handler.video", "show error alert but adapter is null.");
          GMTrace.o(2438736117760L, 18170);
          return;
        }
        i.this.wKr.cfh().a(false, 0.0F);
        if (!bg.nm(localObject)) {
          w.e("MicroMsg.Imagegallery.handler.video", "mediaplay play video error, use third player.[%s]", new Object[] { localObject });
        }
        try
        {
          Object localObject = new Intent();
          ((Intent)localObject).setAction("android.intent.action.VIEW");
          ((Intent)localObject).setDataAndType(Uri.fromFile(new File(localObject)), "video/*");
          i.this.wKr.wKs.startActivity((Intent)localObject);
          localObject = (i.a)i.this.wMh.get(i.this.filename);
          if ((localObject == null) || (((i.a)localObject).eAH == null))
          {
            GMTrace.o(2438736117760L, 18170);
            return;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.Imagegallery.handler.video", "startActivity fail, activity not found");
            com.tencent.mm.ui.base.h.h(i.this.wKr.wKs, R.l.due, R.l.duf);
          }
          i.this.Dy(localException.pos);
          GMTrace.o(2438736117760L, 18170);
        }
      }
    });
    g.ork.a(354L, 25L, 1L, false);
    GMTrace.o(2475511775232L, 18444);
  }
  
  public final void i(au paramau, int paramInt)
  {
    GMTrace.i(2473901162496L, 18432);
    w.i("MicroMsg.Imagegallery.handler.video", "toggle video");
    if (paramau == null)
    {
      GMTrace.o(2473901162496L, 18432);
      return;
    }
    if ((!b.aY(paramau)) && (!b.aZ(paramau)))
    {
      GMTrace.o(2473901162496L, 18432);
      return;
    }
    r localr = br(paramau);
    if (localr == null)
    {
      GMTrace.o(2473901162496L, 18432);
      return;
    }
    if ((this.pUD) && (this.wNe != null) && (this.wNe.haq))
    {
      w.i("MicroMsg.Imagegallery.handler.video", "%d it loading video data, do not response button click.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(2473901162496L, 18432);
      return;
    }
    if (this.wKr.wKs.cfD())
    {
      a(Db(paramInt));
      this.wKr.wKs.mn(true);
      this.wKr.wKs.wMQ.stopTimer();
      this.imE.bf(false);
      w.i("MicroMsg.Imagegallery.handler.video", "toggle pause video.");
      GMTrace.o(2473901162496L, 18432);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(this.wKr.wKs.vKB.vKW);
      GMTrace.o(2473901162496L, 18432);
      return;
    }
    if (this.pUD) {}
    for (;;)
    {
      int i;
      try
      {
        if (this.wKr.cfh().wNI != null)
        {
          i = this.wKr.cfh().wNI.getCurrentPosition() / 1000;
          if (this.wNe == null) {
            continue;
          }
          if (!this.wNe.hn(i)) {
            continue;
          }
          w.i("MicroMsg.Imagegallery.handler.video", "toggle play video");
          a(paramau, localr, paramInt, this.pUD);
          if (this.wKr.wKs.wMP) {
            this.wKr.wKs.cfy();
          }
          cfQ();
          GMTrace.o(2473901162496L, 18432);
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "", new Object[0]);
        i = 0;
        continue;
        w.i("MicroMsg.Imagegallery.handler.video", "toggle start timer.");
        bF(false);
        continue;
        w.w("MicroMsg.Imagegallery.handler.video", "%d toggle video but online video helper is null.", new Object[] { Integer.valueOf(hashCode()) });
        continue;
      }
      if (paramau.field_isSend == 0)
      {
        if ((localr.status != 113) && (localr.status != 198)) {
          break label541;
        }
        a(paramau, localr);
      }
      for (;;)
      {
        if (paramau.field_isSend != 1) {
          break label642;
        }
        i = localr.status;
        if ((i != 111) && (i != 113) && (i != 112) && (i != 121) && (i != 122)) {
          break label644;
        }
        w.i("MicroMsg.Imagegallery.handler.video", "download video. msg talker[%s], info status[%d]", new Object[] { paramau.field_talker, Integer.valueOf(i) });
        a(paramau, localr);
        break;
        label541:
        if (localr.status == 199) {
          a(paramau, localr, paramInt, false);
        }
        if (localr.status == 111) {
          a(paramau, localr);
        }
        if (localr.status == 112) {
          a(paramau, localr);
        }
        if ((localr.status == 121) || (localr.status == 122)) {
          a(paramau, localr);
        }
        if (localr.status == 123) {
          a(paramau, localr, paramInt, false);
        }
      }
      label642:
      continue;
      label644:
      a(paramau, localr, paramInt, false);
    }
  }
  
  public final void j(au paramau, int paramInt)
  {
    GMTrace.i(2474035380224L, 18433);
    w.i("MicroMsg.Imagegallery.handler.video", "toggleVideoMenu pos ");
    r localr = com.tencent.mm.modelvideo.t.mw(paramau.field_imgPath);
    if ((localr != null) && (!localr.Nw()))
    {
      a(Db(paramInt));
      this.wKr.wKs.mn(true);
      if (this.pUD)
      {
        this.wNe.cfW();
        this.wNe.reset();
      }
      a(paramau, localr);
      if (this.wKr.wKs.fi(paramau.field_msgId) == 2)
      {
        cY(paramau.field_imgPath, 8);
        GMTrace.o(2474035380224L, 18433);
        return;
      }
      cY(paramau.field_imgPath, 5);
    }
    GMTrace.o(2474035380224L, 18433);
  }
  
  protected final void onResume()
  {
    GMTrace.i(16136460566528L, 120226);
    w.i("MicroMsg.Imagegallery.handler.video", "ui on resume, add online video event.");
    this.wNm.removeMessages(1);
    com.tencent.mm.sdk.b.a.vgX.b(this.wNo);
    if ((this.wKr != null) && (com.tencent.mm.compatible.util.d.et(21)))
    {
      j localj = this.wKr.cfh();
      if ((localj != null) && (localj.wNI != null))
      {
        if ((localj.wNI instanceof VideoPlayerTextureView))
        {
          ((VideoPlayerTextureView)localj.wNI).aOJ();
          GMTrace.o(16136460566528L, 120226);
          return;
        }
        if ((localj.wNI instanceof VideoTextureView)) {
          ((VideoTextureView)localj.wNI).aOJ();
        }
      }
    }
    GMTrace.o(16136460566528L, 120226);
  }
  
  public final void pause(int paramInt)
  {
    GMTrace.i(2473766944768L, 18431);
    a(Db(paramInt));
    this.imE.bf(false);
    this.wKr.wKs.mn(true);
    GMTrace.o(2473766944768L, 18431);
  }
  
  public static final class a
  {
    public au eAH;
    public int pos;
    
    public a(au paramau, int paramInt)
    {
      GMTrace.i(2433367408640L, 18130);
      this.eAH = paramau;
      this.pos = paramInt;
      GMTrace.o(2433367408640L, 18130);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */