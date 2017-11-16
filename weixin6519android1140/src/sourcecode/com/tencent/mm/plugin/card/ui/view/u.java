package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.ui.MMActivity;

public final class u
  extends i
{
  private View jKG;
  
  public u()
  {
    GMTrace.i(4989946691584L, 37178);
    GMTrace.o(4989946691584L, 37178);
  }
  
  public final void MP()
  {
    GMTrace.i(4990080909312L, 37179);
    GMTrace.o(4990080909312L, 37179);
  }
  
  public final void amM()
  {
    GMTrace.i(4990349344768L, 37181);
    if (this.jKG != null) {
      this.jKG.setVisibility(8);
    }
    GMTrace.o(4990349344768L, 37181);
  }
  
  public final void update()
  {
    GMTrace.i(4990215127040L, 37180);
    if (this.jKG == null) {
      this.jKG = ((ViewStub)findViewById(R.h.bla)).inflate();
    }
    b localb = this.jKl.alv();
    MMActivity localMMActivity = this.jKl.aly();
    Object localObject = localb.ajw().tZn;
    TextView localTextView1;
    TextView localTextView2;
    LinearLayout localLinearLayout;
    LinearLayout.LayoutParams localLayoutParams1;
    LinearLayout.LayoutParams localLayoutParams2;
    if (this.jKG != null)
    {
      localTextView1 = (TextView)this.jKG.findViewById(R.h.blb);
      localTextView1.setText(((np)localObject).title);
      localTextView1.setTextColor(l.uD(localb.ajv().gjg));
      localTextView2 = (TextView)this.jKG.findViewById(R.h.bkZ);
      localLinearLayout = (LinearLayout)this.jKG.findViewById(R.h.blT);
      localLayoutParams1 = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
      if (!localb.ajc()) {
        break label434;
      }
      localLayoutParams2 = (LinearLayout.LayoutParams)localTextView1.getLayoutParams();
      if (TextUtils.isEmpty(((np)localObject).jxJ)) {
        break label409;
      }
      localTextView2.setText(((np)localObject).jxJ);
      localTextView2.setVisibility(0);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aRo);
      localLayoutParams2.bottomMargin = localMMActivity.getResources().getDimensionPixelSize(R.f.aPv);
      localObject = (LinearLayout.LayoutParams)localTextView2.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = localMMActivity.getResources().getDimensionPixelSize(R.f.aPv);
      localTextView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localTextView2.invalidate();
    }
    for (;;)
    {
      localLayoutParams2.height = localMMActivity.getResources().getDimensionPixelSize(R.f.aRq);
      localTextView1.setLayoutParams(localLayoutParams2);
      localTextView1.invalidate();
      int i = localMMActivity.getResources().getDimensionPixelSize(R.f.aRs);
      localTextView1.setBackgroundDrawable(l.e(localMMActivity, localb.ajv().gjg, i));
      localTextView1.setTextColor(l.R(localMMActivity, localb.ajv().gjg));
      localLinearLayout.setBackgroundDrawable(null);
      localTextView1.setOnClickListener(this.jKl.alz());
      localLinearLayout.setLayoutParams(localLayoutParams1);
      localLinearLayout.invalidate();
      this.jKG.invalidate();
      if (localb.ajc()) {
        localLinearLayout.getLayoutParams();
      }
      GMTrace.o(4990215127040L, 37180);
      return;
      label409:
      localTextView2.setVisibility(8);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aRp);
    }
    label434:
    if (!TextUtils.isEmpty(((np)localObject).jxJ))
    {
      localTextView2.setText(((np)localObject).jxJ);
      localTextView2.setVisibility(0);
    }
    for (localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aRw);; localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aRx))
    {
      localLinearLayout.setOnClickListener(this.jKl.alz());
      break;
      localTextView2.setVisibility(8);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */