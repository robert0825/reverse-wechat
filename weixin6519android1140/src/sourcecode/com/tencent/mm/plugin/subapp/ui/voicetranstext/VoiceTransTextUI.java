package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.text.ClipboardManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ka;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.protocal.c.awj;
import com.tencent.mm.protocal.c.bmk;
import com.tencent.mm.protocal.c.boa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.bf;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.y.at;

public class VoiceTransTextUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ad.e
{
  private final String TAG;
  private long fKQ;
  private int hQ;
  private int ivN;
  private int ivO;
  private ScrollView kFq;
  private Button kVx;
  private View kgo;
  private ae mHandler;
  private long oby;
  private bf qrc;
  private a qrf;
  private c qrg;
  private b qrh;
  private com.tencent.mm.modelvoice.b qri;
  private volatile boolean qrk;
  private boolean qrl;
  private aj qrm;
  private View qvb;
  private View qvc;
  private LinearLayout qvd;
  private TextView qve;
  private int qvf;
  private boolean qvg;
  private com.tencent.mm.modelvoice.p qvh;
  private au qvi;
  private com.tencent.mm.sdk.b.c qvj;
  private boolean qvk;
  private boolean qvl;
  private int qvm;
  private View.OnTouchListener qvn;
  private View.OnClickListener qvo;
  private ClipboardManager qvp;
  private View.OnLongClickListener qvq;
  
  public VoiceTransTextUI()
  {
    GMTrace.i(5763846111232L, 42944);
    this.TAG = "MicroMsg.VoiceTransTextUI";
    this.kgo = null;
    this.qvb = null;
    this.qvc = null;
    this.qvd = null;
    this.qve = null;
    this.kVx = null;
    this.kFq = null;
    this.qrk = false;
    this.qvf = 6;
    this.qrl = false;
    this.qvg = false;
    this.qvk = false;
    this.qvl = false;
    this.oby = 0L;
    this.qvo = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5772972916736L, 43012);
        VoiceTransTextUI.this.finish();
        GMTrace.o(5772972916736L, 43012);
      }
    };
    this.qvq = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(5763443458048L, 42941);
        w.d("MicroMsg.VoiceTransTextUI", "onLongClick");
        paramAnonymousView = VoiceTransTextUI.this;
        String str = VoiceTransTextUI.this.getString(R.l.cSp);
        h.c local1 = new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(5771093868544L, 42998);
            if ((paramAnonymous2Int == 0) && (VoiceTransTextUI.a(VoiceTransTextUI.this) != null) && (VoiceTransTextUI.b(VoiceTransTextUI.this) != null)) {
              VoiceTransTextUI.a(VoiceTransTextUI.this).setText(VoiceTransTextUI.b(VoiceTransTextUI.this).getText());
            }
            GMTrace.o(5771093868544L, 42998);
          }
        };
        h.a(paramAnonymousView, "", new String[] { str }, "", local1);
        GMTrace.o(5763443458048L, 42941);
        return false;
      }
    };
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(5771362304000L, 43000);
        int i = paramAnonymousMessage.what;
        if (i == 1)
        {
          VoiceTransTextUI.b(VoiceTransTextUI.this, true);
          GMTrace.o(5771362304000L, 43000);
          return;
        }
        if (i == 2) {
          VoiceTransTextUI.b(VoiceTransTextUI.this, false);
        }
        GMTrace.o(5771362304000L, 43000);
      }
    };
    GMTrace.o(5763846111232L, 42944);
  }
  
  private void JA(String paramString)
  {
    GMTrace.i(5765590941696L, 42957);
    this.qrl = true;
    if (!com.tencent.mm.sdk.platformtools.bg.nm(paramString))
    {
      com.tencent.mm.storage.bg localbg = m.NL();
      bf localbf = new bf();
      localbf.field_msgId = this.fKQ;
      localbf.UD(brR());
      localbf.field_content = paramString;
      localbg.a(localbf);
    }
    aw(b.qvC, paramString);
    GMTrace.o(5765590941696L, 42957);
  }
  
  private void aw(int paramInt, String paramString)
  {
    GMTrace.i(5764517199872L, 42949);
    switch (9.qvw[(paramInt - 1)])
    {
    }
    for (;;)
    {
      if ((paramInt != b.qvC) && (paramInt != b.qvE)) {
        break label241;
      }
      this.kFq.setOnTouchListener(this.qvn);
      this.kgo.setOnClickListener(this.qvo);
      GMTrace.o(5764517199872L, 42949);
      return;
      if (com.tencent.mm.sdk.platformtools.bg.nm(paramString))
      {
        paramInt = b.qvE;
        paramString = null;
        break;
      }
      this.qvd.setVisibility(0);
      this.qvb.setVisibility(8);
      this.kVx.setVisibility(4);
      this.qvc.setVisibility(8);
      this.qve.setText(paramString);
      il(true);
      continue;
      this.qvd.setVisibility(0);
      this.qvb.setVisibility(0);
      this.kVx.setVisibility(0);
      if (paramString != null)
      {
        this.qve.setText(paramString);
        il(false);
        continue;
        this.qvd.setVisibility(8);
        this.qvb.setVisibility(8);
        this.kVx.setHeight(0);
        this.kVx.setVisibility(8);
        this.qvc.setVisibility(0);
      }
    }
    label241:
    this.kFq.setOnTouchListener(null);
    this.kgo.setOnClickListener(null);
    GMTrace.o(5764517199872L, 42949);
  }
  
  private void brQ()
  {
    GMTrace.i(5764651417600L, 42950);
    w.d("MicroMsg.VoiceTransTextUI", "cancel all net");
    if (this.qrf != null)
    {
      at.wS().c(this.qrf);
      at.wS().b(this.qrf.getType(), this);
    }
    if (this.qrg != null)
    {
      at.wS().c(this.qrg);
      at.wS().b(this.qrg.getType(), this);
    }
    if (this.qrh != null)
    {
      at.wS().c(this.qrh);
      at.wS().b(this.qrh.getType(), this);
    }
    GMTrace.o(5764651417600L, 42950);
  }
  
  private String brR()
  {
    GMTrace.i(5764785635328L, 42951);
    if (this.qvh != null)
    {
      str = this.qvh.clientId;
      GMTrace.o(5764785635328L, 42951);
      return str;
    }
    String str = this.qvi.field_talker + this.qvi.field_msgId + "T" + this.qvi.field_createTime;
    GMTrace.o(5764785635328L, 42951);
    return str;
  }
  
  private int brS()
  {
    GMTrace.i(5764919853056L, 42952);
    if (this.qvh != null)
    {
      i = this.qvh.gsL;
      GMTrace.o(5764919853056L, 42952);
      return i;
    }
    int i = o.mm(this.qvi.field_imgPath);
    GMTrace.o(5764919853056L, 42952);
    return i;
  }
  
  private com.tencent.mm.modelvoice.b brT()
  {
    GMTrace.i(5765322506240L, 42955);
    if (this.qri == null)
    {
      if (this.qvh == null) {
        break label53;
      }
      this.qri = q.mK(this.qvh.euR);
    }
    for (;;)
    {
      com.tencent.mm.modelvoice.b localb = this.qri;
      GMTrace.o(5765322506240L, 42955);
      return localb;
      label53:
      if (this.qvi != null) {
        this.qri = q.mK(this.qvi.field_imgPath);
      } else {
        w.d("MicroMsg.VoiceTransTextUI", "error why get fileOperator, already has transContent. ");
      }
    }
  }
  
  private String getFileName()
  {
    GMTrace.i(5765188288512L, 42954);
    if (this.qvh != null)
    {
      str = this.qvh.euR;
      GMTrace.o(5765188288512L, 42954);
      return str;
    }
    String str = this.qvi.field_imgPath;
    GMTrace.o(5765188288512L, 42954);
    return str;
  }
  
  private void il(final boolean paramBoolean)
  {
    GMTrace.i(5765993594880L, 42960);
    if ((this.kFq == null) || (this.qvd == null))
    {
      GMTrace.o(5765993594880L, 42960);
      return;
    }
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5761967063040L, 42930);
        if (VoiceTransTextUI.r(VoiceTransTextUI.this).getMeasuredHeight() >= VoiceTransTextUI.s(VoiceTransTextUI.this).getMeasuredHeight())
        {
          VoiceTransTextUI.r(VoiceTransTextUI.this).fullScroll(130);
          int i = VoiceTransTextUI.r(VoiceTransTextUI.this).getScrollY();
          VoiceTransTextUI.d(VoiceTransTextUI.this, VoiceTransTextUI.r(VoiceTransTextUI.this).getPaddingTop());
          VoiceTransTextUI.d(VoiceTransTextUI.this, VoiceTransTextUI.t(VoiceTransTextUI.this) - i);
          if (!paramBoolean)
          {
            if (VoiceTransTextUI.t(VoiceTransTextUI.this) > 0)
            {
              VoiceTransTextUI.r(VoiceTransTextUI.this).setPadding(0, VoiceTransTextUI.t(VoiceTransTextUI.this), 0, 0);
              GMTrace.o(5761967063040L, 42930);
            }
          }
          else
          {
            VoiceTransTextUI.r(VoiceTransTextUI.this).setPadding(0, 0, 0, 0);
            VoiceTransTextUI.u(VoiceTransTextUI.this).setVisibility(8);
            VoiceTransTextUI.u(VoiceTransTextUI.this).setHeight(0);
          }
        }
        GMTrace.o(5761967063040L, 42930);
      }
    }, 5L);
    GMTrace.o(5765993594880L, 42960);
  }
  
  private long qY()
  {
    GMTrace.i(5765054070784L, 42953);
    if (this.qvh == null)
    {
      GMTrace.o(5765054070784L, 42953);
      return -1L;
    }
    long l = this.qvh.eSf;
    GMTrace.o(5765054070784L, 42953);
    return l;
  }
  
  private void vT(int paramInt)
  {
    GMTrace.i(5764382982144L, 42948);
    brQ();
    switch (9.qvv[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(5764382982144L, 42948);
      return;
      w.i("MicroMsg.VoiceTransTextUI", "net check");
      if (qY() > 0L) {
        w.i("MicroMsg.VoiceTransTextUI", "has msg svr id: %d", new Object[] { Long.valueOf(qY()) });
      }
      for (this.qrf = new a(brR(), brS(), brT().getFormat(), qY(), getFileName());; this.qrf = new a(brR(), brS(), getFileName()))
      {
        at.wS().a(this.qrf, 0);
        at.wS().a(this.qrf.getType(), this);
        if (this.qvj != null) {
          break;
        }
        if (this.qvj == null) {
          this.qvj = new com.tencent.mm.sdk.b.c() {};
        }
        com.tencent.mm.sdk.b.a.vgX.b(this.qvj);
        GMTrace.o(5764382982144L, 42948);
        return;
        w.i("MicroMsg.VoiceTransTextUI", "not existex msg svr id: %d", new Object[] { Long.valueOf(qY()) });
      }
      w.i("MicroMsg.VoiceTransTextUI", "net upload");
      if (this.qrf == null)
      {
        w.d("MicroMsg.VoiceTransTextUI", "request upload must after check!");
        GMTrace.o(5764382982144L, 42948);
        return;
      }
      if (brT() == null)
      {
        w.d("MicroMsg.VoiceTransTextUI", "can't get FileOperator!");
        GMTrace.o(5764382982144L, 42948);
        return;
      }
      this.qrg = new c(brR(), this.qrf.quX, brT().getFormat(), getFileName());
      at.wS().a(this.qrg, 0);
      at.wS().a(this.qrg.getType(), this);
      GMTrace.o(5764382982144L, 42948);
      return;
      w.i("MicroMsg.VoiceTransTextUI", "net upload more");
      if (this.qrg == null)
      {
        w.d("MicroMsg.VoiceTransTextUI", "upload more need has upload netScene!");
        GMTrace.o(5764382982144L, 42948);
        return;
      }
      this.qrg = new c(this.qrg);
      at.wS().a(this.qrg, 0);
      at.wS().a(this.qrg.getType(), this);
      GMTrace.o(5764382982144L, 42948);
      return;
      this.qvg = false;
      if (this.qrk)
      {
        w.i("MicroMsg.VoiceTransTextUI", "pulling so pass");
        GMTrace.o(5764382982144L, 42948);
        return;
      }
      w.i("MicroMsg.VoiceTransTextUI", "net get");
      if (this.qrf == null)
      {
        w.d("MicroMsg.VoiceTransTextUI", "request get must after check!");
        GMTrace.o(5764382982144L, 42948);
        return;
      }
      this.qrk = true;
      this.qrh = new b(brR());
      at.wS().a(this.qrh, 0);
      at.wS().a(this.qrh.getType(), this);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(5764248764416L, 42947);
    oM(R.l.ehk);
    this.kVx.setOnClickListener(this);
    if ((this.qrc != null) && (!com.tencent.mm.sdk.platformtools.bg.nm(this.qrc.field_content)))
    {
      aw(b.qvC, this.qrc.field_content);
      if ((this.kFq != null) && (this.qvd != null)) {}
    }
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label115;
      }
      GMTrace.o(5764248764416L, 42947);
      return;
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5772704481280L, 43010);
          VoiceTransTextUI.r(VoiceTransTextUI.this).setPadding(0, 0, 0, 0);
          VoiceTransTextUI.s(VoiceTransTextUI.this).setGravity(17);
          GMTrace.o(5772704481280L, 43010);
        }
      }, 5L);
      break;
    }
    label115:
    aw(b.qvD, null);
    vT(a.qvx);
    GMTrace.o(5764248764416L, 42947);
  }
  
  public final void a(final int paramInt1, int paramInt2, String paramString, k paramk)
  {
    paramString = null;
    Object localObject = null;
    GMTrace.i(5765456723968L, 42956);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {}
    switch (paramk.getType())
    {
    default: 
      GMTrace.o(5765456723968L, 42956);
      return;
    case 546: 
      if (this.qrf.mState == a.quV)
      {
        w.i("MicroMsg.VoiceTransTextUI", "check result: done");
        paramString = (String)localObject;
        if (this.qrf.brN()) {
          paramString = this.qrf.quW.uXN;
        }
        JA(paramString);
        GMTrace.o(5765456723968L, 42956);
        return;
      }
      if (this.qrf.mState == a.quU)
      {
        if ((this.qrf.quW != null) && (com.tencent.mm.sdk.platformtools.bg.nm(this.qrf.quW.uXN))) {
          aw(b.qvD, this.qrf.quW.uXN);
        }
        w.i("MicroMsg.VoiceTransTextUI", "check result: processing");
        vT(a.qvA);
        GMTrace.o(5765456723968L, 42956);
        return;
      }
      if (this.qrf.mState == a.quT)
      {
        w.i("MicroMsg.VoiceTransTextUI", "check result: not exist");
        vT(a.qvy);
        GMTrace.o(5765456723968L, 42956);
        return;
      }
      if (this.qrf.quY != null)
      {
        this.qvf = this.qrf.quY.uLD;
        GMTrace.o(5765456723968L, 42956);
        return;
      }
      break;
    case 547: 
      if (this.qrg.brP())
      {
        w.i("MicroMsg.VoiceTransTextUI", "succeed upload");
        vT(a.qvA);
        GMTrace.o(5765456723968L, 42956);
        return;
      }
      w.d("MicroMsg.VoiceTransTextUI", "start upload more: start:%d, len:%d", new Object[] { Integer.valueOf(this.qrg.quX.tRD), Integer.valueOf(this.qrg.quX.tRE) });
      vT(a.qvz);
      GMTrace.o(5765456723968L, 42956);
      return;
    case 548: 
      this.qvf = this.qrh.qva;
      this.qrk = false;
      if ((!this.qrh.isComplete()) && (this.qrh.brN()))
      {
        paramk = this.qrh.quW.uXN;
        aw(b.qvD, paramk);
        w.d("MicroMsg.VoiceTransTextUI", "result valid:%s", new Object[] { this.qrh.quW.uXN });
      }
      while (this.qrh.isComplete())
      {
        w.i("MicroMsg.VoiceTransTextUI", "succeed get");
        if (this.qrh.brN()) {
          paramString = this.qrh.quW.uXN;
        }
        JA(paramString);
        GMTrace.o(5765456723968L, 42956);
        return;
        if (!this.qrh.brN()) {
          w.d("MicroMsg.VoiceTransTextUI", "result not valid");
        }
      }
      if (this.qvg)
      {
        w.i("MicroMsg.VoiceTransTextUI", "do get now! --- Notify new result");
        vT(a.qvA);
        GMTrace.o(5765456723968L, 42956);
        return;
      }
      w.i("MicroMsg.VoiceTransTextUI", "do get again after:%ds", new Object[] { Integer.valueOf(this.qvf) });
      paramInt1 = this.qvf;
      if (!this.qrl)
      {
        if (this.qrm == null) {
          this.qrm = new aj(new aj.a()
          {
            public final boolean pM()
            {
              GMTrace.i(5772436045824L, 43008);
              if (VoiceTransTextUI.m(VoiceTransTextUI.this))
              {
                GMTrace.o(5772436045824L, 43008);
                return false;
              }
              w.d("MicroMsg.VoiceTransTextUI", "timmer get, delay:%d", new Object[] { Integer.valueOf(paramInt1) });
              VoiceTransTextUI.c(VoiceTransTextUI.this, VoiceTransTextUI.a.qvA);
              GMTrace.o(5772436045824L, 43008);
              return false;
            }
          }, false);
        }
        paramString = this.qrm;
        long l = paramInt1 * 1000;
        paramString.z(l, l);
      }
      GMTrace.o(5765456723968L, 42956);
      return;
      this.qrl = true;
      aw(b.qvE, null);
    }
    GMTrace.o(5765456723968L, 42956);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5764114546688L, 42946);
    int i = R.i.cHD;
    GMTrace.o(5764114546688L, 42946);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(5765859377152L, 42959);
    finish();
    GMTrace.o(5765859377152L, 42959);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5763980328960L, 42945);
    super.onCreate(paramBundle);
    this.hQ = ViewConfiguration.get(this.vKB.vKW).getScaledTouchSlop();
    this.qvp = ((ClipboardManager)getSystemService("clipboard"));
    this.kgo = findViewById(R.h.cme);
    this.qvb = findViewById(R.h.clZ);
    this.qvc = findViewById(R.h.cmd);
    this.qve = ((TextView)findViewById(R.h.cmb));
    this.kVx = ((Button)findViewById(R.h.cma));
    this.qvd = ((LinearLayout)findViewById(R.h.cmc));
    this.kFq = ((ScrollView)findViewById(R.h.bCo));
    this.qvn = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5762235498496L, 42932);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(5762235498496L, 42932);
          return false;
          VoiceTransTextUI.c(VoiceTransTextUI.this);
          VoiceTransTextUI.a(VoiceTransTextUI.this, paramAnonymousView.getScrollY());
          VoiceTransTextUI.b(VoiceTransTextUI.this, VoiceTransTextUI.d(VoiceTransTextUI.this));
          VoiceTransTextUI.e(VoiceTransTextUI.this).removeMessages(0);
          if (VoiceTransTextUI.f(VoiceTransTextUI.this))
          {
            VoiceTransTextUI.g(VoiceTransTextUI.this);
            VoiceTransTextUI.a(VoiceTransTextUI.this, true);
            continue;
            if (Math.abs(VoiceTransTextUI.h(VoiceTransTextUI.this) - paramAnonymousView.getScrollY()) > VoiceTransTextUI.i(VoiceTransTextUI.this)) {
              VoiceTransTextUI.e(VoiceTransTextUI.this).sendMessage(VoiceTransTextUI.e(VoiceTransTextUI.this).obtainMessage(0, paramAnonymousView));
            }
            if ((VoiceTransTextUI.j(VoiceTransTextUI.this) < 800L) && (Math.abs(VoiceTransTextUI.h(VoiceTransTextUI.this) - paramAnonymousView.getScrollY()) <= VoiceTransTextUI.i(VoiceTransTextUI.this)) && (!VoiceTransTextUI.k(VoiceTransTextUI.this)))
            {
              VoiceTransTextUI.e(VoiceTransTextUI.this).removeMessages(0);
              VoiceTransTextUI.l(VoiceTransTextUI.this);
              VoiceTransTextUI.this.finish();
            }
            VoiceTransTextUI.a(VoiceTransTextUI.this, false);
          }
        }
      }
    };
    this.qve.setOnLongClickListener(this.qvq);
    this.qve.setOnClickListener(this.qvo);
    this.fKQ = getIntent().getExtras().getLong("voice_trans_text_msg_id", -1L);
    int i;
    if (this.fKQ < 0L) {
      i = 0;
    }
    for (;;)
    {
      if (i == 0)
      {
        w.d("MicroMsg.VoiceTransTextUI", "error invalid msgId");
        GMTrace.o(5763980328960L, 42945);
        return;
        w.i("MicroMsg.VoiceTransTextUI", "msg Id:%d", new Object[] { Long.valueOf(this.fKQ) });
        Object localObject = m.NL();
        long l = this.fKQ;
        if (l < 0L) {
          paramBundle = null;
        }
        for (;;)
        {
          this.qrc = paramBundle;
          if ((this.qrc == null) || (com.tencent.mm.sdk.platformtools.bg.nm(this.qrc.field_content))) {
            break label367;
          }
          w.i("MicroMsg.VoiceTransTextUI", "get voiceTransText");
          i = 1;
          break;
          paramBundle = new bf();
          localObject = ((com.tencent.mm.storage.bg)localObject).fTZ.a("VoiceTransText", null, "msgId=?", new String[] { String.valueOf(l) }, null, null, null, 2);
          if (((Cursor)localObject).moveToFirst()) {
            paramBundle.b((Cursor)localObject);
          }
          ((Cursor)localObject).close();
        }
        label367:
        paramBundle = getIntent().getExtras().getString("voice_trans_text_img_path");
        if (com.tencent.mm.sdk.platformtools.bg.nm(paramBundle))
        {
          i = 0;
          continue;
        }
        this.qvh = m.NK().mV(paramBundle);
        if (this.qvh != null)
        {
          w.i("MicroMsg.VoiceTransTextUI", "get voiceInfo");
          i = 1;
          continue;
        }
        at.AR();
        this.qvi = com.tencent.mm.y.c.yM().cM(this.fKQ);
        if (this.qvi != null)
        {
          w.i("MicroMsg.VoiceTransTextUI", "get MsgInfo");
          i = 1;
        }
      }
      else
      {
        paramBundle = cN().cO();
        if (paramBundle != null) {
          paramBundle.hide();
        }
        MP();
        GMTrace.o(5763980328960L, 42945);
        return;
      }
      i = 0;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5765725159424L, 42958);
    brQ();
    if (this.qrm != null) {
      this.qrm.stopTimer();
    }
    if (this.qvj != null)
    {
      com.tencent.mm.sdk.b.a.vgX.c(this.qvj);
      this.qvj = null;
    }
    super.onDestroy();
    GMTrace.o(5765725159424L, 42958);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(5771899174912L, 43004);
      qvx = 1;
      qvy = 2;
      qvz = 3;
      qvA = 4;
      qvB = new int[] { qvx, qvy, qvz, qvA };
      GMTrace.o(5771899174912L, 43004);
    }
    
    public static int[] brU()
    {
      GMTrace.i(5771764957184L, 43003);
      int[] arrayOfInt = (int[])qvB.clone();
      GMTrace.o(5771764957184L, 43003);
      return arrayOfInt;
    }
  }
  
  private static enum b
  {
    static
    {
      GMTrace.i(5771630739456L, 43002);
      qvC = 1;
      qvD = 2;
      qvE = 3;
      qvF = new int[] { qvC, qvD, qvE };
      GMTrace.o(5771630739456L, 43002);
    }
    
    public static int[] brV()
    {
      GMTrace.i(5771496521728L, 43001);
      int[] arrayOfInt = (int[])qvF.clone();
      GMTrace.o(5771496521728L, 43001);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\voicetranstext\VoiceTransTextUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */