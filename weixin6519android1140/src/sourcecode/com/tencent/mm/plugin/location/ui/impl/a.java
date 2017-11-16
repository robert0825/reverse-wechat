package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.plugin.location.ui.RemarkUI;
import com.tencent.mm.plugin.location.ui.n;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public abstract class a
  extends com.tencent.mm.plugin.p.a
{
  public Activity activity;
  ae handler;
  protected ProgressDialog htG;
  protected float jqu;
  protected float lUn;
  DisplayMetrics lYR;
  public String mBZ;
  protected boolean mCa;
  public boolean mCb;
  protected Addr mCc;
  protected com.tencent.mm.plugin.location.ui.d mCd;
  protected LocationInfo mCe;
  protected LocationInfo mCf;
  protected a mCg;
  protected boolean mCh;
  protected HashMap<String, com.tencent.mm.plugin.location.ui.c> mCi;
  protected com.tencent.mm.modelgeo.b mCj;
  protected boolean mCk;
  protected int mCl;
  protected ArrayList<String> mCm;
  protected boolean mCn;
  protected boolean mCo;
  protected com.tencent.mm.plugin.location.model.c mCp;
  protected com.tencent.mm.modelgeo.c mCq;
  public b.a mCr;
  protected String myO;
  protected String myb;
  protected String mzo;
  protected int type;
  int zoom;
  
  public a(Activity paramActivity)
  {
    GMTrace.i(9679782543360L, 72120);
    this.mBZ = "";
    this.mCa = false;
    this.mCb = false;
    this.mCc = null;
    this.type = 0;
    this.mCe = new LocationInfo((byte)0);
    this.mCf = new LocationInfo((byte)0);
    this.mCh = false;
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.lYR = null;
    this.mCi = new HashMap();
    this.handler = new ae(Looper.getMainLooper());
    this.mCk = false;
    this.htG = null;
    this.mCl = 0;
    this.mzo = "";
    this.mCm = new ArrayList();
    this.myb = "";
    this.mCn = false;
    this.mCo = false;
    this.mCp = null;
    this.mCr = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(9693472751616L, 72222);
        w.d("MicroMsg.BaseMapUI", "onGetAddrss  %s", new Object[] { paramAnonymousAddr.toString() });
        a.this.mCc = paramAnonymousAddr;
        String str = paramAnonymousAddr.gEA;
        str = paramAnonymousAddr.Io();
        a.this.mCf.eQm = a.this.activity.getResources().getString(R.l.dGC);
        if ((paramAnonymousAddr.tag != null) && (paramAnonymousAddr.tag.equals(a.this.mCf.mwG))) {
          a.this.mCf.mwJ = str;
        }
        for (;;)
        {
          if ((paramAnonymousAddr.tag != null) && (a.this.mCi.containsKey(paramAnonymousAddr.tag)))
          {
            com.tencent.mm.plugin.location.ui.c localc = (com.tencent.mm.plugin.location.ui.c)a.this.mCi.get(paramAnonymousAddr.tag);
            localc.setText(localc.aKF() + str);
          }
          float f = paramAnonymousAddr.gEK;
          f = paramAnonymousAddr.gEJ;
          GMTrace.o(9693472751616L, 72222);
          return;
          if (!bg.nm(paramAnonymousAddr.gEy)) {
            a.this.mCg.mCu.setVisibility(0);
          }
        }
      }
    };
    this.activity = paramActivity;
    this.mCj = com.tencent.mm.modelgeo.b.Ip();
    GMTrace.o(9679782543360L, 72120);
  }
  
  protected final void MP()
  {
    GMTrace.i(9682198462464L, 72138);
    w.d("MicroMsg.BaseMapUI", "initView");
    this.mCg.mzn = ((com.tencent.mm.plugin.p.d)findViewById(R.h.bCr));
    this.mCg.mCt = ((FrameLayout)findViewById(R.h.brZ));
    this.mCg.mCu = ((RelativeLayout)findViewById(R.h.chD));
    this.mCg.mCv = findViewById(R.h.chJ);
    this.mCg.mCw = ((ImageButton)findViewById(R.h.chK));
    this.mCg.mCx = findViewById(R.h.chL);
    this.mCg.mCy = ((TextView)findViewById(R.h.bcH));
    this.mCg.titleView = ((TextView)findViewById(R.h.bNe));
    this.mCg.mCC = ((TextView)findViewById(R.h.bOq));
    this.mCg.titleView.setText(Qb());
    this.mCg.mzn.getIController().setZoom(com.tencent.mm.plugin.location.ui.d.fE(false));
    if ((this.type != 0) && (this.type != 3))
    {
      this.mCg.mCw.setVisibility(0);
      this.mCg.mCx.setVisibility(8);
      this.mCg.mCw.setEnabled(false);
      this.mCg.mCw.setImageResource(R.g.aXV);
    }
    this.mCg.mzn.setBuiltInZoomControls(false);
    this.mCg.mCv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9710249967616L, 72347);
        a.this.aLm();
        a.this.aLo();
        a.this.activity.finish();
        GMTrace.o(9710249967616L, 72347);
      }
    });
    this.mCg.mCy.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9679648325632L, 72119);
        GMTrace.o(9679648325632L, 72119);
      }
    });
    aLn();
    GMTrace.o(9682198462464L, 72138);
  }
  
  protected abstract String Qb();
  
  protected final void a(n paramn)
  {
    GMTrace.i(9680185196544L, 72123);
    this.mCg.mzn.addLocationPin(paramn.mzm);
    GMTrace.o(9680185196544L, 72123);
  }
  
  protected final void aLj()
  {
    GMTrace.i(9681258938368L, 72131);
    if ((this.mCg.mCA == null) || (this.mCg.mCB == null))
    {
      GMTrace.o(9681258938368L, 72131);
      return;
    }
    this.mCg.mCA.setText(h.b(this.mCg.mCA.getContext(), this.myO, this.mCg.mCA.getTextSize()));
    if ((this.mCm == null) || (this.mCm.isEmpty()))
    {
      this.mCg.mCB.setText("");
      GMTrace.o(9681258938368L, 72131);
      return;
    }
    String str1 = (String)this.mCm.get(0);
    String str2 = this.activity.getResources().getString(R.l.duW);
    int i = 1;
    while (i < this.mCm.size())
    {
      str1 = str1 + str2 + (String)this.mCm.get(i);
      i += 1;
    }
    this.mCg.mCB.setText(h.b(this.mCg.mCB.getContext(), str1, this.mCg.mCB.getTextSize()));
    GMTrace.o(9681258938368L, 72131);
  }
  
  protected final void aLk()
  {
    GMTrace.i(9681393156096L, 72132);
    this.mCg.mCu.removeAllViews();
    View localView = View.inflate(this.activity, R.i.cAO, null);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(12);
    this.mCg.mCu.addView(localView, localLayoutParams);
    this.mCg.mCA = ((TextView)localView.findViewById(R.h.bLg));
    this.mCg.mCA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9676963971072L, 72099);
        paramAnonymousView = new Intent(a.this.activity, RemarkUI.class);
        paramAnonymousView.putExtra("key_nullable", true);
        paramAnonymousView.putExtra("key_value", a.this.aLl());
        paramAnonymousView.putExtra("key_hint", a.this.getString(R.l.dGI));
        paramAnonymousView.putExtra("Kwebmap_locaion", a.this.mCe.mwJ);
        paramAnonymousView.putExtra("kFavInfoLocalId", a.this.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L));
        paramAnonymousView.putExtra("kRemark", a.this.activity.getIntent().getStringExtra("kRemark"));
        a.this.activity.startActivityForResult(paramAnonymousView, 4096);
        GMTrace.o(9676963971072L, 72099);
      }
    });
    this.mCg.mCB = ((TextView)localView.findViewById(R.h.bLk));
    this.mCg.mCB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9706760306688L, 72321);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("key_fav_item_id", a.this.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L));
        paramAnonymousView.putExtra("key_fav_result_list", a.this.activity.getIntent().getStringArrayListExtra("kTags"));
        com.tencent.mm.bj.d.b(a.this.activity, "favorite", ".ui.FavTagEditUI", paramAnonymousView, 4100);
        GMTrace.o(9706760306688L, 72321);
      }
    });
    aLj();
    GMTrace.o(9681393156096L, 72132);
  }
  
  protected final String aLl()
  {
    GMTrace.i(9681527373824L, 72133);
    String str = bg.aq(this.myO, "");
    GMTrace.o(9681527373824L, 72133);
    return str;
  }
  
  protected abstract void aLm();
  
  abstract void aLn();
  
  protected final void aLo()
  {
    GMTrace.i(9682466897920L, 72140);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.activity.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(9682466897920L, 72140);
      return;
    }
    Object localObject = this.activity.getCurrentFocus();
    if (localObject == null)
    {
      GMTrace.o(9682466897920L, 72140);
      return;
    }
    localObject = ((View)localObject).getWindowToken();
    if (localObject == null)
    {
      GMTrace.o(9682466897920L, 72140);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
    GMTrace.o(9682466897920L, 72140);
  }
  
  public boolean aLp()
  {
    GMTrace.i(9682601115648L, 72141);
    GMTrace.o(9682601115648L, 72141);
    return true;
  }
  
  protected final boolean c(LocationInfo paramLocationInfo)
  {
    GMTrace.i(9681795809280L, 72135);
    if (this.mCg.mzn.getIController() == null)
    {
      GMTrace.o(9681795809280L, 72135);
      return false;
    }
    if (!e.h(paramLocationInfo.mwH, paramLocationInfo.mwI))
    {
      GMTrace.o(9681795809280L, 72135);
      return false;
    }
    this.mCg.mzn.getIController().animateTo(paramLocationInfo.mwH, paramLocationInfo.mwI);
    GMTrace.o(9681795809280L, 72135);
    return true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9680587849728L, 72126);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.BaseMapUI", "dispatchKeyEvent");
      aLm();
      this.activity.finish();
      GMTrace.o(9680587849728L, 72126);
      return true;
    }
    GMTrace.o(9680587849728L, 72126);
    return false;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9679916761088L, 72121);
    GMTrace.o(9679916761088L, 72121);
    return false;
  }
  
  public final View findViewById(int paramInt)
  {
    GMTrace.i(9681930027008L, 72136);
    View localView = this.activity.findViewById(paramInt);
    GMTrace.o(9681930027008L, 72136);
    return localView;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(9681124720640L, 72130);
    String str = this.activity.getString(paramInt);
    GMTrace.o(9681124720640L, 72130);
    return str;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9682332680192L, 72139);
    if (-1 != paramInt2)
    {
      GMTrace.o(9682332680192L, 72139);
      return;
    }
    if (4096 == paramInt1)
    {
      if (this.mCg.mCA == null)
      {
        GMTrace.o(9682332680192L, 72139);
        return;
      }
      paramIntent = paramIntent.getCharSequenceExtra("key_result");
      if (paramIntent == null) {}
      for (paramIntent = "";; paramIntent = paramIntent.toString())
      {
        this.myO = paramIntent;
        aLj();
        GMTrace.o(9682332680192L, 72139);
        return;
      }
    }
    if (4100 == paramInt1)
    {
      if (this.mCg.mCB == null)
      {
        GMTrace.o(9682332680192L, 72139);
        return;
      }
      this.mCm = paramIntent.getStringArrayListExtra("key_fav_result_list");
      aLj();
    }
    GMTrace.o(9682332680192L, 72139);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(9680050978816L, 72122);
    this.activity.finish();
    GMTrace.o(9680050978816L, 72122);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9680319414272L, 72124);
    this.mCq = com.tencent.mm.modelgeo.c.Ir();
    LocationInfo localLocationInfo1 = this.mCf;
    LocationInfo localLocationInfo2 = this.mCe;
    paramBundle = v.d(ab.bPV());
    w.d("MicroMsg.BaseMapUI", " initLanguage " + paramBundle);
    if (paramBundle.equals("language_default"))
    {
      v.a(this.activity, Locale.ENGLISH);
      paramBundle = "en";
    }
    for (;;)
    {
      localLocationInfo2.mwK = paramBundle;
      localLocationInfo1.mwK = paramBundle;
      w.d("MicroMsg.BaseMapUI", "sosomap " + this.mCe.mwK);
      this.activity.requestWindowFeature(1);
      this.activity.setContentView(R.i.czD);
      ((FrameLayout)findViewById(R.h.bLZ)).addView(d.cK(this.activity));
      this.mCd = new com.tencent.mm.plugin.location.ui.d(this.activity);
      this.mCg = new a();
      this.myO = this.activity.getIntent().getStringExtra("kRemark");
      this.mCm = this.activity.getIntent().getStringArrayListExtra("kTags");
      this.type = this.activity.getIntent().getIntExtra("map_view_type", 0);
      this.mCb = this.activity.getIntent().getBooleanExtra("kIs_pick_poi", false);
      w.i("MicroMsg.BaseMapUI", "isPickPoi " + this.mCb);
      GMTrace.o(9680319414272L, 72124);
      return;
      Locale localLocale = v.RN(paramBundle);
      v.a(this.activity, localLocale);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(9680990502912L, 72129);
    this.mCj.a(this.mCr);
    w.d("MicroMsg.BaseMapUI", "destory");
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    System.gc();
    GMTrace.o(9680990502912L, 72129);
  }
  
  public void onPause()
  {
    GMTrace.i(9680856285184L, 72128);
    ac.a(false, new Intent().putExtra("classname", getClass().getName()));
    GMTrace.o(9680856285184L, 72128);
  }
  
  public void onResume()
  {
    GMTrace.i(9680722067456L, 72127);
    ac.a(true, new Intent().putExtra("classname", getClass().getName()));
    GMTrace.o(9680722067456L, 72127);
  }
  
  final class a
  {
    TextView mCA;
    TextView mCB;
    TextView mCC;
    FrameLayout mCt;
    RelativeLayout mCu;
    View mCv;
    ImageButton mCw;
    View mCx;
    TextView mCy;
    TextView mCz;
    com.tencent.mm.plugin.p.d mzn;
    TextView titleView;
    
    a()
    {
      GMTrace.i(9690788397056L, 72202);
      GMTrace.o(9690788397056L, 72202);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */