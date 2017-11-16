package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.ui.MMActivity;

public final class d
  extends i
{
  private TextView jCe;
  private View jKa;
  private TextView jKb;
  private TextView jKc;
  
  public d()
  {
    GMTrace.i(4990483562496L, 37182);
    GMTrace.o(4990483562496L, 37182);
  }
  
  public final void MP()
  {
    GMTrace.i(4990617780224L, 37183);
    this.jKa = findViewById(R.h.bdp);
    this.jKb = ((TextView)findViewById(R.h.bdq));
    this.jCe = ((TextView)findViewById(R.h.cep));
    this.jKc = ((TextView)findViewById(R.h.blk));
    this.jKb.setOnClickListener(this.jKl.alz());
    this.jKa.setVisibility(8);
    GMTrace.o(4990617780224L, 37183);
  }
  
  public final void amM()
  {
    GMTrace.i(4990886215680L, 37185);
    this.jKa.setVisibility(8);
    GMTrace.o(4990886215680L, 37185);
  }
  
  public final void update()
  {
    GMTrace.i(4990751997952L, 37184);
    b localb = this.jKl.alv();
    Object localObject1 = this.jKl.aly();
    this.jKa.setVisibility(0);
    if (!TextUtils.isEmpty(localb.ajv().tZT))
    {
      this.jKb.setVisibility(0);
      this.jKb.setText(localb.ajv().tZT);
      if ((localb.ajb()) || ((localb.aja()) && (localb.ajd()))) {
        this.jKb.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.white));
      }
    }
    Object localObject2;
    for (;;)
    {
      localObject2 = this.jKa.findViewById(R.h.blx);
      if (!this.jKl.alA().amJ()) {
        break label552;
      }
      ((View)localObject2).setVisibility(0);
      this.jKc.setText(((MMActivity)localObject1).getString(R.l.ddE));
      this.jKc.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.white));
      int i = ((MMActivity)localObject1).getResources().getDimensionPixelOffset(R.f.aQE);
      localObject2 = (Button)this.jKa.findViewById(R.h.bli);
      ShapeDrawable localShapeDrawable1 = l.d((Context)localObject1, ((MMActivity)localObject1).getResources().getColor(R.e.white), i);
      ShapeDrawable localShapeDrawable2 = l.bN(((MMActivity)localObject1).getResources().getColor(R.e.white), i);
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable2);
      localStateListDrawable.addState(new int[0], localShapeDrawable1);
      ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
      i = l.uD(localb.ajv().gjg);
      int j = ((MMActivity)localObject1).getResources().getColor(R.e.white);
      ((Button)localObject2).setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j }));
      ((Button)localObject2).setOnClickListener(this.jKl.alz());
      localObject1 = this.jKa.findViewById(R.h.bNb);
      localObject2 = this.jKa.findViewById(R.h.bkw);
      if (localb.ajv().uah != 1) {
        break;
      }
      ((View)localObject1).setVisibility(0);
      ((View)localObject2).setVisibility(0);
      GMTrace.o(4990751997952L, 37184);
      return;
      if ((localb.aja()) && (localb.ajc()))
      {
        this.jKb.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.aNd));
        this.jKa.setBackgroundColor(((MMActivity)localObject1).getResources().getColor(R.e.aOz));
      }
      else
      {
        this.jKb.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.white));
        continue;
        this.jKb.setVisibility(8);
      }
    }
    ((View)localObject1).setVisibility(8);
    ((View)localObject2).setVisibility(8);
    GMTrace.o(4990751997952L, 37184);
    return;
    label552:
    ((View)localObject2).setVisibility(8);
    GMTrace.o(4990751997952L, 37184);
  }
  
  public final void ut(String paramString)
  {
    GMTrace.i(4991020433408L, 37186);
    this.jKc.setText(paramString);
    GMTrace.o(4991020433408L, 37186);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */