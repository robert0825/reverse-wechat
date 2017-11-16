package com.tencent.mm.ui.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.k;

public final class g
  extends DatePickerDialog
{
  private boolean xqi;
  private long xqj;
  private int xqk;
  
  public g(Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    super(paramContext, 3, paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
    GMTrace.i(1635174580224L, 12183);
    this.xqi = true;
    this.xqi = true;
    this.xqj = paramLong;
    this.xqk = 1;
    GMTrace.o(1635174580224L, 12183);
  }
  
  public g(Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    super(paramContext, 3, paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
    GMTrace.i(14630940311552L, 109009);
    this.xqi = true;
    this.xqi = true;
    this.xqj = paramLong;
    this.xqk = paramInt4;
    GMTrace.o(14630940311552L, 109009);
  }
  
  public g(Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt1, int paramInt2, int paramInt3, long paramLong, String paramString)
  {
    super(paramContext, 3, paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
    GMTrace.i(1635443015680L, 12185);
    this.xqi = true;
    this.xqi = true;
    this.xqj = paramLong;
    if ((paramString != null) && (paramString.equals("month")))
    {
      this.xqk = 2;
      GMTrace.o(1635443015680L, 12185);
      return;
    }
    this.xqk = 1;
    GMTrace.o(1635443015680L, 12185);
  }
  
  private void eH(int paramInt1, int paramInt2)
  {
    GMTrace.i(1635845668864L, 12188);
    if (this.xqk > 1) {
      setTitle(getContext().getString(a.k.ggl, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2 + 1) }));
    }
    GMTrace.o(1635845668864L, 12188);
  }
  
  public final void onDateChanged(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1635711451136L, 12187);
    super.onDateChanged(paramDatePicker, paramInt1, paramInt2, paramInt3);
    eH(paramInt1, paramInt2);
    GMTrace.o(1635711451136L, 12187);
  }
  
  @SuppressLint({"DefaultLocale"})
  public final void show()
  {
    int j = 1;
    GMTrace.i(1635577233408L, 12186);
    super.show();
    Object localObject;
    if (this.xqi)
    {
      if (Build.VERSION.SDK_INT < 11) {
        break label115;
      }
      localObject = new a().n((ViewGroup)getWindow().getDecorView());
      if ((localObject != null) && (this.xqk > 1)) {
        ((View)localObject).setVisibility(8);
      }
    }
    label115:
    label252:
    for (;;)
    {
      int i = getDatePicker().getYear();
      j = getDatePicker().getMonth();
      getDatePicker().getDayOfMonth();
      eH(i, j);
      this.xqi = false;
      GMTrace.o(1635577233408L, 12186);
      return;
      String str = Settings.System.getString(getContext().getContentResolver(), "date_format");
      localObject = str;
      if (str != null) {
        localObject = str.toLowerCase();
      }
      if (("dd/mm/yyyy".equals(localObject)) || ("dd-mm-yyyy".equals(localObject))) {
        i = 0;
      }
      for (;;)
      {
        if (i == -1) {
          break label252;
        }
        localObject = new b().f((ViewGroup)getWindow().getDecorView(), i);
        if (localObject == null) {
          break;
        }
        ((View)localObject).setVisibility(8);
        break;
        i = j;
        if (!"mm/dd/yyyy".equals(localObject))
        {
          i = j;
          if (!"mm-dd-yyyy".equals(localObject)) {
            if (("yyyy/mm/dd".equals(localObject)) || ("yyyy-mm-dd".equals(localObject))) {
              i = 2;
            } else {
              i = -1;
            }
          }
        }
      }
    }
  }
  
  final class a
  {
    a()
    {
      GMTrace.i(1626853081088L, 12121);
      GMTrace.o(1626853081088L, 12121);
    }
    
    @TargetApi(11)
    public final NumberPicker n(ViewGroup paramViewGroup)
    {
      GMTrace.i(1626987298816L, 12122);
      if (paramViewGroup != null)
      {
        int j = paramViewGroup.getChildCount();
        int i = 0;
        while (i < j)
        {
          Object localObject = paramViewGroup.getChildAt(i);
          if ((localObject instanceof NumberPicker))
          {
            NumberPicker localNumberPicker = (NumberPicker)localObject;
            if ((localNumberPicker.getMaxValue() >= 28) && (localNumberPicker.getMaxValue() <= 31))
            {
              GMTrace.o(1626987298816L, 12122);
              return localNumberPicker;
            }
          }
          if ((localObject instanceof ViewGroup))
          {
            localObject = n((ViewGroup)localObject);
            if (localObject != null)
            {
              GMTrace.o(1626987298816L, 12122);
              return (NumberPicker)localObject;
            }
          }
          i += 1;
        }
      }
      GMTrace.o(1626987298816L, 12122);
      return null;
    }
  }
  
  final class b
  {
    b()
    {
      GMTrace.i(1642556555264L, 12238);
      GMTrace.o(1642556555264L, 12238);
    }
    
    public final View f(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(1642690772992L, 12239);
      if (paramViewGroup != null)
      {
        int j = paramViewGroup.getChildCount();
        int i = 0;
        while (i < j)
        {
          View localView = paramViewGroup.getChildAt(i);
          Class localClass = localView.getClass();
          String str = localClass.getName();
          w.d("MicroMsg.MMDatePickerDialog", "NAME = " + str);
          w.d("MicroMsg.MMDatePickerDialog", "SimpleName = " + localClass.getSimpleName());
          if (("NumberPicker".equals(localClass.getSimpleName())) && (i == paramInt))
          {
            GMTrace.o(1642690772992L, 12239);
            return localView;
          }
          if ((localView instanceof ViewGroup))
          {
            localView = f((ViewGroup)localView, paramInt);
            if (localView != null)
            {
              GMTrace.o(1642690772992L, 12239);
              return localView;
            }
          }
          i += 1;
        }
      }
      GMTrace.o(1642690772992L, 12239);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */