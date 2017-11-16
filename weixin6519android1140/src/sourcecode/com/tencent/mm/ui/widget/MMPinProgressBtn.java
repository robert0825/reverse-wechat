package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.CompoundButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.m;

public class MMPinProgressBtn
  extends CompoundButton
{
  private Paint Ci;
  private int rr;
  private int style;
  public int xqu;
  private Paint xqv;
  private RectF xqw;
  private int xqx;
  private final float xqy;
  private Runnable xqz;
  
  public MMPinProgressBtn(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1629269000192L, 12139);
    this.xqw = new RectF();
    this.xqy = 4.0F;
    this.xqz = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1614639267840L, 12030);
        if (MMPinProgressBtn.this.getVisibility() != 0)
        {
          w.i("MicroMsg.MMPinProgressBtn", "cur progress bar not visiable, stop auto pregress");
          GMTrace.o(1614639267840L, 12030);
          return;
        }
        MMPinProgressBtn.a(MMPinProgressBtn.this, MMPinProgressBtn.a(MMPinProgressBtn.this) + 1);
        if (MMPinProgressBtn.a(MMPinProgressBtn.this) >= MMPinProgressBtn.b(MMPinProgressBtn.this))
        {
          MMPinProgressBtn.a(MMPinProgressBtn.this, MMPinProgressBtn.a(MMPinProgressBtn.this) - 1);
          w.i("MicroMsg.MMPinProgressBtn", "match auto progress max, return");
          GMTrace.o(1614639267840L, 12030);
          return;
        }
        MMPinProgressBtn.this.invalidate();
        MMPinProgressBtn.this.postDelayed(MMPinProgressBtn.c(MMPinProgressBtn.this), 200L);
        GMTrace.o(1614639267840L, 12030);
      }
    };
    b(paramContext, paramAttributeSet, 0);
    GMTrace.o(1629269000192L, 12139);
  }
  
  public MMPinProgressBtn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1629403217920L, 12140);
    this.xqw = new RectF();
    this.xqy = 4.0F;
    this.xqz = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1614639267840L, 12030);
        if (MMPinProgressBtn.this.getVisibility() != 0)
        {
          w.i("MicroMsg.MMPinProgressBtn", "cur progress bar not visiable, stop auto pregress");
          GMTrace.o(1614639267840L, 12030);
          return;
        }
        MMPinProgressBtn.a(MMPinProgressBtn.this, MMPinProgressBtn.a(MMPinProgressBtn.this) + 1);
        if (MMPinProgressBtn.a(MMPinProgressBtn.this) >= MMPinProgressBtn.b(MMPinProgressBtn.this))
        {
          MMPinProgressBtn.a(MMPinProgressBtn.this, MMPinProgressBtn.a(MMPinProgressBtn.this) - 1);
          w.i("MicroMsg.MMPinProgressBtn", "match auto progress max, return");
          GMTrace.o(1614639267840L, 12030);
          return;
        }
        MMPinProgressBtn.this.invalidate();
        MMPinProgressBtn.this.postDelayed(MMPinProgressBtn.c(MMPinProgressBtn.this), 200L);
        GMTrace.o(1614639267840L, 12030);
      }
    };
    b(paramContext, paramAttributeSet, paramInt);
    GMTrace.o(1629403217920L, 12140);
  }
  
  private void b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    GMTrace.i(1629537435648L, 12141);
    this.xqu = 100;
    this.rr = 0;
    Resources localResources = getResources();
    int m = localResources.getColor(a.d.gcr);
    int k = localResources.getColor(a.d.gcs);
    int i = k;
    int j = m;
    if (paramAttributeSet != null) {}
    try
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enP, paramInt, 0);
      if (paramAttributeSet == null) {
        break label274;
      }
    }
    finally
    {
      try
      {
        this.xqu = paramAttributeSet.getInteger(a.m.ggS, this.xqu);
        this.rr = paramAttributeSet.getInteger(a.m.ggT, this.rr);
        paramInt = paramAttributeSet.getColor(a.m.ggQ, m);
        k = paramAttributeSet.getColor(a.m.ggU, k);
        this.style = paramAttributeSet.getInteger(a.m.ggV, 0);
        this.xqx = paramAttributeSet.getDimensionPixelSize(a.m.ggR, localResources.getDimensionPixelSize(a.e.gcB));
        i = k;
        j = paramInt;
        if (paramAttributeSet != null)
        {
          paramAttributeSet.recycle();
          j = paramInt;
          i = k;
        }
        this.Ci = new Paint();
        this.Ci.setColor(j);
        this.Ci.setStyle(Paint.Style.STROKE);
        this.Ci.setStrokeWidth(4.0F);
        this.Ci.setAntiAlias(true);
        this.xqv = new Paint();
        this.xqv.setColor(i);
        this.xqv.setAntiAlias(true);
        setClickable(false);
        GMTrace.o(1629537435648L, 12141);
        return;
      }
      finally {}
      paramContext = finally;
      paramAttributeSet = null;
    }
    paramAttributeSet.recycle();
    label274:
    throw paramContext;
  }
  
  public final void cjf()
  {
    GMTrace.i(1629940088832L, 12144);
    removeCallbacks(this.xqz);
    post(this.xqz);
    GMTrace.o(1629940088832L, 12144);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(1630208524288L, 12146);
    super.onDraw(paramCanvas);
    this.xqw.set(2.0F, 2.0F, this.xqx - 2.0F, this.xqx - 2.0F);
    this.xqw.offset((getWidth() - this.xqx) / 2, (getHeight() - this.xqx) / 2);
    paramCanvas.drawArc(this.xqw, 0.0F, 360.0F, true, this.Ci);
    switch (this.style)
    {
    }
    for (;;)
    {
      GMTrace.o(1630208524288L, 12146);
      return;
      this.xqw.set(8.0F, 8.0F, this.xqx - 8.0F, this.xqx - 8.0F);
      this.xqw.offset((getWidth() - this.xqx) / 2, (getHeight() - this.xqx) / 2);
      paramCanvas.drawArc(this.xqw, -90.0F, 360.0F * (this.rr * 1.0F / this.xqu), true, this.xqv);
      GMTrace.o(1630208524288L, 12146);
      return;
      this.xqw.set(2.0F, 2.0F, this.xqx - 2.0F, this.xqx - 2.0F);
      this.xqw.offset((getWidth() - this.xqx) / 2, (getHeight() - this.xqx) / 2);
      paramCanvas.drawArc(this.xqw, 270.0F, this.rr * 1.0F / this.xqu * 360.0F - 360.0F, true, this.xqv);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1630074306560L, 12145);
    setMeasuredDimension(resolveSize(this.xqx, paramInt1), resolveSize(this.xqx, paramInt2));
    GMTrace.o(1630074306560L, 12145);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(1630476959744L, 12148);
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      GMTrace.o(1630476959744L, 12148);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.xqu = SavedState.a(paramParcelable);
    this.rr = SavedState.b(paramParcelable);
    GMTrace.o(1630476959744L, 12148);
  }
  
  public Parcelable onSaveInstanceState()
  {
    GMTrace.i(1630342742016L, 12147);
    Object localObject = super.onSaveInstanceState();
    if (isSaveEnabled())
    {
      localObject = new SavedState((Parcelable)localObject);
      SavedState.a((SavedState)localObject, this.xqu);
      SavedState.b((SavedState)localObject, this.rr);
      GMTrace.o(1630342742016L, 12147);
      return (Parcelable)localObject;
    }
    GMTrace.o(1630342742016L, 12147);
    return (Parcelable)localObject;
  }
  
  public final void setMax(int paramInt)
  {
    GMTrace.i(1629671653376L, 12142);
    this.xqu = Math.max(0, paramInt);
    invalidate();
    GMTrace.o(1629671653376L, 12142);
  }
  
  public final void setProgress(int paramInt)
  {
    GMTrace.i(1629805871104L, 12143);
    this.rr = Math.max(0, paramInt);
    this.rr = Math.min(paramInt, this.xqu);
    invalidate();
    GMTrace.o(1629805871104L, 12143);
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    private int rr;
    private int xqu;
    
    static
    {
      GMTrace.i(1628195258368L, 12131);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(1628195258368L, 12131);
    }
    
    private SavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(1627255734272L, 12124);
      this.rr = paramParcel.readInt();
      this.xqu = paramParcel.readInt();
      GMTrace.o(1627255734272L, 12124);
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
      GMTrace.i(1627121516544L, 12123);
      GMTrace.o(1627121516544L, 12123);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(1627389952000L, 12125);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.rr);
      paramParcel.writeInt(this.xqu);
      GMTrace.o(1627389952000L, 12125);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\MMPinProgressBtn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */