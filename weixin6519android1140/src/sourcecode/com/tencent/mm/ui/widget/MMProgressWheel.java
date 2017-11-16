package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.j;

public class MMProgressWheel
  extends View
{
  private static final String TAG;
  private final int barLength;
  private float wby;
  private final int xqL;
  private final long xqM;
  private int xqN;
  private int xqO;
  private int xqP;
  private boolean xqQ;
  private double xqR;
  private double xqS;
  private float xqT;
  private boolean xqU;
  private long xqV;
  private int xqW;
  private int xqX;
  private Paint xqY;
  private Paint xqZ;
  private RectF xra;
  private float xrb;
  private long xrc;
  private boolean xrd;
  private float xre;
  private boolean xrf;
  private a xrg;
  private boolean xrh;
  
  static
  {
    GMTrace.i(13052002959360L, 97245);
    TAG = MMProgressWheel.class.getSimpleName();
    GMTrace.o(13052002959360L, 97245);
  }
  
  public MMProgressWheel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(13051063435264L, 97238);
    this.barLength = 16;
    this.xqL = 270;
    this.xqM = 200L;
    this.xqN = 28;
    this.xqO = 4;
    this.xqP = 4;
    this.xqQ = false;
    this.xqR = 0.0D;
    this.xqS = 460.0D;
    this.xqT = 0.0F;
    this.xqU = true;
    this.xqV = 0L;
    this.xqW = -1442840576;
    this.xqX = 16777215;
    this.xqY = new Paint();
    this.xqZ = new Paint();
    this.xra = new RectF();
    this.xrb = 230.0F;
    this.xrc = 0L;
    this.wby = 0.0F;
    this.xre = 0.0F;
    this.xrf = false;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.enQ);
    paramAttributeSet = getContext().getResources().getDisplayMetrics();
    this.xqO = ((int)TypedValue.applyDimension(1, this.xqO, paramAttributeSet));
    this.xqP = ((int)TypedValue.applyDimension(1, this.xqP, paramAttributeSet));
    this.xqN = ((int)TypedValue.applyDimension(1, this.xqN, paramAttributeSet));
    this.xqN = ((int)paramContext.getDimension(a.j.xwv, this.xqN));
    this.xqQ = paramContext.getBoolean(a.j.xww, false);
    this.xqO = ((int)paramContext.getDimension(a.j.xwu, this.xqO));
    this.xqP = ((int)paramContext.getDimension(a.j.xwA, this.xqP));
    this.xrb = (paramContext.getFloat(a.j.xwB, this.xrb / 360.0F) * 360.0F);
    this.xqS = paramContext.getInt(a.j.xwt, (int)this.xqS);
    this.xqW = paramContext.getColor(a.j.xws, this.xqW);
    this.xqX = paramContext.getColor(a.j.xwz, this.xqX);
    this.xrd = paramContext.getBoolean(a.j.xwx, false);
    if (paramContext.getBoolean(a.j.xwy, false))
    {
      this.xrc = SystemClock.uptimeMillis();
      this.xrf = true;
      invalidate();
    }
    paramContext.recycle();
    float f;
    if (Build.VERSION.SDK_INT >= 17)
    {
      f = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0F);
      if (f == 0.0F) {
        break label455;
      }
    }
    for (;;)
    {
      this.xrh = bool;
      GMTrace.o(13051063435264L, 97238);
      return;
      f = Settings.System.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0F);
      break;
      label455:
      bool = false;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int j = 1;
    int i = 1;
    GMTrace.i(13051466088448L, 97241);
    super.onDraw(paramCanvas);
    paramCanvas.drawArc(this.xra, 360.0F, 360.0F, false, this.xqZ);
    if (!this.xrh)
    {
      GMTrace.o(13051466088448L, 97241);
      return;
    }
    float f2;
    if (this.xrf)
    {
      long l = SystemClock.uptimeMillis() - this.xrc;
      f1 = (float)l * this.xrb / 1000.0F;
      boolean bool;
      if (this.xqV >= 200L)
      {
        double d = this.xqR;
        this.xqR = (l + d);
        if (this.xqR > this.xqS)
        {
          this.xqR -= this.xqS;
          this.xqV = 0L;
          if (!this.xqU)
          {
            bool = true;
            this.xqU = bool;
          }
        }
        else
        {
          f2 = (float)Math.cos((this.xqR / this.xqS + 1.0D) * 3.141592653589793D) / 2.0F + 0.5F;
          if (!this.xqU) {
            break label316;
          }
          this.xqT = (f2 * 254.0F);
        }
      }
      for (;;)
      {
        this.wby += f1;
        if (this.wby > 360.0F) {
          this.wby -= 360.0F;
        }
        this.xrc = SystemClock.uptimeMillis();
        f1 = this.wby - 90.0F;
        f2 = 16.0F + this.xqT;
        if (isInEditMode())
        {
          f1 = 0.0F;
          f2 = 135.0F;
        }
        paramCanvas.drawArc(this.xra, f1, f2, false, this.xqY);
        if (i != 0) {
          invalidate();
        }
        GMTrace.o(13051466088448L, 97241);
        return;
        bool = false;
        break;
        label316:
        f2 = (1.0F - f2) * 254.0F;
        this.wby += this.xqT - f2;
        this.xqT = f2;
        continue;
        this.xqV = (l + this.xqV);
      }
    }
    float f1 = this.wby;
    if (this.wby != this.xre)
    {
      this.wby = Math.min((float)(SystemClock.uptimeMillis() - this.xrc) / 1000.0F * this.xrb + this.wby, this.xre);
      this.xrc = SystemClock.uptimeMillis();
    }
    for (i = j;; i = 0)
    {
      if ((f1 != this.wby) && (this.xrg != null)) {
        Math.round(this.wby * 100.0F / 360.0F);
      }
      f2 = 0.0F;
      f1 = this.wby;
      if (!this.xrd)
      {
        f2 = (float)(1.0D - Math.pow(1.0F - this.wby / 360.0F, 4.0D)) * 360.0F;
        f1 = (float)(1.0D - Math.pow(1.0F - this.wby / 360.0F, 2.0D)) * 360.0F;
      }
      if (isInEditMode()) {
        f1 = 360.0F;
      }
      for (;;)
      {
        paramCanvas.drawArc(this.xra, f2 - 90.0F, f1, false, this.xqY);
        break;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(13051197652992L, 97239);
    super.onMeasure(paramInt1, paramInt2);
    int k = this.xqN + getPaddingLeft() + getPaddingRight();
    int i = this.xqN + getPaddingTop() + getPaddingBottom();
    int m = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (m == 1073741824)
    {
      if ((n != 1073741824) && (m != 1073741824)) {
        break label136;
      }
      paramInt2 = j;
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      GMTrace.o(13051197652992L, 97239);
      return;
      if (m == Integer.MIN_VALUE)
      {
        paramInt1 = Math.min(k, paramInt1);
        break;
      }
      paramInt1 = k;
      break;
      label136:
      paramInt2 = i;
      if (n == Integer.MIN_VALUE) {
        paramInt2 = Math.min(i, j);
      }
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(13051868741632L, 97244);
    if (!(paramParcelable instanceof WheelSavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      GMTrace.o(13051868741632L, 97244);
      return;
    }
    paramParcelable = (WheelSavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.wby = paramParcelable.wby;
    this.xre = paramParcelable.xre;
    this.xrf = paramParcelable.xrf;
    this.xrb = paramParcelable.xrb;
    this.xqO = paramParcelable.xqO;
    this.xqW = paramParcelable.xqW;
    this.xqP = paramParcelable.xqP;
    this.xqX = paramParcelable.xqX;
    this.xqN = paramParcelable.xqN;
    this.xrd = paramParcelable.xrd;
    this.xqQ = paramParcelable.xqQ;
    this.xrc = SystemClock.uptimeMillis();
    GMTrace.o(13051868741632L, 97244);
  }
  
  public Parcelable onSaveInstanceState()
  {
    GMTrace.i(13051734523904L, 97243);
    WheelSavedState localWheelSavedState = new WheelSavedState(super.onSaveInstanceState());
    localWheelSavedState.wby = this.wby;
    localWheelSavedState.xre = this.xre;
    localWheelSavedState.xrf = this.xrf;
    localWheelSavedState.xrb = this.xrb;
    localWheelSavedState.xqO = this.xqO;
    localWheelSavedState.xqW = this.xqW;
    localWheelSavedState.xqP = this.xqP;
    localWheelSavedState.xqX = this.xqX;
    localWheelSavedState.xqN = this.xqN;
    localWheelSavedState.xrd = this.xrd;
    localWheelSavedState.xqQ = this.xqQ;
    GMTrace.o(13051734523904L, 97243);
    return localWheelSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(13051331870720L, 97240);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt4 = getPaddingTop();
    int i = getPaddingBottom();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    if (!this.xqQ)
    {
      paramInt3 = Math.min(Math.min(paramInt1 - j - k, paramInt2 - i - paramInt4), this.xqN * 2 - this.xqO * 2);
      paramInt1 = j + (paramInt1 - j - k - paramInt3) / 2;
      paramInt2 = paramInt4 + (paramInt2 - paramInt4 - i - paramInt3) / 2;
    }
    for (this.xra = new RectF(this.xqO + paramInt1, this.xqO + paramInt2, paramInt1 + paramInt3 - this.xqO, paramInt2 + paramInt3 - this.xqO);; this.xra = new RectF(j + this.xqO, paramInt4 + this.xqO, paramInt1 - k - this.xqO, paramInt2 - i - this.xqO))
    {
      this.xqY.setColor(this.xqW);
      this.xqY.setAntiAlias(true);
      this.xqY.setStyle(Paint.Style.STROKE);
      this.xqY.setStrokeWidth(this.xqO);
      this.xqZ.setColor(this.xqX);
      this.xqZ.setAntiAlias(true);
      this.xqZ.setStyle(Paint.Style.STROKE);
      this.xqZ.setStrokeWidth(this.xqP);
      invalidate();
      GMTrace.o(13051331870720L, 97240);
      return;
    }
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    GMTrace.i(13051600306176L, 97242);
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0) {
      this.xrc = SystemClock.uptimeMillis();
    }
    GMTrace.o(13051600306176L, 97242);
  }
  
  static class WheelSavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<WheelSavedState> CREATOR;
    float wby;
    int xqN;
    int xqO;
    int xqP;
    boolean xqQ;
    int xqW;
    int xqX;
    float xrb;
    boolean xrd;
    float xre;
    boolean xrf;
    
    static
    {
      GMTrace.i(13080322899968L, 97456);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(13080322899968L, 97456);
    }
    
    private WheelSavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(13079920246784L, 97453);
      this.wby = paramParcel.readFloat();
      this.xre = paramParcel.readFloat();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.xrf = bool1;
        this.xrb = paramParcel.readFloat();
        this.xqO = paramParcel.readInt();
        this.xqW = paramParcel.readInt();
        this.xqP = paramParcel.readInt();
        this.xqX = paramParcel.readInt();
        this.xqN = paramParcel.readInt();
        if (paramParcel.readByte() == 0) {
          break label135;
        }
        bool1 = true;
        label102:
        this.xrd = bool1;
        if (paramParcel.readByte() == 0) {
          break label140;
        }
      }
      label135:
      label140:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.xqQ = bool1;
        GMTrace.o(13079920246784L, 97453);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label102;
      }
    }
    
    WheelSavedState(Parcelable paramParcelable)
    {
      super();
      GMTrace.i(13079786029056L, 97452);
      GMTrace.o(13079786029056L, 97452);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      GMTrace.i(13080054464512L, 97454);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeFloat(this.wby);
      paramParcel.writeFloat(this.xre);
      if (this.xrf)
      {
        paramInt = 1;
        paramParcel.writeByte((byte)paramInt);
        paramParcel.writeFloat(this.xrb);
        paramParcel.writeInt(this.xqO);
        paramParcel.writeInt(this.xqW);
        paramParcel.writeInt(this.xqP);
        paramParcel.writeInt(this.xqX);
        paramParcel.writeInt(this.xqN);
        if (!this.xrd) {
          break label139;
        }
        paramInt = 1;
        label104:
        paramParcel.writeByte((byte)paramInt);
        if (!this.xqQ) {
          break label144;
        }
      }
      label139:
      label144:
      for (paramInt = i;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        GMTrace.o(13080054464512L, 97454);
        return;
        paramInt = 0;
        break;
        paramInt = 0;
        break label104;
      }
    }
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\widget\MMProgressWheel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */