package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMTabView;

public class EmojiStoreV2TabView
  extends RelativeLayout
{
  private int kuK;
  private int kuL;
  private Bitmap kuM;
  private LinearLayout kuN;
  private ImageView kuO;
  private MMTabView kuP;
  private MMTabView kuQ;
  a kuR;
  protected View.OnClickListener kuS;
  private Matrix mMatrix;
  
  public EmojiStoreV2TabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11508364869632L, 85744);
    this.kuL = 0;
    this.mMatrix = new Matrix();
    this.kuS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11486353162240L, 85580);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if (EmojiStoreV2TabView.a(EmojiStoreV2TabView.this) != null) {
          EmojiStoreV2TabView.a(EmojiStoreV2TabView.this).mS(i);
        }
        GMTrace.o(11486353162240L, 85580);
      }
    };
    init();
    GMTrace.o(11508364869632L, 85744);
  }
  
  public EmojiStoreV2TabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11508230651904L, 85743);
    this.kuL = 0;
    this.mMatrix = new Matrix();
    this.kuS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11486353162240L, 85580);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if (EmojiStoreV2TabView.a(EmojiStoreV2TabView.this) != null) {
          EmojiStoreV2TabView.a(EmojiStoreV2TabView.this).mS(i);
        }
        GMTrace.o(11486353162240L, 85580);
      }
    };
    init();
    GMTrace.o(11508230651904L, 85743);
  }
  
  private void init()
  {
    GMTrace.i(11508633305088L, 85746);
    this.kuN = new LinearLayout(getContext());
    this.kuN.setBackgroundResource(R.e.white);
    this.kuN.setId(R.h.bwm);
    this.kuN.setOrientation(0);
    Object localObject = new RelativeLayout.LayoutParams(-1, -2);
    addView(this.kuN, (ViewGroup.LayoutParams)localObject);
    this.kuO = new ImageView(getContext());
    this.kuO.setImageMatrix(this.mMatrix);
    this.kuO.setScaleType(ImageView.ScaleType.MATRIX);
    this.kuO.setId(R.h.bwn);
    localObject = new RelativeLayout.LayoutParams(-1, a.fromDPToPix(getContext(), 3));
    ((RelativeLayout.LayoutParams)localObject).addRule(8, R.h.bwm);
    addView(this.kuO, (ViewGroup.LayoutParams)localObject);
    this.kuP = mQ(0);
    this.kuP.setText(R.l.doK);
    localObject = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.aSW));
    ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
    this.kuN.addView(this.kuP, (ViewGroup.LayoutParams)localObject);
    this.kuQ = mQ(1);
    this.kuQ.setText(R.l.doO);
    localObject = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.aSW));
    ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
    this.kuN.addView(this.kuQ, (ViewGroup.LayoutParams)localObject);
    GMTrace.o(11508633305088L, 85746);
  }
  
  private MMTabView mQ(int paramInt)
  {
    GMTrace.i(11508767522816L, 85747);
    MMTabView localMMTabView = new MMTabView(getContext(), paramInt);
    localMMTabView.setTag(Integer.valueOf(paramInt));
    localMMTabView.setOnClickListener(this.kuS);
    GMTrace.o(11508767522816L, 85747);
    return localMMTabView;
  }
  
  public final void dZ(boolean paramBoolean)
  {
    GMTrace.i(11509170176000L, 85750);
    if (this.kuQ != null) {
      this.kuQ.ln(paramBoolean);
    }
    GMTrace.o(11509170176000L, 85750);
  }
  
  public final void h(int paramInt, float paramFloat)
  {
    GMTrace.i(11508901740544L, 85748);
    this.mMatrix.setTranslate(this.kuK * (paramInt + paramFloat), 0.0F);
    this.kuO.setImageMatrix(this.mMatrix);
    GMTrace.o(11508901740544L, 85748);
  }
  
  public final void mR(int paramInt)
  {
    GMTrace.i(11509035958272L, 85749);
    this.kuL = paramInt;
    MMTabView localMMTabView = this.kuP;
    if (this.kuL == 0)
    {
      localColorStateList = getResources().getColorStateList(R.e.aPp);
      localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.kuQ;
      if (this.kuL != 1) {
        break label93;
      }
    }
    label93:
    for (ColorStateList localColorStateList = getResources().getColorStateList(R.e.aPp);; localColorStateList = getResources().getColorStateList(R.e.aOi))
    {
      localMMTabView.setTextColor(localColorStateList);
      GMTrace.o(11509035958272L, 85749);
      return;
      localColorStateList = getResources().getColorStateList(R.e.aOi);
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(11508499087360L, 85745);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.kuK = ((paramInt3 - paramInt1) / 2);
    paramInt2 = this.kuK;
    if ((this.kuM == null) || (this.kuM.getWidth() != paramInt2)) {
      if (this.kuM != null) {
        break label168;
      }
    }
    label168:
    for (paramInt1 = -1;; paramInt1 = this.kuM.getWidth())
    {
      w.w("MicroMsg.emoji.EmojiStoreV2TabView", "sharp width changed, from %d to %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.kuM = Bitmap.createBitmap(paramInt2, a.fromDPToPix(getContext(), 3), Bitmap.Config.ARGB_8888);
      new Canvas(this.kuM).drawColor(getResources().getColor(R.e.aPp));
      h(this.kuL, 0.0F);
      this.kuO.setImageBitmap(this.kuM);
      mR(this.kuL);
      GMTrace.o(11508499087360L, 85745);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void mS(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2TabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */