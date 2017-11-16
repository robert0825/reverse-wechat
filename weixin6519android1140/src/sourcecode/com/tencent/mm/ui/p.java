package com.tencent.mm.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.support.v4.view.m;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ai;
import com.tencent.mm.g.a.ai.b;
import com.tencent.mm.g.a.rl;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.f.c.b;
import com.tencent.mm.ui.widget.e;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.j;
import com.tencent.mm.v.a.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public abstract class p
{
  private static boolean vLa;
  public static final int vLm;
  private static PowerManager.WakeLock wakeLock;
  private static byte[] yvJ;
  public ActionBar FM;
  String className;
  public AudioManager hdu;
  public View hqF;
  private com.tencent.mm.ui.tools.p jQL;
  private int lDA;
  private LayoutInflater lVD;
  public Context mContext;
  protected ae ohR;
  private final long pPS;
  public long pPT;
  protected boolean vKA;
  private View vKH;
  public View vKI;
  public View vKJ;
  public TextView vKK;
  public FrameLayout vKL;
  public boolean vKM;
  String vKN;
  int vKO;
  int vKP;
  e vKQ;
  e vKR;
  private e vKS;
  private e vKT;
  private boolean vKU;
  boolean vKV;
  public ActionBarActivity vKW;
  private boolean vKX;
  private a vKY;
  public LinkedList<a> vKZ;
  ArrayList<Dialog> vLb;
  public View vLc;
  public TextView vLd;
  View vLe;
  public ImageView vLf;
  View vLg;
  private TextView vLh;
  public int vLi;
  private boolean vLj;
  private c vLk;
  private int vLl;
  private int vLn;
  public int vLo;
  private a vLp;
  private MenuItem vLq;
  private Runnable vLr;
  private Runnable vLs;
  
  static
  {
    GMTrace.i(2550136832000L, 19000);
    vLa = false;
    vLm = a.h.geJ;
    wakeLock = null;
    yvJ = new byte[] { 0 };
    GMTrace.o(2550136832000L, 19000);
  }
  
  public p()
  {
    GMTrace.i(2539533631488L, 18921);
    this.vKM = true;
    this.vKN = " ";
    this.vKO = 0;
    this.vKP = 0;
    this.vKQ = null;
    this.vKR = null;
    this.vKS = null;
    this.vKT = null;
    this.vKU = false;
    this.vKV = false;
    this.lDA = 0;
    this.vKA = false;
    this.ohR = new ae(Looper.getMainLooper());
    this.vKY = new a();
    this.vKZ = new LinkedList();
    this.vLi = 0;
    this.vLj = false;
    this.vLk = new c() {};
    this.vLl = a.h.geI;
    this.vLn = -1;
    this.vLo = 0;
    this.vLr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3063251206144L, 22823);
        p.this.vKW.getWindow().setFlags(1024, 1024);
        if (p.this.FM != null) {
          p.this.FM.hide();
        }
        GMTrace.o(3063251206144L, 22823);
      }
    };
    this.vLs = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1597996269568L, 11906);
        if (p.this.FM != null) {
          p.this.FM.show();
        }
        GMTrace.o(1597996269568L, 11906);
      }
    };
    this.pPS = 300L;
    this.pPT = SystemClock.elapsedRealtime();
    GMTrace.o(2539533631488L, 18921);
  }
  
  public static void bXn()
  {
    GMTrace.i(2542486421504L, 18943);
    vLa = true;
    GMTrace.o(2542486421504L, 18943);
  }
  
  public static boolean bXz()
  {
    GMTrace.i(21007758786560L, 156520);
    synchronized (yvJ)
    {
      if (wakeLock != null)
      {
        bool = wakeLock.isHeld();
        GMTrace.o(21007758786560L, 156520);
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public static Locale eJ(Context paramContext)
  {
    GMTrace.i(2540070502400L, 18925);
    Object localObject = com.tencent.mm.sdk.platformtools.v.d(paramContext.getSharedPreferences(ab.bPU(), 0));
    Resources localResources = ab.getResources();
    if (((String)localObject).equals("language_default"))
    {
      com.tencent.mm.sdk.platformtools.v.a(paramContext, Locale.ENGLISH);
      if ((localResources instanceof com.tencent.mm.bs.a)) {
        ((com.tencent.mm.bs.a)localResources).bOB();
      }
      paramContext = Locale.getDefault();
      GMTrace.o(2540070502400L, 18925);
      return paramContext;
    }
    localObject = com.tencent.mm.sdk.platformtools.v.RN((String)localObject);
    com.tencent.mm.sdk.platformtools.v.a(paramContext, (Locale)localObject);
    if ((localResources instanceof com.tencent.mm.bs.a)) {
      ((com.tencent.mm.bs.a)localResources).bOB();
    }
    GMTrace.o(2540070502400L, 18925);
    return (Locale)localObject;
  }
  
  private View findViewById(int paramInt)
  {
    GMTrace.i(2539802066944L, 18923);
    View localView = this.hqF.findViewById(paramInt);
    if (localView != null)
    {
      GMTrace.o(2539802066944L, 18923);
      return localView;
    }
    localView = this.vKW.findViewById(paramInt);
    GMTrace.o(2539802066944L, 18923);
    return localView;
  }
  
  private void li(boolean paramBoolean)
  {
    GMTrace.i(2542352203776L, 18942);
    if ((!vLa) && (paramBoolean))
    {
      com.tencent.mm.ui.base.ac.a(paramBoolean, new Intent().putExtra("classname", getClassName()).putExtra("main_process", false));
      GMTrace.o(2542352203776L, 18942);
      return;
    }
    com.tencent.mm.ui.base.ac.a(paramBoolean, new Intent().putExtra("classname", getClassName() + aJX()));
    GMTrace.o(2542352203776L, 18942);
  }
  
  public final void AW(int paramInt)
  {
    GMTrace.i(2544902340608L, 18961);
    if (this.FM == null)
    {
      GMTrace.o(2544902340608L, 18961);
      return;
    }
    this.vLh.setText(this.mContext.getString(paramInt));
    if (com.tencent.mm.br.a.ed(this.vKW))
    {
      this.vLh.setTextSize(1, 14.0F);
      this.vLd.setTextSize(1, 18.0F);
    }
    this.vLh.setVisibility(0);
    Vf(this.mContext.getString(paramInt));
    GMTrace.o(2544902340608L, 18961);
  }
  
  public final boolean AZ(int paramInt)
  {
    GMTrace.i(2547049824256L, 18977);
    int i = 0;
    while (i < this.vKZ.size())
    {
      if (((a)this.vKZ.get(i)).vLz == paramInt)
      {
        w.d("MicroMsg.MMActivityController", "match menu, id %d, remove it", new Object[] { Integer.valueOf(paramInt) });
        this.vKZ.remove(i);
        aQ();
        GMTrace.o(2547049824256L, 18977);
        return true;
      }
      i += 1;
    }
    GMTrace.o(2547049824256L, 18977);
    return false;
  }
  
  public final void Ba(int paramInt)
  {
    GMTrace.i(2547586695168L, 18981);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.vKU = bool;
      bXC();
      GMTrace.o(2547586695168L, 18981);
      return;
    }
  }
  
  public final boolean Bc(int paramInt)
  {
    GMTrace.i(2546915606528L, 18976);
    int i = 0;
    while (i < this.vKZ.size())
    {
      if (((a)this.vKZ.get(i)).vLz == paramInt)
      {
        w.d("MicroMsg.MMActivityController", "match menu, id %d, remove it", new Object[] { Integer.valueOf(paramInt) });
        this.vKZ.remove(i);
        GMTrace.o(2546915606528L, 18976);
        return true;
      }
      i += 1;
    }
    GMTrace.o(2546915606528L, 18976);
    return false;
  }
  
  public final a Bd(int paramInt)
  {
    GMTrace.i(2547318259712L, 18979);
    Iterator localIterator = this.vKZ.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.vLz == paramInt)
      {
        GMTrace.o(2547318259712L, 18979);
        return locala;
      }
    }
    GMTrace.o(2547318259712L, 18979);
    return null;
  }
  
  public final void N(CharSequence paramCharSequence)
  {
    GMTrace.i(2544365469696L, 18957);
    if (this.FM == null)
    {
      GMTrace.o(2544365469696L, 18957);
      return;
    }
    this.vKN = paramCharSequence.toString();
    this.vLd.setText(paramCharSequence);
    if (com.tencent.mm.br.a.ed(this.vKW)) {
      this.vLd.setTextSize(0, com.tencent.mm.br.a.W(this.vKW, a.e.aPt) * com.tencent.mm.br.a.eb(this.vKW));
    }
    Vf(paramCharSequence.toString());
    GMTrace.o(2544365469696L, 18957);
  }
  
  final void U(Activity paramActivity)
  {
    GMTrace.i(2540741591040L, 18930);
    if ((this.FM != null) && (!aaS()))
    {
      if (Build.VERSION.SDK_INT < 11) {
        this.FM.setBackgroundDrawable(new ColorDrawable(this.mContext.getResources().getColor(a.d.aMD)));
      }
      w.d("MicroMsg.MMActivityController", "onCreate, after");
      this.FM.setLogo(new ColorDrawable(this.vKW.getResources().getColor(17170445)));
      this.FM.cJ();
      this.FM.setDisplayHomeAsUpEnabled(false);
      this.FM.cI();
      this.FM.cK();
      this.FM.setIcon(a.f.bbj);
      if (this.vLn == -1) {
        this.FM.setCustomView(v.fb(this.vKW).inflate(this.vLl, new LinearLayout(this.vKW), false));
      }
      for (;;)
      {
        this.vLd = ((TextView)findViewById(16908308));
        this.vLh = ((TextView)findViewById(16908309));
        this.vLc = findViewById(a.g.divider);
        this.vLe = findViewById(a.g.bcL);
        this.vLf = ((ImageView)findViewById(a.g.bcM));
        if (this.vLf != null) {
          this.vLf.setContentDescription(this.vKW.getString(a.k.cRO));
        }
        this.vLg = findViewById(a.g.gcR);
        if (this.vLd != null) {
          this.vLd.setText(a.k.app_name);
        }
        if (paramActivity.getClass().getName() != "WebViewUI") {
          break;
        }
        if (this.vLg != null) {
          this.vLg.setVisibility(8);
        }
        if (this.vLf != null) {
          this.vLf.setVisibility(0);
        }
        if (this.vLe == null) {
          break label520;
        }
        this.vLe.setVisibility(0);
        GMTrace.o(2540741591040L, 18930);
        return;
        this.FM.setCustomView(v.fb(this.vKW).inflate(this.vLn, new LinearLayout(this.vKW), false));
      }
      if ((paramActivity instanceof MMActivity))
      {
        if (this.vLg != null) {
          this.vLg.setVisibility(8);
        }
        if (this.vLf != null) {
          this.vLf.setVisibility(0);
        }
        if (this.vLe != null) {
          this.vLe.setVisibility(0);
        }
        if (this.vLd != null)
        {
          this.vLd.setVisibility(0);
          GMTrace.o(2540741591040L, 18930);
        }
      }
      else
      {
        if (this.vLg != null) {
          this.vLg.setVisibility(0);
        }
        if (this.vLf != null) {
          this.vLf.setVisibility(8);
        }
        if (this.vLe != null) {
          this.vLe.setVisibility(8);
        }
      }
    }
    label520:
    GMTrace.o(2540741591040L, 18930);
  }
  
  protected abstract void VC();
  
  public final void Ve(String paramString)
  {
    GMTrace.i(2544768122880L, 18960);
    if (this.FM == null)
    {
      GMTrace.o(2544768122880L, 18960);
      return;
    }
    if (paramString == null)
    {
      this.vLh.setVisibility(8);
      GMTrace.o(2544768122880L, 18960);
      return;
    }
    this.vLh.setText(paramString);
    if (com.tencent.mm.br.a.ed(this.vKW))
    {
      this.vLh.setTextSize(1, 14.0F);
      this.vLd.setTextSize(1, 18.0F);
    }
    this.vLh.setVisibility(0);
    Vf(paramString);
    GMTrace.o(2544768122880L, 18960);
  }
  
  protected final void Vf(String paramString)
  {
    GMTrace.i(2544499687424L, 18958);
    com.tencent.mm.ui.a.a locala = a.a.vOX;
    ActionBarActivity localActionBarActivity = this.vKW;
    if (!locala.bYo())
    {
      if ((bg.nm(paramString)) || (localActionBarActivity == null))
      {
        GMTrace.o(2544499687424L, 18958);
        return;
      }
      paramString = localActionBarActivity.getString(a.k.ggj) + paramString;
      localActionBarActivity.getWindow().getDecorView().setContentDescription(paramString);
    }
    GMTrace.o(2544499687424L, 18958);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2546512953344L, 18973);
    a(paramInt1, paramInt3, this.mContext.getString(paramInt2), paramOnMenuItemClickListener, null, b.vLF);
    GMTrace.o(2546512953344L, 18973);
  }
  
  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2546244517888L, 18971);
    a(paramInt1, paramInt2, "", paramOnMenuItemClickListener, null, b.vLF);
    GMTrace.o(2546244517888L, 18971);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, int paramInt3)
  {
    GMTrace.i(2547184041984L, 18978);
    a locala = new a();
    locala.vLz = paramInt1;
    locala.vLA = paramInt2;
    locala.text = paramString;
    locala.orU = paramOnMenuItemClickListener;
    locala.lit = paramOnLongClickListener;
    locala.vLE = paramInt3;
    if ((locala.vLA == a.f.aXV) && (bg.nm(paramString))) {
      locala.text = this.mContext.getString(a.k.ggi);
    }
    Bc(locala.vLz);
    this.vKZ.add(locala);
    aQ();
    GMTrace.o(2547184041984L, 18978);
  }
  
  public final void a(int paramInt, String paramString, Drawable paramDrawable, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2546378735616L, 18972);
    int i = b.vLF;
    a locala = new a();
    locala.vLz = paramInt;
    locala.vLB = paramDrawable;
    locala.text = paramString;
    locala.orU = paramOnMenuItemClickListener;
    locala.lit = null;
    locala.vLE = i;
    Bc(locala.vLz);
    this.vKZ.add(locala);
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2536849276928L, 18901);
        p.this.aQ();
        GMTrace.o(2536849276928L, 18901);
      }
    }, 200L);
    GMTrace.o(2546378735616L, 18972);
  }
  
  public final void a(int paramInt1, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, int paramInt2)
  {
    GMTrace.i(2546110300160L, 18970);
    a(paramInt1, 0, paramString, paramOnMenuItemClickListener, null, paramInt2);
    GMTrace.o(2546110300160L, 18970);
  }
  
  public final void a(int paramInt1, final boolean paramBoolean1, final String paramString1, final String paramString2, final String paramString3, final int paramInt2, boolean paramBoolean2)
  {
    GMTrace.i(2539667849216L, 18922);
    w.i("MicroMsg.MMActivityController", "initNotifyView viewid[%d], visible[%b], uithread[%b], noticeid[%s], position[%d], notifyView[%s]", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramString3, Integer.valueOf(paramInt2), this.vKJ });
    if (!bEh())
    {
      GMTrace.o(2539667849216L, 18922);
      return;
    }
    if ((!paramBoolean1) && (this.vKJ == null))
    {
      GMTrace.o(2539667849216L, 18922);
      return;
    }
    if ((this.FM != null) && (!this.FM.isShowing()))
    {
      w.i("MicroMsg.MMActivityController", "initNotifyView mActionBar not showing");
      GMTrace.o(2539667849216L, 18922);
      return;
    }
    if (this.vKL == null) {
      this.vKL = ((FrameLayout)this.hqF.findViewById(a.g.bNr));
    }
    if (this.vKJ != null) {
      this.vKL.removeView(this.vKJ);
    }
    int i = a.h.cCp;
    if (paramInt1 > 0) {}
    for (;;)
    {
      this.vKJ = this.lVD.inflate(paramInt1, null);
      this.vKK = ((TextView)this.vKJ.findViewById(a.g.bSa));
      this.vKJ.findViewById(a.g.gdI).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2530675261440L, 18855);
          paramAnonymousView = new ai();
          paramAnonymousView.eBo.type = 1;
          paramAnonymousView.eBo.eBq = paramString3;
          paramAnonymousView.eBo.position = paramInt2;
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
          p.this.vKJ.setVisibility(8);
          GMTrace.o(2530675261440L, 18855);
        }
      });
      this.vKJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3467112349696L, 25832);
          if (paramString1 != null)
          {
            paramAnonymousView = new Intent("android.intent.action.VIEW");
            paramAnonymousView.setData(Uri.parse(paramString1));
            p.this.mContext.startActivity(paramAnonymousView);
          }
          GMTrace.o(3467112349696L, 25832);
        }
      });
      paramString3 = new FrameLayout.LayoutParams(-1, -2);
      if ((this.vLj) && (Build.VERSION.SDK_INT >= 16))
      {
        paramString3.setMargins(0, BackwardSupportUtil.b.a(this.vKW, 48.0F), 0, 0);
        w.i("MicroMsg.MMActivityController", "summerdiz initNotifyView [%d, %d]", new Object[] { Integer.valueOf(paramString3.height), Integer.valueOf(paramString3.topMargin) });
      }
      this.vKL.addView(this.vKJ, this.vKL.getChildCount(), paramString3);
      if (this.vKJ != null)
      {
        if (paramBoolean2)
        {
          paramString3 = this.vKJ;
          if (paramBoolean1)
          {
            paramInt1 = 0;
            paramString3.setVisibility(paramInt1);
            String str = this.mContext.getString(a.k.ggm);
            paramString3 = paramString2;
            if (bg.nm(paramString2)) {
              paramString3 = this.mContext.getString(a.k.dmY);
            }
            if (paramString1 == null) {
              break label539;
            }
            paramString1 = new SpannableString(paramString3 + str);
            paramString2 = new ForegroundColorSpan(-10119449);
            paramInt1 = paramString3.length();
            paramInt2 = paramString3.length();
            paramString1.setSpan(paramString2, paramInt1, str.length() + paramInt2, 33);
            this.vKK.setText(paramString1);
          }
          for (;;)
          {
            this.vKJ.invalidate();
            this.vKL.invalidate();
            GMTrace.o(2539667849216L, 18922);
            return;
            paramInt1 = 8;
            break;
            label539:
            w.i("MicroMsg.MMActivityController", "summerdiz url is null 1");
            this.vKK.setText(paramString3);
          }
        }
        this.vKJ.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3470467792896L, 25857);
            Object localObject = p.this.vKJ;
            int i;
            if (paramBoolean1)
            {
              i = 0;
              ((View)localObject).setVisibility(i);
              String str = p.this.mContext.getString(a.k.ggm);
              if (!bg.nm(paramString2)) {
                break label180;
              }
              localObject = p.this.mContext.getString(a.k.dmY);
              label69:
              if (paramString1 == null) {
                break label188;
              }
              SpannableString localSpannableString = new SpannableString((String)localObject + str);
              localSpannableString.setSpan(new ForegroundColorSpan(-10119449), ((String)localObject).length(), ((String)localObject).length() + str.length(), 33);
              p.this.vKK.setText(localSpannableString);
            }
            for (;;)
            {
              p.this.vKJ.invalidate();
              p.this.vKL.invalidate();
              GMTrace.o(3470467792896L, 25857);
              return;
              i = 8;
              break;
              label180:
              localObject = paramString2;
              break label69;
              label188:
              w.i("MicroMsg.MMActivityController", "summerdiz url is null 2");
              p.this.vKK.setText((CharSequence)localObject);
            }
          }
        });
      }
      GMTrace.o(2539667849216L, 18922);
      return;
      paramInt1 = i;
    }
  }
  
  public final void a(Context paramContext, ActionBarActivity paramActionBarActivity)
  {
    GMTrace.i(2540473155584L, 18928);
    this.mContext = paramActionBarActivity;
    this.vKW = paramActionBarActivity;
    VC();
    this.className = getClass().getName();
    ac.aI(3, this.className);
    eJ(paramContext);
    this.hdu = ((AudioManager)this.mContext.getSystemService("audio"));
    int i = getLayoutId();
    this.lVD = LayoutInflater.from(this.mContext);
    this.hqF = this.lVD.inflate(a.h.geY, null);
    this.vKH = this.hqF.findViewById(a.g.gdD);
    this.vKL = ((FrameLayout)this.hqF.findViewById(a.g.bNr));
    this.lDA = this.mContext.getResources().getDimensionPixelSize(a.e.gcA);
    label313:
    label410:
    long l;
    String str;
    if (i != -1)
    {
      this.vKI = bXo();
      if (this.vKI == null)
      {
        this.vKI = this.lVD.inflate(getLayoutId(), null);
        this.vKL.addView(this.vKI, 0);
      }
    }
    else
    {
      bH(this.hqF);
      if (bXl())
      {
        ad.d(ad.a(this.vKW.getWindow(), this.vKI), this.vKI);
        ((ViewGroup)this.vKI.getParent()).removeView(this.vKI);
        ((ViewGroup)this.vKW.getWindow().getDecorView()).addView(this.vKI, 0);
        int j = com.tencent.mm.br.a.fromDPToPix(this.mContext, 25);
        paramContext = this.mContext.getResources().getDisplayMetrics();
        if (paramContext.widthPixels <= paramContext.heightPixels) {
          break label660;
        }
        i = this.mContext.getResources().getDimensionPixelSize(a.e.aPM);
        this.vKI.setPadding(this.vKI.getPaddingLeft(), i + (j + this.vKI.getPaddingTop()), this.vKI.getPaddingRight(), this.vKI.getPaddingBottom());
      }
      this.FM = cO();
      w.d("MicroMsg.MMActivityController", "onCreate, before.");
      U(paramActionBarActivity);
      if ((this.vKL == null) || (!(this.vKL instanceof LayoutListenerView))) {
        break label677;
      }
      ((LayoutListenerView)this.vKL).vKj = new LayoutListenerView.a()
      {
        private final int vLw;
        
        public final void onSizeChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          GMTrace.i(3089021009920L, 23015);
          if ((p.this.vKW.getWindow().getAttributes().flags & 0x400) != 0) {}
          for (int i = 1; i != 0; i = 0)
          {
            GMTrace.o(3089021009920L, 23015);
            return;
          }
          if ((paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && (paramAnonymousInt3 != 0) && (paramAnonymousInt4 != 0) && (paramAnonymousInt1 == paramAnonymousInt3))
          {
            p localp;
            if ((paramAnonymousInt2 > paramAnonymousInt4) && (paramAnonymousInt2 - paramAnonymousInt4 > this.vLw))
            {
              localp = p.this;
              localp.vLo = 2;
              localp.aoK();
              GMTrace.o(3089021009920L, 23015);
              return;
            }
            if ((paramAnonymousInt4 > paramAnonymousInt2) && (paramAnonymousInt4 - paramAnonymousInt2 > this.vLw))
            {
              localp = p.this;
              localp.vLo = 1;
              localp.aoK();
            }
          }
          GMTrace.o(3089021009920L, 23015);
        }
      };
      paramContext = new ai();
      paramContext.eBo.type = 2;
      paramContext.eBo.position = this.vLi;
      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
      if (paramContext.eBp.eBs == 2)
      {
        l = System.currentTimeMillis();
        str = paramContext.eBp.eBv;
        i = paramContext.eBp.position;
        w.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position[%d], noticeId[%s] stack[%s]", new Object[] { Integer.valueOf(i), str, bg.bQW() });
        if ((i <= 0) || (i == this.vLi)) {
          break label689;
        }
        w.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position not match[%d, %d] ignore display", new Object[] { Integer.valueOf(i), Integer.valueOf(this.vLi) });
      }
    }
    for (;;)
    {
      w.v("MicroMsg.INIT", "KEVIN MMActivity onCreate initNotifyView:" + (System.currentTimeMillis() - l));
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramContext = paramActionBarActivity.getWindow();
        paramContext.clearFlags(201326592);
        paramContext.addFlags(Integer.MIN_VALUE);
        paramContext.setStatusBarColor(paramActionBarActivity.getResources().getColor(a.d.aPb));
      }
      GMTrace.o(2540473155584L, 18928);
      return;
      if (this.vKI.getParent() == null) {
        break;
      }
      ((ViewGroup)this.vKI.getParent()).removeView(this.vKI);
      break;
      label660:
      i = this.mContext.getResources().getDimensionPixelSize(a.e.aPN);
      break label313;
      label677:
      w.w("MicroMsg.MMActivityController", "layoutListenerView is not right");
      break label410;
      label689:
      a(paramContext.eBp.eBu, paramContext.eBp.visible, paramContext.eBp.url, paramContext.eBp.desc, str, i, true);
    }
  }
  
  public final void a(final MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    GMTrace.i(2546647171072L, 18974);
    if (this.FM == null)
    {
      GMTrace.o(2546647171072L, 18974);
      return;
    }
    if (paramOnMenuItemClickListener == null) {
      this.FM.setDisplayHomeAsUpEnabled(false);
    }
    for (;;)
    {
      if ((this.vLf != null) && (paramInt != 0)) {
        this.vLf.setImageResource(paramInt);
      }
      this.vKY.vLz = 16908332;
      this.vKY.orU = paramOnMenuItemClickListener;
      GMTrace.o(2546647171072L, 18974);
      return;
      this.FM.setDisplayHomeAsUpEnabled(false);
      if (this.vLe != null) {
        this.vLe.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(3078015156224L, 22933);
            paramOnMenuItemClickListener.onMenuItemClick(null);
            GMTrace.o(3078015156224L, 22933);
          }
        });
      }
    }
  }
  
  public final void a(MenuItem paramMenuItem, a parama)
  {
    GMTrace.i(2543291727872L, 18949);
    if (!this.vKM)
    {
      w.w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
      GMTrace.o(2543291727872L, 18949);
      return;
    }
    if (parama.orU != null) {
      parama.orU.onMenuItemClick(paramMenuItem);
    }
    GMTrace.o(2543291727872L, 18949);
  }
  
  final void a(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    GMTrace.i(2545707646976L, 18967);
    Iterator localIterator;
    boolean bool;
    a locala;
    if (paramBoolean1)
    {
      localIterator = this.vKZ.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (!localIterator.hasNext()) {
        break label134;
      }
      locala = (a)localIterator.next();
      if (locala.eDU == paramBoolean2) {
        break label210;
      }
      locala.eDU = paramBoolean2;
      paramBoolean1 = true;
    }
    label134:
    label207:
    label210:
    for (;;)
    {
      break;
      localIterator = this.vKZ.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if ((locala.vLz != paramInt) || (locala.eDU == paramBoolean2)) {
          break label207;
        }
        locala.eDU = paramBoolean2;
        paramBoolean1 = true;
      }
      for (;;)
      {
        break;
        if (this.jQL == null) {}
        for (paramBoolean1 = false;; paramBoolean1 = this.jQL.xiN)
        {
          if (!paramBoolean1) {
            aQ();
          }
          w.v("MicroMsg.MMActivityController", "enable option menu, target id %d, changed %B, searching %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(paramBoolean1) });
          GMTrace.o(2545707646976L, 18967);
          return;
        }
      }
    }
  }
  
  public final void a(boolean paramBoolean, com.tencent.mm.ui.tools.p paramp)
  {
    GMTrace.i(2545976082432L, 18969);
    w.v("MicroMsg.MMActivityController", "add search menu");
    a locala = new a();
    locala.vLz = a.g.bMU;
    locala.text = this.mContext.getString(a.k.cUr);
    locala.vLA = a.j.cIT;
    locala.orU = null;
    locala.lit = null;
    AZ(locala.vLz);
    this.vKZ.add(0, locala);
    this.vKX = paramBoolean;
    this.jQL = paramp;
    aQ();
    GMTrace.o(2545976082432L, 18969);
  }
  
  protected abstract String aJX();
  
  public final void aLs()
  {
    GMTrace.i(2547989348352L, 18984);
    Object localObject = this.vKW;
    InputMethodManager localInputMethodManager = (InputMethodManager)((Activity)localObject).getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      localObject = ((Activity)localObject).getCurrentFocus();
      if ((localObject != null) && (((View)localObject).getWindowToken() != null)) {
        localInputMethodManager.toggleSoftInput(0, 2);
      }
    }
    GMTrace.o(2547989348352L, 18984);
  }
  
  public void aQ()
  {
    GMTrace.i(2545304993792L, 18964);
    this.vKW.aQ();
    GMTrace.o(2545304993792L, 18964);
  }
  
  public final void aa(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2539936284672L, 18924);
    this.vLi = paramInt;
    this.vLj = paramBoolean;
    GMTrace.o(2539936284672L, 18924);
  }
  
  public boolean aaS()
  {
    GMTrace.i(2540607373312L, 18929);
    GMTrace.o(2540607373312L, 18929);
    return false;
  }
  
  public abstract void aoK();
  
  public final boolean avJ()
  {
    GMTrace.i(2547720912896L, 18982);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.mContext.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(2547720912896L, 18982);
      return false;
    }
    Object localObject = this.vKW.getCurrentFocus();
    if (localObject == null)
    {
      GMTrace.o(2547720912896L, 18982);
      return false;
    }
    localObject = ((View)localObject).getWindowToken();
    if (localObject == null)
    {
      GMTrace.o(2547720912896L, 18982);
      return false;
    }
    try
    {
      bool = localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
      w.v("MicroMsg.MMActivityController", "hide VKB result %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(2547720912896L, 18982);
      return bool;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        w.e("MicroMsg.MMActivityController", "hide VKB exception %s", new Object[] { localIllegalArgumentException });
        boolean bool = false;
      }
    }
  }
  
  final void b(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    GMTrace.i(2545841864704L, 18968);
    Iterator localIterator;
    boolean bool;
    a locala;
    if (paramBoolean1)
    {
      localIterator = this.vKZ.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (!localIterator.hasNext()) {
        break label134;
      }
      locala = (a)localIterator.next();
      if (locala.visible == paramBoolean2) {
        break label215;
      }
      locala.visible = paramBoolean2;
      paramBoolean1 = true;
    }
    label134:
    label212:
    label215:
    for (;;)
    {
      break;
      localIterator = this.vKZ.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if ((locala.vLz != paramInt) || (locala.visible == paramBoolean2)) {
          break label212;
        }
        locala.visible = paramBoolean2;
        paramBoolean1 = true;
      }
      for (;;)
      {
        break;
        if (this.jQL == null) {}
        for (paramBoolean1 = false;; paramBoolean1 = this.jQL.xiN)
        {
          if ((bool) && (!paramBoolean1)) {
            aQ();
          }
          w.i("MicroMsg.MMActivityController", "show option menu, target id %d, changed %B, searching %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(paramBoolean1) });
          GMTrace.o(2545841864704L, 18968);
          return;
        }
      }
    }
  }
  
  public boolean bEh()
  {
    GMTrace.i(2541949550592L, 18939);
    GMTrace.o(2541949550592L, 18939);
    return true;
  }
  
  protected abstract void bH(View paramView);
  
  public final boolean bXA()
  {
    GMTrace.i(2541546897408L, 18936);
    boolean bool = this.vKA;
    GMTrace.o(2541546897408L, 18936);
    return bool;
  }
  
  public final boolean bXB()
  {
    GMTrace.i(2543157510144L, 18948);
    if ((this.vKY != null) && (this.vKY.eDU))
    {
      a(null, this.vKY);
      GMTrace.o(2543157510144L, 18948);
      return true;
    }
    GMTrace.o(2543157510144L, 18948);
    return false;
  }
  
  final void bXC()
  {
    GMTrace.i(2545170776064L, 18963);
    Object localObject1 = "%s";
    int n = this.mContext.getResources().getDimensionPixelSize(a.e.aPz);
    if (this.vKO != 0) {
      localObject1 = "# " + "%s";
    }
    if (this.vKP != 0) {
      localObject1 = (String)localObject1 + " #";
    }
    for (int i = 1;; i = 0)
    {
      int j;
      if (this.vKU)
      {
        localObject1 = (String)localObject1 + " #";
        j = i + 2;
      }
      for (i = 1;; i = 0)
      {
        int m;
        int k;
        if (this.vKV)
        {
          localObject1 = (String)localObject1 + " #";
          m = 1;
          k = j + 2;
          j = i + 2;
        }
        for (i = m;; i = m)
        {
          Object localObject2 = String.format((String)localObject1, new Object[] { this.vKN });
          w.v("MicroMsg.MMActivityController", "span title format %s", new Object[] { localObject1 });
          localObject1 = b.a(this.mContext, (CharSequence)localObject2, n);
          if ((localObject1 instanceof SpannableString))
          {
            localObject2 = (SpannableString)localObject1;
            if (this.vKO != 0) {
              ((SpannableString)localObject2).setSpan(this.vKQ, 0, 1, 33);
            }
            if (this.vKP != 0)
            {
              k = ((SpannableString)localObject2).length() - k;
              ((SpannableString)localObject2).setSpan(this.vKR, k, k + 1, 33);
            }
            if (this.vKU)
            {
              if (this.vKS == null) {
                this.vKS = eg(n, a.j.gfZ);
              }
              j = ((SpannableString)localObject2).length() - j;
              ((SpannableString)localObject2).setSpan(this.vKS, j, j + 1, 33);
            }
            if (this.vKV)
            {
              if (this.vKT == null) {
                this.vKT = eg(n, a.j.gga);
              }
              i = ((SpannableString)localObject2).length() - i;
              ((SpannableString)localObject2).setSpan(this.vKT, i, i + 1, 33);
            }
          }
          this.vLd.setText((CharSequence)localObject1);
          GMTrace.o(2545170776064L, 18963);
          return;
          k = j;
          m = 0;
          j = i;
        }
        j = i;
      }
    }
  }
  
  public boolean bXD()
  {
    GMTrace.i(2545439211520L, 18965);
    GMTrace.o(2545439211520L, 18965);
    return false;
  }
  
  public final void bXE()
  {
    GMTrace.i(2546781388800L, 18975);
    if (this.vKZ.isEmpty())
    {
      GMTrace.o(2546781388800L, 18975);
      return;
    }
    this.vKZ.clear();
    aQ();
    GMTrace.o(2546781388800L, 18975);
  }
  
  public final void bXF()
  {
    boolean bool = true;
    GMTrace.i(2547452477440L, 18980);
    if (this.FM != null) {}
    for (;;)
    {
      w.v("MicroMsg.MMActivityController", "hideTitleView hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (this.FM != null) {
        break;
      }
      GMTrace.o(2547452477440L, 18980);
      return;
      bool = false;
    }
    this.FM.hide();
    GMTrace.o(2547452477440L, 18980);
  }
  
  protected abstract boolean bXl();
  
  protected abstract View bXo();
  
  public ActionBar cO()
  {
    GMTrace.i(2540338937856L, 18927);
    ActionBar localActionBar = this.vKW.cN().cO();
    GMTrace.o(2540338937856L, 18927);
    return localActionBar;
  }
  
  public final boolean da(View paramView)
  {
    GMTrace.i(2547855130624L, 18983);
    if (paramView == null)
    {
      GMTrace.o(2547855130624L, 18983);
      return false;
    }
    InputMethodManager localInputMethodManager = (InputMethodManager)this.mContext.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(2547855130624L, 18983);
      return false;
    }
    paramView = paramView.getWindowToken();
    if (paramView == null)
    {
      GMTrace.o(2547855130624L, 18983);
      return false;
    }
    try
    {
      bool = localInputMethodManager.hideSoftInputFromWindow(paramView, 0);
      GMTrace.o(2547855130624L, 18983);
      return bool;
    }
    catch (IllegalArgumentException paramView)
    {
      for (;;)
      {
        w.e("MicroMsg.MMActivityController", "hide VKB(View) exception %s", new Object[] { paramView });
        boolean bool = false;
      }
    }
  }
  
  public final void dp(boolean paramBoolean)
  {
    boolean bool2 = true;
    GMTrace.i(2541278461952L, 18934);
    this.vKM = paramBoolean;
    if ((this.vKH == null) && (this.hqF != null)) {
      this.vKH = this.hqF.findViewById(a.g.gdD);
    }
    if (this.vKH == null)
    {
      w.e("MicroMsg.MMActivityController", "jacks error npe translayer !");
      GMTrace.o(2541278461952L, 18934);
      return;
    }
    ??? = this.vKH;
    boolean bool1;
    if (!paramBoolean) {
      bool1 = true;
    }
    for (;;)
    {
      ((View)???).setFocusable(bool1);
      ??? = this.vKH;
      label100:
      ActionBarActivity localActionBarActivity;
      if (!paramBoolean)
      {
        bool1 = bool2;
        ((View)???).setFocusableInTouchMode(bool1);
        if (!paramBoolean) {
          localActionBarActivity = this.vKW;
        }
      }
      else
      {
        synchronized (yvJ)
        {
          if (wakeLock == null) {
            wakeLock = ((PowerManager)localActionBarActivity.getSystemService("power")).newWakeLock(32, "screen Lock");
          }
          if (!wakeLock.isHeld())
          {
            wakeLock.acquire();
            w.i("MicroMsg.MMActivityController", "after acquire screen off wakelock from object: %s, isHeld: %s", new Object[] { toString(), Boolean.valueOf(wakeLock.isHeld()) });
            GMTrace.o(2541278461952L, 18934);
            return;
            bool1 = false;
            continue;
            bool1 = false;
            break label100;
          }
          else
          {
            w.w("MicroMsg.MMActivityController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", new Object[] { toString() });
          }
        }
      }
    }
    synchronized (yvJ)
    {
      if ((wakeLock != null) && (wakeLock.isHeld()))
      {
        wakeLock.release();
        w.i("MicroMsg.MMActivityController", "after release screen off wakelock from object: %s, isHeld: %s", new Object[] { toString(), Boolean.valueOf(wakeLock.isHeld()) });
        GMTrace.o(2541278461952L, 18934);
        return;
      }
      w.w("MicroMsg.MMActivityController", "repeatedly release screen off wakelock from object: %s, drop this call.", new Object[] { toString() });
    }
  }
  
  final e eg(int paramInt1, int paramInt2)
  {
    GMTrace.i(2545036558336L, 18962);
    Drawable localDrawable = this.mContext.getResources().getDrawable(paramInt2);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    e locale = new e(localDrawable);
    locale.xpz = ((localDrawable.getIntrinsicHeight() - paramInt1) / 2);
    GMTrace.o(2545036558336L, 18962);
    return locale;
  }
  
  public final void g(boolean paramBoolean, long paramLong)
  {
    GMTrace.i(2544097034240L, 18955);
    if (this.FM != null) {
      this.FM.hide();
    }
    this.ohR.removeCallbacks(this.vLs);
    this.ohR.removeCallbacks(this.vLr);
    this.ohR.postDelayed(this.vLr, 0L);
    GMTrace.o(2544097034240L, 18955);
  }
  
  protected abstract String getClassName();
  
  protected abstract int getLayoutId();
  
  public final void lc(boolean paramBoolean)
  {
    GMTrace.i(2543962816512L, 18954);
    if (paramBoolean)
    {
      if (this.FM != null) {
        this.FM.hide();
      }
      this.ohR.removeCallbacks(this.vLs);
      this.ohR.removeCallbacks(this.vLr);
      this.ohR.postDelayed(this.vLr, 256L);
      GMTrace.o(2543962816512L, 18954);
      return;
    }
    this.vKW.getWindow().clearFlags(1024);
    this.ohR.removeCallbacks(this.vLr);
    this.ohR.removeCallbacks(this.vLs);
    this.ohR.postDelayed(this.vLs, 256L);
    GMTrace.o(2543962816512L, 18954);
  }
  
  public final void le(boolean paramBoolean)
  {
    GMTrace.i(2545573429248L, 18966);
    if (this.vKY == null)
    {
      GMTrace.o(2545573429248L, 18966);
      return;
    }
    if (this.vKY.eDU != paramBoolean)
    {
      this.vKY.eDU = paramBoolean;
      aQ();
    }
    GMTrace.o(2545573429248L, 18966);
  }
  
  public final void oM(int paramInt)
  {
    GMTrace.i(2544633905152L, 18959);
    sq(this.mContext.getString(paramInt));
    GMTrace.o(2544633905152L, 18959);
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(2542754856960L, 18945);
    w.d("MicroMsg.MMActivityController", "on create option menu, menuCache size:%d", new Object[] { Integer.valueOf(this.vKZ.size()) });
    if ((this.FM == null) || (this.vKZ.size() == 0))
    {
      w.w("MicroMsg.MMActivityController", "error, mActionBar is null or cache size:%d", new Object[] { Integer.valueOf(this.vKZ.size()) });
      GMTrace.o(2542754856960L, 18945);
      return false;
    }
    this.vLp = null;
    this.vLq = null;
    int i = this.FM.getHeight();
    Object localObject1;
    if (i == 0)
    {
      localObject1 = this.mContext.getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject1).widthPixels > ((DisplayMetrics)localObject1).heightPixels) {
        i = this.mContext.getResources().getDimensionPixelSize(a.e.aPM);
      }
    }
    for (;;)
    {
      Iterator localIterator = this.vKZ.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          final a locala = (a)localIterator.next();
          if (locala.vLz == 16908332)
          {
            w.v("MicroMsg.MMActivityController", "match back option menu, continue");
            continue;
            i = this.mContext.getResources().getDimensionPixelSize(a.e.aPN);
            break;
          }
          if (locala.vLz == a.g.bMU)
          {
            boolean bool2 = this.vKX;
            if (this.jQL == null) {}
            for (boolean bool1 = true;; bool1 = false)
            {
              w.v("MicroMsg.MMActivityController", "match search menu, enable search view[%B], search view helper is null[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
              if ((!this.vKX) || (this.jQL == null)) {
                break;
              }
              this.jQL.a(this.vKW, paramMenu);
              break;
            }
          }
          final MenuItem localMenuItem = paramMenu.add(0, locala.vLz, 0, locala.text);
          localObject1 = getClass().getName();
          label355:
          View.OnClickListener local11;
          View.OnLongClickListener local12;
          label477:
          label498:
          Object localObject2;
          if (localMenuItem == null)
          {
            w.w("MicroMsg.MenuItemUtil", "fixTitleCondensed fail, item is null");
            local11 = new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(2067087228928L, 15401);
                p.this.a(localMenuItem, locala);
                GMTrace.o(2067087228928L, 15401);
              }
            };
            local12 = new View.OnLongClickListener()
            {
              public final boolean onLongClick(View paramAnonymousView)
              {
                GMTrace.i(2550673702912L, 19004);
                p localp = p.this;
                p.a locala = locala;
                if (!localp.vKM)
                {
                  w.w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
                  GMTrace.o(2550673702912L, 19004);
                  return true;
                }
                if (locala.lit != null)
                {
                  boolean bool = locala.lit.onLongClick(paramAnonymousView);
                  GMTrace.o(2550673702912L, 19004);
                  return bool;
                }
                GMTrace.o(2550673702912L, 19004);
                return false;
              }
            };
            if ((locala.vLA == 0) && (locala.vLB == null)) {
              break label859;
            }
            if (locala.lit == null) {
              break label819;
            }
            int j = com.tencent.mm.br.a.fromDPToPix(this.mContext, 56);
            if (locala.vLD != null) {
              break label793;
            }
            localObject1 = new ImageButton(this.mContext);
            ((View)localObject1).setLayoutParams(new ViewGroup.LayoutParams(j, i));
            ((View)localObject1).setBackgroundResource(a.f.aTq);
            ((View)localObject1).setMinimumHeight(i);
            ((View)localObject1).setMinimumWidth(j);
            locala.vLD = ((View)localObject1);
            if (locala.vLB == null) {
              break label803;
            }
            ((ImageButton)localObject1).setImageDrawable(locala.vLB);
            m.a(localMenuItem, (View)localObject1);
            localObject2 = ((View)localObject1).getLayoutParams();
            ((ViewGroup.LayoutParams)localObject2).width = j;
            ((ViewGroup.LayoutParams)localObject2).height = i;
            ((View)localObject1).setOnClickListener(local11);
            ((View)localObject1).setOnLongClickListener(local12);
            ((View)localObject1).setEnabled(locala.eDU);
            ((View)localObject1).setContentDescription(locala.text);
          }
          for (;;)
          {
            localMenuItem.setEnabled(locala.eDU);
            localMenuItem.setVisible(locala.visible);
            m.a(localMenuItem, 2);
            if (locala.vLA == a.f.aXV)
            {
              this.vLp = locala;
              this.vLq = localMenuItem;
            }
            w.v("MicroMsg.MMActivityController", "set %d %s option menu enable %B, visible %B", new Object[] { Integer.valueOf(locala.vLz), locala.text, Boolean.valueOf(locala.eDU), Boolean.valueOf(locala.visible) });
            break;
            if (localMenuItem.getTitleCondensed() == null)
            {
              w.w("MicroMsg.MenuItemUtil", "%s title condensed is null, fix it", new Object[] { localObject1 });
              localMenuItem.setTitleCondensed("");
              break label355;
            }
            if ((localMenuItem.getTitleCondensed() instanceof String)) {
              break label355;
            }
            w.w("MicroMsg.MenuItemUtil", "%s title condensed is not String type, cur type[%s], cur value[%s], fix it", new Object[] { localObject1, localMenuItem.getTitleCondensed().getClass().getName(), localMenuItem.getTitleCondensed() });
            localMenuItem.setTitleCondensed(localMenuItem.getTitleCondensed().toString());
            break label355;
            label793:
            localObject1 = locala.vLD;
            break label477;
            label803:
            ((ImageButton)localObject1).setImageResource(locala.vLA);
            break label498;
            label819:
            if (locala.vLB != null) {
              localMenuItem.setIcon(locala.vLB);
            } else {
              localMenuItem.setIcon(locala.vLA);
            }
          }
          label859:
          if (locala.vLC == null) {
            locala.vLC = View.inflate(this.mContext, a.h.geF, null);
          }
          if (locala.vLE == b.vLH)
          {
            locala.vLC.findViewById(a.g.bcH).setVisibility(8);
            locala.vLC.findViewById(a.g.divider).setVisibility(8);
            localObject1 = (TextView)locala.vLC.findViewById(a.g.gcT);
            ((TextView)localObject1).setBackgroundResource(a.f.aUH);
            ((TextView)localObject1).setPadding(this.lDA, 0, this.lDA, 0);
          }
          for (;;)
          {
            ((TextView)localObject1).setVisibility(0);
            ((TextView)localObject1).setText(locala.text);
            if (locala.textColor != 0) {
              ((TextView)localObject1).setTextColor(locala.textColor);
            }
            ((TextView)localObject1).setOnClickListener(local11);
            ((TextView)localObject1).setOnLongClickListener(local12);
            ((TextView)localObject1).setEnabled(locala.eDU);
            m.a(localMenuItem, locala.vLC);
            break;
            if (locala.vLE == b.vLG)
            {
              locala.vLC.findViewById(a.g.bcH).setVisibility(8);
              locala.vLC.findViewById(a.g.divider).setVisibility(8);
              localObject1 = (TextView)locala.vLC.findViewById(a.g.gcT);
              ((TextView)localObject1).setBackgroundResource(a.f.aUF);
              ((TextView)localObject1).setPadding(this.lDA, 0, this.lDA, 0);
            }
            else if (locala.vLE == b.vLI)
            {
              locala.vLC.findViewById(a.g.bcH).setVisibility(8);
              locala.vLC.findViewById(a.g.divider).setVisibility(8);
              localObject1 = (TextView)locala.vLC.findViewById(a.g.gcT);
              ((TextView)locala.vLC.findViewById(a.g.gcT)).setTextColor(-8393929);
              ((TextView)localObject1).setBackgroundResource(a.f.gcL);
              ((TextView)localObject1).setPadding(this.lDA, 0, this.lDA, 0);
              locala.vLC.setBackgroundColor(-16777216);
            }
            else if ((locala.vLE == b.vLJ) || (locala.vLE == b.vLK) || (locala.vLE == b.vLL) || (locala.vLE == b.vLN))
            {
              locala.vLC.findViewById(a.g.gcT).setVisibility(8);
              locala.vLC.findViewById(a.g.divider).setVisibility(8);
              localObject2 = (TextView)locala.vLC.findViewById(a.g.bcH);
              if (locala.vLE == b.vLK)
              {
                ((TextView)localObject2).setTextColor(this.vKW.getResources().getColor(a.d.gct));
                localObject1 = localObject2;
              }
              else if (locala.vLE == b.vLL)
              {
                ((TextView)localObject2).setTextColor(this.vKW.getResources().getColor(a.d.aPp));
                localObject1 = localObject2;
              }
              else
              {
                localObject1 = localObject2;
                if (locala.vLE == b.vLN)
                {
                  ((TextView)localObject2).setTextColor(this.vKW.getResources().getColor(a.d.gcn));
                  localObject1 = localObject2;
                }
              }
            }
            else if (locala.vLE == b.vLM)
            {
              locala.vLC.findViewById(a.g.bcH).setVisibility(8);
              locala.vLC.findViewById(a.g.divider).setVisibility(8);
              localObject1 = (TextView)locala.vLC.findViewById(a.g.gcT);
              ((TextView)localObject1).setBackgroundResource(a.f.gcC);
              ((TextView)localObject1).setPadding(this.lDA, 0, this.lDA, 0);
              ((TextView)localObject1).setTextColor(-2601405);
            }
            else
            {
              locala.vLC.findViewById(a.g.gcT).setVisibility(8);
              locala.vLC.findViewById(a.g.divider).setVisibility(0);
              localObject1 = (TextView)locala.vLC.findViewById(a.g.bcH);
            }
          }
        }
      }
      GMTrace.o(2542754856960L, 18945);
      return true;
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(2542217986048L, 18941);
    if (this.vLb != null)
    {
      int j = this.vLb.size();
      int i = 0;
      while (i < j)
      {
        Dialog localDialog = (Dialog)this.vLb.get(i);
        if ((localDialog != null) && (localDialog.isShowing())) {
          localDialog.dismiss();
        }
        i += 1;
      }
      this.vLb.clear();
      this.vLb = null;
    }
    GMTrace.o(2542217986048L, 18941);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2541815332864L, 18938);
    int j;
    int i;
    if ((paramInt == 25) && (this.hdu != null))
    {
      if (paramKeyEvent.getAction() == 0)
      {
        paramInt = this.hdu.getStreamMaxVolume(3);
        j = this.hdu.getStreamVolume(3);
        i = paramInt / 7;
        paramInt = i;
        if (i == 0) {
          paramInt = 1;
        }
        this.hdu.setStreamVolume(3, j - paramInt, 5);
      }
      GMTrace.o(2541815332864L, 18938);
      return true;
    }
    if ((paramInt == 24) && (this.hdu != null))
    {
      if (paramKeyEvent.getAction() == 0)
      {
        paramInt = this.hdu.getStreamMaxVolume(3);
        j = this.hdu.getStreamVolume(3);
        if (j >= paramInt)
        {
          w.i("MicroMsg.MMActivityController", "has set the max volume");
          GMTrace.o(2541815332864L, 18938);
          return true;
        }
        i = paramInt / 7;
        paramInt = i;
        if (i == 0) {
          paramInt = 1;
        }
        this.hdu.setStreamVolume(3, paramInt + j, 5);
      }
      GMTrace.o(2541815332864L, 18938);
      return true;
    }
    if ((this.vKX) && (this.jQL != null) && (this.jQL.onKeyDown(paramInt, paramKeyEvent)))
    {
      w.d("MicroMsg.MMActivityController", "match search view on key down");
      GMTrace.o(2541815332864L, 18938);
      return true;
    }
    GMTrace.o(2541815332864L, 18938);
    return false;
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2541681115136L, 18937);
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
    {
      if ((this.vLp != null) && (this.vLp.eDU)) {
        a(this.vLq, this.vLp);
      }
      GMTrace.o(2541681115136L, 18937);
      return true;
    }
    GMTrace.o(2541681115136L, 18937);
    return false;
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    GMTrace.i(2543023292416L, 18947);
    w.v("MicroMsg.MMActivityController", "on options item selected");
    if (!this.vKM)
    {
      w.w("MicroMsg.MMActivityController", "onOptionsItemSelected screen not enable.");
      GMTrace.o(2543023292416L, 18947);
      return true;
    }
    if ((paramMenuItem.getItemId() == this.vKY.vLz) && (this.vKY.eDU))
    {
      a(paramMenuItem, this.vKY);
      GMTrace.o(2543023292416L, 18947);
      return true;
    }
    Iterator localIterator = this.vKZ.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (paramMenuItem.getItemId() == locala.vLz)
      {
        w.d("MicroMsg.MMActivityController", "on option menu %d click", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
        a(paramMenuItem, locala);
        GMTrace.o(2543023292416L, 18947);
        return true;
      }
    }
    GMTrace.o(2543023292416L, 18947);
    return false;
  }
  
  public final void onPause()
  {
    GMTrace.i(2542620639232L, 18944);
    li(false);
    com.tencent.mm.sdk.b.a.vgX.c(this.vLk);
    GMTrace.o(2542620639232L, 18944);
  }
  
  public final boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(2542889074688L, 18946);
    w.d("MicroMsg.MMActivityController", "on prepare option menu");
    if ((this.vKX) && (this.jQL != null)) {
      this.jQL.a(this.vKW, paramMenu);
    }
    GMTrace.o(2542889074688L, 18946);
    return true;
  }
  
  public final void onResume()
  {
    GMTrace.i(2542083768320L, 18940);
    li(true);
    com.tencent.mm.sdk.b.a.vgX.b(this.vLk);
    ai localai = new ai();
    localai.eBo.type = 2;
    localai.eBo.position = this.vLi;
    com.tencent.mm.sdk.b.a.vgX.m(localai);
    long l;
    String str;
    int i;
    if (localai.eBp.eBs == 2)
    {
      l = System.currentTimeMillis();
      str = localai.eBp.eBv;
      i = localai.eBp.position;
      w.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position[%d], noticeId[%s]", new Object[] { Integer.valueOf(i), str });
      if ((i <= 0) || (i == this.vLi)) {
        break label203;
      }
      w.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position not match[%d, %d] ignore display", new Object[] { Integer.valueOf(i), Integer.valueOf(this.vLi) });
    }
    for (;;)
    {
      w.v("MicroMsg.INIT", "KEVIN MMActivity onResume initNotifyView:" + (System.currentTimeMillis() - l));
      GMTrace.o(2542083768320L, 18940);
      return;
      label203:
      a(localai.eBp.eBu, localai.eBp.visible, localai.eBp.url, localai.eBp.desc, str, i, true);
    }
  }
  
  public final void onStart()
  {
    GMTrace.i(2541412679680L, 18935);
    this.vKA = this.mContext.getSharedPreferences(ab.bPU(), 0).getBoolean("settings_landscape_mode", false);
    if (this.vKA)
    {
      this.vKW.setRequestedOrientation(-1);
      GMTrace.o(2541412679680L, 18935);
      return;
    }
    this.vKW.setRequestedOrientation(1);
    GMTrace.o(2541412679680L, 18935);
  }
  
  public final void sq(String paramString)
  {
    GMTrace.i(2544231251968L, 18956);
    if (this.FM == null)
    {
      GMTrace.o(2544231251968L, 18956);
      return;
    }
    this.vKN = paramString;
    if (com.tencent.mm.br.a.ed(this.vKW)) {
      this.vLd.setTextSize(0, com.tencent.mm.br.a.W(this.vKW, a.e.aPt) * com.tencent.mm.br.a.eb(this.vKW));
    }
    bXC();
    Vf(paramString);
    GMTrace.o(2544231251968L, 18956);
  }
  
  public static final class a
  {
    boolean eDU;
    public View.OnLongClickListener lit;
    public MenuItem.OnMenuItemClickListener orU;
    public String text;
    public int textColor;
    int vLA;
    Drawable vLB;
    View vLC;
    View vLD;
    public int vLE;
    public int vLz;
    boolean visible;
    
    public a()
    {
      GMTrace.i(2077690429440L, 15480);
      this.vLz = -1;
      this.eDU = true;
      this.visible = true;
      this.vLE = p.b.vLF;
      GMTrace.o(2077690429440L, 15480);
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(2534164922368L, 18881);
      vLF = 1;
      vLG = 2;
      vLH = 3;
      vLI = 4;
      vLJ = 5;
      vLK = 6;
      vLL = 7;
      vLM = 8;
      vLN = 9;
      vLO = new int[] { vLF, vLG, vLH, vLI, vLJ, vLK, vLL, vLM, vLN };
      GMTrace.o(2534164922368L, 18881);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */