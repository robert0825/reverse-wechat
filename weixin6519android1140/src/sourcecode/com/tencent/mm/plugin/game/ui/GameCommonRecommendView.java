package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.game.c.bz;
import com.tencent.mm.plugin.game.c.ca;
import com.tencent.mm.plugin.game.c.g;
import com.tencent.mm.plugin.game.c.p;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.widget.CircleImageView;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public class GameCommonRecommendView
  extends LinearLayout
  implements View.OnClickListener
{
  private LayoutInflater CJ;
  int lNQ;
  int lVF;
  private View lVG;
  private TextView lVH;
  private TextView lVI;
  private LinearLayout lVJ;
  private FrameLayout lVK;
  private TextView lVL;
  private ImageView lVM;
  private View lVN;
  private ImageView lVO;
  private ImageView lVP;
  private TextView lVQ;
  private TextView lVR;
  private View lVS;
  private ImageView lVT;
  private ImageView lVU;
  private TextView lVV;
  private TextView lVW;
  private Context mContext;
  
  public GameCommonRecommendView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12708539793408L, 94686);
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(12708539793408L, 94686);
  }
  
  final void a(ca paramca)
  {
    GMTrace.i(12708808228864L, 94688);
    this.lVH.setText(paramca.lSL.eBt);
    if (!bg.nm(paramca.lSL.lPG)) {
      this.lVI.setText(paramca.lSL.lPG);
    }
    if (bg.cc(paramca.lSL.lPH))
    {
      this.lVL.setText(paramca.lSL.lPj);
      if (!bg.nm(paramca.lSL.lPD)) {
        e.aGQ().g(this.lVM, paramca.lSL.lPD);
      }
      this.lVG.setTag(new a(1, paramca.lSL.lPE, paramca.lSL.lPF));
      this.lVG.setOnClickListener(this);
      if (this.lVF == 2) {
        ai.a(this.mContext, 1018, 1, null, this.lNQ, ai.zJ(paramca.lSL.lPF));
      }
      if (!bg.nm(paramca.lSM.lSK))
      {
        this.lVO.setVisibility(0);
        e.aGQ().g(this.lVO, paramca.lSM.lSK);
      }
      if (!bg.nm(paramca.lSM.lRV)) {
        e.aGQ().g(this.lVP, paramca.lSM.lRV);
      }
      this.lVQ.setText(paramca.lSM.eBt);
      this.lVR.setText(paramca.lSM.lPj);
      this.lVN.setTag(new a(2, paramca.lSM.lPE, paramca.lSM.lPF));
      this.lVN.setOnClickListener(this);
      if (this.lVF == 2) {
        ai.a(this.mContext, 1018, 2, null, this.lNQ, ai.zJ(paramca.lSM.lPF));
      }
      if (!bg.nm(paramca.lSN.lSK))
      {
        this.lVT.setVisibility(0);
        e.aGQ().g(this.lVT, paramca.lSN.lSK);
      }
      if (!bg.nm(paramca.lSN.lRV)) {
        e.aGQ().g(this.lVU, paramca.lSN.lRV);
      }
      this.lVV.setText(paramca.lSN.eBt);
      this.lVW.setText(paramca.lSN.lPj);
      this.lVS.setTag(new a(3, paramca.lSN.lPE, paramca.lSN.lPF));
      this.lVS.setOnClickListener(this);
      if (this.lVF == 2) {
        ai.a(this.mContext, 1018, 3, null, this.lNQ, ai.zJ(paramca.lSN.lPF));
      }
      GMTrace.o(12708808228864L, 94688);
      return;
    }
    Object localObject1 = new StringBuffer();
    this.lVK.removeAllViews();
    this.lVK.setVisibility(8);
    Iterator localIterator = paramca.lSL.lPH.iterator();
    do
    {
      p localp;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localp = (p)localIterator.next();
      } while (localp == null);
      if ((!bg.nm(localp.lQe)) && (!bg.nm(localp.jio)))
      {
        LinearLayout localLinearLayout = (LinearLayout)this.CJ.inflate(R.i.cHq, this.lVK, false);
        CircleImageView localCircleImageView = (CircleImageView)localLinearLayout.findViewById(R.h.bZl);
        Object localObject2 = (FrameLayout.LayoutParams)localLinearLayout.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject2).leftMargin = (this.lVK.getChildCount() * a.fromDPToPix(this.mContext, 15));
        localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject2 = new e.a.a();
        ((e.a.a)localObject2).mee = R.g.aWS;
        e.aGQ().a(localCircleImageView, localp.lQe, ((e.a.a)localObject2).aGR());
        this.lVK.addView(localLinearLayout, 0);
        ((StringBuffer)localObject1).append(localp.jio);
        ((StringBuffer)localObject1).append("、");
      }
    } while (this.lVK.getChildCount() < 3);
    if (this.lVK.getChildCount() > 0) {
      this.lVK.setVisibility(0);
    }
    if (((StringBuffer)localObject1).length() > 0) {}
    for (localObject1 = ((StringBuffer)localObject1).substring(0, ((StringBuffer)localObject1).length() - 1);; localObject1 = "")
    {
      this.lVL.setText(h.b(this.mContext, (CharSequence)localObject1, this.lVL.getTextSize()));
      break;
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12708942446592L, 94689);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      GMTrace.o(12708942446592L, 94689);
      return;
    }
    paramView = (a)paramView.getTag();
    int i = c.aa(this.mContext, paramView.jumpUrl);
    ai.a(this.mContext, 10, 1018, paramView.position, i, this.lNQ, ai.zJ(paramView.lLN));
    GMTrace.o(12708942446592L, 94689);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12708674011136L, 94687);
    super.onFinishInflate();
    this.lVG = findViewById(R.h.bXE);
    this.lVH = ((TextView)findViewById(R.h.bXH));
    this.lVI = ((TextView)findViewById(R.h.bXG));
    this.lVJ = ((LinearLayout)findViewById(R.h.bXC));
    this.lVK = ((FrameLayout)findViewById(R.h.bXD));
    this.lVL = ((TextView)findViewById(R.h.bXB));
    this.lVM = ((ImageView)findViewById(R.h.bXF));
    this.lVN = findViewById(R.h.bXu);
    this.lVO = ((ImageView)findViewById(R.h.bXr));
    this.lVP = ((ImageView)findViewById(R.h.bXt));
    this.lVQ = ((TextView)findViewById(R.h.bXv));
    this.lVR = ((TextView)findViewById(R.h.bXs));
    this.lVS = findViewById(R.h.bXz);
    this.lVT = ((ImageView)findViewById(R.h.bXw));
    this.lVU = ((ImageView)findViewById(R.h.bXy));
    this.lVV = ((TextView)findViewById(R.h.bXA));
    this.lVW = ((TextView)findViewById(R.h.bXx));
    if (c.getScreenWidth(this.mContext) < 720)
    {
      this.lVQ.setTextSize(a.fromDPToPix(this.mContext, 12));
      this.lVR.setTextSize(a.fromDPToPix(this.mContext, 12));
      this.lVV.setTextSize(a.fromDPToPix(this.mContext, 12));
      this.lVW.setTextSize(a.fromDPToPix(this.mContext, 12));
    }
    w.i("MicroMsg.GameCommonRecommendView", "initView finished");
    GMTrace.o(12708674011136L, 94687);
  }
  
  private static final class a
  {
    String jumpUrl;
    String lLN;
    int position;
    
    public a(int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(12686662303744L, 94523);
      this.position = paramInt;
      this.jumpUrl = paramString1;
      this.lLN = paramString2;
      GMTrace.o(12686662303744L, 94523);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameCommonRecommendView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */