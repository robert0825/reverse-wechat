package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.a.a;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.BaseSavedState;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.a;
import com.tencent.mm.bx.a.e;
import com.tencent.mm.bx.a.f;
import com.tencent.mm.bx.a.j;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class YADatePicker
  extends FrameLayout
{
  private static final String Dj;
  public final b xuw;
  
  static
  {
    GMTrace.i(18777999671296L, 139907);
    Dj = YADatePicker.class.getSimpleName();
    GMTrace.o(18777999671296L, 139907);
  }
  
  public YADatePicker(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(18775046881280L, 139885);
    GMTrace.o(18775046881280L, 139885);
  }
  
  public YADatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.datePickerStyle);
    GMTrace.i(18775181099008L, 139886);
    GMTrace.o(18775181099008L, 139886);
  }
  
  public YADatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18775315316736L, 139887);
    this.xuw = new c(this, paramContext, paramAttributeSet, paramInt, 0);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.emN, paramInt, 0);
    paramInt = paramContext.getInt(a.j.xvT, 0);
    paramContext.recycle();
    if (paramInt != 0)
    {
      if ((paramInt <= 0) || (paramInt > 7)) {
        throw new IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
      }
      this.xuw.setFirstDayOfWeek(paramInt);
    }
    GMTrace.o(18775315316736L, 139887);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, d paramd)
  {
    GMTrace.i(18775583752192L, 139889);
    this.xuw.a(paramInt1, paramInt2, paramInt3, paramd);
    GMTrace.o(18775583752192L, 139889);
  }
  
  public final void cjL()
  {
    GMTrace.i(18777194364928L, 139901);
    this.xuw.setCalendarViewShown(false);
    GMTrace.o(18777194364928L, 139901);
  }
  
  public final void cjM()
  {
    GMTrace.i(18777328582656L, 139902);
    this.xuw.setSpinnersShown(true);
    GMTrace.o(18777328582656L, 139902);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(18776657494016L, 139897);
    boolean bool = this.xuw.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    GMTrace.o(18776657494016L, 139897);
    return bool;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    GMTrace.i(18777462800384L, 139903);
    dispatchThawSelfOnly(paramSparseArray);
    GMTrace.o(18777462800384L, 139903);
  }
  
  public CharSequence getAccessibilityClassName()
  {
    GMTrace.i(18776925929472L, 139899);
    String str = YADatePicker.class.getName();
    GMTrace.o(18776925929472L, 139899);
    return str;
  }
  
  public int getDayOfMonth()
  {
    GMTrace.i(18775986405376L, 139892);
    int i = this.xuw.getDayOfMonth();
    GMTrace.o(18775986405376L, 139892);
    return i;
  }
  
  public int getMonth()
  {
    GMTrace.i(18775852187648L, 139891);
    int i = this.xuw.getMonth();
    GMTrace.o(18775852187648L, 139891);
    return i;
  }
  
  @a
  public b getUIDelegate()
  {
    GMTrace.i(18775449534464L, 139888);
    b localb = this.xuw;
    GMTrace.o(18775449534464L, 139888);
    return localb;
  }
  
  public int getYear()
  {
    GMTrace.i(18775717969920L, 139890);
    int i = this.xuw.getYear();
    GMTrace.o(18775717969920L, 139890);
    return i;
  }
  
  public boolean isEnabled()
  {
    GMTrace.i(18776523276288L, 139896);
    boolean bool = this.xuw.isEnabled();
    GMTrace.o(18776523276288L, 139896);
    return bool;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(18777060147200L, 139900);
    super.onConfigurationChanged(paramConfiguration);
    this.xuw.onConfigurationChanged(paramConfiguration);
    GMTrace.o(18777060147200L, 139900);
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(18776791711744L, 139898);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    this.xuw.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    GMTrace.o(18776791711744L, 139898);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(18777731235840L, 139905);
    paramParcelable = (View.BaseSavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.xuw.onRestoreInstanceState(paramParcelable);
    GMTrace.o(18777731235840L, 139905);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    GMTrace.i(18777597018112L, 139904);
    Parcelable localParcelable = super.onSaveInstanceState();
    localParcelable = this.xuw.b(localParcelable);
    GMTrace.o(18777597018112L, 139904);
    return localParcelable;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(18776389058560L, 139895);
    if (this.xuw.isEnabled() == paramBoolean)
    {
      GMTrace.o(18776389058560L, 139895);
      return;
    }
    super.setEnabled(paramBoolean);
    this.xuw.setEnabled(paramBoolean);
    GMTrace.o(18776389058560L, 139895);
  }
  
  public void setMaxDate(long paramLong)
  {
    GMTrace.i(18776254840832L, 139894);
    this.xuw.setMaxDate(paramLong);
    GMTrace.o(18776254840832L, 139894);
  }
  
  public void setMinDate(long paramLong)
  {
    GMTrace.i(18776120623104L, 139893);
    this.xuw.setMinDate(paramLong);
    GMTrace.o(18776120623104L, 139893);
  }
  
  private static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    private final int jnc;
    private final int jnd;
    private final int jne;
    
    static
    {
      GMTrace.i(18773436268544L, 139873);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18773436268544L, 139873);
    }
    
    private SavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(18772496744448L, 139866);
      this.jnc = paramParcel.readInt();
      this.jnd = paramParcel.readInt();
      this.jne = paramParcel.readInt();
      GMTrace.o(18772496744448L, 139866);
    }
    
    private SavedState(Parcelable paramParcelable, int paramInt1, int paramInt2, int paramInt3)
    {
      super();
      GMTrace.i(18772362526720L, 139865);
      this.jnc = paramInt1;
      this.jnd = paramInt2;
      this.jne = paramInt3;
      GMTrace.o(18772362526720L, 139865);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18772630962176L, 139867);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.jnc);
      paramParcel.writeInt(this.jnd);
      paramParcel.writeInt(this.jne);
      GMTrace.o(18772630962176L, 139867);
    }
  }
  
  static abstract class a
    implements YADatePicker.b
  {
    protected Context mContext;
    protected YADatePicker xux;
    protected Locale xuy;
    protected YADatePicker.d xuz;
    
    public a(YADatePicker paramYADatePicker, Context paramContext)
    {
      GMTrace.i(18772094091264L, 139863);
      this.xux = paramYADatePicker;
      this.mContext = paramContext;
      e(Locale.getDefault());
      GMTrace.o(18772094091264L, 139863);
    }
    
    protected void e(Locale paramLocale)
    {
      GMTrace.i(18772228308992L, 139864);
      if (!paramLocale.equals(this.xuy)) {
        this.xuy = paramLocale;
      }
      GMTrace.o(18772228308992L, 139864);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd);
    
    public abstract Parcelable b(Parcelable paramParcelable);
    
    public abstract boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
    
    public abstract int getDayOfMonth();
    
    public abstract int getMonth();
    
    public abstract int getYear();
    
    public abstract boolean isEnabled();
    
    public abstract void onConfigurationChanged(Configuration paramConfiguration);
    
    public abstract void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
    
    public abstract void onRestoreInstanceState(Parcelable paramParcelable);
    
    public abstract void setCalendarViewShown(boolean paramBoolean);
    
    public abstract void setEnabled(boolean paramBoolean);
    
    public abstract void setFirstDayOfWeek(int paramInt);
    
    public abstract void setMaxDate(long paramLong);
    
    public abstract void setMinDate(long paramLong);
    
    public abstract void setSpinnersShown(boolean paramBoolean);
  }
  
  public static final class c
    extends YADatePicker.a
  {
    public Calendar iRB;
    private String[] iRC;
    private final LinearLayout xuA;
    public final NumberPicker xuB;
    public final NumberPicker xuC;
    public final NumberPicker xuD;
    private final EditText xuE;
    private final EditText xuF;
    private final EditText xuG;
    private final CalendarView xuH;
    private final java.text.DateFormat xuI;
    private int xuJ;
    private Calendar xuK;
    private Calendar xuL;
    public Calendar xuM;
    private boolean xuN;
    
    c(YADatePicker paramYADatePicker, Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
    {
      super(paramContext);
      GMTrace.i(18778402324480L, 139910);
      this.xuI = new SimpleDateFormat("MM/dd/yyyy");
      this.xuN = true;
      this.xux = paramYADatePicker;
      this.mContext = paramContext;
      e(Locale.getDefault());
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.emN, paramInt1, 0);
      boolean bool1 = localTypedArray.getBoolean(a.j.xvX, true);
      boolean bool2 = localTypedArray.getBoolean(a.j.xvR, true);
      paramInt1 = localTypedArray.getInt(a.j.xvY, 1900);
      paramInt2 = localTypedArray.getInt(a.j.xvS, 2100);
      paramYADatePicker = localTypedArray.getString(a.j.xvW);
      paramAttributeSet = localTypedArray.getString(a.j.xvV);
      int i = localTypedArray.getResourceId(a.j.xvU, a.f.xvn);
      localTypedArray.recycle();
      ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(i, this.xux, true);
      paramContext = new NumberPicker.OnValueChangeListener()
      {
        public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(18771288784896L, 139857);
          YADatePicker.c.this.cjT();
          YADatePicker.c.this.iRB.setTimeInMillis(YADatePicker.c.this.xuM.getTimeInMillis());
          int i;
          if (paramAnonymousNumberPicker == YADatePicker.c.this.xuB)
          {
            i = YADatePicker.c.this.iRB.getActualMaximum(5);
            if ((paramAnonymousInt1 == i) && (paramAnonymousInt2 == 1)) {
              YADatePicker.c.this.iRB.add(5, 1);
            }
          }
          for (;;)
          {
            YADatePicker.c.this.ad(YADatePicker.c.this.iRB.get(1), YADatePicker.c.this.iRB.get(2), YADatePicker.c.this.iRB.get(5));
            YADatePicker.c.this.cjQ();
            YADatePicker.c.this.cjR();
            YADatePicker.c.this.cjS();
            GMTrace.o(18771288784896L, 139857);
            return;
            if ((paramAnonymousInt1 == 1) && (paramAnonymousInt2 == i))
            {
              YADatePicker.c.this.iRB.add(5, -1);
            }
            else
            {
              YADatePicker.c.this.iRB.add(5, paramAnonymousInt2 - paramAnonymousInt1);
              continue;
              if (paramAnonymousNumberPicker == YADatePicker.c.this.xuC)
              {
                if ((paramAnonymousInt1 == 11) && (paramAnonymousInt2 == 0)) {
                  YADatePicker.c.this.iRB.add(2, 1);
                } else if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 11)) {
                  YADatePicker.c.this.iRB.add(2, -1);
                } else {
                  YADatePicker.c.this.iRB.add(2, paramAnonymousInt2 - paramAnonymousInt1);
                }
              }
              else
              {
                if (paramAnonymousNumberPicker != YADatePicker.c.this.xuD) {
                  break;
                }
                YADatePicker.c.this.iRB.set(1, paramAnonymousInt2);
              }
            }
          }
          throw new IllegalArgumentException();
        }
      };
      this.xuA = ((LinearLayout)this.xux.findViewById(a.e.xvm));
      this.xuH = ((CalendarView)this.xux.findViewById(a.e.xvj));
      this.xuH.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
      {
        public final void onSelectedDayChange(CalendarView paramAnonymousCalendarView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(18778268106752L, 139909);
          YADatePicker.c.this.ad(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
          YADatePicker.c.this.cjQ();
          YADatePicker.c.this.cjS();
          GMTrace.o(18778268106752L, 139909);
        }
      });
      this.xuB = ((NumberPicker)this.xux.findViewById(a.e.jqS));
      this.xuB.setFormatter(new c());
      this.xuB.setOnLongPressUpdateInterval(100L);
      this.xuB.setOnValueChangedListener(paramContext);
      this.xuE = b.b(this.xuB);
      this.xuC = ((NumberPicker)this.xux.findViewById(a.e.month));
      this.xuC.setMinValue(0);
      this.xuC.setMaxValue(this.xuJ - 1);
      this.xuC.setDisplayedValues(this.iRC);
      this.xuC.setOnLongPressUpdateInterval(200L);
      this.xuC.setOnValueChangedListener(paramContext);
      this.xuF = b.b(this.xuC);
      this.xuD = ((NumberPicker)this.xux.findViewById(a.e.year));
      this.xuD.setOnLongPressUpdateInterval(100L);
      this.xuD.setOnValueChangedListener(paramContext);
      this.xuG = b.b(this.xuD);
      if ((!bool1) && (!bool2)) {
        setSpinnersShown(true);
      }
      for (;;)
      {
        this.iRB.clear();
        if ((TextUtils.isEmpty(paramYADatePicker)) || (!a(paramYADatePicker, this.iRB))) {
          this.iRB.set(paramInt1, 0, 1);
        }
        setMinDate(this.iRB.getTimeInMillis());
        this.iRB.clear();
        if ((TextUtils.isEmpty(paramAttributeSet)) || (!a(paramAttributeSet, this.iRB))) {
          this.iRB.set(paramInt2, 11, 31);
        }
        setMaxDate(this.iRB.getTimeInMillis());
        this.xuM.setTimeInMillis(System.currentTimeMillis());
        a(this.xuM.get(1), this.xuM.get(2), this.xuM.get(5), null);
        cjP();
        if (this.xux.getImportantForAccessibility() == 0) {
          this.xux.setImportantForAccessibility(1);
        }
        GMTrace.o(18778402324480L, 139910);
        return;
        setSpinnersShown(bool1);
        setCalendarViewShown(bool2);
      }
    }
    
    private static Calendar a(Calendar paramCalendar, Locale paramLocale)
    {
      GMTrace.i(18780952461312L, 139929);
      if (paramCalendar == null)
      {
        paramCalendar = Calendar.getInstance(paramLocale);
        GMTrace.o(18780952461312L, 139929);
        return paramCalendar;
      }
      long l = paramCalendar.getTimeInMillis();
      paramCalendar = Calendar.getInstance(paramLocale);
      paramCalendar.setTimeInMillis(l);
      GMTrace.o(18780952461312L, 139929);
      return paramCalendar;
    }
    
    private static void a(NumberPicker paramNumberPicker, int paramInt1, int paramInt2)
    {
      GMTrace.i(18781891985408L, 139936);
      if (paramInt2 < paramInt1 - 1) {}
      for (paramInt1 = 5;; paramInt1 = 6)
      {
        paramNumberPicker = b.b(paramNumberPicker);
        if (paramNumberPicker != null) {
          paramNumberPicker.setImeOptions(paramInt1);
        }
        GMTrace.o(18781891985408L, 139936);
        return;
      }
    }
    
    private boolean a(String paramString, Calendar paramCalendar)
    {
      GMTrace.i(18781220896768L, 139931);
      try
      {
        paramCalendar.setTime(this.xuI.parse(paramString));
        GMTrace.o(18781220896768L, 139931);
        return true;
      }
      catch (ParseException paramCalendar)
      {
        YADatePicker.cjN();
        new StringBuilder("Date: ").append(paramString).append(" not in format: MM/dd/yyyy");
        GMTrace.o(18781220896768L, 139931);
      }
      return false;
    }
    
    private boolean cjO()
    {
      GMTrace.i(18780818243584L, 139928);
      boolean bool = Character.isDigit(this.iRC[0].charAt(0));
      GMTrace.o(18780818243584L, 139928);
      return bool;
    }
    
    private void cjP()
    {
      GMTrace.i(18781086679040L, 139930);
      this.xuA.removeAllViews();
      char[] arrayOfChar;
      if ((Build.VERSION.SDK_INT < 17) || (this.xux.getLayoutDirection() == 0))
      {
        arrayOfChar = new char[3];
        char[] tmp39_38 = arrayOfChar;
        tmp39_38[0] = 121;
        char[] tmp45_39 = tmp39_38;
        tmp45_39[1] = 77;
        char[] tmp51_45 = tmp45_39;
        tmp51_45[2] = 100;
        tmp51_45;
      }
      int j;
      int i;
      for (;;)
      {
        j = arrayOfChar.length;
        i = 0;
        if (i >= j) {
          break;
        }
        switch (arrayOfChar[i])
        {
        default: 
          throw new IllegalArgumentException(Arrays.toString(arrayOfChar));
          arrayOfChar = android.text.format.DateFormat.getDateFormatOrder(this.xux.getContext());
        }
      }
      this.xuA.addView(this.xuB);
      a(this.xuB, j, i);
      for (;;)
      {
        i += 1;
        break;
        this.xuA.addView(this.xuC);
        a(this.xuC, j, i);
        continue;
        this.xuA.addView(this.xuD);
        a(this.xuD, j, i);
      }
      GMTrace.o(18781086679040L, 139930);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
    {
      GMTrace.i(18778536542208L, 139911);
      ad(paramInt1, paramInt2, paramInt3);
      cjQ();
      cjR();
      this.xuz = paramd;
      GMTrace.o(18778536542208L, 139911);
    }
    
    public final void ad(int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(18781355114496L, 139932);
      this.xuM.set(paramInt1, paramInt2, paramInt3);
      if (this.xuM.before(this.xuK))
      {
        this.xuM.setTimeInMillis(this.xuK.getTimeInMillis());
        GMTrace.o(18781355114496L, 139932);
        return;
      }
      if (this.xuM.after(this.xuL)) {
        this.xuM.setTimeInMillis(this.xuL.getTimeInMillis());
      }
      GMTrace.o(18781355114496L, 139932);
    }
    
    public final Parcelable b(Parcelable paramParcelable)
    {
      GMTrace.i(18780147154944L, 139923);
      paramParcelable = new YADatePicker.SavedState(paramParcelable, getYear(), getMonth(), getDayOfMonth(), (byte)0);
      GMTrace.o(18780147154944L, 139923);
      return paramParcelable;
    }
    
    public final void cjQ()
    {
      GMTrace.i(18781489332224L, 139933);
      if (this.xuM.equals(this.xuK))
      {
        this.xuB.setMinValue(this.xuM.get(5));
        this.xuB.setMaxValue(this.xuM.getActualMaximum(5));
        this.xuB.setWrapSelectorWheel(false);
        this.xuC.setDisplayedValues(null);
        this.xuC.setMinValue(this.xuM.get(2));
        this.xuC.setMaxValue(this.xuM.getActualMaximum(2));
        this.xuC.setWrapSelectorWheel(false);
      }
      for (;;)
      {
        String[] arrayOfString = (String[])Arrays.copyOfRange(this.iRC, this.xuC.getMinValue(), this.xuC.getMaxValue() + 1);
        this.xuC.setDisplayedValues(arrayOfString);
        this.xuD.setMinValue(this.xuK.get(1));
        this.xuD.setMaxValue(this.xuL.get(1));
        this.xuD.setWrapSelectorWheel(false);
        this.xuD.setValue(this.xuM.get(1));
        this.xuC.setValue(this.xuM.get(2));
        this.xuB.setValue(this.xuM.get(5));
        if (cjO()) {
          this.xuF.setRawInputType(2);
        }
        GMTrace.o(18781489332224L, 139933);
        return;
        if (this.xuM.equals(this.xuL))
        {
          this.xuB.setMinValue(this.xuM.getActualMinimum(5));
          this.xuB.setMaxValue(this.xuM.get(5));
          this.xuB.setWrapSelectorWheel(false);
          this.xuC.setDisplayedValues(null);
          this.xuC.setMinValue(this.xuM.getActualMinimum(2));
          this.xuC.setMaxValue(this.xuM.get(2));
          this.xuC.setWrapSelectorWheel(false);
        }
        else
        {
          this.xuB.setMinValue(1);
          this.xuB.setMaxValue(this.xuM.getActualMaximum(5));
          this.xuB.setWrapSelectorWheel(true);
          this.xuC.setDisplayedValues(null);
          this.xuC.setMinValue(0);
          this.xuC.setMaxValue(11);
          this.xuC.setWrapSelectorWheel(true);
        }
      }
    }
    
    public final void cjR()
    {
      GMTrace.i(18781623549952L, 139934);
      this.xuH.setDate(this.xuM.getTimeInMillis(), false, false);
      GMTrace.o(18781623549952L, 139934);
    }
    
    public final void cjS()
    {
      GMTrace.i(18781757767680L, 139935);
      this.xux.sendAccessibilityEvent(4);
      if (this.xuz != null)
      {
        getYear();
        getMonth();
        getDayOfMonth();
      }
      GMTrace.o(18781757767680L, 139935);
    }
    
    public final void cjT()
    {
      GMTrace.i(18782026203136L, 139937);
      InputMethodManager localInputMethodManager = (InputMethodManager)this.xux.getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
      {
        if (localInputMethodManager.isActive(this.xuG))
        {
          this.xuG.clearFocus();
          localInputMethodManager.hideSoftInputFromWindow(this.xux.getWindowToken(), 0);
          GMTrace.o(18782026203136L, 139937);
          return;
        }
        if (localInputMethodManager.isActive(this.xuF))
        {
          this.xuF.clearFocus();
          localInputMethodManager.hideSoftInputFromWindow(this.xux.getWindowToken(), 0);
          GMTrace.o(18782026203136L, 139937);
          return;
        }
        if (localInputMethodManager.isActive(this.xuE))
        {
          this.xuE.clearFocus();
          localInputMethodManager.hideSoftInputFromWindow(this.xux.getWindowToken(), 0);
        }
      }
      GMTrace.o(18782026203136L, 139937);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      GMTrace.i(18780415590400L, 139925);
      onPopulateAccessibilityEvent(paramAccessibilityEvent);
      GMTrace.o(18780415590400L, 139925);
      return true;
    }
    
    protected final void e(Locale paramLocale)
    {
      GMTrace.i(18780684025856L, 139927);
      super.e(paramLocale);
      this.iRB = a(this.iRB, paramLocale);
      this.xuK = a(this.xuK, paramLocale);
      this.xuL = a(this.xuL, paramLocale);
      this.xuM = a(this.xuM, paramLocale);
      this.xuJ = (this.iRB.getActualMaximum(2) + 1);
      this.iRC = new DateFormatSymbols().getShortMonths();
      if (cjO())
      {
        this.iRC = new String[this.xuJ];
        int i = 0;
        while (i < this.xuJ)
        {
          this.iRC[i] = String.format("%d", new Object[] { Integer.valueOf(i + 1) });
          i += 1;
        }
      }
      GMTrace.o(18780684025856L, 139927);
    }
    
    public final int getDayOfMonth()
    {
      GMTrace.i(18778939195392L, 139914);
      int i = this.xuM.get(5);
      GMTrace.o(18778939195392L, 139914);
      return i;
    }
    
    public final int getMonth()
    {
      GMTrace.i(18778804977664L, 139913);
      int i = this.xuM.get(2);
      GMTrace.o(18778804977664L, 139913);
      return i;
    }
    
    public final int getYear()
    {
      GMTrace.i(18778670759936L, 139912);
      int i = this.xuM.get(1);
      GMTrace.o(18778670759936L, 139912);
      return i;
    }
    
    public final boolean isEnabled()
    {
      GMTrace.i(18779610284032L, 139919);
      boolean bool = this.xuN;
      GMTrace.o(18779610284032L, 139919);
      return bool;
    }
    
    public final void onConfigurationChanged(Configuration paramConfiguration)
    {
      GMTrace.i(18780012937216L, 139922);
      e(paramConfiguration.locale);
      GMTrace.o(18780012937216L, 139922);
    }
    
    public final void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      GMTrace.i(18780549808128L, 139926);
      String str = DateUtils.formatDateTime(this.mContext, this.xuM.getTimeInMillis(), 20);
      paramAccessibilityEvent.getText().add(str);
      GMTrace.o(18780549808128L, 139926);
    }
    
    public final void onRestoreInstanceState(Parcelable paramParcelable)
    {
      GMTrace.i(18780281372672L, 139924);
      paramParcelable = (YADatePicker.SavedState)paramParcelable;
      ad(YADatePicker.SavedState.a(paramParcelable), YADatePicker.SavedState.b(paramParcelable), YADatePicker.SavedState.c(paramParcelable));
      cjQ();
      cjR();
      GMTrace.o(18780281372672L, 139924);
    }
    
    public final void setCalendarViewShown(boolean paramBoolean)
    {
      GMTrace.i(18779744501760L, 139920);
      CalendarView localCalendarView = this.xuH;
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        localCalendarView.setVisibility(i);
        GMTrace.o(18779744501760L, 139920);
        return;
      }
    }
    
    public final void setEnabled(boolean paramBoolean)
    {
      GMTrace.i(18779476066304L, 139918);
      this.xuB.setEnabled(paramBoolean);
      this.xuC.setEnabled(paramBoolean);
      this.xuD.setEnabled(paramBoolean);
      this.xuH.setEnabled(paramBoolean);
      this.xuN = paramBoolean;
      GMTrace.o(18779476066304L, 139918);
    }
    
    public final void setFirstDayOfWeek(int paramInt)
    {
      GMTrace.i(18779073413120L, 139915);
      this.xuH.setFirstDayOfWeek(paramInt);
      GMTrace.o(18779073413120L, 139915);
    }
    
    public final void setMaxDate(long paramLong)
    {
      GMTrace.i(18779341848576L, 139917);
      this.iRB.setTimeInMillis(paramLong);
      if ((this.iRB.get(1) == this.xuL.get(1)) && (this.iRB.get(6) != this.xuL.get(6)))
      {
        GMTrace.o(18779341848576L, 139917);
        return;
      }
      this.xuL.setTimeInMillis(paramLong);
      this.xuH.setMaxDate(paramLong);
      if (this.xuM.after(this.xuL))
      {
        this.xuM.setTimeInMillis(this.xuL.getTimeInMillis());
        cjR();
      }
      cjQ();
      GMTrace.o(18779341848576L, 139917);
    }
    
    public final void setMinDate(long paramLong)
    {
      GMTrace.i(18779207630848L, 139916);
      this.iRB.setTimeInMillis(paramLong);
      if ((this.iRB.get(1) == this.xuK.get(1)) && (this.iRB.get(6) != this.xuK.get(6)))
      {
        GMTrace.o(18779207630848L, 139916);
        return;
      }
      this.xuK.setTimeInMillis(paramLong);
      this.xuH.setMinDate(paramLong);
      if (this.xuM.before(this.xuK))
      {
        this.xuM.setTimeInMillis(this.xuK.getTimeInMillis());
        cjR();
      }
      cjQ();
      GMTrace.o(18779207630848L, 139916);
    }
    
    public final void setSpinnersShown(boolean paramBoolean)
    {
      GMTrace.i(18779878719488L, 139921);
      LinearLayout localLinearLayout = this.xuA;
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        localLinearLayout.setVisibility(i);
        GMTrace.o(18779878719488L, 139921);
        return;
      }
    }
  }
  
  public static abstract interface d {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\picker\YADatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */