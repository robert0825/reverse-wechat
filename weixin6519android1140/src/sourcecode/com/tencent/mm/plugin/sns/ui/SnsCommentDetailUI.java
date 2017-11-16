package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.ClipboardManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.g.a.mz;
import com.tencent.mm.g.a.ps;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.a.qd;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.f;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader;
import com.tencent.mm.plugin.sns.model.ac;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsCommentDetailUI
  extends MMActivity
  implements com.tencent.mm.ad.e, h.a, com.tencent.mm.plugin.sns.model.b.b
{
  public static int pYY;
  private String eUg;
  private String fJS;
  private com.tencent.mm.sdk.b.c ian;
  private boolean ihe;
  private com.tencent.mm.ui.tools.l jGV;
  private int jHw;
  private int jhX;
  private View.OnClickListener lXS;
  private ClipboardManager liU;
  private int mScreenHeight;
  private int mScreenWidth;
  private String nri;
  private boolean pPa;
  private SnsCommentFooter pPb;
  private ao pPd;
  private c pPj;
  private com.tencent.mm.plugin.sns.f.b pPk;
  private com.tencent.mm.ui.base.r pPm;
  private com.tencent.mm.plugin.sns.a.b.g pQi;
  private View.OnTouchListener pSw;
  private LinearLayout pYA;
  private SnsDetailLuckyHeader pYB;
  private ListView pYC;
  private View pYD;
  private b pYE;
  private ScaleAnimation pYF;
  private ScaleAnimation pYG;
  LinearLayout pYH;
  LinearLayout pYI;
  private LinkedList<bew> pYJ;
  private int pYK;
  private boolean pYL;
  private ar pYM;
  private String pYN;
  private com.tencent.mm.storage.ar pYO;
  private int pYP;
  private ImageView pYQ;
  private k pYR;
  private boolean pYS;
  private long pYT;
  private bg pYU;
  private boolean pYV;
  private int pYW;
  private int pYX;
  public int pYZ;
  private long pYw;
  private long pYx;
  private View pYy;
  private TextView pYz;
  private com.tencent.mm.plugin.sns.ui.b.b pZa;
  private SnsTranslateResultView pZb;
  private boolean pZc;
  private Dialog pZd;
  private af pZe;
  private com.tencent.mm.sdk.b.c pZf;
  private com.tencent.mm.sdk.b.c pZg;
  private com.tencent.mm.sdk.b.c pZh;
  private com.tencent.mm.sdk.b.c pZi;
  private c pZj;
  private View.OnClickListener pZk;
  private View.OnClickListener pZl;
  private com.tencent.mm.sdk.b.c pZm;
  private com.tencent.mm.sdk.b.c pZn;
  boolean pZo;
  private LinearLayout pZp;
  private boolean pZq;
  PhotosContent pZr;
  int pZs;
  public ak.b.a pZt;
  private bf pZu;
  private LinearLayout pqz;
  
  static
  {
    GMTrace.i(8414512021504L, 62693);
    pYY = 34;
    GMTrace.o(8414512021504L, 62693);
  }
  
  public SnsCommentDetailUI()
  {
    GMTrace.i(8404714127360L, 62620);
    this.pYw = 0L;
    this.pYx = 0L;
    this.pYK = -1;
    this.pYL = false;
    this.pSw = com.tencent.mm.sdk.platformtools.bg.bQV();
    this.pPm = null;
    this.jhX = 0;
    this.pYP = 0;
    this.ihe = false;
    this.nri = "";
    this.pYS = false;
    this.pYT = 0L;
    this.pYV = false;
    this.pYX = 103;
    this.pYZ = 210;
    this.pZc = false;
    this.pZd = null;
    this.pZe = new af();
    this.pZf = new com.tencent.mm.sdk.b.c() {};
    this.pZg = new com.tencent.mm.sdk.b.c() {};
    this.pZh = new com.tencent.mm.sdk.b.c() {};
    this.pZi = new com.tencent.mm.sdk.b.c() {};
    this.pZj = new c();
    this.pZk = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8767101992960L, 65320);
        paramAnonymousView = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.SnsCommentDetailUI", "onCommentClick:" + paramAnonymousView);
        Intent localIntent = new Intent();
        Object localObject = SnsCommentDetailUI.e(SnsCommentDetailUI.this);
        if (((com.tencent.mm.plugin.sns.storage.m)localObject).uX(32))
        {
          localObject = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject).bmh(), 1, 2, "", ((com.tencent.mm.plugin.sns.storage.m)localObject).bmm(), ((com.tencent.mm.plugin.sns.storage.m)localObject).blE());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
          localIntent.putExtra("Contact_User", paramAnonymousView);
          localIntent.putExtra("Contact_Scene", 37);
          com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, SnsCommentDetailUI.this);
          GMTrace.o(8767101992960L, 65320);
          return;
        }
        localIntent.putExtra("Contact_User", paramAnonymousView);
        com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, SnsCommentDetailUI.this);
        GMTrace.o(8767101992960L, 65320);
      }
    };
    this.pZl = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8558796079104L, 63768);
        w.e("MicroMsg.SnsCommentDetailUI", "scrollTopClickListener");
        SnsCommentDetailUI.f(SnsCommentDetailUI.this);
        if (!SnsCommentDetailUI.g(SnsCommentDetailUI.this))
        {
          GMTrace.o(8558796079104L, 63768);
          return;
        }
        SnsCommentDetailUI.h(SnsCommentDetailUI.this);
        GMTrace.o(8558796079104L, 63768);
      }
    };
    this.lXS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8510075043840L, 63405);
        w.e("MicroMsg.SnsCommentDetailUI", "scrollTopClickListener");
        SnsCommentDetailUI.a(SnsCommentDetailUI.this, paramAnonymousView);
        GMTrace.o(8510075043840L, 63405);
      }
    };
    this.pZm = new com.tencent.mm.sdk.b.c() {};
    this.ian = new com.tencent.mm.sdk.b.c() {};
    this.pZn = new com.tencent.mm.sdk.b.c() {};
    this.pZo = false;
    this.pZp = null;
    this.pZq = false;
    this.pZr = null;
    this.pZs = 0;
    this.pZt = new ak.b.a()
    {
      public final void r(String paramAnonymousString, final boolean paramAnonymousBoolean)
      {
        GMTrace.i(8599866703872L, 64074);
        new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8335457779712L, 62104);
            if ((paramAnonymousBoolean) && (!SnsCommentDetailUI.this.isFinishing()) && (SnsCommentDetailUI.this.pZs < 5)) {
              SnsCommentDetailUI.this.boB();
            }
            SnsCommentDetailUI localSnsCommentDetailUI = SnsCommentDetailUI.this;
            localSnsCommentDetailUI.pZs += 1;
            GMTrace.o(8335457779712L, 62104);
          }
        }, 500L);
        GMTrace.o(8599866703872L, 64074);
      }
    };
    this.pZu = null;
    GMTrace.o(8404714127360L, 62620);
  }
  
  private void B(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    int j = 0;
    GMTrace.i(20833678393344L, 155223);
    if ((paramm == null) || (!paramm.bke()))
    {
      GMTrace.o(20833678393344L, 155223);
      return;
    }
    int k = i.e.oYn;
    int m = Color.parseColor("#cdcdcd");
    int n = Color.parseColor("#ffffff");
    Button localButton1 = (Button)this.pYy.findViewById(i.f.pab);
    Button localButton2 = (Button)this.pYy.findViewById(i.f.pac);
    if ((localButton1 == null) || (localButton2 == null))
    {
      GMTrace.o(20833678393344L, 155223);
      return;
    }
    localButton1.setOnClickListener(this.pZa.qmY);
    localButton2.setOnClickListener(this.pZa.qmZ);
    int i1;
    int i;
    if (paramm.blz().bkg())
    {
      i1 = u.dP(paramm.blz().pDw.pDA, paramm.bmi());
      if ((i1 > 0) && (i1 <= 2)) {
        if (i1 == 1)
        {
          localButton2.setBackgroundColor(n);
          localButton2.setTextColor(m);
          localButton2.setText(paramm.blz().pDw.uI(1));
          localButton1.setBackgroundResource(k);
          localButton1.setTextColor(-16777216);
          localButton1.setText(paramm.blz().pDw.uH(0));
          i = j;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localButton1.setTextColor(-16777216);
        localButton1.setBackgroundResource(k);
        localButton2.setTextColor(-16777216);
        localButton2.setBackgroundResource(k);
        localButton1.setText(paramm.blz().bka());
        localButton2.setText(paramm.blz().bkb());
      }
      GMTrace.o(20833678393344L, 155223);
      return;
      i = j;
      if (i1 == 2)
      {
        localButton1.setBackgroundColor(n);
        localButton1.setTextColor(m);
        localButton1.setText(paramm.blz().pDw.uI(0));
        localButton2.setBackgroundResource(k);
        localButton2.setTextColor(-16777216);
        localButton2.setText(paramm.blz().pDw.uH(1));
        i = j;
        continue;
        i = 1;
      }
    }
  }
  
  private void bmO()
  {
    GMTrace.i(14422768615424L, 107458);
    if ((this.vKB.vLo == 1) || (this.pPb.boL()))
    {
      this.pZj.run();
      GMTrace.o(14422768615424L, 107458);
      return;
    }
    this.pPa = true;
    GMTrace.o(14422768615424L, 107458);
  }
  
  private static boolean boA()
  {
    GMTrace.i(8406458957824L, 62633);
    if ((al.a.bjD() & 0x1) <= 0)
    {
      GMTrace.o(8406458957824L, 62633);
      return true;
    }
    GMTrace.o(8406458957824L, 62633);
    return false;
  }
  
  private void boC()
  {
    GMTrace.i(8406727393280L, 62635);
    if ((this.pYD == null) || (this.pYD.getVisibility() == 8))
    {
      GMTrace.o(8406727393280L, 62635);
      return;
    }
    this.pYD.startAnimation(this.pYG);
    this.pYG.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8660935770112L, 64529);
        w.d("MicroMsg.SnsCommentDetailUI", "onAnimationEnd");
        if (SnsCommentDetailUI.B(SnsCommentDetailUI.this) != null)
        {
          SnsCommentDetailUI.B(SnsCommentDetailUI.this).clearAnimation();
          SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(8);
        }
        GMTrace.o(8660935770112L, 64529);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8660801552384L, 64528);
        GMTrace.o(8660801552384L, 64528);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8660667334656L, 64527);
        GMTrace.o(8660667334656L, 64527);
      }
    });
    GMTrace.o(8406727393280L, 62635);
  }
  
  private void boD()
  {
    GMTrace.i(8406861611008L, 62636);
    if (this.pYQ == null)
    {
      GMTrace.o(8406861611008L, 62636);
      return;
    }
    this.pYQ.setPressed(false);
    if (bg.FR(this.nri))
    {
      this.pYQ.setImageResource(i.e.aYe);
      GMTrace.o(8406861611008L, 62636);
      return;
    }
    this.pYQ.setImageResource(i.e.aYf);
    GMTrace.o(8406861611008L, 62636);
  }
  
  private int boz()
  {
    GMTrace.i(14438874742784L, 107578);
    if ((this.pYC != null) && (this.pYC.getChildCount() > 1))
    {
      View localView = this.pYC.getChildAt(0);
      if (localView != null)
      {
        int i = localView.getHeight();
        GMTrace.o(14438874742784L, 107578);
        return i;
      }
    }
    GMTrace.o(14438874742784L, 107578);
    return 0;
  }
  
  private boolean e(List<bew> paramList, boolean paramBoolean)
  {
    GMTrace.i(8406995828736L, 62637);
    int k = BackwardSupportUtil.b.a(this, 32.0F);
    int m = BackwardSupportUtil.b.a(this, 6.0F);
    int i = BackwardSupportUtil.b.a(this, 10.0F);
    int j = BackwardSupportUtil.b.a(this, 17.0F);
    if (this.pYA == null)
    {
      GMTrace.o(8406995828736L, 62637);
      return false;
    }
    int n = ((WindowManager)this.vKB.vKW.getSystemService("window")).getDefaultDisplay().getWidth();
    float f = getResources().getDimension(i.d.aQE);
    w.d("MicroMsg.SnsCommentDetailUI", "guess size %d %f", new Object[] { Integer.valueOf(n), Float.valueOf(f) });
    f = n - f * 2.0F;
    if (paramList.size() <= 0)
    {
      if (this.pYA.getParent() != null) {
        this.pYA.setVisibility(8);
      }
      this.pYA.removeAllViews();
      this.pYA.setVisibility(8);
      this.pqz.setVisibility(8);
      GMTrace.o(8406995828736L, 62637);
      return false;
    }
    this.pYA.getParent();
    this.pYA.removeAllViews();
    this.pYA.setVisibility(0);
    Object localObject1;
    if (this.jHw == 11) {
      if (!this.pZc)
      {
        this.pYA.setBackgroundResource(i.e.oXE);
        this.pYA.setPadding(0, m, 0, m);
        localObject1 = new ImageView(this.vKB.vKW);
        if (this.jHw != 11) {
          break label685;
        }
        ((ImageView)localObject1).setImageResource(i.i.phf);
      }
    }
    for (;;)
    {
      ((ImageView)localObject1).setPadding(i, j, i, 0);
      Object localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 49;
      ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ImageView)localObject1).setClickable(false);
      ((ImageView)localObject1).setFocusable(false);
      this.pYA.addView((View)localObject1);
      n = com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, pYY);
      j = (int)(f - n) / (m + k);
      i = j;
      if ((int)(f - n) % (m + k) > k) {
        i = j + 1;
      }
      w.d("MicroMsg.SnsCommentDetailUI", "guess size %d", new Object[] { Integer.valueOf(i) });
      localObject1 = new i(this.vKB.vKW);
      ((i)localObject1).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      ((i)localObject1).pOW = i;
      i = 0;
      while (i < paramList.size())
      {
        localObject2 = (bew)paramList.get(i);
        TouchImageView localTouchImageView = new TouchImageView(this.vKB.vKW);
        localTouchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        localTouchImageView.setImageResource(i.e.oXI);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(k, k);
        localLayoutParams.setMargins(0, m, m, 0);
        localTouchImageView.setLayoutParams(localLayoutParams);
        localTouchImageView.setTag(((bew)localObject2).tRz);
        a.b.b(localTouchImageView, ((bew)localObject2).tRz, true);
        localTouchImageView.setOnClickListener(this.pZk);
        ((i)localObject1).addView(localTouchImageView);
        i += 1;
      }
      localObject1 = ib(false);
      if (localObject1 != null)
      {
        if (this.fJS.equals(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName))
        {
          this.pYA.setBackgroundResource(i.e.oXF);
          break;
        }
        this.pYA.setBackgroundResource(i.e.oXE);
        break;
      }
      this.pYA.setBackgroundResource(i.e.oXE);
      break;
      this.pYA.setBackgroundResource(i.e.oXC);
      break;
      label685:
      ((ImageView)localObject1).setImageResource(i.i.phe);
    }
    this.pYA.addView((View)localObject1);
    paramList = this.pqz;
    if (paramBoolean) {}
    for (i = 8;; i = 0)
    {
      paramList.setVisibility(i);
      GMTrace.o(8406995828736L, 62637);
      return true;
    }
  }
  
  private static boolean f(LinkedList<bew> paramLinkedList1, LinkedList<bew> paramLinkedList2)
  {
    GMTrace.i(8404848345088L, 62621);
    if ((paramLinkedList1 == null) || (paramLinkedList2 == null))
    {
      GMTrace.o(8404848345088L, 62621);
      return false;
    }
    if (paramLinkedList1.size() != paramLinkedList2.size())
    {
      GMTrace.o(8404848345088L, 62621);
      return false;
    }
    int j = paramLinkedList1.size();
    int i = 0;
    while (i < j)
    {
      if (!((bew)paramLinkedList1.get(i)).tRz.equals(((bew)paramLinkedList2.get(i)).tRz))
      {
        GMTrace.o(8404848345088L, 62621);
        return false;
      }
      i += 1;
    }
    GMTrace.o(8404848345088L, 62621);
    return true;
  }
  
  private void ia(boolean paramBoolean)
  {
    GMTrace.i(8405250998272L, 62624);
    this.pYL = false;
    if (this.pPb.boH())
    {
      this.pPb.boN();
      this.pPb.Jd(getString(i.j.plc));
    }
    this.pPb.ic(false);
    if (paramBoolean) {
      BackwardSupportUtil.c.a(this.pYC);
    }
    GMTrace.o(8405250998272L, 62624);
  }
  
  private com.tencent.mm.plugin.sns.storage.m ib(boolean paramBoolean)
  {
    GMTrace.i(8405385216000L, 62625);
    com.tencent.mm.plugin.sns.storage.m localm;
    if (!com.tencent.mm.sdk.platformtools.bg.nm(this.pYN))
    {
      localm = com.tencent.mm.plugin.sns.storage.h.Is(this.pYN);
      if (localm == null)
      {
        if (paramBoolean) {
          Toast.makeText(this, i.j.pkb, 0).show();
        }
        finish();
        GMTrace.o(8405385216000L, 62625);
        return null;
      }
      this.eUg = localm.blE();
    }
    for (;;)
    {
      GMTrace.o(8405385216000L, 62625);
      return localm;
      localm = com.tencent.mm.plugin.sns.storage.h.Ir(this.eUg);
      if (localm == null)
      {
        finish();
        GMTrace.o(8405385216000L, 62625);
        return null;
      }
      this.pYN = localm.blY();
    }
  }
  
  private LinearLayout vm(int paramInt)
  {
    GMTrace.i(8406324740096L, 62632);
    if (this.pZp == null)
    {
      this.pZp = ((LinearLayout)v.fb(this).inflate(paramInt, null));
      localLinearLayout = this.pZp;
      GMTrace.o(8406324740096L, 62632);
      return localLinearLayout;
    }
    this.pZo = true;
    LinearLayout localLinearLayout = this.pZp;
    GMTrace.o(8406324740096L, 62632);
    return localLinearLayout;
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8407264264192L, 62639);
    GMTrace.o(8407264264192L, 62639);
  }
  
  protected final void MP()
  {
    GMTrace.i(8406190522368L, 62631);
    oM(i.j.piM);
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8559064514560L, 63770);
        BackwardSupportUtil.c.a(SnsCommentDetailUI.c(SnsCommentDetailUI.this));
        GMTrace.o(8559064514560L, 63770);
      }
    };
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8320425394176L, 61992);
        if (SnsCommentDetailUI.b(SnsCommentDetailUI.this) != null) {
          SnsCommentDetailUI.b(SnsCommentDetailUI.this).ic(false);
        }
        SnsCommentDetailUI.this.finish();
        GMTrace.o(8320425394176L, 61992);
        return true;
      }
    });
    this.fJS = com.tencent.mm.y.q.zE();
    if (com.tencent.mm.plugin.sns.model.ae.biM()) {
      finish();
    }
    final com.tencent.mm.plugin.sns.storage.m localm = ib(true);
    if (localm == null)
    {
      w.e("MicroMsg.SnsCommentDetailUI", "invalid pcid:" + this.eUg);
      finish();
      GMTrace.o(8406190522368L, 62631);
      return;
    }
    w.i("MicroMsg.SnsCommentDetailUI", "snsId: " + this.eUg + "localId " + this.pYN + "  username:" + localm.field_userName);
    int i;
    if ((!u.IO(this.eUg)) && (localm.bma()))
    {
      localObject1 = localm.blQ();
      findViewById(i.f.pdH).setVisibility(0);
      localObject2 = (TextView)findViewById(i.f.pbB);
      switch (((anv)localObject1).uDt)
      {
      default: 
        if (!com.tencent.mm.sdk.platformtools.bg.nm(((anv)localObject1).uDB))
        {
          ((TextView)localObject2).setText(((anv)localObject1).uDB);
          i = 1;
          findViewById(i.f.pdI).setVisibility(0);
        }
        break;
      }
    }
    for (;;)
    {
      if (i != 0) {
        findViewById(i.f.pdH).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8602551058432L, 64094);
            if (localm.uX(32))
            {
              GMTrace.o(8602551058432L, 64094);
              return;
            }
            ai.ux(localm.pMe);
            ai.uv(localm.pMe);
            com.tencent.mm.plugin.sns.model.ae.biZ().bhR();
            paramAnonymousView = new Intent();
            SnsCommentDetailUI.this.setResult(-1, paramAnonymousView);
            if (SnsCommentDetailUI.r(SnsCommentDetailUI.this)) {
              paramAnonymousView.putExtra("sns_gallery_force_finish", true);
            }
            SnsCommentDetailUI.this.finish();
            SnsCommentDetailUI.this.finish();
            GMTrace.o(8602551058432L, 64094);
          }
        });
      }
      this.pYC = ((ListView)findViewById(i.f.oZj));
      this.pYC.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8570607239168L, 63856);
          SnsCommentDetailUI.a(SnsCommentDetailUI.this, SnsCommentDetailUI.c(SnsCommentDetailUI.this).getBottom());
          w.d("MicroMsg.SnsCommentDetailUI", "listOriginalBottom: " + SnsCommentDetailUI.d(SnsCommentDetailUI.this));
          GMTrace.o(8570607239168L, 63856);
        }
      });
      this.pYC.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8615301742592L, 64189);
          GMTrace.o(8615301742592L, 64189);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(8615435960320L, 64190);
          if (paramAnonymousInt == 1)
          {
            SnsCommentDetailUI.this.aLo();
            SnsCommentDetailUI.s(SnsCommentDetailUI.this);
          }
          GMTrace.o(8615435960320L, 64190);
        }
      });
      this.pYy = v.fb(this.vKB.vKW).inflate(i.g.pfB, null);
      this.pYy.setOnClickListener(this.pZl);
      this.pYC.addHeaderView(this.pYy);
      boolean bool = boB();
      if (bool) {
        break label615;
      }
      w.i("MicroMsg.SnsCommentDetailUI", "error isOk setheader " + bool);
      finish();
      GMTrace.o(8406190522368L, 62631);
      return;
      if (!com.tencent.mm.sdk.platformtools.bg.nm(((anv)localObject1).uDB)) {
        ((TextView)localObject2).setText(((anv)localObject1).uDB);
      }
      for (;;)
      {
        findViewById(i.f.pdI).setVisibility(8);
        i = 0;
        break;
        ((TextView)localObject2).setText(i.j.pkn);
      }
      if (!com.tencent.mm.sdk.platformtools.bg.nm(((anv)localObject1).uDB)) {
        ((TextView)localObject2).setText(((anv)localObject1).uDB);
      }
      for (;;)
      {
        findViewById(i.f.pdI).setVisibility(8);
        i = 0;
        break;
        ((TextView)localObject2).setText(i.j.pkp);
      }
      if (!com.tencent.mm.sdk.platformtools.bg.nm(((anv)localObject1).uDB)) {
        ((TextView)localObject2).setText(((anv)localObject1).uDB);
      }
      for (;;)
      {
        i = 1;
        findViewById(i.f.pdI).setVisibility(8);
        break;
        ((TextView)localObject2).setText(i.j.pko);
      }
      ((TextView)localObject2).setText(i.j.pkq);
      break;
      findViewById(i.f.pdH).setVisibility(8);
      i = 0;
    }
    label615:
    Object localObject1 = ib(false);
    if (localObject1 != null) {
      this.jHw = av.d(((com.tencent.mm.plugin.sns.storage.m)localObject1).blD());
    }
    if ((this.jHw == 11) && (com.tencent.mm.y.q.zE().equals(localm.field_userName)))
    {
      this.pYB = new SnsDetailLuckyHeader(this);
      localObject1 = new AbsListView.LayoutParams(-1, -2);
      this.pYB.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.pYB.setOnClickListener(this.pZl);
    }
    this.pYA = new LinearLayout(this.vKB.vKW);
    localObject1 = new AbsListView.LayoutParams(-1, -2);
    this.pYA.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.pYA.setOnClickListener(this.pZl);
    BackwardSupportUtil.b.a(this, 2.0F);
    localObject1 = new AbsListView.LayoutParams(-1, 1);
    Object localObject2 = new LinearLayout(this.vKB.vKW);
    ((LinearLayout)localObject2).setBackgroundResource(i.e.oYs);
    ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.pqz = ((LinearLayout)localObject2);
    if ((localm.field_localPrivate & 0x1) != 0)
    {
      findViewById(i.f.paf).setVisibility(8);
      localObject1 = new TextView(this);
      ((TextView)localObject1).setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      ((TextView)localObject1).setText(getString(i.j.piS));
      ((TextView)localObject1).setTextColor(getResources().getColor(i.c.black));
      ((TextView)localObject1).setGravity(17);
      ((TextView)localObject1).setPadding(0, BackwardSupportUtil.b.a(this, 7.0F), 0, 0);
      this.pYC.addFooterView((View)localObject1);
    }
    if (this.pYB != null)
    {
      this.pZc = true;
      this.pYC.addHeaderView(this.pYB);
    }
    localObject2 = ai.m(localm);
    Object localObject3;
    label1234:
    long l;
    if (localObject2 == null)
    {
      this.pYA.setVisibility(8);
      this.pYE = new b(new LinkedList(), new LinkedList(), this, localm.blY());
      this.pYC.addHeaderView(this.pYA);
      this.pYC.setAdapter(this.pYE);
      this.pPb = ((SnsCommentFooter)findViewById(i.f.paf));
      this.pPb.qah = new SnsCommentFooter.a()
      {
        public final void boF()
        {
          GMTrace.i(8466185846784L, 63078);
          if (!com.tencent.mm.plugin.sns.lucky.a.m.He(localm.blY()))
          {
            if ((SnsCommentDetailUI.t(SnsCommentDetailUI.this) != null) && (SnsCommentDetailUI.t(SnsCommentDetailUI.this).isShowing()))
            {
              GMTrace.o(8466185846784L, 63078);
              return;
            }
            SnsCommentDetailUI.a(SnsCommentDetailUI.this, com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vKB.vKW, SnsCommentDetailUI.this.pZr.vk(0)));
            GMTrace.o(8466185846784L, 63078);
            return;
          }
          if ((SnsCommentDetailUI.this.vKB.vLo == 1) || (SnsCommentDetailUI.b(SnsCommentDetailUI.this).boL()))
          {
            GMTrace.o(8466185846784L, 63078);
            return;
          }
          SnsCommentDetailUI.u(SnsCommentDetailUI.this);
          GMTrace.o(8466185846784L, 63078);
        }
      };
      this.pPb.qai = new SnsCommentFooter.d()
      {
        public final void onShow()
        {
          GMTrace.i(8470346596352L, 63109);
          if (SnsCommentDetailUI.b(SnsCommentDetailUI.this).qae)
          {
            GMTrace.o(8470346596352L, 63109);
            return;
          }
          SnsCommentDetailUI.u(SnsCommentDetailUI.this);
          GMTrace.o(8470346596352L, 63109);
        }
      };
      localObject1 = ib(true);
      if ((localObject1 != null) && (!((com.tencent.mm.plugin.sns.storage.m)localObject1).blX())) {
        this.pPb.setVisibility(8);
      }
      this.pPb.boI();
      this.pPb.boM();
      this.pPb.a(new SnsCommentFooter.c()
      {
        public final void IR(String paramAnonymousString)
        {
          int i = 1;
          GMTrace.i(8589934592000L, 64000);
          if (!com.tencent.mm.plugin.sns.lucky.a.m.He(localm.blY()))
          {
            com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vKB.vKW, SnsCommentDetailUI.this.pZr.vk(0));
            GMTrace.o(8589934592000L, 64000);
            return;
          }
          bew localbew = SnsCommentDetailUI.b(SnsCommentDetailUI.this).boO();
          if (SnsCommentDetailUI.b(SnsCommentDetailUI.this).qad == 1) {}
          for (;;)
          {
            SnsCommentDetailUI.a(SnsCommentDetailUI.this, paramAnonymousString, localbew, i);
            SnsCommentDetailUI.b(SnsCommentDetailUI.this).ic(false);
            w.i("MicroMsg.SnsCommentDetailUI", "comment send imp!");
            SnsCommentDetailUI.s(SnsCommentDetailUI.this);
            new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14444243451904L, 107618);
                SnsCommentDetailUI.u(SnsCommentDetailUI.this);
                GMTrace.o(14444243451904L, 107618);
              }
            }, 100L);
            GMTrace.o(8589934592000L, 64000);
            return;
            i = 0;
          }
        }
      });
      localObject1 = this.pPb;
      localObject3 = new SnsCommentFooter.b()
      {
        public final void boG()
        {
          GMTrace.i(8392097660928L, 62526);
          SnsCommentDetailUI.v(SnsCommentDetailUI.this);
          if ((SnsCommentDetailUI.c(SnsCommentDetailUI.this).getFirstVisiblePosition() > 1) || (SnsCommentDetailUI.c(SnsCommentDetailUI.this).getLastVisiblePosition() <= 0)) {
            BackwardSupportUtil.c.b(SnsCommentDetailUI.c(SnsCommentDetailUI.this), 1);
          }
          GMTrace.o(8392097660928L, 62526);
        }
      };
      i = localm.field_likeFlag;
      ((SnsCommentFooter)localObject1).qab.setVisibility(0);
      ((SnsCommentFooter)localObject1).qab.setOnClickListener(new SnsCommentFooter.7((SnsCommentFooter)localObject1, (SnsCommentFooter.b)localObject3));
      this.pPb.boP();
      this.pYS = getIntent().getBooleanExtra("INTENT_FROMSUI", false);
      if (this.pYS)
      {
        this.pYT = getIntent().getLongExtra("INTENT_FROMSUI_COMMENTID", 0L);
        if ((this.pYT != 0L) && (this.pYE.pZT != null))
        {
          i = 0;
          if (i < this.pYE.pZT.size())
          {
            localObject3 = (bew)this.pYE.pZT.get(i);
            if (((bew)localObject3).uQm == 0) {
              break label1698;
            }
            l = ((bew)localObject3).uQm;
            label1280:
            if (l != this.pYT) {
              break label1736;
            }
            this.pYC.setSelection(i);
            localObject1 = this.pYO.TE(((bew)localObject3).tRz);
            if (localObject1 == null) {
              break label1708;
            }
            localObject1 = ((com.tencent.mm.l.a)localObject1).vk();
            label1326:
            this.pPb.a(getString(i.j.pku) + (String)localObject1, (bew)localObject3);
            if (((bfh)localObject2).uQQ.size() <= 0) {
              break label1781;
            }
            int j = i + 1;
            i = j;
            if (j > this.pYE.getCount()) {
              i = this.pYE.getCount() - 1;
            }
          }
        }
      }
    }
    label1698:
    label1708:
    label1736:
    label1781:
    for (;;)
    {
      this.pZj.CC = i;
      if (this.pYS) {
        new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8322572877824L, 62008);
            SnsCommentDetailUI.this.aLo();
            SnsCommentDetailUI.l(SnsCommentDetailUI.this).jJp = SnsCommentDetailUI.w(SnsCommentDetailUI.this);
            SnsCommentDetailUI.l(SnsCommentDetailUI.this).run();
            GMTrace.o(8322572877824L, 62008);
          }
        }, 100L);
      }
      this.pZb = ((SnsTranslateResultView)this.pYy.findViewById(i.f.peg));
      this.pZb.as(((TextView)this.pYy.findViewById(i.f.bti)).getTextSize());
      this.pZb.oyB.setBackgroundResource(i.e.oYo);
      localObject1 = new as(this.eUg, localm.blY(), false, true, 2);
      this.pZb.oyB.setTag(localObject1);
      this.jGV.a(this.pZb.oyB, this.pZa.qmy, this.pZa.qmv);
      if (com.tencent.mm.plugin.sns.model.ao.bP(this.eUg, 4))
      {
        localObject1 = com.tencent.mm.plugin.sns.model.ao.HA(this.eUg);
        if ((localObject1 != null) && (((ao.b)localObject1).gpJ))
        {
          this.pZb.setVisibility(0);
          this.pZb.a(null, 1, ((ao.b)localObject1).result, ((ao.b)localObject1).gxw, false);
          GMTrace.o(8406190522368L, 62631);
          return;
          this.pYJ = ((bfh)localObject2).uQQ;
          e(((bfh)localObject2).uQQ, ((bfh)localObject2).uQT.isEmpty());
          if (this.pYB != null) {
            this.pYB.a(localm, this.pZa);
          }
          this.pYE = new b(((bfh)localObject2).uQT, ((bfh)localObject2).uQQ, this, localm.blY());
          break;
          l = ((bew)localObject3).uQp;
          break label1280;
          if (((bew)localObject3).uBf != null)
          {
            localObject1 = ((bew)localObject3).uBf;
            break label1326;
          }
          localObject1 = ((bew)localObject3).tRz;
          break label1326;
          i += 1;
          break label1234;
        }
        this.pZb.setVisibility(8);
        GMTrace.o(8406190522368L, 62631);
        return;
      }
      this.pZb.setVisibility(8);
      GMTrace.o(8406190522368L, 62631);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(8407801135104L, 62643);
    if ((paramk.getType() == 218) && (this.pPm != null)) {
      this.pPm.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramk = com.tencent.mm.plugin.sns.storage.h.Ir(this.eUg);
      if (paramk == null)
      {
        w.e("MicroMsg.SnsCommentDetailUI", "invalid pcid:" + this.eUg);
        finish();
        GMTrace.o(8407801135104L, 62643);
        return;
      }
      w.d("MicroMsg.SnsCommentDetailUI", "snsId: " + this.eUg + "  username:" + paramk.field_userName);
      if (this.pYy == null)
      {
        w.e("MicroMsg.SnsCommentDetailUI", "fatal error! Sns onSceneEnd before initView and infoHeader is null!");
        finish();
        GMTrace.o(8407801135104L, 62643);
        return;
      }
      boB();
      paramString = ai.m(paramk);
      w.i("MicroMsg.SnsCommentDetailUI", "onsceneend " + paramString.uQQ.size() + " " + paramString.uQT.size());
      if (paramString == null)
      {
        GMTrace.o(8407801135104L, 62643);
        return;
      }
      if (!f(this.pYJ, paramString.uQQ))
      {
        e(paramString.uQQ, paramString.uQT.isEmpty());
        this.pYJ = paramString.uQQ;
      }
      if (this.pYB != null) {
        this.pYB.a(paramk, this.pZa);
      }
      paramk = this.pYE;
      LinkedList localLinkedList = paramString.uQT;
      paramString = paramString.uQQ;
      paramk.pZT = localLinkedList;
      paramk.pZU = paramString;
      this.pYE.notifyDataSetChanged();
    }
    GMTrace.o(8407801135104L, 62643);
  }
  
  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong)
  {
    GMTrace.i(8405116780544L, 62623);
    GMTrace.o(8405116780544L, 62623);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong)
  {
    GMTrace.i(8404982562816L, 62622);
    GMTrace.o(8404982562816L, 62622);
  }
  
  public final void aoK()
  {
    GMTrace.i(8408069570560L, 62645);
    if (this.vKB.vLo == 2)
    {
      w.i("MicroMsg.SnsCommentDetailUI", "keybaordhide! ");
      this.pYL = false;
      if (this.pPb.mQQ)
      {
        this.pPb.mQQ = false;
        GMTrace.o(8408069570560L, 62645);
        return;
      }
      if (this.pPb.boH())
      {
        this.pPb.boN();
        this.pPb.Jd(getString(i.j.plc));
        GMTrace.o(8408069570560L, 62645);
      }
    }
    else if (this.vKB.vLo == 1)
    {
      boC();
      this.pPa = false;
      this.pZj.run();
    }
    GMTrace.o(8408069570560L, 62645);
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8407398481920L, 62640);
    GMTrace.o(8407398481920L, 62640);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8407935352832L, 62644);
    GMTrace.o(8407935352832L, 62644);
  }
  
  public final void bhV()
  {
    GMTrace.i(8407532699648L, 62641);
    GMTrace.o(8407532699648L, 62641);
  }
  
  final boolean boB()
  {
    GMTrace.i(8406593175552L, 62634);
    final com.tencent.mm.plugin.sns.storage.m localm = ib(true);
    if (localm == null)
    {
      GMTrace.o(8406593175552L, 62634);
      return false;
    }
    w.i("MicroMsg.SnsCommentDetailUI", "setheader " + this.pYy.toString());
    final Object localObject1 = new DisplayMetrics();
    bXm().getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
    this.mScreenWidth = ((DisplayMetrics)localObject1).widthPixels;
    this.mScreenHeight = ((DisplayMetrics)localObject1).heightPixels;
    int i;
    final Object localObject5;
    if (this.mScreenHeight < this.mScreenWidth)
    {
      i = this.mScreenHeight;
      this.mScreenWidth = i;
      this.pYW = com.tencent.mm.plugin.sns.model.ae.bjl();
      localObject5 = localm.blD();
      this.jHw = av.d((biz)localObject5);
      localObject1 = (ImageView)this.pYy.findViewById(i.f.oZb);
      if ((localObject1 != null) && (localm != null)) {
        break label264;
      }
      localObject2 = new StringBuilder("unknow error ? ");
      if (localObject1 != null) {
        break label252;
      }
      bool = true;
      label194:
      localObject1 = ((StringBuilder)localObject2).append(bool).append(" ");
      if (localm != null) {
        break label258;
      }
    }
    label252:
    label258:
    for (boolean bool = true;; bool = false)
    {
      w.e("MicroMsg.SnsCommentDetailUI", bool);
      GMTrace.o(8406593175552L, 62634);
      return false;
      i = this.mScreenWidth;
      break;
      bool = false;
      break label194;
    }
    label264:
    ((MaskImageButton)localObject1).xih = localm.blY();
    a.b.b((ImageView)localObject1, localm.getUserName(), true);
    ((ImageView)localObject1).setTag(localm.getUserName());
    ((ImageView)localObject1).setOnClickListener(this.pZa.qmw);
    final Object localObject2 = (TextView)this.pYy.findViewById(i.f.bQX);
    com.tencent.mm.kernel.h.xz();
    final Object localObject6 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(localm.getUserName());
    w.i("MicroMsg.SnsCommentDetailUI", "snsinfo username " + localm.getUserName() + " " + localm.blE() + " " + localm.blR());
    if (localObject6 == null)
    {
      GMTrace.o(8406593175552L, 62634);
      return false;
    }
    if (((x)localObject6).vi() == 0)
    {
      w.i("MicroMsg.SnsCommentDetailUI", "getContact %s", new Object[] { localm.getUserName() });
      ak.a.AB().a(localm.getUserName(), "", this.pZt);
    }
    final Object localObject3;
    if (localObject6 == null)
    {
      localObject1 = localm.getUserName();
      localObject3 = com.tencent.mm.sdk.platformtools.bg.aq((String)localObject1, "");
      if ((!localm.bmk()) || (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3))) {
        break label9576;
      }
      localObject1 = localm.blz();
      if ((localObject1 == null) || (com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.plugin.sns.storage.b)localObject1).eCQ))) {
        break label9576;
      }
      localObject3 = ((com.tencent.mm.plugin.sns.storage.b)localObject1).eCQ;
    }
    label560:
    label763:
    label1140:
    label1161:
    label1259:
    label1303:
    label1504:
    label1516:
    label1526:
    label1587:
    label1719:
    label2341:
    label2422:
    label2443:
    label2636:
    label2637:
    label2762:
    label2971:
    label3057:
    label3091:
    label3524:
    label4049:
    label4092:
    label4415:
    label4583:
    label4831:
    label4925:
    label5145:
    label5270:
    label5407:
    label5479:
    label5522:
    label5528:
    label5937:
    label5943:
    label6046:
    label6324:
    label6326:
    label6332:
    label6748:
    label6763:
    label6856:
    label6945:
    label6972:
    label6991:
    label7138:
    label7273:
    label7983:
    label8295:
    label8305:
    label8353:
    label8363:
    label8374:
    label8434:
    label8447:
    label8561:
    label8571:
    label8859:
    label9026:
    label9036:
    label9046:
    label9056:
    label9073:
    label9283:
    label9353:
    label9535:
    label9553:
    label9556:
    label9559:
    label9567:
    label9570:
    label9573:
    label9576:
    for (;;)
    {
      ((String)localObject3).length();
      if (this.jHw == 11)
      {
        i = 3;
        localObject1 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.a(this, (CharSequence)localObject3));
        ((com.tencent.mm.pluginsdk.ui.d.i)localObject1).f(new com.tencent.mm.pluginsdk.ui.d.m(new com.tencent.mm.plugin.sns.data.a(localm.bmk(), ((x)localObject6).getUsername(), localm.blY(), 2), this.pYR, i), (CharSequence)localObject3);
        ((TextView)localObject2).setOnTouchListener(new ab());
        ((TextView)localObject2).setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
        ((TextView)this.pYy.findViewById(i.f.peu)).setText("");
        this.pZu = new bf(this.pYy);
        if (!localm.bmk()) {
          break label1504;
        }
        this.pZu.r(Long.valueOf(localm.field_snsId), new com.tencent.mm.plugin.sns.data.b(this.pZu, 0, this.pYN, localm.field_snsId));
        this.pZu.a(localm.blz(), localm.blB());
        this.pZu.a(this.pZa.qmF, this.pZa.qmU);
        this.pZu.setVisibility(0);
        localObject2 = ((biz)localObject5).uTZ;
        this.pYz = ((TextView)this.pYy.findViewById(i.f.bti));
        localObject1 = new as(this.eUg, localm.blY(), true, false, 2);
        this.pYz.setTag(localObject1);
        this.jGV.a(this.pYz, this.pZa.qmy, this.pZa.qmv);
        localObject1 = this.pYy.findViewById(i.f.paa);
        if (localObject1 != null) {
          ((View)localObject1).setVisibility(8);
        }
        if ((!localm.bmk()) || (localm.blz() == null) || (localm.blz().pDs != 1)) {
          break label9573;
        }
        this.pYz.setVisibility(8);
        this.pYz = ((TextView)this.pYy.findViewById(i.f.pav));
        this.pYz.setClickable(false);
        this.pYz.setLongClickable(false);
        localObject2 = (LinearLayout)this.pYy.findViewById(i.f.paS);
        ((LinearLayout)localObject2).setBackground(bXm().getResources().getDrawable(i.e.oYl));
        localObject1 = new LinearLayout.LayoutParams(((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12), -2);
        ((LinearLayout.LayoutParams)localObject1).setMargins(0, com.tencent.mm.br.a.fromDPToPix(bXm(), 5), 0, 0);
        ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        localObject1 = (TextView)this.pYy.findViewById(i.f.par);
        ((TextView)localObject1).setClickable(false);
        ((TextView)localObject1).setLongClickable(false);
        if (com.tencent.mm.sdk.platformtools.bg.nm(localm.blz().pDt)) {
          break label1516;
        }
        ((TextView)localObject1).setText(localm.blz().pDt + " ");
        com.tencent.mm.pluginsdk.ui.d.h.e((TextView)localObject1, 2);
        ((TextView)localObject1).setVisibility(0);
        if (!com.tencent.mm.sdk.platformtools.bg.nm(localm.blz().pDu)) {
          break label1526;
        }
        localObject1 = ((biz)localObject5).uTZ;
        this.jGV.a((View)localObject2, this.pZa.qmM, this.pZa.qmv);
        if (!localm.blz().bkf())
        {
          localObject2 = localObject1;
          if (!localm.blz().bkg()) {}
        }
        else
        {
          this.pYy.findViewById(i.f.paa).setVisibility(0);
          B(localm);
          localObject2 = localObject1;
        }
      }
      for (;;)
      {
        if ((localObject2 == null) || (((String)localObject2).equals("")))
        {
          this.pYz.setVisibility(8);
          av.e((biz)localObject5);
          localObject1 = (ViewStub)this.pYy.findViewById(i.f.paR);
          if (!this.pZq)
          {
            if (this.jHw != 2) {
              break label1587;
            }
            ((ViewStub)localObject1).setLayoutResource(i.g.pgx);
            if ((this.jHw != 2) && (this.jHw != 3) && (this.jHw != 4) && (this.jHw != 5)) {
              break label1719;
            }
            this.pZr = ((PhotosContent)((ViewStub)localObject1).inflate());
          }
        }
        for (;;)
        {
          this.pZq = true;
          if (this.jHw == 6) {
            break label2341;
          }
          if ((this.jHw != 2) && (this.jHw != 3) && (this.jHw != 4) && (this.jHw != 5)) {
            break label4092;
          }
          if (this.pZr == null) {
            break label4049;
          }
          this.pZr.bob();
          i = 0;
          while (i < ar.qcP[this.jHw])
          {
            localObject1 = (TagImageView)this.pZr.findViewById(ar.qcT[i]);
            this.pZr.a((TagImageView)localObject1);
            ((TagImageView)localObject1).setOnClickListener(this.pZa.pTd);
            this.jGV.a((View)localObject1, this.pZa.qmJ, this.pZa.qmv);
            i += 1;
          }
          localObject1 = ((x)localObject6).vk();
          break;
          i = 2;
          break label560;
          this.pZu.setVisibility(8);
          break label763;
          ((TextView)localObject1).setVisibility(8);
          break label1140;
          localObject1 = localm.blz().pDu;
          break label1161;
          this.pYz.setText((String)localObject2 + " ");
          com.tencent.mm.pluginsdk.ui.d.h.e(this.pYz, 2);
          this.pYz.setVisibility(0);
          break label1259;
          if (this.jHw == 3)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pgu);
            break label1303;
          }
          if (this.jHw == 4)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pgv);
            break label1303;
          }
          if (this.jHw == 5)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pgw);
            break label1303;
          }
          if (this.jHw == 6) {
            break label1303;
          }
          if ((this.jHw == 1) || (this.jHw == 0))
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pfT);
            break label1303;
          }
          if (this.jHw == 9)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pdk);
            break label1303;
          }
          if (this.jHw != 11) {
            break label1303;
          }
          ((ViewStub)localObject1).setLayoutResource(i.g.pfJ);
          break label1303;
          if (this.jHw == 9) {
            ((ViewStub)localObject1).inflate();
          } else if (this.jHw == 11) {
            this.pZr = ((PhotosContent)((ViewStub)localObject1).inflate());
          } else {
            ((ViewStub)localObject1).setVisibility(8);
          }
        }
        this.pZr.vj(this.pYW);
        localObject2 = new LinkedList();
        final Object localObject4;
        int j;
        if ((localm.bmk()) && (this.jHw == 2))
        {
          localObject4 = localm.blz();
          if ((localObject4 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDs != 1)) {
            break label3524;
          }
          i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth();
          if ((((biz)localObject5).uUc != null) && (((biz)localObject5).uUc.ueW.size() > 0)) {}
          for (localObject1 = (anu)((biz)localObject5).uUc.ueW.get(0);; localObject1 = null)
          {
            f1 = ((anu)localObject1).uCR.uDE;
            f2 = ((anu)localObject1).uCR.uDF;
            i = i - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 20);
            j = (int)(f2 * i / f1);
            localObject1 = new anw();
            ((anw)localObject1).uDE = i;
            ((anw)localObject1).uDF = j;
            ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
            ((LinkedList)localObject2).add(localObject1);
            localObject1 = (LinearLayout.LayoutParams)this.pZr.getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).leftMargin = com.tencent.mm.br.a.fromDPToPix(bXm(), 10);
            ((LinearLayout.LayoutParams)localObject1).rightMargin = com.tencent.mm.br.a.fromDPToPix(bXm(), 10);
            this.pZr.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            this.pYy.findViewById(i.f.paS).setTag(this.pZr.vk(0));
            this.pYy.findViewById(i.f.paS).setOnClickListener(this.pZa.qna);
            i = 0;
            while (i < ar.qcP[this.jHw])
            {
              localObject1 = (TagImageView)this.pZr.findViewById(ar.qcT[i]);
              this.jGV.a((View)localObject1, this.pZa.qmM, this.pZa.qmv);
              i += 1;
            }
          }
          this.pYy.findViewById(i.f.pab).setTag(this.pZr.vk(0));
          this.pYy.findViewById(i.f.pac).setTag(this.pZr.vk(0));
        }
        final Object localObject7;
        while ((localObject4 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi <= 0.0F) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj <= 0.0F))
        {
          if (!com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.plugin.sns.storage.b)localObject4).pDn))
          {
            localObject1 = this.pZr;
            localObject7 = this.pZr.vk(0);
            d.a("adId", ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDn, false, 41, 0, new d.a()
            {
              public final void Ih(String paramAnonymousString)
              {
                GMTrace.i(8714622861312L, 64929);
                MaskImageView localMaskImageView = (MaskImageView)localObject1.findViewById(i.f.pbu);
                if (localMaskImageView != null)
                {
                  localMaskImageView.setVisibility(0);
                  localMaskImageView.setImageBitmap(BitmapFactory.decodeFile(paramAnonymousString));
                  float f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.pDo, 1, localObject4.pDk, localObject4.pDl);
                  float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.pDp, 1, localObject4.pDk, localObject4.pDl);
                  float f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.pDq, 1, localObject4.pDk, localObject4.pDl);
                  float f4 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.pDr, 1, localObject4.pDk, localObject4.pDl);
                  paramAnonymousString = new FrameLayout.LayoutParams((int)f1, (int)f2);
                  paramAnonymousString.setMargins((int)(localObject7.getRight() - f3 - f1), (int)(localObject7.getBottom() - f4 - f2), 0, 0);
                  localMaskImageView.setLayoutParams(paramAnonymousString);
                }
                GMTrace.o(8714622861312L, 64929);
              }
              
              public final void bkK()
              {
                GMTrace.i(8714354425856L, 64927);
                GMTrace.o(8714354425856L, 64927);
              }
              
              public final void bkL()
              {
                GMTrace.i(8714488643584L, 64928);
                GMTrace.o(8714488643584L, 64928);
              }
            });
          }
          this.pYy.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
          {
            boolean pZD;
            
            public final void onViewAttachedToWindow(View paramAnonymousView)
            {
              GMTrace.i(8570875674624L, 63858);
              w.i("MicroMsg.SnsCommentDetailUI", "onViewAttachedToWindow infoHeader %s", new Object[] { Boolean.valueOf(this.pZD) });
              if (!this.pZD)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              this.pZD = false;
              if (localObject5 == null)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              if (localm == null)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              if (SnsCommentDetailUI.this.pZr == null)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              paramAnonymousView = SnsCommentDetailUI.z(SnsCommentDetailUI.this);
              PhotosContent localPhotosContent = SnsCommentDetailUI.this.pZr;
              biz localbiz = localObject5;
              String str = localm.blY();
              SnsCommentDetailUI.x(SnsCommentDetailUI.this);
              int i = SnsCommentDetailUI.this.hashCode();
              int j = SnsCommentDetailUI.y(SnsCommentDetailUI.this);
              localm.uX(32);
              paramAnonymousView.a(localPhotosContent, localbiz, str, i, j, -1, false, an.vBg, localObject2);
              GMTrace.o(8570875674624L, 63858);
            }
            
            public final void onViewDetachedFromWindow(View paramAnonymousView)
            {
              GMTrace.i(8571009892352L, 63859);
              w.i("MicroMsg.SnsCommentDetailUI", "onViewDetachedFromWindow infoHeader");
              this.pZD = true;
              GMTrace.o(8571009892352L, 63859);
            }
          });
          localObject1 = this.pYM;
          localObject4 = this.pZr;
          localObject7 = localm.blY();
          i = hashCode();
          j = this.jHw;
          localm.uX(32);
          ((ar)localObject1).a((PhotosContent)localObject4, (biz)localObject5, (String)localObject7, i, j, -1, false, an.vBg, (List)localObject2);
          localObject4 = (TextView)this.pYy.findViewById(i.f.oZa);
          if (!localm.bmk()) {
            break label8363;
          }
          localObject2 = localm.blB();
          if (localObject2 == null) {
            break label8353;
          }
          localObject1 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).pCj;
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).pCk;
          ((TextView)localObject4).setTag(localm.blY());
          if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
            break label8353;
          }
          if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {
            break;
          }
          ((TextView)localObject4).setVisibility(0);
          ((TextView)localObject4).setText((CharSequence)localObject1);
          ((TextView)localObject4).setClickable(false);
          ((TextView)localObject4).setTextColor(-9211021);
          ((TextView)localObject4).setOnClickListener(this.pZa.qmR);
          ((TextView)this.pYy.findViewById(i.f.oZP)).setText(az.k(bXm(), localm.blR() * 1000L));
          localObject4 = (AsyncTextView)this.pYy.findViewById(i.f.oYZ);
          ((TextView)localObject4).setOnClickListener(this.pZa.qmV);
          ((TextView)localObject4).setVisibility(8);
          localObject7 = (AsyncTextView)this.pYy.findViewById(i.f.oYY);
          ((TextView)localObject7).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8767638863872L, 65324);
              paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(localm.bmh(), 24, 2, "", localm.bmm(), localm.blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).b(localObject6.vk(), null);
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).ic(true);
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(8);
              SnsCommentDetailUI.u(SnsCommentDetailUI.this);
              GMTrace.o(8767638863872L, 65324);
            }
          });
          ((TextView)localObject7).setVisibility(8);
          if (localm.bmk())
          {
            localObject6 = localm.blB();
            ((TextView)localObject4).setTag(localm.blY());
            if (((com.tencent.mm.plugin.sns.storage.a)localObject6).pCl != com.tencent.mm.plugin.sns.storage.a.pBX) {
              break label8571;
            }
            if (com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.plugin.sns.storage.a)localObject6).pCm)) {
              break label8561;
            }
            ((TextView)localObject4).setText(((com.tencent.mm.plugin.sns.storage.a)localObject6).pCm);
            ((TextView)localObject4).setVisibility(0);
            break label8859;
            if ((((TextView)localObject4).getVisibility() != 8) && (com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.plugin.sns.storage.a)localObject6).pCn)))
            {
              ((TextView)localObject4).setTextColor(getResources().getColor(i.c.oXl));
              ((TextView)localObject4).setOnClickListener(null);
            }
            if (localm.blD().uUc.ueX != 4) {
              break label9026;
            }
            ((TextView)localObject7).setTag(localm.blY());
            ((TextView)localObject7).setVisibility(0);
            ((TextView)localObject7).setText(String.format("%s%s%s", new Object[] { bXm().getResources().getString(i.j.piu), localObject3, bXm().getResources().getString(i.j.piv) }));
          }
          localObject2 = (TextView)this.pYy.findViewById(i.f.oZs);
          ((TextView)localObject2).setOnTouchListener(new ab());
          localObject1 = com.tencent.mm.plugin.sns.c.a.hnI.m(this, ((biz)localObject5).uUb.mmR);
          if (((biz)localObject5).uUc.ueV == 26) {
            localObject1 = getString(i.j.dsQ);
          }
          av.a((biz)localObject5, this);
          if (!com.tencent.mm.plugin.sns.c.a.hnI.bI((String)localObject1)) {
            break label9036;
          }
          ((TextView)localObject2).setVisibility(0);
          localObject1 = new SpannableString(getString(i.j.piL) + (String)localObject1);
          ((SpannableString)localObject1).setSpan(new a(), 0, ((SpannableString)localObject1).length(), 33);
          ((TextView)localObject2).setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
          if ((((biz)localObject5).uUb == null) || (!com.tencent.mm.pluginsdk.model.app.g.Or(((biz)localObject5).uUb.mmR)))
          {
            ((TextView)localObject2).setTextColor(getResources().getColor(i.c.oXl));
            ((TextView)localObject2).setOnTouchListener(null);
          }
          ((TextView)localObject2).setTag(localObject5);
          localObject1 = (TextView)this.pYy.findViewById(i.f.oZr);
          if (!localm.getUserName().equals(this.fJS)) {
            break label9046;
          }
          ((TextView)localObject1).setVisibility(0);
          ((TextView)localObject1).setTag(localm.blY() + ";" + localm.blE());
          ((TextView)localObject1).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8348611117056L, 62202);
              com.tencent.mm.ui.base.h.a(SnsCommentDetailUI.this, i.j.pkT, i.j.cUG, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(8613020041216L, 64172);
                  w.d("MicroMsg.SnsCommentDetailUI", "to del by localId " + SnsCommentDetailUI.j(SnsCommentDetailUI.this));
                  paramAnonymous2DialogInterface = com.tencent.mm.plugin.sns.storage.h.Is(SnsCommentDetailUI.j(SnsCommentDetailUI.this));
                  if (paramAnonymous2DialogInterface == null)
                  {
                    w.e("MicroMsg.SnsCommentDetailUI", "try to del item fail can not get snsinfo by localid %s", new Object[] { SnsCommentDetailUI.j(SnsCommentDetailUI.this) });
                    GMTrace.o(8613020041216L, 64172);
                    return;
                  }
                  if (paramAnonymous2DialogInterface.uX(32))
                  {
                    GMTrace.o(8613020041216L, 64172);
                    return;
                  }
                  Object localObject;
                  if (paramAnonymous2DialogInterface.field_snsId == 0L)
                  {
                    com.tencent.mm.plugin.sns.model.ae.bjd().vb(paramAnonymous2DialogInterface.pMe);
                    localObject = new Intent();
                    ((Intent)localObject).putExtra("sns_gallery_op_id", u.IN(SnsCommentDetailUI.j(SnsCommentDetailUI.this)));
                    SnsCommentDetailUI.this.setResult(-1, (Intent)localObject);
                    if ((SnsCommentDetailUI.r(SnsCommentDetailUI.this)) && (!paramAnonymous2DialogInterface.isValid())) {
                      ((Intent)localObject).putExtra("sns_gallery_force_finish", true);
                    }
                    localObject = paramAnonymous2DialogInterface.blD();
                    if (localObject != null) {
                      if (((biz)localObject).uUb != null) {
                        break label373;
                      }
                    }
                  }
                  label373:
                  for (paramAnonymous2DialogInterface = null;; paramAnonymous2DialogInterface = ((biz)localObject).uUb.mmR)
                  {
                    if ((!com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymous2DialogInterface)) && (com.tencent.mm.plugin.sns.c.a.hnI.bJ(paramAnonymous2DialogInterface)))
                    {
                      String str = com.tencent.mm.plugin.sns.c.a.hnI.bH(paramAnonymous2DialogInterface);
                      mz localmz = new mz();
                      localmz.eRX.appId = paramAnonymous2DialogInterface;
                      localmz.eRX.eRY = ((biz)localObject).jhi;
                      localmz.eRX.esM = str;
                      com.tencent.mm.sdk.b.a.vgX.m(localmz);
                    }
                    SnsCommentDetailUI.this.finish();
                    GMTrace.o(8613020041216L, 64172);
                    return;
                    com.tencent.mm.plugin.sns.model.ae.bjc().dG(paramAnonymous2DialogInterface.field_snsId);
                    com.tencent.mm.kernel.h.xz();
                    com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.model.q(paramAnonymous2DialogInterface.field_snsId, 1), 0);
                    com.tencent.mm.plugin.sns.model.ae.bjd().delete(paramAnonymous2DialogInterface.field_snsId);
                    com.tencent.mm.plugin.sns.model.ae.bji().dP(paramAnonymous2DialogInterface.field_snsId);
                    break;
                  }
                }
              }, null);
              GMTrace.o(8348611117056L, 62202);
            }
          });
          localObject3 = (TextView)this.pYy.findViewById(i.f.peE);
          localObject4 = ai.m(localm);
          if (localObject4 != null) {
            break label9056;
          }
          ((TextView)localObject3).setVisibility(8);
          this.pYF = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
          this.pYF.setDuration(150L);
          this.pYG = new ScaleAnimation(1.0F, 0.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
          this.pYG.setDuration(150L);
          if (this.pYD == null)
          {
            this.pYD = this.pYy.findViewById(i.f.oZd);
            this.pYD.setVisibility(8);
          }
          this.pYH = ((LinearLayout)this.pYy.findViewById(i.f.oZi));
          this.pYH.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8469272854528L, 63101);
              if (!com.tencent.mm.plugin.sns.lucky.a.m.He(localm.blY()))
              {
                com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vKB.vKW, SnsCommentDetailUI.this.pZr.vk(0));
                GMTrace.o(8469272854528L, 63101);
                return;
              }
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).pso = null;
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).Jd("");
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).qad = 0;
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).ic(true);
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(8);
              SnsCommentDetailUI.u(SnsCommentDetailUI.this);
              GMTrace.o(8469272854528L, 63101);
            }
          });
          this.pYH.setOnTouchListener(this.pSw);
          this.pYI = ((LinearLayout)this.pYy.findViewById(i.f.oZH));
          this.pYI.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8533697363968L, 63581);
              SnsCommentDetailUI localSnsCommentDetailUI = SnsCommentDetailUI.this;
              paramAnonymousView = (LinearLayout)paramAnonymousView;
              ImageView localImageView = (ImageView)paramAnonymousView.findViewById(i.f.oZG);
              ScaleAnimation localScaleAnimation = new ScaleAnimation(0.9F, 1.5F, 0.9F, 1.5F, 1, 0.5F, 1, 0.5F);
              localScaleAnimation.setDuration(400L);
              localScaleAnimation.setStartOffset(100L);
              localScaleAnimation.setRepeatCount(0);
              localImageView.clearAnimation();
              localImageView.startAnimation(localScaleAnimation);
              localScaleAnimation.setAnimationListener(new SnsCommentDetailUI.32(localSnsCommentDetailUI, paramAnonymousView));
              SnsCommentDetailUI.v(SnsCommentDetailUI.this);
              GMTrace.o(8533697363968L, 63581);
            }
          });
          this.pYI.setOnTouchListener(this.pSw);
          localObject1 = (ImageButton)this.pYy.findViewById(i.f.oZQ);
          localObject2 = ib(true);
          if ((localObject2 != null) && ((((com.tencent.mm.plugin.sns.storage.m)localObject2).blT() & 0x1) != 0)) {
            ((ImageButton)localObject1).setVisibility(8);
          }
          if ((localObject2 != null) && (!((com.tencent.mm.plugin.sns.storage.m)localObject2).blX())) {
            ((ImageButton)localObject1).setVisibility(8);
          }
          localObject2 = (ImageView)this.pYI.findViewById(i.f.oZG);
          localObject3 = (ImageView)this.pYH.findViewById(i.f.oZh);
          localObject4 = (TextView)this.pYI.findViewById(i.f.oZI);
          localObject5 = (TextView)this.pYH.findViewById(i.f.oZp);
          if (this.jHw == 11)
          {
            this.pYy.findViewById(i.f.oZd).setBackgroundResource(i.e.oXG);
            ((ImageButton)localObject1).setImageResource(i.e.oXO);
            ((ImageView)localObject2).setImageResource(i.e.oXP);
            ((ImageView)localObject3).setImageResource(i.e.oXQ);
            ((TextView)localObject4).setTextColor(getResources().getColor(i.c.oXe));
            ((TextView)localObject5).setTextColor(getResources().getColor(i.c.oXe));
            this.pYI.setBackgroundResource(i.e.oXR);
            this.pYH.setBackgroundResource(i.e.oXS);
          }
          ((ImageButton)localObject1).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8322036006912L, 62004);
              w.d("MicroMsg.SnsCommentDetailUI", "showComment click" + SnsCommentDetailUI.B(SnsCommentDetailUI.this).getVisibility());
              paramAnonymousView = localm.blD();
              if ((paramAnonymousView != null) && (paramAnonymousView.uUc.ueV == 21) && (!com.tencent.mm.plugin.sns.lucky.a.m.He(localm.blY())))
              {
                com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vKB.vKW, SnsCommentDetailUI.this.pZr.vk(0));
                GMTrace.o(8322036006912L, 62004);
                return;
              }
              if (SnsCommentDetailUI.B(SnsCommentDetailUI.this).getVisibility() == 0)
              {
                SnsCommentDetailUI.f(SnsCommentDetailUI.this);
                GMTrace.o(8322036006912L, 62004);
                return;
              }
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(0);
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).startAnimation(SnsCommentDetailUI.C(SnsCommentDetailUI.this));
              if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11) {
                SnsCommentDetailUI.D(SnsCommentDetailUI.this).findViewById(i.f.oZd).setBackgroundResource(i.e.oXG);
              }
              if (!u.IO(SnsCommentDetailUI.n(SnsCommentDetailUI.this)))
              {
                SnsCommentDetailUI.this.pYH.setEnabled(false);
                SnsCommentDetailUI.this.pYI.setEnabled(false);
                localObject4.setText(SnsCommentDetailUI.this.getString(i.j.pjT));
                localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.oXd));
                localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.oXd));
                if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
                {
                  localObject2.setImageResource(i.i.pgZ);
                  GMTrace.o(8322036006912L, 62004);
                  return;
                }
                localObject2.setImageResource(i.i.phb);
                GMTrace.o(8322036006912L, 62004);
                return;
              }
              SnsCommentDetailUI.this.pYH.setEnabled(true);
              localObject2.setImageResource(i.e.oXH);
              SnsCommentDetailUI.this.pYI.setEnabled(true);
              localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
              localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
              paramAnonymousView = com.tencent.mm.plugin.sns.storage.h.Ir(SnsCommentDetailUI.n(SnsCommentDetailUI.this));
              if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
              {
                localObject2.setImageResource(i.e.oXP);
                localObject3.setImageResource(i.e.oXQ);
                localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.oXe));
                localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.oXe));
              }
              while (paramAnonymousView.field_likeFlag == 0)
              {
                localObject4.setText(SnsCommentDetailUI.this.getString(i.j.pjT));
                GMTrace.o(8322036006912L, 62004);
                return;
                localObject2.setImageResource(i.e.oXH);
                localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
                localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
              }
              localObject4.setText(SnsCommentDetailUI.this.getString(i.j.pjt));
              GMTrace.o(8322036006912L, 62004);
            }
          });
          GMTrace.o(8406593175552L, 62634);
          return true;
        }
        float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDl);
        float f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDl);
        if (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDh == 0)
        {
          i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth();
          if (f2 < i - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12)) {
            break label9570;
          }
          f2 = i - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12);
          f1 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj * f2 / ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi);
        }
        for (;;)
        {
          localObject1 = new anw();
          ((anw)localObject1).uDE = f2;
          ((anw)localObject1).uDF = f1;
          ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
          ((LinkedList)localObject2).add(localObject1);
          break;
          if (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDh == 1)
          {
            i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12);
            j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi);
            localObject1 = new anw();
            if (i > 0) {
              f2 = i;
            }
            ((anw)localObject1).uDE = f2;
            if (j > 0) {
              f1 = j;
            }
            ((anw)localObject1).uDF = f1;
            ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
            ((LinkedList)localObject2).add(localObject1);
            break;
          }
          if (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDh != 2) {
            break;
          }
          i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12);
          j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi);
          localObject1 = new anw();
          if (i > 0) {
            f2 = i;
          }
          ((anw)localObject1).uDE = f2;
          if (j > 0) {
            f1 = j;
          }
          ((anw)localObject1).uDF = f1;
          ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
          ((LinkedList)localObject2).add(localObject1);
          break;
          w.e("MicroMsg.SnsCommentDetailUI", "the imagesKeeper is null,when viewtype = " + this.jHw + ",stub is " + ((ViewStub)localObject1).toString());
          break label2341;
          if (this.jHw == 11)
          {
            this.pZr.bob();
            localObject1 = (TagImageView)this.pZr.findViewById(i.f.oZx);
            this.pZr.a((TagImageView)localObject1);
            ((TagImageView)localObject1).setOnClickListener(this.pZa.pTd);
            localObject2 = localm.blY();
            localObject4 = new ArrayList();
            ((List)localObject4).add(localObject1);
            localObject7 = new ap();
            ((ap)localObject7).eHy = ((String)localObject2);
            ((ap)localObject7).index = 0;
            ((ap)localObject7).qaR = ((List)localObject4);
            ((ap)localObject7).pYh = true;
            if (localObject1 != null) {
              ((TagImageView)localObject1).setTag(localObject7);
            }
            localObject1 = (TextView)this.pYy.findViewById(i.f.paO);
            if (!com.tencent.mm.y.q.zE().equals(((biz)localObject5).jhi))
            {
              localObject2 = ai.n(localm);
              if ((((bfh)localObject2).uRe != null) && (((bfh)localObject2).uRe.uRG != 0))
              {
                ((TextView)localObject1).setText(getString(i.j.phW, new Object[] { Integer.valueOf(((bfh)localObject2).uRe.uRG) }));
                ((TextView)localObject1).setVisibility(0);
              }
            }
            for (;;)
            {
              localObject1 = localm.blQ();
              if (localObject1 == null) {
                break label4583;
              }
              if (!com.tencent.mm.y.q.zE().equals(((biz)localObject5).jhi)) {
                break label4415;
              }
              localObject1 = this.pYM;
              localObject2 = this.pZr;
              localObject4 = localm.blY();
              i = hashCode();
              j = this.jHw;
              localm.uX(32);
              ((ar)localObject1).a((PhotosContent)localObject2, (biz)localObject5, (String)localObject4, i, j, -1, false, an.vBg, true);
              break;
              ((TextView)localObject1).setVisibility(8);
              continue;
              ((TextView)localObject1).setVisibility(8);
            }
            if (com.tencent.mm.plugin.sns.lucky.a.m.h(localm))
            {
              localObject1 = this.pYM;
              localObject2 = this.pZr;
              localObject4 = localm.blY();
              i = hashCode();
              j = this.jHw;
              localm.uX(32);
              ((ar)localObject1).a((PhotosContent)localObject2, (biz)localObject5, (String)localObject4, i, j, -1, false, an.vBg, false);
              break label2341;
            }
            if (((anv)localObject1).eYn == 0)
            {
              localObject1 = this.pYM;
              localObject2 = this.pZr;
              localObject4 = localm.blY();
              i = hashCode();
              j = this.jHw;
              localm.uX(32);
              ((ar)localObject1).a((PhotosContent)localObject2, (biz)localObject5, (String)localObject4, i, j, -1, false, an.vBg, true);
              break label2341;
            }
            w.e("MicroMsg.SnsCommentDetailUI", "mediaPostInfo.hbStatus is " + ((anv)localObject1).eYn);
            break label2341;
            w.e("MicroMsg.SnsCommentDetailUI", "mediaPostInfo is null " + localm.blY());
            break label2341;
          }
          Object localObject8;
          Object localObject9;
          if (this.jHw == 9)
          {
            localObject7 = new ak();
            localObject1 = this.pYy;
            localObject8 = ((View)localObject1).findViewById(i.f.bne);
            localObject9 = (com.tencent.mm.plugin.sight.decode.a.a)((View)localObject1).findViewById(i.f.image);
            ((ak)localObject7).pWD = ((View)localObject8);
            ((ak)localObject7).pIr = ((ImageView)((View)localObject1).findViewById(i.f.cfI));
            ((ak)localObject7).pWE = ((MMPinProgressBtn)((View)localObject1).findViewById(i.f.progress));
            ((ak)localObject7).pIu = ((TextView)((View)localObject1).findViewById(i.f.paC));
            ((ak)localObject7).pWF = ((TextView)((View)localObject1).findViewById(i.f.paB));
            ((ak)localObject7).oUt = ((com.tencent.mm.plugin.sight.decode.a.a)localObject9);
            ((ak)localObject7).a((biz)localObject5, 0, localm.blY(), localm.bmk());
            ((ak)localObject7).pIu.setVisibility(8);
            ((ak)localObject7).oUt.bo(localObject7);
            ((View)localObject8).setTag(localObject7);
            ((ak)localObject7).pWD.setOnClickListener(this.pZa.qmS);
            if (!localm.bke())
            {
              this.jGV.a((View)localObject8, this.pZa.qmL, this.pZa.qmv);
              localObject2 = com.tencent.mm.modelsns.e.a((biz)localObject5, ((ak)localObject7).oUt.bgm(), localm.bmk());
              localObject1 = localObject2;
              if (localm.bmk())
              {
                localObject4 = localm.blz();
                if ((localObject4 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDs != 1)) {
                  break label5528;
                }
                if ((((biz)localObject5).uUc == null) || (((biz)localObject5).uUc.ueW.size() <= 0)) {
                  break label5522;
                }
                localObject4 = (anu)((biz)localObject5).uUc.ueW.get(0);
                localObject1 = localObject2;
                if (localObject4 != null)
                {
                  i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 20);
                  localObject1 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((anu)localObject4).uCR.uDF / ((anu)localObject4).uCR.uDE)));
                }
                localObject2 = (LinearLayout.LayoutParams)((ak)localObject7).pWD.getLayoutParams();
                ((LinearLayout.LayoutParams)localObject2).leftMargin = com.tencent.mm.br.a.fromDPToPix(bXm(), 10);
                ((LinearLayout.LayoutParams)localObject2).rightMargin = com.tencent.mm.br.a.fromDPToPix(bXm(), 10);
                ((ak)localObject7).pWD.setLayoutParams((ViewGroup.LayoutParams)localObject2);
                this.pYy.findViewById(i.f.paS).setTag(localObject7);
                this.pYy.findViewById(i.f.paS).setOnClickListener(this.pZa.qna);
                this.pYy.findViewById(i.f.pab).setTag(localObject7);
                this.pYy.findViewById(i.f.pac).setTag(localObject7);
              }
            }
            do
            {
              do
              {
                do
                {
                  if (localObject1 != null)
                  {
                    ((com.tencent.mm.plugin.sight.decode.a.a)localObject9).cV(((Integer)((Pair)localObject1).first).intValue(), ((Integer)((Pair)localObject1).second).intValue());
                    localObject2 = ((ak)localObject7).pWF.getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject2).width = ((Integer)((Pair)localObject1).first).intValue();
                    ((ViewGroup.LayoutParams)localObject2).height = ((Integer)((Pair)localObject1).second).intValue();
                    ((ak)localObject7).pWF.setLayoutParams((ViewGroup.LayoutParams)localObject2);
                  }
                  if ((((biz)localObject5).uUc == null) || (((biz)localObject5).uUc.ueW.size() <= 0)) {
                    break label5937;
                  }
                  localObject1 = (anu)((biz)localObject5).uUc.ueW.get(0);
                  if (localm.bmk())
                  {
                    ((ak)localObject7).oUt.a(new b.e()
                    {
                      public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
                      {
                        GMTrace.i(8768175734784L, 65328);
                        if (paramAnonymousInt != -1)
                        {
                          if (SnsCommentDetailUI.A(SnsCommentDetailUI.this) == null)
                          {
                            GMTrace.o(8768175734784L, 65328);
                            return;
                          }
                          SnsCommentDetailUI.A(SnsCommentDetailUI.this).dn(localm.field_snsId);
                        }
                        GMTrace.o(8768175734784L, 65328);
                      }
                    });
                    if (!this.pQi.jdMethod_do(localm.field_snsId)) {
                      ((ak)localObject7).oUt.a(new b.f()
                      {
                        public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, long paramAnonymousLong)
                        {
                          GMTrace.i(8703214354432L, 64844);
                          if (SnsCommentDetailUI.A(SnsCommentDetailUI.this) == null)
                          {
                            GMTrace.o(8703214354432L, 64844);
                            return;
                          }
                          int i = (int)paramAnonymousb.bgw();
                          SnsCommentDetailUI.A(SnsCommentDetailUI.this).t(localm.field_snsId, com.tencent.mm.sdk.platformtools.bg.Pw());
                          SnsCommentDetailUI.A(SnsCommentDetailUI.this).u(localm.field_snsId, i);
                          if (paramAnonymousLong >= 3L)
                          {
                            SnsCommentDetailUI.A(SnsCommentDetailUI.this).s(localm.field_snsId, localm.field_snsId);
                            localObject7.oUt.a(null);
                          }
                          GMTrace.o(8703214354432L, 64844);
                        }
                      });
                    }
                  }
                  if ((((biz)localObject5).uUc == null) || (((biz)localObject5).uUc.ueW.size() <= 0)) {
                    break;
                  }
                  com.tencent.mm.plugin.sns.model.ae.bja();
                  if (com.tencent.mm.plugin.sns.model.g.t((anu)localObject1)) {
                    break label6046;
                  }
                  if (!com.tencent.mm.plugin.sns.model.ae.bja().w((anu)localObject1)) {
                    break label5943;
                  }
                  ((ak)localObject7).pIr.setVisibility(8);
                  ((ak)localObject7).pWE.setVisibility(0);
                  ((ak)localObject7).pWE.cjf();
                  ((com.tencent.mm.plugin.sight.decode.a.a)localObject9).bo(localObject7);
                  com.tencent.mm.plugin.sns.model.ae.bja().a(localm, (anu)localObject1, (com.tencent.mm.plugin.sight.decode.a.a)localObject9, hashCode(), 0, an.vBg, localm.bmk());
                  ((View)localObject8).setTag(localObject7);
                  if (this.pQi == null) {
                    break;
                  }
                  if (!localm.bmk()) {
                    break label6332;
                  }
                  if (com.tencent.mm.plugin.sns.model.ae.bja().l(localm) != 5) {
                    break label6326;
                  }
                  bool = true;
                  this.pQi.k(localm.field_snsId, bool);
                  break;
                  this.jGV.a((View)localObject8, this.pZa.qmM, this.pZa.qmv);
                  break label4831;
                  localObject4 = null;
                  break label4925;
                  localObject1 = localObject2;
                } while (localObject4 == null);
                localObject1 = localObject2;
              } while (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi <= 0.0F);
              localObject1 = localObject2;
            } while (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj <= 0.0F);
            f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDl);
            f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDl);
            if (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDh == 0)
            {
              i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth();
              if (f2 < i - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12)) {
                break label9567;
              }
              f2 = i - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12);
              f1 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj * f2 / ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi);
            }
          }
          for (;;)
          {
            localObject1 = Pair.create(Integer.valueOf((int)f2), Integer.valueOf((int)f1));
            break label5145;
            if (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDh == 1)
            {
              i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12);
              localObject1 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi)));
              break label5145;
            }
            localObject1 = localObject2;
            if (((com.tencent.mm.plugin.sns.storage.b)localObject4).pDh != 2) {
              break label5145;
            }
            i = ((WindowManager)bXm().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(bXm(), 50) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12) - com.tencent.mm.br.a.fromDPToPix(bXm(), 12);
            localObject1 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject4).pDi)));
            break label5145;
            localObject1 = null;
            break label5270;
            if ((localm.bmk()) && (com.tencent.mm.plugin.sns.model.ae.bja().l(localm) == 5))
            {
              com.tencent.mm.plugin.sns.model.ae.bja().z((anu)localObject1);
              ((ak)localObject7).pIr.setVisibility(8);
              ((ak)localObject7).pWE.setVisibility(0);
              ((ak)localObject7).pWE.cjf();
              break label5407;
            }
            com.tencent.mm.plugin.sns.model.ae.bja().x((anu)localObject1);
            ((ak)localObject7).pIr.setVisibility(0);
            ((ak)localObject7).pWE.setVisibility(8);
            ((ak)localObject7).pIr.setImageDrawable(com.tencent.mm.br.a.b(this, i.i.cOK));
            break label5407;
            if (com.tencent.mm.plugin.sns.model.ae.bja().u((anu)localObject1))
            {
              ((ak)localObject7).pIr.setVisibility(0);
              ((ak)localObject7).pWE.setVisibility(8);
              ((ak)localObject7).pIr.setImageDrawable(com.tencent.mm.br.a.b(this, i.i.cOK));
            }
            for (;;)
            {
              if (!((ak)localObject7).oUt.bgn()) {
                break label6324;
              }
              w.d("MicroMsg.SnsCommentDetailUI", "play video error " + ((anu)localObject1).mmR + " " + ((anu)localObject1).lPM + " " + ((anu)localObject1).uCO);
              com.tencent.mm.plugin.sns.model.ae.bja().x((anu)localObject1);
              ((ak)localObject7).pIr.setVisibility(0);
              ((ak)localObject7).pWE.setVisibility(8);
              ((ak)localObject7).pIr.setImageDrawable(com.tencent.mm.br.a.b(this, i.i.cOK));
              break;
              if (com.tencent.mm.plugin.sns.model.ae.bja().v((anu)localObject1))
              {
                ((ak)localObject7).pIr.setVisibility(8);
                ((ak)localObject7).pWE.setVisibility(8);
              }
              else if ((localm.bmk()) && (com.tencent.mm.plugin.sns.model.ae.bja().l(localm) <= 5))
              {
                ((ak)localObject7).pIr.setVisibility(8);
                ((ak)localObject7).pWE.setVisibility(8);
              }
              else
              {
                com.tencent.mm.plugin.sns.model.ae.bja().x((anu)localObject1);
                ((ak)localObject7).pIr.setVisibility(0);
                ((ak)localObject7).pWE.setVisibility(8);
                ((ak)localObject7).pIr.setImageDrawable(com.tencent.mm.br.a.b(this, i.i.cOK));
              }
            }
            break label5407;
            bool = false;
            break label5479;
            if (com.tencent.mm.plugin.sns.model.ae.bja().k(localm) == 5)
            {
              bool = true;
              break label5479;
            }
            bool = false;
            break label5479;
            if (this.jHw == 0)
            {
              localObject1 = (LinearLayout)this.pYy.findViewById(i.f.pdl);
              localObject2 = vm(i.g.pfS);
              if (!this.pZo)
              {
                ((LinearLayout)localObject1).removeView(this.pZr);
                ((LinearLayout)localObject1).addView((View)localObject2, 3);
                if (((LinearLayout)localObject2).getLayoutParams() == null) {
                  break label6748;
                }
              }
              for (localObject1 = new LinearLayout.LayoutParams(((LinearLayout)localObject2).getLayoutParams());; localObject1 = new LinearLayout.LayoutParams(-1, -2))
              {
                ((LinearLayout.LayoutParams)localObject1).setMargins(((LinearLayout.LayoutParams)localObject1).leftMargin, com.tencent.mm.br.a.fromDPToPix(this, 12), ((LinearLayout.LayoutParams)localObject1).rightMargin, ((LinearLayout.LayoutParams)localObject1).bottomMargin);
                ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
                if (((biz)localObject5).uUc.ueW.isEmpty()) {
                  break label6763;
                }
                localObject4 = (anu)((biz)localObject5).uUc.ueW.get(0);
                localObject1 = (MMImageView)((LinearLayout)localObject2).findViewById(i.f.paQ);
                com.tencent.mm.plugin.sns.model.ae.bja().b((anu)localObject4, (View)localObject1, i.i.cJd, hashCode(), an.vBg);
                this.pYQ = ((ImageView)((LinearLayout)localObject2).findViewById(i.f.state));
                this.pYQ.setOnTouchListener(this.pSw);
                this.nri = ((biz)localObject5).mmR;
                boD();
                bool = getIntent().getBooleanExtra("SNS_FROM_MUSIC_ITEM", false);
                ((MMImageView)localObject1).setTag(new r((biz)localObject5, this.pYN, bool));
                ((MMImageView)localObject1).setOnClickListener(this.pYU.qjU);
                localObject7 = ((anu)localObject4).lPj;
                if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject7)) {
                  ((TextView)((LinearLayout)localObject2).findViewById(i.f.pbK)).setText((CharSequence)localObject7);
                }
                localObject4 = ((anu)localObject4).eBt;
                if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject4)) {
                  ((TextView)((LinearLayout)localObject2).findViewById(i.f.pep)).setText(new SpannableString((CharSequence)localObject4), TextView.BufferType.SPANNABLE);
                }
                ((LinearLayout)localObject2).setTag(new r((biz)localObject5, this.pYN));
                this.jGV.a((View)localObject2, this.pZa.qmK, this.pZa.qmv);
                ((LinearLayout)localObject2).setOnClickListener(this.pYU.qeg);
                com.tencent.mm.plugin.sns.data.i.b((View)localObject1, this);
                break;
              }
              ((LinearLayout)localObject2).setVisibility(8);
              break;
            }
            localObject1 = (LinearLayout)this.pYy.findViewById(i.f.pdl);
            localObject4 = vm(i.g.pfR);
            localObject7 = (MMImageView)((LinearLayout)localObject4).findViewById(i.f.paQ);
            if (!this.pZo)
            {
              ((LinearLayout)localObject1).removeView(this.pZr);
              ((LinearLayout)localObject1).addView((View)localObject4, 3);
              if (((LinearLayout)localObject4).getLayoutParams() != null)
              {
                localObject1 = new LinearLayout.LayoutParams(((LinearLayout)localObject4).getLayoutParams());
                ((LinearLayout.LayoutParams)localObject1).setMargins(((LinearLayout.LayoutParams)localObject1).leftMargin, com.tencent.mm.br.a.fromDPToPix(this, 12), ((LinearLayout.LayoutParams)localObject1).rightMargin, ((LinearLayout.LayoutParams)localObject1).bottomMargin);
                ((LinearLayout)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject1);
              }
            }
            else
            {
              i = 0;
              if (!localm.bmk()) {
                break label7273;
              }
              if (localm.blz().pDs == 2)
              {
                i = 1;
                ((LinearLayout)localObject4).setTag(localm);
                ((LinearLayout)localObject4).setTag(i.f.pbk, localObject7);
                ((LinearLayout)localObject4).setOnClickListener(this.pZa.qnd);
              }
              j = 0;
            }
            for (;;)
            {
              if (i != 0)
              {
                this.jGV.a((View)localObject4, this.pZa.qmN, this.pZa.qmv);
                if (!boA()) {
                  break label7983;
                }
                localObject2 = av.Jp(((biz)localObject5).uUc.lPM);
                localObject1 = ((biz)localObject5).uUc.eBt;
                if (i == 0) {
                  break label9556;
                }
                localObject2 = ((biz)localObject5).uUc.lPj;
              }
              for (;;)
              {
                ((LinearLayout)localObject4).findViewById(i.f.state).setVisibility(8);
                if (!((biz)localObject5).uUc.ueW.isEmpty())
                {
                  ((MMImageView)localObject7).setVisibility(0);
                  localObject8 = (anu)((biz)localObject5).uUc.ueW.get(0);
                  if (((biz)localObject5).uUc.ueV == 15)
                  {
                    ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setImageResource(i.e.aYf);
                    ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setVisibility(0);
                    com.tencent.mm.plugin.sns.model.ae.bja().b((anu)localObject8, (View)localObject7, i.i.cJo, hashCode(), an.bTm().Av(((biz)localObject5).nFd));
                    com.tencent.mm.plugin.sns.data.i.b((View)localObject7, this);
                    if (((biz)localObject5).uUc.ueV != 15) {
                      break label9553;
                    }
                    localObject2 = "";
                    localObject1 = getString(i.j.pjj);
                  }
                }
                for (;;)
                {
                  if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
                  {
                    ((LinearLayout)localObject4).findViewById(i.f.pbK).setVisibility(0);
                    ((TextView)((LinearLayout)localObject4).findViewById(i.f.pbK)).setText((CharSequence)localObject2);
                  }
                  for (;;)
                  {
                    localObject2 = (TextView)((LinearLayout)localObject4).findViewById(i.f.pep);
                    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
                      break label8305;
                    }
                    ((TextView)localObject2).setVisibility(0);
                    if (j == 0) {
                      break label8295;
                    }
                    ((TextView)localObject2).setText(com.tencent.mm.plugin.sns.data.i.a((String)localObject1, bXm(), (TextView)localObject2));
                    break;
                    localObject1 = new LinearLayout.LayoutParams(-1, -2);
                    break label6856;
                    if (((biz)localObject5).uUc.ueV == 9)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjO);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 10)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjQ);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 17)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjR);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 22)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjS);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 23)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjT);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 14)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjP);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 12)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjX);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 13)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjY);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 15)
                    {
                      if (((biz)localObject5).uUc.ueW.size() <= 0) {
                        break label9559;
                      }
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pZa.qmT);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    if (((biz)localObject5).uUc.ueV == 26)
                    {
                      ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                      ((LinearLayout)localObject4).setOnClickListener(this.pYU.qjZ);
                      j = 0;
                      i = 0;
                      break label6945;
                    }
                    ((LinearLayout)localObject4).setTag(new r((biz)localObject5, this.pYN));
                    ((LinearLayout)localObject4).setOnClickListener(this.pYU.qeg);
                    if ((((biz)localObject5).giA & 0x1) <= 0) {
                      break label9559;
                    }
                    j = 1;
                    i = 0;
                    break label6945;
                    this.jGV.a((View)localObject4, this.pZa.qmK, this.pZa.qmv);
                    break label6972;
                    localObject2 = "";
                    break label6991;
                    if (((biz)localObject5).uUc.ueV == 5)
                    {
                      localObject2 = av.Jp(((anu)localObject8).lPM);
                      localObject1 = ((anu)localObject8).eBt;
                      ((LinearLayout)localObject4).findViewById(i.f.state).setVisibility(0);
                      com.tencent.mm.plugin.sns.model.ae.bja().b((anu)localObject8, (View)localObject7, i.i.cJo, hashCode(), an.vBg);
                      break label7138;
                    }
                    if (((biz)localObject5).uUc.ueV == 18)
                    {
                      ((LinearLayout)localObject4).findViewById(i.f.state).setVisibility(0);
                      ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setImageResource(i.e.bbo);
                      ((MMImageView)localObject7).setVisibility(0);
                      com.tencent.mm.plugin.sns.model.ae.bja().b((anu)localObject8, (View)localObject7, i.i.cJo, hashCode(), an.vBg);
                      break label7138;
                    }
                    com.tencent.mm.plugin.sns.model.ae.bja().b((anu)localObject8, (View)localObject7, hashCode(), an.vBg);
                    break label7138;
                    if (((biz)localObject5).uUc.ueV == 18)
                    {
                      ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setVisibility(0);
                      ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setImageResource(i.e.bbo);
                      ((MMImageView)localObject7).setVisibility(0);
                      com.tencent.mm.plugin.sns.model.ae.bja().b((View)localObject7, -1, i.i.cJo, hashCode());
                      break label7138;
                    }
                    if (((biz)localObject5).uUc.ueV == 26)
                    {
                      ((MMImageView)localObject7).setVisibility(0);
                      com.tencent.mm.plugin.sns.model.ae.bja().b((View)localObject7, -1, i.i.phj, hashCode());
                      break label7138;
                    }
                    ((MMImageView)localObject7).setVisibility(0);
                    com.tencent.mm.plugin.sns.model.ae.bja().b((View)localObject7, -1, i.i.cJr, hashCode());
                    break label7138;
                    ((LinearLayout)localObject4).findViewById(i.f.pbK).setVisibility(8);
                  }
                  ((TextView)localObject2).setText((CharSequence)localObject1);
                  break;
                  ((TextView)localObject2).setVisibility(8);
                  break;
                  ((TextView)localObject4).setVisibility(0);
                  if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
                    break label2422;
                  }
                  ((TextView)localObject4).setTextColor(-11048043);
                  ((TextView)localObject4).setClickable(true);
                  ((TextView)localObject4).setText((CharSequence)localObject1);
                  break label2443;
                  ((TextView)localObject4).setVisibility(8);
                  break label2443;
                  if (((biz)localObject5).uUa == null)
                  {
                    localObject1 = null;
                    if (((biz)localObject5).uUa != null) {
                      break label8434;
                    }
                  }
                  for (localObject2 = null;; localObject2 = ((biz)localObject5).uUa.mzo)
                  {
                    ((TextView)localObject4).setTag(localm.blY());
                    if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) || (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))) {
                      break label8447;
                    }
                    ((TextView)localObject4).setVisibility(8);
                    break;
                    localObject1 = ((biz)localObject5).uUa.gCz;
                    break label8374;
                  }
                  ((TextView)localObject4).setVisibility(0);
                  if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
                  {
                    ((TextView)localObject4).setTextColor(-11048043);
                    ((TextView)localObject4).setClickable(true);
                    if ((localm.field_snsId == 0L) && (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)))
                    {
                      ((TextView)localObject4).setText((String)localObject1 + "·" + (String)localObject2);
                      break label2443;
                    }
                    ((TextView)localObject4).setText((CharSequence)localObject2);
                    break label2443;
                  }
                  ((TextView)localObject4).setText((CharSequence)localObject1);
                  ((TextView)localObject4).setClickable(false);
                  ((TextView)localObject4).setTextColor(-9211021);
                  break label2443;
                  ((TextView)localObject4).setVisibility(8);
                  break label2637;
                  if (((com.tencent.mm.plugin.sns.storage.a)localObject6).pCl != com.tencent.mm.plugin.sns.storage.a.pBY) {
                    break label2637;
                  }
                  if (!com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.plugin.sns.storage.a)localObject6).pCm))
                  {
                    localObject1 = "";
                    localObject8 = ((com.tencent.mm.plugin.sns.storage.a)localObject6).pCo.iterator();
                    if (((Iterator)localObject8).hasNext())
                    {
                      localObject9 = (String)((Iterator)localObject8).next();
                      localObject2 = this.pYO.TD((String)localObject9);
                      if (localObject2 != null)
                      {
                        localObject2 = ((com.tencent.mm.l.a)localObject2).vk();
                        if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {
                          localObject2 = (String)localObject1 + (String)localObject2;
                        }
                      }
                      for (;;)
                      {
                        localObject1 = localObject2;
                        if (((com.tencent.mm.plugin.sns.storage.a)localObject6).pCo.getLast() == localObject9) {
                          break;
                        }
                        localObject1 = (String)localObject2 + ",";
                        break;
                        localObject2 = (String)localObject1 + (String)localObject9;
                        continue;
                        localObject2 = (String)localObject1 + (String)localObject9;
                      }
                    }
                    localObject2 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject6).pCm, new Object[] { localObject1 });
                    ((TextView)localObject4).getTextSize();
                    localObject8 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.d(this, (CharSequence)localObject2, 1));
                    ((com.tencent.mm.pluginsdk.ui.d.i)localObject8).f(null, (CharSequence)localObject2);
                    localObject2 = ((TextView)localObject4).getPaint();
                    if (com.tencent.mm.br.a.Y(this, (int)Layout.getDesiredWidth((CharSequence)localObject8, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject8).length(), (TextPaint)localObject2)) > this.pYZ)
                    {
                      if (((String)localObject1).length() <= 1) {
                        break label2637;
                      }
                      localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 2);
                      localObject8 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject6).pCm, new Object[] { (String)localObject1 + "..." });
                      ((TextView)localObject4).getTextSize();
                      localObject9 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.d(this, (CharSequence)localObject8, 1));
                      ((com.tencent.mm.pluginsdk.ui.d.i)localObject9).f(null, (CharSequence)localObject8);
                      i = com.tencent.mm.br.a.Y(this, (int)Layout.getDesiredWidth((CharSequence)localObject9, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject9).length(), (TextPaint)localObject2));
                      ((TextView)localObject4).setText((CharSequence)localObject9, TextView.BufferType.SPANNABLE);
                      ((TextView)localObject4).setVisibility(0);
                      if (i > this.pYZ) {
                        break label2636;
                      }
                      break label2637;
                    }
                    ((TextView)localObject4).setText((CharSequence)localObject8, TextView.BufferType.SPANNABLE);
                    ((TextView)localObject4).setVisibility(0);
                    break label2637;
                  }
                  ((TextView)localObject4).setVisibility(8);
                  break label2637;
                  ((TextView)localObject7).setVisibility(8);
                  break label2762;
                  ((TextView)localObject2).setVisibility(8);
                  break label2971;
                  ((TextView)localObject1).setVisibility(8);
                  break label3057;
                  if (((bfh)localObject4).uQW.size() <= 0) {
                    ((TextView)localObject3).setVisibility(8);
                  }
                  for (;;)
                  {
                    if ((localObject4 == null) || (this.fJS == null) || (!this.fJS.equals(((bfh)localObject4).tRz)) || (((((bfh)localObject4).uEI != 3) || (((bfh)localObject4).uRb == null)) && ((((bfh)localObject4).uEI != 5) || (((bfh)localObject4).uDw == null)))) {
                      break label9535;
                    }
                    this.pYy.findViewById(i.f.oZt).setVisibility(0);
                    this.pYy.findViewById(i.f.oZt).setTag(Integer.valueOf(localm.pMe));
                    this.pYy.findViewById(i.f.oZt).setOnClickListener(new View.OnClickListener()
                    {
                      public final void onClick(View paramAnonymousView)
                      {
                        GMTrace.i(8493968916480L, 63285);
                        try
                        {
                          int i = ((Integer)paramAnonymousView.getTag()).intValue();
                          paramAnonymousView = new Intent();
                          paramAnonymousView.putExtra("sns_label_sns_info", i);
                          com.tencent.mm.plugin.sns.c.a.hnH.x(paramAnonymousView, SnsCommentDetailUI.this);
                          GMTrace.o(8493968916480L, 63285);
                          return;
                        }
                        catch (Exception paramAnonymousView)
                        {
                          GMTrace.o(8493968916480L, 63285);
                        }
                      }
                    });
                    break;
                    if (this.fJS.equals(((bfh)localObject4).tRz))
                    {
                      ((TextView)localObject3).setVisibility(0);
                      localObject5 = ((bfh)localObject4).uQW.iterator();
                      i = 0;
                      localObject1 = "";
                      if (((Iterator)localObject5).hasNext())
                      {
                        localObject6 = (bew)((Iterator)localObject5).next();
                        if (i == 0)
                        {
                          i = 1;
                          localObject1 = (String)localObject1 + "  ";
                          if (((bew)localObject6).uBf == null) {
                            break label9353;
                          }
                          localObject2 = new StringBuilder().append((String)localObject1);
                          localObject1 = ((bew)localObject6).uBf;
                        }
                        for (;;)
                        {
                          localObject1 = (String)localObject1;
                          break;
                          localObject1 = (String)localObject1 + ",  ";
                          break label9283;
                          localObject7 = this.pYO.TE(((bew)localObject6).tRz);
                          localObject2 = new StringBuilder().append((String)localObject1);
                          if (localObject7 == null) {
                            localObject1 = ((bew)localObject6).tRz;
                          } else {
                            localObject1 = ((com.tencent.mm.l.a)localObject7).vk();
                          }
                        }
                      }
                      ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, getString(i.j.pkW, new Object[] { localObject1 }), ((TextView)localObject3).getTextSize()));
                    }
                    else
                    {
                      ((TextView)localObject3).setVisibility(8);
                      localObject1 = ((bfh)localObject4).uQW.iterator();
                      if (((Iterator)localObject1).hasNext())
                      {
                        localObject2 = (bew)((Iterator)localObject1).next();
                        if (!this.fJS.equals(((bew)localObject2).tRz)) {
                          break label9073;
                        }
                        ((TextView)localObject3).setVisibility(0);
                        localObject1 = getString(i.j.pkX);
                        ((TextView)localObject3).setVisibility(0);
                        ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject1, ((TextView)localObject3).getTextSize()));
                      }
                    }
                  }
                  this.pYy.findViewById(i.f.oZt).setVisibility(8);
                  break label3091;
                }
              }
              j = 0;
              i = 0;
            }
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8406056304640L, 62630);
    int i = i.g.pfA;
    GMTrace.o(8406056304640L, 62630);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8407666917376L, 62642);
    w.i("MicroMsg.SnsCommentDetailUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt1 == 15)
    {
      if ((this.pZa != null) && (this.pZa.qmv != null)) {
        this.pZa.qmv.onActivityResult(paramInt1, paramInt2, paramIntent);
      }
      GMTrace.o(8407666917376L, 62642);
      return;
    }
    if (paramInt1 == 16)
    {
      w.i("MicroMsg.SnsCommentDetailUI", "REQUEST_CODE_FOR_FULLSCREEN");
      paramIntent = new gh();
      paramIntent.eJs.scene = 1;
      com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
      GMTrace.o(8407666917376L, 62642);
      return;
    }
    if (paramInt2 != -1)
    {
      GMTrace.o(8407666917376L, 62642);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(8407666917376L, 62642);
      return;
      if (paramInt2 == -1)
      {
        paramIntent = managedQuery(paramIntent.getData(), null, null, null, null);
        if (paramIntent.moveToFirst())
        {
          paramIntent = paramIntent.getString(paramIntent.getColumnIndexOrThrow("_id"));
          startActivity(new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + paramIntent)));
        }
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8407130046464L, 62638);
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = com.tencent.mm.plugin.sns.storage.h.Ir(this.eUg);
    bfh localbfh = ai.m(paramConfiguration);
    e(localbfh.uQQ, localbfh.uQT.isEmpty());
    if (this.pYB != null) {
      this.pYB.a(paramConfiguration, this.pZa);
    }
    if (this.pZr != null)
    {
      this.pYW = com.tencent.mm.plugin.sns.model.ae.bjl();
      this.pZr.vj(this.pYW);
    }
    GMTrace.o(8407130046464L, 62638);
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc2_w 2905
    //   3: ldc_w 2907
    //   6: invokestatic 229	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 2912	com/tencent/mm/pluginsdk/e:g	(Lcom/tencent/mm/ui/MMActivity;)V
    //   13: aload_0
    //   14: aload_1
    //   15: invokespecial 2914	com/tencent/mm/ui/MMActivity:onCreate	(Landroid/os/Bundle;)V
    //   18: invokestatic 2918	com/tencent/mm/plugin/sns/model/ae:biT	()Lcom/tencent/mm/plugin/sns/model/al$a;
    //   21: iconst_5
    //   22: ldc_w 2920
    //   25: aload_0
    //   26: invokevirtual 2923	com/tencent/mm/plugin/sns/model/al$a:a	(ILjava/lang/String;Lcom/tencent/mm/plugin/sns/b/h$a;)V
    //   29: aload_0
    //   30: aload_0
    //   31: ldc_w 2925
    //   34: invokevirtual 2926	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   37: checkcast 2928	android/text/ClipboardManager
    //   40: putfield 1249	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:liU	Landroid/text/ClipboardManager;
    //   43: aload_0
    //   44: invokestatic 2934	java/lang/System:currentTimeMillis	()J
    //   47: putfield 243	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYw	J
    //   50: aload_0
    //   51: new 1649	com/tencent/mm/ui/tools/l
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 2935	com/tencent/mm/ui/tools/l:<init>	(Landroid/content/Context;)V
    //   59: putfield 512	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:jGV	Lcom/tencent/mm/ui/tools/l;
    //   62: aload_0
    //   63: new 934	com/tencent/mm/plugin/sns/ui/bg
    //   66: dup
    //   67: aload_0
    //   68: new 38	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$2
    //   71: dup
    //   72: aload_0
    //   73: invokespecial 2936	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$2:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsCommentDetailUI;)V
    //   76: iconst_1
    //   77: aload_0
    //   78: getfield 288	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZe	Lcom/tencent/mm/plugin/sns/model/af;
    //   81: invokespecial 2939	com/tencent/mm/plugin/sns/ui/bg:<init>	(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/bg$a;ILcom/tencent/mm/plugin/sns/model/ad;)V
    //   84: putfield 1193	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYU	Lcom/tencent/mm/plugin/sns/ui/bg;
    //   87: aload_0
    //   88: new 62	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$3
    //   91: dup
    //   92: aload_0
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 288	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZe	Lcom/tencent/mm/plugin/sns/model/af;
    //   98: invokespecial 2942	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$3:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsCommentDetailUI;Landroid/app/Activity;Lcom/tencent/mm/plugin/sns/model/ad;)V
    //   101: putfield 397	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZa	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   104: aload_0
    //   105: getstatic 2945	com/tencent/mm/plugin/sns/i$f:pen	I
    //   108: invokevirtual 1424	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:findViewById	(I)Landroid/view/View;
    //   111: checkcast 2947	android/widget/FrameLayout
    //   114: astore_1
    //   115: aload_0
    //   116: new 2949	com/tencent/mm/plugin/sns/f/b
    //   119: dup
    //   120: aload_0
    //   121: aload_0
    //   122: getfield 397	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZa	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   125: aload_1
    //   126: invokespecial 2952	com/tencent/mm/plugin/sns/f/b:<init>	(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/b/b;Landroid/widget/FrameLayout;)V
    //   129: putfield 2954	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pPk	Lcom/tencent/mm/plugin/sns/f/b;
    //   132: aload_0
    //   133: new 2956	com/tencent/mm/plugin/sns/ui/c
    //   136: dup
    //   137: aload_0
    //   138: aload_0
    //   139: getfield 397	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZa	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   142: aload_1
    //   143: aload_0
    //   144: getfield 2954	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pPk	Lcom/tencent/mm/plugin/sns/f/b;
    //   147: invokespecial 2959	com/tencent/mm/plugin/sns/ui/c:<init>	(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/b/b;Landroid/widget/FrameLayout;Lcom/tencent/mm/plugin/sns/f/b;)V
    //   150: putfield 1271	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pPj	Lcom/tencent/mm/plugin/sns/ui/c;
    //   153: aload_0
    //   154: getfield 397	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZa	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   157: invokevirtual 2962	com/tencent/mm/plugin/sns/ui/b/b:aJx	()V
    //   160: aload_0
    //   161: aload_0
    //   162: invokevirtual 1587	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   165: ldc_w 2964
    //   168: invokevirtual 2967	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   171: ldc_w 267
    //   174: invokestatic 1830	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   177: putfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   180: aload_0
    //   181: getfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   184: invokestatic 833	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   187: ifeq +24 -> 211
    //   190: aload_0
    //   191: ldc_w 2969
    //   194: aload_0
    //   195: invokevirtual 1587	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   198: ldc_w 2964
    //   201: lconst_0
    //   202: invokevirtual 1601	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   205: invokestatic 2973	com/tencent/mm/plugin/sns/storage/u:W	(Ljava/lang/String;J)Ljava/lang/String;
    //   208: putfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   211: aload_0
    //   212: aload_0
    //   213: invokevirtual 1587	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   216: ldc_w 2975
    //   219: invokevirtual 2967	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   222: ldc_w 267
    //   225: invokestatic 1830	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   228: putfield 729	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYN	Ljava/lang/String;
    //   231: aload_0
    //   232: getfield 729	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYN	Ljava/lang/String;
    //   235: invokestatic 833	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   238: ifeq +32 -> 270
    //   241: aload_0
    //   242: invokevirtual 1587	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   245: ldc_w 2975
    //   248: iconst_m1
    //   249: invokevirtual 2979	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   252: istore_2
    //   253: iload_2
    //   254: iconst_m1
    //   255: if_icmpeq +15 -> 270
    //   258: aload_0
    //   259: ldc_w 2969
    //   262: iload_2
    //   263: i2l
    //   264: invokestatic 2973	com/tencent/mm/plugin/sns/storage/u:W	(Ljava/lang/String;J)Ljava/lang/String;
    //   267: putfield 729	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYN	Ljava/lang/String;
    //   270: invokestatic 2934	java/lang/System:currentTimeMillis	()J
    //   273: lstore_3
    //   274: aload_0
    //   275: invokevirtual 1587	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   278: ldc_w 2981
    //   281: invokevirtual 2985	android/content/Intent:getByteArrayExtra	(Ljava/lang/String;)[B
    //   284: astore_1
    //   285: aload_1
    //   286: ifnull +184 -> 470
    //   289: new 549	com/tencent/mm/protocal/c/biz
    //   292: dup
    //   293: invokespecial 2986	com/tencent/mm/protocal/c/biz:<init>	()V
    //   296: astore 6
    //   298: aload 6
    //   300: aload_1
    //   301: invokevirtual 2990	com/tencent/mm/protocal/c/biz:aD	([B)Lcom/tencent/mm/bm/a;
    //   304: pop
    //   305: invokestatic 2994	com/tencent/mm/plugin/sns/model/ae:bjd	()Lcom/tencent/mm/plugin/sns/storage/n;
    //   308: new 2996	java/math/BigInteger
    //   311: dup
    //   312: aload 6
    //   314: getfield 2585	com/tencent/mm/protocal/c/biz:mmR	Ljava/lang/String;
    //   317: invokespecial 2997	java/math/BigInteger:<init>	(Ljava/lang/String;)V
    //   320: invokevirtual 3000	java/math/BigInteger:longValue	()J
    //   323: invokevirtual 3006	com/tencent/mm/plugin/sns/storage/n:dU	(J)Lcom/tencent/mm/plugin/sns/storage/m;
    //   326: ifnonnull +640 -> 966
    //   329: ldc_w 1033
    //   332: ldc_w 3008
    //   335: invokestatic 1413	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   338: new 358	com/tencent/mm/plugin/sns/storage/m
    //   341: dup
    //   342: invokespecial 3009	com/tencent/mm/plugin/sns/storage/m:<init>	()V
    //   345: astore_1
    //   346: aload_1
    //   347: new 2996	java/math/BigInteger
    //   350: dup
    //   351: aload 6
    //   353: getfield 2585	com/tencent/mm/protocal/c/biz:mmR	Ljava/lang/String;
    //   356: invokespecial 2997	java/math/BigInteger:<init>	(Ljava/lang/String;)V
    //   359: invokevirtual 3000	java/math/BigInteger:longValue	()J
    //   362: putfield 1891	com/tencent/mm/plugin/sns/storage/m:field_snsId	J
    //   365: aload_1
    //   366: aload 6
    //   368: invokevirtual 3013	com/tencent/mm/protocal/c/biz:toByteArray	()[B
    //   371: putfield 3017	com/tencent/mm/plugin/sns/storage/m:field_content	[B
    //   374: aload_1
    //   375: aload 6
    //   377: getfield 2659	com/tencent/mm/protocal/c/biz:nFd	I
    //   380: putfield 3020	com/tencent/mm/plugin/sns/storage/m:field_createTime	I
    //   383: aload_1
    //   384: aload 6
    //   386: getfield 2357	com/tencent/mm/protocal/c/biz:jhi	Ljava/lang/String;
    //   389: putfield 1156	com/tencent/mm/plugin/sns/storage/m:field_userName	Ljava/lang/String;
    //   392: aload_1
    //   393: aload 6
    //   395: getfield 553	com/tencent/mm/protocal/c/biz:uUc	Lcom/tencent/mm/protocal/c/oa;
    //   398: getfield 558	com/tencent/mm/protocal/c/oa:ueV	I
    //   401: putfield 3023	com/tencent/mm/plugin/sns/storage/m:field_type	I
    //   404: aload_1
    //   405: invokevirtual 3026	com/tencent/mm/plugin/sns/storage/m:blV	()V
    //   408: new 743	com/tencent/mm/protocal/c/bfh
    //   411: dup
    //   412: invokespecial 3027	com/tencent/mm/protocal/c/bfh:<init>	()V
    //   415: astore 6
    //   417: aload 6
    //   419: new 3029	com/tencent/mm/protocal/c/azp
    //   422: dup
    //   423: invokespecial 3030	com/tencent/mm/protocal/c/azp:<init>	()V
    //   426: putfield 3034	com/tencent/mm/protocal/c/bfh:uQM	Lcom/tencent/mm/protocal/c/azp;
    //   429: aload_1
    //   430: aload 6
    //   432: invokevirtual 3035	com/tencent/mm/protocal/c/bfh:toByteArray	()[B
    //   435: putfield 3038	com/tencent/mm/plugin/sns/storage/m:field_attrBuf	[B
    //   438: invokestatic 2994	com/tencent/mm/plugin/sns/model/ae:bjd	()Lcom/tencent/mm/plugin/sns/storage/n;
    //   441: aload_1
    //   442: invokevirtual 3041	com/tencent/mm/plugin/sns/storage/n:b	(Lcom/tencent/mm/sdk/e/c;)Z
    //   445: pop
    //   446: ldc_w 3043
    //   449: ldc_w 3045
    //   452: iconst_1
    //   453: anewarray 1037	java/lang/Object
    //   456: dup
    //   457: iconst_0
    //   458: invokestatic 2934	java/lang/System:currentTimeMillis	()J
    //   461: lload_3
    //   462: lsub
    //   463: invokestatic 1896	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   466: aastore
    //   467: invokestatic 1815	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: aload_0
    //   471: iconst_1
    //   472: invokespecial 543	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:ib	(Z)Lcom/tencent/mm/plugin/sns/storage/m;
    //   475: astore_1
    //   476: ldc_w 1033
    //   479: new 703	java/lang/StringBuilder
    //   482: dup
    //   483: ldc_w 3047
    //   486: invokespecial 1402	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   489: aload_0
    //   490: getfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   493: invokevirtual 712	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: ldc_w 3049
    //   499: invokevirtual 712	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: aload_0
    //   503: getfield 729	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYN	Ljava/lang/String;
    //   506: invokevirtual 712	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: invokevirtual 716	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   512: invokestatic 1413	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   515: aload_1
    //   516: ifnull +29 -> 545
    //   519: ldc_w 1033
    //   522: ldc_w 3051
    //   525: iconst_1
    //   526: anewarray 1037	java/lang/Object
    //   529: dup
    //   530: iconst_0
    //   531: aload_1
    //   532: getfield 1156	com/tencent/mm/plugin/sns/storage/m:field_userName	Ljava/lang/String;
    //   535: ldc_w 267
    //   538: invokestatic 1830	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   541: aastore
    //   542: invokestatic 1815	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   545: aload_0
    //   546: getfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   549: invokestatic 790	com/tencent/mm/plugin/sns/storage/u:IO	(Ljava/lang/String;)Z
    //   552: ifeq +56 -> 608
    //   555: aload_0
    //   556: getfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   559: invokestatic 3054	com/tencent/mm/plugin/sns/storage/u:GE	(Ljava/lang/String;)Z
    //   562: ifeq +448 -> 1010
    //   565: aload_1
    //   566: ifnull +412 -> 978
    //   569: aload_1
    //   570: getfield 1156	com/tencent/mm/plugin/sns/storage/m:field_userName	Ljava/lang/String;
    //   573: invokestatic 3059	com/tencent/mm/y/s:fB	(Ljava/lang/String;)Z
    //   576: ifne +32 -> 608
    //   579: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   582: pop
    //   583: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   586: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   589: new 3071	com/tencent/mm/plugin/sns/model/p
    //   592: dup
    //   593: aload_0
    //   594: getfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   597: invokestatic 3075	com/tencent/mm/plugin/sns/storage/u:IM	(Ljava/lang/String;)J
    //   600: invokespecial 3077	com/tencent/mm/plugin/sns/model/p:<init>	(J)V
    //   603: iconst_0
    //   604: invokevirtual 3082	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   607: pop
    //   608: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   611: pop
    //   612: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   615: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   618: sipush 210
    //   621: aload_0
    //   622: invokevirtual 3085	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   625: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   628: pop
    //   629: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   632: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   635: sipush 218
    //   638: aload_0
    //   639: invokevirtual 3085	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   642: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   645: pop
    //   646: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   649: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   652: sipush 213
    //   655: aload_0
    //   656: invokevirtual 3085	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   659: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   662: pop
    //   663: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   666: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   669: sipush 682
    //   672: aload_0
    //   673: invokevirtual 3085	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   676: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   679: pop
    //   680: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   683: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   686: sipush 214
    //   689: aload_0
    //   690: invokevirtual 3085	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   693: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   696: pop
    //   697: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   700: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   703: sipush 683
    //   706: aload_0
    //   707: invokevirtual 3085	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   710: aload_0
    //   711: invokestatic 3088	com/tencent/mm/plugin/sns/model/ae:biR	()Lcom/tencent/mm/storage/ar;
    //   714: putfield 500	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYO	Lcom/tencent/mm/storage/ar;
    //   717: aload_0
    //   718: new 3090	com/tencent/mm/plugin/sns/ui/ao
    //   721: dup
    //   722: aload_0
    //   723: invokespecial 3093	com/tencent/mm/plugin/sns/ui/ao:<init>	(Landroid/app/Activity;)V
    //   726: putfield 1264	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pPd	Lcom/tencent/mm/plugin/sns/ui/ao;
    //   729: aload_0
    //   730: new 569	com/tencent/mm/plugin/sns/ui/ar
    //   733: dup
    //   734: aload_0
    //   735: getfield 649	com/tencent/mm/ui/MMActivity:vKB	Lcom/tencent/mm/ui/p;
    //   738: getfield 655	com/tencent/mm/ui/p:vKW	Landroid/support/v7/app/ActionBarActivity;
    //   741: invokespecial 3094	com/tencent/mm/plugin/sns/ui/ar:<init>	(Landroid/content/Context;)V
    //   744: putfield 1369	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYM	Lcom/tencent/mm/plugin/sns/ui/ar;
    //   747: aload_0
    //   748: new 3096	com/tencent/mm/plugin/sns/ui/k
    //   751: dup
    //   752: aload_0
    //   753: iconst_1
    //   754: aload_0
    //   755: getfield 288	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZe	Lcom/tencent/mm/plugin/sns/model/af;
    //   758: invokespecial 3099	com/tencent/mm/plugin/sns/ui/k:<init>	(Landroid/app/Activity;ILcom/tencent/mm/plugin/sns/model/ad;)V
    //   761: putfield 506	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYR	Lcom/tencent/mm/plugin/sns/ui/k;
    //   764: aload_1
    //   765: ifnull +14 -> 779
    //   768: aload_0
    //   769: aload_1
    //   770: invokevirtual 547	com/tencent/mm/plugin/sns/storage/m:blD	()Lcom/tencent/mm/protocal/c/biz;
    //   773: invokestatic 1492	com/tencent/mm/plugin/sns/ui/av:d	(Lcom/tencent/mm/protocal/c/biz;)I
    //   776: putfield 1066	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:jHw	I
    //   779: aload_1
    //   780: ifnull +32 -> 812
    //   783: aload_1
    //   784: bipush 32
    //   786: invokevirtual 797	com/tencent/mm/plugin/sns/storage/m:uX	(I)Z
    //   789: ifeq +23 -> 812
    //   792: aload_0
    //   793: new 2485	com/tencent/mm/plugin/sns/a/b/g
    //   796: dup
    //   797: iconst_2
    //   798: invokespecial 3101	com/tencent/mm/plugin/sns/a/b/g:<init>	(I)V
    //   801: putfield 345	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pQi	Lcom/tencent/mm/plugin/sns/a/b/g;
    //   804: aload_1
    //   805: invokevirtual 547	com/tencent/mm/plugin/sns/storage/m:blD	()Lcom/tencent/mm/protocal/c/biz;
    //   808: invokestatic 1492	com/tencent/mm/plugin/sns/ui/av:d	(Lcom/tencent/mm/protocal/c/biz;)I
    //   811: pop
    //   812: aload_0
    //   813: invokevirtual 3103	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:MP	()V
    //   816: aload_1
    //   817: ifnull +57 -> 874
    //   820: aload_1
    //   821: bipush 32
    //   823: invokevirtual 797	com/tencent/mm/plugin/sns/storage/m:uX	(I)Z
    //   826: ifeq +48 -> 874
    //   829: aload_1
    //   830: invokestatic 805	com/tencent/mm/plugin/sns/model/ai:m	(Lcom/tencent/mm/plugin/sns/storage/m;)Lcom/tencent/mm/protocal/c/bfh;
    //   833: astore 6
    //   835: aload_0
    //   836: getfield 345	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pQi	Lcom/tencent/mm/plugin/sns/a/b/g;
    //   839: iconst_0
    //   840: aload_1
    //   841: invokevirtual 845	com/tencent/mm/plugin/sns/storage/m:blY	()Ljava/lang/String;
    //   844: aload_1
    //   845: invokevirtual 3106	com/tencent/mm/plugin/sns/storage/m:bmh	()Ljava/lang/String;
    //   848: aload_1
    //   849: invokevirtual 3109	com/tencent/mm/plugin/sns/storage/m:blU	()Z
    //   852: aload_0
    //   853: getfield 379	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYy	Landroid/view/View;
    //   856: aload_1
    //   857: getfield 1891	com/tencent/mm/plugin/sns/storage/m:field_snsId	J
    //   860: aload_0
    //   861: getfield 338	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZu	Lcom/tencent/mm/plugin/sns/ui/bf;
    //   864: aload 6
    //   866: aload_0
    //   867: getfield 1066	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:jHw	I
    //   870: iconst_2
    //   871: invokevirtual 3112	com/tencent/mm/plugin/sns/a/b/g:a	(ILjava/lang/String;Ljava/lang/String;ZLandroid/view/View;JLcom/tencent/mm/plugin/sns/ui/bf;Lcom/tencent/mm/protocal/c/bfh;II)V
    //   874: aload_0
    //   875: getfield 379	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYy	Landroid/view/View;
    //   878: ifnull +71 -> 949
    //   881: aload_0
    //   882: getfield 379	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYy	Landroid/view/View;
    //   885: getstatic 2396	com/tencent/mm/plugin/sns/i$f:image	I
    //   888: invokevirtual 390	android/view/View:findViewById	(I)Landroid/view/View;
    //   891: checkcast 2398	com/tencent/mm/plugin/sight/decode/a/a
    //   894: astore 6
    //   896: aload_1
    //   897: invokevirtual 547	com/tencent/mm/plugin/sns/storage/m:blD	()Lcom/tencent/mm/protocal/c/biz;
    //   900: getfield 553	com/tencent/mm/protocal/c/biz:uUc	Lcom/tencent/mm/protocal/c/oa;
    //   903: ifnull +260 -> 1163
    //   906: aload_1
    //   907: invokevirtual 547	com/tencent/mm/plugin/sns/storage/m:blD	()Lcom/tencent/mm/protocal/c/biz;
    //   910: getfield 553	com/tencent/mm/protocal/c/biz:uUc	Lcom/tencent/mm/protocal/c/oa;
    //   913: getfield 558	com/tencent/mm/protocal/c/oa:ueV	I
    //   916: bipush 15
    //   918: if_icmpne +245 -> 1163
    //   921: aload 6
    //   923: instanceof 3114
    //   926: ifeq +237 -> 1163
    //   929: aload 6
    //   931: checkcast 3114	com/tencent/mm/plugin/sight/decode/ui/SightPlayImageView
    //   934: getfield 3118	com/tencent/mm/plugin/sight/decode/ui/SightPlayImageView:oTg	Lcom/tencent/mm/plugin/sight/decode/a/b;
    //   937: invokevirtual 3123	com/tencent/mm/plugin/sight/decode/a/b:bgr	()Z
    //   940: istore 5
    //   942: aload_1
    //   943: iconst_1
    //   944: iload 5
    //   946: invokestatic 3128	com/tencent/mm/plugin/sns/a/b/j:a	(Lcom/tencent/mm/plugin/sns/storage/m;ZZ)V
    //   949: aload_0
    //   950: getfield 952	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYC	Landroid/widget/ListView;
    //   953: ifnonnull +90 -> 1043
    //   956: ldc2_w 2905
    //   959: ldc_w 2907
    //   962: invokestatic 234	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   965: return
    //   966: ldc_w 1033
    //   969: ldc_w 3130
    //   972: invokestatic 1413	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   975: goto -505 -> 470
    //   978: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   981: pop
    //   982: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   985: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   988: new 3071	com/tencent/mm/plugin/sns/model/p
    //   991: dup
    //   992: aload_0
    //   993: getfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   996: invokestatic 3075	com/tencent/mm/plugin/sns/storage/u:IM	(Ljava/lang/String;)J
    //   999: invokespecial 3077	com/tencent/mm/plugin/sns/model/p:<init>	(J)V
    //   1002: iconst_0
    //   1003: invokevirtual 3082	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   1006: pop
    //   1007: goto -399 -> 608
    //   1010: invokestatic 1792	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   1013: pop
    //   1014: invokestatic 3063	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   1017: getfield 3069	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   1020: new 3132	com/tencent/mm/plugin/sns/model/l
    //   1023: dup
    //   1024: aload_0
    //   1025: getfield 786	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:eUg	Ljava/lang/String;
    //   1028: invokestatic 3075	com/tencent/mm/plugin/sns/storage/u:IM	(Ljava/lang/String;)J
    //   1031: iconst_0
    //   1032: invokespecial 3134	com/tencent/mm/plugin/sns/model/l:<init>	(JI)V
    //   1035: iconst_0
    //   1036: invokevirtual 3082	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   1039: pop
    //   1040: goto -432 -> 608
    //   1043: aload_0
    //   1044: getfield 952	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pYC	Landroid/widget/ListView;
    //   1047: new 84	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$4
    //   1050: dup
    //   1051: aload_0
    //   1052: invokespecial 3135	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$4:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsCommentDetailUI;)V
    //   1055: invokevirtual 3136	android/widget/ListView:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   1058: getstatic 2852	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   1061: aload_0
    //   1062: getfield 320	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:ian	Lcom/tencent/mm/sdk/b/c;
    //   1065: invokevirtual 3139	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1068: pop
    //   1069: getstatic 2852	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   1072: aload_0
    //   1073: getfield 293	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZf	Lcom/tencent/mm/sdk/b/c;
    //   1076: invokevirtual 3139	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1079: pop
    //   1080: getstatic 2852	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   1083: aload_0
    //   1084: getfield 296	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZg	Lcom/tencent/mm/sdk/b/c;
    //   1087: invokevirtual 3139	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1090: pop
    //   1091: getstatic 2852	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   1094: aload_0
    //   1095: getfield 299	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZh	Lcom/tencent/mm/sdk/b/c;
    //   1098: invokevirtual 3139	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1101: pop
    //   1102: getstatic 2852	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   1105: aload_0
    //   1106: getfield 302	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZi	Lcom/tencent/mm/sdk/b/c;
    //   1109: invokevirtual 3139	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1112: pop
    //   1113: getstatic 2852	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   1116: aload_0
    //   1117: getfield 317	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZm	Lcom/tencent/mm/sdk/b/c;
    //   1120: invokevirtual 3139	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1123: pop
    //   1124: getstatic 2852	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   1127: aload_0
    //   1128: getfield 323	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:pZn	Lcom/tencent/mm/sdk/b/c;
    //   1131: invokevirtual 3139	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1134: pop
    //   1135: aload_0
    //   1136: invokestatic 3141	com/tencent/mm/pluginsdk/e:h	(Lcom/tencent/mm/ui/MMActivity;)V
    //   1139: ldc2_w 2905
    //   1142: ldc_w 2907
    //   1145: invokestatic 234	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1148: return
    //   1149: astore_1
    //   1150: goto -680 -> 470
    //   1153: astore 6
    //   1155: goto -717 -> 438
    //   1158: astore 7
    //   1160: goto -786 -> 374
    //   1163: iconst_0
    //   1164: istore 5
    //   1166: goto -224 -> 942
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1169	0	this	SnsCommentDetailUI
    //   0	1169	1	paramBundle	android.os.Bundle
    //   252	11	2	i	int
    //   273	189	3	l	long
    //   940	225	5	bool	boolean
    //   296	634	6	localObject	Object
    //   1153	1	6	localIOException	java.io.IOException
    //   1158	1	7	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   298	305	1149	java/io/IOException
    //   429	438	1153	java/io/IOException
    //   365	374	1158	java/lang/Exception
  }
  
  public void onDestroy()
  {
    GMTrace.i(8405653651456L, 62627);
    com.tencent.mm.plugin.sns.model.ae.biT().a(this, 5);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(210, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(218, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(213, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(214, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(683, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(682, this);
    com.tencent.mm.plugin.sns.model.ae.bja().K(this);
    com.tencent.mm.sdk.b.a.vgX.c(this.ian);
    if (this.pYR != null) {
      this.pYR.activity = null;
    }
    ab.bnH();
    if (this.pPb != null) {
      this.pPb.aMT();
    }
    com.tencent.mm.plugin.sns.storage.m localm = ib(false);
    Object localObject;
    if ((this.pQi != null) && (localm != null) && (localm.uX(32)))
    {
      this.pQi.r(0, localm.blY(), localm.bmh());
      localObject = localm.blB();
      if (localObject != null) {
        break label446;
      }
      localObject = "";
      if (!localm.bkj()) {
        break label454;
      }
      com.tencent.mm.plugin.sns.model.ae.biX().i(14652, new Object[] { f.a(localm.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.dt(localm.field_snsId), localObject, Long.valueOf(this.pYw), Long.valueOf(System.currentTimeMillis()) }) });
    }
    for (;;)
    {
      com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.hb(732);
      localb.lu(com.tencent.mm.plugin.sns.data.i.dt(localm.field_snsId)).lu((String)localObject).lu(this.pYw).lu(System.currentTimeMillis());
      localb.LR();
      this.pZa.art();
      com.tencent.mm.sdk.b.a.vgX.c(this.pZf);
      com.tencent.mm.sdk.b.a.vgX.c(this.pZg);
      com.tencent.mm.sdk.b.a.vgX.c(this.pZh);
      com.tencent.mm.sdk.b.a.vgX.c(this.pZi);
      com.tencent.mm.sdk.b.a.vgX.c(this.pZm);
      com.tencent.mm.sdk.b.a.vgX.c(this.pZn);
      super.onDestroy();
      GMTrace.o(8405653651456L, 62627);
      return;
      label446:
      localObject = ((com.tencent.mm.plugin.sns.storage.a)localObject).pyc;
      break;
      label454:
      com.tencent.mm.plugin.sns.model.ae.biX().i(12012, new Object[] { f.a(localm.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.dt(localm.field_snsId), localObject, Long.valueOf(this.pYw), Long.valueOf(System.currentTimeMillis()) }) });
    }
  }
  
  public void onPause()
  {
    GMTrace.i(8405922086912L, 62629);
    com.tencent.mm.plugin.sns.model.ae.biY().b(this);
    super.onPause();
    this.pPb.mQP.onPause();
    new rm().eWo.type = 1;
    if (this.pQi != null) {
      this.pQi.jro = com.tencent.mm.sdk.platformtools.bg.Pw();
    }
    GMTrace.o(8405922086912L, 62629);
  }
  
  public void onResume()
  {
    GMTrace.i(8405787869184L, 62628);
    com.tencent.mm.plugin.sns.model.ae.biY().a(this);
    Object localObject;
    if (this.pPb != null)
    {
      localObject = this.pPb;
      if (u.IO(this.eUg)) {
        break label175;
      }
      if (((SnsCommentFooter)localObject).qac != null) {
        ((SnsCommentFooter)localObject).qac.setEnabled(false);
      }
      if (((SnsCommentFooter)localObject).qab != null) {
        ((SnsCommentFooter)localObject).qab.setEnabled(false);
      }
    }
    for (;;)
    {
      localObject = new rm();
      ((rm)localObject).eWo.eWp = 0;
      ((rm)localObject).eWo.eWq = 1;
      ((rm)localObject).eWo.eWr = 0;
      ((rm)localObject).eWo.type = 0;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      if (this.pQi != null) {
        this.pQi.onResume();
      }
      localObject = ib(false);
      if ((localObject != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject).uX(32)) && (((com.tencent.mm.plugin.sns.storage.m)localObject).bke())) {
        B((com.tencent.mm.plugin.sns.storage.m)localObject);
      }
      super.onResume();
      GMTrace.o(8405787869184L, 62628);
      return;
      label175:
      if (((SnsCommentFooter)localObject).qac != null) {
        ((SnsCommentFooter)localObject).qac.setEnabled(true);
      }
      if (((SnsCommentFooter)localObject).qab != null) {
        ((SnsCommentFooter)localObject).qab.setEnabled(true);
      }
    }
  }
  
  final class a
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    a()
    {
      GMTrace.i(8386460516352L, 62484);
      GMTrace.o(8386460516352L, 62484);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8386594734080L, 62485);
      SnsCommentDetailUI.i(SnsCommentDetailUI.this).qjM.onClick(paramView);
      GMTrace.o(8386594734080L, 62485);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8386728951808L, 62486);
      int i = SnsCommentDetailUI.this.getResources().getColor(i.c.kbk);
      if (this.nfC)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8386728951808L, 62486);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8386728951808L, 62486);
    }
  }
  
  final class b
    extends BaseAdapter
  {
    Activity activity;
    String eEM;
    public LinkedList<bew> pZT;
    LinkedList<bew> pZU;
    
    public b(LinkedList<bew> paramLinkedList, Activity paramActivity, String paramString)
    {
      GMTrace.i(8628455079936L, 64287);
      this.pZT = paramLinkedList;
      this.pZU = paramActivity;
      this.activity = paramString;
      String str;
      this.eEM = str;
      GMTrace.o(8628455079936L, 64287);
    }
    
    public final int getCount()
    {
      int i = 0;
      GMTrace.i(8628589297664L, 64288);
      if (this.pZU.size() > 0)
      {
        if (this.pZT == null) {}
        for (;;)
        {
          GMTrace.o(8628589297664L, 64288);
          return i + 1;
          i = this.pZT.size();
        }
      }
      if (this.pZT == null)
      {
        GMTrace.o(8628589297664L, 64288);
        return 0;
      }
      i = this.pZT.size();
      GMTrace.o(8628589297664L, 64288);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8628723515392L, 64289);
      GMTrace.o(8628723515392L, 64289);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8628857733120L, 64290);
      GMTrace.o(8628857733120L, 64290);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8628991950848L, 64291);
      int j = paramInt;
      if (this.pZU.size() > 0)
      {
        if (paramInt == 0)
        {
          paramView = SnsCommentDetailUI.E(SnsCommentDetailUI.this);
          GMTrace.o(8628991950848L, 64291);
          return paramView;
        }
        j = paramInt - 1;
      }
      bew localbew = (bew)this.pZT.get(j);
      View localView;
      if ((paramView == null) || (!(paramView.getTag() instanceof a)))
      {
        localView = v.fb(this.activity).inflate(i.g.pfC, null);
        localView.setOnTouchListener(SnsCommentDetailUI.F(SnsCommentDetailUI.this));
        paramViewGroup = new a();
        paramViewGroup.hqG = ((ImageView)localView.findViewById(i.f.oZc));
        paramViewGroup.hqG.setOnClickListener(SnsCommentDetailUI.G(SnsCommentDetailUI.this));
        paramViewGroup.nNR = ((TextView)localView.findViewById(i.f.oZl));
        paramViewGroup.nNR.setOnTouchListener(new ab());
        paramViewGroup.nNR.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8371293913088L, 62371);
            w.i("MicroMsg.SnsCommentDetailUI", "onClick nickTv");
            GMTrace.o(8371293913088L, 62371);
          }
        });
        paramViewGroup.kHx = ((TextView)localView.findViewById(i.f.oZo));
        paramViewGroup.hvO = ((TextView)localView.findViewById(i.f.oZf));
        paramViewGroup.pZW = ((SnsTranslateResultView)localView.findViewById(i.f.peg));
        paramViewGroup.pZW.setVisibility(8);
        if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) != 11) {
          break label1553;
        }
        localView.findViewById(i.f.pai).setBackgroundResource(i.e.oXD);
      }
      label296:
      label311:
      label373:
      label432:
      label466:
      label557:
      label813:
      label890:
      label984:
      label1173:
      label1179:
      label1190:
      label1224:
      label1251:
      label1277:
      label1283:
      label1454:
      label1464:
      label1476:
      label1487:
      label1499:
      label1535:
      label1553:
      for (;;)
      {
        paramViewGroup.pZY = localbew;
        paramViewGroup.userName = localbew.tRz;
        int k;
        int m;
        com.tencent.mm.plugin.sns.storage.m localm;
        Object localObject2;
        Object localObject1;
        Object localObject3;
        int i;
        if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
        {
          k = 3;
          if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) != 11) {
            break label1173;
          }
          m = 3;
          com.tencent.mm.kernel.h.xz();
          paramView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(paramViewGroup.userName);
          if ((j != 0) || (!this.pZU.isEmpty())) {
            break label1190;
          }
          if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) != 11) {
            break label1179;
          }
          localView.setBackgroundResource(i.e.oXE);
          if (j != 0) {
            break label1224;
          }
          localView.findViewById(i.f.pcK).setVisibility(0);
          localView.findViewById(i.f.pcL).setVisibility(8);
          if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11) {
            ((ImageView)localView.findViewById(i.f.pcK)).setImageResource(i.i.phi);
          }
          a.b.b(paramViewGroup.hqG, localbew.tRz, true);
          paramViewGroup.hqG.setTag(localbew.tRz);
          if (paramView == null) {
            break label1251;
          }
          paramView = paramView.vk();
          localm = com.tencent.mm.plugin.sns.storage.h.Ir(SnsCommentDetailUI.n(SnsCommentDetailUI.this));
          paramViewGroup.hvO.setText(localbew.nIp + " ");
          localObject2 = paramViewGroup.hvO.getText().toString();
          if (localm == null) {
            break label1277;
          }
          com.tencent.mm.kernel.h.xz();
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(localm.field_userName);
          if (localbew.uQr != 1) {
            break label1283;
          }
          if (localObject1 == null) {
            break label1535;
          }
          localObject3 = ((x)localObject1).vk();
          paramInt = SnsCommentDetailUI.this.getString(i.j.piE).length();
          localObject1 = SnsCommentDetailUI.this.getString(i.j.piE) + (String)localObject3 + SnsCommentDetailUI.this.getString(i.j.piC) + (String)localObject2;
          i = 0;
          localObject2 = localObject3;
          localObject3 = null;
        }
        for (;;)
        {
          paramViewGroup.nNR.setText(paramView, TextView.BufferType.SPANNABLE);
          com.tencent.mm.pluginsdk.ui.d.h.e(paramViewGroup.nNR, k);
          Object localObject4 = new com.tencent.mm.pluginsdk.ui.d.i(paramViewGroup.nNR.getText());
          ((com.tencent.mm.pluginsdk.ui.d.i)localObject4).a(new com.tencent.mm.pluginsdk.ui.d.m(localbew.tRz, SnsCommentDetailUI.I(SnsCommentDetailUI.this), k), paramView, 0, 33);
          paramViewGroup.nNR.setText((CharSequence)localObject4, TextView.BufferType.SPANNABLE);
          paramViewGroup.kHx.setText(az.k(this.activity, localbew.nFd * 1000L));
          localObject1 = new com.tencent.mm.pluginsdk.ui.d.i((String)localObject1);
          long l;
          if (localObject2 != null)
          {
            ((com.tencent.mm.pluginsdk.ui.d.i)localObject1).a(new com.tencent.mm.pluginsdk.ui.d.m(localm.field_userName, SnsCommentDetailUI.I(SnsCommentDetailUI.this), m), (CharSequence)localObject2, paramInt, 33);
            paramViewGroup.hvO.setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
            paramViewGroup.hvO.setVisibility(0);
            com.tencent.mm.pluginsdk.ui.d.h.e(paramViewGroup.hvO, 2);
            SnsCommentDetailUI.J(SnsCommentDetailUI.this).a(localView, SnsCommentDetailUI.x(SnsCommentDetailUI.this).qmI, SnsCommentDetailUI.x(SnsCommentDetailUI.this).qmv);
            if (localbew.uQm == 0) {
              break label1454;
            }
            l = localbew.uQm;
            localObject1 = com.tencent.mm.plugin.sns.model.ao.dF(SnsCommentDetailUI.n(SnsCommentDetailUI.this), String.valueOf(l));
            if ((com.tencent.mm.plugin.sns.model.ao.bP((String)localObject1, 4)) && (paramViewGroup.pZW != null))
            {
              localObject1 = com.tencent.mm.plugin.sns.model.ao.HA((String)localObject1);
              if (localObject1 == null) {
                break label1487;
              }
              paramViewGroup.pZW.setVisibility(0);
              if (!((ao.b)localObject1).gpJ) {
                break label1476;
              }
              if (((ao.b)localObject1).gsF) {
                break label1464;
              }
              paramViewGroup.pZW.a((ao.b)localObject1, 2, ((ao.b)localObject1).result, ((ao.b)localObject1).gxw, ((ao.b)localObject1).pvT);
            }
            localView.setClickable(true);
            w.d("MicroMsg.SnsCommentDetailUI", "position " + localbew.tRz + " self " + SnsCommentDetailUI.K(SnsCommentDetailUI.this) + " commentid " + localbew.uQm + " snsid " + SnsCommentDetailUI.n(SnsCommentDetailUI.this));
            if (!SnsCommentDetailUI.K(SnsCommentDetailUI.this).equals(localbew.tRz)) {
              break label1499;
            }
          }
          for (paramViewGroup.pZX = localbew;; paramViewGroup.pZX = new Object[] { Integer.valueOf(j), localbew, localbew.tRz, paramView })
          {
            paramView = new m(SnsCommentDetailUI.n(SnsCommentDetailUI.this), localbew, localbew.tRz, localbew.nIp, paramViewGroup.hvO, 2);
            paramView.tag = paramViewGroup;
            localView.setTag(paramView);
            localView.setOnClickListener(SnsCommentDetailUI.L(SnsCommentDetailUI.this));
            GMTrace.o(8628991950848L, 64291);
            return localView;
            paramViewGroup = (a)paramView.getTag();
            localView = paramView;
            break;
            k = 2;
            break label296;
            m = 2;
            break label311;
            localView.setBackgroundResource(i.e.oYp);
            break label373;
            if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
            {
              localView.setBackgroundResource(i.e.oYr);
              break label373;
            }
            localView.setBackgroundResource(i.e.oYq);
            break label373;
            localView.findViewById(i.f.pcK).setVisibility(4);
            localView.findViewById(i.f.pcL).setVisibility(0);
            break label432;
            if (localbew.uBf != null)
            {
              paramView = localbew.uBf;
              break label466;
            }
            paramView = localbew.tRz;
            break label466;
            localObject1 = null;
            break label557;
            if (com.tencent.mm.sdk.platformtools.bg.nm(localbew.uQG)) {
              break label1535;
            }
            localObject1 = SnsCommentDetailUI.H(SnsCommentDetailUI.this).TE(localbew.uQG);
            if (localObject1 == null) {}
            for (localObject1 = localbew.uQG;; localObject1 = ((x)localObject1).vk())
            {
              i = SnsCommentDetailUI.this.getString(i.j.pku).length();
              localObject4 = SnsCommentDetailUI.this.getString(i.j.pku) + (String)localObject1 + SnsCommentDetailUI.this.getString(i.j.piC) + (String)localObject2;
              paramInt = 0;
              localObject2 = null;
              localObject3 = localObject1;
              localObject1 = localObject4;
              break;
            }
            if (localObject3 == null) {
              break label813;
            }
            ((com.tencent.mm.pluginsdk.ui.d.i)localObject1).a(new com.tencent.mm.pluginsdk.ui.d.m(localbew.uQG, SnsCommentDetailUI.I(SnsCommentDetailUI.this), m), (CharSequence)localObject3, i, 33);
            break label813;
            l = localbew.uQp;
            break label890;
            paramViewGroup.pZW.setVisibility(8);
            break label984;
            paramViewGroup.pZW.vA(2);
            break label984;
            paramViewGroup.pZW.setVisibility(8);
            break label984;
          }
          localObject1 = localObject2;
          paramInt = 0;
          i = 0;
          localObject2 = null;
          localObject3 = null;
        }
      }
    }
    
    final class a
    {
      ImageView hqG;
      TextView hvO;
      TextView kHx;
      TextView nNR;
      SnsTranslateResultView pZW;
      Object pZX;
      bew pZY;
      String userName;
      
      a()
      {
        GMTrace.i(8323512401920L, 62015);
        GMTrace.o(8323512401920L, 62015);
      }
    }
  }
  
  final class c
    implements Runnable
  {
    int CC;
    int jJp;
    private int offset;
    private int pZZ;
    private int qaa;
    
    c()
    {
      GMTrace.i(8600806227968L, 64081);
      this.pZZ = -1;
      this.qaa = 10;
      this.offset = 0;
      this.CC = -1;
      GMTrace.o(8600806227968L, 64081);
    }
    
    public final void run()
    {
      GMTrace.i(8600940445696L, 64082);
      this.qaa = 10;
      SnsCommentDetailUI.a(SnsCommentDetailUI.this);
      this.pZZ = SnsCommentDetailUI.b(SnsCommentDetailUI.this).getTop();
      int i = this.pZZ - this.jJp;
      w.i("MicroMsg.SnsCommentDetailUI", "list.bottom: %d, listOriginalBottom: %d, footerTop: %d, commentFooter.getTop: %d, topSelection: %d", new Object[] { Integer.valueOf(SnsCommentDetailUI.c(SnsCommentDetailUI.this).getBottom()), Integer.valueOf(SnsCommentDetailUI.d(SnsCommentDetailUI.this)), Integer.valueOf(this.pZZ), Integer.valueOf(SnsCommentDetailUI.b(SnsCommentDetailUI.this).getTop()), Integer.valueOf(i) });
      if (i == this.offset)
      {
        SnsCommentDetailUI.c(SnsCommentDetailUI.this).setSelectionFromTop(SnsCommentDetailUI.c(SnsCommentDetailUI.this).getHeaderViewsCount() + this.CC, i);
        this.qaa = 0;
        this.offset = 0;
        GMTrace.o(8600940445696L, 64082);
        return;
      }
      int j = this.qaa;
      this.qaa = (j - 1);
      if (j > 0)
      {
        new com.tencent.mm.sdk.platformtools.ae().postDelayed(this, 100L);
        this.offset = i;
        GMTrace.o(8600940445696L, 64082);
        return;
      }
      this.offset = 0;
      this.qaa = 0;
      GMTrace.o(8600940445696L, 64082);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsCommentDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */