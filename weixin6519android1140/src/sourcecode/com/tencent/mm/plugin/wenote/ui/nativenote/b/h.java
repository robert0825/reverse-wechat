package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.t;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.g.a.km;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public abstract class h
  extends a
{
  public static float sjJ;
  public static int sjK;
  public static int sjL;
  public ImageView eId;
  public View.OnClickListener lXS;
  public View sjA;
  public LinearLayout sjB;
  public LinearLayout sjC;
  public LinearLayout sjD;
  public LinearLayout sjE;
  public LinearLayout sjF;
  public LinearLayout sjG;
  public LinearLayout sjH;
  public LinearLayout sjI;
  public WXRTEditText sju;
  public WXRTEditText sjv;
  public LinearLayout sjw;
  public TextView sjx;
  public TextView sjy;
  public ImageView sjz;
  
  static
  {
    GMTrace.i(17159602307072L, 127849);
    sjJ = Resources.getSystem().getDisplayMetrics().density;
    sjK = Resources.getSystem().getDisplayMetrics().widthPixels;
    sjL = (int)(40.0F * sjJ + 0.5F);
    GMTrace.o(17159602307072L, 127849);
  }
  
  public h(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(17159333871616L, 127847);
    this.lXS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20586180902912L, 153379);
        if (h.this.shJ.bHW() != null)
        {
          w.e("Micromsg.NoteOtherItemHolder", "click item , now is editing, quit it");
          GMTrace.o(20586180902912L, 153379);
          return;
        }
        if (h.this.shJ.sfG == 2)
        {
          k localk = h.this.shJ;
          if (localk.sfs != null) {
            localk.sfs.ctX();
          }
          h.this.shJ.bHY();
        }
        int i = ((RecyclerView.t)paramAnonymousView.getTag()).gd();
        paramAnonymousView = new km();
        if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(i) == null)
        {
          w.e("Micromsg.NoteOtherItemHolder", "click not response, null == NoteDataManager.getMgr().get(position),position is %d,datalist size = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().size()) });
          GMTrace.o(20586180902912L, 153379);
          return;
        }
        if (com.tencent.mm.plugin.wenote.model.b.bGM().sbA == null)
        {
          w.e("Micromsg.NoteOtherItemHolder", "getWnNoteBase is null");
          GMTrace.o(20586180902912L, 153379);
          return;
        }
        w.i("Micromsg.NoteOtherItemHolder", "click item, type is %d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(i).getType()) });
        paramAnonymousView.eOE.eOG = ((n)com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(i)).sde;
        paramAnonymousView.eOE.context = ab.getContext();
        paramAnonymousView.eOE.type = 1;
        com.tencent.mm.plugin.wenote.model.b.bGM().sbA.b(paramAnonymousView);
        GMTrace.o(20586180902912L, 153379);
      }
    };
    this.eId = ((ImageView)paramView.findViewById(R.h.bvy));
    this.sjA = paramView.findViewById(R.h.ckb);
    this.sjw = ((LinearLayout)paramView.findViewById(R.h.bRu));
    this.sjB = ((LinearLayout)paramView.findViewById(R.h.bRN));
    this.sjx = ((TextView)paramView.findViewById(R.h.bRv));
    this.sjy = ((TextView)paramView.findViewById(R.h.bRs));
    this.sjz = ((ImageView)paramView.findViewById(R.h.bRt));
    this.sjx.setTextSize(16.0F);
    this.sjy.setTextSize(12.0F);
    this.sjC = ((LinearLayout)paramView.findViewById(R.h.bRL));
    this.sjC.setVisibility(8);
    this.sjE = ((LinearLayout)paramView.findViewById(R.h.bRG));
    this.sjE.setVisibility(8);
    this.sjF = ((LinearLayout)paramView.findViewById(R.h.bRr));
    this.sjF.setVisibility(8);
    this.sjG = ((LinearLayout)paramView.findViewById(R.h.bSD));
    this.sjG.setBackgroundColor(1347529272);
    this.sjG.setVisibility(8);
    this.sjG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17158528565248L, 127841);
        e.bIb().bIf();
        GMTrace.o(17158528565248L, 127841);
      }
    });
    this.sjH = ((LinearLayout)paramView.findViewById(R.h.bSH));
    this.sjH.setBackgroundColor(1347529272);
    this.sjH.setVisibility(4);
    this.sjI = ((LinearLayout)paramView.findViewById(R.h.bSF));
    this.sjI.setBackgroundColor(1347529272);
    this.sjI.setVisibility(4);
    this.sjD = ((LinearLayout)paramView.findViewById(R.h.bvA));
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.sjD.getLayoutParams();
    localLayoutParams.width = (sjK - sjL);
    localLayoutParams.height = -2;
    this.sjD.setLayoutParams(localLayoutParams);
    this.sjv = ((WXRTEditText)paramView.findViewById(R.h.biy));
    this.sju = ((WXRTEditText)paramView.findViewById(R.h.biA));
    ((LinearLayout)paramView.findViewById(R.h.biz)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17160273395712L, 127854);
        h.this.sjv.bHJ();
        h.this.sjv.requestFocus();
        GMTrace.o(17160273395712L, 127854);
      }
    });
    ((LinearLayout)paramView.findViewById(R.h.biB)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17159199653888L, 127846);
        h.this.sju.bHJ();
        h.this.sju.requestFocus();
        GMTrace.o(17159199653888L, 127846);
      }
    });
    this.sjv.seM = 2;
    this.sju.seM = 1;
    this.sju.seO = this;
    this.sjv.seO = this;
    if ((paramk.sfG != 2) || (!this.shJ.sfH))
    {
      this.sjv.setKeyListener(null);
      this.sjv.setEnabled(false);
      this.sjv.setFocusable(false);
      this.sju.setKeyListener(null);
      this.sju.setEnabled(false);
      this.sju.setFocusable(false);
    }
    this.shJ.o(this.sju);
    this.shJ.o(this.sjv);
    GMTrace.o(17159333871616L, 127847);
  }
  
  public void a(com.tencent.mm.plugin.wenote.model.a.b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(17159468089344L, 127848);
    w.i("Micromsg.NoteOtherItemHolder", "ImageItemHolder position is " + gb());
    this.sju.seZ = paramInt1;
    this.sjv.seZ = paramInt1;
    if (e.isEnabled()) {
      e.bIb().a(this.sjG, this.sjH, this.sjI, paramInt1);
    }
    paramb.scK = this.sju;
    paramb.scL = this.sjv;
    paramb.scM = null;
    if (paramb.scH) {
      if (paramb.scN) {
        this.sju.requestFocus();
      }
    }
    while (this.sjw.getVisibility() == 0) {
      if (paramb.scO)
      {
        this.sjw.setBackgroundResource(R.g.bcf);
        GMTrace.o(17159468089344L, 127848);
        return;
        this.sjv.requestFocus();
        continue;
        if (this.sju.hasFocus()) {
          this.sju.clearFocus();
        }
        if (this.sjv.hasFocus()) {
          this.sjv.clearFocus();
        }
      }
      else
      {
        this.sjw.setBackgroundResource(R.g.bce);
      }
    }
    GMTrace.o(17159468089344L, 127848);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */