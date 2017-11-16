package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class m
  extends h
{
  public ImageView sjW;
  public MMPinProgressBtn sjX;
  public ImageView sjY;
  private ImageView sjZ;
  
  public m(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(17159736524800L, 127850);
    this.sjW = ((ImageView)paramView.findViewById(R.h.cfI));
    this.sjX = ((MMPinProgressBtn)paramView.findViewById(R.h.ckv));
    this.sjY = ((ImageView)paramView.findViewById(R.h.ckG));
    this.sjW.setImageResource(R.k.cOK);
    this.sjZ = ((ImageView)paramView.findViewById(R.h.ckr));
    this.sjB.setVisibility(8);
    this.sjw.setVisibility(8);
    this.sjZ.setVisibility(8);
    this.sjA.setTag(this);
    this.sjA.setOnClickListener(this.lXS);
    GMTrace.o(17159736524800L, 127850);
  }
  
  public final void a(com.tencent.mm.plugin.wenote.model.a.b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(17159870742528L, 127851);
    j localj = (j)paramb;
    Object localObject3 = com.tencent.mm.plugin.wenote.b.b.NM(localj.eIy);
    Object localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject1 = localObject3;
      if (com.tencent.mm.a.e.aZ(localj.eOR))
      {
        localObject3 = c.Oi(localj.eOR);
        localObject1 = localObject3;
        if (localObject3 == null) {}
      }
    }
    for (;;)
    {
      try
      {
        if (com.tencent.mm.a.e.aZ(localj.eIy)) {
          com.tencent.mm.loader.stub.b.deleteFile(localj.eIy);
        }
        com.tencent.mm.pluginsdk.l.e.a((Bitmap)localObject3, Bitmap.CompressFormat.JPEG, localj.eIy);
        localObject1 = localObject3;
        if (localObject1 == null) {
          break label196;
        }
        localObject3 = this.sjY.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).width = -1;
        ((ViewGroup.LayoutParams)localObject3).height = -1;
        this.sjY.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        this.sjY.setImageBitmap((Bitmap)localObject1);
        this.sjY.setBackground(null);
        if (!paramb.scO) {
          break label272;
        }
        this.sjZ.setVisibility(0);
        super.a(paramb, paramInt1, paramInt2);
        GMTrace.o(17159870742528L, 127851);
        return;
      }
      catch (Exception localException)
      {
        localObject2 = localObject3;
      }
      continue;
      label196:
      Object localObject2 = this.sjY.getResources().getDisplayMetrics();
      float f = ((DisplayMetrics)localObject2).density;
      localObject3 = this.sjY.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject3).width = (((DisplayMetrics)localObject2).widthPixels - (int)(f * 40.0F + 0.5F));
      ((ViewGroup.LayoutParams)localObject3).height = (((ViewGroup.LayoutParams)localObject3).width * 52 / 68);
      this.sjY.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      continue;
      label272:
      this.sjZ.setVisibility(8);
    }
  }
  
  public final int bIG()
  {
    GMTrace.i(17160004960256L, 127852);
    GMTrace.o(17160004960256L, 127852);
    return 6;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */