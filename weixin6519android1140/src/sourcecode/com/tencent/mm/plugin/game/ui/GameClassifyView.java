package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.c.ci;
import com.tencent.mm.plugin.game.c.cj;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

public class GameClassifyView
  extends LinearLayout
  implements View.OnClickListener
{
  private int lNQ;
  private LayoutInflater lVD;
  private LinearLayout lgp;
  private Context mContext;
  
  public GameClassifyView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12709076664320L, 94690);
    this.mContext = paramContext;
    GMTrace.o(12709076664320L, 94690);
  }
  
  public final void a(cj paramcj, int paramInt1, int paramInt2)
  {
    GMTrace.i(12709345099776L, 94692);
    if ((paramcj == null) || (bg.cc(paramcj.lSa)))
    {
      setVisibility(8);
      GMTrace.o(12709345099776L, 94692);
      return;
    }
    this.lNQ = paramInt2;
    if (this.lVD == null) {
      this.lVD = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    }
    LinearLayout localLinearLayout;
    while (this.lgp.getChildCount() < paramcj.lSa.size())
    {
      localLinearLayout = (LinearLayout)this.lVD.inflate(R.i.cys, this, false);
      localLinearLayout.setOnClickListener(this);
      this.lgp.addView(localLinearLayout, new LinearLayout.LayoutParams(-2, -2, 1.0F));
    }
    paramInt2 = 0;
    if (paramInt2 < this.lgp.getChildCount())
    {
      if (paramInt2 < paramcj.lSa.size()) {
        this.lgp.getChildAt(paramInt2).setVisibility(0);
      }
      for (;;)
      {
        paramInt2 += 1;
        break;
        this.lgp.getChildAt(paramInt2).setVisibility(8);
      }
    }
    paramInt2 = 0;
    while (paramInt2 < paramcj.lSa.size())
    {
      localLinearLayout = (LinearLayout)this.lgp.getChildAt(paramInt2);
      ImageView localImageView = (ImageView)localLinearLayout.findViewById(R.h.bCM);
      TextView localTextView = (TextView)localLinearLayout.findViewById(R.h.bCN);
      e.aGQ().g(localImageView, ((ci)paramcj.lSa.get(paramInt2)).lRV);
      localTextView.setText(((ci)paramcj.lSa.get(paramInt2)).eBt);
      localLinearLayout.setTag(new a(((ci)paramcj.lSa.get(paramInt2)).lPE, paramInt2 + 1, ((ci)paramcj.lSa.get(paramInt2)).lPF));
      paramInt2 += 1;
    }
    setVisibility(0);
    if (paramInt1 == 2) {
      ai.a(this.mContext, 1019, 1, null, this.lNQ, null);
    }
    GMTrace.o(12709345099776L, 94692);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12709479317504L, 94693);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      GMTrace.o(12709479317504L, 94693);
      return;
    }
    paramView = (a)paramView.getTag();
    if (!bg.nm(paramView.url))
    {
      c.aa(this.mContext, paramView.url);
      ai.a(this.mContext, 10, 1019, paramView.position, 7, null, this.lNQ, paramView.extInfo);
    }
    GMTrace.o(12709479317504L, 94693);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12709210882048L, 94691);
    super.onFinishInflate();
    this.lVD = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    this.lgp = ((LinearLayout)findViewById(R.h.bEw));
    GMTrace.o(12709210882048L, 94691);
  }
  
  private static final class a
  {
    public String extInfo;
    public int position;
    public String url;
    
    public a(String paramString1, int paramInt, String paramString2)
    {
      GMTrace.i(12663576854528L, 94351);
      this.url = paramString1;
      this.position = paramInt;
      this.extInfo = paramString2;
      GMTrace.o(12663576854528L, 94351);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameClassifyView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */