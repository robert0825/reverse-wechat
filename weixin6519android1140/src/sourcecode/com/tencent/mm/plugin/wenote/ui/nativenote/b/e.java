package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.bg;

public final class e
  extends h
{
  private int giI;
  private ImageView sjp;
  
  public e(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(17156381081600L, 127825);
    this.giI = 0;
    this.eId.setVisibility(0);
    this.sjB.setVisibility(8);
    this.sjw.setVisibility(8);
    this.eId.setTag(this);
    this.eId.setOnClickListener(this.lXS);
    this.sjp = ((ImageView)paramView.findViewById(R.h.bGT));
    this.sjp.setVisibility(8);
    this.giI = (k.mScreenWidth - (int)k.ak(20.0F));
    GMTrace.o(17156381081600L, 127825);
  }
  
  public final void a(com.tencent.mm.plugin.wenote.model.a.b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(17156515299328L, 127826);
    Object localObject1 = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).eOR;
    Object localObject2 = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).sdg;
    if (!com.tencent.mm.a.e.aZ((String)localObject1)) {
      if (com.tencent.mm.a.e.aZ((String)localObject2)) {
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      if (this.shJ.sfG == 3) {
        if (com.tencent.mm.a.e.aZ((String)localObject2)) {
          localObject1 = localObject2;
        }
      }
      for (;;)
      {
        label69:
        if (bg.nm((String)localObject1))
        {
          localObject1 = null;
          label80:
          this.eId.setImageBitmap(null);
          localObject2 = this.eId.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject2).width = -1;
          ((ViewGroup.LayoutParams)localObject2).height = -1;
          this.eId.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          if (localObject1 == null) {
            break label182;
          }
          this.eId.setImageBitmap((Bitmap)localObject1);
          label132:
          if (!paramb.scO) {
            break label241;
          }
          this.sjp.setVisibility(0);
        }
        for (;;)
        {
          super.a(paramb, paramInt1, paramInt2);
          GMTrace.o(17156515299328L, 127826);
          return;
          localObject1 = null;
          break;
          break label69;
          localObject1 = com.tencent.mm.plugin.wenote.b.b.NM((String)localObject1);
          break label80;
          label182:
          this.eId.setImageBitmap(null);
          localObject1 = this.eId.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject1).width = this.giI;
          ((ViewGroup.LayoutParams)localObject1).height = this.giI;
          this.eId.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          this.eId.setBackgroundColor(Color.parseColor("#f6f6f6"));
          break label132;
          label241:
          this.sjp.setVisibility(8);
        }
      }
    }
  }
  
  public final int bIG()
  {
    GMTrace.i(17156649517056L, 127827);
    GMTrace.o(17156649517056L, 127827);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */