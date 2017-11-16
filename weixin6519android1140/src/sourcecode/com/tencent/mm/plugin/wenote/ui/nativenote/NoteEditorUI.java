package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.z;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.k;
import android.support.v7.widget.RecyclerView.t;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.v;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.10;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.11;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.12;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.13;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.2;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.3;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.4;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.5;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.d.a;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.g.a;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.snackbar.b.b;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteEditorUI
  extends MMActivity
  implements com.tencent.mm.ad.e, com.tencent.mm.plugin.wenote.model.nativenote.b.a, g.a
{
  private View Hw;
  ViewTreeObserver.OnGlobalLayoutListener NF;
  private RecyclerView Ub;
  private long eDr;
  private long gGR;
  private ae ghS;
  private ProgressDialog htG;
  private r kGg;
  private String kXD;
  private String kyP;
  private int lEi;
  protected b.b lKN;
  private boolean sbL;
  private int sfG;
  private com.tencent.mm.plugin.wenote.model.nativenote.manager.k shJ;
  private com.tencent.mm.plugin.wenote.ui.nativenote.a.c shK;
  private LinearLayout shL;
  private b shM;
  private RelativeLayout shN;
  private com.tencent.mm.plugin.wenote.model.nativenote.manager.g shO;
  private boolean shP;
  private boolean shQ;
  private boolean shR;
  private String shS;
  private com.tencent.mm.plugin.wenote.ui.nativenote.a.a shT;
  private boolean shU;
  private boolean shV;
  private a shW;
  private th shX;
  private boolean shY;
  private final Object shZ;
  private LinearLayout sia;
  private String sib;
  private int sic;
  private int sid;
  private int sie;
  private String[] sif;
  private boolean sig;
  private long sih;
  private boolean sii;
  private String sij;
  private boolean sik;
  private boolean sil;
  private boolean sim;
  private boolean sin;
  private int sio;
  private RecyclerView.k sip;
  private float siq;
  private float sir;
  View.OnTouchListener sis;
  private boolean sit;
  private int siu;
  private boolean siv;
  
  public NoteEditorUI()
  {
    GMTrace.i(17174903128064L, 127963);
    this.shM = null;
    this.shN = null;
    this.shO = null;
    this.Hw = null;
    this.shP = false;
    this.eDr = -1L;
    this.gGR = -1L;
    this.kyP = "";
    this.sbL = false;
    this.shQ = false;
    this.shR = false;
    this.shS = "";
    this.shU = false;
    this.htG = null;
    this.shV = false;
    this.shY = false;
    this.shZ = new Object();
    this.sia = null;
    this.sib = "";
    this.lEi = 0;
    this.sic = 0;
    this.sid = 0;
    this.sie = 0;
    this.sif = null;
    this.sig = true;
    this.sih = 0L;
    this.sii = false;
    this.sik = false;
    this.sil = false;
    this.sim = false;
    this.sin = true;
    this.sio = 0;
    this.sip = null;
    this.NF = new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        GMTrace.i(20578664710144L, 153323);
        long l = System.currentTimeMillis();
        w.i("MicroMsg.NoteEditorUI", "startnoteeditorui, onGlobalLayout, current time is %d,from oncreate to dataloading, cost %d", new Object[] { Long.valueOf(l), Long.valueOf(l - NoteEditorUI.z(NoteEditorUI.this)) });
        af localaf = at.xB();
        Runnable local1 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20579201581056L, 153327);
            NoteEditorUI.this.jL(false);
            GMTrace.o(20579201581056L, 153327);
          }
        };
        if (NoteEditorUI.d(NoteEditorUI.this) == 1) {}
        for (l = 100L;; l = 0L)
        {
          localaf.h(local1, l);
          NoteEditorUI.A(NoteEditorUI.this).getViewTreeObserver().removeGlobalOnLayoutListener(NoteEditorUI.this.NF);
          GMTrace.o(20578664710144L, 153323);
          return;
        }
      }
    };
    this.siq = 0.0F;
    this.sir = 0.0F;
    this.sis = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(20587657297920L, 153390);
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          NoteEditorUI.b(NoteEditorUI.this, paramAnonymousMotionEvent.getX());
          NoteEditorUI.a(NoteEditorUI.this, paramAnonymousMotionEvent.getY());
        }
        float f1;
        float f2;
        if ((paramAnonymousMotionEvent.getAction() == 1) && (NoteEditorUI.A(NoteEditorUI.this).j(paramAnonymousMotionEvent.getX(), paramAnonymousMotionEvent.getY()) == null))
        {
          f1 = Math.abs(NoteEditorUI.D(NoteEditorUI.this) - paramAnonymousMotionEvent.getX());
          f2 = Math.abs(NoteEditorUI.E(NoteEditorUI.this) - paramAnonymousMotionEvent.getY());
          if ((f1 < 30.0F) && (f2 < 30.0F))
          {
            if (NoteEditorUI.b(NoteEditorUI.this).getVisibility() == 8) {
              break label176;
            }
            if (NoteEditorUI.a(NoteEditorUI.this) != null) {
              NoteEditorUI.a(NoteEditorUI.this).sex.dismiss();
            }
            NoteEditorUI.b(NoteEditorUI.this).setVisibility(8);
          }
        }
        for (;;)
        {
          GMTrace.o(20587657297920L, 153390);
          return false;
          label176:
          int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().size();
          paramAnonymousView = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(i - 1);
          if (paramAnonymousView != null)
          {
            boolean bool = paramAnonymousView.scH;
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHr();
            paramAnonymousView.scH = true;
            paramAnonymousView.scN = false;
            paramAnonymousView.scJ = -1;
            NoteEditorUI.F(NoteEditorUI.this).bc(i - 1);
            NoteEditorUI.this.d(true, 50L);
            NoteEditorUI.this.P(1, 0L);
            if ((NoteEditorUI.w(NoteEditorUI.this)) && (bool))
            {
              NoteEditorUI.n(NoteEditorUI.this).postDelayed(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20575711920128L, 153301);
                  com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jS(true);
                  com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jR(true);
                  GMTrace.o(20575711920128L, 153301);
                }
              }, 100L);
              continue;
              if (paramAnonymousMotionEvent.getAction() == 2)
              {
                f1 = Math.abs(NoteEditorUI.D(NoteEditorUI.this) - paramAnonymousMotionEvent.getX());
                f2 = Math.abs(NoteEditorUI.E(NoteEditorUI.this) - paramAnonymousMotionEvent.getY());
                if ((f1 > 120.0F) || (f2 > 120.0F)) {
                  if (NoteEditorUI.w(NoteEditorUI.this))
                  {
                    if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIa() == 1)
                    {
                      NoteEditorUI.this.bHe();
                      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIf();
                    }
                  }
                  else if (!NoteEditorUI.G(NoteEditorUI.this)) {
                    NoteEditorUI.this.bHe();
                  }
                }
              }
            }
          }
        }
      }
    };
    this.kGg = null;
    this.sit = false;
    this.siu = -1;
    this.siv = false;
    this.lKN = new b.b()
    {
      public final void aEW()
      {
        GMTrace.i(20601213288448L, 153491);
        ft localft = new ft();
        localft.eIo.type = 35;
        com.tencent.mm.sdk.b.a.vgX.m(localft);
        GMTrace.o(20601213288448L, 153491);
      }
    };
    GMTrace.o(17174903128064L, 127963);
  }
  
  private static void a(r paramr)
  {
    GMTrace.i(20593562877952L, 153434);
    if (paramr != null) {
      paramr.dismiss();
    }
    GMTrace.o(20593562877952L, 153434);
  }
  
  private boolean bIA()
  {
    GMTrace.i(20591281176576L, 153417);
    if ((this.shM != null) && (this.shM.siY))
    {
      bHb();
      GMTrace.o(20591281176576L, 153417);
      return false;
    }
    GMTrace.o(20591281176576L, 153417);
    return true;
  }
  
  private boolean c(com.tencent.mm.plugin.wenote.model.a.p paramp)
  {
    boolean bool3 = false;
    GMTrace.i(20591012741120L, 153415);
    boolean bool2 = bool3;
    boolean bool4;
    if (paramp != null)
    {
      bool4 = paramp.sdh;
      if (this.sfG != 1) {
        break label103;
      }
    }
    label103:
    for (boolean bool1 = true;; bool1 = false)
    {
      bool2 = bool3;
      if (bool4 == bool1) {
        if ((this.sfG != 1) || (paramp.sdj != this.eDr))
        {
          bool2 = bool3;
          if (this.sfG == 2)
          {
            bool2 = bool3;
            if (paramp.sdi != this.gGR) {}
          }
        }
        else
        {
          bool2 = true;
        }
      }
      GMTrace.o(20591012741120L, 153415);
      return bool2;
    }
  }
  
  private void goBack()
  {
    GMTrace.i(17175439998976L, 127967);
    if ((this.sfG != 2) || (!this.shJ.sfH))
    {
      GMTrace.o(17175439998976L, 127967);
      return;
    }
    if ((!this.shQ) && (!this.sbL))
    {
      ft localft = new ft();
      localft.eIo.type = 19;
      localft.eIo.eDp = this.gGR;
      localft.eIo.eIv = -1;
      com.tencent.mm.sdk.b.a.vgX.m(localft);
      if (!localft.eIp.eIE) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(17175439998976L, 127967);
        return;
      }
      this.shQ = true;
      this.shR = true;
    }
    bIB();
    finish();
    GMTrace.o(17175439998976L, 127967);
  }
  
  public final void P(final int paramInt, long paramLong)
  {
    GMTrace.i(20593294442496L, 153432);
    if ((this.sfG != 2) || (!this.shJ.sfH))
    {
      GMTrace.o(20593294442496L, 153432);
      return;
    }
    this.ghS.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20590744305664L, 153413);
        switch (paramInt)
        {
        }
        for (;;)
        {
          GMTrace.o(20590744305664L, 153413);
          return;
          NoteEditorUI.R(NoteEditorUI.this).setVisibility(8);
          if (!NoteEditorUI.e(NoteEditorUI.this).siY)
          {
            NoteEditorUI.C(NoteEditorUI.this).setVisibility(8);
            GMTrace.o(20590744305664L, 153413);
            return;
          }
          NoteEditorUI.C(NoteEditorUI.this).setVisibility(0);
          GMTrace.o(20590744305664L, 153413);
          return;
          NoteEditorUI.C(NoteEditorUI.this).setVisibility(0);
          NoteEditorUI.R(NoteEditorUI.this).setVisibility(8);
          GMTrace.o(20590744305664L, 153413);
          return;
          NoteEditorUI.C(NoteEditorUI.this).setVisibility(0);
          NoteEditorUI.R(NoteEditorUI.this).setVisibility(8);
          GMTrace.o(20590744305664L, 153413);
          return;
          NoteEditorUI.C(NoteEditorUI.this).setVisibility(0);
          NoteEditorUI.R(NoteEditorUI.this).setVisibility(0);
        }
      }
    }, paramLong);
    GMTrace.o(20593294442496L, 153432);
  }
  
  public final void Zq()
  {
    GMTrace.i(20591683829760L, 153420);
    super.Zq();
    if (this.sin)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIj();
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIh();
    }
    GMTrace.o(20591683829760L, 153420);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(20593428660224L, 153433);
        if (paramk.getType() != 921)
        {
          GMTrace.o(20593428660224L, 153433);
          return;
        }
        if (!(paramk instanceof com.tencent.mm.plugin.wenote.model.a))
        {
          GMTrace.o(20593428660224L, 153433);
          continue;
        }
        paramk = (com.tencent.mm.plugin.wenote.model.a)paramk;
      }
      finally {}
      if (paramk.sbs == 1) {
        break;
      }
      GMTrace.o(20593428660224L, 153433);
    }
    int j;
    if (paramInt2 == 0)
    {
      w.i("MicroMsg.NoteEditorUI", "genlong pic , allow");
      paramString = this.Ub.fl();
      if (paramString != null)
      {
        j = paramString.getItemCount();
        if (j <= 0)
        {
          a(this.kGg);
          Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
          paramString = com.tencent.mm.plugin.report.service.g.ork;
          if (this.sii) {}
          for (paramInt1 = 1;; paramInt1 = 0)
          {
            paramString.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramInt1) });
            GMTrace.o(20593428660224L, 153433);
            break;
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        localy = new y((int)(Runtime.getRuntime().maxMemory() / 1024L) / 8);
        paramInt1 = 0;
        paramInt2 = 0;
        int k;
        int m;
        if (paramInt1 < j)
        {
          localObject = paramString.d(this.Ub, paramString.getItemViewType(paramInt1));
          paramString.a((RecyclerView.t)localObject, paramInt1);
          ((RecyclerView.t)localObject).UU.measure(View.MeasureSpec.makeMeasureSpec(this.Ub.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
          ((RecyclerView.t)localObject).UU.layout(0, 0, ((RecyclerView.t)localObject).UU.getMeasuredWidth(), ((RecyclerView.t)localObject).UU.getMeasuredHeight());
          k = ((RecyclerView.t)localObject).UU.getWidth();
          m = ((RecyclerView.t)localObject).UU.getHeight();
          i = paramInt2;
          if (k <= 0) {
            break label1649;
          }
          i = paramInt2;
          if (m <= 0) {
            break label1649;
          }
        }
        try
        {
          localBitmap = Bitmap.createBitmap(k, m, Bitmap.Config.ARGB_8888);
          localCanvas = new Canvas(localBitmap);
        }
        catch (Throwable paramString)
        {
          for (;;)
          {
            Bitmap localBitmap;
            Canvas localCanvas;
            com.tencent.mm.plugin.report.service.g localg;
            paramInt2 = 0;
            continue;
            paramInt2 += 1;
            continue;
            i += 1;
            paramInt2 = paramInt1;
            continue;
            paramInt1 = 0;
          }
        }
        try
        {
          ((RecyclerView.t)localObject).UU.draw(localCanvas);
          localy.put(String.valueOf(paramInt1), localBitmap);
          i = paramInt2 + ((RecyclerView.t)localObject).UU.getMeasuredHeight();
        }
        catch (Exception localException)
        {
          a(this.kGg);
          Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
          localg = com.tencent.mm.plugin.report.service.g.ork;
          if (!this.sii) {
            continue;
          }
        }
        if (paramInt2 < paramInt1)
        {
          paramString = (Bitmap)localy.get(String.valueOf(paramInt2));
          if ((paramString == null) || (paramString.isRecycled())) {
            break label1665;
          }
          paramString.recycle();
          break label1665;
        }
        a(this.kGg);
        Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
        GMTrace.o(20593428660224L, 153433);
        break;
        i = 1;
        localg.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i) });
        continue;
      }
      catch (Exception paramString)
      {
        y localy;
        Object localObject;
        w.e("MicroMsg.NoteEditorUI", "genlongpic fail,Exception error msg a");
        a(this.kGg);
        Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
        paramString = com.tencent.mm.plugin.report.service.g.ork;
        if (this.sii)
        {
          paramInt1 = 1;
          paramString.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(paramInt1) });
          this.shJ.sfG = paramk.sbw;
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().Q(com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().size() - 1, false);
          GMTrace.o(20593428660224L, 153433);
          break;
          i = 0;
          continue;
          try
          {
            paramInt1 = com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 14);
            try
            {
              paramString = Bitmap.createBitmap(this.Ub.getMeasuredWidth() + 0, paramInt2 + paramInt1, Bitmap.Config.ARGB_8888);
              localObject = new Canvas(paramString);
              ((Canvas)localObject).drawColor(-1);
              paramInt2 = com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 8);
              i = 0;
              if (i < j)
              {
                localBitmap = (Bitmap)localy.get(String.valueOf(i));
                paramInt1 = paramInt2;
                if (localBitmap == null) {
                  break label1672;
                }
                ((Canvas)localObject).drawBitmap(localBitmap, 0.0F, paramInt2, null);
                paramInt2 += localBitmap.getHeight();
                paramInt1 = paramInt2;
                if (localBitmap.isRecycled()) {
                  break label1672;
                }
                localBitmap.recycle();
                paramInt1 = paramInt2;
              }
            }
            catch (Throwable paramString)
            {
              w.e("MicroMsg.NoteEditorUI", "favorite, note, gen long pic ,rgb 888  error,errormsg ");
              try
              {
                paramString = Bitmap.createBitmap(this.Ub.getMeasuredWidth() + 0, paramInt2 + paramInt1, Bitmap.Config.RGB_565);
              }
              catch (Throwable paramString)
              {
                paramString = com.tencent.mm.plugin.report.service.g.ork;
                if (this.sii)
                {
                  paramInt1 = 1;
                  paramString.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(paramInt1) });
                  w.e("MicroMsg.NoteEditorUI", "favorite, note, gen long pic , 565 error,errormsg is er:");
                  a(this.kGg);
                  Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
                  paramInt1 = 0;
                  if (paramInt1 < j)
                  {
                    paramString = (Bitmap)localy.get(String.valueOf(paramInt1));
                    if ((paramString != null) && (!paramString.isRecycled())) {
                      paramString.recycle();
                    }
                    paramInt1 += 1;
                    continue;
                  }
                }
                else
                {
                  paramInt1 = 0;
                  continue;
                }
                GMTrace.o(20593428660224L, 153433);
              }
            }
          }
          catch (Exception paramString)
          {
            w.e("MicroMsg.NoteEditorUI", "genlongpic fail,error msg Exception");
            w.printErrStackTrace("MicroMsg.NoteEditorUI", paramString, "", new Object[0]);
            a(this.kGg);
            Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
            paramString = com.tencent.mm.plugin.report.service.g.ork;
            if (this.sii)
            {
              paramInt1 = 1;
              paramString.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramInt1) });
              GMTrace.o(20593428660224L, 153433);
              break;
            }
            paramInt1 = 0;
            continue;
            if (this.kGg == null) {
              break label1415;
            }
          }
          if (this.kGg.isShowing())
          {
            a(this.kGg);
            Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dmf, new Object[] { com.tencent.mm.platformtools.d.Pk() }), 1).show();
            at.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20578396274688L, 153321);
                com.tencent.mm.plugin.wenote.model.h.a(NoteEditorUI.this.vKB.vKW, paramString, NoteEditorUI.u(NoteEditorUI.this));
                GMTrace.o(20578396274688L, 153321);
              }
            });
            continue;
          }
        }
      }
      catch (Throwable paramString)
      {
        label723:
        w.e("MicroMsg.NoteEditorUI", "genlongpic fail,Throwable error msg throw");
        a(this.kGg);
        Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
        paramString = com.tencent.mm.plugin.report.service.g.ork;
        if (!this.sii) {}
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramString.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(paramInt1) });
        break label723;
        label1415:
        if ((paramString == null) || (paramString.isRecycled())) {
          break label723;
        }
        paramString.recycle();
        break label723;
        paramInt1 = 0;
        break;
      }
      paramString = com.tencent.mm.plugin.report.service.g.ork;
      if (!this.sii) {
        break label1683;
      }
      paramInt1 = 1;
      paramString.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramInt1) });
      a(this.kGg);
      Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
      continue;
      paramString = com.tencent.mm.plugin.report.service.g.ork;
      if (this.sii) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramString.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(paramInt1) });
        w.e("MicroMsg.NoteEditorUI", "genlong pic , not allow");
        a(this.kGg);
        Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLP), 1).show();
        break;
      }
      label1649:
      paramInt1 += 1;
      paramInt2 = i;
    }
  }
  
  public final void a(WXRTEditText paramWXRTEditText)
  {
    GMTrace.i(17178124353536L, 127987);
    if (paramWXRTEditText != null) {
      if ((com.tencent.mm.plugin.wenote.model.nativenote.manager.f.iBZ == null) || (com.tencent.mm.plugin.wenote.model.nativenote.manager.f.iBZ.size() <= 0)) {
        break label44;
      }
    }
    label44:
    for (int i = 1; i == 0; i = 0)
    {
      GMTrace.o(17178124353536L, 127987);
      return;
    }
    ArrayList localArrayList = com.tencent.mm.plugin.wenote.model.nativenote.manager.f.bHC();
    if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().ab(localArrayList))
    {
      bGZ();
      GMTrace.o(17178124353536L, 127987);
      return;
    }
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(localArrayList, paramWXRTEditText, true, true, true, false, false);
    i = paramWXRTEditText.bHM();
    int j = localArrayList.size();
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().dN(i, j + i + 1);
    bHe();
    if (this.sin) {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIf();
    }
    GMTrace.o(17178124353536L, 127987);
  }
  
  public final void a(WXRTEditText paramWXRTEditText, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(20592891789312L, 153429);
    if ((this.sfG != 2) || (!this.shJ.sfH))
    {
      GMTrace.o(20592891789312L, 153429);
      return;
    }
    ((com.tencent.mm.plugin.wenote.ui.nativenote.a.a)this.Ub.SW).sjj = paramBoolean;
    if (this.shU) {
      ((com.tencent.mm.plugin.wenote.ui.nativenote.a.a)this.Ub.SW).sjj = false;
    }
    if (paramBoolean)
    {
      if ((!this.sbL) && (!this.shQ))
      {
        this.shS = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHv();
        this.shQ = true;
      }
      if ((paramWXRTEditText != null) && (paramWXRTEditText.seM == 1))
      {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().S(paramInt, true);
        GMTrace.o(20592891789312L, 153429);
        return;
      }
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().S(paramInt, false);
      GMTrace.o(20592891789312L, 153429);
      return;
    }
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().R(-1, false);
    GMTrace.o(20592891789312L, 153429);
  }
  
  public final void aN(String paramString, boolean paramBoolean)
  {
    GMTrace.i(17177587482624L, 127983);
    w.i("MicroMsg.NoteEditorUI", "setEditorExportLogic,htmlstr:%s,isInsert:%B", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if ((!paramBoolean) && (paramString.equals(this.shS)))
    {
      if ((!this.sik) && (this.shJ.sfC > 0) && (!bg.nm(this.shJ.sfD)) && (this.shJ.sfE > 0L))
      {
        paramString = new ft();
        paramString.eIo.type = 19;
        paramString.eIo.eIv = -3;
        paramString.eIo.eDp = this.gGR;
        localObject = new Intent();
        ((Intent)localObject).putExtra("fav_note_item_status", this.shJ.sfC);
        ((Intent)localObject).putExtra("fav_note_xml", this.shJ.sfD);
        ((Intent)localObject).putExtra("fav_note_item_updatetime", this.shJ.sfE);
        paramString.eIo.eIr = ((Intent)localObject);
        com.tencent.mm.sdk.b.a.vgX.m(paramString);
      }
      GMTrace.o(17177587482624L, 127983);
      return;
    }
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().NH(paramString);
    if (localObject == null)
    {
      w.e("MicroMsg.NoteEditorUI", "protoitem is null,return");
      GMTrace.o(17177587482624L, 127983);
      return;
    }
    ft localft;
    if (paramBoolean)
    {
      localft = new ft();
      localft.eIo.type = 19;
      localft.eIo.eDx = ((tt)localObject);
      localft.eIo.title = paramString;
      localft.eIo.eDp = this.gGR;
      localft.eIo.desc = "fav_add_new_note";
      com.tencent.mm.sdk.b.a.vgX.m(localft);
      w.i("MicroMsg.NoteEditorUI", "write html to file suc");
      if (paramBoolean)
      {
        paramString = new ft();
        paramString.eIo.type = 30;
        paramString.eIo.eIv = 6;
        paramString.eIo.eDp = this.gGR;
        com.tencent.mm.sdk.b.a.vgX.m(paramString);
        if (paramString.eIp.ret != 1) {
          break label512;
        }
      }
    }
    label512:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.sbL = false;
        this.shQ = true;
      }
      this.shS = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHv();
      GMTrace.o(17177587482624L, 127983);
      return;
      localft = new ft();
      localft.eIo.type = 19;
      localft.eIo.eDx = ((tt)localObject);
      localft.eIo.title = paramString;
      localft.eIo.eDp = this.gGR;
      localft.eIo.desc = "";
      if (this.shR) {
        localft.eIo.eIv = -2;
      }
      com.tencent.mm.sdk.b.a.vgX.m(localft);
      break;
    }
  }
  
  public final void aoK()
  {
    GMTrace.i(17176916393984L, 127978);
    super.aoK();
    if (this.vKB.vLo == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.shV = bool;
      if (this.shV) {
        P(1, 0L);
      }
      if (this.sin) {
        this.ghS.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20577859403776L, 153317);
            boolean bool = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIi();
            com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jS(bool);
            bool = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIg();
            com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jR(bool);
            GMTrace.o(20577859403776L, 153317);
          }
        }, 200L);
      }
      GMTrace.o(17176916393984L, 127978);
      return;
    }
  }
  
  public final void bGX()
  {
    GMTrace.i(17177990135808L, 127986);
    if (!this.shM.siY)
    {
      bHe();
      final ActionBarActivity localActionBarActivity = this.vKB.vKW;
      this.ghS.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20601079070720L, 153490);
          int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().size();
          int j = NoteEditorUI.A(NoteEditorUI.this).getChildCount();
          Object localObject;
          if (i == j)
          {
            float f1 = 0.0F;
            i = j - 1;
            if (i >= 0)
            {
              localObject = NoteEditorUI.A(NoteEditorUI.this).getChildAt(i);
              float f2 = z.S((View)localObject);
              if (f1 > ((View)localObject).getBottom() + f2) {}
              for (;;)
              {
                i -= 1;
                break;
                f1 = ((View)localObject).getBottom() + f2;
              }
            }
            if ((f1 < com.tencent.mm.compatible.util.j.aO(localActionBarActivity)[1]) && (f1 > 0.0F))
            {
              localObject = (RelativeLayout.LayoutParams)NoteEditorUI.b(NoteEditorUI.this).getLayoutParams();
              ((RelativeLayout.LayoutParams)localObject).height = ((int)f1);
              NoteEditorUI.b(NoteEditorUI.this).setLayoutParams((ViewGroup.LayoutParams)localObject);
            }
          }
          NoteEditorUI.b(NoteEditorUI.this).setVisibility(0);
          if (NoteEditorUI.a(NoteEditorUI.this) != null)
          {
            localObject = NoteEditorUI.a(NoteEditorUI.this);
            int[] arrayOfInt = new int[2];
            int[] tmp187_185 = arrayOfInt;
            tmp187_185[0] = 0;
            int[] tmp191_187 = tmp187_185;
            tmp191_187[1] = 0;
            tmp191_187;
            ((com.tencent.mm.plugin.wenote.model.nativenote.manager.g)localObject).mParentView.getLocationOnScreen(arrayOfInt);
            ((com.tencent.mm.plugin.wenote.model.nativenote.manager.g)localObject).sex.showAtLocation(((com.tencent.mm.plugin.wenote.model.nativenote.manager.g)localObject).mParentView, 49, 0, arrayOfInt[1] + 50);
          }
          GMTrace.o(20601079070720L, 153490);
        }
      }, 400L);
    }
    GMTrace.o(17177990135808L, 127986);
  }
  
  public final void bGY()
  {
    GMTrace.i(17179063877632L, 127994);
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20578127839232L, 153319);
        if (NoteEditorUI.O(NoteEditorUI.this) != null)
        {
          NoteEditorUI.O(NoteEditorUI.this).dismiss();
          NoteEditorUI.P(NoteEditorUI.this);
        }
        GMTrace.o(20578127839232L, 153319);
      }
    });
    GMTrace.o(17179063877632L, 127994);
  }
  
  public final void bGZ()
  {
    GMTrace.i(17179198095360L, 127995);
    if ((this.sbL) || (this.shQ))
    {
      bHe();
      if (this.sin) {
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIf();
      }
      this.ghS.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20589938999296L, 153407);
          com.tencent.mm.ui.base.h.b(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.ekZ), null, true);
          GMTrace.o(20589938999296L, 153407);
        }
      }, 100L);
    }
    GMTrace.o(17179198095360L, 127995);
  }
  
  public final void bHD()
  {
    GMTrace.i(17178392788992L, 127989);
    com.tencent.mm.plugin.wenote.model.a.h localh = new com.tencent.mm.plugin.wenote.model.a.h();
    localh.content = "";
    localh.scH = true;
    localh.scN = false;
    localh.scJ = 0;
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHp();
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(localh);
    bIC();
    d(true, 50L);
    P(1, 0L);
    GMTrace.o(17178392788992L, 127989);
  }
  
  public final void bHE()
  {
    GMTrace.i(17178527006720L, 127990);
    com.tencent.mm.plugin.wenote.model.nativenote.manager.f.c(this.vKB.vKW, com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHw());
    GMTrace.o(17178527006720L, 127990);
  }
  
  public final void bHF()
  {
    GMTrace.i(17178661224448L, 127991);
    com.tencent.mm.plugin.wenote.model.nativenote.manager.f.c(this.vKB.vKW, com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHw());
    bHD();
    GMTrace.o(17178661224448L, 127991);
  }
  
  public final void bHG()
  {
    GMTrace.i(17178258571264L, 127988);
    int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.f.dz(this.vKB.vKW);
    Object localObject;
    if (i == 2)
    {
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.f.dy(this))
      {
        bGZ();
        GMTrace.o(17178258571264L, 127988);
        return;
      }
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHp();
      com.tencent.mm.plugin.wenote.model.nativenote.manager.f.Ty();
      localObject = new com.tencent.mm.plugin.wenote.model.a.h();
      ((com.tencent.mm.plugin.wenote.model.a.h)localObject).content = "";
      ((com.tencent.mm.plugin.wenote.model.a.h)localObject).scH = false;
      ((com.tencent.mm.plugin.wenote.model.a.h)localObject).scN = false;
      ((com.tencent.mm.plugin.wenote.model.a.h)localObject).scJ = 0;
      ((com.tencent.mm.plugin.wenote.model.a.h)localObject).scP = true;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a((com.tencent.mm.plugin.wenote.model.a.b)localObject);
      bIC();
      GMTrace.o(17178258571264L, 127988);
      return;
    }
    if (i == 3)
    {
      localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.f.bHC();
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().ab((ArrayList)localObject))
      {
        bGZ();
        GMTrace.o(17178258571264L, 127988);
        return;
      }
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHp();
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a((ArrayList)localObject, null, false, true, false, false, false);
      bHe();
      GMTrace.o(17178258571264L, 127988);
      return;
    }
    GMTrace.o(17178258571264L, 127988);
  }
  
  public final void bHa()
  {
    GMTrace.i(17784385830912L, 132504);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20574906613760L, 153295);
        paramAnonymousDialogInterface.dismiss();
        NoteEditorUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        GMTrace.o(20574906613760L, 153295);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20582288588800L, 153350);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(20582288588800L, 153350);
      }
    });
    GMTrace.o(17784385830912L, 132504);
  }
  
  public final void bHb()
  {
    GMTrace.i(20591146958848L, 153416);
    com.tencent.mm.ui.base.h.b(this.vKB.vKW, getString(R.l.dLQ), null, true);
    GMTrace.o(20591146958848L, 153416);
  }
  
  public final void bHc()
  {
    GMTrace.i(20591952265216L, 153422);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.dLL), "", getString(R.l.dLK), getString(R.l.dLJ), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(17783848960000L, 132500);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIo();
        GMTrace.o(17783848960000L, 132500);
      }
    }, null);
    GMTrace.o(20591952265216L, 153422);
  }
  
  public final void bHd()
  {
    GMTrace.i(20592086482944L, 153423);
    Toast.makeText(this.vKB.vKW, getString(R.l.dLO), 0).show();
    GMTrace.o(20592086482944L, 153423);
  }
  
  public final void bHe()
  {
    GMTrace.i(20592757571584L, 153428);
    if ((this.sfG != 2) || (!this.shJ.sfH))
    {
      GMTrace.o(20592757571584L, 153428);
      return;
    }
    int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHq();
    com.tencent.mm.plugin.wenote.model.a.b localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(i);
    if (localb != null)
    {
      localb.scH = false;
      localb.scN = false;
      yw(i);
    }
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20573967089664L, 153288);
        WXRTEditText localWXRTEditText = NoteEditorUI.f(NoteEditorUI.this).bHW();
        if (localWXRTEditText != null) {
          localWXRTEditText.clearFocus();
        }
        GMTrace.o(20573967089664L, 153288);
      }
    });
    d(false, 0L);
    P(0, 0L);
    GMTrace.o(20592757571584L, 153428);
  }
  
  public final int bHf()
  {
    GMTrace.i(20592220700672L, 153424);
    if (this.shV)
    {
      int i = com.tencent.mm.compatible.util.j.aI(this);
      GMTrace.o(20592220700672L, 153424);
      return i;
    }
    GMTrace.o(20592220700672L, 153424);
    return 0;
  }
  
  public final int bHg()
  {
    GMTrace.i(20592354918400L, 153425);
    int j = 0;
    int i = j;
    if (this.shL != null)
    {
      i = j;
      if (this.shL.getVisibility() == 0) {
        i = this.sio + 0;
      }
    }
    j = i;
    if (this.sia != null)
    {
      j = i;
      if (this.sia.getVisibility() == 0) {
        j = i + this.sio;
      }
    }
    GMTrace.o(20592354918400L, 153425);
    return j;
  }
  
  public final boolean bHh()
  {
    GMTrace.i(20592489136128L, 153426);
    if ((this.shJ != null) && (this.shJ.bHW() != null))
    {
      GMTrace.o(20592489136128L, 153426);
      return true;
    }
    GMTrace.o(20592489136128L, 153426);
    return false;
  }
  
  public final RecyclerView bHi()
  {
    GMTrace.i(20592623353856L, 153427);
    RecyclerView localRecyclerView = this.Ub;
    GMTrace.o(20592623353856L, 153427);
    return localRecyclerView;
  }
  
  public final void bHj()
  {
    GMTrace.i(20593026007040L, 153430);
    if ((!this.sbL) && (!this.shQ))
    {
      this.shS = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHv();
      this.shQ = true;
    }
    GMTrace.o(20593026007040L, 153430);
  }
  
  public final void bIB()
  {
    GMTrace.i(20591415394304L, 153418);
    this.shM.a(this);
    final String str2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHv();
    String str1 = com.tencent.mm.plugin.wenote.b.a.NL(Pattern.compile("<object[^>]*>", 2).matcher(str2).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#"));
    Object localObject = str1;
    if (!bg.nm(str1))
    {
      if (str1.length() == 0) {
        localObject = str1;
      }
    }
    else {
      if (!bg.nm((String)localObject)) {
        break label143;
      }
    }
    label143:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label148;
      }
      localObject = new ft();
      ((ft)localObject).eIo.type = 12;
      ((ft)localObject).eIo.eDp = this.gGR;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(20591415394304L, 153418);
      return;
      localObject = Pattern.compile("\\s*|\t|\r|\n").matcher(str1).replaceAll("");
      break;
    }
    label148:
    if (this.sbL)
    {
      w.i("MicroMsg.NoteEditorUI", "leave noteeditorui, do savewnnotefavitem");
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20588999475200L, 153400);
          NoteEditorUI.this.aN(str2, true);
          GMTrace.o(20588999475200L, 153400);
        }
      });
      GMTrace.o(20591415394304L, 153418);
      return;
    }
    if (this.shQ)
    {
      w.i("MicroMsg.NoteEditorUI", "leave noteeditorui, do updateWNNoteFavitem");
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17161749790720L, 127865);
          NoteEditorUI.this.aN(str2, false);
          GMTrace.o(17161749790720L, 127865);
        }
      });
    }
    GMTrace.o(20591415394304L, 153418);
  }
  
  public final void bIC()
  {
    GMTrace.i(17176513740800L, 127975);
    try
    {
      this.shK.TS.notifyChanged();
      GMTrace.o(17176513740800L, 127975);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NoteEditorUI", localException, "", new Object[0]);
      w.i("MicroMsg.NoteEditorUI", "onNotifyDataChanged error");
      GMTrace.o(17176513740800L, 127975);
    }
  }
  
  public final void ctX()
  {
    GMTrace.i(21052587507712L, 156854);
    if (this.shM != null) {
      this.shM.a(null);
    }
    GMTrace.o(21052587507712L, 156854);
  }
  
  public final void d(final boolean paramBoolean, long paramLong)
  {
    GMTrace.i(20593160224768L, 153431);
    if ((this.sfG != 2) || (!this.shJ.sfH))
    {
      GMTrace.o(20593160224768L, 153431);
      return;
    }
    this.ghS.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20587925733376L, 153392);
        if ((paramBoolean) && (!NoteEditorUI.B(NoteEditorUI.this)))
        {
          NoteEditorUI.this.aLs();
          GMTrace.o(20587925733376L, 153392);
          return;
        }
        if ((!paramBoolean) && (NoteEditorUI.B(NoteEditorUI.this))) {
          NoteEditorUI.this.aLo();
        }
        GMTrace.o(20587925733376L, 153392);
      }
    }, paramLong);
    GMTrace.o(20593160224768L, 153431);
  }
  
  public final void dJ(int paramInt1, int paramInt2)
  {
    GMTrace.i(17176245305344L, 127973);
    try
    {
      this.shK.R(paramInt1, paramInt2);
      GMTrace.o(17176245305344L, 127973);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NoteEditorUI", localException, "", new Object[0]);
      w.e("MicroMsg.NoteEditorUI", "onNotifyitemRangeInsert error,positionStart:%d,count:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(17176245305344L, 127973);
    }
  }
  
  public final void dK(int paramInt1, int paramInt2)
  {
    GMTrace.i(17176379523072L, 127974);
    try
    {
      this.shK.P(paramInt1, paramInt2);
      GMTrace.o(17176379523072L, 127974);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.NoteEditorUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(17176379523072L, 127974);
    }
  }
  
  public final void dL(int paramInt1, int paramInt2)
  {
    GMTrace.i(17178795442176L, 127992);
    if (Math.abs(paramInt2 - paramInt1) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.shU = bool;
      GMTrace.o(17178795442176L, 127992);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17175305781248L, 127966);
    int i = R.i.cDj;
    GMTrace.o(17175305781248L, 127966);
    return i;
  }
  
  public final void jL(boolean paramBoolean)
  {
    GMTrace.i(17629498572800L, 131350);
    w.i("MicroMsg.NoteEditorUI", "notifyNoteDataListFresh,force:%B", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.shP) || (com.tencent.mm.plugin.wenote.model.b.bGM().sbA == null))
    {
      boolean bool = this.shP;
      if (com.tencent.mm.plugin.wenote.model.b.bGM().sbA == null) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        w.e("MicroMsg.NoteEditorUI", "notifyNoteDataListFresh,isInitDataList:%B,SubCoreWNNoteMsg.getCore().getWnNoteBase() == null :%B", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
        GMTrace.o(17629498572800L, 131350);
        return;
      }
    }
    v localv;
    if (this.sfG != 1)
    {
      w.i("MicroMsg.NoteEditorUI", "notifyNoteDataListFresh,open from fav");
      if (com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbD == null)
      {
        w.e("MicroMsg.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mClickedFavItemInfo == null ");
        GMTrace.o(17629498572800L, 131350);
        return;
      }
      localv = (v)com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbE.get(Long.toString(com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbD.field_localId));
    }
    while ((localv != null) && (!this.sbL))
    {
      this.shY = localv.sdy;
      if (!localv.sdy)
      {
        this.shP = true;
        l(localv.sdx, true);
        GMTrace.o(17629498572800L, 131350);
        return;
        w.i("MicroMsg.NoteEditorUI", "notifyNoteDataListFresh,open from Session");
        if (com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbC == null)
        {
          w.e("MicroMsg.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mWNNoteData == null ");
          GMTrace.o(17629498572800L, 131350);
          return;
        }
        localv = (v)com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbE.get(Long.toString(com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbC.eDr));
      }
      else
      {
        l(localv.sdx, false);
      }
    }
    GMTrace.o(17629498572800L, 131350);
  }
  
  /* Error */
  public final void l(Object arg1, final boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 1539
    //   5: ldc_w 1541
    //   8: invokestatic 198	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: ldc_w 791
    //   14: ldc_w 1543
    //   17: iconst_1
    //   18: anewarray 236	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: iload_2
    //   24: invokestatic 1092	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   27: aastore
    //   28: invokestatic 1095	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: aload_0
    //   32: getfield 239	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:shZ	Ljava/lang/Object;
    //   35: astore 6
    //   37: aload 6
    //   39: monitorenter
    //   40: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   43: invokevirtual 1208	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHp	()V
    //   46: aload_1
    //   47: checkcast 1026	java/util/ArrayList
    //   50: astore_1
    //   51: aload_1
    //   52: ifnonnull +18 -> 70
    //   55: aload 6
    //   57: monitorexit
    //   58: ldc2_w 1539
    //   61: ldc_w 1541
    //   64: invokestatic 297	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: ldc_w 791
    //   73: ldc_w 1545
    //   76: invokestatic 798	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: aload_0
    //   80: getfield 579	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:sfG	I
    //   83: iconst_2
    //   84: if_icmpne +81 -> 165
    //   87: aload_0
    //   88: getfield 259	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:sii	Z
    //   91: ifne +74 -> 165
    //   94: invokestatic 1482	com/tencent/mm/plugin/wenote/model/b:bGM	()Lcom/tencent/mm/plugin/wenote/model/b;
    //   97: getfield 1486	com/tencent/mm/plugin/wenote/model/b:sbA	Lcom/tencent/mm/plugin/wenote/model/c;
    //   100: getfield 1533	com/tencent/mm/plugin/wenote/model/c:sbC	Lcom/tencent/mm/plugin/wenote/model/a/l;
    //   103: astore 7
    //   105: aload 7
    //   107: ifnonnull +23 -> 130
    //   110: aload 6
    //   112: monitorexit
    //   113: ldc2_w 1539
    //   116: ldc_w 1541
    //   119: invokestatic 297	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: goto -55 -> 67
    //   125: astore_1
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_1
    //   129: athrow
    //   130: new 1547	com/tencent/mm/plugin/wenote/model/a/d
    //   133: dup
    //   134: aload 7
    //   136: getfield 1550	com/tencent/mm/plugin/wenote/model/a/l:sdb	J
    //   139: invokespecial 1553	com/tencent/mm/plugin/wenote/model/a/d:<init>	(J)V
    //   142: astore 7
    //   144: aload 7
    //   146: iconst_0
    //   147: putfield 1554	com/tencent/mm/plugin/wenote/model/a/d:scH	Z
    //   150: aload 7
    //   152: iconst_0
    //   153: putfield 1555	com/tencent/mm/plugin/wenote/model/a/d:scN	Z
    //   156: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   159: aload 7
    //   161: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   164: pop
    //   165: aload_1
    //   166: invokevirtual 1559	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   169: astore_1
    //   170: aload_1
    //   171: invokeinterface 1564 1 0
    //   176: ifeq +525 -> 701
    //   179: aload_1
    //   180: invokeinterface 1568 1 0
    //   185: checkcast 1570	com/tencent/mm/plugin/wenote/model/a/n
    //   188: astore 7
    //   190: aload 7
    //   192: getfield 1571	com/tencent/mm/plugin/wenote/model/a/n:type	I
    //   195: tableswitch	default:+606->801, -3:+-25->170, -2:+-25->170, -1:+487->682, 0:+53->248, 1:+78->273, 2:+392->587, 3:+411->606, 4:+430->625, 5:+449->644, 6:+468->663
    //   248: aload 7
    //   250: checkcast 1573	com/tencent/mm/plugin/wenote/model/a/i
    //   253: astore 7
    //   255: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   258: aload 7
    //   260: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   263: pop
    //   264: goto -94 -> 170
    //   267: astore_1
    //   268: aload 6
    //   270: monitorexit
    //   271: aload_1
    //   272: athrow
    //   273: aload 7
    //   275: checkcast 1192	com/tencent/mm/plugin/wenote/model/a/h
    //   278: astore 7
    //   280: aload 7
    //   282: getfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   285: invokestatic 1111	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   288: ifeq +10 -> 298
    //   291: aload 7
    //   293: ldc -40
    //   295: putfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   298: aload 7
    //   300: aload 7
    //   302: getfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   305: ldc_w 1575
    //   308: ldc_w 1577
    //   311: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   314: ldc_w 1582
    //   317: ldc_w 1584
    //   320: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   323: ldc_w 1586
    //   326: ldc_w 1588
    //   329: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   332: ldc_w 1590
    //   335: ldc_w 1592
    //   338: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   341: ldc_w 1594
    //   344: ldc_w 1596
    //   347: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   350: ldc_w 1598
    //   353: ldc_w 1600
    //   356: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   359: ldc_w 1602
    //   362: ldc_w 1604
    //   365: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   368: ldc_w 1606
    //   371: ldc_w 1608
    //   374: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   377: ldc_w 1610
    //   380: ldc_w 1612
    //   383: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   386: ldc_w 1614
    //   389: ldc_w 1616
    //   392: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   395: ldc_w 1618
    //   398: ldc_w 1620
    //   401: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   404: ldc_w 1622
    //   407: ldc_w 1624
    //   410: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   413: ldc_w 1626
    //   416: ldc_w 1628
    //   419: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   422: ldc_w 1630
    //   425: ldc_w 1632
    //   428: invokevirtual 1580	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   431: putfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   434: aload 7
    //   436: getfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   439: invokevirtual 1395	java/lang/String:length	()I
    //   442: bipush 100
    //   444: if_icmple +24 -> 468
    //   447: aload 7
    //   449: getfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   452: invokestatic 1637	com/tencent/mm/plugin/wenote/model/nativenote/a/a:NF	(Ljava/lang/String;)Landroid/text/Spanned;
    //   455: pop
    //   456: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   459: aload 7
    //   461: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   464: pop
    //   465: goto -295 -> 170
    //   468: aload 7
    //   470: getfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   473: astore 8
    //   475: ldc_w 1639
    //   478: invokevirtual 1395	java/lang/String:length	()I
    //   481: istore 5
    //   483: aload 8
    //   485: invokestatic 1111	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   488: ifne +316 -> 804
    //   491: aload 8
    //   493: invokevirtual 1395	java/lang/String:length	()I
    //   496: iload 5
    //   498: if_icmpge +311 -> 809
    //   501: goto +303 -> 804
    //   504: iload_3
    //   505: ifeq -49 -> 456
    //   508: aload 7
    //   510: aload 7
    //   512: getfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   515: iconst_0
    //   516: aload 7
    //   518: getfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   521: invokevirtual 1395	java/lang/String:length	()I
    //   524: iconst_5
    //   525: isub
    //   526: invokevirtual 1643	java/lang/String:substring	(II)Ljava/lang/String;
    //   529: putfield 1196	com/tencent/mm/plugin/wenote/model/a/h:content	Ljava/lang/String;
    //   532: goto -76 -> 456
    //   535: iload_3
    //   536: aload 8
    //   538: invokevirtual 1395	java/lang/String:length	()I
    //   541: if_icmpge +279 -> 820
    //   544: iload_3
    //   545: iload 5
    //   547: iadd
    //   548: istore 4
    //   550: iload 4
    //   552: aload 8
    //   554: invokevirtual 1395	java/lang/String:length	()I
    //   557: if_icmple +8 -> 565
    //   560: iconst_0
    //   561: istore_3
    //   562: goto -58 -> 504
    //   565: ldc_w 1639
    //   568: aload 8
    //   570: iload_3
    //   571: iload 4
    //   573: invokevirtual 1643	java/lang/String:substring	(II)Ljava/lang/String;
    //   576: invokevirtual 1646	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   579: ifne +235 -> 814
    //   582: iconst_0
    //   583: istore_3
    //   584: goto -80 -> 504
    //   587: aload 7
    //   589: checkcast 1648	com/tencent/mm/plugin/wenote/model/a/e
    //   592: astore 7
    //   594: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   597: aload 7
    //   599: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   602: pop
    //   603: goto -433 -> 170
    //   606: aload 7
    //   608: checkcast 1650	com/tencent/mm/plugin/wenote/model/a/f
    //   611: astore 7
    //   613: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   616: aload 7
    //   618: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   621: pop
    //   622: goto -452 -> 170
    //   625: aload 7
    //   627: checkcast 1652	com/tencent/mm/plugin/wenote/model/a/k
    //   630: astore 7
    //   632: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   635: aload 7
    //   637: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   640: pop
    //   641: goto -471 -> 170
    //   644: aload 7
    //   646: checkcast 1654	com/tencent/mm/plugin/wenote/model/a/c
    //   649: astore 7
    //   651: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   654: aload 7
    //   656: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   659: pop
    //   660: goto -490 -> 170
    //   663: aload 7
    //   665: checkcast 1656	com/tencent/mm/plugin/wenote/model/a/j
    //   668: astore 7
    //   670: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   673: aload 7
    //   675: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   678: pop
    //   679: goto -509 -> 170
    //   682: aload 7
    //   684: checkcast 1658	com/tencent/mm/plugin/wenote/model/a/g
    //   687: astore 7
    //   689: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   692: aload 7
    //   694: invokevirtual 1211	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/b;)Z
    //   697: pop
    //   698: goto -528 -> 170
    //   701: aload 6
    //   703: monitorexit
    //   704: ldc_w 791
    //   707: ldc_w 1660
    //   710: invokestatic 798	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   713: iload_2
    //   714: ifne +16 -> 730
    //   717: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   720: astore_1
    //   721: aload_1
    //   722: monitorenter
    //   723: aload_1
    //   724: iconst_1
    //   725: putfield 1663	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:sdZ	Z
    //   728: aload_1
    //   729: monitorexit
    //   730: new 74	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3
    //   733: dup
    //   734: aload_0
    //   735: iload_2
    //   736: invokespecial 1664	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3:<init>	(Lcom/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI;Z)V
    //   739: invokestatic 1667	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   742: aload_0
    //   743: getfield 249	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:sid	I
    //   746: ifgt +10 -> 756
    //   749: aload_0
    //   750: getfield 251	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:sie	I
    //   753: ifeq +22 -> 775
    //   756: aload_0
    //   757: getfield 688	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:ghS	Lcom/tencent/mm/sdk/platformtools/ae;
    //   760: new 92	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$4
    //   763: dup
    //   764: aload_0
    //   765: invokespecial 1668	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$4:<init>	(Lcom/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI;)V
    //   768: ldc2_w 1185
    //   771: invokevirtual 752	com/tencent/mm/sdk/platformtools/ae:postDelayed	(Ljava/lang/Runnable;J)Z
    //   774: pop
    //   775: invokestatic 479	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHo	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   778: invokevirtual 1671	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bHu	()Ljava/lang/String;
    //   781: pop
    //   782: ldc2_w 1539
    //   785: ldc_w 1541
    //   788: invokestatic 297	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   791: goto -724 -> 67
    //   794: astore 6
    //   796: aload_1
    //   797: monitorexit
    //   798: aload 6
    //   800: athrow
    //   801: goto -553 -> 248
    //   804: iconst_0
    //   805: istore_3
    //   806: goto -302 -> 504
    //   809: iconst_0
    //   810: istore_3
    //   811: goto -276 -> 535
    //   814: iload 4
    //   816: istore_3
    //   817: goto -282 -> 535
    //   820: iconst_1
    //   821: istore_3
    //   822: goto -318 -> 504
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	825	0	this	NoteEditorUI
    //   0	825	2	paramBoolean	boolean
    //   504	318	3	i	int
    //   548	267	4	j	int
    //   481	67	5	k	int
    //   794	5	6	localObject2	Object
    //   103	590	7	localObject3	Object
    //   473	96	8	str	String
    // Exception table:
    //   from	to	target	type
    //   2	40	125	finally
    //   58	67	125	finally
    //   113	122	125	finally
    //   271	273	125	finally
    //   704	713	125	finally
    //   717	723	125	finally
    //   730	756	125	finally
    //   756	775	125	finally
    //   775	791	125	finally
    //   798	801	125	finally
    //   40	51	267	finally
    //   55	58	267	finally
    //   70	105	267	finally
    //   110	113	267	finally
    //   130	165	267	finally
    //   165	170	267	finally
    //   170	248	267	finally
    //   248	264	267	finally
    //   268	271	267	finally
    //   273	298	267	finally
    //   298	456	267	finally
    //   456	465	267	finally
    //   468	501	267	finally
    //   508	532	267	finally
    //   535	544	267	finally
    //   550	560	267	finally
    //   565	582	267	finally
    //   587	603	267	finally
    //   606	622	267	finally
    //   625	641	267	finally
    //   644	660	267	finally
    //   663	679	267	finally
    //   682	698	267	finally
    //   701	704	267	finally
    //   723	730	794	finally
    //   796	798	794	finally
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(17177453264896L, 127982);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.NoteEditorUI", "onActivityResult reqCode: %d, retCod: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.siu = paramInt1;
    if (paramInt2 != -1)
    {
      this.sit = false;
      GMTrace.o(17177453264896L, 127982);
      return;
    }
    this.sit = true;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      paramInt1 = 2;
      final Object localObject1;
      while (paramInt1 == 0)
      {
        GMTrace.o(17177453264896L, 127982);
        return;
        if (paramIntent == null)
        {
          localObject1 = null;
          if (paramIntent != null) {
            break label208;
          }
        }
        label208:
        for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
        {
          if (!bg.nm((String)localObject1)) {
            break label219;
          }
          w.w("MicroMsg.NoteEditorUI", "want to send record msg, but toUser is null");
          GMTrace.o(17177453264896L, 127982);
          return;
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          break;
        }
        label219:
        at.AR();
        localObject2 = com.tencent.mm.y.c.yM().cM(this.eDr);
        if (((ce)localObject2).field_msgId != this.eDr)
        {
          w.w("MicroMsg.NoteEditorUI", "want to send record msg, but message info is null");
          GMTrace.o(17177453264896L, 127982);
          return;
        }
        localObject3 = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17164299927552L, 127884);
            mn localmn = new mn();
            localmn.eRu.type = 4;
            localmn.eRu.eRz = localObject2;
            localmn.eRu.toUser = localObject1;
            localmn.eRu.eIu = paramIntent;
            com.tencent.mm.sdk.b.a.vgX.m(localmn);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17161212919808L, 127861);
                NoteEditorUI.6.this.lea.dismiss();
                com.tencent.mm.ui.snackbar.a.e(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.dwg));
                GMTrace.o(17161212919808L, 127861);
              }
            });
            GMTrace.o(17164299927552L, 127884);
          }
          
          public final String toString()
          {
            GMTrace.i(17164434145280L, 127885);
            String str = super.toString() + "|onActivityResult";
            GMTrace.o(17164434145280L, 127885);
            return str;
          }
        });
        paramInt1 = 2;
        continue;
        if (paramIntent == null)
        {
          localObject1 = null;
          if (paramIntent != null) {
            break label369;
          }
        }
        label369:
        for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
        {
          if (!bg.nm((String)localObject1)) {
            break label380;
          }
          w.w("MicroMsg.NoteEditorUI", "want to send record msg, but toUser is null");
          GMTrace.o(17177453264896L, 127982);
          return;
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          break;
        }
        label380:
        localObject2 = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
        localObject3 = new ft();
        ((ft)localObject3).eIo.type = 13;
        ((ft)localObject3).eIo.context = this.vKB.vKW;
        ((ft)localObject3).eIo.toUser = ((String)localObject1);
        ((ft)localObject3).eIo.eIu = paramIntent;
        ((ft)localObject3).eIo.eDp = this.gGR;
        ((ft)localObject3).eIo.eIt = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17171145031680L, 127935);
            localObject2.dismiss();
            com.tencent.mm.ui.snackbar.a.e(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.dwg));
            GMTrace.o(17171145031680L, 127935);
          }
        };
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
        paramInt1 = 2;
        continue;
        w.i("MicroMsg.NoteEditorUI", "onActivityResult back from gallery");
        if (paramIntent.getParcelableExtra("key_req_result") == null) {}
        for (paramInt1 = 2;; paramInt1 = 1)
        {
          localObject1 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
          if ((localObject1 == null) || (((ArrayList)localObject1).size() <= 0)) {
            break label755;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(14547, new Object[] { Integer.valueOf(paramInt1) });
          if (!com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().dM(0, ((ArrayList)localObject1).size())) {
            break label590;
          }
          bGZ();
          paramInt1 = 0;
          break;
        }
        label590:
        localObject2 = this.vKB.vKW;
        getString(R.l.cUG);
        this.htG = com.tencent.mm.ui.base.h.a((Context)localObject2, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(20600810635264L, 153488);
            if (NoteEditorUI.O(NoteEditorUI.this) != null)
            {
              NoteEditorUI.O(NoteEditorUI.this).dismiss();
              NoteEditorUI.P(NoteEditorUI.this);
            }
            GMTrace.o(20600810635264L, 153488);
          }
        });
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20579470016512L, 153329);
            ArrayList localArrayList = new ArrayList();
            int i = 0;
            while (i < localObject1.size())
            {
              String str = (String)localObject1.get(i);
              com.tencent.mm.plugin.wenote.model.a.e locale = new com.tencent.mm.plugin.wenote.model.a.e();
              locale.sdf = true;
              locale.type = 2;
              locale.sde = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHu();
              locale.lhq = com.tencent.mm.plugin.wenote.model.f.NA(locale.toString());
              NoteEditorUI.a(NoteEditorUI.this, new th());
              NoteEditorUI.Q(NoteEditorUI.this).Qt(locale.lhq);
              locale.sdg = com.tencent.mm.plugin.wenote.b.b.ez(str, com.tencent.mm.plugin.wenote.model.f.n(NoteEditorUI.Q(NoteEditorUI.this)));
              locale.eOR = com.tencent.mm.plugin.wenote.b.b.eA(locale.sdg, com.tencent.mm.plugin.wenote.model.f.h(NoteEditorUI.Q(NoteEditorUI.this)));
              localArrayList.add(locale);
              i += 1;
            }
            if ((NoteEditorUI.O(NoteEditorUI.this) != null) && (NoteEditorUI.O(NoteEditorUI.this).isShowing()))
            {
              com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(localArrayList, NoteEditorUI.f(NoteEditorUI.this).bHZ(), true, true, false, true, false);
              NoteEditorUI.this.d(true, 100L);
              NoteEditorUI.this.P(1, 0L);
              GMTrace.o(20579470016512L, 153329);
              return;
            }
            w.i("MicroMsg.NoteEditorUI", "user canceled");
            GMTrace.o(20579470016512L, 153329);
          }
        });
        for (;;)
        {
          localObject1 = paramIntent.getStringArrayListExtra("key_select_video_list");
          localObject2 = paramIntent.getStringExtra("K_SEGMENTVIDEOPATH");
          paramIntent = (Intent)localObject1;
          if (!bg.nm((String)localObject2))
          {
            paramIntent = (Intent)localObject1;
            if (localObject1 == null)
            {
              paramIntent = new ArrayList();
              paramIntent.add(localObject2);
            }
          }
          if ((paramIntent == null) || (paramIntent.size() <= 0)) {
            break label1079;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(14547, new Object[] { Integer.valueOf(paramInt1) });
          if (!com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().dM(0, paramIntent.size())) {
            break label767;
          }
          bGZ();
          paramInt1 = 0;
          break;
          label755:
          w.i("MicroMsg.NoteEditorUI", "no pic selected");
        }
        label767:
        localObject1 = (String)paramIntent.get(0);
        paramIntent = com.tencent.mm.plugin.sight.base.d.GB((String)localObject1);
        if (paramIntent == null)
        {
          w.e("MicroMsg.NoteEditorUI", "mediaInfo is null, videoPath is %s", new Object[] { bg.nl((String)localObject1) });
          paramInt1 = 0;
        }
        else
        {
          long l = paramIntent.bgg();
          paramIntent = new com.tencent.mm.plugin.wenote.model.a.j();
          paramIntent.sdf = true;
          paramIntent.eIy = "";
          paramIntent.eOR = "";
          paramIntent.duration = l;
          paramIntent.type = 6;
          paramIntent.sde = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHu();
          paramIntent.scT = com.tencent.mm.a.e.bb((String)localObject1);
          paramIntent.lhq = com.tencent.mm.plugin.wenote.model.f.NA(paramIntent.toString());
          this.shX = new th();
          this.shX.Qt(paramIntent.lhq);
          this.shX.Qq(paramIntent.scT);
          localObject2 = com.tencent.mm.plugin.wenote.model.f.h(this.shX);
          localObject3 = com.tencent.mm.plugin.wenote.model.f.n(this.shX);
          if (bg.nm((String)localObject1))
          {
            w.e("MicroMsg.NoteEditorUI", "video is null");
            paramInt1 = 0;
          }
          else
          {
            w.v("MicroMsg.NoteEditorUI", "compressNoteVideo path: %s", new Object[] { localObject1 });
            ArrayList localArrayList = new ArrayList();
            localArrayList.add(localObject1);
            localObject1 = new com.tencent.mm.plugin.wenote.model.nativenote.manager.d(localArrayList, (String)localObject2, (String)localObject3, paramIntent, new d.a()
            {
              public final void a(String paramAnonymousString, com.tencent.mm.plugin.wenote.model.a.j paramAnonymousj)
              {
                GMTrace.i(20589267910656L, 153402);
                w.i("MicroMsg.NoteEditorUI", "compressNoteVideo onImportFinish");
                if ((!bg.nm(paramAnonymousString)) && (FileOp.aZ(paramAnonymousString)) && (paramAnonymousj != null)) {
                  paramAnonymousj.eIy = paramAnonymousString;
                }
                GMTrace.o(20589267910656L, 153402);
              }
              
              public final void b(String paramAnonymousString, com.tencent.mm.plugin.wenote.model.a.j paramAnonymousj)
              {
                GMTrace.i(20589402128384L, 153403);
                w.i("MicroMsg.NoteEditorUI", "compressNoteVideo onExportFinish");
                if (NoteEditorUI.O(NoteEditorUI.this) != null)
                {
                  NoteEditorUI.O(NoteEditorUI.this).dismiss();
                  NoteEditorUI.P(NoteEditorUI.this);
                }
                if ((!bg.nm(paramAnonymousString)) && (com.tencent.mm.a.e.aZ(paramAnonymousString)) && (paramAnonymousj != null) && (!paramAnonymousj.scU)) {
                  if (new File(paramAnonymousString).length() < 26214400L)
                  {
                    paramAnonymousj.eOR = paramAnonymousString;
                    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(paramAnonymousj, NoteEditorUI.f(NoteEditorUI.this).bHZ(), false, true, false);
                  }
                }
                for (;;)
                {
                  NoteEditorUI.this.d(true, 100L);
                  NoteEditorUI.this.P(1, 0L);
                  GMTrace.o(20589402128384L, 153403);
                  return;
                  Toast.makeText(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.dva), 1).show();
                  continue;
                  w.i("MicroMsg.NoteEditorUI", "file not exist or user canceled");
                }
              }
            });
            localObject2 = this.vKB.vKW;
            getString(R.l.cUG);
            this.htG = com.tencent.mm.ui.base.h.a((Context)localObject2, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(20580409540608L, 153336);
                paramAnonymousDialogInterface = localObject1;
                paramAnonymousDialogInterface.isStop = true;
                paramAnonymousDialogInterface.interrupt();
                paramIntent.scU = true;
                NoteEditorUI.this.d(true, 100L);
                NoteEditorUI.this.P(1, 0L);
                GMTrace.o(20580409540608L, 153336);
              }
            });
            com.tencent.mm.sdk.f.e.post((Runnable)localObject1, "NoteEditor_importVideo");
            paramInt1 = 0;
            continue;
            label1079:
            w.i("MicroMsg.NoteEditorUI", "no video selected");
            paramInt1 = 0;
            continue;
            com.tencent.mm.plugin.report.service.g.ork.i(14547, new Object[] { Integer.valueOf(4) });
            if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().dM(0, 1))
            {
              bGZ();
              paramInt1 = 0;
            }
            else
            {
              localObject1 = new com.tencent.mm.plugin.wenote.model.a.f();
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).lat = ((float)paramIntent.getDoubleExtra("kwebmap_slat", 0.0D));
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).lng = ((float)paramIntent.getDoubleExtra("kwebmap_lng", 0.0D));
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).sds = paramIntent.getIntExtra("kwebmap_scale", 0);
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).gEy = bg.aq(paramIntent.getStringExtra("Kwebmap_locaion"), "");
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).mzo = paramIntent.getStringExtra("kPoiName");
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).sde = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHu();
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).type = 3;
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).sdf = true;
              ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).eOR = "";
              com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a((com.tencent.mm.plugin.wenote.model.a.b)localObject1, this.shJ.bHZ(), false, false, false);
              paramInt1 = 0;
              continue;
              com.tencent.mm.plugin.report.service.g.ork.i(14547, new Object[] { Integer.valueOf(5) });
              paramIntent = paramIntent.getStringExtra("choosed_file_path");
              if (bg.nm(paramIntent))
              {
                paramInt1 = 1;
              }
              else
              {
                localObject1 = new File(paramIntent);
                if (!((File)localObject1).exists())
                {
                  paramInt1 = 1;
                }
                else if (((File)localObject1).length() >= 26214400L)
                {
                  paramInt1 = 3;
                }
                else if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().dM(0, 1))
                {
                  bGZ();
                  paramInt1 = 2;
                }
                else
                {
                  if (this.htG != null)
                  {
                    this.htG.dismiss();
                    this.htG = null;
                  }
                  localObject2 = this.vKB.vKW;
                  getString(R.l.cUG);
                  this.htG = com.tencent.mm.ui.base.h.a((Context)localObject2, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
                  {
                    public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                    {
                      GMTrace.i(17182821974016L, 128022);
                      if (NoteEditorUI.O(NoteEditorUI.this) != null)
                      {
                        NoteEditorUI.O(NoteEditorUI.this).dismiss();
                        NoteEditorUI.P(NoteEditorUI.this);
                      }
                      GMTrace.o(17182821974016L, 128022);
                    }
                  });
                  localObject2 = new com.tencent.mm.plugin.wenote.model.a.c();
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).title = ((File)localObject1).getName();
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).content = com.tencent.mm.plugin.wenote.model.f.ab(com.tencent.mm.a.e.aY(paramIntent));
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).sdc = com.tencent.mm.plugin.wenote.model.h.NE(com.tencent.mm.a.e.bb(paramIntent));
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).sde = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHu();
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).type = 5;
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).sdf = true;
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).scT = com.tencent.mm.a.e.bb(paramIntent);
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).lhq = com.tencent.mm.plugin.wenote.model.f.NA(localObject2.toString());
                  this.shX = new th();
                  this.shX.Qt(((com.tencent.mm.plugin.wenote.model.a.c)localObject2).lhq);
                  this.shX.Qq(((com.tencent.mm.plugin.wenote.model.a.c)localObject2).scT);
                  ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).eOR = com.tencent.mm.plugin.wenote.model.f.n(this.shX);
                  FileOp.o(paramIntent, ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).eOR);
                  com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a((com.tencent.mm.plugin.wenote.model.a.b)localObject2, this.shJ.bHZ(), false, true, false);
                  paramInt1 = 2;
                  continue;
                  this.ghS.post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(20588059951104L, 153393);
                      Toast.makeText(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.ecB), 0).show();
                      GMTrace.o(20588059951104L, 153393);
                    }
                  });
                  paramInt1 = 2;
                }
              }
            }
          }
        }
      }
      if (paramIntent == null)
      {
        localObject1 = null;
        if (paramIntent != null) {
          break label1675;
        }
      }
      label1675:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        if (!bg.nm((String)localObject1)) {
          break label1686;
        }
        w.w("MicroMsg.NoteEditorUI", "want to send note from sns, but toUser is null");
        GMTrace.o(17177453264896L, 127982);
        return;
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label1686:
      final Object localObject2 = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
      final Object localObject3 = new ft();
      ((ft)localObject3).eIo.type = 13;
      ((ft)localObject3).eIo.context = this.vKB.vKW;
      ((ft)localObject3).eIo.toUser = ((String)localObject1);
      ((ft)localObject3).eIo.eIu = paramIntent;
      ((ft)localObject3).eIo.eDp = this.gGR;
      ((ft)localObject3).eIo.eDx = com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbM;
      ((ft)localObject3).eIo.eIt = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17166715846656L, 127902);
          localObject2.dismiss();
          com.tencent.mm.ui.snackbar.a.e(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.dwg));
          GMTrace.o(17166715846656L, 127902);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
    }
    if (1 == paramInt1)
    {
      com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.dtt));
      GMTrace.o(17177453264896L, 127982);
      return;
    }
    if (3 == paramInt1) {
      Toast.makeText(this.vKB.vKW, getString(R.l.dva), 1).show();
    }
    GMTrace.o(17177453264896L, 127982);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(17175171563520L, 127965);
    if (!bIA())
    {
      GMTrace.o(17175171563520L, 127965);
      return;
    }
    goBack();
    super.onBackPressed();
    GMTrace.o(17175171563520L, 127965);
  }
  
  public final void onCancel()
  {
    GMTrace.i(20591818047488L, 153421);
    super.onCancel();
    if (this.sin)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jS(false);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jR(false);
    }
    GMTrace.o(20591818047488L, 153421);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17175037345792L, 127964);
    this.sfG = getIntent().getIntExtra("note_open_from_scene", 2);
    this.eDr = getIntent().getLongExtra("note_msgid", -1L);
    this.sil = getIntent().getBooleanExtra("record_show_share", false);
    this.gGR = getIntent().getLongExtra("note_fav_localid", -1L);
    this.kyP = getIntent().getStringExtra("note_link_sns_localid");
    this.sbL = getIntent().getBooleanExtra("edit_status", false);
    this.sib = getIntent().getStringExtra("fav_note_xml");
    this.sid = getIntent().getIntExtra("fav_note_scroll_to_position", 0);
    this.sie = getIntent().getIntExtra("fav_note_scroll_to_offset", 0);
    this.kXD = getIntent().getStringExtra("fav_note_thumbpath");
    this.sig = getIntent().getBooleanExtra("show_share", true);
    this.sij = getIntent().getStringExtra("fav_note_link_sns_xml");
    Object localObject1 = getIntent().getStringExtra("fav_note_link_source_info");
    this.sim = getIntent().getBooleanExtra("fav_note_out_of_date", false);
    if (!bg.nm((String)localObject1)) {
      this.sif = ((String)localObject1).split(";");
    }
    if (getIntent().getIntExtra("note_fav_post_scene", 0) == 6) {
      this.sii = true;
    }
    com.tencent.mm.plugin.wenote.model.c.sbN = false;
    if ((this.sif == null) && (this.gGR > 0L))
    {
      localObject1 = new ft();
      ((ft)localObject1).eIo.type = 30;
      ((ft)localObject1).eIo.eIv = 3;
      ((ft)localObject1).eIo.eDp = this.gGR;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      if (!bg.nm(((ft)localObject1).eIp.path)) {
        break label375;
      }
    }
    label375:
    for (localObject1 = null;; localObject1 = ((ft)localObject1).eIp.path.split(";"))
    {
      this.sif = ((String[])localObject1);
      if ((this.sif == null) || (this.sif.length >= 3)) {
        break;
      }
      GMTrace.o(17175037345792L, 127964);
      return;
    }
    this.ghS = new ae();
    localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo();
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).iFZ = new ArrayList();
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).sdU = this;
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).sdV = new th();
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).sdW = 0;
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).sdX = 0;
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).sdY = 0;
    w.i("MicroMsg.NoteEditorUI", "OnCreate MainActivity, before setContentView");
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    w.i("MicroMsg.NoteEditorUI", "OnCreate MainActivity, after setContentView");
    paramBundle = new com.tencent.mm.plugin.wenote.model.a.h();
    paramBundle.content = "";
    paramBundle.scH = true;
    paramBundle.scN = false;
    if (this.sbL)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(paramBundle);
      this.sii = true;
    }
    this.Hw = this.vKB.hqF;
    this.Hw.getRootView().setBackgroundColor(-1);
    this.Ub = ((RecyclerView)findViewById(R.h.coC));
    this.shL = ((LinearLayout)this.Hw.findViewById(R.h.bvx));
    this.shL.setVisibility(8);
    this.sia = ((LinearLayout)this.shL.findViewById(R.h.bRT));
    this.sia.setVisibility(8);
    this.shN = ((RelativeLayout)findViewById(R.h.cot));
    this.shN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17160944484352L, 127859);
        if (NoteEditorUI.a(NoteEditorUI.this) != null) {
          NoteEditorUI.a(NoteEditorUI.this).sex.dismiss();
        }
        NoteEditorUI.b(NoteEditorUI.this).setVisibility(8);
        GMTrace.o(17160944484352L, 127859);
      }
    });
    this.shO = new com.tencent.mm.plugin.wenote.model.nativenote.manager.g(this, this.shN);
    this.shO.sey = this;
    new LinearLayoutManager();
    this.shT = new com.tencent.mm.plugin.wenote.ui.nativenote.a.a(this);
    this.shT.sji = com.tencent.mm.compatible.util.j.aO(this)[1];
    this.Ub.a(this.shT);
    this.Ub.Tc = true;
    this.shW = new a();
    this.Ub.a(this.shW);
    this.shJ = new com.tencent.mm.plugin.wenote.model.nativenote.manager.k(this, this.vKB.vKW);
    this.shJ.eDp = this.gGR;
    this.shJ.sfG = this.sfG;
    this.shJ.sfH = this.sii;
    this.shK = new com.tencent.mm.plugin.wenote.ui.nativenote.a.c(this.shJ);
    this.Ub.a(this.shK);
    if (this.sfG == 2) {
      this.Ub.setOnTouchListener(this.sis);
    }
    this.Ub.Ts.TW = 0L;
    this.Ub.Ts.TZ = 0L;
    this.Ub.Ts.TY = 0L;
    this.Ub.Ts.TX = 120L;
    ((android.support.v7.widget.aj)this.Ub.Ts).WL = false;
    this.sio = com.tencent.mm.br.a.fromDPToPix(this, 48);
    boolean bool;
    int i;
    if (this.sin)
    {
      w.i("MicroMsg.NoteEditorUI", "use multiselect");
      if ((this.sfG == 2) && (this.sii))
      {
        bool = true;
        i = getResources().getColor(R.e.aOF);
        paramBundle = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb();
        w.i("NoteSelectManager", "onInit start");
        if ((this != null) && (this != null)) {
          break label1660;
        }
        w.e("NoteSelectManager", "context or listener is null");
        label986:
        this.sip = new RecyclerView.k()
        {
          public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(20601615941632L, 153494);
            super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
            if (paramAnonymousInt2 > 30)
            {
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIj();
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIh();
            }
            com.tencent.mm.plugin.wenote.model.nativenote.c.d locald = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bId();
            if (((NoteEditorUI.B(NoteEditorUI.this)) || ((NoteEditorUI.C(NoteEditorUI.this) != null) && (NoteEditorUI.C(NoteEditorUI.this).getVisibility() == 0))) && (locald.bIa() == 2) && (com.tencent.mm.plugin.wenote.model.nativenote.c.f.g(paramAnonymousRecyclerView, locald.gsM) == null)) {
              NoteEditorUI.this.bHe();
            }
            GMTrace.o(20601615941632L, 153494);
          }
          
          public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
          {
            GMTrace.i(20601481723904L, 153493);
            super.e(paramAnonymousRecyclerView, paramAnonymousInt);
            switch (paramAnonymousInt)
            {
            }
            for (;;)
            {
              GMTrace.o(20601481723904L, 153493);
              return;
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIj();
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIh();
              GMTrace.o(20601481723904L, 153493);
              return;
              GMTrace.o(20601481723904L, 153493);
              return;
              boolean bool = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIi();
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jS(bool);
              bool = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIg();
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().jR(bool);
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().e(false, 50L);
            }
          }
        };
        this.Ub.a(this.sip);
      }
    }
    else
    {
      if (this.kGg != null)
      {
        this.kGg.dismiss();
        this.kGg = null;
      }
      if ((!this.sbL) && (!this.sim)) {
        this.kGg = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.elE), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(20590878523392L, 153414);
            if (NoteEditorUI.c(NoteEditorUI.this) != null)
            {
              NoteEditorUI.c(NoteEditorUI.this).dismiss();
              NoteEditorUI.a(NoteEditorUI.this, null);
            }
            GMTrace.o(20590878523392L, 153414);
          }
        });
      }
      if (this.sim)
      {
        w.i("MicroMsg.NoteEditorUI", "open msg note,  out of date");
        com.tencent.mm.ui.base.h.b(this.vKB.vKW, this.vKB.vKW.getString(R.l.dLN), null, true);
      }
      if (this.sig) {
        a(1, R.l.eex, R.g.aXV, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(17166984282112L, 127904);
            paramAnonymousMenuItem = new com.tencent.mm.ui.widget.f(NoteEditorUI.this.vKB.vKW, com.tencent.mm.ui.widget.f.xpQ, false);
            paramAnonymousMenuItem.qik = new p.c()
            {
              public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
              {
                GMTrace.i(20576248791040L, 153305);
                if (NoteEditorUI.d(NoteEditorUI.this) == 1)
                {
                  paramAnonymous2n.e(4, NoteEditorUI.this.getString(R.l.duL));
                  NoteEditorUI.a(NoteEditorUI.this, paramAnonymous2n);
                  paramAnonymous2n.e(3, NoteEditorUI.this.getString(R.l.dNH));
                  GMTrace.o(20576248791040L, 153305);
                  return;
                }
                if (NoteEditorUI.d(NoteEditorUI.this) == 2)
                {
                  paramAnonymous2n.e(0, NoteEditorUI.this.getString(R.l.duL));
                  NoteEditorUI.a(NoteEditorUI.this, paramAnonymous2n);
                  paramAnonymous2n.e(1, NoteEditorUI.this.getString(R.l.dtk));
                  paramAnonymous2n.e(2, NoteEditorUI.this.vKB.vKW.getString(R.l.cSt));
                  GMTrace.o(20576248791040L, 153305);
                  return;
                }
                NoteEditorUI.d(NoteEditorUI.this);
                GMTrace.o(20576248791040L, 153305);
              }
            };
            paramAnonymousMenuItem.qil = new p.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                int i = 0;
                int j = 1;
                paramAnonymous2Int = 1;
                GMTrace.i(20590207434752L, 153409);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  if (NoteEditorUI.e(NoteEditorUI.this) != null) {
                    NoteEditorUI.e(NoteEditorUI.this).a(null);
                  }
                  NoteEditorUI.f(NoteEditorUI.this).bHY();
                  paramAnonymous2MenuItem = new ft();
                  paramAnonymous2MenuItem.eIo.type = 32;
                  paramAnonymous2MenuItem.eIo.eDp = NoteEditorUI.g(NoteEditorUI.this);
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2MenuItem);
                  boolean bool = paramAnonymous2MenuItem.eIp.eIE;
                  if (paramAnonymous2MenuItem.eIp.path == null)
                  {
                    com.tencent.mm.ui.base.h.bm(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.duE));
                    GMTrace.o(20590207434752L, 153409);
                    return;
                  }
                  if (bool)
                  {
                    com.tencent.mm.ui.base.h.bm(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.cPM));
                    GMTrace.o(20590207434752L, 153409);
                    return;
                  }
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
                  paramAnonymous2MenuItem.putExtra("scene_from", 1);
                  paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
                  paramAnonymous2MenuItem.putExtra("select_fav_local_id", NoteEditorUI.g(NoteEditorUI.this));
                  com.tencent.mm.bj.d.a(NoteEditorUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 4101);
                  com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(18), Integer.valueOf(1), Integer.valueOf(0) });
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  if (NoteEditorUI.e(NoteEditorUI.this) != null) {
                    NoteEditorUI.e(NoteEditorUI.this).a(null);
                  }
                  NoteEditorUI.f(NoteEditorUI.this).bHY();
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
                  paramAnonymous2MenuItem.putExtra("key_fav_item_id", NoteEditorUI.g(NoteEditorUI.this));
                  com.tencent.mm.bj.d.b(NoteEditorUI.this.vKB.vKW, "favorite", ".ui.FavTagEditUI", paramAnonymous2MenuItem);
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  com.tencent.mm.ui.base.h.a(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
                  {
                    public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(20580677976064L, 153338);
                      paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.cSu), false, null);
                      NoteEditorUI.f(NoteEditorUI.this).bHY();
                      ft localft = new ft();
                      localft.eIo.type = 12;
                      localft.eIo.eDp = NoteEditorUI.g(NoteEditorUI.this);
                      localft.eIo.eIt = new Runnable()
                      {
                        public final void run()
                        {
                          GMTrace.i(20575175049216L, 153297);
                          paramAnonymous3DialogInterface.dismiss();
                          w.d("MicroMsg.NoteEditorUI", "do del, local id %d", new Object[] { Long.valueOf(NoteEditorUI.g(NoteEditorUI.this)) });
                          NoteEditorUI.this.finish();
                          GMTrace.o(20575175049216L, 153297);
                        }
                      };
                      com.tencent.mm.sdk.b.a.vgX.m(localft);
                      GMTrace.o(20580677976064L, 153338);
                    }
                  }, null);
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  paramAnonymous2MenuItem = new cf();
                  com.tencent.mm.pluginsdk.model.e.a(paramAnonymous2MenuItem, NoteEditorUI.h(NoteEditorUI.this));
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2MenuItem);
                  com.tencent.mm.pluginsdk.model.c.a(paramAnonymous2MenuItem.eDw.ret, 37, NoteEditorUI.this, NoteEditorUI.this.lKN);
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
                  paramAnonymous2MenuItem.putExtra("select_is_ret", true);
                  paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
                  paramAnonymous2MenuItem.putExtra("Retr_Msg_Type", 2);
                  paramAnonymous2MenuItem.putExtra("Retr_Msg_Id", NoteEditorUI.h(NoteEditorUI.this));
                  com.tencent.mm.bj.d.a(NoteEditorUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 4096);
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  NoteEditorUI.f(NoteEditorUI.this).bHY();
                  paramAnonymous2MenuItem = new com.tencent.mm.plugin.wenote.model.a.p();
                  if (NoteEditorUI.d(NoteEditorUI.this) == 1)
                  {
                    bool = true;
                    paramAnonymous2MenuItem.sdh = bool;
                    paramAnonymous2MenuItem.sdm = NoteEditorUI.i(NoteEditorUI.this);
                    paramAnonymous2MenuItem.sdl = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().NI(NoteEditorUI.this.getString(R.l.ekS));
                    paramAnonymous2MenuItem.sdn = NoteEditorUI.j(NoteEditorUI.this);
                    paramAnonymous2MenuItem.sdo = NoteEditorUI.k(NoteEditorUI.this);
                    if (NoteEditorUI.d(NoteEditorUI.this) != 1) {
                      break label943;
                    }
                    paramAnonymous2MenuItem.sdj = NoteEditorUI.h(NoteEditorUI.this);
                    if (!NoteEditorUI.l(NoteEditorUI.this)) {
                      break label915;
                    }
                    paramAnonymous2MenuItem.sdk = true;
                    com.tencent.mm.plugin.report.service.g.ork.i(14790, new Object[] { Integer.valueOf(3) });
                  }
                  for (;;)
                  {
                    com.tencent.mm.plugin.wenote.model.nativenote.manager.h.bHH().a(paramAnonymous2MenuItem);
                    com.tencent.mm.ui.snackbar.a.e(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.ekT));
                    GMTrace.o(20590207434752L, 153409);
                    return;
                    bool = false;
                    break;
                    label915:
                    paramAnonymous2MenuItem.sdk = false;
                    com.tencent.mm.plugin.report.service.g.ork.i(14790, new Object[] { Integer.valueOf(2) });
                    continue;
                    label943:
                    com.tencent.mm.plugin.report.service.g.ork.i(14790, new Object[] { Integer.valueOf(1) });
                    paramAnonymous2MenuItem.sdi = NoteEditorUI.g(NoteEditorUI.this);
                  }
                  com.tencent.mm.plugin.wenote.model.nativenote.manager.h.bHH().a(null);
                  com.tencent.mm.ui.snackbar.a.e(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.ekQ));
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  if (bg.nm(NoteEditorUI.m(NoteEditorUI.this)))
                  {
                    NoteEditorUI.n(NoteEditorUI.this).post(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(20582020153344L, 153348);
                        Toast.makeText(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.ecA), 0).show();
                        GMTrace.o(20582020153344L, 153348);
                      }
                    });
                    GMTrace.o(20590207434752L, 153409);
                    return;
                  }
                  NoteEditorUI.a(NoteEditorUI.this, NoteEditorUI.m(NoteEditorUI.this));
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(18), Integer.valueOf(0), Integer.valueOf(0) });
                  if (NoteEditorUI.o(NoteEditorUI.this)) {
                    paramAnonymous2Int = 1;
                  }
                  String str;
                  for (;;)
                  {
                    if (paramAnonymous2Int != 0)
                    {
                      NoteEditorUI.f(NoteEditorUI.this).bHY();
                      NoteEditorUI.this.bIB();
                      NoteEditorUI.r(NoteEditorUI.this);
                    }
                    if (NoteEditorUI.o(NoteEditorUI.this))
                    {
                      NoteEditorUI.s(NoteEditorUI.this);
                      NoteEditorUI.t(NoteEditorUI.this);
                    }
                    paramAnonymous2MenuItem = new ft();
                    paramAnonymous2MenuItem.eIo.type = 30;
                    paramAnonymous2MenuItem.eIo.eIv = 1;
                    paramAnonymous2MenuItem.eIo.eDp = NoteEditorUI.g(NoteEditorUI.this);
                    com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2MenuItem);
                    str = paramAnonymous2MenuItem.eIp.path;
                    NoteEditorUI.b(NoteEditorUI.this, paramAnonymous2MenuItem.eIp.eIy);
                    if (!bg.nm(str)) {
                      break;
                    }
                    NoteEditorUI.n(NoteEditorUI.this).post(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(20588731039744L, 153398);
                        Toast.makeText(NoteEditorUI.this, NoteEditorUI.this.getString(R.l.ecA), 0).show();
                        GMTrace.o(20588731039744L, 153398);
                      }
                    });
                    GMTrace.o(20590207434752L, 153409);
                    return;
                    paramAnonymous2Int = i;
                    if (NoteEditorUI.p(NoteEditorUI.this))
                    {
                      paramAnonymous2Int = i;
                      if (!com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHv().equals(NoteEditorUI.q(NoteEditorUI.this))) {
                        paramAnonymous2Int = 1;
                      }
                    }
                  }
                  NoteEditorUI.a(NoteEditorUI.this, str);
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  NoteEditorUI.a(NoteEditorUI.this, com.tencent.mm.ui.base.h.a(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.elE), true, new DialogInterface.OnCancelListener()
                  {
                    public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
                    {
                      GMTrace.i(20578933145600L, 153325);
                      if (NoteEditorUI.c(NoteEditorUI.this) != null)
                      {
                        NoteEditorUI.c(NoteEditorUI.this).dismiss();
                        NoteEditorUI.a(NoteEditorUI.this, null);
                      }
                      GMTrace.o(20578933145600L, 153325);
                    }
                  }));
                  paramAnonymous2MenuItem = new ft();
                  paramAnonymous2MenuItem.eIo.type = 32;
                  paramAnonymous2MenuItem.eIo.eDp = NoteEditorUI.g(NoteEditorUI.this);
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2MenuItem);
                  bool = paramAnonymous2MenuItem.eIp.eIE;
                  if (paramAnonymous2MenuItem.eIp.path == null)
                  {
                    NoteEditorUI.b(NoteEditorUI.c(NoteEditorUI.this));
                    Toast.makeText(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.vKB.vKW.getString(R.l.dLP), 1).show();
                    paramAnonymous2MenuItem = com.tencent.mm.plugin.report.service.g.ork;
                    if (NoteEditorUI.u(NoteEditorUI.this)) {}
                    for (;;)
                    {
                      paramAnonymous2MenuItem.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(paramAnonymous2Int) });
                      GMTrace.o(20590207434752L, 153409);
                      return;
                      paramAnonymous2Int = 0;
                    }
                  }
                  if (bool)
                  {
                    NoteEditorUI.b(NoteEditorUI.c(NoteEditorUI.this));
                    Toast.makeText(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.vKB.vKW.getString(R.l.dLP), 1).show();
                    paramAnonymous2MenuItem = com.tencent.mm.plugin.report.service.g.ork;
                    if (NoteEditorUI.u(NoteEditorUI.this)) {}
                    for (paramAnonymous2Int = j;; paramAnonymous2Int = 0)
                    {
                      paramAnonymous2MenuItem.i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(paramAnonymous2Int) });
                      GMTrace.o(20590207434752L, 153409);
                      return;
                    }
                  }
                  NoteEditorUI.n(NoteEditorUI.this).post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(20579738451968L, 153331);
                      NoteEditorUI.f(NoteEditorUI.this).bHY();
                      com.tencent.mm.plugin.wenote.model.a.a locala = new com.tencent.mm.plugin.wenote.model.a.a();
                      locala.scH = false;
                      locala.scN = false;
                      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(locala);
                      int i = NoteEditorUI.f(NoteEditorUI.this).sfG;
                      NoteEditorUI.f(NoteEditorUI.this).sfG = 3;
                      com.tencent.mm.plugin.wenote.model.h.yv(i);
                      GMTrace.o(20579738451968L, 153331);
                    }
                  });
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  paramAnonymous2MenuItem = new ft();
                  paramAnonymous2MenuItem.eIo.type = 32;
                  paramAnonymous2MenuItem.eIo.eDp = NoteEditorUI.g(NoteEditorUI.this);
                  paramAnonymous2MenuItem.eIo.eDx = com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbM;
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2MenuItem);
                  bool = paramAnonymous2MenuItem.eIp.eIE;
                  if (paramAnonymous2MenuItem.eIp.path == null)
                  {
                    com.tencent.mm.ui.base.h.bm(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.duE));
                    GMTrace.o(20590207434752L, 153409);
                    return;
                  }
                  if (bool)
                  {
                    com.tencent.mm.ui.base.h.bm(NoteEditorUI.this.vKB.vKW, NoteEditorUI.this.getString(R.l.cPP));
                    GMTrace.o(20590207434752L, 153409);
                    return;
                  }
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
                  paramAnonymous2MenuItem.putExtra("scene_from", 1);
                  paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
                  paramAnonymous2MenuItem.putExtra("select_fav_local_id", NoteEditorUI.g(NoteEditorUI.this));
                  paramAnonymous2MenuItem.putExtra("Retr_fav_xml_str", com.tencent.mm.plugin.wenote.model.b.bGM().sbA.bGN());
                  com.tencent.mm.bj.d.a(NoteEditorUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 4355);
                  GMTrace.o(20590207434752L, 153409);
                  return;
                  com.tencent.mm.plugin.wenote.model.h.aK(NoteEditorUI.this.vKB.vKW, NoteEditorUI.v(NoteEditorUI.this));
                }
              }
            };
            if (NoteEditorUI.d(NoteEditorUI.this) == 2)
            {
              com.tencent.mm.plugin.wenote.model.nativenote.manager.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo();
              if ((localc.sdY > 0) || (localc.sdX > 0)) {}
              for (int i = 1; i == 0; i = 0)
              {
                GMTrace.o(17166984282112L, 127904);
                return false;
              }
            }
            if (NoteEditorUI.d(NoteEditorUI.this) == 2)
            {
              NoteEditorUI.this.bHe();
              if (NoteEditorUI.a(NoteEditorUI.this) != null) {
                NoteEditorUI.a(NoteEditorUI.this).sex.dismiss();
              }
              NoteEditorUI.b(NoteEditorUI.this).setVisibility(8);
              if (NoteEditorUI.w(NoteEditorUI.this)) {
                com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb().bIf();
              }
            }
            NoteEditorUI.n(NoteEditorUI.this).postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20580141105152L, 153334);
                if (NoteEditorUI.d(NoteEditorUI.this) != 4) {
                  paramAnonymousMenuItem.bFk();
                }
                GMTrace.o(20580141105152L, 153334);
              }
            }, 100L);
            GMTrace.o(17166984282112L, 127904);
            return false;
          }
        });
      }
      sq(getString(R.l.dvj));
      lh(true);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20589670563840L, 153405);
          if (!NoteEditorUI.x(NoteEditorUI.this))
          {
            GMTrace.o(20589670563840L, 153405);
            return true;
          }
          NoteEditorUI.y(NoteEditorUI.this);
          NoteEditorUI.this.finish();
          GMTrace.o(20589670563840L, 153405);
          return true;
        }
      }, R.g.aTo);
      com.tencent.mm.pluginsdk.e.h(this);
      if (this.sbL)
      {
        d(true, 300L);
        P(1, 0L);
      }
      if ((this.sfG != 2) || (!this.sii)) {
        break label2522;
      }
      this.shM = new b();
      paramBundle = this.shM;
      localObject1 = this.shL;
      paramBundle.hwB = ((View)localObject1);
      com.tencent.mm.plugin.wenote.model.nativenote.manager.k.bHX().sfA = paramBundle;
      paramBundle.siO = ((LinearLayout)((View)localObject1).findViewById(R.h.bRT));
      paramBundle.siN = ((ImageButton)((View)localObject1).findViewById(R.h.coA));
      paramBundle.siP = ((ImageButton)((View)localObject1).findViewById(R.h.cow));
      paramBundle.siQ = ((ImageButton)((View)localObject1).findViewById(R.h.coy));
      paramBundle.siR = ((ImageButton)((View)localObject1).findViewById(R.h.cox));
      paramBundle.siS = ((ImageButton)((View)localObject1).findViewById(R.h.coz));
      paramBundle.siT = ((LinearLayout)paramBundle.siO.findViewById(R.h.coG));
      paramBundle.siU = ((LinearLayout)paramBundle.siO.findViewById(R.h.coJ));
      paramBundle.siV = ((LinearLayout)paramBundle.siO.findViewById(R.h.coH));
      paramBundle.siW = ((LinearLayout)paramBundle.siO.findViewById(R.h.coI));
      paramBundle.siX = ((LinearLayout)paramBundle.siO.findViewById(R.h.bOp));
      paramBundle.siN.setOnClickListener(new b.1(paramBundle, this));
      paramBundle.siR.setOnClickListener(new b.6(paramBundle, this));
      paramBundle.siS.setOnClickListener(new b.7(paramBundle, this, this));
      paramBundle.siP.setOnClickListener(new b.8(paramBundle, this));
      paramBundle.siQ.setOnClickListener(new b.9(paramBundle, this));
      paramBundle.siX.setOnClickListener(new b.10(paramBundle, this));
      paramBundle.siT.setOnClickListener(new b.11(paramBundle, this));
      paramBundle.siU.setOnClickListener(new b.12(paramBundle, this));
      paramBundle.siV.setOnClickListener(new b.13(paramBundle, this));
      paramBundle.siW.setOnClickListener(new b.2(paramBundle, this));
      getWindow().setSoftInputMode(18);
    }
    for (;;)
    {
      this.Ub.getViewTreeObserver().addOnGlobalLayoutListener(this.NF);
      this.sih = System.currentTimeMillis();
      w.i("MicroMsg.NoteEditorUI", "startnoteeditorui, oncreate , currenttime is %d", new Object[] { Long.valueOf(this.sih) });
      at.wS().a(921, this);
      GMTrace.o(17175037345792L, 127964);
      return;
      bool = false;
      break;
      label1660:
      paramBundle.sgg = bool;
      paramBundle.sgj = 14;
      paramBundle.sgk = 32;
      paramBundle.sgl = (com.tencent.mm.br.a.fromDPToPix(this, 21) - paramBundle.sgk);
      paramBundle.sgm = (com.tencent.mm.br.a.fromDPToPix(this, 40) + paramBundle.sgk * 2);
      paramBundle.sgn = (com.tencent.mm.br.a.fromDPToPix(this, 240) + paramBundle.sgk * 2);
      paramBundle.sgh = com.tencent.mm.br.a.fromDPToPix(this, 22);
      paramBundle.sgi = com.tencent.mm.br.a.fromDPToPix(this, 1);
      paramBundle.mScreenHeight = getResources().getDisplayMetrics().heightPixels;
      paramBundle.mScreenWidth = getResources().getDisplayMetrics().widthPixels;
      paramBundle.sgr = new int[] { -1, -1 };
      paramBundle.sgs = new int[] { -1, -1 };
      paramBundle.sgt = new int[] { -1, -1 };
      paramBundle.sgu = new int[] { -1, -1 };
      localObject1 = new com.tencent.mm.plugin.wenote.model.nativenote.c.a(this, 2, paramBundle.sgh, paramBundle.sgi, i, paramBundle);
      paramBundle.sgv = new PopupWindow((View)localObject1, ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).bqt(), ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).bhb(), false);
      paramBundle.sgv.setClippingEnabled(false);
      paramBundle.sgv.setAnimationStyle(R.m.emk);
      paramBundle.sgp = (((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).jRR + ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).sfP + 1);
      paramBundle.sgq = com.tencent.mm.br.a.fromDPToPix(this, 6);
      Object localObject2 = new com.tencent.mm.plugin.wenote.model.nativenote.c.a(this, 3, paramBundle.sgh, paramBundle.sgi, i, paramBundle);
      paramBundle.sgw = new PopupWindow((View)localObject2, ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject2).bqt(), ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).bhb(), false);
      paramBundle.sgw.setClippingEnabled(false);
      paramBundle.sgw.setAnimationStyle(R.m.emj);
      localObject2 = new com.tencent.mm.plugin.wenote.model.nativenote.c.a(this, 4, paramBundle.sgh, paramBundle.sgi, i, paramBundle);
      paramBundle.sgx = new PopupWindow((View)localObject2, ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject2).bqt(), ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).bhb(), false);
      paramBundle.sgx.setClippingEnabled(false);
      paramBundle.sgx.setAnimationStyle(R.m.eml);
      localObject2 = LayoutInflater.from(this).inflate(R.i.cDm, null);
      ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      paramBundle.sgy = new PopupWindow((View)localObject2, -2, -2, false);
      paramBundle.sgy.setBackgroundDrawable(getResources().getDrawable(R.g.baG));
      paramBundle.sgy.setClippingEnabled(false);
      paramBundle.sgy.setAnimationStyle(R.m.emm);
      paramBundle.sgE = ((TextView)((View)localObject2).findViewById(R.h.bRq));
      paramBundle.sgF = ((TextView)((View)localObject2).findViewById(R.h.bRM));
      paramBundle.sgG = ((TextView)((View)localObject2).findViewById(R.h.bRJ));
      paramBundle.sgH = ((TextView)((View)localObject2).findViewById(R.h.bRI));
      paramBundle.sgI = ((TextView)((View)localObject2).findViewById(R.h.bRy));
      paramBundle.sgJ = ((TextView)((View)localObject2).findViewById(R.h.bRx));
      paramBundle.sgK = ((TextView)((View)localObject2).findViewById(R.h.bRw));
      paramBundle.sgL = ((TextView)((View)localObject2).findViewById(R.h.bRE));
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgE, paramBundle.sgj);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgF, paramBundle.sgj);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgG, paramBundle.sgj);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgH, paramBundle.sgj);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgI, paramBundle.sgj);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgJ, paramBundle.sgj);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgK, paramBundle.sgj);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.d(paramBundle.sgL, paramBundle.sgj);
      paramBundle.sgE.setOnClickListener(new e.10(paramBundle));
      paramBundle.sgF.setOnClickListener(new e.11(paramBundle));
      paramBundle.sgG.setOnClickListener(new e.12(paramBundle));
      paramBundle.sgH.setOnClickListener(new e.13(paramBundle));
      paramBundle.sgI.setOnClickListener(new e.2(paramBundle));
      paramBundle.sgJ.setOnClickListener(new e.3(paramBundle));
      paramBundle.sgK.setOnClickListener(new e.4(paramBundle));
      paramBundle.sgL.setOnClickListener(new e.5(paramBundle));
      paramBundle.sgo = ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).jRR;
      paramBundle.sgz = this;
      paramBundle.sgA = new com.tencent.mm.plugin.wenote.model.nativenote.c.d();
      paramBundle.sgB = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
      paramBundle.mHandler = new ae();
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit = true;
      w.i("NoteSelectManager", "onInit end");
      break label986;
      label2522:
      this.shL.setVisibility(8);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(17175574216704L, 127968);
    super.onDestroy();
    if (this.sin)
    {
      if (this.Ub != null)
      {
        localObject = this.Ub;
        RecyclerView.k localk = this.sip;
        if (((RecyclerView)localObject).TE != null) {
          ((RecyclerView)localObject).TE.remove(localk);
        }
      }
      localObject = com.tencent.mm.plugin.wenote.model.nativenote.c.e.bIb();
      w.i("NoteSelectManager", "onDestroy");
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit = false;
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgC != null) {
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgC.stopTimer();
      }
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgD != null) {
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgD.stopTimer();
      }
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgv != null) {
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgv.dismiss();
      }
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgw != null) {
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgw.dismiss();
      }
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgx != null) {
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgx.dismiss();
      }
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgy != null) {
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).sgy.dismiss();
      }
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.sgf = null;
    }
    at.wS().b(921, this);
    if (this.shJ != null)
    {
      localObject = this.shJ;
      ((com.tencent.mm.plugin.wenote.model.nativenote.manager.k)localObject).sfJ.stopTimer();
      ((com.tencent.mm.plugin.wenote.model.nativenote.manager.k)localObject).sfy = -1L;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.k.sft = null;
      ((com.tencent.mm.plugin.wenote.model.nativenote.manager.k)localObject).sfs = null;
    }
    if (com.tencent.mm.plugin.wenote.model.b.bGM().sbA != null)
    {
      com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbG.clear();
      com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbF.clear();
      com.tencent.mm.plugin.wenote.model.b.bGM().sbA.sbE.clear();
    }
    Object localObject = com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.bII();
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).ahO();
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).jrf = null;
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).jrj = null;
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).fIz.clear();
    com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.skj = null;
    if (com.tencent.mm.plugin.wenote.model.k.bGR() != null) {
      com.tencent.mm.plugin.wenote.model.k.destroy();
    }
    GMTrace.o(17175574216704L, 127968);
  }
  
  protected void onPause()
  {
    GMTrace.i(17177855918080L, 127985);
    super.onPause();
    if (this.shM != null) {
      this.shM.a(this);
    }
    if (com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.bII().axU()) {
      com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.bII().ahO();
    }
    this.siv = this.shV;
    d(false, 0L);
    com.tencent.mm.plugin.wenote.model.a.p localp = com.tencent.mm.plugin.wenote.model.nativenote.manager.h.bHH().bHI();
    if (c(localp))
    {
      localp.sdl = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().NI(getString(R.l.ekS));
      localp.sdn = this.lEi;
      localp.sdo = this.sic;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.h.bHH().a(localp);
    }
    GMTrace.o(17177855918080L, 127985);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(17784251613184L, 132503);
    w.i("MicroMsg.NoteEditorUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17784251613184L, 132503);
      return;
      if (paramArrayOfInt[0] != 0) {
        bHa();
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(17177721700352L, 127984);
    super.onResume();
    if (this.sfG == 2) {
      switch (this.siu)
      {
      }
    }
    for (;;)
    {
      this.siu = -1;
      this.sit = false;
      GMTrace.o(17177721700352L, 127984);
      return;
      if (this.siv)
      {
        d(true, 100L);
        P(1, 0L);
        continue;
        d(true, 100L);
        P(1, 0L);
        continue;
        if (!this.sit)
        {
          d(true, 100L);
          P(1, 0L);
        }
      }
    }
  }
  
  public final void yw(final int paramInt)
  {
    GMTrace.i(20591549612032L, 153419);
    Handler localHandler = getWindow().getDecorView().getHandler();
    if (localHandler == null)
    {
      GMTrace.o(20591549612032L, 153419);
      return;
    }
    localHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20588462604288L, 153396);
        w.i("MicroMsg.NoteEditorUI", "huahuastart: onNotifyItemChanged,position is %d", new Object[] { Integer.valueOf(paramInt) });
        NoteEditorUI.F(NoteEditorUI.this).bc(paramInt);
        w.i("MicroMsg.NoteEditorUI", "huahuaend: onNotifyItemChanged,position is %d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(20588462604288L, 153396);
      }
    }, 0L);
    GMTrace.o(20591549612032L, 153419);
  }
  
  public final void yx(int paramInt)
  {
    GMTrace.i(17176111087616L, 127972);
    try
    {
      this.shK.bd(paramInt);
      GMTrace.o(17176111087616L, 127972);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NoteEditorUI", localException, "", new Object[0]);
      w.e("MicroMsg.NoteEditorUI", "onNotifyItemInserted error,positionStart:%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17176111087616L, 127972);
    }
  }
  
  public final void yy(int paramInt)
  {
    GMTrace.i(17175976869888L, 127971);
    try
    {
      this.shK.be(paramInt);
      GMTrace.o(17175976869888L, 127971);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.NoteEditorUI", "onNotifyItemRemoved error,positionStart:%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17175976869888L, 127971);
    }
  }
  
  public final void yz(final int paramInt)
  {
    GMTrace.i(17178929659904L, 127993);
    if ((paramInt < 0) || (paramInt >= com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().size()))
    {
      GMTrace.o(17178929659904L, 127993);
      return;
    }
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20577590968320L, 153315);
        NoteEditorUI.A(NoteEditorUI.this).aX(paramInt);
        GMTrace.o(20577590968320L, 153315);
      }
    });
    GMTrace.o(17178929659904L, 127993);
  }
  
  final class a
    extends com.tencent.mm.plugin.wenote.ui.nativenote.a.b
  {
    a()
    {
      GMTrace.i(17155173122048L, 127816);
      GMTrace.o(17155173122048L, 127816);
    }
    
    public final void bID()
    {
      GMTrace.i(17155307339776L, 127817);
      NoteEditorUI.N(NoteEditorUI.this);
      GMTrace.o(17155307339776L, 127817);
    }
    
    public final void bIE()
    {
      GMTrace.i(17155441557504L, 127818);
      NoteEditorUI.N(NoteEditorUI.this);
      GMTrace.o(17155441557504L, 127818);
    }
    
    public final void e(RecyclerView paramRecyclerView, int paramInt)
    {
      GMTrace.i(20574235525120L, 153290);
      super.e(paramRecyclerView, paramInt);
      if (paramRecyclerView.SW != null)
      {
        paramRecyclerView = ((LinearLayoutManager)NoteEditorUI.A(NoteEditorUI.this).SW).getChildAt(0);
        if (paramRecyclerView != null)
        {
          NoteEditorUI.a(NoteEditorUI.this, paramRecyclerView.getTop());
          NoteEditorUI.b(NoteEditorUI.this, LinearLayoutManager.be(paramRecyclerView));
        }
      }
      GMTrace.o(20574235525120L, 153290);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\NoteEditorUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */