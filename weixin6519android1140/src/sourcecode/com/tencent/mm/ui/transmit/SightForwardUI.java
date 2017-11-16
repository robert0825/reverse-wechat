package com.tencent.mm.ui.transmit;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewStub;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.OnScrollListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.1;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.2;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.3;
import com.tencent.mm.plugin.sight.encode.ui.MainSightSelectContactView;
import com.tencent.mm.plugin.sight.encode.ui.SightCameraView;
import com.tencent.mm.plugin.sight.encode.ui.b;
import com.tencent.mm.plugin.sight.encode.ui.c;
import com.tencent.mm.plugin.sight.encode.ui.d.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.HashSet;

public class SightForwardUI
  extends MMActivity
{
  private String aBm;
  private MainSightForwardContainerView xmp;
  
  public SightForwardUI()
  {
    GMTrace.i(3051842699264L, 22738);
    GMTrace.o(3051842699264L, 22738);
  }
  
  protected final int Qf()
  {
    GMTrace.i(3051976916992L, 22739);
    GMTrace.o(3051976916992L, 22739);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3052245352448L, 22741);
    int i = R.i.cBb;
    GMTrace.o(3052245352448L, 22741);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3052111134720L, 22740);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    cN().cO().hide();
    this.aBm = getIntent().getStringExtra("sight_local_path");
    if (!com.tencent.mm.plugin.sight.base.d.GA(this.aBm))
    {
      w.e("MicroMsg.SightForwardUI", "Path:%s, NOT SIGHT!", new Object[] { this.aBm });
      finish();
      GMTrace.o(3052111134720L, 22740);
      return;
    }
    if (!at.AU())
    {
      w.e("MicroMsg.SightForwardUI", "acc not ready");
      finish();
      GMTrace.o(3052111134720L, 22740);
      return;
    }
    paramBundle = s.mj(String.valueOf(SystemClock.elapsedRealtime()));
    o.Nh();
    paramBundle = s.mk(paramBundle);
    if (e.o(this.aBm, paramBundle) <= 0L)
    {
      w.e("MicroMsg.SightForwardUI", "Copy File %s to %s FAIL!", new Object[] { this.aBm, paramBundle });
      finish();
      GMTrace.o(3052111134720L, 22740);
      return;
    }
    this.aBm = paramBundle;
    w.i("MicroMsg.SightForwardUI", "Doing Forward Sight, path %s", new Object[] { this.aBm });
    this.xmp = ((MainSightForwardContainerView)findViewById(R.h.bBe));
    this.xmp.oVc = new b()
    {
      public final void GD(String paramAnonymousString)
      {
        GMTrace.i(3045802901504L, 22693);
        Intent localIntent = new Intent(SightForwardUI.this.vKB.vKW, En_5b8fbb1e.class);
        localIntent.addFlags(67108864);
        localIntent.putExtra("Chat_User", paramAnonymousString);
        SightForwardUI.this.startActivity(localIntent);
        SightForwardUI.this.finish();
        GMTrace.o(3045802901504L, 22693);
      }
      
      public final void bhg()
      {
        GMTrace.i(17829348769792L, 132839);
        Intent localIntent = new Intent();
        localIntent.setClass(SightForwardUI.this.vKB.vKW, LauncherUI.class).addFlags(67108864);
        SightForwardUI.this.startActivity(localIntent);
        SightForwardUI.this.finish();
        GMTrace.o(17829348769792L, 132839);
      }
    };
    paramBundle = this.xmp;
    Object localObject1 = this.aBm;
    paramBundle.oVo = this;
    paramBundle.oVk = ((String)localObject1);
    paramBundle.oVi = g.bg((String)localObject1);
    long l = System.currentTimeMillis();
    paramBundle.oVl = 1.3333334F;
    paramBundle.oVb = ((SightCameraView)((ViewStub)paramBundle.findViewById(R.h.biL)).inflate());
    paramBundle.oVb.uc(com.tencent.mm.pluginsdk.l.a.mZr);
    paramBundle.oVb.an(paramBundle.oVl);
    paramBundle.oVb.setVisibility(0);
    paramBundle.oVf = paramBundle.findViewById(R.h.cid);
    paramBundle.oVf.setLayoutParams(new RelativeLayout.LayoutParams(-1, cN().cO().getHeight()));
    paramBundle.oVe = paramBundle.findViewById(R.h.bLT);
    paramBundle.mPu = paramBundle.findViewById(R.h.bLU);
    paramBundle.oVd = paramBundle.findViewById(R.h.biK);
    paramBundle.oVe.setOnClickListener(new MainSightForwardContainerView.1(paramBundle));
    paramBundle.mPu.setOnClickListener(new MainSightForwardContainerView.2(paramBundle));
    paramBundle.bhf();
    w.d("MicroMsg.MainSightContainerView", "init concrol view use %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    this.xmp.bhe();
    paramBundle = this.xmp;
    if (paramBundle.oVa == null)
    {
      localObject1 = paramBundle.getResources().getDisplayMetrics();
      float f = ((DisplayMetrics)localObject1).widthPixels / paramBundle.oVl;
      paramBundle.oVa = ((MainSightSelectContactView)paramBundle.findViewById(R.h.cby));
      Object localObject2 = paramBundle.oVa;
      MMFragmentActivity localMMFragmentActivity = paramBundle.oVo;
      int i = (int)(((DisplayMetrics)localObject1).heightPixels - f);
      int j = ((DisplayMetrics)localObject1).heightPixels;
      ((MainSightSelectContactView)localObject2).oVo = localMMFragmentActivity;
      ((MainSightSelectContactView)localObject2).oVN = i;
      ((MainSightSelectContactView)localObject2).oVS = paramBundle;
      ((MainSightSelectContactView)localObject2).addView(View.inflate(((MainSightSelectContactView)localObject2).getContext(), R.i.cBc, null), -1, -2);
      ((MainSightSelectContactView)localObject2).Ev = ((ListView)((MainSightSelectContactView)localObject2).findViewById(R.h.cbx));
      ((MainSightSelectContactView)localObject2).oVQ = new c((l)localObject2);
      ((MainSightSelectContactView)localObject2).oVT = new LinearLayout(((MainSightSelectContactView)localObject2).getContext());
      ((MainSightSelectContactView)localObject2).oVT.addView(new View(((MainSightSelectContactView)localObject2).getContext()), -1, ((MainSightSelectContactView)localObject2).oVS.bhb() - ((MainSightSelectContactView)localObject2).oVN);
      ((MainSightSelectContactView)localObject2).oVT.getChildAt(0).setBackgroundColor(0);
      ((MainSightSelectContactView)localObject2).Ev.addHeaderView(((MainSightSelectContactView)localObject2).oVT);
      ((MainSightSelectContactView)localObject2).Ev.setAdapter(((MainSightSelectContactView)localObject2).oVQ);
      ((MainSightSelectContactView)localObject2).Ev.setOnItemClickListener(paramBundle);
      ((MainSightSelectContactView)localObject2).oVX = new HashSet();
      ((MainSightSelectContactView)localObject2).oVY = new HashSet();
      ((MainSightSelectContactView)localObject2).Ev.setOnScrollListener((AbsListView.OnScrollListener)localObject2);
      ((MainSightSelectContactView)localObject2).oVO = new com.tencent.mm.plugin.sight.encode.ui.d();
      ((MainSightSelectContactView)localObject2).oVO.oVJ = ((d.a)localObject2);
      localObject2 = paramBundle.oVa;
      localObject1 = paramBundle.findViewById(R.h.caP);
      localObject2 = ((MainSightSelectContactView)localObject2).oVO;
      ((com.tencent.mm.plugin.sight.encode.ui.d)localObject2).oVF = ((View)localObject1);
      ((com.tencent.mm.plugin.sight.encode.ui.d)localObject2).oVD = ((EditText)((View)localObject1).findViewById(R.h.bvB));
      ((com.tencent.mm.plugin.sight.encode.ui.d)localObject2).oVE = ((TextView)((View)localObject1).findViewById(R.h.bZX));
      ((com.tencent.mm.plugin.sight.encode.ui.d)localObject2).oVD.setOnFocusChangeListener((View.OnFocusChangeListener)localObject2);
      ((com.tencent.mm.plugin.sight.encode.ui.d)localObject2).oVD.addTextChangedListener((TextWatcher)localObject2);
      ((com.tencent.mm.plugin.sight.encode.ui.d)localObject2).oVE.setOnClickListener((View.OnClickListener)localObject2);
      ((com.tencent.mm.plugin.sight.encode.ui.d)localObject2).oVH = ((InputMethodManager)((View)localObject1).getContext().getSystemService("input_method"));
      paramBundle.oVa.oVR = paramBundle.findViewById(R.h.bww);
      paramBundle.oVa.oVS = paramBundle;
    }
    paramBundle.hB(true);
    paramBundle.oVb.postDelayed(new MainSightForwardContainerView.3(paramBundle), 50L);
    GMTrace.o(3052111134720L, 22740);
  }
  
  protected void onPause()
  {
    GMTrace.i(3052513787904L, 22743);
    super.onPause();
    this.xmp.onPause();
    GMTrace.o(3052513787904L, 22743);
  }
  
  protected void onResume()
  {
    GMTrace.i(3052379570176L, 22742);
    super.onResume();
    this.xmp.onResume();
    GMTrace.o(3052379570176L, 22742);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\transmit\SightForwardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */