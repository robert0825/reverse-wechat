package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.l.a;
import com.tencent.mm.pluginsdk.l.b;
import com.tencent.mm.pluginsdk.l.e;
import com.tencent.mm.pluginsdk.l.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;

public class VideoRecorderUI
  extends MMActivity
{
  private static VideoRecorderUI qwb;
  private String eDs;
  private ProgressDialog htG;
  private aj jsN;
  private long jst;
  private boolean oAP;
  private String qvH;
  private SurfaceView qvL;
  private SurfaceHolder qvM;
  private b qvN;
  private ImageButton qvO;
  private boolean qvP;
  private boolean qvQ;
  private TextView qvR;
  private LinearLayout qvS;
  private ImageView qvT;
  private ImageButton qvU;
  private ImageView qvV;
  private TextView qvW;
  private TextView qvX;
  private TextView qvY;
  private int qvZ;
  private ImageButton qwa;
  private boolean qwc;
  private boolean qwd;
  private String qwe;
  private String qwf;
  private View qwg;
  private View qwh;
  private ae qwi;
  SurfaceHolder.Callback qwj;
  private String videoPath;
  
  public VideoRecorderUI()
  {
    GMTrace.i(11888737910784L, 88578);
    this.qvL = null;
    this.qvM = null;
    this.eDs = null;
    this.htG = null;
    this.qvP = false;
    this.qvQ = false;
    this.jst = -1L;
    this.qvU = null;
    this.qvZ = 0;
    this.qwc = false;
    this.qwd = true;
    this.videoPath = null;
    this.qvH = null;
    this.qwe = null;
    this.qwf = null;
    this.jsN = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11886724644864L, 88563);
        if (VideoRecorderUI.a(VideoRecorderUI.this) == -1L) {
          VideoRecorderUI.a(VideoRecorderUI.this, SystemClock.elapsedRealtime());
        }
        long l1 = VideoRecorderUI.a(VideoRecorderUI.this);
        l1 = SystemClock.elapsedRealtime() - l1;
        VideoRecorderUI.b(VideoRecorderUI.this).setText(e.hB((int)(l1 / 1000L)));
        if ((l1 <= 30000L) && (l1 >= 20000L))
        {
          long l2 = (30000L - l1) / 1000L;
          VideoRecorderUI.c(VideoRecorderUI.this).setVisibility(0);
          VideoRecorderUI.c(VideoRecorderUI.this).setText(VideoRecorderUI.this.getResources().getQuantityString(R.j.cIE, (int)l2, new Object[] { Long.valueOf(l2) }));
        }
        while (l1 >= 30000L)
        {
          w.v("MicroMsg.VideoRecorderUI", "record stop on countdown");
          VideoRecorderUI.d(VideoRecorderUI.this);
          VideoRecorderUI.a(VideoRecorderUI.this, -1L);
          GMTrace.o(11886724644864L, 88563);
          return false;
          VideoRecorderUI.c(VideoRecorderUI.this).setVisibility(8);
        }
        VideoRecorderUI.a(VideoRecorderUI.this, VideoRecorderUI.e(VideoRecorderUI.this) % 2);
        if (VideoRecorderUI.e(VideoRecorderUI.this) == 0) {
          VideoRecorderUI.f(VideoRecorderUI.this).setVisibility(4);
        }
        for (;;)
        {
          VideoRecorderUI.g(VideoRecorderUI.this);
          GMTrace.o(11886724644864L, 88563);
          return true;
          VideoRecorderUI.f(VideoRecorderUI.this).setVisibility(0);
        }
      }
    }, true);
    this.qwi = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11882832330752L, 88534);
        super.handleMessage(paramAnonymousMessage);
        VideoRecorderUI.o(VideoRecorderUI.this).setEnabled(true);
        GMTrace.o(11882832330752L, 88534);
      }
    };
    this.qwj = new SurfaceHolder.Callback()
    {
      public final void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11886187773952L, 88559);
        w.d("MicroMsg.VideoRecorderUI", "surfaceChanged for:" + paramAnonymousInt1 + " w:" + paramAnonymousInt2 + " h:" + paramAnonymousInt3);
        if (VideoRecorderUI.h(VideoRecorderUI.this).b(paramAnonymousSurfaceHolder) != 0) {
          VideoRecorderUI.s(VideoRecorderUI.this);
        }
        VideoRecorderUI.a(VideoRecorderUI.this, false);
        VideoRecorderUI.b(VideoRecorderUI.this, false);
        VideoRecorderUI.x(VideoRecorderUI.this);
        GMTrace.o(11886187773952L, 88559);
      }
      
      public final void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        GMTrace.i(11885919338496L, 88557);
        w.d("MicroMsg.VideoRecorderUI", "surfaceCreated");
        if (VideoRecorderUI.h(VideoRecorderUI.this).a(VideoRecorderUI.this, VideoRecorderUI.q(VideoRecorderUI.this)) != 0) {
          VideoRecorderUI.s(VideoRecorderUI.this);
        }
        GMTrace.o(11885919338496L, 88557);
      }
      
      public final void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        GMTrace.i(11886053556224L, 88558);
        w.d("MicroMsg.VideoRecorderUI", "surfaceDestroyed");
        VideoRecorderUI.b(VideoRecorderUI.this, true);
        VideoRecorderUI.h(VideoRecorderUI.this).bKw();
        GMTrace.o(11886053556224L, 88558);
      }
    };
    GMTrace.o(11888737910784L, 88578);
  }
  
  private void aIL()
  {
    GMTrace.i(11889811652608L, 88586);
    cN().cO().hide();
    this.qvW.setText(e.hB(0));
    this.qwg.setVisibility(8);
    this.qwh.setVisibility(8);
    this.qvV.setVisibility(0);
    this.qvP = false;
    this.qvS.setVisibility(0);
    this.qvL.setVisibility(0);
    this.qvR.setVisibility(8);
    this.qvU.setVisibility(8);
    this.qvW.setText(e.hB(0));
    this.qvT.setVisibility(8);
    this.qvO.setEnabled(true);
    this.qwa.setVisibility(0);
    GMTrace.o(11889811652608L, 88586);
  }
  
  private void brW()
  {
    GMTrace.i(11889677434880L, 88585);
    if (this.qvP)
    {
      h.a(this, getString(R.l.egC), getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11888603693056L, 88577);
          VideoRecorderUI.this.finish();
          GMTrace.o(11888603693056L, 88577);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11885382467584L, 88553);
          GMTrace.o(11885382467584L, 88553);
        }
      });
      GMTrace.o(11889677434880L, 88585);
      return;
    }
    finish();
    GMTrace.o(11889677434880L, 88585);
  }
  
  private void brX()
  {
    GMTrace.i(11890348523520L, 88590);
    h.a(this, R.l.egj, R.l.cUG, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11888066822144L, 88573);
        VideoRecorderUI.h(VideoRecorderUI.this).bKw();
        VideoRecorderUI.this.finish();
        GMTrace.o(11888066822144L, 88573);
      }
    });
    GMTrace.o(11890348523520L, 88590);
  }
  
  private void releaseWakeLock()
  {
    GMTrace.i(11890482741248L, 88591);
    this.qvL.setKeepScreenOn(false);
    GMTrace.o(11890482741248L, 88591);
  }
  
  protected final void MP()
  {
    int j = 1;
    GMTrace.i(11889274781696L, 88582);
    this.qvL = ((SurfaceView)findViewById(R.h.cgf));
    this.qvS = ((LinearLayout)findViewById(R.h.ckA));
    this.qvM = this.qvL.getHolder();
    this.qvM.addCallback(this.qwj);
    this.qvM.setType(3);
    this.qvV = ((ImageView)findViewById(R.h.ckD));
    this.qwa = ((ImageButton)findViewById(R.h.ckP));
    this.qvW = ((TextView)findViewById(R.h.ckB));
    this.qwg = findViewById(R.h.ckC);
    this.qwh = findViewById(R.h.ckw);
    this.qvW.setText(e.hB(0));
    this.qvN = new b();
    this.qvR = ((TextView)findViewById(R.h.ckR));
    this.qvX = ((TextView)findViewById(R.h.ckE));
    this.qvY = ((TextView)findViewById(R.h.ckx));
    this.qvO = ((ImageButton)findViewById(R.h.ckQ));
    this.qvO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11884577161216L, 88547);
        at.AR();
        if (!com.tencent.mm.y.c.isSDCardAvailable())
        {
          com.tencent.mm.ui.base.u.fo(VideoRecorderUI.this);
          GMTrace.o(11884577161216L, 88547);
          return;
        }
        if (VideoRecorderUI.k(VideoRecorderUI.this))
        {
          VideoRecorderUI.d(VideoRecorderUI.this);
          GMTrace.o(11884577161216L, 88547);
          return;
        }
        if (VideoRecorderUI.l(VideoRecorderUI.this))
        {
          h.a(VideoRecorderUI.this, VideoRecorderUI.this.getString(R.l.egD), VideoRecorderUI.this.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(11887529951232L, 88569);
              VideoRecorderUI.m(VideoRecorderUI.this).setImageResource(R.g.bbq);
              VideoRecorderUI.n(VideoRecorderUI.this);
              GMTrace.o(11887529951232L, 88569);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(11884845596672L, 88549);
              GMTrace.o(11884845596672L, 88549);
            }
          });
          GMTrace.o(11884577161216L, 88547);
          return;
        }
        VideoRecorderUI.m(VideoRecorderUI.this).setImageResource(R.g.bbq);
        VideoRecorderUI.n(VideoRecorderUI.this);
        GMTrace.o(11884577161216L, 88547);
      }
    });
    b localb;
    label317:
    Object localObject;
    if (com.tencent.mm.compatible.d.c.getNumberOfCameras() > 1)
    {
      this.qwa.setVisibility(0);
      this.qwa.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11887798386688L, 88571);
          VideoRecorderUI.o(VideoRecorderUI.this).setEnabled(false);
          VideoRecorderUI.p(VideoRecorderUI.this).sendEmptyMessageDelayed(0, 3000L);
          VideoRecorderUI.a(VideoRecorderUI.this, true);
          VideoRecorderUI.h(VideoRecorderUI.this).bKw();
          if ((VideoRecorderUI.h(VideoRecorderUI.this).a(VideoRecorderUI.this, VideoRecorderUI.q(VideoRecorderUI.this)) != 0) || (VideoRecorderUI.h(VideoRecorderUI.this).b(VideoRecorderUI.r(VideoRecorderUI.this)) != 0)) {
            VideoRecorderUI.s(VideoRecorderUI.this);
          }
          GMTrace.o(11887798386688L, 88571);
        }
      });
      this.qvU = ((ImageButton)findViewById(R.h.ckt));
      this.qvT = ((ImageView)findViewById(R.h.ckz));
      this.qvU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11887261515776L, 88567);
          paramAnonymousView = new Intent(VideoRecorderUI.this, VideoRecorderPreviewUI.class);
          paramAnonymousView.putExtra("VideoRecorder_FileName", VideoRecorderUI.h(VideoRecorderUI.this).filename);
          paramAnonymousView.putExtra("VideoRecorder_VideoLength", VideoRecorderUI.h(VideoRecorderUI.this).oWa.hcv);
          paramAnonymousView.putExtra("VideoRecorder_VideoSize", VideoRecorderUI.h(VideoRecorderUI.this).fileSize);
          paramAnonymousView.putExtra("VideoRecorder_ToUser", VideoRecorderUI.i(VideoRecorderUI.this));
          paramAnonymousView.putExtra("VideoRecorder_VideoFullPath", VideoRecorderUI.t(VideoRecorderUI.this));
          VideoRecorderUI.this.startActivityForResult(paramAnonymousView, 0);
          VideoRecorderUI.this.overridePendingTransition(0, 0);
          GMTrace.o(11887261515776L, 88567);
        }
      });
      localb = this.qvN;
      if (this.oAP) {
        break label585;
      }
      i = 1;
      localObject = this.videoPath;
      String str1 = this.qvH;
      String str2 = this.qwe;
      String str3 = this.qwf;
      localb.haG = 0;
      if (1 != localb.haG) {
        break label590;
      }
      localb.oWa = a.bKv();
      label361:
      if (com.tencent.mm.compatible.d.p.fQE.fRe)
      {
        localb.oWa.mZu = com.tencent.mm.compatible.d.p.fQE.mVideoHeight;
        localb.oWa.mZv = com.tencent.mm.compatible.d.p.fQE.mVideoWidth;
        localb.oWa.mZt = com.tencent.mm.compatible.d.p.fQE.fRg;
      }
      localb.filename = str3;
      localb.oWa.mZC = str1;
      localb.oWa.mZA = str2;
      localb.oWa.mZz = ((String)localObject + "temp.pcm");
      localb.oWa.mZy = ((String)localObject + "temp.yuv");
      localb.oWa.mZB = ((String)localObject + "temp.vid");
      localb.oWa.mZE = com.tencent.mm.compatible.d.c.getNumberOfCameras();
      localObject = localb.oWa;
      if (i == 0) {
        break label600;
      }
    }
    label585:
    label590:
    label600:
    for (int i = j;; i = 0)
    {
      ((a)localObject).eSp = i;
      localb.oWa.hcv = 0;
      localb.trU = new f();
      GMTrace.o(11889274781696L, 88582);
      return;
      this.qwa.setVisibility(4);
      break;
      i = 0;
      break label317;
      localb.oWa = a.bKu();
      break label361;
    }
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(11889408999424L, 88583);
    ad.d(ad.a(getWindow(), null), this.vKB.vKI);
    ((ViewGroup)this.vKB.vKI.getParent()).removeView(this.vKB.vKI);
    ((ViewGroup)getWindow().getDecorView()).addView(this.vKB.vKI, 0);
    GMTrace.o(11889408999424L, 88583);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11890616958976L, 88592);
    if (com.tencent.mm.compatible.d.c.sG()) {}
    for (boolean bool = true;; bool = false)
    {
      this.oAP = bool;
      if (this.oAP) {
        break;
      }
      i = R.i.cHn;
      GMTrace.o(11890616958976L, 88592);
      return i;
    }
    getWindow().setFlags(1024, 1024);
    setRequestedOrientation(0);
    int i = R.i.cHo;
    GMTrace.o(11890616958976L, 88592);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11890214305792L, 88589);
    if (paramInt2 != -1)
    {
      GMTrace.o(11890214305792L, 88589);
      return;
    }
    if (paramInt1 == 0)
    {
      setResult(-1, paramIntent);
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(11890214305792L, 88589);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11888872128512L, 88579);
    super.onCreate(paramBundle);
    com.tencent.mm.ui.p.eJ(this);
    qwb = this;
    getWindow().setFlags(1024, 1024);
    cN().cO().hide();
    oM(R.l.egE);
    a(0, getString(R.l.cUs), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11883100766208L, 88536);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("VideoRecorder_FileName", VideoRecorderUI.h(VideoRecorderUI.this).filename);
        paramAnonymousMenuItem.putExtra("VideoRecorder_VideoLength", VideoRecorderUI.h(VideoRecorderUI.this).oWa.hcv);
        paramAnonymousMenuItem.putExtra("VideoRecorder_ToUser", VideoRecorderUI.i(VideoRecorderUI.this));
        VideoRecorderUI.this.setResult(-1, paramAnonymousMenuItem);
        VideoRecorderUI.this.finish();
        GMTrace.o(11883100766208L, 88536);
        return true;
      }
    }, p.b.vLG);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11888335257600L, 88575);
        VideoRecorderUI.j(VideoRecorderUI.this);
        GMTrace.o(11888335257600L, 88575);
        return true;
      }
    });
    this.eDs = getIntent().getStringExtra("VideoRecorder_ToUser");
    this.videoPath = getIntent().getStringExtra("VideoRecorder_VideoPath");
    this.qvH = getIntent().getStringExtra("VideoRecorder_VideoFullPath");
    this.qwe = getIntent().getStringExtra("VideoRecorder_VideoThumbPath");
    this.qwf = getIntent().getStringExtra("VideoRecorder_FileName");
    w.d("MicroMsg.VideoRecorderUI", "talker :" + this.eDs);
    w.d("MicroMsg.VideoRecorderUI", "videoPath :" + this.videoPath + " videoFullPath " + this.qvH + " videoThumbPath " + this.qwe + " KFileName " + this.qwf);
    MP();
    aIL();
    at.pD().ri();
    GMTrace.o(11888872128512L, 88579);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11889140563968L, 88581);
    qwb = null;
    w.v("MicroMsg.VideoRecorderUI", "on destroy");
    at.pD().rh();
    super.onDestroy();
    GMTrace.o(11889140563968L, 88581);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11889543217152L, 88584);
    if (paramInt == 4)
    {
      w.d("MicroMsg.VideoRecorderUI", "KEYCODE_BACK");
      if (this.qvQ)
      {
        GMTrace.o(11889543217152L, 88584);
        return true;
      }
      brW();
      GMTrace.o(11889543217152L, 88584);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11889543217152L, 88584);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11890080088064L, 88588);
    if (this.qvQ)
    {
      b localb = this.qvN;
      if (localb.naM != null)
      {
        localb.naM.stop();
        localb.naM.release();
        localb.naM = null;
      }
      aIL();
      this.qvQ = false;
      releaseWakeLock();
      this.qvO.setImageResource(R.g.bbp);
      this.jsN.stopTimer();
      this.qvR.setVisibility(8);
      this.qvS.setVisibility(0);
      this.qvL.setVisibility(0);
    }
    this.qvN.bKw();
    w.v("MicroMsg.VideoRecorderUI", "onPause");
    super.onPause();
    GMTrace.o(11890080088064L, 88588);
  }
  
  protected void onResume()
  {
    GMTrace.i(11889945870336L, 88587);
    if ((!this.qwd) && ((this.qvN.a(this, false) != 0) || (this.qvN.b(this.qvM) != 0))) {
      brX();
    }
    this.qwd = false;
    w.v("MicroMsg.VideoRecorderUI", "onResume");
    super.onResume();
    GMTrace.o(11889945870336L, 88587);
  }
  
  public void onStart()
  {
    GMTrace.i(11889006346240L, 88580);
    super.onStart();
    if (this.oAP)
    {
      setRequestedOrientation(0);
      GMTrace.o(11889006346240L, 88580);
      return;
    }
    setRequestedOrientation(1);
    GMTrace.o(11889006346240L, 88580);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sysvideo\ui\video\VideoRecorderUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */