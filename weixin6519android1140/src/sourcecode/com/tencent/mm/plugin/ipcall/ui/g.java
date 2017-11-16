package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.ipcall.a.e.d;
import com.tencent.mm.plugin.ipcall.a.g.f;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.pluginsdk.j.a.b.b;
import com.tencent.mm.pluginsdk.j.a.b.b.c;
import com.tencent.mm.protocal.c.afn;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.FlowLayout;
import com.tencent.mm.ui.base.PasterEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public final class g
  extends Dialog
{
  View jBw;
  private ScrollView kFq;
  private int lgi;
  private int lgj;
  private Activity mActivity;
  private Context mContext;
  private ae mHandler;
  private ArrayList<a> mItemList;
  private View.OnClickListener mOnClickListener;
  private int mqd;
  private int mqe;
  private long mqf;
  private LinearLayout mqg;
  private LinearLayout mqh;
  private RelativeLayout mqi;
  private RelativeLayout mqj;
  private RelativeLayout mqk;
  private ImageView mql;
  private ImageView mqm;
  private ImageView mqn;
  private int mqo;
  private FrameLayout mqp;
  private FlowLayout mqq;
  private Button mqr;
  private Button mqs;
  private PasterEditText mqt;
  private Button mqu;
  private Button mqv;
  private TextView mqw;
  private Animation mqx;
  private int mqy;
  private int mqz;
  private CharSequence tX;
  
  public g(final Activity paramActivity, Context paramContext, int paramInt, long paramLong)
  {
    super(paramContext, R.m.eme);
    GMTrace.i(11664460087296L, 86907);
    this.mqd = 0;
    this.mHandler = new ae();
    this.mOnClickListener = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11726871330816L, 87372);
        if (paramAnonymousView == g.b(g.this))
        {
          g.a(g.this, 1);
          GMTrace.o(11726871330816L, 87372);
          return;
        }
        if (paramAnonymousView == g.c(g.this))
        {
          g.a(g.this, 2);
          GMTrace.o(11726871330816L, 87372);
          return;
        }
        if (paramAnonymousView == g.d(g.this)) {
          g.a(g.this, 3);
        }
        GMTrace.o(11726871330816L, 87372);
      }
    };
    this.lgj = R.g.aWw;
    this.lgi = R.e.aNH;
    this.mqy = R.g.aWv;
    this.mqz = R.e.aPq;
    setCancelable(false);
    this.mContext = paramContext;
    this.mqe = paramInt;
    this.mqf = paramLong;
    this.mActivity = paramActivity;
    this.jBw = View.inflate(this.mContext, R.i.cAq, null);
    this.mqg = ((LinearLayout)this.jBw.findViewById(R.h.bJK));
    this.mqh = ((LinearLayout)this.jBw.findViewById(R.h.bJL));
    this.mqx = AnimationUtils.loadAnimation(ab.getContext(), R.a.aLh);
    this.mqx.setDuration(200L);
    this.mqx.setStartOffset(100L);
    aJn();
    this.mqi = ((RelativeLayout)this.jBw.findViewById(R.h.bJO));
    this.mqj = ((RelativeLayout)this.jBw.findViewById(R.h.bJP));
    this.mqk = ((RelativeLayout)this.jBw.findViewById(R.h.bJQ));
    this.mqi.setOnClickListener(this.mOnClickListener);
    this.mqj.setOnClickListener(this.mOnClickListener);
    this.mqk.setOnClickListener(this.mOnClickListener);
    this.mql = ((ImageView)this.jBw.findViewById(R.h.bHe));
    this.mqm = ((ImageView)this.jBw.findViewById(R.h.bHf));
    this.mqn = ((ImageView)this.jBw.findViewById(R.h.bHg));
    this.mqo = 0;
    pu(this.mqo);
    this.mqu = ((Button)this.jBw.findViewById(R.h.bHw));
    this.mqv = ((Button)this.jBw.findViewById(R.h.bHx));
    this.mqw = ((TextView)this.jBw.findViewById(R.h.bHy));
    paramActivity = c.aJI();
    if (paramActivity != null) {}
    for (paramActivity = String.format(this.mContext.getString(R.l.dFF), new Object[] { paramActivity.uvl });; paramActivity = null)
    {
      if (bg.nm(paramActivity)) {
        this.mqw.setVisibility(4);
      }
      for (;;)
      {
        this.mqu.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11722576363520L, 87340);
            g.this.dismiss();
            d.a(1, -1, g.h(g.this), g.b(g.this, g.h(g.this)), 1, -1, 1, g.e(g.this), g.f(g.this));
            GMTrace.o(11722576363520L, 87340);
          }
        });
        this.mqv.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11640971984896L, 86732);
            g.this.dismiss();
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("IPCallShareCouponCardUI_KFrom", 2);
            paramAnonymousView.setClass(g.i(g.this), IPCallShareCouponCardUI.class);
            g.i(g.this).startActivity(paramAnonymousView);
            d.a(1, -1, g.h(g.this), g.b(g.this, g.h(g.this)), 1, 1, -1, g.e(g.this), g.f(g.this));
            GMTrace.o(11640971984896L, 86732);
          }
        });
        this.kFq = ((ScrollView)this.jBw.findViewById(R.h.bzG));
        paramActivity = ((ViewGroup)this.mActivity.findViewById(16908290)).getChildAt(0);
        paramActivity.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
        {
          public final void onGlobalLayout()
          {
            GMTrace.i(11622584156160L, 86595);
            Object localObject = new Rect();
            paramActivity.getWindowVisibleDisplayFrame((Rect)localObject);
            if (paramActivity.getRootView().getHeight() - (((Rect)localObject).bottom - ((Rect)localObject).top) > 100)
            {
              localObject = g.this;
              ((g)localObject).jBw.postDelayed(new g.2((g)localObject), 100L);
            }
            GMTrace.o(11622584156160L, 86595);
          }
        });
        GMTrace.o(11664460087296L, 86907);
        return;
        this.mqw.setVisibility(0);
        this.mqw.setText(paramActivity);
      }
    }
  }
  
  private void aJn()
  {
    GMTrace.i(11664862740480L, 86910);
    this.mqp = ((FrameLayout)this.jBw.findViewById(R.h.bAo));
    this.mqq = ((FlowLayout)this.jBw.findViewById(R.h.bAn));
    this.mqr = ((Button)this.jBw.findViewById(R.h.bpU));
    this.mqs = ((Button)this.jBw.findViewById(R.h.bpV));
    this.mqt = ((PasterEditText)this.jBw.findViewById(R.h.bqa));
    this.mqr.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11639227154432L, 86719);
        g.this.dismiss();
        d.a(-1, 1, -1, "", 0, -1, -1, g.e(g.this), g.f(g.this));
        GMTrace.o(11639227154432L, 86719);
      }
    });
    this.mqs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11721234186240L, 87330);
        g.g(g.this);
        GMTrace.o(11721234186240L, 87330);
      }
    });
    Object localObject3 = com.tencent.mm.plugin.ipcall.a.e.aIh();
    Object localObject1;
    if (((com.tencent.mm.plugin.ipcall.a.e)localObject3).miG == null)
    {
      w.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource try get cacheResUpdate");
      localObject1 = b.c.tqk;
      localObject1 = b.dT(39, 1);
      if (bg.nm((String)localObject1)) {
        break label392;
      }
      localObject1 = com.tencent.mm.a.e.d((String)localObject1, 0, -1);
      if (localObject1 != null) {
        ((com.tencent.mm.plugin.ipcall.a.e)localObject3).aw((byte[])localObject1);
      }
    }
    else
    {
      if (((com.tencent.mm.plugin.ipcall.a.e)localObject3).miG == null) {
        break label434;
      }
      localObject1 = v.e(ab.getContext().getSharedPreferences(ab.bPU(), 0));
      if ((!"language_default".equalsIgnoreCase((String)localObject1)) || (Locale.getDefault() == null)) {
        break label611;
      }
      localObject1 = Locale.getDefault().toString();
    }
    label296:
    label392:
    label434:
    label611:
    for (;;)
    {
      Object localObject4 = ((com.tencent.mm.plugin.ipcall.a.e)localObject3).miG.iterator();
      Object localObject2;
      while (((Iterator)localObject4).hasNext())
      {
        localObject2 = (f)((Iterator)localObject4).next();
        if (((String)localObject1).equalsIgnoreCase(((f)localObject2).mmT))
        {
          w.i("MicroMsg.IPCallFeedbackConfigUpdater", "curLang: %s,resListCount: %s", new Object[] { localObject1, Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.e)localObject3).miG.size()) });
          localObject1 = localObject2;
        }
      }
      for (;;)
      {
        if (localObject1 != null)
        {
          localObject2 = ((f)localObject1).mmU;
          localObject1 = new ArrayList();
          localObject2 = ((ArrayList)localObject2).iterator();
          for (;;)
          {
            if (((Iterator)localObject2).hasNext())
            {
              localObject3 = (com.tencent.mm.plugin.ipcall.a.g.e)((Iterator)localObject2).next();
              localObject4 = new a();
              ((a)localObject4).mmR = ((com.tencent.mm.plugin.ipcall.a.g.e)localObject3).mmR;
              ((a)localObject4).mmS = ((com.tencent.mm.plugin.ipcall.a.g.e)localObject3).mmS;
              ((a)localObject4).mqC = false;
              ((ArrayList)localObject1).add(localObject4);
              continue;
              w.e("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource file not exist");
              break;
              w.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource get cacheResUpdate no filePath");
              break;
              w.e("MicroMsg.IPCallFeedbackConfigUpdater", "no lanuage equal curLang, curLang: %s,resListCount: %s", new Object[] { localObject1, Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.e)localObject3).miG.size()) });
              localObject1 = null;
              break label296;
            }
          }
          this.mItemList = ((ArrayList)localObject1);
          localObject1 = this.mItemList.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (a)((Iterator)localObject1).next();
            localObject3 = this.mqq;
            localObject4 = new TextView(getContext());
            ((TextView)localObject4).setTextSize(0, getContext().getResources().getDimension(R.f.aSa) * a.dZ(getContext()));
            ((TextView)localObject4).setBackgroundResource(this.lgj);
            ((TextView)localObject4).setTextColor(this.mContext.getResources().getColor(this.lgi));
            ((TextView)localObject4).setTag(localObject2);
            ((TextView)localObject4).setGravity(17);
            ((TextView)localObject4).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView)localObject4).setSingleLine();
            ((TextView)localObject4).setText(((a)localObject2).mmS);
            ((TextView)localObject4).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(11682311045120L, 87040);
                g.a locala = (g.a)paramAnonymousView.getTag();
                if (!locala.mqC) {}
                for (locala.mqC = true;; locala.mqC = false)
                {
                  g.a(g.this, (TextView)paramAnonymousView);
                  GMTrace.o(11682311045120L, 87040);
                  return;
                }
              }
            });
            ((FlowLayout)localObject3).addView((View)localObject4);
          }
        }
      }
      GMTrace.o(11664862740480L, 86910);
      return;
    }
  }
  
  private void pu(int paramInt)
  {
    GMTrace.i(11664728522752L, 86909);
    this.mqo = paramInt;
    if (paramInt == 0)
    {
      this.mql.setVisibility(4);
      this.mqm.setVisibility(4);
      this.mqn.setVisibility(4);
      this.mqs.setEnabled(false);
      py(0);
      GMTrace.o(11664728522752L, 86909);
      return;
    }
    if (paramInt == 1)
    {
      this.mql.setVisibility(0);
      this.mqm.setVisibility(4);
      this.mqn.setVisibility(4);
      this.mqs.setEnabled(true);
      py(1);
      GMTrace.o(11664728522752L, 86909);
      return;
    }
    if (paramInt == 2)
    {
      this.mql.setVisibility(0);
      this.mqm.setVisibility(0);
      this.mqn.setVisibility(4);
      this.mqs.setEnabled(true);
      py(1);
      GMTrace.o(11664728522752L, 86909);
      return;
    }
    if (paramInt == 3)
    {
      this.mql.setVisibility(0);
      this.mqm.setVisibility(0);
      this.mqn.setVisibility(0);
      this.mqs.setEnabled(true);
      py(0);
    }
    GMTrace.o(11664728522752L, 86909);
  }
  
  private String pv(int paramInt)
  {
    GMTrace.i(11664996958208L, 86911);
    String str = "";
    if (paramInt == 3)
    {
      GMTrace.o(11664996958208L, 86911);
      return "";
    }
    if (!bg.nm(this.mqt.getText().toString().trim())) {
      str = "0";
    }
    Object localObject;
    if (this.mItemList != null)
    {
      Iterator localIterator = this.mItemList.iterator();
      for (;;)
      {
        localObject = str;
        if (!localIterator.hasNext()) {
          break label151;
        }
        localObject = (a)localIterator.next();
        if (!((a)localObject).mqC) {
          break label162;
        }
        if (!str.equals("")) {
          break;
        }
        str = ((a)localObject).mmR;
      }
      str = str + "_" + ((a)localObject).mmR;
    }
    label151:
    label162:
    for (;;)
    {
      break;
      localObject = str;
      GMTrace.o(11664996958208L, 86911);
      return (String)localObject;
    }
  }
  
  private LinkedList<bqg> pw(int paramInt)
  {
    GMTrace.i(11665131175936L, 86912);
    LinkedList localLinkedList = new LinkedList();
    if (paramInt == 3)
    {
      GMTrace.o(11665131175936L, 86912);
      return localLinkedList;
    }
    Object localObject1 = this.mqt.getText().toString().trim();
    Object localObject2;
    if (!bg.nm((String)localObject1))
    {
      localObject2 = new bqg();
      ((bqg)localObject2).etB = 0;
      ((bqg)localObject2).nIp = ((String)localObject1);
      localLinkedList.add(localObject2);
    }
    if (this.mItemList != null)
    {
      localObject1 = this.mItemList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a)((Iterator)localObject1).next();
        if (((a)localObject2).mqC)
        {
          bqg localbqg = new bqg();
          try
          {
            localbqg.etB = bg.getInt(((a)localObject2).mmR, 0);
            localLinkedList.add(localbqg);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            w.e("MicroMsg.IPCallFeedbackDialog", "getFeedbackList error, id = " + ((a)localObject2).mmR);
          }
        }
      }
    }
    GMTrace.o(11665131175936L, 86912);
    return localLinkedList;
  }
  
  private void py(int paramInt)
  {
    GMTrace.i(11665668046848L, 86916);
    if (paramInt == 0)
    {
      this.mqg.setVisibility(0);
      this.mqh.setVisibility(4);
      if (this.mqd == 1)
      {
        ((LinearLayout.LayoutParams)this.mqp.getLayoutParams()).height = 0;
        this.mqp.requestLayout();
      }
      bg.da(this.jBw);
    }
    for (;;)
    {
      this.mqd = paramInt;
      GMTrace.o(11665668046848L, 86916);
      return;
      if (paramInt == 1)
      {
        this.mqg.setVisibility(0);
        this.mqh.setVisibility(4);
        if (this.mqd == 0)
        {
          ((LinearLayout.LayoutParams)this.mqp.getLayoutParams()).height = -2;
          this.mqp.requestLayout();
          this.mqp.startAnimation(this.mqx);
        }
      }
      else if (paramInt == 2)
      {
        this.mqg.setVisibility(4);
        this.mqh.setVisibility(0);
        bg.da(this.jBw);
      }
    }
  }
  
  public final void dismiss()
  {
    GMTrace.i(11665533829120L, 86915);
    try
    {
      super.dismiss();
      GMTrace.o(11665533829120L, 86915);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.IPCallFeedbackDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(11665533829120L, 86915);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11664594305024L, 86908);
    super.onCreate(paramBundle);
    setContentView(this.jBw);
    getWindow().getAttributes().width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
    getWindow().getDecorView().setPadding(0, 0, 0, 0);
    py(0);
    GMTrace.o(11664594305024L, 86908);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(11665265393664L, 86913);
    if (paramCharSequence != null)
    {
      this.tX = paramCharSequence;
      GMTrace.o(11665265393664L, 86913);
      return;
    }
    this.tX = null;
    GMTrace.o(11665265393664L, 86913);
  }
  
  public final void show()
  {
    GMTrace.i(11665399611392L, 86914);
    super.show();
    GMTrace.o(11665399611392L, 86914);
  }
  
  public static final class a
  {
    public String mmR;
    public String mmS;
    public boolean mqC;
    
    public a()
    {
      GMTrace.i(11706201800704L, 87218);
      GMTrace.o(11706201800704L, 87218);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */